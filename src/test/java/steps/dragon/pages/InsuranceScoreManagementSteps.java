package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.DiaryPage;
import pages.InsuranceScoreManagementPage;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;

import java.util.Map;

public class InsuranceScoreManagementSteps {
    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I click on insurance score management")
    public void iClickOnInsuranceScoreManagement() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToInsuranceScoreManagementTab();
    }

    @And("I override insurance score to {string}")
    public void iOverrideInsuranceScore(String score) throws Throwable {
        new InsuranceScoreManagementPage(driver).orderNewReportAndChangeScore(data, score);
    }


}
