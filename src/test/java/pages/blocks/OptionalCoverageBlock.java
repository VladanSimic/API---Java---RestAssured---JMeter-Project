package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class OptionalCoverageBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OptionalCoverageBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Earthquake Loss Assessment Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement earthquakeLossAssessmentExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Earthquake Loss Assessment Extension')]/../../../..//label[text()='No']/..//input")
    WebElement earthquakeLossAssessmentExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Business Property Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement businessPropertyExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Business Property Extension')]/../../../..//label[text()='No']/..//input")
    WebElement businessPropertyExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Business Property Increase')]/../../../..//label[text()='Yes']/..//input")
    WebElement businessPropertyIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Business Property Increase')]/../../../..//label[text()='No']/..//input")
    WebElement businessPropertyIncreaseNo;
    @FindBy(xpath = "(//div[contains(text(),'Business Property Increase')]/../../../../../../../../../../../td[2]//input)")
    WebElement businessPropertyIncreaseLimit;
    @FindBy(xpath = "(//div[contains(text(),'Business Property Increase')]/ancestor::table//tr[2]//input[@role='textbox'])[5]")
    WebElement businessPropertyIncreaseLimit2;
    @FindBy(xpath = "(//div[contains(text(),'Business Property Increase')]/ancestor::table//tr[2]//input[@role='textbox'])[7]")
    WebElement businessProppertyIncreaseLimit3;
    @FindBy(xpath = "//div[contains(text(),'Incidental Business Prop Increase')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> incidentalBusinessPropIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Incidental Business Prop Increase')]/../../../..//label[text()='No']/..//input")
    WebElement incidentalBusinessPropIncreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Landscaping Increased Limits')]/../../../..//label[text()='Yes']/..//input")
    WebElement landscapingIncreasedLimitsYes;
    @FindBy(xpath = "//div[contains(text(),'Landscaping Increased Limits')]/../../../..//label[text()='No']/..//input")
    WebElement landscapingIncreasedLimitsNo;
    @FindBy(xpath = "//div[contains(text(),'Loss Assessment Increase')]/../../../..//label[text()='Yes']/..//input")
    WebElement lossAssessmentIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Loss Assessment Increase')]/../../../..//label[text()='No']/..//input")
    WebElement lossAssessmentIncreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Incidental Business Threshold Increase')]/../../../..//label[text()='Yes']/..//input")
    WebElement incidentalBusinessThresholdIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Incidental Business Threshold Increase')]/../../../..//label[text()='No']/..//input")
    WebElement incidentalBusinessThresholdIncreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Liability Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement liabilityExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Liability Extension')]/../../../..//label[text()='No']/..//input")
    WebElement liabilityExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Guaranteed Replacement Cost')]/../../../..//label[text()='Yes']/..//input")
    WebElement guaranteedReplacementCostYes;
    @FindBy(xpath = "//div[contains(text(),'Guaranteed Replacement Cost')]/../../../..//label[text()='No']/..//input")
    WebElement guaranteedReplacementCostNo;
    @FindBy(xpath = "//div[contains(text(),'Home Systems Protection')]/../../../..//label[text()='Yes']/..//input")
    WebElement homeSystemsProtectionYes;
    @FindBy(xpath = "//div[contains(text(),'Home Systems Protection')]/../../../..//label[text()='No']/..//input")
    WebElement homeSystemsProtectionNo;
    @FindBy(xpath = "//div[contains(text(),'Coverage for Dwellings Up to Four Familes')]/../../../..//label[text()='Yes']/..//input")
    WebElement coverageForDwellingsUpToFourFamiliesYes;
    @FindBy(xpath = "//div[contains(text(),'Coverage for Dwellings Up to Four Familes')]/../../../..//label[text()='No']/..//input")
    WebElement coverageForDwellingsUpToFourFamiliesNo;
    @FindBy(xpath = "//div[contains(text(),'Off Premises Other Structures Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement offPremisesOtherStructuresExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Off Premises Other Structures Extension')]/../../../..//label[text()='No']/..//input")
    WebElement offPremisesOtherStructuresExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Flood Advantage')]/../../../..//label[text()='Yes']/..//input")
    WebElement floodAdvantageYes;
    @FindBy(xpath = "//div[contains(text(),'Flood Advantage')]/../../../..//label[text()='No']/..//input")
    WebElement floodAdvantageNo;
    @FindBy(xpath = "//div[contains(text(),'Roof Covering Full Reconstruction Cost')]/../../../..//label[text()='Yes']/..//input")
    WebElement roofCoveringFullReconstructionCostYes;
    @FindBy(xpath = "//div[contains(text(),'Roof Covering Full Reconstruction Cost')]/../../../..//label[text()='No']/..//input")
    WebElement roofCoveringFullReconstructionCostNo;
    @FindBy(xpath = "//div[contains(text(),'Flood Coverage Extension (DIC)')]/../../../..//label[text()='Yes']/..//input")
    WebElement floodCoverageExtensionDICYes;
    @FindBy(xpath = "//div[contains(text(),'Flood Coverage Extension (DIC)')]/../../../..//label[text()='No']/..//input")
    WebElement floodCoverageExtensionDICNo;
    @FindBy(xpath = "//div[contains(text(),'Thoroughbred Horse')]/../../../..//label[text()='Yes']/..//input")
    WebElement thoroughbredHorseLiabilityExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Thoroughbred Horse')]/../../../..//label[text()='No']/..//input")
    WebElement thoroughbredHorseLiabilityExtensionNo;
    @FindBy(xpath = "//div[text()='Number of horses']/../../../..//input")
    WebElement thoroughbredHorseLiabilityExtensionNumOfHorses;
    @FindBy(xpath = "//div[contains(text(),'Mine Subsidence Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement mineSubsidenceCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Mine Subsidence Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement mineSubsidenceCoverageNo;
    @FindBy(xpath = "//div[text()='Mine Subsidence Coverage']/../../../..//input")
    WebElement mineSubsidenceCoverageInput;
    @FindBy(xpath = "//div[contains(text(),'Coverage for Piers')]/../../../..//label[text()='Yes']/..//input")
    WebElement coverageForPiersYes;
    @FindBy(xpath = "//div[contains(text(),'Coverage for Piers')]/../../../..//label[text()='No']/..//input")
    WebElement coverageForPiersNo;
    @FindBy(xpath = "//div[contains(text(),'Coverage for Piers')]/following::input[@type='text'][1]")
    WebElement coverageForPiersLimit;
    @FindBy(xpath = "//div[contains(text(),'Sinkhole Collapse Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement sinkholeCollapseExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Sinkhole Collapse Extension')]/../../../..//label[text()='No']/..//input")
    WebElement sinkholeCollapseExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Fortified Roof Upgrade Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement fortifiedRoofUpgradeCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Fortified Roof Upgrade Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement fortifiedRoofUpgradeCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Fire and Lightning Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement fireAndLightningExtensionForLandscapingYes;
    @FindBy(xpath = "//div[contains(text(),'Fire and Lightning Extension')]/../../../..//label[text()='No']/..//input")
    WebElement fireAndLightningExtensionForLandscapingNo;
    @FindBy(xpath = "//label[text()='F&L Extension Override']/..//span")
    WebElement fireAndLightningExtensionOverride;
    @FindBy(xpath = "//div[contains(text(),'Property Remediation/Limited')]/../../../..//label[text()='Yes']/..//input")
    WebElement propertyRemediationLimitedLiabilityYes;
    @FindBy(xpath = "//div[contains(text(),'Property Remediation/Limited')]/../../../..//label[text()='No']/..//input")
    WebElement propertyRemediationLimitedLiabilityNo;
    @FindBy(xpath = "//div[contains(text(),'Law and Ordinance')]/../../../..//label[text()='Yes']/..//input")
    WebElement lawAndOrdinanceIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Law and Ordinance')]/../../../..//label[text()='No']/..//input")
    WebElement lawAndOrdinanceIncreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Earthquake - HO')]/../../../..//label[text()='Yes']/..//input")
    WebElement earthquakeHO3254Yes;
    @FindBy(xpath = "//div[contains(text(),'Earthquake - HO')]/../../../..//label[text()='No']/..//input")
    WebElement earthquakeHO3254No;
    @FindBy(xpath = "//div[contains(text(),'Earthquake - HO')]/following::input[@type='text'][2]")
    WebElement earthquakeHO3254Deductible;
    @FindBy(xpath = "//div[contains(text(),'Identity Fraud')]/../../../..//label[text()='Yes']/..//input")
    WebElement identityFraudProtectionYes;
    @FindBy(xpath = "//div[contains(text(),'Identity Fraud')]/../../../..//label[text()='No']/..//input")
    WebElement identityFraudProtectionNo;
    @FindBy(xpath = "//div[contains(text(),'Section II-Liability')]/../../../..//label[text()='Yes']/..//input")
    WebElement sectionIILiabilityYes;
    @FindBy(xpath = "//div[contains(text(),'Section II-Liability')]/../../../..//label[text()='No']/..//input")
    WebElement sectionIILiabilityNo;
    @FindBy(xpath = "//div[contains(text(),'Other Structures On the Res')]/../../../..//label[text()='Yes']/..//input")
    WebElement otherStructuresOnTheResPremYes;
    @FindBy(xpath = "//div[contains(text(),'Other Structures On the Res')]/../../../..//label[text()='No']/..//input")
    WebElement otherStructuresOnTheResPremNo;
    @FindBy(xpath = "//div[contains(text(),'Other Structures On the Res')]/../../../..//label[text()='Yes']/..//input")
    WebElement structuresRentedYes;
    @FindBy(xpath = "//div[contains(text(),'Other Structures On the Res')]/../../../..//label[text()='No']/..//input")
    WebElement structuresRentedNo;
    @FindBy(xpath = "//div[contains(text(),'Specific Structures Away')]/../../../..//label[text()='Yes']/..//input")
    WebElement specificStructuresYes;
    @FindBy(xpath = "//div[contains(text(),'Specific Structures Away')]/../../../..//label[text()='No']/..//input")
    WebElement specificStructuresNo;
    @FindBy(xpath = "//div[contains(text(),'Additional Insured')]/../../../..//label[text()='Yes']/..//input")
    WebElement additionalInsuredYes;
    @FindBy(xpath = "//div[contains(text(),'Additional Insured')]/../../../..//label[text()='No']/..//input")
    WebElement additionalInsuredNo;
    @FindBy(xpath = "//div[contains(text(),'Coverage B')]/../../../..//label[text()='Yes']/..//input")
    WebElement coverageBYes;
    @FindBy(xpath = "//div[contains(text(),'Coverage B')]/../../../..//label[text()='No']/..//input")
    WebElement coverageBNo;
    @FindBy(xpath = "//div[contains(text(),'Personal Liability Coverage')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> personalLiabilityCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Personal Liability Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement personalLiabilityCoverageNo;
    @FindBy(xpath = "//div[text()='Personal Liability Coverage']/../../../../../../../../../../..//div[text()='Personal Liability Coverage Limit']/../../../..//input")
    WebElement personalLiabilityCoverageLimit;
    @FindBy(xpath = "//div[contains(text(),'Medical Payments')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> medicalPaymentsYes;
    @FindBy(xpath = "//div[contains(text(),'Medical Payments')]/../../../..//label[text()='No']/..//input")
    WebElement medicalPaymentsNo;
    @FindBy(xpath = "//div[text()='Sinkhole Loss Coverage']/../../../..//label[text()='Yes']/..//input")
    WebElement sinkholeLossCoverageYes;
    @FindBy(xpath = "//div[text()='Sinkhole Loss Coverage']/../../../..//label[text()='No']/..//input")
    WebElement sinkholeLossCoverageNo;
    @FindBy(xpath = "//div[text()='Medical Payments']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement medicalPaymentsLimit;
    @FindBy(xpath = "//div[contains(text(),'Soft Costs Coverage')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> softCostsCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Soft Costs Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement softCostsCoverageNo;
    @FindBy(xpath = "//div[text()='Soft Costs Coverage']/../../../../../../../../../../..//div[text()='Soft Costs Coverage Limit']/../../../..//input")
    WebElement softCostsCoverageLimit;
    @FindBy(xpath = "//div[text()='Soft Costs Coverage']/../../../../../../../../../../..//div[text()='Soft Costs Coverage UW override']/../../../..//input")
    WebElement softCostsCoverageLimitUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Earthquake Extension')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> earthquakeExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Earthquake Extension')]/../../../..//label[text()='No']/..//input")
    WebElement earthquakeExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Earthquake Extension')]/../../../../../../../../../../../td[2]//input")
    WebElement earthquakeExtensionDeductible;
    @FindBy(xpath = "//div[contains(text(),'Earthquake Extension')]/../../../../../../../../../../../td[3]//input")
    WebElement earthquakeExtensionDeductible2;
    @FindBy(xpath = "//div[text()='Earthquake Extension']/../../../../../../../../../../..//div[text()='Earthquake Extension Deductible']/../../../..//input")
    WebElement earthquakeExtensionDeductibleCC;
    @FindBy(xpath = "//div[contains(text(),'Ensuing Fungi Increase')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> ensuingFungiIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Ensuing Fungi Increase')]/../../../..//label[text()='No']/..//input")
    WebElement ensuingFungiIncreaseNo;
    @FindBy(xpath = "(//div[text()='Ensuing Fungi Increase']/../../../../../../../../../../..//div[text()='Ensuing Fungi Increase Limit']/../../../..//input)|(//div[contains(text(),'Ensuing Fungi Increase')]/../../../../../../../../../../../td[2]//input)")
    WebElement ensuingFungiIncreaseLimit;
    @FindBy(xpath = "(//div[text()='Ensuing Fungi Increase']/../../../../../../../../../../..//div[text()='Ensuing Fungi Increase UW override']/../../../..//input)|(//div[text()='Ensuing Fungi Increase UW override']/../../../../../../../../../../../td[1]//input)")
    WebElement ensuingFungiIncreaseLimitUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Scaffolding and Other Construction Forms')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> scaffoldingAndOtherConstructionFormsYes;
    @FindBy(xpath = "//div[contains(text(),'Scaffolding and Other Construction Forms')]/../../../..//label[text()='No']/..//input")
    WebElement scaffoldingAndOtherConstructionFormsNo;
    @FindBy(xpath = "//div[text()='Scaffolding and Other Construction Forms']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement scaffoldingAndOtherConstructionFormsLimit;
    @FindBy(xpath = "//div[text()='Scaffolding and Other Construction Forms']/../../../../../../../../../../..//div[text()='Scaffolding and Other Construction Forms UW override']/../../../..//input")
    WebElement scaffoldingAndOtherConstructionFormsLimitUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Valuable Papers and Records Coverage')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> valuablePapersAndRecordsCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Valuable Papers and Records Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement valuablePapersAndRecordsCoverageNo;
    @FindBy(xpath = "//div[text()='Valuable Papers and Records Coverage']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement valuablePapersAndRecordsCoverageLimit;
    @FindBy(xpath = "//div[text()='Valuable Papers and Records Coverage']/../../../../../../../../../../..//div[text()='Valuable Papers and Records Coverage Limit UW override']/../../../..//input")
    WebElement valuablePapersAndRecordsCoverageLimitUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Property in Transit')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> propertyInTransitYes;
    @FindBy(xpath = "//div[contains(text(),'Property in Transit')]/../../../..//label[text()='No']/..//input")
    WebElement propertyInTransitNo;
    @FindBy(xpath = "//div[text()='Property in Transit']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement propertyInTransitLimit;
    @FindBy(xpath = "//div[text()='Property in Transit']/../../../../../../../../../../..//div[text()='Property in transit UW override']/../../../..//input")
    WebElement propertyInTransitLimitUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Property at a Temporary Storage Location')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> propertyAtATemporaryStorageLocationYes;
    @FindBy(xpath = "//div[contains(text(),'Property at a Temporary Storage Location')]/../../../..//label[text()='No']/..//input")
    WebElement propertyAtATemporaryStorageLocationNo;
    @FindBy(xpath = "//div[text()='Property at a Temporary Storage Location']/../../../../../../../../../../..//div[text()='Property at a Temporary Storage Location Limit']/../../../..//input")
    WebElement propertyAtATemporaryStorageLocationLimit;
    @FindBy(xpath = "//div[text()='Property at a Temporary Storage Location']/../../../../../../../../../../..//div[text()='Property at a Temporary Storage Location UW override']/../../../..//input")
    WebElement propertyAtATemporaryStorageLocationLimitUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Expedited Expense')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> expeditedExpenseYes;
    @FindBy(xpath = "//div[contains(text(),'Expedited Expense')]/../../../..//label[text()='No']/..//input")
    WebElement expeditedExpenseNo;
    @FindBy(xpath = "//div[text()='Expedited Expense']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement expeditedExpenseLimit;
    @FindBy(xpath = "//div[contains(text(),'Pollutant Clean Up and Removal')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> pollutantCleanUpAndRemovalYes;
    @FindBy(xpath = "//div[contains(text(),'Pollutant Clean Up and Removal')]/../../../..//label[text()='No']/..//input")
    WebElement pollutantCleanUpAndRemovalNo;
    @FindBy(xpath = "//div[text()='Pollutant Clean Up and Removal']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement pollutantCleanUpAndRemovalLimit;
    @FindBy(xpath = "//div[contains(text(),'Debris Removal')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> debrisRemovalYes;
    @FindBy(xpath = "//div[contains(text(),'Debris Removal')]/../../../..//label[text()='No']/..//input")
    WebElement debrisRemovalNo;
    @FindBy(xpath = "//div[text()='Debris Removal']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement debrisRemovalLimit;
    @FindBy(xpath = "//div[contains(text(),'Landscaping')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> landscapingYes;
    @FindBy(xpath = "//div[contains(text(),'Landscaping')]/../../../..//label[text()='No']/..//input")
    WebElement landscapingNo;
    @FindBy(xpath = "(//div[text()='Landscaping']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input)|(//div[text()='Limit per Tree/Shrub']/../../../..//input)")
    WebElement landscapingLimit;
    @FindBy(xpath = "//div[contains(text(),'Precautionary Repairs')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> precautionaryRepairsYes;
    @FindBy(xpath = "//div[contains(text(),'Precautionary Repairs')]/../../../..//label[text()='No']/..//input")
    WebElement precautionaryRepairsNo;
    @FindBy(xpath = "//div[text()='Precautionary Repairs']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement precautionaryRepairsLimit;
    @FindBy(xpath = "//div[contains(text(),'Tree Removal')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> treeRemovalYes;
    @FindBy(xpath = "//div[contains(text(),'Tree Removal')]/../../../..//label[text()='No']/..//input")
    WebElement treeRemovalNo;
    @FindBy(xpath = "//div[text()='Tree Removal']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement treeRemovalLimit;
    @FindBy(xpath = "//div[contains(text(),'Backup of Sewer or Drain')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> backupOfSewerOrDrainIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Backup of Sewer or Drain')]/../../../..//label[text()='No']/..//input")
    WebElement backupOfSewerOrDrainIncreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Backup of Sewer or Drain')]/../../../../../../../../../../..//div[text()='Backup of Sewer or Drain UW override']/../../../..//input")
    WebElement backupOfSewerOrDrainIncreaseUWOverride;
    @FindBy(xpath = "//div[text()='Expedited Expense']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement expeditedExpense;
    @FindBy(xpath = "//div[text()='Pollutant Clean Up and Removal']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement pollutantCleanUpAndRemoval;
    @FindBy(xpath = "//div[text()='Debris Removal']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement debrisRemoval;
    @FindBy(xpath = "//div[text()='Landscaping']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement landscaping;
    @FindBy(xpath = "//div[text()='Precautionary Repairs']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement precautionaryRepairs;
    @FindBy(xpath = "//div[text()='Tree Removal']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement treeRemoval;
    @FindBy(xpath = "//div[contains(text(),'Earthquake Loss Assessment Extension')]/../../../../../../../../../../../td[2]//input")
    WebElement earthquakeLossAssessmentLimit;
    @FindBy(xpath = "//div[text()='Business Property Extension']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input[@aria-hidden='false']")
    WebElement businessPropertyExtensionLimit;
    @FindBy(xpath = "//div[contains(text(),'Business Prop Increase')]/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement incidentalBusinessPropIncreaseLimit;
    @FindBy(xpath = "(//div[text()='Landscaping Increased Limits']/../../../../../../../../../../..//div[text()='Limit per Tree/Shrub']/../../../..//input)|(//div[text()='Landscaping Increase']/../../../../../../../../../../..//div[text()='Limit per Tree/Shrub']/../../../..//input)")
    WebElement landscapingIncreasedLimitsLimit;
    @FindBy(xpath = "(//div[text()='Loss Assessment Increase']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input)|(//div[contains(text(),'(max 50,000)')]/../../../..//input)")
    WebElement lossAssessmentIncreaseLimit;
    @FindBy(xpath = "//div[contains(text(),'Business Threshold Increase')]/../../../../../../../../../../..//div[text()='Income Type']/../../../..//input")
    WebElement incidentalBusinessThresholdIncreaseIncomeType;
    @FindBy(xpath = "(//div[text()='Liability Extension']/../../../../../../../../../../..//div[contains(text(),'Premises')]/../../../..//input)|(//div[text()='No. of Premises']/../../../..//input)")
    WebElement liabilityExtensionNoPremises;
    @FindBy(xpath = "//div[text()='Liability Extension']/../../../../../../../../../../../../tr//label[text()='Click to add and list the risk addresses']/..//input")
    WebElement clickToAddAndListTheRiskAddresses;
    @FindBy(xpath = "//div[contains(text(),'Home Systems Protection')]/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement homeSystemsProtectionLimit;
    @FindBy(xpath = "//div[contains(text(),'Off Premises Other Structures Extension')]/following::input[@type='text'][1]")
    WebElement offPremisesOtherStructuresExtensionLimit;
    @FindBy(xpath = "//div[contains(text(),'Increased Limit of Ensuing Fungi or Bacteria Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement ensuingFungiOrBacteriaYes;
    @FindBy(xpath = "//div[contains(text(),'Increased Limit of Ensuing Fungi or Bacteria Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement ensuingFungiOrBacteriaNo;
    @FindBy(xpath = "//div[contains(text(),'Increased Limit of Ensuing Fungi or Bacteria Coverage')]/../../../../../../../../../../../td[2]//input")
    WebElement ensuingFungiOrBacteriaCoverageLimit;
    @FindBy(xpath = "//div[text()='Aggregate']/../../../..//input")
    WebElement aggregateLimit;
    @FindBy(xpath = "//div[text()='% of Coverage A requested']/../../../..//input")
    WebElement percentageOfCovARequested;
    @FindBy(xpath = "//div[contains(text(),'Rebuilding to Code Increase')]/../../../..//label[text()='Yes']/..//input")
    WebElement rebuildingToCodeIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Rebuilding to Code Increase')]/../../../..//label[text()='No']/..//input")
    WebElement rebuildingToCodeIncreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Increase Sub-Limit for Screen Enclosures')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> increaseSubLimitForScreenEnclosuresYes;
    @FindBy(xpath = "//div[contains(text(),'Increase Sub-Limit for Screen Enclosures')]/../../../..//label[text()='No']/..//input")
    WebElement increaseSubLimitForScreenEnclosuresNo;
    @FindBy(xpath = "//div[contains(text(),'Increase Sub-Limit for Screen Enclosures')]/../../../../../../../../../../../td[2]//input")
    WebElement increaseSubLimitForScreenEnclosuresLimit;
    @FindBy(xpath = "//div[text()='Contents Extended Replacement Cost']/../../../..//label[text()='Yes']/..//input")
    WebElement contentsExtendedReplacementCostYes;
    @FindBy(xpath = "//div[text()='Contents Extended Replacement Cost']/../../../..//label[text()='No']/..//input")
    WebElement contentsExtendedReplacementCostNo;
    @FindBy(xpath = "//div[text()='Location of storage container']/../../../..//input")
    WebElement propertyRemediationStorageContainer;
    @FindBy(xpath = "//div[text()='Escaped Fuel Remediation']/../../../..//input")
    WebElement propertyRemediationFuelRemediation;
    @FindBy(xpath = "//div[text()='Escaped Fuel Liability']/../../../..//input")
    WebElement propertyRemediationFuelLiability;
    @FindBy(xpath = "//div[contains(text(),'Supplemental Loss Assessment Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement supplementalLossAssessmentCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Supplemental Loss Assessment Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement supplementalLossAssessmentCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Supplemental Loss Assessment Coverage')]/following::input[@type='text'][1]")
    WebElement supplementalLossAssessmentCoverageLimit;
    @FindBy(xpath = "//div[contains(text(),'Limited Water Back Up and Sump Discharge Or Overflow')]/following::input[@type='text'][1]")
    WebElement limitedWaterBackUpAndSumpDischargeLimit;
    @FindBy(xpath = "//div[contains(text(),'Limited Water Back Up and Sump Discharge Or Overflow')]/../../../..//label[text()='No']/..//input")
    WebElement limitedWaterBackUpAndSumpDischargeNo;
    @FindBy(xpath = "//div[contains(text(),'Limited Water Back Up and Sump Discharge Or Overflow')]/../../../..//label[text()='Yes']/..//input")
    WebElement limitedWaterBackUpAndSumpDischargeYes;
    @FindBy(xpath = "//div[contains(text(),'Personal Property Replacement Cost Loss Settlement')]/../../../..//label[text()='Yes']/..//input")
    WebElement personalPropertyReplacementCostLossSettlementYes;
    @FindBy(xpath = "//div[contains(text(),'Personal Property Replacement Cost Loss Settlement')]/../../../..//label[text()='No']/..//input")
    WebElement personalPropertyReplacementCostLossSettlementNo;
    @FindBy(xpath = "//div[contains(text(),'Increased Limit Coverage A')]/../../../..//label[text()='Yes']/..//input")
    WebElement increasedLimitCoverageAYes;
    @FindBy(xpath = "//div[contains(text(),'Increased Limit Coverage A')]/../../../..//label[text()='No']/..//input")
    WebElement increasedLimitCoverageANo;
    @FindBy(xpath = "//div[contains(text(),'Increased Limit Coverage A')]/following::input[@type='text'][1]")
    WebElement increasedLimitCoverageALimit;
    @FindBy(xpath = "//div[contains(text(),'Liability Coverage Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement liabilityCoverageExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Liability Coverage Extension')]/../../../..//label[text()='No']/..//input")
    WebElement liabilityCoverageExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Liability Coverage Extension')]/following::input[@type='text'][1]")
    WebElement liabilityCoverageExtensionNoOfPremises;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement personalInjuryCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement personalInjuryCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Unit-owners Coverage C Special')]/../../../..//label[text()='No']/..//input")
    WebElement unitOwnersCoverageCSpecialNo;
    @FindBy(xpath = "//div[contains(text(),'Unit-owners Coverage C Special')]/../../../..//label[text()='Yes']/..//input")
    WebElement unitOwnersCoverageCSpecialYes;
    @FindBy(xpath = "//div[contains(text(),'Law and Ordinance Increase or Rejection')]/following::input[@type='text'][1]")
    WebElement lawAndOrdinanceIncreaseOption;
    @FindBy(xpath = "//div[contains(text(),'Alarm Endorsement')]/../../../..//label[text()='Yes']/..//input")
    WebElement alarmEndorsementYes;
    @FindBy(xpath = "//div[contains(text(),'Alarm Endorsement')]/../../../..//label[text()='No']/..//input")
    WebElement alarmEndorsementNo;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value')]/../../../..//label[text()='Yes']/..//input")
    WebElement agreedValueYes;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value')]/../../../..//label[text()='No']/..//input")
    WebElement agreedValueNo;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value Specified Classes')]/../../../..//label[text()='Yes']/..//input")
    WebElement agreedValueSpecifiedClassesYes;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value Specified Classes')]/../../../..//label[text()='No']/..//input")
    WebElement agreedValueSpecifiedClassesNo;
    @FindBy(xpath = "//div[contains(text(),'Baggage Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement baggageExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Baggage Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement baggageExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Hurricane Deductible')]/../../../..//label[text()='Yes']/..//input")
    WebElement optionalHurricaneDeductibleYes;
    @FindBy(xpath = "//div[contains(text(),'Hurricane Deductible')]/../../../..//label[text()='No']/..//input")
    WebElement optionalHurricaneDeductibleNo;
    @FindBy(xpath = "//div[contains(text(),'Personal Security Clause')]/../../../..//label[text()='Yes']/..//input")
    WebElement personalSecurityClauseYes;
    @FindBy(xpath = "//div[contains(text(),'Personal Security Clause')]/../../../..//label[text()='No']/..//input")
    WebElement personalSecurityClauseNo;
    @FindBy(xpath = "//div[contains(text(),'Spoilage Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement spoilageExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Spoilage Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement spoilageExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Market Value for Scheduled Items')]/../../../..//label[text()='Yes']/..//input")
    WebElement marketValueForScheduledItemsYes;
    @FindBy(xpath = "//div[contains(text(),'Market Value for Scheduled Items')]/../../../..//label[text()='No']/..//input")
    WebElement marketValueForScheduledItemsNo;
    @FindBy(xpath = "//div[contains(text(),'Excess Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement setExcessCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Excess Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement setExcessCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Excess Coverage')]/following::input[@type='text'][1]")
    WebElement excessCoverageLimit;
    @FindBy(xpath = "//div[contains(text(),'Would you like to quote Non-Admitted Primary Flood') and @style=\"display:inline\"]/./../../../..//label[text()='Yes']/..//input")
    WebElement wouldYouLikeToQuoteNonAdmittedPFYes;
    @FindBy(xpath = "//div[contains(text(),'Would you like to quote Non-Admitted Primary Flood') and @style=\"display:inline\"]/./../../../..//label[text()='No']/..//input")
    WebElement wouldYouLikeToQuoteNonAdmittedPFNo;

    public void fillOptionalCoverages(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "LA":
                    case "GA":
                    case "PA": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "CO": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "AZ":
                    case "RI": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "IN":
                    case "MS": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "NV":
                    case "MD":
                    case "CT": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "DC": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "NY": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setGuaranteedReplacementCost(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "TX": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "NJ": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setGuaranteedReplacementCost(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension(data);
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "FL": {
                        setSinkholeCollapseExtension(data);
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254(data);
                        setDebrisRemoval(data);
                        setIdentityFraudProtection(data);
                        setSectionIILiability(data);
                        setOtherStructuresOnTheResPrem(data);
                        setStructuresRented(data);
                        setSpecificStructures(data);
                        setAdditionalInsured(data);
                        setCoverageB(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setSinkholeCollapseExtension(data);
                        setBusinessPropertyExtension(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeExtension(data);
                        setEnsuingFungiIncrease(data);
                        setBusinessPropertyIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setLawAndOrdinanceIncrease(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setPropertyRemediationLimitedLiability(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "WY": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        if (isElementDisplayed(coverageForDwellingsUpToFourFamiliesYes))
                            setCoverageForDwellingsUpToFourFamilies(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "KS":
                    case "OR":
                    case "UT":
                    case "NM": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setFireAndLightningExtensionForLandscaping(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setCoverageForDwellingsUpToFourFamilies(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "DE": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
//                setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "MT": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "ME":
                    case "NH": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setSinkholeCollapseExtension(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "AL": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setFortifiedRoofUpgradeCoverage(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setSinkholeCollapseExtension(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "WV": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "VT": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "ND": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "WA":
                    case "OK": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setSinkholeCollapseExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    case "IA": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "KY": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setMineSubsidenceCoverage(data);
                        setHomeSystemsProtectionYes(data);
//                setRoofCoveringFullReconstructionCost(data); disabled on ui
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "MN": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setCoverageForPiers(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setRoofCoveringFullReconstructionCost(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setCoverageForPiers(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "NE": {
                        setEarthquakeLossAssessmentExtension(data);
                        setEarthquakeExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
//                setMineSubsidenceCoverage(data);
                        setHomeSystemsProtectionYes(data);
                        if (isElementDisplayed(coverageForDwellingsUpToFourFamiliesYes))
                            setCoverageForDwellingsUpToFourFamilies(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                    case "WI": {
                        setEarthquakeLossAssessmentExtension(data);
                        setEarthquakeExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setOffPremisesOtherStructuresExtension(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "AK":
                    case "CT":
                    case "GA":
                    case "IN":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA":
                    case "OH": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "AZ":
                    case "AL":
                    case "CO":
                    case "LA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setFireAndLightningExtensionForLandscaping(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setFloodCoverageExtensionDIC(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "FL": {
                        setBusinessPropertyIncrease(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setMineSubsidenceCoverage(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "IA": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "KS":
                    case "NM":
                    case "OK":
                    case "OR":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "ME":
                    case "TN": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setSinkholeCollapseExtension(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setPropertyRemediationLimitedLiability(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254(data);
                        setSupplementalLossAssessmentCoverage(data.get("Optional_Coverages_Supplemental_Loss_Assessment_Coverage"));
                        setLawAndOrdinanceIncrease(data);
                        setLimitedWaterBackUpAndSumpDischarge(data.get("Optional_Coverages_Limited_Water_BackUp_And_Sump"));
                        setIdentityFraudProtection(data);
                        setPersonalPropertyReplacementCostLossSettlement(data.get("Optional_Coverages_Personal_Property_Replacement_Cost"));
                        setIncreasedLimitCoverageA(data.get("Optional_Coverages_Increased_Limit_CovA"));
                        setUnitOwnersCoverageCSpecial(data.get("Optional_Coverages_UnitOwners_CovC_Special"));
                        setLiabilityCoverageExtension(data.get("Optional_Coverages_Liability_Cov_Extension"));
                        setPersonalInjuryCoverage(data.get("Optional_Coverages_Personal_Injury_Coverage"));
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setLawAndOrdinanceIncrease(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "WA": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setContentsExtendedReplacementCost(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State")) {
                    case "AL":
                    case "AZ":
                    case "CO":
                    case "GA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "AK":
                    case "CT":
                    case "IN":
                    case "LA":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "AR":
                    case "IA": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setFireAndLightningExtensionForLandscaping(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "FL":
                    case "IL":
                    case "KS":
                    case "NM":
                    case "OK":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "ME":
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setPropertyRemediationLimitedLiability(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "MO":
                    case "OR":
                    case "WA": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setMineSubsidenceCoverage(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyIncrease(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setLawAndOrdinanceIncrease(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setSinkholeCollapseExtension(data);
                        setBusinessPropertyExtension(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setLiabilityExtension(data);
                        setHomeSystemsProtectionYes(data);
                        setThoroughbredHorseLiabilityExtension(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension(data);
                        setEnsuingFungiIncrease(data);
                        setIncidentalBusinessPropIncrease(data);
                        setLandscapingIncreasedLimits(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setFloodCoverageExtensionDIC(data);
                        setHomeSystemsProtectionYes(data);
                    }
                    break;
                }
            }
            break;
        }

        if(isFloodDate1(data.get("Effective_Date"))){
            switch (data.get("State")){
                case "CA" :
                case "FL" :
                case "LA" :
                case "NC" :
                case "AL" :
                case "KY" :
                case "MS" :
                case "AR" :
                case "MO" : {
                    setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF"));
                }
                break;
            }
        }

        verifyBlockExists("optional coverage");
        saveChanges();
    }

    public void fillOptionalCoverages_END(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "LA":
                    case "GA":
                    case "PA": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "CO": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setFloodAdvantage_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "AZ":
                    case "RI": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "IN":
                    case "MS": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "NV":
                    case "MD":
                    case "CT": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "DC": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "NY": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setGuaranteedReplacementCost_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "TX": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "NJ": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setGuaranteedReplacementCost_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setCoverageForDwellingsUpToFourFamilies_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "FL": {
                        setSinkholeCollapseExtension_END(data);
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254_END(data);
                        setDebrisRemoval_END(data);
                        setIdentityFraudProtection_END(data);
                        setSectionIILiability_END(data);
                        setOtherStructuresOnTheResPrem_END(data);
                        setStructuresRented_END(data);
                        setSpecificStructures_END(data);
                        setAdditionalInsured_END(data);
                        setCoverageB_END(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setSinkholeCollapseExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setLawAndOrdinanceIncrease_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setPropertyRemediationLimitedLiability_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "WY": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setCoverageForDwellingsUpToFourFamilies_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "KS":
                    case "OR":
                    case "UT":
                    case "NM": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setFireAndLightningExtensionForLandscaping_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setCoverageForDwellingsUpToFourFamilies_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "DE": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
//                setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "MT": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "ME":
                    case "NH": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setSinkholeCollapseExtension_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "AL": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setFortifiedRoofUpgradeCoverage_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setSinkholeCollapseExtension_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "WV": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "VT": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "ND": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "WA":
                    case "OK": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setSinkholeCollapseExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    case "IA": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "KY": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setMineSubsidenceCoverage_END(data);
                        setHomeSystemsProtectionYes_END(data);
//                setRoofCoveringFullReconstructionCost_END(data); disabled on ui
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "MN": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setCoverageForPiers_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setRoofCoveringFullReconstructionCost_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setCoverageForPiers_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "NE": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
//                setMineSubsidenceCoverage_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setCoverageForDwellingsUpToFourFamilies_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                    case "WI": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setOffPremisesOtherStructuresExtension_END(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_END")) {
                    case "AK":
                    case "CT":
                    case "GA":
                    case "IN":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA":
                    case "OH": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "AZ":
                    case "AL":
                    case "CO":
                    case "LA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setFireAndLightningExtensionForLandscaping_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "FL": {
                        setBusinessPropertyIncrease_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setMineSubsidenceCoverage_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "IA": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "KS":
                    case "NM":
                    case "OK":
                    case "OR":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "ME":
                    case "TN": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setSinkholeCollapseExtension_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setPropertyRemediationLimitedLiability_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254_END(data);
                        setSupplementalLossAssessmentCoverage(data.get("Optional_Coverages_Supplemental_Loss_Assessment_Coverage_END"));
                        setLawAndOrdinanceIncrease_END(data);
                        setLimitedWaterBackUpAndSumpDischarge(data.get("Optional_Coverages_Limited_Water_BackUp_And_Sump_END"));
                        setIdentityFraudProtection_END(data);
                        setPersonalPropertyReplacementCostLossSettlement(data.get("Optional_Coverages_Personal_Property_Replacement_Cost_END"));
                        setIncreasedLimitCoverageA(data.get("Optional_Coverages_Increased_Limit_CovA_END"));
                        setUnitOwnersCoverageCSpecial(data.get("Optional_Coverages_UnitOwners_CovC_Special_END"));
                        setLiabilityCoverageExtension(data.get("Optional_Coverages_Liability_Cov_Extension_END"));
                        setPersonalInjuryCoverage(data.get("Optional_Coverages_Personal_Injury_Coverage_END"));
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setLawAndOrdinanceIncrease_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "WA": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setContentsExtendedReplacementCost_END(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_END")) {
                    case "AL":
                    case "AZ":
                    case "CO":
                    case "GA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "AK":
                    case "CT":
                    case "IN":
                    case "LA":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "AR":
                    case "IA": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setFireAndLightningExtensionForLandscaping_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "FL":
                    case "IL":
                    case "KS":
                    case "NM":
                    case "OK":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "ME":
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setPropertyRemediationLimitedLiability_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "MO":
                    case "OR":
                    case "WA": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setMineSubsidenceCoverage_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyIncrease_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setLawAndOrdinanceIncrease_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension_END(data);
                        setEarthquakeLossAssessmentExtension_END(data);
                        setSinkholeCollapseExtension_END(data);
                        setBusinessPropertyExtension_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setHomeSystemsProtectionYes_END(data);
                        setThoroughbredHorseLiabilityExtension_END(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension_END(data);
                        setEnsuingFungiIncrease_END(data);
                        setIncidentalBusinessPropIncrease_END(data);
                        setLandscapingIncreasedLimits_END(data);
                        setLossAssessmentIncrease_END(data);
                        setIncidentalBusinessThresholdIncrease_END(data);
                        setLiabilityExtension_END(data);
                        setFloodCoverageExtensionDIC_END(data);
                        setHomeSystemsProtectionYes_END(data);
                    }
                    break;
                }
            }
            break;
        }

        if(isFloodDate1(data.get("Endorsement_Effective_Date_END"))){
            switch (data.get("State")){
                case "CA" :
                case "FL" :
                case "LA" :
                case "NC" :
                case "AL" :
                case "KY" :
                case "MS" :
                case "AR" :
                case "MO" : {
                    setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF"));
                }
                break;
            }
        }

        verifyBlockExists("optional coverage");
        saveChanges();
    }

    public void fillOptionalCoverages_OOS_END(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "LA":
                    case "GA":
                    case "PA": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "CO": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setFloodAdvantage_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "AZ":
                    case "RI": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "IN":
                    case "MS": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "NV":
                    case "MD":
                    case "CT": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "DC": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "NY": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setGuaranteedReplacementCost_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "TX": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "NJ": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setGuaranteedReplacementCost_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setCoverageForDwellingsUpToFourFamilies_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "FL": {
                        setSinkholeCollapseExtension_OOS_END(data);
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254_OOS_END(data);
                        setDebrisRemoval_OOS_END(data);
                        setIdentityFraudProtection_OOS_END(data);
                        setSectionIILiability_OOS_END(data);
                        setOtherStructuresOnTheResPrem_OOS_END(data);
                        setStructuresRented_OOS_END(data);
                        setSpecificStructures_OOS_END(data);
                        setAdditionalInsured_OOS_END(data);
                        setCoverageB_OOS_END(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setSinkholeCollapseExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setLawAndOrdinanceIncrease_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setPropertyRemediationLimitedLiability_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "WY": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setCoverageForDwellingsUpToFourFamilies_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "KS":
                    case "OR":
                    case "UT":
                    case "NM": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setFireAndLightningExtensionForLandscaping_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setCoverageForDwellingsUpToFourFamilies_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "DE": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
//                setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "MT": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "ME":
                    case "NH": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setSinkholeCollapseExtension_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "AL": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setFortifiedRoofUpgradeCoverage_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setSinkholeCollapseExtension_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "WV": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "VT": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "ND": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "WA":
                    case "OK": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setSinkholeCollapseExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    case "IA": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "KY": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setMineSubsidenceCoverage_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
//                setRoofCoveringFullReconstructionCost_OOS_END(data); disabled on ui
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "MN": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setCoverageForPiers_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setRoofCoveringFullReconstructionCost_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setCoverageForPiers_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "NE": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
//                setMineSubsidenceCoverage_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setCoverageForDwellingsUpToFourFamilies_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                    case "WI": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setOffPremisesOtherStructuresExtension_OOS_END(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "CT":
                    case "GA":
                    case "IN":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA":
                    case "OH": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "AZ":
                    case "AL":
                    case "CO":
                    case "LA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setFireAndLightningExtensionForLandscaping_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "FL": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setMineSubsidenceCoverage_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "IA": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "KS":
                    case "NM":
                    case "OK":
                    case "OR":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "ME":
                    case "TN": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setSinkholeCollapseExtension_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setPropertyRemediationLimitedLiability_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254_OOS_END(data);
                        setSupplementalLossAssessmentCoverage(data.get("Optional_Coverages_Supplemental_Loss_Assessment_Coverage_OOS_END"));
                        setLawAndOrdinanceIncrease_OOS_END(data);
                        setLimitedWaterBackUpAndSumpDischarge(data.get("Optional_Coverages_Limited_Water_BackUp_And_Sump_OOS_END"));
                        setIdentityFraudProtection_OOS_END(data);
                        setPersonalPropertyReplacementCostLossSettlement(data.get("Optional_Coverages_Personal_Property_Replacement_Cost_OOS_END"));
                        setIncreasedLimitCoverageA(data.get("Optional_Coverages_Increased_Limit_CovA_OOS_END"));
                        setUnitOwnersCoverageCSpecial(data.get("Optional_Coverages_UnitOwners_CovC_Special_OOS_END"));
                        setLiabilityCoverageExtension(data.get("Optional_Coverages_Liability_Cov_Extension_OOS_END"));
                        setPersonalInjuryCoverage(data.get("Optional_Coverages_Personal_Injury_Coverage_OOS_END"));
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setLawAndOrdinanceIncrease_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "WA": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setContentsExtendedReplacementCost_OOS_END(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_OOS_END")) {
                    case "AL":
                    case "AZ":
                    case "CO":
                    case "GA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "AK":
                    case "CT":
                    case "IN":
                    case "LA":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "AR":
                    case "IA": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setFireAndLightningExtensionForLandscaping_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "FL":
                    case "IL":
                    case "KS":
                    case "NM":
                    case "OK":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "ME":
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setPropertyRemediationLimitedLiability_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "MO":
                    case "OR":
                    case "WA": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setMineSubsidenceCoverage_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyIncrease_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setLawAndOrdinanceIncrease_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension_OOS_END(data);
                        setEarthquakeLossAssessmentExtension_OOS_END(data);
                        setSinkholeCollapseExtension_OOS_END(data);
                        setBusinessPropertyExtension_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                        setThoroughbredHorseLiabilityExtension_OOS_END(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension_OOS_END(data);
                        setEnsuingFungiIncrease_OOS_END(data);
                        setIncidentalBusinessPropIncrease_OOS_END(data);
                        setLandscapingIncreasedLimits_OOS_END(data);
                        setLossAssessmentIncrease_OOS_END(data);
                        setIncidentalBusinessThresholdIncrease_OOS_END(data);
                        setLiabilityExtension_OOS_END(data);
                        setFloodCoverageExtensionDIC_OOS_END(data);
                        setHomeSystemsProtectionYes_OOS_END(data);
                    }
                    break;
                }
            }
            break;
        }

        if(isFloodDate1(data.get("Endorsement_Effective_Date_END"))){
            switch (data.get("State")){
                case "CA" :
                case "FL" :
                case "LA" :
                case "NC" :
                case "AL" :
                case "KY" :
                case "MS" :
                case "AR" :
                case "MO" : {
                    setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF"));
                }
                break;
            }
        }

        verifyBlockExists("optional coverage");
        saveChanges();
    }

    public void fillOptionalCoverages_RNW(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "LA":
                    case "GA":
                    case "PA": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "CO": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setFloodAdvantage_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "AZ":
                    case "RI": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "IN":
                    case "MS": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "NV":
                    case "MD":
                    case "CT": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "DC": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "NY": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setGuaranteedReplacementCost_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "TX": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "NJ": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setGuaranteedReplacementCost_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setCoverageForDwellingsUpToFourFamilies_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "FL": {
                        setSinkholeCollapseExtension_RNW(data);
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254_RNW(data);
                        setDebrisRemoval_RNW(data);
                        setIdentityFraudProtection_RNW(data);
                        setSectionIILiability_RNW(data);
                        setOtherStructuresOnTheResPrem_RNW(data);
                        setStructuresRented_RNW(data);
                        setSpecificStructures_RNW(data);
                        setAdditionalInsured_RNW(data);
                        setCoverageB_RNW(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setSinkholeCollapseExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setLawAndOrdinanceIncrease_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setPropertyRemediationLimitedLiability_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "WY": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setCoverageForDwellingsUpToFourFamilies_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "KS":
                    case "OR":
                    case "UT":
                    case "NM": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setFireAndLightningExtensionForLandscaping_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setCoverageForDwellingsUpToFourFamilies_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "DE": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
//                setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "MT": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "ME":
                    case "NH": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setSinkholeCollapseExtension_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "AL": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setFortifiedRoofUpgradeCoverage_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setSinkholeCollapseExtension_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "WV": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "VT": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "ND": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "WA":
                    case "OK": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setSinkholeCollapseExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    case "IA": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "KY": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setMineSubsidenceCoverage_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
//                setRoofCoveringFullReconstructionCost_RNW(data); disabled on ui
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "MN": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setCoverageForPiers_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setRoofCoveringFullReconstructionCost_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setCoverageForPiers_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "NE": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
//                setMineSubsidenceCoverage_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setCoverageForDwellingsUpToFourFamilies_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                    case "WI": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setOffPremisesOtherStructuresExtension_RNW(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "CT":
                    case "GA":
                    case "IN":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA":
                    case "OH": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "AR": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "AZ":
                    case "AL":
                    case "CO":
                    case "LA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setFireAndLightningExtensionForLandscaping_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "FL": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "IL": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setMineSubsidenceCoverage_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "IA": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "KS":
                    case "NM":
                    case "OK":
                    case "OR":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "ME":
                    case "TN": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setSinkholeCollapseExtension_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setPropertyRemediationLimitedLiability_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254_RNW(data);
                        setSupplementalLossAssessmentCoverage(data.get("Optional_Coverages_Supplemental_Loss_Assessment_Coverage_RNW"));
                        setLawAndOrdinanceIncrease_RNW(data);
                        setLimitedWaterBackUpAndSumpDischarge(data.get("Optional_Coverages_Limited_Water_BackUp_And_Sump_RNW"));
                        setIdentityFraudProtection_RNW(data);
                        setPersonalPropertyReplacementCostLossSettlement(data.get("Optional_Coverages_Personal_Property_Replacement_Cost_RNW"));
                        setIncreasedLimitCoverageA(data.get("Optional_Coverages_Increased_Limit_CovA_RNW"));
                        setUnitOwnersCoverageCSpecial(data.get("Optional_Coverages_UnitOwners_CovC_Special_RNW"));
                        setLiabilityCoverageExtension(data.get("Optional_Coverages_Liability_Cov_Extension_RNW"));
                        setPersonalInjuryCoverage(data.get("Optional_Coverages_Personal_Injury_Coverage_RNW"));
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setLawAndOrdinanceIncrease_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "WA": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setContentsExtendedReplacementCost_RNW(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_RNW")) {
                    case "AL":
                    case "AZ":
                    case "CO":
                    case "GA":
                    case "MN":
                    case "MT":
                    case "NE":
                    case "NV":
                    case "RI": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "AK":
                    case "CT":
                    case "IN":
                    case "LA":
                    case "MD":
                    case "MS":
                    case "NJ":
                    case "PA": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "AR":
                    case "IA": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setFireAndLightningExtensionForLandscaping_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "DE": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "FL":
                    case "IL":
                    case "KS":
                    case "NM":
                    case "OK":
                    case "TX":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "KY": {
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "ME":
                    case "NH":
                    case "ND":
                    case "VT": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setPropertyRemediationLimitedLiability_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "MI": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "MO":
                    case "OR":
                    case "WA": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "NY": {
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "OH": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setMineSubsidenceCoverage_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyIncrease_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setLawAndOrdinanceIncrease_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "SD": {
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension_RNW(data);
                        setEarthquakeLossAssessmentExtension_RNW(data);
                        setSinkholeCollapseExtension_RNW(data);
                        setBusinessPropertyExtension_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                        setThoroughbredHorseLiabilityExtension_RNW(data);
                    }
                    break;
                    case "WV": {
                        setBusinessPropertyExtension_RNW(data);
                        setEnsuingFungiIncrease_RNW(data);
                        setIncidentalBusinessPropIncrease_RNW(data);
                        setLandscapingIncreasedLimits_RNW(data);
                        setLossAssessmentIncrease_RNW(data);
                        setIncidentalBusinessThresholdIncrease_RNW(data);
                        setLiabilityExtension_RNW(data);
                        setFloodCoverageExtensionDIC_RNW(data);
                        setHomeSystemsProtectionYes_RNW(data);
                    }
                    break;
                }
            }
            break;
        }

        if(isFloodDate1(data.get("Effective_Date"))){
            switch (data.get("State")){
                case "CA" :
                case "FL" :
                case "LA" :
                case "NC" :
                case "AL" :
                case "KY" :
                case "MS" :
                case "AR" :
                case "MO" : {
                    setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF"));
                }
                break;
            }
        }

        verifyBlockExists("optional coverage");
        saveChanges();
    }

    public void fillOptionalCoverages(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Residence_Type_" + i)) {
            case "Homeowner": {
                switch (data.get("State_" + i)) {
                    case "AK":
                    case "LA":
                    case "GA": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "CO": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setFloodAdvantage(data, i);
                        setRoofCoveringFullReconstructionCost(data, i);
                    }
                    break;
                    case "AZ":
                    case "DC":
                    case "IN":
                    case "NV":
                    case "RI":
                    case "MD": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "NY": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setGuaranteedReplacementCost(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "TX": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setRoofCoveringFullReconstructionCost(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "NJ":
                    case "CT": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setGuaranteedReplacementCost(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "ID": {
                        setEarthquakeLossAssessmentExtension(data, i);
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "FL": {
                        setSinkholeCollapseExtension(data, i);
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "NC": {
                        setEarthquakeHO3254(data, i);
                        setDebrisRemoval(data, i);
                        setIdentityFraudProtection(data, i);
                        setSectionIILiability(data, i);
                        setOtherStructuresOnTheResPrem(data, i);
                        setStructuresRented(data, i);
                        setSpecificStructures(data, i);
                        setAdditionalInsured(data, i);
                        setCoverageB(data, i);
                    }
                    break;
                    case "VA": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setSinkholeCollapseExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                    }
                    break;
                    case "MI": {
                        setEarthquakeExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setLawAndOrdinanceIncrease(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "MA": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setPropertyRemediationLimitedLiability(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "WY":
                    case "KS": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "CA": {
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
//                setFireAndLightningExtensionForLandscaping(data,i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "DE": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
//                setFloodCoverageExtensionDIC(data,i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "MS":
                    case "MT": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setRoofCoveringFullReconstructionCost(data, i);
                    }
                    break;
                    case "ME":
                    case "NH": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                        setSinkholeCollapseExtension(data, i);
                    }
                    break;
                    case "AL": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setRoofCoveringFullReconstructionCost(data, i);
                        setFortifiedRoofUpgradeCoverage(data, i);
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                        setSinkholeCollapseExtension(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "SD": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setFloodCoverageExtensionDIC(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "WV": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setFloodCoverageExtensionDIC(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "OR":
                    case "UT":
                    case "NM": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "VT":
                    case "ND": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                    }
                    break;
                    case "WA":
                    case "OK": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "PA": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "TN": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setSinkholeCollapseExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setRoofCoveringFullReconstructionCost(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                    }
                    break;
                    case "AR": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setFloodCoverageExtensionDIC(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setRoofCoveringFullReconstructionCost(data, i);
                    }
                    case "IA": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setFloodCoverageExtensionDIC(data, i);
                        setHomeSystemsProtectionYes(data, i);
                    }
                    break;
                    case "KY": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setThoroughbredHorseLiabilityExtension(data, i);
                        setRoofCoveringFullReconstructionCost(data, i);
                    }
                    break;
                    case "IL": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setMineSubsidenceCoverage(data, i);
                        setHomeSystemsProtectionYes(data, i);
//                setRoofCoveringFullReconstructionCost(data); disabled on ,i);
//                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "MN": {
                        setEarthquakeExtension(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setCoverageForPiers(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "MO": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setCoverageForPiers(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "NE": {
                        setEarthquakeLossAssessmentExtension(data, i);
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "OH": {
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyExtension(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setEarthquakeLossAssessmentExtension(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
//                setMineSubsidenceCoverage(data,i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                    case "WI": {
                        setEarthquakeLossAssessmentExtension(data, i);
                        setEarthquakeExtension(data, i);
                        setBusinessPropertyIncrease(data, i);
                        setEnsuingFungiIncrease(data, i);
                        setIncidentalBusinessPropIncrease(data, i);
                        setLandscapingIncreasedLimits(data, i);
                        setLossAssessmentIncrease(data, i);
                        setIncidentalBusinessThresholdIncrease(data, i);
                        setLiabilityExtension(data, i);
                        setHomeSystemsProtectionYes(data, i);
                        setCoverageForDwellingsUpToFourFamilies(data, i);
                        setOffPremisesOtherStructuresExtension(data, i);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                //todo HO
            }
            break;
        }

        if(isFloodDate1(data.get("Effective_Date"))){
            switch (data.get("State")){
                case "CA" :
                case "FL" :
                case "LA" :
                case "NC" :
                case "AL" :
                case "KY" :
                case "MS" :
                case "AR" :
                case "MO" : {
                    setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF_" + i));
                }
                break;
            }
        }
    }

    public void setWouldYouLikeToQuote(String quote) throws Throwable {
        if (isElementDisplayed(wouldYouLikeToQuoteNonAdmittedPFNo)) {
            choose(wouldYouLikeToQuoteNonAdmittedPFYes, wouldYouLikeToQuoteNonAdmittedPFNo, quote, "Would you like to quote Non Admitted Primary Flood");
        }
    }

    public void fillOptionalCoveragesBlockHS(Map<String, String> data) throws Throwable {
        pause(3000);
        verifyBlockExists("optional coverage");
        switch (data.get("Risk_Addresses_Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "LA": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "GA": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "CO": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "AZ": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "NY": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "TX": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "NJ": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "FL": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setIncreaseSubLimitForScreenEnclosures(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        if (!data.get("Risk_Addresses_Hurricane_Deductible").equalsIgnoreCase("Ex-Wind")) {
                            setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        }
                        setSinkholeLossCoverage(data.get("Optional_Coverages_Sinkhole_Loss_Coverage"));
                        saveChanges();
                    }
                    break;
                    case "NC": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "SC": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "MA": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "WY": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setEnsuingFungiIncrease(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                    }
                    break;
                    case "MT": {
                        setEarthquakeExtension(data);
                        setEarthquakeLossAssessmentExtension(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "HI": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "UT": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setEarthquakeExtensionHS(data);
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "LA": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "GA": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "CO": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "AZ": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "NY": {
                        if (!earthquakeExtensionYes.isEmpty() && isElementDisplayed(earthquakeExtensionYes.get(0))) {
                            setEarthquakeExtension(data);
                        }
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "TX": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "NJ": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "FL": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        if (!data.get("Risk_Addresses_Hurricane_Deductible").equalsIgnoreCase("Ex-Wind")) {
                            setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        }
                        saveChanges();
                    }
                    break;
                    case "NC": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncrease(data);
                        setLiabilityExtension(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "SC": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncreaseHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "MA": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiIncrease(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "WY": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setEnsuingFungiIncrease(data);
                        setLossAssessmentIncrease(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setLandscapingIncreasedLimitsHS(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                    }
                    break;
                    case "MT": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "HI": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "UT": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setEarthquakeLossAssessmentExtensionHS(data);
                        setEnsuingFungiOrBacteria(data);
                        setLandscapingIncreasedLimitsHS(data);
                        setLossAssessmentIncreaseHS(data);
                        setIncidentalBusinessThresholdIncreaseHS(data);
                        setLiabilityExtensionHS(data);
                        setRebuildingToCodeIncrease(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                        saveChanges();
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOptionalCoveragesBlockHS_END(Map<String, String> data) throws Throwable {
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
                            case "LA": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiIncreaseHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiIncreaseHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiIncreaseHS_END(data);
                                setIncreaseSubLimitForScreenEnclosuresHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                setSinkholeLossCoverage(data.get("Optional_Coverages_Sinkhole_Loss_Coverage_END"));
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiIncreaseHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            case "SC": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiIncreaseHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setEnsuingFungiIncreaseHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                            }
                            break;
                            case "MT": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setEarthquakeExtensionHS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "LA": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiIncreaseHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                            }
                            break;
                            case "MT": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setEarthquakeLossAssessmentExtensionHS_END(data);
                                setEnsuingFungiOrBacteria_END(data);
                                setLandscapingIncreasedLimitsHS_END(data);
                                setLossAssessmentIncreaseHS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_END(data);
                                setLiabilityExtensionHS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase"));
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    public void fillOptionalCoveragesBlockHS_OOS_END(Map<String, String> data) throws Throwable {
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
                            case "LA": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiIncreaseHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiIncreaseHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiIncreaseHS_OOS_END(data);
                                setIncreaseSubLimitForScreenEnclosuresHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                setSinkholeLossCoverage(data.get("Optional_Coverages_Sinkhole_Loss_Coverage_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiIncreaseHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiIncreaseHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setEnsuingFungiIncreaseHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                            }
                            break;
                            case "MT": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setEarthquakeExtensionHS_OOS_END(data);
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "LA": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiIncreaseHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_END"));
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                            }
                            break;
                            case "MT": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setEarthquakeLossAssessmentExtensionHS_OOS_END(data);
                                setEnsuingFungiOrBacteria_OOS_END(data);
                                setLandscapingIncreasedLimitsHS_OOS_END(data);
                                setLossAssessmentIncreaseHS_OOS_END(data);
                                setIncidentalBusinessThresholdIncreaseHS_OOS_END(data);
                                setLiabilityExtensionHS_OOS_END(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_OOS_END"));
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    public void fillOptionalCoveragesBlockHS_RNW(Map<String, String> data) throws Throwable {
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
                            case "LA": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_ERNW"));
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setIncreaseSubLimitForScreenEnclosuresHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                setSinkholeLossCoverage(data.get("Optional_Coverages_Sinkhole_Loss_Coverage_RNW"));
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                            }
                            break;
                            case "MT": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setEarthquakeExtensionHS_RNW(data);
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "LA": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_ERNW"));
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setIncreaseSubLimitForScreenEnclosuresHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setEnsuingFungiIncreaseHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                            }
                            break;
                            case "MT": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_END(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setEarthquakeLossAssessmentExtensionHS_RNW(data);
                                setEnsuingFungiOrBacteria_RNW(data);
                                setLandscapingIncreasedLimitsHS_RNW(data);
                                setLossAssessmentIncreaseHS_RNW(data);
                                setIncidentalBusinessThresholdIncreaseHS_RNW(data);
                                setLiabilityExtensionHS_RNW(data);
                                setRebuildingToCodeIncrease_RNW(data.get("Optional_Coverages_Rebuilding_To_Code_Increase_RNW"));
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    public void fillOptionalCoveragesDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverage");
        setPersonalLiabilityCoverage(data.get("Optional_Coverage_Personal_Liability_Coverage"));
        verifyMedicalPaymentsLimit(data.get("Optional_Coverage_Medical_Payments_Limit"));
        setSoftCostsCoverage(data.get("Optional_Coverage_Soft_Costs_Coverage"), data.get("Optional_Coverage_Soft_Costs_Coverage_UW_Override"));
        if (elementExists(earthquakeExtensionYes)) {
            setEarthquakeExtensionCC(data.get("Optional_Coverage_Earthquake_Extension"));
        }
        if (data.get("State").equalsIgnoreCase("FL")) {
            setSinkholeLossCoverage(data.get("Optional_Coverage_Sinkhole_Loss_Coverage"));
        }
        setBackupSewerOrDrainIncrease(data.get("Optional_Coverages_Backup_Sewer_Or_Drain_Increase"));
        setEnsuingFungiIncrease(data.get("Optional_Coverage_Ensuing_Fungi_Increase_UW_Override"));
        setScaffoldingAndOtherConstructionForms(data.get("Optional_Coverage_Scaffolding_And_Other_Construction_Forms_UW_Override"));
        setValuablePapersAndRecordsCoverage(data.get("Optional_Coverage_Valuable_Papers_And_Records_Coverage_UW_Override"));
        setPropertyInTransit(data.get("Optional_Coverage_Property_In_Transit_UW_Override"));
        setPropertyAtATemporaryStorageLocation(data.get("Optional_Coverage_Property_At_A_Temporary_Storage_Location_UW_Override"));
        verifyExpeditedExpense(data.get("Optional_Coverage_Expedited_Expense_Limit"));
        verifyPollutantCleanUpAndRemoval(data.get("Optional_Coverage_Pollutant_Clean_Up_And_Removal_Limit"));
        verifyDebrisRemoval(data.get("Optional_Coverage_Debris_Removal_Limit"));
        verifyLandscaping(data.get("Optional_Coverage_Landscaping_Limit"));
        verifyPrecautionaryRepairs(data.get("Optional_Coverage_Precautionary_Repairs_Limit"));
        verifyTreeRemoval(data.get("Optional_Coverage_Tree_Removal_Limit"));
        saveChanges();
    }

    public void fillOptionalCoveragesDetailsCC_END(Map<String, String> data) throws Throwable {
        setPersonalLiabilityCoverage(data.get("Optional_Coverage_Personal_Liability_Coverage_END"));
        verifyMedicalPaymentsLimit(data.get("Optional_Coverage_Medical_Payments_Limit_END"));
        setSoftCostsCoverage(data.get("Optional_Coverage_Soft_Costs_Coverage_END"), data.get("Optional_Coverage_Soft_Costs_Coverage_UW_Override_END"));
        if (!data.get("State").equalsIgnoreCase("CA")) {
            setEarthquakeExtensionCC(data.get("Optional_Coverage_Earthquake_Extension_END"));
        }
        setSinkholeLossCoverage(data.get("Optional_Coverage_Sinkhole_Loss_Coverage_END"));
        setBackupSewerOrDrainIncrease(data.get("Optional_Coverages_Backup_Sewer_Or_Drain_Increase_END"));
        setEnsuingFungiIncrease(data.get("Optional_Coverage_Ensuing_Fungi_Increase_UW_Override_END"));
        setScaffoldingAndOtherConstructionForms(data.get("Optional_Coverage_Scaffolding_And_Other_Construction_Forms_UW_Override_END"));
        setValuablePapersAndRecordsCoverage(data.get("Optional_Coverage_Valuable_Papers_And_Records_Coverage_UW_Override_END"));
        setPropertyInTransit(data.get("Optional_Coverage_Property_In_Transit_UW_Override_END"));
        setPropertyAtATemporaryStorageLocation(data.get("Optional_Coverage_Property_At_A_Temporary_Storage_Location_UW_Override_END"));
        verifyExpeditedExpense(data.get("Optional_Coverage_Expedited_Expense_Limit_END"));
        verifyPollutantCleanUpAndRemoval(data.get("Optional_Coverage_Pollutant_Clean_Up_And_Removal_Limit_END"));
        verifyDebrisRemoval(data.get("Optional_Coverage_Debris_Removal_Limit_END"));
        verifyLandscaping(data.get("Optional_Coverage_Landscaping_Limit_END"));
        verifyPrecautionaryRepairs(data.get("Optional_Coverage_Precautionary_Repairs_Limit_END"));
        verifyTreeRemoval(data.get("Optional_Coverage_Tree_Removal_Limit_END"));
        saveChanges();
    }

    public void verifyExpeditedExpense(String value) {
        assertCellValue(expeditedExpense, value, "Expedited Expense");
    }

    public void verifyPollutantCleanUpAndRemoval(String value) {
        assertCellValue(pollutantCleanUpAndRemoval, value, "Pollutant Clean Up And Removal");
    }

    public void verifyDebrisRemoval(String value) {
        assertCellValue(debrisRemoval, value, "Debris Removal");
    }

    public void verifyLandscaping(String value) {
        assertCellValue(landscaping, value, "Landscaping");
    }

    public void verifyPrecautionaryRepairs(String value) {
        assertCellValue(precautionaryRepairs, value, "Precautionary Repairs");
    }

    public void verifyTreeRemoval(String value) {
        assertCellValue(treeRemoval, value, "Tree Removal");
    }

    public void setSinkholeLossCoverage(String optional_coverage_sinkhole_loss_coverage) throws Throwable {
        choose(sinkholeLossCoverageYes, sinkholeLossCoverageNo, optional_coverage_sinkhole_loss_coverage, "Sinkhole Loss Coverage");
    }

    public void setEnsuingFungiOrBacteria(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage");
        choose(ensuingFungiOrBacteriaYes, ensuingFungiOrBacteriaNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(ensuingFungiOrBacteriaCoverageLimit, data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit"), "Ensuing Fungi Or Bacteria Coverage");
        }
    }

    public void setEnsuingFungiOrBacteria_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_END");
        choose(ensuingFungiOrBacteriaYes, ensuingFungiOrBacteriaNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(ensuingFungiOrBacteriaCoverageLimit, data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit_END"), "Ensuing Fungi Or Bacteria Coverage_END");
        }
    }

    public void setEnsuingFungiOrBacteria_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_OOS_END");
        choose(ensuingFungiOrBacteriaYes, ensuingFungiOrBacteriaNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(ensuingFungiOrBacteriaCoverageLimit, data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit_OOS_END"), "Ensuing Fungi Or Bacteria CoverageOOS END");
        }
    }

    public void setEnsuingFungiOrBacteria_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_RNW");
        choose(ensuingFungiOrBacteriaYes, ensuingFungiOrBacteriaNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(ensuingFungiOrBacteriaCoverageLimit, data.get("Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit_RNW"), "Ensuing Fungi Or Bacteria CoverageOOS RNW");
        }
    }

    public void setLandscapingIncreasedLimits(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increased_Limits");
        if (hasValue(ee)) {
            choose(landscapingYes.get(0), landscapingNo, ee);
            if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub")), "Landscaping Limit");
                typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate")), "Aggregate Limit");
                if (hasValue(data.get("Optional_Coverages_Percentage_Of_CovA_Requested"))) {
                    typeTextEnter(percentageOfCovARequested, data.get("Optional_Coverages_Percentage_Of_CovA_Requested"), "% of Coverage A requested");
                }
            }
        }
    }

    private void setLandscapingIncreasedLimits_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increased_Limits_END");
        choose(landscapingYes.get(0), landscapingNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub_END")), "Landscaping Limit");
            typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate_END")), "Aggregate Limit");
            if (hasValue(data.get("Optional_Coverages_Percentage_Of_CovA_Requested_END"))) {
                typeTextEnter(percentageOfCovARequested, data.get("Optional_Coverages_Percentage_Of_CovA_Requested_END"), "% of Coverage A requested");
            }
        }
    }

    private void setLandscapingIncreasedLimits_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increased_Limits_OOS_END");
        choose(landscapingYes.get(0), landscapingNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub_OOS_END")), "Landscaping Limit");
            typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate_OOS_END")), "Aggregate Limit");
            if (hasValue(data.get("Optional_Coverages_Percentage_Of_CovA_Requested_OOS_END"))) {
                typeTextEnter(percentageOfCovARequested, data.get("Optional_Coverages_Percentage_Of_CovA_Requested_OOS_END"), "% of Coverage A requested");
            }
        }
    }

    private void setLandscapingIncreasedLimits_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increased_Limits_RNW");
        choose(landscapingYes.get(0), landscapingNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub_RNW")), "Landscaping Limit");
            typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate_RNW")), "Aggregate Limit");
            if (hasValue(data.get("Optional_Coverages_Percentage_Of_CovA_Requested_RNW"))) {
                typeTextEnter(percentageOfCovARequested, data.get("Optional_Coverages_Percentage_Of_CovA_Requested_RNW"), "% of Coverage A requested");
            }
        }
    }

    public void setLandscapingIncreasedLimitsHS(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increase");
        choose(landscapingYes.get(0), landscapingNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub")), "Landscaping Limit");
            typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate")), "Aggregate Limit");
            if (hasValue(String.valueOf(data.get("Optional_Coverages_Aggregate").equals(">5% Cov A")))) {
                typeTextEnter(percentageOfCovARequested, data.get("Optional_Coverages_Percentage_Of_CovA_Requested"), "% of Coverage A requested");
            }
        }
    }

    public void setLandscapingIncreasedLimitsHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increase_END");
        choose(landscapingYes.get(0), landscapingNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub_END")), "Landscaping Limit");
            typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate_END")), "Aggregate Limit");
        }
    }

    public void setLandscapingIncreasedLimitsHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increase_OOS_END");
        choose(landscapingYes.get(0), landscapingNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub_OOS_END")), "Landscaping Limit");
            typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate_OOS_END")), "Aggregate Limit");
        }
    }

    public void setLandscapingIncreasedLimitsHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Landscaping_Increase_RNW");
        choose(landscapingYes.get(0), landscapingNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(landscapingLimit, (data.get("Optional_Coverages_Limit_Per_Tree_Shrub_RNW")), "Landscaping Limit RNW");
            typeTextEnter(aggregateLimit, (data.get("Optional_Coverages_Aggregate_RNW")), "Aggregate Limit RNW");
        }
    }

    public void setRebuildingToCodeIncrease(String choose) throws Throwable {
        choose(rebuildingToCodeIncreaseYes, rebuildingToCodeIncreaseNo, choose, "Rebuilding To Code Increase");
    }

    public void setRebuildingToCodeIncrease_END(String choose) throws Throwable {
        choose(rebuildingToCodeIncreaseYes, rebuildingToCodeIncreaseNo, choose, "Rebuilding To Code Increase");
    }

    public void setRebuildingToCodeIncrease_RNW(String choose) throws Throwable {
        choose(rebuildingToCodeIncreaseYes, rebuildingToCodeIncreaseNo, choose, "Rebuilding To Code Increase RNW");
    }

    public void setIncreaseSubLimitForScreenEnclosures(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_Enclosures");
        choose(increaseSubLimitForScreenEnclosuresYes.get(0), increaseSubLimitForScreenEnclosuresNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(increaseSubLimitForScreenEnclosuresLimit, (data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_EnclosuresLimit")), "Increase Sub Limit for Screen EnclosuresLimit");
        }
    }

    public void setIncreaseSubLimitForScreenEnclosuresHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_Enclosures_END");
        choose(increaseSubLimitForScreenEnclosuresYes.get(0), increaseSubLimitForScreenEnclosuresNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(increaseSubLimitForScreenEnclosuresLimit, (data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_EnclosuresLimit_END")), "Increase Sub Limit for Screen EnclosuresLimit");
        }
    }

    public void setIncreaseSubLimitForScreenEnclosuresHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_Enclosures_END");
        choose(increaseSubLimitForScreenEnclosuresYes.get(0), increaseSubLimitForScreenEnclosuresNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(increaseSubLimitForScreenEnclosuresLimit, (data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_EnclosuresLimit_OOS_END")), "Increase Sub Limit for Screen EnclosuresLimit");
        }
    }

    public void setIncreaseSubLimitForScreenEnclosuresHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_Enclosures_RNW");
        choose(increaseSubLimitForScreenEnclosuresYes.get(0), increaseSubLimitForScreenEnclosuresNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(increaseSubLimitForScreenEnclosuresLimit, (data.get("Optional_Coverages_Increase_Sub_Limit_for_Screen_EnclosuresLimit_RNW")), "Increase Sub Limit for Screen EnclosuresLimit RNW");
        }
    }

    public void setBackupSewerOrDrainIncrease(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(backupOfSewerOrDrainIncreaseYes.get(0), backupOfSewerOrDrainIncreaseNo, "No", "Backup Of Sewer Or Drain Increase");
            } else {
                choose(backupOfSewerOrDrainIncreaseYes.get(0), backupOfSewerOrDrainIncreaseNo, "Yes", "Backup Of Sewer Or Drain Increase");
                typeTextEnter(backupOfSewerOrDrainIncreaseUWOverride, value, "Backup Of Sewer Or Drain Increase UW Override");
                pause(3000);
            }
        }
    }

    public void verifyMedicalPaymentsLimit(String optional_coverage_medical_payments_limit) {
        assertCellValue(medicalPaymentsLimit, optional_coverage_medical_payments_limit, "Medical payments limit");
    }

    public void setEarthquakeLossAssessmentExtension(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit");
        if (hasValue(ee)) {
            choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit");
            }
        }
    }

    private void setEarthquakeLossAssessmentExtension_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_END");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit_END");
        if (hasValue(ee)) {
            choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit");
            }
        }
    }

    private void setEarthquakeLossAssessmentExtension_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_OOS_END");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit_OOS_END");
        if (hasValue(ee)) {
            choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit");
            }
        }
    }

    private void setEarthquakeLossAssessmentExtension_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_RNW");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit_RNW");
        if (hasValue(ee)) {
            choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit");
            }
        }
    }

    public void setEarthquakeLossAssessmentExtensionHS(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit");
        choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit");
        }
    }

    public void setEarthquakeLossAssessmentExtensionHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_END");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit_END");
        choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit_END");
        }
    }

    public void setEarthquakeLossAssessmentExtensionHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_OOS_END");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit_OOS_END");
        choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit OOS END");
        }
    }

    public void setEarthquakeLossAssessmentExtensionHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_RNW");
        String value = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_Limit_RNW");
        choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit_RNW");
        }
    }

    public void setEarthquakeLossAssessmentExtension(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Loss_Assessment_Extension_" + i);
        choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setEarthquakeExtension(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Extension");
        String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible");
        if (hasValue(ee)) {
            choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                switch (data.get("State")) {
                    case "WA":
                    case "OR": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                        if (data.get("Residence_Type").equalsIgnoreCase("Homeowner"))
                            typeTextEnter(earthquakeExtensionDeductible, data.get("Optional_Coverages_Earthquake_Extension_Coverage_Type"), "Earthquake Extension Coverage Type");
                    }
                    break;
                    case "MO": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                    break;
                    default: {
                        typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                }
            }
        }
    }

    private void setEarthquakeExtension_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Extension_END");
        String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible_END");
        if (hasValue(ee)) {
            choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                switch (data.get("State_END")) {
                    case "WA":
                    case "OR": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                        if (data.get("Residence_Type_END").equalsIgnoreCase("Homeowner"))
                            typeTextEnter(earthquakeExtensionDeductible, data.get("Optional_Coverages_Earthquake_Extension_Coverage_Type_END"), "Earthquake Extension Coverage Type");
                    }
                    break;
                    case "MO": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                    break;
                    default: {
                        typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                }
            }
        }
    }

    private void setEarthquakeExtension_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Extension_OOS_END");
        String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible_OOS_END");
        if (hasValue(ee)) {
            choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                switch (data.get("State_OOS_END")) {
                    case "WA":
                    case "OR": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                        if (data.get("Residence_Type_OOS_END").equalsIgnoreCase("Homeowner"))
                            typeTextEnter(earthquakeExtensionDeductible, data.get("Optional_Coverages_Earthquake_Extension_Coverage_Type_OOS_END"), "Earthquake Extension Coverage Type");
                    }
                    break;
                    case "MO": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                    break;
                    default: {
                        typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                }
            }
        }
    }

    private void setEarthquakeExtension_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Extension_RNW");
        String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible_RNW");
        if (hasValue(ee)) {
            choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                switch (data.get("State_RNW")) {
                    case "WA":
                    case "OR": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                        if (data.get("Residence_Type_RNW").equalsIgnoreCase("Homeowner"))
                            typeTextEnter(earthquakeExtensionDeductible, data.get("Optional_Coverages_Earthquake_Extension_Coverage_Type_RNW"), "Earthquake Extension Coverage Type");
                    }
                    break;
                    case "MO": {
                        typeTextEnter(earthquakeExtensionDeductible2, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                    break;
                    default: {
                        typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension Deductible");
                    }
                }
            }
        }
    }

    public void setEarthquakeExtension(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Earthquake_Extension_" + i);
        choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setEarthquakeExtensionHS(Map<String, String> data) throws Throwable {
        try {
            String ee = data.get("Optional_Coverages_Earthquake_Extension");
            String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible");
            choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
            if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension Deductible");
            }
        } catch (Exception e) {
        }
    }

    public void setEarthquakeExtensionHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Extension_END");
        String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible_END");
        choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension Deductible_END");
        }
    }

    public void setEarthquakeExtensionHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Extension_OOS_END");
        String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible_OOS_END");
        choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension DeductibleOOS END");
        }
    }

    public void setEarthquakeExtensionHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_Extension_RNW");
        String value = data.get("Optional_Coverages_Earthquake_Extension_Deductible_RNW");
        choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(earthquakeExtensionDeductible, value, "Optional Coverages Earthquake Extension Deductible_RNW");
        }
    }

    public void setBusinessPropertyExtension(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Extension");
        if (hasValue(ee)) {
            choose(businessPropertyExtensionYes, businessPropertyExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(businessPropertyExtensionLimit, data.get("Optional_Coverages_Business_Property_Extension_Limit"), "Business Property Extension Limit");
            }
        }
    }

    private void setBusinessPropertyExtension_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Extension_END");
        if (hasValue(ee)) {
            choose(businessPropertyExtensionYes, businessPropertyExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(businessPropertyExtensionLimit, data.get("Optional_Coverages_Business_Property_Extension_Limit_END"), "Business Property Extension Limit");
            }
        }
    }

    private void setBusinessPropertyExtension_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Extension_OOS_END");
        if (hasValue(ee)) {
            choose(businessPropertyExtensionYes, businessPropertyExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(businessPropertyExtensionLimit, data.get("Optional_Coverages_Business_Property_Extension_Limit_OOS_END"), "Business Property Extension Limit");
            }
        }
    }

    private void setBusinessPropertyExtension_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Extension_RNW");
        if (hasValue(ee)) {
            choose(businessPropertyExtensionYes, businessPropertyExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(businessPropertyExtensionLimit, data.get("Optional_Coverages_Business_Property_Extension_Limit_RNW"), "Business Property Extension Limit");
            }
        }
    }

    public void setBusinessPropertyExtension(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Business_Property_Extension_" + i);
        choose(businessPropertyExtensionYes, businessPropertyExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setEnsuingFungiIncrease(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase");
        if (hasValue(ee)) {
            choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit"), "Ensuing Fungi Increase Limit");
            }
        }
    }

    private void setEnsuingFungiIncrease_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase_END");
        if (hasValue(ee)) {
            choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit_END"), "Ensuing Fungi Increase Limit");
            }
        }
    }

    private void setEnsuingFungiIncrease_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase_OOS_END");
        if (hasValue(ee)) {
            choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit_OOS_END"), "Ensuing Fungi Increase Limit");
            }
        }
    }

    private void setEnsuingFungiIncrease_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase_RNW");
        if (hasValue(ee)) {
            choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit_RNW"), "Ensuing Fungi Increase Limit");
            }
        }
    }

    public void setEnsuingFungiIncreaseHS(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase");
        choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit"), "Ensuing Fungi Increase Limit");
        }
    }

    public void setEnsuingFungiIncreaseHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase_END");
        choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit_END"), "Ensuing Fungi Increase Limit");
        }
    }

    public void setEnsuingFungiIncreaseHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase_OOS_END");
        choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit_OOS_END"), "Ensuing Fungi Increase Limit");
        }
    }

    public void setEnsuingFungiIncreaseHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Ensuing_Fungi_Increase_RNW");
        choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(ensuingFungiIncreaseLimit, data.get("Optional_Coverages_Ensuing_Fungi_Increase_Limit_RNW"), "Ensuing Fungi Increase Limit RNW");
        }
    }

    public void setEnsuingFungiIncrease(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Ensuing_Fungi_Increase_" + i);
        choose(ensuingFungiIncreaseYes.get(0), ensuingFungiIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setIncidentalBusinessPropIncrease(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Prop_Increase");
        if (hasValue(ee)) {
            if (incidentalBusinessPropIncreaseYes.size() > 0) {
                choose(incidentalBusinessPropIncreaseYes.get(0), incidentalBusinessPropIncreaseNo, ee);
                if (ee.equalsIgnoreCase("Yes")) {
                    pause(3000);
                    typeText(incidentalBusinessPropIncreaseLimit, data.get("Optional_Coverages_Incidental_Business_Prop_Limit"), "Incidental Business Prop Increase Limit");
                }
            }
        }
    }

    private void setIncidentalBusinessPropIncrease_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Prop_Increase_END");
        if (hasValue(ee)) {
            if (incidentalBusinessPropIncreaseYes.size() > 0) {
                choose(incidentalBusinessPropIncreaseYes.get(0), incidentalBusinessPropIncreaseNo, ee);
                if (ee.equalsIgnoreCase("Yes")) {
                    pause(3000);
                    typeText(incidentalBusinessPropIncreaseLimit, data.get("Optional_Coverages_Incidental_Business_Prop_Limit_END"), "Incidental Business Prop Increase Limit");
                }
            }
        }
    }

    private void setIncidentalBusinessPropIncrease_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Prop_Increase_OOS_END");
        if (hasValue(ee)) {
            if (incidentalBusinessPropIncreaseYes.size() > 0) {
                choose(incidentalBusinessPropIncreaseYes.get(0), incidentalBusinessPropIncreaseNo, ee);
                if (ee.equalsIgnoreCase("Yes")) {
                    pause(3000);
                    typeText(incidentalBusinessPropIncreaseLimit, data.get("Optional_Coverages_Incidental_Business_Prop_Limit_OOS_END"), "Incidental Business Prop Increase Limit");
                }
            }
        }
    }

    private void setIncidentalBusinessPropIncrease_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Prop_Increase_RNW");
        if (hasValue(ee)) {
            if (incidentalBusinessPropIncreaseYes.size() > 0) {
                choose(incidentalBusinessPropIncreaseYes.get(0), incidentalBusinessPropIncreaseNo, ee);
                if (ee.equalsIgnoreCase("Yes")) {
                    pause(3000);
                    typeText(incidentalBusinessPropIncreaseLimit, data.get("Optional_Coverages_Incidental_Business_Prop_Limit_RNW"), "Incidental Business Prop Increase Limit");
                }
            }
        }
    }

    public void setIncidentalBusinessPropIncrease(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Incidental_Business_Prop_Increase_" + i);
        if (incidentalBusinessPropIncreaseYes.size() > 0) {
            choose(incidentalBusinessPropIncreaseYes.get(0), incidentalBusinessPropIncreaseNo, ee);
            if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                //TODO
            }
        }
    }

    public void setLandscapingIncreasedLimits(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Landscaping_Increased_Limits_" + i);
        choose(landscapingIncreasedLimitsYes, landscapingIncreasedLimitsNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setLossAssessmentIncrease(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase");
        if (hasValue(ee)) {
            choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit"), "Loss Assessment Increase Limit");
            }
        }
    }

    private void setLossAssessmentIncrease_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase_END");
        if (hasValue(ee)) {
            choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit_END"), "Loss Assessment Increase Limit");
            }
        }
    }

    private void setLossAssessmentIncrease_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase_OOS_END");
        if (hasValue(ee)) {
            choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit_OOS_END"), "Loss Assessment Increase Limit");
            }
        }
    }

    private void setLossAssessmentIncrease_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase_RNW");
        if (hasValue(ee)) {
            choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit_RNW"), "Loss Assessment Increase Limit");
            }
        }
    }

    public void setLossAssessmentIncreaseHS(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase");
        choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            //if (data.get("State").equalsIgnoreCase("CA")) {
            //    typeText(lossAssessmentIncreaseLim, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit"), "Loss Assessment Increase Limit");
            //    pause(3000);
            //} else {
            typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit"), "Loss Assessment Increase Limit");
            pause(3000);
        }
    }

    public void setLossAssessmentIncreaseHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase_END");
        choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit_END"), "Loss Assessment Increase Limit");
            pause(3000);
        }
    }

    public void setLossAssessmentIncreaseHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase_OOS_END");
        choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit_OOS_END"), "Loss Assessment Increase Limit");
            pause(3000);
        }
    }

    public void setLossAssessmentIncreaseHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase_RNW");
        choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            typeText(lossAssessmentIncreaseLimit, data.get("Optional_Coverages_Loss_Assessment_Increase_Limit_RNW"), "Loss Assessment Increase Limit RNW");
            pause(3000);
        }
    }

    public void setLossAssessmentIncrease(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Optional_Coverages_Loss_Assessment_Increase_" + i);
        choose(lossAssessmentIncreaseYes, lossAssessmentIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setIncidentalBusinessThresholdIncrease(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase");
        if (hasValue(ee)) {
            choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type"), "Incidental Business Threshold Limit");
            }
        }
    }

    private void setIncidentalBusinessThresholdIncrease_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase_END");
        if (hasValue(ee)) {
            choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type_END"), "Incidental Business Threshold Limit");
            }
        }
    }

    private void setIncidentalBusinessThresholdIncrease_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase_OOS_END");
        if (hasValue(ee)) {
            choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type_OOS_END"), "Incidental Business Threshold Limit");
            }
        }
    }

    private void setIncidentalBusinessThresholdIncrease_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase_RNW");
        if (hasValue(ee)) {
            choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type_RNW"), "Incidental Business Threshold Limit");
            }
        }
    }

    public void setIncidentalBusinessThresholdIncreaseHS(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase");
        choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type"), "Incidental Business Threshold Limit");
        }
    }

    public void setIncidentalBusinessThresholdIncreaseHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase_END");
        choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type_END"), "Incidental Business Threshold Limit");
        }
    }

    public void setIncidentalBusinessThresholdIncreaseHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase_OOS_END");
        choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type_OOS_END"), "Incidental Business Threshold Limit");
        }
    }

    public void setIncidentalBusinessThresholdIncreaseHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase_RNW");
        choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(incidentalBusinessThresholdIncreaseIncomeType, data.get("Optional_Coverages_Incidental_Business_Threshold_Income_Type_RNW"), "Incidental Business Threshold Limit RNW");
        }
    }

    public void setIncidentalBusinessThresholdIncrease(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Optional_Coverages_Incidental_Business_Threshold_Increase_" + i);
        choose(incidentalBusinessThresholdIncreaseYes, incidentalBusinessThresholdIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setLiabilityExtension(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension");
        if (hasValue(ee)) {
            try {
                choose(liabilityExtensionYes, liabilityExtensionNo, ee);
            } catch (Exception e) {
                //
            }
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises"), "Liability Extension No of premises");
            }
        }
    }

    private void setLiabilityExtension_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension_END");
        if (hasValue(ee)) {
            try {
                choose(liabilityExtensionYes, liabilityExtensionNo, ee);
            } catch (Exception e) {
                //
            }
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises_END"), "Liability Extension No of premises");
            }
        }
    }

    private void setLiabilityExtension_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension_OOS_END");
        if (hasValue(ee)) {
            try {
                choose(liabilityExtensionYes, liabilityExtensionNo, ee);
            } catch (Exception e) {
//
            }
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises_OOS_END"), "Liability Extension No of premises");
            }
        }
    }

    private void setLiabilityExtension_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension_RNW");
        if (hasValue(ee)) {
            try {
                choose(liabilityExtensionYes, liabilityExtensionNo, ee);
            } catch (Exception e) {
//
            }
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises_RNW"), "Liability Extension No of premises");
            }
        }
    }

    public void setLiabilityExtensionHS(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension");
        if ((liabilityExtensionYes.isEnabled()) || liabilityExtensionNo.isEnabled()) {
            choose(liabilityExtensionYes, liabilityExtensionNo, ee);
            if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises"), "Liability Extension No of premises");
                //        checkCheckbox(clickToAddAndListTheRiskAddresses, "Yes", "Click To Add And List The Risk Addresses");
            }
        }
    }

    public void setLiabilityExtensionHS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension_END");
        choose(liabilityExtensionYes, liabilityExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises_END"), "Liability Extension No of premises");
            checkCheckbox(clickToAddAndListTheRiskAddresses, "Yes", "Click To Add And List The Risk Addresses");
        }
    }

    public void setLiabilityExtensionHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension_OOS_END");
        choose(liabilityExtensionYes, liabilityExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises_OOS_END"), "Liability Extension No of premises");
            checkCheckbox(clickToAddAndListTheRiskAddresses, "Yes", "Click To Add And List The Risk Addresses");
        }
    }

    public void setLiabilityExtensionHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension_RNW");
        choose(liabilityExtensionYes, liabilityExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(liabilityExtensionNoPremises, data.get("Optional_Coverages_Liability_Extension_Premises_RNW"), "Liability Extension No of premises RNW");
            checkCheckbox(clickToAddAndListTheRiskAddresses, "Yes", "Click To Add And List The Risk Addresses");
        }
    }

    public void setLiabilityExtension(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Optional_Coverages_Liability_Extension_" + i);
        choose(liabilityExtensionYes, liabilityExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setGuaranteedReplacementCost(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Guaranteed_Replacement_Cost");
        choose(guaranteedReplacementCostYes, guaranteedReplacementCostNo, ee);
    }

    private void setGuaranteedReplacementCost_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Guaranteed_Replacement_Cost_END");
        choose(guaranteedReplacementCostYes, guaranteedReplacementCostNo, ee);
    }

    private void setGuaranteedReplacementCost_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Guaranteed_Replacement_Cost_OOS_END");
        choose(guaranteedReplacementCostYes, guaranteedReplacementCostNo, ee);
    }

    private void setGuaranteedReplacementCost_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Guaranteed_Replacement_Cost_RNW");
        choose(guaranteedReplacementCostYes, guaranteedReplacementCostNo, ee);
    }

    public void setGuaranteedReplacementCost(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Guaranteed_Replacement_Cost_" + i);
        choose(guaranteedReplacementCostYes, guaranteedReplacementCostNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setHomeSystemsProtectionYes(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Home_Systems_Protection");
        if (hasValue(ee)) {
            choose(homeSystemsProtectionYes, homeSystemsProtectionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(homeSystemsProtectionLimit, data.get("Optional_Coverages_Home_Systems_Protection_Limit"), "Home Systems Protection Limit");
            }
        }
    }

    private void setHomeSystemsProtectionYes_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Home_Systems_Protection_END");
        if (hasValue(ee)) {
            choose(homeSystemsProtectionYes, homeSystemsProtectionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(homeSystemsProtectionLimit, data.get("Optional_Coverages_Home_Systems_Protection_Limit_END"), "Home Systems Protection Limit");
            }
        }
    }

    private void setHomeSystemsProtectionYes_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Home_Systems_Protection_OOS_END");
        if (hasValue(ee)) {
            choose(homeSystemsProtectionYes, homeSystemsProtectionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(homeSystemsProtectionLimit, data.get("Optional_Coverages_Home_Systems_Protection_Limit_OOS_END"), "Home Systems Protection Limit");
            }
        }
    }

    private void setHomeSystemsProtectionYes_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Home_Systems_Protection_RNW");
        if (hasValue(ee)) {
            choose(homeSystemsProtectionYes, homeSystemsProtectionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(homeSystemsProtectionLimit, data.get("Optional_Coverages_Home_Systems_Protection_Limit_RNW"), "Home Systems Protection Limit");
            }
        }
    }

    public void setHomeSystemsProtectionYes(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Home_Systems_Protection_" + i);
        choose(homeSystemsProtectionYes, homeSystemsProtectionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setBusinessPropertyIncrease(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Increase");
        if (hasValue(ee)) {
            choose(businessPropertyIncreaseYes, businessPropertyIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(4000);
                try {
                    typeText(businessPropertyIncreaseLimit, data.get("Optional_Coverages_Business_Property_Increase_Limit"), "Business Property Increase Limit");
                } catch (Exception e) {
                    try {
                        typeText(businessPropertyIncreaseLimit2, data.get("Optional_Coverages_Business_Property_Increase_Limit"), "Business Property Increase Limit");
                    } catch (Exception eee) {
                        typeText(businessProppertyIncreaseLimit3, data.get("Optional_Coverages_Business_Property_Increase_Limit"), "Business Property Increase Limit");
                    }
                }
            }
        }
    }

    private void setBusinessPropertyIncrease_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Increase_END");
        if (hasValue(ee)) {
            choose(businessPropertyIncreaseYes, businessPropertyIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(4000);
                try {
                    typeText(businessPropertyIncreaseLimit, data.get("Optional_Coverages_Business_Property_Increase_Limit_END"), "Business Property Increase Limit");
                } catch (Exception e) {
                    try {
                        typeText(businessPropertyIncreaseLimit2, data.get("Optional_Coverages_Business_Property_Increase_Limit_END"), "Business Property Increase Limit");
                    } catch (Exception eee) {
                        typeText(businessProppertyIncreaseLimit3, data.get("Optional_Coverages_Business_Property_Increase_Limit_END"), "Business Property Increase Limit");
                    }
                }
            }
        }
    }

    private void setBusinessPropertyIncrease_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Increase_OOS_END");
        if (hasValue(ee)) {
            choose(businessPropertyIncreaseYes, businessPropertyIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(4000);
                try {
                    typeText(businessPropertyIncreaseLimit, data.get("Optional_Coverages_Business_Property_Increase_Limit_OOS_END"), "Business Property Increase Limit");
                } catch (Exception e) {
                    try {
                        typeText(businessPropertyIncreaseLimit2, data.get("Optional_Coverages_Business_Property_Increase_Limit_OOS_END"), "Business Property Increase Limit");
                    } catch (Exception eee) {
                        typeText(businessProppertyIncreaseLimit3, data.get("Optional_Coverages_Business_Property_Increase_Limit_OOS_END"), "Business Property Increase Limit");
                    }
                }
            }
        }
    }

    private void setBusinessPropertyIncrease_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Business_Property_Increase_RNW");
        if (hasValue(ee)) {
            choose(businessPropertyIncreaseYes, businessPropertyIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(4000);
                try {
                    typeText(businessPropertyIncreaseLimit, data.get("Optional_Coverages_Business_Property_Increase_Limit_RNW"), "Business Property Increase Limit");
                } catch (Exception e) {
                    try {
                        typeText(businessPropertyIncreaseLimit2, data.get("Optional_Coverages_Business_Property_Increase_Limit_RNW"), "Business Property Increase Limit");
                    } catch (Exception eee) {
                        typeText(businessProppertyIncreaseLimit3, data.get("Optional_Coverages_Business_Property_Increase_Limit_RNW"), "Business Property Increase Limit");
                    }
                }
            }
        }
    }


    public void setBusinessPropertyIncrease(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Business_Property_Increase_" + i);
        choose(businessPropertyIncreaseYes, businessPropertyIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setCoverageForDwellingsUpToFourFamilies(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Dwellings_Up_To_Four_Families");
        choose(coverageForDwellingsUpToFourFamiliesYes, coverageForDwellingsUpToFourFamiliesNo, ee);
    }

    private void setCoverageForDwellingsUpToFourFamilies_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Dwellings_Up_To_Four_Families_END");
        choose(coverageForDwellingsUpToFourFamiliesYes, coverageForDwellingsUpToFourFamiliesNo, ee);
    }

    private void setCoverageForDwellingsUpToFourFamilies_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Dwellings_Up_To_Four_Families_OOS_END");
        choose(coverageForDwellingsUpToFourFamiliesYes, coverageForDwellingsUpToFourFamiliesNo, ee);
    }

    private void setCoverageForDwellingsUpToFourFamilies_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Dwellings_Up_To_Four_Families_RNW");
        choose(coverageForDwellingsUpToFourFamiliesYes, coverageForDwellingsUpToFourFamiliesNo, ee);
    }

    public void setCoverageForDwellingsUpToFourFamilies(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Coverage_For_Dwellings_Up_To_Four_Families_" + i);
        choose(coverageForDwellingsUpToFourFamiliesYes, coverageForDwellingsUpToFourFamiliesNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setOffPremisesOtherStructuresExtension(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Off_Premises_Other_Structures_Extension");
        if (hasValue(ee)) {
            choose(offPremisesOtherStructuresExtensionYes, offPremisesOtherStructuresExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(offPremisesOtherStructuresExtensionLimit, data.get("Optional_Coverages_Off_Premises_Other_Structures_Limit"), "Off Premises Other Structures Limit");
                clickFooter();
            }
        }
    }

    private void setOffPremisesOtherStructuresExtension_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Off_Premises_Other_Structures_Extension_END");
        if (hasValue(ee)) {
            choose(offPremisesOtherStructuresExtensionYes, offPremisesOtherStructuresExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(offPremisesOtherStructuresExtensionLimit, data.get("Optional_Coverages_Off_Premises_Other_Structures_Limit_END"), "Off Premises Other Structures Limit");
                clickFooter();
            }
        }
    }

    private void setOffPremisesOtherStructuresExtension_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Off_Premises_Other_Structures_Extension_OOS_END");
        if (hasValue(ee)) {
            choose(offPremisesOtherStructuresExtensionYes, offPremisesOtherStructuresExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(offPremisesOtherStructuresExtensionLimit, data.get("Optional_Coverages_Off_Premises_Other_Structures_Limit_OOS_END"), "Off Premises Other Structures Limit");
                clickFooter();
            }
        }
    }

    private void setOffPremisesOtherStructuresExtension_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Off_Premises_Other_Structures_Extension_RNW");
        if (hasValue(ee)) {
            choose(offPremisesOtherStructuresExtensionYes, offPremisesOtherStructuresExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(offPremisesOtherStructuresExtensionLimit, data.get("Optional_Coverages_Off_Premises_Other_Structures_Limit_RNW"), "Off Premises Other Structures Limit");
                clickFooter();
            }
        }
    }

    public void setOffPremisesOtherStructuresExtension(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Off_Premises_Other_Structures_Extension_" + i);
        choose(offPremisesOtherStructuresExtensionYes, offPremisesOtherStructuresExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setFloodAdvantage(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Advantage");
        choose(floodAdvantageYes, floodAdvantageNo, ee);
    }

    private void setFloodAdvantage_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Advantage_END");
        choose(floodAdvantageYes, floodAdvantageNo, ee);
    }

    private void setFloodAdvantage_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Advantage_OOS_END");
        choose(floodAdvantageYes, floodAdvantageNo, ee);
    }

    private void setFloodAdvantage_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Advantage_RNW");
        choose(floodAdvantageYes, floodAdvantageNo, ee);
    }


    public void setFloodAdvantage(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Flood_Advantage_OC_" + i);
        choose(floodAdvantageYes, floodAdvantageNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setRoofCoveringFullReconstructionCost(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost");
        choose(roofCoveringFullReconstructionCostYes, roofCoveringFullReconstructionCostNo, ee);
    }

    private void setRoofCoveringFullReconstructionCost_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost_END");
        choose(roofCoveringFullReconstructionCostYes, roofCoveringFullReconstructionCostNo, ee);
    }

    private void setRoofCoveringFullReconstructionCost_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost_RNW");
        choose(roofCoveringFullReconstructionCostYes, roofCoveringFullReconstructionCostNo, ee);
    }

    private void setRoofCoveringFullReconstructionCost_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Roof_Covering_Full_Reconstruction_Cost_OOS_END");
        choose(roofCoveringFullReconstructionCostYes, roofCoveringFullReconstructionCostNo, ee);
    }

    public void setRoofCoveringFullReconstructionCost(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Roof_Covering_Full_Reconstruction_Cost_" + i);
        choose(roofCoveringFullReconstructionCostYes, roofCoveringFullReconstructionCostNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setFloodCoverageExtensionDIC(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Coverage_Extension_DIC");
        choose(floodCoverageExtensionDICYes, floodCoverageExtensionDICNo, ee);
    }

    private void setFloodCoverageExtensionDIC_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Coverage_Extension_DIC_END");
        choose(floodCoverageExtensionDICYes, floodCoverageExtensionDICNo, ee);
    }

    private void setFloodCoverageExtensionDIC_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Coverage_Extension_DIC_OOS_END");
        choose(floodCoverageExtensionDICYes, floodCoverageExtensionDICNo, ee);
    }

    private void setFloodCoverageExtensionDIC_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Flood_Coverage_Extension_DIC_RNW");
        choose(floodCoverageExtensionDICYes, floodCoverageExtensionDICNo, ee);
    }

    public void setFloodCoverageExtensionDIC(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Flood_Coverage_Extension_DIC_" + i);
        choose(floodCoverageExtensionDICYes, floodCoverageExtensionDICNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setThoroughbredHorseLiabilityExtension(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Thoroughbred_Horse_Liability_Extension");
        if (hasValue(ee)) {
            choose(thoroughbredHorseLiabilityExtensionYes, thoroughbredHorseLiabilityExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(2000);
                typeTextEnter(thoroughbredHorseLiabilityExtensionNumOfHorses, data.get("Optional_Coverages_Number_Of_Horses"), "Number of Horses");
            }
        }
    }

    private void setThoroughbredHorseLiabilityExtension_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Thoroughbred_Horse_Liability_Extension_END");
        if (hasValue(ee)) {
            choose(thoroughbredHorseLiabilityExtensionYes, thoroughbredHorseLiabilityExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(2000);
                typeTextEnter(thoroughbredHorseLiabilityExtensionNumOfHorses, data.get("Optional_Coverages_Number_Of_Horses_END"), "Number of Horses");
            }
        }
    }

    private void setThoroughbredHorseLiabilityExtension_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Thoroughbred_Horse_Liability_Extension_OOS_END");
        if (hasValue(ee)) {
            choose(thoroughbredHorseLiabilityExtensionYes, thoroughbredHorseLiabilityExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(2000);
                typeTextEnter(thoroughbredHorseLiabilityExtensionNumOfHorses, data.get("Optional_Coverages_Number_Of_Horses_OOS_END"), "Number of Horses");
            }
        }
    }

    private void setThoroughbredHorseLiabilityExtension_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Thoroughbred_Horse_Liability_Extension_RNW");
        if (hasValue(ee)) {
            choose(thoroughbredHorseLiabilityExtensionYes, thoroughbredHorseLiabilityExtensionNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(2000);
                typeTextEnter(thoroughbredHorseLiabilityExtensionNumOfHorses, data.get("Optional_Coverages_Number_Of_Horses_RNW"), "Number of Horses");
            }
        }
    }

    public void setThoroughbredHorseLiabilityExtension(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Thoroughbred_Horse_Liability_Extension_" + i);
        choose(thoroughbredHorseLiabilityExtensionYes, thoroughbredHorseLiabilityExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setMineSubsidenceCoverage(Map<String, String> data) throws Throwable {
        //Somewhere used as radio button, somewhere as dropdown value.
        String ee = data.get("Optional_Coverages_Mine_Subsidence_Coverage");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("Yes") || ee.equalsIgnoreCase("No"))
                choose(mineSubsidenceCoverageYes, mineSubsidenceCoverageNo, ee);
            if (data.get("State").equalsIgnoreCase("IL")) {
                //coverage limits for other structures
                //descriptions
                //TODO
            } else
                typeTextEnter(mineSubsidenceCoverageInput, ee, "Mine Subsidence Coverage");
        }
    }

    private void setMineSubsidenceCoverage_END(Map<String, String> data) throws Throwable {
        //Somewhere used as radio button, somewhere as dropdown value.
        String ee = data.get("Optional_Coverages_Mine_Subsidence_Coverage_END");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("Yes") || ee.equalsIgnoreCase("No"))
                choose(mineSubsidenceCoverageYes, mineSubsidenceCoverageNo, ee);
            if (data.get("State_END").equalsIgnoreCase("IL")) {
                //coverage limits for other structures
                //descriptions
                //TODO
            } else
                typeTextEnter(mineSubsidenceCoverageInput, ee, "Mine Subsidence Coverage");
        }
    }

    private void setMineSubsidenceCoverage_OOS_END(Map<String, String> data) throws Throwable {
//Somewhere used as radio button, somewhere as dropdown value.
        String ee = data.get("Optional_Coverages_Mine_Subsidence_Coverage_OOS_END");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("Yes") || ee.equalsIgnoreCase("No"))
                choose(mineSubsidenceCoverageYes, mineSubsidenceCoverageNo, ee);
            if (data.get("State_OOS_END").equalsIgnoreCase("IL")) {
//coverage limits for other structures
//descriptions
//TODO
            } else
                typeTextEnter(mineSubsidenceCoverageInput, ee, "Mine Subsidence Coverage");
        }
    }

    private void setMineSubsidenceCoverage_RNW(Map<String, String> data) throws Throwable {
//Somewhere used as radio button, somewhere as dropdown value.
        String ee = data.get("Optional_Coverages_Mine_Subsidence_Coverage_RNW");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("Yes") || ee.equalsIgnoreCase("No"))
                choose(mineSubsidenceCoverageYes, mineSubsidenceCoverageNo, ee);
            if (data.get("State_RNW").equalsIgnoreCase("IL")) {
//coverage limits for other structures
//descriptions
//TODO
            } else
                typeTextEnter(mineSubsidenceCoverageInput, ee, "Mine Subsidence Coverage");
        }
    }

    public void setMineSubsidenceCoverage(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Mine_Subsidence_Coverage_" + i);
        choose(mineSubsidenceCoverageYes, mineSubsidenceCoverageNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setCoverageForPiers(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Piers");
        if (hasValue(ee))
            if (ee.equalsIgnoreCase("No")) {
                choose(coverageForPiersYes, coverageForPiersNo, "No");
            } else {
                choose(coverageForPiersYes, coverageForPiersNo, "Yes");
                pause(2000);
                typeTextEnter(coverageForPiersLimit, ee, "Coverage For Piers Limit");
            }
    }

    private void setCoverageForPiers_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Piers_END");
        if (hasValue(ee))
            if (ee.equalsIgnoreCase("No")) {
                choose(coverageForPiersYes, coverageForPiersNo, "No");
            } else {
                choose(coverageForPiersYes, coverageForPiersNo, "Yes");
                pause(2000);
                typeTextEnter(coverageForPiersLimit, ee, "Coverage For Piers Limit");
            }
    }

    private void setCoverageForPiers_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Piers_OOS_END");
        if (hasValue(ee))
            if (ee.equalsIgnoreCase("No")) {
                choose(coverageForPiersYes, coverageForPiersNo, "No");
            } else {
                choose(coverageForPiersYes, coverageForPiersNo, "Yes");
                pause(2000);
                typeTextEnter(coverageForPiersLimit, ee, "Coverage For Piers Limit");
            }
    }

    private void setCoverageForPiers_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Coverage_For_Piers_RNW");
        if (hasValue(ee))
            if (ee.equalsIgnoreCase("No")) {
                choose(coverageForPiersYes, coverageForPiersNo, "No");
            } else {
                choose(coverageForPiersYes, coverageForPiersNo, "Yes");
                pause(2000);
                typeTextEnter(coverageForPiersLimit, ee, "Coverage For Piers Limit");
            }
    }

    public void setCoverageForPiers(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Coverage_For_Piers_" + i);
        choose(coverageForPiersYes, coverageForPiersNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setSinkholeCollapseExtension(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Sinkhole_Collapse_Extension");
        choose(sinkholeCollapseExtensionYes, sinkholeCollapseExtensionNo, ee);
    }

    private void setSinkholeCollapseExtension_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Sinkhole_Collapse_Extension_END");
        choose(sinkholeCollapseExtensionYes, sinkholeCollapseExtensionNo, ee);
    }

    private void setSinkholeCollapseExtension_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Sinkhole_Collapse_Extension_OOS_END");
        choose(sinkholeCollapseExtensionYes, sinkholeCollapseExtensionNo, ee);
    }

    private void setSinkholeCollapseExtension_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Sinkhole_Collapse_Extension_RNW");
        choose(sinkholeCollapseExtensionYes, sinkholeCollapseExtensionNo, ee);
    }

    public void setSinkholeCollapseExtension(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Sinkhole_Collapse_Extension_" + i);
        choose(sinkholeCollapseExtensionYes, sinkholeCollapseExtensionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setFortifiedRoofUpgradeCoverage(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fortified_Roof_Upgrade_Coverage");
        choose(fortifiedRoofUpgradeCoverageYes, fortifiedRoofUpgradeCoverageNo, ee);
    }

    private void setFortifiedRoofUpgradeCoverage_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fortified_Roof_Upgrade_Coverage_END");
        choose(fortifiedRoofUpgradeCoverageYes, fortifiedRoofUpgradeCoverageNo, ee);
    }

    private void setFortifiedRoofUpgradeCoverage_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fortified_Roof_Upgrade_Coverage_OOS_END");
        choose(fortifiedRoofUpgradeCoverageYes, fortifiedRoofUpgradeCoverageNo, ee);
    }

    private void setFortifiedRoofUpgradeCoverage_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fortified_Roof_Upgrade_Coverage_RNW");
        choose(fortifiedRoofUpgradeCoverageYes, fortifiedRoofUpgradeCoverageNo, ee);
    }

    public void setFortifiedRoofUpgradeCoverage(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Fortified_Roof_Upgrade_Coverage_" + i);
        choose(fortifiedRoofUpgradeCoverageYes, fortifiedRoofUpgradeCoverageNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setFireAndLightningExtensionForLandscaping(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fire_And_Lightning_Extension_For_Landscaping");
        String override = data.get("Optional_Coverages_Fire_And_Lightning_Extension_Override");
        if (hasValue(override))
            try {
                checkCheckbox(fireAndLightningExtensionOverride, override);
            } catch (Exception e) {
                System.out.println("Override checkbox not visible in the environment");
            }
        if (hasValue(ee))
            choose(fireAndLightningExtensionForLandscapingYes, fireAndLightningExtensionForLandscapingNo, ee);
    }

    private void setFireAndLightningExtensionForLandscaping_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fire_And_Lightning_Extension_For_Landscaping_END");
        String override = data.get("Optional_Coverages_Fire_And_Lightning_Extension_Override_END");
        if (hasValue(override))
            try {
                checkCheckbox(fireAndLightningExtensionOverride, override);
            } catch (Exception e) {
                System.out.println("Override checkbox not visible in the environment");
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        if (hasValue(ee))
            choose(fireAndLightningExtensionForLandscapingYes, fireAndLightningExtensionForLandscapingNo, ee);
    }

    private void setFireAndLightningExtensionForLandscaping_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fire_And_Lightning_Extension_For_Landscaping_OOS_END");
        String override = data.get("Optional_Coverages_Fire_And_Lightning_Extension_Override_OOS_END");
        if (hasValue(override))
            try {
                checkCheckbox(fireAndLightningExtensionOverride, override);
            } catch (Exception e) {
                System.out.println("Override checkbox not visible in the environment");
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        if (hasValue(ee))
            choose(fireAndLightningExtensionForLandscapingYes, fireAndLightningExtensionForLandscapingNo, ee);
    }

    private void setFireAndLightningExtensionForLandscaping_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Fire_And_Lightning_Extension_For_Landscaping_RNW");
        String override = data.get("Optional_Coverages_Fire_And_Lightning_Extension_Override_RNW");
        if (hasValue(override))
            try {
                checkCheckbox(fireAndLightningExtensionOverride, override);
            } catch (Exception e) {
                System.out.println("Override checkbox not visible in the environment");
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        if (hasValue(ee))
            choose(fireAndLightningExtensionForLandscapingYes, fireAndLightningExtensionForLandscapingNo, ee);
    }

    public void setFireAndLightningExtensionForLandscaping(String value) throws Throwable {
        choose(fireAndLightningExtensionForLandscapingYes, fireAndLightningExtensionForLandscapingNo, value);
    }

    public void setPropertyRemediationLimitedLiability(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Property_Remediation_Limited_Liability");
        if (hasValue(ee)) {
            choose(propertyRemediationLimitedLiabilityYes, propertyRemediationLimitedLiabilityNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(propertyRemediationStorageContainer, data.get("Optional_Coverages_Property_Remediation_Location_Of_Storage_Container"), "Location Of Storage Container");
                typeTextEnter(propertyRemediationFuelRemediation, data.get("Optional_Coverages_Property_Remediation_Fuel_Remediation"), "Escaped Fuel Remediation");
                typeTextEnter(propertyRemediationFuelLiability, data.get("Optional_Coverages_Property_Remediation_Fuel_Liability"), "Escaped Fuel Liability");
            }
        }
    }

    private void setPropertyRemediationLimitedLiability_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Property_Remediation_Limited_Liability_END");
        if (hasValue(ee)) {
            choose(propertyRemediationLimitedLiabilityYes, propertyRemediationLimitedLiabilityNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(propertyRemediationStorageContainer, data.get("Optional_Coverages_Property_Remediation_Location_Of_Storage_Container_END"), "Location Of Storage Container");
                typeTextEnter(propertyRemediationFuelRemediation, data.get("Optional_Coverages_Property_Remediation_Fuel_Remediation_END"), "Escaped Fuel Remediation");
                typeTextEnter(propertyRemediationFuelLiability, data.get("Optional_Coverages_Property_Remediation_Fuel_Liability_END"), "Escaped Fuel Liability");
            }
        }
    }

    private void setPropertyRemediationLimitedLiability_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Property_Remediation_Limited_Liability_OOS_END");
        if (hasValue(ee)) {
            choose(propertyRemediationLimitedLiabilityYes, propertyRemediationLimitedLiabilityNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(propertyRemediationStorageContainer, data.get("Optional_Coverages_Property_Remediation_Location_Of_Storage_Container_OOS_END"), "Location Of Storage Container");
                typeTextEnter(propertyRemediationFuelRemediation, data.get("Optional_Coverages_Property_Remediation_Fuel_Remediation_OOS_END"), "Escaped Fuel Remediation");
                typeTextEnter(propertyRemediationFuelLiability, data.get("Optional_Coverages_Property_Remediation_Fuel_Liability_OOS_END"), "Escaped Fuel Liability");
            }
        }
    }

    private void setPropertyRemediationLimitedLiability_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Property_Remediation_Limited_Liability_RNW");
        if (hasValue(ee)) {
            choose(propertyRemediationLimitedLiabilityYes, propertyRemediationLimitedLiabilityNo, ee);
            if (ee.equalsIgnoreCase("Yes")) {
                pause(3000);
                typeTextEnter(propertyRemediationStorageContainer, data.get("Optional_Coverages_Property_Remediation_Location_Of_Storage_Container_RNW"), "Location Of Storage Container");
                typeTextEnter(propertyRemediationFuelRemediation, data.get("Optional_Coverages_Property_Remediation_Fuel_Remediation_RNW"), "Escaped Fuel Remediation");
                typeTextEnter(propertyRemediationFuelLiability, data.get("Optional_Coverages_Property_Remediation_Fuel_Liability_RNW"), "Escaped Fuel Liability");
            }
        }
    }

    public void setPropertyRemediationLimitedLiability(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Property_Remediation_Limited_Liability_" + i);
        choose(propertyRemediationLimitedLiabilityYes, propertyRemediationLimitedLiabilityNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setEarthquakeHO3254(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_HO3254");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("No")) {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "No");
            } else {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "Yes");
                pause(3000);
                typeTextEnter(earthquakeHO3254Deductible, ee, "Earthquake 32 54 Deductible");
            }
        }
    }

    private void setEarthquakeHO3254_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_HO3254_END");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("No")) {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "No");
            } else {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "Yes");
                pause(3000);
                typeTextEnter(earthquakeHO3254Deductible, ee, "Earthquake 32 54 Deductible");
            }
        }
    }

    private void setEarthquakeHO3254_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_HO3254_OOS_END");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("No")) {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "No");
            } else {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "Yes");
                pause(3000);
                typeTextEnter(earthquakeHO3254Deductible, ee, "Earthquake 32 54 Deductible");
            }
        }
    }

    private void setEarthquakeHO3254_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Earthquake_HO3254_RNW");
        if (hasValue(ee)) {
            if (ee.equalsIgnoreCase("No")) {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "No");
            } else {
                choose(earthquakeHO3254Yes, earthquakeHO3254No, "Yes");
                pause(3000);
                typeTextEnter(earthquakeHO3254Deductible, ee, "Earthquake 32 54 Deductible");
            }
        }
    }

    public void setEarthquakeHO3254(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Earthquake_HO3254_" + i);
        choose(earthquakeHO3254Yes, earthquakeHO3254No, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setDebrisRemoval(Map<String, String> data) throws Throwable {
        String ee = data.get("Debris_Removal");
        choose(debrisRemovalYes.get(0), debrisRemovalNo, ee);
    }

    private void setDebrisRemoval_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Debris_Removal_END");
        choose(debrisRemovalYes.get(0), debrisRemovalNo, ee);
    }

    private void setDebrisRemoval_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Debris_Removal_OOS_END");
        choose(debrisRemovalYes.get(0), debrisRemovalNo, ee);
    }

    private void setDebrisRemoval_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Debris_Removal_RNW");
        choose(debrisRemovalYes.get(0), debrisRemovalNo, ee);
    }

    public void setDebrisRemoval(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Debris_Removal_" + i);
        choose(debrisRemovalYes.get(0), debrisRemovalNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setIdentityFraudProtection(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Identity_Fraud_Protection");
        choose(identityFraudProtectionYes, identityFraudProtectionNo, ee);
    }

    private void setIdentityFraudProtection_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Identity_Fraud_Protection_END");
        choose(identityFraudProtectionYes, identityFraudProtectionNo, ee);
    }

    private void setIdentityFraudProtection_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Identity_Fraud_Protection_OOS_END");
        choose(identityFraudProtectionYes, identityFraudProtectionNo, ee);
    }

    private void setIdentityFraudProtection_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Identity_Fraud_Protection_RNW");
        choose(identityFraudProtectionYes, identityFraudProtectionNo, ee);
    }

    public void setIdentityFraudProtection(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Identity_Fraud_Protection_" + i);
        choose(identityFraudProtectionYes, identityFraudProtectionNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setSectionIILiability(Map<String, String> data) throws Throwable {
        String ee = data.get("Section_II_Liability");
        choose(sectionIILiabilityYes, sectionIILiabilityNo, ee);
    }

    private void setSectionIILiability_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Section_II_Liability_END");
        choose(sectionIILiabilityYes, sectionIILiabilityNo, ee);
    }

    private void setSectionIILiability_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Section_II_Liability_OOS_END");
        choose(sectionIILiabilityYes, sectionIILiabilityNo, ee);
    }

    private void setSectionIILiability_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Section_II_Liability_RNW");
        choose(sectionIILiabilityYes, sectionIILiabilityNo, ee);
    }

    public void setSectionIILiability(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Section_II_Liability_" + i);
        choose(sectionIILiabilityYes, sectionIILiabilityNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setOtherStructuresOnTheResPrem(Map<String, String> data) throws Throwable {
        String ee = data.get("Other_Structures_On_The_Res_Prem");
        choose(otherStructuresOnTheResPremYes, otherStructuresOnTheResPremNo, ee);
    }

    private void setOtherStructuresOnTheResPrem_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Other_Structures_On_The_Res_Prem_END");
        choose(otherStructuresOnTheResPremYes, otherStructuresOnTheResPremNo, ee);
    }

    private void setOtherStructuresOnTheResPrem_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Other_Structures_On_The_Res_Prem_OOS_END");
        choose(otherStructuresOnTheResPremYes, otherStructuresOnTheResPremNo, ee);
    }

    private void setOtherStructuresOnTheResPrem_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Other_Structures_On_The_Res_Prem_RNW");
        choose(otherStructuresOnTheResPremYes, otherStructuresOnTheResPremNo, ee);
    }

    public void setOtherStructuresOnTheResPrem(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Other_Structures_On_The_Res_Prem_" + i);
        choose(otherStructuresOnTheResPremYes, otherStructuresOnTheResPremNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setStructuresRented(Map<String, String> data) throws Throwable {
        String ee = data.get("Structures_Rented");
        choose(structuresRentedYes, structuresRentedNo, ee);
    }

    private void setStructuresRented_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Structures_Rented_END");
        choose(structuresRentedYes, structuresRentedNo, ee);
    }

    private void setStructuresRented_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Structures_Rented_OOS_END");
        choose(structuresRentedYes, structuresRentedNo, ee);
    }

    private void setStructuresRented_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Structures_Rented_RNW");
        choose(structuresRentedYes, structuresRentedNo, ee);
    }

    public void setStructuresRented(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Structures_Rented_" + i);
        choose(structuresRentedYes, structuresRentedNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setLawAndOrdinanceIncrease(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Law_And_Ordinance_Increase");
        if (hasValue(ee)) {
            choose(lawAndOrdinanceIncreaseYes, lawAndOrdinanceIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes") && data.get("State").equalsIgnoreCase("FL")) {
                pause(2000);
                setLawAndOrdinanceIncreaseOption(data.get("Optional_Coverages_Law_And_Ordinance_Option"));
            }
        }
    }

    private void setLawAndOrdinanceIncrease_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Law_And_Ordinance_Increase_END");
        if (hasValue(ee)) {
            choose(lawAndOrdinanceIncreaseYes, lawAndOrdinanceIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes") && data.get("State_END").equalsIgnoreCase("FL")) {
                pause(2000);
                setLawAndOrdinanceIncreaseOption(data.get("Optional_Coverages_Law_And_Ordinance_Option_END"));
            }
        }
    }

    private void setLawAndOrdinanceIncrease_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Law_And_Ordinance_Increase_OOS_END");
        if (hasValue(ee)) {
            choose(lawAndOrdinanceIncreaseYes, lawAndOrdinanceIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes") && data.get("State_OOS_END").equalsIgnoreCase("FL")) {
                pause(2000);
                setLawAndOrdinanceIncreaseOption(data.get("Optional_Coverages_Law_And_Ordinance_Option_OOS_END"));
            }
        }
    }

    private void setLawAndOrdinanceIncrease_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverages_Law_And_Ordinance_Increase_RNW");
        if (hasValue(ee)) {
            choose(lawAndOrdinanceIncreaseYes, lawAndOrdinanceIncreaseNo, ee);
            if (ee.equalsIgnoreCase("Yes") && data.get("State_RNW").equalsIgnoreCase("FL")) {
                pause(2000);
                setLawAndOrdinanceIncreaseOption(data.get("Optional_Coverages_Law_And_Ordinance_Option_RNW"));
            }
        }
    }

    public void setLawAndOrdinanceIncrease(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Law_And_Ordinance_Increase_" + i);
        choose(lawAndOrdinanceIncreaseYes, lawAndOrdinanceIncreaseNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setSpecificStructures(Map<String, String> data) throws Throwable {
        String ee = data.get("Specific_Structures");
        choose(specificStructuresYes, specificStructuresNo, ee);
    }

    private void setSpecificStructures_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Specific_Structures_END");
        choose(specificStructuresYes, specificStructuresNo, ee);
    }

    private void setSpecificStructures_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Specific_Structures_OOS_END");
        choose(specificStructuresYes, specificStructuresNo, ee);
    }

    private void setSpecificStructures_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Specific_Structures_RNW");
        choose(specificStructuresYes, specificStructuresNo, ee);
    }

    public void setSpecificStructures(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Specific_Structures_" + i);
        choose(specificStructuresYes, specificStructuresNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setAdditionalInsured(Map<String, String> data) throws Throwable {
        String ee = data.get("Additional_Insured");
        choose(additionalInsuredYes, additionalInsuredNo, ee);
    }

    private void setAdditionalInsured_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Additional_Insured_END");
        choose(additionalInsuredYes, additionalInsuredNo, ee);
    }

    private void setAdditionalInsured_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Additional_Insured_OOS_END");
        choose(additionalInsuredYes, additionalInsuredNo, ee);
    }

    private void setAdditionalInsured_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Additional_Insured_RNW");
        choose(additionalInsuredYes, additionalInsuredNo, ee);
    }

    public void setAdditionalInsured(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Additional_Insured_" + i);
        choose(additionalInsuredYes, additionalInsuredNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setCoverageB(Map<String, String> data) throws Throwable {
        String ee = data.get("Coverage_B_Other_Structures");
        choose(coverageBYes, coverageBNo, ee);
    }

    private void setCoverageB_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Coverage_B_Other_Structures_END");
        choose(coverageBYes, coverageBNo, ee);
    }

    private void setCoverageB_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Coverage_B_Other_Structures_OOS_END");
        choose(coverageBYes, coverageBNo, ee);
    }

    private void setCoverageB_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Coverage_B_Other_Structures_RNW");
        choose(coverageBYes, coverageBNo, ee);
    }

    public void setCoverageB(Map<String, String> data, int i) throws Throwable {
        String ee = data.get("Coverage_B_Other_Structures_" + i);
        choose(coverageBYes, coverageBNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            //TODO
        }
    }

    public void setSoftCostsCoverage(String value, String override) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(softCostsCoverageYes.get(0), softCostsCoverageNo, "No", "Soft Costs Coverage");
            } else {
                choose(softCostsCoverageYes.get(0), softCostsCoverageNo, "Yes", "Soft Costs Coverage");
                typeTextEnter(softCostsCoverageLimit, value, "Soft Costs Coverage Limit");
            }
        }
        if (hasValue(override)) {
            typeTextEnter(softCostsCoverageLimitUWOverride, value, "Soft Costs Coverage Limit UWOverride");
        }
    }

    public void setMedicalPayments(String value) throws Throwable {
        if (hasValue(value)) {
            if (elementExists(medicalPaymentsYes)) {
                choose(medicalPaymentsYes.get(0), medicalPaymentsNo, "Yes", "Medical Payments");
                typeText(medicalPaymentsLimit, value, "Medical Payments");
            }
        }
    }

    public void setPersonalLiabilityCoverage(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(personalLiabilityCoverageYes.get(0), personalLiabilityCoverageNo, "No", "Personal Liability Coverage");
            } else {
                choose(personalLiabilityCoverageYes.get(0), personalLiabilityCoverageNo, "Yes", "Personal Liability Coverage");
                typeTextEnter(personalLiabilityCoverageLimit, value, "Personal Liability Coverage Limit");
            }
        }
    }

    public void setEarthquakeExtension(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, "No", "Earthquake Extension");
            } else {
                choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, "Yes", "Earthquake Extension");
                typeTextEnter(earthquakeExtensionDeductible, value, "Earthquake Extension Deductible");
            }
        }
    }

    public void setEarthquakeExtensionCC(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, "No", "Earthquake Extension");
            } else {
                choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, "Yes", "Earthquake Extension");
                typeTextEnter(earthquakeExtensionDeductibleCC, value, "Earthquake Extension Deductible");
                pause(500);
                clickFooter();
            }
        }
    }

    public void setEnsuingFungiIncrease(String value) {
        typeTextEnter(ensuingFungiIncreaseLimitUWOverride, value, "Ensuing Fungi Increase Limit UWOverride");
    }

    public void setScaffoldingAndOtherConstructionForms(String value) {
        typeTextEnter(scaffoldingAndOtherConstructionFormsLimitUWOverride, value, "Scaffolding And Other Construction Forms Limit UWOverride");
    }

    public void setValuablePapersAndRecordsCoverage(String value) {
        typeTextEnter(valuablePapersAndRecordsCoverageLimitUWOverride, value, "Valuable Papers And Records Coverage Limit UWOverride");
    }

    public void setPropertyInTransit(String value) {
        typeTextEnter(propertyInTransitLimitUWOverride, value, "Property In Transit Limit UWOverride");
    }

    public void setPropertyAtATemporaryStorageLocation(String value) {
        typeTextEnter(propertyAtATemporaryStorageLocationLimitUWOverride, value, "Property At A Temporary Storage Location Limit UWOverride");
    }

    public void setContentsExtendedReplacementCost(Map<String, String> data) throws Throwable {
        String value = data.get("Optional_Coverages_Contents_Extended_Replacement_Cost");
        choose(contentsExtendedReplacementCostYes, contentsExtendedReplacementCostNo, value);
    }

    private void setContentsExtendedReplacementCost_END(Map<String, String> data) throws Throwable {
        String value = data.get("Optional_Coverages_Contents_Extended_Replacement_Cost_END");
        choose(contentsExtendedReplacementCostYes, contentsExtendedReplacementCostNo, value);
    }

    private void setContentsExtendedReplacementCost_OOS_END(Map<String, String> data) throws Throwable {
        String value = data.get("Optional_Coverages_Contents_Extended_Replacement_Cost_OOS_END");
        choose(contentsExtendedReplacementCostYes, contentsExtendedReplacementCostNo, value);
    }

    private void setContentsExtendedReplacementCost_RNW(Map<String, String> data) throws Throwable {
        String value = data.get("Optional_Coverages_Contents_Extended_Replacement_Cost_RNW");
        choose(contentsExtendedReplacementCostYes, contentsExtendedReplacementCostNo, value);
    }

    public void setSupplementalLossAssessmentCoverage(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(supplementalLossAssessmentCoverageYes, supplementalLossAssessmentCoverageNo, "No");
            } else {
                choose(supplementalLossAssessmentCoverageYes, supplementalLossAssessmentCoverageNo, "Yes");
                pause(2000);
                typeTextEnter(supplementalLossAssessmentCoverageLimit, value, "Supplemental Loss Assessment Coverage Limit");
            }
        }
    }

    public void setLimitedWaterBackUpAndSumpDischarge(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(limitedWaterBackUpAndSumpDischargeYes, limitedWaterBackUpAndSumpDischargeNo, "No");
            } else {
                choose(limitedWaterBackUpAndSumpDischargeYes, limitedWaterBackUpAndSumpDischargeNo, "Yes");
                pause(2000);
                typeTextEnter(limitedWaterBackUpAndSumpDischargeLimit, value, "Limited Water Back Up And Sump Discharge Limit");
            }
        }
    }

    public void setIncreasedLimitCoverageA(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(increasedLimitCoverageAYes, increasedLimitCoverageANo, "No");
            } else {
                choose(increasedLimitCoverageAYes, increasedLimitCoverageANo, "Yes");
                pause(2000);
                typeTextEnter(increasedLimitCoverageALimit, value, "Increased Limit Coverage A");
            }
        }
    }

    public void setPersonalPropertyReplacementCostLossSettlement(String value) throws Throwable {
        choose(personalPropertyReplacementCostLossSettlementYes, personalPropertyReplacementCostLossSettlementNo, value);
    }

    public void setUnitOwnersCoverageCSpecial(String value) throws Throwable {
        choose(unitOwnersCoverageCSpecialYes, unitOwnersCoverageCSpecialNo, value);
    }

    public void setLiabilityCoverageExtension(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(liabilityCoverageExtensionYes, liabilityCoverageExtensionNo, "No");
            } else {
                choose(liabilityCoverageExtensionYes, liabilityCoverageExtensionNo, "Yes");
                pause(2000);
                typeTextEnter(liabilityCoverageExtensionNoOfPremises, value, "Liability Coverage Extension No of premises");
            }
        }
    }

    public void setPersonalInjuryCoverage(String value) throws Throwable {
        choose(personalInjuryCoverageYes, personalInjuryCoverageNo, value);
    }

    public void setLawAndOrdinanceIncreaseOption(String value) {
        typeTextEnter(lawAndOrdinanceIncreaseOption, value, "Law And Ordinance Increase - Option");
    }

    public void clickEarthquakeExtensionDeductibleDropdown() {
        clickElement(earthquakeExtensionDeductible, "earthquake extension");
    }

    public void setEarthquakeExtensionDeductible(String value) {
        typeTextEnter(earthquakeExtensionDeductible, value, "earthquake extension deductible");
    }

    public void setEarthquakeExtensionRadioButton(String value) throws Throwable {
        choose(earthquakeExtensionYes.get(0), earthquakeExtensionNo, value, "earthquake extension");
    }

    public void setEarthquakeLossAssessmentExtension(String value) throws Throwable {
        choose(earthquakeLossAssessmentExtensionYes, earthquakeLossAssessmentExtensionNo, value, "eq loss assessment extension");
    }

    public void setEarthquakeLossAssessmentExtensionLimit(String value) throws Throwable {
        typeTextEnter(earthquakeLossAssessmentLimit, value, "Earthquake Loss Assessment Limit");
        clickFooter();
    }

    public void fillOptionalCoveragesBlockCO(Map<String, String> data) throws Throwable {
        pause(3000);
        verifyBlockExists("optional coverages");

        switch (data.get("State")) {

            case "AK":
            case "TX":
            case "IL":
            case "GA":
            case "MD":
            case "CT": {
                setAlarmEndorsement(data.get("Optional_Coverage_Alarm_Endorsement"));
                setBaggageExclusion(data.get("Optional_Coverage_Baggage_Exclusion"));
                setOptionalHurricaneDeductible(data.get("Optional_Coverage_Hurricane_Deductible"));
                setPersonalSecurityClause(data.get("Optional_Coverage_Personal_Security_Clause"));
                setSpoilageExclusion(data.get("Optional_Coverage_Spoilage_Exclusion"));
                setMarketValueForScheduledItems(data.get("Optional_Coverage_Market_Value_For_Scheduled_Items"));
                setExcessCoverage(data);
                saveChanges();
            }
            break;
            case "NY":
            case "AR":
            case "WA":
            case "FL":
            case "WY":
            case "AL":
            case "SC":
            case "MS":
            case "LA":
            case "NJ":
            case "HI":
            case "ID":
            case "MI":
            case "VA":
            case "ME":
            case "DC":
            case "NE":
            case "DE":
            case "MT":
            case "OK":
            case "VT":
            case "NH":
            case "RI":
            case "CA":
            case "OR":
            case "ND":
            case "KS":
            case "OH":
            case "WV":
            case "IA":
            case "MN":
            case "UT":
            case "MO":
            case "NV":
            case "SD":
            case "KY":
            case "PA":
            case "TN":
            case "IN": {
                setAlarmEndorsement(data.get("Optional_Coverage_Alarm_Endorsement"));
                setBaggageExclusion(data.get("Optional_Coverage_Baggage_Exclusion"));
                setOptionalHurricaneDeductible(data.get("Optional_Coverage_Hurricane_Deductible"));
                setPersonalSecurityClause(data.get("Optional_Coverage_Personal_Security_Clause"));
                setSpoilageExclusion(data.get("Optional_Coverage_Spoilage_Exclusion"));
                setMarketValueForScheduledItems(data.get("Optional_Coverage_Market_Value_For_Scheduled_Items"));
                setAgreedValue(data.get("Optional_Coverage_Agreed_Value"));
                setAgreedValueSpecifiedClasses(data);
                saveChanges();
            }
            break;
            case "WI":
            case "AZ":{
                    setAlarmEndorsement(data.get("Optional_Coverage_Alarm_Endorsement"));
                    setBaggageExclusion(data.get("Optional_Coverage_Baggage_Exclusion"));
                    setOptionalHurricaneDeductible(data.get("Optional_Coverage_Hurricane_Deductible"));
                    setPersonalSecurityClause(data.get("Optional_Coverage_Personal_Security_Clause"));
                    setSpoilageExclusion(data.get("Optional_Coverage_Spoilage_Exclusion"));
                    setMarketValueForScheduledItems(data.get("Optional_Coverage_Market_Value_For_Scheduled_Items"));
                    saveChanges();
            }
            break;
            case "CO":
            case "NC":
            case "NM":
            case "MA":{
                setAlarmEndorsement(data.get("Optional_Coverage_Alarm_Endorsement"));
                setBaggageExclusion(data.get("Optional_Coverage_Baggage_Exclusion"));
                setOptionalHurricaneDeductible(data.get("Optional_Coverage_Hurricane_Deductible"));
                setPersonalSecurityClause(data.get("Optional_Coverage_Personal_Security_Clause"));
                setSpoilageExclusion(data.get("Optional_Coverage_Spoilage_Exclusion"));
                saveChanges();
            }
            break;
        }
    }

    public void setAgreedValueSpecifiedClasses(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverage_Agreed_Value_Specified_Classes");
        choose(agreedValueSpecifiedClassesYes, agreedValueSpecifiedClassesNo, ee , "Excess Coverage");
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            selectSpecifiedClasses(data.get("Optional_Coverage_Specified_Classes"));
        }
    }

    public void selectSpecifiedClasses(String selectClass) {
        clickElement(driver.findElements(By.xpath("(//label[text()='" + selectClass + "']/../span/input)[2]")).get(0), "Specified Class");
    }

    public void setAgreedValue(String value) throws Throwable {
        if (hasValue(value)) {
            choose(agreedValueYes, agreedValueNo, value, "Agreed Value");
        }
    }

    public void setAlarmEndorsement(String value) throws Throwable {
        if (hasValue(value)) {
            choose(alarmEndorsementYes, alarmEndorsementNo, value, "Alarm Endorsement");
        }
    }

    public void setBaggageExclusion(String value) throws Throwable {
        if (hasValue(value)) {
            choose(baggageExclusionYes, baggageExclusionNo, value, "Baggage Exclusion");
        }
    }

    public void setOptionalHurricaneDeductible(String value) throws Throwable {
        if (hasValue(value)) {
            choose(optionalHurricaneDeductibleYes, optionalHurricaneDeductibleNo, value, "Optional Hurricane Deductible");
        }
    }

    public void setPersonalSecurityClause(String value) throws Throwable {
        if (hasValue(value)) {
            choose(personalSecurityClauseYes, personalSecurityClauseNo, value, "Personal Security Clause");
        }
    }

    public void setSpoilageExclusion(String value) throws Throwable {
        if (hasValue(value)) {
            choose(spoilageExclusionYes, spoilageExclusionNo, value, "SpoilageExclusion");
        }
    }

    public void setMarketValueForScheduledItems(String value) throws Throwable {
        if (hasValue(value)) {
            choose(marketValueForScheduledItemsYes, marketValueForScheduledItemsNo, value, "Market Value For Scheduled Items");
        }
    }

    public void setExcessCoverage(Map<String, String> data) throws Throwable {
        String ee = data.get("Optional_Coverage_Excess_Coverage");
        choose(setExcessCoverageYes, setExcessCoverageNo, ee , "Excess Coverage");
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            typeText(excessCoverageLimit, data.get("Optional_Coverage_Excess_Coverage_Limit"), "Excess Coverage Limit");
            pause(3000);
        }
    }

}