package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ExcelDataTransfer {

    static final String path = "src/test/test_data/dragon/inforceSheets/";

    public static void transferData(
            String inforceSheetWorkbookName,
            String inforceSheetSheetName,
            String templateWorkbookName,
            String targetWorkbookName,
            String targetSheetName,
            String propertiesFilePath,
            int... specificRows) throws Exception {

        copyFile(path + templateWorkbookName + ".xlsx", path + targetWorkbookName + ".xlsx");

        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(path + propertiesFilePath + ".properties")) {
            prop.load(input);
        }

        Workbook sourceWorkbook = new XSSFWorkbook(path + inforceSheetWorkbookName + ".xlsx");
        Workbook targetWorkbook = new XSSFWorkbook(path + targetWorkbookName + ".xlsx");

        Sheet sourceSheet = sourceWorkbook.getSheet(inforceSheetSheetName);
        Sheet targetSheet = targetWorkbook.getSheet(targetSheetName);

        Map<String, Integer> templateHeaderCache = new HashMap<>();

        for (int rowNum : specificRows) {
            Row sourceRow = sourceSheet.getRow(rowNum);
            if (sourceRow == null) continue;

            Row targetRow = targetSheet.createRow(targetSheet.getLastRowNum() + 1);

            int count = 0;
            for (Cell sourceCell : sourceRow) {
                String sourceHeader = sourceSheet.getRow(0).getCell(sourceCell.getColumnIndex()).getStringCellValue();
                String targetHeader = prop.getProperty(sourceHeader);

                if (targetHeader != null) {
                    int targetColumnIndex = findColumnIndexByHeader(targetSheet, targetHeader, templateHeaderCache);
                    if (targetColumnIndex != -1) {
                        Cell targetCell = targetRow.createCell(targetColumnIndex);
                        copyCellValue(sourceCell, targetCell);
                    }
                }
                count++;
                if (count == 30)
                    break;
            }
        }
    }

    private static int findColumnIndexByHeader(Sheet sheet, String header, Map<String, Integer> headerCache) {
        if (headerCache.containsKey(header)) {
            return headerCache.get(header);
        }

        Row firstRow = sheet.getRow(0);
        for (Cell cell : firstRow) {
            headerCache.put(cell.getStringCellValue(), cell.getColumnIndex());
            if (cell.getStringCellValue().equals(header)) {
                return cell.getColumnIndex();
            }
        }
        return -1;
    }

    private static void copyCellValue(Cell source, Cell destination) {
        destination.setCellValue(source.getStringCellValue());
    }

    public static void copyFile(String sourceFilePath, String newFileName) throws IOException {
        File sourceFile = new File(sourceFilePath);
        File destFile = new File(newFileName);

        if (!sourceFile.exists()) {
            throw new IOException("Source file does not exist: " + sourceFilePath);
        }

        if (destFile.exists()) {
            throw new IOException("Destination file already exists: " + newFileName);
        }

        try (FileChannel sourceChannel = new FileInputStream(sourceFile).getChannel();
             FileChannel destChannel = new FileOutputStream(destFile).getChannel()) {

            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }
    }

}