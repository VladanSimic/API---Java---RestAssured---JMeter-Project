package pages.lc360;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.utils.CommonComponentsAndActions;

import java.util.ArrayList;
import java.util.Map;

public class LC360 extends CommonComponentsAndActions {

    public LC360(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[aria-label='launch app Loss Control 360 (UAT)']")
    WebElement lc360Tile;
    @FindBy(xpath = "//a[@href='/Inspections']")
    WebElement inspections;
    @FindBy(css = "#search")
    WebElement searchPolicy;
    @FindBy(xpath = "//div[@id='mainFrameContents']/div/div[1]//h3/a")
    WebElement inspectionInfoEdit;
    @FindBy(xpath = "//span[contains(text(),'-- Unassigned --')]")
    WebElement riskManagerSelect;
    @FindBy(xpath = "//div[@id='formScroll\"]//li[3]//a")
    WebElement underwriterForm;
    @FindBy(xpath = "//span[text()='Was the Member present']/../../div[2]//label[text()='Yes']/input")
    WebElement wasTheMemberPresentYes;
    @FindBy(xpath = "//span[text()='Was the Member present']/../../div[2]//label[text()='No']/input")
    WebElement wasTheMemberPresentNo;
    @FindBy(xpath = "//span[text()='Was the Broker present']/../../div[2]//label[text()='Yes']/input")
    WebElement wasTheBrokerPresentYes;
    @FindBy(xpath = "//span[text()='Was the Broker present']/../../div[2]//label[text()='No']/input")
    WebElement wasTheBrokerPresentNo;
    @FindBy(xpath = "//span[text()='Post-PURE360 follow up with Member']/../..//select")
    WebElement postPure360FollowUp;
    @FindBy(xpath = "//span[text()='Follow up call and Fullfillment Notes ']/../..//textarea")
    WebElement followUpCallAndFullfillmentNotes;
    @FindBy(xpath = "//span[text()='Occupancy']/../..//select")
    WebElement occupancy;
    @FindBy(xpath = "//span[text()='Is the home currently for sale']/../../div[2]//label[text()='Yes']/input")
    WebElement isTheHomeCurrentlyForSaleYes;
    @FindBy(xpath = "//span[text()='Is the home currently for sale']/../../div[2]//label[text()='No']/input")
    WebElement isTheHomeCurrentlyForSaleNo;
    @FindBy(xpath = "//span[text()='Has the home been Renovated']/../../div[2]//label[text()='Yes']/input")
    WebElement hasHomeBeenRenovatedYes;
    @FindBy(xpath = "//span[text()='Has the home been Renovated']/../../div[2]//label[text()='No']/input")
    WebElement hasHomeBeenRenovatedNo;
    @FindBy(xpath = "//span[contains(text(),'Immediate Underwriting Action Required')]/../../div[2]//label[text()='Yes']/input")
    WebElement immediateUnderwritingActionRequiredYes;
    @FindBy(xpath = "//span[contains(text(),'Immediate Underwriting Action Required')]/../../div[2]//label[text()='No']/input")
    WebElement immediateUnderwritingActionRequiredNo;
    @FindBy(xpath = "//span[text()='Construction Type']/../..//select")
    WebElement constructionType;
    @FindBy(xpath = "//span[text()='Year Built']/../..//input")
    WebElement yearBuilt;
    @FindBy(xpath = "//span[text()='Square Footage']/../..//input")
    WebElement squareFootage;
    @FindBy(xpath = "//span[text()='Roof Configuration']/../..//select")
    WebElement roofConfiguration;
    @FindBy(xpath = "//span[text()='Roof Cover']/../..//select")
    WebElement roofCover;
    @FindBy(xpath = "//span[text()='Roof Cover Condition']/../..//select")
    WebElement roofCoverCondition;
    @FindBy(xpath = "//span[text()='Year Roof Installed/Replaced']/../..//input")
    WebElement yearRoofInstalledReplaced;
    @FindBy(xpath = "//span[text()='Previous Hail Damage Noted']/../../div[2]//label[text()='Yes']/input")
    WebElement previousHailDamageNotedYes;
    @FindBy(xpath = "//span[text()='Previous Hail Damage Noted']/../../div[2]//label[text()='No']/input")
    WebElement previousHailDamageNotedNo;
    @FindBy(xpath = "//span[text()='Exterior Wall Cover Condition']/../..//select")
    WebElement exteriorWallCoverCondition;
    @FindBy(xpath = "//span[text()='Exterior Building Condition']/../..//select")
    WebElement exteriorBuildingCondition;
    @FindBy(xpath = "//span[text()='Condition of Interior Walls']/../..//select")
    WebElement conditionOfInteriorWalls;
    @FindBy(xpath = "//span[text()='Condition of Interior Ceilings']/../..//select")
    WebElement conditionOfInteriorCeilings;
    @FindBy(xpath = "//span[text()='Condition of Interior Floors']/../..//select")
    WebElement conditionOfInteriorFloors;
    @FindBy(xpath = "//span[text()='Condition of Finished Basement']/../..//select")
    WebElement conditionOfFinishedBasement;
    @FindBy(xpath = "//span[text()='Condition of Unfinished Basement']/../..//select")
    WebElement conditionOfUnfinishedBasement;
    @FindBy(xpath = "//span[text()='Does the home have an Attic']/../../div[2]//label[text()='Yes']/input") //da li treba da se ubaci i Inaccessible?
    WebElement doesTheHomeHaveAnAtticYes;
    @FindBy(xpath = "//span[text()='Does the home have an Attic']/../../div[2]//label[text()='No']/input")
    WebElement doesTheHomeHaveAnAtticNo;
    @FindBy(xpath = "//span[text()='Overall Interior Condition']/../..//select")
    WebElement overallInteriorCondition;
    @FindBy(xpath = "//label[text()='Unfinished Basement']/input")
    WebElement laundryRoomLocation_UnfinishedBasement;
    @FindBy(xpath = "//span[text()='Laundry Room Location']/../..//input[@value='None']")
    WebElement laundryRoomLocation_None;
    @FindBy(xpath = "//span[text()='Washing Machine Hose Type']/../..//label[text()='Braided']/input")
    WebElement washingMachineHoseType_Braided;
    @FindBy(xpath = "//span[text()='Toilet Supply Lines']/../..//label[text()='Braided']/input")
    WebElement toiletSupplyLines_Braided;
    @FindBy(xpath = "//span[text()='Toilet Supply Lines']/../..//label[text()='Copper/Metal']/input")
    WebElement toiletSupplyLines_CopperMetal;
    @FindBy(xpath = "//span[text()='Condition of Toilet Supply Lines']/../..//select")
    WebElement conditionOfToiletSupplyLines;
    @FindBy(xpath = "//span[text()='Floor Drain Present']/../../div[2]//label[text()='Yes']/input")
    WebElement floorDrainPresentYes;
    @FindBy(xpath = "//span[text()='Floor Drain Present']/../../div[2]//label[text()='No']/input")
    WebElement floorDrainPresentNo;
    @FindBy(xpath = "//span[text()='Overflow Pan']/../../div[2]//label[text()='Yes']/input")
    WebElement overflowPanYes;
    @FindBy(xpath = "//span[text()='Overflow Pan']/../../div[2]//label[text()='No']/input")
    WebElement overflowPanNo;
    @FindBy(xpath = "//span[text()='Condition of Machines']/../..//select")
    WebElement conditionOfMachines;
    @FindBy(xpath = "//span[text()='Evidence of Washing Machine Leaks']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfWashingMachineLeaksYes;
    @FindBy(xpath = "//span[text()='Evidence of Washing Machine Leaks']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfWashingMachineLeaksNo;
    @FindBy(xpath = "//span[text()='Evidence of Toilet Leaks / Water Damage in Bathrooms']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfToiletLeaksWaterDamageInBathroomsYes;
    @FindBy(xpath = "//span[text()='Evidence of Toilet Leaks / Water Damage in Bathrooms']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfToiletLeaksWaterDamageInBathroomsNo;
    @FindBy(xpath = "//span[text()='Condition of Grout and Caulking']/../..//select")
    WebElement conditionOfGroutAndCaulking;
    @FindBy(xpath = "//span[text()='Evidence of Dishwasher Supply Lines Leaks']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfDishwasherSupplyLinesLeaksYes;
    @FindBy(xpath = "//span[text()='Evidence of Dishwasher Supply Lines Leaks']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfDishwasherSupplyLinesLeaksNo;
    @FindBy(xpath = "//span[text()='Evidence of Refrigerator/Ice Machine Supply Lines Leaks']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfRefrigeratorIceMachineSupplyLinesLeaksYes;
    @FindBy(xpath = "//span[text()='Evidence of Refrigerator/Ice Machine Supply Lines Leaks']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfRefrigeratorIceMachineSupplyLinesLeaksNo;
    @FindBy(xpath = "//span[text()='Tankless Water Heater']/../../div[2]//label[text()='Yes']/input")
    WebElement tanklessWaterHeaterYes;
    @FindBy(xpath = "//span[text()='Tankless Water Heater']/../../div[2]//label[text()='No']/input")
    WebElement tanklessWaterHeaterNo;
    @FindBy(xpath = "//span[text()='Location of Water Heater']/../..//select")
    WebElement locationOfWaterHeater;
    @FindBy(xpath = "//span[text()='Year Water Heater Manufactured']/../..//input")
    WebElement yearWaterHeaterManufactured;
    @FindBy(xpath = "//span[text()='Condition of Water Heater']/../..//select")
    WebElement conditionOfWaterHeater;
    @FindBy(xpath = "//span[text()='Sump Pump Present']/../../div[2]//label[text()='Yes']/input")
    WebElement sumpPumpPresentYes;
    @FindBy(xpath = "//span[text()='Sump Pump Present']/../../div[2]//label[text()='No']/input")
    WebElement sumpPumpPresentNo;
    @FindBy(xpath = "//span[text()='Is sump pump connected to battery backup or generator?']/../../div[2]//label[text()='Yes']/input")
    WebElement IsSumpPumpConnectedToBatteryBackupOrGeneratorYes;
    @FindBy(xpath = "//span[text()='Is sump pump connected to battery backup or generator?']/../../div[2]//label[text()='No']/input")
    WebElement IsSumpPumpConnectedToBatteryBackupOrGeneratorNo;
    @FindBy(xpath = "//span[text()='Does Sump Pump have a battery back up or Generator']/../../div[2]//label[text()='Yes']/input")
    WebElement doesSumpPumpHaveABatteryBackUpOrGeneratorYes;
    @FindBy(xpath = "//span[text()='Does Sump Pump have a battery back up or Generator']/../../div[2]//label[text()='No']/input")
    WebElement doesSumpPumpHaveABatteryBackUpOrGeneratorNo;
    @FindBy(xpath = "//span[text()='Is Sump Pump connected to Central Station Alarm']/../../div[2]//label[text()='Yes']/input")
    WebElement IsSumpPumpConnectedToCentralStationAlarmYes;
    @FindBy(xpath = "//span[text()='Is Sump Pump connected to Central Station Alarm']/../../div[2]//label[text()='No']/input")
    WebElement IsSumpPumpConnectedToCentralStationAlarmNo;
    @FindBy(xpath = "//span[text()='Has Sump Pump been Tested']/../../div[2]//label[text()='Yes']/input")
    WebElement HasSumpPumpBeenTestedYes;
    @FindBy(xpath = "//span[text()='Has Sump Pump been Tested']/../../div[2]//label[text()='No']/input")
    WebElement HasSumpPumpBeenTestedNo;
    @FindBy(xpath = "//span[text()='Water Main Pipe Size (inches)']/../..//select")
    WebElement waterMainPipeSize;
    @FindBy(xpath = "//span[text()='If Yes, what type']/../..//select")
    WebElement ifYesWhatType;
    @FindBy(xpath = "//span[text()='Water Shut off device present']/../../div[2]//label[text()='Yes']/input")
    WebElement waterShutOffDevicePresentYes;
    @FindBy(xpath = "//span[text()='Water Shut off device present']/../../div[2]//label[text()='No']/input")
    WebElement waterShutOffDevicePresentNo;
    @FindBy(xpath = "//span[text()='Describe any areas of water damage / leaks present']/../..//textarea")
    WebElement describeAnyAreasOfWaterDamage;
    @FindBy(xpath = "//span[text()='Permanently Installed Generator']/../../div[2]//label[text()='Yes']/input")
    WebElement permanentlyInstalledGeneratorYes;
    @FindBy(xpath = "//span[text()='Permanently Installed Generator']/../../div[2]//label[text()='No']/input")
    WebElement permanentlyInstalledGeneratorNo;
    @FindBy(xpath = "//span[text()='Is there active knob and tube wiring or active fuses in the home']/../../div[2]//label[text()='Yes']/input")
    WebElement isThereActiveKnobAndTubeWiringYes;
    @FindBy(xpath = "//span[text()='Is there active knob and tube wiring or active fuses in the home']/../../div[2]//label[text()='No']/input")
    WebElement isThereActiveKnobAndTubeWiringNo;
    @FindBy(xpath = "//span[text()='Condition of electrical panel/system']/../..//select")
    WebElement conditionOfElectricalPanelSystem;
    @FindBy(xpath = "//span[text()='Condition of Condensation Line, Drip Pan and Drainage']/../..//select")
    WebElement conditionOfCondensationLineDripPanAndDrainage;
    @FindBy(xpath = "//span[text()='Condition of HVAC vents, radiators, and baseboard heating']/../..//select")
    WebElement conditionOfHVACVents;
    @FindBy(xpath = "//span[text()='Piping Material']/../..//select")
    WebElement pipingMaterial;
    @FindBy(xpath = "//span[text()='Comment on overall condition of Electrical/HVAC/Plumbing - use this to identify any issues']/../..//textarea")
    WebElement commentOnOverallConditionOfElectricalHVACPlumbing;
    @FindBy(xpath = "//span[text()='Wood Burning Fireplace/Woodstove Present']/../../div[2]//label[text()='Yes']/input")
    WebElement woodBurningFireplaceWoodstovePresentYes;
    @FindBy(xpath = "//span[text()='Wood Burning Fireplace/Woodstove Present']/../../div[2]//label[text()='No']/input")
    WebElement woodBurningFireplaceWoodstovePresentNo;
    @FindBy(xpath = "//span[text()='Gas Burning Fireplace']/../../div[2]//label[text()='Yes']/input")
    WebElement gasBurningFireplaceYes;
    @FindBy(xpath = "//span[text()='Gas Burning Fireplace']/../../div[2]//label[text()='No']/input")
    WebElement gasBurningFireplaceNo;
    @FindBy(xpath = "//span[text()='Gutters/Drains free of debris']/../../div[2]//label[text()='Yes']/input")
    WebElement guttersDrainsFreeOfDebrisYes;
    @FindBy(xpath = "//span[text()='Gutters/Drains free of debris']/../../div[2]//label[text()='No']/input")
    WebElement guttersDrainsFreeOfDebrisNo;
    @FindBy(xpath = "//span[text()='Caulking at Doors, Windows, and other exterior penetrations acceptable']/../../div[2]//label[text()='Yes']/input")
    WebElement caulkingAtDoorsWindowsYes;
    @FindBy(xpath = "//span[text()='Caulking at Doors, Windows, and other exterior penetrations acceptable']/../../div[2]//label[text()='No']/input")
    WebElement caulkingAtDoorsWindowsNo;
    @FindBy(xpath = "//span[text()='Do any trees in the strike zone of the home show signs of poor health']/../../div[2]//label[text()='Yes']/input")
    WebElement doAnyTreesInTheStrikeZoneYes;
    @FindBy(xpath = "//span[text()='Do any trees in the strike zone of the home show signs of poor health']/../../div[2]//label[text()='No']/input")
    WebElement doAnyTreesInTheStrikeZoneNo;
    @FindBy(xpath = "//span[text()='Any trees touching or overhanging the home']/../../div[2]//label[text()='Yes']/input")
    WebElement anyTreesTouchingYes;
    @FindBy(xpath = "//span[text()='Any trees touching or overhanging the home']/../../div[2]//label[text()='No']/input")
    WebElement anyTreesTouchingNo;
    @FindBy(xpath = "//span[text()='Fire Alarm Type']/../..//label[text()='Central Station']/input")
    WebElement fireAlarmType_CentralStation;
    @FindBy(xpath = "//span[text()='Fire Alarm Type']/../..//label[text()='None']/input")
    WebElement fireAlarmType_None;
    @FindBy(xpath = "//span[text()='Fire Alarm Type']/../..//label[text()='Inactive']/input")
    WebElement fireAlarmType_Inactive;
    @FindBy(xpath = "//span[text()='Protection Class (PC)']/../..//select")
    WebElement protectionClass;
    @FindBy(xpath = "//span[text()='Burglar Alarm Type']/../..//select")
    WebElement burglarAlarmType;
    @FindBy(xpath = "//span[text()='Explosive Gas Detector']/../../div[2]//label[text()='Yes']/input")
    WebElement explosiveGasDetectorYes;
    @FindBy(xpath = "//span[text()='Explosive Gas Detector']/../../div[2]//label[text()='No']/input")
    WebElement explosiveGasDetectorNo;
    @FindBy(xpath = "//span[text()='Flood Sensors']/../../div[2]//label[text()='Yes']/input")
    WebElement floodSensorsYes;
    @FindBy(xpath = "//span[text()='Flood Sensors']/../../div[2]//label[text()='No']/input")
    WebElement floodSensorsNo;
    @FindBy(xpath = "//span[text()='Cellular Backup']/../../div[2]//label[text()='Yes']/input")
    WebElement cellularBackupYes;
    @FindBy(xpath = "//span[text()='Cellular Backup']/../../div[2]//label[text()='No']/input")
    WebElement cellularBackupNo;
    @FindBy(xpath = "//span[text()='Residential Sprinkler System']/../../div[2]//label[text()='Yes']/input")
    WebElement residentialSprinklerSystemYes;
    @FindBy(xpath = "//span[text()='Residential Sprinkler System']/../../div[2]//label[text()='No']/input")
    WebElement residentialSprinklerSystemNo;
    @FindBy(xpath = "//span[contains(text(),'Is there a centrally monitored waterflow alarm')]/../../div[2]//label[text()='Yes']/input")
    WebElement IsThereACentrallyMonitoredWaterflowAlarmYes;
    @FindBy(xpath = "//span[contains(text(),'Is there a centrally monitored waterflow alarm')]/../../div[2]//label[text()='No']/input")
    WebElement IsThereACentrallyMonitoredWaterflowAlarmNo;
    @FindBy(xpath = "//span[text()='Residential Fire Sprinkler System']/../../div[2]//label[text()='Yes']/input")
    WebElement residentialFireSprinklerSystemYes;
    @FindBy(xpath = "//span[text()='Residential Fire Sprinkler System']/../../div[2]//label[text()='No']/input")
    WebElement residentialFireSprinklerSystemNo;
    @FindBy(xpath = "//span[text()='Guard gated community']/../../div[2]//label[text()='Yes']/input")
    WebElement guardGatedCommunityYes;
    @FindBy(xpath = "//span[text()='Guard gated community']/../../div[2]//label[text()='No']/input")
    WebElement guardGatedCommunityNo;
    @FindBy(xpath = "//span[text()='Security Cameras Monitored 24 hrs']/../../div[2]//label[text()='Yes']/input")
    WebElement securityCamerasYes;
    @FindBy(xpath = "//span[text()='Security Cameras Monitored 24 hrs']/../../div[2]//label[text()='No']/input")
    WebElement securityCamerasNo;
    @FindBy(xpath = "//span[text()='Low Temperature Sensors']/../..//select")
    WebElement lowTemperatureSensors;
    @FindBy(xpath = "//span[text()='Domestic Staff']/../../div[2]//label[text()='Yes']/input")
    WebElement domesticStaffYes;
    @FindBy(xpath = "//span[text()='Domestic Staff']/../../div[2]//label[text()='No']/input")
    WebElement domesticStaffNo;
    @FindBy(xpath = "//span[text()='Any dogs on the premises']/../../div[2]//label[text()='Yes']/input")
    WebElement anyDogsOnThePremisesYes;
    @FindBy(xpath = "//span[text()='Any dogs on the premises']/../../div[2]//label[text()='No']/input")
    WebElement anyDogsOnThePremisesNo;
    @FindBy(xpath = "//span[text()='Business on Property']/../../div[2]//label[text()='Yes']/input")
    WebElement businessOnPropertyYes;
    @FindBy(xpath = "//span[text()='Business on Property']/../../div[2]//label[text()='No']/input")
    WebElement businessOnPropertyNo;
    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement save;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement ok;
    @FindBy(xpath = "//span[text()='Pricing Table']/../..//tr[2]//select")
    WebElement pricingTableFirstSelect;
    @FindBy(xpath = "//span[text()='Pricing Table']/../..//tr[2]//span[text()='Sq Ft']/../input")
    WebElement pricingTableSqFt;
    @FindBy(xpath = "//span[text()='Pricing Table']/../..//tr[2]//span[text()='$ / Sq Ft']/../input")
    WebElement pricingTableDollarSqFt;


    //SELF DIRECTED INTERIOR
    @FindBy(xpath = "//a[text()='More Actions']")
    WebElement moreActions;
    @FindBy(xpath = "//a[contains(text(),'Change Inspection')]")
    WebElement changeInspection;
    @FindBy(xpath = "//div[contains(text(),'Self Directed - Interior')]/../..")
    WebElement selfDirectedInterior;
    @FindBy(xpath = "//legend[contains(text(),'Residential')]/..//button[3]")
    WebElement interior;
    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveTypeChange;
    @FindBy(css = "#formScroll > ul > li:nth-child(3) > a")
    WebElement underwriterFormSelfDirected;
    @FindBy(xpath = "//div/span[contains(text(),'type of Self-Directed Engagement')]/../..//select")
    WebElement typeOfSelfDirectedEngagement;
    @FindBy(xpath = "//span[text()='Elaborate on engagement throughout the Self-Directed PURE Home Review Process']/../..//textarea")
    WebElement elaborateOnEngagementComment;
    @FindBy(xpath = "//span[text()='Is this Member Interested in loss prevention advice?']/../..//label[text()='Yes']/input")
    WebElement isThisMemberInterestedInLossPreventionAdviceYes;
    @FindBy(xpath = "//span[text()='Is this Member Interested in loss prevention advice?']/../..//label[text()='No']/input")
    WebElement isThisMemberInterestedInLossPreventionAdviceNo;
    //    @FindBy(xpath = "//span[text()='Follow up call and Fullfillment Notes ']/../..//textarea")
//    WebElement followUpCallAndFullfillmentNotes;
    @FindBy(xpath = "//span[text()='How did you Obtain Square Footage']/../..//select")
    WebElement howDidYouObtainSquareFootage;
    @FindBy(xpath = "//span[contains(text(),'Reasons for Referral')]/../..//textarea")
    WebElement ReasonOfReferral;
    @FindBy(xpath = "//span[text()='Were you able to determine a valuation for this home']/../..//label[text()='Yes']/input")
    WebElement wereYouAbleToDetermineAValuationForThisHomeYes;
    @FindBy(xpath = "//span[text()='Were you able to determine a valuation for this home']/../..//label[text()='No']/input")
    WebElement wereYouAbleToDetermineAValuationForThisHomeNo;
    @FindBy(xpath = "//span[text()='Outdoor Swimming Pool']/../../div[2]//label[text()='Yes']/input")
    WebElement outdoorSwimmingPoolYes;
    @FindBy(xpath = "//span[text()='Outdoor Swimming Pool']/../../div[2]//label[text()='No']/input")
    WebElement outdoorSwimmingPoolNo;

    //E2 Value
    @FindBy(xpath = "//div[@id=\"formScroll\"]//li[4]//a")
    WebElement e2Value;
    @FindBy(xpath = "//label[text()='Is this a manufactured or kit home? ']/../..//label[contains(text(),'Yes')]/input")
    WebElement isThisAManufacturedOrKitHomeYes;
    @FindBy(xpath = "//label[text()='Is this a manufactured or kit home? ']/../..//label[contains(text(),'No')]/input")
    WebElement isThisAManufacturedOrKitHomeNo;
    @FindBy(xpath = "//label[text()='Coverage A: ']/../..//input")
    WebElement coverageA;
    @FindBy(xpath = "//label[text()='Number of Stories: ']/../..//input")
    WebElement NumbersOfStories;
    @FindBy(xpath = "//label[text()='Has the home been completely gutted in the last 40 years? ']/../..//label[text()=' Yes ']//input")
    WebElement hasTheHomeBeenCompletelyGuttedInThePast40YearsYes;
    @FindBy(xpath = "//label[text()='Has the home been completely gutted in the last 40 years? ']/../..//label[text()=' No ']//input")
    WebElement hasTheHomeBeenCompletelyGuttedInThePast40YearsNo;
    @FindBy(xpath = "//label[text()='Is the home listed on the historic registry? ']/../..//label[text()=' Yes ']//input")
    WebElement isTheHomeListedOnTheHistoricRegistryYes;
    @FindBy(xpath = "//label[text()='Is the home listed on the historic registry? ']/../..//label[text()=' No ']//input")
    WebElement isTheHomeListedOnTheHistoricRegistryNo;


    @FindBy(xpath = "//label[text()='Locale Information']/../..//label[text()='Town']//input")
    WebElement localeInformationTown;
    @FindBy(xpath = "//label[text()='Square Footage: ']/../..//div[@class='col-sm-3']/input")
    WebElement squareFootageLA;
    @FindBy(xpath = "//label[text()='Year Built: ']/../..//div[@class='col-sm-3']/input")
    WebElement yearBuiltLA;
    @FindBy(xpath = "//label[text()=' Full Replacement Cost ']/input")
    WebElement fullReplacementCost;
    @FindBy(xpath = "//label[text()=' Functional Replacement ']/input")
    WebElement functionalReplacementCost;
    @FindBy(xpath = "//label[text()='Return Actual Cash Value?: ']/../..//label[text()=' Yes ']/input")
    WebElement returnActualCashValueYes;
    @FindBy(xpath = "//label[text()='Return Actual Cash Value?: ']/../..//label[text()=' No ']/input")
    WebElement returnActualCashValueNo;
    @FindBy(xpath = "//label[text()='Architectural Style: ']/../..//div[@class='col-sm-3']/select")
    WebElement architecturalStyle;
    @FindBy(xpath = "//label[text()='Construction Type: ']/../..//div[@class='col-sm-3']/select")
    WebElement constructionTypeSP;
    @FindBy(xpath = "//label[text()='Physical Shape: ']/../..//div[@class='col-sm-3']/select")
    WebElement physicalShape;
    @FindBy(xpath = "//label[text()='Construction Quality: ']/../..//div[@class='col-sm-3']/select")
    WebElement constructionQuality;
    @FindBy(xpath = "//label[text()='Primary Exterior Type: ']/../..//div[@class='col-sm-3']/select")
    WebElement primaryExteriorType;
    @FindBy(xpath = "//label[text()='Primary Roof Covering: ']/../..//div[@class='col-sm-3']/select")
    WebElement primaryRoofCovering;
    @FindBy(xpath = "//label[text()='Roof Pitch: ']/../..//div[@class='col-sm-3']/select")
    WebElement roofPitch;
    @FindBy(xpath = "//label[text()='Foundation Type: ']/../..//div[@class='col-sm-3']/select")
    WebElement foundationType;
    @FindBy(xpath = "//label[text()='Slope of Site: ']/../..//div[@class='col-sm-3']/select")
    WebElement slopeOfSite;
    @FindBy(xpath = "//label[text()='Number of Chimneys: ']/../..//div[@class='col-sm-3']/input")
    WebElement numberOfChimneys;
    @FindBy(xpath = "//input[@name=\"chimney_types\" and @value='frame']")
    WebElement chimneyTypeFrame;

    public void selectLC360() throws Throwable {
        clickElement(lc360Tile);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void navigateToInspections() throws Throwable {
        clickElement(inspections);
    }

    public void searchPolicy(String policyNum) throws Throwable {
        typeText(searchPolicy, policyNum);
    }

    public void selectPolicy(String policyNum) throws Throwable {
        clickElement(driver.findElement(By.xpath("//div[@class='mainGrid_rows']/div[1]//a[text()='" + policyNum + "']")));
    }

    public void navigateToUnderwriterForm() throws Throwable {
        clickElement(underwriterForm);
    }

    public void fillForm(Map<String, String> data) throws Throwable {
        choose(wasTheMemberPresentYes, wasTheMemberPresentNo, data.get("Was_The_Member_Present"));
        choose(wasTheBrokerPresentYes, wasTheBrokerPresentNo, data.get("Was_The_Broker_Present"));

        Select postPure360Select = new Select(postPure360FollowUp);
        postPure360Select.selectByValue(data.get("Post-PURE360_Follow_Up_With_Member"));

        typeText(followUpCallAndFullfillmentNotes, data.get("Follow_Up_Call_And_Fulfillment_Notes"));

        Select occupancySelect = new Select(occupancy);
        occupancySelect.selectByValue(data.get("Occupancy"));

        choose(isTheHomeCurrentlyForSaleYes, isTheHomeCurrentlyForSaleNo, data.get("Is_The_Home_Currently_For_Sale"));
        choose(hasHomeBeenRenovatedYes, hasHomeBeenRenovatedNo, data.get("Has_The_Home_Been_Renovated"));
        choose(immediateUnderwritingActionRequiredYes, immediateUnderwritingActionRequiredNo, data.get("Immediate_Underwriting_Action_Required"));

        Select constructionTypeSelect = new Select(constructionType);
        constructionTypeSelect.selectByValue(data.get("Construction_Type"));

        typeText(yearBuilt, data.get("Year_Built"));

        typeText(squareFootage, data.get("Square_Footage"));

        Select roofConfigurationSelect = new Select(roofConfiguration);
        roofConfigurationSelect.selectByValue(data.get("Roof_Configuration"));

        Select roofCoverSelect = new Select(roofCover);
        roofCoverSelect.selectByValue(data.get("Roof_Cover"));

        typeText(yearRoofInstalledReplaced, data.get("Year_Roof_Installed_Replaced"));

        Select roofCoverConditionSelect = new Select(roofCoverCondition);
        roofCoverConditionSelect.selectByValue(data.get("Roof_Cover_Condition"));

        choose(previousHailDamageNotedYes, previousHailDamageNotedNo, data.get("Previous_Hail_Damage_Noted"));

        Select exteriorWallCoverConditionSelect = new Select(exteriorWallCoverCondition);
        exteriorWallCoverConditionSelect.selectByValue(data.get("Exterior_Wall_Cover_Condition"));

        Select exteriorBuildingConditionSelect = new Select(exteriorBuildingCondition);
        exteriorBuildingConditionSelect.selectByValue(data.get("Exterior_Building_Condition"));

        Select conditionOfInteriorWallsSelect = new Select(conditionOfInteriorWalls);
        conditionOfInteriorWallsSelect.selectByValue(data.get("Condition_Of_Interior_Walls"));

        Select conditionOfInteriorCeilingsSelect = new Select(conditionOfInteriorCeilings);
        conditionOfInteriorCeilingsSelect.selectByValue(data.get("Condition_Of_Interior_Ceilings"));

        Select conditionOfInteriorFloorsSelect = new Select(conditionOfInteriorFloors);
        conditionOfInteriorFloorsSelect.selectByValue(data.get("Condition_Of_Interior_Floors"));

        Select conditionOfFinishedBasementSelect = new Select(conditionOfFinishedBasement);
        conditionOfFinishedBasementSelect.selectByValue(data.get("Condition_Of_Finished_Basement"));

        Select conditionOfUnfinishedBasementSelect = new Select(conditionOfUnfinishedBasement);
        conditionOfUnfinishedBasementSelect.selectByValue(data.get("Condition_Of_Unfinished_Basement"));

        choose(doesTheHomeHaveAnAtticYes, doesTheHomeHaveAnAtticNo, data.get("Does_The_Home_Have_An_Attic"));

        Select overallInteriorConditionSelect = new Select(overallInteriorCondition);
        overallInteriorConditionSelect.selectByValue(data.get("Overall_Interior_Condition"));

        //clickElement(laundryRoomLocation_UnfinishedBasement);
        clickElement(laundryRoomLocation_None);

        //clickElement(washingMachineHoseType_Braided);

        //choose(floorDrainPresentYes,floorDrainPresentNo,data.get("Floor_Drain_Present"));
        //choose(overflowPanYes,overflowPanNo,data.get("Overflow_Pan"));

        //Select conditionOfMachinesSelect = new Select(conditionOfMachines);
        //conditionOfMachinesSelect.selectByValue(data.get("Condition_Of_Machines"));

        //choose(evidenceOfWashingMachineLeaksYes,evidenceOfWashingMachineLeaksNo,data.get("Evidence_Of_Machine_Leaks"));

        clickElement(toiletSupplyLines_CopperMetal);

        Select conditionOfToiletSupplySelect = new Select(conditionOfToiletSupplyLines);
        conditionOfToiletSupplySelect.selectByValue(data.get("Condition_Of_Toilet_Supply_Lines"));

        choose(evidenceOfToiletLeaksWaterDamageInBathroomsYes, evidenceOfToiletLeaksWaterDamageInBathroomsNo, data.get("Evidence_Of_Toilet_Leaks_Water_Damage_In_Bathrooms"));

        Select conditionOfGroutAndCaulkingSelect = new Select(conditionOfGroutAndCaulking);
        conditionOfGroutAndCaulkingSelect.selectByValue(data.get("Condition_Of_Grout_And_Caulking"));

        choose(evidenceOfDishwasherSupplyLinesLeaksYes, evidenceOfDishwasherSupplyLinesLeaksNo, data.get("Evidence_Of_Dishwasher_Supply_Lines_Leaks"));
        choose(evidenceOfRefrigeratorIceMachineSupplyLinesLeaksYes, evidenceOfRefrigeratorIceMachineSupplyLinesLeaksNo, data.get("Evidence_Of_Refrigerator_Ice_Machine_Supply_Lines_Leaks"));
        choose(tanklessWaterHeaterYes, tanklessWaterHeaterNo, data.get("Tankless_Water_Heater"));

        Select locationOfWaterHeaterSelect = new Select(locationOfWaterHeater);
        locationOfWaterHeaterSelect.selectByValue(data.get("Location_Of_Water_Heater"));

        typeText(yearWaterHeaterManufactured, data.get("Year_Water_Heater_Manufactured"));

        Select conditionOfWaterHeaterSelect = new Select(conditionOfWaterHeater);
        conditionOfWaterHeaterSelect.selectByValue(data.get("Condition_Of_Water_Heater"));

        choose(sumpPumpPresentYes, sumpPumpPresentNo, data.get("Sump_Pump_Present"));

        choose(IsSumpPumpConnectedToBatteryBackupOrGeneratorYes, IsSumpPumpConnectedToBatteryBackupOrGeneratorNo, data.get("Is_Sump_Pump_Connected_To_Battery_Backup_Or_Generator"));
        choose(IsSumpPumpConnectedToCentralStationAlarmYes, IsSumpPumpConnectedToCentralStationAlarmNo, data.get("Is_Sump_Pump_Connected_To_Central_Station_Alarm"));
        choose(HasSumpPumpBeenTestedYes, HasSumpPumpBeenTestedNo, data.get("Has_Sump_Pump_Been_Tested"));

        Select waterMainPipeSizeSelect = new Select(waterMainPipeSize);
        waterMainPipeSizeSelect.selectByValue(data.get("Water_Main_Pipe_Size"));

        choose(waterShutOffDevicePresentYes, waterShutOffDevicePresentNo, data.get("Water_Shut_Off_Device_Present"));

        Select ifYesWhatTypeSelect = new Select(ifYesWhatType);
        ifYesWhatTypeSelect.selectByValue(data.get("If_Yes_What_Type"));

        typeText(describeAnyAreasOfWaterDamage, data.get("Describe_Any_Areas_Of_Water_Damage"));

        choose(permanentlyInstalledGeneratorYes, permanentlyInstalledGeneratorNo, data.get("Permanently_Installed_Generator"));
        choose(isThereActiveKnobAndTubeWiringYes, isThereActiveKnobAndTubeWiringNo, data.get("Is_There_Active_Knob_And_Tube_Wiring"));

        Select conditionOfElectricalPanelSystemSelect = new Select(conditionOfElectricalPanelSystem);
        conditionOfElectricalPanelSystemSelect.selectByValue(data.get("Condition_Of_Electrical_Panel_System"));

        Select conditionOfCondensationLineDripPanAndDrainageSelect = new Select(conditionOfCondensationLineDripPanAndDrainage);
        conditionOfCondensationLineDripPanAndDrainageSelect.selectByValue(data.get("Condition_Of_Condensation_Line_Drip_Pan_And_Drainage"));

        Select conditionOfHVACVentsSelect = new Select(conditionOfHVACVents);
        conditionOfHVACVentsSelect.selectByValue(data.get("Condition_Of_HVAC_Vents"));

        Select pipingMaterialSelect = new Select(pipingMaterial);
        pipingMaterialSelect.selectByValue(data.get("Piping_Material"));

        typeText(commentOnOverallConditionOfElectricalHVACPlumbing, data.get("Comment_On_Overall_Condition_Of_Electrical_HVAC_Plumbing"));

        choose(woodBurningFireplaceWoodstovePresentYes, woodBurningFireplaceWoodstovePresentNo, data.get("Wood_Burning_Fireplace"));
        choose(gasBurningFireplaceYes, gasBurningFireplaceNo, data.get("Gas_Burning_Fireplace"));
        choose(guttersDrainsFreeOfDebrisYes, guttersDrainsFreeOfDebrisNo, data.get("Gutters_Drains"));
        choose(caulkingAtDoorsWindowsYes, caulkingAtDoorsWindowsNo, data.get("Caulking_At_Doors_Windows"));
        choose(doAnyTreesInTheStrikeZoneYes, doAnyTreesInTheStrikeZoneNo, data.get("Do_Any_Trees_In_The_Strike_Zone"));
        choose(anyTreesTouchingYes, anyTreesTouchingNo, data.get("Any_Trees_Touching"));

        Select protectionClassSelect = new Select(protectionClass);
        protectionClassSelect.selectByValue(data.get("Protection_Class"));

        clickElement(fireAlarmType_None);

        Select burglarAlarmTypeSelect = new Select(burglarAlarmType);
        burglarAlarmTypeSelect.selectByValue(data.get("Burglar_Alarm_Type"));

        choose(explosiveGasDetectorYes, explosiveGasDetectorNo, data.get("Explosive_Gas_Detector"));
        choose(floodSensorsYes, floodSensorsNo, data.get("Flood_Sensors"));
        choose(cellularBackupYes, cellularBackupNo, data.get("Cellular_Backup"));

        Select lowTemperatureSensorsSelect = new Select(lowTemperatureSensors);
        lowTemperatureSensorsSelect.selectByValue(data.get("Low_Temperature_Sensors"));

        choose(residentialSprinklerSystemYes, residentialSprinklerSystemNo, data.get("Residential_Sprinkler_System"));
        pause(1000);

        choose(IsThereACentrallyMonitoredWaterflowAlarmYes, IsThereACentrallyMonitoredWaterflowAlarmNo, data.get("Is_There_A_Centrally_Monitored_Waterflow_Alarm"));

        choose(guardGatedCommunityYes, guardGatedCommunityNo, data.get("Guard_Gated_Community"));
        choose(securityCamerasYes, securityCamerasNo, data.get("Security_Cameras"));

        choose(domesticStaffYes, domesticStaffNo, data.get("Domestic_Staff"));
        choose(anyDogsOnThePremisesYes, anyDogsOnThePremisesNo, data.get("Any_Dogs_On_The_Premises"));
        choose(businessOnPropertyYes, businessOnPropertyNo, data.get("Business_On_Property"));

        Select pricingTableSelect = new Select(pricingTableFirstSelect);
        pricingTableSelect.selectByValue(data.get("Pricing_Table_1"));

        typeText(pricingTableSqFt, data.get("Pricing_Table_Sq_Ft"));
        typeText(pricingTableDollarSqFt, data.get("Pricing_Table_Dollar_Sq_Ft"));

    }

    public void save() throws Throwable {
        clickElement(save);
        clickElement(ok);
    }

    public void changeInspectionTypeToSelfDirectedInterior() throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(moreActions).click(changeInspection).perform();

        clickElement(selfDirectedInterior);

        clickElement(saveTypeChange);
    }

    public void changeInspectionTypeToInterior() throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(moreActions).click(changeInspection).perform();

        clickElement(interior);

        clickElement(saveTypeChange);
    }

    public void navigateToUnderwriterFormSelfDirected() throws Throwable {
        clickElement(underwriterFormSelfDirected);
    }

    public void fillFormSelfDirectedInterior(Map<String, String> data) throws Throwable {
        Select typeOfSelfDirectedEngagementSelect = new Select(typeOfSelfDirectedEngagement);
        typeOfSelfDirectedEngagementSelect.selectByValue(data.get("Type_Of_Self_Directed_Engagement"));

        typeText(elaborateOnEngagementComment, data.get("Elaborate_On_Engagement_Comment"));

        choose(isThisMemberInterestedInLossPreventionAdviceYes, isThisMemberInterestedInLossPreventionAdviceNo, data.get("Is_This_Member_Interested_In_Loss_Prevention_Advice"));

        typeText(followUpCallAndFullfillmentNotes, data.get("Follow_Up_Call_And_Fulfillment_Notes"));

        Select occupancySelect = new Select(occupancy);
        occupancySelect.selectByValue(data.get("Occupancy"));

        choose(isTheHomeCurrentlyForSaleYes, isTheHomeCurrentlyForSaleNo, data.get("Is_The_Home_Currently_For_Sale"));

        Select howDidYouObtainSquareFootageSelect = new Select(howDidYouObtainSquareFootage);
        howDidYouObtainSquareFootageSelect.selectByValue(data.get("How_Did_You_Obtain_Square_Footage"));

        choose(hasHomeBeenRenovatedYes, hasHomeBeenRenovatedNo, data.get("Has_The_Home_Been_Renovated"));

        choose(immediateUnderwritingActionRequiredYes, immediateUnderwritingActionRequiredNo, data.get("Immediate_Underwriter_Action_Required"));

        //typeText(ReasonOfReferral,data.get("Reason_Of_Referral"));

        choose(wereYouAbleToDetermineAValuationForThisHomeYes, wereYouAbleToDetermineAValuationForThisHomeNo, data.get("Were_You_Able_To_Determine_A_Valuation_For_This_Home_Yes"));

        Select constructionTypeSelect = new Select(constructionType);
        constructionTypeSelect.selectByValue(data.get("Construction_Type"));

        typeText(yearBuilt, data.get("Year_Built"));

        typeText(squareFootage, data.get("Square_Footage"));

        Select roofConfigurationSelect = new Select(roofConfiguration);
        roofConfigurationSelect.selectByValue(data.get("Roof_Configuration"));

        Select roofCoverSelect = new Select(roofCover);
        roofCoverSelect.selectByValue(data.get("Roof_Cover"));

        typeText(yearRoofInstalledReplaced, data.get("Year_Roof_Installed_Replaced"));

        Select roofCoverConditionSelect = new Select(roofCoverCondition);
        roofCoverConditionSelect.selectByValue(data.get("Roof_Cover_Condition"));

        Select exteriorWallCoverConditionSelect = new Select(exteriorWallCoverCondition);
        exteriorWallCoverConditionSelect.selectByValue(data.get("Exterior_Wall_Cover_Condition"));

        Select exteriorBuildingConditionSelect = new Select(exteriorBuildingCondition);
        exteriorBuildingConditionSelect.selectByValue(data.get("Exterior_Building_Condition"));

        Select conditionOfInteriorWallsSelect = new Select(conditionOfInteriorWalls);
        conditionOfInteriorWallsSelect.selectByValue(data.get("Condition_Of_Interior_Walls"));

        Select conditionOfInteriorCeilingsSelect = new Select(conditionOfInteriorCeilings);
        conditionOfInteriorCeilingsSelect.selectByValue(data.get("Condition_Of_Interior_Ceilings"));

        Select conditionOfInteriorFloorsSelect = new Select(conditionOfInteriorFloors);
        conditionOfInteriorFloorsSelect.selectByValue(data.get("Condition_Of_Interior_Floors"));

        Select conditionOfFinishedBasementSelect = new Select(conditionOfFinishedBasement);
        conditionOfFinishedBasementSelect.selectByValue(data.get("Condition_Of_Finished_Basement"));

        Select conditionOfUnfinishedBasementSelect = new Select(conditionOfUnfinishedBasement);
        conditionOfUnfinishedBasementSelect.selectByValue(data.get("Condition_Of_Unfinished_Basement"));

        choose(doesTheHomeHaveAnAtticYes, doesTheHomeHaveAnAtticNo, data.get("Does_The_Home_Have_An_Attic"));

        Select overallInteriorConditionSelect = new Select(overallInteriorCondition);
        overallInteriorConditionSelect.selectByValue(data.get("Overall_Interior_Condition"));

        clickElement(laundryRoomLocation_None);

        clickElement(washingMachineHoseType_Braided);

        choose(floorDrainPresentYes, floorDrainPresentNo, data.get("Floor_Drain_Present"));

        choose(overflowPanYes, overflowPanNo, data.get("Overflow_Pan"));

        choose(evidenceOfWashingMachineLeaksYes, evidenceOfWashingMachineLeaksNo, data.get("Evidence_Of_Machine_Leaks"));

        clickElement(toiletSupplyLines_CopperMetal);

        Select conditionOfToiletSupplySelect = new Select(conditionOfToiletSupplyLines);
        conditionOfToiletSupplySelect.selectByValue(data.get("Condition_Of_Toilet_Supply_Lines"));

        choose(evidenceOfToiletLeaksWaterDamageInBathroomsYes, evidenceOfToiletLeaksWaterDamageInBathroomsNo, data.get("Evidence_Of_Toilet_Leaks_Water_Damage_In_Bathrooms"));

        Select conditionOfGroutAndCaulkingSelect = new Select(conditionOfGroutAndCaulking);
        conditionOfGroutAndCaulkingSelect.selectByValue(data.get("Condition_Of_Grout_And_Caulking"));

        choose(evidenceOfDishwasherSupplyLinesLeaksYes, evidenceOfDishwasherSupplyLinesLeaksNo, data.get("Evidence_Of_Dishwasher_Supply_Lines_Leaks"));
        choose(evidenceOfRefrigeratorIceMachineSupplyLinesLeaksYes, evidenceOfRefrigeratorIceMachineSupplyLinesLeaksNo, data.get("Evidence_Of_Refrigerator_Ice_Machine_Supply_Lines_Leaks"));
        choose(tanklessWaterHeaterYes, tanklessWaterHeaterNo, data.get("Tankless_Water_Heater"));

        Select locationOfWaterHeaterSelect = new Select(locationOfWaterHeater);
        locationOfWaterHeaterSelect.selectByValue(data.get("Location_Of_Water_Heater"));


        typeText(yearWaterHeaterManufactured, data.get("Year_Water_Heater_Manufactured"));

        Select conditionOfWaterHeaterSelect = new Select(conditionOfWaterHeater);
        conditionOfWaterHeaterSelect.selectByValue(data.get("Condition_Of_Water_Heater"));

        choose(sumpPumpPresentYes, sumpPumpPresentNo, data.get("Sump_Pump_Present"));

        choose(doesSumpPumpHaveABatteryBackUpOrGeneratorYes, doesSumpPumpHaveABatteryBackUpOrGeneratorNo, data.get("Is_Sump_Pump_Connected_To_Battery_Backup_Or_Generator"));
        choose(IsSumpPumpConnectedToCentralStationAlarmYes, IsSumpPumpConnectedToCentralStationAlarmNo, data.get("Is_Sump_Pump_Connected_To_Central_Station_Alarm"));
        choose(HasSumpPumpBeenTestedYes, HasSumpPumpBeenTestedNo, data.get("Has_Sump_Pump_Been_Tested"));

        choose(waterShutOffDevicePresentYes, waterShutOffDevicePresentNo, data.get("Water_Shut_Off_Device_Present"));

        Select ifYesWhatTypeSelect = new Select(ifYesWhatType);
        ifYesWhatTypeSelect.selectByValue(data.get("If_Yes_What_Type"));

        typeText(describeAnyAreasOfWaterDamage, data.get("Describe_Any_Areas_Of_Water_Damage"));

        Select conditionOfElectricalPanelSystemSelect = new Select(conditionOfElectricalPanelSystem);
        conditionOfElectricalPanelSystemSelect.selectByValue(data.get("Condition_Of_Electrical_Panel_System"));

        choose(woodBurningFireplaceWoodstovePresentYes, woodBurningFireplaceWoodstovePresentNo, data.get("Wood_Burning_Fireplace"));

        choose(gasBurningFireplaceYes, gasBurningFireplaceNo, data.get("Gas_Burning_Fireplace"));

        choose(doAnyTreesInTheStrikeZoneYes, doAnyTreesInTheStrikeZoneNo, data.get("Do_Any_Trees_In_The_Strike_Zone"));

        choose(anyTreesTouchingYes, anyTreesTouchingNo, data.get("Any_Trees_Touching"));

        Select protectionClassSelect = new Select(protectionClass);
        protectionClassSelect.selectByValue(data.get("Protection_Class"));

        clickElement(fireAlarmType_Inactive);

        Select burglarAlarmTypeSelect = new Select(burglarAlarmType);
        burglarAlarmTypeSelect.selectByValue(data.get("Burglar_Alarm_Type"));

        choose(explosiveGasDetectorYes, explosiveGasDetectorNo, data.get("Explosive_Gas_Detector"));

        choose(cellularBackupYes, cellularBackupNo, data.get("Cellular_Backup"));

        Select lowTemperatureSensorsSelect = new Select(lowTemperatureSensors);
        lowTemperatureSensorsSelect.selectByValue(data.get("Low_Temperature_Sensors"));

        choose(residentialFireSprinklerSystemYes, residentialFireSprinklerSystemNo, data.get("Residential_Fire_Sprinkler_System"));

        choose(IsThereACentrallyMonitoredWaterflowAlarmYes, IsThereACentrallyMonitoredWaterflowAlarmNo, data.get("Is_There_A_Centrally_Monitored_Waterflow_Alarm"));

        choose(guardGatedCommunityYes, guardGatedCommunityNo, data.get("Guard_Gated_Community"));

        choose(securityCamerasYes, securityCamerasNo, data.get("Security_Cameras"));

        choose(domesticStaffYes, domesticStaffNo, data.get("Domestic_Staff"));

        choose(outdoorSwimmingPoolYes, outdoorSwimmingPoolNo, data.get("Outdoor_Swimming_Pool"));

        Select pricingTableSelect = new Select(pricingTableFirstSelect);
        pricingTableSelect.selectByValue(data.get("Pricing_Table_1"));

        typeText(pricingTableSqFt, data.get("Pricing_Table_Sq_Ft"));
        typeText(pricingTableDollarSqFt, data.get("Pricing_Table_Dollar_Sq_Ft"));
    }

    public void navigateToE2Value() throws Throwable {
        clickElement(e2Value);
    }

    public void fillE2ValueForm(Map<String, String> data) throws Throwable {

        choose(isThisAManufacturedOrKitHomeYes, isThisAManufacturedOrKitHomeNo, data.get("Is_This_A_Manufactured_Or_Kit_Home"));

        //typeText(coverageA,data.get("Coverage_A"));

        pause(2000);

        typeText(NumbersOfStories, data.get("Numbers_Of_Stories"));

        choose(hasTheHomeBeenCompletelyGuttedInThePast40YearsYes, hasTheHomeBeenCompletelyGuttedInThePast40YearsNo, data.get("Has_The_Home_Been_Completely_Gutted_In_The_Past_40_Years"));

        choose(isTheHomeListedOnTheHistoricRegistryYes, isTheHomeListedOnTheHistoricRegistryNo, data.get("Is _the_Home_Listed_On_The_Historic_Registry"));

        clickElement(localeInformationTown);

        typeText(squareFootageLA, data.get("Square_Footage_LA"));

        typeText(yearBuiltLA, data.get("Year_Built_LA"));

        clickElement(fullReplacementCost);

        pause(2000);

        choose(returnActualCashValueYes, returnActualCashValueNo, data.get("Return_Actual_Cash_Value"));

        Select architecturalStyleSelect = new Select(architecturalStyle);
        architecturalStyleSelect.selectByVisibleText(data.get("Architectural_Style"));

        Select constructionTypeSPSelect = new Select(constructionTypeSP);
        constructionTypeSPSelect.selectByVisibleText(data.get("Construction_Type_SP"));

        Select physicalShapeSelect = new Select(physicalShape);
        physicalShapeSelect.selectByVisibleText(data.get("Physical_Shape"));

        Select constructionQualitySelect = new Select(constructionQuality);
        constructionQualitySelect.selectByVisibleText(data.get("Construction_Quality"));

        Select primaryExteriorTypeSelect = new Select(primaryExteriorType);
        primaryExteriorTypeSelect.selectByVisibleText(data.get("Primary_Exterior_Type"));

        Select primaryRoofCoveringSelect = new Select(primaryRoofCovering);
        primaryRoofCoveringSelect.selectByVisibleText(data.get("Primary_Roof_Covering"));

        Select roofPitchSelect = new Select(roofPitch);
        roofPitchSelect.selectByVisibleText(data.get("Roof_Pitch"));

        Select foundationTypeSelect = new Select(foundationType);
        foundationTypeSelect.selectByVisibleText(data.get("Foundation_Type"));

        Select slopeOfSiteSelect = new Select(slopeOfSite);
        slopeOfSiteSelect.selectByVisibleText(data.get("Slope_Of_Site"));

        typeText(numberOfChimneys, data.get("Number_Of_Chimneys"));

        clickElement(chimneyTypeFrame);
    }
}