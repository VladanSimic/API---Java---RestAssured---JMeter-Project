package pages.blocks;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class PrintAndMailDeliveryPreferenceBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public PrintAndMailDeliveryPreferenceBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[text()='Send the printed documents to the Member']/..//input")
    List<WebElement> sendThePrintedDocumentsToTheMember;
    @FindBy(xpath = "//div[contains(text(),'A valid Email address is required')]/../../../..//input")
    WebElement membersEmail;
    @FindBy(xpath = "//div[contains(text(),'Primary Phone Number')]/../../../..//input")
    WebElement membersPhone;
    @FindBy(xpath = "//div[contains(text(),'Agency Email Address')]/../../../..//input")
    List<WebElement> agencyEmail;

    public void fillPrintAndDeliveryOptions() throws Throwable {
        if (sendThePrintedDocumentsToTheMember.size() > 0) {
            clickElement(sendThePrintedDocumentsToTheMember.get(0));
        }
        pause(2000);
        if (!driver.findElements(By.xpath("//div[contains(text(),'Agency Email Address')]/../../../..//input")).isEmpty()) {
            typeText(agencyEmail.get(0), "patrick@pureinsurance.zcom");
        }
        Map<String, String> data = DataManager.getInstance().getData();
        String trackingEmail = data.get("Appraisal_Contact_Email");
        if (hasValue(trackingEmail)) {
            typeText(membersEmail, trackingEmail);
        } else {
            typeText(membersEmail, "pat@pureinsurance.zcom");
        }
        saveChanges();
        pause(4000);
        typeText(membersPhone, "1111111111");
    }
}