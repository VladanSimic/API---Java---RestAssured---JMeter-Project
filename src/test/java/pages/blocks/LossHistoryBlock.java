package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class LossHistoryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LossHistoryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),\"Worker's Compensation loss in the past five years\")]/../../../..//label[text()='Yes']/..//input")
    WebElement lossHistoryYes;
    @FindBy(xpath = "//div[contains(text(),\"Worker's Compensation loss in the past five years\")]/../../../..//label[text()='No']/..//input")
    WebElement lossHistoryNo;

    public void fillLossHistoryDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss history");
        setLossOrClaim(data.get("General_Contractor_Loss_Or_Claim"));
    }

    public void fillLossHistoryDetailsCC_END(Map<String, String> data) throws Throwable {
        setLossOrClaim(data.get("General_Contractor_Loss_Or_Claim_END"));
        saveChanges();
    }

    public void setLossOrClaim(String value) throws Throwable {
        choose(lossHistoryYes, lossHistoryNo, value, "Loss history");
    }

}