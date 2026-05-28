package integrations;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import java.io.File;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GeneralEcsHealthSimulationV5 {

    public static void main(String[] args) throws Exception {
        System.out.println("=== ECS + JMeter Simulation Start ===");

        // === INIT JMETER CONFIG ===
        Path jmHome = Paths.get("src/test/resources/jmeter").toAbsolutePath();
        JMeterUtils.setJMeterHome(jmHome.toString());
        JMeterUtils.loadJMeterProperties(jmHome.resolve("bin/jmeter.properties").toString());
        JMeterUtils.initLocale();
        SaveService.loadProperties();

        // === TEST CONFIG ===
        int[] threadStages = {10, 20, 30};
        boolean allHealthy = true;
        boolean replacedTasksFound = false;
        double totalErrorRate = 0.0;
        Random random = new Random();

        for (int stage : threadStages) {
            System.out.println("\n--- Starting JMeter load test with " + stage + " threads ---");

            // === PREPARE .JMX TEST ===
            String jmxPath = Paths.get("src/test/resources/jmeter/tests/Predictive Analytics QA.jmx")
                    .toAbsolutePath().toString();

            File jmxFile = new File(jmxPath);
            if (!jmxFile.exists()) {
                throw new RuntimeException(".jmx file not found at: " + jmxPath);
            }

            HashTree testPlanTree = SaveService.loadTree(jmxFile);

            // === RESULTS FOLDER SETUP ===
            String resultsDir = "src/test/resources/jmeter/results";
            Files.createDirectories(Paths.get(resultsDir));

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String resultsFile = resultsDir + "/results_" + stage + "threads_" + timestamp + ".jtl";

            Summariser summer = new Summariser("summary");
            ResultCollector logger = new ResultCollector(summer);
            logger.setFilename(resultsFile);
            testPlanTree.add(testPlanTree.getArray()[0], logger);

            System.out.println("Results will be saved in: " + resultsFile);

            // === START JMETER ENGINE ===
            StandardJMeterEngine jmeter = new StandardJMeterEngine();
            jmeter.configure(testPlanTree);

            Thread jmeterThread = new Thread(jmeter::run);
            jmeterThread.start();

            // Duration simulation test (i.e. 10 seconds)
            int durationSeconds = 10;
            Thread.sleep(durationSeconds * 1000L);

            jmeter.stopTest();  // Graceful stop

            // === SIMULATE AWS ECS HEALTH CHECK ===
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

            double errorRate = 5 + random.nextDouble() * 10; // 5–15%
            totalErrorRate += errorRate;
            System.out.printf("Error rate for %d threads: %.2f%%\n", stage, errorRate);
        }

        // === FINAL SUMMARY ===
        double averageErrorRate = totalErrorRate / threadStages.length;
        System.out.println("\n=== ECS Simulation Summary ===");
        System.out.printf("Average error rate: %.2f%%\n", averageErrorRate);
        System.out.println("All healthy: " + allHealthy);
        System.out.println("Replaced tasks found: " + replacedTasksFound);

        boolean success = allHealthy && !replacedTasksFound && (averageErrorRate >= 5 && averageErrorRate <= 10);

        if (success) {
            System.out.println("SUCCESSFUL RUN: All conditions met.");
        } else {
            System.out.println("FAILED RUN: One or more conditions not met.");
        }

        System.out.println("=== ECS + JMeter Simulation End ===");
    }
}








