package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ProtectionBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ProtectionBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'protection')]")
    WebElement block;
    @FindBy(xpath = "//div[text()='Central Reporting Fire Alarm']/../../../..//label[text()='No']/..//input")
    WebElement centralReportingFireAlarmNo;
    @FindBy(xpath = "//div[text()='Central Reporting Fire Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement centralReportingFireAlarmYes;
    @FindBy(xpath = "//div[text()='Fire Alarm']/../../../..//label[text()='No']/..//input")
    WebElement fireAlarmNo;
    @FindBy(xpath = "//div[text()='Fire Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement fireAlarmYes;
    @FindBy(xpath = "//div[text()='Fire Alarm']/following::input[@type='text'][1]")
    WebElement fireAlarmInput;
    @FindBy(xpath = "//div[text()='Firewise Community Credit']/../../../..//label[text()='Yes']/..//input")
    WebElement firewiseCommunityCreditYes;
    @FindBy(xpath = "//div[text()='Firewise Community Credit']/../../../..//label[text()='No']/..//input")
    WebElement firewiseCommunityCreditNo;
    @FindBy(xpath = "//div[text()='Central Reporting Burglar Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement centralReportingBurglarAlarmYes;
    @FindBy(xpath = "//div[text()='Central Reporting Burglar Alarm']/../../../..//label[text()='No']/..//input")
    WebElement centralReportingBurglarAlarmNo;
    @FindBy(xpath = "//div[text()='Burglar Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement burglarAlarmYes;
    @FindBy(xpath = "//div[text()='Burglar Alarm']/../../../..//label[text()='No']/..//input")
    WebElement burglarAlarmNo;
    @FindBy(xpath = "//div[text()='Burglar Alarm']/following::input[@type='text'][1]")
    WebElement burglarAlarmInput;
    @FindBy(xpath = "//div[contains(text(),'Low Temperature')]/../../../..//label[text()='No']/..//input")
    WebElement lowTemperatureMonitoringSystemNo;
    @FindBy(xpath = "//div[contains(text(),'Low Temperature')]/../../../..//label[text()='Yes']/..//input")
    WebElement lowTemperatureMonitoringSystemYes;
    @FindBy(xpath = "//div[text()='Permanently Installed Generator']/../../../..//label[text()='No']/..//input")
    WebElement permanentlyInstalledGeneratorNo;
    @FindBy(xpath = "//div[text()='Permanently Installed Generator']/../../../..//label[text()='Yes']/..//input")
    WebElement permanentlyInstalledGeneratorYes;
    @FindBy(xpath = "//div[text()='Water Leak Detection System with Master Shut Off']/../../../..//input")
    WebElement waterLeakDetectionSystemWithMasterShutOffSelect;
    @FindBy(xpath = "//div[text()='Water Leak Detection System with Master Shut Off']/../../../..//label[text()='Yes']/..//input")
    WebElement waterLeakDetectionSystemWithMasterShutOffYes;
    @FindBy(xpath = "//div[text()='Water Leak Detection System with Master Shut Off']/../../../..//label[text()='No']/..//input")
    WebElement waterLeakDetectionSystemWithMasterShutOffNo;
    @FindBy(xpath = "//div[text()='Water Leak Detection System']/../../../..//input")
    WebElement waterLeakDetectionSystem;
    @FindBy(xpath = "//div[text()='Perimeter Security Protection']/../../../..//input")
    WebElement perimeterSecurityProtectionSelect;
    @FindBy(xpath = "//div[contains(text(),'Automatic Seismic Shut-Off Valve')]/../../../../div//label[text()='Yes']/..//input")
    WebElement automaticSeismicShutOffValveYes;
    @FindBy(xpath = "//div[contains(text(),'Interior Sprinkler System')]/../../../../div//label[text()='Yes']/..//input")
    WebElement interiorSprinklerSystemYes;
    @FindBy(xpath = "//div[contains(text(),'Interior Sprinkler System')]/../../../../div//label[text()='No']/..//input")
    WebElement interiorSprinklerSystemNo;
    @FindBy(xpath = "//div[contains(text(),'Automatic Seismic Shut-Off Valve')]/../../../../div//label[text()='No']/..//input")
    WebElement automaticSeismicShutOffValveNo;
    @FindBy(xpath = "//div[contains(text(),'Storm Shutters')]/../../../../div//label[text()='Yes']/..//input")
    WebElement stormShuttersYes;
    @FindBy(xpath = "//div[contains(text(),'Storm Shutters')]/../../../../div//label[text()='No']/..//input")
    WebElement stormShuttersNo;
    @FindBy(xpath = "//div[text()='Gas Leak Detector']/../../../..//label[text()='No']/..//input")
    WebElement gasLeakDetectorNo;
    @FindBy(xpath = "//div[text()='Gas Leak Detector']/../../../..//label[text()='Yes']/..//input")
    WebElement gasLeakDetectorYes;
    @FindBy(xpath = "//div[text()='24 Hour Signal Continuity']/../../../..//label[text()='No']/..//input")
    WebElement signalContinuityNo;
    @FindBy(xpath = "//div[text()='24 Hour Signal Continuity']/../../../..//label[text()='Yes']/..//input")
    WebElement signalContinuityYes;
    @FindBy(xpath = "//div[text()='Sprinkler System with Waterflow']/../../../..//label[text()='No']/..//input")
    WebElement sprinklerSystemWaterflowNo;
    @FindBy(xpath = "//div[text()='Sprinkler System with Waterflow']/../../../..//label[text()='Yes']/..//input")
    WebElement sprinklerSystemWaterflowYes;
    @FindBy(xpath = "//div[text()='Guard Gated Community']/../../../..//label[text()='No']/..//input")
    WebElement guardGatedCommunityNo;
    @FindBy(xpath = "//div[text()='Guard Gated Community']/../../../..//label[text()='Yes']/..//input")
    WebElement guardGatedCommunityYes;
    @FindBy(xpath = "//div[text()='Residential Sprinkler System']/../../../..//label[text()='No']/..//input")
    WebElement residentialSprinklerSystemNo;
    @FindBy(xpath = "//div[text()='Residential Sprinkler System']/../../../..//label[text()='Yes']/..//input")
    WebElement residentialSprinklerSystemYes;
    @FindBy(xpath = "//div[text()='Lightning Protection System']/../../../..//label[text()='No']/..//input")
    WebElement lightningProtectionSystemNo;
    @FindBy(xpath = "//div[text()='Lightning Protection System']/../../../..//label[text()='Yes']/..//input")
    WebElement lightningProtectionSystemYes;
    @FindBy(xpath = "//div[text()='External Perimeter Gate']/../../../..//label[text()='No']/..//input")
    WebElement externalPerimeterGateNo;
    @FindBy(xpath = "//div[text()='External Perimeter Gate']/../../../..//label[text()='Yes']/..//input")
    WebElement externalPerimeterGateYes;
    @FindBy(xpath = "//div[text()='Full Time Live In Caretaker']/../../../..//label[text()='No']/..//input")
    WebElement fullTimeCaretakerNo;
    @FindBy(xpath = "//div[text()='Full Time Live In Caretaker']/../../../..//label[text()='Yes']/..//input")
    WebElement fullTimeCaretakerYes;
    @FindBy(xpath = "//div[text()='24 Hour Door Man']/../../../..//label[text()='No']/..//input")
    WebElement twentyFourHourDoorManNo;
    @FindBy(xpath = "//div[text()='24 Hour Door Man']/../../../..//label[text()='Yes']/..//input")
    WebElement twentyFourHourDoorManYes;
    @FindBy(xpath = "//div[text()='Surveillance Camera']/../../../..//label[text()='No']/..//input")
    WebElement surveillanceCameraNo;
    @FindBy(xpath = "//div[text()='Surveillance Camera']/../../../..//label[text()='Yes']/..//input")
    WebElement surveillanceCameraYes;
    @FindBy(xpath = "//div[text()='Locked or Manned Elevator']/../../../..//label[text()='No']/..//input")
    WebElement lockedOrMannedElevatorNo;
    @FindBy(xpath = "//div[text()='Locked or Manned Elevator']/../../../..//label[text()='Yes']/..//input")
    WebElement lockedOrMannedElevatorYes;
    @FindBy(xpath = "//div[text()='Gated Community Patrol Service']/../../../..//label[text()='No']/..//input")
    WebElement gatedCommunityPatrolServiceNo;
    @FindBy(xpath = "//div[text()='Gated Community Patrol Service']/../../../..//label[text()='No']/..//input")
    WebElement gatedCommunityPatrolServiceYes;
    @FindBy(xpath = "//div[text()='Automatic Smoke Detectors']/../../../..//label[text()='No']/..//input")
    WebElement automaticSmokeDetectorsNo;
    @FindBy(xpath = "//div[text()='Automatic Smoke Detectors']/../../../..//label[text()='Yes']/..//input")
    WebElement automaticSmokeDetectorsYes;
    @FindBy(xpath = "//div[text()='Automatic Sprinkler System']/../../../..//label[text()='No']/..//input")
    WebElement automaticSprinklerSystemNo;
    @FindBy(xpath = "//div[text()='Automatic Sprinkler System']/../../../..//label[text()='Yes']/..//input")
    WebElement automaticSprinklerSystemYes;
    @FindBy(xpath = "//div[text()='In all areas including attic, bathroom, closet and attached structure?']/../../../..//label[text()='No']/..//input")
    WebElement automaticSprinklerAdditionalQuestionNo;
    @FindBy(xpath = "//div[text()='In all areas including attic, bathroom, closet and attached structure?']/../../../..//label[text()='Yes']/..//input")
    WebElement automaticSprinklerAdditionalQuestionYes;

    public void fillOutBasicProtectionDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("protection");
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                clickElement(block, "protection block");
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "OR":
                            case "HI":
                            case "WA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service"));
                            }
                            break;
                            case "ME": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                                setStormShutters(data.get("Storm_Shutters"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm"));
                                setBurglarAlarm(data.get("Burglar_Alarm"));
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                                setWaterLeakDetectionSystemWithMasterShutOff(data.get("Water_Leak_Detection"));
                            }
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                            }
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm"));
                                setBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                            }
                            break;
                            case "TX":
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service"));
                            }
                            break;
                            case "NY":
                            case "TX":
                            case "LA":
                            case "GA":
                            case "CT":
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan"));
                                setSurveillanceCamera(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                                setLockedOrMannedElevator(data);
                            }
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "AZ":
                            case "IA":
                            case "ID":
                            case "IN":
                            case "IL":
                            case "DC":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "NV":
                            case "OH":
                            case "OK":
                            case "OR":
                            case "PA":
                            case "RI":
                            case "SD":
                            case "TN":
                            case "UT":
                            case "VT":
                            case "WI":
                            case "WY":
                            case "AL":
                            case "CA":
                            case "CT":
                            case "DE":
                            case "HI":
                            case "LA":
                            case "MA":
                            case "MD":
                            case "MS":
                            case "NJ":
                            case "NY":
                            case "VA":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "CO":
                            case "WA":
                            case "ME":
                            case "NC":
                            case "FL":
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Lightning_Protection"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker"));
                            }
                            break;
                        }
                    }
                    break;


                    //TODO
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ": {
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                            }
                            break;
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                        }
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOutBasicProtectionDetails_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("protection");
        switch (data.get("Admitted_Line_END")) {
            case "Homeowner": {
                clickElement(block, "protection block");
                switch (data.get("Residence_Type_END")) {
                    case "Homeowner": {
                        switch (data.get("State_END")) {
                            case "OR":
                            case "HI":
                            case "WA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve_END"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_END"));
                            }
                            break;
                            case "ME": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                                setStormShutters(data.get("Storm_Shutters_END"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_END"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_END"));
                                setBurglarAlarm(data.get("Burglar_Alarm_END"));
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors_END"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System_END"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                                setWaterLeakDetectionSystemWithMasterShutOff(data.get("Water_Leak_Detection_END"));
                            }
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                            }
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_END")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detectio_ENDn"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_END"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_END"));
                                setBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors_END"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System_END"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question_END"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                            }
                            break;
                            case "TX":
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_END")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_END"));
                            }
                            break;
                            case "NY":
                            case "TX":
                            case "LA":
                            case "GA":
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkle_ENDr"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_END"));
                                setSurveillanceCamera_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                                setLockedOrMannedElevator_END(data);
                            }
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_END")) {
                    case "Homeowner": {
                        switch (data.get("State_END")) {
                            case "AK":
                            case "AR":
                            case "AZ":
                            case "IA":
                            case "ID":
                            case "IN":
                            case "IL":
                            case "DC":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "NV":
                            case "OH":
                            case "OK":
                            case "OR":
                            case "PA":
                            case "RI":
                            case "SD":
                            case "TN":
                            case "UT":
                            case "VT":
                            case "WI":
                            case "WY":
                            case "AL":
                            case "CA":
                            case "CT":
                            case "DE":
                            case "HI":
                            case "LA":
                            case "MA":
                            case "MD":
                            case "MS":
                            case "NJ":
                            case "NY":
                            case "VA":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "CO":
                            case "WA":
                            case "ME":
                            case "NC":
                            case "FL":
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_END"));
                            }
                            break;
                        }
                    }
                    break;


                    //TODO
                    case "Condo/Co-op": {
                        switch (data.get("State_END")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ": {
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_END")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_END"));
                            }
                            break;
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                        }
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOutBasicProtectionDetails_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("protection");
        switch (data.get("Admitted_Line_OOS_END")) {
            case "Homeowner": {
                clickElement(block, "protection block");
                switch (data.get("Residence_Type_OOS_END")) {
                    case "Homeowner": {
                        switch (data.get("State_OOS_END")) {
                            case "OR":
                            case "HI":
                            case "WA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve_OOS_END"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_OOS_END"));
                            }
                            break;
                            case "ME": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                                setStormShutters(data.get("Storm_Shutters_OOS_END"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors_OOS_END"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System_OOS_END"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                                setWaterLeakDetectionSystemWithMasterShutOff(data.get("Water_Leak_Detection_OOS_END"));
                            }
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                            }
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_OOS_END")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detectio_OOS_ENDn"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors_OOS_END"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System_OOS_END"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                            }
                            break;
                            case "TX":
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_OOS_END")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_OOS_END"));
                            }
                            break;
                            case "NY":
                            case "TX":
                            case "LA":
                            case "GA":
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkle_OOS_ENDr"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCamera_OOS_END(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                                setLockedOrMannedElevator_OOS_END(data);
                            }
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_OOS_END")) {
                    case "Homeowner": {
                        switch (data.get("State_OOS_END")) {
                            case "AK":
                            case "AR":
                            case "AZ":
                            case "IA":
                            case "ID":
                            case "IN":
                            case "IL":
                            case "DC":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "NV":
                            case "OH":
                            case "OK":
                            case "OR":
                            case "PA":
                            case "RI":
                            case "SD":
                            case "TN":
                            case "UT":
                            case "VT":
                            case "WI":
                            case "WY":
                            case "AL":
                            case "CA":
                            case "CT":
                            case "DE":
                            case "HI":
                            case "LA":
                            case "MA":
                            case "MD":
                            case "MS":
                            case "NJ":
                            case "NY":
                            case "VA":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "CO":
                            case "WA":
                            case "ME":
                            case "NC":
                            case "FL":
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;


//TODO
                    case "Condo/Co-op": {
                        switch (data.get("State_OOS_END")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ": {
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_OOS_END")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_OOS_END"));
                            }
                            break;
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                        }
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOutBasicProtectionDetails_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("protection");
        switch (data.get("Admitted_Line_RNW")) {
            case "Homeowner": {
                clickElement(block, "protection block");
                switch (data.get("Residence_Type_RNW")) {
                    case "Homeowner": {
                        switch (data.get("State_RNW")) {
                            case "OR":
                            case "HI":
                            case "WA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve_RNW"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve_RNW"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_RNW"));
                            }
                            break;
                            case "ME": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                                setStormShutters(data.get("Storm_Shutters_RNW"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_RNW"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_RNW"));
                                setBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors_RNW"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System_RNW"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                                setWaterLeakDetectionSystemWithMasterShutOff(data.get("Water_Leak_Detection_RNW"));
                            }
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setLowTemperatureMonitoring(data.get("LowTemp_Monitoring_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                            }
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_RNW")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detectio_RNWn"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_RNW"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_RNW"));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_RNW"));
                                setBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                                setAutomaticSmokeDetectors(data.get("Protection_Block_Automatic_Smoke_Detectors_RNW"));
                                setAutomaticSprinklerSystem(data.get("Protection_Block_Automatic_Sprinkler_System_RNW"), data.get("Protection_Block_Automatic_Sprinkler_Additional_Question_RNW"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                            }
                            break;
                            case "TX":
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_RNW")) {
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_RNW"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setGatedCommunityPatrolService(data.get("Protection_Block_Gated_Community_Patrol_Service_RNW"));
                            }
                            break;
                            case "NY":
                            case "TX":
                            case "LA":
                            case "GA":
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkle_RNWr"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                            }
                            break;
                            default: {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                setTwentyFourHourDoorMan(data.get("24_Hour_DoorMan_RNW"));
                                setSurveillanceCamera_RNW(data);
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                                setLockedOrMannedElevator_RNW(data);
                            }
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_RNW")) {
                    case "Homeowner": {
                        switch (data.get("State_RNW")) {
                            case "AK":
                            case "AR":
                            case "AZ":
                            case "IA":
                            case "ID":
                            case "IN":
                            case "IL":
                            case "DC":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "NV":
                            case "OH":
                            case "OK":
                            case "OR":
                            case "PA":
                            case "RI":
                            case "SD":
                            case "TN":
                            case "UT":
                            case "VT":
                            case "WI":
                            case "WY":
                            case "AL":
                            case "CA":
                            case "CT":
                            case "DE":
                            case "HI":
                            case "LA":
                            case "MA":
                            case "MD":
                            case "MS":
                            case "NJ":
                            case "NY":
                            case "VA":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "CO":
                            case "WA":
                            case "ME":
                            case "NC":
                            case "FL":
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("FullTime_Caretaker_RNW"));
                            }
                            break;
                        }
                    }
                    break;


