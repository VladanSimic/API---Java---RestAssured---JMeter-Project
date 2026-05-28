package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.MemberApplicationAndAgreementsBlock;
import pages.blocks.SignaturePreferenceBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class ProgramsRequiredFormsPage extends CommonComponentsAndActions {
    WebDriver driver;
    SignaturePreferenceBlock signaturePreferenceBlock;
    MemberApplicationAndAgreementsBlock memberApplicationAndAgreementsBlock;
    EditAttachmentPage editAttachmentPage;

    public ProgramsRequiredFormsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        signaturePreferenceBlock = new SignaturePreferenceBlock(driver);
        memberApplicationAndAgreementsBlock = new MemberApplicationAndAgreementsBlock(driver);
        editAttachmentPage = new EditAttachmentPage(driver);
    }


    public void fillOutDocuments(String eSignPackage) throws Throwable {
//        navigateToCustomerPage();
        pause(3000);
        iClickSelected("programs required forms");
        pause(5000);

        List<WebElement> packageElements = driver.findElements(By.xpath("//*[contains(text(),'" + eSignPackage + "')]/../../td[6]"));

        for (int i = 0; i < packageElements.size(); i++) {

            memberApplicationAndAgreementsBlock.checkESignPackage(eSignPackage);
            iClickSelected("manually upload");
            pause(3500);

            List<WebElement> documentList = driver.findElements(By.xpath("//input[@type='checkbox']"));
            List<WebElement> documentVerified = driver.findElements(By.xpath("//*[text()='Manually Uploaded Signed Document']/../../../../../../../../../..//td[3]/div"));
            List<WebElement> documentTypes = driver.findElements(By.xpath("//*[text()='Manually Uploaded Signed Document']/../../../../../../../../../..//td[2]/div"));

            if (documentList.size() <= i || documentVerified.size() <= i || documentTypes.size() <= i) {
                failAssertion("Document list size mismatch. Expected at least " + (i + 1) + " items.");
            }

            WebElement checkbox = documentList.get(i);
            WebElement verifyField = documentVerified.get(i);
            String docTypeText = documentTypes.get(i).getText().trim();

            String path = getFilePathForDocument(docTypeText);
            typeTextFast(verifyField, "Yes", "Reviewed and Accepted.");
            clickFooter();
            pause(500);

            clickElement(checkbox);
            pause(500);
            clickFooter();

            List<WebElement> optOutButton = driver.findElements(By.xpath("//*[text()='"+docTypeText+"']/.././../../..//td[5]/div//input[2]"));
            WebElement optOut = optOutButton.get(0);

            clickElement(optOut);
            pause(500);
            clickFooter();

            editAttachmentPage.clickUploadFile();
            driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);

            pause(2000);
            editAttachmentPage.clickUpload();
            pause(2000);
            clickOK();
            pause(2000);
            saveChanges();
        }
    }

    public String getFilePathForDocument(String docTypeText) {
        String basePath = System.getProperty("user.dir").replace("\\", "/") + "/src/test/test_data/upload/";

        if (docTypeText.contains("BindRequestDocuSign")) {
            return basePath + "BindRequest.pdf";
        } else if (docTypeText.contains("StatementOfDiligentEffortForm")) {
            return basePath + "DE.pdf";
        } else if (docTypeText.contains("Renewal Offer")) {
            return basePath + "RenewalOffer.pdf";
        } else if (docTypeText.contains("PURE Specialty Exchange Membership Agreement")) {
            return basePath + "PSE.pdf";
        } else {
            return basePath + "dummyUpload.pdf"; //default
        }
    }


}