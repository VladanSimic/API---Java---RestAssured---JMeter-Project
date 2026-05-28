package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class PrimaryAddressBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public PrimaryAddressBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Risk Address 1']/../../../../div//input")
    WebElement riskAddress1;
    @FindBy(xpath = "//div[text()='Risk Address 2']/../../../../div//input")
    WebElement riskAddress2;
    @FindBy(xpath = "//div[text()='City']/../../../../div//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='State']/../../../../div//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='ZIP']/../../../../div//input")
    WebElement zip;
    @FindBy(xpath = "//div[text()='Primary Location']/../../../../div//input")
    WebElement primaryLocation;


    public void fillPrimaryAddressDetailsPA(Map<String, String> data) throws Throwable {
        clickObtainOperatorsAndVehicles();
        setPrimaryLocation(data.get("Primary_Address_Primary_Location"));
        setAddressLine1(data.get("Primary_Address_Address_Line_1"));
        setAddressLine2(data.get("Primary_Address_Address_Line_2"));
        setCity(data.get("Primary_Address_City"));
        verifyState(data.get("Primary_Address_State"));
        setZIPCode(data.get("Primary_Address_ZIP_Code"));
        verifyBlockExists("primary address");
    }

    public void fillPrimaryAddressDetailsPA_END(Map<String, String> data) throws Throwable {
        setPrimaryLocation(data.get("Primary_Address_Primary_Location_END"));
        setAddressLine1(data.get("Primary_Address_Address_Line_1_END"));
        setAddressLine2(data.get("Primary_Address_Address_Line_2_END"));
        setCity(data.get("Primary_Address_City_END"));
        verifyState(data.get("Primary_Address_State_END"));
        setZIPCode(data.get("Primary_Address_ZIP_Code_END"));
    }

    public void fillPrimaryAddressDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setPrimaryLocation(data.get("Primary_Address_Primary_Location_OOS_END"));
        setAddressLine1(data.get("Primary_Address_Address_Line_1_OOS_END"));
        setAddressLine2(data.get("Primary_Address_Address_Line_2_OOS_END"));
        setCity(data.get("Primary_Address_City_OOS_END"));
        verifyState(data.get("Primary_Address_State_OOS_END"));
        setZIPCode(data.get("Primary_Address_ZIP_Code_OOS_END"));
    }

    public void fillPrimaryAddressDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setPrimaryLocation(data.get("Primary_Address_Primary_Location_RNW"));
        setAddressLine1(data.get("Primary_Address_Address_Line_1_RNW"));
        setAddressLine2(data.get("Primary_Address_Address_Line_2_RNW"));
        setCity(data.get("Primary_Address_City_RNW"));
        verifyState(data.get("Primary_Address_State_RNW"));
        setZIPCode(data.get("Primary_Address_ZIP_Code_RNW"));
    }

    public void setPrimaryLocation(String value) {
        typeText(primaryLocation, value, "Primary location");
    }

    public void setAddressLine1(String value) {
        typeText(riskAddress1, value, "Risk address 1");
    }

    public void setAddressLine2(String value) {
        typeText(riskAddress2, value, "Risk address 2");
    }

    public void setCity(String value) throws Throwable {
        typeTextEnter(city, value, "City");
    }

    public void verifyState(String value) {
        assertCellValue(state, value, "State");
    }

    public void setZIPCode(String value) {
        typeTextEnter(zip, value, "ZIP");
    }
}