package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.DocumentsBlock;
import pages.blocks.MandatoryFormsBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class MandatoryFormsPage extends CommonComponentsAndActions {
    WebDriver driver;
    MandatoryFormsBlock mandatoryFormsBlock;
    DocumentsBlock documentsBlock;

    public MandatoryFormsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        mandatoryFormsBlock = new MandatoryFormsBlock(driver);
        documentsBlock = new DocumentsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillMandatoryFormsPageCC(Map<String, String> data) throws Throwable {
        goToPage("Mandatory Forms");
        mandatoryFormsBlock.fillMandatoryFormsDetailsCC(data);
        documentsBlock.fillDocumentDetailsCC(data);
    }

    public void fillMandatoryFormsPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Mandatory Forms");
        mandatoryFormsBlock.fillMandatoryFormsDetailsCC_END(data);
        documentsBlock.fillDocumentDetailsCC_END(data);
    }

    public void fillMandatoryFormsPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillMandatoryFormsPageFS(Map<String, String> data) throws Throwable {
        goToPage("Mandatory Forms");
        mandatoryFormsBlock.fillMandatoryFormsDetailsFS();
        documentsBlock.fillDocumentDetailsFS(data);
    }
}
