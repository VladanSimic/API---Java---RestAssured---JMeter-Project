package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.ArrayList;
import java.util.List;

public class GeneralGuidanceToolPage extends CommonComponentsAndActions {
    WebDriver driver;

    public GeneralGuidanceToolPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='streetAddress']")
    WebElement streetAddressField;
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;
    @FindBy(xpath = "//input[@id='zip']")
    WebElement zipField;
    @FindBy(xpath = "//input[@id='squareFootage']")
    WebElement squareFootageField;
    @FindBy(xpath = "//input[@id='yearBuilt']")
    WebElement yearBuiltField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;
    @FindBy(xpath = "//div[@class='form-group col-md-3']//input[@class='form-control']")
    List<WebElement> returnedFieldsContent;

    public void fillOutAndVerifyDwellingGuidanceToolPage(String street, String zip, String city, String sqFt, String yearBuilt) throws Throwable {
        setStreetAddress(street);
        setZip(zip);
        setCity(city);
        setSquareFootage(sqFt);
        setYearBuilt(yearBuilt);
        clickSubmit();
        verifyIfDataIsReturned();
    }

    public void setStreetAddress(String value) {
        typeText(streetAddressField, value, "Street Address");
    }

    public void setCity(String value) {
        typeText(cityField, value, "City");
    }

    public void setZip(String value) {
        typeText(zipField, value, "Zip");
    }

    public void setSquareFootage(String value) {
        typeText(squareFootageField, value, "Square Footage");
    }

    public void setYearBuilt(String value) {
        typeText(yearBuiltField, value, "Year Built");
    }

    public void clickSubmit() throws Throwable {
        clickElement(submitBtn, "Submit");
        pause(8000);
    }

    public void verifyIfDataIsReturned() {
        if (returnedFieldsContent.isEmpty()) {
            failAssertion("Returned Data Cells not found on the UI for General Guidance Tool");
            return;
        }

        for (WebElement element : returnedFieldsContent) {
            if (!element.getAttribute("value").contains("$"))
                failAssertion("Data is not available/returned");
            else
                reportScreenshot("General_Guidance_Tool_Data", "General Guidance Tool");
        }
    }

    public void switchToNewWindowsHandle() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        pause(1000);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().maximize();
    }

}
