package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class NavigationalLimitsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public NavigationalLimitsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void fillNavigationalLimitsDetails(Map<String, String> data) {

    }
}