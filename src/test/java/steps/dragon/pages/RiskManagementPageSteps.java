package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.AccountSummaryPage;
import pages.RiskManagementPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class RiskManagementPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I verify that Skedulo Inspection Status is {string} on Risk Management Tab")
    public void verifySkeduloInspectionStatus(String value) throws InterruptedException {
        new RiskManagementPage(driver).verifyInspectionStatus(value, 0);
    }

}