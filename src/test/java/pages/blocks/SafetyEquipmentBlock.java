package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class SafetyEquipmentBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public SafetyEquipmentBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillSafetyEquipmentDetails(Map<String, String> data) {
    }
}