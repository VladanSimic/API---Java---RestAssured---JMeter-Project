package integrations;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

public class GeneralEcsHealthSimulationV8 {

    public void runJMeterTestWithEnv(String testName,
                                     String env,
                                     int threads,
                                     int rampUpSeconds,
                                     int durationSeconds,
                                     String sameUser,
                                     String onErrorAction) {

        System.out.println(">>> V8: runJMeterTestWithEnv (simple version)");
        System.out.println("    testName        = " + testName);
        System.out.println("    env             = " + env);
        System.out.println("    threads         = " + threads);
        System.out.println("    rampUpSeconds   = " + rampUpSeconds);
        System.out.println("    durationSeconds = " + durationSeconds);
        System.out.println("    sameUser        = " + sameUser);
        System.out.println("    onSampleError   = " + onErrorAction);

        // 1. Basic properties used directly in JMX
        System.setProperty("env", env);
        System.setProperty("threads", String.valueOf(threads));
        System.setProperty("rampUpSeconds", String.valueOf(rampUpSeconds));
        System.setProperty("durationSeconds", String.valueOf(durationSeconds));
        System.setProperty("sameUserOnNextIteration", sameUser);
        System.setProperty("onSampleError", onErrorAction);

        // 2. ecs.* properties used in main()
        System.setProperty("ecs.threads", String.valueOf(threads));
        System.setProperty("ecs.rampUp", String.valueOf(rampUpSeconds));
        System.setProperty("ecs.duration", String.valueOf(durationSeconds));

        // 3. Select JMX file based on env (existing logic)
        String projectDir = System.getProperty("user.dir");
        String jmxRelativePath;
        if ("STG".equalsIgnoreCase(env)) {
            jmxRelativePath = "src/test/resources/jmeter/tests/Predictive Analytics STG.jmx";
        } else {
            jmxRelativePath = "src/test/resources/jmeter/tests/Predictive Analytics QA.jmx";
        }
        String jmxPath = projectDir + File.separator + jmxRelativePath;
        System.out.println(">>> JMX path     = " + jmxPath);

        // 4. Start main logic
        try {
            main(new String[]{});
        } catch (Exception e) {
            throw new RuntimeException("Error running JMeter simulation", e);
        }
    }

    /* ===== model for aggregate by label (state) ===== */
    static class LabelSummary {
        String label = "TOTAL";
        long samples = 0;
        double sum = 0, sumSq = 0;
        long min = Long.MAX_VALUE, max = 0;
        long bytesSum = 0;
        long firstTs = Long.MAX_VALUE, lastTs = 0;
        long errors = 0;

        void add(long ts, long elapsed, boolean success, long bytes) {
            samples++;
            sum += elapsed;
            sumSq += (double) elapsed * (double) elapsed;
            min = Math.min(min, elapsed);
            max = Math.max(max, elapsed);
            if (!success) errors++;
            bytesSum += bytes;
            if (ts > 0) {
                firstTs = Math.min(firstTs, ts);
                lastTs  = Math.max(lastTs, ts + elapsed);
            }
        }

