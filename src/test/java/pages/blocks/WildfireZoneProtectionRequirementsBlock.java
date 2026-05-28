package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class WildfireZoneProtectionRequirementsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WildfireZoneProtectionRequirementsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Is there adequate defensible space around the home?']/../../../..//input")
    WebElement isThereAdequateDefensibleSpaceAroundTheHome;
    @FindBy(xpath = "//div[text()='Openings in Tile or Metal Roofs Bird Stopped']/../../../..//input")
    WebElement openingsInTileOrMetalRoofsBirdStopped;
    @FindBy(xpath = "//div[text()='Eave soffits and Attic Vents fitted with Narrow Mesh Screens']/../../../..//input")
    WebElement eaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens;
    @FindBy(xpath = "//div[text()='Chimneys fitted with Spark Arrestors']/../../../..//input")
    WebElement chimneysFittedWithSparkArrestors;
    @FindBy(xpath = "//div[text()='Firewood or other combustible materials are stored at least 30 feet from the home']/../../../..//input")
    WebElement firewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome;
    @FindBy(xpath = "//div[text()='Combustible structures or fuel tanks are at least 30 feet from the home and have at least 10 feet around clear combustible materials']/../../../..//input")
    WebElement combustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials;
    @FindBy(xpath = "//div[text()='Openings in Tile or Metal Roofs Bird Stopped']/../../../..//input")
    List<WebElement> openingsInTileOrMetalRoofsBirdStoppedList;

    public void fillWildfireZoneProtectionRequirementsDetailsCC(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_Are_Stored_At_Least_30_Feet_From_The_Home"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_From_The_Home_And_Have_At_Least_10_Feet_Around_Clear_Combustible_Materials"));
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsCC_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_END"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_END"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_END"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_Are_Stored_At_Least_30_Feet_From_The_Home_END"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_From_The_Home_And_Have_At_Least_10_Feet_Around_Clear_Combustible_Materials_END"));
            saveChanges();
        }
    }

    public void setIsThereAdequateDefensibleSpaceAroundTheHome(String value) {
        typeTextEnter(isThereAdequateDefensibleSpaceAroundTheHome, value, "Is There Adequate Defensible Space Around The Home");
    }

    public void setOpeningsInTileOrMetalRoofsBirdStopped(String value) {
        typeTextEnter(openingsInTileOrMetalRoofsBirdStopped, value, "Openings In Tile Or Metal Roofs Bird Stopped");
    }

    public void setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(String value) {
        typeTextEnter(eaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens, value, "Eave Soffits And Attic Vents Fitted With Narrow Mesh Screens");
    }

    public void setChimneysFittedWithSparkArrestors(String value) {
        typeTextEnter(chimneysFittedWithSparkArrestors, value, "Chimneys Fitted With Spark Arrestors");
    }

    public void setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(String value) {
        typeTextEnter(firewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome, value, "Firewood Or Other Combustible Materials Are Stored At Least 30 Feet From The Home");
    }

    public void setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(String value) {
        typeTextEnter(combustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials, value, "Combustible Structures Or Fuel Tanks Are At Least 30 Feet From The Home And Have At Least 10 Feet Around Clear Combustible Materials");
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHS(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home"));
            if (elementExists(openingsInTileOrMetalRoofsBirdStoppedList)) {
                setOpeningsInTileOrMetalRoofsBirdStopped(data.get("Wildfire_Zone_Openings_In_Tile_Or_Metal_Roofs_Bird_Stopped"));
            }
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials"));
            clickFooter();
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet"));
            if(elementExists(driver.findElements(By.xpath("//div[text()='Openings in Tile or Metal Roofs Bird Stopped']/../../../..//input")))) {
                setOpeningsInTileOrMetalRoofsBirdStopped(data.get("Wildfire_Zone_Protection_Requirements_Openings_In_Tile_Or_Metal_Roofs_Bird_Stopped"));
            }
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHS_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_END"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_END"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_END"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_END"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_END"));
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_OOS_END"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_OOS_END"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_OOS_END"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_OOS_END"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_OOS_END"));
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHS_RNW(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_RNW"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_RNW"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_RNW"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_RNW"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_RNW"));
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHO(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet"));
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHO_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_END"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_END"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_END"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_END"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_END"));
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_OOS_END"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_OOS_END"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_OOS_END"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_OOS_END"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_OOS_END"));
            saveChanges();
        }
    }

    public void fillWildfireZoneProtectionRequirementsDetailsHO_RNW(Map<String, String> data) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_RNW"));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_RNW"));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_RNW"));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_RNW"));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_RNW"));
            saveChanges();
        }
    }



    public void fillWildfireZoneProtectionRequirementsDetailsHO(Map<String, String> data, int i) throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//div[contains(text(),'Wildfire  Zone Protection Requirements')]")))) {
            setIsThereAdequateDefensibleSpaceAroundTheHome(data.get("Wildfire_Zone_Protection_Requirements_Is_There_Adequate_Defensible_Space_Around_The_Home_" + i));
            setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(data.get("Wildfire_Zone_Protection_Requirements_Eave_Soffits_And_Attic_Vents_Fitted_With_Narrow_Mesh_Screens_" + i));
            setChimneysFittedWithSparkArrestors(data.get("Wildfire_Zone_Protection_Requirements_Chimneys_Fitted_With_Spark_Arrestors_" + i));
            setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(data.get("Wildfire_Zone_Protection_Requirements_Firewood_Or_Other_Combustible_Materials_" + i));
            setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(data.get("Wildfire_Zone_Protection_Requirements_Combustible_Structures_Or_Fuel_Tanks_Are_At_Least_30_Feet_" + i));
            saveChanges();
        }
    }


}