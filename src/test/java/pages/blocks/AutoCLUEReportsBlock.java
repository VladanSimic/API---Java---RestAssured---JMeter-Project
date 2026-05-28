package pages.blocks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class AutoCLUEReportsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AutoCLUEReportsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Household Members']/../../../../div//input")
    WebElement householdMembers;
    @FindBy(xpath = "//div[text()='Household Locations']/../../../../div//input")
    WebElement householdLocations;
    @FindBy(xpath = "//span[text()='run auto CLUE']")
    WebElement runAutoCLUEButton;


    public void fillOutAutoClueES(Map<String, String> data) throws Throwable {
        chooseHouseholdMembers(data);
        pause(500);
        chooseHouseholdLocations(data);
        pause(500);
        clickElement(runAutoCLUEButton);
    }

    public void chooseHouseholdMembers(Map<String, String> data) throws Throwable {
        typeText(householdMembers, data.get("Household_Members"));
    }

    public void chooseHouseholdLocations(Map<String, String> data) throws Throwable {
        //Temp solution to choose first from the list
        householdLocations.click();
        pause(500);
        householdLocations.sendKeys(Keys.ARROW_DOWN);
        pause(500);
        householdLocations.sendKeys(Keys.ENTER);
        pause(500);
        householdLocations.sendKeys(Keys.TAB);
        pause(500);
    }

}