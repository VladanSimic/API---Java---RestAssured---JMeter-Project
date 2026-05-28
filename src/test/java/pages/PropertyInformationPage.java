package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.PropertyInformationBlock;

import java.util.Map;

public class PropertyInformationPage extends CommonComponentsAndActions {
    WebDriver driver;
    PropertyInformationBlock propertyInformationBlock;

    public PropertyInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        propertyInformationBlock = new PropertyInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillPropertyInformationPage(Map<String, String> data) throws Throwable {
        goToPage("Property Information");
        propertyInformationBlock.fillPropertyInformationDetails(data);
        propertyInformationBlock.addAdditionalProperties(data);
    }

    public void fillPropertyInformationPage_END(Map<String, String> data) throws Throwable {
        goToPage("Property Information");
        propertyInformationBlock.fillPropertyInformationDetails_END(data);
        propertyInformationBlock.addAdditionalProperties_END(data);
    }

    public void fillPropertyInformationPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Property Information");
        propertyInformationBlock.fillPropertyInformationDetails_OOS_END(data);
        propertyInformationBlock.addAdditionalProperties_OOS_END(data);
    }

    public void fillPropertyInformationPage_RNW(Map<String, String> data) throws Throwable {
        goToPage("Property Information");
        propertyInformationBlock.fillPropertyInformationDetails_RNW(data);
        propertyInformationBlock.addAdditionalProperties_RNW(data);
    }

    public void fillPropertyInformationPageES(Map<String, String> data) throws Throwable {
        goToPage("Property Information");
        propertyInformationBlock.fillPropertyInformationDetailsES(data);
        propertyInformationBlock.addAdditionalPropertiesES(data);
    }
}
