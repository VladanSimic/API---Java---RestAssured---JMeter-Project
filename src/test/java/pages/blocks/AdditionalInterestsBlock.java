package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import steps.dragon.DragonSteps;

import java.util.List;
import java.util.Map;

public class AdditionalInterestsBlock extends CommonComponentsAndActions {

    WebDriver driver;
    private boolean llcTrustFlag = false;

    public AdditionalInterestsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(css = "#footer-panel-innerCt")
    WebElement footer;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[1]")
    List<WebElement> type;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[2]")
    List<WebElement> llcTrust;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[3]")
    List<WebElement> name;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[4]")
    List<WebElement> addressLine1;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[5]")
    List<WebElement> addressLine2;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[6]")
    List<WebElement> city;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[7]")
    List<WebElement> state;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[8]")
    List<WebElement> zip;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[9]")
    List<WebElement> loan;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[10]")
    List<WebElement> mortgageType;
    @FindBy(xpath = "//span[text()='delete']")
    List<WebElement> delete;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//tr")
    List<WebElement> interestRow;
    @FindBy(xpath = "//span[text()='delete'")
    List<WebElement> deleteBtnList;
    @FindBy(xpath = "//span[text()='Create new Entity']")
    List<WebElement> createNewEntity;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[12]")
    List<WebElement> addressForLiabilityCoverageForm;
    @FindBy(xpath = "//span[text()='add']/../../../../../../..//table//td[13]")
    List<WebElement> propertyDescription;


