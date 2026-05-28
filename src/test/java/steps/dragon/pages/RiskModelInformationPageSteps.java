package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.EarthquakePage;
import pages.RiskModelInformationPage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class RiskModelInformationPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the risk model information page for CC line of business")
    public void iFillRiskModelInformationPageCC() throws Throwable {
        new RiskModelInformationPage(driver).fillRiskModelInformationPageCC(data);
    }

    @And("I fill out the warning details block for CC line of business")
    public void iFillWarningDetailsCC() throws Throwable {
        new WarningBlock(driver).fillWarningDetailsCC(data);
    }

    @And("I fill out the RMS risk model information block for CC line of business")
    public void iFillRMSRiskModelInformationCC() throws Throwable {
        new RMSRiskModelInformationBlock(driver).fillRMSRiskModelInformationCC(data);
    }

    @And("I fill out the RMS rate calculations block for CC line of business")
    public void iFillRMSRateCalculationsCC() throws Throwable {
        new RMSRateCalculationsBlock(driver).fillRMSRateCalculationsCC(data);
    }

    @And("I fill out the RMS other AALs block for CC line of business")
    public void iFillRMSOtherAALsCC() {
        new RMSOtherAALsBlock(driver).fillRMSOtherAALsCC(data);
    }

    @And("I fill out the risk characteristics used in risk model block for CC line of business")
    public void iFillRiskCharacteristicsUsedInRiskModelCC() throws Throwable {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).fillRiskCharacteristicsUsedInRiskModelCC(data);
    }

    @And("I fill out the location coverages  block for CC line of business")
    public void iFillLocationCoveragesCC() throws Throwable {
        new LocationCoveragesBlock(driver).fillLocationCoveragesCC(data);
    }

    @And("I verify that warning block warning message is {string}")
    public void iVerifyWarningMessage(String value) {
        new WarningBlock(driver).verifyWarningMessage(value);
    }

    @And("I verify that RMS risk model information hurricane AAL is {string}")
    public void iVerifyHurricaneAAL(String value) {
        new RMSRiskModelInformationBlock(driver).verifyHurricaneAAL(value);
    }

    @And("I verify that RMS risk model information FR adjustment is {string}")
    public void iVerifyFRAdjustment(String value) {
        new RMSRiskModelInformationBlock(driver).verifyFRAdjustment(value);
    }

    @And("I verify that RMS risk model information DTC is {string}")
    public void iVerifyDTC(String value) {
        new RMSRiskModelInformationBlock(driver).verifyDTC(value);
    }

    @And("I verify that RMS risk model information risk model used is {string}")
    public void iVerifyRiskModelUsed(String value) {
        new RMSRiskModelInformationBlock(driver).verifyRiskModelUsed(value);
    }

    @And("I verify that RMS risk model information date pulled is {string}")
    public void iVerifyDatePulled(String value) {
        new RMSRiskModelInformationBlock(driver).verifyDatePulled(value);
    }

    @And("I verify that RMS rate calculations total insured value system is {string}")
    public void iVerifyTotalInsuredValueSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalInsuredValueSystem(value);
    }

    @And("I verify that RMS rate calculations total insured value modification is {string}")
    public void iVerifyTotalInsuredValueModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalInsuredValueModification(value);
    }

    @And("I verify that RMS rate calculations total insured value final is {string}")
    public void iVerifyTotalInsuredValueFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalInsuredValueFinal(value);
    }

    @And("I verify that RMS rate calculations total insured value ROL is {string}")
    public void iVerifyTotalInsuredValueROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalInsuredValueROL(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio unadjusted system is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioUnadjustedSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioUnadjustedSystem(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio unadjusted modification is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioUnadjustedModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioUnadjustedModification(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio unadjusted final is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioUnadjustedFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioUnadjustedFinal(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio unadjusted ROL is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioUnadjustedROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioUnadjustedROL(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio FR adjusted system is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioFRAdjustedSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio FR adjusted modification is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioFRAdjustedModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioFRAdjustedModification(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio FR adjusted final is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioFRAdjustedFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(value);
    }

    @And("I verify that RMS rate calculations wind premium to combined AAL ratio FR adjusted ROL is {string}")
    public void iVerifyWindPremiumToCombinedAALRatioFRAdjustedROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumToCombinedAALRatioFRAdjustedROL(value);
    }

    @And("I verify that RMS rate calculations wind premium system is {string}")
    public void iVerifyWindPremiumSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumSystem(value);
    }

    @And("I verify that RMS rate calculations wind premium modification is {string}")
    public void iVerifyWindPremiumModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumModification(value);
    }

    @And("I verify that RMS rate calculations wind premium final is {string}")
    public void iVerifyWindPremiumFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumFinal(value);
    }

    @And("I verify that RMS rate calculations wind premium ROL is {string}")
    public void iVerifyWindPremiumROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyWindPremiumROL(value);
    }

    @And("I verify that RMS rate calculations non wind premium system is {string}")
    public void iVerifyNonWindPremiumSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyNonWindPremiumSystem(value);
    }

    @And("I verify that RMS rate calculations non wind premium modification is {string}")
    public void iVerifyNonWindPremiumModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyNonWindPremiumModification(value);
    }

    @And("I verify that RMS rate calculations non wind premium final is {string}")
    public void iVerifyNonWindPremiumFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyNonWindPremiumFinal(value);
    }

    @And("I verify that RMS rate calculations non wind premium ROL is {string}")
    public void iVerifyNonWindPremiumROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyNonWindPremiumROL(value);
    }

    @And("I verify that RMS rate calculations wildfire premium system is {string}")
    public void iVerifyWildfirePremiumSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyWildfirePremiumSystem(value);
    }

    @And("I verify that RMS rate calculations wildfire premium modification is {string}")
    public void iVerifyWildfirePremiumModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyWildfirePremiumModification(value);
    }

    @And("I verify that RMS rate calculations wildfire premium final is {string}")
    public void iVerifyWildfirePremiumFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyWildfirePremiumFinal(value);
    }

    @And("I verify that RMS rate calculations wildfire premium ROL is {string}")
    public void iVerifyWildfirePremiumROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyWildfirePremiumROL(value);
    }

    @And("I verify that RMS rate calculations base location premium system is {string}")
    public void iVerifyBaseLocationPremiumSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyBaseLocationPremiumSystem(value);
    }

    @And("I verify that RMS rate calculations base location premium modification is {string}")
    public void iVerifyBaseLocationPremiumModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyBaseLocationPremiumModification(value);
    }

    @And("I verify that RMS rate calculations base location premium Final is {string}")
    public void iVerifyBaseLocationPremiumFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyBaseLocationPremiumFinal(value);
    }

    @And("I verify that RMS rate calculations base location premium ROL is {string}")
    public void iVerifyBaseLocationPremiumROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyBaseLocationPremiumROL(value);
    }

    @And("I verify that RMS rate calculations total premium label text is {string}")
    public void iVerifyTotalPremiumROLLabel(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalPremiumROLLabel(value);
    }

    @And("I verify that RMS rate calculations liability premium system is {string}")
    public void iVerifyLiabilityPremiumSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyLiabilityPremiumSystem(value);
    }

    @And("I verify that RMS rate calculations liability premium modification is {string}")
    public void iVerifyLiabilityPremiumModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyLiabilityPremiumModification(value);
    }

    @And("I verify that RMS rate calculations liability premium Final is {string}")
    public void iVerifyLiabilityPremiumFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyLiabilityPremiumFinal(value);
    }

    @And("I verify that RMS rate calculations liability premium ROL is {string}")
    public void iVerifyLiabilityPremiumROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyLiabilityPremiumROL(value);
    }

    @And("I verify that RMS rate calculations optional coverages premium system is {string}")
    public void iVerifyOptionalCoveragesPremiumSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyOptionalCoveragesPremiumSystem(value);
    }

    @And("I verify that RMS rate calculations optional coverages premium modification is {string}")
    public void iVerifyOptionalCoveragesPremiumModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyOptionalCoveragesPremiumModification(value);
    }

    @And("I verify that RMS rate calculations optional coverages premium final is {string}")
    public void iVerifyOptionalCoveragesPremiumFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyOptionalCoveragesPremiumFinal(value);
    }

    @And("I verify that RMS rate calculations optional coverages premium ROL is {string}")
    public void iVerifyOptionalCoveragesPremiumROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyOptionalCoveragesPremiumROL(value);
    }

    @And("I verify that RMS rate calculations collection premium modifications system is {string}")
    public void iVerifyCollectionPremiumModificationsSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyCollectionPremiumModificationsSystem(value);
    }

    @And("I verify that RMS rate calculations collection premium modifications modification is {string}")
    public void iVerifyCollectionPremiumModificationsModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyCollectionPremiumModificationsModification(value);
    }

    @And("I verify that RMS rate calculations collection premium modifications final is {string}")
    public void iVerifyCollectionPremiumModificationsFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyCollectionPremiumModificationsFinal(value);
    }

    @And("I verify that RMS rate calculations collection premium modifications ROL is {string}")
    public void iVerifyCollectionPremiumModificationsROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyCollectionPremiumModificationsROL(value);
    }

    @And("I verify that RMS rate calculations total premium system is {string}")
    public void iVerifyTotalPremiumSystem(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalPremiumSystem(value);
    }

    @And("I verify that RMS rate calculations total premium modification is {string}")
    public void iVerifyTotalPremiumModification(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalPremiumModification(value);
    }

    @And("I verify that RMS rate calculations total premium final is {string}")
    public void iVerifyTotalPremiumFinal(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalPremiumFinal(value);
    }

    @And("I verify that RMS rate calculations total premium ROL is {string}")
    public void iVerifyTotalPremiumROL(String value) {
        new RMSRateCalculationsBlock(driver).verifyTotalPremiumROL(value);
    }

    @And("I verify that RMS other AALs next higher wind deductible is {string}")
    public void iVerifyNextHigherWindDeductible(String value) {
        new RMSOtherAALsBlock(driver).verifyNextHigherWindDeductible(value);
    }

    @And("I verify that RMS other AALs next higher wind deductible 2 is {string}")
    public void iVerifyNextHigherWindDeductible_2(String value) {
        new RMSOtherAALsBlock(driver).verifyNextHigherWindDeductible_2(value);
    }

    @And("I verify that RMS other AALs flood AAL is {string}")
    public void iVerifyFloodAAL(String value) {
        new RMSOtherAALsBlock(driver).verifyFloodAAL(value);
    }

    @And("I verify that Risk characteristics used in risk model year built is {string}")
    public void iVerifyYearBuilt(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyYearBuilt(value);
    }

    @And("I verify that Risk characteristics used in risk model construction type is {string}")
    public void iVerifyConstructionType(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyConstructionType(value);
    }

    @And("I verify that Risk characteristics used in risk model construction type RMS code is {string}")
    public void iVerifyConstructionTypeRMSCode(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyConstructionTypeRMSCode(value);
    }

    @And("I verify that Risk characteristics used in risk model sheath attach is {string}")
    public void iVerifySheathAttach(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifySheathAttach(value);
    }

    @And("I verify that Risk characteristics used in risk model sheath attach RMS code is {string}")
    public void iVerifySheathAttachRMSCode(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifySheathAttachRMSCode(value);
    }

    @And("I verify that Risk characteristics used in risk model number of stories is {string}")
    public void iVerifyNumberOfStories(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyNumberOfStories(value);
    }

    @And("I verify that Risk characteristics used in risk  model roof shape is {string}")
    public void iVerifyRoofShape(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyRoofShape(value);
    }

    @And("I verify that Risk characteristics used in risk model roof shape RMS code is {string}")
    public void iVerifyRoofShapeRMSCode(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyRoofShapeRMSCode(value);
    }

    @And("I verify that Risk characteristics used in risk model opening protection is {string}")
    public void iVerifyOpeningProtection(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyOpeningProtection(value);
    }

    @And("I verify that Risk characteristics used in risk model opening protection RMS code is {string}")
    public void iVerifyOpeningProtectionRMSCode(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyOpeningProtectionRMSCode(value);
    }

    @And("I verify that Risk characteristics used in risk model square foot is {string}")
    public void iVerifySquareFoot(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifySquareFoot(value);
    }

    @And("I verify that Risk characteristics used in risk model roof anchors is {string}")
    public void iVerifyRoofAnchors(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyRoofAnchors(value);
    }

    @And("I verify that Risk characteristics used in risk model roof anchors RMS code is {string}")
    public void iVerifyRoofAnchorsRMSCode(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyRoofAnchorsRMSCode(value);
    }

    @And("I verify that Risk characteristics used in risk model occupancy RMS code is {string}")
    public void iVerifyOccupancyRMSCode(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyOccupancyRMSCode(value);
    }

    @And("I verify that Risk characteristics used in risk model roof cover is {string}")
    public void iVerifyRoofCover(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyRoofCover(value);
    }

    @And("I verify that Risk characteristics used in risk model roof cover RMS code is {string}")
    public void iVerifyRoofCoverRMSCode(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyRoofCoverRMSCode(value);
    }

    @And("I verify that Risk characteristics used in risk model age of roof is {string}")
    public void iVerifyAgeOfRoof(String value) {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).verifyAgeOfRoof(value);
    }

    @And("I verify that location coverages residence type is {string}")
    public void iVerifyResidenceType(String value) {
        new LocationCoveragesBlock(driver).verifyResidenceType(value);
    }

    @And("I verify that location coverages dwelling is {string}")
    public void iVerifyDwelling(String value) {
        new LocationCoveragesBlock(driver).verifyDwelling(value);
    }

    @And("I verify that location coverages other structures is {string}")
    public void iVerifyOtherStructures(String value) {
        new LocationCoveragesBlock(driver).verifyOtherStructures(value);
    }

    @And("I verify that location coverages contents is {string}")
    public void iVerifyContents(String value) {
        new LocationCoveragesBlock(driver).verifyContents(value);
    }

    @And("I verify that location coverages loss of use is {string}")
    public void iVerifyLossOfUse(String value) {
        new LocationCoveragesBlock(driver).verifyLossOfUse(value);
    }

    @And("I verify that location coverages All perils deductible is {string}")
    public void iVerifyAllPerilsDeductible(String value) {
        new LocationCoveragesBlock(driver).verifyAllPerilsDeductible(value);
    }

    @And("I verify that location coverages hurricane deductible is {string}")
    public void iVerifyHurricaneDeductible(String value) {
        new LocationCoveragesBlock(driver).verifyHurricaneDeductible(value);
    }

    @Then("I verify that manuscript endorsement premium final is {string}")
    public void iVerifyThatManuscriptEndorsementPremiumFinalIs(String value) {
        new RMSRateCalculationsBlock(driver).verifyManuscriptEndorsementPremiumFinal(value);
        new CommonComponentsAndActions(driver).reportScreenshot("ManuscriptEndorsementPremiumFinal", "ManuscriptEndorsementPremiumFinal");
    }

    @Then("I verify that non wind premium rol is {string}")
    public void iVerifyThatNonWindPremiumRolIs(String value) {
        new RMSRateCalculationsBlock(driver).verifyNonWindPremiumROL(value);
        new CommonComponentsAndActions(driver).reportScreenshot("NonWindPremiumRol", "NonWindPremiumRol");
    }

    @And("I insert Risk Model {string} information into {string} data")
    public void insertRiskModelUsedIntoData(String riskModel, String trx) {
        new RiskModelInformationPage(driver).insertRiskModelUsedIntoData(riskModel, trx);
    }

    @And("I read Risk Model {string} information from {string} trx data and check if it's {string}")
    public void readAndVerifyRiskModelUsedFromData(String riskModel, String trx, String option) throws Throwable {
        new RiskModelInformationPage(driver).verifyRiskModelUsedFromData(riskModel, trx, option);
    }

}