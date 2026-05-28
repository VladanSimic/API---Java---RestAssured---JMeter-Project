package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.DriverDetailsPage;
import pages.blocks.DriverIncidentsBlock;
import pages.blocks.ProtectionBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class LocationCoveragePageSteps extends BaseTest {
    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I set Central Reporting Fire Alarm to {string}")
    public void iSetCentralReportingFireAlarmTo(String value) throws Throwable {
        new ProtectionBlock(driver).setCentralReportingFireAlarm(value);
    }

    @And("I set Central Reporting Burglar Alarm to {string}")
    public void iSetCentralReportingBurglarAlarmTo(String value) throws Throwable {
        new ProtectionBlock(driver).setCentralReportingBurglarAlarm(value);
    }

    @And("I set Low Temperature monitoring system to {string}")
    public void iSetLowTempMonitoringSystemTo(String value) throws Throwable {
        new ProtectionBlock(driver).setLowTemperatureMonitoring(value);
    }

    @And("I set Permanently Installed Generator to {string}")
    public void iSetPermanentlyInstalledGeneratorTo(String value) throws Throwable {
        new ProtectionBlock(driver).setPermanentlyInstalledGenerator(value);
    }

    @And("I set Gas Leak Detector to {string}")
    public void iSetGasLeakDetectorTo(String value) throws Throwable {
        new ProtectionBlock(driver).setGasLeakDetector(value);
    }

    @And("I set 24 Hour Signal Continuity to {string}")
    public void iSet24HourSignalContinuityTo(String value) throws Throwable {
        new ProtectionBlock(driver).setSignalContinuity(value);
    }

    @And("I set Sprinkler System with Waterflow to {string}")
    public void iSetSprinklerSystemWithWaterflowTo(String value) throws Throwable {
        new ProtectionBlock(driver).setSprinklerSystemWaterflow(value);
    }

    @And("I set Guard Gated Community to {string}")
    public void iSetGuardGatedCommunityTo(String value) throws Throwable {
        new ProtectionBlock(driver).setGuardGatedCommunity(value);
    }

    @And("I set Residential Sprinkler System to {string}")
    public void iSetResidentialSprinklerSystemTo(String value) throws Throwable {
        new ProtectionBlock(driver).setResidentialSprinklerSystem(value);
    }

    @And("I set Water Leak Detection System with Master Shut Off to {string}")
    public void iSetWaterLeakDetectionSystemWithMasterShutOffTo(String value) throws Throwable {
        new ProtectionBlock(driver).selectWaterLeakDetectionSystem(value);
    }

    @And("I set Lightning Protection System to {string}")
    public void iSetLightingProtectionSystemTo(String value) throws Throwable {
        new ProtectionBlock(driver).setLightningProtectionSystem(value);
    }

    @And("I set External Perimeter Gate to {string}")
    public void iSetExternalPerimeterGateTo(String value) throws Throwable {
        new ProtectionBlock(driver).setExternalPerimeterGate(value);
    }

    @And("I set Full Time Live In Caretaker to {string}")
    public void iSetFullTimeLiveInCaretakerTo(String value) throws Throwable {
        new ProtectionBlock(driver).setFullTimeCaretaker(value);
    }

    @And("I set Perimeter Security Protection to {string}")
    public void iSetPerimeterSecurityProtectionTo(String value) throws Throwable {
        new ProtectionBlock(driver).selectPerimeterSecurity(value);
    }

    @And("I set 24 Hour Door Man to {string}")
    public void iSetTwentyFourHourDoormanTo(String value) throws Throwable {
        new ProtectionBlock(driver).setTwentyFourHourDoorMan(value);
    }


}