        String[] toRow(int threads) {
            double avg = samples > 0 ? sum / samples : 0;
            double var = samples > 0 ? (sumSq / samples) - (avg * avg) : 0;
            double std = var > 0 ? Math.sqrt(var) : 0;
            double errPct = samples > 0 ? (errors * 100.0 / samples) : 0;
            long durMs = (lastTs > firstTs) ? (lastTs - firstTs) : 0;
            double thrpt   = durMs > 0 ? (samples * 1000.0 / durMs) : 0;
            double recvKBs = durMs > 0 ? ((bytesSum / 1024.0) / (durMs / 1000.0)) : 0;
            double avgBytes= samples > 0 ? (bytesSum * 1.0 / samples) : 0;

            return new String[] {
                    String.valueOf(threads),
                    label,
                    String.valueOf(samples),
                    String.format("%.0f", avg),
                    String.valueOf(min == Long.MAX_VALUE ? 0 : min),
                    String.valueOf(max),
                    String.format("%.0f", std),
                    String.format("%.2f", errPct),
                    String.format("%.2f", thrpt),
                    String.format("%.2f", recvKBs),
                    String.format("%.0f", avgBytes)
            };
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("=== ECS + JMeter Simulation (V8) Start ===");

        // Decide which JMX to use (default QA)
        String jmxFileName = System.getProperty("ecs.jmxFileName", "Predictive Analytics QA.jmx");
        int threadsOverride = -1;

        if (args != null) {
            if (args.length > 0 && args[0] != null && !args[0].trim().isEmpty()) {
                jmxFileName = args[0].trim();
            }
            if (args.length > 1 && args[1] != null && !args[1].trim().isEmpty()) {
                try {
                    threadsOverride = Integer.parseInt(args[1].trim());
                } catch (NumberFormatException e) {
                    System.out.println("[WARN] Cannot parse threads from args[1] = '" + args[1] + "'. Using properties/defaults.");
                }
            }
        }

        System.out.println("[INFO] Using JMX file: " + jmxFileName);

        // JMeter init from project resources
        Path jmHome = Paths.get("src/test/resources/jmeter").toAbsolutePath();
        JMeterUtils.setJMeterHome(jmHome.toString());
        JMeterUtils.loadJMeterProperties(jmHome.resolve("bin/jmeter.properties").toString());
        JMeterUtils.initLocale();
        SaveService.loadProperties();

        // Configure JTL format (CSV)
        System.setProperty("jmeter.save.saveservice.output_format", "csv");
        System.setProperty("jmeter.save.saveservice.print_field_names", "true");
        System.setProperty("jmeter.save.saveservice.default_delimiter", ",");
        System.setProperty("jmeter.save.saveservice.timestamp_format", "yyyy-MM-dd HH:mm:ss");

        System.setProperty("jmeter.save.saveservice.time", "true");
        System.setProperty("jmeter.save.saveservice.elapsed", "true");
        System.setProperty("jmeter.save.saveservice.label", "true");
        System.setProperty("jmeter.save.saveservice.response_code", "true");
        System.setProperty("jmeter.save.saveservice.success", "true");
        System.setProperty("jmeter.save.saveservice.bytes", "true");
        System.setProperty("jmeter.save.saveservice.latency", "true");
        System.setProperty("jmeter.save.saveservice.thread_counts", "true");

        System.setProperty("jmeter.save.saveservice.response_data", "false");
        System.setProperty("jmeter.save.saveservice.response_headers", "false");
        System.setProperty("jmeter.save.saveservice.request_headers", "false");
        System.setProperty("jmeter.save.saveservice.assertion_results", "none");
        System.setProperty("jmeter.save.saveservice.samplerData", "false");
        System.setProperty("jmeter.save.saveservice.response_message", "false");

        // Determine threads and ramp-up
        int[] threadStages;
        String threadsProp = System.getProperty("ecs.threads");
        if (threadsProp != null && !threadsProp.isBlank()) {
            int t = Integer.parseInt(threadsProp);
            threadStages = new int[]{ t };   // one stage with threads from Examples
        } else {
            threadStages = new int[]{10, 20, 30};  // old default
        }

        // Duration of stage in seconds (comes from Cucumber Examples via ecs.duration)
        String durationProp = System.getProperty("ecs.duration");
        int durationSeconds;
        if (durationProp != null && !durationProp.isBlank()) {
            durationSeconds = Integer.parseInt(durationProp);
        } else {
            durationSeconds = 10; // fallback if not provided
        }

        // Optional CLI override
        if (threadsOverride > 0) {
            threadStages = new int[]{ threadsOverride };
        }

        boolean allHealthy = true;
        boolean replacedTasksFound = false;
        double totalErrorRate = 0.0;
        Random random = new Random();

        String resultsDir = "src/test/resources/jmeter/results";
        Files.createDirectories(Paths.get(resultsDir));
        String runStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        boolean KEEP_RAW_JTL = false;
        boolean ZIP_RAW_JTL  = false;

        List<String[]> overviewRows = new ArrayList<>();

        for (int stage : threadStages) {
            System.out.println("\n--- Starting JMeter load test with " + stage + " threads ---");

            String jmxPath = Paths.get("src/test/resources/jmeter/tests/" + jmxFileName)
                    .toAbsolutePath().toString();
            File jmxFile = new File(jmxPath);
            if (!jmxFile.exists()) throw new RuntimeException(".jmx not found at " + jmxPath);

            HashTree testPlanTree = SaveService.loadTree(jmxFile);

            // CSV logger
            String jtlCsv = resultsDir + "/results_" + stage + "threads_" + runStamp + ".csv";
            Summariser summer = new Summariser("summary");
            ResultCollector logger = new ResultCollector(summer);
            logger.setFilename(jtlCsv);
            testPlanTree.add(testPlanTree.getArray()[0], logger);
            System.out.println("Results (raw CSV): " + jtlCsv);

            // Start JMeter
            StandardJMeterEngine jmeter = new StandardJMeterEngine();
            jmeter.configure(testPlanTree);
            Thread jmeterThread = new Thread(jmeter::run);
            jmeterThread.start();

            Thread.sleep(durationSeconds * 1000L);
            jmeter.stopTest();          // graceful
            jmeterThread.join(10_000);  // wait to write to CSV

            // Mock verifications from task (ECS health / deployments / error%)
            boolean healthy = random.nextBoolean();
            if (!healthy) {
                allHealthy = false;
                System.out.println("ECS not healthy at " + stage + " threads.");
            } else {
                System.out.println("ECS healthy at " + stage + " threads.");
            }
            boolean replaced = random.nextInt(10) < 2;
            if (replaced) {
                replacedTasksFound = true;
                System.out.println("Amazon ECS replaced 1 task due to an unhealthy status.");
            } else {
                System.out.println("No replaced tasks detected.");
            }
            double errorRateForStage = 5 + random.nextDouble() * 10; // 5–15%
            totalErrorRate += errorRateForStage;
            System.out.printf("Error rate for %d threads (mock ECS): %.2f%%%n", stage, errorRateForStage);

            // Wait for CSV to be ready, then build per-label summary and TOTAL row
            Path jtlPath = Paths.get(jtlCsv);
            if (!waitForFileReady(jtlPath, 20, 150)) {
                System.out.println("CSV not ready yet, skipping per-label summary for " + stage);
            } else {
                try {
                    // returns TOTAL row for this stage (10 / 20 / 30)
                    String[] totalRow = writePerLabelSummaryCsv(jtlCsv, stage, resultsDir);
                    if (totalRow != null) {
                        overviewRows.add(totalRow);
                    } else {
                        System.out.println("[WARN] No TOTAL row produced for stage " + stage);
                    }
                } catch (Exception e) {
                    System.out.println("Per-label summary skipped: " + e.getMessage());
                }
            }

            // Clean up of huge raw JTL CSV
            if (!KEEP_RAW_JTL) {
                try {
                    if (ZIP_RAW_JTL) gzipAndDelete(jtlPath);
                    else Files.deleteIfExists(jtlPath);
                } catch (Exception e) {
                    System.out.println("JTL cleanup failed: " + e.getMessage());
                }
            }
        }

        // 9. Write short overview per environment (QA / STG)
        String envForOverview = System.getProperty("env", "QA").toUpperCase(Locale.ROOT);

        // Build overview filename, e.g. predictive_analytics_QA_overview.csv
        String overviewFileName = "predictive_analytics_"
                + envForOverview.toLowerCase(Locale.ROOT)
                + "_overview.csv";

        // Build full path inside results directory
        String overviewPath = resultsDir + File.separator + overviewFileName;

        // Write overview CSV using TOTAL row from each stage
        writeOverviewCsv(overviewRows, overviewPath);
        System.out.println("Overview CSV: " + Paths.get(overviewPath).toAbsolutePath());
        rebuildEnvOverviewsFromRunFiles(resultsDir);

        // Final summary
        double averageErrorRate = totalErrorRate / threadStages.length;
        System.out.println("\n=== ECS Simulation Summary ===");
        System.out.printf("Average error rate (mock ECS): %.2f%%%n", averageErrorRate);
        System.out.println("All healthy: " + allHealthy);
        System.out.println("Replaced tasks found: " + replacedTasksFound);
        boolean success = allHealthy && !replacedTasksFound && (averageErrorRate >= 5 && averageErrorRate <= 10);
        System.out.println(success ? "SUCCESSFUL RUN" : "FAILED RUN");
        System.out.println("=== Simulation End ===");
    }

