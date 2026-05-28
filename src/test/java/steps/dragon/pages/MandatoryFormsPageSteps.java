package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.MandatoryFormsPage;
import pages.blocks.DocumentsBlock;
import pages.blocks.MandatoryFormsBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class MandatoryFormsPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the mandatory forms page for CC line of business")
    public void iFillMandatoryFormsPageCC() throws Throwable {
        new MandatoryFormsPage(driver).fillMandatoryFormsPageCC(data);
    }

    @And("I fill out the mandatory forms details for CC line of business")
    public void iFillMandatoryFormsDetailsCC() throws Throwable {
        new MandatoryFormsBlock(driver).fillMandatoryFormsDetailsCC(data);
    }

    @And("I fill out the mandatory forms document details for CC line of business")
    public void iFillDocumentDetailsCC() throws Throwable {
        new DocumentsBlock(driver).fillDocumentDetailsCC(data);
    }

    @And("I set the mandatory forms diligent effort form date received to {string}")
    public void setDiligentEffortFormDateReceived(String value) {
        new MandatoryFormsBlock(driver).setDiligentEffortFormDateReceived(value);
    }

    @And("I set the mandatory forms diligent effort form reviewed and accepted to {string}")
    public void setDiligentEffortFormReviewedAndAccepted(String value) {
        new MandatoryFormsBlock(driver).setDiligentEffortFormReviewedAndAccepted(value);
    }

    @And("I click the upload diligent effort form")
    public void clickUploadDiligentEffortForm() {
        new MandatoryFormsBlock(driver).clickUploadDiligentEffortForm();
    }

    @And("I verify that mandatory forms contents is {string}")
    public void iVerifyContents(String value) {
        new MandatoryFormsBlock(driver).verifyContents(value);
    }

    @And("I set the mandatory forms document name to {string}")
    public void setDocumentName(String value) {
        new MandatoryFormsBlock(driver).setDocumentName(value);
    }

    @And("I set the mandatory forms description to {string}")
    public void setDescription(String value) {
        new MandatoryFormsBlock(driver).setDescription(value);
    }

    @And("I set the mandatory forms internal use to {string}")
    public void setInternalUse(String value) {
        new MandatoryFormsBlock(driver).setInternalUse(value);
    }

    @And("I upload mandatory forms form {string}")
    public void upload(String value) throws Throwable {
        new MandatoryFormsBlock(driver).upload(value);
    }

    @And("I set the mandatory forms contract between member and GC date received to {string}")
    public void setContractBetweenMemberAndGCDateReceived(String value) {
        new MandatoryFormsBlock(driver).setContractBetweenMemberAndGCDateReceived(value);
    }

    @And("I set the mandatory forms contract between member and GC reviewed and accepted to {string}")
    public void setContractBetweenMemberAndGCReviewedAndAccepted(String value) {
        new MandatoryFormsBlock(driver).setContractBetweenMemberAndGCReviewedAndAccepted(value);
    }

    @And("I click the upload contract between member and GC form ")
    public void clickUploadContractBetweenMemberAndGCForm() {
        new MandatoryFormsBlock(driver).clickUploadContractBetweenMemberAndGCForm();
    }

    @And("I set the mandatory forms member application date received to {string}")
    public void setMemberApplicationDateReceived(String value) {
        new MandatoryFormsBlock(driver).setMemberApplicationDateReceived(value);
    }

    @And("I set the mandatory forms member application date reviewed and accepted to {string}")
    public void setMemberApplicationReviewedAndAccepted(String value) {
        new MandatoryFormsBlock(driver).setMemberApplicationReviewedAndAccepted(value);
    }

    @And("I click the upload member application form ")
    public void clickUploadMemberApplicationForm() {
        new MandatoryFormsBlock(driver).clickUploadMemberApplicationForm();
    }

    @And("I set the mandatory forms commercial general liability CGL certificate of insurance date received to {string}")
    public void setCommercialGeneralLiabilityCGLCertificateOfInsuranceDateReceived(String value) {
        new MandatoryFormsBlock(driver).setCommercialGeneralLiabilityCGLCertificateOfInsuranceDateReceived(value);
    }

    @And("I set the mandatory forms commercial general liability CGL certificate of insurance reviewed and accepted to {string}")
    public void setCommercialGeneralLiabilityCGLCertificateOfInsuranceReviewedAndAccepted(String value) {
        new MandatoryFormsBlock(driver).setCommercialGeneralLiabilityCGLCertificateOfInsuranceReviewedAndAccepted(value);
    }

    @And("I click the upload commercial general liability CGL certificate of insurance Form ")
    public void clickUploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm() {
        new MandatoryFormsBlock(driver).clickUploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm();
    }
}