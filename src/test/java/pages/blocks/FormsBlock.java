package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class FormsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public FormsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Signed Standard UM Form']/../../../../../../../../../../..//input[@role]")
    WebElement signedStandardUMFormDateReceived;
    @FindBy(xpath = "//div[text()='Signed Standard UM Form']/../../../../../../../../../../..//input/../../..//label[text()='No']/..//input")
    WebElement signedStandardUMFormReviewedAndAcceptedNo;
    @FindBy(xpath = "//div[text()='Signed Standard UM Form']/../../../../../../../../../../..//input/../../..//label[text()='Yes']/..//input")
    WebElement signedStandardUMFormReviewedAndAcceptedYes;
    @FindBy(xpath = "//div[text()='Signed Driver Exclusion']/../../../../../../../../../../..//input[@role]")
    WebElement signedDriverExclusionDateReceived;
    @FindBy(xpath = "//div[text()='Signed Driver Exclusion']/../../../../../../../../../../..//input/../../..//label[text()='No']/..//input")
    WebElement signedDriverExclusionReviewedAndAcceptedNo;
    @FindBy(xpath = "//div[text()='Signed Driver Exclusion']/../../../../../../../../../../..//input/../../..//label[text()='Yes']/..//input")
    WebElement signedDriverExclusionReviewedAndAcceptedYes;

    public void fillFormsDetailsPA(Map<String, String> data) throws Throwable {
        setSignedStandardUMFormDateReceived(data.get("Forms_Signed_Standard_UM_Form_Date_Received"));
        setSignedStandardUMFormReviewedAndAccepted(data.get("Forms_Signed_Standard_UM_Form_Reviewed_And_Accepted"));
        setSignedDriverExclusionDateReceived(data.get("Forms_Signed_Driver_Exclusion_Date_Received"));
        setSignedDriverExclusionReviewedAndAcceptedNo(data.get("Forms_Signed_Driver_Exclusion_Reviewed_And_Accepted"));
    }

    public void fillFormsDetailsPA_END(Map<String, String> data) throws Throwable {
        setSignedStandardUMFormDateReceived(data.get("Forms_Signed_Standard_UM_Form_Date_Received_END"));
        setSignedStandardUMFormReviewedAndAccepted(data.get("Forms_Signed_Standard_UM_Form_Reviewed_And_Accepted_END"));
        setSignedDriverExclusionDateReceived(data.get("Forms_Signed_Driver_Exclusion_Date_Received_END"));
        setSignedDriverExclusionReviewedAndAcceptedNo(data.get("Forms_Signed_Driver_Exclusion_Reviewed_And_Accepted_END"));
    }

    public void fillFormsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setSignedStandardUMFormDateReceived(data.get("Forms_Signed_Standard_UM_Form_Date_Received_OOS_END"));
        setSignedStandardUMFormReviewedAndAccepted(data.get("Forms_Signed_Standard_UM_Form_Reviewed_And_Accepted_OOS_END"));
        setSignedDriverExclusionDateReceived(data.get("Forms_Signed_Driver_Exclusion_Date_Received_OOS_END"));
        setSignedDriverExclusionReviewedAndAcceptedNo(data.get("Forms_Signed_Driver_Exclusion_Reviewed_And_Accepted_OOS_END"));
    }

    public void fillFormsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setSignedStandardUMFormDateReceived(data.get("Forms_Signed_Standard_UM_Form_Date_Received_RNW"));
        setSignedStandardUMFormReviewedAndAccepted(data.get("Forms_Signed_Standard_UM_Form_Reviewed_And_Accepted_RNW"));
        setSignedDriverExclusionDateReceived(data.get("Forms_Signed_Driver_Exclusion_Date_Received_RNW"));
        setSignedDriverExclusionReviewedAndAcceptedNo(data.get("Forms_Signed_Driver_Exclusion_Reviewed_And_Accepted_RNW"));
    }

    public void setSignedStandardUMFormDateReceived(String s) {
        typeTextEnter(signedStandardUMFormDateReceived, s, "Signed Standard UM Form Date Received");
    }

    public void setSignedDriverExclusionDateReceived(String s) {
        typeTextEnter(signedDriverExclusionDateReceived, s, "Signed Driver Exclusion Date Received");
    }

    public void setSignedStandardUMFormReviewedAndAccepted(String s) throws Throwable {
        choose(signedStandardUMFormReviewedAndAcceptedYes, signedStandardUMFormReviewedAndAcceptedNo, s, "Signed Standard UM Form Reviewed And Accepted");
    }

    public void setSignedDriverExclusionReviewedAndAcceptedNo(String s) throws Throwable {
        choose(signedDriverExclusionReviewedAndAcceptedYes, signedDriverExclusionReviewedAndAcceptedNo, s, "Signed Driver Exclusion Reviewed And Accepted");
    }
}