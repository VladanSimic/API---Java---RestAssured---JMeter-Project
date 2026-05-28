package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AutoWatercraftViolationHistoryBlock;
import pages.blocks.BoatingExperienceBlock;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.OperatorDetailsBlock;

import java.util.Map;

public class OperatorDetailsPage extends CommonComponentsAndActions {
    WebDriver driver;
    OperatorDetailsBlock operatorDetailsBlock;
    BoatingExperienceBlock boatingExperienceBlock;
    AutoWatercraftViolationHistoryBlock autoWatercraftViolationHistoryBlock;

    public OperatorDetailsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        operatorDetailsBlock = new OperatorDetailsBlock(driver);
        boatingExperienceBlock = new BoatingExperienceBlock(driver);
        autoWatercraftViolationHistoryBlock = new AutoWatercraftViolationHistoryBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillOperatorDetails(Map<String, String> data) throws Throwable {
        goToPage(data.get("First_Name") + " " + data.get("Last_Name"));
        operatorDetailsBlock.fillOperatorDetails(data);
        boatingExperienceBlock.fillBoatingExperienceDetails(data);
        autoWatercraftViolationHistoryBlock.fillAutoWatercraftViolationHistoryDetails(data);
    }
}