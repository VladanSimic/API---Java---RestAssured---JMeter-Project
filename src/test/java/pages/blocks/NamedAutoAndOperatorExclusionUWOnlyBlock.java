package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class NamedAutoAndOperatorExclusionUWOnlyBlock extends CommonComponentsAndActions {
    WebDriver driver;
    @FindBy(xpath = "//div[contains(text(),'operator for a specific auto')]/../../../..//label[text()='Yes']/..//input")
    WebElement operatorForASpecificAutoYes;
    @FindBy(xpath = "//div[contains(text(),'operator for a specific auto')]/../../../..//label[text()='No']/..//input")
    WebElement operatorForASpecificAutoNo;
    @FindBy(xpath = "//div[contains(text(),'Named Auto and Operator Exclusion')]/../../../../../..//span[text()='add']")
    WebElement addBtn;
    @FindBy(xpath = "//div[contains(text(),'Named Auto and Operator Exclusion')]/../../../../../..//span[text()='delete']")
    WebElement deleteBtn;
    @FindBy(xpath = "//div[text()='Named Auto and Operator Exclusion (underwriters only)']")
    List<WebElement> namedAutoAndOperatorExclusionBlock;

    public NamedAutoAndOperatorExclusionUWOnlyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillNamedAutoAndOperatorExclusionUWOnly(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("State"));
        if (hasValue(data.get("Exclude_An_Operator_For_A_Specific_Auto")) && data.get("Exclude_An_Operator_For_A_Specific_Auto").equalsIgnoreCase("Yes")) {
            if (isElementDisplayed(operatorForASpecificAutoYes, 5)) {
                clickElement(operatorForASpecificAutoYes);
            }
            if (isElementDisplayed(deleteBtn)) {
                clickElement(deleteBtn);
            }
            for (int i = 1; i <= Integer.parseInt(data.get("Named_Auto_And_Operator_Exclusion")); i++) {
                if (isElementDisplayed(addBtn)) {
                    clickElement(addBtn);
                }
                pause(2000);
                if (!namedAutoAndOperatorExclusionBlock.isEmpty()) {
                    clickElement(namedAutoAndOperatorExclusionBlock.get(1));
                }
                setYear(data.get("Named_Auto_And_Operator_Exclusion_Year").split(",")[i - 1], i);
                setMake(data.get("Named_Auto_And_Operator_Exclusion_Make").split(",")[i - 1], i);
                setModel(data.get("Named_Auto_And_Operator_Exclusion_Model").split(",")[i - 1], i);
                setVIN(data.get("Named_Auto_And_Operator_Exclusion_VIN").split(",")[i - 1], i);
                setName(data.get("Named_Auto_And_Operator_Exclusion_Name").split(",")[i - 1], i);
                setOperatorLicense(data.get("Named_Auto_And_Operator_Exclusion_Operator_License").split(",")[i - 1], i);
                setStateOfIssuance(data.get("Named_Auto_And_Operator_Exclusion_State_Of_Issuance").split(",")[i - 1], i);
                setDateOfBirth(data.get("Named_Auto_And_Operator_Exclusion_Date_Of_Birth").split(",")[i - 1], i);
            }

        } else {
            //clickElement(operatorForASpecificAutoNo);
        }
    }

    public void fillNamedAutoAndOperatorExclusionUWOnly_END(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("State"));
        if (hasValue(data.get("Exclude_An_Operator_For_A_Specific_Auto_END")) && data.get("Exclude_An_Operator_For_A_Specific_Auto_END").equalsIgnoreCase("Yes")) {
            if (isElementDisplayed(operatorForASpecificAutoYes)) {
                clickElement(operatorForASpecificAutoYes);
            }
            if (isElementDisplayed(deleteBtn)) {
                clickElement(deleteBtn);
            }
            for (int i = 1; i <= Integer.parseInt(data.get("Named_Auto_And_Operator_Exclusion_END")); i++) {
                if (isElementDisplayed(addBtn)) {
                    clickElement(addBtn);
                }
                pause(2000);
                if(!namedAutoAndOperatorExclusionBlock.isEmpty()) {
                    clickElement(namedAutoAndOperatorExclusionBlock.get(1));
                }
                setYear(data.get("Named_Auto_And_Operator_Exclusion_Year_END").split(",")[i - 1], i);
                setMake(data.get("Named_Auto_And_Operator_Exclusion_Make_END").split(",")[i - 1], i);
                setModel(data.get("Named_Auto_And_Operator_Exclusion_Model_END").split(",")[i - 1], i);
                setVIN(data.get("Named_Auto_And_Operator_Exclusion_VIN_END").split(",")[i - 1], i);
                setName(data.get("Named_Auto_And_Operator_Exclusion_Name_END").split(",")[i - 1], i);
                setOperatorLicense(data.get("Named_Auto_And_Operator_Exclusion_Operator_License_END").split(",")[i - 1], i);
                setStateOfIssuance(data.get("Named_Auto_And_Operator_Exclusion_State_Of_Issuance_END").split(",")[i - 1], i);
                setDateOfBirth(data.get("Named_Auto_And_Operator_Exclusion_Date_Of_Birth_END").split(",")[i - 1], i);

            }

        } else {
            clickElement(operatorForASpecificAutoNo);
        }

    }

    public void fillNamedAutoAndOperatorExclusionUWOnly_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("State"));
        if (hasValue(data.get("Exclude_An_Operator_For_A_Specific_Auto_RNW")) && data.get("Exclude_An_Operator_For_A_Specific_Auto_RNW").equalsIgnoreCase("Yes")) {
            if (isElementDisplayed(operatorForASpecificAutoYes)) {
                clickElement(operatorForASpecificAutoYes);
            }
            if (isElementDisplayed(deleteBtn)) {
                clickElement(deleteBtn);
            }
            for (int i = 1; i <= Integer.parseInt(data.get("Named_Auto_And_Operator_Exclusion_RNW")); i++) {
                if (isElementDisplayed(addBtn)) {
                    clickElement(addBtn);
                }
                pause(2000);
                if (!namedAutoAndOperatorExclusionBlock.isEmpty()) {
                    clickElement(namedAutoAndOperatorExclusionBlock.get(1));
                }
                setYear(data.get("Named_Auto_And_Operator_Exclusion_Year_RNW").split(",")[i - 1], i);
                setMake(data.get("Named_Auto_And_Operator_Exclusion_Make_RNW").split(",")[i - 1], i);
                setModel(data.get("Named_Auto_And_Operator_Exclusion_Model_RNW").split(",")[i - 1], i);
                setVIN(data.get("Named_Auto_And_Operator_Exclusion_VIN_RNW").split(",")[i - 1], i);
                setName(data.get("Named_Auto_And_Operator_Exclusion_Name_RNW").split(",")[i - 1], i);
                setOperatorLicense(data.get("Named_Auto_And_Operator_Exclusion_Operator_License_RNW").split(",")[i - 1], i);
                setStateOfIssuance(data.get("Named_Auto_And_Operator_Exclusion_State_Of_Issuance_RNW").split(",")[i - 1], i);
                setDateOfBirth(data.get("Named_Auto_And_Operator_Exclusion_Date_Of_Birth_RNW").split(",")[i - 1], i);

            }

        } else {
            if (isElementDisplayed(operatorForASpecificAutoNo)) {
                clickElement(operatorForASpecificAutoNo);
            }
        }

    }

    public void setYear(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='Year']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div")) {
            typeTextToActiveElement(value, "//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='Year']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div");
        }
    }

    public void setMake(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='Make']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[2]/div")) {
            typeTextToActiveElement(value, "//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='Make']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[2]/div");
        }
    }

    public void setModel(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='Model']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[3]/div")) {
            typeTextToActiveElement(value, "//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='Model']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[3]/div");
        }
    }

    public void setVIN(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='VIN']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[4]/div")) {
            typeTextToActiveElement(value, "//div[text()='Named Auto and Operator Exclusion (underwriters only)']/../../../../../..//span[text()='VIN']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[4]/div");
        }
    }

    public void setName(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[text()='Name']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[5]/div")) {
            typeTextToActiveElement(value, "//span[text()='Name']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[5]/div");
        }
    }

    public void setOperatorLicense(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[contains(text(), concat(\"Operator\",\"'\", \"s License Number\"))]/../../../../../../../../../div[3]//table[1]//tr/td[6]/div")) {
            typeTextToActiveElement(value, "//span[contains(text(), concat(\"Operator\",\"'\", \"s License Number\"))]/../../../../../../../../../div[3]//table[1]//tr/td[6]/div");
        }
    }

    public void setStateOfIssuance(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[text()='State of Issuance']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[7]/div")) {
            typeTextToActiveElement(value, "//span[text()='State of Issuance']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[7]/div");
        }
    }

    public void setDateOfBirth(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[text()='Date of Birth']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[8]/div")) {
            typeTextToActiveElement(value, "//span[text()='Date of Birth']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[8]/div");
        }
    }

    public void verifyBlockExists(String state) throws Throwable {
        if (state.equalsIgnoreCase("OR"))
            super.verifyBlockExists("Named Auto and Operator Exclusion (underwriters only)");
    }

}
