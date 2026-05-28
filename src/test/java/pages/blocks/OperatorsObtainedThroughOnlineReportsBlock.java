package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperatorsObtainedThroughOnlineReportsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public OperatorsObtainedThroughOnlineReportsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='operators obtained through online reports']")
    WebElement operatorBlock;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../following-sibling::div[1]//table//tbody//tr[1]/td[7]")
    List<WebElement> operatorRows;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Prefix']/../../../../div")
    List<WebElement> prefix;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='First Name']/../../../../div//input")
    List<WebElement> firstName;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='MI']/../../../../div//input")
    List<WebElement> mi;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Last Name']/../../../../div//input")
    List<WebElement> lastName;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Suffix']/../../../../div")
    List<WebElement> suffix;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Date of Birth']/../../../../div")
    List<WebElement> dob;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Driver Status']/../../../../div")
    List<WebElement> driverStatus;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//label[text()='Exclude']/..//input")
    List<WebElement> exclude;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Non-Driver Reason']/../../../../div")
    List<WebElement> nonDriverReason;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Gender']/../../../../div")
    List<WebElement> gender;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='License State']/../../../../div")
    List<WebElement> licenseState;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='License Number']/../../../../div")
    List<WebElement> licenseNumber;
    @FindBy(xpath = "//div[text()='operators obtained through online reports']/../../../../../..//td//div[text()='Relationship to Insured']/../../../../div")
    List<WebElement> relationshipToInsured;

    public Map<String, String> getOperatorData() {
        Map<String, String> data = new HashMap<>();
        data.put("Obtained_Operators_Num", String.valueOf(firstName.size()));
        for (int i = 0; i < Integer.parseInt(data.get("Obtained_Operators_Num")); i++) {
            try {
                data.put("Obtained_Operators_First_Name_" + (i + 1), firstName.get(i).getAttribute("value"));
            } catch (Exception e) {
                clickElementWithOffset(firstName.get(i), 30, 30);
                data.put("Obtained_Operators_First_Name_" + (i + 1), firstName.get(i).getAttribute("value"));
            }
            try {
                data.put("Obtained_Operators_MI_" + (i + 1), mi.get(i).getAttribute("value"));
            } catch (Exception e) {
                clickElementWithOffset(mi.get(i), 30, 30);
                data.put("Obtained_Operators_MI_" + (i + 1), mi.get(i).getAttribute("value"));
            }
            try {
                data.put("Obtained_Operators_Last_Name_" + (i + 1), lastName.get(i).getAttribute("value"));
            } catch (Exception e) {
                clickElementWithOffset(lastName.get(i), 30, 30);
                data.put("Obtained_Operators_Last_Name_" + (i + 1), lastName.get(i).getAttribute("value"));
            }
        }
        return data;
    }

    public void fillOperatorsDetailsPA(Map<String, String> data) throws Throwable {
        //TODO PA - add loop to handle multiple operators
        setOperatorStatus("Active", data.get("State"), 0);
        setOperatorDOB("07/20/1991", 0);
        if (data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("IL") ||
                data.get("State").equalsIgnoreCase("MO")) {
            setExclude("No");
        }
        setOperatorGender("Male", 0);
        setOperatorLicenseState("AK", 0);
        setOperatorLicenseNumber("123123", 0);
        setRelationshipToInsured("Friend", 0);
    }

    public boolean verifyIfDataReturned() {
        return operatorRows.size() != 0;
    }

    public void setOperatorDOB(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(dob.get(i), "DOB");
            typeText(driver.switchTo().activeElement(), value, "DOB");
            pause(2000);
            clickElement(operatorBlock, "Additional operators block");
        }
    }

    public void setOperatorStatus(String value, String state, int i) throws Throwable {
        clickElement(operatorBlock);
        if (hasValue(value) && !value.equalsIgnoreCase("Excluded")) {
            if (elementExists(driverStatus)) {
                clickElement(driverStatus.get(i));
                if (isVisibleOnly(By.xpath("//li[contains(text(),'" + value + "')]"))) {
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
                }
                pause(5000);
            } else {
                pause(5000);
                clickElement(operatorBlock);
                clickElement(driverStatus.get(i));
                clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
            }

            saveChanges();
            pause(2000);
            try {
                clickElement(operatorBlock);
            } catch (Exception e) {
                clickElementWithOffset(operatorBlock, 30, 30);
            }

        } else if (hasValue(value)) {
            switch (state) {
                case "AZ": {
                    clickElement(exclude.get(i));
                    saveChanges();
                }
                break;
                case "CO": {
                    clickElement(driverStatus.get(i));
                    clickElement(driver.findElement(By.xpath("//li[contains(text(),'Excluded Driver')]")));
                    pause(2000);
                    saveChanges();
                    clickElement(operatorBlock);
                }
                break;
            }
        }
    }

    public void setExclude(String value) throws Throwable {
        checkCheckbox(exclude.get(0), value, "Exclude");
    }

    public void setOperatorGender(String value, int i) throws Throwable {
        if (hasValue(value)) {
            if (elementExists(gender)) {
                clickElement(operatorBlock);
                clickElement(gender.get(i));
                pause(3000);
            } else {
                pause(2000);
                clickElement(operatorBlock);
                clickElement(gender.get(i));
                pause(2000);
            }

            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(operatorBlock);
        }
    }

    public void setOperatorLicenseState(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(licenseState.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(operatorBlock);
        }
    }

    public void setOperatorLicenseNumber(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(licenseNumber.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(operatorBlock);
        }
    }

    public void setRelationshipToInsured(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(relationshipToInsured.get(i));
            typeText(driver.switchTo().activeElement(), value);
            pause(2000);
            clickElement(operatorBlock);
        }
    }

}