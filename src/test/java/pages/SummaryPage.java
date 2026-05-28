package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class SummaryPage extends CommonComponentsAndActions {
    WebDriver driver;

    public SummaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='all quotes']/../../../../../../div[2]/div[3]//tr/td[1]//span")
    public WebElement quoteLink;

    public void clickQuoteLink() throws Throwable {
        clickElement(quoteLink);
    }

}