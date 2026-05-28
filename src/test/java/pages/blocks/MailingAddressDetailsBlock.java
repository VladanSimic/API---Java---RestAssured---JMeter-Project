package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MailingAddressDetailsBlock {
    WebDriver driver;

    public MailingAddressDetailsBlock(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}