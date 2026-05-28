package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class AppraisalInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AppraisalInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Require appraisal comments:']/../../../../div//textarea")
    WebElement requireAppraisalComments;
    @FindBy(xpath = "//div[text()='Contact Name']/../../../../div//input")
    WebElement contactName;
    @FindBy(xpath = "//div[text()='Contact Email']/../../../../div//input")
    WebElement contactEmail;
    @FindBy(xpath = "//div[text()='Contact Phone Number']/../../../../div//input")
    WebElement contactPhoneNumber;
    @FindBy(xpath = "//label[contains(text(),'on-site inspection completed')]/..//input")
    WebElement onSiteInspectionCompleted;
    @FindBy(xpath = "//label[text()='Re-order on-site appraisal']/..//input")
    WebElement reOrderOnSiteAppraisal;
    @FindBy(xpath = "//div[text()='Waive appraisal?']/../../../..//label[text()='Yes']/..//input")
    WebElement appraisalYes;
    @FindBy(xpath = "//div[text()='Waive appraisal?']/../../../..//label[text()='No']/..//input")
    WebElement appraisalNo;
    @FindBy(xpath = "//td//div[text()='Last Updated Timestamp ']//../../../..//div[@aria-readonly='true']")
    WebElement lastUpdatedTimestampValue;
    @FindBy(xpath = "//div[contains(text(),'PURE360 Consultation is needed has failed') and @style='display:inline']")
    List<WebElement> lc360FailedMessage;

    public void fillOutAppraisalInformation(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line"));
        try {
            if (!hasValue(USER) || !USER.equalsIgnoreCase("BROKER")) {
            setRequireAppraisalComments(data.get("Appraisal_Comment"));
            }
            setContactName(data.get("Appraisal_Contact_Name"));
            setContactEmail(data.get("Appraisal_Contact_Email"));
            setContactPhoneNumber(data.get("Appraisal_Contact_Phone"));
        } catch (Exception e){}
    }

    public void fillOutAppraisalInformation_END(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line_END"));
        setRequireAppraisalComments(data.get("Appraisal_Comment_END"));
        setContactName(data.get("Appraisal_Contact_Name_END"));
        setContactEmail(data.get("Appraisal_Contact_Email_END"));
        setContactPhoneNumber(data.get("Appraisal_Contact_Phone_END"));
    }

    public void fillOutAppraisalInformation_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line_OOS_END"));
        setRequireAppraisalComments(data.get("Appraisal_Comment_OOS_END"));
        setContactName(data.get("Appraisal_Contact_Name_OOS_END"));
        setContactEmail(data.get("Appraisal_Contact_Email_OOS_END"));
        setContactPhoneNumber(data.get("Appraisal_Contact_Phone_OOS_END"));
    }

    public void fillOutAppraisalInformation_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line_RNW"));
        setRequireAppraisalComments(data.get("Appraisal_Comment_RNW"));
        setContactName(data.get("Appraisal_Contact_Name_RNW"));
        setContactEmail(data.get("Appraisal_Contact_Email_RNW"));
        setContactPhoneNumber(data.get("Appraisal_Contact_Phone_RNW"));
    }

    public void fillOutAppraisalInformation(Map<String, String> data, int i) throws Throwable {
        setRequireAppraisalComments(data.get("Appraisal_Comment_" + i));
        setContactName(data.get("Appraisal_Contact_Name_" + i));
        setContactEmail(data.get("Appraisal_Contact_Email_" + i));
        setContactPhoneNumber(data.get("Appraisal_Contact_Phone_" + i));
    }

    public void setRequireAppraisalComments(String comment) throws Throwable {
        typeText(requireAppraisalComments, comment);
    }

    public void setContactName(String name) throws Throwable {
        typeText(contactName, name);
    }

    public void setContactEmail(String email) throws Throwable {
        typeText(contactEmail, email);
    }

    public void setContactPhoneNumber(String phone) throws Throwable {
        typeText(contactPhoneNumber, phone);
    }

    public void fillAppraisalInformationDetailCC(Map<String, String> data) throws Throwable {
        String waiveAppraisal = data.get("Appraisal_Information_Waive_Appraisal");
        verifyBlockExists(data.get("Admitted_Line"));
        setWaiveAppraisal(waiveAppraisal);
        setContactName(data.get("Appraisal_Information_Contact_Name"));
        setContactEmail(data.get("Appraisal_Information_Contact_Email"));
        setContactPhoneNumber(data.get("Appraisal_Information_Contact_Phone_Number"));
        if (hasValue(waiveAppraisal) && waiveAppraisal.equalsIgnoreCase("No")) {
            setOnSiteInspectionCompleted(data.get("Appraisal_Information_On_Site_Inspection_Completed"));
            setRequireAppraisalComments(data.get("Appraisal_Information_Require_Appraisal_Comments"));
        }
        saveChanges();
    }

    public void fillAppraisalInformationDetailCC_END(Map<String, String> data) throws Throwable {
        setWaiveAppraisal(data.get("Appraisal_Information_Waive_Appraisal_END"));
        setContactName(data.get("Appraisal_Information_Contact_Name_END"));
        setContactEmail(data.get("Appraisal_Information_Contact_Email_END"));
        setContactPhoneNumber(data.get("Appraisal_Information_Contact_Phone_Number_END"));
        if (hasValue(data.get("Appraisal_Information_Waive_Appraisal_END")) && data.get("Appraisal_Information_Waive_Appraisal_END").equalsIgnoreCase("No")) {
            setOnSiteInspectionCompleted(data.get("Appraisal_Information_On_Site_Inspection_Completed_END"));
            setRequireAppraisalComments(data.get("Appraisal_Information_Require_Appraisal_Comments_END"));
        }
        reOrderOnSiteAppraisal(data.get("Appraisal_Information_Require_Appraisal_Re_Order_On_Site_Appraisal_END"));
        saveChanges();
    }

    public void setOnSiteInspectionCompleted(String value) throws Throwable {
        checkCheckbox(onSiteInspectionCompleted, value, "On site inspection completed");
    }

    public void reOrderOnSiteAppraisal(String value) throws Throwable {
        checkCheckbox(reOrderOnSiteAppraisal, value, "Re order on site appraisal");
    }

    public void setWaiveAppraisal(String value) throws Throwable {
        try {
            choose(appraisalYes, appraisalNo, value, "Waive appraisal");
        } catch (Exception e) {

        }
    }

    public void checkTimestamp() {
        assertContains(lastUpdatedTimestampValue.getText(), "EST", "Last UpdatedTimestamp");
    }

    public void failIfLC360FailedMessageIsPresent() {
        if (lc360FailedMessage.size() != 0)
            Assert.fail("LC360 Call Failed");
    }

    public void fillAppraisalInformationDetailHS(Map<String, String> data) throws Throwable {
        String waiveAppraisal = data.get("Appraisal_Information_Waive_Appraisal");

        verifyBlockExists(data.get("Admitted_Line"));
        setWaiveAppraisal(waiveAppraisal);
        setOnSiteInspectionCompleted(data.get("Appraisal_Information_Inspection_Completed"));
        if (hasValue(data.get("Appraisal_Information_Inspection_Completed")) && data.get("Appraisal_Information_Inspection_Completed").equalsIgnoreCase("Yes"))
            setRequireAppraisalComments(data.get("Appraisal_Information_Appraisal_Comments"));
        setContactName(data.get("Appraisal_Information_Contact_Name"));
        setContactEmail(data.get("Appraisal_Information_Contact_Email"));
        setContactPhoneNumber(data.get("Appraisal_Information_Contact_Phone_Number"));
        saveChanges();
    }

    public void fillAppraisalInformationDetailHS_END(Map<String, String> data) throws Throwable {
        String waiveAppraisal = data.get("Appraisal_Information_Waive_Appraisal_END");

        setWaiveAppraisal(waiveAppraisal);
        setContactName(data.get("Appraisal_Information_Contact_Name_END"));
        setContactEmail(data.get("Appraisal_Information_Contact_Email_END"));
        setContactPhoneNumber(data.get("Appraisal_Information_Contact_Phone_Number_END"));
        saveChanges();
    }

    public void fillAppraisalInformationDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        String waiveAppraisal = data.get("Appraisal_Information_Waive_Appraisal_OOS_END");

        setWaiveAppraisal(waiveAppraisal);
        setContactName(data.get("Appraisal_Information_Contact_Name_OOS_END"));
        setContactEmail(data.get("Appraisal_Information_Contact_Email_OOS_END"));
        setContactPhoneNumber(data.get("Appraisal_Information_Contact_Phone_Number_OOS_END"));
        saveChanges();
    }

    public void fillAppraisalInformationDetailHS_RNW(Map<String, String> data) throws Throwable {
        String waiveAppraisal = data.get("Appraisal_Information_Waive_Appraisal_RNW");

        setWaiveAppraisal(waiveAppraisal);
        setContactName(data.get("Appraisal_Information_Contact_Name_RNW"));
        setContactEmail(data.get("Appraisal_Information_Contact_Email_RNW"));
        setContactPhoneNumber(data.get("Appraisal_Information_Contact_Phone_Number_RNW"));
        saveChanges();
    }

    @Override
    public void verifyBlockExists(String lob) throws Throwable {
        if (!lob.equalsIgnoreCase("Collection"))
            super.verifyBlockExists("appraisal information");
    }

    public void fillAppraisalInformationDetailFS(Map<String, String> data) {

    }


}