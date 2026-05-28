package integrations;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class GeneralEcsHealthSimulationV6 {

    public static void main(String[] args) throws Exception {
        System.out.println("=== ECS + JMeter Simulation Start ===");

        // === INIT JMeter Config ===
        Path jmHome = Paths.get("src/test/resources/jmeter").toAbsolutePath();
        JMeterUtils.setJMeterHome(jmHome.toString());
        JMeterUtils.loadJMeterProperties(jmHome.resolve("bin/jmeter.properties").toString());
        JMeterUtils.initLocale();
        SaveService.loadProperties();

        // === Test configuration ===
        int[] threadStages = {10, 20, 30};
        boolean allHealthy = true;
        boolean replacedTasksFound = false;
        double totalErrorRate = 0.0;
        Random random = new Random();

        // Create folder for the results
        String resultsDir = "src/test/resources/jmeter/results";
        Files.createDirectories(Paths.get(resultsDir));

        // Summary CSV file
        String summaryPath = resultsDir + "/summary_report_" +
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".csv";
        BufferedWriter summaryWriter = new BufferedWriter(new FileWriter(summaryPath));
        summaryWriter.write("Threads,Label,#Samples,Average,Min,Max,StdDev,Error%,Throughput,Received KB/sec,Sent KB/sec,Avg Bytes\n");

        for (int stage : threadStages) {
            System.out.println("\n--- Starting JMeter load test with " + stage + " threads ---");

            // === Load .jmx test plan ===
            String jmxPath = Paths.get("src/test/resources/jmeter/tests/Predictive Analytics QA.jmx")
                    .toAbsolutePath().toString();
            File jmxFile = new File(jmxPath);
            if (!jmxFile.exists()) throw new RuntimeException(".jmx not found at " + jmxPath);

            HashTree testPlanTree = SaveService.loadTree(jmxFile);

            // === Create JTL result file ===
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String resultsFile = resultsDir + "/results_" + stage + "threads_" + timestamp + ".jtl";

            Summariser summer = new Summariser("summary");
            ResultCollector logger = new ResultCollector(summer);
            logger.setFilename(resultsFile);
            testPlanTree.add(testPlanTree.getArray()[0], logger);
            System.out.println("Results (raw): " + resultsFile);

            // === Run JMeter ===
            StandardJMeterEngine jmeter = new StandardJMeterEngine();
            jmeter.configure(testPlanTree);

            Thread jmeterThread = new Thread(jmeter::run);
            jmeterThread.start();
            Thread.sleep(10_000); // i.e. 10 seconds of simulation
            jmeter.stopTest();

            // === Simulate AWS ECS Health ===
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
                System.out.println("Amazon ECS replaced 1 task.");
            } else {
                System.out.println("No replaced tasks detected.");
            }

            double errorRate = 5 + random.nextDouble() * 10;
            totalErrorRate += errorRate;
            System.out.printf("Error rate for %d threads: %.2f%%\n", stage, errorRate);

            // === Parse JTL to Summary ===
            Map<String, String> summary = parseJTLSummary(resultsFile);
            if (summary != null) {
                summaryWriter.write(stage + "," +
                        summary.get("label") + "," +
                        summary.get("samples") + "," +
                        summary.get("avg") + "," +
                        summary.get("min") + "," +
                        summary.get("max") + "," +
                        summary.get("stddev") + "," +
                        summary.get("error") + "," +
                        summary.get("throughput") + "," +
                        summary.get("received") + "," +
                        summary.get("sent") + "," +
                        summary.get("bytes") + "\n");
            }
        }

        // === Write Summary Results ===
        summaryWriter.close();

        double avgErrorRate = totalErrorRate / threadStages.length;
        System.out.println("\n=== ECS Summary ===");
        System.out.printf("Average error rate: %.2f%%\n", avgErrorRate);
        System.out.println("All healthy: " + allHealthy);
        System.out.println("Replaced tasks found: " + replacedTasksFound);
        System.out.println("Summary CSV saved: " + summaryPath);

        boolean success = allHealthy && !replacedTasksFound && (avgErrorRate >= 5 && avgErrorRate <= 10);
        System.out.println(success ? "SUCCESSFUL RUN" : "FAILED RUN");
        System.out.println("=== Simulation End ===");
    }

    // === Simple JTL Parser for Summary Data ===
    private static Map<String, String> parseJTLSummary(String filePath) {
        Map<String, String> result = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            long count = 0, sum = 0, min = Long.MAX_VALUE, max = 0;
            while ((line = br.readLine()) != null) {
                if (line.contains("<httpSample") || line.contains("<sample")) {
                    count++;
                    String t = getAttr(line, "t");
                    if (t != null) {
                        long val = Long.parseLong(t);
                        sum += val;
                        min = Math.min(min, val);
                        max = Math.max(max, val);
                    }
                }
            }
            if (count > 0) {
                long avg = sum / count;
                result.put("label", "PredictiveAnalytics");
                result.put("samples", String.valueOf(count));
                result.put("avg", String.valueOf(avg));
                result.put("min", String.valueOf(min));
                result.put("max", String.valueOf(max));
                result.put("stddev", "N/A");
                result.put("error", "0.00");
                result.put("throughput", "N/A");
                result.put("received", "N/A");
                result.put("sent", "N/A");
                result.put("bytes", "N/A");
            }
            return result;
        } catch (Exception e) {
            System.out.println("Unable to parse JTL: " + filePath);
            return null;
        }
    }

    private static String getAttr(String line, String attr) {
        int start = line.indexOf(attr + "=\"");
        if (start == -1) return null;
        start += attr.length() + 2;
        int end = line.indexOf("\"", start);
        return end > start ? line.substring(start, end) : null;
    }
}


