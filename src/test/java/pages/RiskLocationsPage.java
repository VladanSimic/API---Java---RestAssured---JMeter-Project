package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class RiskLocationsPage extends CommonComponentsAndActions {
    WebDriver driver;

    public RiskLocationsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Address Line 1']/ancestor::tr/following-sibling::tr[1]//input")
    WebElement addressLine1Field;
    @FindBy(xpath = "//*[text()='City']/ancestor::tr/following-sibling::tr[1]//input")
    WebElement cityField;
    @FindBy(xpath = "//*[text()='State']/ancestor::tr/following-sibling::tr[1]//select")
    WebElement stateField;
    @FindBy(xpath = "//*[text()='Zip']/ancestor::tr/following-sibling::tr[1]//input")
    WebElement zipField;
    @FindBy(xpath = "//input[@value='Retrieve Matching Locations']")
    WebElement retrieveMatchingLocations;
    @FindBy(xpath = "//div[text()='locations']/../../../../../..//tr")
    List<WebElement> locationRows;

    public void setAddressLine1(String value) {
        typeText(addressLine1Field, value, "Address Line 1");
    }

    public void setCity(String value) {
        typeText(cityField, value, "City");
    }

    public void setState(String value) {
        typeText(stateField, value, "State");
    }

    public void setZip(String value) {
        typeText(zipField, value, "Zip");
    }

    public void clickRetrieveMatchingLocations() throws Throwable {
        clickElement(retrieveMatchingLocations, "Retrieve Matching Locations");
        pause(15000);
    }

    public void verifyIfDataIsReturned() {
        boolean isReturned = locationRows.size() > 1;

        if (!isReturned)
            failAssertion("Location Search Data is not returned");
        else
            reportScreenshot("Location_Search_Tool_Data", "Location Search");
    }

    public void switchToPageFrame() {
        driver.switchTo().frame("vesselIframe");
    }

    public void switchBackToContentFrame() {
        driver.switchTo().defaultContent();
    }

}
