package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PolicyDeliveryBlock {
    WebDriver driver;

    public PolicyDeliveryBlock(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}