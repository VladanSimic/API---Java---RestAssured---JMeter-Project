package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WatersNavigatedBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WatersNavigatedBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillWatersNavigatedDetails(Map<String, String> data) {
    }
}