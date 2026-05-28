package excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class ExcelWriter {
    private static final ReentrantLock fileLock = new ReentrantLock();
    private static final Object lock = new Object();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy, HH:mm:ss");

    private final String filePath;

    public ExcelWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeData(String sheetName, String[] headers, String[] values) {
        long lockAcquiredTime = System.currentTimeMillis();

        synchronized (lock) {
            fileLock.lock();
            Workbook workbook = null;
            try {
                File file = new File(filePath);

                if (file.exists() && file.length() > 0) {
                    try (FileInputStream fis = new FileInputStream(file)) {
                        workbook = new XSSFWorkbook(fis);
                    }
                } else {
                    workbook = new XSSFWorkbook();
                }

                Sheet sheet = workbook.getSheet(sheetName);
                if (sheet == null) {
                    sheet = workbook.createSheet(sheetName);
                    createHeaderRow(sheet, headers);
                }

                int emptyRow = sheet.getLastRowNum() + 1;
                Row row = sheet.createRow(emptyRow);

                row.createCell(0).setCellValue(dateFormat.format(new Date()));

                for (int i = 0; i < values.length; i++) {
                    row.createCell(i + 1).setCellValue(values[i]);
                }

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }

            } catch (Exception e) {
                System.err.println("Excel Write Error: " + e.getMessage());
            } finally {
                if (workbook != null) {
                    try {
                        workbook.close();
                    } catch (IOException e) {
                        System.err.println("Error closing workbook: " + e.getMessage());
                    }
                }
                fileLock.unlock();
                long executionTime = System.currentTimeMillis() - lockAcquiredTime;
                System.out.println("Time spent in synchronized block: " + executionTime + " ms");
            }
        }
    }

    private void createHeaderRow(Sheet sheet, String[] headers) {
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Timestamp");

        for (int i = 0; i < headers.length; i++) {
            headerRow.createCell(i + 1).setCellValue(headers[i]);
        }
    }
}
