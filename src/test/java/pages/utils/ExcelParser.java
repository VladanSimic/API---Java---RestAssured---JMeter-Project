package pages.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class TestCase {
    String id;
    String title;
    List<Step> steps = new ArrayList<>();
    String expectedResult;
    String status;
    String automationStatus;
    String comments;
    String defectId;

    @Override
    public String toString() {
        return "TestCase{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", steps=" + steps +
                ", expectedResult='" + expectedResult + '\'' +
                ", status='" + status + '\'' +
                ", automationStatus='" + automationStatus + '\'' +
                ", comments='" + comments + '\'' +
                ", defectId='" + defectId + '\'' +
                '}';
    }
}

public class ExcelParser {
    public static void main(String[] args) {
        String filePath = "src/test/test_data/Dragon_Full_Regression_Automation_Scenarios_PARSER_v17.xlsx";  // Update with your actual file path

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            List<String[]> csvRows = new ArrayList<>();


            // Iterate through sheets
            for (Sheet sheet : workbook) {
                csvRows.add(new String[] {
                    "Object Type", "Owner", "Work Product", "Pre Conditions", "Test Folder", "Description", "Type", "Unique ID", "Priority", "Name", "Test Case", "Step Index", "Input", "Expected Result"
            });
//            Sheet sheet = workbook.getSheetAt(3);
                System.out.println("\nProcessing Sheet: " + sheet.getSheetName());

                List<TestCase> testCases = parseSheet(sheet);

                int tcCounter = 1;
                // Print extracted test cases
                for (TestCase testCase : testCases) {
//                    System.out.println(tc.id);
                    csvRows.add(new String[] {
                            "Test Case",
                            "dkuluglija@pureinsurance.com",
                            "",
                            "",
                            "TF2117",
                            testCase.title,
                            "Regression",         // Or any other static type
                            String.valueOf(tcCounter),
                            "P1",
                            testCase.title,
                            "", "", "", ""
                    });

                    int stepIndex = 1;
                    for (Step step : testCase.steps) {
                        csvRows.add(new String[] {
                                "Test Case Step",
                                "",                 // Owner
                                "",                 // Work Product
                                "",                 // Pre Conditions
                                "",                 // Test Folder
                                "",                // Description - title
                                "",                // Type
                                "",                 // Unique ID
                                "",                 // Priority
                                "",                 // Name
                                String.valueOf(tcCounter),
                                String.valueOf(stepIndex),
                                step.description,
                                step.expectedResult
                        });
                        stepIndex++;
                    }

                    tcCounter++;
                }

                try (PrintWriter writer = new PrintWriter(new FileWriter("results/tcs/" + sheet.getSheetName() + ".csv"))) {
                    for (String[] row : csvRows) {
                        String csvLine = Arrays.stream(row)
                                .map(field -> "\"" + field.replace("\"", "\"\"") + "\"") // Escape quotes
                                .collect(Collectors.joining(","));
                        writer.println(csvLine);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                csvRows = new ArrayList<>();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<TestCase> parseSheet(Sheet sheet) {
        List<TestCase> testCases = new ArrayList<>();
        TestCase currentTestCase = null;
        int lastTestCaseRow = -1;
        String currentTestCaseTitle = null;

        String status = "";
        String automationStatus = "";
        String comments = "";
        String defectId = "";

        for (Row row : sheet) {
            String firstCellValue = getCellValue(row.getCell(0)).trim();

            // New test case
            if (firstCellValue.startsWith("Test Case #")) {
                if (currentTestCase != null) {
                    testCases.add(currentTestCase);
                }
                currentTestCase = new TestCase();
                currentTestCase.steps = new ArrayList<>(); // Initialize step list

                String rawTitle = getCellValue(row.getCell(0));
                String[] lines = rawTitle.split("\\r?\\n"); // Split by new line
                currentTestCase.id = lines[0].trim(); // "Test Case # 1"
                currentTestCase.title = (lines.length > 1) ? lines[1].trim() : "";

                currentTestCaseTitle = firstCellValue;
                lastTestCaseRow = row.getRowNum();

                // Static values
                status = getMergedCellValue(sheet, row.getRowNum(), 4);
                automationStatus = getMergedCellValue(sheet, row.getRowNum(), 5);
                comments = getMergedCellValue(sheet, row.getRowNum(), 6);
                defectId = getMergedCellValue(sheet, row.getRowNum(), 7);
            }

            if (currentTestCase != null) {
                String stepIndex = getCellValue(row.getCell(1)).trim();

                if (!stepIndex.isEmpty() && isNumeric(stepIndex)) {
                    String stepDesc = getCellValue(row.getCell(2));

                    // 🧠 Try to get expected result from column 3 (if merged or direct)
                    CellRangeAddress mergedRange = getMergedRange(sheet, row.getRowNum(), 3);
                    String expectedResult = "";

                    if (mergedRange != null) {
                        // Only assign expected result if current row is the last row of the merged range
                        if (mergedRange.getLastRow() == row.getRowNum()) {
                            expectedResult = getCellValue(sheet.getRow(mergedRange.getFirstRow()).getCell(3));
                        }
                    } else {
                        expectedResult = getCellValue(row.getCell(3)); // Normal cell (not merged)
                    }

                    if (expectedResult.isEmpty()) {
                        expectedResult = ""; // fallback (could be null if needed)
                    }

                    Step step = new Step(stepDesc, expectedResult);
                    currentTestCase.steps.add(step);

                    // These apply to the whole test case
                    currentTestCase.status = status;
                    currentTestCase.automationStatus = automationStatus;
                    currentTestCase.comments = comments;
                    currentTestCase.defectId = defectId;
                }
            }
        }

        if (currentTestCase != null) {
            testCases.add(currentTestCase);
        }

        return testCases;
    }

    private static String getMergedCellValue(Sheet sheet, int row, int col) {
        for (int i = 0; i < sheet.getNumMergedRegions(); i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            if (range.isInRange(row, col)) { // Check if cell is within a merged range
                Row mergedRow = sheet.getRow(range.getFirstRow());
                Cell mergedCell = mergedRow.getCell(col);
                return getCellValue(mergedCell);
            }
        }
        return getCellValue(sheet.getRow(row).getCell(col)); // Return normal cell value if not merged
    }


    private static CellRangeAddress getMergedRange(Sheet sheet, int row, int col) {
        for (int i = 0; i < sheet.getNumMergedRegions(); i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            if (range.isInRange(row, col)) {
                return range;
            }
        }
        return null;
    }

    public static String getCellValue(Cell cell) {
        if (cell == null) return "";

        CellType cellType = CellType.forInt(cell.getCellType());

        // Ensure formula cells are evaluated
        if (cellType == CellType.FORMULA) {
            FormulaEvaluator evaluator = cell.getSheet().getWorkbook().getCreationHelper().createFormulaEvaluator();
            cellType = CellType.forInt(evaluator.evaluateFormulaCell(cell)); // Get the evaluated type
        }

        switch (cellType) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString(); // Convert date values properly
                }
                return String.valueOf((int) cell.getNumericCellValue()); // Convert numbers to int
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

class Step {
    String description;
    String expectedResult;

    public Step(String description, String expectedResult) {
        this.description = description;
        this.expectedResult = expectedResult;
    }
}
