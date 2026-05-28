package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class SubRolePage extends CommonComponentsAndActions {
    WebDriver driver;
    InternalUserAuthorityForSubRoleBlock internalUserAuthorityForSubRoleBlock;
    InternalUserSubRoleBlock internalUserSubRoleBlock;
    InternalUserAuthorityForUserBlock internalUserAuthorityForUserBlock;
    InternalUserOverrideBlock internalUserOverrideBlock;
    InternalUserHistoryBlock internalUserHistoryBlock;

    public SubRolePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

        internalUserAuthorityForSubRoleBlock = new InternalUserAuthorityForSubRoleBlock(driver);
        internalUserSubRoleBlock = new InternalUserSubRoleBlock(driver);
        internalUserAuthorityForUserBlock = new InternalUserAuthorityForUserBlock(driver);
        internalUserOverrideBlock = new InternalUserOverrideBlock(driver);
        internalUserHistoryBlock = new InternalUserHistoryBlock(driver);
    }

    @FindBy(xpath = "//span[text()='User Full Name']")
    WebElement userFullNameHeader;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Filter Text...']")
    List<WebElement> filterFields;
    @FindBy(xpath = " //span[text()='User Full Name']/../../../../div[2]")
    WebElement userFullNameHeaderFilterDropdown;


    public void selectUserByUserFullName(String userFullName) throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(userFullNameHeader).click(userFullNameHeaderFilterDropdown).perform();
        clickElement(filters);
        action.moveToElement(filterFields.get(0)).sendKeys(filterFields.get(0), userFullName).perform();

        clickElement(driver.findElement(By.xpath("//div[contains(text(),'undefined')]")));

        Actions action2 = new Actions(driver);
        action2.moveToElement(driver.findElement(By.xpath("//span[text()='User Full Name']/../../../../../../../../../div[3]//tr[1]")))
                .moveToElement(driver.findElement(By.xpath("//span[text()='User Full Name']/../../../../../../../../../div[3]//tr[1]//td[2]")))
                .moveToElement(driver.findElement(By.xpath("//span[text()='User Full Name']/../../../../../../../../../div[3]//tr[1]//td[2]//span[text()='" + userFullName + "']")))
                .click().perform();
    }

    public void verifyAuthority(String lineOfAuthority, String authority, String limit) {
        internalUserAuthorityForSubRoleBlock.verifyAuthority(lineOfAuthority, authority, limit);
    }
}