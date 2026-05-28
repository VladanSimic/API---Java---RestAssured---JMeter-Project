package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class PolicyListBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public PolicyListBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'policy list')]/../../../../../..//span[text()='Account ID']")
    WebElement accountIDHeader;
    @FindBy(xpath = "//div[contains(text(),'policy list')]/../../../../../..//span[text()='Account ID']/../../../../div[2]")
    WebElement accountIDFilterDropdown;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Number...']")
    List<WebElement> filterFields;

    public void searchPolicyByHHID(String hhid) throws InterruptedException {
        hoverElement(accountIDHeader, "Account ID header");
        clickElement(accountIDFilterDropdown, "Filters dropdown");
        clickElement(filters, "Filters");
        hoverElement(filterFields.get(0), "Filter field");
        typeText(filterFields.get(0), hhid, "Filter field");
        pause(3000);
        clickElement(driver.findElement(By.xpath("//div[contains(text(),'policy list')]/../../../../..//div[contains(text(),'" + hhid + "')]/../../td[2]/../td[5]//span")), "HHID: " + hhid);
    }

}