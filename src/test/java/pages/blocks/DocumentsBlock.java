package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class DocumentsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public DocumentsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillDocumentDetailsCC(Map<String, String> data) throws Throwable {
        // TODO CC
        verifyBlockExists("documents");
        saveChanges();
    }

    public void fillDocumentDetailsCC_END(Map<String, String> data) throws Throwable {
        // TODO CC
        saveChanges();
    }

    public void fillDocumentDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("documents");
        // TODO HS
    }

    public void fillDocumentDetailsHS_END(Map<String, String> data) {
        // TODO HS
    }

    public void fillDocumentDetailsHS_OOS_END(Map<String, String> data) {
        // TODO HS
    }

    public void fillDocumentDetailsHS_RNW(Map<String, String> data) {
        // TODO HS
    }

    public void fillDocumentDetailsFS(Map<String, String> data) throws Throwable {
        verifyBlockExists("documents");
    }
}