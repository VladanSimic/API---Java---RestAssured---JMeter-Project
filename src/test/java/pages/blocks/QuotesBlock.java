package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class QuotesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public QuotesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='new quote']")
    WebElement newQuote;

    public void clickNewQuoteButton() {
        clickElement(newQuote, "New Quote");
    }

}