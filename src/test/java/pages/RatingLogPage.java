package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.ApplicationMandatoryFormsBlock;
import pages.blocks.PolicyListBlock;
import pages.blocks.QuoteListBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class RatingLogPage extends CommonComponentsAndActions {
    WebDriver driver;
    QuoteListBlock quoteListBlock;
    PolicyListBlock policyListBlock;

    public RatingLogPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        quoteListBlock = new QuoteListBlock(driver);
        policyListBlock = new PolicyListBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchAndSelectQuoteByHHID(String hhid) throws InterruptedException {
        quoteListBlock.searchQuoteByHHID(hhid);
    }

    public void searchAndSelectAPolicyByHHID(String hhid) throws InterruptedException {
        policyListBlock.searchPolicyByHHID(hhid);
    }

}
