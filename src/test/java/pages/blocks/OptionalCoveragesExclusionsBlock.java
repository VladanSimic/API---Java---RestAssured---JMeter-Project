package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class OptionalCoveragesExclusionsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OptionalCoveragesExclusionsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Libel/Slander Exclusion')]/../../../..//input")
    WebElement libelSlanderExclusion;
    @FindBy(xpath = "//div[contains(text(),'Political Activity Exclusion')]/../../../..//input")
    WebElement politicalActivityExclusion;
    @FindBy(xpath = "//div[contains(text(),'Premises Liability Limitation')]/../../../..//input")
    WebElement premisesLiabilityLimitation;
    @FindBy(xpath = "//div[contains(text(),'Higher Underlying Limit')]/../../../..//input")
    WebElement higherUnderlyingLimit;
    @FindBy(xpath = "//label[text()='Auto']/..//input")
    WebElement auto;
    @FindBy(xpath = "//label[text()='Homeowners']/..//input")
    WebElement homeowners;
    @FindBy(xpath = "//label[text()='UIM']/..//input")
    WebElement uim;
    @FindBy(xpath = "//label[text()='Watercraft']/..//input")
    WebElement watercraft;
    @FindBy(xpath = "//label[text()='Recreational Vehicles']/..//input")
    WebElement recreationalVehicles;
    @FindBy(xpath = "//input[@value = '- Select -']")
    List<WebElement> limits;
    @FindBy(xpath = "//div[contains(text(),'Primary Flood Dec Page Received?')]/../../../..//label[text()='Yes']/..//input")
    WebElement floodDecPageReceivedYes;
    @FindBy(xpath = "//div[contains(text(),'Primary Flood Dec Page Received?')]/../../../..//label[text()='No']/..//input")
    WebElement floodDecPageReceivedNo;
    @FindBy(xpath = "//div[contains(text(),'Animal Liability Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> animalLiabilityExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Animal Liability Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement animalLiabilityExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Broadened Liability Coverage')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> broadenedLiabilityCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Broadened Liability Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement broadenedLiabilityCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Broadened Liability Coverage Libel Slander Excluded')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> broadenedLiabilityCoverageLibelSlanderExcludedYes;
    @FindBy(xpath = "//div[contains(text(),'Broadened Liability Coverage Libel Slander Excluded')]/../../../..//label[text()='No']/..//input")
    WebElement broadenedLiabilityCoverageLibelSlanderExcludedNo;
    @FindBy(xpath = "//div[contains(text(),'Business Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> businessExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Business Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement businessExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Cosmetic Marring Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> cosmeticMarringExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Cosmetic Marring Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement cosmeticMarringExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Exterior Insulation and Finish Systems (EIFS) Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> exteriorInsulationAndFinishSystemsEIFSExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Exterior Insulation and Finish Systems (EIFS) Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement exteriorInsulationAndFinishSystemsEIFSExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Minimum Earned Premium')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> minimumEarnedPremiumYes;
    @FindBy(xpath = "//div[contains(text(),'Minimum Earned Premium')]/../../../..//label[text()='No']/..//input")
    WebElement minimumEarnedPremiumNo;
    @FindBy(xpath = "//div[text()='Minimum Earned Premium']/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement minimumEarnedPremiumLimit;
    @FindBy(xpath = "(//div[text()='Minimum Earned Premium']/../../../../../../../../../../..//label[text()='UW Override Minimum Earned Premium']/..//input)|(//div[text()='Minimum Earned Premium']/../../../../../../../../../../../..//label[text()='UW Override Minimum Earned Premium']/..//input)")
    WebElement minimumEarnedPremiumUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Named Structures Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> namedStructuresExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Named Structures Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement namedStructuresExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Contents Extended Replacement Cost')]/../../../..//label[text()='Yes']/..//input")
    WebElement exclusionContentsExtendedReplacementCostYes;
    @FindBy(xpath = "//div[contains(text(),'Contents Extended Replacement Cost')]/../../../..//label[text()='No']/..//input")
    WebElement exclusionContentsExtendedReplacementCostNo;
    @FindBy(xpath = "//div[contains(text(),'Named Other Structures Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement namedOtherStructuresExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Named Other Structures Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement namedOtherStructuresExclusionNo;
    @FindBy(xpath = "//div[text()='Named Other Structures Exclusion']/../../../../../../../../../../..//textarea")
    WebElement namedOtherStructuresExclusionInput;
    @FindBy(xpath = "//div[text()='Named Structures Exclusion']/../../../../../../../../../../..//div[text()='Name structures to be excluded']/../../../..//textarea")
    WebElement namedStructuresToBeExcluded;
    @FindBy(xpath = "//div[contains(text(),'Screen Enclosure Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> screenEnclosureExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Screen Enclosure Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement screenEnclosureExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Swimming Pool Liability Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> swimmingPoolLiabilityExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Swimming Pool Liability Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement swimmingPoolLiabilityExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Tenant Animal Liability Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> tenantAnimalLiabilityExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Tenant Animal Liability Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement tenantAnimalLiabilityExclusionNo;
    @FindBy(xpath = "//div[text()='Tenant Animal Liability Exclusion']/../../../../../../../../../../..//label[text()='UW override Tenant Animal Liability Exclusion']/..//input")
    WebElement tenantAnimalLiabilityUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Special Water Damage Deductible')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> specialWaterDamageDeductibleYes;
    @FindBy(xpath = "//div[contains(text(),'Special Water Damage Deductible')]/../../../..//label[text()='No']/..//input")
    WebElement specialWaterDamageDeductibleNo;
    @FindBy(xpath = "//div[contains(text(),'Water Damage Deductible')]/../../../..//label[text()='No']/..//input")
    WebElement waterDamageDeductibleNo;
    @FindBy(xpath = "//div[contains(text(),'Special Water Damage Deductible')]/../../../../../../../../../../..//div[text()='Coverage Type']/../../../..//input")
    List<WebElement> specialWaterDamageCoverageType;
    @FindBy(xpath = "//div[contains(text(),'Special Water Damage Deductible')]/../../../../../../../../../../../..//div[text()='Deductible']/../../../..//input")
    List<WebElement> specialWaterDamageDeductible;
    @FindBy(xpath = "//div[contains(text(),'Special Water Damage Deductible')]/../../../../../../../../../../../..//label[text()='UW Override Special Water Damage Deductible']/..//input")
    List<WebElement> specialWaterDamageDeductibleUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Roof Reconstruction Cost Schedule')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> roofReconstructionCostScheduleYes;
    @FindBy(xpath = "//div[contains(text(),'Roof Reconstruction Cost Schedule')]/../../../..//label[text()='No']/..//input")
    WebElement roofReconstructionCostScheduleNo;
    @FindBy(xpath = "//div[contains(text(),'Roof Reconstruction Cost Schedule')]/../../../../../../../../../../..//label[text()='UW Override Roof Reconstruction Cost Schedule']/..//input")
    WebElement roofReconstructionCostScheduleUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Roof Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> roofExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Roof Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement roofExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Roof Exclusion')]/../../../../../../../../../../..//label[text()='UW Override Roof Exclusion']/..//input")
    WebElement roofExclusionUWOverride;
    @FindBy(xpath = "//div[text()='Broadened Loss of Use Coverage']/../../../..//label[text()='Yes']/..//input")
    WebElement broadenedLossOfUseCoverageYes;
    @FindBy(xpath = "//div[text()='Broadened Loss of Use Coverage']/../../../..//label[text()='No']/..//input")
    WebElement broadenedLossOfUseCoverageNo;
    @FindBy(xpath = "//div[text()='Enhanced Residential Coverage']/../../../..//label[text()='Yes']/..//input")
    WebElement enhancedResidentialCoverageYes;
    @FindBy(xpath = "//div[text()='Enhanced Residential Coverage']/../../../..//label[text()='No']/..//input")
    WebElement enhancedResidentialCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Off Premises Other Structures Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement offPremisesOtherStructuresExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Off Premises Other Structures Extension')]/../../../..//label[text()='No']/..//input")
    WebElement offPremisesOtherStructuresExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Off Premises Other Structures Extension ')]/../../../../../../../../../../../td[3]//textarea")
    WebElement offPremisesOtherStructuresExtensionNamedStructures;
    @FindBy(xpath = "//div[contains(text(),'Amended Special Limits of Liability')]/../../../..//label[text()='Yes']/..//input")
    WebElement amendedSpecialLimitsOfLiabilityForContentsYes;
    @FindBy(xpath = "//div[contains(text(),'Amended Special Limits of Liability')]/../../../..//label[text()='No']/..//input")
    WebElement amendedSpecialLimitsOfLiabilityForContentsNo;
    @FindBy(xpath = "//div[contains(text(),'Animal Liability Limitation')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> animalLiabilityLimitationYes;
    @FindBy(xpath = "//div[contains(text(),'Animal Liability Limitation')]/../../../..//label[text()='No']/..//input")
    WebElement animalLiabilityLimitationNo;
    @FindBy(xpath = "//div[contains(text(),'Backup of Sewer or Drain Increase')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> backupOfSewerOrDrainIncreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Backup of Sewer or Drain Increase')]/../../../..//label[text()='No']/..//input")
    WebElement backupOfSewerOrDrainIncreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Backup of Sewer or Drain Increase')]/../../../../../../../../../../../td[2]//input")
    WebElement backupOfSewerOrDrainIncreaseLimit;
    @FindBy(xpath = "//div[contains(text(),'Contents Off Premises Loss Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> contentsOffPremisesLossExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Contents Off Premises Loss Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement contentsOffPremisesLossExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Deletion of Ensuing Fungi or Bacteria')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> deletionOfEnsuingFungiOrBacteriaYes;
    @FindBy(xpath = "//div[contains(text(),'Deletion of Ensuing Fungi or Bacteria')]/../../../..//label[text()='No']/..//input")
    WebElement deletionOfEnsuingFungiOrBacteriaNo;
    @FindBy(xpath = "//div[contains(text(),'Fine Art Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> fineArtExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Fine Art Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement fineArtExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Guaranteed Replacement Cost')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> guaranteedReplacementCostYes;
    @FindBy(xpath = "//div[contains(text(),'Guaranteed Replacement Cost')]/../../../..//label[text()='No']/..//input")
    WebElement guaranteedReplacementCostNo;
    @FindBy(xpath = "//div[contains(text(),'Loss Assessment Decrease')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> lossAssessmentDecreaseYes;
    @FindBy(xpath = "//div[contains(text(),'Loss Assessment Decrease')]/../../../..//label[text()='No']/..//input")
    WebElement lossAssessmentDecreaseNo;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> personalInjuryExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement personalInjuryExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Removal of Sub-Limits for Fine Arts and Collectibles')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> removalOfSubLimitsForFineArtsAndCollectiblesYes;
    @FindBy(xpath = "//div[contains(text(),'Removal of Sub-Limits for Fine Arts and Collectibles')]/../../../..//label[text()='No']/..//input")
    WebElement removalOfSubLimitsForFineArtsAndCollectiblesNo;
    @FindBy(xpath = "(//div[contains(text(),'Replacement Cost Coverage With Coinsurance Clause')]/../../../..//label[text()='Yes']/..//input)|(//div[contains(text(),'Replacement Costs Coverage With Coinsurance Clause')]/../../../..//label[text()='Yes']/..//input)")
    List<WebElement> replacementCostCoverageWithCoinsuranceClauseYes;
    @FindBy(xpath = "(//div[contains(text(),'Replacement Cost Coverage With Coinsurance Clause')]/../../../..//label[text()='No']/..//input)|(//div[contains(text(),'Replacement Costs Coverage With Coinsurance Clause')]/../../../..//label[text()='No']/..//input)")
    WebElement replacementCostCoverageWithCoinsuranceClauseNo;
    @FindBy(xpath = "(//div[contains(text(),'Swimming Pool Liability Limitation - Cap $25k')]/../../../..//label[text()='Yes']/..//input)|(//div[contains(text(),'Swimming Pool Liability Limitation - Cap')]/../../../..//label[text()='Yes']/..//input)")
    List<WebElement> swimmingPoolLiabilityLimitationYes;
    @FindBy(xpath = "(//div[contains(text(),'Swimming Pool Liability Limitation - Cap $25k')]/../../../..//label[text()='No']/..//input)|(//div[contains(text(),'Swimming Pool Liability Limitation - Cap')]/../../../..//label[text()='No']/..//input)")
    WebElement swimmingPoolLiabilityLimitationNo;
    @FindBy(xpath = "//div[contains(text(),'Libel Slander Exclusion')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> libelSlanderExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Libel Slander Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement libelSlanderExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Removal of Select Special Limits of Liability')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> removalOfSelectSpecialLimitsOfLiabilityYes;
    @FindBy(xpath = "//div[contains(text(),'Removal of Select Special Limits of Liability')]/../../../..//label[text()='No']/..//input")
    WebElement removalOfSelectSpecialLimitsOfLiabilityNo;
    @FindBy(xpath = "//div[contains(text(),'Roof Exclusion for Hail Damage')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> roofExclusionForHailDamageYes;
    @FindBy(xpath = "//div[contains(text(),'Roof Exclusion for Hail Damage')]/../../../..//label[text()='No']/..//input")
    WebElement roofExclusionForHailDamageNo;
    @FindBy(xpath = "//div[contains(text(),'Exclusion of Cosmetic Damage Due to Hailstorm')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> exclusionOfCosmeticDamageDueToHailstormYes;
    @FindBy(xpath = "//div[contains(text(),'Exclusion of Cosmetic Damage Due to Hailstorm')]/../../../..//label[text()='No']/..//input")
    WebElement exclusionOfCosmeticDamageDueToHailstormNo;
    @FindBy(xpath = "//label[text()='UW Override Exclusion of Cosmetic Damage Due to Hailstorm']/..//input")
    WebElement exclusionOfCosmeticDamageDueToHailstormUWOverride;
    @FindBy(xpath = "//div[contains(text(),'Actual Cash Value for Roof Covering')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> actualCashValueForRoofCoveringYes;
    @FindBy(xpath = "//div[contains(text(),'Actual Cash Value for Roof Covering')]/../../../..//label[text()='No']/..//input")
    WebElement actualCashValueForRoofCoveringNo;
    @FindBy(xpath = "//div[contains(text(),'Replacement Cost Coverage')]/../../../..//input")
    WebElement replacementCostCoverage;
    @FindBy(xpath = "//div[contains(text(),'Property Remediation/Limited Liability Coverage')]/../../../..//label[text()='Yes']/..//input")
    List<WebElement> propertyRemediationLimitedLiabilityCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Property Remediation/Limited Liability Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement propertyRemediationLimitedLiabilityCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Dwelling Replacement Cost Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement dwellingReplacementCostCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Dwelling Replacement Cost Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement dwellingReplacementCostCoverageNo;
    @FindBy(xpath = "//div[text()='Dwelling Replacement Cost Coverage']/../../../../../../../../../../..//label[text()='UW override Dwelling Replacement Cost Coverage']/..//input")
    WebElement uwOverrideDwellingReplacementCostCoverage;
    @FindBy(xpath = "//div[contains(text(),'Elimination of Waiver of Deductible')]/../../../..//label[text()='Yes']/..//input")
    WebElement eliminationOfWaiverOfDeductibleYes;
    @FindBy(xpath = "//div[contains(text(),'Elimination of Waiver of Deductible')]/../../../..//label[text()='Yes']/..//input")
    WebElement eliminationOfWaiverOfDeductibleNo;
    @FindBy(xpath = "//div[text()='Elimination of Waiver of Deductible']/../../../../../../../../../../..//label[text()='UW Override Elimination of Waiver of Deductible']/..//input")
    WebElement uwOverrideEliminationOfWaiverOfDeductible;
    @FindBy(xpath = "//div[contains(text(),'Loss of Use - Fair Rental Value')]/../../../..//label[text()='Yes']/..//input")
    WebElement lossOfUseFairRentalValueYes;
    @FindBy(xpath = "//div[contains(text(),'Loss of Use - Fair Rental Value')]/../../../..//label[text()='No']/..//input")
    WebElement lossOfUseFairRentalValueNo;
    @FindBy(xpath = "//div[text()='Loss of Use - Fair Rental Value']/../../../../../../../../../../..//label[text()='UW Override Loss of Use - Fair Rental Value']/..//input")
    WebElement uwOverrideLossOfUseFairRentalValue;
    @FindBy(xpath = "//div[contains(text(),'Premises Liability Limitation')]/../../../..//label[text()='Yes']/..//input")
    WebElement premisesLiabilityLimitationYes;
    @FindBy(xpath = "//div[contains(text(),'Premises Liability Limitation')]/../../../..//label[text()='No']/..//input")
    WebElement premisesLiabilityLimitationNo;
    @FindBy(xpath = "//div[text()='Premises Liability Limitation']/../../../../../../../../../../..//label[text()='UW override Premises Liability Limitation']/..//input")
    WebElement uwOverridePremisesLiabilityLimitation;
    @FindBy(xpath = "//div[contains(text(),'Tenant Animal Liability Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement tenantAnimalLiabilityYes;
    @FindBy(xpath = "//div[contains(text(),'Tenant Animal Liability Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement tenantAnimalLiabilityNo;
    @FindBy(xpath = "//div[text()='Tenant Animal Liability Exclusion']/../../../../../../../../../../..//label[text()='UW override Tenant Animal Liability Exclusion']/..//input")
    WebElement uwOverrideTenantAnimalLiability;
    @FindBy(xpath = "//div[contains(text(),'Roof Reconstruction Cost Schedule')]/../../../..//label[text()='Yes']/..//input")
    WebElement roofReconstructionCostsScheduleYes;
    @FindBy(xpath = "//div[contains(text(),'Roof Reconstruction Cost Schedule')]/../../../..//label[text()='Yes']/..//input")
    WebElement roofReconstructionCostsScheduleNo;
    @FindBy(xpath = "//div[text()='Roof Reconstruction Cost Schedule']/../../../../../../../../../../..//label[text()='UW Override Roof Reconstruction Cost Schedule']/..//input")
    WebElement uwOverrideRoofReconstructionCostSchedule;
    @FindBy(xpath = "//div[contains(text(),'Roof Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement roofExclusionUwYes;
    @FindBy(xpath = "//div[contains(text(),'Roof Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement roofExclusionUwNo;
    @FindBy(xpath = "//div[text()='Roof Exclusion']/../../../../../../../../../../..//label[text()='UW Override Roof Exclusion']/..//input")
    WebElement uwOverrideRoofExclusion;
    @FindBy(xpath = "//div[contains(text(),'Special Water Damage Deductible')]/../../../..//label[text()='Yes']/..//input")
    WebElement specialWaterDamageDeductibleUwYes;
    @FindBy(xpath = "//div[contains(text(),'Water Damage Deductible')]/../../../..//label[text()='Yes']/..//input")
    WebElement waterDamageDeductibleUwYes;
    @FindBy(xpath = "//div[text()='Special Water Damage Deductible']/../../../../../../../../../../..//label[text()='UW Override Special Water Damage Deductible']/..//input")
    WebElement uwOverrideSpecialWaterDamageDeductible;
    @FindBy(xpath = "//label[text()='UW Override Special Water Damage Deductible']/../span/input")
    WebElement uwOverrideWaterDamageDeductible;
    @FindBy(xpath = "//div[text()='Special Water Damage Deductible']/../../../../../../../../../../..//div[text()='Coverage Type']/../../../..//input")
    WebElement specialWaterDamageDeductibleCoverageType;
    @FindBy(xpath = "//div[text()='Special Water Damage Deductible']/../../../../../../../../../../../..//div[text()='Deductible']/../../../..//input")
    WebElement specialWaterDamageDeductibleDeductible;
    @FindBy(xpath = "//div[text()='Water Damage Deductible']/../../../../../../../../../../../..//div[text()='Deductible']/../../../..//input")
    WebElement waterDamageDeductibleDeductible;
    @FindBy(xpath = "//div[contains(text(),'Amended Settlement Basis')]/../../../..//label[text()='Yes']/..//input")
    WebElement amendedSettlementBasisYes;
    @FindBy(xpath = "//div[contains(text(),'Amended Settlement Basis')]/../../../..//label[text()='No']/..//input")
    WebElement amendedSettlementBasisNo;
    @FindBy(xpath = "//label[contains(text(),'Override of Elimination of Waiver of Deductible')]/..//input")
    WebElement managerOverrideOfEliminationWaiverDeductible;
    @FindBy(xpath = "//label[contains(text(),'UW override Amended Special Limits of Liability for Contents')]/..//input")
    WebElement managerOverrideAmendedSpecialLimitsOfLiabilityForContent;
    @FindBy(xpath = "//label[contains(text(),'Override of Cosmetic Marring Exclusion')]/..//input")
    WebElement overrideCosmeticMarringExclusion;
    @FindBy(xpath = "//div[contains(text(),'Law and Ordinance Increase or Rejection')]/../../../..//label[text()='No']/..//input")
    WebElement lawAndOrdinanceIncreaseOrRejectionNo;
    @FindBy(xpath = "//div[contains(text(),'Law and Ordinance Increase or Rejection')]/../../../..//label[text()='Yes']/..//input")
    WebElement lawAndOrdinanceIncreaseOrRejectionYes;
    @FindBy(xpath = "//div[contains(text(),'Law and Ordinance Increase or Rejection')]/following::input[@type='text'][1]")
    WebElement lawAndOrdinanceIncreaseOrRejectionOption;
    @FindBy(xpath = "//div[contains(text(),'Fungi Liability Extension')]/../../../..//label[text()='No']/..//input")
    WebElement fungiLiabilityExtensionNo;
    @FindBy(xpath = "//div[contains(text(),'Fungi Liability Extension')]/../../../..//label[text()='Yes']/..//input")
    WebElement fungiLiabilityExtensionYes;
    @FindBy(xpath = "//div[contains(text(),'Flood Extension (DIC)')]/../../../..//label[text()='Yes']/..//input")
    WebElement floodExtensionDICYes;
    @FindBy(xpath = "//div[contains(text(),'Flood Extension (DIC)')]/../../../..//label[text()='No']/..//input")
    WebElement floodExtensionDICNo;
    @FindBy(xpath = "//div[contains(text(),'Roof Covering Full Reconstruction Cost')]/../../../..//label[text()='Yes']/..//input")
    WebElement roofCoveringFullReconstructionCostYes;
    @FindBy(xpath = "//div[contains(text(),'Roof Covering Full Reconstruction Cost')]/../../../..//label[text()='No']/..//input")
    WebElement roofCoveringFullReconstructionCostNo;
    @FindBy(xpath = "//div[text()='Cosmetic Marring Exclusion for Metal Roofs']/../../../..//label[text()='Yes']/..//input")
    WebElement cosmeticMarringExclusionForMetalRoofsYes;
    @FindBy(xpath = "//div[text()='Cosmetic Marring Exclusion for Metal Roofs']/../../../..//label[text()='No']/..//input")
    WebElement cosmeticMarringExclusionForMetalRoofsNo;
    @FindBy(xpath = "//div[text()='Cosmetic Marring Exclusion for Named Structure']/../../../..//label[text()='Yes']/..//input")
    WebElement cosmeticMarringExclusionForNamedStructureYes;
    @FindBy(xpath = "//div[text()='Cosmetic Marring Exclusion for Named Structure']/../../../..//label[text()='No']/..//input")
    WebElement cosmeticMarringExclusionForNamedStructureNo;
    @FindBy(xpath = "//div[text()='Named Structures Exclusion']/../../../../../../../../../../..//textarea")
    WebElement namedStructuresExclusionInput;
    @FindBy(xpath = "//div[text()='Cosmetic Marring Exclusion for Named Structure']/../../../../../../../../../../..//textarea")
    WebElement cosmeticMarringExclusionForNamedStructureInput;
    @FindBy(xpath = "//div[contains(text(),'Extended Replacement Cost Coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement extendedReplacementCostCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'Extended Replacement Cost Coverage')]/../../../..//label[text()='No']/..//input")
    WebElement extendedReplacementCostCoverageNo;
    @FindBy(xpath = "//div[contains(text(),'Dwelling Replacement Cost Coverage')]/../../../..//input")
    WebElement dwellingReplacementCostCoverageInput;
    @FindBy(xpath = "//div[contains(text(),'Removal of 20% of Requirement For Other Structures')]/../../../..//label[text()='Yes']/..//input")
    WebElement removalOf20PercentReqForOtherStrYes;
    @FindBy(xpath = "//div[contains(text(),'Removal of 20% of Requirement For Other Structures')]/../../../..//label[text()='No']/..//input")
    WebElement removalOf20PercentReqForOtherStrNo;
    @FindBy(xpath = "//div[contains(text(),'Amendment to Special Limits for Contents')]/../../../..//label[text()='Yes']/..//input")
    WebElement amendmentToSpecialLimitsForContentsYes;
    @FindBy(xpath = "//div[contains(text(),'Amendment to Special Limits for Contents')]/../../../..//label[text()='No']/..//input")
    WebElement amendmentToSpecialLimitsForContentsNo;
    @FindBy(xpath = "//div[text()='Exclusion for Back Up of Sewers and Drains']/../../../..//label[text()='Yes']/..//input")
    WebElement exclusionForBackUpOfSewersAndDrainsYes;
    @FindBy(xpath = "//div[text()='Exclusion for Back Up of Sewers and Drains']/../../../..//label[text()='Yes']/..//input")
    WebElement exclusionForBackUpOfSewersAndDrainsNo;
    @FindBy(xpath = "//div[text()='Sub-limit for Back Up of Sewers and Drains']/../../../..//label[text()='Yes']/..//input")
    WebElement sublimitForBackUpOfSewersAndDrainsYes;
    @FindBy(xpath = "//div[text()='Sub-limit for Back Up of Sewers and Drains']/../../../..//label[text()='Yes']/..//input")
    WebElement sublimitForBackUpOfSewersAndDrainsNo;
    @FindBy(xpath = "//div[text()='Sub-limit for Back Up of Sewers and Drains']/following::input[@type='text'][1]")
    WebElement sublimitForBackUpOfSewersAndDrainsInput;
    @FindBy(xpath = "//div[text()='canine information']/../../../../../../div[2]//span[text()='add']")
    WebElement caninePetAdd;
    @FindBy(xpath = "//span[text()='Pet name']/../../../../../../../../..//tr/td[1]/div")
    List<WebElement> caninePetName;
    @FindBy(xpath = "//span[text()='Breed']/../../../../../../../../..//tr/td[2]/div")
    List<WebElement> canineBreed;
    @FindBy(xpath = "//span[text()='Description']/../../../../../../../../..//tr/td[3]/div")
    List<WebElement> canineDescription;
    @FindBy(xpath = "//div[text()='Canine Liability Exclusion']/../../../..//label[text()='Yes']/..//input")
    WebElement canineLiabilityExclusionYes;
    @FindBy(xpath = "//div[text()='Canine Liability Exclusion']/../../../..//label[text()='No']/..//input")
    WebElement canineLiabilityExclusionNo;

    public void fillOptionalCoveragesExclusionsHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverages/exclusions (underwriters only)", data.get("State"));
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "AZ":
                    case "CT":
                    case "LA":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "MD": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                    }
                    break;
                    case "AL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "MS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection"));
                        if (isElementDisplayed(fungiLiabilityExtensionYes))
                            setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "ID": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "IN": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "IA":
                    case "KS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                    }
                    break;
                    case "MI":
                    case "NM":
                    case "OH":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "MN":
                    case "MT": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "CO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "KY":
                    case "NE":
                    case "OK": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "MO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "DE": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "NJ": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                    }
                    break;
                    case "NY": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "ND": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                    }
                    break;
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                    }
                    break;
                    case "TN": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "HI": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains"));
                        setNamedOtherStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "NJ":
                    case "MD":
                    case "DC":
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
//                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "MD":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "NJ":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SC":
                    case "SD":
                    case "WA":
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis"));
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT":
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension"));
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC"));
                        setCanineLiabilityExclusion(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures"));
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains"));
                    }
                    break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalCoveragesExclusionsHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverages/exclusions (underwriters only)", data.get("State_END"));
        switch (data.get("Residence_Type_END")) {
            case "Homeowner": {
                switch (data.get("State_END")) {
                    case "AK":
                    case "AZ":
                    case "CT":
                    case "LA":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "MD": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                    }
                    break;
                    case "AL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_END"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "MS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_END"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "ID": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "IN": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "IA":
                    case "KS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                    }
                    break;
                    case "MI":
                    case "NM":
                    case "OH":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "MN":
                    case "MT": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "CO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "KY":
                    case "NE":
                    case "OK": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "MO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "DE": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "NJ": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                    }
                    break;
                    case "NY": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "ND": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                    }
                    break;
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                    }
                    break;
                    case "TN": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_END"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "HI": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_END"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_END"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_END"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_END"));
                        setNamedOtherStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_END")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "NJ":
                    case "MD":
                    case "DC":
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_END"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_END"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_END"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_END"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_END")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "MD":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "NJ":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SC":
                    case "SD":
                    case "WA":
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_END"));
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT":
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_END"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_END"));
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_END"));
                        setCanineLiabilityExclusion_END(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_END"));
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_END"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_END"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_END"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_END"));
                    }
                    break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalCoveragesExclusionsHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverages/exclusions (underwriters only)", data.get("State_OOS_END"));
        switch (data.get("Residence_Type_OOS_END")) {
            case "Homeowner": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "AZ":
                    case "CT":
                    case "LA":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "MD": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                    }
                    break;
                    case "AL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_OOS_END"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "MS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_OOS_END"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "ID": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "IN": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "IA":
                    case "KS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_OOS_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                    }
                    break;
                    case "MI":
                    case "NM":
                    case "OH":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "MN":
                    case "MT": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_OOS_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "CO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_OOS_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "KY":
                    case "NE":
                    case "OK": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_OOS_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_OOS_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "MO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_OOS_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_OOS_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "DE": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "NJ": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                    }
                    break;
                    case "NY": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "ND": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                    }
                    break;
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                    }
                    break;
                    case "TN": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_OOS_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_OOS_END"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_OOS_END"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "HI": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_OOS_END"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_OOS_END"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_OOS_END"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_OOS_END"));
                        setNamedOtherStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "NJ":
                    case "MD":
                    case "DC":
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_OOS_END"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_OOS_END"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_OOS_END"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_OOS_END"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "MD":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "NJ":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SC":
                    case "SD":
                    case "WA":
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_OOS_END"));
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT":
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_OOS_END"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_OOS_END"));
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_OOS_END"));
                        setCanineLiabilityExclusion_OOS_END(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_OOS_END"));
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_OOS_END"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_OOS_END"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_OOS_END"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_OOS_END"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_OOS_END"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_OOS_END"));
                    }
                    break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalCoveragesExclusionsHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverages/exclusions (underwriters only)", data.get("State_RNW"));
        switch (data.get("Residence_Type_RNW")) {
            case "Homeowner": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "AZ":
                    case "CT":
                    case "LA":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "MD": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                    }
                    break;
                    case "AL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_RNW"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "AR":
                    case "IL":
                    case "MS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_RNW"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "ID": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "IN": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "IA":
                    case "KS": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCosmeticMarringExclusionHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_RNW"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                    }
                    break;
                    case "MI":
                    case "NM":
                    case "OH":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "MN":
                    case "MT": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_RNW"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "CO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_RNW"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "KY":
                    case "NE":
                    case "OK": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_RNW"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_RNW"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "MO": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setRoofCoveringFullReconstructionCost(data.get("Optional_Coverages_RoofCovering_Full_Reconstruction_Cost_RNW"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_RNW"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "DE": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "NJ": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                    }
                    break;
                    case "NY": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "ND": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                    }
                    break;
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                    }
                    break;
                    case "TN": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_RNW"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCosmeticMarringExclusionForMetalRoofsHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Metal_Roofs_RNW"));
                        setCosmeticMarringExclusionForNamedStructureHO(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_Named_Structure_RNW"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setNamedStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "HI": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_RNW"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_RNW"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_RNW"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_RNW"));
                        setNamedOtherStructuresExclusionHO(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SD":
                    case "WA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "NJ":
                    case "MD":
                    case "DC":
                    case "SC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_RNW"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_RNW"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_RNW"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_RNW"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "AZ":
                    case "AR":
                    case "CO":
                    case "CT":
                    case "IL":
                    case "IA":
                    case "KS":
                    case "LA":
                    case "MD":
                    case "KY":
                    case "MS":
                    case "NE":
                    case "NV":
                    case "NJ":
                    case "ND":
                    case "OK":
                    case "PA":
                    case "RI":
                    case "SC":
                    case "SD":
                    case "WA":
                    case "DC": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                    }
                    break;
                    case "AL":
                    case "GA": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setAmendedSettlementBasis(data.get("Optional_Coverages_Amended_Settlement_Basis_RNW"));
                    }
                    break;
                    case "CA":
                    case "ME":
                    case "NH":
                    case "NY":
                    case "TN":
                    case "VT":
                    case "MA": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                    }
                    break;
                    case "DE":
                    case "WV": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                    }
                    break;
                    case "FL": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setLawAndOrdinanceIncreaseOrRejection(data.get("Optional_Coverages_LawAndOrdinance_Increase_Rejection_RNW"));
                        setFungiLiabilityExtensions(data.get("Optional_Coverages_Fungi_Liability_Extension_RNW"));
                    }
                    break;
                    case "ID":
                    case "IN":
                    case "MI":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "NM":
                    case "OH":
                    case "OR":
                    case "UT":
                    case "WI":
                    case "WY": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setFloodExtensionDIC(data.get("Optional_Coverages_Flood_Extension_DIC_RNW"));
                        setCanineLiabilityExclusion_RNW(data);
                    }
                    break;
                    case "TX": {
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setRemovalOf20PercentRequirementForOtherStructures(data.get("Optional_Coverages_20Percent_Requirement_Removal_For_Other_Structures_RNW"));
                    }
                    break;
                    case "VA": {
                        setDwellingReplacementCostCoverageHO(data.get("Optional_Coverages_Dwelling_Replacement_Cost_COV_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                    }
                    break;
                    case "HI": {
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                        setFineArtExclusion(data.get("Optional_Coverages_Fine_Art_Exclusion_RNW"));
                        setPremisesLiabilityLimitationHO(data.get("Optional_Coverages_Premises_Liability_Limitation_RNW"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                        setEliminationOfWaiverOfDeductibleHO(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
                        setAmendmentToSpecialLimitsForContents(data.get("Optional_Coverages_Amendment_To_Special_Limits_Contents_RNW"));
                        setExclusionForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_RNW"));
                        setSublimitForBackUpOfSewersAndDrains(data.get("Optional_Coverages_Sublimit_BackUp_Sewers_And_Drains_RNW"), data.get("Optional_Coverages_Exclusion_BackUp_Sewers_And_Drains_RNW"));
                    }
                    break;
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalCoveragesExclusionsHO(Map<String, String> data, int i) throws Throwable {
        switch (data.get("State")) {
            //TODO HO
        }
    }

    public void fillOptionalCoveragesExclusions(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverages/exclusions");
        setLibelSlander(data.get("Libel_Slander_Exclusion"));
        setPoliticalActivity(data.get("Political_Activity_Exclusion"));
        setPremisesLiability(data.get("Premises_Liability_Limitation"));
        setHigherUnderlyingLimit(data);
    }

    public void fillOptionalCoveragesExclusions_END(Map<String, String> data) throws Throwable {
        setLibelSlander(data.get("Libel_Slander_Exclusion_END"));
        setPoliticalActivity(data.get("Political_Activity_Exclusion_END"));
        setPremisesLiability(data.get("Premises_Liability_Limitation_END"));
        setHigherUnderlyingLimit_END(data);
    }

    public void fillOptionalCoveragesExclusions_OOS_END(Map<String, String> data) throws Throwable {
        setLibelSlander(data.get("Libel_Slander_Exclusion_OOS_END"));
        setPoliticalActivity(data.get("Political_Activity_Exclusion_OOS_END"));
        setPremisesLiability(data.get("Premises_Liability_Limitation_OOS_END"));
        setHigherUnderlyingLimit_OOS_END(data);
    }

    public void fillOptionalCoveragesExclusions_RNW(Map<String, String> data) throws Throwable {
        setLibelSlander(data.get("Libel_Slander_Exclusion_RNW"));
        setPoliticalActivity(data.get("Political_Activity_Exclusion_RNW"));
        setPremisesLiability(data.get("Premises_Liability_Limitation_RNW"));
        setHigherUnderlyingLimit_RNW(data);
    }

    public void fillOptionalCoveragesExclusionDetailsPW(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverage/exclusions");
    }

    public void fillOptionalCoveragesExclusionsDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverages/exclusions");
        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
        setBroadenedLiabilityCoverage(data.get("Optional_Coverages_Exclusions_Broadened_Liability_Coverage"));
        setBroadenedLiabilityCoverageLibelSlanderExcluded(data.get("Optional_Coverages_Exclusions_Broadened_Liability_Coverage_Libel_Slander_Excluded"));
        setBroadenedLossOfUseCoverage(data.get("Optional_Coverages_Exclusions_Broadened_Loss_Of_Use_Coverage"));
        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
        setCosmeticMarringExclusion(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring"));
        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_And_Finish_Systems_Exclusion"));
        setEnhancedResidentialCoverage(data.get("Optional_Coverages_Exclusions_Enhanced_Residential_Coverage"));
        //setMinimumEarnedPremium(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_UW_Override"));
        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded"));
        setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension"));
        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
        setTenantAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion"), data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_UW_Override"));
        setSpecialWaterDamageDeductible(data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible"), data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_Deductible"), data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_UW_Override"));
        setRoofReconstructionCostSchedule(data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule"), data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule_UW_Override"));
        setRoofExclusion(data.get("Optional_Coverages_Exclusions_Roof_Exclusion"), data.get("Optional_Coverages_Exclusions_Roof_Exclusion_UW_Override"));
        saveChanges();
    }

    public void fillOptionalCoveragesExclusionsDetailsCC_END(Map<String, String> data) throws Throwable {
        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
        setBroadenedLiabilityCoverage(data.get("Optional_Coverages_Exclusions_Broadened_Liability_Coverage_END"));
        setBroadenedLiabilityCoverageLibelSlanderExcluded(data.get("Optional_Coverages_Exclusions_Broadened_Liability_Coverage_Libel_Slander_Excluded_END"));
        setBroadenedLossOfUseCoverage(data.get("Optional_Coverages_Exclusions_Broadened_Loss_Of_Use_Coverage_END"));
        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
        setCosmeticMarringExclusion(data.get("Optional_Coverages_Exclusions_Cosmetic_Marring_END"));
        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_And_Finish_Systems_Exclusion_END"));
        setEnhancedResidentialCoverage(data.get("Optional_Coverages_Exclusions_Enhanced_Residential_Coverage_END"));
        setMinimumEarnedPremium(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_UW_Override_END"));
        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Named_Structures_to_Be_Excluded_END"));
        setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_END"));
        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
        setTenantAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_UW_Override_END"));
        setSpecialWaterDamageDeductible(data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_END"), data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_Deductible_END"), data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_UW_Override_END"));
        setRoofReconstructionCostSchedule(data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule_END"), data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule_UW_Override_END"));
        setRoofExclusion(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Roof_Exclusion_UW_Override_END"));
        saveChanges();
    }

    public void fillOptionalCoveragesExclusionsBlockHS(Map<String, String> data) throws Throwable {
        pause(3000);
        verifyBlockExists("optional coverages/exclusions");
        switch (data.get("Risk_Addresses_Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "LA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "GA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "CO": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "AZ": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "NY": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost"));
                        setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "TX": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setExclusionOfCosmeticDamageDueToHailstormUWOverride(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_UW_Override"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "NJ": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setGuaranteedReplacementCost(data.get("Optional_Coverages_Exclusions_Guaranteed_Replacement_Cost"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "FL": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "NC": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        // setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "SC": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "MA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setPropertyRemediationLimitedLiabilityCoverage(data.get("Optional_Coverages_Property_Remediation_Limited_Liability_Coverage"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "WY": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        //setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "MT": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "HI": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "UT": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setDwellingReplacementCostCoverage(data);
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleHS_RI(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "LA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "GA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "CO": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "AZ": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "NY": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setExclusionContentsExtendedReplacementCost("Optional_Coverages_Exclusions_Contents_Extended_Replacement_Cost");
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "TX": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setExclusionOfCosmeticDamageDueToHailstormUWOverride(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_UW_Override"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "NJ": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "FL": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "NC": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "SC": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setExclusionContentsExtendedReplacementCost("Optional_Coverages_Exclusions_Contents_Extended_Replacement_Cost");
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "MA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setExclusionContentsExtendedReplacementCost("Optional_Coverages_Exclusions_Contents_Extended_Replacement_Cost");
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "WY": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setExclusionContentsExtendedReplacementCost(data.get("Optional_Coverages_Exclusions_Contents_Extended_Replacement_Cost"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "MT": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "HI": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "UT": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm"));
                        setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage"));
                        setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents"));
                        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
                        setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation"));
                        setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit"));
                        setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion"));
                        setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion"));
                        setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria"));
                        setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion"));
                        setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion"));
                        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
                        setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease"));
                        setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded"));
                        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
                        setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion"));
                        setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap"));
                        setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability"));
                        setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit"));
                        setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                        setEliminationOfWaiverOfDeductible(data);
                        setLossOfUseFairRentalValue(data);
                        setPremisesLiabilityLimitation(data);
                        setTenantAnimalLiabilityExclusion(data);
                        setRoofReconstructionCostScheduleUW(data);
                        setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible"));
                        setRoofExclusionUW(data);
                        saveChanges();
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillOptionalCoveragesExclusionsBlockHS_END(Map<String, String> data) throws Throwable {
        pause(3000);
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
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_TypeHS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost_END"));
                                setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Exclusions_Guaranteed_Replacement_Cost_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                // setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setPropertyRemediationLimitedLiabilityCoverage(data.get("Optional_Coverages_Property_Remediation_Limited_Liability_Coverage_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                                //setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Claus_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_END(data);
                                setLossOfUseFairRentalValueHS_END(data);
                                setPremisesLiabilityLimitationHS_END(data);
                                setTenantAnimalLiabilityExclusionHS_END(data);
                                setRoofReconstructionCostScheduleUWHS_END(data);
                                setSpecialWaterDamageDeductibleHS_RI_END(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "LA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Exclusions_Guaranteed_Replacement_Cost_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setExclusionContentsExtendedReplacementCost(data.get("Optional_Coverages_Exclusions_Contents_Extended_Replacement_Cost_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "MT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_END"));
                                setEliminationOfWaiverOfDeductible(data);
                                setLossOfUseFairRentalValue(data);
                                setPremisesLiabilityLimitation(data);
                                setTenantAnimalLiabilityExclusion(data);
                                setRoofReconstructionCostScheduleUW(data);
                                setSpecialWaterDamageDeductibleHS_RI_END(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_END"));
                                setRoofExclusionUW(data);
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

    public void fillOptionalCoveragesExclusionsBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        pause(3000);
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
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_TypeHS_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost_OOS_END"));
                                setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Exclusions_Guaranteed_Replacement_Cost_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                // setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setPropertyRemediationLimitedLiabilityCoverage(data.get("Optional_Coverages_Property_Remediation_Limited_Liability_Coverage_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                //setDwellingReplacementCostCoverageHS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Claus_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "LA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_TypeHS_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setPropertyRemediationLimitedLiabilityCoverage(data.get("Optional_Coverages_Property_Remediation_Limited_Liability_Coverage_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setExclusionContentsExtendedReplacementCost(data.get("Optional_Coverages_Exclusions_Contents_Extended_Replacement_Cost_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_OOS_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_OOS_END"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_OOS_END"));
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_OOS_END"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_OOS_END"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_OOS_END"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_OOS_END"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_OOS_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_OOS_END"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_OOS_END"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_OOS_END"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_OOS_END"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_OOS_END"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_OOS_END"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_OOS_END"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_OOS_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_OOS_END"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_OOS_END"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_OOS_END"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_OOS_END"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_OOS_END"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_OOS_END"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_OOS_END"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_OOS_END"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_END"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_OOS_END"));
                                setDwellingReplacementCostCoverageHS_OOS_END(data);
                                setEliminationOfWaiverOfDeductibleHS_OOS_END(data);
                                setLossOfUseFairRentalValueHS_OOS_END(data);
                                setPremisesLiabilityLimitationHS_OOS_END(data);
                                setTenantAnimalLiabilityExclusionHS_OOS_END(data);
                                setRoofReconstructionCostScheduleUWHS_OOS_END(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_OOS_END"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_OOS_END"));
                                setRoofExclusionUWHS_OOS_END(data);
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

    public void fillOptionalCoveragesExclusionsBlockHS_RNW(Map<String, String> data) throws Throwable {
        pause(3000);
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
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusionv_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_TypeHS_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost_RNW"));
                                setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Exclusions_Guaranteed_Replacement_Cost_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                // setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setPropertyRemediationLimitedLiabilityCoverage(data.get("Optional_Coverages_Property_Remediation_Limited_Liability_Coverage_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setGuaranteedReplacementCost(data.get("Optional_Coverages_Guaranteed_Replacement_Cost_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setReplacementCostCoverage(data.get("Optional_Coverages_Replacement_Cost_Coverage_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                //setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Claus_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_ERNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setScreenEnclosureExclusion(data.get("Optional_Coverages_Exclusions_Screen_Enclosure_Exclusion_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setDwellingReplacementCostCoverageHS_RNW(data);
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleHS_RI_RNW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "LA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusionv_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_TypeHS_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setRemovalOfSubLimitsForFineArtsAndCollectibles(data.get("Optional_Coverages_Exclusions_Removal_Of_Sub_Limits_For_Fine_Arts_And_Collectibles_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setReplacementCostCoverageWithCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Replacement_Cost_Coverage_With_Coinsurance_Clause_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_END"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setPropertyRemediationLimitedLiabilityCoverage(data.get("Optional_Coverages_Property_Remediation_Limited_Liability_Coverage_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_END"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setOffPremisesOtherStructuresExtension(data.get("Optional_Coverages_Exclusions_Off_Premises_Other_Structures_Extension_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setExclusionContentsExtendedReplacementCost(data.get("Optional_Coverages_Exclusions_Contents_Extended_Replacement_Cost_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_ERNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setPrimaryFloodDecPageReceived(data.get("Optional_Coverages_Primary_Flood_Dec_Page_Received_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleUW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setAmendedSpecialLimitsOfLiabilityForContents(data.get("Optional_Coverages_Exclusions_Amended_Special_Limits_Of_Liability_For_Contents_RNW"));
                                setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion_RNW"));
                                setAnimalLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Animal_Liability_Limitation_RNW"));
                                setBackupOfSewerOrDrainIncrease(data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_RNW"), data.get("Optional_Coverages_Exclusions_Backup_Of_Sewer_Or_Drain_Increase_Limit_RNW"));
                                setBusinessExclusionData(data.get("Optional_Coverages_Exclusions_Business_Exclusion_RNW"));
                                setContentsOffPremisesLossExclusion(data.get("Optional_Coverages_Exclusions_Contents_Off_Premises_Loss_Exclusion_RNW"));
                                setDeletionOfEnsuingFungiOrBacteria(data.get("Optional_Coverages_Exclusions_Deletion_Of_Ensuing_Fungi_Or_Bacteria_RNW"));
                                setExteriorInsulationAndFinishSystemsExclusion(data.get("Optional_Coverages_Exclusions_Exterior_Insulation_and_Finish_Systems_(EIFS)_Exclusion_RNW"));
                                setFineArtExclusion(data.get("Optional_Coverages_Exclusions_Fine_Art_Exclusion_RNW"));
                                setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion_RNW"));
                                setLossAssessmentDecrease(data.get("Optional_Coverages_Exclusions_Loss_Assessment_Decrease_RNW"));
                                setNamedStructuresExclusion(data.get("Optional_Coverages_Exclusions_Named_Structures_Exclusion_RNW"), data.get("Optional_Coverages_Exclusions_Name_Structures_To_Be_Excluded_RNW"));
                                setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion_RNW"));
                                setSwimmingPoolLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Exclusion_RNW"));
                                setSwimmingPoolLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Swimming_Pool_Liability_Limitation_Cap_RNW"));
                                setRoofExclusionForHailDamage(data.get("Optional_Coverages_Exclusions_Roof_Exclusion_For_Hail_Damage_RNW"));
                                setActualCashValueForRoofCovering(data.get("Optional_Coverages_Exclusions_Actual_Cash_Value_For_Roof_Covering_RNW"));
                                setRemovalOfSelectSpecialLimitsOfLiability(data.get("Optional_Coverages_Exclusions_Removal_Of_Select_Special_Limits_Of_Liability_RNW"));
                                setExclusionOfCosmeticDamageDueToHailstorm(data.get("Optional_Coverages_Exclusions_Exclusion_Of_Cosmetic_Damage_Due_To_Hailstorm_RNW"));
                                setMinimumEarnedPremiumUWOverride(data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_RNW"), data.get("Optional_Coverages_Exclusions_Minimum_Earned_Premium_Limit_RNW"));
                                setEliminationOfWaiverOfDeductibleHS_RNW(data);
                                setLossOfUseFairRentalValueHS_RNW(data);
                                setPremisesLiabilityLimitationHS_RNW(data);
                                setTenantAnimalLiabilityExclusionHS_RNW(data);
                                setRoofReconstructionCostScheduleUWHS_RNW(data);
                                setSpecialWaterDamageDeductibleHS_RI_RNW(data, data.get("Optional_Coverages_Special_Water_Damage_Deductible_Coverage_Type_RNW"), data.get("Optional_Coverages_Special_Water_Damage_Deductible_Deductible_RNW"));
                                setRoofExclusionUWHS_RNW(data);
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

    public void setSpecialWaterDamageDeductibleUW(Map<String, String> data, String coverage, String deductible) throws Throwable {
        if (hasValue(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible")) && data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible").equalsIgnoreCase("Yes")) {
            checkUwOverrideSpecialWaterDamageDeductible(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible"));
            pause(2000);
            choose(specialWaterDamageDeductibleUwYes, specialWaterDamageDeductibleNo, data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible"), "Special Water Damage Deductible");
            if (isVisibleOnly(By.xpath("//div[text()='Special Water Damage Deductible']/../../../../../../../../../../..//div[text()='Coverage Type']/../../../..//input"))) {
                typeTextEnter(specialWaterDamageDeductibleCoverageType, coverage, "Special Water Damage Deductible Coverage Type");
                typeTextEnter(specialWaterDamageDeductibleDeductible, deductible, "Special Water Damage Deductible Deductible");
                saveChanges();
            }

        } else if (hasValue(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_END")) && data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_END").equalsIgnoreCase("Yes")) {
            checkUwOverrideSpecialWaterDamageDeductible(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_END"));
            pause(2000);
            choose(specialWaterDamageDeductibleUwYes, specialWaterDamageDeductibleNo, data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_END"), "Special Water Damage Deductible");
            typeTextEnter(specialWaterDamageDeductibleCoverageType, coverage, "Special Water Damage Deductible Coverage Type");
            typeTextEnter(specialWaterDamageDeductibleDeductible, deductible, "Special Water Damage Deductible Deductible");
            saveChanges();
        }
    }

    public void setSpecialWaterDamageDeductibleHS_RI(Map<String, String> data, String coverage, String deductible) throws Throwable {
        if (!specialWaterDamageDeductibleUwYes.isDisplayed()) {
            if (hasValue(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible")) && data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible").equalsIgnoreCase("Yes")) {
                checkUwOverrideSpecialWaterDamageDeductibleHS_RI_CT(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible"));
                pause(2000);
                choose(waterDamageDeductibleUwYes, waterDamageDeductibleNo, data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible"), "Water Damage Deductible");
                typeTextEnter(waterDamageDeductibleDeductible, deductible, "Water Damage Deductible Deductible");
                saveChanges();
            } else {
                setSpecialWaterDamageDeductibleUW(data, coverage, deductible);
            }
        }
    }

    public void setSpecialWaterDamageDeductibleHS_RI_END(Map<String, String> data, String coverage, String deductible) throws Throwable {
        if (!specialWaterDamageDeductibleUwYes.isDisplayed()) {
            if (hasValue(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_END")) && data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_END").equalsIgnoreCase("Yes")) {
                checkUwOverrideSpecialWaterDamageDeductibleHS_RI_CT(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_END"));
                pause(2000);
                choose(waterDamageDeductibleUwYes, waterDamageDeductibleNo, data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_END"), "Special Water Damage Deductible");
                typeTextEnter(waterDamageDeductibleDeductible, deductible, "Special Water Damage Deductible Deductible");
                saveChanges();
            } else {
                setSpecialWaterDamageDeductibleUW(data, coverage, deductible);
            }
        }
    }

    public void setSpecialWaterDamageDeductibleHS_RI_OOS_END(Map<String, String> data, String coverage, String deductible) throws Throwable {
        if (!specialWaterDamageDeductibleUwYes.isDisplayed()) {
            if (hasValue(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_OOS_END")) && data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_OOS_END").equalsIgnoreCase("Yes")) {
                checkUwOverrideSpecialWaterDamageDeductibleHS_RI_CT(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_OOS_END"));
                pause(2000);
                choose(waterDamageDeductibleUwYes, waterDamageDeductibleNo, data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_OOS_END"), "Special Water Damage Deductible");
                typeTextEnter(waterDamageDeductibleDeductible, deductible, "Special Water Damage Deductible Deductible");
                saveChanges();
            } else {
                setSpecialWaterDamageDeductibleUW(data, coverage, deductible);
            }
        }
    }

    public void setSpecialWaterDamageDeductibleHS_RI_RNW(Map<String, String> data, String coverage, String deductible) throws Throwable {
        if (!specialWaterDamageDeductibleUwYes.isDisplayed()) {
            if (hasValue(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_RNW")) && data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_RNW").equalsIgnoreCase("Yes")) {
                checkUwOverrideSpecialWaterDamageDeductibleHS_RI_CT(data.get("Optional_Coverages_Uw_Override_Special_Water_Damage_Deductible_RNW"));
                pause(2000);
                choose(waterDamageDeductibleUwYes, waterDamageDeductibleNo, data.get("Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_RNW"), "Special Water Damage Deductible");
                typeTextEnter(waterDamageDeductibleDeductible, deductible, "Special Water Damage Deductible Deductible");
                saveChanges();
            } else {
                setSpecialWaterDamageDeductibleUW(data, coverage, deductible);
            }
        }
    }

    public void checkUwOverrideSpecialWaterDamageDeductible(String value) throws Throwable {
        checkCheckbox(uwOverrideSpecialWaterDamageDeductible, value, "UW Override Special Water Damage Deductible");
    }

    public void checkUwOverrideSpecialWaterDamageDeductibleHS_RI_CT(String value) throws Throwable {
        checkCheckbox(uwOverrideWaterDamageDeductible, value, "UW Override Water Damage Deductible");
    }

    private void setBroadenedLossOfUseCoverage(String value) throws Throwable {
        choose(broadenedLossOfUseCoverageYes, broadenedLossOfUseCoverageNo, value, "Broadened Loss Of Use Coverage");
    }

    private void setEnhancedResidentialCoverage(String value) throws Throwable {
        choose(enhancedResidentialCoverageYes, enhancedResidentialCoverageNo, value, "Enhanced Residential Coverage");
    }

    private void setOffPremisesOtherStructuresExtension(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(offPremisesOtherStructuresExtensionYes, offPremisesOtherStructuresExtensionNo, "No", "Off Premises Other Structures Extension");
            } else {
                choose(offPremisesOtherStructuresExtensionYes, offPremisesOtherStructuresExtensionNo, "Yes", "Off Premises Other Structures Extension");
                pause(500);
                typeTextEnter(offPremisesOtherStructuresExtensionNamedStructures, value, "Off Premises Other Structures Extension Named Structures");
            }
        }
    }

    public void setAnimalLiabilityExclusion(String value) throws Throwable {
        choose(animalLiabilityExclusionYes.get(0), animalLiabilityExclusionNo, value, "Animal Liability Exclusion");
    }

    public void setBroadenedLiabilityCoverage(String value) throws Throwable {
        choose(broadenedLiabilityCoverageYes.get(0), broadenedLiabilityCoverageNo, value, "Broadened Liability Coverage");
    }

    public void setBroadenedLiabilityCoverageLibelSlanderExcluded(String value) throws Throwable {
        choose(broadenedLiabilityCoverageLibelSlanderExcludedYes.get(0), broadenedLiabilityCoverageLibelSlanderExcludedNo, value, "Broadened Liability Coverage Libel Slander Excluded");
    }

    public void setBusinessExclusionData(String value) throws Throwable {
        choose(businessExclusionYes.get(0), businessExclusionNo, value, "Business Exclusion Data");
    }

    public void setCosmeticMarringExclusion(String value) throws Throwable {
        choose(cosmeticMarringExclusionYes.get(0), cosmeticMarringExclusionNo, value, "Cosmetic Marring Exclusion");
    }

    public void setExteriorInsulationAndFinishSystemsExclusion(String value) throws Throwable {
        choose(exteriorInsulationAndFinishSystemsEIFSExclusionYes.get(0), exteriorInsulationAndFinishSystemsEIFSExclusionNo, value, "Exterior Insulation And Finish Systems Exclusion");
    }

    public void setMinimumEarnedPremium(String value, String override) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                checkCheckbox(minimumEarnedPremiumUWOverride, override, "Minimum Earned Premium UW Override");
                pause(3000);
                choose(minimumEarnedPremiumYes.get(0), minimumEarnedPremiumNo, "No", "Minimum Earned Premium");
            } else {
                checkCheckbox(minimumEarnedPremiumUWOverride, override, "Minimum Earned Premium UW Override");
                pause(3000);
                choose(minimumEarnedPremiumYes.get(0), minimumEarnedPremiumNo, "Yes", "Minimum Earned Premium");
                pause(500);
                typeTextEnter(minimumEarnedPremiumLimit, value, "Minimum Earned Premium Limit");
                saveChanges();
            }
        }
    }

    public void setNamedStructuresExclusion(String value, String excluded) throws Throwable {
        choose(namedStructuresExclusionYes.get(0), namedStructuresExclusionNo, value, "Named Structures Exclusion");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            typeText(namedStructuresToBeExcluded, excluded, "Named Structures To Be Excluded");
        }
    }

    public void setExclusionContentsExtendedReplacementCost(String value) throws Throwable {
        choose(exclusionContentsExtendedReplacementCostYes, exclusionContentsExtendedReplacementCostNo, value, "Exclusion Contents Extended Replacement Cost");
    }

    public void setScreenEnclosureExclusion(String value) throws Throwable {
        choose(screenEnclosureExclusionYes.get(0), screenEnclosureExclusionNo, value, "Screen Enclosure Exclusion");
    }

    public void setSwimmingPoolLiabilityExclusion(String value) throws Throwable {
        choose(swimmingPoolLiabilityExclusionYes.get(0), swimmingPoolLiabilityExclusionNo, value, "Swimming PoolLiability Exclusion");
    }

    public void setTenantAnimalLiabilityExclusion(String value, String override) throws Throwable {
        choose(tenantAnimalLiabilityExclusionYes.get(0), tenantAnimalLiabilityExclusionNo, value, "Tenant Animal Liability Exclusion");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            checkCheckbox(tenantAnimalLiabilityUWOverride, override, "Tenant Animal Liability Exclusion UW Override");
            pause(3000);
        }
    }

    public void setSpecialWaterDamageDeductible(String value, String coverageType, String deductible, String override) throws Throwable {
        setSpecialWaterDamageDeductible(value);
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            setSpecialWaterDamageDeductibleUWOverride(override);
            setSpecialWaterDamageCoverageType(coverageType);
            setSpecialWaterDamageDeductibleValue(deductible);
            pause(3000);
        }
    }

    public void setSpecialWaterDamageDeductibleUWOverride(String value) throws Throwable {
        checkCheckbox(specialWaterDamageDeductibleUWOverride.get(0), value, "Special Water Damage Deductible UW Override");
    }

    public void setSpecialWaterDamageDeductibleValue(String value) throws Throwable {
        typeTextEnter(specialWaterDamageDeductible.get(0), value, "Special Water Damage Deductible");
    }

    public void setSpecialWaterDamageCoverageType(String value) throws Throwable {
        typeTextEnter(specialWaterDamageCoverageType.get(0), value, "Special Water Damage Coverage Type");
    }

    public void setSpecialWaterDamageDeductible(String value) throws Throwable {
        choose(specialWaterDamageDeductibleYes.get(0), specialWaterDamageDeductibleNo, value, "Special Water Damage Deductible");
    }

    public void setRoofReconstructionCostSchedule(String value, String override) throws Throwable {
        choose(roofReconstructionCostScheduleYes.get(0), roofReconstructionCostScheduleNo, value, "Roof Reconstruction Cost Schedule");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            checkCheckbox(roofReconstructionCostScheduleUWOverride, override, "Roof Reconstruction Cost Schedule UW Override");
            pause(3000);
        }
    }

    public void setRoofExclusion(String value, String override) throws Throwable {
        choose(roofExclusionYes.get(0), roofExclusionNo, value, "Roof Exclusion");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            checkCheckbox(roofExclusionUWOverride, override, "Roof Exclusion UW Override");
            pause(3000);
        }
    }

    public void setHigherUnderlyingLimit(Map<String, String> data) throws Throwable {
        if (data.get("Higher_Underlying_Limit") != null && data.get("Higher_Underlying_Limit").equalsIgnoreCase("Yes")) {
            typeText(higherUnderlyingLimit, "Yes");
            pause(2000);
            checkCheckbox(homeowners, data.get("UL_Homeowners"));
            checkCheckbox(auto, data.get("UL_Auto"));
            checkCheckbox(uim, data.get("UL_UIM"));
            checkCheckbox(watercraft, data.get("UL_Watercraft"));
            checkCheckbox(recreationalVehicles, data.get("UL_Recreational_Vehicles"));
            typeText(limits.get(0), data.get("UL_Homeowners_Limit"));
            typeText(limits.get(1), data.get("UL_Auto_Limit"));
            typeText(limits.get(1), data.get("UL_UIM_Limit"));
            typeText(limits.get(2), data.get("UL_Watercraft_Limit"));
            typeText(limits.get(3), data.get("UL_Recreational_Vehicles_Limit"));
        }
    }

    public void setHigherUnderlyingLimit_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Higher_Underlying_Limit_END"))) {
            if (data.get("Higher_Underlying_Limit_END").equalsIgnoreCase("Yes")) {
                typeText(higherUnderlyingLimit, "Yes");
                pause(2000);
                checkCheckbox(homeowners, data.get("UL_Homeowners_END"));
                //checkCheckbox(auto,data.get("UL_Auto_END"));
                checkCheckbox(uim, data.get("UL_UIM_END"));
                checkCheckbox(watercraft, data.get("UL_Watercraft_END"));
                checkCheckbox(recreationalVehicles, data.get("UL_Recreational_Vehicles_END"));
                typeText(limits.get(0), data.get("UL_Homeowners_Limit_END"));
                //typeText(limits.get(1),data.get("UL_Auto_Limit_END"));
                typeText(limits.get(1), data.get("UL_UIM_Limit_END"));
                typeText(limits.get(2), data.get("UL_Watercraft_Limit_END"));
                typeText(limits.get(3), data.get("UL_Recreational_Vehicles_Limit_END"));
            }
        }
    }

    public void setHigherUnderlyingLimit_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Higher_Underlying_Limit_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(higherUnderlyingLimit, "Yes");
            pause(2000);
            checkCheckbox(homeowners, data.get("UL_Homeowners_OOS_END"));
            //checkCheckbox(auto,data.get("UL_Auto_OOS_END"));
            checkCheckbox(uim, data.get("UL_UIM_OOS_END"));
            checkCheckbox(watercraft, data.get("UL_Watercraft_OOS_END"));
            checkCheckbox(recreationalVehicles, data.get("UL_Recreational_Vehicles_OOS_END"));
            typeText(limits.get(0), data.get("UL_Homeowners_Limit_OOS_END"));
            //typeText(limits.get(1),data.get("UL_Auto_Limit_OOS_END"));
            typeText(limits.get(1), data.get("UL_UIM_Limit_OOS_END"));
            typeText(limits.get(2), data.get("UL_Watercraft_Limit_OOS_END"));
            typeText(limits.get(3), data.get("UL_Recreational_Vehicles_Limit_OOS_END"));
        }
    }

    public void setHigherUnderlyingLimit_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Higher_Underlying_Limit_RNW"))) {
            if (data.get("Higher_Underlying_Limit_RNW").equalsIgnoreCase("Yes")) {
                typeText(higherUnderlyingLimit, "Yes");
                pause(2000);
                checkCheckbox(homeowners, data.get("UL_Homeowners_RNW"));
                //checkCheckbox(auto,data.get("UL_Auto_RNW"));
                checkCheckbox(uim, data.get("UL_UIM_RNW"));
                checkCheckbox(watercraft, data.get("UL_Watercraft_RNW"));
                checkCheckbox(recreationalVehicles, data.get("UL_Recreational_Vehicles_RNW"));
                typeText(limits.get(0), data.get("UL_Homeowners_Limit_RNW"));
                //typeText(limits.get(1),data.get("UL_Auto_Limit_RNW"));
                typeText(limits.get(1), data.get("UL_UIM_Limit_RNW"));
                typeText(limits.get(2), data.get("UL_Watercraft_Limit_RNW"));
                typeText(limits.get(3), data.get("UL_Recreational_Vehicles_Limit_RNW"));
            }
        }
    }

    public void setPremisesLiability(String value) throws Throwable {
        typeText(premisesLiabilityLimitation, value);
    }

    public void setPoliticalActivity(String value) throws Throwable {
        typeText(politicalActivityExclusion, value);
    }

    public void setLibelSlander(String value) throws Throwable {
        typeText(libelSlanderExclusion, value);
    }

    public void setPrimaryFloodDecPageReceived(String value) throws Throwable {
        pause(3000);
        if (isElementDisplayed(floodDecPageReceivedYes)) {
            choose(floodDecPageReceivedYes, floodDecPageReceivedNo, value);
        }
    }

    public void setRoofExclusionUW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Exclusion").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion"));
            pause(3000);
            choose(roofExclusionUwYes, roofExclusionUwNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion"));
        }
    }

    public void setRoofExclusionUWHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Exclusion_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion_END"));
            pause(3000);
            choose(roofExclusionUwYes, roofExclusionUwNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion_END"));
        }
    }

    public void setRoofExclusionUWHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Exclusion_OOS_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion_OOS_END"));
            pause(3000);
            choose(roofExclusionUwYes, roofExclusionUwNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion_OOS_END"));
        }
    }

    public void setRoofExclusionUWHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Exclusion_RNW").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion_RNW"));
            pause(3000);
            choose(roofExclusionUwYes, roofExclusionUwNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Exclusion_RNW"));
        }

    }

    public void checkUWOverrideRoofExclusion(String value) throws Throwable {
        checkCheckbox(uwOverrideRoofExclusion, value, "UW Override Roof Exclusion");
    }

    public void setRoofReconstructionCostScheduleUW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofReconstructionCostSchedule(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule"));
            pause(3000);
            choose(roofReconstructionCostsScheduleYes, roofReconstructionCostsScheduleNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule"));
        }
    }

    public void setRoofReconstructionCostScheduleUWHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofReconstructionCostSchedule(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule_END"));
            pause(3000);
            choose(roofReconstructionCostsScheduleYes, roofReconstructionCostsScheduleNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule_END"));
        }
    }

    public void setRoofReconstructionCostScheduleUWHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule_OOS_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofReconstructionCostSchedule(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule_OOS_END"));
            pause(3000);
            choose(roofReconstructionCostsScheduleYes, roofReconstructionCostsScheduleNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule_OOS_END"));
        }
    }

    public void setRoofReconstructionCostScheduleUWHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Roof_Reconstruction_Cost_Schedule_RNW").equalsIgnoreCase("Yes")) {
            checkUWOverrideRoofReconstructionCostSchedule(data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule_RNW"));
            pause(3000);
            choose(roofReconstructionCostsScheduleYes, roofReconstructionCostsScheduleNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Roof_Reconstruction_Cost_Schedule_RNW"));
        }

    }

    public void checkUWOverrideRoofReconstructionCostSchedule(String value) throws Throwable {
        checkCheckbox(uwOverrideRoofReconstructionCostSchedule, value, "UW Override Roof Reconstruction Cost Schedule");
    }

    public void setTenantAnimalLiabilityExclusion(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion").equalsIgnoreCase("Yes")) {
            checkUWOverrideTenantAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Tenant_Animal_Liability_Exclusion"));
            pause(3000);
            choose(tenantAnimalLiabilityYes, tenantAnimalLiabilityNo, data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion"));
        }
    }

    public void setTenantAnimalLiabilityExclusionHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideTenantAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Tenant_Animal_Liability_Exclusion_END"));
            pause(3000);
            choose(tenantAnimalLiabilityYes, tenantAnimalLiabilityNo, data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_END"));
        }
    }

    public void setTenantAnimalLiabilityExclusionHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_OOS_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideTenantAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Tenant_Animal_Liability_Exclusion_OOS_END"));
            pause(3000);
            choose(tenantAnimalLiabilityYes, tenantAnimalLiabilityNo, data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_OOS_END"));
        }
    }

    public void setTenantAnimalLiabilityExclusionHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_RNW").equalsIgnoreCase("Yes")) {
            checkUWOverrideTenantAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Uw_Override_Tenant_Animal_Liability_Exclusion_RNW"));
            pause(3000);
            choose(tenantAnimalLiabilityYes, tenantAnimalLiabilityNo, data.get("Optional_Coverages_Exclusions_Tenant_Animal_Liability_Exclusion_RNW"));
        }

    }

    public void checkUWOverrideTenantAnimalLiabilityExclusion(String value) throws Throwable {
        checkCheckbox(uwOverrideTenantAnimalLiability, value, "UW Override Tenant Animal Liability Exclusion");
    }

    public void setPremisesLiabilityLimitation(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Premises_Liability_Limitation").equalsIgnoreCase("Yes")) {
            checkUWOverridePremisesLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation"));
            pause(3000);
            choose(premisesLiabilityLimitationYes, premisesLiabilityLimitationNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation"));
        }
    }

    public void setPremisesLiabilityLimitationHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Premises_Liability_Limitation_END").equalsIgnoreCase("Yes")) {
            checkUWOverridePremisesLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation_END"));
            pause(3000);
            choose(premisesLiabilityLimitationYes, premisesLiabilityLimitationNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation_END"));
        }
    }

    public void setPremisesLiabilityLimitationHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Premises_Liability_Limitation_OOS_END").equalsIgnoreCase("Yes")) {
            checkUWOverridePremisesLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation_OOS_END"));
            pause(3000);
            choose(premisesLiabilityLimitationYes, premisesLiabilityLimitationNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation_OOS_END"));
        }
    }

    public void setPremisesLiabilityLimitationHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Premises_Liability_Limitation_RNW").equalsIgnoreCase("Yes")) {
            checkUWOverridePremisesLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation_RNW"));
            pause(3000);
            choose(premisesLiabilityLimitationYes, premisesLiabilityLimitationNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Premises_Liability_Limitation_RNW"));
        }

    }

    public void checkUWOverridePremisesLiabilityLimitation(String value) throws Throwable {
        checkCheckbox(uwOverridePremisesLiabilityLimitation, value, "Optional Coverages Exclusions Uw Override Premises Liability Limitation");
    }

    public void setLossOfUseFairRentalValue(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Loss_Of_Use_Fair_Rental_Value").equalsIgnoreCase("Yes")) {
            checkUWOverrideLossOfUseFairRentalValue(data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value"));
            pause(3000);
            choose(lossOfUseFairRentalValueYes, lossOfUseFairRentalValueNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value"));
        }
    }

    public void setLossOfUseFairRentalValueHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Loss_Of_Use_Fair_Rental_Value_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideLossOfUseFairRentalValue(data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value_END"));
            pause(3000);
            choose(lossOfUseFairRentalValueYes, lossOfUseFairRentalValueNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value_END"));
        }
    }

    public void setLossOfUseFairRentalValueHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Loss_Of_Use_Fair_Rental_Value_OOS_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideLossOfUseFairRentalValue(data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value_OOS_END"));
            pause(3000);
            choose(lossOfUseFairRentalValueYes, lossOfUseFairRentalValueNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value_OOS_END"));
        }
    }

    public void setLossOfUseFairRentalValueHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Loss_Of_Use_Fair_Rental_Value_RNW").equalsIgnoreCase("Yes")) {
            checkUWOverrideLossOfUseFairRentalValue(data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value_RNW"));
            pause(3000);
            choose(lossOfUseFairRentalValueYes, lossOfUseFairRentalValueNo, data.get("Optional_Coverages_Exclusions_Uw_Override_Loss_Of_Use_Fair_Rental_Value_RNW"));
        }

    }

    public void checkUWOverrideLossOfUseFairRentalValue(String value) throws Throwable {
        checkCheckbox(uwOverrideLossOfUseFairRentalValue, value, "Uw Override Loss Of Use Fair Rental Value");
    }

    public void setEliminationOfWaiverOfDeductible(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"))) {
            if (data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible").equalsIgnoreCase("Yes")) {
                checkUWOverrideEliminationOfWaiverOfDeductible(data.get("Optional_Coverages_Uw_Override_Elimination_Of_Waiver_Of_Deductible"));
                pause(3000);
                choose(eliminationOfWaiverOfDeductibleYes, eliminationOfWaiverOfDeductibleNo, data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible"));
            }
        }
    }

    public void setEliminationOfWaiverOfDeductibleHS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"))) {
            if (data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END").equalsIgnoreCase("Yes")) {
                checkUWOverrideEliminationOfWaiverOfDeductible(data.get("Optional_Coverages_Uw_Override_Elimination_Of_Waiver_Of_Deductible_END"));
                pause(3000);
                choose(eliminationOfWaiverOfDeductibleYes, eliminationOfWaiverOfDeductibleNo, data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_END"));
            }
        }
    }

    public void setEliminationOfWaiverOfDeductibleHS_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"))) {
            if (data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END").equalsIgnoreCase("Yes")) {
                checkUWOverrideEliminationOfWaiverOfDeductible(data.get("Optional_Coverages_Uw_Override_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
                pause(3000);
                choose(eliminationOfWaiverOfDeductibleYes, eliminationOfWaiverOfDeductibleNo, data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_OOS_END"));
            }
        }
    }

    public void setEliminationOfWaiverOfDeductibleHS_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"))) {
            if (data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW").equalsIgnoreCase("Yes")) {
                checkUWOverrideEliminationOfWaiverOfDeductible(data.get("Optional_Coverages_Uw_Override_Elimination_Of_Waiver_Of_Deductible_RNW"));
                pause(3000);
                choose(eliminationOfWaiverOfDeductibleYes, eliminationOfWaiverOfDeductibleNo, data.get("Optional_Coverages_Exclusions_Elimination_Of_Waiver_Of_Deductible_RNW"));
            }
        }

    }

    public void checkUWOverrideEliminationOfWaiverOfDeductible(String value) throws Throwable {
        checkCheckbox(uwOverrideEliminationOfWaiverOfDeductible, value, "Uw Override Elimination Of Waiver Of Deductible");
    }

    public void setDwellingReplacementCostCoverage(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Dwelling_Replacement_Cost_Coverage").equalsIgnoreCase("Yes")) {
            checkUWOverrideDwellingReplacementCostCoverage(data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage"));
            pause(2000);
            choose(dwellingReplacementCostCoverageYes, dwellingReplacementCostCoverageNo, data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage"), "Dwelling Replacement Cost Coverage");
        }
    }

    public void setDwellingReplacementCostCoverageHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Dwelling_Replacement_Cost_Coverage_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideDwellingReplacementCostCoverage(data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage_END"));
            pause(2000);
            choose(dwellingReplacementCostCoverageYes, dwellingReplacementCostCoverageNo, data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage_END"), "Dwelling Replacement Cost Coverage");
        }
    }

    public void setDwellingReplacementCostCoverageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Dwelling_Replacement_Cost_Coverage_OOS_END").equalsIgnoreCase("Yes")) {
            checkUWOverrideDwellingReplacementCostCoverage(data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage_OOS_END"));
            pause(2000);
            choose(dwellingReplacementCostCoverageYes, dwellingReplacementCostCoverageNo, data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage_OOS_END"), "Dwelling Replacement Cost Coverage");
        }
    }

    public void setDwellingReplacementCostCoverageHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Optional_Coverages_Exclusions_Dwelling_Replacement_Cost_Coverage_RNW").equalsIgnoreCase("Yes")) {
            checkUWOverrideDwellingReplacementCostCoverage(data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage_RNW"));
            pause(2000);
            choose(dwellingReplacementCostCoverageYes, dwellingReplacementCostCoverageNo, data.get("Optional_Coverages_Exclusions_UW_Override_Dwelling_Replacement_Cost_Coverage_RNW"), "Dwelling Replacement Cost Coverage RNW");
        }
    }

    public void checkUWOverrideDwellingReplacementCostCoverage(String value) throws Throwable {
        checkCheckbox(uwOverrideDwellingReplacementCostCoverage, value, "UW Override Dwelling Replacement Cost Coverage");
    }

    public void setPropertyRemediationLimitedLiabilityCoverage(String value) throws Throwable {
        choose(propertyRemediationLimitedLiabilityCoverageYes.get(0), propertyRemediationLimitedLiabilityCoverageNo, value, "PropertyRemidationLimitedLiabilityCoverage");
    }

    public void setReplacementCostCoverage(String value) throws Throwable {
        if (isElementDisplayed(replacementCostCoverage)) {
            clickElement(replacementCostCoverage);
            pause(1000);
            typeTextEnter(replacementCostCoverage, value, "Replacement Cost Coverage");
        }
    }

    public void setActualCashValueForRoofCovering(String value) throws Throwable {
        choose(actualCashValueForRoofCoveringYes.get(0), actualCashValueForRoofCoveringNo, value, "Actual Cash Value For Roof Covering");
    }

    public void setExclusionOfCosmeticDamageDueToHailstorm(String value) throws Throwable {
        choose(exclusionOfCosmeticDamageDueToHailstormYes.get(0), exclusionOfCosmeticDamageDueToHailstormNo, value, "Exclusions Exclusion Of Cosmetic Damage Due To Hailstorm");
    }

    public void setExclusionOfCosmeticDamageDueToHailstormUWOverride(String value) throws Throwable {
        checkCheckbox(exclusionOfCosmeticDamageDueToHailstormUWOverride, value, "Exclusions Exclusion Of Cosmetic Damage Due To Hailstorm UW Override");
    }

    public void setRoofExclusionForHailDamage(String value) throws Throwable {
        choose(roofExclusionForHailDamageYes.get(0), roofExclusionForHailDamageNo, value, "Roof Exclusion For Hail Damage");
    }

    public void setRemovalOfSelectSpecialLimitsOfLiability(String value) throws Throwable {
        choose(removalOfSelectSpecialLimitsOfLiabilityYes.get(0), removalOfSelectSpecialLimitsOfLiabilityNo, value, "Removal Of Select Special Limits Of Liability");
    }

    public void setMinimumEarnedPremiumUWOverride(String value, String excluded) throws Throwable {
        choose(minimumEarnedPremiumYes.get(0), minimumEarnedPremiumNo, value, "Minimum Earned Premium");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            typeText(minimumEarnedPremiumLimit, excluded, "Minimum Earned Premium Limit");
            clickElement(minimumEarnedPremiumUWOverride, "Minimum Earned Premium UWOverride");
        }
    }

    public void setLibelSlanderExclusion(String value) throws Throwable {
        if(hasValue(value)) {
            choose(libelSlanderExclusionYes.get(0), libelSlanderExclusionNo, value, "Libel Slander Exclusion");
        }
    }

    public void setSwimmingPoolLiabilityLimitation(String value) throws Throwable {
        choose(swimmingPoolLiabilityLimitationYes.get(0), swimmingPoolLiabilityLimitationNo, value, "Swimming Pool Liability Limitation");
    }

    public void setReplacementCostCoverageWithCoinsuranceClause(String value) throws Throwable {
        try {
            choose(replacementCostCoverageWithCoinsuranceClauseYes.get(0), replacementCostCoverageWithCoinsuranceClauseNo, value, "Replacement Cost Coverage With Coinsurance Clause");
        } catch (Exception e) {

        }
    }

    public void setRemovalOfSubLimitsForFineArtsAndCollectibles(String value) throws Throwable {
        choose(removalOfSubLimitsForFineArtsAndCollectiblesYes.get(0), removalOfSubLimitsForFineArtsAndCollectiblesNo, value, "Removal Of SubLimits For Fine Arts And Collectibles");
    }

    public void setPersonalInjuryExclusion(String value) throws Throwable {
        choose(personalInjuryExclusionYes.get(0), personalInjuryExclusionNo, value, "Personal Injury Exclusion");
    }

    public void setLossAssessmentDecrease(String value) throws Throwable {
        choose(lossAssessmentDecreaseYes.get(0), lossAssessmentDecreaseNo, value, "Loss Assessment Decrease");
    }

    public void setGuaranteedReplacementCost(String value) throws Throwable {
        choose(guaranteedReplacementCostYes.get(0), guaranteedReplacementCostNo, value, "Guaranteed Replacement Cost");
    }

    public void setFineArtExclusion(String value) throws Throwable {
        if(hasValue(value)) {
            choose(fineArtExclusionYes.get(0), fineArtExclusionNo, value, "Fine Art Exclusion");
        }
    }

    public void setDeletionOfEnsuingFungiOrBacteria(String value) throws Throwable {
        choose(deletionOfEnsuingFungiOrBacteriaYes.get(0), deletionOfEnsuingFungiOrBacteriaNo, value, "Deletion Of Ensuing Fungi Or Bacteria");
    }

    public void setContentsOffPremisesLossExclusion(String value) throws Throwable {
        choose(contentsOffPremisesLossExclusionYes.get(0), contentsOffPremisesLossExclusionNo, value, "Contents Off Premises Loss Exclusion");
    }

    public void setBackupOfSewerOrDrainIncrease(String value, String limit) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(backupOfSewerOrDrainIncreaseYes.get(0), backupOfSewerOrDrainIncreaseNo, "No", "Backup Of Sewer Or DrainI Increase");
            } else {
                choose(backupOfSewerOrDrainIncreaseYes.get(0), backupOfSewerOrDrainIncreaseNo, "Yes", "Backup Of Sewer Or DrainI Increase");
                typeTextEnter(backupOfSewerOrDrainIncreaseLimit, limit, "Backup Of Sewer Or DrainI Increase Limit");
            }
        }
    }

    public void setAnimalLiabilityLimitation(String value) throws Throwable {
        choose(animalLiabilityLimitationYes.get(0), animalLiabilityLimitationNo, value, "Animal Liability Limitation");
    }

    public void setAmendedSpecialLimitsOfLiabilityForContents(String value) throws Throwable {
        if (hasValue(value)) {
            try {
                setUWOverrideAmendedSpecialLimitsOfLiabilityForContents("Yes");
            } catch (Exception e) {
                System.out.println("Override button not applicable for Amended Special Limits Of Liability For FContents");
            }
            pause(3000);
        }
        choose(amendedSpecialLimitsOfLiabilityForContentsYes, amendedSpecialLimitsOfLiabilityForContentsNo, value, "Amended Special Limits Of Liability For Content");
    }

    public void setUWOverrideAmendedSpecialLimitsOfLiabilityForContents(String value) throws Throwable {
        checkCheckbox(managerOverrideAmendedSpecialLimitsOfLiabilityForContent, value);
    }

    public void setPremisesLiabilityLimitationHO(String value) throws Throwable {
        choose(premisesLiabilityLimitationYes, premisesLiabilityLimitationNo, value);
    }

    public void setNamedStructuresExclusion(String value) throws Throwable {
        choose(namedStructuresExclusionYes.get(0), namedStructuresExclusionNo, value, "Named Structures Exclusion");
    }

    public void setAmendedSettlementBasis(String value) throws Throwable {
        choose(amendedSettlementBasisYes, amendedSettlementBasisNo, value);
    }

    public void setManagerOverrideOfEliminationWaiverDeductible(String value) throws Throwable {
        checkCheckbox(managerOverrideOfEliminationWaiverDeductible, value);
    }

    public void setOverrideCosmeticMarringExclusion(String value) throws Throwable {
        checkCheckbox(overrideCosmeticMarringExclusion, value);
        pause(3000);
    }

    public void setEliminationOfWaiverOfDeductibleHO(String value) throws Throwable {
        if (hasValue(value)) {
            try {
                setManagerOverrideOfEliminationWaiverDeductible("Yes");
            } catch (Exception e) {
                System.out.println("Override button not applicable for Elimination Of Waiver of Deductible");
            }
            pause(3000);
            choose(eliminationOfWaiverOfDeductibleYes, eliminationOfWaiverOfDeductibleNo, value);
        }
    }

    public void setCosmeticMarringExclusionHO(String value) throws Throwable {
        if (hasValue(value)) {
            setOverrideCosmeticMarringExclusion("Yes");
            pause(3000);
            choose(cosmeticMarringExclusionYes.get(0), cosmeticMarringExclusionNo, value);
        }
    }

    public void setLawAndOrdinanceIncreaseOrRejection(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(lawAndOrdinanceIncreaseOrRejectionYes, lawAndOrdinanceIncreaseOrRejectionNo, "No");
            } else {
                choose(lawAndOrdinanceIncreaseOrRejectionYes, lawAndOrdinanceIncreaseOrRejectionNo, "Yes");
                pause(3000);
                typeTextEnter(lawAndOrdinanceIncreaseOrRejectionOption, value, "Law And Ordinance Increase Or Rejection");
            }
        }

    }

    public void setFungiLiabilityExtensions(String value) throws Throwable {
        choose(fungiLiabilityExtensionYes, fungiLiabilityExtensionNo, value);
    }

    public void setFloodExtensionDIC(String value) throws Throwable {
        choose(floodExtensionDICYes, floodExtensionDICNo, value);
        pause(3000);
    }

    public void setRoofCoveringFullReconstructionCost(String value) throws Throwable {
        choose(roofCoveringFullReconstructionCostYes, roofCoveringFullReconstructionCostNo, value);
    }

    public void setCosmeticMarringExclusionForMetalRoofsHO(String value) throws Throwable {
        if (hasValue(value)) {
            setOverrideCosmeticMarringExclusion("Yes");
            choose(cosmeticMarringExclusionForMetalRoofsYes, cosmeticMarringExclusionForMetalRoofsNo, value);
        }
    }

    public void setCosmeticMarringExclusionForNamedStructureHO(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("No")) {
                choose(cosmeticMarringExclusionForNamedStructureYes, cosmeticMarringExclusionForNamedStructureNo, "No");
            } else {
                choose(cosmeticMarringExclusionForNamedStructureYes, cosmeticMarringExclusionForNamedStructureNo, "Yes");
                pause(3000);
                typeTextEnter(cosmeticMarringExclusionForNamedStructureInput, value, "Cosmetic Marring Exclusion For Named Structure");
                clickFooter();
            }
        }
    }

    public void setNamedStructuresExclusionHO(String value, String excluded) throws Throwable {
        if (hasValue(value)) {
            try {
                choose(namedStructuresExclusionYes.get(0), namedStructuresExclusionNo, value, "Named Structures Exclusion");
                pause(4000);
                if (value.equalsIgnoreCase("Yes")) {
                    typeTextEnter(namedStructuresExclusionInput, excluded, "Named Structures To Be Excluded");
                    clickFooter();
                }
            } catch (Exception e) {
                System.out.println("Named Structures Exclusion TextArea is not visible for this state");
            }
        }
    }

    public void setNamedOtherStructuresExclusionHO(String value, String excluded) throws Throwable {
        choose(namedOtherStructuresExclusionYes, namedOtherStructuresExclusionNo, value, "Named Structures Exclusion");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            pause(4000);
            typeTextEnter(namedOtherStructuresExclusionInput, excluded, "Named Structures To Be Excluded");
            clickFooter();
        }
    }

    public void setDwellingReplacementCostCoverageHO(String value) throws Throwable {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("No"))
                choose(dwellingReplacementCostCoverageYes, dwellingReplacementCostCoverageNo, value);
            else
                typeTextEnter(dwellingReplacementCostCoverageInput, value, "Dwelling Replacement Cost Coverage");
        }
    }

    public void setExtendedReplacementCostCoverage(String value) throws Throwable {
        choose(extendedReplacementCostCoverageYes, extendedReplacementCostCoverageNo, value);
    }

    public void setRemovalOf20PercentRequirementForOtherStructures(String value) throws Throwable {
        choose(removalOf20PercentReqForOtherStrYes, removalOf20PercentReqForOtherStrNo, value);
    }

    public void setAmendmentToSpecialLimitsForContents(String value) throws Throwable {
        choose(amendmentToSpecialLimitsForContentsYes, amendmentToSpecialLimitsForContentsNo, value);
    }

    public void setExclusionForBackUpOfSewersAndDrains(String value) throws Throwable {
        choose(exclusionForBackUpOfSewersAndDrainsYes, exclusionForBackUpOfSewersAndDrainsNo, value);
        pause(3000);
    }

    public void setSublimitForBackUpOfSewersAndDrains(String value, String exclusion) throws Throwable {
        if (hasValue(value) && !exclusion.equalsIgnoreCase("Yes")) {
            if (value.equalsIgnoreCase("No")) {
                choose(sublimitForBackUpOfSewersAndDrainsYes, sublimitForBackUpOfSewersAndDrainsNo, "No");
            } else {
                choose(sublimitForBackUpOfSewersAndDrainsYes, sublimitForBackUpOfSewersAndDrainsNo, "Yes");
                pause(2000);
                typeTextEnter(sublimitForBackUpOfSewersAndDrainsInput, value, "Sublimit for Back Up Of Sewers and Drains");
            }
        }
    }

    public void setCanineLiabilityExclusion(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_Canine_Liability_Exclusion");
        if (hasValue(condition)) {
            choose(canineLiabilityExclusionYes, canineLiabilityExclusionNo, condition);

            if (condition.equalsIgnoreCase("Yes")) {
                String[] petName = data.get("Optional_Coverages_Canine_Pet_Name").split(",");
                String[] breed = data.get("Optional_Coverages_Canine_Breed").split(",");
                String[] description = data.get("Optional_Coverages_Canine_Description").split(",");
                for (int i = 0; i < petName.length; i++) {
                    addCanine();
                    clickFooter();
                    setCaninePetName(petName[i], i);
                    setCanineBreed(breed[i], i);
                    setCanineDescription(description[i], i);
                }
            }
        }
    }

    private void setCanineLiabilityExclusion_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_Canine_Liability_Exclusion_END");
        if (hasValue(condition)) {
            choose(canineLiabilityExclusionYes, canineLiabilityExclusionNo, condition);

            if (condition.equalsIgnoreCase("Yes")) {
                String[] petName = data.get("Optional_Coverages_Canine_Pet_Name_END").split(",");
                String[] breed = data.get("Optional_Coverages_Canine_Breed_END").split(",");
                String[] description = data.get("Optional_Coverages_Canine_Description_END").split(",");
                for (int i = 0; i < petName.length; i++) {
                    addCanine();
                    clickFooter();
                    setCaninePetName(petName[i], i);
                    setCanineBreed(breed[i], i);
                    setCanineDescription(description[i], i);
                }
            }
        }
    }

    private void setCanineLiabilityExclusion_OOS_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_Canine_Liability_Exclusion_OOS_END");
        if (hasValue(condition)) {
            choose(canineLiabilityExclusionYes, canineLiabilityExclusionNo, condition);

            if (condition.equalsIgnoreCase("Yes")) {
                String[] petName = data.get("Optional_Coverages_Canine_Pet_Name_OOS_END").split(",");
                String[] breed = data.get("Optional_Coverages_Canine_Breed_OOS_END").split(",");
                String[] description = data.get("Optional_Coverages_Canine_Description_OOS_END").split(",");
                for (int i = 0; i < petName.length; i++) {
                    addCanine();
                    clickFooter();
                    setCaninePetName(petName[i], i);
                    setCanineBreed(breed[i], i);
                    setCanineDescription(description[i], i);
                }
            }
        }
    }

    private void setCanineLiabilityExclusion_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Optional_Coverages_Canine_Liability_Exclusion_RNW");
        if (hasValue(condition)) {
            choose(canineLiabilityExclusionYes, canineLiabilityExclusionNo, condition);

            if (condition.equalsIgnoreCase("Yes")) {
                String[] petName = data.get("Optional_Coverages_Canine_Pet_Name_RNW").split(",");
                String[] breed = data.get("Optional_Coverages_Canine_Breed_RNW").split(",");
                String[] description = data.get("Optional_Coverages_Canine_Description_RNW").split(",");
                for (int i = 0; i < petName.length; i++) {
                    addCanine();
                    clickFooter();
                    setCaninePetName(petName[i], i);
                    setCanineBreed(breed[i], i);
                    setCanineDescription(description[i], i);
                }
            }
        }
    }

    public void setCaninePetName(String value, int i) throws Throwable {
        clickFooter();
        clickElement(caninePetName.get(i), "Canine - Pet Name");
        typeTextEnter(driver.switchTo().activeElement(), value, "Canine - Pet Name");
        clickFooter();
    }

    public void setCanineBreed(String value, int i) throws Throwable {
        clickFooter();
        clickElement(canineBreed.get(i), "Canine - Breed");
        typeTextEnter(driver.switchTo().activeElement(), value, "Canine - Breed");
        clickFooter();
    }

    public void setCanineDescription(String value, int i) throws Throwable {
        clickFooter();
        clickElement(canineDescription.get(i), "Canine - Description");
        typeTextEnter(driver.switchTo().activeElement(), value, "Canine - Description");
        clickFooter();
    }

    public void addCanine() throws Throwable {
        clickElement(caninePetAdd, "Add Canine");
        pause(2000);
        clickFooter();
    }

    public void verifyBlockExists(String block, String state) throws Throwable {
        if (!state.equalsIgnoreCase("NC"))
            super.verifyBlockExists(block);
    }

}