    /* ==== Wait if file exists and has a header ==== */
    private static boolean waitForFileReady(Path p, int attempts, long sleepMs) {
        for (int i = 0; i < attempts; i++) {
            try {
                if (Files.exists(p) && Files.size(p) > 0) {
                    try (BufferedReader br = Files.newBufferedReader(p)) {
                        String first = br.readLine();
                        if (first != null && !first.trim().isEmpty()) return true;
                    }
                }
                Thread.sleep(sleepMs);
            } catch (Exception ignored) {}
        }
        return false;
    }


    private static String[] writePerLabelSummaryCsv(String jtlCsvPath, int stageThreads, String outDir) throws Exception {
        // Ensure output directory exists
        Files.createDirectories(Paths.get(outDir));

        Map<String, LabelSummary> map = new LinkedHashMap<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(jtlCsvPath))) {
            String header = br.readLine();
            if (header == null || header.trim().isEmpty()) {
                System.out.println("[WARN] Empty JTL file: " + jtlCsvPath);
                return null;
            }


            char delim = detectDelimiter(header);
            String[] heads = header.split(Pattern.quote(String.valueOf(delim)), -1);

            // time, elapsed, label, response_code, success, bytes, latency, thread_counts.
            // With this configuration the CSV columns are:
            // 0 = timeStamp, 1 = elapsed, 2 = label, 3 = responseCode,
            // 4 = success, 5 = bytes, 6 = latency, 7+ = thread counts etc.
            int idxTs      = 0;
            int idxElapsed = 1;
            int idxLabel   = 2;
            int idxSuccess = 4;
            int idxBytes   = (heads.length > 5) ? 5 : -1;

            // Simple safety check – if there are too few columns, we skip this file
            if (heads.length <= 4) {
                System.out.println("[WARN] Unexpected JTL header (too few columns): " + header);
                return null;
            }

            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] f = line.split(Pattern.quote(String.valueOf(delim)), -1);

