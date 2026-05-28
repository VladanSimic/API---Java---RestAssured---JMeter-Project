package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class PreviousIncidentsCLUEBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public PreviousIncidentsCLUEBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}