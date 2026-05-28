package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class PartnersPage extends CommonComponentsAndActions {
    WebDriver driver;

    public PartnersPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Broker #']")
    WebElement brokerIDHeader;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Number...']")
    List<WebElement> filterFields;
    @FindBy(xpath = " //span[text()='Broker #']/../../../../div[2]")
    WebElement brokerIDFilterDropdown;


    public void selectBrokerByID(String brokerID) throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(brokerIDHeader).click(brokerIDFilterDropdown).perform();
        clickElement(filters);

        action.moveToElement(filterFields.get(0)).sendKeys(filterFields.get(0), brokerID).perform();
        clickElement(driver.findElement(By.xpath("//span[text()='Broker #']/../../../../../../../../../div[3]//td//span[text()='" + brokerID + "']")));
    }

}