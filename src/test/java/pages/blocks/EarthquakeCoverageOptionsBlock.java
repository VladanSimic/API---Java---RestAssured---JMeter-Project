package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class EarthquakeCoverageOptionsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public EarthquakeCoverageOptionsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Earthquake Coverage  Option']/../../../..//input")
    WebElement earthquakeCoverageOptions;

    public void setEarthquakeCoverageOptions(String earthquakeCoverageOptionsValue) throws Throwable {
        typeText(earthquakeCoverageOptions, earthquakeCoverageOptionsValue);
    }

    public void fillEarthquakeCoverageOptionsDetailCC(Map<String, String> data) throws Throwable {
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailCC_END(Map<String, String> data) throws Throwable {
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHS_END(Map<String, String> data) throws Throwable {
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHS(Map<String, String> data) throws Throwable {
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake Coverage Options");
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option"));
        saveChanges();
    }
    public void fillEarthquakeCoverageOptionsDetailHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake Coverage Options");
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake Coverage Options");
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake Coverage Options");
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_RNW"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHO(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("Earthquake Coverage Options");
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_" + i));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END"));
        saveChanges();
    }

    public void fillEarthquakeCoverageOptionsDetailHS_RNW(Map<String, String> data) throws Throwable {
        setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_RNW"));
        saveChanges();
    }


}