package integrations;

import java.util.Random;

public class GeneralEcsHealthSimulation {

    // ---- DEFAULTS (will be used if arguments are not forward) ----
    private static final String DEF_STAGES = "10,20,30"; // CSV
    private static final int    DEF_RAMP_UP_MS_PER_USER = 1000; // 1s by user
    private static final double DEF_ERROR_MIN = 5.0;  // %
    private static final double DEF_ERROR_MAX = 10.0; // %
    private static final Long   DEF_SEED = null;      // null = random every run

    public static void main(String[] args) throws InterruptedException {
        // ---- 1) Parsing argumenats (all optional) ----
        // args[0] = "10,20,30"
        // args[1] = rampUpMsPerUser (npr. 1000)
        // args[2] = errorMin (npr. 5)
        // args[3] = errorMax (npr. 10)
        // args[4] = seed (npr. 42) – optional, for the results

        String stagesCSV       = (args.length > 0 && !args[0].isBlank()) ? args[0] : DEF_STAGES;
        int    rampUpMsPerUser = (args.length > 1) ? parseIntOr(args[1], DEF_RAMP_UP_MS_PER_USER) : DEF_RAMP_UP_MS_PER_USER;
        double errorMin        = (args.length > 2) ? parseDoubleOr(args[2], DEF_ERROR_MIN)        : DEF_ERROR_MIN;
        double errorMax        = (args.length > 3) ? parseDoubleOr(args[3], DEF_ERROR_MAX)        : DEF_ERROR_MAX;
        Long   seed            = (args.length > 4) ? parseLongOr(args[4], DEF_SEED)               : DEF_SEED;

        int[] threadStages = parseStages(stagesCSV);

        final Random random = (seed == null) ? new Random() : new Random(seed);

        System.out.println("=== ECS Health Simulation Start ===");
        System.out.printf("Config => stages=%s, rampUpMsPerUser=%d, errorMin=%.2f%%, errorMax=%.2f%%%s%n",
                stagesCSV, rampUpMsPerUser, errorMin, errorMax,
                seed == null ? "" : (", seed=" + seed));

        boolean allHealthy = true;
        boolean replacedTasksFound = false;
        double totalErrorRate = 0.0;

        for (int stage : threadStages) {
            System.out.println("\n--- Starting load test with " + stage + " threads ---");

            // ---- 2) Dynamic ramp-up: 1 “user” = rampUpMsPerUser ms ----
            for (int i = 1; i <= stage; i++) {
                if (i % 100 == 0 || i == stage) {
                    System.out.println("Ramped up to " + i + " users...");
                }
                Thread.sleep(rampUpMsPerUser);
            }

            // ---- 3) Mock health (retain logic) ----
            boolean healthy = random.nextBoolean();
            if (!healthy) {
                allHealthy = false;
                System.out.println("ECS not healthy at " + stage + " threads.");
            } else {
                System.out.println("ECS healthy at " + stage + " threads.");
            }

            // ---- 4) Mock “replaced task” ----
            boolean replaced = random.nextInt(10) < 2; // ~20%
            if (replaced) {
                replacedTasksFound = true;
                System.out.println("Amazon ECS replaced 1 task due to an unhealthy status.");
            } else {
                System.out.println("No replaced tasks detected.");
            }

            // ---- 5) Error rate from [errorMin, errorMax] ----
            double errorRange = Math.max(0.0, errorMax - errorMin);
            double errorRate = errorMin + (random.nextDouble() * errorRange);
            totalErrorRate += errorRate;
            System.out.printf("Error rate for %d threads: %.2f%%%n", stage, errorRate);
        }

        double averageErrorRate = totalErrorRate / threadStages.length;

        System.out.println("\n=== ECS Simulation Summary ===");
        System.out.printf("Average error rate: %.2f%%%n", averageErrorRate);
        System.out.println("All healthy: " + allHealthy);
        System.out.println("Replaced tasks found: " + replacedTasksFound);

        // Final verification (remains the same: 3 verifications)
        boolean success = allHealthy && !replacedTasksFound && (averageErrorRate >= 5 && averageErrorRate <= 10);

        if (success) {
            System.out.println("SUCCESSFUL RUN: All conditions met.");
        } else {
            System.out.println("FAILED RUN: One or more conditions not met.");
        }
        System.out.println("=== ECS Health Simulation End ===");
    }

    // ---- Helpers ----
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








