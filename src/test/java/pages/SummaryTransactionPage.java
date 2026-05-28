package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

public class SummaryTransactionPage extends CommonComponentsAndActions {
    WebDriver driver;

    public SummaryTransactionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Refer to PURE Programs?']/../../../..//div[text()='Yes']")
    WebElement referToPureYes;
    @FindBy(xpath = "//div[text()='Refer to PURE Programs?']/../../../..//div[text()='No']")
    WebElement referToPureNo;
    @FindBy(xpath = "//div[text()='Reason for not referring']/../../../..//div[text()='Other - Please explain']")
    WebElement reasonForNotReferring;
    @FindBy(xpath = "//div[text()='Additional Comments']/../../../..//div[text()='Test1'] | //div[text()='Additional Comments']/../../../..//textarea")
    WebElement additionalComments;


    public void verifyThatReferToPureProgramsYesIsDisplayOnSummaryPolicyTransaction() {
        Assert.assertEquals(referToPureYes.getText(), "Yes");
        reportScreenshot("SummaryPolicyTransaction" + System.currentTimeMillis(), "Summary policy transaction");
    }

    public void verifyThatReferToPureProgramsNoIsDisplayOnSummaryPolicyTransaction() {
        Assert.assertEquals(referToPureNo.getText(), "No");
        reportScreenshot("SummaryPolicyTransaction" + System.currentTimeMillis(), "Summary policy transaction");
    }

    public void verifyThatReasonForNotReferringIsDisplayOnSummaryPolicyTransaction() {
        Assert.assertEquals(reasonForNotReferring.getText(), "Other - Please explain");
    }

    public void verifyThatAdditionalCommentsIsDisplayOnSummaryPolicyTransaction() {
        Assert.assertEquals(additionalComments.getText(), "Test1");
    }
}