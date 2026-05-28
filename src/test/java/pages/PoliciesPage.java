package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class PoliciesPage extends CommonComponentsAndActions {
    WebDriver driver;

    public PoliciesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Policy #']")
    WebElement policyColumnHeader;
    @FindBy(xpath = "//span[text()='Policy #']/../../../../div[2]")
    WebElement policyColumnFilterDropdown;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Filter Text...']")
    List<WebElement> filterFields;

    public void selectAPolicyByID(String policyID) throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(policyColumnHeader).click(policyColumnFilterDropdown).perform();
        clickElement(filters);
        pause(2000);
        action.moveToElement(filterFields.get(0)).sendKeys(filterFields.get(0), policyID).perform();
        pause(5000);
        try {
            clickElement(driver.findElement(By.xpath("//span[contains(text(),'" + policyID + "')]")));
            pause(5000);
        } catch (Exception e) {
            driver.findElement(By.xpath("//div[text()='policies 1-1 of 1']")).click();
            pause(10000);
            driver.findElement(By.xpath("//span[contains(text(),'" + policyID + "')]")).click();
        }
    }
}
