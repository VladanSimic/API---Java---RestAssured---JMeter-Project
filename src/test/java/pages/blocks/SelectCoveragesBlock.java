package pages.blocks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class SelectCoveragesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public SelectCoveragesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Combined or Split Limits')]/../../../..//input")
    WebElement combinedAndSplitLimits;
    @FindBy(xpath = "//div[contains(text(),'Split Limits')]/../../../..//input")
    WebElement splitLimits;
    @FindBy(xpath = "//div[contains(text(),'Golf Cart MedPay Limit')]/../../../..//input")
    WebElement golfCartMedPayLimit;
    @FindBy(xpath = "//div[text()='Motorcycle MedPay Limit']/../../../..//input")
    WebElement motorcycleMedPayLimit;
    @FindBy(xpath = "//div[text()='Snowmobile MedPay Limit']/../../../..//input")
    WebElement snowmobileMedPayLimit;
    @FindBy(xpath = "//div[contains(text(),'Optional Benefits Coverage')]/../../../..//input")
    WebElement optionalBenefitsCoverage;
    @FindBy(xpath = "//div[contains(text(),'UMPD (collector vehicle)')]/../../../..//input")
    WebElement umpdCollectorVehicle;
    @FindBy(xpath = "//div[contains(text(),'ATV MedPay Limit')]/../../../..//input")
    WebElement atvMedPayLimit;
    @FindBy(xpath = "//div[contains(text(),'Tort')]/../../../..//input")
    WebElement tort;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Protection (Medical Coverage)')]/../../../..//input")
    WebElement personalInjuryProtectionMedicalCoverage;
    @FindBy(xpath = "//span[text()='Full Name of Each Excluded Person on the Policy']/../../../../../../../../..//table//tr//td[2]/div")
    List<WebElement> dob;
    @FindBy(xpath = "//span[text()='Full Name of Each Excluded Person on the Policy']/../../../../../../../../..//table//tr//td[1]/div")
    List<WebElement> fullName;
    @FindBy(xpath = "//div[contains(text(),'MedPay Limit')]/../../../..//input")
    WebElement medPayLimits;
    @FindBy(xpath = "//div[contains(text(),'CSL UMBI')]/../../../..//input")
    WebElement CSLUMBI;
    @FindBy(xpath = "//div[contains(text(),'UM/SUM Limit')]/../../../..//input")
    WebElement UMSUMLimit;
    @FindBy(xpath = "//div[contains(text(),'CSL UM')]/../../../..//input")
    WebElement CSLUM;
    @FindBy(xpath = "//div[contains(text(),'UMBI & PD')]/../../../..//input")
    WebElement UMBI_PD;
    @FindBy(xpath = "//div[contains(text(),'UM CSL Limit')]/../../../..//input")
    WebElement UMCSLLimit;
    @FindBy(xpath = "//div[contains(text(),'Motorcycle Medical Payments')]/../../../..//input")
    WebElement motorMedicalPayments;
    @FindBy(xpath = "//div[contains(text(),'Income Loss')]/../../../..//input")
    WebElement incomeLoss;
    @FindBy(xpath = "//div[contains(text(),'UMPD Limit')]/../../../..//input")
    WebElement UMPDLimit;
    @FindBy(xpath = "//div[contains(text(),'PIP: Aggregate Medical Expense/Funeral Expense/Income Continuation/Loss of Services')]/../../../..//input")
    WebElement pipAggregateFuneralIncomeLoss;
    @FindBy(xpath = "//div[contains(text(),'Automobile Death Indemnity and Total Disability Coverage')]/../../../..//input")
    WebElement automobileDeathIndemnityAndTotalDisabilityCoverage;
    @FindBy(xpath = "//div[contains(text(),'Auto Death Benefits and Disability Coverages')]/../../../..//input")
    WebElement autoDeathBenefitsAndDisabilityCoverages;
    @FindBy(xpath = "//div[contains(text(),'APIP Limits')]/../../../..//input")
    WebElement apipLimits;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM CSL Limit')]/../../../..//input")
    WebElement UMUIMCSLLimit;
    @FindBy(xpath = "//div[contains(text(),'CSL UIMBI')]/../../../..//input")
    WebElement CSLUIMBI;
    @FindBy(xpath = "//div[contains(text(),'CSL UMBI/UIMBI Options')]/../../../..//input")
    WebElement CSLUMBIUIMBIOptions;
    @FindBy(xpath = "//div[contains(text(),'PIP Limits: Medical Expense/ Work Loss/ Funeral Expense')]/../../../..//input")
    WebElement pipLimitsMedicalWorkFuneral;
    @FindBy(xpath = "//div[contains(text(),'PIP Deductible')]/../../../..//input")
    WebElement PIPDeductible;
    @FindBy(xpath = "//div[contains(text(),'PIP Options')]/../../../..//input")
    WebElement PIPOptions;
    @FindBy(xpath = "//div[contains(text(),'Extended Medical Expense Limits')]/../../../..//input")
    WebElement extendedMedicalExpenseLimits;
    @FindBy(xpath = "//div[contains(text(),'Deletion of Benefits Other Than Medical Expense Benefits')]/../../../..//input")
    WebElement deletionOfBenefitsOtherThanMedicalExpenseBenefits;
    @FindBy(xpath = "//div[contains(text(),'Additional PIP Limits')]/../../../..//input")
    WebElement additionalPIPLimits;
    @FindBy(xpath = "//div[contains(text(),'UIM CSL Limits')]/../../../..//input")
    WebElement UIMCSLLimits;
    @FindBy(xpath = "//div[contains(text(),'UIM CSL Limit')]/../../../..//input")
    WebElement UIMCSLLimit;
    @FindBy(xpath = "//div[contains(text(),'PD Limits')]/../../../..//input")
    WebElement PDLimits;
    @FindBy(xpath = "//div[contains(text(),'BI Limits')]/../../../..//input")
    WebElement biLimits;
    @FindBy(xpath = "//div[contains(text(),'UMBI/UIMBI')]/../../../..//input")
    WebElement UMBIUIMBI;
    @FindBy(xpath = "//div[contains(text(),'UM Limit')]/../../../..//input")
    WebElement UMLimit;
    @FindBy(xpath = "//div[contains(text(),'UM Deductible')]/../../../..//input")
    WebElement UMDeductible;
    @FindBy(xpath = "//div[contains(text(),'UIM Limit')]/../../../..//input")
    WebElement UIMLimit;
    @FindBy(xpath = "//div[contains(text(),'UIM PD')]/../../../..//input")
    WebElement UIMPD;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM CSL Coverage Selection')]/../../../..//input")
    WebElement UMUIMCSLCoverageSelection;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM CSL Standard Coverage Limits')]/../../../..//input")
    WebElement UMUIMCSLStandardCoverageLimits;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM CSL Conversion Coverage Limits')]/../../../..//input")
    WebElement UMUIMCSLConversionCoverageLimits;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM Limit')]/../../../..//input")
    WebElement UMUIMLimit;
    @FindBy(xpath = "//div[text()='PIP']/../../../..//input")
    WebElement pip;
    @FindBy(xpath = "//div[text()='UMBI']/../../../..//input")
    WebElement umbi;
    @FindBy(xpath = "//div[text()='UIMBI']/../../../..//input")
    WebElement uimbi;
    @FindBy(xpath = "//div[contains(text(),'UIMBI Limit')]/../../../..//input")
    WebElement UIMBILimit;
    @FindBy(xpath = "//div[contains(text(),'UMBI Limits')]/../../../..//input")
    WebElement UMBILimits;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM BI Limit')]/../../../..//input")
    WebElement UMUIM_BILimit;
    @FindBy(xpath = "//div[contains(text(),'UMBI/UIMBI Options')]/../../../..//input")
    WebElement UMBI_UIMBI_Options;
    @FindBy(xpath = "//div[contains(text(),'UMBI Limit')]/../../../..//input")
    WebElement UMBILimit;
    @FindBy(xpath = "//div[contains(text(),'UM/UIMBI')]/../../../..//input")
    WebElement UMUIMBI;
    @FindBy(xpath = "//div[contains(text(),'UMPD')]/../../../..//input")
    WebElement UMPD;
    @FindBy(xpath = "//div[contains(text(),'CSL Limits')]/../../../..//input")
    WebElement CSLLimits;
    @FindBy(xpath = "//div[contains(text(),'No-Fault Medical Expense Elimination')]/../../../..//input")
    WebElement noFaultMedicalExpenseElimination;
    @FindBy(xpath = "//div[contains(text(),'UM/SUM CSL Limit')]/../../../..//input")
    WebElement UMSUMCSLLimits;
    @FindBy(xpath = "//div[contains(text(),'Added Personal Injury Protection')]/../../../..//input")
    WebElement AddedPersonalInjuryProtection;
    @FindBy(xpath = "//div[contains(text(),'APIP - Total of all added PIP benefits')]/../../../..//input")
    WebElement APIPTotalOfAllAddedPIPBenefits;
    @FindBy(xpath = "//div[contains(text(),'Basic PIP Options')]/../../../..//input")
    WebElement basicPIPOptions;
    @FindBy(xpath = "//div[contains(text(),'UMBI/UIMBI Limit')]/../../../..//input")
    WebElement UMBIUIMBILimit;
    @FindBy(xpath = "//div[contains(text(),'UMBI/UIMBI CSL Limit')]/../../../..//input")
    WebElement UMBI_UIMBICSLLimit;
    @FindBy(xpath = "//div[contains(text(),'UMBI/UIMBI CSL')]/../../../..//input")
    WebElement UMBI_UIMBICSL;
    @FindBy(xpath = "//div[contains(text(),'APIP Options')]/../../../..//input")
    WebElement APIPOptions;
    @FindBy(xpath = "//div[contains(text(),'Combined PIP (Stacking)')]/../../../..//input")
    WebElement combinedPIPStacking;
    @FindBy(xpath = "//div[contains(text(),'UMBI CSL Limit')]/../../../..//input")
    WebElement UMBICSLLimit;
    @FindBy(xpath = "//div[contains(text(),'UM Coverages')]/../../../..//input")
    WebElement UMCoverages;
    @FindBy(xpath = "//div[contains(text(),'Economic Loss UM Coverage')]/../../../..//input")
    WebElement EconomicLossUMCoverage;
    @FindBy(xpath = "//div[contains(text(),'APIP - Total additional limits')]/../../../..//input")
    WebElement APIPTotalAdditionalLimits;
    @FindBy(xpath = "//div[contains(text(),'UIMBI CSL Limits')]/../../../..//input")
    WebElement UIMBICSLLimits;
    @FindBy(xpath = "//div[contains(text(),'UIMBI CSL Limit')]/../../../..//input")
    WebElement UIMBICSLLimit;
    @FindBy(xpath = "//div[contains(text(),'Coordination of Benefits')]/../../../..//input")
    WebElement coordinationOfBenefits;
    @FindBy(xpath = "//div[contains(text(),'Limited Tort or Full Tort')]/../../../..//input")
    WebElement limittedOrFullTort;
    @FindBy(xpath = "//div[contains(text(),'Work Loss')]/../../../..//input")
    WebElement workLoss;
    @FindBy(xpath = "//div[contains(text(),'Funeral Expense')]/../../../..//input")
    WebElement funeralExpense;
    @FindBy(xpath = "//div[contains(text(),'PIP Limits')]/../../../..//input")
    WebElement PIPLimits;
    @FindBy(xpath = "//div[contains(text(),'Medical Expense Benefits as Secondary Coverage')]/../../../..//input")
    WebElement medicalExpenseBenefitsAsSecondaryCoverage;
    @FindBy(xpath = "//div[contains(text(),'APIP Income Continuation: Weekly Max | Total Max / Essential Service Max Total / Added Death Benefits')]/../../../..//input")
    WebElement APIPIncomeContinuation;
    @FindBy(xpath = "//label[text()='PIP - Exclusion of Benefits']/../..//input")
    WebElement PIPExclusionOfBenefits;
    @FindBy(xpath = "//label[text()='Check here to apply $1,000,000 CSL limits (Underwriting only option)']/../..//input")
    WebElement applyCSLLimit;
    @FindBy(xpath = "//label[text()='Check here to apply $1,000,000 CSL UMBI limits (Underwriting only option)']/../..//input")
    WebElement applyCSLUMBILimits;
    @FindBy(xpath = "//label[text()='Check here to apply $1,000,000/$1,000,000 split UMBI limits (Underwriting only option)']/../..//input")
    WebElement checkHereToApplySplitUMBILimits;
    @FindBy(xpath = "//label[text()='Check here to apply $1,000,000/$1,000,000 split BI limits (Underwriting only option)']/../..//input")
    WebElement checkHereToApplySplitBILimits;
    @FindBy(xpath = "//label[text()='Supplemental Spousal Liability']/../..//input")
    WebElement supplementalSpousalLiability;
    @FindBy(xpath = "//label[text()='No-Fault Work Reduction']/../..//input")
    WebElement noFaultWorkReduction;
    @FindBy(xpath = "//label[text()='Optional Basic Economic Loss (OBEL)']/../..//input")
    WebElement optionalBasicEconomicLossOBEL;
    @FindBy(xpath = "//div[contains(text(),'Medical Expense')]/../../../..//input")
    WebElement medicalExpense;
    @FindBy(xpath = "//div[contains(text(),'Combination First Party Benefits Coverage')]/../../../..//input")
    WebElement combinationFirstPartyBenefitsCoverage;
    @FindBy(xpath = "//div[contains(text(),'PIP Deductible applicable')]/../../../..//input")
    WebElement pipDeductibleApplicableTo;
    @FindBy(xpath = "//div[contains(text(),'Extraordinary Medical Benefits Coverage')]/../../../..//input")
    WebElement extraordinaryMedicalBenefitsCoverage;
    @FindBy(xpath = "//div[contains(text(),'APIP - Total additional limits/ Workloss or Survivors Income Loss/ Replacement Services')]/../../../..//input")
    WebElement apipTotalWorklossReplacementFuneral;
    @FindBy(xpath = "//div[contains(text(),'UMBI CSL')]/../../../..//input")
    WebElement UMBICSL;
    @FindBy(xpath = "//div[contains(text(),'Do you wish to purchase Limited Tort or Full Tort?')]/../../../..//input")
    WebElement DoYouWishToPurchaseLimitedTortOrFullTort;
    @FindBy(xpath = "//div[contains(text(),'APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense')]/../../../..//input")
    WebElement APIPMedicalRehabFuneralWorkServiceLimit;
    @FindBy(xpath = "//div[text()='select coverage']")
    WebElement selectCoveragesBlock;
    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[contains(text(),'Basic First Party Benefits Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement basicFirstPartyBenefitsCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Basic First Party Benefits Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement basicFirstPartyBenefitsCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Added First Party Benefits Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement addedFirstPartyBenefitsCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Added First Party Benefits Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement addedFirstPartyBenefitsCoverageNo;
    @FindBy(xpath = "//div[text()='AOP Deductible']/../../../..//input[@aria-hidden='false']")
    WebElement AOPDeductible;
    @FindBy(xpath = "//div[text()='Hurricane Deductible']/../../../..//input[@aria-hidden='false']")
    WebElement hurricaneDeductible;
    @FindBy(xpath = "//div[text()='Personal Effects']/../../../..//input[@aria-hidden='false']")
    WebElement personalEffects;
    @FindBy(xpath = "//div[contains(text(),'PIP rejection')]/../../../..//label[text()='Yes']/..//input")
    WebElement pipRejectionYes;
    @FindBy(xpath = "//div[contains(text(),'PIP rejection')]/../../../..//label[text()='No']/..//input")
    WebElement pipRejectionNo;
    @FindBy(xpath = "//div[contains(text(),'UIMBI CSL Limit')]/../../../..//input")
    WebElement UMUIMBILimit;
    @FindBy(xpath = "//div[contains(text(),'Work Loss Benefit')]/../../../..//label[text()='Yes']/..//input")
    WebElement workLossBenefitYes;
    @FindBy(xpath = "//div[contains(text(),'Work Loss Benefit')]/../../../..//label[text()='No']/..//input")
    WebElement workLossBenefitNo;
    @FindBy(xpath = "//div[contains(text(),'Accidental Death Benefit')]/../../../..//label[text()='Yes']/..//input")
    WebElement accidentalDeathBenefitYes;
    @FindBy(xpath = "//div[contains(text(),'Accidental Death Benefit')]/../../../..//label[text()='No']/..//input")
    WebElement accidentalDeathBenefitNo;
    @FindBy(xpath = "//div[contains(text(),'PIP - Exclusion of Income Benefit')]/../../../..//label[text()='Yes']/..//input")
    WebElement PIPExclusionOfIncomeBenefitYes;
    @FindBy(xpath = "//div[contains(text(),'PIP - Exclusion of Income Benefit')]/../../../..//label[text()='No']/..//input")
    WebElement PIPExclusionOfIncomeBenefitNo;
    @FindBy(xpath = "//div[contains(text(),'PURE Enhancement Endorsement')]/../../../..//label[text()='Yes']/..//input")
    WebElement PUREEnhancementEndorsementYes;
    @FindBy(xpath = "//div[contains(text(),'Excess Attendant Care Coverage ($10,000 Limit)')]/../../../..//label[text()='Yes']/..//input")
    WebElement excessAttendantCareCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Excess Attendant Care Coverage ($10,000 Limit)')]/../../../..//label[text()='No']/..//input")
    WebElement excessAttendantCareCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'PURE Enhancement Endorsement')]/../../../..//label[text()='No']/..//input")
    WebElement PUREEnhancementEndorsementNo;
    @FindBy(xpath = "//div[contains(text(),'UM Coverages')]/../../../..//label[text()='Reduced by At Fault Liability Limits']/..//input")
    WebElement reducedByAtFaultLiabilityLimits;
    @FindBy(xpath = "//div[contains(text(),'UM Coverages')]/../../../..//label[text()='Added on to At Fault Liability Limits']/..//input")
    WebElement addedOnToAtFaultLiabilityLimits;
    @FindBy(xpath = "//div[contains(text(),'UMBI CSL Options')]/../../../..//input")
    WebElement UMBICSLOptions;
    @FindBy(xpath = "//i[contains(text(),'(coordination of benefits)')]/../../../../..//input")
    WebElement personalInjuryProtectionCoordinationOfBenefits;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM Split Limit Coverage Selection')]/../../../..//input")
    WebElement UMUIMSplitLimitCoverageSelection;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM Split Limit Standard Coverage')]/../../../..//input")
    WebElement UMUIMSplitLimitStandardCoverage;
    @FindBy(xpath = "//div[contains(text(),'UM/UIM Split Limit Conversion Coverage')]/../../../..//input")
    WebElement UMUIMSplitLimitConversionCoverage;
    @FindBy(xpath = "//div[text()='UMBI/UIMBI Options']/../../../..//input")
    WebElement UMBIUIMBIOptions;

    @FindBy(xpath = "//div[contains(text(),'UIMPD')]/../../../..//input")
    WebElement UIMPD2;

    public void fillCoveragesDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("select coverage");
        if (!data.get("State").equalsIgnoreCase("MA")) {
            if (data.get("State").equalsIgnoreCase("NC")) {
                setSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits"));
            } else {
                setCombinedOrSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits"));
            }
        }
        saveChanges();

        switch (data.get("State")) {
            case "AR": {
                fillCoverageDetailsAR(data);
            }
            break;
            case "MN": {
                fillCoverageDetailsMN(data);
            }
            break;
            case "ND": {
                fillCoverageDetailsND(data);
            }
            break;
            case "AZ": {
                fillCoverageDetailsAZ(data);
            }
            break;
            case "NE": {
                fillCoverageDetailsNE(data);
            }
            break;
            case "IA": {
                fillCoverageDetailsIA(data);
            }
            break;
            case "KS": {
                fillCoverageDetailsKS(data);
            }
            break;
            case "CO": {
                fillCoverageDetailsCO(data);
            }
            break;
            case "MO": {
                fillCoverageDetailsMO(data);
            }
            break;
            case "IN": {
                fillCoverageDetailsIN(data);
            }
            break;
            case "IL": {
                fillCoverageDetailsIL(data);
            }
            break;
            case "KY": {
                fillCoverageDetailsKY(data);
            }
            break;
            case "DC": {
                fillCoverageDetailsDC(data);
            }
            break;
            case "AK": {
                fillCoverageDetailsAK(data);
            }
            break;
            case "NH": {
                fillCoverageDetailsNH(data);
            }
            break;
            case "NM": {
                fillCoverageDetailsNM(data);
            }
            break;
            case "NV": {
                fillCoverageDetailsNV(data);
            }
            break;
            case "OH": {
                fillCoverageDetailsOH(data);
            }
            break;
            case "OK": {
                fillCoverageDetailsOK(data);
            }
            break;
            case "OR": {
                fillCoverageDetailsOR(data);
            }
            break;
            case "PA": {
                fillCoverageDetailsPA(data);
            }
            break;
            case "RI": {
                fillCoverageDetailsRI(data);
            }
            break;
            case "SD": {
                fillCoverageDetailsSD(data);
            }
            break;
            case "TN": {
                fillCoverageDetailsTN(data);
            }
            break;
            case "VT": {
                fillCoverageDetailsVT(data);
            }
            break;
            case "UT": {
                fillCoverageDetailsUT(data);
            }
            break;
            case "WI": {
                fillCoverageDetailsWI(data);
            }
            break;
            case "WV": {
                fillCoverageDetailsWV(data);
            }
            break;
            case "WY": {
                fillCoverageDetailsWY(data);
            }
            break;
            case "AL": {
                fillCoverageDetailsAL(data);
            }
            break;
            case "CA": {
                fillCoverageDetailsCA(data);
            }
            break;
            case "CT": {
                fillCoverageDetailsCT(data);
            }
            break;
            case "DE": {
                fillCoverageDetailsDE(data);
            }
            break;
            case "HI": {
                fillCoverageDetailsHI(data);
            }
            break;
            case "LA": {
                fillCoverageDetailsLA(data);
            }
            break;
            case "MA": {
                fillCoverageDetailsMA(data);
            }
            break;
            case "MD": {
                fillCoverageDetailsMD(data);
            }
            break;
            case "ME": {
                fillCoverageDetailsME(data);
            }
            break;
            case "MS": {
                fillCoverageDetailsMS(data);
            }
            break;
            case "NC": {
                fillCoverageDetailsNC(data);
            }
            break;
            case "NJ": {
                fillCoverageDetailsNJ(data);
            }
            break;
            case "NY": {
                fillCoverageDetailsNY(data);
            }
            break;
            case "SC": {
                fillCoverageDetailsSC(data);
            }
            break;
            case "VA": {
                fillCoverageDetailsVA(data);
            }
            break;
            case "FL": {
                fillCoverageDetailsFL(data);
            }
            break;
            case "TX": {
                fillCoverageDetailsTX(data);
            }
            break;
            case "GA": {
                fillCoverageDetailsGA(data);
            }
            break;
            case "MI": {
                fillCoverageDetailsMI(data);
            }
            break;
            case "ID": {
                fillCoverageDetailsID(data);
            }
            break;
            case "WA": {
                fillCoverageDetailsWA(data);
            }
            break;
            case "MT": {
                fillCoverageDetailsMT(data);
            }
            break;
        }
    }

    public void fillCoveragesDetailsPA_END(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("MA")) {
            if (data.get("State").equalsIgnoreCase("NC")) {
                setSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits_END"));
            } else {
                setCombinedOrSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits_END"));
            }
        }
        saveChanges();

        switch (data.get("State")) {
            case "AR": {
                fillCoverageDetailsAR_END(data);
            }
            break;
            case "MN": {
                fillCoverageDetailsMN_END(data);
            }
            break;
            case "ND": {
                fillCoverageDetailsND_END(data);
            }
            break;
            case "AZ": {
                fillCoverageDetailsAZ_END(data);
            }
            break;
            case "NE": {
                fillCoverageDetailsNE_END(data);
            }
            break;
            case "IA": {
                fillCoverageDetailsIA_END(data);
            }
            break;
            case "KS": {
                fillCoverageDetailsKS_END(data);
            }
            break;
            case "CO": {
                fillCoverageDetailsCO_END(data);
            }
            break;
            case "MO": {
                fillCoverageDetailsMO_END(data);
            }
            break;
            case "IN": {
                fillCoverageDetailsIN_END(data);
            }
            break;
            case "IL": {
                fillCoverageDetailsIL_END(data);
            }
            break;
            case "KY": {
                fillCoverageDetailsKY_END(data);
            }
            break;
            case "DC": {
                fillCoverageDetailsDC_END(data);
            }
            break;
            case "AK": {
                fillCoverageDetailsAK_END(data);
            }
            break;
            case "NH": {
                fillCoverageDetailsNH_END(data);
            }
            break;
            case "NM": {
                fillCoverageDetailsNM_END(data);
            }
            break;
            case "NV": {
                fillCoverageDetailsNV_END(data);
            }
            break;
            case "OH": {
                fillCoverageDetailsOH_END(data);
            }
            break;
            case "OK": {
                fillCoverageDetailsOK_END(data);
            }
            break;
            case "OR": {
                fillCoverageDetailsOR_END(data);
            }
            break;
            case "PA": {
                fillCoverageDetailsPA_END(data);
            }
            break;
            case "RI": {
                fillCoverageDetailsRI_END(data);
            }
            break;
            case "SD": {
                fillCoverageDetailsSD_END(data);
            }
            break;
            case "TN": {
                fillCoverageDetailsTN_END(data);
            }
            break;
            case "VT": {
                fillCoverageDetailsVT_END(data);
            }
            break;
            case "UT": {
                fillCoverageDetailsUT_END(data);
            }
            break;
            case "WI": {
                fillCoverageDetailsWI_END(data);
            }
            break;
            case "WV": {
                fillCoverageDetailsWV_END(data);
            }
            break;
            case "WY": {
                fillCoverageDetailsWY_END(data);
            }
            break;
            case "AL": {
                fillCoverageDetailsAL_END(data);
            }
            break;
            case "CA": {
                fillCoverageDetailsCA_END(data);
            }
            break;
            case "CT": {
                fillCoverageDetailsCT_END(data);
            }
            break;
            case "DE": {
                fillCoverageDetailsDE_END(data);
            }
            break;
            case "HI": {
                fillCoverageDetailsHI_END(data);
            }
            break;
            case "LA": {
                fillCoverageDetailsLA_END(data);
            }
            break;
            case "MA": {
                fillCoverageDetailsMA_END(data);
            }
            break;
            case "MD": {
                fillCoverageDetailsMD_END(data);
            }
            break;
            case "ME": {
                fillCoverageDetailsME_END(data);
            }
            break;
            case "MS": {
                fillCoverageDetailsMS_END(data);
            }
            break;
            case "NC": {
                fillCoverageDetailsNC_END(data);
            }
            break;
            case "NJ": {
                fillCoverageDetailsNJ_END(data);
            }
            break;
            case "NY": {
                fillCoverageDetailsNY_END(data);
            }
            break;
            case "SC": {
                fillCoverageDetailsSC_END(data);
            }
            break;
            case "VA": {
                fillCoverageDetailsVA_END(data);
            }
            break;
            case "FL": {
                fillCoverageDetailsFL_END(data);
            }
            break;
            case "TX": {
                fillCoverageDetailsTX_END(data);
            }
            break;
            case "GA": {
                fillCoverageDetailsGA_END(data);
            }
            break;
            case "MI": {
                fillCoverageDetailsMI_END(data);
            }
            break;
            case "ID": {
                fillCoverageDetailsID_END(data);
            }
            break;
            case "WA": {
                fillCoverageDetailsWA_END(data);
            }
            break;
            case "MT": {
                fillCoverageDetailsMT_END(data);
            }
            break;
        }
    }

    public void fillCoveragesDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("MA")) {
            if (data.get("State").equalsIgnoreCase("NC")) {
                setSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"));
            } else {
                setCombinedOrSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"));
            }
        }
        saveChanges();

        switch (data.get("State")) {
            case "AR": {
                fillCoverageDetailsAR_OOS_END(data);
            }
            break;
            case "MN": {
                fillCoverageDetailsMN_OOS_END(data);
            }
            break;
            case "ND": {
                fillCoverageDetailsND_OOS_END(data);
            }
            break;
            case "AZ": {
                fillCoverageDetailsAZ_OOS_END(data);
            }
            break;
            case "NE": {
                fillCoverageDetailsNE_OOS_END(data);
            }
            break;
            case "IA": {
                fillCoverageDetailsIA_OOS_END(data);
            }
            break;
            case "KS": {
                fillCoverageDetailsKS_OOS_END(data);
            }
            break;
            case "CO": {
                fillCoverageDetailsCO_OOS_END(data);
            }
            break;
            case "MO": {
                fillCoverageDetailsMO_OOS_END(data);
            }
            break;
            case "IN": {
                fillCoverageDetailsIN_OOS_END(data);
            }
            break;
            case "IL": {
                fillCoverageDetailsIL_OOS_END(data);
            }
            break;
            case "KY": {
                fillCoverageDetailsKY_OOS_END(data);
            }
            break;
            case "DC": {
                fillCoverageDetailsDC_OOS_END(data);
            }
            break;
            case "AK": {
                fillCoverageDetailsAK_OOS_END(data);
            }
            break;
            case "NH": {
                fillCoverageDetailsNH_OOS_END(data);
            }
            break;
            case "NM": {
                fillCoverageDetailsNM_OOS_END(data);
            }
            break;
            case "NV": {
                fillCoverageDetailsNV_OOS_END(data);
            }
            break;
            case "OH": {
                fillCoverageDetailsOH_OOS_END(data);
            }
            break;
            case "OK": {
                fillCoverageDetailsOK_OOS_END(data);
            }
            break;
            case "OR": {
                fillCoverageDetailsOR_OOS_END(data);
            }
            break;
            case "PA": {
                fillCoverageDetailsPA_OOS_END(data);
            }
            break;
            case "RI": {
                fillCoverageDetailsRI_OOS_END(data);
            }
            break;
            case "SD": {
                fillCoverageDetailsSD_OOS_END(data);
            }
            break;
            case "TN": {
                fillCoverageDetailsTN_OOS_END(data);
            }
            break;
            case "VT": {
                fillCoverageDetailsVT_OOS_END(data);
            }
            break;
            case "UT": {
                fillCoverageDetailsUT_OOS_END(data);
            }
            break;
            case "WI": {
                fillCoverageDetailsWI_OOS_END(data);
            }
            break;
            case "WV": {
                fillCoverageDetailsWV_OOS_END(data);
            }
            break;
            case "WY": {
                fillCoverageDetailsWY_OOS_END(data);
            }
            break;
            case "AL": {
                fillCoverageDetailsAL_OOS_END(data);
            }
            break;
            case "CA": {
                fillCoverageDetailsCA_OOS_END(data);
            }
            break;
            case "CT": {
                fillCoverageDetailsCT_OOS_END(data);
            }
            break;
            case "DE": {
                fillCoverageDetailsDE_OOS_END(data);
            }
            break;
            case "HI": {
                fillCoverageDetailsHI_OOS_END(data);
            }
            break;
            case "LA": {
                fillCoverageDetailsLA_OOS_END(data);
            }
            break;
            case "MA": {
                fillCoverageDetailsMA_OOS_END(data);
            }
            break;
            case "MD": {
                fillCoverageDetailsMD_OOS_END(data);
            }
            break;
            case "ME": {
                fillCoverageDetailsME_OOS_END(data);
            }
            break;
            case "MS": {
                fillCoverageDetailsMS_OOS_END(data);
            }
            break;
            case "NC": {
                fillCoverageDetailsNC_OOS_END(data);
            }
            break;
            case "NJ": {
                fillCoverageDetailsNJ_OOS_END(data);
            }
            break;
            case "NY": {
                fillCoverageDetailsNY_OOS_END(data);
            }
            break;
            case "SC": {
                fillCoverageDetailsSC_OOS_END(data);
            }
            break;
            case "VA": {
                fillCoverageDetailsVA_OOS_END(data);
            }
            break;
            case "FL": {
                fillCoverageDetailsFL_OOS_END(data);
            }
            break;
            case "TX": {
                fillCoverageDetailsTX_OOS_END(data);
            }
            break;
            case "GA": {
                fillCoverageDetailsGA_OOS_END(data);
            }
            break;
            case "MI": {
                fillCoverageDetailsMI_OOS_END(data);
            }
            break;
            case "ID": {
                fillCoverageDetailsID_OOS_END(data);
            }
            break;
            case "WA": {
                fillCoverageDetailsWA_OOS_END(data);
            }
            break;
            case "MT": {
                fillCoverageDetailsMT_OOS_END(data);
            }
            break;
        }
    }

    public void fillCoveragesDetailsPA_RNW(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("MA")) {
            if (data.get("State").equalsIgnoreCase("NC")) {
                setSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"));
            } else {
                setCombinedOrSplitLimits(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"));
            }
        }
        saveChanges();

        switch (data.get("State")) {
            case "AR": {
                fillCoverageDetailsAR_RNW(data);
            }
            break;
            case "MN": {
                fillCoverageDetailsMN_RNW(data);
            }
            break;
            case "ND": {
                fillCoverageDetailsND_RNW(data);
            }
            break;
            case "AZ": {
                fillCoverageDetailsAZ_RNW(data);
            }
            break;
            case "NE": {
                fillCoverageDetailsNE_RNW(data);
            }
            break;
            case "IA": {
                fillCoverageDetailsIA_RNW(data);
            }
            break;
            case "KS": {
                fillCoverageDetailsKS_RNW(data);
            }
            break;
            case "CO": {
                fillCoverageDetailsCO_RNW(data);
            }
            break;
            case "MO": {
                fillCoverageDetailsMO_RNW(data);
            }
            break;
            case "IN": {
                fillCoverageDetailsIN_RNW(data);
            }
            break;
            case "IL": {
                fillCoverageDetailsIL_RNW(data);
            }
            break;
            case "KY": {
                fillCoverageDetailsKY_RNW(data);
            }
            break;
            case "DC": {
                fillCoverageDetailsDC_RNW(data);
            }
            break;
            case "AK": {
                fillCoverageDetailsAK_RNW(data);
            }
            break;
            case "NH": {
                fillCoverageDetailsNH_RNW(data);
            }
            break;
            case "NM": {
                fillCoverageDetailsNM_RNW(data);
            }
            break;
            case "NV": {
                fillCoverageDetailsNV_RNW(data);
            }
            break;
            case "OH": {
                fillCoverageDetailsOH_RNW(data);
            }
            break;
            case "OK": {
                fillCoverageDetailsOK_RNW(data);
            }
            break;
            case "OR": {
                fillCoverageDetailsOR_RNW(data);
            }
            break;
            case "PA": {
                fillCoverageDetailsPA_RNW(data);
            }
            break;
            case "RI": {
                fillCoverageDetailsRI_RNW(data);
            }
            break;
            case "SD": {
                fillCoverageDetailsSD_RNW(data);
            }
            break;
            case "TN": {
                fillCoverageDetailsTN_RNW(data);
            }
            break;
            case "VT": {
                fillCoverageDetailsVT_RNW(data);
            }
            break;
            case "UT": {
                fillCoverageDetailsUT_RNW(data);
            }
            break;
            case "WI": {
                fillCoverageDetailsWI_RNW(data);
            }
            break;
            case "WV": {
                fillCoverageDetailsWV_RNW(data);
            }
            break;
            case "WY": {
                fillCoverageDetailsWY_RNW(data);
            }
            break;
            case "AL": {
                fillCoverageDetailsAL_RNW(data);
            }
            break;
            case "CA": {
                fillCoverageDetailsCA_RNW(data);
            }
            break;
            case "CT": {
                fillCoverageDetailsCT_RNW(data);
            }
            break;
            case "DE": {
                fillCoverageDetailsDE_RNW(data);
            }
            break;
            case "HI": {
                fillCoverageDetailsHI_RNW(data);
            }
            break;
            case "LA": {
                fillCoverageDetailsLA_RNW(data);
            }
            break;
            case "MA": {
                fillCoverageDetailsMA_RNW(data);
            }
            break;
            case "MD": {
                fillCoverageDetailsMD_RNW(data);
            }
            break;
            case "ME": {
                fillCoverageDetailsME_RNW(data);
            }
            break;
            case "MS": {
                fillCoverageDetailsMS_RNW(data);
            }
            break;
            case "NC": {
                fillCoverageDetailsNC_RNW(data);
            }
            break;
            case "NJ": {
                fillCoverageDetailsNJ_RNW(data);
            }
            break;
            case "NY": {
                fillCoverageDetailsNY_RNW(data);
            }
            break;
            case "SC": {
                fillCoverageDetailsSC_RNW(data);
            }
            break;
            case "VA": {
                fillCoverageDetailsVA_RNW(data);
            }
            break;
            case "FL": {
                fillCoverageDetailsFL_RNW(data);
            }
            break;
            case "TX": {
                fillCoverageDetailsTX_RNW(data);
            }
            break;
            case "GA": {
                fillCoverageDetailsGA_RNW(data);
            }
            break;
            case "MI": {
                fillCoverageDetailsMI_RNW(data);
            }
            break;
            case "ID": {
                fillCoverageDetailsID_RNW(data);
            }
            break;
            case "WA": {
                fillCoverageDetailsWA_RNW(data);
            }
            break;
            case "MT": {
                fillCoverageDetailsMT_RNW(data);
            }
            break;
        }
    }

    public void fillCoverageDetailsPW(Map<String, String> data) throws Throwable {
        verifyBlockExists("select coverage");
        if (data.get("Vehicle_GTE_27_Feet").equalsIgnoreCase("Yes") && Integer.parseInt(data.get("Length")) > 27) {
            setAOPDeductible(data.get("AOP_Deductible"));
            setHurricaneDeductible(data.get("Hurricane_Deductible"));
            setPersonalEffects(data.get("Personal_Effects"));
        } else {
            setAOPDeductible(data.get("AOP_Deductible"));
            setHurricaneDeductible(data.get("Hurricane_Deductible"));
        }
    }

    public void fillCoverageDetailsAR(Map<String, String> data) throws Throwable {
        setWorkLossBenefit(data.get("Select_Coverage_Work_Loss_Benefit"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUMPD(data.get("Select_Coverage_UMPD"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMN(Map<String, String> data) throws Throwable {
        setBasicPIPOptions(data.get("Select_Coverage_Basic_PIP_Options"));
        setAPIPOptions(data.get("Select_Coverage_APIP_Option"));
        setCombinedPIPStacking(data.get("Select_Coverage_Combined_PIP_Stacking"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBI_UIMBICSLLimit(data.get("Select_Coverage_UMBI_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBIUIMBILimit(data.get("Select_Coverage_UMBI_UIMBI_Limit"));
                }
                break;
            }
        }

        boolean hasMedPay = false;
        for (int i = 0; i < data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("Motorcycles/Mopeds/Scooters") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("Golf Carts") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("All Terrain Vehicles") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("Snowmobiles")) {
                hasMedPay = true;
            }
        }
        if (hasMedPay) {
            setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        }
        setAPIPOptions(data.get("Select_Coverage_APIP_Option"));
    }

    public void fillCoverageDetailsND(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }

        setCoordinationOfBenefits(data.get("Select_Coverage_Coordination_Of_Benefits_Excess_Personal_Injury_Protection"));
        setAPIPTotalAdditionalLimits(data.get("Select_Coverage_APIP_Total_Additional_limits_Workloss_Or_Survivors_Income_Loss_Replacement_Services_Or_Survivor's_Replacement_Loss_Funeral_Expense"));

        boolean hasMotorcycleMopedScooter = false;
        for (int i = 0; i < data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("Motorcycles/Mopeds/Scooters")) {
                hasMotorcycleMopedScooter = true;
            }
        }

        if (hasMotorcycleMopedScooter) {
            setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments"));
        }
    }

    public void fillCoverageDetailsAZ(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNE(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    satUMBIUIMBICSL(data.get("Select_Coverage_UMBI_UIMBI_CSL"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBIUIMBI(data.get("Select_Coverage_UMBI_UIMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIA(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }

    }

    public void fillCoverageDetailsKS(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPMedicalRehabFuneralWorkServiceLimit(data.get("Select_Coverage_APIP_Medical_Expense_Rehabilitation_Expense_Funeral_Expense_Work_Loss_Essential_Service_Expense"));

        boolean hasMotorcycleMopedScooter = false;
        for (int i = 0; i < data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("Motorcycles/Mopeds/Scooters")) {
                hasMotorcycleMopedScooter = true;
            }
        }

        if (hasMotorcycleMopedScooter) {
            setPIPRejection(data.get("Select_Coverage_PIP_Rejection"));
        }
    }

    public void fillCoverageDetailsCO(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBI(data.get("Select_Coverage_UMBI"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMO(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIN(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIL(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsKY(Map<String, String> data) throws Throwable {
        setTort(data.get("Select_Coverage_Tort"));
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPTotalOfAllAddedPIPBenefits(data.get("Select_Coverage_APIP_Total_Of_All_Added_PIP_Benefits"));
    }

    public void fillCoverageDetailsDC(Map<String, String> data) throws Throwable {
        setPIPLimitsMedicalWorkFuneral(data.get("Select_Coverage_PIP_Limits_Medical_Expense_Work_Loss_Funeral_Expense"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAK(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNH(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNM(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBI_PD(data.get("Select_Coverage_UMBI_&_PD"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUMPD(data.get("Select_Coverage_UMPD"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNV(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOH(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOK(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOR(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductibleApplicableTo(data.get("Select_Coverage_PIP_Deductible_Applicable_To"));

        boolean hasUMPD = false;
        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Classic Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Antique Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Exotic Collectors Car")) {
                hasUMPD = true;
            }
        }
        if (hasUMPD) {
            setUMPD(data.get("Select_Coverage_UMPD"));
        }
    }

    public void fillCoverageDetailsPA(Map<String, String> data) throws Throwable {

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSL(data.get("Select_Coverage_UMBI_CSL"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBI(data.get("Select_Coverage_UMBI"));
                }
                break;
            }
        }

        setBasicFirstPartyBenefitsCoverage(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage"));
        if (hasValue(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage")) && !data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage").equalsIgnoreCase("Yes")) {
            setAddedFirstPartyBenefitsCoverage(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage"));
            if (hasValue(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage")) && data.get("Select_Coverage_Added_First_Party_Benefits_Coverage").equalsIgnoreCase("Yes")) {
                setMedicalExpense(data.get("Select_Coverage_Medical_Expense"));
                setWorkLoss(data.get("Select_Coverage_Work_Loss"));
                setFuneralExpense(data.get("Select_Coverage_Funeral_Expense"));
                setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit"));
            } else {
                setCombinationFirstPartyBenefitsCoverage(data.get("Select_Coverage_Combination_First_Party_Benefits_Coverage"));
            }
        }

        setExtraordinaryMedicalBenefitsCoverage(data.get("Select_Coverage_Extraordinary_Medical_Benefits_Coverage"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort"));
    }

    public void fillCoverageDetailsRI(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSD(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setAutoDeathBenefitsAndDisabilityCoverages(data.get("Select_Coverage_Auto_Death_Benefits_And_Disability_Coverages"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTN(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setCSLUM(data.get("Select_Coverage_CSL_UM"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUMPD(data.get("Select_Coverage_UMPD"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsVT(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsUT(Map<String, String> data) throws Throwable {
        boolean hasAPIP = false;
        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Private Passenger") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Classic Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Antique Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Exotic Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Golf Carts") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Motor Home") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Recreational Trailer") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Snowmobiles") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("All Terrain Vehicles") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Dune Buggies")) {
                hasAPIP = true;
            }
        }

        if (hasAPIP) {
            setAPIPLimits(data.get("Select_Coverage_APIP_Limits"));
        }

        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setPIPExclusionOfIncomeBenefit(data.get("Select_Coverage_PIP_Exclusion_Of_Income_Benefit"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }
        if (hasAPIP) {
            setAPIPLimits(data.get("Select_Coverage_APIP_Limits"));
        }
    }

    public void fillCoverageDetailsWI(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWV(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                    setUMPD(data.get("Select_Coverage_UMPD"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit"));
                    setUIMPD(data.get("Select_Coverage_UIM_PD"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWY(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAL(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCA(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI"));
                    setCheckHereToApplyCSLLimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_Limits"));
                    setCheckHereToApplyCSLUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_UMBI_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setCheckHereToApplySplitBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_BI_limits"));
                    setCheckHereToApplySplitUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_UMBI_limits"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCT(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    // setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits"));
                    setUMUIMSplitLimitCoverageSelection(data.get("Select_Coverage_UM_UIM_Split_Limit_Coverage_Selection"), data.get("Select_Coverage_UM_UIM_Split_Limit_Coverage_Limits"));

                }
                break;
            }
        }
    }

    public void fillCoverageDetailsDE(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection"));
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
    }

    public void fillCoverageDetailsHI(Map<String, String> data) throws Throwable {
        setOptionalBenefitsCoverage(data.get("Select_Coverage_Optional_Benefits_Coverage"));

        boolean hasPIPDed = false;

        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Private Passenger") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Classic Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Antique Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Motor Home") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Exotic Collectors Car")) {
                hasPIPDed = true;
            }
        }

        if (hasPIPDed) {
            setPIP(data.get("Select_Coverage_PIP"));
            setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
        }
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI"));
                    setCSLUIMBI(data.get("Select_Coverage_CSL_UIMBI"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options"));
                }
                break;
            }
        }
        setPIP(data.get("Select_Coverage_PIP"));
    }

    public void fillCoverageDetailsLA(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setEconomicLossUMCoverage(data.get("Select_Coverage_Economic_Loss_UM_Coverage"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMA(Map<String, String> data) throws Throwable {
        setBILimits(data.get("Select_Coverage_BI_Limits"));
        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setUMBI(data.get("Select_Coverage_UMBI"));
        setUIMBI(data.get("Select_Coverage_UIMBI"));
    }

    public void fillCoverageDetailsMD(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setPIPExclusionOfBenefits(data.get("Select_Coverage_PIP_Exclusion_OF_Benefits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                }
                break;
            }
        }
        setPIPLimits(data.get("Select_Coverage_PIP_Limits"));
    }

    public void fillCoverageDetailsME(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMS(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUMPD(data.get("Select_Coverage_UMPD"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNC(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setPUREEnhancementEndorsement(data.get("Select_Coverage_PURE_Enhancement_Endorsement"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNJ(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits"));
        setMedicalExpenseBenefitsAsSecondaryCoverage(data.get("Select_Coverage_Medical_Expense_Benefits_As_Secondary_Coverage"));
        setAPIPIncomeContinuation(data.get("Select_Coverage_APIP_Income_Continuation"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort"));
        setExtendedMedicalExpenseLimits(data.get("Select_Coverage_Extended Medical Expense Limits"));
        setDeletionOfBenefitsOtherThanMedicalExpenseBenefits(data.get("Select_Deletion_Of_Benefits_Other_Than_Medical_Expense_Benefits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNY(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setNoFaultMedicalExpenseElimination(data.get("Select_Coverage_No_Fault_Medical_Expense_Elimination"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits"));
        setSupplementalSpousalLiability(data.get("Select_Coverage_Supplemental_Spousal_Liability"));
        setNoFaultWorkReduction(data.get("Select_Coverage_No_Fault_Work_Reduction"));
        setOptionalBasicEconomicLossOBEL(data.get("Select_Coverage_Optional_Basic_Economic_Loss_OBEL"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {

            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMSUMCSLLimits(data.get("Select_Coverage_UM_SUM_CSL_Limit"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMSUMLimit(data.get("Select_Coverage_UM_SUM_Limit"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSC(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                    setUIMCSLLimit(data.get("Select_Coverage_UIM_CSL_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsVA(Map<String, String> data) throws Throwable {
        setMedicalExpense(data.get("Select_Coverage_Medical_Expense"));
        setIncomeLoss(data.get("Select_Coverage_Income_Loss"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    //setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages"));
                    setUMPDLimit(data.get("Select_Coverage_UM_PD_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsFL(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {

                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUMBICSLOptions(data.get("Select_Coverage_UMBI_CSL_Options"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setPDLimits(data.get("Select_Coverage_PD_Limits"));
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options"));

                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTX(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));
        setAutomobileDeathIndemnityAndTotalDisabilityCoverage(data.get("Select_Coverage_Automobile_Death_Indemnity_And_Total_Disability_Coverage"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {

            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));

                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                }
                break;
            }
        }
        setPIPLimits(data.get("Select_Coverage_PIP_Limits"));
    }

    public void fillCoverageDetailsGA(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMI(Map<String, String> data) throws Throwable {
        try {
            setPersonalInjuryProtectionCoordinationOfBenefits(data.get("Select_Coverage_Personal_Injury_Protection_Coordination_Of_Benefits"));
        } catch (Exception e) {
            pause(3000);
            setPersonalInjuryProtectionCoordinationOfBenefits(data.get("Select_Coverage_Personal_Injury_Protection_Coordination_Of_Benefits"));
        }
        setPersonalInjuryProtectionMedicalCoverage(data);
        setExcessAttendantCareCoverage(data.get("Select_Coverage_Excess_Attendant_Care_Coverage"));

        boolean hasMedPay = false;
        for (int i = 0; i < data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + (i + 1)).equalsIgnoreCase("Motorcycles/Mopeds/Scooters")) {
                hasMedPay = true;
            }
        }

        if (hasMedPay) {
            setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments"));
        }

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                    setPersonalInjuryProtectionCoordinationOfBenefits(data.get("Select_Coverage_Personal_Injury_Protection_Coordination_Of_Benefits"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible"));
                }
                break;
            }
        }
        setPersonalInjuryProtectionCoordinationOfBenefits(data.get("Select_Coverage_Personal_Injury_Protection_Coordination_Of_Benefits"));
    }

    public void fillCoverageDetailsID(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                    setUIMBICLSLimits(data.get("Select_Coverage_UIMBI_CSL_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWA(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUIMBI(data.get("Select_Coverage_UIMBI"));
                    saveChanges();
                    setUIMPD2(data.get("Select_Coverage_UIM_PD"));
                }
                break;
            }
        }
        saveChanges();

        boolean hasAPIP = false;
        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Private Passenger") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Classic Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Antique Collectors Car") ||
                    data.get("Vehicle_Details_Vehicle_Type_" + i).equalsIgnoreCase("Exotic Collectors Car")) {
                hasAPIP = true;
            }
        }

        if (hasAPIP) {
            setPIPAggregateFuneralIncomeLoss(data.get("Select_Coverage_PIP_Aggregate_Medical_Expense_Funeral_Expense_Income_Continuation_Loss_Of_Services"));
        }
    }

    public void fillCoverageDetailsMT(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits"));
                    saveChanges();
                    setUMBILimits(data.get("Select_Coverage_UMBI_Limits"));
                    //setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAR_END(Map<String, String> data) throws Throwable {
        setWorkLossBenefit(data.get("Select_Coverage_Work_Loss_Benefit_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMN_END(Map<String, String> data) throws Throwable {
        setBasicPIPOptions(data.get("Select_Coverage_Basic_PIP_Options_END"));
        setAPIPOptions(data.get("Select_Coverage_APIP_Option_END"));
        setCombinedPIPStacking(data.get("Select_Coverage_Combined_PIP_Stacking_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBI_UIMBICSLLimit(data.get("Select_Coverage_UMBI_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBIUIMBILimit(data.get("Select_Coverage_UMBI_UIMBI_Limit_END"));
                }
                break;
            }
        }

        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
    }

    public void fillCoverageDetailsND_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }

        setCoordinationOfBenefits(data.get("Select_Coverage_Coordination_Of_Benefits_Excess_Personal_Injury_Protection"));
        setAPIPTotalAdditionalLimits(data.get("Select_Coverage_APIP_Total_Additional_limits_Workloss_Or_Survivors_Income_Loss_Replacement_Services_Or_Survivor's_Replacement_Loss_Funeral_Expense"));

        setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments_END"));
    }

    public void fillCoverageDetailsAZ_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNE_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    satUMBIUIMBICSL(data.get("Select_Coverage_UMBI_UIMBI_CSL_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBIUIMBI(data.get("Select_Coverage_UMBI_UIMBI_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIA_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsKS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPMedicalRehabFuneralWorkServiceLimit(data.get("Select_Coverage_APIP_Medical_Expense_Rehabilitation_Expense_Funeral_Expense_Work_Loss_Essential_Service_Expense"));

        setPIPRejection(data.get("Select_Coverage_PIP_Rejection_END"));
    }

    public void fillCoverageDetailsCO_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBI(data.get("Select_Coverage_UMBI_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMO_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIN_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIL_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsKY_END(Map<String, String> data) throws Throwable {
        setTort(data.get("Select_Coverage_Tort_END"));
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPTotalOfAllAddedPIPBenefits(data.get("Select_Coverage_APIP_Total_Of_All_Added_PIP_Benefits_END"));
    }

    public void fillCoverageDetailsDC_END(Map<String, String> data) throws Throwable {
        setPIPLimitsMedicalWorkFuneral(data.get("Select_Coverage_PIP_Limits_Medical_Expense_Work_Loss_Funeral_Expense_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAK_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNH_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNM_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBI_PD(data.get("Select_Coverage_UMBI_&_PD_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNV_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOH_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOK_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOR_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductibleApplicableTo(data.get("Select_Coverage_PIP_Deductible_Applicable_To_END"));

        setUMPD(data.get("Select_Coverage_UMPD_END"));
    }

    public void fillCoverageDetailsPA_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSL(data.get("Select_Coverage_UMBI_CSL_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBI(data.get("Select_Coverage_UMBI_END"));
                }
                break;
            }
        }

        setBasicFirstPartyBenefitsCoverage(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_END"));
        if (hasValue(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_END")) && !data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_END").equalsIgnoreCase("Yes")) {
            setAddedFirstPartyBenefitsCoverage(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_END"));
            if (hasValue(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_END")) && data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_END").equalsIgnoreCase("Yes")) {
                setMedicalExpense(data.get("Select_Coverage_Medical_Expense_END"));
                setWorkLoss(data.get("Select_Coverage_Work_Loss_END"));
                setFuneralExpense(data.get("Select_Coverage_Funeral_Expense_END"));
                setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit_END"));
            } else {
                setCombinationFirstPartyBenefitsCoverage(data.get("Select_Coverage_Combination_First_Party_Benefits_Coverage_END"));
            }
        }

        setExtraordinaryMedicalBenefitsCoverage(data.get("Select_Coverage_Extraordinary_Medical_Benefits_Coverage_END"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort_END"));
    }

    public void fillCoverageDetailsRI_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSD_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setAutoDeathBenefitsAndDisabilityCoverages(data.get("Select_Coverage_Auto_Death_Benefits_And_Disability_Coverages_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTN_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
                switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                    case "Combined Single Limit (CSL)": {
                        setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                        setCSLUM(data.get("Select_Coverage_CSL_UM_END"));
                    }
                    break;
                    case "Split Limit":
                    case "Split limit": {
                        setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                        saveChanges();
                        setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                        setUMPD(data.get("Select_Coverage_UMPD_END"));
                    }
                    break;
                }
            }
        }
    }

    public void fillCoverageDetailsVT_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsUT_END(Map<String, String> data) throws Throwable {
        setAPIPLimits(data.get("Select_Coverage_APIP_Limits_END"));

        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setPIPExclusionOfIncomeBenefit(data.get("Select_Coverage_PIP_Exclusion_Of_Income_Benefit_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWI_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWV_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_END"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_END"));
                    setUIMPD(data.get("Select_Coverage_UIM_PD_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWY_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAL_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCA_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_END"));
                    setCheckHereToApplyCSLLimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_Limits_END"));
                    setCheckHereToApplyCSLUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_UMBI_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setCheckHereToApplySplitBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_BI_limits_END"));
                    setCheckHereToApplySplitUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_UMBI_limits_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCT_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection_END"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection_END"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsDE_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection_END"));
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
    }

    public void fillCoverageDetailsHI_END(Map<String, String> data) throws Throwable {
        setOptionalBenefitsCoverage(data.get("Select_Coverage_Optional_Benefits_Coverage"));

        setPIP(data.get("Select_Coverage_PIP_END"));
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_END"));
                    setCSLUIMBI(data.get("Select_Coverage_CSL_UIMBI_END"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsLA_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setEconomicLossUMCoverage(data.get("Select_Coverage_Economic_Loss_UM_Coverage_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMA_END(Map<String, String> data) throws Throwable {
        setBILimits(data.get("Select_Coverage_BI_Limits_END"));
        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setUMBI(data.get("Select_Coverage_UMBI_END"));
        setUIMBI(data.get("Select_Coverage_UIMBI_END"));
    }

    public void fillCoverageDetailsMD_END(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setPIPExclusionOfBenefits(data.get("Select_Coverage_PIP_Exclusion_OF_Benefits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                }
                break;
            }
        }

    }

    public void fillCoverageDetailsME_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNC_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setPUREEnhancementEndorsement(data.get("Select_Coverage_PURE_Enhancement_Endorsement_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNJ_END(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_END"));
        setMedicalExpenseBenefitsAsSecondaryCoverage(data.get("Select_Coverage_Medical_Expense_Benefits_As_Secondary_Coverage_END"));
        setAPIPIncomeContinuation(data.get("Select_Coverage_APIP_Income_Continuation_END"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort_END"));
        setExtendedMedicalExpenseLimits(data.get("Select_Coverage_Extended Medical Expense Limits_END"));
        setDeletionOfBenefitsOtherThanMedicalExpenseBenefits(data.get("Select_Deletion_Of_Benefits_Other_Than_Medical_Expense_Benefits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNY_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setNoFaultMedicalExpenseElimination(data.get("Select_Coverage_No_Fault_Medical_Expense_Elimination_END"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits_END"));
        setSupplementalSpousalLiability(data.get("Select_Coverage_Supplemental_Spousal_Liability_END"));
        setNoFaultWorkReduction(data.get("Select_Coverage_No_Fault_Work_Reduction_END"));
        setOptionalBasicEconomicLossOBEL(data.get("Select_Coverage_Optional_Basic_Economic_Loss_OBEL_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMSUMCSLLimits(data.get("Select_Coverage_UM_SUM_CSL_Limit_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMSUMLimit(data.get("Select_Coverage_UM_SUM_Limit_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSC_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsVA_END(Map<String, String> data) throws Throwable {
        setMedicalExpense(data.get("Select_Coverage_Medical_Expense_END"));
        setIncomeLoss(data.get("Select_Coverage_Income_Loss_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages_END"));
                    setUMPDLimit(data.get("Select_Coverage_UM_PD_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsFL_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {

                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUMBICSLOptions(data.get("Select_Coverage_UMBI_CSL_Options_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setPDLimits(data.get("Select_Coverage_PD_Limits_END"));
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options_END"));

                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTX_END(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));
        setAutomobileDeathIndemnityAndTotalDisabilityCoverage(data.get("Select_Coverage_Automobile_Death_Indemnity_And_Total_Disability_Coverage_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));

                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsGA_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_END"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button_END"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_END"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button_END"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMI_END(Map<String, String> data) throws Throwable {
        setPersonalInjuryProtectionCoordinationOfBenefits(data.get("Select_Coverage_Personal_Injury_Protection_Coordination_Of_Benefits_END"));
        setPersonalInjuryProtectionMedicalCoverage(data);
        setExcessAttendantCareCoverage(data.get("Select_Coverage_Excess_Attendant_Care_Coverage_END"));

        setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsID_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                    setUIMBICLSLimits(data.get("Select_Coverage_UIMBI_CSL_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWA_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUIMBI(data.get("Select_Coverage_UIMBI_END"));
                    setUIMPD(data.get("Select_Coverage_UIM_PD_END"));
                }
                break;
            }
        }
        saveChanges();

        setPIPAggregateFuneralIncomeLoss(data.get("Select_Coverage_PIP_Aggregate_Medical_Expense_Funeral_Expense_Income_Continuation_Loss_Of_Services_END"));
    }

    public void fillCoverageDetailsMT_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_END"));
                    saveChanges();
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAR_OOS_END(Map<String, String> data) throws Throwable {
        setWorkLossBenefit(data.get("Select_Coverage_Work_Loss_Benefit_OOS_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMN_OOS_END(Map<String, String> data) throws Throwable {
        setBasicPIPOptions(data.get("Select_Coverage_Basic_PIP_Options_OOS_END"));
        setAPIPOptions(data.get("Select_Coverage_APIP_Option_OOS_END"));
        setCombinedPIPStacking(data.get("Select_Coverage_Combined_PIP_Stacking_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBI_UIMBICSLLimit(data.get("Select_Coverage_UMBI_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBIUIMBILimit(data.get("Select_Coverage_UMBI_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }

        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
    }

    public void fillCoverageDetailsND_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }

        setCoordinationOfBenefits(data.get("Select_Coverage_Coordination_Of_Benefits_Excess_Personal_Injury_Protection"));
        setAPIPTotalAdditionalLimits(data.get("Select_Coverage_APIP_Total_Additional_limits_Workloss_Or_Survivors_Income_Loss_Replacement_Services_Or_Survivor's_Replacement_Loss_Funeral_Expense"));

        setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments_OOS_END"));
    }

    public void fillCoverageDetailsAZ_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNE_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    satUMBIUIMBICSL(data.get("Select_Coverage_UMBI_UIMBI_CSL_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBIUIMBI(data.get("Select_Coverage_UMBI_UIMBI_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIA_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsKS_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPMedicalRehabFuneralWorkServiceLimit(data.get("Select_Coverage_APIP_Medical_Expense_Rehabilitation_Expense_Funeral_Expense_Work_Loss_Essential_Service_Expense"));

        setPIPRejection(data.get("Select_Coverage_PIP_Rejection_OOS_END"));
    }

    public void fillCoverageDetailsCO_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBI(data.get("Select_Coverage_UMBI_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMO_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIN_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIL_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsKY_OOS_END(Map<String, String> data) throws Throwable {
        setTort(data.get("Select_Coverage_Tort_OOS_END"));
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPTotalOfAllAddedPIPBenefits(data.get("Select_Coverage_APIP_Total_Of_All_Added_PIP_Benefits_OOS_END"));
    }

    public void fillCoverageDetailsDC_OOS_END(Map<String, String> data) throws Throwable {
        setPIPLimitsMedicalWorkFuneral(data.get("Select_Coverage_PIP_Limits_Medical_Expense_Work_Loss_Funeral_Expense_OOS_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAK_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNH_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNM_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBI_PD(data.get("Select_Coverage_UMBI_&_PD_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNV_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOH_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOK_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOR_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductibleApplicableTo(data.get("Select_Coverage_PIP_Deductible_Applicable_To_OOS_END"));

        setUMPD(data.get("Select_Coverage_UMPD_OOS_END"));
    }

    public void fillCoverageDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSL(data.get("Select_Coverage_UMBI_CSL_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBI(data.get("Select_Coverage_UMBI_OOS_END"));
                }
                break;
            }
        }

        setBasicFirstPartyBenefitsCoverage(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_OOS_END"));
        if (hasValue(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_OOS_END")) && !data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_OOS_END").equalsIgnoreCase("Yes")) {
            setAddedFirstPartyBenefitsCoverage(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_OOS_END"));
            if (hasValue(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_OOS_END")) && data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_OOS_END").equalsIgnoreCase("Yes")) {
                setMedicalExpense(data.get("Select_Coverage_Medical_Expense_OOS_END"));
                setWorkLoss(data.get("Select_Coverage_Work_Loss_OOS_END"));
                setFuneralExpense(data.get("Select_Coverage_Funeral_Expense_OOS_END"));
                setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit_OOS_END"));
            } else {
                setCombinationFirstPartyBenefitsCoverage(data.get("Select_Coverage_Combination_First_Party_Benefits_Coverage_OOS_END"));
            }
        }

        setExtraordinaryMedicalBenefitsCoverage(data.get("Select_Coverage_Extraordinary_Medical_Benefits_Coverage_OOS_END"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort_OOS_END"));
    }

    public void fillCoverageDetailsRI_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSD_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setAutoDeathBenefitsAndDisabilityCoverages(data.get("Select_Coverage_Auto_Death_Benefits_And_Disability_Coverages_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTN_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setCSLUM(data.get("Select_Coverage_CSL_UM_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsVT_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsUT_OOS_END(Map<String, String> data) throws Throwable {
        setAPIPLimits(data.get("Select_Coverage_APIP_Limits_OOS_END"));

        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setPIPExclusionOfIncomeBenefit(data.get("Select_Coverage_PIP_Exclusion_Of_Income_Benefit_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWI_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWV_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_OOS_END"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_OOS_END"));
                    setUIMPD(data.get("Select_Coverage_UIM_PD_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWY_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAL_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCA_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_OOS_END"));
                    setCheckHereToApplyCSLLimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_Limits_OOS_END"));
                    setCheckHereToApplyCSLUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_UMBI_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setCheckHereToApplySplitBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_BI_limits_OOS_END"));
                    setCheckHereToApplySplitUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_UMBI_limits_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCT_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection_OOS_END"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection_OOS_END"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsDE_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection_OOS_END"));
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
    }

    public void fillCoverageDetailsHI_OOS_END(Map<String, String> data) throws Throwable {
        setOptionalBenefitsCoverage(data.get("Select_Coverage_Optional_Benefits_Coverage"));

        setPIP(data.get("Select_Coverage_PIP_OOS_END"));
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_OOS_END"));
                    setCSLUIMBI(data.get("Select_Coverage_CSL_UIMBI_OOS_END"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsLA_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setEconomicLossUMCoverage(data.get("Select_Coverage_Economic_Loss_UM_Coverage_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMA_OOS_END(Map<String, String> data) throws Throwable {
        setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setUMBI(data.get("Select_Coverage_UMBI_OOS_END"));
        setUIMBI(data.get("Select_Coverage_UIMBI_OOS_END"));
    }

    public void fillCoverageDetailsMD_OOS_END(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_OOS_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setPIPExclusionOfBenefits(data.get("Select_Coverage_PIP_Exclusion_OF_Benefits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsME_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMS_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUMPD(data.get("Select_Coverage_UMPD_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNC_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setPUREEnhancementEndorsement(data.get("Select_Coverage_PURE_Enhancement_OOS_Endorsement_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNJ_OOS_END(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_OOS_END"));
        setMedicalExpenseBenefitsAsSecondaryCoverage(data.get("Select_Coverage_Medical_Expense_Benefits_As_Secondary_Coverage_OOS_END"));
        setAPIPIncomeContinuation(data.get("Select_Coverage_APIP_Income_Continuation_OOS_END"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort_OOS_END"));
        setExtendedMedicalExpenseLimits(data.get("Select_Coverage_Extended Medical Expense Limits_OOS_END"));
        setDeletionOfBenefitsOtherThanMedicalExpenseBenefits(data.get("Select_Deletion_Of_Benefits_Other_Than_Medical_Expense_Benefits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNY_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setNoFaultMedicalExpenseElimination(data.get("Select_Coverage_No_Fault_Medical_Expense_Elimination_OOS_END"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits_OOS_END"));
        setSupplementalSpousalLiability(data.get("Select_Coverage_Supplemental_Spousal_Liability_OOS_END"));
        setNoFaultWorkReduction(data.get("Select_Coverage_No_Fault_Work_Reduction_OOS_END"));
        setOptionalBasicEconomicLossOBEL(data.get("Select_Coverage_Optional_Basic_Economic_Loss_OBEL_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMSUMCSLLimits(data.get("Select_Coverage_UM_SUM_CSL_Limit_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMSUMLimit(data.get("Select_Coverage_UM_SUM_Limit_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSC_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsVA_OOS_END(Map<String, String> data) throws Throwable {
        setMedicalExpense(data.get("Select_Coverage_Medical_Expense_OOS_END"));
        setIncomeLoss(data.get("Select_Coverage_Income_Loss_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages_OOS_END"));
                    setUMPDLimit(data.get("Select_Coverage_UM_PD_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsFL_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {

                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUMBICSLOptions(data.get("Select_Coverage_UMBI_CSL_Options_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setPDLimits(data.get("Select_Coverage_PD_Limits_OOS_END"));
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options_OOS_END"));

                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTX_OOS_END(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_OOS_END"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));
        setAutomobileDeathIndemnityAndTotalDisabilityCoverage(data.get("Select_Coverage_Automobile_Death_Indemnity_And_Total_Disability_Coverage_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));

                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsGA_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_OOS_END"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button_OOS_END"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_OOS_END"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button_OOS_END"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMI_OOS_END(Map<String, String> data) throws Throwable {
        setPersonalInjuryProtectionCoordinationOfBenefits(data.get("Select_Coverage_Personal_Injury_Protection_Coordination_Of_Benefits_OOS_END"));
        setPersonalInjuryProtectionMedicalCoverage(data);
        setExcessAttendantCareCoverage(data.get("Select_Coverage_Excess_Attendant_Care_Coverage_OOS_END"));

        setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_OOS_END"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsID_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                    setUIMBICLSLimits(data.get("Select_Coverage_UIMBI_CSL_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_OOS_END"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWA_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUIMBI(data.get("Select_Coverage_UIMBI_OOS_END"));
                    setUIMPD(data.get("Select_Coverage_UIM_PD_OOS_END"));
                }
                break;
            }
        }
        saveChanges();

        setPIPAggregateFuneralIncomeLoss(data.get("Select_Coverage_PIP_Aggregate_Medical_Expense_Funeral_Expense_Income_Continuation_Loss_Of_Services_OOS_END"));
    }

    public void fillCoverageDetailsMT_OOS_END(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_OOS_END"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_OOS_END")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_OOS_END"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_OOS_END"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_OOS_END"));
                    saveChanges();
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_OOS_END"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAR_RNW(Map<String, String> data) throws Throwable {
        setWorkLossBenefit(data.get("Select_Coverage_Work_Loss_Benefit_RNW"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUMPD(data.get("Select_Coverage_UMPD_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMN_RNW(Map<String, String> data) throws Throwable {
        setBasicPIPOptions(data.get("Select_Coverage_Basic_PIP_Options_RNW"));
        setAPIPOptions(data.get("Select_Coverage_APIP_Option_RNW"));
        setCombinedPIPStacking(data.get("Select_Coverage_Combined_PIP_Stacking_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBI_UIMBICSLLimit(data.get("Select_Coverage_UMBI_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBIUIMBILimit(data.get("Select_Coverage_UMBI_UIMBI_Limit_RNW"));
                }
                break;
            }
        }

        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
    }

    public void fillCoverageDetailsND_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }

        setCoordinationOfBenefits(data.get("Select_Coverage_Coordination_Of_Benefits_Excess_Personal_Injury_Protection"));
        setAPIPTotalAdditionalLimits(data.get("Select_Coverage_APIP_Total_Additional_limits_Workloss_Or_Survivors_Income_Loss_Replacement_Services_Or_Survivor's_Replacement_Loss_Funeral_Expense"));

        setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments_RNW"));
    }

    public void fillCoverageDetailsAZ_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNE_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    satUMBIUIMBICSL(data.get("Select_Coverage_UMBI_UIMBI_CSL_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBIUIMBI(data.get("Select_Coverage_UMBI_UIMBI_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIA_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsKS_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPMedicalRehabFuneralWorkServiceLimit(data.get("Select_Coverage_APIP_Medical_Expense_Rehabilitation_Expense_Funeral_Expense_Work_Loss_Essential_Service_Expense"));

        setPIPRejection(data.get("Select_Coverage_PIP_Rejection_RNW"));
    }

    public void fillCoverageDetailsCO_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBI(data.get("Select_Coverage_UMBI_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMO_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIN_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsIL_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsKY_RNW(Map<String, String> data) throws Throwable {
        setTort(data.get("Select_Coverage_Tort_RNW"));
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }

        saveChanges();
        setAPIPTotalOfAllAddedPIPBenefits(data.get("Select_Coverage_APIP_Total_Of_All_Added_PIP_Benefits_RNW"));
    }

    public void fillCoverageDetailsDC_RNW(Map<String, String> data) throws Throwable {
        setPIPLimitsMedicalWorkFuneral(data.get("Select_Coverage_PIP_Limits_Medical_Expense_Work_Loss_Funeral_Expense_RNW"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAK_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNH_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMUIM_BILimit(data.get("Select_Coverage_UM_UIM_BI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNM_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBI_PD(data.get("Select_Coverage_UMBI_&_PD_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUMPD(data.get("Select_Coverage_UMPD_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNV_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMUIMBI(data.get("Select_Coverage_UM_UIMBI_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOH_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOK_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsOR_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductibleApplicableTo(data.get("Select_Coverage_PIP_Deductible_Applicable_To_RNW"));

        setUMPD(data.get("Select_Coverage_UMPD_RNW"));
    }

    public void fillCoverageDetailsPA_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSL(data.get("Select_Coverage_UMBI_CSL_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBI(data.get("Select_Coverage_UMBI_RNW"));
                }
                break;
            }
        }

        setBasicFirstPartyBenefitsCoverage(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_RNW"));
        if (hasValue(data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_RNW")) && !data.get("Select_Coverage_Basic_First_Party_Benefits_Coverage_RNW").equalsIgnoreCase("Yes")) {
            setAddedFirstPartyBenefitsCoverage(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_RNW"));
            if (hasValue(data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_RNW")) && data.get("Select_Coverage_Added_First_Party_Benefits_Coverage_RNW").equalsIgnoreCase("Yes")) {
                setMedicalExpense(data.get("Select_Coverage_Medical_Expense_RNW"));
                setWorkLoss(data.get("Select_Coverage_Work_Loss_RNW"));
                setFuneralExpense(data.get("Select_Coverage_Funeral_Expense_RNW"));
                setAccidentalDeathBenefit(data.get("Select_Coverage_Accidental_Death_Benefit_RNW"));
            } else {
                setCombinationFirstPartyBenefitsCoverage(data.get("Select_Coverage_Combination_First_Party_Benefits_Coverage_RNW"));
            }
        }

        setExtraordinaryMedicalBenefitsCoverage(data.get("Select_Coverage_Extraordinary_Medical_Benefits_Coverage_RNW"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort_RNW"));
    }

    public void fillCoverageDetailsRI_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSD_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setAutoDeathBenefitsAndDisabilityCoverages(data.get("Select_Coverage_Auto_Death_Benefits_And_Disability_Coverages_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTN_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setCSLUM(data.get("Select_Coverage_CSL_UM_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUMPD(data.get("Select_Coverage_UMPD_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsVT_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsUT_RNW(Map<String, String> data) throws Throwable {
        setAPIPLimits(data.get("Select_Coverage_APIP_Limits_RNW"));

        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setPIPExclusionOfIncomeBenefit(data.get("Select_Coverage_PIP_Exclusion_Of_Income_Benefit_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWI_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWV_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                    setUMPD(data.get("Select_Coverage_UMPD_RNW"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_RNW"));
                    setUIMPD(data.get("Select_Coverage_UIM_PD_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWY_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICSLLimit(data.get("Select_Coverage_UIMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsAL_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCA_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_RNW"));
                    setCheckHereToApplyCSLLimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_Limits_RNW"));
                    setCheckHereToApplyCSLUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_CSL_UMBI_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setCheckHereToApplySplitBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_BI_limits_RNW"));
                    setCheckHereToApplySplitUMBILimits(data.get("Select_Coverage_Check_Here_To_Apply_Split_UMBI_limits_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsCT_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection_RNW"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMUIMCSLCoverageSelection(data.get("Select_Coverage_UM_UIM_CSL_Coverage_Selection_RNW"), data.get("Select_Coverage_UM_UIM_CSL_Coverage_Limits_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsDE_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setAddedPersonalInjuryProtection(data.get("Select_Coverage_Added_Personal_Injury_Protection_RNW"));
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                }
                break;
            }
        }

        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
    }

    public void fillCoverageDetailsHI_RNW(Map<String, String> data) throws Throwable {
        setOptionalBenefitsCoverage(data.get("Select_Coverage_Optional_Benefits_Coverage"));

        setPIP(data.get("Select_Coverage_PIP_RNW"));
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_RNW"));
                    setCSLUIMBI(data.get("Select_Coverage_CSL_UIMBI_RNW"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                    setCSLUMBIUIMBIOptions(data.get("Select_Coverage_CSL_UMBI_UIMBI_Options_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsLA_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setEconomicLossUMCoverage(data.get("Select_Coverage_Economic_Loss_UM_Coverage_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMA_RNW(Map<String, String> data) throws Throwable {
        setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
        saveChanges();
        setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setUMBI(data.get("Select_Coverage_UMBI_RNW"));
        setUIMBI(data.get("Select_Coverage_UIMBI_RNW"));
    }

    public void fillCoverageDetailsMD_RNW(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_RNW"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setPIPExclusionOfBenefits(data.get("Select_Coverage_PIP_Exclusion_OF_Benefits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsME_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setCSLUMBI(data.get("Select_Coverage_CSL_UMBI_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMS_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUMPD(data.get("Select_Coverage_UMPD_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNC_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setPUREEnhancementEndorsement(data.get("Select_Coverage_PURE_Enhancement_RNWorsement_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNJ_RNW(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_RNW"));
        setMedicalExpenseBenefitsAsSecondaryCoverage(data.get("Select_Coverage_Medical_Expense_Benefits_As_Secondary_Coverage_RNW"));
        setAPIPIncomeContinuation(data.get("Select_Coverage_APIP_Income_Continuation_RNW"));
        setDoYouWishToPurchaseLimitedTortOrFullTort(data.get("Select_Coverage_Do_You_Wish_To_Purchase_Limited_Tort_Or_Full_Tort_RNW"));
        setExtendedMedicalExpenseLimits(data.get("Select_Coverage_Extended Medical Expense Limits_RNW"));
        setDeletionOfBenefitsOtherThanMedicalExpenseBenefits(data.get("Select_Deletion_Of_Benefits_Other_Than_Medical_Expense_Benefits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMUIMCSLLimit(data.get("Select_Coverage_UM_UIM_CSL_Limit_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsNY_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setNoFaultMedicalExpenseElimination(data.get("Select_Coverage_No_Fault_Medical_Expense_Elimination_RNW"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits_RNW"));
        setSupplementalSpousalLiability(data.get("Select_Coverage_Supplemental_Spousal_Liability_RNW"));
        setNoFaultWorkReduction(data.get("Select_Coverage_No_Fault_Work_Reduction_RNW"));
        setOptionalBasicEconomicLossOBEL(data.get("Select_Coverage_Optional_Basic_Economic_Loss_OBEL_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMSUMCSLLimits(data.get("Select_Coverage_UM_SUM_CSL_Limit_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMSUMLimit(data.get("Select_Coverage_UM_SUM_Limit_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsSC_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                    setUIMLimit(data.get("Select_Coverage_UIM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsVA_RNW(Map<String, String> data) throws Throwable {
        setMedicalExpense(data.get("Select_Coverage_Medical_Expense_RNW"));
        setIncomeLoss(data.get("Select_Coverage_Income_Loss_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                    setUMCoverages(data.get("Select_Coverage_UM_Coverages_RNW"));
                    setUMPDLimit(data.get("Select_Coverage_UM_PD_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsFL_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setAdditionalPIPLimits(data.get("Select_Coverage_Additional_PIP_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {

                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUMBICSLOptions(data.get("Select_Coverage_UMBI_CSL_Options_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limits": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setPDLimits(data.get("Select_Coverage_PD_Limits_RNW"));
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                    setPIPOptions(data.get("Select_Coverage_PIP_Options_RNW"));

                }
                break;
            }
        }
    }

    public void fillCoverageDetailsTX_RNW(Map<String, String> data) throws Throwable {
        setPIPLimits(data.get("Select_Coverage_PIP_Limits_RNW"));
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));
        setAutomobileDeathIndemnityAndTotalDisabilityCoverage(data.get("Select_Coverage_Automobile_Death_Indemnity_And_Total_Disability_Coverage_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));

                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsGA_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMCSLLimit(data.get("Select_Coverage_UM_CSL_Limit_RNW"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button_RNW"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMLimit(data.get("Select_Coverage_UM_Limit_RNW"));
                    setUMCoveragesRadioButton(data.get("Select_Coverage_UM_Coverages_Radio_Button_RNW"));
                    setUMDeductible(data.get("Select_Coverage_UM_Deductible_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsMI_RNW(Map<String, String> data) throws Throwable {
        setPersonalInjuryProtectionCoordinationOfBenefits(data.get("Select_Coverage_Personal_Injury_Protection_Coordination_Of_Benefits_RNW"));
        setPersonalInjuryProtectionMedicalCoverage(data);
        setExcessAttendantCareCoverage(data.get("Select_Coverage_Excess_Attendant_Care_Coverage_RNW"));

        setMotorMedicalPayments(data.get("Select_Coverage_Motor_Medical_Payments_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUM_UIMLimit(data.get("Select_Coverage_UM_UIM_Limit_RNW"));
                    setPIPDeductible(data.get("Select_Coverage_PIP_Deductible_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsID_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                    setUIMBICLSLimits(data.get("Select_Coverage_UIMBI_CSL_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUMBILimit(data.get("Select_Coverage_UMBI_Limit_RNW"));
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void fillCoverageDetailsWA_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUIMCSLLimits(data.get("Select_Coverage_UIM_CSL_Limits_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUIMBI(data.get("Select_Coverage_UIMBI_RNW"));
                    setUIMPD(data.get("Select_Coverage_UIM_PD_RNW"));
                }
                break;
            }
        }
        saveChanges();

        setPIPAggregateFuneralIncomeLoss(data.get("Select_Coverage_PIP_Aggregate_Medical_Expense_Funeral_Expense_Income_Continuation_Loss_Of_Services_RNW"));
    }

    public void fillCoverageDetailsMT_RNW(Map<String, String> data) throws Throwable {
        setMedPayLimits(data.get("Select_Coverage_MedPay_Limits_RNW"));

        if (hasValue(data.get("Select_Coverage_Combined_Or_Split_Limits_RNW"))) {
            switch (data.get("Select_Coverage_Combined_Or_Split_Limits_RNW")) {
                case "Combined Single Limit (CSL)": {
                    setCSLLimits(data.get("Select_Coverage_CSL_Limits_RNW"));
                    setUMBICSLLimit(data.get("Select_Coverage_UMBI_CSL_Limit_RNW"));
                }
                break;
                case "Split Limit":
                case "Split limit": {
                    setBILimits(data.get("Select_Coverage_BI_Limits_RNW"));
                    saveChanges();
                    setUIMBILimit(data.get("Select_Coverage_UIMBI_Limit_RNW"));
                }
                break;
            }
        }
    }

    public void setUMUIMCSLCoverageSelection(String selection, String limit) {
        typeTextEnter(UMUIMCSLCoverageSelection, selection, "UM UIM CSL Coverage Selection");
        if (selection.equalsIgnoreCase("UM/UIM CSL Standard")) {
            typeTextEnter(UMUIMCSLStandardCoverageLimits, limit, "UM UIM CSL Standard Coverage Limits");
        } else {
            typeTextEnter(UMUIMCSLConversionCoverageLimits, limit, "UM UIM CSL Conversion Coverage Limits");
        }
    }

    public void setOptionalBenefitsCoverage(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(optionalBenefitsCoverage, value);
        saveChanges();
    }

    public void setGolfCartMedPayLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(golfCartMedPayLimit, value);
        saveChanges();
    }

    public void setMotorcycleMedPayLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(motorcycleMedPayLimit, value);
        saveChanges();
    }

    public void setSnowmobileMedPayLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(snowmobileMedPayLimit, value);
        saveChanges();
    }

    public void setATVMedPayLimit(Map<String, String> data) throws Throwable {
        boolean match = false;
        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            if (data.get("Vehicle_Type_" + i).equalsIgnoreCase("ATVs") || data.get("Vehicle_Type_" + i).equalsIgnoreCase("All Terrain Vehicles")) {
                match = true;
            }
        }
        if (match) {
            clickElement(selectCoveragesBlock);
            typeText(atvMedPayLimit, data.get("ATV_Med_Pay_Limit"));
            saveChanges();
        }
    }

    public void setCombinedOrSplitLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeTextEnter(combinedAndSplitLimits, value, "Combined And Split Limits");
        saveChanges();
    }

    public void setUMPDCollectorVehicle(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(umpdCollectorVehicle, value);
        saveChanges();
    }

    public void setSplitLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(splitLimits, value);
        saveChanges();
    }

    public void setTort(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(tort, value);
        saveChanges();
    }

    public void setPersonalInjuryProtectionMedicalCoverage(Map<String, String> data) throws Throwable {
        if ((hasValue(data.get("Select_Coverage_Personal_Injury_Protection_Medical_Coverage")) && data.get("Select_Coverage_Personal_Injury_Protection_Medical_Coverage").equalsIgnoreCase("Option 4: 250,000 with exclusions - All household members are covered by qualified health coverage")) ||
                (hasValue(data.get("Select_Coverage_Personal_Injury_Protection_Medical_Coverage")) && data.get("Select_Coverage_Personal_Injury_Protection_Medical_Coverage").equalsIgnoreCase("Option 4: 250,000 with exclusions - One or more household members not covered by qualified health coverage"))) {

            int num = 0;
            if (hasValue(data.get("Select_Coverage_Excluded_Persons"))) {
                num = Integer.parseInt(data.get("Select_Coverage_Excluded_Persons"));
            }
            for (int i = 0; i < num; i++) {
                clickAdd();
                enterFullNameOfEachExcludedPersonOnThePolicy(data.get("Select_Coverage_Full_Name_Of_Each_Excluded_Person_On_The_Policy").split(",")[i], i);
                enterDOB(data.get("Select_Coverage_Date_Of_Birth").split(",")[i], i);
            }
        } else {
            clickElement(selectCoveragesBlock);
            setPersonalInjuryProtectionMedicalCoverage(data.get("Select_Coverage_Personal_Injury_Protection_Medical_Coverage"));
            saveChanges();
        }
    }

    public void setPersonalInjuryProtectionMedicalCoverage(String value) {
        typeText(personalInjuryProtectionMedicalCoverage, value, "Personal injury protection medical coverage");
    }

    public void enterDOB(String value, int i) {
        clickElement(dob.get(i), "DOB");
        driver.switchTo().activeElement().sendKeys(value);
    }

    public void enterFullNameOfEachExcludedPersonOnThePolicy(String value, int i) {
        clickElement(fullName.get(i), "Full Name");
        driver.switchTo().activeElement().sendKeys(value);
    }

    public void clickAdd() {
        clickElement(add, "Add");
    }

    public void setUIMBICLSLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UIMBICSLLimits, value);
        saveChanges();
    }

    public void setUIMBICLSLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UIMBICSLLimit, value);
        saveChanges();
    }

    public void setCoordinationOfBenefits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(coordinationOfBenefits, value);
        saveChanges();
    }

    public void setLimitedOrFullTort(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(limittedOrFullTort, value);
        saveChanges();
    }

    public void setWorkLoss(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(workLoss, value);
        saveChanges();
    }

    public void setWorkLossBenefit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        choose(workLossBenefitYes, workLossBenefitNo, value, "Work Loss Benefit");
        saveChanges();
    }

    public void setAccidentalDeathBenefit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        choose(accidentalDeathBenefitYes, accidentalDeathBenefitNo, value, "Accidental Death Benefit");
        saveChanges();
    }

    public void setPIPExclusionOfBenefits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(PIPExclusionOfBenefits, value, "PIP Exclusion Of Benefits");
        saveChanges();
    }

    public void setCheckHereToApplyCSLLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(applyCSLLimit, value, "Check Here To Apply CSL Limits");
        saveChanges();
    }

    public void setExcessAttendantCareCoverage(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        choose(excessAttendantCareCoverageYes, excessAttendantCareCoverageNo, value, "Excess Attendant Care Coverage");
        saveChanges();
    }

    public void setCheckHereToApplyCSLUMBILimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(applyCSLUMBILimits, value, "Check Here To Apply CSL UMBI Limits");
        saveChanges();
    }

    public void setCheckHereToApplySplitUMBILimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(checkHereToApplySplitUMBILimits, value, "Check Here To Apply Split UMBI Limits");
        saveChanges();
    }

    public void setCheckHereToApplySplitBILimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(checkHereToApplySplitBILimits, value, "Check Here To Apply Split BI Limits");
        saveChanges();
    }

    public void setPIPLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(PIPLimits, value);
        saveChanges();
    }

    public void setMedicalExpenseBenefitsAsSecondaryCoverage(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(medicalExpenseBenefitsAsSecondaryCoverage, value);
        saveChanges();
    }

    public void setAPIPIncomeContinuation(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(APIPIncomeContinuation, value);
        saveChanges();
    }

    public void setFuneralExpense(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(funeralExpense, value);
        saveChanges();
    }

    public void setMedicalExpense(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(medicalExpense, value);
        saveChanges();
    }

    public void setCombinationFirstPartyBenefitsCoverage(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(combinationFirstPartyBenefitsCoverage, value);
        saveChanges();
    }

    public void setExtraordinaryMedicalBenefitsCoverage(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(extraordinaryMedicalBenefitsCoverage, value);
        saveChanges();
    }

    public void setUMBICSL(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBICSL, value);
        saveChanges();
    }

    public void setDoYouWishToPurchaseLimitedTortOrFullTort(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(DoYouWishToPurchaseLimitedTortOrFullTort, value);
        saveChanges();
    }

    public void setPIPDeductibleApplicableTo(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeTextEnter(pipDeductibleApplicableTo, value, "PIP Deductible Applicable To");
        if (!pipDeductibleApplicableTo.getAttribute("value").equalsIgnoreCase(value)) {
            setAttributeValue(pipDeductibleApplicableTo, "value", value);
        }
        saveChanges();
    }

    public void setAPIPTotalWorklossReplacementFuneral(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        setAttributeValue(apipTotalWorklossReplacementFuneral, "value", value);
        apipTotalWorklossReplacementFuneral.click();
        apipTotalWorklossReplacementFuneral.clear();
        apipTotalWorklossReplacementFuneral.sendKeys(value);
        apipTotalWorklossReplacementFuneral.sendKeys(Keys.ENTER);
        pause(4000);
        saveChanges();
    }

    public void setUMBICSLLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBICSLLimit, value);
        saveChanges();
    }

    public void setUMBICSLOptions(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBICSLOptions, value);
        saveChanges();
    }

    public void setUMCoverages(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(selectCoveragesBlock);
            typeText(UMCoverages, value);
            saveChanges();
        }
    }

    public void setEconomicLossUMCoverage(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(EconomicLossUMCoverage, value);
        saveChanges();
    }

    public void setPIPExclusionOfIncomeBenefit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        choose(PIPExclusionOfIncomeBenefitYes, PIPExclusionOfIncomeBenefitNo, value, "PIP Exclusion Of Income Benefit");
        saveChanges();
    }

    public void setUIMBICSLLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UIMBICSLLimit, value);
        saveChanges();
    }

    public void setAPIPTotalAdditionalLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(APIPTotalAdditionalLimits, value);
        saveChanges();
    }

    public void setAPIPMedicalRehabFuneralWorkServiceLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeTextEnter(APIPMedicalRehabFuneralWorkServiceLimit, value, "APIP Medical Rehab Funeral Work Service Limit");
        saveChanges();
    }

    public void setCSLLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(CSLLimits, value);
        saveChanges();
    }

    public void setPersonalInjuryProtectionCoordinationOfBenefits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        pause(2000);
        typeText(personalInjuryProtectionCoordinationOfBenefits, value);
        saveChanges();
    }

    public void setNoFaultMedicalExpenseElimination(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(noFaultMedicalExpenseElimination, value);
        saveChanges();
    }

    public void setUMSUMCSLLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMSUMCSLLimits, value);
        saveChanges();
    }

    public void setSupplementalSpousalLiability(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(supplementalSpousalLiability, value, "Supplemental Spousal Liability");
        saveChanges();
    }

    public void setNoFaultWorkReduction(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(noFaultWorkReduction, value, "No Fault Work Reduction");
        saveChanges();
    }

    public void setOptionalBasicEconomicLossOBEL(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        checkCheckbox(optionalBasicEconomicLossOBEL, value, "Optional Basic Economic Loss OBEL");
        saveChanges();
    }

    public void setAddedPersonalInjuryProtection(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(AddedPersonalInjuryProtection, value);
        saveChanges();
    }

    public void setUMUIMBI(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMUIMBI, value);
        saveChanges();
    }

    public void setAPIPTotalOfAllAddedPIPBenefits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeTextEnter(APIPTotalOfAllAddedPIPBenefits, value, "APIP Total Of All Added PIP Benefits");
        saveChanges();
    }

    public void setBasicPIPOptions(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(basicPIPOptions, value);
        saveChanges();
    }

    public void setUMBIUIMBILimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBIUIMBILimit, value);
        saveChanges();
    }

    public void setUMBI_UIMBICSLLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBI_UIMBICSLLimit, value);
        saveChanges();
    }

    public void setAPIPOptions(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(APIPOptions, value);
        saveChanges();
    }

    public void setCombinedPIPStacking(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(combinedPIPStacking, value);
        saveChanges();
    }

    public void setUIMBILimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UIMBILimit, value);
//        saveChanges();
        pause(4000);
    }

    public void setUMBI_UIMBIOptions(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBI_UIMBI_Options, value);
//        saveChanges();
        pause(4000);
    }

    public void setUMBILimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBILimit, value);
//        saveChanges();
        pause(4000);
    }

    public void setUMBILimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBILimits, value);
        pause(4000);
    }

    public void setUMPD(String value) throws Throwable {
        try {
            clickElement(selectCoveragesBlock);
            typeText(UMPD, value);
            pause(4000);
        } catch (Exception e) {
            //
        }
    }

    public void setBILimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(biLimits, value);
        pause(4000);
    }

    public void setUMBIUIMBI(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBIUIMBI, value);
        pause(4000);

    }

    public void setPUREEnhancementEndorsement(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        choose(PUREEnhancementEndorsementYes, PUREEnhancementEndorsementNo, value, "PURE Enhancement Endorsement");
        pause(4000);
    }

    public void setUMCoveragesRadioButton(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        if (value.equalsIgnoreCase("Reduced by At Fault Liability Limits")) {
            choose(reducedByAtFaultLiabilityLimits, addedOnToAtFaultLiabilityLimits, "Yes", "UM Coverages Radio Button");
        } else if (value.equalsIgnoreCase("Added on to At Fault Liability Limits")) {
            choose(reducedByAtFaultLiabilityLimits, addedOnToAtFaultLiabilityLimits, "No", "UM Coverages Radio Button");
        }
    }

    public void setUMLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMLimit, value);
        pause(4000);
    }

    public void setUMDeductible(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMDeductible, value);
        pause(4000);
    }

    public void setUIMLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UIMLimit, value);
        pause(4000);
    }

    public void setUIMPD(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UIMPD, value);
        pause(4000);
    }

    public void setUIMPD2(String value) throws Throwable {
        if (isElementDisplayed(UIMPD2)) {
            clickElement(selectCoveragesBlock);
            typeText(UIMPD2, value);
            pause(4000);
        }
    }


    public void setUM_UIMLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        if (isElementDisplayed(UMUIMLimit)) {
            typeText(UMUIMLimit, value);
//        saveChanges();
            pause(4000);
        }
    }

    public void setPIP(String value) throws Throwable {
        if (isElementDisplayed(pip)) {
            pause(3000);
            clickElement(selectCoveragesBlock);
            typeText(pip, value);
            saveChanges();
            pause(4000);
            if (pip.getAttribute("value").equalsIgnoreCase("- Select -")) {
                typeText(pip, value);
            }
        }
    }

    public void setUMBI(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(umbi, value);
//        saveChanges();
        pause(4000);
    }

    public void setUIMBI(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(uimbi, value);
//        saveChanges();
        pause(4000);
    }

    public void setUMUIM_BILimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMUIM_BILimit, value);
        saveChanges();
    }

    public void setMedPayLimits(String value) throws Throwable {
        try {
            clickElement(selectCoveragesBlock);
            typeText(medPayLimits, value);
            saveChanges();
        } catch (Exception e) {
            //
        }
    }

    public void setUMSUMLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMSUMLimit, value);
        saveChanges();
    }

    public void setCSLUMBI(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(CSLUMBI, value);
        saveChanges();
    }

    public void setCSLUM(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(CSLUM, value);
        saveChanges();
    }

    public void setUMBI_PD(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBI_PD, value);
        saveChanges();
    }

    public void satUMBIUIMBICSL(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMBI_UIMBICSL, value);
        saveChanges();
    }

    public void setUMCSLLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMCSLLimit, value);
        saveChanges();
    }

    public void setPIPRejection(String value) throws Throwable {
        try {
            choose(pipRejectionYes, pipRejectionNo, value);
        } catch (Exception e) {
            //
        }
    }

    public void setMotorMedicalPayments(String value) throws Throwable {
        try {
            clickElement(selectCoveragesBlock);
            typeText(motorMedicalPayments, value);
            saveChanges();
        } catch (Exception e) {
            //
        }
    }

    public void setIncomeLoss(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(incomeLoss, value);
        saveChanges();
    }

    public void setUMPDLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMPDLimit, value);
        saveChanges();
    }

    public void setPIPAggregateFuneralIncomeLoss(String value) throws Throwable {
        try {
            clickElement(selectCoveragesBlock);
            typeTextEnter(pipAggregateFuneralIncomeLoss, value, "PIP Aggregate Funeral Income Loss");
            saveChanges();
        } catch (Exception e) {
            //
        }
    }

    public void setAutomobileDeathIndemnityAndTotalDisabilityCoverage(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(automobileDeathIndemnityAndTotalDisabilityCoverage, value);
        saveChanges();
    }

    public void setAPIPLimits(String value) throws Throwable {
        try {
            clickElement(selectCoveragesBlock);
            typeText(apipLimits, value);
            pause(4000);
        } catch (Exception e) {
            //
        }
    }

    public void setAutoDeathBenefitsAndDisabilityCoverages(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(autoDeathBenefitsAndDisabilityCoverages, value);
        saveChanges();
    }

    public void setUMUIMCSLLimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        if (isElementDisplayed(UMUIMCSLLimit)) {
            typeText(UMUIMCSLLimit, value);
            saveChanges();
        }
    }

    public void setUMUIMBILimit(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UMUIMBILimit, value);
        saveChanges();
    }

    public void setPIPLimitsMedicalWorkFuneral(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(pipLimitsMedicalWorkFuneral, value);
        saveChanges();
    }

    public void setCSLUIMBI(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(CSLUIMBI, value);
        saveChanges();
    }

    public void setCSLUMBIUIMBIOptions(String value) throws Throwable {
        if (isElementDisplayed(CSLUMBIUIMBIOptions)) {
            clickElement(selectCoveragesBlock);
            typeText(CSLUMBIUIMBIOptions, value);
            saveChanges();
        } else if (isElementDisplayed(UMBIUIMBIOptions)) {
            clickElement(selectCoveragesBlock);
            typeText(UMBIUIMBIOptions, value);
            saveChanges();
        }
    }

    public void setPIPDeductible(String value) throws Throwable {
        try {
            clickElement(selectCoveragesBlock);
            typeText(PIPDeductible, value);
            saveChanges();
        } catch (Exception e) {
            //
        }
    }

    public void setExtendedMedicalExpenseLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(extendedMedicalExpenseLimits, value);
        saveChanges();
    }

    public void setDeletionOfBenefitsOtherThanMedicalExpenseBenefits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(deletionOfBenefitsOtherThanMedicalExpenseBenefits, value);
        saveChanges();
    }

    public void setPIPOptions(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(PIPOptions, value);
        saveChanges();
    }

    public void setAdditionalPIPLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(additionalPIPLimits, value);
        saveChanges();
    }

    public void setPDLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(PDLimits, value);
        saveChanges();
    }

    public void setUIMCSLLimits(String value) throws Throwable {
        clickElement(selectCoveragesBlock);
        typeText(UIMCSLLimits, value);
        saveChanges();
    }

    public void setUIMCSLLimit(String value) throws Throwable {
        try {
            clickElement(selectCoveragesBlock);
            typeText(UIMCSLLimit, value);
            saveChanges();
        } catch (Exception e) {
            clickElement(selectCoveragesBlock);
            typeText(UIMCSLLimit, value);
            saveChanges();
        }
    }

    public void setBasicFirstPartyBenefitsCoverage(String value) throws Throwable {
        choose(basicFirstPartyBenefitsCoverageYes, basicFirstPartyBenefitsCoverageNo, value);
    }

    public void setAddedFirstPartyBenefitsCoverage(String value) throws Throwable {
        choose(addedFirstPartyBenefitsCoverageYes, addedFirstPartyBenefitsCoverageNo, value);
    }

    public void setAOPDeductible(String value) throws Throwable {
        typeText(AOPDeductible, value);
        setAttributeValue(AOPDeductible, "value", value);
        saveChanges();
    }

    public void setHurricaneDeductible(String value) throws Throwable {
        typeText(hurricaneDeductible, value);
        saveChanges();
    }

    public void setPersonalEffects(String value) throws Throwable {
        typeText(personalEffects, value);
        saveChanges();
    }

    public void setUMUIMSplitLimitCoverageSelection(String selection, String limit) throws Throwable {
        typeTextEnter(UMUIMSplitLimitCoverageSelection, selection, "UM UIM Split Limit Coverage Selection");
        saveChanges();
        pause(4000);
        if (selection.equalsIgnoreCase("UM/UIM Split Limit Standard")) {
            typeTextEnter(UMUIMSplitLimitStandardCoverage, limit, "UM UIM Slip Limit Standard Coverage");
        } else {
            typeTextEnter(UMUIMSplitLimitConversionCoverage, limit, "UM UIM CSL Conversion Coverage Limits");
        }
    }

    public void clickBiLimitsDropdown() {
        clickElement(biLimits, "Bi Limits");
    }

    public void clickUMBILimitsDropdown() {
        clickElement(UMBILimit, "UMBI Limit");
    }

    public void clickUMPDLimitsDropdown() {
        clickElement(UMPDLimit, "UMPD Limit");
    }

    public void clickUMUMILimitsDropdown() {
        clickElement(UMUIMLimit, "UM UMI Limits");
    }

}