package integrations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GeneralEcsHealthSimulationV3 {

    private static final String DEF_STAGES = "10,20,30";
    private static final int DEF_RAMP_UP_MS_PER_USER = 1000;
    private static final double DEF_ERROR_MIN = 5.0;
    private static final double DEF_ERROR_MAX = 10.0;
    private static final Long DEF_SEED = null;

    public static void main(String[] args) throws InterruptedException, IOException {
        // ====== CLI arguments ======
        String stagesCSV       = (args.length > 0 && !args[0].isBlank()) ? args[0] : DEF_STAGES;
        int rampUpMsPerUser    = (args.length > 1) ? parseIntOr(args[1], DEF_RAMP_UP_MS_PER_USER) : DEF_RAMP_UP_MS_PER_USER;
        double errorMin        = (args.length > 2) ? parseDoubleOr(args[2], DEF_ERROR_MIN) : DEF_ERROR_MIN;
        double errorMax        = (args.length > 3) ? parseDoubleOr(args[3], DEF_ERROR_MAX) : DEF_ERROR_MAX;
        Long seed              = (args.length > 4) ? parseLongOr(args[4], DEF_SEED) : DEF_SEED;

        int[] threadStages = parseStages(stagesCSV);
        Random random = (seed == null) ? new Random() : new Random(seed);

        boolean allHealthy = true;
        boolean replacedTasksFound = false;
        double totalErrorRate = 0.0;

        // ====== Log file ======
        try (PrintWriter log = new PrintWriter(new FileWriter("ecs_simulation_log.txt", true))) {

            log.println("=== ECS Health Simulation Log Start ===");
            log.printf("Config: stages=%s, rampUpMsPerUser=%d, errorRange=[%.2f–%.2f], seed=%s%n",
                    stagesCSV, rampUpMsPerUser, errorMin, errorMax, (seed == null ? "random" : seed));

            System.out.println("=== ECS Health Simulation Start ===");
            System.out.printf("Config => stages=%s, rampUpMsPerUser=%d, errorMin=%.2f%%, errorMax=%.2f%%%s%n",
                    stagesCSV, rampUpMsPerUser, errorMin, errorMax,
                    seed == null ? "" : (", seed=" + seed));

            for (int stage : threadStages) {
                System.out.println("\n--- Starting load test with " + stage + " threads ---");
                log.printf("%n--- Stage: %d threads --- %n", stage);

                // ====== Ramp-up phase ======
                for (int i = 1; i <= stage; i++) {
                    if (i % 100 == 0 || i == stage) {
                        System.out.println("Ramped up to " + i + " users...");
                    }
                    Thread.sleep(rampUpMsPerUser / 10); // simulation fast time
                }

                // ====== Dynamic error rate ======
                double baseError = errorMin + (random.nextDouble() * (errorMax - errorMin));
                double loadFactor = Math.max(1.0, stage / 500.0);
                double errorRate = baseError * loadFactor;
                if (errorRate > 20) errorRate = 20; // limited in maksimum

                // ====== Dynamic health ======
                boolean healthy;
                if (errorRate > 10) {
                    healthy = false;
                } else if (stage <= 600) {
                    healthy = random.nextDouble() < 0.8;
                } else {
                    healthy = random.nextDouble() < 0.5;
                }

                if (!healthy) {
                    allHealthy = false;
                    System.out.println("ECS not healthy at " + stage + " threads.");
                    log.printf("Stage %d -> ECS not healthy.%n", stage);
                } else {
                    System.out.println("ECS healthy at " + stage + " threads.");
                    log.printf("Stage %d -> ECS healthy.%n", stage);
                }

                // ====== AWS replaced tasks check ======
                boolean replaced = random.nextInt(10) < 2;
                if (replaced) {
                    replacedTasksFound = true;
                    System.out.println("Amazon ECS replaced 1 task due to an unhealthy status.");
                    log.println("Amazon ECS replaced 1 task.");
                } else {
                    System.out.println("No replaced tasks detected.");
                    log.println("No replaced tasks detected.");
                }

                // ====== Outcome of error rate ======
                System.out.printf("Error rate for %d threads: %.2f%%%n", stage, errorRate);
                log.printf("Error rate for %d threads: %.2f%%%n", stage, errorRate);

                totalErrorRate += errorRate;
            }

            double averageErrorRate = totalErrorRate / threadStages.length;

            // ====== Summary ======
            System.out.println("\n=== ECS Simulation Summary ===");
            System.out.printf("Average error rate: %.2f%%%n", averageErrorRate);
            System.out.println("All healthy: " + allHealthy);
            System.out.println("Replaced tasks found: " + replacedTasksFound);

            log.printf("%n=== ECS Simulation Summary ===%n");
            log.printf("Average error rate: %.2f%%%n", averageErrorRate);
            log.printf("All healthy: %s%n", allHealthy);
            log.printf("Replaced tasks found: %s%n", replacedTasksFound);

            boolean success = allHealthy && !replacedTasksFound && (averageErrorRate >= 5 && averageErrorRate <= 10);

            if (success) {
                System.out.println("SUCCESSFUL RUN: All conditions met.");
                log.println("SUCCESSFUL RUN: All conditions met.");
            } else {
                System.out.println("FAILED RUN: One or more conditions not met.");
                log.println("FAILED RUN: One or more conditions not met.");
            }

            System.out.println("=== ECS Health Simulation End ===");
            log.println("=== ECS Health Simulation Log End ===\n");
        }
    }

    // ====== Helper methods ======
    private static int[] parseStages(String csv) {
        String[] parts = csv.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
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


