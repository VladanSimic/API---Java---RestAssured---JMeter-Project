package integrations;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import java.io.*;
import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.Random;

public class GeneralEcsHealthSimulationV4 {

    private static final String DEF_STAGES = "10,20,30";
    private static final int DEF_RAMP_UP_MS_PER_USER = 1000;
    private static final double DEF_ERROR_MIN = 5.0;
    private static final double DEF_ERROR_MAX = 10.0;
    private static final Long DEF_SEED = null;
    private static final int DEF_DURATION_SECONDS = 15; // duration of every stage

    public static void main(String[] args) throws Exception {
        // === Arguments ===
        String stagesCSV       = (args.length > 0 && !args[0].isBlank()) ? args[0] : DEF_STAGES;
        int rampUpMsPerUser    = (args.length > 1) ? parseIntOr(args[1], DEF_RAMP_UP_MS_PER_USER) : DEF_RAMP_UP_MS_PER_USER;
        double errorMin        = (args.length > 2) ? parseDoubleOr(args[2], DEF_ERROR_MIN) : DEF_ERROR_MIN;
        double errorMax        = (args.length > 3) ? parseDoubleOr(args[3], DEF_ERROR_MAX) : DEF_ERROR_MAX;
        Long seed              = (args.length > 4) ? parseLongOr(args[4], DEF_SEED) : DEF_SEED;
        int durationSeconds    = (args.length > 5) ? parseIntOr(args[5], DEF_DURATION_SECONDS) : DEF_DURATION_SECONDS;

        int[] threadStages = parseStages(stagesCSV);
        Random random = (seed == null) ? new Random() : new Random(seed);

        // === Initialize JMeter ===
        Path jmHome = Paths.get("src/test/resources/jmeter").toAbsolutePath();
        JMeterUtils.setJMeterHome(jmHome.toString());
        JMeterUtils.loadJMeterProperties(jmHome.resolve("bin/jmeter.properties").toString());
        JMeterUtils.initLocale();
        SaveService.loadProperties();

        StandardJMeterEngine jmeter = new StandardJMeterEngine();

        System.out.println("=== ECS + JMeter Simulation Start ===");
        try (PrintWriter log = new PrintWriter(new FileWriter("ecs_simulation_log_v4.txt", true))) {

            boolean allHealthy = true;
            boolean replacedTasksFound = false;
            double totalErrorRate = 0.0;
            DecimalFormat df = new DecimalFormat("0.00");

            log.printf("Config: stages=%s, duration=%ds, rampUp=%dms/user, errorRange=[%.2f–%.2f], seed=%s%n",
                    stagesCSV, durationSeconds, rampUpMsPerUser, errorMin, errorMax, (seed == null ? "random" : seed));

            for (int stage : threadStages) {
                System.out.println("\n--- Starting JMeter load test with " + stage + " threads ---");
                log.printf("\n--- Stage %d threads --- %n", stage);

                // === Start JMeter scenario ===
                Path resultFile = Paths.get("jmeter_results_" + stage + ".jtl");
                Files.deleteIfExists(resultFile);

                String jmxPath = Paths.get("src/test/resources/jmeter/tests/Predictive Analytics QA.jmx").toAbsolutePath().toString();
                HashTree testPlanTree = SaveService.loadTree(new File(jmxPath));
                jmeter.configure(testPlanTree);

                // Start JMeter test (make it lasts - durationSeconds)
                Thread jmeterThread = new Thread(jmeter::run);
                jmeterThread.start();
                Thread.sleep(durationSeconds * 1000L);
                jmeter.stopTest();

                // === Simulate ramp-up + latency ===
                for (int i = 1; i <= stage; i++) {
                    if (i % 100 == 0 || i == stage) {
                        System.out.printf("Ramped up to %d users...%n", i);
                    }
                    Thread.sleep(rampUpMsPerUser / 10);
                    if (random.nextInt(100) < 3) {
                        int latency = 100 + random.nextInt(800);
                        System.out.printf("Request latency: %dms%n", latency);
                    }
                }

                // === Dynamic error and health ===
                double baseError = errorMin + random.nextDouble() * (errorMax - errorMin);
                double loadFactor = Math.max(1.0, stage / 500.0);
                double errorRate = Math.min(baseError * loadFactor, 20);
                boolean healthy = (errorRate < 10 && random.nextDouble() < 0.7);

                totalErrorRate += errorRate;
                if (!healthy) {
                    allHealthy = false;
                    System.out.println("ECS not healthy at " + stage + " threads.");
                    log.printf("Stage %d -> ECS unhealthy%n", stage);
                } else {
                    System.out.println("ECS healthy at " + stage + " threads.");
                    log.printf("Stage %d -> ECS healthy%n", stage);
                }

                boolean replaced = random.nextInt(10) < 2;
                if (replaced) {
                    replacedTasksFound = true;
                    System.out.println("Amazon ECS replaced 1 task due to an unhealthy status.");
                    log.println("Amazon ECS replaced 1 task.");
                } else {
                    System.out.println("No replaced tasks detected.");
                    log.println("No replaced tasks detected.");
                }

                System.out.printf("Error rate for %d threads: %s%%%n", stage, df.format(errorRate));
                log.printf("Error rate for %d threads: %s%%%n", stage, df.format(errorRate));
            }

            double avgError = totalErrorRate / threadStages.length;
            boolean success = allHealthy && !replacedTasksFound && (avgError >= 5 && avgError <= 10);

            // === Enter summary report-a ===
            try (PrintWriter summary = new PrintWriter(new FileWriter("summary_report.csv"))) {
                summary.println("Threads,AverageError(%),AllHealthy,ReplacedTasksFound,Result");
                summary.printf("%s,%.2f,%s,%s,%s%n", stagesCSV, avgError, allHealthy, replacedTasksFound, success ? "SUCCESS" : "FAILED");
            }

            // === Final outcome ===
            System.out.println("\n=== ECS Simulation Summary ===");
            System.out.printf("Average error rate: %.2f%%%n", avgError);
            System.out.println("All healthy: " + allHealthy);
            System.out.println("Replaced tasks found: " + replacedTasksFound);
            System.out.println(success ? "SUCCESSFUL RUN: All conditions met." : "FAILED RUN: One or more conditions not met.");
        }

        System.out.println("=== ECS + JMeter Simulation End ===");
    }

    // === Helper methods ===
    private static int[] parseStages(String csv) {
        String[] parts = csv.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i].trim());
        return arr;
    }

    private static int parseIntOr(String s, int defVal) {
        try { return Integer.parseInt(s.trim()); } catch (Exception e) { return defVal; }
    }

    private static double parseDoubleOr(String s, double defVal) {
        try { return Double.parseDouble(s.trim()); } catch (Exception e) { return defVal; }
    }

    private static Long parseLongOr(String s, Long defVal) {
        try { return Long.parseLong(s.trim()); } catch (Exception e) { return defVal; }
    }
}








