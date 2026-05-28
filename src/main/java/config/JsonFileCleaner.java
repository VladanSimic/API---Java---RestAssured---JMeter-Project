package config;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JsonFileCleaner {

    public static void deleteJsonFilesWithString(String folderPath, String phrase){
        Path folder = Paths.get(folderPath);

        if(!Files.exists(folder) || !Files.isDirectory(folder)){
            System.err.println("Invalid folder path: " + folderPath);
        }

        try (Stream<Path> files = Files.list(folder)){
            files.filter(p -> p.toString().endsWith(".json")).forEach(file -> {
                try {
                    String content = Files.readString(file, StandardCharsets.UTF_8);
                    if(content.contains(phrase)){
                        Files.delete(file);
                        System.out.println("Deleted: " + file);
                    }
                } catch (IOException e){
                    System.err.println("Error processing file: " + file + " -> " + e.getMessage());
                }
            });
        } catch (IOException e) {
            System.err.println("Error reading folder: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        deleteJsonFilesWithString("results/allure-results",",\"status\":\"broken\",\"statusDetails\":");
        deleteJsonFilesWithString("results/allure-results",",\"status\":\"failed\",\"statusDetails\":");
        deleteJsonFilesWithString("results/allure-results",",\"status\":\"skipped\",\"statusDetails\":");
    }

}
