package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class NamedPersonExclusionBlock extends CommonComponentsAndActions {
    WebDriver driver;
    @FindBy(xpath = "//div[text()='named person exclusion']/../../../../../../div[2]//span[text()='add']")
    WebElement namedPersonExclusionAdd;
    @FindBy(xpath = "//div[text()='named person exclusion']/../../../../../../div[2]//span[text()='delete']")
    WebElement namedPersonExclusionDelete;
    @FindBy(xpath = "//span[text()='First name']/../../../../../../../../..//tr/td[1]/div")
    List<WebElement> firstName;
    @FindBy(xpath = "//span[text()='Last name']/../../../../../../../../..//tr/td[2]/div")
    List<WebElement> lastName;
    @FindBy(xpath = "//span[text()='DOB']/../../../../../../../../..//tr/td[3]/div")
    List<WebElement> dob;
    @FindBy(xpath = "//span[text()='Address']/../../../../../../../../..//tr/td[4]/div")
    List<WebElement> address;

    public NamedPersonExclusionBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addNamedPersonExclusion(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_NamedPersonExclusion");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] firstName = data.get("Named_Person_Exclusion_Block_First_Name").split(",");
                String[] lastName = data.get("Named_Person_Exclusion_Block_Last_Name").split(",");
                String[] dob = data.get("Named_Person_Exclusion_Block_DOB").split(",");
                String[] address = data.get("Named_Person_Exclusion_Block_Address").split(",");
                if (isElementDisplayed(namedPersonExclusionDelete)) {
                    deleteNamedPersonExclusionBtn();
                }
                for (int i = 0; i < firstName.length; i++) {
                    addNamedPersonExclusionBtn();
                    clickFooter();
                    setFirstName(firstName[i], i);
                    setLastName(lastName[i], i);
                    setDOB(dob[i], i);
                    setAddress(address[i], i);
                }
            }
        }
    }

    public void addNamedPersonExclusion_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_NamedPersonExclusion_END");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] firstName = data.get("Named_Person_Exclusion_Block_First_Name_END").split(",");
                String[] lastName = data.get("Named_Person_Exclusion_Block_Last_Name_END").split(",");
                String[] dob = data.get("Named_Person_Exclusion_Block_DOB_END").split(",");
                String[] address = data.get("Named_Person_Exclusion_Block_Address_END").split(",");
                if (isElementDisplayed(namedPersonExclusionDelete)) {
                    deleteNamedPersonExclusionBtn();
                }
                for (int i = 0; i < firstName.length; i++) {
                    addNamedPersonExclusionBtn();
                    clickFooter();
                    setFirstName(firstName[i], i);
                    setLastName(lastName[i], i);
                    setDOB(dob[i], i);
                    setAddress(address[i], i);
                }
            }
        }
    }

    public void addNamedPersonExclusion_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_NamedPersonExclusion_RNW");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] firstName = data.get("Named_Person_Exclusion_Block_First_Name_RNW").split(",");
                String[] lastName = data.get("Named_Person_Exclusion_Block_Last_Name_RNW").split(",");
                String[] dob = data.get("Named_Person_Exclusion_Block_DOB_RNW").split(",");
                String[] address = data.get("Named_Person_Exclusion_Block_Address_RNW").split(",");
                if (isElementDisplayed(namedPersonExclusionDelete)) {
                    deleteNamedPersonExclusionBtn();
                }
                for (int i = 0; i < firstName.length; i++) {
                    addNamedPersonExclusionBtn();
                    clickFooter();
                    setFirstName(firstName[i], i);
                    setLastName(lastName[i], i);
                    setDOB(dob[i], i);
                    setAddress(address[i], i);
                }
            }
        }
    }


    public void setFirstName(String value, int i) throws Throwable {
        if(!firstName.isEmpty()) {
            clickFooter();
            clickElement(firstName.get(i), "Named Person Exclusion - First Name");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named Person Exclusion - First Name");
            clickFooter();
        }
    }

    public void setLastName(String value, int i) throws Throwable {
        if(!lastName.isEmpty()) {
            clickFooter();
            clickElement(lastName.get(i), "Named Person Exclusion - Last Name");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named Person Exclusion - Last Name");
            clickFooter();
        }
    }

    public void setDOB(String value, int i) throws Throwable {
        if (!dob.isEmpty()) {
            clickFooter();
            clickElement(dob.get(i), "Named Person Exclusion - DOB");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named Person Exclusion - DOB");
            clickFooter();
        }
    }

    public void setAddress(String value, int i) throws Throwable {
        if (!address.isEmpty()) {
            clickFooter();
            clickElement(address.get(i), "Named Person Exclusion - Address");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named Person Exclusion - Address");
            clickFooter();
        }
    }

    public void addNamedPersonExclusionBtn() throws Throwable {
        if (isElementDisplayed(namedPersonExclusionAdd)) {
            clickElement(namedPersonExclusionAdd, "Named Person Exclusion - Add");
            pause(2000);
            clickFooter();
        }
    }

    public void deleteNamedPersonExclusionBtn() throws Throwable {
        clickElement(namedPersonExclusionDelete, "Named Person Exclusion - Delete");
        pause(2000);
        clickFooter();
    }

}
