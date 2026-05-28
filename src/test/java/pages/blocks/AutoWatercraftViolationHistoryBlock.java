package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class AutoWatercraftViolationHistoryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AutoWatercraftViolationHistoryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Have you had any prior auto accidents or auto/watercraft moving violations?']/../../../..//label[text()='No']/..//input")
    WebElement priorAutoWatercraftViolationsNo;
    @FindBy(xpath = "//div[text()='Have you had any prior auto accidents or auto/watercraft moving violations?']/../../../..//label[text()='Yes']/..//input")
    WebElement priorAutoWatercraftViolationsYes;

    public void fillAutoWatercraftViolationHistoryDetails(Map<String, String> data) throws Throwable {
        setPriorAutoWatercraftViolations(data.get("Prior_Auto_Watercraft_Violation"));
    }

    public void setPriorAutoWatercraftViolations(String yesNo) throws Throwable {
        choose(priorAutoWatercraftViolationsYes, priorAutoWatercraftViolationsNo, yesNo);
    }
}