package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.AccountSummaryPage;
import pages.AdditionalInterestsPage;
import pages.QuotesPage;
import pages.blocks.AdditionalInterestsBlock;
import pages.blocks.QuotesBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class CustomerSummaryPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I click new quote button on customer summary page")
    public void iClickNewQuoteButton() {
        new QuotesBlock(driver).clickNewQuoteButton();
    }

    @Then("I verify that {string} tab is between {string} and {string}")
    public void verifyTabIsBetween(String targetTab, String tabBefore, String tabAfter) {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);
        AccountSummaryPage account = new AccountSummaryPage(driver);
        boolean result = account.isTabBetween(tabBefore, targetTab, tabAfter);

        if (result) {
            actions.successLog("Tab '" + targetTab + "' is between '" + tabBefore + "' and '" + tabAfter + "'");
        } else {
            actions.failAssertion("Tab '" + targetTab + "' is NOT between '" + tabBefore + "' and '" + tabAfter + "'");
        }
    }


}