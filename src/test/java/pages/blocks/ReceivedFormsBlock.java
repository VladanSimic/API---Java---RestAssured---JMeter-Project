package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.EditAttachmentPage;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ReceivedFormsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ReceivedFormsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillReceivedFormsDetailsPA(Map<String, String> data) {
        //TODO PA NB - Received forms - Low
    }

    public void fillReceivedFormsDetailsPA_END(Map<String, String> data) {
        //TODO PA END - Received forms - Low
    }

    public void fillReceivedFormsDetailsPA_OOS_END(Map<String, String> data) {
        //TODO PA OOS - Received forms - Low
    }

    public void fillReceivedFormsDetailsPA_RNW(Map<String, String> data) {
        //TODO PA RNW - Received forms - Low
    }

}