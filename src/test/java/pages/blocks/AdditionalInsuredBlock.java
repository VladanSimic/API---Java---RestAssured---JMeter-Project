package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdditionalInsuredBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AdditionalInsuredBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[1]")
    List<WebElement> type;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[2]")
    List<WebElement> llcTrust;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[3]")
    List<WebElement> name;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[4]")
    List<WebElement> addressLine1;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[5]")
    List<WebElement> city;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[6]")
    List<WebElement> state;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[7]")
    List<WebElement> zip;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[8]")
    List<WebElement> applicableClass;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[8]")
    List<WebElement> addressDropdownForLiabilityCoverage;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[9]")
    List<WebElement> addressFormForLiabilityCoverage;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[10]")
    List<WebElement> propertyDescription;
    @FindBy(xpath = "//span[text()='delete']")
    List<WebElement> delete;
    @FindBy(xpath = "//span[text()='Create new Entity']")
    List<WebElement> createNewEntity;

    public void clickAdd() throws InterruptedException {
        clickElement(add, "Add");
        pause(3000);
    }

    public void setType(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(type.get(i), "Type_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickFooter();
        }
    }

    public void setLLCTrust(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(llcTrust.get(i), "LLC Trust_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickFooter();
        }
    }

    public void setName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(name.get(i), "Name_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
        }
    }

    public void setAddressLine1(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(addressLine1.get(i), "Street Address_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setCity(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(city.get(i), "City_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
        }
    }

    public void setState(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(state.get(i), "State_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickFooter();
        }
    }

    public void setZIP(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(zip.get(i), "ZIP_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
        }
    }

    public void deleteAllInterests() {
        for (WebElement del : delete) {
            clickElement(del, "Delete");
        }
    }

    public void clickCreateNewEntity() {
        clickElement(createNewEntity.get(createNewEntity.size() - 1), "Create New Entity");
    }

    public void setApplicableClass(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(applicableClass.get(i), "ApplicableClass_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        }
    }

    public void setAddressDropdownForLiabilityCoverage(String value, int i) throws Throwable {
        if (hasValue(value)) {
            String addressDropdownForLiabilityCoverageOption = "//li[@role='option' and contains(text(),'$$')]";
            clickElement(addressDropdownForLiabilityCoverage.get(i), "Address Dropdown");
            clickElement(driver.findElement(By.xpath(addressDropdownForLiabilityCoverageOption.replace("$$", value))), "Address Dropdown For Liability Coverage");
            clickFooter();
        }
    }

    public void setAddressFormForLiabilityCoverage(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(addressFormForLiabilityCoverage.get(i), "AddressFormForLiabilityCoverage_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setPropertyDescription(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(propertyDescription.get(i), "PropertyDescription_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void fillAdditionalInsuredDetails(Map<String, String> data) throws Throwable {
        String additionalInsuredData = data.get("Additional_Insured");

        if (hasValue(additionalInsuredData) && !additionalInsuredData.equalsIgnoreCase(",")) {
            int additionalInsured = additionalInsuredData.split(",").length;

            for (int i = 0; i < additionalInsured; i++) {
                clickAdd();
                clickFooter();
                setType(data.get("Additional_Insured_Type_" + (i + 1)), i);
                setLLCTrust(data.get("Additional_Insured_LLC_Trust_" + (i + 1)), i);
                setName(data.get("Additional_Insured_Name_" + (i + 1)), i);
                setAddressLine1(data.get("Additional_Insured_Street_" + (i + 1)), i);
                setCity(data.get("Additional_Insured_City_" + (i + 1)), i);
                setState(data.get("Additional_Insured_State_" + (i + 1)), i);
                setZIP(data.get("Additional_Insured_ZIP_" + (i + 1)), i);
                ;
                if (data.get("Admitted_Line").equalsIgnoreCase("Collection"))
                    setApplicableClass(data.get("Additional_Insured_Applicable_Class_" + (i + 1)), i);
                if (data.get("Additional_Insured_LLC_Trust_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Insured_LLC_Trust_" + (i + 1)).equalsIgnoreCase(""))
                    clickCreateNewEntity();
            }
        }
        saveChanges();
    }

    public void fillAdditionalInsuredDetailsEX(Map<String, String> data) throws Throwable {
        verifyBlockExists("additional insured");
        String additionalInsuredData = data.get("Additional_Insured");
        int index;

        if (hasValue(additionalInsuredData) && !additionalInsuredData.equalsIgnoreCase(",")) {
            int additionalInsured = additionalInsuredData.split(",").length;
            Set<String> conditional = Set.of("Additional Insured - Premises Liability for Specific Location",
                    "Additional Interest - Premises Liability for Specific Location",
                    "Additional Insured - Premises Liability for Specific Property");

            for (int i = 0; i < additionalInsured; i++) {
                clickAdd();
                clickFooter();
                pause(2000);
                index = freeRowIndex();

                setType(data.get("Additional_Insured_Type_" + (i + 1)), index);
                pause(2000);
                setLLCTrust(data.get("Additional_Insured_LLC_Trust_" + (i + 1)), index);
                pause(2000);
                setName(data.get("Additional_Insured_Name_" + (i + 1)), index);
                setAddressLine1(data.get("Additional_Insured_Street_" + (i + 1)), index);
                setCity(data.get("Additional_Insured_City_" + (i + 1)), index);
                setState(data.get("Additional_Insured_State_" + (i + 1)), index);
                setZIP(data.get("Additional_Insured_ZIP_" + (i + 1)), index);
                pause(2000);
                if (conditional.contains(data.get("Additional_Insured_Type_" + (i + 1)))) {
                    if (data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_" + (i + 1)).equalsIgnoreCase("Primary Address")) {
                        setAddressDropdownForLiabilityCoverage(data.get("Address_Line_1_Txt"), index);
                    } else {
                        String addressForLiabilityCoverage = data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_" + (i + 1));
                        if (addressForLiabilityCoverage.contains("-")) {
                            setAddressDropdownForLiabilityCoverage(addressForLiabilityCoverage.split("-")[0], index);
                        } else {
                            setAddressDropdownForLiabilityCoverage(data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_" + (i + 1)), index);
                        }
                    }
                    saveChanges();
                    if (data.get("Additional_Insured_Address_Dropdown_Liability_Coverage_" + (i + 1)).equalsIgnoreCase("Other Location Address")) {
                        setAddressFormForLiabilityCoverage(data.get("Additional_Insured_Address_Form_Liability_Coverage_" + (i + 1)), index);
                    }
                    if (data.get("Additional_Insured_Type_" + (i + 1)).equalsIgnoreCase("Additional Insured - Premises Liability for Specific Property")) {
                        setPropertyDescription(data.get("Additional_Insured_Property_Description_" + (i + 1)), index);
                    }
                }
                if (data.get("Additional_Insured_LLC_Trust_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Insured_LLC_Trust_" + (i + 1)).equalsIgnoreCase(""))
                    clickCreateNewEntity();
            }
        }
        saveChanges();
    }

    public int freeRowIndex () {
        return type.size() - 1;
    }

}