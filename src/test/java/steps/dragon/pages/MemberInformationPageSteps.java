package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.MemberInformationPage;
import pages.blocks.AppraisalInformationBlock;
import pages.blocks.MemberInformationBlock;
import pages.blocks.PolicyInformationBlock;
import pages.blocks.ProjectManagerContactInformationBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class MemberInformationPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote member information page")
    public void iFillOutMemberInformationPagePA() throws Throwable {
        new MemberInformationPage(driver).fillMemberInformationPagePA(data);
    }

    @And("I fill out PA endorsement member information page")
    public void iFillOutMemberInformationPagePA_END() throws Throwable {
        new MemberInformationPage(driver).fillMemberInformationPagePA_END(data);
    }

    @And("I fill out PA quote member information block")
    public void iFillOutMemberInformationBlock() throws Throwable {
        new MemberInformationBlock(driver).fillOutMemberInformationDetailsPA(data);
    }

    @And("I fill out PA endorsement member information block")
    public void iFillOutMemberInformationBlock_END() throws Throwable {
        new MemberInformationBlock(driver).fillOutMemberInformationDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    // Member information block steps - START
    @And("I set member information existing agency client to {string}")
    public void iSetMemberInformationExistingAgencyClient(String value) throws Throwable {
        new MemberInformationBlock(driver).setExistingAgencyClient(value);
    }

    @And("I set member information cancelled or refused to {string}")
    public void iSetMemberInformationCancelledOrRefused(String value) throws Throwable {
        new MemberInformationBlock(driver).setCancelledOrRefused(value);
    }

    @And("I set member information has coverage been non renewed or declined to {string}")
    public void iSetMemberInformationHasCoverageBeenNonRenewedOrDeclined(String value) throws Throwable {
        new MemberInformationBlock(driver).setHasCoverageBeenNonRenewedOrDeclined(value);
    }
    // Member information block  steps - END


    @And("I fill out the member in formation Page for CC line of business")
    public void iFillMemberInformationPageCC() throws Throwable {
        new MemberInformationPage(driver).fillMemberInformationPageCC(data);
    }

    @And("I fill out the member in formation detail for CC line of business")
    public void iFillOutMemberInformationDetailCC() throws Throwable {
        new MemberInformationBlock(driver).fillOutMemberInformationDetailCC(data);
    }

    @And("I fill out the appraisal information detail for CC line of business")
    public void iFillAppraisalInformationDetailCC() throws Throwable {
        new AppraisalInformationBlock(driver).fillAppraisalInformationDetailCC(data);
    }

    @And("I fill out the project manager concat information details for CC line of business")
    public void iFillProjectManagerConcatInformationDetailsCC() throws Throwable {
        new ProjectManagerContactInformationBlock(driver).fillProjectManagerConcatInformationDetailsCC(data);
    }

    @And("I verify that member information member occupation is {string}")
    public void iVerifyLandUseDensityClass(String value) {
        new MemberInformationBlock(driver).verifyMemberOccupation(value);
    }

    @And("I verify that member information member employer is {string}")
    public void iVerifyMemberEmployer(String value) {
        new MemberInformationBlock(driver).verifyMemberEmployer(value);
    }

    @And("I set member information has coverage been non renewed or cancelled to {string}")
    public void setHasCoverageBeenNonRenewedOrCanceled(String value) throws Throwable {
        new MemberInformationBlock(driver).setHasCoverageBeenNonRenewedOrDeclined(value);
    }

    @And("I set member information does the insured keep one or more dangerous dogs to {string}")
    public void setDoesTheInsuredKeepOneOrMoreDangerousDogs(String value) throws Throwable {
        new MemberInformationBlock(driver).setDoesTheInsuredKeepOneOrMoreDangerousDogs(value);
    }

    @And("I set appraisal information waive appraisal to {string}")
    public void setWaiveAppraisal(String value) throws Throwable {
        new AppraisalInformationBlock(driver).setWaiveAppraisal(value);
    }

    @And("I set appraisal information contact name to {string}")
    public void setContactName(String value) throws Throwable {
        new AppraisalInformationBlock(driver).setContactName(value);
    }

    @And("I set appraisal information contact email to {string}")
    public void setContactEmail(String value) throws Throwable {
        new AppraisalInformationBlock(driver).setContactEmail(value);
    }

    @And("I set appraisal information contact phone number to {string}")
    public void setContactPhoneNumber(String value) throws Throwable {
        new AppraisalInformationBlock(driver).setContactPhoneNumber(value);
    }

    @And("I set appraisal information on site inspection completed to {string}")
    public void setOnSiteInspectionCompleted(String value) throws Throwable {
        new AppraisalInformationBlock(driver).setOnSiteInspectionCompleted(value);
    }

    @And("I set appraisal information require appraisal comments to {string}")
    public void setRequireAppraisalComments(String value) throws Throwable {
        new AppraisalInformationBlock(driver).setRequireAppraisalComments(value);
    }

    @And("I set project manager contact information first name to {string}")
    public void setFirstName(String value) {
        new ProjectManagerContactInformationBlock(driver).setFirstName(value);
    }

    @And("I set project manager contact information last name to {string}")
    public void setLastName(String value) {
        new ProjectManagerContactInformationBlock(driver).setLastName(value);
    }

    @And("I set project manager contact information email address to {string}")
    public void setEmailAddress(String value) {
        new ProjectManagerContactInformationBlock(driver).setEmailAddress(value);
    }

    @And("I set project manager contact information phone number to {string}")
    public void setPhoneNumber(String value) {
        new ProjectManagerContactInformationBlock(driver).setPhoneNumber(value);
    }

    @And("I verify that LC360 Timestamp is not empty")
    public void verifyLCTimeStamp() {
        new AppraisalInformationBlock(driver).checkTimestamp();
    }

}