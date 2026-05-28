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

public class SpecificWatercraftInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public SpecificWatercraftInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Specific Watercraft Information']/../../../../../..//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='Specific Watercraft Information']/../../../../../..//tr//td[1]")
    List<WebElement> additionalInsuredName;
    @FindBy(xpath = "//div[text()='Specific Watercraft Information']/../../../../../..//tr//td[2]")
    List<WebElement> watercraft;
    @FindBy(xpath = "//div[text()='Specific Watercraft Information']/../../../../../..//tr//td[3]")
    List<WebElement> make;
    @FindBy(xpath = "//div[text()='Specific Watercraft Information']/../../../../../..//tr//td[4]")
    List<WebElement> model;
    @FindBy(xpath = "//div[text()='Specific Watercraft Information']/../../../../../..//tr//td[5]")
    List<WebElement> length;


    public void fillSpecificWatercraftInformationBlock(Map<String, String> data) throws Throwable {
        int condition = data.get("Additional_Insured").split(",").length;
        int index;
        int counter = 1;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Additional_Insured_Type_" + i).equalsIgnoreCase("Additional Insured - Specific Watercraft")) {
                clickAdd();
                index = freeRowIndex();
                String watercraft = data.get("SpecificWatercraftInformation_Watercraft_" + counter);

                setAdditionalInsuredName(data.get("Additional_Insured_Name_" + i), index);
                setWatercraft(watercraft, index);
                if (watercraft.equalsIgnoreCase("New Watercraft") || !hasValue(watercraft)) {
                    setModel(data.get("SpecificWatercraftInformation_Model_" + counter), index);
                    setMake(data.get("SpecificWatercraftInformation_Make_" + counter), index);
                    setLength(data.get("SpecificWatercraftInformation_Length_" + counter), index);
                    counter++;
                }
            }
        }
    }

        public void clickAdd() throws InterruptedException {
            clickElement(add, "Add");
            pause(3000);
        }

        public void setAdditionalInsuredName(String value,int i) throws Throwable {
            if (hasValue(value)) {
                clickFooter();
                clickElement(additionalInsuredName.get(i), "Additional Insured Name " + (i + 1));
                pause(1000);
                driver.switchTo().activeElement().sendKeys("Additional Insured - Specific Watercraft - " + value);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
            }
        }

        public void setWatercraft(String value,int i) throws Throwable {
            if (hasValue(value)) {
                clickFooter();
                clickElement(watercraft.get(i), "Watercraft " + (i + 1));
                pause(1000);
                driver.switchTo().activeElement().sendKeys(value);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
            }
        }

        public void setMake(String value,int i) throws Throwable {
            if (hasValue(value)) {
                clickFooter();
                clickElement(make.get(i), "Make " + (i + 1));
                pause(1000);
                driver.switchTo().activeElement().sendKeys(value);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
            }
        }

        public void setModel(String value,int i) throws Throwable {
            if (hasValue(value)) {
                clickFooter();
                clickElement(model.get(i), "Model " + (i + 1));
                pause(1000);
                driver.switchTo().activeElement().sendKeys(value);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
            }
        }

        public void setLength(String value,int i) throws Throwable {
            if (hasValue(value)) {
                clickFooter();
                clickElement(length.get(i), "Length " + (i + 1));
                pause(1000);
                driver.switchTo().activeElement().sendKeys(value);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
            }
        }

        public int freeRowIndex () {
            return additionalInsuredName.size() - 1;
        }


    }