//TODO
                    case "Condo/Co-op": {
                        switch (data.get("State_RNW")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ": {
                            }
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_RNW")) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                saveChanges();
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_RNW"));
                            }
                            break;
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                        }
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOutBasicProtectionDetails(Map<String, String> data, int i) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        switch (data.get("State_" + i)) {
                            case "AK":
                            case "AR":
                            case "AZ":
                            case "IA":
                            case "ID":
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_" + i));
                            }
                            break;
                            case "IN":
                            case "IL":
                            case "DC":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "NV":
                            case "OH":
                            case "OK":
                            case "OR":
                            case "PA":
                            case "RI":
                            case "SD":
                            case "TN":
                            case "UT":
                            case "VT":
                            case "WI":
                            case "WY":
                            case "AL":
                            case "CA":
                            case "CT":
                            case "DE":
                            case "HI":
                            case "LA":
                            case "MA":
                            case "MD":
                            case "MS":
                            case "NJ":
                            case "NY":
                            case "VA":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "WV": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_" + i));
                            }
                            break;
                            case "WA": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                                setAutomaticSeismicShutOffValve(data.get("Automatic_Seismic_Shut_Off_Valve_" + i));
                            }
                            break;
                            case "ME": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                                setStormShutters(data.get("Storm_Shutters_" + i));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_" + i));
                                setBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State_" + i)) {
                            case "AR":
                            case "KS":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "IA":
                            case "KY":
                            case "AK":
                            case "IN":
                            case "NV":
                            case "MN":
                            case "OH":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "MO":
                            case "ND":
                            case "MT":
                            case "OK":
                            case "OR":
                            case "WA":
                            case "SD":
                            case "WI":
                            case "RI":
                            case "UT":
                            case "WV":
                            case "TN":
                            case "PA":
                            case "VT":
                            case "MD":
                            case "HI":
                            case "MA":
                            case "ME":
                            case "CT":
                            case "AL":
                            case "WY":
                            case "LA":
                            case "CA":
                            case "DE":
                            case "GA":
                            case "FL":
                            case "NJ":
                            case "TX":
                            case "MI":
                            case "MS":
                            case "VA":
                            case "NY":
                            case "ID": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_" + i));
                                setBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_" + i));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_" + i)) {
                            case "AR":
                            case "KS":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "IA":
                            case "KY":
                            case "AK":
                            case "IN":
                            case "NV":
                            case "MN":
                            case "OH":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "MO":
                            case "ND":
                            case "MT":
                            case "OK":
                            case "OR":
                            case "WA":
                            case "SD":
                            case "WI":
                            case "RI":
                            case "UT":
                            case "WV":
                            case "TN":
                            case "PA":
                            case "VT":
                            case "MD":
                            case "HI":
                            case "MA":
                            case "ME":
                            case "WY":
                            case "CA":
                            case "DE":
                            case "NJ":
                            case "MI":
                            case "VA":
                            case "SC":
                            case "ID": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                            }
                            break;
                            case "AL":
                            case "LA":
                            case "MS":
                            case "NY":
                            case "FL":
                            case "TX":
                            case "GA":
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                            }
                            break;
                            case "NC": {
                                setFireAlarm(data.get("Fire_Alarm_" + i));
                                setBurglarAlarm(data.get("Burglar_Alarm_" + i));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                setFirewiseCommunityCredit(data.get("Firewise_Community_Credit_" + i));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        switch (data.get("State_" + i)) {
                            case "AK":
                            case "AR":
                            case "AZ":
                            case "IA":
                            case "ID":
                            case "IN":
                            case "IL":
                            case "DC":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "NV":
                            case "OH":
                            case "OK":
                            case "OR":
                            case "PA":
                            case "RI":
                            case "SD":
                            case "TN":
                            case "UT":
                            case "VT":
                            case "WI":
                            case "WY":
                            case "AL":
                            case "CA":
                            case "CT":
                            case "DE":
                            case "HI":
                            case "LA":
                            case "MA":
                            case "MD":
                            case "MS":
                            case "NJ":
                            case "NY":
                            case "VA":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "CO":
                            case "WA":
                            case "ME":
                            case "NC":
                            case "SC":
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystemHS(data.get("Water_Leak_Detection_" + i));
                                selectPerimeterSecurity(data.get("Perimeter_Security_Protection_" + i));
                            }
                            break;
                            case "WV":
                        }
                    }
                    break;


                    //TODO
                    case "Condo/Co-op": {
                        switch (data.get("State_" + i)) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                                clickElement(commonComponentsAndActions.saveChanges);
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                                saveChanges();
                            }
                            break;
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State_" + i)) {
                            case "AK": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                clickElement(commonComponentsAndActions.saveChanges);
                                Thread.sleep(10000);
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Fire_Alarm_" + i));
                                setCentralReportingBurglarAlarm(data.get("Burglar_Alarm_" + i));
                                selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection_" + i));
                            }
                            break;
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                        }
                    }
                    break;
                }
            }
            break;
        }

        clickElement(commonComponentsAndActions.saveChanges);
        pause(5000);
    }

    public void fillOutBasicProtectionDetailsHS(Map<String, String> data) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        verifyBlockExists("protection");
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (data.get("Risk_Addresses_Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AZ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "MT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "UT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "WY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "AL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setAutomaticSeismicShutOffValve(data.get("Protection_Automatic_Seismic_Shut_Off_Valve"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                            }
                            break;
                            case "HI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "MA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "MS": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "NJ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "TX": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "GA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "NC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "WV":
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                                setSurveillanceCameraHS(data);
                                setLockedOrMannedElevatorHS(data);
                            }
                            break;
                            case "CA":{
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator"));
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                            }
                            break;
                            case "NY":{
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "MA":{
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "SC":
                            case "NC":
                            case "NJ":{
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                                setSurveillanceCameraHS(data);
                                setLockedOrMannedElevatorHS(data);
                            }
                            break;
                            case "MT":
                            case "WY":
                            case "MS":
                            case "GA":
                            case "AZ":
                            case "CO":
                            case "AL":
                            case "HI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                            }
                            break;
                            case "TX":
                            case "UT":
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                            }
                            break;
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }
        clickElement(commonComponentsAndActions.saveChanges);
        pause(5000);
    }

    public void fillOutBasicProtectionDetailsHS_END(Map<String, String> data) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_END"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_END");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AZ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_nstalled_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "MT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_nstalled_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "UT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "WY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "AL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                setAutomaticSeismicShutOffValve(data.get("Protection_Automatic_Seismic_Shut_Off_Valve_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                            }
                            break;
                            case "HI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "MA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "MS": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "NJ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "TX": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "GA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "NC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_END"));
                                setSurveillanceCameraHS_END(data);
                                setLockedOrMannedElevatorHS_END(data);
                            }
                            break;
                            case "CA":{
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_nstalled_Generator_END"));
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_END"));
                            }
                            break;
                            case "MT":
                            case "WY":
                            case "MS":
                            case "GA":
                            case "AZ":
                            case "CO":
                            case "AL":
                            case "MA":
                            case "HI":
                            case "NC":
                            case "SC":
                            case "NY":
                            case "NJ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_END"));
                            }
                            break;
                            case "TX":
                            case "UT":
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_END"));
                            }
                            break;
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_END"));
                            }
                            break;

                        }
                    }
                    break;
                }
            }
            break;
        }
        clickElement(commonComponentsAndActions.saveChanges);
        pause(5000);
    }

    public void fillOutBasicProtectionDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_OOS_END"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_OOS_END");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AZ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "MT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "UT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "WY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "AL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                setAutomaticSeismicShutOffValve(data.get("Protection_Automatic_Seismic_Shut_Off_Valve_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                            }
                            break;
                            case "HI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "MA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "MS": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "NJ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "TX": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "GA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "NC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_OOS_END"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_OOS_END"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_OOS_END"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_OOS_END"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_OOS_END"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_OOS_END"));
                                setSurveillanceCameraHS_OOS_END(data);
                                setLockedOrMannedElevatorHS_OOS_END(data);
                            }
                            break;
                            case "CA":{
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_OOS_END"));
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_OOS_END"));
                            }
                            break;
                            case "MT":
                            case "WY":
                            case "MS":
                            case "GA":
                            case "AZ":
                            case "CO":
                            case "AL":
                            case "MA":
                            case "HI":
                            case "NC":
                            case "SC":
                            case "NY":
                            case "NJ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_OOS_END"));
                            }
                            break;
                            case "TX":
                            case "UT":
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_OOS_END"));
                            }
                            break;
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_OOS_END"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_OOS_END"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_OOS_END"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_OOS_END"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_OOS_END"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }
        clickElement(commonComponentsAndActions.saveChanges);
        pause(5000);
    }

    public void fillOutBasicProtectionDetailsHS_RNW(Map<String, String> data) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_RNW"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_RNW");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AZ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "MT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "UT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "WY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "AL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "CA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                setAutomaticSeismicShutOffValve(data.get("Protection_Automatic_Seismic_Shut_Off_Valve_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                            }
                            break;
                            case "HI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "MA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "MS": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "NJ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "NY": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "TX": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "GA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "CO": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "NC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "SC": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                selectWaterLeakDetectionSystemHS(data.get("Protection_Water_Leak_Detection_RNW"));
                                selectPerimeterSecurity(data.get("Protection_Perimeter_Security_Protection_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setGasLeakDetector(data.get("Protection_Gas_Leak_Detector_RNW"));
                                setSignalContinuity(data.get("Protection_24Hour_Signal_Continuity_RNW"));
                                setSprinklerSystemWaterflow(data.get("Protection_Sprinkler_System_Waterflow_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setResidentialSprinklerSystem(data.get("Protection_Residential_Sprinkler_RNW"));
                                setLightningProtectionSystem(data.get("Protection_Lightning_Protection_RNW"));
                                setExternalPerimeterGate(data.get("Protection_External_Perimeter_Gate_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "FL": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_RNW"));
                                setSurveillanceCameraHS_RNW(data);
                                setLockedOrMannedElevatorHS_RNW(data);
                            }
                            break;
                            case "CA":{
                                setInteriorSprinklerSystem(data.get("Protection_Interior_Sprinkler_System_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setPermanentlyInstalledGenerator(data.get("Protection_Installed_Generator_RNW"));
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_RNW"));
                            }
                            break;
                            case "MT":
                            case "WY":
                            case "MS":
                            case "GA":
                            case "AZ":
                            case "CO":
                            case "AL":
                            case "MA":
                            case "HI":
                            case "NC":
                            case "SC":
                            case "NY":
                            case "NJ": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_RNW"));
                            }
                            break;
                            case "TX":
                            case "UT":
                            case "LA": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                            }
                            break;
                            case "RI": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_RNW"));
                            }
                            break;
                            case "CT": {
                                setCentralReportingFireAlarm(data.get("Protection_Fire_Alarm_RNW"));
                                setCentralReportingBurglarAlarm(data.get("Protection_Burglar_Alarm_RNW"));
                                setGuardGatedCommunity(data.get("Protection_Guard_Gated_Community_RNW"));
                                setFullTimeCaretaker(data.get("Protection_FullTime_Caretaker_RNW"));
                                setTwentyFourHourDoorMan(data.get("Protection_24_Hour_DoorMan_RNW"));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }
        clickElement(commonComponentsAndActions.saveChanges);
        pause(5000);
    }

    public void setCentralReportingFireAlarm(String fireAlarm) throws Throwable {
        if (fireAlarm.equalsIgnoreCase("Yes")) {
            clickElement(centralReportingFireAlarmYes);
        } else {
            clickElement(centralReportingFireAlarmNo);
        }
    }

    public void setFireAlarm(String fireAlarm) throws Throwable {
        if (fireAlarm.equalsIgnoreCase("No")) {
            clickElement(fireAlarmNo);
        } else {
            clickElement(fireAlarmYes);
            pause(1000);
            typeTextEnter(fireAlarmInput, fireAlarm, "Fire Alarm");
        }
    }

    public void setFirewiseCommunityCredit(String firewiseCommunityCredit) throws Throwable {
        if (isYes(firewiseCommunityCredit)) {
            clickElement(firewiseCommunityCreditYes);
        } else {
            clickElement(firewiseCommunityCreditNo);
        }
    }

    public void setCentralReportingBurglarAlarm(String burglarAlarm) throws Throwable {
        if (burglarAlarm.equalsIgnoreCase("Yes")) {
            clickElement(centralReportingBurglarAlarmYes);
        } else {
            clickElement(centralReportingBurglarAlarmNo);
        }
    }

    public void setBurglarAlarm(String burglarAlarm) throws Throwable {
        if (burglarAlarm.equalsIgnoreCase("No")) {
            clickElement(burglarAlarmNo);
        } else {
            clickElement(burglarAlarmYes);
            pause(1000);
            typeTextEnter(burglarAlarmInput, burglarAlarm, "Burglar Alarm");
        }
    }

    public void setAutomaticSeismicShutOffValve(String choose) throws Throwable {
        try {
            choose(automaticSeismicShutOffValveYes, automaticSeismicShutOffValveNo, choose);
        } catch (Exception e){}
    }

    public void setWaterLeakDetectionSystemWithMasterShutOff(String choose) throws Throwable {
        choose(waterLeakDetectionSystemWithMasterShutOffYes, waterLeakDetectionSystemWithMasterShutOffNo, choose);
    }

    public void setStormShutters(String choose) throws Throwable {
        choose(stormShuttersYes, stormShuttersNo, choose);
    }

    public void selectWaterLeakDetectionSystem(String waterLeakDetectionSystemValue) throws Throwable {
        typeTextEnter(waterLeakDetectionSystemWithMasterShutOffSelect, waterLeakDetectionSystemValue, "Water Leak Detection System");
        clickFooter();
    }

    public void selectWaterLeakDetectionSystemHS(String waterLeakDetectionSystemValue) throws Throwable {
        typeText(waterLeakDetectionSystem, waterLeakDetectionSystemValue);
    }

    public void selectPerimeterSecurity(String perimeterSecurityValue) throws Throwable {
        typeText(perimeterSecurityProtectionSelect, perimeterSecurityValue);
    }

    public void setLowTemperatureMonitoring(String lowTempMonitoringValue) throws Throwable {
        if (hasValue(lowTempMonitoringValue)) {
            if (lowTempMonitoringValue.equalsIgnoreCase("Yes")) {
                clickElement(lowTemperatureMonitoringSystemYes);
            } else {
                clickElement(lowTemperatureMonitoringSystemNo);
            }
        }
    }

    public void setPermanentlyInstalledGenerator(String permInstalledGeneratorValue) throws Throwable {
        if (hasValue(permInstalledGeneratorValue)) {
            if (permInstalledGeneratorValue.equalsIgnoreCase("Yes")) {
                clickElement(permanentlyInstalledGeneratorYes);
            } else {
                clickElement(permanentlyInstalledGeneratorNo);
            }
        }
    }

    public void setGasLeakDetector(String gasLeakDetectorValue) throws Throwable {
        if (hasValue(gasLeakDetectorValue)) {
            if (gasLeakDetectorValue.equalsIgnoreCase("Yes")) {
                clickElement(gasLeakDetectorYes);
            } else {
                clickElement(gasLeakDetectorNo);
            }
        }
    }

    public void setSignalContinuity(String signalContinuityValue) throws Throwable {
        if (hasValue(signalContinuityValue)) {
            if (signalContinuityValue.equalsIgnoreCase("Yes")) {
                clickElement(signalContinuityYes);
            } else {
                clickElement(signalContinuityNo);
            }
        }
    }

    public void setSprinklerSystemWaterflow(String sprinklerSystemValue) throws Throwable {
        if (hasValue(sprinklerSystemValue)) {
            if (sprinklerSystemValue.equalsIgnoreCase("Yes")) {
                clickElement(sprinklerSystemWaterflowYes);
            } else {
                clickElement(sprinklerSystemWaterflowNo);
            }
        }
    }

    public void setGuardGatedCommunity(String guardGatedCommunityValue) throws Throwable {
        if (hasValue(guardGatedCommunityValue)) {
            if (guardGatedCommunityValue.equalsIgnoreCase("Yes")) {
                clickElement(guardGatedCommunityYes);
            } else {
                clickElement(guardGatedCommunityNo);
            }
        }
    }

    public void setResidentialSprinklerSystem(String residentialSprinklerValue) throws Throwable {
        if (hasValue(residentialSprinklerValue)) {
            if (residentialSprinklerValue.equalsIgnoreCase("Yes")) {
                clickElement(residentialSprinklerSystemYes);
            } else {
                clickElement(residentialSprinklerSystemNo);
            }
        }
    }

    public void setInteriorSprinklerSystem(String interiorSprinklerValue) throws Throwable {
        if (hasValue(interiorSprinklerValue)) {
            if (interiorSprinklerValue.equalsIgnoreCase("Yes")) {
                clickElement(interiorSprinklerSystemYes);
            } else {
                clickElement(interiorSprinklerSystemNo);
            }
        }
    }

    public void setLightningProtectionSystem(String lightningProtectionSystemValue) throws Throwable {
        if (hasValue(lightningProtectionSystemValue)) {
            if (lightningProtectionSystemValue.equalsIgnoreCase("Yes")) {
                clickElement(lightningProtectionSystemYes);
            } else {
                clickElement(lightningProtectionSystemNo);
            }
        }
    }

    public void setExternalPerimeterGate(String externalPerimeterGateValue) throws Throwable {
        if (hasValue(externalPerimeterGateValue)) {
            if (externalPerimeterGateValue.equalsIgnoreCase("Yes")) {
                clickElement(externalPerimeterGateYes);
            } else {
                clickElement(externalPerimeterGateNo);
            }
        }
    }

    public void setFullTimeCaretaker(String fullTimeCaretakerValue) throws Throwable {
        if (hasValue(fullTimeCaretakerValue)) {
            if (fullTimeCaretakerValue.equalsIgnoreCase("Yes")) {
                clickElement(fullTimeCaretakerYes);
            } else {
                clickElement(fullTimeCaretakerNo);
            }
        }
    }

    public void setTwentyFourHourDoorMan(String doorManValue) throws Throwable {
        if (hasValue(doorManValue)) {
            if (doorManValue.equalsIgnoreCase("Yes")) {
                clickElement(twentyFourHourDoorManYes);
            } else {
                clickElement(twentyFourHourDoorManNo);
            }
        }
    }

    //TODO Revisit and refactor Camera method
    public void setSurveillanceCamera(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Surveillance_Camera")) && hasValue(data.get("24_Hour_DoorMan")) && data.get("24_Hour_DoorMan").equalsIgnoreCase("Yes")) {
            if (data.get("Surveillance_Camera").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }
    }

    private void setSurveillanceCamera_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Surveillance_Camera_END")) && hasValue(data.get("24_Hour_DoorMan_END")) && data.get("24_Hour_DoorMan_END").equalsIgnoreCase("Yes")) {
            if (data.get("Surveillance_Camera_END").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }

    }

    private void setSurveillanceCamera_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Surveillance_Camera_OOS_END")) && hasValue(data.get("24_Hour_DoorMan_OOS_END")) && data.get("24_Hour_DoorMan_OOS_END").equalsIgnoreCase("Yes")) {
            if (data.get("Surveillance_Camera_OOS_END").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }

    }

    private void setSurveillanceCamera_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Surveillance_Camera_RNW")) && hasValue(data.get("24_Hour_DoorMan_RNW")) && data.get("24_Hour_DoorMan_RNW").equalsIgnoreCase("Yes")) {
            if (data.get("Surveillance_Camera_RNW").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }

    }

    public void setSurveillanceCameraHS(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Surveillance_Camera")) && hasValue(data.get("Protection_24_Hour_DoorMan")) && data.get("Protection_24_Hour_DoorMan").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Surveillance_Camera").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }
    }

    public void setSurveillanceCameraHS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Surveillance_Camera_END")) && hasValue(data.get("Protection_24_Hour_DoorMan_END")) && data.get("Protection_24_Hour_DoorMan_END").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Surveillance_Camera_END").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }
    }

    public void setSurveillanceCameraHS_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Surveillance_Camera_OOS_END")) && hasValue(data.get("Protection_24_Hour_DoorMan_OOS_END")) && data.get("Protection_24_Hour_DoorMan_OOS_END").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Surveillance_Camera_OOS_END").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }
    }

    public void setSurveillanceCameraHS_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Surveillance_Camera_RNW")) && hasValue(data.get("Protection_24_Hour_DoorMan_RNW")) && data.get("Protection_24_Hour_DoorMan_RNW").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Surveillance_Camera_RNW").equalsIgnoreCase("Yes")) {
                clickElement(surveillanceCameraYes);
            } else {
                clickElement(surveillanceCameraNo);
            }
        }
    }

    public void setLockedOrMannedElevatorHS(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Locked_Or_Manned_Elevator")) && hasValue(data.get("Protection_24_Hour_DoorMan")) && data.get("Protection_24_Hour_DoorMan").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Locked_Or_Manned_Elevator").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }
    }

    public void setLockedOrMannedElevatorHS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Locked_Or_Manned_Elevator_END")) && hasValue(data.get("Protection_24_Hour_DoorMan_END")) && data.get("Protection_24_Hour_DoorMan_END").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Locked_Or_Manned_Elevator_END").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }
    }

    public void setLockedOrMannedElevatorHS_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Locked_Or_Manned_Elevator_OOS_END")) && hasValue(data.get("Protection_24_Hour_DoorMan_OOS_END")) && data.get("Protection_24_Hour_DoorMan_OOS_END").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Locked_Or_Manned_Elevator_OOS_END").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }
    }

    public void setLockedOrMannedElevatorHS_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Protection_Locked_Or_Manned_Elevator_RNW")) && hasValue(data.get("Protection_24_Hour_DoorMan_RNW")) && data.get("Protection_24_Hour_DoorMan_RNW").equalsIgnoreCase("Yes")) {
            if (data.get("Protection_Locked_Or_Manned_Elevator_RNW").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }
    }

    //TODO Revisit and refactor Elevator method
    public void setLockedOrMannedElevator(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Locked_Or_Manned_Elevator")) && hasValue(data.get("24_Hour_DoorMan")) && data.get("24_Hour_DoorMan").equalsIgnoreCase("Yes")) {
            if (data.get("Locked_Or_Manned_Elevator").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }
    }

    private void setLockedOrMannedElevator_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Locked_Or_Manned_Elevator_END")) && hasValue(data.get("24_Hour_DoorMan_END")) && data.get("24_Hour_DoorMan_END").equalsIgnoreCase("Yes")) {
            if (data.get("Locked_Or_Manned_Elevator_END").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }

    }

    private void setLockedOrMannedElevator_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Locked_Or_Manned_Elevator_OOS_END")) && hasValue(data.get("24_Hour_DoorMan_OOS_END")) && data.get("24_Hour_DoorMan_OOS_END").equalsIgnoreCase("Yes")) {
            if (data.get("Locked_Or_Manned_Elevator_OOS_END").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }

    }

    private void setLockedOrMannedElevator_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Locked_Or_Manned_Elevator_RNW")) && hasValue(data.get("24_Hour_DoorMan_RNW")) && data.get("24_Hour_DoorMan_RNW").equalsIgnoreCase("Yes")) {
            if (data.get("Locked_Or_Manned_Elevator_RNW").equalsIgnoreCase("Yes")) {
                clickElement(lockedOrMannedElevatorYes);
            } else {
                clickElement(lockedOrMannedElevatorNo);
            }
        }

    }

    public void setAutomaticSmokeDetectors(String smokeDetectors) throws Throwable {
        choose(automaticSmokeDetectorsYes, automaticSmokeDetectorsNo, smokeDetectors);
    }

    public void setAutomaticSprinklerSystem(String sprinklerSystem, String additionalQuestionValue) throws Throwable {
        choose(automaticSprinklerSystemYes, automaticSprinklerSystemNo, sprinklerSystem);
        if (sprinklerSystem.equalsIgnoreCase("Yes"))
            setSprinklerInAllAreasAdditionalQuestion(additionalQuestionValue);
    }

    public void setGatedCommunityPatrolService(String gatedCommunityPatrolService) throws Throwable {
        choose(gatedCommunityPatrolServiceYes, gatedCommunityPatrolServiceNo, gatedCommunityPatrolService);
    }

    public void setSprinklerInAllAreasAdditionalQuestion(String value) throws Throwable {
        choose(automaticSprinklerAdditionalQuestionYes, automaticSprinklerAdditionalQuestionNo, value);
    }

    public void fillOutBasicProtectionDetailsFS(Map<String, String> data) {

    }


}