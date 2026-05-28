package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertyInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public PropertyInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Swimming Pool')]/../../../../div//input")
    List<WebElement> swimmingPool;
    @FindBy(xpath = "//div[contains(text(),'Usage')]/../../../../div//input")
    List<WebElement> usage;
    @FindBy(xpath = "//div[contains(text(),'Dwelling Type')]/../../../../div//input")
    List<WebElement> dwellingType;
    @FindBy(xpath = "//div[contains(text(),'Address Line 1')]/../../../../div//input")
    List<WebElement> addressLine1;
    @FindBy(xpath = "//div[contains(text(),'City')]/../../../../div//input")
    List<WebElement> city;
    @FindBy(xpath = "//div[contains(text(),'State')]/../../../../div//input")
    List<WebElement> state;
    @FindBy(xpath = "//div[contains(text(),'ZIP Code')]/../../../../div//input")
    List<WebElement> zipCode;
    @FindBy(xpath = "//div[text()='property information']/../../../../../..//*[text()='add']")
    WebElement addBtn;
    @FindBy(xpath = "//div[text()='Is the residence rented to others at any time?']/../../../..//label[text()='Yes']/..//input")
    List<WebElement> isResidenceRentedYes;
    @FindBy(xpath = "//div[text()='Is the residence rented to others at any time?']/../../../..//label[text()='No']/..//input")
    List<WebElement> isResidenceRentedNo;
    @FindBy(xpath = "//*[contains(text(),'Address Line 1')]/../../../../../../../../..//tr//td[1]/div")
    List<WebElement> addressLine1HS;
    @FindBy(xpath = "//*[contains(text(),'Address Line 1')]/../../../../../../../../..//tr//td[2]/div")
    List<WebElement> addressLine2HS;
    @FindBy(xpath = "//*[contains(text(),'Address Line 1')]/../../../../../../../../..//tr//td[3]/div")
    List<WebElement> cityHS;
    @FindBy(xpath = "//*[contains(text(),'Address Line 1')]/../../../../../../../../..//tr//td[4]/div")
    List<WebElement> stateHS;
    @FindBy(xpath = "//*[contains(text(),'Address Line 1')]/../../../../../../../../..//tr//td[5]/div")
    List<WebElement> zipHS;
    @FindBy(xpath = "//*[contains(text(),'Address Line 1')]/../../../../../../../../..//tr//td[6]/div")
    List<WebElement> usageHS;
    @FindBy(xpath = "//div[contains(text(),'How many weeks per year is the residence rented?')]/../../../..//input")
    List<WebElement> howManyWeeksPerYearIsTheResidenceRented;
    @FindBy(xpath = "//div[contains(text(),'What is the minimum night stay?')]/../../../..//input")
    List<WebElement> whatIsTheMinimumNightStay;
    @FindBy(xpath = "//div[text()='property information']")
    WebElement propertyInformationBlock;
    @FindBy(xpath = "//span[text()='delete']")
    List<WebElement> delete;
    @FindBy(xpath = "//span[text()='delete']/../../../..//label")
    List<WebElement> propertyInformationLabel;
    @FindBy(xpath = "//div[text()='Exclude']/../../../..//input")
    List<WebElement> exclude;

    public void setZipCode(String value, int i) throws Throwable {
        typeText(zipCode.get(i), value);
    }

    public void setState(String value, int i) throws Throwable {
        typeText(state.get(i), value);
    }

    public void setCity(String value, int i) throws Throwable {
        typeText(city.get(i), value);
    }

    public void setAddressLine1(String value, int i) throws Throwable {
        typeText(addressLine1.get(i), value);
    }

    public void setSwimmingPool(String value, int i) throws Throwable {
        pause(2000);
        typeText(swimmingPool.get(i), value);
        setAttributeValue(swimmingPool.get(i), "value", value);
    }

    public void setUsage(String value, int i) throws Throwable {
        typeText(usage.get(i), value);
    }

    public void setDwellingType(String value, int i) throws Throwable {
        typeText(dwellingType.get(i), value);
    }

    public void setIsResidenceRented(String value) throws Throwable {
        try {
            choose(isResidenceRentedYes.get(0), isResidenceRentedNo.get(0), value);
        } catch (Exception e) {
            //
        }
    }

    public void fillPropertyInformationDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("property information");
        pause(1000);
        setSwimmingPool(data.get("Swimming_Pool"), 0);
        setUsage(data.get("Usage"), 0);
        setDwellingType(data.get("Dwelling_Type"), 0);
        pause(1000);
        //ES
        if (hasValue(data.get("Admitted_Line")) && data.get("Admitted_Line").equalsIgnoreCase("Excess Liability")
                && hasValue(data.get("Is_Residence_Rented"))) {
            setIsResidenceRented(data.get("Is_Residence_Rented"));
        }

        saveChanges();
    }

    public void fillPropertyInformationDetails_END(Map<String, String> data) throws Throwable {
        setSwimmingPool(data.get("Swimming_Pool_END"), 0);
        setUsage(data.get("Usage_END"), 0);
        setDwellingType(data.get("Dwelling_Type_END"), 0);
        saveChanges();
    }

    public void fillPropertyInformationDetails_OOS_END(Map<String, String> data) throws Throwable {
        setSwimmingPool(data.get("Swimming_Pool_OOS_END"), 0);
        setUsage(data.get("Usage_OOS_END"), 0);
        setDwellingType(data.get("Dwelling_Type_OOS_END"), 0);
        saveChanges();
    }

    public void fillPropertyInformationDetails_RNW(Map<String, String> data) throws Throwable {
        setSwimmingPool(data.get("Swimming_Pool_RNW"), 0);
        setUsage(data.get("Usage_RNW"), 0);
        setDwellingType(data.get("Dwelling_Type_RNW"), 0);
        saveChanges();
    }

    public void addAdditionalProperties(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Properties_Num"))) {
            int num = Integer.parseInt(data.get("Additional_Properties_Num"));
            for (int i = 1; i <= num; i++) {
                clickElement(addBtn);
                pause(2000);
                setAddressLine1(data.get("Additional_Property_Address_Line_1").split(",")[i - 1], i);
                setCity(data.get("Additional_Property_City").split(",")[i - 1], i);
                setState(data.get("Additional_Property_State").split(",")[i - 1], i);
                setZipCode(data.get("Additional_Property_Zip_Code").split(",")[i - 1], i);
                setSwimmingPool(data.get("Additional_Property_Swimming_Pool").split(",")[i - 1], i);
                setUsage(data.get("Additional_Property_Usage").split(",")[i - 1], i);
                setDwellingType(data.get("Additional_Property_Dwelling").split(",")[i - 1], i);
                setExclude(data.get("Additional_Property_Exclude").split(",")[i - 1], i);
            }
        }
    }

    public void addAdditionalProperties_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Properties_Num_END"))) {
            int num = Integer.parseInt(data.get("Additional_Properties_Num_END"));
            for (int i = 1; i <= num; i++) {
                int totalAdditionalProperty = i + num + Integer.parseInt(data.get("Additional_Properties_Num"));
                clickElement(addBtn);
                pause(2000);
                setAddressLine1(data.get("Additional_Property_Address_Line_1_END").split(",")[i - 1], totalAdditionalProperty - 1);
                setCity(data.get("Additional_Property_City_END").split(",")[i - 1], totalAdditionalProperty - 1);
                setState(data.get("Additional_Property_State_END").split(",")[i - 1], totalAdditionalProperty - 1);
                setZipCode(data.get("Additional_Property_Zip_Code_END").split(",")[i - 1], totalAdditionalProperty - 1);
                setSwimmingPool(data.get("Additional_Property_Swimming_Pool_END").split(",")[i - 1], totalAdditionalProperty - 1);
                setUsage(data.get("Additional_Property_Usage_END").split(",")[i - 1], totalAdditionalProperty - 1);
                setDwellingType(data.get("Additional_Property_Dwelling_END").split(",")[i - 1], totalAdditionalProperty - 1);
                setExclude(data.get("Additional_Property_Exclude_END").split(",")[i - 1], totalAdditionalProperty - 1);
            }
        }
    }

    public void addAdditionalProperties_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Properties_Num_OOS_END"))) {
            int num = Integer.parseInt(data.get("Additional_Properties_Num_OOS_END"));
            for (int i = 1; i <= num; i++) {
                int totalAdditionalProperty = i + num + Integer.parseInt(data.get("Additional_Properties_Num"));
                clickElement(addBtn);
                pause(2000);
                setAddressLine1(data.get("Additional_Property_Address_Line_1_OOS_END").split(",")[i - 1], totalAdditionalProperty);
                setCity(data.get("Additional_Property_City_OOS_END").split(",")[i - 1], totalAdditionalProperty);
                setState(data.get("Additional_Property_State_OOS_END").split(",")[i - 1], totalAdditionalProperty);
                setZipCode(data.get("Additional_Property_Zip_Code_OOS_END").split(",")[i - 1], totalAdditionalProperty);
                setSwimmingPool(data.get("Additional_Property_Swimming_Pool_OOS_END").split(",")[i - 1], totalAdditionalProperty);
                setUsage(data.get("Additional_Property_Usage_OOS_END").split(",")[i - 1], totalAdditionalProperty);
                setDwellingType(data.get("Additional_Property_Dwelling_OOS_END").split(",")[i - 1], totalAdditionalProperty);
            }
        }
    }

    public void addAdditionalProperties_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Properties_Num_RNW"))) {
            int totalAdditionalProperty = 0;
            int endorsementAdditionalProperty = Integer.parseInt(data.get("Additional_Properties_Num_END"));
            int num = Integer.parseInt(data.get("Additional_Properties_Num_RNW"));
            for (int i = 1; i <= num; i++) {
                if (data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
                    totalAdditionalProperty = i + Integer.parseInt(data.get("Additional_Properties_Num")) + endorsementAdditionalProperty - 1;
                } else {
                    totalAdditionalProperty = i + num + Integer.parseInt(data.get("Additional_Properties_Num")) - 1;
                }
                clickElement(addBtn);
                pause(2000);
                setAddressLine1(data.get("Additional_Property_Address_Line_1_RNW").split(",")[i - 1], totalAdditionalProperty);
                setCity(data.get("Additional_Property_City_RNW").split(",")[i - 1], totalAdditionalProperty);
                setState(data.get("Additional_Property_State_RNW").split(",")[i - 1], totalAdditionalProperty);
                setZipCode(data.get("Additional_Property_Zip_Code_RNW").split(",")[i - 1], totalAdditionalProperty);
                setSwimmingPool(data.get("Additional_Property_Swimming_Pool_RNW").split(",")[i - 1], totalAdditionalProperty);
                setUsage(data.get("Additional_Property_Usage_RNW").split(",")[i - 1], totalAdditionalProperty);
                setDwellingType(data.get("Additional_Property_Dwelling_RNW").split(",")[i - 1], totalAdditionalProperty);
                setExclude(data.get("Additional_Property_Exclude_RNW").split(",")[i - 1], totalAdditionalProperty - 1);
            }
        }
    }

    public void clickAdd() throws Throwable {
        clickElement(addBtn, "Add");
        pause(2000);
        clickFooter();
    }

    public void setAddressLine1HS(String value, int index) throws Throwable {
        if (hasValue(value)) {
            clickElement(addressLine1HS.get(index), "Address Line 1");
            typeText(driver.switchTo().activeElement(), value, "Address Line 1");
        }
    }

    public void setAddressLine2HS(String value, int index) throws Throwable {
        if (hasValue(value)) {
            clickElement(addressLine2HS.get(index), "Address Line 2");
            typeText(driver.switchTo().activeElement(), value, "Address Line 2");
        }
    }

    public void setCityHS(String value, int index) throws Throwable {
        if (hasValue(value)) {
            clickElement(cityHS.get(index), "City");
            typeText(driver.switchTo().activeElement(), value, "City");
        }
    }

    public void setStateHS(String value, int index) throws Throwable {
        if (hasValue(value)) {
            clickElement(stateHS.get(index), "State");
            typeText(driver.switchTo().activeElement(), value, "State");
        }
    }

    public void setZipCodeHS(String value, int index) throws Throwable {
        if (hasValue(value)) {
            clickElement(zipHS.get(index), "ZIP");
            typeText(driver.switchTo().activeElement(), value, "ZIP");
        }
    }

    public void setUsageHS(String value, int index) throws Throwable {
        if (hasValue(value)) {
            clickElement(usageHS.get(index), "Usage");
            typeText(driver.switchTo().activeElement(), value, "Usage");
        }
    }

    public void setHowManyWeeksPerYearIsTheResidenceRented(String value, int index) throws Throwable {
        if (hasValue(value)) {
            clickElement(howManyWeeksPerYearIsTheResidenceRented.get(index), "How Many Weeks Is the Residence Rented - Clicked");
            typeText(driver.switchTo().activeElement(), value, "How Many Weeks Is the Residence Rented - Type Text");
            saveChanges();
        }
    }

    public void setWhatIsTheMinimumNightStay(String value, int index) throws Throwable {
            if (hasValue(value) && !whatIsTheMinimumNightStay.get(index).getAttribute("value").equalsIgnoreCase(value)) {
                clickElement(propertyInformationBlock);
                pause(2000);
                typeTextEnter(whatIsTheMinimumNightStay.get(index), value, "Vehicle Make " + index);
                pause(2000);
                clickFooter();
                pause(2000);
                saveChanges();
            }
    }

    public void clickBlock() {
        clickElement(propertyInformationBlock, "Property information block");
    }

    public void fillPropertyInformationBlockHS(Map<String, String> data) throws Throwable {
        int properties = data.get("Policy_Information_Additional_Properties").split(",").length;

        for (int i = 0; i < properties; i++) {
            clickAdd();
        }

        for (int i = 0; i < properties; i++) {
            clickBlock();
            setAddressLine1HS(data.get("Property_Information_Address_Line_1_" + (i + 1)), i);
            setAddressLine2HS(data.get("Property_Information_Address_Line_2_" + (i + 1)), i);
            setCityHS(data.get("Property_Information_City_" + (i + 1)), i);
            setStateHS(data.get("Property_Information_State_" + (i + 1)), i);
            setZipCodeHS(data.get("Property_Information_ZIP_Code_" + (i + 1)), i);
            setUsageHS(data.get("Property_Information_Usage_" + (i + 1)), i);
        }

        new OptionalCoveragesExclusionsBlock(driver).setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));

        saveChanges();
    }

    public void setExclude(String value, int i) throws Throwable {
        if (hasValue(value)) {
            if (!exclude.isEmpty()) {
                checkCheckbox(exclude.get(i), value);
            }
        }
    }

    public void fillPropertyInformationBlockHS_END(Map<String, String> data) {
        //TODO
    }

    public void fillPropertyInformationBlockHS_OOS_END(Map<String, String> data) {
        //TODO
    }

    public void fillPropertyInformationBlockHS_RNW(Map<String, String> data) {
        //TODO
    }

    public String getAddressLine1(int index) {
        return returnElementAttributeValue(addressLine1.get(index));
    }

    public String getCity(int index) {
        return returnElementAttributeValue(city.get(index));
    }

    public String getState(int index) {
        return returnElementAttributeValue(state.get(index));
    }

    public String getZIPCode(int index) {
        return returnElementAttributeValue(zipCode.get(index));
    }

    public int returnIndexOfLastLocation() {
        return addressLine1.size() - 1;
    }

    public void setIsResidenceRented(String value, int index) throws Throwable {
        if (!isResidenceRentedYes.isEmpty()) {
            choose(isResidenceRentedYes.get(index), isResidenceRentedNo.get(index), value);
        }
    }

    public void addAdditionalPropertiesES(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Properties_Num"))) {
            int num = Integer.parseInt(data.get("Additional_Properties_Num"));
            for (int i = 1; i <= num; i++) {
                clickElement(addBtn);
                pause(2000);
                setAddressLine1(data.get("Additional_Property_Address_Line_1").split(",")[i - 1], i);
                setCity(data.get("Additional_Property_City").split(",")[i - 1], i);
                setState(data.get("Additional_Property_State").split(",")[i - 1], i);
                setZipCode(data.get("Additional_Property_Zip_Code").split(",")[i - 1], i);
                setSwimmingPool(data.get("Additional_Property_Swimming_Pool").split(",")[i - 1], i);
                setUsage(data.get("Additional_Property_Usage").split(",")[i - 1], i);
                setDwellingType(data.get("Additional_Property_Dwelling").split(",")[i - 1], i);
                setIsResidenceRented(data.get("Additional_Property_Is_Residence_Rented").split(",")[i - 1], i);
                pause(1000);
                if (data.get("Additional_Property_Is_Residence_Rented").split(",")[i - 1].equalsIgnoreCase("Yes")) {
                    setHowManyWeeksPerYearIsTheResidenceRented(data.get("Additional_Property_Information_How_Many_Weeks_Per_Year_Is_The_Property_Rented").split(",")[i - 1], i);
                    setWhatIsTheMinimumNightStay(data.get("Additional_Property_Information_What_Is_The_Minimum_Night_Stay").split(",")[i - 1], i);
                }
                saveChanges();
            }
        }
    }

    public void fillPropertyInformationDetailsES(Map<String, String> data) throws Throwable {
        verifyBlockExists("property information");
        pause(1000);
        setSwimmingPool(data.get("Swimming_Pool"), 0);
        setUsage(data.get("Usage"), 0);
        setDwellingType(data.get("Dwelling_Type"), 0);
        setIsResidenceRented(data.get("Is_Residence_Rented"), 0);
        pause(1000);
        if (data.get("Is_Residence_Rented").equalsIgnoreCase("Yes")) {
            setHowManyWeeksPerYearIsTheResidenceRented(data.get("Property_Information_How_Many_Weeks_Per_Year_Is_The_Property_Rented"), 0);
            setWhatIsTheMinimumNightStay(data.get("Property_Information_What_Is_The_Minimum_Night_Stay"), 0);
        }
        saveChanges();
    }

}