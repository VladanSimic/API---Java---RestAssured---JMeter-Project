package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class WildfireMitigationCreditsBlock extends CommonComponentsAndActions {


    public WildfireMitigationCreditsBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Vegetation/Debris Clearance Under Deck')]/../../../..//label[text()='Yes']/..//input")
    WebElement vegetationDebrisClearanceYes;
    @FindBy(xpath = "//div[contains(text(),'Vegetation/Debris Clearance Under Deck')]/../../../..//label[text()='No']/..//input")
    WebElement vegetationDebrisClearanceNo;
    @FindBy(xpath = "//div[contains(text(),'Clearing of materials within 5ft')]/../../../..//label[text()='Yes']/..//input")
    WebElement clearingOfMaterialsWithin5FtYes;
    @FindBy(xpath = "//div[contains(text(),'Clearing of materials within 5ft')]/../../../..//label[text()='No']/..//input")
    WebElement clearingOfMaterialsWithin5FtNo;
    @FindBy(xpath = "//div[contains(text(),'Noncombustible materials in improvements')]/../../../..//label[text()='Yes']/..//input")
    WebElement noncombustibleMaterialsInImprovementsYes;
    @FindBy(xpath = "//div[contains(text(),'Noncombustible materials in improvements')]/../../../..//label[text()='No']/..//input")
    WebElement noncombustibleMaterialsInImprovementsNo;
    @FindBy(xpath = "//div[contains(text(),'No Combustible structures within 30ft')]/../../../..//label[text()='Yes']/..//input")
    WebElement nocombustibleStructuresWithin30FtYes;
    @FindBy(xpath = "//div[contains(text(),'No Combustible structures within 30ft')]/../../../..//label[text()='No']/..//input")
    WebElement nocombustibleStructuresWithin30FtNo;
    @FindBy(xpath = "//div[contains(text(),'PRC 4291 Compliant')]/../../../..//label[text()='Yes']/..//input")
    WebElement prc4291CompliantYes;
    @FindBy(xpath = "//div[contains(text(),'PRC 4291 Compliant')]/../../../..//label[text()='No']/..//input")
    WebElement prc4291CompliantNo;
    @FindBy(xpath = "//div[contains(text(),'Class A-Fire Rated Roof')]/../../../..//label[text()='Yes']/..//input")
    WebElement classAFireRatedRoofYes;
    @FindBy(xpath = "//div[contains(text(),'Class A-Fire Rated Roof')]/../../../..//label[text()='No']/..//input")
    WebElement classAFireRatedRoofNo;
    @FindBy(xpath = "//div[contains(text(),'Enclosed Eaves')]/../../../..//label[text()='Yes']/..//input")
    WebElement enclosedEavesYes;
    @FindBy(xpath = "//div[contains(text(),'Enclosed Eaves')]/../../../..//label[text()='No']/..//input")
    WebElement enclosedEavesNo;
    @FindBy(xpath = "//div[contains(text(),'Ember/Flame Resistant Vents')]/../../../..//label[text()='Yes']/..//input")
    WebElement emberFlameResistantVentsYes;
    @FindBy(xpath = "//div[contains(text(),'Ember/Flame Resistant Vents')]/../../../..//label[text()='No']/..//input")
    WebElement emberFlameResistantVentsNo;
    @FindBy(xpath = "//div[contains(text(),'Multi-Pane Windows')]/../../../..//label[text()='Yes']/..//input")
    WebElement multiPaneWindowsYes;
    @FindBy(xpath = "//div[contains(text(),'Multi-Pane Windows')]/../../../..//label[text()='No']/..//input")
    WebElement multiPaneWindowsNo;
    @FindBy(xpath = "//div[contains(text(),'Noncombustible Vertical Clearance 6\" of Exterior Surface')]/../../../..//label[text()='Yes']/..//input")
    WebElement nonCombustibleVerticalClearanceOfExteriorSurfaceYes;
    @FindBy(xpath = "//div[contains(text(),'Noncombustible Vertical Clearance 6\" of Exterior Surface')]/../../../..//label[text()='No']/..//input")
    WebElement nonCombustibleVerticalClearanceOfExteriorSurfaceNo;
    @FindBy(xpath = "//div[contains(text(),'Property Mitigation Credits Override')]/../../../..//label[text()='Yes']/..//input")
    WebElement propertyMitigationCreditsOverrideYes;
    @FindBy(xpath = "//div[contains(text(),'Property Mitigation Credits Override')]/../../../..//label[text()='No']/..//input")
    WebElement propertyMitigationCreditsOverrideNo;
    @FindBy(xpath = "//div[contains(text(),'Firewise USA Site')]/../../../..//label[text()='Yes']/..//input")
    WebElement firewiseUSASiteYes;
    @FindBy(xpath = "//div[contains(text(),'Firewise USA Site')]/../../../..//label[text()='No']/..//input")
    WebElement firewiseUSASiteNo;
    @FindBy(xpath = "//div[contains(text(),'Fire Risk Reduction Community')]/../../../..//label[text()='Yes']/..//input")
    WebElement fireRiskReductionCommunityYes;
    @FindBy(xpath = "//div[contains(text(),'Fire Risk Reduction Community')]/../../../..//label[text()='No']/..//input")
    WebElement fireRiskReductionCommunityNo;
    @FindBy(xpath = "//div[contains(text(),'Community Mitigation Credit Override')]/../../../..//label[text()='Yes']/..//input")
    WebElement communityMitigationCreditOverrideYes;
    @FindBy(xpath = "//div[contains(text(),'Community Mitigation Credit Override')]/../../../..//label[text()='No']/..//input")
    WebElement communityMitigationCreditOverrideNo;
    @FindBy(xpath = "//div[contains(text(),'IBHS Certified')]/../../../..//label[text()='Yes']/..//input")
    WebElement ibhsCertifiedYes;
    @FindBy(xpath = "//div[contains(text(),'IBHS Certified')]/../../../..//label[text()='No']/..//input")
    WebElement ibhsCertifiedNo;
    @FindBy(xpath = "//div[text()='Certification Effective']/../../../..//input")
    WebElement ibhsCertificationEffective;


    public void fillWildfireMitigationCreditsHO(Map<String, String> data) throws Throwable {
        LocalDate pdFilling = LocalDate.of(2024, 11, 11);
        String effectiveDateData = data.get("Effective_Date");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate effectiveDate = LocalDate.parse(effectiveDateData, formatter);

        if ((effectiveDate.equals(pdFilling) || effectiveDate.isAfter(pdFilling))) {
            fillPropertyLevelMitigationCredits(data);
            fillCommunityLevelMitigationCredits(data);
            saveChanges();
        }
    }

    public void fillWildfireMitigationCreditsHO_END(Map<String, String> data) throws Throwable {
        LocalDate pdFilling = LocalDate.of(2024, 11, 11);
        String effectiveDateData = data.get("Effective_Date_END");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate effectiveDate = LocalDate.parse(effectiveDateData, formatter);

        if ((effectiveDate.equals(pdFilling) || effectiveDate.isAfter(pdFilling))) {
            fillPropertyLevelMitigationCredits_END(data);
            fillCommunityLevelMitigationCredits_END(data);
            saveChanges();
        }
    }

    public void fillWildfireMitigationCreditsHO_OOS_END(Map<String, String> data) throws Throwable {
        LocalDate pdFilling = LocalDate.of(2024, 11, 11);
        String effectiveDateData = data.get("Effective_Date_OOS_END");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate effectiveDate = LocalDate.parse(effectiveDateData, formatter);

        if ((effectiveDate.equals(pdFilling) || effectiveDate.isAfter(pdFilling))) {
            fillPropertyLevelMitigationCredits_OOS_END(data);
            fillCommunityLevelMitigationCredits_OOS_END(data);
            saveChanges();
        }
    }

    public void fillWildfireMitigationCreditsHO_RNW(Map<String, String> data) throws Throwable {
        LocalDate pdFilling = LocalDate.of(2024, 11, 11);
        String effectiveDateData = data.get("Effective_Date_RNW");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate effectiveDate = LocalDate.parse(effectiveDateData, formatter);

        if ((effectiveDate.equals(pdFilling) || effectiveDate.isAfter(pdFilling))) {
            fillPropertyLevelMitigationCredits_RNW(data);
            fillCommunityLevelMitigationCredits_RNW(data);
            saveChanges();
        }
    }




    public void fillWildfireMitigationCreditsHO(Map<String, String> data, int i) throws Throwable {
        LocalDate pdFilling = LocalDate.of(2024, 11, 11);
        String effectiveDateData = data.get("Effective_Date");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate effectiveDate = LocalDate.parse(effectiveDateData, formatter);

        if ((effectiveDate.equals(pdFilling) || effectiveDate.isAfter(pdFilling))) {
            fillPropertyLevelMitigationCredits(data, i);
            fillCommunityLevelMitigationCredits(data, i);
            saveChanges();
        }
    }

    public void fillPropertyLevelMitigationCredits(Map<String, String> data) throws Throwable {
        verifyVegetationDebrisClearance(data.get("Wildfire_Mitigation_Credits_Verify_Vegetation_Debris_Clearance"));
        verifyClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Verify_Clearing_Of_Materials_Within5Ft"));
        verifyNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_Verify_NonCombustible_Materials_Improvements"));
        verifyNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_Verify_NoCombustible_Structures_Within30Ft"));
        verifyPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_Verify_PRC_4291_Compliant"));
        verifyClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_Verify_ClassA_Fire_Rated_Roof"));
        verifyEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Verify_Enclosed_Eaves"));
        verifyEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_Verify_EmberFlame_Resistant_Vents"));
        verifyMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Verify_Multi_Pane_Windows"));
        verifyNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Verify_Vertical_Clearance_Surface"));
        setPropertyMitigationCreditsOverride(data.get("Wildfire_Mitigation_Credits_Property_Credits_Override"));
        setVegetationDebrisClearance(data.get("Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance"));
        setClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft"));
        setNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements"));
        setNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft"));
        setPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_PRC_4291_Compliant"));
        setClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof"));
        setEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Enclosed_Eaves"));
        setEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents"));
        setMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Multi_Pane_Windows"));
        setNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Vertical_Clearance_Surface"));
    }

    private void fillPropertyLevelMitigationCredits_END(Map<String, String> data) throws Throwable {
        verifyClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Verify_Clearing_Of_Materials_Within5Ft_END"));
        verifyNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_Verify_NonCombustible_Materials_Improvements_END"));
        verifyNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_Verify_NoCombustible_Structures_Within30Ft_END"));
        verifyPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_Verify_PRC_4291_Compliant_END"));
        verifyClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_Verify_ClassA_Fire_Rated_Roof_END"));
        verifyEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Verify_Enclosed_Eaves_END"));
        verifyEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_Verify_EmberFlame_Resistant_Vents_END"));
        verifyMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Verify_Multi_Pane_Windows_END"));
        verifyNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Verify_Vertical_Clearance_Surface_END"));
        setPropertyMitigationCreditsOverride(data.get("Wildfire_Mitigation_Credits_Property_Credits_Override_END"));
        setVegetationDebrisClearance(data.get("Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance_END"));
        setClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft_END"));
        setNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements_END"));
        setNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft_END"));
        setPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_PRC_4291_Compliant_END"));
        setClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof_END"));
        setEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Enclosed_Eaves_END"));
        setEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents_END"));
        setMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Multi_Pane_Windows_END"));
        setNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Vertical_Clearance_Surface_END"));
    }

    private void fillPropertyLevelMitigationCredits_OOS_END(Map<String, String> data) throws Throwable {
        verifyClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Verify_Clearing_Of_Materials_Within5Ft_OOS_END"));
        verifyNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_Verify_NonCombustible_Materials_Improvements_OOS_END"));
        verifyNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_Verify_NoCombustible_Structures_Within30Ft_OOS_END"));
        verifyPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_Verify_PRC_4291_Compliant_OOS_END"));
        verifyClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_Verify_ClassA_Fire_Rated_Roof_OOS_END"));
        verifyEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Verify_Enclosed_Eaves_OOS_END"));
        verifyEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_Verify_EmberFlame_Resistant_Vents_OOS_END"));
        verifyMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Verify_Multi_Pane_Windows_OOS_END"));
        verifyNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Verify_Vertical_Clearance_Surface_OOS_END"));
        setPropertyMitigationCreditsOverride(data.get("Wildfire_Mitigation_Credits_Property_Credits_Override_OOS_END"));
        setVegetationDebrisClearance(data.get("Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance_OOS_END"));
        setClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft_OOS_END"));
        setNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements_OOS_END"));
        setNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft_OOS_END"));
        setPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_PRC_4291_Compliant_OOS_END"));
        setClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof_OOS_END"));
        setEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Enclosed_Eaves_OOS_END"));
        setEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents_OOS_END"));
        setMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Multi_Pane_Windows_OOS_END"));
        setNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Vertical_Clearance_Surface_OOS_END"));
    }

    private void fillPropertyLevelMitigationCredits_RNW(Map<String, String> data) throws Throwable {
        verifyClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Verify_Clearing_Of_Materials_Within5Ft_RNW"));
        verifyNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_Verify_NonCombustible_Materials_Improvements_RNW"));
        verifyNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_Verify_NoCombustible_Structures_Within30Ft_RNW"));
        verifyPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_Verify_PRC_4291_Compliant_RNW"));
        verifyClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_Verify_ClassA_Fire_Rated_Roof_RNW"));
        verifyEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Verify_Enclosed_Eaves_RNW"));
        verifyEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_Verify_EmberFlame_Resistant_Vents_RNW"));
        verifyMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Verify_Multi_Pane_Windows_RNW"));
        verifyNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Verify_Vertical_Clearance_Surface_RNW"));
        setPropertyMitigationCreditsOverride(data.get("Wildfire_Mitigation_Credits_Property_Credits_Override_RNW"));
        setVegetationDebrisClearance(data.get("Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance_RNW"));
        setClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft_RNW"));
        setNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements_RNW"));
        setNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft_RNW"));
        setPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_PRC_4291_Compliant_RNW"));
        setClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof_RNW"));
        setEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Enclosed_Eaves_RNW"));
        setEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents_RNW"));
        setMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Multi_Pane_Windows_RNW"));
        setNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Vertical_Clearance_Surface_RNW"));
    }

    public void fillPropertyLevelMitigationCredits(Map<String, String> data, int i) throws Throwable {
        verifyVegetationDebrisClearance(data.get("Wildfire_Mitigation_Credits_Verify_Vegetation_Debris_Clearance_" + i));
        verifyClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Verify_Clearing_Of_Materials_Within5Ft_" + i));
        verifyNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_Verify_NonCombustible_Materials_Improvements_" + i));
        verifyNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_Verify_NoCombustible_Structures_Within30Ft_" + i));
        verifyPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_Verify_PRC_4291_Compliant_" + i));
        verifyClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_Verify_ClassA_Fire_Rated_Roof_" + i));
        verifyEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Verify_Enclosed_Eaves_" + i));
        verifyEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_Verify_EmberFlame_Resistant_Vents_" + i));
        verifyMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Verify_Multi_Pane_Windows_" + i));
        verifyNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Verify_Vertical_Clearance_Surface_" + i));
        setPropertyMitigationCreditsOverride(data.get("Wildfire_Mitigation_Credits_Property_Credits_Override_" + i));
        setVegetationDebrisClearance(data.get("Wildfire_Mitigation_Credits_Vegetation_Debris_Clearance_" + i));
        setClearingOfMaterialsWithin5Ft(data.get("Wildfire_Mitigation_Credits_Clearing_Of_Materials_Within5Ft_" + i));
        setNoncombustibleMaterialsInImprovements(data.get("Wildfire_Mitigation_Credits_NonCombustible_Materials_Improvements_" + i));
        setNocombustibleStructuresWithin30Ft(data.get("Wildfire_Mitigation_Credits_NoCombustible_Structures_Within30Ft_" + i));
        setPRC4291Compliant(data.get("Wildfire_Mitigation_Credits_PRC_4291_Compliant_" + i));
        setClassAFireRatedRoof(data.get("Wildfire_Mitigation_Credits_ClassA_Fire_Rated_Roof_" + i));
        setEnclosedEaves(data.get("Wildfire_Mitigation_Credits_Enclosed_Eaves_" + i));
        setEmberFlameResistantVents(data.get("Wildfire_Mitigation_Credits_EmberFlame_Resistant_Vents_" + i));
        setMultiPaneWindows(data.get("Wildfire_Mitigation_Credits_Multi_Pane_Windows_" + i));
        setNonCombustibleVerticalClearanceOfExteriorSurface(data.get("Wildfire_Mitigation_Credits_Vertical_Clearance_Surface_" + i));
    }

    public void fillCommunityLevelMitigationCredits(Map<String, String> data) throws Throwable {
        verifyFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Verify_Firewise_USA_Site"));
        verifyFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_Verify_FireRisk_Reduction_Community"));
        verifyIBHSCertified(data.get("Wildfire_Mitigation_Credits_Verify_IBHS_Certified"));
        setCommunityMitigationCreditOverride(data.get("Wildfire_Mitigation_Credits_Community_Credits_Override"));
        setFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Firewise_USA_Site"));
        setFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_FireRisk_Reduction_Community"));
        setIBHSCertified(data.get("Wildfire_Mitigation_Credits_IBHS_Certified"), data.get("Wildfire_Mitigation_Credits_IBHS_Effective"));
    }

    private void fillCommunityLevelMitigationCredits_END(Map<String, String> data) throws Throwable {
        verifyFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Verify_Firewise_USA_Site_END"));
        verifyFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_Verify_FireRisk_Reduction_Community_END"));
        verifyIBHSCertified(data.get("Wildfire_Mitigation_Credits_Verify_IBHS_Certified_END"));
        setCommunityMitigationCreditOverride(data.get("Wildfire_Mitigation_Credits_Community_Credits_Override_END"));
        setFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Firewise_USA_Site_END"));
        setFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_FireRisk_Reduction_Community_END"));
        setIBHSCertified(data.get("Wildfire_Mitigation_Credits_IBHS_Certified"), data.get("Wildfire_Mitigation_Credits_IBHS_Effective_END"));
    }

    private void fillCommunityLevelMitigationCredits_OOS_END(Map<String, String> data) throws Throwable {
        verifyFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Verify_Firewise_USA_Site_OOS_END"));
        verifyFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_Verify_FireRisk_Reduction_Community_OOS_END"));
        verifyIBHSCertified(data.get("Wildfire_Mitigation_Credits_Verify_IBHS_Certified_OOS_END"));
        setCommunityMitigationCreditOverride(data.get("Wildfire_Mitigation_Credits_Community_Credits_Override_OOS_END"));
        setFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Firewise_USA_Site_OOS_END"));
        setFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_FireRisk_Reduction_Community_OOS_END"));
        setIBHSCertified(data.get("Wildfire_Mitigation_Credits_IBHS_Certified"), data.get("Wildfire_Mitigation_Credits_IBHS_Effective_OOS_END"));
    }

    private void fillCommunityLevelMitigationCredits_RNW(Map<String, String> data) throws Throwable {
        verifyFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Verify_Firewise_USA_Site_RNW"));
        verifyFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_Verify_FireRisk_Reduction_Community_RNW"));
        verifyIBHSCertified(data.get("Wildfire_Mitigation_Credits_Verify_IBHS_Certified_RNW"));
        setCommunityMitigationCreditOverride(data.get("Wildfire_Mitigation_Credits_Community_Credits_Override_RNW"));
        setFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Firewise_USA_Site_RNW"));
        setFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_FireRisk_Reduction_Community_RNW"));
        setIBHSCertified(data.get("Wildfire_Mitigation_Credits_IBHS_Certified"), data.get("Wildfire_Mitigation_Credits_IBHS_Effective_RNW"));
    }

    public void fillCommunityLevelMitigationCredits(Map<String, String> data, int i) throws Throwable {
        verifyFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Verify_Firewise_USA_Site_" + i));
        verifyFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_Verify_FireRisk_Reduction_Community_" + i));
        verifyIBHSCertified(data.get("Wildfire_Mitigation_Credits_Verify_IBHS_Certified_" + i));
        setCommunityMitigationCreditOverride(data.get("Wildfire_Mitigation_Credits_Community_Credits_Override_" + i));
        setFirewiseUSASite(data.get("Wildfire_Mitigation_Credits_Firewise_USA_Site_" + i));
        setFireRiskReductionCommunity(data.get("Wildfire_Mitigation_Credits_FireRisk_Reduction_Community_" + i));
        setIBHSCertified(data.get("Wildfire_Mitigation_Credits_IBHS_Certified"), data.get("Wildfire_Mitigation_Credits_IBHS_Effective_" + i));
    }

    public void setVegetationDebrisClearance(String value) throws Throwable {
        choose(vegetationDebrisClearanceYes, vegetationDebrisClearanceNo, value, "Vegetation Debris Clearance");
    }

    public void verifyVegetationDebrisClearance(String value) {
        assertRadio(vegetationDebrisClearanceYes, vegetationDebrisClearanceNo, value, "Vegetation Debris Clearance");
    }

    public void setClearingOfMaterialsWithin5Ft(String value) throws Throwable {
        choose(clearingOfMaterialsWithin5FtYes, clearingOfMaterialsWithin5FtNo, value, "Clearing Of Materials Within 5ft");
    }

    public void verifyClearingOfMaterialsWithin5Ft(String value) {
        assertRadio(clearingOfMaterialsWithin5FtYes, clearingOfMaterialsWithin5FtNo, value, "Clearing Of Materials Within 5ft");
    }

    public void setNoncombustibleMaterialsInImprovements(String value) throws Throwable {
        choose(noncombustibleMaterialsInImprovementsYes, noncombustibleMaterialsInImprovementsNo, value, "Non Combustible Materials In Improvements");
    }

    public void verifyNoncombustibleMaterialsInImprovements(String value) {
        assertRadio(noncombustibleMaterialsInImprovementsYes, noncombustibleMaterialsInImprovementsNo, value, "Non Combustible Materials In Improvements");
    }

    public void setNocombustibleStructuresWithin30Ft(String value) throws Throwable {
        choose(nocombustibleStructuresWithin30FtYes, nocombustibleStructuresWithin30FtNo, value, "Nocombustible Structures 30Ft");
    }

    public void verifyNocombustibleStructuresWithin30Ft(String value) {
        assertRadio(nocombustibleStructuresWithin30FtYes, nocombustibleStructuresWithin30FtNo, value, "Nocombustible Structures 30Ft");
    }

    public void setPRC4291Compliant(String value) throws Throwable {
        choose(prc4291CompliantYes, prc4291CompliantNo, value, "PRC 4291 Compliant");
    }

    public void verifyPRC4291Compliant(String value) {
        assertRadio(prc4291CompliantYes, prc4291CompliantNo, value, "PRC 4291 Compliant");
    }

    public void setClassAFireRatedRoof(String value) throws Throwable {
        choose(classAFireRatedRoofYes, classAFireRatedRoofNo, value, "Class A-Fire Rated Roof");
    }

    public void verifyClassAFireRatedRoof(String value) {
        assertRadio(classAFireRatedRoofYes, classAFireRatedRoofNo, value, "Class A-Fire Rated Roof");
    }

    public void setEnclosedEaves(String value) throws Throwable {
        choose(enclosedEavesYes, enclosedEavesNo, value, "Enclosed Eaves");
    }

    public void verifyEnclosedEaves(String value) {
        assertRadio(enclosedEavesYes, enclosedEavesNo, value, "Enclosed Eaves");
    }

    public void setEmberFlameResistantVents(String value) throws Throwable {
        choose(emberFlameResistantVentsYes, emberFlameResistantVentsNo, value, "Ember/Flame Resistant Vents");
    }

    public void verifyEmberFlameResistantVents(String value) {
        assertRadio(emberFlameResistantVentsYes, emberFlameResistantVentsNo, value, "Ember/Flame Resistant Vents");
    }

    public void setMultiPaneWindows(String value) throws Throwable {
        choose(multiPaneWindowsYes, multiPaneWindowsNo, value, "Multi-Pane Windows");
    }

    public void verifyMultiPaneWindows(String value) {
        assertRadio(multiPaneWindowsYes, multiPaneWindowsNo, value, "Multi-Pane Windows");
    }

    public void setNonCombustibleVerticalClearanceOfExteriorSurface(String value) throws Throwable {
        choose(nonCombustibleVerticalClearanceOfExteriorSurfaceYes, nonCombustibleVerticalClearanceOfExteriorSurfaceNo, value, "Noncombustible Vertical Clearance 6 of Exterior Surface");
    }

    public void verifyNonCombustibleVerticalClearanceOfExteriorSurface(String value) {
        assertRadio(nonCombustibleVerticalClearanceOfExteriorSurfaceYes, nonCombustibleVerticalClearanceOfExteriorSurfaceNo, value, "Noncombustible Vertical Clearance 6 of Exterior Surface");
    }

    public void setPropertyMitigationCreditsOverride(String value) throws Throwable {
        choose(propertyMitigationCreditsOverrideYes, propertyMitigationCreditsOverrideNo, value, "Property Mitigation Credits Override");
        pause(3000);
    }

    public void verifyPropertyMitigationCreditsOverride(String value) {
        assertRadio(propertyMitigationCreditsOverrideYes, propertyMitigationCreditsOverrideNo, value, "Property Mitigation Credits Override");
    }

    public void setFirewiseUSASite(String value) throws Throwable {
        choose(firewiseUSASiteYes, firewiseUSASiteNo, value, "Fire wise USA Site");
    }

    public void verifyFirewiseUSASite(String value) {
        assertRadio(firewiseUSASiteYes, firewiseUSASiteNo, value, "Fire wise USA Site");
    }

    public void setFireRiskReductionCommunity(String value) throws Throwable {
        choose(fireRiskReductionCommunityYes, fireRiskReductionCommunityNo, value, "Fire Risk Reduction Community");
    }

    public void verifyFireRiskReductionCommunity(String value) {
        assertRadio(fireRiskReductionCommunityYes, fireRiskReductionCommunityNo, value, "Fire Risk Reduction Community");
    }

    public void setCommunityMitigationCreditOverride(String value) throws Throwable {
        choose(communityMitigationCreditOverrideYes, communityMitigationCreditOverrideNo, value, "Community Mitigation Credit Override");
        pause(3000);
    }

    public void setIBHSCertified(String value) throws Throwable {
        choose(ibhsCertifiedYes, ibhsCertifiedNo, value, "IBHS Certified");
        pause(2000);
    }

    public void verifyIBHSCertified(String value) {
        assertRadio(ibhsCertifiedYes, ibhsCertifiedNo, value, "IBHS Certified");
    }

    public void setIBHSCertificationDate(String value) {
        typeTextEnter(ibhsCertificationEffective, value, "IBHS Certificaiton Effective");
    }

    public void setIBHSCertified(String certified, String date) throws Throwable {
        setIBHSCertified(certified);
        if (!certified.equalsIgnoreCase("No"))
            setIBHSCertificationDate(date);
    }



}