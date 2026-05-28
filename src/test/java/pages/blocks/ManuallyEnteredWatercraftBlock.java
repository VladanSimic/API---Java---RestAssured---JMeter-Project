package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ManuallyEnteredWatercraftBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ManuallyEnteredWatercraftBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='manually entered watercrafts']/../../../../../..//tr/td[1]/div")
    List<WebElement> policyType;
    @FindBy(xpath = "//div[text()='manually entered watercrafts']/../../../../../..//tr/td[2]/div")
    List<WebElement> year;
    @FindBy(xpath = "//div[text()='manually entered watercrafts']/../../../../../..//tr/td[3]/div")
    List<WebElement> manufacturer;
    @FindBy(xpath = "//div[text()='manually entered watercrafts']/../../../../../..//tr/td[4]/div")
    List<WebElement> model;
    @FindBy(xpath = "//div[text()='manually entered watercrafts']/../../../../../..//tr/td[5]/div")
    List<WebElement> length;
    @FindBy(xpath = "//div[text()='manually entered watercrafts']")
    WebElement manuallyEnteredWatercraftBlock;
    @FindBy(xpath = "//div[text()='manually entered watercrafts']/../../../../../..//span[text()='add']")
    WebElement add;

    public void fillManuallyEnteredWatercraftDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("manually entered watercrafts");
        setPolicyType(data.get("Policy_Type"), 0);
        setYear(data.get("Year"), 0);
        setManufacturer(data.get("Manufacturer"), 0);
        setModel(data.get("Model"), 0);
        setLength(data.get("Length"), 0);
        saveChanges();
    }

    public void setPolicyType(String policy_type, int index) throws Throwable {
        clickElement(manuallyEnteredWatercraftBlock);
        clickElement(policyType.get(index));
        pause(1000);
        clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + policy_type + "')]")));
    }

    public void setYear(String yearTxt, int index) throws Throwable {
        clickElement(manuallyEnteredWatercraftBlock);
        clickElement(year.get(index), "Year");
        pause(700);
        typeText(driver.switchTo().activeElement(), yearTxt);
    }

    public void setManufacturer(String manufacturerTxt, int index) throws Throwable {
        clickElement(manuallyEnteredWatercraftBlock);
        clickElement(manufacturer.get(index), "Manufacturer");
        pause(700);
        typeText(driver.switchTo().activeElement(), manufacturerTxt, "Manufacturer");
    }

    public void setModel(String modelTxt, int index) throws Throwable {
        clickElement(manuallyEnteredWatercraftBlock);
        clickElement(model.get(index), "Model");
        pause(700);
        typeText(driver.switchTo().activeElement(), modelTxt, "Model");
    }

    public void setLength(String lengthTxt, int index) throws Throwable {
        clickElement(manuallyEnteredWatercraftBlock);
        clickElement(length.get(index), "Length");
        pause(700);
        typeText(driver.switchTo().activeElement(), lengthTxt, "Length");
    }

    public int returnIndexOfLastWatercraft() {
        return policyType.size() -1;
    }

    public void clickAdd() throws Throwable {
        clickElement(add, "add");
        pause(1500);
        clickFooter();
    }

}



