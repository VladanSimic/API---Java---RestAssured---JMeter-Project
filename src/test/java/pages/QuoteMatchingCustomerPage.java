package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class QuoteMatchingCustomerPage extends CommonComponentsAndActions {
    WebDriver driver;

    public QuoteMatchingCustomerPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}