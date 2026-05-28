package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WarningBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public WarningBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='warning']/../../../../../..//label[@style=\"color: red; width: 100%;\"]")
    WebElement messageEl;

    public void fillWarningDetailsCC(Map<String, String> data) throws Throwable {
        verifyWarningMessage(data.get("Warning_Block_Warning_Message"));
        saveChanges();
    }

    public void fillWarningDetailsCC_END(Map<String, String> data) throws Throwable {
        verifyWarningMessage(data.get("Warning_Block_Warning_Message_END"));
        saveChanges();
    }

    public void verifyWarningMessage(String message) {
        if (hasValue(message))
            assertEquals(messageEl.getText(), message, "Warning message");
    }

    public void fillWarningDetailsHS(Map<String, String> data) throws Throwable {
        verifyWarningMessage(data.get("Warning_Block_Warning_Message"));
        saveChanges();
    }

    public void fillWarningDetailsHS_END(Map<String, String> data) throws Throwable {
        verifyWarningMessage(data.get("Warning_Block_Warning_Message_END"));
        saveChanges();
    }

    public void fillWarningDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        verifyWarningMessage(data.get("Warning_Block_Warning_Message_OOS_END"));
        saveChanges();
    }

    public void fillWarningDetailsHS_RNW(Map<String, String> data) throws Throwable {
        verifyWarningMessage(data.get("Warning_Block_Warning_Message_RNW"));
        saveChanges();
    }
}