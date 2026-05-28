package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class SevereWeatherPlanBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public SevereWeatherPlanBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='What does your plan entail?']/../../../..//input")
    WebElement whatDoesYourPlanEntail;
    @FindBy(xpath = "//div[text()='Marina/Building']/../../../..//input")
    WebElement marinaBuilding;
    @FindBy(xpath = "//div[text()='Street']/../../../..//input")
    WebElement street;
    @FindBy(xpath = "//div[text()='City']/../../../..//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='State']/../../../..//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='Zip']/../../../..//input")
    WebElement ZIP;
    @FindBy(xpath = "//div[text()='Hurr Plan Grade']/../../../..//input")
    WebElement hurrPlanGrade;
    @FindBy(xpath = "//div[text()='Review Date']/../../../..//input")
    WebElement reviewDate;

    public void fillSevereWeatherPlanDetails(Map<String, String> data) throws Throwable {
        setWhatDoesYourPlanEntail(data.get("Severe_Weather_Plan_Entail"));
//        setHurrPlanGrade(); set by plan ^^
        setMarinaBuilding(data.get("Marina_Building"));
        setStreet(data.get("Address_Line_1_Txt"));
        setCity(data.get("City_Name_Txt"));
        setState(data.get("State"));
        setZIP(data.get("Zip_Code"));
        setReviewDate(data.get("Review_Date"));
    }

    private void setReviewDate(String value) throws Throwable {
        typeText(reviewDate, value);
    }

    private void setZIP(String value) throws Throwable {
        typeText(ZIP, value);
    }

    private void setState(String value) throws Throwable {
        typeText(state, value);
    }

    private void setCity(String value) throws Throwable {
        typeText(city, value);
    }

    private void setStreet(String value) throws Throwable {
        typeText(street, value);
    }

    private void setMarinaBuilding(String value) throws Throwable {
        typeText(marinaBuilding, value);
    }

    private void setWhatDoesYourPlanEntail(String value) throws Throwable {
        typeText(whatDoesYourPlanEntail, value);
    }
}