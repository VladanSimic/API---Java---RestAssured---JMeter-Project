package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.ApplicationPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class ApplicationPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote application page")
    public void iFillOutApplicationPagePA() throws Throwable {
        new ApplicationPage(driver).fillApplicationPagePA(data);
    }

    @And("I fill out PA endorsement application page")
    public void iFillOutApplicationPagePA_END() throws Throwable {
        new ApplicationPage(driver).fillApplicationPagePA_END(data);
    }

    @And("I fill out PA quote application block")
    public void iFillOutApplicationBlockPA() throws Throwable {
        new ApplicationBlock(driver).fillApplicationDetailsPA(data);
    }

    @And("I fill out PA quote submit application block")
    public void iFillOutSubmitApplicationBlockPA() throws Throwable {
        new SubmitApplicationBlock(driver).fillSubmitApplicationDetailsPA(data);
    }

    @And("I fill out PA quote applications block")
    public void iFillOutApplicationsBlockPA() throws Throwable {
        new ApplicationsBlock(driver).fillApplicationsDetailsPA(data);
    }

    @And("I fill out PA quote form block")
    public void iFillOutFormBlockPA() throws Throwable {
        new FormsBlock(driver).fillFormsDetailsPA(data);
    }

    @And("I fill out PA quote submit form block")
    public void iFillOutSubmitFormBlockPA() throws Throwable {
        new SubmitFormsBlock(driver).fillSubmitFormsDetailsPA(data);
    }

    @And("I fill out PA quote received forms block")
    public void iFillOutReceivedFormsBlockPA() {
        new ReceivedFormsBlock(driver).fillReceivedFormsDetailsPA(data);
    }

    @And("I fill out PA endorsement application block")
    public void iFillOutApplicationBlockPA_END() throws Throwable {
        new ApplicationBlock(driver).fillApplicationDetailsPA_END(data);
    }

    @And("I fill out PA endorsement submit application block")
    public void iFillOutSubmitApplicationBlockPA_END() throws Throwable {
        new SubmitApplicationBlock(driver).fillSubmitApplicationDetailsPA_END(data);
    }

    @And("I fill out PA endorsement applications block")
    public void iFillOutApplicationsBlockPA_END() {
        new ApplicationsBlock(driver).fillApplicationsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement form block")
    public void iFillOutFormBlockPA_END() throws Throwable {
        new FormsBlock(driver).fillFormsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement submit form block")
    public void iFillOutSubmitFormBlockPA_END() throws Throwable {
        new SubmitFormsBlock(driver).fillSubmitFormsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement received forms block")
    public void iFillOutReceivedFormsBlockPA_END() {
        new ReceivedFormsBlock(driver).fillReceivedFormsDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    //Application block steps - START
    @And("I set application date received to {string}")
    public void iSetApplicationDateReceived(String value) {
        new ApplicationBlock(driver).setDateReceived(value);
    }

    @And("I set application accepted to {string}")
    public void iSetApplicationAccepted(String value) {
        new ApplicationBlock(driver).setApplicationAccepted(value);
    }

    @And("I set application signed application received to {string}")
    public void iSetApplicationSignedApplicationReceived(String value) throws Throwable {
        new ApplicationBlock(driver).setSignedApplicationReceived(value);
    }

    @And("I set Statement of Diligent Effort received to {string}")
    public void iSetStatementOfDiligentEffortToYes(String yesOrNo) throws Throwable {
        new ApplicationMandatoryFormsBlock(driver).fillStatementOfDiligent(yesOrNo);
    }
    //Application block steps - END

    //Forms block steps - START
    @And("I set form standard uw form date received to {string}")
    public void iSetFormDateReceived(String value) throws Throwable {
        new FormsBlock(driver).setSignedDriverExclusionReviewedAndAcceptedNo(value);
    }

    @And("I set form standard uw form reviewed and accepted to {string}")
    public void iSetFormReviewedAndAccepted(String value) throws Throwable {
        new FormsBlock(driver).setSignedStandardUMFormReviewedAndAccepted(value);
    }

    @And("I set form driver exclusion date received to {string}")
    public void iSetFormExclusionDateReceived(String value) {
        new FormsBlock(driver).setSignedDriverExclusionDateReceived(value);
    }

    @And("I set form driver exclusion reviewed and accepted to {string}")
    public void iSetFormExclusionReviewedAndAccepted(String value) throws Throwable {
        new FormsBlock(driver).setSignedDriverExclusionReviewedAndAcceptedNo(value);
    }
    //Forms block steps - END
    @And("I verify DocuSign document block")
    public void iVerifyDocuSignDocumentBlock(DataTable table) throws Throwable {
        new ApplicationPage(driver).verifyDocuSignDocumentApplication(table);
    }

}