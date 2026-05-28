package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CurrentBillingDetailsForThisPolicyBlock {
    WebDriver driver;

    public CurrentBillingDetailsForThisPolicyBlock(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}