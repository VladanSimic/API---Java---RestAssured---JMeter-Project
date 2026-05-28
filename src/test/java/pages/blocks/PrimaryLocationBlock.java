package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class PrimaryLocationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public PrimaryLocationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillPrimaryLocationDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("primary location");
        // TODO
    }

}