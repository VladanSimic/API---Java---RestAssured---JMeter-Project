package config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileLogger {
    private static final Lock lock = new ReentrantLock();

    public static void logToFile(String filePath, String timestamp, String tcid) {
        lock.lock();
        try {
            File file = new File("results/" + filePath + ".txt");
            boolean isNewFile = file.createNewFile(); // Create file if it does not exist

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                if (!isNewFile) {
                    writer.newLine();
                }
                writer.write(timestamp + " - " + tcid);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

// Example usage
// FileLogger.logToFile("log.txt", "2024-10-10 12:00:00", "TCID_001");
