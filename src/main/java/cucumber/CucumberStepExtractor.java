package cucumber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CucumberStepExtractor {

    private static final Pattern STEP_PATTERN = Pattern.compile("@(Given|When|Then|And|But)\\(\"([^\"]+)\"\\)");
    private static final String PROJECT_DIR = System.getProperty("user.dir");
    private static final String STEPS_DIR = PROJECT_DIR + "/src/test/java/steps";
    private static final String OUTPUT_DIR = PROJECT_DIR + "/results";
    private static final String OUTPUT_FILE = OUTPUT_DIR + "/CucumberSteps.txt";

    public static void main(String[] args) {
        File stepsDir = new File(STEPS_DIR);
        File outputDir = new File(OUTPUT_DIR);
        File outputFile = new File(OUTPUT_FILE);

        if (!stepsDir.isDirectory()) {
            System.out.println("The steps directory path is not a directory: " + STEPS_DIR);
            return;
        }

        // Create output directory if it doesn't exist
        if (!outputDir.exists()) {
            if (outputDir.mkdirs()) {
                System.out.println("Created output directory: " + OUTPUT_DIR);
            } else {
                System.err.println("Failed to create output directory: " + OUTPUT_DIR);
                return;
            }
        }

        try (FileWriter writer = new FileWriter(outputFile)) {
            List<String> stepDefinitions = new ArrayList<>();
            int stepCount = extractSteps(stepsDir, stepDefinitions);

            // Sort the step definitions alphabetically
            Collections.sort(stepDefinitions);

            // Write sorted step definitions to the file
            for (String step : stepDefinitions) {
                writer.write(step + System.lineSeparator());
            }

            System.out.println("Step definitions have been written to " + outputFile.getPath());
            System.out.println("Total steps written: " + stepCount);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + outputFile.getPath());
            e.printStackTrace();
        }
    }

    private static int extractSteps(File directory, List<String> stepDefinitions) {
        File[] files = directory.listFiles();
        int stepCount = 0;

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    stepCount += extractSteps(file, stepDefinitions);
                } else if (file.getName().endsWith(".java")) {
                    try {
                        List<String> lines = Files.readAllLines(file.toPath());
                        for (String line : lines) {
                            Matcher matcher = STEP_PATTERN.matcher(line);
                            if (matcher.find()) {
                                stepDefinitions.add(matcher.group(2));
                                stepCount++;
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + file.getPath());
                        e.printStackTrace();
                    }
                }
            }
        }
        return stepCount;
    }

}