package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

public class EditAttachmentPage extends CommonComponentsAndActions {

    WebDriver driver;

    public EditAttachmentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Document Name (appears as name on document link)']/../../../../div//input")
    WebElement documentNameInput;
    @FindBy(xpath = "//div[text()='Description']/../../../..//textarea")
    WebElement descriptionField;
    @FindBy(xpath = "//div[text()='Internal Use']/../../../../div//input")
    WebElement internalUse;
    @FindBy(xpath = "//div[text()='Contents']/../../../../div//input")
    WebElement contents;
    @FindBy(xpath = "//div[text()='Subscription agreement is signed and complete?']/../../../../div//input")
    List<WebElement> subscriptionAgreementSignedAndComplete;
    @FindBy(xpath = "//div[text()='PSE Membership Agreement is signed and complete?']/../../../../div//input")
    List<WebElement> PSEAgreementSignedAndComplete;
    @FindBy(xpath = "//span[text()='File Upload']")
    WebElement uploadFile;
    @FindBy(xpath = "//input[@name=\"fName\"]")
    WebElement fileUploadPath;
    @FindBy(xpath = "//span[text()='Upload']")
    WebElement upload;
    @FindBy(xpath = "//span[text()='OK']")
    WebElement ok;
    @FindBy(xpath = "//input[contains(@osviewid,'browse')]/..")
    WebElement browse;
    @FindBy(css = "#filefield-10098-inputEl")
    WebElement inputFile;
    @FindBy(xpath = "//div[text()='Effective Date']/../../../../div//input")
    WebElement effectiveDateField;
    @FindBy(xpath = "//div[text()='Expiration Date']/../../../../div//input")
    WebElement expirationDateField;

    public void addAttachment(Map<String, String> data) throws Throwable {
        setDocumentName("DocName");
        setDescription("Description");
        if (hasValue(data.get("Admitted_Line")) &&
                !data.get("Admitted_Line").equalsIgnoreCase("Home Surplus Lines")) {
            try {
                setInternalUse("Yes");
                setPSEAgreementSignedAndComplete("Yes");
                setSubscriptionAgreementSignedAndComplete("Yes");
            } catch (Exception e) {
                //
            }
        } else {
            //CA state for HS has two additional cells eff and exp date for two of 4 application forms
            setPSEAgreementSignedAndComplete("Yes");
            if (data.get("State").equalsIgnoreCase("CA")) {
                if (driver.findElements(By.xpath("//div[text()='Contents']/../../../../div//input")).size() > 0 &&
                        driver.findElements(By.xpath("//div[text()='Contents']/../../../../div//input")).get(0).getAttribute("value").equalsIgnoreCase("SL-1 CA Confidential Report of Placement") ||
                        (driver.findElements(By.xpath("//div[text()='Contents']/../../../../div//input")).size() > 0 && driver.findElements(By.xpath("//div[text()='Contents']/../../../../div//input")).get(0).getAttribute("value").equalsIgnoreCase("D-1 CA Freestanding Disclosure Statement"))) {
                    setEffectiveDate(data.get("Effective_Date"));
                    setExpirationDate(data.get("Endorsement_Effective_Date"));
                }
            }
        }
//        clickUploadFile();
//        clickBrowse();
//        String path = System.getProperty("user.dir").replace("\\", "/") + "/environments/prod/src/test/test_data/upload/dummyUpload.pdf";
//        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);

//        pause(5000);
//        clickUpload();
        pause(2000);
        saveChanges();
        pause(2000);
        clickExit();
        pause(2000);
        clickOK();
    }

    public void setDocumentName(String docName) throws Throwable {
        if (isElementDisplayed(documentNameInput)) {
            typeText(documentNameInput, docName);
        }
    }

    public void setApplicationContents(String s) {
        typeTextEnter(contents, s, "Application Contents");
    }

    public void setEffectiveDate(String effectiveDate) throws Throwable {
        typeText(effectiveDateField, effectiveDate);
    }

    public void setExpirationDate(String expirationDate) throws Throwable {
        typeText(expirationDateField, expirationDate);
    }

    public void setDescription(String description) throws Throwable {
        if (isElementDisplayed(descriptionField)) {
            typeText(descriptionField, description);
        }
    }

    public void setInternalUse(String value) throws Throwable {
        if (isElementDisplayed(internalUse)) {
            typeText(internalUse, "Yes");
        }
        //setAttributeValue(internalUse,"value",value);
    }

    public void setSubscriptionAgreementSignedAndComplete(String value) throws Throwable {
        pause(3000);
        if (subscriptionAgreementSignedAndComplete.size() > 0) {
            typeText(subscriptionAgreementSignedAndComplete.get(0), "Yes");
            //setAttributeValue(subscriptionAgreementSignedAndComplete,"value",value);
        }
    }

    public void setPSEAgreementSignedAndComplete(String value) throws Throwable {
        pause(3000);
        if (PSEAgreementSignedAndComplete.size() > 0) {
            typeText(PSEAgreementSignedAndComplete.get(0), value);
        }
    }

    public void clickUploadFile() throws Throwable {
        if(isElementDisplayed(uploadFile)) {
            clickElement(uploadFile);
        }
    }

    public void setFileToBeUploaded() {

    }

    public void clickBrowse() throws Throwable {
        clickElement(browse);
        pause(5000);
        Robot rb = new Robot();
        StringSelection str = new StringSelection("C:\\Users\\astojanovic\\Desktop\\Test.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    public void clickUpload() throws Throwable {
        clickElement(upload);
    }

    public void clickOK() throws Throwable {
        try {
            clickElement(ok);
        } catch (Exception e) {
            //
        }
    }

    public void upload(String value) throws Throwable {
        if (hasValue(value)) {
            if(isElementPresentByXPath("//input[@type='file']")) {
                String path = System.getProperty("user.dir").replace("\\", "/") + "/src/test/test_data/upload/" + value;
                driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
                pause(3000);
                clickUpload();
                clickOK();
                saveChanges();
            }
        }
    }

    public void addAttachmentPA(Map<String, String> data, int i) throws Throwable {
        setApplicationContents(data.get("Applications_Contents_" + i));
        setDocumentName(data.get("Applications_Document_Name_" + i));
        setInternalUse(data.get("Applications_Internal_Use_" + i));
        setDescription(data.get("Applications_Description_" + i));
        clickUploadFile();
        upload(data.get("Applications_File_" + i));
    }

    public void addAttachmentEX(Map<String, String> data) throws Throwable {
        setDocumentName(data.get("Applications_Document_Name"));
        setInternalUse(data.get("Applications_Internal_Use"));
        setDescription(data.get("Applications_Description"));
        clickUploadFile();
        upload(data.get("Applications_File"));
    }
}