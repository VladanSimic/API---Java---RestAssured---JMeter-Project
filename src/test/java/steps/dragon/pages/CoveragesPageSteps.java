package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.CoveragesPage;
import pages.blocks.OptionalCoverageBlock;
import pages.blocks.SelectCoveragesBlock;
import pages.blocks.VehicleDetailsBlock;
import pages.blocks.VehiclesBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class CoveragesPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote coverages page")
    public void iFillOutCoveragesPagePA() throws Throwable {
        new CoveragesPage(driver).fillCoveragesPagePA(data);
    }

    @And("I fill out PA endorsement coverages page")
    public void iFillOutCoveragesPagePA_END() throws Throwable {
        new CoveragesPage(driver).fillCoveragesPagePA_END(data);
    }

    @And("I fill out PA renewal coverages page")
    public void iFillOutCoveragesPagePA_RNW() throws Throwable {
        new CoveragesPage(driver).fillCoveragesPagePA_RNW(data);
    }

    @And("I fill out PA oos endorsement coverages page")
    public void iFillOutCoveragesPagePA_OOS_END() throws Throwable {
        new CoveragesPage(driver).fillCoveragesPagePA_OOS_END(data);
    }

    @And("I fill out PA quote vehicles block")
    public void iFillOutVehiclesBlockPA() throws Throwable {
        new VehiclesBlock(driver).fillVehicleDetailsPA(data);
    }

    @And("I fill out PA quote select coverages block")
    public void iFillOutSelectCoveragesBlockPA() throws Throwable {
        new SelectCoveragesBlock(driver).fillCoveragesDetailsPA(data);
    }

    @And("I fill out PA endorsement vehicles block")
    public void iFillOutVehiclesBlockPA_END() throws Throwable {
        new VehiclesBlock(driver).fillVehicleDetailsPA_END(data);
    }

    @And("I fill out PA endorsement select coverages block")
    public void iFillOutSelectCoveragesBlockPA_END() throws Throwable {
        new SelectCoveragesBlock(driver).fillCoveragesDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    //vehicles block steps - START
    @And("I set vehicle {int} coll deductible to {string}")
    public void iSetVehicleCollDeductible(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setCOLLDeductible(value, index);
    }

    @And("I set vehicle {int} options to {string}")
    public void iSetVehicleOptions(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setOptions(value, index);
    }

    @And("I set vehicle {int} comp deductible to {string}")
    public void iSetVehicleCOMPDeductible(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setCOMPDeductible(value, index);
    }

    @And("I set vehicle {int} medical payment to {string}")
    public void iSetVehicleMedicalPayment(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setMedicalPayment(value, index);
    }

    @And("I set vehicle {int} coll option to {string}")
    public void iSetVehicleCOLLOption(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setCOLLOption(value, index);
    }

    @And("I set vehicle {int} waiver of coll ded to {string}")
    public void iSetVehicleWaiverOfCOLLDed(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setWaiverOfCOLLDed(value, index);
    }

    @And("I set vehicle {int} otc deductible to {string}")
    public void iSetVehicleOTCDeductible(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setOTCDeductible(value, index);
    }

    @And("I set vehicle {int} umpd deductible to {string}")
    public void iSetVehicleUMPDDeductible(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setUMPDDeductible(value, index);
    }

    @And("I set vehicle {int} towing and labor to {string}")
    public void iSetVehicleTowingAndLabor(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setTowingAndLabor(value, index);
    }
    //vehicles block steps - END

    //select coverages block steps - START
    @And("I set select coverages split limits to {string}")
    public void iSetCoveragesSplitLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setSplitLimits(value);
    }

    @And("I set select coverages combined or split limits to {string}")
    public void iSetCoveragesCombinedOrSplitLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCombinedOrSplitLimits(value);
    }

    @And("I set select coverages work loss benefit to {string}")
    public void iSetCoveragesWorkLossBenefit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setWorkLossBenefit(value);
    }

    @And("I set select coverages med pay limits to {string}")
    public void iSetCoveragesMedPayLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setMedPayLimits(value);
    }

    @And("I set select coverages accidental death benefit to {string}")
    public void iSetCoveragesAccidentalDeathBenefit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAccidentalDeathBenefit(value);
    }

    @And("I set select coverages csl Limits to {string}")
    public void iSetCoveragesCSLLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCSLLimits(value);
    }

    @And("I set select coverages umcsl limit to {string}")
    public void iSetCoveragesUMCSLLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMCSLLimit(value);
    }

    @And("I set select coverages bi limits to {string}")
    public void iSetCoveragesBILimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setBILimits(value);
    }

    @And("I set select coverages umbi limit to {string}")
    public void iSetCoveragesUMBILimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBILimit(value);
    }

    @And("I set select coverages umpd to {string}")
    public void iSetCoveragesUMPD(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMPD(value);
    }

    @And("I set select coverages basic pip options to {string}")
    public void iSetCoveragesBasicPIPOptions(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setBasicPIPOptions(value);
    }

    @And("I set select coverages apip options to {string}")
    public void iSetCoveragesAPIPOptions(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAPIPOptions(value);
    }

    @And("I set select coverages combined pip stacking to {string}")
    public void iSetCoveragesCombinedPIPStacking(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCombinedPIPStacking(value);
    }

    @And("I set select coverages umbi uimbi csl limit to {string}")
    public void iSetCoveragesUMBI_UIMBICSLLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBI_UIMBICSLLimit(value);
    }

    @And("I set select coverages umbi uimbi limit to {string}")
    public void iSetCoveragesUMBIUIMBILimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBIUIMBILimit(value);
    }

    @And("I set select coverages umbi csl limit to {string}")
    public void iSetCoveragesUMBICSLLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBICSLLimit(value);
    }

    @And("I set select coverages uimbi csl limit to {string}")
    public void iSetCoveragesUIMBICSLLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUIMBICSLLimit(value);
    }

    @And("I set select coverages uimbi limit to {string}")
    public void iSetCoveragesUIMBILimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUIMBILimit(value);
    }

    @And("I set select coverages coordination of benefits to {string}")
    public void iSetCoveragesCoordinationOfBenefits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCoordinationOfBenefits(value);
    }

    @And("I set select coverages apip total additional limits to {string}")
    public void iSetCoveragesAPIPTotalAdditionalLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAPIPTotalAdditionalLimits(value);
    }

    @And("I set select coverages motor medical Payments to {string}")
    public void iSetCoveragesMotorMedicalPayments(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setMotorMedicalPayments(value);
    }

    @And("I set select coverages uim csl limits to {string}")
    public void iSetCoveragesUIMCSLLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUIMCSLLimits(value);
    }

    @And("I set select coverages um limit to {string}")
    public void iSetCoveragesUMLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMLimit(value);
    }

    @And("I set select coverages uim limit to {string}")
    public void iSetCoveragesUIMLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUIMLimit(value);
    }

    @And("I set select coverages umbi uimbi csl to {string}")
    public void iSetCoveragesUMBIUIMBICSL(String value) throws Throwable {
        new SelectCoveragesBlock(driver).satUMBIUIMBICSL(value);
    }

    @And("I set select coverages umbi uimbi to {string}")
    public void iSetCoveragesUMBIUIMBI(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBIUIMBI(value);
    }

    @And("I set select coverages apip medical rehab funeral work service limit to {string}")
    public void iSetCoveragesAPIPMedicalRehabFuneralWorkServiceLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAPIPMedicalRehabFuneralWorkServiceLimit(value);
    }

    @And("I set select coverages pip rejection to {string}")
    public void iSetCoveragesPIPRejection(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIPRejection(value);
    }

    @And("I set select coverages umbi to {string}")
    public void iSetCoveragesUMBI(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBI(value);
    }

    @And("I set select coverages umuim csl limit to {string}")
    public void iSetCoveragesUMUIMCSLLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMUIMCSLLimit(value);
    }

    @And("I set select coverages um uim limit to {string}")
    public void iSetCoveragesUM_UIMLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUM_UIMLimit(value);
    }

    @And("I set select coverages tort to {string}")
    public void iSetCoveragesTort(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setTort(value);
    }

    @And("I set select coverages pip deductible to {string}")
    public void iSetCoveragesPIPDeductible(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIPDeductible(value);
    }

    @And("I set select coverages apip total of all added pip benefits to {string}")
    public void iSetCoveragesAPIPTotalOfAllAddedPIPBenefits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAPIPTotalOfAllAddedPIPBenefits(value);
    }

    @And("I set select coverages pip limits medical work funeral to {string}")
    public void iSetCoveragesPIPLimitsMedicalWorkFuneral(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIPLimitsMedicalWorkFuneral(value);
    }

    @And("I set select coverages umuim bi limit to {string}")
    public void iSetCoveragesUMUIM_BILimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMUIM_BILimit(value);
    }

    @And("I set select coverages umbi pd to {string}")
    public void iSetCoveragesUMBI_PD(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBI_PD(value);
    }

    @And("I set select coverages um uimbi to {string}")
    public void iSetCoveragesUMUIMBI(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMUIMBI(value);
    }

    @And("I set select coverages basic first party benefits coverage to {string}")
    public void iSetCoveragesBasicFirstPartyBenefitsCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setBasicFirstPartyBenefitsCoverage(value);
    }

    @And("I set select coverages added first party benefits coverage to {string}")
    public void iSetCoveragesAddedFirstPartyBenefitsCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAddedFirstPartyBenefitsCoverage(value);
    }

    @And("I set select coverages medical expense to {string}")
    public void iSetCoveragesMedicalExpense(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setMedicalExpense(value);
    }

    @And("I set select coverages work loss to {string}")
    public void iSetCoveragesWorkLoss(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setWorkLoss(value);
    }

    @And("I set select coverages funeral expense to {string}")
    public void iSetCoveragesFuneralExpense(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setFuneralExpense(value);
    }

    @And("I set select coverages combination first party benefits coverage to {string}")
    public void iSetCoveragesCombinationFirstPartyBenefitsCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCombinationFirstPartyBenefitsCoverage(value);
    }

    @And("I set select coverages extraordinary medical benefits coverage to {string}")
    public void iSetCoveragesExtraordinaryMedicalBenefitsCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setExtraordinaryMedicalBenefitsCoverage(value);
    }

    @And("I set select coverages do you wish to purchase limited tort or full tort to {string}")
    public void iSetCoveragesDoYouWishToPurchaseLimitedTortOrFullTort(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setDoYouWishToPurchaseLimitedTortOrFullTort(value);
    }

    @And("I set select coverages auto death benefits and disability coverages to {string}")
    public void iSetCoveragesAutoDeathBenefitsAndDisabilityCoverages(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAutoDeathBenefitsAndDisabilityCoverages(value);
    }

    @And("I set select coverages csl um to {string}")
    public void iSetCoveragesCSLUM(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCSLUM(value);
    }

    @And("I set select coverages csl umbi to {string}")
    public void iSetCoveragesCSLUMBI(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCSLUMBI(value);
    }

    @And("I set select coverages apip limits to {string}")
    public void iSetCoveragesAPIPLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAPIPLimits(value);
    }

    @And("I set select coverages pip exclusion of income benefit to {string}")
    public void iSetCoveragesPIPExclusionOfIncomeBenefit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIPExclusionOfIncomeBenefit(value);
    }

    @And("I set select coverages uim pd to {string}")
    public void iSetCoveragesUIMPD(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUIMPD(value);
    }

    @And("I set select coverages check here To apply csl limits to {string}")
    public void iSetCoveragesCheckHereToApplyCSLLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCheckHereToApplyCSLLimits(value);
    }

    @And("I set select coverages check here to apply csl umbi limits to {string}")
    public void iSetCoveragesCheckHereToApplyCSLUMBILimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCheckHereToApplyCSLUMBILimits(value);
    }

    @And("I set select coverages check here to apply split bi limits to {string}")
    public void iSetCoveragesCheckHereToApplySplitBILimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCheckHereToApplySplitBILimits(value);
    }

    @And("I set select coverages check Here to apply split umbi limits to {string}")
    public void iSetCoveragesCheckHereToApplySplitUMBILimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCheckHereToApplySplitUMBILimits(value);
    }

    @And("I set select coverages um uim csl coverage selection to {string} and limits to {string}")
    public void iSetCoveragesUMUIMCSLCoverageSelection(String selection, String limits) {
        new SelectCoveragesBlock(driver).setUMUIMCSLCoverageSelection(selection, limits);
    }

    @And("I set select coverages added personal injury protection to {string}")
    public void iSetCoveragesAddedPersonalInjuryProtection(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAddedPersonalInjuryProtection(value);
    }

    @And("I set select coverages optional benefits coverage to {string}")
    public void iSetCoveragesOptionalBenefitsCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setOptionalBenefitsCoverage(value);
    }

    @And("I set select coverages pip to {string}")
    public void iSetCoveragesPIP(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIP(value);
    }

    @And("I set select coverages csl uimbi to {string}")
    public void iSetCoveragesCSLUIMBI(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCSLUIMBI(value);
    }

    @And("I set select coverages csl umbi uimbi Options to {string}")
    public void iSetCoveragesCSLUMBIUIMBIOptions(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setCSLUMBIUIMBIOptions(value);
    }

    @And("I set select coverages economic loss um coverage to {string}")
    public void iSetCoveragesEconomicLossUMCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setEconomicLossUMCoverage(value);
    }

    @And("I set select coverages uimbi to {string}")
    public void iSetCoveragesUIMBI(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUIMBI(value);
    }

    @And("I set select coverages pip exclusion of benefits to {string}")
    public void iSetCoveragesPIPExclusionOfBenefits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIPExclusionOfBenefits(value);
    }

    @And("I set select coverages pure enhancement endorsement to {string}")
    public void iSetCoveragesPUREEnhancementEndorsement(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPUREEnhancementEndorsement(value);
    }

    @And("I set select coverages medical expense benefits as secondary coverage to {string}")
    public void iSetCoveragesMedicalExpenseBenefitsAsSecondaryCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setMedicalExpenseBenefitsAsSecondaryCoverage(value);
    }

    @And("I set select coverages apip income continuation to {string}")
    public void iSetCoveragesAPIPIncomeContinuation(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAPIPIncomeContinuation(value);
    }

    @And("I set select coverages extended medical expense limits to {string}")
    public void iSetCoveragesExtendedMedicalExpenseLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setExtendedMedicalExpenseLimits(value);
    }

    @And("I set select coverages deletion of benefits other than medical expense benefits to {string}")
    public void iSetCoveragesDeletionOfBenefitsOtherThanMedicalExpenseBenefits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setDeletionOfBenefitsOtherThanMedicalExpenseBenefits(value);
    }

    @And("I set select coverages no fault medical expense elimination to {string}")
    public void iSetCoveragesNoFaultMedicalExpenseElimination(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setNoFaultMedicalExpenseElimination(value);
    }

    @And("I set select coverages additional pip limits to {string}")
    public void iSetCoveragesAdditionalPIPLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAdditionalPIPLimits(value);
    }

    @And("I set select coverages supplemental spousal liability to {string}")
    public void iSetCoveragesSupplementalSpousalLiability(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setSupplementalSpousalLiability(value);
    }

    @And("I set select coverages no fault work reduction to {string}")
    public void iSetCoveragesNoFaultWorkReduction(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setNoFaultWorkReduction(value);
    }

    @And("I set select coverages optional basic economic loss obel to {string}")
    public void iSetCoveragesOptionalBasicEconomicLossOBEL(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setOptionalBasicEconomicLossOBEL(value);
    }

    @And("I set select coverages um sum csl limits to {string}")
    public void iSetCoveragesMSUMCSLLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMSUMCSLLimits(value);
    }

    @And("I set select coverages um sum limit to {string}")
    public void iSetCoveragesUMSUMLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMSUMLimit(value);
    }

    @And("I set select coverages income loss to {string}")
    public void iSetCoveragesIncomeLoss(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setIncomeLoss(value);
    }

    @And("I set select coverages umpd limit to {string}")
    public void iSetCoveragesUMPDLimit(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMPDLimit(value);
    }

    @And("I set select coverages umbi csl options to {string}")
    public void iSetCoveragesUMBICSLOptions(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMBICSLOptions(value);
    }

    @And("I set select coverages pip options to {string}")
    public void iSetCoveragesPIPOptions(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIPOptions(value);
    }

    @And("I set select coverages pd limits to {string}")
    public void iSetCoveragesPDLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPDLimits(value);
    }

    @And("I set select coverages automobile death indemnity and total disability coverage to {string}")
    public void iSetCoveragesAutomobileDeathIndemnityAndTotalDisabilityCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAutomobileDeathIndemnityAndTotalDisabilityCoverage(value);
    }

    @And("I set select coverages um coverages radio button to {string}")
    public void iSetCoveragesUMCoveragesRadioButton(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMCoveragesRadioButton(value);
    }

    @And("I set select coverages um deductible to {string}")
    public void iSetCoveragesUMDeductible(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUMDeductible(value);
    }

    @And("I set select coverages personal injury protection coordination of benefits to {string}")
    public void iSetCoveragesPersonalInjuryProtectionCoordinationOfBenefits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPersonalInjuryProtectionCoordinationOfBenefits(value);
    }

    @And("I set select coverages personal Injury protection medical coverage to {string}")
    public void iSetCoveragesPersonalInjuryProtectionMedicalCoverage(String value) {
        new SelectCoveragesBlock(driver).setPersonalInjuryProtectionMedicalCoverage(value);
    }

    @And("I set select coverages excess attendant care coverage to {string}")
    public void iSetCoveragesExcessAttendantCareCoverage(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setExcessAttendantCareCoverage(value);
    }

    @And("I set select coverages uimbi cls limits to {string}")
    public void iSetCoveragesUIMBICLSLimits(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setUIMBICLSLimits(value);
    }

    @And("I set select coverages pip aggregate funeral income loss to {string}")
    public void iSetCoveragesPIPAggregateFuneralIncomeLoss(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setPIPAggregateFuneralIncomeLoss(value);
    }

    @And("I set select coverages full name of each excluded person on the policy {int} to {string}")
    public void iSetCoveragesFullNameOfEachExcludedPersonOnThePolicy(String value, int i) {
        new SelectCoveragesBlock(driver).enterFullNameOfEachExcludedPersonOnThePolicy(value, i);
    }

    @And("I set select coverages date of birth {int} to {string}")
    public void iSetCoveragesDOB(String value, int i) {
        new SelectCoveragesBlock(driver).enterDOB(value, i);
    }
    //select coverages block steps - END

    @And("I click BI Limits dropdown")
    public void clickBILimitsDropdown() {
        new SelectCoveragesBlock(driver).clickBiLimitsDropdown();
    }
    @And("I click UM UMI Limits dropdown")
    public void clickUMUMILimitsDropdown() {
        new SelectCoveragesBlock(driver).clickUMUMILimitsDropdown();
    }
    @And("I click UMBI Limits dropdown")
    public void clickUMBILimitsDropdown() {
        new SelectCoveragesBlock(driver).clickUMBILimitsDropdown();
    }
    @And("I click UMPD Limits dropdown")
    public void clickUMPDLimitsDropdown() {
        new SelectCoveragesBlock(driver).clickUMPDLimitsDropdown();
    }

    @And("I set vehicle {int} flood deductible to {string}")
    public void iSetVehicleFloodDeductible(int index, String value) throws Throwable {
        new VehiclesBlock(driver).setFloodDeductible(value, index);
    }
}