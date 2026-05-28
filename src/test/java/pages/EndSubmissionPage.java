package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AdditionalInsuredBlock;
import pages.blocks.ReasonForEndSubmissionBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class EndSubmissionPage extends CommonComponentsAndActions {
    WebDriver driver;
    ReasonForEndSubmissionBlock reasonForEndSubmissionBlock;

    public EndSubmissionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        reasonForEndSubmissionBlock = new ReasonForEndSubmissionBlock(driver);
        PageFactory.initElements(driver, this);
    }
}