package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class EngineDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public EngineDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Number of Engines']/../../../..//input")
    WebElement numberOfEngines;
    @FindBy(xpath = "//div[text()='Engine Type']/../../../..//input")
    WebElement engineType;
    @FindBy(xpath = "//div[text()='Total HP']/../../../..//input")
    WebElement totalHP;
    @FindBy(xpath = "//div[text()='Fuel Type']/../../../..//input")
    WebElement fuelType;
    @FindBy(xpath = "//div[text()='Engine Manufacturer']/../../../..//input")
    WebElement engineManufacturer;
    @FindBy(xpath = "//div[text()='Max Design Speed of Vessel']/../../../..//input")
    WebElement maxDesignSpeed;

    public void fillEngineDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("engine details");
        setNumberOfEngines(data.get("Number_Of_Engines"));
        setEngineType(data.get("Engine_Type"));
        setTotalHP(data.get("Total_HP"));
        setFuelType(data.get("Fuel_Type"));
        if (data.get("Vehicle_GTE_27_Feet").equalsIgnoreCase("Yes") && Integer.parseInt(data.get("Length")) > 27) {
            setMaxDesignSpeedOfTheVessel(data.get("Max_Design_Speed_GT27"));
        } else {
            setMaxDesignSpeedOfTheVessel(data.get("Max_Design_Speed"));
        }
        setEngineManufacturer(data.get("Engine_Manufacturer"));
    }

    private void setMaxDesignSpeedOfTheVessel(String max_design_speed) throws Throwable {
        setAttributeValue(maxDesignSpeed, "value", max_design_speed);
        typeText(maxDesignSpeed, max_design_speed);
    }

    private void setFuelType(String fuel_type) throws Throwable {
        typeText(fuelType, fuel_type);
    }

    private void setEngineManufacturer(String value) throws Throwable {
        typeText(engineManufacturer, value);
    }

    private void setTotalHP(String total_hp) throws Throwable {
        typeText(totalHP, total_hp);
    }

    private void setEngineType(String engine_type) throws Throwable {
        typeText(engineType, engine_type);
    }

    private void setNumberOfEngines(String number_of_engines) throws Throwable {
        typeText(numberOfEngines, number_of_engines);
    }
}