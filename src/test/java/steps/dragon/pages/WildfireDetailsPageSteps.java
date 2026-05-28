package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.WildfirePage;
import pages.blocks.WildfireCreditsDebitsBlock;
import pages.blocks.WildfireHazardReportsBlock;
import pages.blocks.WildfireThreatBlock;
import pages.blocks.WildfireZoneProtectionRequirementsBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class WildfireDetailsPageSteps extends BaseTest {

    public WildfireDetailsPageSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the wildfire details page for CC line of business")
    public void iFillWildfireDetailsPageCC() throws Throwable {
        new WildfirePage(driver).fillWildfireDetailsPageCC(data);
    }

    @And("I fill out the wildfire credits debits detail for CC line of business")
    public void iFillWildfireCreditsDebitsDetailCC() throws Throwable {
        new WildfireCreditsDebitsBlock(driver).fillWildfireCreditsDebitsDetailCC(data);
    }

    @And("I fill out the wildfire hazard reports detail for CC line of business")
    public void iFillWildfireHazardReportsDetailCC() throws Throwable {
        new WildfireHazardReportsBlock(driver).fillWildfireHazardReportsDetailCC(data);
    }

    @And("I fill out the wildfire zone protection requirements details for CC line of business")
    public void iFillWildfireZoneProtectionRequirementsDetailsCC() throws Throwable {
        new WildfireZoneProtectionRequirementsBlock(driver).fillWildfireZoneProtectionRequirementsDetailsCC(data);
    }

    @And("I fill out the wildfire threat detail for CC line of business")
    public void iFillWildfireThreatDetailCC() throws Throwable {
        new WildfireThreatBlock(driver).fillWildfireThreatDetailCC(data);
    }

    @And("I set wildfire credits debits combustible deck or attached structure to {string}")
    public void setCombustibleDeckOrAttachedStructure(String value) throws Throwable {
        new WildfireCreditsDebitsBlock(driver).setCombustibleDeckOrAttachedStructure(value);
    }

    @And("I set wildfire credits debits exterior sprinklers to {string}")
    public void setExteriorSprinklers(String value) throws Throwable {
        new WildfireCreditsDebitsBlock(driver).setExteriorSprinklers(value);
    }

    @And("I set wildfire credits debits ember resistant venting to {string}")
    public void setEmberResistantVenting(String value) throws Throwable {
        new WildfireCreditsDebitsBlock(driver).setEmberResistantVenting(value);
    }

    @And("I set wildfire credits debits shelter in place community to {string}")
    public void setShelterInPlaceCommunity(String value) throws Throwable {
        new WildfireCreditsDebitsBlock(driver).setShelterInPlaceCommunity(value);
    }

    @And("I set wildfire credits debits firewise community to {string}")
    public void setFirewiseCommunity(String value) throws Throwable {
        new WildfireCreditsDebitsBlock(driver).setFirewiseCommunity(value);
    }

    @And("I verify that wildfire hazard reports wildfire hazard severity is {string}")
    public void iVerifyWildfireHazardSeverity(String value) {
        new WildfireHazardReportsBlock(driver).verifyWildfireHazardSeverity(value);
    }

    @And("I verify that wildfire hazard reports wildfire risk factor is {string}")
    public void iVerifyWildfireRiskFactor(String value) {
        new WildfireHazardReportsBlock(driver).verifyWildfireRiskFactor(value);
    }

    @And("I verify that wildfire hazard reports wildfire risk score is {string}")
    public void iVerifyWildfireRiskScore(String value) {
        new WildfireHazardReportsBlock(driver).verifyWildfireRiskScore(value);
    }

    @And("I set wildfire hazard reports wildfire hazard severity override to {string}")
    public void setWildfireHazardSeverityOverride(String value) throws Throwable {
        new WildfireHazardReportsBlock(driver).setWildfireHazardSeverityOverride(value);
    }

    @And("I verify that wildfire hazard reports land use density class is {string}")
    public void iVerifyLandUseDensityClass(String value) {
        new WildfireHazardReportsBlock(driver).verifyLandUseDensityClass(value);
    }

    @And("I verify that wildfire hazard reports distance to wild lands is {string}")
    public void iVerifyDistanceToWildLands(String value) {
        new WildfireHazardReportsBlock(driver).verifyDistanceToWildLands(value);
    }

    @And("I set wildfire zone protection requirements is there adequate defensible space around the home to {string}")
    public void setIsThereAdequateDefensibleSpaceAroundTheHome(String value) {
        new WildfireZoneProtectionRequirementsBlock(driver).setIsThereAdequateDefensibleSpaceAroundTheHome(value);
    }

    @And("I set wildfire zone protection requirements openings in tile or metal roofs bird stopped to {string}")
    public void setOpeningsInTileOrMetalRoofsBirdStopped(String value) {
        new WildfireZoneProtectionRequirementsBlock(driver).setOpeningsInTileOrMetalRoofsBirdStopped(value);
    }

    @And("I set wildfire zone protection requirements eave soffits and attic vents fitted with narrow mesh screens to {string}")
    public void setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(String value) {
        new WildfireZoneProtectionRequirementsBlock(driver).setEaveSoffitsAndAtticVentsFittedWithNarrowMeshScreens(value);
    }

    @And("I set wildfire zone protection requirements chimneys fitted with spark arrestors to {string}")
    public void setChimneysFittedWithSparkArrestors(String value) {
        new WildfireZoneProtectionRequirementsBlock(driver).setChimneysFittedWithSparkArrestors(value);
    }

    @And("I set wildfire zone protection requirements firewood or other combustible materials are stored at least 30 feet from the home to {string}")
    public void setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(String value) {
        new WildfireZoneProtectionRequirementsBlock(driver).setFirewoodOrOtherCombustibleMaterialsAreStoredAtLeast30FeetFromTheHome(value);
    }

    @And("I set wildfire zone protection requirements combustible structures or fuel tanks are at least 30 feet from the home and have at least 10 feet around clear combustible materials to {string}")
    public void setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(String value) {
        new WildfireZoneProtectionRequirementsBlock(driver).setCombustibleStructuresOrFuelTanksAreAtLeast30FeetFromTheHomeAndHaveAtLeast10FeetAroundClearCombustibleMaterials(value);
    }

    @And("I set wildfire threat what is the big picture of the brush risk to {string}")
    public void setWhatIsTheBigPictureOfTheBrushRisk(String value) {
        new WildfireThreatBlock(driver).setWhatIsTheBigPictureOfTheBrushRisk(value);
    }

    @And("I set wildfire threat fuel type and direction Of fuel to {string}")
    public void setFuelTypeAndDirectionOfFuel(String value) {
        new WildfireThreatBlock(driver).setFuelTypeAndDirectionOfFuel(value);
    }

    @And("I set wildfire threat road access to {string}")
    public void setRoadAccess(String value) {
        new WildfireThreatBlock(driver).setRoadAccess(value);
    }

    @And("I set wildfire threat slope and topography to {string}")
    public void setSlopeAndTopography(String value) {
        new WildfireThreatBlock(driver).setSlopeAndTopography(value);
    }

    @And("I set wildfire threat what size community is the home located in to {string}")
    public void setWhatSizeCommunityIsTheHomeLocatedIn(String value) {
        new WildfireThreatBlock(driver).setWhatSizeCommunityIsTheHomeLocatedIn(value);
    }

    @And("I set wildfire threat home proximity to brush area to {string}")
    public void setHomeProximityToBrushArea(String value) {
        new WildfireThreatBlock(driver).setHomeProximityToBrushArea(value);
    }

    @And("I set wildfire threat is the home within an extreme mudflow zone to {string}")
    public void setIsTheHomeWithinAnExtremeMudflowZone(String value) {
        new WildfireThreatBlock(driver).setIsTheHomeWithinAnExtremeMudflowZone(value);
    }

    @And("I verify that wildfire threat wildfire threat is {string}")
    public void iVerifyWildfireThreat(String value) {
        new WildfireThreatBlock(driver).verifyWildfireThreat(value);
    }

    @And("I set wildfire threat wildfire threat override to {string}")
    public void setWildfireThreatOverride(String value) {
        new WildfireThreatBlock(driver).setWildfireThreatOverride(value);
    }

    @And("I verify Wildfire Report is pulled")
    public void isWFReportPulled() throws InterruptedException {
        pause(3);
        reportScreenshot("Wildfire Results" + System.currentTimeMillis(), "Wildfire Integration");
        iVerifyWildfireHazardSeverity("NotEmpty");
        iVerifyWildfireRiskFactor("NotEmpty");
        iVerifyWildfireRiskScore("NotEmpty");
    }

    @And("I fill out HO quote wildfire zone protection requirements block")
    public void iFillOutHOWildfireZoneProtectionRequirementsBlock() throws Throwable {
        new WildfireZoneProtectionRequirementsBlock(driver).fillWildfireZoneProtectionRequirementsDetailsHO(data);
    }

    @And("I verify that Guy Carpenter WF is pulled")
    public void iVerifyGuyCarpenterWF() {
        new WildfireThreatBlock(driver).verifyGuyCarpenterWF("NotEmpty");
    }

}