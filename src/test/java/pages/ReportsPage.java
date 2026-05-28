package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReportsPage extends CommonComponentsAndActions {
    WebDriver driver;
    WildfireThreatBlock wildfireThreatBlock;

    public ReportsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wildfireThreatBlock = new WildfireThreatBlock(driver);
    }

    public void fillReportsPage(Map<String,String> data) throws Throwable {
        if (goToPage("Reports")) {
            wildfireThreatBlock.fillWildfireThreatInfo(data);
        }
    }


}