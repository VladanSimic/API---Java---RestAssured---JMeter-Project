package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.blocks.AccountInforcePoliciesBlock;
import pages.blocks.QuotesBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class CustomerAccountSummaryPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I verify on account summary if risk grade is {string}")
    public void iVerifyRiskGradeOnAccountSummary(String value) {
        new AccountInforcePoliciesBlock(driver).verifyRiskGrade(value);
    }

    @And("I verify on account summary if home model v3 risk grade is {string}")
    public void iVerifyHomeModelV3RiskGrade(String value) {
        new AccountInforcePoliciesBlock(driver).verifyHomeModelV3RiskGrade(value);
    }

}