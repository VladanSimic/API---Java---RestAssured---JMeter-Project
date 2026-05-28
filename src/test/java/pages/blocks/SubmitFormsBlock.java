package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.EditAttachmentPage;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class SubmitFormsBlock extends CommonComponentsAndActions {

    WebDriver driver;
    EditAttachmentPage editAttachmentPage;

    public SubmitFormsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        editAttachmentPage = new EditAttachmentPage(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='upload']")
    WebElement upload;

    public void fillSubmitFormsDetailsPA(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Applications_Applications"))) {
            num = data.get("Applications_Applications").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickUpload();
            editAttachmentPage.addAttachmentPA(data, i);
        }
    }

    public void fillSubmitFormsDetailsPA_END(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Applications_Applications_END"))) {
            num = data.get("Applications_Applications_END").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickUpload();
            editAttachmentPage.addAttachmentPA(data, i);
        }
        //TODO PA END - Applications - Mid
    }

    public void fillSubmitFormsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Applications_Applications_OOS_END"))) {
            num = data.get("Applications_Applications_OOS_END").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickUpload();
            editAttachmentPage.addAttachmentPA(data, i);
        }
        //TODO PA OOS - Applications - Mid
    }

    public void fillSubmitFormsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Applications_Applications_RNW"))) {
            num = data.get("Applications_Applications_RNW").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickUpload();
            editAttachmentPage.addAttachmentPA(data, i);
        }
        //TODO PA RNW - Applications - Mid
    }

    public void clickUpload() {
        clickElement(upload, "Upload");
    }
}