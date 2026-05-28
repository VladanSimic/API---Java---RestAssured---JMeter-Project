package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MembersPrimaryMailingAddressBlock {
    WebDriver driver;

    public MembersPrimaryMailingAddressBlock(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}