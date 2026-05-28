package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class BoatingExperienceBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public BoatingExperienceBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Number of Years Boating Experience']/../../../..//input")
    WebElement numberOfYearsBoatingExperience;
    @FindBy(xpath = "//div[text()='For how many years have you owned a boat(s)?']/../../../..//input")
    WebElement howManyYearsOwnedABoat;

    public void fillBoatingExperienceDetails(Map<String, String> data) throws Throwable {
        setNumberOfYearsBoatingExperience(data.get("Number_Of_Years_Boating_Experience"));
        setHowManyYearsOwnedABoat(data.get("How_Many_Years_Owned_A_Boat"));
    }

    public void setNumberOfYearsBoatingExperience(String value) throws Throwable {
        typeText(numberOfYearsBoatingExperience, value);
        saveChanges();
    }

    public void setHowManyYearsOwnedABoat(String value) throws Throwable {
        typeText(howManyYearsOwnedABoat, value);
    }
}