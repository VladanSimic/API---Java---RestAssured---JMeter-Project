package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ApplicationsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ApplicationsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillApplicationsDetailsPA(Map<String, String> data) {
        //TODO PA NB - Application details - Low
    }

    public void fillApplicationsDetailsPA_END(Map<String, String> data) {
        //TODO PA END - Application details - Low
    }

    public void fillApplicationsDetailsPA_OOS_END(Map<String, String> data) {
        //TODO PA OOS - Application details - Low
    }

    public void fillApplicationsDetailsPA_RNW(Map<String, String> data) {
        //TODO PA RNW - Application details - Low
    }

}