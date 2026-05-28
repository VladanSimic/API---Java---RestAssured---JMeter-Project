package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class NamedAutoLiabilityExclusionBlock extends CommonComponentsAndActions {
    WebDriver driver;
    @FindBy(xpath = "//div[text()='named auto liability exclusion']/../../../../../../div[2]//span[text()='add']")
    WebElement namedAutoLiabilityExclusionAdd;
    @FindBy(xpath = "//div[text()='named auto liability exclusion']/../../../../../../div[2]//span[text()='delete']")
    WebElement namedAutoLiabilityExclusionDelete;
    @FindBy(xpath = "//span[text()='Year']/../../../../../../../../..//tr/td[1]/div")
    List<WebElement> year;
    @FindBy(xpath = "//span[text()='Make']/../../../../../../../../..//tr/td[2]/div")
    List<WebElement> make;
    @FindBy(xpath = "//span[text()='Model']/../../../../../../../../..//tr/td[3]/div")
    List<WebElement> model;
    @FindBy(xpath = "//span[text()='VIN']/../../../../../../../../..//tr/td[4]/div")
    List<WebElement> vin;
    public NamedAutoLiabilityExclusionBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addNamedAutoLiabilityExclusion(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_NamedAutoLiabilityExclusion");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] year = data.get("Named_Auto_Liability_Exclusion_Year").split(",");
                String[] make = data.get("Named_Auto_Liability_Exclusion_Make").split(",");
                String[] model = data.get("Named_Auto_Liability_Exclusion_Model").split(",");
                String[] vin = data.get("Named_Auto_Liability_Exclusion_VIN").split(",");
                if (isElementDisplayed(namedAutoLiabilityExclusionDelete)) {
                    deleteNamedAutoLiabilityExclusion();
                }
                for (int i = 0; i < year.length; i++) {
                    addNamedAutoLiabilityExclusion();
                    clickFooter();
                    setYear(year[i], i);
                    setMake(make[i], i);
                    setModel(model[i], i);
                    setVIN(vin[i], i);
                }
            }
        }
    }
    public void addNamedAutoLiabilityExclusion_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_NamedAutoLiabilityExclusion_END");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] year = data.get("Named_Auto_Liability_Exclusion_Year_END").split(",");
                String[] make = data.get("Named_Auto_Liability_Exclusion_Make_END").split(",");
                String[] model = data.get("Named_Auto_Liability_Exclusion_Model_END").split(",");
                String[] vin = data.get("Named_Auto_Liability_Exclusion_VIN_END").split(",");
                if (isElementDisplayed(namedAutoLiabilityExclusionDelete)) {
                    deleteNamedAutoLiabilityExclusion();
                }
                for (int i = 0; i < year.length; i++) {
                    addNamedAutoLiabilityExclusion();
                    clickFooter();
                    setYear(year[i], i);
                    setMake(make[i], i);
                    setModel(model[i], i);
                    setVIN(vin[i], i);
                }
            }
        }
    }

    public void addNamedAutoLiabilityExclusion_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_NamedAutoLiabilityExclusion_RNW");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] year = data.get("Named_Auto_Liability_Exclusion_Year_RNW").split(",");
                String[] make = data.get("Named_Auto_Liability_Exclusion_Make_RNW").split(",");
                String[] model = data.get("Named_Auto_Liability_Exclusion_Model_RNW").split(",");
                String[] vin = data.get("Named_Auto_Liability_Exclusion_VIN_RNW").split(",");
                if (isElementDisplayed(namedAutoLiabilityExclusionDelete)) {
                    deleteNamedAutoLiabilityExclusion();
                }
                for (int i = 0; i < year.length; i++) {
                    addNamedAutoLiabilityExclusion();
                    clickFooter();
                    setYear(year[i], i);
                    setMake(make[i], i);
                    setModel(model[i], i);
                    setVIN(vin[i], i);
                }
            }
        }
    }

    public void setYear(String value, int i) throws Throwable {
        if(!year.isEmpty()) {
            clickFooter();
            clickElement(year.get(i), "Named Auto Liability Exclusion - Year");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named auto liability exclusion - Year");
            clickFooter();
        }
    }

    public void setMake(String value, int i) throws Throwable {
        if(!make.isEmpty()) {
            clickFooter();
            clickElement(make.get(i), "Named Auto Liability Exclusion - Make");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named Auto Liability Exclusion - Make");
            clickFooter();
        }
    }

    public void setModel(String value, int i) throws Throwable {
        if(!model.isEmpty()) {
            clickFooter();
            clickElement(model.get(i), "Named Auto Liability Exclusion - Model");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named Auto Liability Exclusion - Model");
            clickFooter();
        }
    }
    public void setVIN(String value, int i) throws Throwable {
        if(!vin.isEmpty()) {
            clickFooter();
            clickElement(vin.get(i), "Named Auto Liability Exclusion - Address");
            typeTextEnter(driver.switchTo().activeElement(), value, "Named Auto Liability Exclusion - Address");
            clickFooter();
        }
    }

    public void addNamedAutoLiabilityExclusion() throws Throwable {
        if(isElementDisplayed(namedAutoLiabilityExclusionAdd)) {
            clickElement(namedAutoLiabilityExclusionAdd, "Named auto liability exclusion - Add");
            pause(2000);
            clickFooter();
        }
    }

    public void deleteNamedAutoLiabilityExclusion() throws Throwable {
        clickElement(namedAutoLiabilityExclusionDelete, "Named auto liability exclusion - Delete");
        pause(2000);
        clickFooter();
    }

}
