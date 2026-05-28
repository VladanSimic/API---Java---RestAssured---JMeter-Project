package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ReasonForEndSubmissionBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ReasonForEndSubmissionBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Reason for Ending Submission']/../../../..//input")
    WebElement reasonForEnding;
    @FindBy(xpath = "//div[contains(text(),'Refer to Home Surplus?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement referToHomeSurplusYes;
    @FindBy(xpath = "//div[contains(text(),'Refer to Home Surplus?')]/../../../../div//label[text()='No']/..//input")
    WebElement referToHomeSurplusNo;
    @FindBy(xpath = "//div[text()='Reason for not referring']/../../../..//input")
    WebElement reasonForNotReferringEl;
    @FindBy(xpath = "//div[text()='Additional Comments']/../../../..//textarea")
    WebElement additionalCommentsEl;
    @FindBy(xpath = "//div[contains(text(),'Select your general reason for decline')]/../../../..//input")
    WebElement generalReasonEl;
    @FindBy(xpath = "//div[contains(text(),'Does not meet our underwriting standards')]/../../../../../../../../../../../..//textarea")
    WebElement generalReasonCommentsEl;

    public void setReasonForEnding(String value, String generalReason, String generalReasonComments, String state) throws InterruptedException {
        typeTextEnter(reasonForEnding, value, "Reason For End Submission");
        if (state.equalsIgnoreCase("NY") || state.equalsIgnoreCase("FL")) {
            setGeneralReason(generalReason, generalReasonComments);
        }
    }

    public void setReferToHomeSurplus(String referToHomeSurplus, String reasonForNotReferring, String additionalComments, String generalReason, String generalReasonComments, String state) throws Throwable {
        choose(referToHomeSurplusYes, referToHomeSurplusNo, referToHomeSurplus, "Refer To Home Surplus");
        if (state.equalsIgnoreCase("NY") || state.equalsIgnoreCase("FL")) {
            setGeneralReason(generalReason, generalReasonComments);
            if (referToHomeSurplus.equalsIgnoreCase("Yes")) {
                pause(1000);
                clickEndSubmissionButton();
            }
        }
        if (!referToHomeSurplus.equalsIgnoreCase("Yes")) {
            typeTextEnter(reasonForNotReferringEl, reasonForNotReferring, "Reason For Not Referring");
            pause(1000);

            if (reasonForNotReferring.equalsIgnoreCase("Other - Please explain")) {
                typeTextEnter(additionalCommentsEl, additionalComments, "Additional Comments");
                if (state.equalsIgnoreCase("NY") || state.equalsIgnoreCase("FL")) {
                    setGeneralReason(generalReason, generalReasonComments);
                }
                pause(1000);
                clickEndSubmissionButton();
                //TODO Remove method when issue is fixed ^
            }
        }
    }

    public void setGeneralReason(String generalReason, String generalReasonComments) {
        typeTextEnter(generalReasonEl, generalReason, "General Reason");
        typeTextEnter(generalReasonCommentsEl, generalReasonComments, "General Reason Comments");
    }
}