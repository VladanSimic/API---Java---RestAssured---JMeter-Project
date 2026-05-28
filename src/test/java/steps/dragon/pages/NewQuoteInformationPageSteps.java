package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.NewQuoteInformationPage;
import pages.blocks.QuotesBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class NewQuoteInformationPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I create a new quote on new quote information page")
    public void iClickNewQuoteButton() throws Throwable {
        new NewQuoteInformationPage(driver).createNewQuote(data, ENV);
    }


    @And("I click create quote button")
    public void iClickCreateQuoteButton() throws Throwable {
        new NewQuoteInformationPage(driver).clickCreateQuote();
    }

}