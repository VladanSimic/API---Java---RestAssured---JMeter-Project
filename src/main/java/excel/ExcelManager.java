package excel;

import io.qameta.allure.Allure;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static java.sql.Types.BOOLEAN;
import static java.sql.Types.NUMERIC;

import static net.sourceforge.htmlunit.corejs.javascript.Token.STRING;

public class ExcelManager {

    private static final Random random = new Random();
    private static final Object lock = new Object();

    public Map<String, String> getRowData(String file, String sheetName, String row) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rowNum = Integer.parseInt(row);
        int lastColumnNum = sheet.getRow(1).getLastCellNum();

        Map<String, String> data = new HashMap<>();

        for (int i = 0; i < lastColumnNum; i++) {
            String key;
            String value;
            try {
                key = sheet.getRow(1).getCell(i).getStringCellValue().trim();
            } catch (Exception e) {
                try {
                    key = String.valueOf(sheet.getRow(1).getCell(i).getNumericCellValue()).replace(".0", "");
                } catch (Exception ex) {
                    key = null;
                }
            }

            value = getStringCellValue(sheet, rowNum, i);

            data.put(key, value);
        }

        return data;
    }

    public Map<String, String> getRowDataByCellValue(String file, String sheetName, String referralID) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int lastRowNum = sheet.getLastRowNum();

        Map<String, String> data = new HashMap<>();

        for (int i = 1; i <= lastRowNum; i++) {
            Row row = sheet.getRow(i);

            String key = row.getCell(0).getStringCellValue().trim();

            if (key.equals(referralID)) {
                data.put("RULE_ID", row.getCell(0).getStringCellValue().trim());
                data.put("PD_PRODUCT_NAME", row.getCell(1).getStringCellValue().trim());
                data.put("PC_COVERAGE_RULE_DESC", row.getCell(2).getStringCellValue().trim());
                break;
            }
        }

        return data;
    }

    public List<Map<String, String>> getRowsDataByCellValue(String file, String sheetName, String policyID, String dataType) throws IOException {
        List<Map<String, String>> rowsData = new ArrayList<>();

        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int lastRowNum = sheet.getLastRowNum();

        for (int i = 2; i <= lastRowNum; i++) {
            Row row = sheet.getRow(i);

            if (dataType.equalsIgnoreCase("claim")) {
                String key = row.getCell(0).getStringCellValue().trim();

                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Previous_Loss_Details_Source", "PURE");
                    data.put("Previous_Loss_Details_Amount_Paid", getStringCellValue(sheet, i - 1, 6));
                    data.put("Previous_Loss_Details_Loss_Type", getStringCellValue(sheet, i - 1, 7));
                    data.put("Previous_Loss_Details_Loss_Date", getStringCellValue(sheet, i - 1, 8));
                    data.put("Previous_Loss_Details_Claim_Closed", getStringCellValue(sheet, i - 1, 10));
                    if (getStringCellValue(sheet, i - 1, 12).equals("1") || getStringCellValue(sheet, i - 1, 12).equals("Yes")) {
                        data.put("Previous_Loss_Details_CAT_Loss", "Yes");
                    } else if (getStringCellValue(sheet, i - 1, 12).equals("0") || getStringCellValue(sheet, i - 1, 12).equalsIgnoreCase("No")) {
                        data.put("Previous_Loss_Details_CAT_Loss", "No");
                    }
                    rowsData.add(data);
                }
            } else if (dataType.equalsIgnoreCase("adjustment")) {
                String key = row.getCell(12).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    if (!getStringCellValue(sheet, i - 1, 24).equalsIgnoreCase("NULL")) {
                        data.put("Manuscript_Endorsements_Type", getStringCellValue(sheet, i - 1, 21));
                        data.put("Manuscript_Endorsements_Title", getStringCellValue(sheet, i - 1, 23) + "_" + i);
                        data.put("Manuscript_Endorsements_Annual_Manual_Premium", getStringCellValue(sheet, i - 1, 24));
                        data.put("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale", "Details");
                        rowsData.add(data);
                        //Edit rowNum for each LOB
                    }
                }
            }
            //PA
            else if (dataType.equalsIgnoreCase("operators")) {
                String key = row.getCell(0).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Additional_Operators_Additional_Driver_First_Name", getStringCellValue(sheet, i - 1, 12));
                    data.put("Driver_Details_Additional_Driver_MI", getStringCellValue(sheet, i - 1, 13));
                    data.put("Additional_Operators_Additional_Driver_Last_Name", getStringCellValue(sheet, i - 1, 14));
                    data.put("Additional_Operators_Additional_Driver_Date_Of_Birth", getStringCellValue(sheet, i - 1, 16));
                    data.put("Additional_Operators_Additional_Driver_Driver_Status", getStringCellValue(sheet, i - 1, 19));
                    data.put("Additional_Operators_Additional_Driver_Relationship_To_Insured", getStringCellValue(sheet, i - 1, 15));
                    data.put("Driver_Details_Additional_Driver_License_Status", getStringCellValue(sheet, i - 1, 20));
                    data.put("Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico", getStringCellValue(sheet, i - 1, 26));
                    data.put("Additional_Operators_Additional_Driver_Gender", "Male");
                    data.put("Additional_Operators_Additional_Driver_License_State", "NC");
                    data.put("Driver_Details_Additional_Driver_Marital_Status", "Married");
                    data.put("Driver_Details_Additional_Driver_How_Long_Have_You_Been_Licensed_In_The_US", "3 or More Yrs");
                    data.put("Driver_Details_Additional_Driver_Highest_Level_Education_Completed", "Bachelors");
                    data.put("Driver_Details_Additional_Driver_SR_22_Certificate_Of_Insurance_Required", "Yes");
                    data.put("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year", "No");
                    data.put("Driver_Details_Additional_Driver_Active_Military_Personnel", "No");
                    data.put("Driver_Details_Additional_Driver_Full_Time_Student", "Yes");
                    data.put("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State", "No");
                    data.put("Additional_Operators_Additional_Driver_Non_Driver_Reason", "Unlicensed");
                    data.put("Driver_ID", getStringCellValue(sheet, i - 1, 9));
                    rowsData.add(data);
                }
            } else if (dataType.equalsIgnoreCase("incidents")) {
                String key = row.getCell(3).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Incidents_Source", getStringCellValue(sheet, i - 1, 17));
                    data.put("Incidents_Accident_Or_Violation_Within_Last_5_Years", getStringCellValue(sheet, i - 1, 18));
                    data.put("Incidents_Acc_Or_Conviction_Date", getStringCellValue(sheet, i - 1, 19));
                    data.put("First_Name", getStringCellValue(sheet, i - 1, 13));
                    data.put("Last_Name", getStringCellValue(sheet, i - 1, 14));
                    data.put("Policy_Term_Number_Txt", getStringCellValue(sheet, i - 1, 3));
                    rowsData.add(data);
                }
            } else if (dataType.equalsIgnoreCase("additionalVehicles")) {
                String key = row.getCell(0).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Vehicle_Details_VIN_Override", "Yes");
                    data.put("Vehicle_Details_VIN_Number", getStringCellValue(sheet, i - 1, 11));
                    data.put("Vehicle_Details_Vehicle_Type", getStringCellValue(sheet, i - 1, 46));
                    data.put("Vehicle_Details_Garaging_Zip_Code", getStringCellValue(sheet, i - 1, 19));
                    data.put("Vehicle_Details_Year", getStringCellValue(sheet, i - 1, 23));
                    data.put("Vehicle_Details_Make", getStringCellValue(sheet, i - 1, 21));
                    data.put("Vehicle_Details_Model", getStringCellValue(sheet, i - 1, 22));
                    data.put("Vehicle_Details_Mileage_Band_Year", "0 - 3,000");
                    data.put("Vehicle_Details_Agreed_Value_Current_Term", getStringCellValue(sheet, i - 1, 25));
                    data.put("Vehicle_Details_Temporary_Override", "Yes");
                    data.put("Vehicle_Details_Stated_Amount", getStringCellValue(sheet, i - 1, 48));
                    data.put("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured", getStringCellValue(sheet, i - 1, 49));
                    data.put("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment", getStringCellValue(sheet, i - 1, 29));
                    data.put("Vehicle_Details_Estimated_Annual_Mileage", getStringCellValue(sheet, i - 1, 55));
                    data.put("Vehicle_Details_Vehicle_Use", getStringCellValue(sheet, i - 1, 33));
                    data.put("Vehicle_Details_Discounts_ABS", getStringCellValue(sheet, i - 1, 69));
                    data.put("Vehicle_Details_Discounts_Airbag", getStringCellValue(sheet, i - 1, 45));
                    data.put("Vehicle_Details_Discounts_Passive_Restraint", getStringCellValue(sheet, i - 1, 67));
                    data.put("Vehicle_Details_Anti_Theft_Types_VIN_Etching", getStringCellValue(sheet, i - 1, 70));
                    data.put("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery", getStringCellValue(sheet, i - 1, 68));
                    data.put("Vehicle_Details_Anti_Theft_Types_Disabling_Device", getStringCellValue(sheet, i - 1, 66));
                    data.put("Vehicle_Details_Anti_Theft_Types_Disabling_Status", getStringCellValue(sheet, i - 1, 67));
                    data.put("Ownership_Ownership", getStringCellValue(sheet, i - 1, 53));
                    data.put("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle", "No");
                    data.put("Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of", "Driver");
                    data.put("Optional_For_Quote_Required_To_Bind_Additional_Name_On_The_ID_Card", "Driver");
                    data.put("Symbols_Liability_Symbol", getStringCellValue(sheet, i - 1, 51));
                    data.put("Symbols_PIP_MP_Symbol", getStringCellValue(sheet, i - 1, 52));
                    data.put("Symbols_OTC_Symbol", getStringCellValue(sheet, i - 1, 31));
                    data.put("Symbols_COLL_Symbol", getStringCellValue(sheet, i - 1, 32));
                    data.put("Vehicles_OTC_Deductible", getStringCellValue(sheet, i - 1, 42));
                    data.put("Vehicles_COLL_Deductible", getStringCellValue(sheet, i - 1, 43));
                    data.put("Vehicle_Details_MSRP_Override", getStringCellValue(sheet, i - 1, 27));
                    data.put("Vehicle_Details_Is_This_Vehicle_Registered_In", "Yes");
                    data.put("Vehicle_Details_Driven_By", getStringCellValue(sheet, i - 1, 13));
                    data.put("Vehicle_Details_Cost_New", getStringCellValue(sheet, i - 1, 47));
                    data.put("Vehicle_Details_Engine_Size", getStringCellValue(sheet, i - 1, 50));
                    data.put("Driver_Assignment_Driver_Name", getStringCellValue(sheet, i - 1, 13));
                    data.put("Driver_Assignment_Vehicle", getStringCellValue(sheet, i - 1, 10));
                    data.put("Vehicle_Details_Was_The_Vehicle_Purchased_New", "No");
                    data.put("Driver_ID", getStringCellValue(sheet, i - 1, 12));
                    data.put("Driver_Details_Accident_Prevention_Training_Course_Completed", getStringCellValue(sheet, i - 1, 60));
                    data.put("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years", getStringCellValue(sheet, i - 1, 59));
                    data.put("Select_Coverage_PURE_Enhancement_Endorsement", getStringCellValue(sheet, i - 1, 89));
                    data.put("Driver_Details_Grade_Average_B", getStringCellValue(sheet, i - 1, 61));
                    data.put("Final_BI_Premium", getStringCellValue(sheet, i - 1, 110));
                    data.put("Final_PD_Premium", getStringCellValue(sheet, i - 1, 111));
                    data.put("Final_MP_Premium", getStringCellValue(sheet, i - 1, 112));
                    data.put("Final_UM/UIM_Premium", getStringCellValue(sheet, i - 1, 113));
                    data.put("Final_OMP_Premium", getStringCellValue(sheet, i - 1, 114));
                    data.put("Final_COLL_Premium", getStringCellValue(sheet, i - 1, 115));
                    data.put("Policy_Term_Number_Txt", getStringCellValue(sheet, i - 1, 0));
                    rowsData.add(data);
                }
            }
            //ES
            else if (dataType.equalsIgnoreCase("driversES")) {
                String key = row.getCell(4).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Policy_Term_Number_Txt", getStringCellValue(sheet, i - 1, 4));
                    String prefix = Objects.equals(getStringCellValue(sheet, i - 1, 14), "NULL") ? "" : getStringCellValue(sheet, i - 1, 14);
                    data.put("Additional_Operator_Prefix", prefix);
                    data.put("Additional_Operator_FirstName", getStringCellValue(sheet, i - 1, 15));
                    String mi = Objects.equals(getStringCellValue(sheet, i - 1, 16), "NULL") ? "" : getStringCellValue(sheet, i - 1, 16);
                    data.put("Additional_Operator_MI", mi);
                    data.put("Additional_Operator_LastName", getStringCellValue(sheet, i - 1, 17));
                    String suffix = Objects.equals(getStringCellValue(sheet, i - 1, 18), "NULL") ? "" : getStringCellValue(sheet, i - 1, 18);
                    data.put("Additional_Operator_Suffix", suffix);
                    data.put("Additional_Operator_Gender", getStringCellValue(sheet, i - 1, 27));
                    data.put("Additional_Operator_License_Number", getStringCellValue(sheet, i - 1, 20));
                    data.put("Additional_Operator_License_State", getStringCellValue(sheet, i - 1, 21));
                    data.put("Additional_Operator_DOB", getStringCellValue(sheet, i - 1, 22));
                    data.put("Additional_Operator_Relationship_To_Insured", getStringCellValue(sheet, i - 1, 23));
                    String excluded = Objects.equals(getStringCellValue(sheet, i - 1, 19), "NULL") ? "" : getStringCellValue(sheet, i - 1, 19);
                    data.put("Additional_Operator_Exclude", excluded);
                    rowsData.add(data);
                }
            } else if (dataType.equalsIgnoreCase("incidentsES")) {
                String key = row.getCell(4).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Policy_Term_Number_Txt", getStringCellValue(sheet, i - 1, 4));
                    data.put("Incident_Source", getStringCellValue(sheet, i - 1, 22));
                    data.put("Incident_Accident_Or_Violation", getStringCellValue(sheet, i - 1, 23));
                    data.put("Incident_Accident_Or_Conviction_Date", getStringCellValue(sheet, i - 1, 20));
                    String prefix = Objects.equals(getStringCellValue(sheet, i - 1, 14), "NULL") ? "" : getStringCellValue(sheet, i - 1, 14);
                    String firstName = getStringCellValue(sheet, i - 1, 15);
                    String miName = Objects.equals(getStringCellValue(sheet, i - 1, 16), "NULL") ? "" : getStringCellValue(sheet, i - 1, 16);
                    String lastName = getStringCellValue(sheet, i - 1, 17);
                    String suffix = Objects.equals(getStringCellValue(sheet, i - 1, 18), "NULL") ? "" : getStringCellValue(sheet, i - 1, 18);
                    String fullName = prefix + " " + firstName + " " + miName + " " + lastName + " " + suffix;
                    data.put("Incident_Driver", fullName.trim().replace("  "," "));
                    rowsData.add(data);
                }
            } else if (dataType.equalsIgnoreCase("watercraftES")) {
                String key = row.getCell(4).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Policy_Term_Number_Txt", getStringCellValue(sheet, i - 1, 4));
                    data.put("Watercraft_Make", getStringCellValue(sheet, i - 1, 14));
                    data.put("Watercraft_Model", getStringCellValue(sheet, i - 1, 15));
                    data.put("Watercraft_Hull_Value", getStringCellValue(sheet, i - 1, 18));
                    data.put("Watercraft_Length", getStringCellValue(sheet, i - 1, 16));
                    data.put("Watercraft_Horsepower", getStringCellValue(sheet, i - 1, 17));
                    rowsData.add(data);
                }
            } else if (dataType.equalsIgnoreCase("propertiesES")) {
                String key = row.getCell(4).getStringCellValue().trim();
                if (key.equals(policyID)) {
                    Map<String, String> data = new HashMap<>();
                    data.put("Policy_Term_Number_Txt", getStringCellValue(sheet, i - 1, 4));
                    data.put("Additional_Property_Address_Line_1", getStringCellValue(sheet, i - 1, 26));
                    data.put("Additional_Property_City", getStringCellValue(sheet, i - 1, 28));
                    data.put("Additional_Property_State", getStringCellValue(sheet, i - 1, 29));
                    data.put("Additional_Property_Zip_Code", getStringCellValue(sheet, i - 1, 30));
                    data.put("Additional_Property_Swimming_Pool", getStringCellValue(sheet, i - 1, 24));
                    data.put("Additional_Property_Usage", getStringCellValue(sheet, i - 1, 14));
                    data.put("Additional_Property_Dwelling", getStringCellValue(sheet, i - 1, 23));
                    data.put("Additional_Property_Is_Residence_Rented", getStringCellValue(sheet, i - 1, 15));
                    String howManyWeeksPerYear = Objects.equals(getStringCellValue(sheet, i - 1, 17), "NULL") ? "" : getStringCellValue(sheet, i - 1, 17);
                    data.put("Additional_Property_Information_How_Many_Weeks_Per_Year_Is_The_Property_Rented", howManyWeeksPerYear);
                    String whatIsTheMinimumNightStay = Objects.equals(getStringCellValue(sheet, i - 1, 16), "NULL") ? "" : getStringCellValue(sheet, i - 1, 16);
                    data.put("Additional_Property_Information_What_Is_The_Minimum_Night_Stay", whatIsTheMinimumNightStay);
                    rowsData.add(data);
                }
            }
        }
        return rowsData;
    }

    public String getStringCellValue(Sheet sheet, int rowNum, int i) {
        String value = "";
        try {
            Cell cell = sheet.getRow((rowNum + 1)).getCell(i);
            if (cell.getCellType() == 0 && DateUtil.isCellDateFormatted(cell)) {
                value = sheet.getRow((rowNum + 1)).getCell(i).getDateCellValue().toString();

                SimpleDateFormat excelDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                SimpleDateFormat targetDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date parsedDate = excelDateFormat.parse(value);

                value = targetDateFormat.format(parsedDate);
            } else {
                value = sheet.getRow((rowNum + 1)).getCell(i).getStringCellValue();
            }

        } catch (Exception ee) {
            try {
                value = sheet.getRow((rowNum + 1)).getCell(i).getStringCellValue().trim();
            } catch (Exception e) {
                try {
                    value = String.valueOf(sheet.getRow((rowNum + 1)).getCell(i).getNumericCellValue()).replace(".0", "");
                } catch (Exception ex) {
                    value = null;
                }
            }
        }
        return value;
    }

    public Map<String, String> getRowDataByID(String file, String sheetName, String id, String dataNum,
                                              boolean suffix) throws IOException {
        FileInputStream fis = new FileInputStream(file + ".xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int lastColumnNum = sheet.getRow(1).getLastCellNum();
        int lastRowNum = sheet.getLastRowNum();

        Map<String, String> data = new HashMap<>();
        int idMatches = 0;

        for (int i = 0; i <= lastRowNum; i++) {
            if (sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(id)) {
                idMatches += 1;
                if (idMatches > 1) {
                    break;
                }
                for (int j = 0; j < lastColumnNum; j++) {
                    String key;
                    String value;
                    try {
                        key = sheet.getRow(1).getCell(j).getStringCellValue().trim();
                    } catch (Exception e) {
                        try {
                            key = String.valueOf(sheet.getRow(1).getCell(j).getNumericCellValue()).replace(".0", "");
                        } catch (Exception ex) {
                            key = null;
                        }
                    }
                    try {
                        value = sheet.getRow((i)).getCell(j).getStringCellValue().trim();
                    } catch (Exception e) {
                        try {
                            value = String.valueOf(sheet.getRow((i)).getCell(j).getNumericCellValue()).replace(".0", "");
                        } catch (Exception ex) {
                            value = null;
                        }
                    }

                    if (suffix) {
                        data.put(key + "_" + dataNum, value);
                    } else {
                        data.put(key, value);
                    }
                }
            }
        }

        return data;
    }

    public Map<String, String> mergeData(Map<String, String> data, String key, String file, String sheet) throws
            IOException {
        if (hasValue(data.get(key))) {
            String[] dataIDs = data.get(key).split(",");
            for (int i = 0; i < dataIDs.length; i++) {
                data.putAll(new ExcelManager().getRowDataByID(file, sheet, dataIDs[i], String.valueOf(i + 1), true));
            }
        }
        return data;
    }

    public Map<String, String> getData(String LOB, String file, String sheet, String TC_ID) throws IOException {
        Map<String, String> data = new HashMap<>();
        switch (LOB) {
            case "PA": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                //New Business
                data.putAll(mergeData(data, "Legal_Entity_Locations", file, "PA_LegalEntityLocations"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "PA_PrincipalBeneficialOwners"));
                data.putAll(mergeData(data, "Legal_Entities", file, "PA_LegalEntities"));
                data.putAll(mergeData(data, "Driver_Incidents", file, "PA_DriverIncidents"));
                data.putAll(mergeData(data, "Additional_Operators", file, "PA_AdditionalOperators"));
                for (int i = 1; i <= data.get("Additional_Operators").split(",").length; i++) {
                    data.putAll(mergeData(data, "Additional_Operator_Incidents_" + i, file, "PA_AdditionalOperIncidents", i));
                }
                data.putAll(mergeData(data, "Additional_Vehicles", file, "PA_AdditionalVehicles"));
                for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
                    data.putAll(mergeData(data, "Vehicle_Details_Loss_Payee_" + i, file, "PA_LossPayee", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements", file, "PA_ManuscriptEndorsements"));
                data.putAll(mergeData(data, "Applications_Applications", file, "PA_Applications"));
                data.putAll(mergeData(data, "Manual_Subjectivities", file, "PA_Subjectivities"));

                //Endorsement
                data.putAll(mergeData(data, "Legal_Entity_Locations_END", file, "PA_LegalEntityLocations_END"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_END", file, "PA_PrincipalBeneficialOwner_END"));
                data.putAll(mergeData(data, "Legal_Entities_END", file, "PA_LegalEntities_END"));
                data.putAll(mergeData(data, "Driver_Incidents_END", file, "PA_DriverIncidents_END"));
                data.putAll(mergeData(data, "Additional_Operators_END", file, "PA_AdditionalOperators_END"));
                for (int i = 1; i <= data.get("Additional_Operators_END").split(",").length; i++) {
                    data.putAll(mergeData(data, "Additional_Operator_Incidents_END_" + i, file, "PA_AdditionalOperIncidents_END", i));
                }
                data.putAll(mergeData(data, "Additional_Vehicles_END", file, "PA_AdditionalVehicles_END"));
                for (int i = 1; i <= data.get("Additional_Vehicles_END").split(",").length; i++) {
                    data.putAll(mergeData(data, "Vehicle_Details_Loss_Payee_END_" + i, file, "PA_LossPayee_END", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements_END", file, "PA_ManuscriptEndorsements_END"));
                data.putAll(mergeData(data, "Applications_Applications_END", file, "PA_Applications_END"));
                data.putAll(mergeData(data, "Manual_Subjectivities_END", file, "PA_Subjectivities_END"));

                //OOS Endorsement
                data.putAll(mergeData(data, "Legal_Entity_Locations_OOS_END", file, "PA_LegalEntityLocations_OOS"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_OOS_END", file, "PA_PrincipalBeneficialOwner_OOS"));
                data.putAll(mergeData(data, "Legal_Entities_OOS_END", file, "PA_LegalEntities_OOS"));
                data.putAll(mergeData(data, "Driver_Incidents_OOS_END", file, "PA_DriverIncidents_OOS"));
                data.putAll(mergeData(data, "Additional_Operators_OOS_END", file, "PA_AdditionalOperators_OOS"));
                for (int i = 1; i <= data.get("Additional_Operators_OOS_END").split(",").length; i++) {
                    data.putAll(mergeData(data, "Additional_Operator_Incidents_OOS_END_" + i, file, "PA_AdditionalOperIncidents_OOS", i));
                }
                data.putAll(mergeData(data, "Additional_Vehicles_OOS_END", file, "PA_AdditionalVehicles_OOS"));
                for (int i = 1; i <= data.get("Additional_Vehicles_OOS_END").split(",").length; i++) {
                    data.putAll(mergeData(data, "Vehicle_Details_Loss_Payee_OOS_END_" + i, file, "PA_LossPayee_OOS", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements_OOS_END", file, "PA_ManuscriptEndorsements_OOS"));
                data.putAll(mergeData(data, "Applications_Applications_OOS_END", file, "PA_Applications_OOS"));
                data.putAll(mergeData(data, "Manual_Subjectivities_OOS_END", file, "PA_Subjectivities_OOS"));

                //Renewal
                data.putAll(mergeData(data, "Legal_Entity_Locations_RNW", file, "PA_LegalEntityLocations_RNW"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_RNW", file, "PA_PrincipalBeneficialOwner_RNW"));
                data.putAll(mergeData(data, "Legal_Entities_RNW", file, "PA_LegalEntities_RNW"));
                data.putAll(mergeData(data, "Driver_Incidents_RNW", file, "PA_DriverIncidents_RNW"));
                data.putAll(mergeData(data, "Additional_Operators_RNW", file, "PA_AdditionalOperators_RNW"));
                for (int i = 1; i <= data.get("Additional_Operators_RNW").split(",").length; i++) {
                    data.putAll(mergeData(data, "Additional_Operator_Incidents_RNW_" + i, file, "PA_AdditionalOperIncidents_RNW", i));
                }
                data.putAll(mergeData(data, "Additional_Vehicles_RNW", file, "PA_AdditionalVehicles_RNW"));
                for (int i = 1; i <= data.get("Additional_Vehicles_RNW").split(",").length; i++) {
                    data.putAll(mergeData(data, "Vehicle_Details_Loss_Payee_RNW_" + i, file, "PA_LossPayee_RNW", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements_RNW", file, "PA_ManuscriptEndorsements_RNW"));
                data.putAll(mergeData(data, "Applications_Applications_RNW", file, "PA_Applications_RNW"));
                data.putAll(mergeData(data, "Manual_Subjectivities_RNW", file, "PA_Subjectivities_RNW"));
            }
            break;
            case "PW": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                data.putAll(mergeData(data, "Household_Entity_Locations", file, "PW_Household_Entity_Location"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "PW_Principal_Beneficial_Owners"));
                data.putAll(mergeData(data, "Loss_Payee", file, "PW_LossPayee"));
                for (int i = 1; i <= data.get("Loss_Payee").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "PW_Household_Entity_Location", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "PW_Principal_Beneficial_Owners", i));
                }
                data.putAll(mergeData(data, "List_Of_Operators", file, "PW_ListOf_Operators"));
            }
            break;
            case "HO": {
                //NB
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                data.putAll(mergeData(data, "Additional_Locations", file, "HO_AdditionalLocations"));
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured", file, "HO_Additional_Named_Insured"));
                data.putAll(mergeData(data, "Additional_Interests", file, "HO_Additional_Interests"));
                for (int i = 1; i <= data.get("Additional_Interests").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "HO_Household_Entity_Location", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "HO_Principal_Beneficial_Owners", i));
                }
                data.putAll(mergeData(data, "Household_Entity_Locations", file, "HO_Household_Entity_Location"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "HO_Principal_Beneficial_Owners"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses", file, "HO_Loss_History"));
                data.putAll(mergeData(data, "Manuscript_Endorsements", file, "HO_Manuscript_Endorsements"));
                data.putAll(mergeData(data, "Manual_Subjectivities", file, "HO_Manual_Subjectivities"));

                //END
                data.putAll(mergeData(data, "Additional_Locations_END", file, "HO_AdditionalLocations_END"));
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured_END", file, "HO_Additional_Named_Insured_END"));
                data.putAll(mergeData(data, "Additional_Interests_END", file, "HO_Additional_Interests_END"));
                for (int i = 1; i <= data.get("Additional_Interests_END").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_END_" + i, file, "HO_Household_Entity_Locatio_END", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_END_" + i, file, "HO_Principal_Beneficial_Own_END", i));
                }
                data.putAll(mergeData(data, "Household_Entity_Locations_END", file, "HO_Household_Entity_Locatio_END"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_END", file, "HO_Principal_Beneficial_Own_END"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses_END", file, "HO_Loss_History_END"));
                data.putAll(mergeData(data, "Manuscript_Endorsements_END", file, "HO_Manuscript_Endorsements_END"));
                data.putAll(mergeData(data, "Manual_Subjectivities_END", file, "HO_Manual_Subjectivities_END"));

                //OOS END
                data.putAll(mergeData(data, "Additional_Locations_OOS_END", file, "HO_AdditionalLocations_OOS"));
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured_OOS_END", file, "HO_Additional_Named_Insured_OOS"));
                data.putAll(mergeData(data, "Additional_Interests_OOS_END", file, "HO_Additional_Interests_OOS"));
                for (int i = 1; i <= data.get("Additional_Interests_OOS_END").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_OOS_END_" + i, file, "HO_Household_Entity_Locatio_OOS", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_OOS_END_" + i, file, "HO_Principal_Beneficial_Own_OOS", i));
                }
                data.putAll(mergeData(data, "Household_Entity_Locations_OOS_END", file, "HO_Household_Entity_Locatio_OOS"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_OOS_END", file, "HO_Principal_Beneficial_Own_OOS"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses_OOS_END", file, "HO_Loss_History_OOS"));
                data.putAll(mergeData(data, "Manuscript_Endorsements_OOS_END", file, "HO_Manuscript_Endorsements_OOS"));
                data.putAll(mergeData(data, "Manual_Subjectivities_OOS_END", file, "HO_Manual_Subjectivities_OOS"));

                //RNW
                data.putAll(mergeData(data, "Additional_Locations_RNW", file, "HO_AdditionalLocations_RNW"));
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured_RNW", file, "HO_Additional_Named_Insured_RNW"));
                data.putAll(mergeData(data, "Additional_Interests_RNW", file, "HO_Additional_Interests_RNW"));
                for (int i = 1; i <= data.get("Additional_Interests_RNW").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_RNW_" + i, file, "HO_Household_Entity_Locatio_RNW", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_RNW_" + i, file, "HO_Principal_Beneficial_Own_RNW", i));
                }
                data.putAll(mergeData(data, "Household_Entity_Locations_RNW", file, "HO_Household_Entity_Locatio_RNW"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_RNW", file, "HO_Principal_Beneficial_Own_RNW"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses_RNW", file, "HO_Loss_History_RNW"));
                data.putAll(mergeData(data, "Manuscript_Endorsements_RNW", file, "HO_Manuscript_Endorsements_RNW"));
                data.putAll(mergeData(data, "Manual_Subjectivities_RNW", file, "HO_Manual_Subjectivities_RNW"));
            }
            break;
            case "EX": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                data.putAll(mergeData(data, "Household_Entity_Locations", file, "EX_LegalEntityLocations"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "EX_BeneficialOwners"));
                data.putAll(mergeData(data, "Additional_Insured", file, "EX_Additional_Insured"));
                data.putAll(mergeData(data, "Additional_Watercraft", file, "EX_Watercraft"));
                for (int i = 1; i <= data.get("Additional_Insured").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "EX_LegalEntityLocations", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "EX_BeneficialOwners", i));
                    data.putAll(mergeData(data, "Specific_Automobile_" + i, file, "EX_SpecificAutomobile"));
                    data.putAll(mergeData(data, "Specific_Watercraft_" + i, file, "EX_SpecificWatercraft"));
                }
            }
            break;
            case "CO": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                data.putAll(mergeData(data, "Collections_Schedule_Collection_Items", file, "CO_Collections_Classes"));
                data.putAll(mergeData(data, "Household_Entity_Locations", file, "CO_LegalEntityLocations"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "CO_BeneficialOwners"));
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured", file, "CO_Additional_Named_Insured"));
                data.putAll(mergeData(data, "Additional_Insured", file, "CO_Additional_Insured"));
                data.putAll(mergeData(data, "Loss_Claim_History_Prior_Collection_Losses", file, "CO_Collections_Loss_History"));
                for (int i = 1; i <= data.get("Additional_Insured").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "CO_LegalEntityLocations", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "CO_BeneficialOwners", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements", file, "CO_ManuscriptEndorsements"));
                data.putAll(mergeData(data, "Manual_Subjectivities", file, "CO_Subjectivities"));
            }
            break;
            case "ES": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                data.putAll(mergeData(data, "Household_Entity_Locations", file, "ES_LegalEntityLocations"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "ES_BeneficialOwners"));data.putAll(mergeData(data, "Additional_Insured", file, "ES_Additional_Insured"));
                for (int i = 1; i <= data.get("Additional_Insured").split(",").length; i++) {
                   data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "ES_LegalEntityLocations", i));
                   data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "ES_BeneficialOwners", i));
               }
            }
            break;
            case "HS": {
                //NB
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured", file, "HS_Additional_Named_Insured"));
                data.putAll(mergeData(data, "Household_Entity_Locations", file, "HS_Household_Entity_Location"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "HS_Principal_Beneficial_Owners"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses", file, "HS_Loss_History"));
                data.putAll(mergeData(data, "Additional_Interests", file, "HS_Additional_Interests"));
                for (int i = 1; i <= data.get("Additional_Interests").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "HS_Household_Entity_Location", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "HS_Principal_Beneficial_Owners", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements", file, "HS_Manuscript_Endorsements"));
                data.putAll(mergeData(data, "Collections_Schedule_Collection_Items", file, "HS_Collections_Classes"));
                data.putAll(mergeData(data, "Loss_Claim_History_Prior_Collection_Losses", file, "HS_Collections_Loss_History"));
                data.putAll(mergeData(data, "Manual_Subjectivities", file, "HS_Manual_Subjectivities"));
                data.putAll(mergeData(data, "Policy_Information_Additional_Properties", file, "HS_Property_Information"));
                data.putAll(mergeData(data, "Optional_Coverages_Animal_Information", file, "HS_Animal_Information"));
                //END
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured_END", file, "HS_Additional_Named_Insured_END"));
                data.putAll(mergeData(data, "Household_Entity_Locations_END", file, "HS_Household_Entity_Loc_END"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_END", file, "HS_Principal_Beneficial_Own_END"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses_END", file, "HS_Loss_History_END"));
                data.putAll(mergeData(data, "Additional_Interests_END", file, "HS_Additional_Interests_END"));
                data.putAll(mergeData(data, "Manuscript_Endorsements_END", file, "HS_Manuscript_Endorsements_END"));
                data.putAll(mergeData(data, "Collections_Schedule_Collection_Items_END", file, "HS_Collections_Classes_END"));
                data.putAll(mergeData(data, "Loss_Claim_History_Prior_Collection_Losses_END", file, "HS_Collections_Loss_History_END"));
                data.putAll(mergeData(data, "Manual_Subjectivities_END", file, "HS_Manual_Subjectivities_END"));
                data.putAll(mergeData(data, "Policy_Information_Additional_Properties_END", file, "HS_Property_Information_END"));
                data.putAll(mergeData(data, "Optional_Coverages_Animal_Information_END", file, "HS_Animal_Information_END"));
                //OOS END
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured_OOS_END", file, "HS_Additional_Named_Insured_OOS"));
                data.putAll(mergeData(data, "Household_Entity_Locations_OOS_END", file, "HS_Household_Entity_Loc_OOS"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_OOS_END", file, "HS_Principal_Beneficial_Own_OOS"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses_OOS_END", file, "HS_Loss_History_OOS"));
                data.putAll(mergeData(data, "Additional_Interests_OOS_END", file, "HS_Additional_Interests_OOS"));
                data.putAll(mergeData(data, "Manuscript_Endorsements_OOS_END", file, "HS_Manuscript_Endorsement_OOS"));
                data.putAll(mergeData(data, "Collections_Schedule_Collection_Items_OOS_END", file, "HS_Collections_Classes_OOS"));
                data.putAll(mergeData(data, "Loss_Claim_History_Prior_Collection_Losses_OOS_END", file, "HS_Collections_Loss_History_OOS"));
                data.putAll(mergeData(data, "Manual_Subjectivities_OOS_END", file, "HS_Manual_Subjectivities_OOS"));
                data.putAll(mergeData(data, "Policy_Information_Additional_Properties_OOS_END", file, "HS_Property_Information_OOS_END"));
                data.putAll(mergeData(data, "Optional_Coverages_Animal_Information_OOS_END", file, "HS_Animal_Information_OOS"));
                //Renewal
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured_RNW", file, "HS_Additional_Named_Insured_RNW"));
                data.putAll(mergeData(data, "Household_Entity_Locations_RNW", file, "HS_Household_Entity_Loc_RNW"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_RNW", file, "HS_Principal_Beneficial_Own_RNW"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses_RNW", file, "HS_Loss_History_RNW"));
                data.putAll(mergeData(data, "Additional_Interests_RNW", file, "HS_Additional_Interests_RNW"));
                data.putAll(mergeData(data, "Manuscript_Endorsements_RNW", file, "HS_Manuscript_Endorsements_RNW"));
                data.putAll(mergeData(data, "Collections_Schedule_Collection_Items_RNW", file, "HS_Collections_Classes_RNW"));
                data.putAll(mergeData(data, "Loss_Claim_History_Prior_Collection_Losses_RNW", file, "HS_Collections_Loss_History_RNW"));
                data.putAll(mergeData(data, "Manual_Subjectivities_RNW", file, "HS_Manual_Subjectivities_RNW"));
                data.putAll(mergeData(data, "Policy_Information_Additional_Properties_RNW", file, "HS_Property_Information_RNW"));
                data.putAll(mergeData(data, "Optional_Coverages_Animal_Information_RNW", file, "HS_Animal_Information_RNW"));
            }
            break;
            case "CC": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                //New Business
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured", file, "CC_Additional_Named_Insured"));
                data.putAll(mergeData(data, "Household_Entity_Locations", file, "CC_Household_Entity_Location"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "CC_Principal_Beneficial_Owners"));
                data.putAll(mergeData(data, "General_Contractor_Prior_Loss_History", file, "CC_GC_Loss_History"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses", file, "CC_Loss_History"));
                data.putAll(mergeData(data, "Additional_Interests", file, "CC_Additional_Interests"));
                for (int i = 1; i <= data.get("Additional_Interests").split(",").length; i++) {
                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "CC_Household_Entity_Location", i));
                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "CC_Principal_Beneficial_Owners", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements", file, "CC_Manuscript_Endorsements"));
                data.putAll(mergeData(data, "Manual_Subjectivities", file, "CC_Manual_Subjectivities"));

                //Endorsement
                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured_END", file, "CC_Additional_Named_Insured"));
                data.putAll(mergeData(data, "Household_Entity_Locations_END", file, "CC_Household_Entity_Location"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners_END", file, "CC_Principal_Beneficial_Owners"));
                data.putAll(mergeData(data, "General_Contractor_Prior_Loss_History_END", file, "CC_GC_Loss_History"));
                data.putAll(mergeData(data, "Previous_Loss_Details_Losses_END", file, "CC_Loss_History"));
                data.putAll(mergeData(data, "Additional_Interests_END", file, "CC_Additional_Interests"));
                data.putAll(mergeData(data, "Manuscript_Endorsements_END", file, "CC_Manuscript_Endorsements"));
                data.putAll(mergeData(data, "Manual_Subjectivities_END", file, "CC_Manual_Subjectivities"));
            }
            break;
            case "CoherentAPI": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                data.putAll(mergeData(data, "AdjustmentInputs", file, "AdjustmentInputs"));
                data.putAll(mergeData(data, "ClaimInputs", file, "ClaimInputs"));
                data.putAll(mergeData(data, "LocationInputs", file, "LocationInputs"));
                data.putAll(mergeData(data, "PolicyInputs", file, "PolicyInputs"));
            }
            break;
            case "PA_NB": {
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
                //New Business
                data.putAll(mergeData(data, "Legal_Entity_Locations", file, "PA_LegalEntityLocations"));
                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "PA_PrincipalBeneficialOwners"));
                data.putAll(mergeData(data, "Legal_Entities", file, "PA_LegalEntities"));
                data.putAll(mergeData(data, "Driver_Incidents", file, "PA_DriverIncidents"));
                data.putAll(mergeData(data, "Additional_Operators", file, "PA_AdditionalOperators"));
                for (int i = 1; i <= data.get("Additional_Operators").split(",").length; i++) {
                    data.putAll(mergeData(data, "Additional_Operator_Incidents_" + i, file, "PA_AdditionalOperIncidents", i));
                }
                data.putAll(mergeData(data, "Additional_Vehicles", file, "PA_AdditionalVehicles"));
                for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
                    data.putAll(mergeData(data, "Vehicle_Details_Loss_Payee_" + i, file, "PA_LossPayee", i));
                }
                data.putAll(mergeData(data, "Manuscript_Endorsements", file, "PA_ManuscriptEndorsements"));
                data.putAll(mergeData(data, "Applications_Applications", file, "PA_Applications"));
                data.putAll(mergeData(data, "Manual_Subjectivities", file, "PA_Subjectivities"));
            }
            break;
            case "FS": {
                //NB
                data = getRowDataByID(file, sheet, TC_ID, "1", false);
//                data.putAll(mergeData(data, "Named_Insured_Additional_Named_Insured", file, "FS_Additional_Named_Insured"));
//                data.putAll(mergeData(data, "Household_Entity_Locations", file, "FS_Household_Entity_Location"));
//                data.putAll(mergeData(data, "Principal_Beneficial_Owners", file, "FS_Principal_Beneficial_Owners"));
//                data.putAll(mergeData(data, "Previous_Loss_Details_Losses", file, "FS_Loss_History"));
//                data.putAll(mergeData(data, "Additional_Interests", file, "FS_Additional_Interests"));
//                for (int i = 1; i <= data.get("Additional_Interests").split(",").length; i++) {
//                    data.putAll(mergeData(data, "Household_Entity_Locations_LLC_" + i, file, "FS_Household_Entity_Location", i));
//                    data.putAll(mergeData(data, "Beneficial_Owners_LLC_" + i, file, "FS_Principal_Beneficial_Owners", i));
//                }
//                data.putAll(mergeData(data, "Manuscript_Endorsements", file, "FS_Manuscript_Endorsements"));
//                data.putAll(mergeData(data, "Collections_Schedule_Collection_Items", file, "FS_Collections_Classes"));
//                data.putAll(mergeData(data, "Loss_Claim_History_Prior_Collection_Losses", file, "FS_Collections_Loss_History"));
//                data.putAll(mergeData(data, "Manual_Subjectivities", file, "FS_Manual_Subjectivities"));
//                data.putAll(mergeData(data, "Policy_Information_Additional_Properties", file, "FS_Property_Information"));
            }
        }
        return data;
    }

    public Map<String, String> mergeData(Map<String, String> data, String key, String file, String sheet,
                                         int index) throws IOException {
        String[] dataIDs = data.get(key).split(",");
        for (int i = 0; i < dataIDs.length; i++) {
            data.putAll(new ExcelManager().getRowDataByID(file, sheet, dataIDs[i], index + "_" + (i + 1), true));
        }
        return data;
    }

    public Map<String, String> getRandomRowData(String file, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int lastColumnNum = sheet.getRow(1).getLastCellNum();

        Random r = new Random();
        int rowNum = r.nextInt(sheet.getLastRowNum());
        if (rowNum < 2) {
            rowNum += 2;
        }

        Map<String, String> data = new HashMap<>();

        for (int i = 0; i < lastColumnNum; i++) {
            String key;
            String value;
            try {
                key = sheet.getRow(1).getCell(i).getStringCellValue().trim();
            } catch (Exception e) {
                try {
                    key = String.valueOf(sheet.getRow(1).getCell(i).getNumericCellValue()).replace(".0", "");
                } catch (Exception ex) {
                    key = null;
                }
            }
            try {
                value = sheet.getRow((rowNum + 1)).getCell(i).getStringCellValue().trim();
            } catch (Exception e) {
                try {
                    value = String.valueOf(sheet.getRow((rowNum + 1)).getCell(i).getNumericCellValue()).replace(".0", "");
                } catch (Exception ex) {
                    value = null;
                }
            }

            data.put(key, value);
        }

        return data;
    }

    public static void writeToExcel(String fileName, String sheetName, Map<String, String> data) throws IOException, InvalidFormatException {

        synchronized (lock) {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            FileInputStream fis = new FileInputStream(fileName);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            Row dataRow = sheet.createRow(sheet.getLastRowNum() + 1);

            Object[] keysArray = data.keySet().toArray();
            for (Object o : keysArray) {
                String columnName = (String) o;
                String value = data.get(columnName);

                int headerColumnIndex = findColumnIndex(sheet.getRow(1), columnName);

                try {
                    Cell dataCell = dataRow.createCell(headerColumnIndex);
                    dataCell.setCellValue(value);
                } catch (Exception e) {

                }

            }
            try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
                workbook.write(fileOut);
            }
            workbook.close();
        }
    }

    private static int findColumnIndex(Row headerRow, String columnName) {
        if (headerRow == null) return -1;
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            Cell cell = headerRow.getCell(i);
            if (cell != null && columnName.equalsIgnoreCase(cell.getStringCellValue())) {
                return i;
            }
        }
        return -1;
    }

    public void writeBaseRatesDataToFile(String fileName, String[] values, String transaction) throws IOException {
        Workbook workbook;
        Sheet sheet;
        File file = new File(fileName + ".xlsx");

        CellStyle textStyle = null;

        if (file.exists()) {
            try (FileInputStream inputStream = new FileInputStream(file)) {
                workbook = new XSSFWorkbook(inputStream);
            }
            sheet = workbook.getSheet("BaseRates");
            if (sheet == null) {
                sheet = workbook.createSheet("BaseRates");
            }
        } else {
            workbook = new XSSFWorkbook();
            sheet = workbook.createSheet("BaseRates");

            //Set cell style
            DataFormat format = workbook.createDataFormat();
            textStyle = workbook.createCellStyle();
            textStyle.setDataFormat(format.getFormat("@"));

            // Create Header Rows
            Row headerRow1 = sheet.createRow(0);
            headerRow1.createCell(0, CellType.STRING);
            headerRow1.getCell(0).setCellStyle(textStyle);
            headerRow1.getCell(0).setCellValue("Base rates");

            Row headerRow2 = sheet.createRow(1);
            headerRow2.createCell(0, CellType.STRING).setCellValue("Coverage");
            headerRow2.getCell(0).setCellStyle(textStyle);
            headerRow2.getCell(0).setCellValue("Coverage");

            headerRow2.createCell(1, CellType.STRING).setCellValue("Factor");
            headerRow2.getCell(1).setCellStyle(textStyle);
            headerRow2.getCell(1).setCellValue("Factor");

            headerRow2.createCell(2, CellType.STRING).setCellValue("Value");
            headerRow2.getCell(2).setCellStyle(textStyle);
            headerRow2.getCell(2).setCellValue("Value");

            // Write New Business Transaction Row
            int rowIndex = 2;
            Row transactionRow = sheet.createRow(rowIndex);
            transactionRow.createCell(0, CellType.STRING).setCellValue("New Business");
            transactionRow.getCell(0).setCellStyle(textStyle);
            transactionRow.getCell(0).setCellValue("New Business");
        }

        // Write Transaction Row
        int rowIndex = sheet.getLastRowNum() + 1;
        Row transactionRow = sheet.createRow(rowIndex++);
        transactionRow.createCell(0, CellType.STRING).setCellValue(transaction);
        transactionRow.getCell(0).setCellStyle(textStyle);
        transactionRow.getCell(0).setCellValue(transaction);

        // Write Data Rows
        for (String value : values) {
            String[] parts = value.split("#@#");
            Row row = sheet.createRow(rowIndex++);
            row.createCell(0, CellType.STRING).setCellValue(parts[0]);
            row.getCell(0).setCellStyle(textStyle);
            row.getCell(0).setCellValue(parts[0]);

            row.createCell(1, CellType.STRING).setCellValue(parts[1]);
            row.getCell(1).setCellStyle(textStyle);
            row.getCell(1).setCellValue(parts[1]);

            row.createCell(2, CellType.STRING).setCellValue(parts[2]);
            row.getCell(2).setCellStyle(textStyle);
            row.getCell(2).setCellValue(parts[2]);
        }

        // Write to File
        try (FileOutputStream outputStream = new FileOutputStream(fileName + ".xlsx")) {
            workbook.write(outputStream);
        }
        workbook.close();
    }

    public List<List<String>> getExpectedBaseRateData(String tcID, String us, String fileName, String
            transaction, String customerID) throws IOException {
        String fullFileName = "src/test/test_data/dragon/us/expectedResults/" + us + "/" + fileName + "_" + tcID + "_" + customerID + ".xlsx";
        File file = new File(fullFileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fullFileName);
        }

        Workbook workbook;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            workbook = new XSSFWorkbook(inputStream);
        }
        Sheet sheet = workbook.getSheet("BaseRates");
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet 'BaseRates' not found in the Excel file.");
        }

        // Find the last occurrence of the transaction row
        int transactionRowIndex = -1;
        for (int i = sheet.getLastRowNum(); i >= 0; i--) {
            Row row = sheet.getRow(i);
            if (row != null && row.getCell(0) != null && transaction.equalsIgnoreCase(row.getCell(0).getStringCellValue())) {
                transactionRowIndex = i;
                break;
            }
        }

        if (transactionRowIndex == -1) {
            throw new IllegalArgumentException("Transaction row not found: " + transaction);
        }

        // Read the Coverage, Factor, Value columns
        List<List<String>> excelData = new ArrayList<>();
        for (int i = transactionRowIndex + 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null || row.getCell(0) == null) {
                break;
            }
            List<String> rowData = new ArrayList<>();
            rowData.add(getCellValueAsString(row.getCell(0)));
            rowData.add(getCellValueAsString(row.getCell(1)));
            rowData.add(getCellValueAsString(row.getCell(2)));
            excelData.add(rowData);
        }

        workbook.close();
        return excelData;
    }

    public static void compareExcelFiles(String file1, String file2) throws IOException {
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        Workbook workbook1 = new XSSFWorkbook(fis1);
        Workbook workbook2 = new XSSFWorkbook(fis2);

        Sheet sheet1 = workbook1.getSheetAt(0);
        Sheet sheet2 = workbook2.getSheetAt(0);

        List<Row> nbToEndRows1 = getRowsBetweenTransactions(sheet1, "New Business", "Endorsement");
        List<Row> nbToEndRows2 = getRowsBetweenTransactions(sheet2, "New Business", "Endorsement");
        compareRows(nbToEndRows1, nbToEndRows2, file1, file2, "New Business");

        List<Row> endToRnwRows1 = getRowsBetweenTransactions(sheet1, "Endorsement", "Renewal");
        List<Row> endToRnwRows2 = getRowsBetweenTransactions(sheet2, "Endorsement", "Renewal");
        compareRows(endToRnwRows1, endToRnwRows2, file1, file2, "Endorsement");

        List<Row> rnwToLastRows1 = getRowsBetweenTransactions(sheet1, "Renewal", null);
        List<Row> rnwToLastRows2 = getRowsBetweenTransactions(sheet2, "Renewal", null);
        compareRows(rnwToLastRows1, rnwToLastRows2, file1, file2, "Renewal");

        workbook1.close();
        workbook2.close();
        fis1.close();
        fis2.close();
    }

    private static List<Row> getRowsBetweenTransactions(Sheet sheet, String startTransaction, String endTransaction) {
        List<Row> transactionRows = new ArrayList<>();
        boolean withinRange = false;

        for (Row row : sheet) {
            if (isRowEmpty(row)) {
                if (withinRange) {
                    break;
                }
                continue;
            }

            Cell transactionCell = row.getCell(0);
            if (transactionCell != null && transactionCell.getCellType() == 1) {
                String cellValue = transactionCell.getStringCellValue();
                if (cellValue.equalsIgnoreCase(startTransaction)) {
                    withinRange = true;
                    transactionRows.clear();
                } else if (cellValue.equalsIgnoreCase(endTransaction)) {
                    withinRange = false;
                }
            }
            if (withinRange && (transactionCell == null || !transactionCell.getStringCellValue().equalsIgnoreCase(startTransaction))) {
                if ((row.getCell(0).getStringCellValue().equals("Wind Premium") && row.getCell(1).getStringCellValue().equals("Wind Base Rate")) || (row.getCell(0).getStringCellValue().equals("Non-Wind Premium") && row.getCell(1).getStringCellValue().equals("Non-Wind Base Rate")) || (row.getCell(0).getStringCellValue().equals("Wind Premium") && row.getCell(1).getStringCellValue().equals("Policy Companion Credit Factor")) || (row.getCell(0).getStringCellValue().equals("Non-Wind Premium") && row.getCell(1).getStringCellValue().equals("Policy Companion Credit Factor"))) {
                    transactionRows.add(row);
                }
            }
        }
        return transactionRows;
    }

    private static void compareRows(List<Row> rows1, List<Row> rows2, String file1, String file2, String
            transaction) {
        Set<String> rows1Set = new HashSet<>();
        Set<String> rows2Set = new HashSet<>();

        for (Row row : rows1) {
            rows1Set.add(rowToString(row));
        }
        for (Row row : rows2) {
            rows2Set.add(rowToString(row));
        }

        Set<String> missingRows = new HashSet<>(rows1Set);
        missingRows.removeAll(rows2Set);

        String prettyFile1 = file1.split("/")[file1.split("/").length - 1];
        String prettyFile2 = file2.split("/")[file2.split("/").length - 1];

        if (!missingRows.isEmpty()) {
            Allure.addAttachment(transaction, transaction);
            for (String row : missingRows) {
                Allure.addAttachment("Missing base rates from " + prettyFile2, row);
                Assert.fail("Missing base rates from " + prettyFile2 + "_" + row);
            }
        }

        Set<String> extraRows = new HashSet<>(rows2Set);
        extraRows.removeAll(rows1Set);
        if (!extraRows.isEmpty()) {
            Allure.addAttachment(transaction, transaction);
            for (String row : extraRows) {
                Allure.addAttachment("Extra base rates in " + prettyFile2, row);
                Assert.fail("Extra base rates from " + prettyFile2 + "_" + row);
            }
        }

        if (missingRows.isEmpty() && extraRows.isEmpty()) {
            Allure.addAttachment(transaction, transaction);
            Allure.addAttachment("No differences found!", "All rows are matching.");
            Assert.assertTrue(true);
        }
    }

    private String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return "";
        }
        return cell.getStringCellValue().trim();
    }

    private static String rowToString(Row row) {
        if (row == null) return "";
        StringBuilder rowString = new StringBuilder();
        for (Cell cell : row) {
            if (cell == null || cell.getCellType() == 3) {
                rowString.append(" | ");
            } else {
                rowString.append(cell.getStringCellValue()).append(" | ");
            }
        }
        return rowString.toString();
    }

    private static boolean isRowEmpty(Row row) {
        if (row == null) {
            return true;
        }
        for (Cell cell : row) {
            if (cell != null && cell.getCellType() != 3) {
                return false;
            }
        }
        return true;
    }

    public boolean hasValue(String data) {
        try {
            return !data.equals("") && !data.equals(" ");
        } catch (Exception e) {
            return false;
        }
    }

}