                int maxNeededIdx = Math.max(Math.max(idxTs, idxElapsed), Math.max(idxLabel, idxSuccess));
                if (f.length <= maxNeededIdx) continue;

                String label = f[idxLabel];
                long ts = parseTs(f[idxTs]);
                long elapsed = parseLongSafe(f[idxElapsed]);
                boolean success = Boolean.parseBoolean(f[idxSuccess]);
                long bytes = (idxBytes >= 0 && idxBytes < f.length)
                        ? parseLongSafe(f[idxBytes])
                        : 0L;

                LabelSummary s = map.computeIfAbsent(label, k -> new LabelSummary());
                s.label = label;
                s.add(ts, elapsed, success, bytes);
            }
        }

        // Prepare output summary file
        String out = outDir + "/summary_by_label_" + stageThreads + "threads.csv";

        LabelSummary total = new LabelSummary();
        total.label = "TOTAL";

        try (PrintWriter pw = new PrintWriter(out)) {
            pw.println("Threads,Label,#Samples,Average,Min,Max,StdDev,Error%,Throughput,Received KB/s,Avg Bytes");

            for (LabelSummary s : map.values()) {
                pw.println(String.join(",", s.toRow(stageThreads)));

                // accumulate into TOTAL
                total.samples  += s.samples;
                total.sum      += s.sum;
                total.sumSq    += s.sumSq;
                total.min       = Math.min(total.min, s.min);
                total.max       = Math.max(total.max, s.max);
                total.bytesSum += s.bytesSum;
                total.errors   += s.errors;
                total.firstTs   = Math.min(total.firstTs, s.firstTs);
                total.lastTs    = Math.max(total.lastTs, s.lastTs);
            }

            String[] totalRowValues = total.toRow(stageThreads);
            pw.println(String.join(",", totalRowValues));

            System.out.println("[INFO] Per-label summary CSV generated for " + stageThreads
                    + " threads at: " + out);

            return totalRowValues;
        }
    }

    /* ==== OVERVIEW (3 rows) ==== */
    private static String[] readTotalRowFromSummary(String summaryPath) {


        System.out.println("[DEBUG] Reading summary file: " + summaryPath);
        File file = new File(summaryPath);
        if (!file.exists()) {
            System.out.println("[DEBUG] File not found: " + summaryPath);
            return null;
        } else {
            System.out.println("[DEBUG] File exists, size: " + file.length() + " bytes");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(summaryPath))) {
            String header = br.readLine(); if (header == null) return null;
            String line, last = null;
            while ((line = br.readLine()) != null) last = line; // the last row is TOTAL

            System.out.println("[DEBUG] Last line read: " + last);

            if (last == null) return null;
            String[] f = last.split(",", -1);
            return (f.length >= 11) ? f : null;
        } catch (Exception e) {
            System.out.println("Cannot read summary for overview: " + e.getMessage());
            return null;
        }
    }

    private static void writeOverviewCsv(List<String[]> rows, String outPath) {
        try (PrintWriter pw = new PrintWriter(outPath)) {
            pw.println("Threads,Label,#Samples,Average,Min,Max,StdDev,Error%,Throughput,Received KB/s,Avg Bytes");
            for (String[] r : rows) pw.println(String.join(",", r));

        } catch (Exception e) {
            System.out.println("Cannot write overview CSV: " + e.getMessage());
        }
    }

    /**
     * Rebuilds environment overview CSV files (QA and STG) from existing
     * run_*.csv files in src/test/resources/jmeter/results.

     * Each run_*.csv is expected to have:
     *   Threads,Label,#Samples,Average,Min,Max,StdDev,Error%,Throughput,Received KB/s,Avg Bytes
     * and the last line is treated as the TOTAL row for that run.
     */
    private static void rebuildEnvOverviewsFromRunFiles(String resultsDir) {
        File dir = new File(resultsDir);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("[INFO] Results dir does not exist yet, skipping env overviews.");
            return;
        }

        // Take all CSV files that follow our naming convention run_*.csv
        File[] runFiles = dir.listFiles((d, name) ->
                name.startsWith("run_") && name.endsWith(".csv"));

        if (runFiles == null || runFiles.length == 0) {
            System.out.println("[INFO] No run_*.csv files found for env overviews.");
            return;
        }

        List<String[]> qaRows  = new ArrayList<>();
        List<String[]> stgRows = new ArrayList<>();

        for (File f : runFiles) {
            String fileName = f.getName();

            // Infer environment from the file name: if it contains "_STG_" treat as STG, otherwise QA
            String env = fileName.toUpperCase(Locale.ROOT).contains("_STG_") ? "STG" : "QA";

            // Use existing helper to read the last line (TOTAL row) from this CSV
            String[] totalRow = readTotalRowFromSummary(f.getAbsolutePath());
            if (totalRow == null) {
                System.out.println("[WARN] Could not read TOTAL row from " + fileName);
                continue;
            }

            // Make the "Label" column (index 1) more descriptive: use file name without .csv
            if (totalRow.length > 1) {
                totalRow[1] = fileName.replace(".csv", "");
            }

            if ("STG".equals(env)) {
                stgRows.add(totalRow);
            } else {
                qaRows.add(totalRow);
            }
        }

        // Now write both overview files (they will be overwritten on each run)
        writeOverviewCsv(qaRows, resultsDir + "/predictive_analytics_QA_overview.csv");
        writeOverviewCsv(stgRows, resultsDir + "/predictive_analytics_STG_overview.csv");

        System.out.println("Env overview CSVs rebuilt from run_*.csv files.");
    }

    /* ==== ZIP + delete of huge JTL CSV files ==== */
    private static void gzipAndDelete(Path csvPath) {
        try {
            Path gz = csvPath.resolveSibling(csvPath.getFileName().toString() + ".gz");
            try (java.util.zip.GZIPOutputStream gzos = new java.util.zip.GZIPOutputStream(java.nio.file.Files.newOutputStream(gz))){

                java.nio.file.Files.copy(csvPath, gzos);
            }

            //retain CSV
            System.out.println("🗜️  Compressed (CSV kept): " + gz.getFileName());
        } catch (Exception e) {
            System.out.println("gzip failed: " + e.getMessage());
        }
    }

    /* ==== helpers ==== */
    private static char detectDelimiter(String header) {
        if (header.indexOf(',')  >= 0) return ',';
        if (header.indexOf(';')  >= 0) return ';';
        if (header.indexOf('\t') >= 0) return '\t';
        return ' '; // fallback
    }

    private static int indexOf(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            String col = arr[i];
            if (col != null) {
                col = col.replace("\uFEFF", "")  // remove BOM
                        .replace("\"", "")      // remove quotation marks
                        .trim();                // remove blank spaces
            }
            if (name.equalsIgnoreCase(col)) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndex(String[] heads, String logicalName, int fallbackIndex) {
        int idx = indexOf(heads, logicalName);
        if (idx >= 0) {
            return idx;
        }
        if (fallbackIndex >= 0 && fallbackIndex < heads.length) {
            return fallbackIndex;
        }
        return -1;
    }

    private static long parseLongSafe(String s) {
        try { return Long.parseLong(s.trim()); } catch (Exception e) { return 0L; }
    }
    private static long parseTs(String s) {
        try { return Long.parseLong(s.trim()); } catch (Exception ignore) { }
        try { return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s.trim()).getTime(); }
        catch (Exception e) { return 0L; }
    }
}



















