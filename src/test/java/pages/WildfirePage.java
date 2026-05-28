package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WildfirePage extends CommonComponentsAndActions {
    WebDriver driver;
    WildfireZoneProtectionBlock wildfireZoneProtectionBlock;
    WildfireThreatBlock wildfireThreatBlock;
    WildfireCreditsDebitsBlock wildfireCreditsDebitsBlock;
    WildfireZoneProtectionRequirementsBlock wildfireZoneProtectionRequirementsBlock;
    WildfireHazardReportsBlock wildfireHazardReportsBlock;
    WildfireMitigationCreditsBlock wildfireMitigationCreditsBlock;

    public WildfirePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wildfireZoneProtectionBlock = new WildfireZoneProtectionBlock(driver);
        wildfireThreatBlock = new WildfireThreatBlock(driver);
        wildfireCreditsDebitsBlock = new WildfireCreditsDebitsBlock(driver);
        wildfireHazardReportsBlock = new WildfireHazardReportsBlock(driver);
        wildfireZoneProtectionRequirementsBlock = new WildfireZoneProtectionRequirementsBlock(driver);
        wildfireMitigationCreditsBlock = new WildfireMitigationCreditsBlock(driver);
    }

    @FindBy(xpath = "//div[text()='Wildfire Hazard Severity']/../../../..//input")
    WebElement wildfireHazardSeverity;

    @FindBy(xpath = "//div[text()='Wildfire Hazard Severity override']/../../../..//input")
    WebElement wildfireHazardSeverityOverride;

    public void fillWildfireDetailsPage(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            String wildfireSeverityValue = wildfireHazardReportsBlock.getSeverity();
            String overrideSeverityValue = data.get("Wildfire_Override");
            Set<String> highSeverities = new HashSet<>(Arrays.asList("High", "Very High", "Extreme"));
            pause(3000);
            try {
                setAttributeValue(wildfireHazardSeverityOverride, "value", data.get("Wildfire_Override"));
                typeText(wildfireHazardSeverityOverride, data.get("Wildfire_Override"));
                saveChanges();
            } catch (Exception e) {
                pause(5000);
                typeTextEnter(wildfireHazardSeverityOverride, data.get("Wildfire_Override"), "Wildfire Severity Override");
                saveChanges();
            }
            //TODO refactor sometime
            if (hasValue(overrideSeverityValue) && highSeverities.contains(overrideSeverityValue)) {
                pause(3000);
                wildfireZoneProtectionRequirementsBlock.setIsThereAdequateDefensibleSpaceAroundTheHome("No");
                wildfireZoneProtectionRequirementsBlock.setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens("No");
                wildfireZoneProtectionRequirementsBlock.setChimneysFittedWithSparkArrestors("No");
                wildfireZoneProtectionRequirementsBlock.setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome("No");
                wildfireZoneProtectionRequirementsBlock.setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials("No");
                saveChanges();
                pause(2000);
                wildfireThreatBlock.setWhatIsTheBigPictureOfTheBrushRisk("A.");
                wildfireThreatBlock.setFuelTypeAndDirectionOfFuel("A.");
                wildfireThreatBlock.setRoadAccess("A.");
                wildfireThreatBlock.setSlopeAndTopography("A.");
                wildfireThreatBlock.setWhatSizeCommunityIsTheHomeLocatedIn("A.");
                wildfireThreatBlock.setHomeProximityToBrushArea("A.");
                saveChanges();
                pause(2000);
            } else if (highSeverities.contains(wildfireSeverityValue) && !hasValue(overrideSeverityValue)) {
                pause(3000);
                wildfireZoneProtectionRequirementsBlock.setIsThereAdequateDefensibleSpaceAroundTheHome("No");
                wildfireZoneProtectionRequirementsBlock.setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens("No");
                wildfireZoneProtectionRequirementsBlock.setChimneysFittedWithSparkArrestors("No");
                wildfireZoneProtectionRequirementsBlock.setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome("No");
                wildfireZoneProtectionRequirementsBlock.setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials("No");
                saveChanges();
                pause(3000);
                wildfireThreatBlock.setWhatIsTheBigPictureOfTheBrushRisk("A.");
                wildfireThreatBlock.setFuelTypeAndDirectionOfFuel("A.");
                wildfireThreatBlock.setRoadAccess("A.");
                wildfireThreatBlock.setSlopeAndTopography("A.");
                wildfireThreatBlock.setWhatSizeCommunityIsTheHomeLocatedIn("A.");
                wildfireThreatBlock.setHomeProximityToBrushArea("A.");
                saveChanges();
                pause(3000);
            }
        }
    }

    public void fillWildfireDetailsPage(Map<String, String> data, int i) throws Throwable {
//        try {
//            if (wildfireHazardSeverity.getAttribute("value").contains("Very High")) {
//                wildfireZoneProtectionComponent.fillWildfireZoneProtectionInfo(data);
//                wildfireThreatComponent.fillWildfireThreatInfo(data);
//            } else {
//                setAttributeValue(wildfireHazardSeverityOverride, "value", data.get("Wildfire_Override"));
//                typeText(wildfireHazardSeverityOverride, data.get("Wildfire_Override"));
//            }
//        } catch (Exception e) {
//            try {
//                setAttributeValue(wildfireHazardSeverityOverride, "value", data.get("Wildfire_Override"));
//                typeText(wildfireHazardSeverityOverride, data.get("Wildfire_Override"));
//            } catch (Exception ex) {
//
//            }
//        }
        setAttributeValue(wildfireHazardSeverityOverride, "value", data.get("Wildfire_Override_" + i));
        typeText(wildfireHazardSeverityOverride, data.get("Wildfire_Override_" + i));

    }

    public void fillWildfireDetailsPageCC(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.fillWildfireCreditsDebitsDetailCC(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailCC(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsCC(data);
            wildfireThreatBlock.fillWildfireThreatDetailCC(data);
        }
    }

    public void fillWildfireDetailsPageCC_END(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.fillWildfireCreditsDebitsDetailCC_END(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailCC_END(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsCC_END(data);
            wildfireThreatBlock.fillWildfireThreatDetailCC_END(data);
        }
    }

    public void fillWildfireDetailsPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillWildfireDetailsPageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.fillWildfireCreditsDebitsDetailHS(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHS(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHS(data);
            wildfireThreatBlock.fillWildfireThreatDetailHS(data);
        }
    }

    public void fillWildfireDetailsPageHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.fillWildfireCreditsDebitsDetailHS_END(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHS_END(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHS_END(data);
            wildfireThreatBlock.fillWildfireThreatDetailHS_END(data);
        }
    }

    public void fillWildfireDetailsPageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.fillWildfireCreditsDebitsDetailHS_OOS_END(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHS_OOS_END(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHS_OOS_END(data);
            wildfireThreatBlock.fillWildfireThreatDetailHS_OOS_END(data);
        }
    }

    public void fillWildfireDetailsPageHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.fillWildfireCreditsDebitsDetailHS_RNW(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHS_RNW(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHS_RNW(data);
            wildfireThreatBlock.fillWildfireThreatDetailHS_RNW(data);
        }
    }

    public void fillWildfireDetailsPageHO(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.setWildfireCreditsDebitsDetailHO(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHO(data);
            if (data.get("State").equalsIgnoreCase("CA")
                    && !ENV.equalsIgnoreCase("PRE_PROD")
                    && !BROWSER.equalsIgnoreCase("GRID_H"))
                wildfireMitigationCreditsBlock.fillWildfireMitigationCreditsHO(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHO(data);
            wildfireThreatBlock.fillWildfireThreatDetailHO(data);
        }
    }

    public void fillWildfireDetailsPageHO_END(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.setWildfireCreditsDebitsDetailHO_END(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHO_END(data);
            if (data.get("State_END").equalsIgnoreCase("CA"))
                wildfireMitigationCreditsBlock.fillWildfireMitigationCreditsHO_END(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHO_END(data);
            wildfireThreatBlock.fillWildfireThreatDetailHO_END(data);
        }
    }

    public void fillWildfireDetailsPageHO_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.setWildfireCreditsDebitsDetailHO_OOS_END(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHO_OOS_END(data);
            if (data.get("State_OOS_END").equalsIgnoreCase("CA"))
                wildfireMitigationCreditsBlock.fillWildfireMitigationCreditsHO_OOS_END(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHO_OOS_END(data);
            wildfireThreatBlock.fillWildfireThreatDetailHO_OOS_END(data);
        }
    }

    public void fillWildfireDetailsPageHO_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.setWildfireCreditsDebitsDetailHO_RNW(data);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHO_RNW(data);
            if (data.get("State_RNW").equalsIgnoreCase("CA"))
                wildfireMitigationCreditsBlock.fillWildfireMitigationCreditsHO_RNW(data);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHO_RNW(data);
            wildfireThreatBlock.fillWildfireThreatDetailHO_RNW(data);
        }
    }

    public void fillWildfireDetailsPageHO(Map<String, String> data, int i) throws Throwable {
        if (goToPage("Wildfire")) {
            wildfireCreditsDebitsBlock.setWildfireCreditsDebitsDetailHO(data, i);
            wildfireHazardReportsBlock.fillWildfireHazardReportsDetailHO(data, i);
            if (data.get("State").equalsIgnoreCase("CA"))
                wildfireMitigationCreditsBlock.fillWildfireMitigationCreditsHO(data, i);
            wildfireZoneProtectionRequirementsBlock.fillWildfireZoneProtectionRequirementsDetailsHO(data, i);
            wildfireThreatBlock.fillWildfireThreatDetailHO(data, i);
        }
    }


}