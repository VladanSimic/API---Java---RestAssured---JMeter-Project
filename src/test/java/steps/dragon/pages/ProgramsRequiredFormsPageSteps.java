package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.ProgramsRequiredFormsPage;
import pages.RequiredFormsPage;
import pages.blocks.MemberApplicationAndAgreementsBlock;
import pages.blocks.RenewalProductSpecificFormToIncludeBlock;
import pages.blocks.SignaturePreferenceBlock;
import pages.blocks.eSignPackagesBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ProgramsRequiredFormsPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I populate and send DocuSign documents to member email {string}, producer email {string} and advisor email {string}")
    public void iPopulateAndSendDocuSignDocuments(String member, String producerEmail, String advisorEmail) throws Throwable {

        new SignaturePreferenceBlock(driver).fillSignaturePreferenceBlock(member, producerEmail, advisorEmail);
        new RequiredFormsPage(driver).generateDocuments();
        new CommonComponentsAndActions(driver).clickSendEmailSignature();
        pause(5);
    }

    @And("I send DocuSign documents without changing the emails")
    public void iSendDocuSignDocuments() throws Throwable {
        new RequiredFormsPage(driver).generateDocuments();
        new CommonComponentsAndActions(driver).clickSendEmailSignature();
        pause(5);
    }

    @And("I click checkbox for {string} document for eSign")
    public void iClickDocumentForESign(String document) {
        new MemberApplicationAndAgreementsBlock(driver).checkDocumentForESign(document);
    }

    @And("I click checkbox for {string} package for eSign")
    public void iClickPackageForESign(String document) {
        new MemberApplicationAndAgreementsBlock(driver).checkESignPackage(document);
    }

    @And("I verify member application and agreements block")
    public void verifyMemberApplicationAndAgreementsBlock(DataTable table) {
        new RenewalProductSpecificFormToIncludeBlock(driver).verifyMemberApplicationAndAgreementsBlock(table);
    }

    @And("I verify product specific forms to include block")
    public void verifyProductSpecificFormsToIncludeBlock(DataTable table) {
        new RenewalProductSpecificFormToIncludeBlock(driver).verifyProductSpecificFormsToIncludeBlock(table);
    }

    @And("I verify eSign packages block")
    public void verifyESignPackagesBlock(DataTable table) {
        new RenewalProductSpecificFormToIncludeBlock(driver).verifyESignPackagesBlock(table);
    }

    @And("I verify eSign signature invitation details Broker")
    public void verifyESignInvitationDetails(DataTable table) {
        new RenewalProductSpecificFormToIncludeBlock(driver).verifyESignInvitationDetails(table);
    }

    @And("I verify eSign signature invitation details Member")
    public void verifyESignInvitationDetailsMember(DataTable table) {
        new RenewalProductSpecificFormToIncludeBlock(driver).verifyESignInvitationDetailsMember(table);
    }

    @And("I verify eSign History block")
    public void verifyESignHistoryBlock(DataTable table) {
        new RenewalProductSpecificFormToIncludeBlock(driver).verifyESignHistoryBlock(table);
    }

    @And("I upload product specific forms for eSign {string}")
    public void verifyESignHistoryBlock(String eSign) throws Throwable {
        new ProgramsRequiredFormsPage(driver).fillOutDocuments(eSign);
    }

}
