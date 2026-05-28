package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.OperatorsAndVehiclePage;
import pages.OptionalCoveragesPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class OptionalCoveragesPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the optional coverages page for CC line of business")
    public void iFillOutOptionalCoveragesPageForCC() throws Throwable {
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageCC(data);
    }

    @And("I fill out the optional coverages details block for CC line of business")
    public void iFillOutOptionalCoveragesDetailsBlock() throws Throwable {
        new OptionalCoverageBlock(driver).fillOptionalCoveragesDetailsCC(data);
    }

    @And("I fill out the optional coverages exclusions details block for CC line of business")
    public void iFillOutOptionalCoveragesExclusionsDetailsBlock() throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).fillOptionalCoveragesExclusionsDetailsCC(data);
    }

    @And("I verify that the coverage override validation message is displayed")
    public void iVerifyCoverageOverrideValidationMessage() throws Throwable {
        new OptionalCoveragesPage(driver).verifyCoverageOverrideValidationMessage(data);
    }

    @And("I set the personal liability coverage to {string}")
    public void setPersonalLiabilityCoverage(String liabilityCoverage) throws Throwable {
        new OptionalCoverageBlock(driver).setPersonalLiabilityCoverage(liabilityCoverage);
    }

    @And("I set the soft costs coverage to {string} and override to {string}")
    public void setSoftCostsCoverage(String costsCoverage, String override) throws Throwable {
        new OptionalCoverageBlock(driver).setSoftCostsCoverage(costsCoverage, override);
    }

    @And("I set the earthquake extension to {string}")
    public void setEarthquakeExtension(String extension) throws Throwable {
        new OptionalCoverageBlock(driver).setEarthquakeExtension(extension);
    }

    @And("I set the ensuing fungi increase to {string}")
    public void setEnsuingFungiIncrease(String fungiIncrease) {
        new OptionalCoverageBlock(driver).setEnsuingFungiIncrease(fungiIncrease);
    }

    @And("I set the scaffolding and other construction forms to {string}")
    public void setScaffoldingAndOtherConstructionForms(String constructionForms) {
        new OptionalCoverageBlock(driver).setScaffoldingAndOtherConstructionForms(constructionForms);
    }

    @And("I set the valuable papers and records coverage to {string}")
    public void setValuablePapersAndRecordsCoverage(String recordsCoverage) {
        new OptionalCoverageBlock(driver).setValuablePapersAndRecordsCoverage(recordsCoverage);
    }


    @And("I set the property in transit to {string}")
    public void setPropertyInTransit(String propertyInTransit) {
        new OptionalCoverageBlock(driver).setPropertyInTransit(propertyInTransit);
    }

    @And("I set the property at a temporary storage location to {string}")
    public void setPropertyAtATemporaryStorageLocation(String storageLocation) {
        new OptionalCoverageBlock(driver).setPropertyAtATemporaryStorageLocation(storageLocation);
    }

    @And("I set the animal liability exclusion to {string}")
    public void setAnimalLiabilityExclusion(String liabilityExclusion) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setAnimalLiabilityExclusion(liabilityExclusion);
    }

    @And("I set the backup sewer or drain increase to {string}")
    public void setBackupSewerOrDrainIncrease(String drainIncrease) throws Throwable {
        new OptionalCoverageBlock(driver).setBackupSewerOrDrainIncrease(drainIncrease);
    }

    @And("I set the broadened liability coverage to {string}")
    public void setBroadenedLiabilityCoverage(String liabilityCoverage) throws Throwable {
        if (hasValue(liabilityCoverage))
            new OptionalCoveragesExclusionsBlock(driver).setBroadenedLiabilityCoverage(liabilityCoverage);
    }

    @And("I set the broadened liability coverage libel slander excluded to {string}")
    public void setBroadenedLiabilityCoverageLibelSlanderExcluded(String slanderExcluded) throws Throwable {
        if (hasValue(slanderExcluded))
            new OptionalCoveragesExclusionsBlock(driver).setBroadenedLiabilityCoverageLibelSlanderExcluded(slanderExcluded);
    }

    @And("I set the business exclusion data to {string}")
    public void setBusinessExclusionData(String exclusionData) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setBusinessExclusionData(exclusionData);
    }

    @And("I set the cosmetic marring exclusion to {string}")
    public void setCosmeticMarringExclusion(String marringExclusion) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setCosmeticMarringExclusion(marringExclusion);
    }

    @And("I set the exterior insulation and finish systems exclusion to {string}")
    public void setExteriorInsulationAndFinishSystemsExclusion(String systemsExclusion) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setExteriorInsulationAndFinishSystemsExclusion(systemsExclusion);
    }


    @And("I set the minimum earned premium to {string} and override to {string}")
    public void setMinimumEarnedPremium(String earnedPremium, String override) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setMinimumEarnedPremium(earnedPremium, override);
    }

    @And("I set the named structures exclusion to {string} and excluded to {string}")
    public void setNamedStructuresExclusion(String structuresExclusion, String excluded) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setNamedStructuresExclusion(structuresExclusion, excluded);
    }

    @And("I set the screen enclosure exclusion to {string}")
    public void setScreenEnclosureExclusion(String enclosureExclusion) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setScreenEnclosureExclusion(enclosureExclusion);
    }

    @And("I set the swimming pool liability exclusion to {string}")
    public void setSwimmingPoolLiabilityExclusion(String poolLiabilityExclusion) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setSwimmingPoolLiabilityExclusion(poolLiabilityExclusion);
    }

    @And("I set the special water damage deductible to {string}")
    public void setSpecialWaterDamageDeductible(String yesNo) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setSpecialWaterDamageDeductible(yesNo);
    }

    @And("I set the special water damage coverage type to {string}")
    public void setSpecialWaterDamageCoverageType(String type) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setSpecialWaterDamageCoverageType(type);
    }

    @And("I set the special water damage deductible value to {string}")
    public void setSpecialWaterDamageDeductibleValue(String yesNo) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setSpecialWaterDamageDeductibleValue(yesNo);
    }

    @And("I set the special water damage deductible uw override to {string}")
    public void setSpecialWaterDamageDeductibleUWOverride(String override) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setSpecialWaterDamageDeductibleUWOverride(override);
    }

    @And("I set the roof reconstruction cost schedule to {string} and override to {string}")
    public void setRoofReconstructionCostSchedule(String costSchedule, String override) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setRoofReconstructionCostSchedule(costSchedule, override);
    }

    @And("I set the roof exclusion to {string} and override to {string}")
    public void setRoofExclusion(String roofExclusion, String override) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setRoofExclusion(roofExclusion, override);
    }

    @And("I set Primary Flood Dec Page Received to {string}")
    public void setPrimaryFloodDecPageReceived(String value) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setPrimaryFloodDecPageReceived(value);
    }

    @And("I set Include Excess Flood Coverage to {string}")
    public void setExcessFloodCoverage(String value) throws Throwable {
        new OptionalCoverageExcessFloodBlock(driver).chooseIncludeExcessFlood(value);
    }

    @And("I click earthquake extension deductible dropdown")
    public void clickEQExtensionDeductibleDropdown() {
        new OptionalCoverageBlock(driver).clickEarthquakeExtensionDeductibleDropdown();
    }

    @And("I set earthquake extension deductible to {string}")
    public void setEQExtensionDeductible(String value) {
        new OptionalCoverageBlock(driver).setEarthquakeExtensionDeductible(value);
    }

    @And("I set earthquake extension radio button to {string}")
    public void setEQExtensionRadioButton(String value) throws Throwable {
        new OptionalCoverageBlock(driver).setEarthquakeExtensionRadioButton(value);
    }

    @And("I set earthquake loss assessment extension to {string}")
    public void setEQLossAssessmentExtension(String value) throws Throwable {
        new OptionalCoverageBlock(driver).setEarthquakeLossAssessmentExtension(value);
    }

    @And("I set earthquake loss assessment extension limit to {string}")
    public void setEQLossAssessmentExtensionLimit(String value) throws Throwable {
        new OptionalCoverageBlock(driver).setEarthquakeLossAssessmentExtensionLimit(value);
    }

    @And("I set Replacement Cost Coverage to {string}")
    public void setReplacementCostCoverageTo(String value) throws Throwable {
        new OptionalCoveragesExclusionsBlock(driver).setReplacementCostCoverage(value);
    }

    @And("I set Fire And Lighting Extension for Landscaping to {string}")
    public void setFireAndLightingExtensionForLandscapingTo(String value) throws Throwable {
        new OptionalCoverageBlock(driver).setFireAndLightningExtensionForLandscaping(value);
    }

    @And("I set driver {string} exclude checkbox to {string}")
    public void setExcludeDriverCheckbox(String driverNo, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver). setAdditionalDriverExclude(value, Integer.parseInt(driverNo));

    }
}