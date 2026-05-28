package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WatercraftObtainedFromMemberAccountBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WatercraftObtainedFromMemberAccountBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void fillWatercraftObtainedFromMemberAccountDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft obtained from member account");
    }
}



