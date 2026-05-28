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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

public class GeneralEcsHealthSimulationV7 {

    /* ===== model for agregate by label (state) ===== */
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
        System.out.println("=== ECS + JMeter Simulation (V7 CSV) Start ===");

        // 1) JMeter init from the project resources
        Path jmHome = Paths.get("src/test/resources/jmeter").toAbsolutePath();
        JMeterUtils.setJMeterHome(jmHome.toString());
        JMeterUtils.loadJMeterProperties(jmHome.resolve("bin/jmeter.properties").toString());
        JMeterUtils.initLocale();
        SaveService.loadProperties();

        // 2) Complete JTL as CSV for headers
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

        // 3) Parameters for run
        int[] threadStages = {10, 20, 30};
        int durationSeconds = 10; // duration of a stage
        boolean allHealthy = true;
        boolean replacedTasksFound = false;
        double totalErrorRate = 0.0;
        Random random = new Random();

        String resultsDir = "src/test/resources/jmeter/results";
        Files.createDirectories(Paths.get(resultsDir));
        String runStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());

        for (int stage : threadStages) {
            System.out.println("\n--- Starting JMeter load test with " + stage + " threads ---");

            // 4) .jmx path
            String jmxPath = Paths.get("src/test/resources/jmeter/tests/Predictive Analytics QA.jmx")
                    .toAbsolutePath().toString();
            File jmxFile = new File(jmxPath);
            if (!jmxFile.exists()) throw new RuntimeException(".jmx not found at " + jmxPath);

            HashTree testPlanTree = SaveService.loadTree(jmxFile);

            // 5) CSV logger
            String jtlCsv = resultsDir + "/results_" + stage + "threads_" + runStamp + ".csv";
            Summariser summer = new Summariser("summary");
            ResultCollector logger = new ResultCollector(summer);
            logger.setFilename(jtlCsv);
            testPlanTree.add(testPlanTree.getArray()[0], logger);
            System.out.println("Results (raw CSV): " + jtlCsv);

            // 6) Start
            StandardJMeterEngine jmeter = new StandardJMeterEngine();
            jmeter.configure(testPlanTree);
            Thread jmeterThread = new Thread(jmeter::run);
            jmeterThread.start();

            Thread.sleep(durationSeconds * 1000L);
            jmeter.stopTest();          // graceful
            jmeterThread.join(10_000);  // sačekaj da dopiše CSV

            // 7) Mock verifications from task
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

            // 8) Wait for CSV to be ready and then create per-label summary
            Path jtlPath = Paths.get(jtlCsv);
            if (!waitForFileReady(jtlPath, 20, 150)) {
                System.out.println("CSV not ready yet, skipping per-label summary for " + stage);
            } else {
                try {
                    writePerLabelSummaryCsv(jtlCsv, stage, resultsDir);
                } catch (Exception e) {
                    System.out.println("Per-label summary skipped: " + e.getMessage());
                }
            }
        }

        // 9) Final 3-termed verification
        double averageErrorRate = totalErrorRate / threadStages.length;
        System.out.println("\n=== ECS Simulation Summary ===");
        System.out.printf("Average error rate (mock ECS): %.2f%%%n", averageErrorRate);
        System.out.println("All healthy: " + allHealthy);
        System.out.println("Replaced tasks found: " + replacedTasksFound);
        boolean success = allHealthy && !replacedTasksFound && (averageErrorRate >= 5 && averageErrorRate <= 10);
        System.out.println(success ? "SUCCESSFUL RUN" : "FAILED RUN");
        System.out.println("=== Simulation End ===");
    }

    /* ==== wait if file exists and has a header ==== */
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

    /* ==== per-label summary CSV (detection of delimiter + validation) ==== */
    private static void writePerLabelSummaryCsv(String jtlCsvPath, int stageThreads, String outDir) throws Exception {
        Files.createDirectories(Paths.get(outDir));
        Map<String, LabelSummary> map = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(jtlCsvPath))) {
            String header = br.readLine();
            if (header == null) {
                System.out.println("Empty CSV (no header): " + jtlCsvPath);
                return;
            }

            // remove BOM and whitespace
            header = header.replace("\uFEFF", "").trim();

            // auto detection of delimiter
            char delim = detectDelimiter(header);
            String[] cols = header.split(Pattern.quote(Character.toString(delim)), -1);

            int idxTs      = indexOf(cols, "timeStamp");
            int idxElapsed = indexOf(cols, "elapsed");
            int idxLabel   = indexOf(cols, "label");
            int idxSuccess = indexOf(cols, "success");
            int idxBytes   = indexOf(cols, "bytes");

            if (idxTs < 0 || idxElapsed < 0 || idxLabel < 0 || idxSuccess < 0 || idxBytes < 0) {
                String delimShown = (delim == '\t') ? "\\t" : Character.toString(delim);
                System.out.println("CSV header not recognized in " + jtlCsvPath);
                System.out.println("  Detected delimiter: '" + delimShown + "'");
                System.out.println("  Header: " + String.join("|", cols));
                System.out.println("  Needed: timeStamp, elapsed, label, success, bytes");
                return;
            }

            String line;
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;
                String[] f = line.split(Pattern.quote(Character.toString(delim)), -1);
                if (f.length < cols.length) continue;

                long ts      = parseTs(f[idxTs]);
                long elapsed = parseLongSafe(f[idxElapsed]);
                String label = f[idxLabel];
                boolean success = "true".equalsIgnoreCase(f[idxSuccess]) || "1".equals(f[idxSuccess]);
                long bytes  = parseLongSafe(f[idxBytes]);

                LabelSummary s = map.computeIfAbsent(label, k -> new LabelSummary());
                s.label = label;
                s.add(ts, elapsed, success, bytes);
            }
        }

        String out = outDir + "/summary_by_label_" + stageThreads + "threads.csv";
        try (PrintWriter pw = new PrintWriter(out)) {
            pw.println("Threads,Label,#Samples,Average,Min,Max,StdDev,Error%,Throughput,Received KB/s,Avg Bytes");
            for (LabelSummary s : map.values()) {
                pw.println(String.join(",", s.toRow(stageThreads)));
            }
            // TOTAL
            LabelSummary total = new LabelSummary(); total.label = "TOTAL";
            for (LabelSummary s : map.values()) {
                total.samples += s.samples;
                total.sum     += s.sum;
                total.sumSq   += s.sumSq;
                total.min      = Math.min(total.min, s.min);
                total.max      = Math.max(total.max, s.max);
                total.bytesSum += s.bytesSum;
                total.errors   += s.errors;
                total.firstTs  = Math.min(total.firstTs, s.firstTs);
                total.lastTs   = Math.max(total.lastTs, s.lastTs);
            }
            pw.println(String.join(",", total.toRow(stageThreads)));
        }

        System.out.println("Per-label summary CSV: " + out);
    }

    /* ==== helpers ==== */
    private static char detectDelimiter(String header) {
        if (header.indexOf(',')  >= 0) return ',';
        if (header.indexOf(';')  >= 0) return ';';
        if (header.indexOf('\t') >= 0) return '\t';
        return ' '; // fallback
    }
    private static int indexOf(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) if (name.equalsIgnoreCase(arr[i])) return i;
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

