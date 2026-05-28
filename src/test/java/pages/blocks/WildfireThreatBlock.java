package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WildfireThreatBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WildfireThreatBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'big picture of the brush risk')]/../../../..//input")
    WebElement bigPictureOfTheBrushRisk;
    @FindBy(xpath = "//div[contains(text(),'Fuel type and direction of fuel')]/../../../..//input")
    WebElement fuelTypeAndDirectionOfFuel;
    @FindBy(xpath = "//div[contains(text(),'Road access')]/../../../..//input")
    WebElement roadAccess;
    @FindBy(xpath = "//div[contains(text(),'Slope & Topography?')]/../../../..//input")
    WebElement slopeAndTopography;
    @FindBy(xpath = "//div[contains(text(),'What size community is the home located in')]/../../../..//input")
    WebElement whatSizeCommunity;
    @FindBy(xpath = "//div[contains(text(),'Home proximity to brush area')]/../../../..//input")
    WebElement homeProximityToBrushArea;
    @FindBy(xpath = "//div[contains(text(),'Is the home within an extreme mudflow zone?')]/../../../..//input")
    WebElement isTheHomeWithinAnExtremeMudflowZone;
    @FindBy(xpath = "//div[text()='Wildfire Threat']/../../../..//input")
    WebElement wildfireThreat;
    @FindBy(xpath = "//div[text()='Wildfire Threat override']/../../../..//input")
    WebElement wildfireThreatOverride;
    @FindBy(xpath = "//div[text()='Guy Carpenter WF']/../../../..//input")
    WebElement guyCarpenterWF;

    public void fillWildfireThreatInfo(Map<String, String> data) throws Throwable {
        typeText(bigPictureOfTheBrushRisk, data.get("Big_Picture_Of_The_Brush_Risk"));
        typeText(fuelTypeAndDirectionOfFuel, data.get("Fuel_Type_And_Direction_Of_Fuel"));
        typeText(roadAccess, data.get("Road_Access"));
        typeText(slopeAndTopography, data.get("Slope_And_Topography"));
        typeText(whatSizeCommunity, data.get("What_Size_Community"));
        typeText(homeProximityToBrushArea, data.get("Home_Proximity_To_Brush_Area"));
    }

    public void fillWildfireThreatDetailCC(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Threat_What_Is_The_Big_Picture_Of_The_Brush_Risk"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Threat_Fuel_Type_And_Direction_Of_Fuel"));
            setRoadAccess(data.get("Wildfire_Threat_Road_Access"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Threat_What_Size_Community_Is_The_Home_Located_In"));
            setHomeProximityToBrushArea(data.get("Wildfire_Threat_Home_Proximity_To_Brush_Area"));
            setIsTheHomeWithinAnExtremeMudflowZone(data.get("Wildfire_Threat_Is_The_Home_Within_An_Extreme_Mudflow_Zone"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat"));
            setWildfireThreatOverride(data.get("Wildfire_Threat_Wildfire_Threat_Override"));
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailCC_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Threat_What_Is_The_Big_Picture_Of_The_Brush_Risk_END"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Threat_Fuel_Type_And_Direction_Of_Fuel_END"));
            setRoadAccess(data.get("Wildfire_Threat_Road_Access_END"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_END"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Threat_What_Size_Community_Is_The_Home_Located_In_END"));
            setHomeProximityToBrushArea(data.get("Wildfire_Threat_Home_Proximity_To_Brush_Area_END"));
            setIsTheHomeWithinAnExtremeMudflowZone(data.get("Wildfire_Threat_Is_The_Home_Within_An_Extreme_Mudflow_Zone_END"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_END"));
            setWildfireThreatOverride(data.get("Wildfire_Threat_Wildfire_Threat_Override_END"));
            saveChanges();
        }
    }

    public void setWhatIsTheBigPictureOfTheBrushRisk(String value) {
        typeTextEnter(bigPictureOfTheBrushRisk, value, "What Is The Big Picture Of The Brush Risk");
    }

    public void setFuelTypeAndDirectionOfFuel(String value) {
        typeTextEnter(fuelTypeAndDirectionOfFuel, value, "Fuel Type And Direction Of Fuel");
    }

    public void setRoadAccess(String value) {
        typeTextEnter(roadAccess, value, "Road access");
    }

    public void setSlopeAndTopography(String value) {
        typeTextEnter(slopeAndTopography, value, "Slope And Topography");
    }

    public void setWhatSizeCommunityIsTheHomeLocatedIn(String value) {
        typeTextEnter(whatSizeCommunity, value, "What Size Community Is The Home Located In");
    }

    public void setHomeProximityToBrushArea(String value) {
        typeTextEnter(homeProximityToBrushArea, value, "Home Proximity To Brush Area");
    }

    public void setIsTheHomeWithinAnExtremeMudflowZone(String value) {
        if(elementExists(driver.findElements(By.xpath("//div[contains(text(),'Is the home within an extreme mudflow zone?')]/../../../..//input")))){
        typeTextEnter(isTheHomeWithinAnExtremeMudflowZone, value, "Is The Home Within An Extreme Mudflow Zone");
        }
    }

    public void verifyWildfireThreat(String value) {
        assertCellValue(wildfireThreat, value, "Wildfire Threat");
    }

    public void setWildfireThreatOverride(String value) {
        typeTextEnter(wildfireThreatOverride, value, "Wildfire Threat Override");
    }

    public void fillWildfireThreatDetailHS(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area"));
            setIsTheHomeWithinAnExtremeMudflowZone(data.get("Wildfire_Threat_Is_The_Home_Within_An_Extreme_Mudflow_Zone"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override"));
            if (data.get("State").equalsIgnoreCase("CA")) {
                setIsTheHomeWithinAnExtremeMudflowZone(data.get("Wildfire_Threat_Is_The_Home_Within_An_Extreme_Mudflow_Zone"));
            }
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHS_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk_END"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel_END"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access_END"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_END"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In_END"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area_END"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_END"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override_END"));
            if (data.get("State").equalsIgnoreCase("CA")) {
                setIsTheHomeWithinAnExtremeMudflowZone(data.get("Wildfire_Threat_Is_The_Home_Within_An_Extreme_Mudflow_Zone_END"));
            }
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk_OOS_END"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel_OOS_END"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access_OOS_END"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_OOS_END"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In_OOS_END"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area_OOS_END"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_OOS_END"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override_OOS_END"));
            if (data.get("State").equalsIgnoreCase("CA")) {
                setIsTheHomeWithinAnExtremeMudflowZone(data.get("Wildfire_Threat_Is_The_Home_Within_An_Extreme_Mudflow_Zone_OOS_END"));
            }
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHS_RNW(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk_RNW"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel_RNW"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access_RNW"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_RNW"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In_RNW"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area_RNW"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_RNW"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override_RNW"));
            if (data.get("State").equalsIgnoreCase("CA")) {
                setIsTheHomeWithinAnExtremeMudflowZone(data.get("Wildfire_Threat_Is_The_Home_Within_An_Extreme_Mudflow_Zone_RNW"));
            }
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHO(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override"));
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHO_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk_END"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel_END"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access_END"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_END"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In_END"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area_END"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_END"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override_END"));
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk_OOS_END"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel_OOS_END"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access_OOS_END"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_OOS_END"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In_OOS_END"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area_OOS_END"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_OOS_END"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override_OOS_END"));
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHO_RNW(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk_RNW"));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel_RNW"));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access_RNW"));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_RNW"));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In_RNW"));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area_RNW"));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_RNW"));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override_RNW"));
            saveChanges();
        }
    }

    public void fillWildfireThreatDetailHO(Map<String, String> data, int i) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Threat (underwriters only)')]")))) {
            setWhatIsTheBigPictureOfTheBrushRisk(data.get("Wildfire_Thread_What_Is_The_Big_Picture_Of_The_Brush_Risk_" + i));
            setFuelTypeAndDirectionOfFuel(data.get("Wildfire_Thread_Fuel_Type_And_Direction_Of_Fuel_" + i));
            setRoadAccess(data.get("Wildfire_Thread_Road_Access_" + i));
            setSlopeAndTopography(data.get("Wildfire_Threat_Slope_And_Topography_" + i));
            setWhatSizeCommunityIsTheHomeLocatedIn(data.get("Wildfire_Thread_What_Size_Community_Is_The_Home_Located_In_" + i));
            setHomeProximityToBrushArea(data.get("Wildfire_Thread_Home_Proximity_To_Brush_Area_" + i));
            verifyWildfireThreat(data.get("Wildfire_Threat_Wildfire_Threat_" + i));
            setWildfireThreatOverride(data.get("Wildfire_Thread_Wildfire_Threat_Override_" + i));
            saveChanges();
        }
    }

    public void verifyGuyCarpenterWF(String value) {
        assertCellValue(guyCarpenterWF, value, "Guy Carpenter WF");
    }


}