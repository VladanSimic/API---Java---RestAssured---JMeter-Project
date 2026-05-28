package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.InspectionInformationBlock;

public class ExclusionFormsPage extends CommonComponentsAndActions {
    WebDriver driver;
    InspectionInformationBlock inspectionInformationBlock;

    public ExclusionFormsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}