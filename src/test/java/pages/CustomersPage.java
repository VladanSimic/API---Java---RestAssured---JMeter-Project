package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class CustomersPage extends CommonComponentsAndActions {
    WebDriver driver;

    public CustomersPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='ID']")
    WebElement policyColumnHeader;
    @FindBy(xpath = "//span[text()='ID']/../../../../div[2]")
    WebElement policyColumnFilterDropdown;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Number...']")
    List<WebElement> filterFields;
    @FindBy(xpath = "//*[@osviewid='PAI_392802_OT_310_OI_1_BI_2115935_CI_20974535']")
    WebElement searchField;
    @FindBy(xpath = "//*[@osviewid='PAI_392802_OT_310_OI_1_BI_2115935_CI_20974635']")
    WebElement search;

    public void selectACustomerByID(String customerID) throws Throwable {
        try {
            typeTextEnter(driver.findElement(By.xpath("//div[text()='Column']/../../../..//input")), "Household ID", "Customer column search");
        } catch (Exception e) {
        }
        pause(3000);
        typeText(searchField, customerID, "Customer search field");
        pause(3000);
        clickElement(search, "Search");
        pause(3000);
        clickElement(driver.findElement(By.xpath("//span[text()='" + customerID + "']")), "Customer");
    }
}