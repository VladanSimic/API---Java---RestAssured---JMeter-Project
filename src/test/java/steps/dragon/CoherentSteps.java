package steps.dragon;

import excel.DataManager;
import excel.ExcelManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import pages.PremiumSummaryPage;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

public class CoherentSteps extends BaseTest {

    public CoherentSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public String versionID = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("versionID");
    public String token = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("token");
    private static final Random random = new Random();
    private static final Object lock = new Object();
    Map<String, String> data;
    Response response;

    @And("I have entered test data for test case {string} in excel workbook {string}")
    public void iHaveEnteredTestDataForTestCaseInExcelWorkbook(String tcID, String workbook) throws Throwable {
        DataManager.getInstance().setData(
                new ExcelManager().getData("CoherentAPI", "src/test/test_data/dragon/api/" + workbook, "CoherentData", tcID)
        );
        data = DataManager.getInstance().getData();
    }

    @When("I send execute POST request")
    public void iSendExecutePOSTRequest() throws ParseException {
        String jsonString = "{\n" +
                "   \"request_data\": {\n" +
                "       \"inputs\": {\n" +
                "           \"AdjustmentInputs\": [],\n" +
                "           \"ClaimInputs\": [],\n" +
                "           \"LocationInputs\": [],\n" +
                "           \"PolicyInputs\": []\n" +
                "       }\n" +
                "   },\n" +
                "   \"request_meta\": {\n" +
                "       \"version_id\": \"\",\n" +
                "       \"call_purpose\": \"Spark - API Tester\",\n" +
                "       \"source_system\": \"SPARK\",\n" +
                "       \"correlation_id\": null,\n" +
                "       \"requested_output\": null,\n" +
                "       \"service_category\": \"\"\n" +
                "   }\n" +
                "}";

        JSONParser parser = new JSONParser();
        JSONObject jsonBody = (JSONObject) parser.parse(jsonString);

        JSONObject requestData = (JSONObject) jsonBody.get("request_data");
        JSONObject inputs = (JSONObject) requestData.get("inputs");

        JSONArray adjustmentInputs = (JSONArray) inputs.get("AdjustmentInputs");
        for (int i = 0; i < data.get("AdjustmentInputs").split(",").length; i++) {
            adjustmentInputs.add(parser.parse(data.get("AdjustmentInputData_" + (i + 1))));
        }
        inputs.put("AdjustmentInputs", adjustmentInputs);

        JSONArray claimInputs = (JSONArray) inputs.get("ClaimInputs");
        for (int i = 0; i < data.get("ClaimInputs").split(",").length; i++) {
            claimInputs.add(parser.parse(data.get("ClaimInputData_" + (i + 1))));
        }
        inputs.put("ClaimInputs", claimInputs);

        JSONArray locationInputs = (JSONArray) inputs.get("LocationInputs");
        for (int i = 0; i < data.get("LocationInputs").split(",").length; i++) {
            locationInputs.add(parser.parse(data.get("LocationInputData_" + (i + 1))));
        }
        inputs.put("LocationInputs", locationInputs);

        JSONArray policyInputs = (JSONArray) inputs.get("PolicyInputs");
        for (int i = 0; i < data.get("PolicyInputs").split(",").length; i++) {
            policyInputs.add(parser.parse(data.get("PolicyInputData_" + (i + 1))));
        }
        inputs.put("PolicyInputs", policyInputs);

        JSONObject requestMeta = (JSONObject) jsonBody.get("request_meta");
        requestMeta.put("version_id", versionID);

        response = (Response) RestAssured
                .given()
                .baseUri("https://excel.uat.us.coherent.global")
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(jsonBody.toJSONString())
                .when()
                .post("/pure-uat/api/v3/folders/Test_Automation/services/FL_Non-Admitted_Rater%20-%20v00.01%20WIP%20Danijel/execute")
                .then()
                .extract()
                .response();

    }

