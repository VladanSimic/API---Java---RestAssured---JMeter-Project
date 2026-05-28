package steps.dragon.common;

import excel.DataManager;
import excel.ExcelManager;
import excel.PremiumComparison;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.utils.CommonComponentsAndActions;
import steps.BaseTest;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class DataSteps extends BaseTest {

    public Map<String, String> data;
    public PremiumComparison premiumComparison = new PremiumComparison();
    public String testDataPath = "src/test/test_data/dragon/";

    @Given("I have entered test data for test case {string} in excel workbook {string} in sheet {string} for {string} LOB")
    public void iHaveEnteredTestDataForTestCaseInWorkbookInSheetForLOB(String TC_ID, String file, String sheet, String LOB) throws IOException {
        DataManager.getInstance().setData(
                new ExcelManager().getData(LOB, testDataPath + file, sheet, TC_ID)
        );
        data = DataManager.getInstance().getData();
    }

    @Given("I use {string} smoke test data from {string} sheet")
    public void iUseSmokeTestDataFromSheet(String testCase, String sheet) throws IOException {
        String substring = sheet.substring(Math.max(sheet.length() - 2, 0));
        DataManager.getInstance().setData(
                new ExcelManager().getData(substring, testDataPath + "QuoteCreation" + substring, sheet, testCase)
        );
        data = DataManager.getInstance().getData();
    }

    @Given("I use {string} regression test data from {string} sheet")
    public void iUseRegressionTestDataFromSheet(String testCase, String sheet) throws IOException {
        String substring = sheet.substring(Math.max(sheet.length() - 2, 0));
        DataManager.getInstance().setData(
                new ExcelManager().getData(substring, testDataPath + "QuoteCreation" + substring, sheet, testCase)
        );
        data = DataManager.getInstance().getData();
    }

    @Given("I use {string} E2E test data from {string} sheet")
    public void iUseE2ETestDataFromSheet(String testCase, String sheet) throws IOException {
        String substring = sheet.substring(Math.max(sheet.length() - 2, 0));
        DataManager.getInstance().setData(
                new ExcelManager().getData(substring, testDataPath + "E2E" + substring, sheet, testCase)
        );
        data = DataManager.getInstance().getData();
    }

    @And("I load random user data")
    public void iLoadRandomUserData() throws IOException {
        DataManager.getInstance().replaceKey("First_Name", getRandomData().get("FirstName"));
        DataManager.getInstance().replaceKey("Last_Name", getRandomData().get("LastName"));
    }

    @And("I load random additional operators data")
    public void iLoadRandomAdditionalOperatorsData() throws IOException {
        for (int i = 1; i <= data.get("Additional_Operators").split(",").length; i++) {
            data.replace("Additional_Operator_FirstName_" + i, getRandomData().get("FirstName"));
            data.replace("Additional_Operator_LastName_" + i, getRandomData().get("LastName"));
            data.replace("Additional_Operator_DOB_" + i, getRandomData().get("DOB"));
        }
    }

    @Given("I clear data")
    public void iClearData() {
        DataManager.getInstance().clearData();
    }

    @And("I set {string} to {string}")
    public void iSetTo(String key, String value) {
        if (data.containsKey(key) && value != null) {
            DataManager.getInstance().replaceKey(key, value);
        } else if (!data.containsKey(key) && value != null) {
            DataManager.getInstance().setKey(key, value);
        }
    }

    @And("I set additional vehicles for NB")
    public void iSetVehiclesNB(DataTable vTable) {
        List<Map<String, String>> vehicles = vTable.asMaps(String.class, String.class);

        for (int i = 0; i < vehicles.size(); i++) {
            Map<String, String> vehicle = vehicles.get(i);
            iSetTo("Vehicle_Details_Vehicle_Type_" + (i + 1), vehicle.get("type"));
            iSetTo("Vehicle_Details_VIN_Override_" + (i + 1), vehicle.get("override"));
            iSetTo("Vehicle_Details_Trim_Level_" + (i + 1), vehicle.get("trim_level"));
            iSetTo("Vehicle_Details_VIN_Number_" + (i + 1), vehicle.get("vin"));
            iSetTo("Vehicle_Details_Model_" + (i + 1), vehicle.get("model"));
            iSetTo("Vehicle_Details_Make_" + (i + 1), vehicle.get("make"));
            iSetTo("Vehicle_Details_Year_" + (i + 1), vehicle.get("year"));
            iSetTo("Vehicles_COLL_Deductible_" + (i + 1), vehicle.get("coll"));
            iSetTo("Vehicles_COMP_Deductible_" + (i + 1), vehicle.get("comp"));
            iSetTo("Vehicles_OTC_Deductible_" + (i + 1), vehicle.get("comp"));
            iSetTo("Vehicles_UMPD_Deductible_" + (i + 1), vehicle.get("UMPD"));
            iSetTo("Vehicles_Options_" + (i + 1), vehicle.get("option"));
            iSetTo("Vehicles_Towing_Labor_Limit_" + (i + 1), vehicle.get("towing"));
            iSetTo("Vehicle_Details_Mileage_Band_Year_" + (i + 1), vehicle.get("mileage"));
            iSetTo("Vehicle_Details_Annual_Mileage_" + (i + 1), vehicle.get("mileage"));
            iSetTo("Vehicle_Details_Estimated_Annual_Mileage_" + (i + 1), vehicle.get("mileage"));
            iSetTo("Vehicles_OTC_Deductible_" + (i + 1), vehicle.get("OTC_DED"));
            iSetTo("Vehicles_COLL_Deductible_" + (i + 1), vehicle.get("COLL_DED"));
            iSetTo("Vehicles_Flood_Deductible_" + (i + 1), vehicle.get("flood_Deductible"));
            iSetTo("Vehicles_COLL_Option_" + (i + 1), vehicle.get("COLL_Option"));
            iSetTo("Vehicles_Waiver_Of_COLL_Ded_" + (i + 1), vehicle.get("Waiver_COLL_DED"));

        }

    }
    @And("I set additional vehicles for END")
    public void iSetVehiclesEND(DataTable vTable) {
        List<Map<String, String>> vehicles = vTable.asMaps(String.class, String.class);

        for (int i = 0; i < vehicles.size(); i++) {
            Map<String, String> vehicle = vehicles.get(i);
            iSetTo("Vehicle_Details_Vehicle_Type_END_" + (i + 1), vehicle.get("type"));
            iSetTo("Vehicle_Details_VIN_Override_END_" + (i + 1), vehicle.get("override"));
            iSetTo("Vehicle_Details_Trim_Level_END_" + (i + 1), vehicle.get("trim_level"));
            iSetTo("Vehicle_Details_VIN_Number_END_" + (i + 1), vehicle.get("vin"));
            iSetTo("Vehicle_Details_Model_END_" + (i + 1), vehicle.get("model"));
            iSetTo("Vehicle_Details_Make_END_" + (i + 1), vehicle.get("make"));
            iSetTo("Vehicle_Details_Year_END_" + (i + 1), vehicle.get("year"));
            iSetTo("Vehicles_COLL_Deductible_END_" + (i + 1), vehicle.get("coll"));
            iSetTo("Vehicles_COMP_Deductible_END_" + (i + 1), vehicle.get("comp"));
            iSetTo("Vehicles_Options_END_" + (i + 1), vehicle.get("option"));
            iSetTo("Vehicle_Details_Mileage_Band_Year_END_" + (i + 1), vehicle.get("mileage"));

        }

    }

    @And("I insert New Business Grand Total Premium into premium comparison file {string} sheet")
    public void iInsertGrandTotalPremiumIntoSheet(String sheetName) {
        premiumComparison.insertPremiumIntoExcel(sheetName, data.get("TC_ID"), data.get("Grand_Total_Premium_NB"));
    }

    @And("I load premium comparison file for {string} lob")
    public void iLoadPremiumComparisonFile(String sheetName) throws Throwable {
        premiumComparison.retrieveData(sheetName);
    }

    /**
     * This step will use grand total premium that is collected on quote level during I bind a quote/I bind a CC quote steps execution
     * Collected grand total premium will be compared against same TC_ID in PremiumComparison Excel file
     */
    @And("I verify that New Business Grand Total Premium from data is matching premium comparison file {string} lob {string} tc id")
    public void iVerifyNBGrandTotalFromDataWithExcelPremium(String sheet, String TC_ID) {
        new CommonComponentsAndActions(driver).assertEquals(data.get("Grand_Total_Premium_NB"), premiumComparison.getValue(sheet, TC_ID), "TC ID [" + TC_ID + "]" + " Grand Total Premium between UI and Excel");
    }

    @And("I set Effective Date to Today")
    public void setEffDateToday() {
        DataManager.getInstance().setKey("Effective_Date", DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(LocalDateTime.now()));
        DataManager.getInstance().setKey("Endorsement_Effective_Date_END", DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(LocalDateTime.now().plusDays(1)));
    }

    @And("I load base rate validation file {string} sheet {string}")
    public void iLoadBaseRateValidation(String excel, String sheetName) throws Throwable {
        premiumComparison.retrieveBaseRateValidationData(excel, sheetName);
    }

    @And("I set Effective Date from Base Rate validation data")
    public void iSetEffectiveDateFromBaseRateValidationData() {
        String effDate = premiumComparison.getEffectiveDate();
        DataManager.getInstance().setKey("Effective_Date", effDate);
        LocalDate effectiveDate = LocalDate.parse(effDate, DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH));
        String endorsementEffDate = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(effectiveDate.plusDays(1));
        DataManager.getInstance().setKey("Endorsement_Effective_Date_END", endorsementEffDate);
    }

    @And("I set expected base rates for HO lob zone {string}")
    public void iSetExpectedBaseRatesForHOLob(String zone) {
        String[] expectedData = premiumComparison.getHOBaseRates(zone);
        DataManager.getInstance().setKey("ExpectedBaseRate_HO", expectedData[0]);
        DataManager.getInstance().setKey("ExpectedBaseRate_CCT", expectedData[1]);
    }

    @Then("I reload {string} vehicle data")
    public void iReloadVehicleData(String file) throws IOException {
        data.putAll(new ExcelManager().mergeData(data, "Additional_Vehicles", testDataPath + file, "PA_AdditionalVehicles"));
        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            data.putAll(new ExcelManager().mergeData(data, "Vehicle_Details_Loss_Payee_" + i, file, "PA_LossPayee", i));
        }
        data.putAll(new ExcelManager().mergeData(data, "Additional_Vehicles_END", testDataPath + file, "PA_AdditionalVehicles_END"));
        for (int i = 1; i <= data.get("Additional_Vehicles_END").split(",").length; i++) {
            data.putAll(new ExcelManager().mergeData(data, "Vehicle_Details_Loss_Payee_END_" + i, file, "PA_LossPayee_END", i));
        }
        data.putAll(new ExcelManager().mergeData(data, "Additional_Vehicles_RNW", testDataPath + file, "PA_AdditionalVehicles_RNW"));
        for (int i = 1; i <= data.get("Additional_Vehicles_RNW").split(",").length; i++) {
            data.putAll(new ExcelManager().mergeData(data, "Vehicle_Details_Loss_Payee_RNW_" + i, file, "PA_LossPayee_RNW", i));
        }
        data.putAll(new ExcelManager().mergeData(data, "Additional_Vehicles_OOS_END", testDataPath + file, "PA_AdditionalVehicles_OOS"));
        for (int i = 1; i <= data.get("Additional_Vehicles_OOS_END").split(",").length; i++) {
            data.putAll(new ExcelManager().mergeData(data, "Vehicle_Details_Loss_Payee_OOS_END_" + i, file, "PA_LossPayee_OOS", i));
        }
    }

    @And("I add random numbers in data at the end for key {string}")
    public void iAddRandomNumsInDataForTheKey(String key) {
        DataManager.getInstance().setKey(key, data.get(key) + " " + System.currentTimeMillis());
    }

    @Given("I merge data for {string}, where {string} key and {string} sheet")
    public void iMergeDataForWhereAndSheet(String file, String key, String sheet) throws IOException {
        data.putAll(new ExcelManager().mergeData(data, key, testDataPath + file, sheet));
    }

    @And("I merge additional data for {string}, where {string} key and sheet {string} for file {string}")
    public void addAdditionalData(String key, String addKey, String addSheet, String file) throws IOException {
        for (int i = 1; i <= data.get(key).split(",").length; i++) {
            data.putAll(new ExcelManager().mergeData(data, addKey + "_" + i, "src/test/test_data/dragon/" + file, addSheet, i));
        }
    }

    @And("I load basic llc named insured type data for {string} lob")
    public void loadBasicLLCNamedInsuredData(String lob) throws IOException {
        Map<String,String> data = DataManager.getInstance().getData();
        switch (lob) {
            case "HO": {
                data.put("Policy_Information_Trust_LLC_Or_Other_Legal_Entity", "TestCo LLC");
                data.put("Policy_Information_Trust_LLC_Resident_Name", "Test Residence Name");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN", "12-3123123");
                data.put("LLC_Trust_Questionnaire_Address_Line_1", "1815 E West Pkwy");
                data.put("LLC_Trust_Questionnaire_City", "Fleming Island");
                data.put("LLC_Trust_Questionnaire_Block_Legal_Entity_Type", "LLC");
                data.put("LLC_Trust_Questionnaire_Other_Legal_Entity_Type", "Corporate");
                data.put("LLC_Trust_Questionnaire_State", "FL");
                data.put("LLC_Trust_Questionnaire_ZIP", "32003");
                data.put("Household_Entity_Locations", "Household_Entity_Location_001");
                data.put("Principal_Beneficial_Owners", "Principal_Benefical_Owner_004");
                data.put("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity", "Test Entity");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details", "No");
                data.put("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies", "No");
                iMergeDataForWhereAndSheet("QuoteCreationHO", "Household_Entity_Locations", "HO_Household_Entity_Location");
                iMergeDataForWhereAndSheet("QuoteCreationHO", "Principal_Beneficial_Owners", "HO_Principal_Beneficial_Owners");
            }
            break;
            case "PA": {
                data.put("Policy_Information_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN", "12-3123123");
                data.put("LLC_Trust_Questionnaire_Address_Line_1", "1815 E West Pkwy");
                data.put("LLC_Trust_Questionnaire_City", "Fleming Island");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type", "LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type_Other", "Corporate");
                data.put("LLC_Trust_Questionnaire_State", "FL");
                data.put("LLC_Trust_Questionnaire_ZIP", "32003");
                data.put("Legal_Entity_Locations", "Location_001,");
                data.put("Principal_Beneficial_Owners", "Principal_Beneficial_Owner_001");
                data.put("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity", "Test Entity");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details", "No");
                data.put("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies", "No");
                iMergeDataForWhereAndSheet("QuoteCreationPA", "Legal_Entity_Locations", "PA_LegalEntityLocations");
                iMergeDataForWhereAndSheet("QuoteCreationPA", "Principal_Beneficial_Owners", "PA_PrincipalBeneficialOwners");
            }
            break;
            case "CO": {
                data.put("Policy_Information_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN", "12-3123123");
                data.put("LLC_Trust_Questionnaire_Address_Line_1", "1815 E West Pkwy");
                data.put("LLC_Trust_Questionnaire_City", "Fleming Island");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type", "LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type_Other", "Corporate");
                data.put("LLC_Trust_Questionnaire_State", "FL");
                data.put("LLC_Trust_Questionnaire_ZIP", "32003");
                data.put("Household_Entity_Locations", "Location_001_LLC,");
                data.put("Principal_Beneficial_Owners", "Principal_Benefical_Owner_001,");
                data.put("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity", "Test Entity");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details", "No");
                data.put("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies", "No");
                iMergeDataForWhereAndSheet("QuoteCreationCO", "Household_Entity_Locations", "CO_LegalEntityLocations");
                iMergeDataForWhereAndSheet("QuoteCreationCO", "Principal_Beneficial_Owners", "CO_BeneficialOwners");
            }
            break;
            case "ES": {
                data.put("Policy_Information_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN", "12-3123123");
                data.put("LLC_Trust_Questionnaire_Address_Line_1", "1815 E West Pkwy");
                data.put("LLC_Trust_Questionnaire_City", "Fleming Island");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type", "LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type_Other", "Corporate");
                data.put("LLC_Trust_Questionnaire_State", "FL");
                data.put("LLC_Trust_Questionnaire_ZIP", "32003");
                data.put("Household_Entity_Locations", "Location_001_LLC,");
                data.put("Principal_Beneficial_Owners", "Principal_Beneficial_Owner_001,");
                data.put("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity", "Test Entity");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details", "No");
                data.put("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies", "No");
                iMergeDataForWhereAndSheet("QuoteCreationES", "Household_Entity_Locations", "ES_LegalEntityLocations");
                iMergeDataForWhereAndSheet("QuoteCreationES", "Principal_Beneficial_Owners", "ES_BeneficialOwners");
            }
            break;
            case "PW": {
                data.put("Policy_Information_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN", "12-3123123");
                data.put("LLC_Trust_Questionnaire_Address_Line_1", "1815 E West Pkwy");
                data.put("LLC_Trust_Questionnaire_City", "Fleming Island");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type", "LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type_Other", "Corporate");
                data.put("LLC_Trust_Questionnaire_State", "FL");
                data.put("LLC_Trust_Questionnaire_ZIP", "32003");
                data.put("Household_Entity_Locations", "Location_001,");
                data.put("Principal_Beneficial_Owners", "Owner_001,");
                data.put("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity", "Test Entity");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details", "No");
                data.put("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies", "No");
                iMergeDataForWhereAndSheet("QuoteCreationPW", "Household_Entity_Locations", "PW_Household_Entity_Location");
                iMergeDataForWhereAndSheet("QuoteCreationPW", "Principal_Beneficial_Owners", "PW_Principal_Beneficial_Owners");
            }
            break;
            case "EX": {
                data.put("Policy_Information_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Name", "TestCo LLC");
                data.put("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN", "12-3123123");
                data.put("LLC_Trust_Questionnaire_Address_Line_1", "1815 E West Pkwy");
                data.put("LLC_Trust_Questionnaire_City", "Fleming Island");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type", "LLC");
                data.put("LLC_Trust_Questionnaire_Legal_Entity_Type_Other", "Corporate");
                data.put("LLC_Trust_Questionnaire_State", "FL");
                data.put("LLC_Trust_Questionnaire_ZIP", "32003");
                data.put("Household_Entity_Locations", "Location_001_LLC,");
                data.put("Principal_Beneficial_Owners", "Principal_Beneficial_Owner_001,");
                data.put("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity", "Test Entity");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets", "No");
                data.put("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details", "No");
                data.put("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies", "No");
                iMergeDataForWhereAndSheet("QuoteCreationEX", "Household_Entity_Locations", "EX_LegalEntityLocations");
                iMergeDataForWhereAndSheet("QuoteCreationEX", "Principal_Beneficial_Owners", "EX_BeneficialOwners");
            }
            break;
        }
    }

    @And("I set all optional coverages to no")
    public void iSetAllOptionalCoveragesToNo() {
        iSetTo("Optional_Coverages_Earthquake_Extension", "");
        iSetTo("Optional_Coverages_Earthquake_Loss_Assessment_Extension", "");
        iSetTo("Optional_Coverages_Business_Property_Extension", "");
        iSetTo("Optional_Coverages_Business_Property_Increase", "");
        iSetTo("Optional_Coverages_Ensuing_Fungi_Increase", "");
        iSetTo("Optional_Coverages_Incidental_Business_Prop_Increase", "");
        iSetTo("Optional_Coverages_Landscaping_Increased_Limits", "");
        iSetTo("Optional_Coverages_Loss_Assessment_Increase", "");
        iSetTo("Optional_Coverages_Incidental_Business_Threshold_Increase", "");
        iSetTo("Optional_Coverages_Liability_Extension", "");
        iSetTo("Optional_Coverages_Guaranteed_Replacement_Cost", "");
        iSetTo("Optional_Coverages_Fortified_Roof_Upgrade_Coverage", "");
        iSetTo("Optional_Coverages_Home_Systems_Protection", "");
        iSetTo("Optional_Coverages_Contents_Extended_Replacement_Cost", "");
        iSetTo("Optional_Coverages_Off_Premises_Other_Structures_Extension", "");
        iSetTo("Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost", "");
        iSetTo("Optional_Coverages_Flood_Coverage_Extension_DIC", "");
        iSetTo("Optional_Coverages_Thoroughbred_Horse_Liability_Extension", "");
        iSetTo("Optional_Coverages_Mine_Subsidence_Coverage", "");
        iSetTo("Optional_Coverages_Sinkhole_Collapse_Extension", "");
        iSetTo("Optional_Coverages_Flood_Advantage", "");
        iSetTo("Flood_Extension", "");
        iSetTo("Flood_Coverage_Extension", "");
        iSetTo("Optional_Coverages_Property_Remediation_Limited_Liability", "");
        iSetTo("Optional_Coverages_Fire_And_Lightning_Extension_Override", "");
        iSetTo("Optional_Coverages_Fire_And_Lightning_Extension_For_Landscaping", "");
        iSetTo("Optional_Coverages_Law_And_Ordinance_Increase", "");
        iSetTo("Debris_Removal", "");
        iSetTo("Optional_Coverages_Identity_Fraud_Protection", "");
        iSetTo("Optional_Coverages_UnitOwners_CovC_Special", "");
        iSetTo("Optional_Coverages_Personal_Injury_Coverage", "");
        iSetTo("Optional_Coverages_Canine_Liability_Exclusion", "");
        iSetTo("Section_II_Liability", "");
        iSetTo("Other_Structures_On_The_Res_Prem", "");
        iSetTo("Structures_Rented", "");
        iSetTo("Specific_Structures", "");
        iSetTo("Additional_Insured", "");
        iSetTo("Coverage_B_Other_Structures", "");
        iSetTo("Optional_Coverages_Fine_Art_Exclusion", "");
        iSetTo("Optional_Coverages_Premises_Liability_Limitation", "");
        iSetTo("Optional_Coverages_Exclusions_Libel_Slander_Exclusion", "");
        iSetTo("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible", "");
        iSetTo("Optional_Coverages_Exclusions_Named_Structures_Exclusion", "");
        iSetTo("Optional_Coverages_Amended_Settlement_Basis", "");
        iSetTo("Optional_Coverages_Exclusions_Cosmetic_Marring", "");
        iSetTo("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion", "");
        iSetTo("Optional_Coverages_Exclusions_Animal_Liability_Exclusion", "");
        iSetTo("Optional_Coverages_LawAndOrdinance_Increase_Rejection", "");
        iSetTo("Optional_Coverages_Fungi_Liability_Extension", "");
        iSetTo("Optional_Coverages_Flood_Extension_DIC", "");
        iSetTo("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost", "");
        iSetTo("Optional_Coverages_Exclusions_Animal_Liability_Exclusion", "");
        iSetTo("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs", "");
        iSetTo("Optional_Coverages_Dwelling_Replacement_Cost_COV", "");
        iSetTo("Optional_Coverages_Extended_Replacement_Cost_COV", "");
        iSetTo("Optional_Coverages_Guaranteed_Replacement_Cost", "");
        iSetTo("Optional_Coverages_Contents_Extended_Replacement_Cost", "");
        iSetTo("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures", "");
        iSetTo("Optional_Coverages_Amendment_To_Special_Limits_Contents", "");
        iSetTo("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains", "");
        iSetTo("Optional_Coverages_Excess_Flood_Coverage", "");
        iSetTo("Optional_Coverages_Replacement_Cost_Coverage", "");
        iSetTo("Optional_Coverages_Premises_Liability_Limitation", "");
        iSetTo("Optional_Coverages_Exclusions_Libel_Slander_Exclusion", "");
        iSetTo("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible", "");
        iSetTo("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure", "");
        iSetTo("Optional_Coverages_Exclusions_Named_Structures_Exclusion", "");
        iSetTo("Optional_Coverages_Named_Structures_to_Be_Excluded", "");
        iSetTo("Optional_Coverages_Canine_Liability_Exclusion", "");
        iSetTo("Optional_Coverages_Landscaping_Increased_Limits", "");
        iSetTo("Optional_Coverages_Fine_Art_Exclusion", "");
        iSetTo("Optional_Coverages_Earthquake_HO3254", "");
        iSetTo("Optional_Coverages_Business_Property_Increase", "");
        iSetTo("Optional_Coverages_Liability_Extension_Premises", "");
    }

    @And("I clear all protection details")
    public void iClearAllProtectionDetails() {
        iSetTo("Firewise_Community_Credit","");
        iSetTo("LowTemp_Monitoring","");
        iSetTo("Protection_Block_Automatic_Smoke_Detectors","");
        iSetTo("Protection_Block_Automatic_Sprinkler_System","");
        iSetTo("Protection_Block_Automatic_Sprinkler_Additional_Question","");
        iSetTo("Installed_Generator","");
        iSetTo("Gas_Leak_Detector","");
        iSetTo("24Hour_Signal_Continuity","");
        iSetTo("Sprinkler_System_Waterflow","");
        iSetTo("Guard_Gated_Community","");
        iSetTo("Protection_Block_Gated_Community_Patrol_Service","");
        iSetTo("Residential_Sprinkler","");
        iSetTo("Lightning_Protection","");
        iSetTo("External_Perimeter_Gate","");
        iSetTo("FullTime_Caretaker","");
        iSetTo("24_Hour_DoorMan","");
        iSetTo("Surveillance_Camera","");
        iSetTo("Locked_Or_Manned_Elevator","");
    }

    @And("I turn off optional data")
    public void iTurnOffOptionalData() {
        iSetAllOptionalCoveragesToNo();
        iSetTo("Additional_Interests", "");
        iSetTo("Manuscript_Endorsements", "");
        iSetTo("Manual_Subjectivities", "");
        iClearAllProtectionDetails();
    }

    @And("I set Effective Date of Endorsement to Today")
    public void setEffDateOfEndorsementToToday() {
        DataManager.getInstance().setKey("Endorsement_Effective_Date_END", DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(LocalDateTime.now()));
    }

}