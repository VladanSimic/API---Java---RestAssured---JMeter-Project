package pages.blocks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class AdditionalInsuredAndInterestBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AdditionalInsuredAndInterestBlock(WebDriver driver) {
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
    @FindBy(xpath = "//span[text()='delete']")
    List<WebElement> delete;

    public void clickAdd() throws InterruptedException {
        clickElement(add, "Add");
        pause(3000);
    }

    public void setType(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(5000);
            clickElement(type.get(i), "Type_" + (i + 1));
            pause(2000);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        }
    }

    public void setLLCTrust(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(4000);
            clickElement(llcTrust.get(i), "LLC Trust_" + (i + 1));
            pause(3500);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        }
    }

    public void setName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(4000);
            clickElement(name.get(i), "Name_" + (i + 1));
            pause(3500);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setAddressLine1(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(4000);
            clickElement(addressLine1.get(i), "Street Address_" + (i + 1));
            pause(3500);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setCity(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(4000);
            clickElement(city.get(i), "City_" + (i + 1));
            pause(3500);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setState(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(4000);
            clickElement(state.get(i), "State_" + (i + 1));
            pause(3500);
            driver.switchTo().activeElement().sendKeys(value);
            pause(1000);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        }
    }

    public void setZIP(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(4000);
            clickElement(zip.get(i), "ZIP_" + (i + 1));
            pause(3500);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void deleteAllInterests() {
        for (WebElement del : delete) {
            clickElement(del, "Delete");
        }
    }

    public void setApplicableClass(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            pause(4000);
            clickElement(applicableClass.get(i), "Applicable Class_" + (i + 1));
            pause(3500);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        }
    }


}