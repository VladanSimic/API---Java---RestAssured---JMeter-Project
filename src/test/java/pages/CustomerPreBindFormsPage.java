package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.InspectionInformationBlock;

public class CustomerPreBindFormsPage extends CommonComponentsAndActions {
    WebDriver driver;
    InspectionInformationBlock inspectionInformationBlock;

    public CustomerPreBindFormsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        inspectionInformationBlock = new InspectionInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

}