package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.MemberApplicationAndAgreementsBlock;
import pages.blocks.SignaturePreferenceBlock;

public class RequiredFormsPage extends CommonComponentsAndActions {
    WebDriver driver;
    SignaturePreferenceBlock signaturePreferenceBlock;
    MemberApplicationAndAgreementsBlock memberApplicationAndAgreementsBlock;

    public RequiredFormsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        signaturePreferenceBlock = new SignaturePreferenceBlock(driver);
        memberApplicationAndAgreementsBlock = new MemberApplicationAndAgreementsBlock(driver);
    }

    @FindBy(xpath = "//span[text()='generate forms and continue to esign email']")
    WebElement generateDocuments;
    @FindBy(xpath = "//span[text()='summary']")
    WebElement summary;

    public void generateDocuments() throws Throwable {
        clickElement(generateDocuments);
        pause(3500);
    }

    public void fillSignaturePreferenceAndUpload() throws Throwable {
        signaturePreferenceBlock.fillOptOutElectronicDelivery();
        signaturePreferenceBlock.fillSignaturePreferenceNoReminder("member@email.com", "broker@email.com");
        memberApplicationAndAgreementsBlock.upload();
    }

    public void goToSummary() throws Throwable {
        clickElement(summary);
    }
}