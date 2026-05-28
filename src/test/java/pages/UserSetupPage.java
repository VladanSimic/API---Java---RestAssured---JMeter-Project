package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AssociatedUnderwritingGroupsBlock;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.InternalUserEditBlock;
import pages.blocks.UserSetupHistoryBlock;

import java.util.List;

public class UserSetupPage extends CommonComponentsAndActions {
    WebDriver driver;
    InternalUserEditBlock internalUserEditBlock;
    AssociatedUnderwritingGroupsBlock associatedUnderwritingGroupsBlock;
    UserSetupHistoryBlock userSetupHistoryBlock;

    public UserSetupPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        internalUserEditBlock = new InternalUserEditBlock(driver);
        associatedUnderwritingGroupsBlock = new AssociatedUnderwritingGroupsBlock(driver);
        userSetupHistoryBlock = new UserSetupHistoryBlock(driver);
    }

    @FindBy(xpath = "//span[text()='User Login ID']")
    WebElement userLoginByIDHeader;
    @FindBy(xpath = " //span[text()='User Login ID']/../../../../div[2]")
    WebElement userLoginByIDFilterDropdown;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Filter Text...']")
    List<WebElement> filterFields;


    public void selectUserByLoginID(String loginID) throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(userLoginByIDHeader).click(userLoginByIDFilterDropdown).perform();
        clickElement(filters);

        action.moveToElement(filterFields.get(0)).sendKeys(filterFields.get(0), loginID).perform();
        clickElement(driver.findElement(By.xpath("//span[text()='User Login ID']/../../../../../../../../../div[3]//td//span[text()='" + loginID + "']")));
    }

}