package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class BerthingLocationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public BerthingLocationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='berthing location']/../../../../../..//tr/td[1]/div")
    WebElement berthing;
    @FindBy(xpath = "//div[text()='berthing location']/../../../../../..//tr/td[2]/div")
    WebElement marinaBuilding;
    @FindBy(xpath = "//div[text()='berthing location']/../../../../../..//tr/td[3]/div")
    WebElement street;
    @FindBy(xpath = "//div[text()='berthing location']/../../../../../..//tr/td[4]/div")
    WebElement city;
    @FindBy(xpath = "//div[text()='berthing location']/../../../../../..//tr/td[5]/div")
    WebElement state;
    @FindBy(xpath = "//div[text()='berthing location']/../../../../../..//tr/td[6]/div")
    WebElement zip;
    @FindBy(xpath = "//div[text()='berthing location']")
    WebElement berthingLocationBlock;

    public void fillBerthingLocationDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("berthing location");
        setBerthing(data.get("Berthing"));
        setMarinaBuilding(data.get("Marina_Building"));
        setStreet(data.get("Address_Line_1_Txt"));
        setCity(data.get("City_Name_Txt"));
        setState(data.get("State"));
        setZIP(data.get("Zip_Code"));
    }

    public void setZIP(String value) throws Throwable {
        clickElement(berthingLocationBlock);
        clickElement(zip);
        pause(2000);
        typeText(driver.switchTo().activeElement(), value);
    }

    public void setState(String value) throws Throwable {
        clickElement(berthingLocationBlock);
        clickElement(state);
        pause(2000);
        typeText(driver.switchTo().activeElement(), value);
    }

    public void setCity(String value) throws Throwable {
        clickElement(berthingLocationBlock);
        clickElement(city);
        pause(2000);
        typeText(driver.switchTo().activeElement(), value);
    }

    public void setStreet(String value) throws Throwable {
        clickElement(berthingLocationBlock);
        clickElement(street);
        pause(2000);
        typeText(driver.switchTo().activeElement(), value);
    }

    public void setMarinaBuilding(String value) throws Throwable {
        clickElement(berthingLocationBlock);
        clickElement(marinaBuilding);
        pause(2000);
        typeText(driver.switchTo().activeElement(), value);
    }

    public void setBerthing(String value) throws Throwable {
        clickElement(berthingLocationBlock);
        clickElement(berthing);
        pause(3000);
        clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
    }
}