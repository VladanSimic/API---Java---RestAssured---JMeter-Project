package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.ClueMVRPage;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;
import steps.dragon.DragonSteps;

import java.util.List;
import java.util.Map;

public class ClueMVRPageSteps extends BaseTest {

    public ClueMVRPageSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I assign claims to location")
    public void includeClaims() throws Throwable {
        new ClueMVRPage(driver).includeClaimAndAddLocation("Include");
    }

    @And("I assign claims to driver")
    public void assignClaims() throws Throwable {
        new ClueMVRPage(driver).includeClaimToDriverAuto("Include");
    }


    @And("I verify that Home CLUE is working")
    public void iVerifyHomeClue() throws Throwable {
//        Robot robot = new Robot();
//
//        //Zoom Out to 90%, so we could see CLUE/MVR tab
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_MINUS);
//        robot.keyRelease(KeyEvent.VK_MINUS);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        pause(2);
//        driver.findElement(By.cssSelector("#footer-panel-innerCt")).click();
//        pause(2);

        //Navigate to Clue/MVR tab
        new CommonComponentsAndActions(driver).navigateToCLUEMVRPage();
        // Select from dropdown options and click Run
        new ClueMVRPage(driver).runHomeClue(data);
        // Include Claims if any
        includeClaims();
        // Navigate again to CLUE/MVR Page because of zoom out logic
        new CommonComponentsAndActions(driver).navigateToCLUEMVRPage();
        // Assertion if process complete message is present
        pause(3);
        new DragonSteps().iVerifyHomeCLUEprocessingIsComplete();
        pause(2);
        reportScreenshot("HomeClue" + System.currentTimeMillis(), "CLUE Home");

        //Zoom In to 100%
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_ADD);
//        robot.keyRelease(KeyEvent.VK_ADD);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        pause(2);
//        driver.findElement(By.cssSelector("#footer-panel-innerCt")).click();
//        pause(2);
    }

    @And("I verify that Auto CLUE is working")
    public void iVerifyAutoClue() throws Throwable {

        //Navigate to Clue/MVR tab
        new CommonComponentsAndActions(driver).navigateToCLUEMVRPage();
        // Select from dropdown options and click Run
        new ClueMVRPage(driver).runAutoClue(data);
        // Include Claims if any
        new ClueMVRPage(driver).includeClaimToDriverAuto("Include");
        // Navigate again to CLUE/MVR Page because of zoom out logic
        new CommonComponentsAndActions(driver).navigateToCLUEMVRPage();
        // Assertion if process complete message is present
        pause(3);
        new DragonSteps().iVerifyAutoCLUEprocessingIsComplete();
        pause(2);
        reportScreenshot("AutoClue" + System.currentTimeMillis(), "CLUE Auto");
    }

    @And("I verify that newest Home CLUE returned status {string}")
    public void iVerifyHomeCLUEResponseStatus(String value) {
        new ClueMVRPage(driver).verifyHomeClueReportStatus(0, value);
    }

    @And("I verify that newest Auto CLUE returned status {string}")
    public void iVerifyAutoCLUEResponseStatus(String value) {
        new ClueMVRPage(driver).verifyAutoClueReportStatus(0, value);
    }

    @And("I add and verify different Home CLUE Address response status")
    public void addAndVerifyDifferentHomeCLUEAddressResponse(DataTable table) throws Throwable {
        ClueMVRPage page = new ClueMVRPage(driver);
        page.setHomeQuote(data);
        page.setHouseholdMembers(data);
        page.setHomeCLUEUseDifferentAddress("Yes");

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            String city = columns.get(1);
            String state = columns.get(2);
            String zip = columns.get(3);
            String responseStatus = columns.get(3);

            page.setHomeClueAddressLine1(addressLine1);
            page.setHomeClueCity(city);
            page.setHomeClueState(state);
            page.setHomeClueZIP(zip);
            page.clickRunHomeClue();
            page.includeClaimAndAddLocation("Include");
            page.verifyHomeClueReportStatus(0, responseStatus);
        }
    }

    @And("I add and verify different Auto CLUE Address response status")
    public void addAndVerifyDifferentAutoCLUEAddressResponse(DataTable table) throws Throwable {
        ClueMVRPage page = new ClueMVRPage(driver);
        page.setAutoQuote(data);
        page.setHouseholdMembersAuto(data);
        page.setHouseholdLocationsAuto(data);
        page.setAutoCLUEUseDifferentAddress("Yes");

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            String city = columns.get(1);
            String state = columns.get(2);
            String zip = columns.get(3);
            String responseStatus = columns.get(4);

            page.setAutoClueAddressLine1(addressLine1);
            page.setAutoClueCity(city);
            page.setAutoClueState(state);
            page.setAutoClueZIP(zip);
            page.clickRunAutoClue();
            page.includeClaimToDriverAuto("Include");
            page.verifyAutoClueReportStatus(0, responseStatus);
        }
    }

    @And("I click run auto clue")
    public void iClickRunAutoClue() throws Throwable {
        new ClueMVRPage(driver).clickRunAutoClue();
    }

    @And("I verify Auto Clue Table Results")
    public void verifyAutoClueTableResults(DataTable table) {

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            int index = Integer.parseInt(columns.get(0));
            String memberStatus = columns.get(1);
            String orderedBy = columns.get(2);
            String responseStatus = columns.get(3);

            ClueMVRPage page = new ClueMVRPage(driver);
            if (hasValue(memberStatus))
                page.verifyAutoClueMemberStatus(index, memberStatus, data);
            if (hasValue(orderedBy))
                page.verifyAutoClueOrderedBy(index, orderedBy);
            if (hasValue(responseStatus))
                page.verifyAutoClueReportStatus(index, responseStatus);
        }
    }

    @And("I set Home CLUE Claims status to {string}")
    public void setCLUEClaimsStatusTo(String value) throws Throwable {
        new ClueMVRPage(driver).includeClaimAndAddLocation(value);
    }

    @And("I set Auto CLUE Claims status to {string}")
    public void setAutoClueClaimsStatusTo(String value) throws Throwable {
        new ClueMVRPage(driver).includeClaimToDriverAuto(value);
    }

    @And("I set Auto CLUE Claims status to {string} on operator information page")
    public void setAutoClueClaimsStatusToOnOperatorInformationPage(String value) throws Throwable {
        new ClueMVRPage(driver).includeClaimOnOperatorInformationPage(value);
    }

    @And("I click assign CLUE claims on clue mvr page")
    public void clickAssignCLUEClaims() throws Throwable {
        new ClueMVRPage(driver).clickAssignCLUEClaims();
    }

    @And("I verify that Clue MVR Tab is {string}")
    public void verifyClueMVRTab(String value) {
        new ClueMVRPage(driver).verifyIfTabIsPresent(value);
    }

    @And("I upload and verify {string} report document on clue mvr page")
    public void iCheckReportCheckboxAndUploadDocument(String value) throws Throwable {
        new ClueMVRPage(driver).uploadAndVerifyClueMvrNcfReport(value, "dummyUpload.pdf");
    }

    @And("I set Household Members Auto Clue to primary driver")
    public void iSetHouseholdMembersAutoClueToPrimaryDriver() throws Throwable {
        new ClueMVRPage(driver).setHouseholdMembersAuto(data);
    }

    @And("I set Household Members Auto Clue to primary driver on operator information page")
    public void iSetHouseholdMembersAutoClueToPrimaryDriverOperatorInformationPage() throws Throwable {
        new ClueMVRPage(driver).setHouseholdMembersAutoOperatorInformationPage(data);
    }

}
