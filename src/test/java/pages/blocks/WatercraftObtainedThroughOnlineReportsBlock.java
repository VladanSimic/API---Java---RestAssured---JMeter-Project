package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WatercraftObtainedThroughOnlineReportsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WatercraftObtainedThroughOnlineReportsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillWatercraftObtainedThroughOnlineReportsDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft obtained through online reports");
    }
}