    @Then("I verify response status code is {int}")
    public void iVerifyResponseStatusCodeIs(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("I verify response grand total premium is not empty")
    public void iVerifyResponseGrandTotalPremiumIsNotEmpty() {
        Assert.assertTrue(hasValue(String.valueOf(response.jsonPath().getDouble("response_data.outputs.GrandTotalPremium"))));
        reportTextAttachment("Grand Total Premium", String.valueOf(response.jsonPath().getDouble("response_data.outputs.GrandTotalPremium")));
    }

    @Then("I verify response grand total premium is not zero")
    public void iVerifyResponseGrandTotalPremiumIsNotZero() {
        double grandTotalPremium = response.jsonPath().getDouble("response_data.outputs.GrandTotalPremium");
        Assert.assertNotEquals(grandTotalPremium, 0.0, "Grand Total Premium should not be 0.0");
        reportTextAttachment("Grand Total Premium", String.valueOf(grandTotalPremium));
    }

    @Then("I verify response error is null")
    public void iVerifyResponseErrorIsNull() {
        Assert.assertNull(response.jsonPath().getString("response_data.errors"));
    }

    @Then("I verify response warning {int} message is {string}")
    public void iVerifyResponseWarningIs(int index, String message) {
        Assert.assertEquals(response.jsonPath().getString("response_data.warnings[" + (index - 1) + "].message"), message);
    }

    @Then("I save the Location premium in Excel {string} in sheet {string} for {string} {string} and policy number {string} with expected premium {string}")
    public void iSaveTheLocationPremiumInExcelForPolicyWithExpectedPremium(String excelFilePath, String sheetName, String tcId, String state, String policyNumber, String expectedPremium) throws Throwable {

        WebElement premiumElement = driver.findElement(By.xpath("//div[text()='Total Location Premium']/../../td[last()]"));

        String premiumValue = premiumElement.getText();
        pause(12);

        synchronized (lock) {
            try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            try {
                File file = new File(excelFilePath);
                Workbook workbook;
                Sheet sheet;

                if (file.exists()) {
                    FileInputStream fis = new FileInputStream(file);
                    workbook = WorkbookFactory.create(fis);
                    sheet = workbook.getSheet(sheetName);
                    if (sheet == null) {
                        sheet = workbook.createSheet(sheetName);
                        Row header = sheet.createRow(0);
                        header.createCell(0).setCellValue("TC_ID");
                        header.createCell(1).setCellValue("State");
                        header.createCell(2).setCellValue("Policy_Number");
                        header.createCell(3).setCellValue("Total_Location_Premium(Expected)");
                        header.createCell(4).setCellValue("Customer_ID");
                            header.createCell(5).setCellValue("Total_Location_Premium(Actual)");

                    }
                } else {
                    workbook = new XSSFWorkbook();
                    sheet = workbook.createSheet(sheetName);

                    Row header = sheet.createRow(0);
                    header.createCell(0).setCellValue("TC_ID");
                    header.createCell(1).setCellValue("State");
                    header.createCell(2).setCellValue("Policy_Number");
                    header.createCell(3).setCellValue("Total_Location_Premium(Expected)");
                    header.createCell(4).setCellValue("Customer_ID");
                        header.createCell(5).setCellValue("Total_Location_Premium(Actual)");

                }

                int rowCount = sheet.getLastRowNum() + 1;
                Row row = sheet.createRow(rowCount);
                row.createCell(0).setCellValue(tcId);
                row.createCell(1).setCellValue(state);
                row.createCell(2).setCellValue(policyNumber);
                row.createCell(3).setCellValue(expectedPremium);
                row.createCell(4).setCellValue(DataManager.getInstance().getData().get("Customer_ID"));
                row.createCell(5).setCellValue(premiumValue);

                try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
                    workbook.write(fos);
                }

                workbook.close();
            } catch (IOException | InvalidFormatException e) {
                System.err.println("Error working with Excel file: " + e.getMessage());
            }
        }
    }

