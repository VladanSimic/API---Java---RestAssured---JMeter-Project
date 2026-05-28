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

public class OperatorsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OperatorsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td//div[text()='Prefix']/../../../../div//input")
    List<WebElement> prefix;
    @FindBy(xpath = "//td//div[text()='First Name']/../../../../div//input")
    List<WebElement> firstName;
    @FindBy(xpath = "//td//div[text()='MI']/../../../../div//input")
    List<WebElement> mi;
    @FindBy(xpath = "//td//div[text()='Last Name']/../../../../div//input")
    List<WebElement> lastName;
    @FindBy(xpath = "//td//div[text()='Suffix']/../../../../div//input")
    List<WebElement> suffix;
    @FindBy(xpath = "//td//div[text()='Date of Birth']/../../../../div//input")
    List<WebElement> dob;
    @FindBy(xpath = "//td//div[text()='License State']/../../../../div//input")
    List<WebElement> licenseState;
    @FindBy(xpath = "//td//div[text()='License Number']/../../../../div//input")
    List<WebElement> licenseNumber;
    @FindBy(xpath = "//td//div[text()='Relationship to insured']/../../../../div//input")
    List<WebElement> relationshipToInsured;
    @FindBy(xpath = "//div[text()='Exclude']/../../../..//input")
    List<WebElement> exclude;
    @FindBy(xpath = "//div[text()='operators']/../../../../../..//*[text()='add']")
    WebElement addOperatorsBtn;
    @FindBy(xpath = " //div[text()='additional operators']/../../../../../..//*[text()='add']")
    WebElement addAdditionalOperatorsBtn;
    @FindBy(xpath = "//div[text()='additional operators']")
    WebElement additionalOperatorsBlock;
    @FindBy(xpath = "//div[text()='operators']")
    WebElement operatorsBlock;
    @FindBy(xpath = "//div[text()='License State']/../../../../div//input")
    WebElement licenseStateES;
    @FindBy(xpath = "//div[text()='License Number']/../../../../div//input")
    WebElement licenseNumberES;
    @FindBy(xpath = "//div[text()='Gender']/../../../../div//input")
    List<WebElement> gender;
    @FindBy(xpath = "//div[text()='Household Members']/../../../../div//input")
    List<WebElement> householdMembers;
    @FindBy(xpath = "//div[text()='Household Locations']/../../../../div//input")
    List<WebElement> householdLocations;
    @FindBy(xpath = "//span[text()='run auto CLUE']")
    List<WebElement> runAutoClueButton;
    @FindBy(xpath = "//div[contains(text(),\"resided at the primary risk location\")]/../../../..//label[text()='No']")
    List<WebElement> residedAtRiskLocationNo;
    @FindBy(xpath = "//div[contains(text(),\"resided at the primary risk location\")]/../../../..//label[text()='Yes']")
    List<WebElement> residedAtRiskLocationYes;

    @FindBy(xpath = "//div[text()='Year Licensed']/../../../..//input")
    List<WebElement> yearLicensed;

    public void fillOperatorDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("operators");
        pause(3000);
        setLicenseStateES(data);
        saveChanges();
        pause(2000);
        setLicenseNumber(data.get("License_Number"), 0);
        saveChanges();
    }

    public void fillOperatorDetailsES(Map<String, String> data) throws Throwable {
        verifyBlockExists("additional operators");
        //additional operators
        setGender(data);
        setLicenseStateES(data);
        setLicenseNumberES(data);
        saveChanges();

        //auto clue reports
        setHouseholdMembers(data);
        setHouseholdLocations(data);
        pause(1000);
        if (runAutoClueButton.size() > 0) {
            clickElement(runAutoClueButton.get(0));
        }
    }


    public void fillOperatorDetails_RNW(Map<String, String> data) throws Throwable {
        setLicenseState(data.get("License_State_RNW"), 0);
        pause(2000);
        setLicenseNumber(data.get("License_Number_RNW"), 0);
        saveChanges();
    }

    public void fillOperatorDetails_END(Map<String, String> data) throws Throwable {
        setLicenseState(data.get("License_State_END"), 0);
        pause(2000);
        setLicenseNumber(data.get("License_Number_END"), 0);
        saveChanges();
    }

    public void fillOperatorDetails_OOS_END(Map<String, String> data) throws Throwable {
        setLicenseState(data.get("License_State_OOS_END"), 0);
        pause(2000);
        setLicenseNumber(data.get("License_Number_OOS_END"), 0);
        saveChanges();
    }

    public void addAdditionalOperators(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Operators_Num"))) {
            int additionalOperatorsNum = Integer.parseInt(data.get("Additional_Operators_Num"));
            for (int i = 1; i <= additionalOperatorsNum; i++) {
                clickElement(addOperatorsBtn, "Add operators");
                pause(3000);
                clickElement(operatorsBlock, "Operators block");
                setPrefix(data.get("Additional_Operator_Prefix").split(",")[i - 1], i);
                setFirstName(data.get("Additional_Operator_FirstName").split(",")[i - 1], i);
                setMI(data.get("Additional_Operator_MI").split(",")[i - 1], i);
                setLastName(data.get("Additional_Operator_LastName").split(",")[i - 1], i);
                setSuffix(data.get("Additional_Operator_Suffix").split(",")[i - 1], i);
                setDOB(data.get("Additional_Operator_DOB").split(",")[i - 1], i);
                setLicenseState(data.get("Additional_Operator_License_State").split(",")[i - 1], i);
                setLicenseNumber(data.get("Additional_Operator_License_Number").split(",")[i - 1], i);
                setRelationshipToInsured(data.get("Additional_Operator_Relationship_To_Insured").split(",")[i - 1], i);
                setExclude(data.get("Additional_Operator_Exclude").split(",")[i - 1], i);
                if (data.get("Additional_Operator_Year_Licensed").split(",").length > 0) {
                    setYearLicensed(data.get("Additional_Operator_Year_Licensed").split(",")[i - 1], i);
                }
                saveChanges();
            }
        }
    }

    public void addAdditionalOperators_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Operators_Num_END"))) {
            int additionalOperatorsNum = Integer.parseInt(data.get("Additional_Operators_Num_END"));
            for (int i = 1; i <= additionalOperatorsNum; i++) {
                int totalOperators = i + Integer.parseInt(data.get("Additional_Operators_Num"));
                clickElement(addOperatorsBtn);
                pause(3000);
                clickElement(operatorsBlock);
                setPrefix(data.get("Additional_Operator_Prefix_END").split(",")[i - 1], totalOperators);
                setFirstName(data.get("Additional_Operator_FirstName_END").split(",")[i - 1], totalOperators);
                setMI(data.get("Additional_Operator_MI_END").split(",")[i - 1], totalOperators);
                setLastName(data.get("Additional_Operator_LastName_END").split(",")[i - 1], totalOperators);
                setSuffix(data.get("Additional_Operator_Suffix_END").split(",")[i - 1], totalOperators);
                setDOB(data.get("Additional_Operator_DOB_END").split(",")[i - 1], totalOperators);
                setLicenseState(data.get("Additional_Operator_License_State_END").split(",")[i - 1], totalOperators);
                setLicenseNumber(data.get("Additional_Operator_License_Number_END").split(",")[i - 1], totalOperators);
                setRelationshipToInsured(data.get("Additional_Operator_Relationship_To_Insured_END").split(",")[i - 1], totalOperators);
                setExclude(data.get("Additional_Operator_Exclude_END").split(",")[i - 1], totalOperators);
                setResidedAtRiskLocation(data.get("Additional_Operator_ResidedAtRiskLocation_END").split(",")[i - 1], totalOperators);
                if (residedAtRiskLocationYes.size() > 0) {
                    clickElement(residedAtRiskLocationYes.get(i));
                }
                saveChanges();
            }
        }
    }

    public void addAdditionalOperators_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Operators_Num_OOS_END"))) {
            int additionalOperatorsNum = Integer.parseInt(data.get("Additional_Operators_Num_OOS_END"));
            for (int i = 1; i <= additionalOperatorsNum; i++) {
                int totalOperators = i + Integer.parseInt(data.get("Additional_Operators_Num"));
                clickElement(addOperatorsBtn);
                pause(3000);
                clickElement(operatorsBlock);
                setPrefix(data.get("Additional_Operator_Prefix_OOS_END").split(",")[i - 1], totalOperators);
                setFirstName(data.get("Additional_Operator_FirstName_OOS_END").split(",")[i - 1], totalOperators);
                setMI(data.get("Additional_Operator_MI_OOS_END").split(",")[i - 1], totalOperators);
                setLastName(data.get("Additional_Operator_LastName_OOS_END").split(",")[i - 1], totalOperators);
                setSuffix(data.get("Additional_Operator_Suffix_OOS_END").split(",")[i - 1], totalOperators);
                setDOB(data.get("Additional_Operator_DOB_OOS_END").split(",")[i - 1], totalOperators);
                setLicenseState(data.get("Additional_Operator_License_State_OOS_END").split(",")[i - 1], totalOperators);
                setLicenseNumber(data.get("Additional_Operator_License_Number_OOS_END").split(",")[i - 1], totalOperators);
                setRelationshipToInsured(data.get("Additional_Operator_Relationship_To_Insured_OOS_END").split(",")[i - 1], totalOperators);
                setExclude(data.get("Additional_Operator_Exclude_OOS_END").split(",")[i - 1], totalOperators);
                saveChanges();
            }
        }
    }

    public void addAdditionalOperators_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Operators_Num_RNW"))) {
            int totalOperators = 0;
            int endorsementAdditionalOperators = Integer.parseInt(data.get("Additional_Operators_Num_END"));
            int additionalOperatorsNum = Integer.parseInt(data.get("Additional_Operators_Num_RNW"));
            for (int i = 1; i <= additionalOperatorsNum; i++) {
                if (data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
                    totalOperators = i + Integer.parseInt(data.get("Additional_Operators_Num")) + endorsementAdditionalOperators;
                } else {
                    totalOperators = i + Integer.parseInt(data.get("Additional_Operators_Num"));
                }
                clickElement(addOperatorsBtn);
                pause(3000);
                clickElement(operatorsBlock);
                setPrefix(data.get("Additional_Operator_Prefix_RNW").split(",")[i - 1], totalOperators);
                setFirstName(data.get("Additional_Operator_FirstName_RNW").split(",")[i - 1], totalOperators);
                setMI(data.get("Additional_Operator_MI_RNW").split(",")[i - 1], totalOperators);
                setLastName(data.get("Additional_Operator_LastName_RNW").split(",")[i - 1], totalOperators);
                setSuffix(data.get("Additional_Operator_Suffix_RNW").split(",")[i - 1], totalOperators);
                setDOB(data.get("Additional_Operator_DOB_RNW").split(",")[i - 1], totalOperators);
                setLicenseState(data.get("Additional_Operator_License_State_RNW").split(",")[i - 1], totalOperators);
                setLicenseNumber(data.get("Additional_Operator_License_Number_RNW").split(",")[i - 1], totalOperators);
                setRelationshipToInsured(data.get("Additional_Operator_Relationship_To_Insured_RNW").split(",")[i - 1], totalOperators);
                setExclude(data.get("Additional_Operator_Exclude_RNW").split(",")[i - 1], totalOperators);
                saveChanges();
            }
        }
    }

    public void deleteOperators_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Delete_Additional_Operators_END"))) {
            String[] toDelete = data.get("Delete_Additional_Operators_END").split(",");
            for (int i = 0; i < toDelete.length - 1; i++) {
                if (hasValue(toDelete[i]) && !toDelete[i].equals("0")) {
                    clickElement(driver.findElement(By.xpath("//span[text()='Exclude']/../../../../../../../../../div[3]//table[" + toDelete[i + 1] + "]//tr/td[11]/div//button")));
                }
            }
        }
    }

    public void deleteOperators_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Delete_Additional_Operators_OOS_END"))) {
            String[] toDelete = data.get("Delete_Additional_Operators_OOS_END").split(",");
            for (int i = 0; i < toDelete.length - 1; i++) {
                if (hasValue(toDelete[i]) && !toDelete[i].equals("0")) {
                    clickElement(driver.findElement(By.xpath("//span[text()='Exclude']/../../../../../../../../../div[3]//table[" + toDelete[i + 1] + "]//tr/td[11]/div//button")));
                }
            }
        }
    }

    public void deleteOperators_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Delete_Additional_Operators_RNW"))) {
            String[] toDelete = data.get("Delete_Additional_Operators_RNW").split(",");
            for (int i = 0; i < toDelete.length - 1; i++) {
                if (hasValue(toDelete[i]) && !toDelete[i].equals("0")) {
                    clickElement(driver.findElement(By.xpath("//span[text()='Exclude']/../../../../../../../../../div[3]//table[" + toDelete[i + 1] + "]//tr/td[11]/div//button")));
                }
            }
        }
    }

    public void setPrefix(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(prefix.get(i), "Prefix, index: " + i + " value: " + value);
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setFirstName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(firstName.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setMI(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(mi.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setLastName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(lastName.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setSuffix(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(suffix.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setDOB(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(dob.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setLicenseNumber(String value, int index) throws Throwable {
        pause(1000);
        if (hasValue(value)) {
            clickElement(licenseNumber.get(index));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setLicenseState(String value, int index) {
        try {
            if (hasValue(value)) {
                clickElement(licenseState.get(index), "License state, index: " + index + " value: " + value);
                pause(1000);
                driver.switchTo().activeElement().sendKeys(value);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setLicenseStateES(Map<String, String> data) throws Throwable {
        typeText(licenseStateES, data.get("License_State"), "License State");
        pause(1000);
    }

    public void setLicenseNumberES(Map<String, String> data) throws Throwable {
        typeText(licenseNumberES, data.get("License_Number"), "License Number");
        pause(1000);
    }

    public void setGender(Map<String, String> data) throws Throwable {
        if (gender.size() > 0) {
            pause(3000);
            driver.switchTo().activeElement().click();
            typeText(gender.get(0), data.get("Gender"));
            pause(1000);
        }
    }

    public void setHouseholdMembers(Map<String, String> data) throws Throwable {
        if (householdMembers.size() > 0) {
            typeText(householdMembers.get(0), data.get("Household_Members"));
            pause(1000);
        }
    }

    public void setHouseholdLocations(Map<String, String> data) throws Throwable {
        if (householdLocations.size() > 0) {
            typeText(householdLocations.get(0), data.get("Household_Locations"));
            pause(1000);
        }
    }


    public void setRelationshipToInsured(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(relationshipToInsured.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            clickFooter();
        }
    }

    public void setExclude(String value, int i) throws Throwable {
        if (hasValue(value)) {
            if (isElementDisplayed(exclude.get(i))) {
                pause(1000);
                checkCheckbox(exclude.get(i), value);
            }
        }
    }

    public void clickAddOperator() throws Throwable {
        clickElement(addOperatorsBtn);
        pause(2000);
    }

    public void setResidedAtRiskLocation(String value, int index) throws Throwable {
        choose(residedAtRiskLocationYes.get(index), residedAtRiskLocationNo.get(index), value);
    }

    public void addAdditionalOperatorsES(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Additional_Operators_Num"))) {
            int additionalOperatorsNum = Integer.parseInt(data.get("Additional_Operators_Num"));
            for (int i = 1; i <= additionalOperatorsNum; i++) {
                clickElement(addAdditionalOperatorsBtn, "Add  additional operators");
                pause(3000);
                clickElement(additionalOperatorsBlock, "Additional operators block");
                setPrefix(data.get("Additional_Operator_Prefix").split(",")[i - 1], i);
                setFirstName(data.get("Additional_Operator_FirstName").split(",")[i - 1], i);
                setMI(data.get("Additional_Operator_MI").split(",")[i - 1], i);
                setLastName(data.get("Additional_Operator_LastName").split(",")[i - 1], i);
                setSuffix(data.get("Additional_Operator_Suffix").split(",")[i - 1], i);
                setDOB(data.get("Additional_Operator_DOB").split(",")[i - 1], i);
                setGenderES(data.get("Additional_Operator_Gender").split(",")[i - 1], i);
                setLicenseState(data.get("Additional_Operator_License_State").split(",")[i - 1], i);
                setLicenseNumber(data.get("Additional_Operator_License_Number").split(",")[i - 1], i);
                setRelationshipToInsured(data.get("Additional_Operator_Relationship_To_Insured").split(",")[i - 1], i);
                setExclude(data.get("Additional_Operator_Exclude").split(",")[i - 1], i);
                saveChanges();
            }
        }
    }

    public void setGenderES(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(gender.get(i));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void fillAutoClueReportsES(Map<String, String> data) throws Throwable {
        verifyBlockExists("auto CLUE reports");
        verifyBlockExists("auto CLUE reports order history");
        setHouseholdMembers(data);
        setHouseholdLocations(data);
        pause(1000);
        if (runAutoClueButton.size() > 0) {
            clickElement(runAutoClueButton.get(0));
        }
    }

    public void setYearLicensed(String value, int i) throws Throwable {
        if (hasValue(value)) {
            if (isElementDisplayed(yearLicensed.get(i))) {
                pause(1000);
                checkCheckbox(yearLicensed.get(i), value);
            }
        }
    }
}