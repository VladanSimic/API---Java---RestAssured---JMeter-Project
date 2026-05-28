package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class DriverStatusBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public DriverStatusBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}