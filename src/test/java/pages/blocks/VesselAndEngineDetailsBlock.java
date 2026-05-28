package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class VesselAndEngineDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public VesselAndEngineDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Year of Engine']/../../../..//input")
    WebElement yearOfEngine;
    @FindBy(xpath = "//div[text()='Vessel Name']/../../../..//input")
    WebElement vesselName;
    @FindBy(xpath = "//div[text()='Type']/../../../..//input")
    WebElement type;
    @FindBy(xpath = "//div[text()='Fuel Type']/../../../..//input")
    WebElement fuelType;
    @FindBy(xpath = "//div[text()='Year of last survey']/../../../..//input")
    WebElement yearOfLastSurvey;
    @FindBy(xpath = "//div[text()='Total HP']/../../../..//input")
    WebElement totalHP;
    @FindBy(xpath = "//div[text()='Hull Identification']/../../../..//input")
    WebElement hullIdentification;
    @FindBy(xpath = "//div[text()='Usage']/../../../..//input")
    WebElement usage;
    @FindBy(xpath = "//div[text()='What period is the boat in the water?']/../../../..//input")
    WebElement whatPeriodIsTheBoatInTheWater;
    @FindBy(xpath = "//div[text()='What is the vessel registered state?']/../../../..//input")
    WebElement whatIsTheVesselRegisteredState;
    @FindBy(xpath = "//div[text()='Number of Engines']/../../../..//input")
    WebElement numberOfEngines;
    @FindBy(xpath = "//div[text()='vessel and engine details']")
    WebElement block;

    public void fillVesselAndEngineDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("vessel and engine details");
        setType(data.get("Type"));
        setFuelType(data.get("Fuel_Type"));
        setTotalHP(data.get("Total_HP"));
        setWhatIsTheVesselRegisteredState(data.get("Vessel_Registered_State"));
        setNumberOfEngines(data.get("Number_Of_Engines"));
        setHullIdentification(data.get("Hull_Identification"));
    }

    public void setType(String typeTxt) throws Throwable {
        typeText(type, typeTxt);
    }

    public void setFuelType(String fuelTypeTxt) throws Throwable {
        typeText(fuelType, fuelTypeTxt);
    }

    public void setTotalHP(String totalHPTxt) throws Throwable {
        typeText(totalHP, totalHPTxt);
    }

    public void setHullIdentification(String hullIdentificationTxt) throws Throwable {
        clickElement(block, "block");
        typeText(hullIdentification, hullIdentificationTxt, "hull identification");
    }

    public void setWhatIsTheVesselRegisteredState(String state) throws Throwable {
        typeText(whatIsTheVesselRegisteredState, state);
    }

    public void setNumberOfEngines(String numberOfEnginesTxt) throws Throwable {
        typeText(numberOfEngines, numberOfEnginesTxt);
    }
}