    public void fillAdditionalInterestsDetails(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests");
        verifyBlockExists("Additional Interests");
        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(3000);
                clickFooter();
                setType(data.get("Additional_Interests_Type_" + (i + 1)), i);
                saveChanges();
                setLLCTrust(data.get("Additional_Interests_LLC_Trust_" + (i + 1)), i);
                setName(data.get("Additional_Interests_Name_" + (i + 1)), i);
                setAddressLine1(data.get("Additional_Interests_Address_Line_1_" + (i + 1)), i);
                setAddressLine2(data.get("Additional_Interests_Address_Line_2_" + (i + 1)), i);
                setCity(data.get("Additional_Interests_City_" + (i + 1)), i);
                setState(data.get("Additional_Interests_State_" + (i + 1)), i);
                setZIP(data.get("Additional_Interests_ZIP_" + (i + 1)), i);
                setLoan(data.get("Additional_Interests_Loan_" + (i + 1)), i);
                setMortgageType(data.get("Additional_Interests_Mortgage_Type_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Location"))
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Property")) {
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_" + (i + 1)), i);
                    setPropertyDescription(data.get("Additional_Interests_Property_Description_" + (i + 1)), i);
                }
                if (data.get("Additional_Interests_LLC_Trust_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_" + (i + 1)).equalsIgnoreCase(""))
                    clickElement(driver.findElement(By.xpath("//span[text()='Create new Entity']")));
            }
            saveChanges();
            pause(3000);
        }
    }

    public void fillAdditionalInterestsDetails_END(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests_END");
        verifyBlockExists("Additional Interests");
        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests_END").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(3000);
                clickFooter();
                setType(data.get("Additional_Interests_Type_END_" + (i + 1)), i);
                saveChanges();
                setLLCTrust(data.get("Additional_Interests_LLC_Trust_END_" + (i + 1)), i);
                setName(data.get("Additional_Interests_Name_END_" + (i + 1)), i);
                setAddressLine1(data.get("Additional_Interests_Address_Line_1_END_" + (i + 1)), i);
                setAddressLine2(data.get("Additional_Interests_Address_Line_2_END_" + (i + 1)), i);
                setCity(data.get("Additional_Interests_City_END_" + (i + 1)), i);
                setState(data.get("Additional_Interests_State_END_" + (i + 1)), i);
                setZIP(data.get("Additional_Interests_ZIP_END_" + (i + 1)), i);
                setLoan(data.get("Additional_Interests_Loan_END_" + (i + 1)), i);
                setMortgageType(data.get("Additional_Interests_Mortgage_Type_END_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_END_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Location"))
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_END_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_END_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Property")) {
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_END_" + (i + 1)), i);
                    setPropertyDescription(data.get("Additional_Interests_Property_Description_END_" + (i + 1)), i);
                }
                if (data.get("Additional_Interests_LLC_Trust_END_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_END_" + (i + 1)).equalsIgnoreCase(""))
                    clickElement(driver.findElement(By.xpath("//span[text()='Create new Entity']")));
            }
            saveChanges();
            pause(3000);
        }
    }

    public void fillAdditionalInterestsDetails_OOS_END(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests_OOS_END");
        verifyBlockExists("Additional Interests");
        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests_OOS_END").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(3000);
                clickFooter();
                setType(data.get("Additional_Interests_Type_OOS_END_" + (i + 1)), i);
                saveChanges();
                setLLCTrust(data.get("Additional_Interests_LLC_Trust_OOS_END_" + (i + 1)), i);
                setName(data.get("Additional_Interests_Name_OOS_END_" + (i + 1)), i);
                setAddressLine1(data.get("Additional_Interests_Address_Line_1_OOS_END_" + (i + 1)), i);
                setAddressLine2(data.get("Additional_Interests_Address_Line_2_OOS_END_" + (i + 1)), i);
                setCity(data.get("Additional_Interests_City_OOS_END_" + (i + 1)), i);
                setState(data.get("Additional_Interests_State_OOS_END_" + (i + 1)), i);
                setZIP(data.get("Additional_Interests_ZIP_OOS_END_" + (i + 1)), i);
                setLoan(data.get("Additional_Interests_Loan_OOS_END_" + (i + 1)), i);
                setMortgageType(data.get("Additional_Interests_Mortgage_Type_OOS_END_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_OOS_END_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Location"))
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_OOS_END_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_OOS_END_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Property")) {
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_OOS_END_" + (i + 1)), i);
                    setPropertyDescription(data.get("Additional_Interests_Property_Description_OOS_END_" + (i + 1)), i);
                }
                if (data.get("Additional_Interests_LLC_Trust_OOS_END_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_OOS_END_" + (i + 1)).equalsIgnoreCase(""))
                    clickElement(driver.findElement(By.xpath("//span[text()='Create new Entity']")));
            }
            saveChanges();
            pause(3000);
        }
    }

    public void fillAdditionalInterestsDetails_RNW(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests_RNW");
        verifyBlockExists("Additional Interests");
        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests_RNW").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(3000);
                clickFooter();
                setType(data.get("Additional_Interests_Type_RNW_" + (i + 1)), i);
                saveChanges();
                setLLCTrust(data.get("Additional_Interests_LLC_Trust_RNW_" + (i + 1)), i);
                setName(data.get("Additional_Interests_Name_RNW_" + (i + 1)), i);
                setAddressLine1(data.get("Additional_Interests_Address_Line_1_RNW_" + (i + 1)), i);
                setAddressLine2(data.get("Additional_Interests_Address_Line_2_RNW_" + (i + 1)), i);
                setCity(data.get("Additional_Interests_City_RNW_" + (i + 1)), i);
                setState(data.get("Additional_Interests_State_RNW_" + (i + 1)), i);
                setZIP(data.get("Additional_Interests_ZIP_RNW_" + (i + 1)), i);
                setLoan(data.get("Additional_Interests_Loan_RNW_" + (i + 1)), i);
                setMortgageType(data.get("Additional_Interests_Mortgage_Type_RNW_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_RNW_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Location"))
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_RNW_" + (i + 1)), i);
                if (data.get("Additional_Interests_Type_RNW_" + (i + 1)).equalsIgnoreCase("Additional Insured -  Premises Liability for Specific Property")) {
                    setAddressForLiabilityCoverageForm(data.get("Additional_Interests_Address_Form_Liability_Coverage_RNW_" + (i + 1)), i);
                    setPropertyDescription(data.get("Additional_Interests_Property_Description_RNW_" + (i + 1)), i);
                }
                if (data.get("Additional_Interests_LLC_Trust_RNW_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_RNW_" + (i + 1)).equalsIgnoreCase(""))
                    clickElement(driver.findElement(By.xpath("//span[text()='Create new Entity']")));
            }
            saveChanges();
            pause(3000);
        }
    }

    public void fillAdditionalInterestsDetailsCC(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests");

        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(5000);
                clickFooter();

                if (additionalInterests == 1) {
                    setType(data.get("Additional_Interests_Type_1"), i);
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_1"), i);
                    setName(data.get("Additional_Interests_Name_1"), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_1"), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_1"), i);
                    setCity(data.get("Additional_Interests_City_1"), i);
                    setState(data.get("Additional_Interests_State_1"), i);
                    setZIP(data.get("Additional_Interests_ZIP_1"), i);
                    setLoan(data.get("Additional_Interests_Loan_1"), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_1"), i);
                    if (data.get("Additional_Interests_LLC_Trust_1").equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_1").equalsIgnoreCase(""))
                        clickCreateNewEntity();
                } else {
                    setType(data.get("Additional_Interests_Type_" + (i + 1)), i);
                    saveChanges();
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_" + (i + 1)), i);
                    setName(data.get("Additional_Interests_Name_" + (i + 1)), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_" + (i + 1)), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_" + (i + 1)), i);
                    setCity(data.get("Additional_Interests_City_" + (i + 1)), i);
                    setState(data.get("Additional_Interests_State_" + (i + 1)), i);
                    setZIP(data.get("Additional_Interests_ZIP_" + (i + 1)), i);
                    setLoan(data.get("Additional_Interests_Loan_" + (i + 1)), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_" + (i + 1)), i);
                    if (data.get("Additional_Interests_LLC_Trust_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_" + (i + 1)).equalsIgnoreCase(""))
                        clickCreateNewEntity();
                }
            }
            saveChanges();
        }
    }

    public void fillAdditionalInterestsDetailsCC_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Interests_END")) && !data.get("Additional_Interests_END").equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests_END").split(",").length;

            int nbAdditionalInterests = 0;
            if (hasValue(data.get("Additional_Interests")) && !data.get("Additional_Interests").equalsIgnoreCase(",")) {
                nbAdditionalInterests = data.get("Additional_Interests").split(",").length;
            }

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(5000);
                clickFooter();

                if (additionalInterests == 1) {
                    setType(data.get("Additional_Interests_Type_1"), i + nbAdditionalInterests);
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_1"), i + nbAdditionalInterests);
                    setName(data.get("Additional_Interests_Name_1"), i + nbAdditionalInterests);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_1"), i + nbAdditionalInterests);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_1"), i + nbAdditionalInterests);
                    setCity(data.get("Additional_Interests_City_1"), i + nbAdditionalInterests);
                    setState(data.get("Additional_Interests_State_1"), i + nbAdditionalInterests);
                    setZIP(data.get("Additional_Interests_ZIP_1"), i + nbAdditionalInterests);
                    setLoan(data.get("Additional_Interests_Loan_1"), i + nbAdditionalInterests);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_1"), i + nbAdditionalInterests);
                } else {
                    setType(data.get("Additional_Interests_Type_" + (i + 1)), i + nbAdditionalInterests);
                    saveChanges();
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_" + (i + 1)), i + nbAdditionalInterests);
                    setName(data.get("Additional_Interests_Name_" + (i + 1)), i + nbAdditionalInterests);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_" + (i + 1)), i + nbAdditionalInterests);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_" + (i + 1)), i + nbAdditionalInterests);
                    setCity(data.get("Additional_Interests_City_" + (i + 1)), i + nbAdditionalInterests);
                    setState(data.get("Additional_Interests_State_" + (i + 1)), i + nbAdditionalInterests);
                    setZIP(data.get("Additional_Interests_ZIP_" + (i + 1)), i + nbAdditionalInterests);
                    setLoan(data.get("Additional_Interests_Loan_" + (i + 1)), i + nbAdditionalInterests);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_" + (i + 1)), i + nbAdditionalInterests);
                }
            }
            saveChanges();
        }
    }

    public void clickAdd() {
        clickElement(add, "Add");
    }

    public void clickFooter() {
        clickElement(footer, "Footer");
    }

    public void setType(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(type.get(i), "Type_" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "Type_" + (i + 1));
            clickFooter();
            if (value.equalsIgnoreCase("LLC/Trust"))
                this.llcTrustFlag = true;
        }
    }

    public void setLLCTrust(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(llcTrust.get(i), "LLC Trust_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickFooter();
            pause(1000);
            if (value.equalsIgnoreCase("Yes"))
                this.llcTrustFlag = true;
        }
    }

    public void setName(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(name.get(i), "Name_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "Name_" + (i + 1));
            clickFooter();
        }
    }

    public void setAddressLine1(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(addressLine1.get(i), "Address Line1_" + (i + 1));
            pause(2000);
            typeText(driver.switchTo().activeElement(), value, "Address Line1_" + (i + 1));
        }
    }

    public void setAddressLine2(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(addressLine2.get(i), "Address Line2_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "Address Line2_" + (i + 1));
        }
    }

    public void setCity(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(city.get(i), "City_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "City_" + (i + 1));
        }
    }

    public void setState(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(state.get(i), "State_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "State_" + (i + 1));
        }
    }

    public void setZIP(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(zip.get(i), "ZIP_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "ZIP_" + (i + 1));
        }
    }

    public void setLoan(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(loan.get(i), "Loan_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "Loan_" + (i + 1));
        }
    }

    public void setMortgageType(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(mortgageType.get(i), "Mortgage Type_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "Mortgage Type_" + (i + 1));
        }
    }

    public void deleteAllInterests() throws InterruptedException {
        pause(2000);
        for (WebElement del : delete) {
            pause(2000);
            clickElement(del, "Delete");
        }
    }

    public boolean isDataReturned() {
        return interestRow.size() != 0;
    }

    public void verifyIfDataReturned() throws InterruptedException {
        pause(2000);
        reportScreenshot("Additional_Interests" + System.currentTimeMillis(), "Additional Interests Returned");
        if (!isDataReturned())
            Assert.fail("No data is returned for Additional Interests");
        else
            successLog("Additional Interests data is returned");
    }

    public boolean getLLCTrustFlag() {
        return this.llcTrustFlag;
    }

    public void fillAdditionalInterestsDetailsHS(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests");
        verifyBlockExists("Additional Interests");
        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(5000);
                clickFooter();

                if (additionalInterests == 1) {
                    setType(data.get("Additional_Interests_Type_1"), i);
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_1"), i);
                    setName(data.get("Additional_Interests_Name_1"), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_1"), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_1"), i);
                    setCity(data.get("Additional_Interests_City_1"), i);
                    setState(data.get("Additional_Interests_State_1"), i);
                    setZIP(data.get("Additional_Interests_ZIP_1"), i);
                    setLoan(data.get("Additional_Interests_Loan_1"), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_1"), i);
                    if (data.get("Additional_Interests_LLC_Trust_1").equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_1").equalsIgnoreCase(""))
                        clickCreateNewEntity();
                } else {
                    setType(data.get("Additional_Interests_Type_" + (i + 1)), i);
                    saveChanges();
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_" + (i + 1)), i);
                    setName(data.get("Additional_Interests_Name_" + (i + 1)), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_" + (i + 1)), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_" + (i + 1)), i);
                    setCity(data.get("Additional_Interests_City_" + (i + 1)), i);
                    setState(data.get("Additional_Interests_State_" + (i + 1)), i);
                    setZIP(data.get("Additional_Interests_ZIP_" + (i + 1)), i);
                    setLoan(data.get("Additional_Interests_Loan_" + (i + 1)), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_" + (i + 1)), i);
                    if (data.get("Additional_Interests_LLC_Trust_" + (i + 1)).equalsIgnoreCase("Yes") || data.get("Additional_Interests_LLC_Trust_" + (i + 1)).equalsIgnoreCase(""))
                        clickCreateNewEntity();
                }
            }
            saveChanges();
        }
    }

    public void fillAdditionalInterestsDetailsHS_END(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests_END");

        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests_END").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(5000);
                clickFooter();

                if (additionalInterests == 1) {
                    setType(data.get("Additional_Interests_Type_END_1"), i);
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_END_1"), i);
                    setName(data.get("Additional_Interests_Name_END_1"), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_END_1"), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_END_1"), i);
                    setCity(data.get("Additional_Interests_City_END_1"), i);
                    setState(data.get("Additional_Interests_State_END_1"), i);
                    setZIP(data.get("Additional_Interests_ZIP_END_1"), i);
                    setLoan(data.get("Additional_Interests_Loan_END_1"), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_END_1"), i);
                } else {
                    setType(data.get("Additional_Interests_Type_END_" + (i + 1)), i);
                    saveChanges();
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_END_" + (i + 1)), i);
                    setName(data.get("Additional_Interests_Name_END_" + (i + 1)), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_END_" + (i + 1)), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_END_" + (i + 1)), i);
                    setCity(data.get("Additional_Interests_City_END_" + (i + 1)), i);
                    setState(data.get("Additional_Interests_State_END_" + (i + 1)), i);
                    setZIP(data.get("Additional_Interests_ZIP_END_" + (i + 1)), i);
                    setLoan(data.get("Additional_Interests_Loan_END_" + (i + 1)), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_END_" + (i + 1)), i);
                }
            }
            saveChanges();
        }
    }

    public void fillAdditionalInterestsDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests_OOS_END");

        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests_OOS_END").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(5000);
                clickFooter();

                if (additionalInterests == 1) {
                    setType(data.get("Additional_Interests_Type_OOS_END_1"), i);
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_OOS_END_1"), i);
                    setName(data.get("Additional_Interests_Name_OOS_END_1"), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_OOS_END_1"), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_OOS_END_1"), i);
                    setCity(data.get("Additional_Interests_City_OOS_END_1"), i);
                    setState(data.get("Additional_Interests_State_OOS_END_1"), i);
                    setZIP(data.get("Additional_Interests_ZIP_OOS_END_1"), i);
                    setLoan(data.get("Additional_Interests_Loan_OOS_END_1"), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_OOS_END_1"), i);
                } else {
                    setType(data.get("Additional_Interests_Type_OOS_END_" + (i + 1)), i);
                    saveChanges();
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_OOS_END_" + (i + 1)), i);
                    setName(data.get("Additional_Interests_Name_OOS_END_" + (i + 1)), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_OOS_END_" + (i + 1)), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_OOS_END_" + (i + 1)), i);
                    setCity(data.get("Additional_Interests_City_OOS_END_" + (i + 1)), i);
                    setState(data.get("Additional_Interests_State_OOS_END_" + (i + 1)), i);
                    setZIP(data.get("Additional_Interests_ZIP_OOS_END_" + (i + 1)), i);
                    setLoan(data.get("Additional_Interests_Loan_OOS_END_" + (i + 1)), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_OOS_END_" + (i + 1)), i);
                }
            }
            saveChanges();
        }
    }


    public void fillAdditionalInterestsDetailsHS_RNW(Map<String, String> data) throws Throwable {
        String additionalInterestsData = data.get("Additional_Interests_OOS_END");

        if (hasValue(additionalInterestsData) && !additionalInterestsData.equalsIgnoreCase(",")) {
            int additionalInterests = data.get("Additional_Interests_OOS_END").split(",").length;

            for (int i = 0; i < additionalInterests; i++) {
                clickAdd();
                pause(5000);
                clickFooter();

                if (additionalInterests == 1) {
                    setType(data.get("Additional_Interests_Type_RNW_1"), i);
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_RNW_1"), i);
                    setName(data.get("Additional_Interests_Name_RNW_1"), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_RNW_1"), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_RNW_1"), i);
                    setCity(data.get("Additional_Interests_City_RNW_1"), i);
                    setState(data.get("Additional_Interests_State_RNW_1"), i);
                    setZIP(data.get("Additional_Interests_ZIP_RNW_1"), i);
                    setLoan(data.get("Additional_Interests_Loan_RNW_1"), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_RNW_1"), i);
                } else {
                    setType(data.get("Additional_Interests_Type_RNW_" + (i + 1)), i);
                    saveChanges();
                    setLLCTrust(data.get("Additional_Interests_LLC_Trust_RNW_" + (i + 1)), i);
                    setName(data.get("Additional_Interests_Name_RNW_" + (i + 1)), i);
                    setAddressLine1(data.get("Additional_Interests_Address_Line_1_RNW_" + (i + 1)), i);
                    setAddressLine2(data.get("Additional_Interests_Address_Line_2_RNW_" + (i + 1)), i);
                    setCity(data.get("Additional_Interests_City_RNW_" + (i + 1)), i);
                    setState(data.get("Additional_Interests_State_RNW_" + (i + 1)), i);
                    setZIP(data.get("Additional_Interests_ZIP_RNW_" + (i + 1)), i);
                    setLoan(data.get("Additional_Interests_Loan_RNW_" + (i + 1)), i);
                    setMortgageType(data.get("Additional_Interests_Mortgage_Type_RNW_" + (i + 1)), i);
                }
            }
            saveChanges();
        }
    }

    public void clickCreateNewEntity() {
        clickElement(createNewEntity.get(createNewEntity.size() - 1), "Create New Entity");
    }

    public void setAddressForLiabilityCoverageForm(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(addressForLiabilityCoverageForm.get(i), "AddressLiabilityCoverageForm_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "AddressLiabilityCoverageForm_" + (i + 1));
        }
    }

    public void setPropertyDescription(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickFooter();
            clickElement(propertyDescription.get(i), "PropertyDescription_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "PropertyDescription_" + (i + 1));
        }
    }

    public void fillAdditionalInterestsDetailsDataTable(Map<String, String> data) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        for (int i = 0; i <= data.size(); i++) {
            if (data.get("Additional_Interests_Type_" + (i + 1)) == null) break;
            clickAdd();
            pause(3000);
            clickFooter();
            setType(data.get("Additional_Interests_Type_" + (i + 1)), i);
            saveChanges();
            setLLCTrust(data.get("Additional_Interests_LLC_Trust_" + (i + 1)), i);
            setName(data.get("Additional_Interests_Name_" + (i + 1)), i);
            setAddressLine1(data.get("Additional_Interests_Address_Line_1_" + (i + 1)), i);
            setCity(data.get("Additional_Interests_City_" + (i + 1)), i);
            setState(data.get("Additional_Interests_State_" + (i + 1)), i);
            setZIP(data.get("Additional_Interests_ZIP_" + (i + 1)), i);
            if (data.get("Additional_Interests_Loan_" + (i + 1)) != null && !data.get("Additional_Interests_Loan_" + (i + 1)).isEmpty()) {
                setLoan(data.get("Additional_Interests_Loan_" + (i + 1)), i);
            }
            if (data.get("Additional_Interests_Mortgage_Type_" + (i + 1)) != null && !data.get("Additional_Interests_Mortgage_Type_" + (i + 1)).isEmpty()) {
                setMortgageType(data.get("Additional_Interests_Mortgage_Type_" + (i + 1)), i);
            }
            if ("Yes".equalsIgnoreCase(data.get("Additional_Interests_LLC_Trust_" + (i + 1)))) {
                commonComponentsAndActions.verifyBlockVisibility("LLC/Trust", "visible");
                commonComponentsAndActions.verifyDropdownVisibility("Entity Name", "visible", "LLC/Trust");
                commonComponentsAndActions.verifyButtonVisibility("Create new Entity", "visible", "LLC/Trust");
                commonComponentsAndActions.reportScreenshot("LLC Trust block", "LLC Trust block");
                pause(2000);
                new PolicyInformationBlock(driver).clickCreateNewEntity();
                new CommonComponentsAndActions(driver).goToPage("Trust, LLC, Other Legal Entity - " + data.get("Additional_Interests_Name_" + (i + 1)));
            }
        }
        saveChanges();
        pause(3000);
    }

    public void fillAdditionalInterestsDetailsFS(Map<String, String> data) {

    }


}