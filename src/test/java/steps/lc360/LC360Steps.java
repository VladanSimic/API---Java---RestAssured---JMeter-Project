package steps.lc360;

import excel.ExcelManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pages.OKTALoginPage;
import pages.lc360.LC360;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class LC360Steps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();

    LC360 lc360;

    String USERNAME = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("USERNAME");
    String PASSWORD = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("PASSWORD");

    @Given("I open OKTA and select LC360 tile")
    public void iOpenOKTAAndSelectLC360Tile() throws Throwable {
        OKTALoginPage lp = new OKTALoginPage(driver);
        lp.openOKTA(USERNAME, PASSWORD);
        lc360 = new LC360(driver);
        lc360.selectLC360();
    }

    @And("I navigate to inspections")
    public void iNavigateToInspections() throws Throwable {
        lc360 = new LC360(driver);
        lc360.navigateToInspections();
    }

    @And("I search for a policy {string}")
    public void iSearchForAPolicy(String policyNum) throws Throwable {
        lc360 = new LC360(driver);
        lc360.searchPolicy(policyNum);
    }

    @And("I select the policy {string}")
    public void iSelectThePolicy(String policyNum) throws Throwable {
        lc360 = new LC360(driver);
        lc360.selectPolicy(policyNum);
    }

    @Then("I fill in underwriter form {string}")
    public void iFillInUnderwriterForm(String row) throws Throwable {
        lc360 = new LC360(driver);
        Map<String, String> data = new ExcelManager().getRowData("environments/prod/src/test/test_data/lc360/LC360.xlsx", "UnderwriterForm", row);
        lc360.navigateToUnderwriterForm();
        lc360.fillForm(data);
        lc360.save();
    }

    @And("I change inspection type to self directed interior")
    public void iChangeInspectionTypeToSelfDirectedInterior() throws Throwable {
        lc360.changeInspectionTypeToSelfDirectedInterior();
    }

    @Then("I fill in underwriter form self directed interior {string}")
    public void iFillInUnderwriterFormSelfDirectedInterior(String row) throws Throwable {
        lc360 = new LC360(driver);
        Map<String, String> data = new ExcelManager().getRowData("environments/prod/src/test/test_data/lc360/LC360.xlsx", "UnderwriterFormSelfDirected", row);
        lc360.navigateToUnderwriterFormSelfDirected();
        lc360.fillFormSelfDirectedInterior(data);
        lc360.save();
    }

    @Then("I fill in end to end value {string}")
    public void iFillInEndToEndValue(String row) throws Throwable {
        lc360 = new LC360(driver);
        Map<String, String> data = new ExcelManager().getRowData("environments/prod/src/test/test_data/lc360/LC360.xlsx", "E2EValue", row);
        lc360.navigateToE2Value();
        lc360.fillE2ValueForm(data);
        lc360.save();
    }
}