package pages.blocks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class SpecificAutomobileInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public SpecificAutomobileInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Specific Automobile Information']/../../../../../..//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='Specific Automobile Information']/../../../../../..//tr//td[1]")
    List<WebElement> additionalInsuredName;
    @FindBy(xpath = "//div[text()='Specific Automobile Information']/../../../../../..//tr//td[2]")
    List<WebElement> automobile;
    @FindBy(xpath = "//div[text()='Specific Automobile Information']/../../../../../..//tr//td[3]")
    List<WebElement> year;
    @FindBy(xpath = "//div[text()='Specific Automobile Information']/../../../../../..//tr//td[4]")
    List<WebElement> make;
    @FindBy(xpath = "//div[text()='Specific Automobile Information']/../../../../../..//tr//td[5]")
    List<WebElement> model;
    @FindBy(xpath = "//div[text()='Specific Automobile Information']/../../../../../..//tr//td[6]")
    List<WebElement> vin;


    public void fillSpecificAutomobileInformationBlock(Map<String, String> data) throws Throwable {
        int condition = data.get("Additional_Insured").split(",").length;
        int index;
        int counter = 1;

        for (int i = 1; i <= condition; i++) {
            if (data.get("Additional_Insured_Type_" + i).equalsIgnoreCase("Additional Insured - Specific Automobile")) {
                clickAdd();
                index = freeRowIndex();

                setAdditionalInsuredName(data.get("Additional_Insured_Name_" + i), index);
                setYear(data.get("SpecificAutomobileInformation_Year_" + counter), index);
                setMake(data.get("SpecificAutomobileInformation_Make_" + counter), index);
                setModel(data.get("SpecificAutomobileInformation_Model_" + counter), index);
                setVIN(data.get("SpecificAutomobileInformation_VIN_" + counter), index);
                counter++;
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
                driver.switchTo().activeElement().sendKeys("Additional Insured - Specific Automobile - " + value);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
            }
        }

        public void setAutomobile(String value,int i) throws Throwable {
            if (hasValue(value)) {
                clickFooter();
                clickElement(automobile.get(i), "Automobile " + (i + 1));
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

        public void setYear(String value,int i) throws Throwable {
            if (hasValue(value)) {
                clickFooter();
                clickElement(year.get(i), "Year " + (i + 1));
                pause(1000);
                driver.switchTo().activeElement().sendKeys(value);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                clickFooter();
            }
        }

    public void setVIN(String value,int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(vin.get(i), "VIN " + (i + 1));
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