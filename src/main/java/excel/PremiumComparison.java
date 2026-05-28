package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class PremiumComparison {
    private final Map<String, String> data = new HashMap<>();
    public final Map<String, Map<String, String>> baseRates = new HashMap<>();
    private final Set<String> processedSheets = new HashSet<>();
    private final ReentrantLock fileLock = new ReentrantLock();
    private static final Object lock = new Object();
    private static final Random random = new Random();

    public void insertPremiumIntoExcel(String sheetName, String TC_ID, String grandTotal) {
        long lockAcquiredTime = System.currentTimeMillis();

        synchronized (lock) {
            try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            fileLock.lock();
            try {
                File originalFile = new File("src/test/test_data/dragon/PremiumComparison.xlsx");

                Workbook workbook;
                try (FileInputStream fileInputStream = new FileInputStream(originalFile)) {
                    workbook = new XSSFWorkbook(fileInputStream);
                }

                Sheet sheet = workbook.getSheet(sheetName);
                int emptyRow = -1;
                for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    if (row == null || row.getCell(0) == null || row.getCell(0).getStringCellValue().isEmpty()) {
                        emptyRow = i;
                        break;
                    }
                }

                if (emptyRow == -1) {
                    emptyRow = sheet.getLastRowNum() + 1;
                }

                Row row = sheet.getRow(emptyRow);
                if (row == null) {
                    row = sheet.createRow(emptyRow);
                }
                Cell cell1 = row.createCell(0);
                cell1.setCellValue(TC_ID);
                Cell cell2 = row.createCell(1);
                cell2.setCellValue(grandTotal);

                try (FileOutputStream out = new FileOutputStream(originalFile)) {
                    workbook.write(out);
                }

            } catch (Exception e) {
                System.err.println("Excel Exception: " + e.getMessage());
            } finally {
                fileLock.unlock();
                long endTime = System.currentTimeMillis();
                long executionTime = (endTime - lockAcquiredTime);
                System.out.println("Time spent in synchronized block: " + executionTime + " ms");
            }
        }
    }

    public void retrieveData(String sheetName) throws Throwable {
        if (!processedSheets.contains(sheetName)) {
            synchronized (lock) {
                FileInputStream fileInputStream = new FileInputStream("src/test/test_data/dragon/PremiumComparison.xlsx");
                Workbook workbook = new XSSFWorkbook(fileInputStream);
                Sheet sheet = workbook.getSheet(sheetName);

                for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    if (row != null) {
                        String key = sheetName + "_" + row.getCell(0).getStringCellValue().trim();
                        String value = row.getCell(1).getStringCellValue().trim();
                        data.put(key, value);
                    }
                }
                processedSheets.add(sheetName);
                workbook.close();
                fileInputStream.close();
            }
        }
    }

    public void retrieveBaseRateValidationData(String excelFile, String sheetName) throws Throwable {
        if (!processedSheets.contains(excelFile + sheetName)) {
            synchronized (lock) {
                FileInputStream fileInputStream = new FileInputStream("src/test/test_data/dragon/base_rates/" + excelFile + ".xlsx");
                Workbook workbook = new XSSFWorkbook(fileInputStream);
                Sheet sheet = workbook.getSheet(sheetName);

                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    if (row != null) {
                        if (i == 1) {
                            baseRates.put("Effective_Date", Map.of("Effective_Date", row.getCell(0).getStringCellValue().trim()));
                        }
                        String territoryZone = row.getCell(1).getStringCellValue().trim();
                        Map<String, String> innerMap = new HashMap<>();

                        for (int j = 2; j < row.getLastCellNum(); j++) {
                            String columnName = sheet.getRow(0).getCell(j).getStringCellValue().trim();
                            String value = row.getCell(j).getStringCellValue().trim();
                            innerMap.put(columnName, value);
                        }
                        baseRates.put(territoryZone, innerMap);
                    }
                }
                processedSheets.add(excelFile + sheetName);
                workbook.close();
                fileInputStream.close();
            }
        }
    }

    public String getValue(String sheet, String TC_ID) {
        return data.get(sheet + "_" + TC_ID);
    }

    public String getEffectiveDate() {
        return baseRates.get("Effective_Date").get("Effective_Date");
    }

    public String[] getHOBaseRates(String zone) {
        return new String[]{baseRates.get(zone).get("Base_Rate_Homeowner"), baseRates.get(zone).get("Base_Rate_CCT")};
    }


}
