package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ApplicationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ApplicationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Date Received']/../../../..//input")
    WebElement dateReceived;
    @FindBy(xpath = "//div[text()='Application Accepted']/../../../..//input")
    WebElement applicationAccepted;
    @FindBy(xpath = "//div[text()='Signed Application Received']/../../../..//label[text()='Yes']/..//input")
    WebElement signedApplicationReceivedYes;
    @FindBy(xpath = "//div[text()='Signed Application Received']/../../../..//label[text()='No']/..//input")
    WebElement signedApplicationReceivedNo;

    public void fillApplicationDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("application");
        setDateReceived(data.get("Application_Date_Received"));
        setApplicationAccepted(data.get("Application_Application_Accepted"));
        setSignedApplicationReceived(data.get("Application_Signed_Application_Received"));
    }

    public void fillApplicationDetailsPA_END(Map<String, String> data) throws Throwable {
        setDateReceived(data.get("Application_Date_Received_END"));
        setApplicationAccepted(data.get("Application_Application_Accepted_END"));
        setSignedApplicationReceived(data.get("Application_Signed_Application_Received_END"));
    }

    public void fillApplicationDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setDateReceived(data.get("Application_Date_Received_OOS_END"));
        setApplicationAccepted(data.get("Application_Application_Accepted_OOS_END"));
        setSignedApplicationReceived(data.get("Application_Signed_Application_Received_OOS_END"));
    }

    public void fillApplicationDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setDateReceived(data.get("Application_Date_Received_RNW"));
        setApplicationAccepted(data.get("Application_Application_Accepted_RNW"));
        setSignedApplicationReceived(data.get("Application_Signed_Application_Received_RNW"));
    }

    public void setDateReceived(String s) {
        typeTextEnter(dateReceived, s, "Date Received");
    }

    public void setApplicationAccepted(String s) {
        typeTextEnter(applicationAccepted, s, "Application Accepted");
    }

    public void setSignedApplicationReceived(String s) throws Throwable {
        choose(signedApplicationReceivedYes, signedApplicationReceivedNo, s, "Signed Application Received");
    }
}