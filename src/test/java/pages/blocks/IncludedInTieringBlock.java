package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class IncludedInTieringBlock extends CommonComponentsAndActions {

    public IncludedInTieringBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillIncludedInTieringDetails(Map<String, String> data) {
        //TODO PA NB - Included In Tiering - Low
    }

    public void fillIncludedInTieringDetails_END(Map<String, String> data) {
        //TODO PA END - Included In Tiering - Low
    }

    public void fillIncludedInTieringDetails_OOS_END(Map<String, String> data) {
        //TODO PA OOS - Included In Tiering - Low
    }

    public void fillIncludedInTieringDetails_RNW(Map<String, String> data) {
        //TODO PA RNW - Included In Tiering - Low
    }

}