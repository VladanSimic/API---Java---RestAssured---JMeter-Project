package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WildfireCreditsDebitsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public WildfireCreditsDebitsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[text()='Combustible Deck or Attached Structure']/../../../..//input)[2]")
    WebElement combustibleDeckOrAttachedStructureYes;
    @FindBy(xpath = "(//div[text()='Combustible Deck or Attached Structure']/../../../..//input)[1]")
    WebElement combustibleDeckOrAttachedStructureNo;
    @FindBy(xpath = "(//div[contains(text(),'Exterior Roof Sprinklers')]/../../../..//label[text()='Yes']/..//input)|(//div[contains(text(),'Exterior Sprinklers')]/../../../..//label[text()='Yes']/..//input)")
    WebElement exteriorSprinklersYes;
    @FindBy(xpath = "(//div[contains(text(),'Exterior Roof Sprinklers')]/../../../..//label[text()='No']/..//input)|(//div[contains(text(),'Exterior Sprinklers')]/../../../..//label[text()='No']/..//input)")
    WebElement exteriorSprinklersNo;
    @FindBy(xpath = "//div[contains(text(),'Ember Resistant Venting')]/../../../..//label[text()='Yes']/..//input")
    WebElement emberResistantVentingYes;
    @FindBy(xpath = "//div[contains(text(),'Ember Resistant Venting')]/../../../..//label[text()='No']/..//input")
    WebElement emberResistantVentingNo;
    @FindBy(xpath = "//div[contains(text(),'Shelter-in-Place Community')]/../../../..//label[text()='Yes']/..//input")
    WebElement shelterInPlaceCommunityYes;
    @FindBy(xpath = "//div[contains(text(),'Shelter-in-Place Community')]/../../../..//label[text()='No']/..//input")
    WebElement shelterInPlaceCommunityNo;
    @FindBy(xpath = "//div[contains(text(),'Shelter-in-Place')]/../../../..//label[text()='Yes']/..//input")
    WebElement shelterInPlaceYes;
    @FindBy(xpath = "//div[contains(text(),'Shelter-in-Place')]/../../../..//label[text()='No']/..//input")
    WebElement shelterInPlaceNo;
    @FindBy(xpath = "//div[contains(text(),'Firewise Community')]/../../../..//label[text()='Yes']/..//input")
    WebElement firewiseCommunityYes;
    @FindBy(xpath = "//div[contains(text(),'Firewise Community')]/../../../..//label[text()='No']/..//input")
    WebElement firewiseCommunityNo;
    @FindBy(xpath = "//div[text()='Wildfire Hazard Severity']/../../../..//input")
    WebElement wildfireHazardSeverity;
    @FindBy(xpath = "//div[text()='Wildfire Risk Factor']/../../../..//input")
    WebElement wildfireRiskFactor;
    @FindBy(xpath = "//div[text()='Wildfire Risk Score']/../../../..//input")
    WebElement wildfireRiskScore;
    @FindBy(xpath = "//div[text()='Land Use Density Class']/../../../..//input")
    WebElement landUseDensityClass;
    @FindBy(xpath = "//div[text()='Distance to Wild Lands (feet)']/../../../..//input")
    WebElement distanceToWildLands;
    @FindBy(xpath = "//div[contains(text(),'No Eaves or Enclosed Eaves')]/../../../..//label[text()='Yes']/..//input")
    WebElement noEavesOrEnclosedEavesYes;
    @FindBy(xpath = "//div[contains(text(),'No Eaves or Enclosed Eaves')]/../../../..//label[text()='No']/..//input")
    WebElement noEavesOrEnclosedEavesNo;
    @FindBy(xpath = "//div[contains(text(),'Portable Fire Break System')]/../../../..//label[text()='Yes']/..//input")
    WebElement portableFireBreakSystemYes;
    @FindBy(xpath = "//div[contains(text(),'Portable Fire Break System')]/../../../..//label[text()='No']/..//input")
    WebElement portableFireBreakSystemNo;
    @FindBy(xpath = "//div[contains(text(),'Monitored Heat Sensors')]/../../../..//label[text()='Yes']/..//input")
    WebElement monitoredHeatSensorsYes;
    @FindBy(xpath = "//div[contains(text(),'Monitored Heat Sensors')]/../../../..//label[text()='No']/..//input")
    WebElement monitoredHeatSensorsNo;
    @FindBy(xpath = "//div[contains(text(),'Annual Brush Removal Contract')]/../../../..//label[text()='Yes']/..//input")
    WebElement annualBrushRemovalContractYes;
    @FindBy(xpath = "//div[contains(text(),'Annual Brush Removal Contract')]/../../../..//label[text()='No']/..//input")
    WebElement annualBrushRemovalContractNo;
    @FindBy(xpath = "//div[contains(text(),'Permanently Installed Wildfire Spray System')]/../../../..//label[text()='Yes']/..//input")
    WebElement permanentlyInstalledWildfireSpraySystemYes;
    @FindBy(xpath = "//div[contains(text(),'Permanently Installed Wildfire Spray System')]/../../../..//label[text()='Yes']/..//input")
    WebElement permanentlyInstalledWildfireSpraySystemNo;


    public void fillWildfireCreditsDebitsDetailCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("Wildfire Credits / Debits");
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Sprinklers"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community"));
        saveChanges();
    }

    public void fillWildfireCreditsDebitsDetailCC_END(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_END"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Sprinklers_END"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_END"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community_END"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community_END"));
        saveChanges();
    }

    public void setCombustibleDeckOrAttachedStructure(String value) throws Throwable {
        choose(combustibleDeckOrAttachedStructureYes, combustibleDeckOrAttachedStructureNo, value, "Combustible Dec kOr Attached Structure");
    }

    public void setExteriorSprinklers(String value) throws Throwable {
        choose(exteriorSprinklersYes, exteriorSprinklersNo, value, "Exterior Sprinklers");
    }

    public void setEmberResistantVenting(String value) throws Throwable {
        choose(emberResistantVentingYes, emberResistantVentingNo, value, "Ember Resistant Venting");
    }

    public void setShelterInPlaceCommunity(String value) throws Throwable {
        choose(shelterInPlaceCommunityYes, shelterInPlaceCommunityNo, value, "Shelter In Place Community");
    }

    public void setShelterInPlace(String value) throws Throwable {
        choose(shelterInPlaceYes, shelterInPlaceNo, value, "Shelter In Place");
    }

    public void setFirewiseCommunity(String value) throws Throwable {
        choose(firewiseCommunityYes, firewiseCommunityNo, value, "Firewise Community");
    }

    public void verifyDistanceToWildLands(String value) {
        assertCellValue(distanceToWildLands, value, "Distance To Wild Lands");
    }

    public void verifyHazardSeverity(String value) {
        assertCellValue(wildfireHazardSeverity, value, "Hazard Severity");
    }

    public void verifyRiskFactor(String value, String state) {
        if (state.equalsIgnoreCase("CA")) {
            assertCellValue(wildfireRiskFactor, value, "Risk Factor");
        }
    }

    public void verifyRiskScore(String value) {
        assertCellValue(wildfireRiskScore, value, "Risk Score");
    }

    public void verifyLandUseDensityClass(String value) {
        assertCellValue(landUseDensityClass, value, "Land Use Density Class");
    }

    public void fillWildfireCreditsDebitsDetailHS(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("CA")) {
            setWildfireCreditsDebitsDetailCA(data);
        } else {
            setWildfireCreditsDebitsDetail(data);
        }
    }

    public void setWildfireCreditsDebitsDetail_END(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_END"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_END"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_END"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community_END"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community_END"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves_END"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System_END"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors_END"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract_END"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System_END"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetail_OOS_END(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_OOS_END"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_OOS_END"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_OOS_END"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community_OOS_END"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community_OOS_END"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves_OOS_END"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System_OOS_END"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors_OOS_END"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract_OOS_END"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System_OOS_END"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetail_RNW(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_RNW"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_RNW"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_RNW"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community_RNW"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community_RNW"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves_RNW"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System_RNW"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors_RNW"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract_RNW"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System_RNW"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailCA_END(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_END"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_END"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_END"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community_END"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community_END"));
        saveChanges();
    }

    public void fillWildfireCreditsDebitsDetailHS_END(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("CA")) {
            setWildfireCreditsDebitsDetailCA_END(data);
        } else {
            setWildfireCreditsDebitsDetail_END(data);
        }
    }

    public void fillWildfireCreditsDebitsDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("CA")) {
            setWildfireCreditsDebitsDetailCA_OOS_END(data);
        } else {
            setWildfireCreditsDebitsDetail_OOS_END(data);
        }
    }

    public void fillWildfireCreditsDebitsDetailHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("CA")) {
            setWildfireCreditsDebitsDetailCA_RNW(data);
        } else {
            setWildfireCreditsDebitsDetail_RNW(data);
        }
    }

    public void setWildfireCreditsDebitsDetailCA_OOS_END(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_OOS_END"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_OOS_END"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_OOS_END"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community_OOS_END"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community_OOS_END"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailCA_RNW(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_RNW"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_RNW"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_RNW"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community_RNW"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community_RNW"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetail(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailHO(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("ID"))
            verifyBlockExists("Additional Wildfire Information");
        else if (!data.get("State").equalsIgnoreCase("TX"))
            verifyBlockExists("Wildfire Credits / Debits");
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting"));
        setShelterInPlace(data.get("Wildfire_Credits_Debits_Shelter_In_Place"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailHO_END(Map<String, String> data) throws Throwable {
        if (data.get("State_END").equalsIgnoreCase("ID"))
            verifyBlockExists("Additional Wildfire Information");
        else
            verifyBlockExists("Wildfire Credits / Debits");
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_END"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_END"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_END"));
        setShelterInPlace(data.get("Wildfire_Credits_Debits_Shelter_In_Place_END"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves_END"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System_END"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors_END"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract_END"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System_END"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("State_OOS_END").equalsIgnoreCase("ID"))
            verifyBlockExists("Additional Wildfire Information");
        else
            verifyBlockExists("Wildfire Credits / Debits");
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_OOS_END"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_OOS_END"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_OOS_END"));
        setShelterInPlace(data.get("Wildfire_Credits_Debits_Shelter_In_Place_OOS_END"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves_OOS_END"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System_OOS_END"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors_OOS_END"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract_OOS_END"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System_OOS_END"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailHO_RNW(Map<String, String> data) throws Throwable {
        if (data.get("State_RNW").equalsIgnoreCase("ID"))
            verifyBlockExists("Additional Wildfire Information");
        else
            verifyBlockExists("Wildfire Credits / Debits");
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_RNW"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_RNW"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_RNW"));
        setShelterInPlace(data.get("Wildfire_Credits_Debits_Shelter_In_Place_RNW"));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves_RNW"));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System_RNW"));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors_RNW"));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract_RNW"));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System_RNW"));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailHO(Map<String, String> data, int i) throws Throwable {
        if (data.get("State").equalsIgnoreCase("ID"))
            verifyBlockExists("Additional Wildfire Information");
        else
            verifyBlockExists("Wildfire Credits / Debits");
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure_" + i));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers_" + i));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting_" + i));
        setShelterInPlace(data.get("Wildfire_Credits_Debits_Shelter_In_Place_" + i));
        setNoEavesOrEnclosedEaves(data.get("Wildfire_Credits_Debits_No_Eaves_Or_Enclosed_Eaves_" + i));
        setPortableFireBreakSystem(data.get("Wildfire_Credits_Debits_Portable_Fire_Break_System_" + i));
        setMonitoredHeatSensors(data.get("Wildfire_Credits_Debits_Monitored_Heat_Sensors_" + i));
        setAnnualBrushRemovalContract(data.get("Wildfire_Credits_Debits_Annual_Brush_Removal_Contract_" + i));
        setPermanentlyInstalledWildfireSpraySystem(data.get("Wildfire_Credits_Debits_Permanently_Installed_Wildfire_Spray_System_" + i));
        saveChanges();
    }

    public void setWildfireCreditsDebitsDetailCA(Map<String, String> data) throws Throwable {
        setCombustibleDeckOrAttachedStructure(data.get("Wildfire_Credits_Debits_Combustible_Deck_Or_Attached_Structure"));
        setExteriorSprinklers(data.get("Wildfire_Credits_Debits_Exterior_Roof_Sprinklers"));
        setEmberResistantVenting(data.get("Wildfire_Credits_Debits_Ember_Resistant_Venting"));
        setShelterInPlaceCommunity(data.get("Wildfire_Credits_Debits_Shelter_In_Place_Community"));
        setFirewiseCommunity(data.get("Wildfire_Credits_Debits_Firewise_Community"));
        saveChanges();
    }

    public void setPermanentlyInstalledWildfireSpraySystem(String value) throws Throwable {
        choose(permanentlyInstalledWildfireSpraySystemYes, permanentlyInstalledWildfireSpraySystemNo, value, "Permanently Installed Wildfire Spray System");
    }

    public void setAnnualBrushRemovalContract(String value) throws Throwable {
        choose(annualBrushRemovalContractYes, annualBrushRemovalContractNo, value, "Annual Brush Removal Contract");
    }

    public void setMonitoredHeatSensors(String value) throws Throwable {
        choose(monitoredHeatSensorsYes, monitoredHeatSensorsNo, value, "Monitored Heat Sensors");
    }

    public void setPortableFireBreakSystem(String value) throws Throwable {
        choose(portableFireBreakSystemYes, portableFireBreakSystemNo, value, "Portable Fire Break System");
    }

    public void setNoEavesOrEnclosedEaves(String value) throws Throwable {
        if (isElementDisplayed(noEavesOrEnclosedEavesYes)) {
            choose(noEavesOrEnclosedEavesYes, noEavesOrEnclosedEavesNo, value, "No Eaves Or Enclosed Eaves");
        }
    }


}