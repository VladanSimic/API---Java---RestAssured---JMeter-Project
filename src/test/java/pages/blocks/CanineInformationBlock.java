package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class CanineInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public CanineInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='canine information']/../../../../../../div[2]//span[text()='add']")
    WebElement caninePetAdd;
    @FindBy(xpath = "//div[text()='canine information']/../../../../../../div[2]//span[text()='delete']")
    WebElement caninePetDelete;
    @FindBy(xpath = "//span[text()='Pet name']/../../../../../../../../..//tr/td[1]/div")
    List<WebElement> caninePetName;
    @FindBy(xpath = "//span[text()='Breed']/../../../../../../../../..//tr/td[2]/div")
    List<WebElement> canineBreed;
    @FindBy(xpath = "//span[text()='Description']/../../../../../../../../..//tr/td[3]/div")
    List<WebElement> canineDescription;
    @FindBy(xpath = "//div[text()='Canine Liability Exclusion']/../../../..//label[text()='Yes']/..//input")
    WebElement canineLiabilityExclusionYes;
    @FindBy(xpath = "//div[text()='Canine Liability Exclusion']/../../../..//label[text()='No']/..//input")
    WebElement canineLiabilityExclusionNo;

    public void addCanineLiabilityExclusion(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_Canine_Liability_Exclusion");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] petName = data.get("Optional_Coverages_Canine_Pet_Name").split(",");
                String[] breed = data.get("Optional_Coverages_Canine_Breed").split(",");
                String[] description = data.get("Optional_Coverages_Canine_Description").split(",");
                if (isElementDisplayed(caninePetDelete)) {
                    deleteCanine();
                }
                for (int i = 0; i < petName.length; i++) {
                    addCanine();
                    clickFooter();
                    setCaninePetName(petName[i], i);
                    setCanineBreed(breed[i], i);
                    setCanineDescription(description[i], i);
                }
            }
        }
    }

    public void addCanineLiabilityExclusion_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_Canine_Liability_Exclusion_END");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] petName = data.get("Optional_Coverages_Canine_Pet_Name_END").split(",");
                String[] breed = data.get("Optional_Coverages_Canine_Breed_END").split(",");
                String[] description = data.get("Optional_Coverages_Canine_Description_END").split(",");
                if (isElementDisplayed(caninePetDelete)) {
                    deleteCanine();
                }
                for (int i = 0; i < petName.length; i++) {
                    addCanine();
                    clickFooter();
                    setCaninePetName(petName[i], i);
                    setCanineBreed(breed[i], i);
                    setCanineDescription(description[i], i);
                }
            }
        }
    }

    public void addCanineLiabilityExclusion_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_Canine_Liability_Exclusion_RNW");
        if (hasValue(condition)) {
            if (condition.equalsIgnoreCase("Yes")) {
                String[] petName = data.get("Optional_Coverages_Canine_Pet_Name_RNW").split(",");
                String[] breed = data.get("Optional_Coverages_Canine_Breed_RNW").split(",");
                String[] description = data.get("Optional_Coverages_Canine_Description_RNW").split(",");
                if (isElementDisplayed(caninePetDelete)) {
                    deleteCanine();
                }
                for (int i = 0; i < petName.length; i++) {
                    addCanine();
                    clickFooter();
                    setCaninePetName(petName[i], i);
                    setCanineBreed(breed[i], i);
                    setCanineDescription(description[i], i);
                }
            }
        }
    }

    public void setCaninePetName(String value, int i) throws Throwable {
        if (!caninePetName.isEmpty()) {
            clickFooter();
            clickElement(caninePetName.get(i), "Canine - Pet Name");
            typeTextEnter(driver.switchTo().activeElement(), value, "Canine - Pet Name");
            clickFooter();
        }
    }

    public void setCanineBreed(String value, int i) throws Throwable {
        if (!canineBreed.isEmpty()) {
            clickFooter();
            clickElement(canineBreed.get(i), "Canine - Breed");
            typeTextEnter(driver.switchTo().activeElement(), value, "Canine - Breed");
            clickFooter();
        }
    }

    public void setCanineDescription(String value, int i) throws Throwable {
        if(!canineDescription.isEmpty()) {
            clickFooter();
            clickElement(canineDescription.get(i), "Canine - Description");
            typeTextEnter(driver.switchTo().activeElement(), value, "Canine - Description");
            clickFooter();
        }
    }

    public void addCanine() throws Throwable {
        if (isElementDisplayed(caninePetAdd)) {
            clickElement(caninePetAdd, "Add Canine");
            pause(2000);
            clickFooter();
        }
    }

    public void deleteCanine() throws Throwable {
        clickElement(caninePetDelete, "Delete Canine");
        pause(2000);
        clickFooter();
    }
}