    @Then("I save the premium in Excel {string} in sheet {string} for {string} {string} and policy number {string} with expected premium {string}")
    public void iSaveThePremiumInExcelForPolicyWithExpectedPremium(String excelFilePath, String sheetName, String tcId, String state, String policyNumber, String expectedPremium) throws Throwable {

        WebElement premiumElement = driver.findElement(By.xpath("//div[text()='Total Premium']/../../td[last()]"));

        String premiumValue = premiumElement.getText();
        pause(12);

        synchronized (lock) {
            try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            try {
                File file = new File(excelFilePath);
                Workbook workbook;
                Sheet sheet;

                if (file.exists()) {
                    FileInputStream fis = new FileInputStream(file);
                    workbook = WorkbookFactory.create(fis);
                    sheet = workbook.getSheet(sheetName);
                    if (sheet == null) {
                        sheet = workbook.createSheet(sheetName);
                        Row header = sheet.createRow(0);
                        header.createCell(0).setCellValue("TC_ID");
                        header.createCell(1).setCellValue("State");
                        header.createCell(2).setCellValue("Policy_Number");
                        header.createCell(3).setCellValue("Total_Premium(Expected)");
                        header.createCell(4).setCellValue("Customer_ID");
                        header.createCell(5).setCellValue("Total_Premium(Actual)");

                    }
                } else {
                    workbook = new XSSFWorkbook();
                    sheet = workbook.createSheet(sheetName);

                    Row header = sheet.createRow(0);
                    header.createCell(0).setCellValue("TC_ID");
                    header.createCell(1).setCellValue("State");
                    header.createCell(2).setCellValue("Policy_Number");
                    header.createCell(3).setCellValue("Total_Premium(Expected)");
                    header.createCell(4).setCellValue("Customer_ID");
                    header.createCell(5).setCellValue("Total_Premium(Actual)");

                }

                int rowCount = sheet.getLastRowNum() + 1;
                Row row = sheet.createRow(rowCount);
                row.createCell(0).setCellValue(tcId);
                row.createCell(1).setCellValue(state);
                row.createCell(2).setCellValue(policyNumber);
                row.createCell(3).setCellValue(expectedPremium);
                row.createCell(4).setCellValue(DataManager.getInstance().getData().get("Customer_ID"));
                row.createCell(5).setCellValue(premiumValue);

                try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
                    workbook.write(fos);
                }

                workbook.close();
            } catch (IOException | InvalidFormatException e) {
                System.err.println("Error working with Excel file: " + e.getMessage());
            }
        }
    }

    @Then("I rate and save the Dragon rate duration in Excel {string} in sheet {string} for {string}")
    public void iSaveTheDragonRateDurationInExcel(String excelFilePath, String sheetName, String user) throws Throwable {
        pause(5);

        long startTime = System.currentTimeMillis();
        if (sheetName.equalsIgnoreCase("NB")) {
            new CommonComponentsAndActions(driver).rateQuote();
        } else if (sheetName.equalsIgnoreCase("END")) {
            new CommonComponentsAndActions(driver).clickEndorsementRate();
        } else if (sheetName.equalsIgnoreCase("RNW")) {
            new CommonComponentsAndActions(driver).clickRenewedPremium();
        }
        new PremiumSummaryPage(driver).verifyThatPremiumSummaryBlockIsVisible();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        synchronized (lock) {
            try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            try {
                File file = new File(excelFilePath);
                Workbook workbook;
                Sheet sheet;

                if (file.exists()) {
                    FileInputStream fis = new FileInputStream(file);
                    workbook = WorkbookFactory.create(fis);
                    sheet = workbook.getSheet(sheetName);
                    if (sheet == null) {
                        sheet = workbook.createSheet(sheetName);
                        Row header = sheet.createRow(0);
                        header.createCell(0).setCellValue("Start_time");
                        header.createCell(1).setCellValue("Users_for_Dragon");
                        header.createCell(2).setCellValue("Dragon_duration_in_ms");
                    }
                } else {
                    workbook = new XSSFWorkbook();
                    sheet = workbook.createSheet(sheetName);

                    Row header = sheet.createRow(0);
                    header.createCell(0).setCellValue("Start_time");
                    header.createCell(1).setCellValue("Users_for_Dragon");
                    header.createCell(2).setCellValue("Dragon_duration_in_ms");
                }

                int rowCount = sheet.getLastRowNum() + 1;
                Row row = sheet.createRow(rowCount);
                row.createCell(0).setCellValue(startTime);
                row.createCell(1).setCellValue(user);
                row.createCell(2).setCellValue(duration);

                try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
                    workbook.write(fos);
                }

                workbook.close();
            } catch (IOException | InvalidFormatException e) {
                System.err.println("Error working with Excel file: " + e.getMessage());
            }
        }
    }

    @Then("I rate and save the Coherent rate duration in Excel {string} in sheet {string} for {string}")
    public void iSaveTheCoherentRateDurationInExcel(String excelFilePath, String sheetName, String user) throws Throwable {
        pause(5);

        long startTime = System.currentTimeMillis();
        if (sheetName.equalsIgnoreCase("NB")) {
            new CommonComponentsAndActions(driver).rateQuote();
        } else if (sheetName.equalsIgnoreCase("END")) {
            new CommonComponentsAndActions(driver).clickEndorsementRate();
        } else if (sheetName.equalsIgnoreCase("RNW")) {
            new CommonComponentsAndActions(driver).clickRenewedPremium();
        }
        new PremiumSummaryPage(driver).verifyThatPremiumSummaryBlockIsVisible();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        synchronized (lock) {
            try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            try {
                File file = new File(excelFilePath);
                Workbook workbook;
                Sheet sheet;

                if (file.exists()) {
                    FileInputStream fis = new FileInputStream(file);
                    workbook = WorkbookFactory.create(fis);
                    sheet = workbook.getSheet(sheetName);
                    if (sheet == null) {
                        sheet = workbook.createSheet(sheetName);
                        Row header = sheet.createRow(0);
                        header.createCell(3).setCellValue("Start_time");
                        header.createCell(4).setCellValue("Users_for_Coherent");
                        header.createCell(5).setCellValue("Coherent_duration_in_ms");
                    }
                } else {
                    workbook = new XSSFWorkbook();
                    sheet = workbook.createSheet(sheetName);

                    Row header = sheet.createRow(0);
                    header.createCell(3).setCellValue("Start_time");
                    header.createCell(4).setCellValue("Users_for_Coherent");
                    header.createCell(5).setCellValue("Coherent_duration_in_ms");


                }

                int rowCount = sheet.getLastRowNum() + 1;
                Row row = sheet.createRow(rowCount);
                row.createCell(3).setCellValue(startTime);
                row.createCell(4).setCellValue(user);
                row.createCell(5).setCellValue(duration);


                try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
                    workbook.write(fos);
                }

                workbook.close();
            } catch (IOException | InvalidFormatException e) {
                System.err.println("Error working with Excel file: " + e.getMessage());
            }
        }
    }
}