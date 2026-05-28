package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class EarthquakeBroadBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public EarthquakeBroadBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[text()='Dwelling']/../../../..//input)[1]")
    WebElement homeownersCoverageLimitsDwelling;
    @FindBy(xpath = "(//div[text()='Other Structures']/../../../..//input)[1]")
    WebElement homeownersOtherStructures;
    @FindBy(xpath = "(//div[text()='Contents']/../../../..//input)[1]")
    WebElement homeownersContent;
    @FindBy(xpath = "(//div[text()='Loss of Use']/../../../..//input)[1]")
    WebElement homeownersLossOfUse;
    @FindBy(xpath = "(//div[text()='Dwelling']/../../../..//input)[2]")
    WebElement earthquakeCoverageLimitsDwelling;
    @FindBy(xpath = "(//div[text()='Other Structures']/../../../..//input)[2]")
    WebElement earthquakeOtherStructures;
    @FindBy(xpath = "(//div[text()='Contents']/../../../..//input)[2]")
    WebElement earthquakeContent;
    @FindBy(xpath = "(//div[text()='Loss of Use']/../../../..//input)[2]")
    WebElement earthquakeLossOfUse;
    @FindBy(xpath = "//div[text()='Loss of Use']/../../../..//input")
    WebElement earthquakeLossOfUseCondo;
    @FindBy(xpath = "//div[text()='EQ Deductible Amount']/../../../..//input")
    WebElement eqDeductibleAmount;
    @FindBy(xpath = "//div[text()='Loss Assessment Coverage']/../../../..//input")
    WebElement lossAssessmentCoverage;
    @FindBy(xpath = "//label[text()='Loss Assessment Override']/../../../..//input")
    WebElement lossAssessmentOverride;
    @FindBy(xpath = "//div[text()='Loss Assessment Coverage Override']/../../../..//input")
    List<WebElement> lossAssessmentCoverageOverrideList;
    @FindBy(xpath = "//div[text()='Loss Assessment Deductible Coverage ']/../../../..//input")
    List<WebElement> lossAssessmentDeductibleCoverageList;
    @FindBy(xpath = "//div[text()='Loss Assessment Coverage Override']/../../../..//input")
    WebElement lossAssessmentCoverageOverride;
    @FindBy(xpath = "//div[text()='Loss Assessment Deductible Coverage ']/../../../..//input")
    WebElement lossAssessmentDeductibleCoverage;
    @FindBy(xpath = "(//div[text()='Do you wish to purchase Agreed Value Earthquake Coverage?']/../../../..//input)[2]")
    WebElement doYouWishToPurchaseAgreedValueEarthquakeCoverageYes;
    @FindBy(xpath = "(//div[text()='Do you wish to purchase Agreed Value Earthquake Coverage?']/../../../..//input)[1]")
    WebElement doYouWishToPurchaseAgreedValueEarthquakeCoverageNo;
    @FindBy(xpath = "(//div[text()='Extend Ensuing Fungi Increase for Earthquake Peril']/../../../..//input)[2]")
    WebElement extendEnsuingFungiIncreaseForEarthquakePerilYes;
    @FindBy(xpath = "(//div[text()='Extend Ensuing Fungi Increase for Earthquake Peril']/../../../..//input)[1]")
    WebElement extendEnsuingFungiIncreaseForEarthquakePerilNo;
    @FindBy(xpath = "//label[text()='5% of dwelling replacement cost']/../../../..//input")
    WebElement percentOfDwellingReplacementCost;
    @FindBy(xpath = "//div[text()='Earthquake Deductible ']/../../../..//input")
    WebElement earthquakeDeductible;
    @FindBy(xpath = "//div[text()='Brick-Veneer Surface Area']/../../../..//input")
    WebElement brickVeneerSurfaceArea;
    @FindBy(xpath = "//div[text()='Earthquake Coverage Options']")
    WebElement earthquakeCoverageOptionsBlock;

    public void fillEarthquakeBroadDetailCC(Map<String, String> data) throws Throwable {
        verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling"));
        verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures"));
        verifyHomeownersContent(data.get("Broad_Homeowners_Content"));
        verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use"));
        setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage"));
        setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage"), data.get("Broad_Earthquake_Other_Structures"));
        setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures"));
        setEarthquakeContent(data.get("Broad_Earthquake_Content"));
        setEarthquakeLossOfUse(data.get("Broad_Earthquake_Loss_Of_Use"));
        verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount"));
        setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage"));
        setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override"));
        setLossAssessmentCoverageOverride(data.get("Broad_Loss_Assessment_Override"), data.get("Broad_Loss_Assessment_Coverage_Override"));
        setLossAssessmentDeductibleCoverage(data.get("Broad_Loss_Assessment_Deductible_Coverage"));
        setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril"));
        set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost"));
        setEarthquakeDeductible(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost"), data.get("Broad_Earthquake_Deductible"));
    }

    public void fillEarthquakeBroadDetailCC_END(Map<String, String> data) throws Throwable {
        verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_END"));
        verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_END"));
        verifyHomeownersContent(data.get("Broad_Homeowners_Content_END"));
        verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_END"));
        setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_END"));
        setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_END"), data.get("Broad_Earthquake_Other_Structures_END"));
        setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_END"));
        setEarthquakeContent(data.get("Broad_Earthquake_Content_END"));
        setEarthquakeLossOfUse(data.get("Broad_Earthquake_Loss_Of_Use_END"));
        verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_END"));
        setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_END"));
        setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_END"));
        setLossAssessmentCoverageOverride(data.get("Broad_Loss_Assessment_Override_END"), data.get("Broad_Loss_Assessment_Coverage_Override_END"));
        setLossAssessmentDeductibleCoverage(data.get("Broad_Loss_Assessment_Deductible_Coverage_END"));
        setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_END"));
        set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_END"));
        setEarthquakeDeductible(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_END"), data.get("Broad_Earthquake_Deductible_END"));
    }

    public void verifyHomeownersCoverageLimitsDwelling(String value) {
        assertCellValue(homeownersCoverageLimitsDwelling, value, "Homeowners Coverage Limits Dwelling");
    }

    public void verifyHomeownersOtherStructures(String value) {
        assertCellValue(homeownersOtherStructures, value, "Homeowners Other Structures");
    }

    public void verifyHomeownersContent(String value) {
        assertCellValue(homeownersContent, value, "Homeowners Content");
    }

    public void verifyHomeownersLossOfUse(String value) {
        assertCellValue(homeownersLossOfUse, value, "Homeowners Loss Of Use");
    }

    public void setEarthquakeOtherStructures(String value) {
        typeText(earthquakeOtherStructures, value, "Earthquake Other Structures");
    }

    public void setEarthquakeContent(String value) {
        typeText(earthquakeContent, value, "Earthquake Content");
    }

    public void setEarthquakeLossOfUse(String value) {
            typeText(earthquakeLossOfUse, value, "Earthquake Loss Of Use");
    }

    public void setEarthquakeLossOfUseHS(String value, String residenceType) {
        if(residenceType.equalsIgnoreCase("Homeowners")){
            typeText(earthquakeLossOfUse, value, "Earthquake Loss Of Use");
        }else{
            typeText(earthquakeLossOfUseCondo, value, "Earthquake Loss Of Use");
        }
    }

    public void verifyEQDeductibleAmount(String value) {
        assertCellValue(eqDeductibleAmount, value, "EQ Deductible Amount");
    }

    public void setLossAssessmentCoverage(String value) {
        typeTextEnter(lossAssessmentCoverage, value, "Loss Assessment Coverage");
    }

    public void setLossAssessmentOverride(String value) throws Throwable {
        checkCheckbox(lossAssessmentOverride, value, "Loss Assessment Override");
    }

    public void setLossAssessmentCoverageOverride(String condition, String value) {
        if (condition.equalsIgnoreCase("Yes")) {
            typeTextEnter(lossAssessmentCoverageOverride, value, "Loss Assessment Coverage Override");
        } else {
            assertCellValue(lossAssessmentCoverageOverride, value, "Loss Assessment Coverage Override");
        }
    }

    public void setLossAssessmentDeductibleCoverage(String value) {
        typeTextEnter(lossAssessmentDeductibleCoverage, value, "Loss Assessment Deductible Coverage");
    }
    public void setLossAssessmentCoverageOverrideHS(String condition, String value, int i) throws Throwable {
        if (condition.equalsIgnoreCase("Yes")) {
            pause(500);
            typeTextEnter(lossAssessmentCoverageOverrideList.get(i), value, "Loss Assessment Coverage Override");
        } else {
            assertCellValue(lossAssessmentCoverageOverrideList.get(i), value, "Loss Assessment Coverage Override");
        }
    }

    public void setLossAssessmentDeductibleCoverageHS(String lossAssessDedCov, int i) throws Throwable {
        pause(500);
        typeTextEnter(lossAssessmentDeductibleCoverageList.get(i), lossAssessDedCov, "Loss Assessment Coverage Deductible");
        saveChanges();
    }

    public void setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(String value) throws Throwable {
        choose(doYouWishToPurchaseAgreedValueEarthquakeCoverageYes, doYouWishToPurchaseAgreedValueEarthquakeCoverageNo, value, "Do You Wish To Purchase Agreed Value Earthquake Coverage");
    }

    public void setEarthquakeDwelling(String condition, String value) {
        if (condition.equalsIgnoreCase("Yes")) {
            typeTextEnter(earthquakeCoverageLimitsDwelling, value, "Earthquake Dwelling");
        } else {
            assertCellValue(earthquakeCoverageLimitsDwelling, value, "Earthquake Dwelling");
        }
    }

    public void setExtendEnsuingFungiIncreaseForEarthquakePeril(String value) throws Throwable {
        choose(extendEnsuingFungiIncreaseForEarthquakePerilYes, extendEnsuingFungiIncreaseForEarthquakePerilNo, value, "Extend Ensuing Fungi Increase For Earthquake Peril");
    }

    public void set5PercentOfDwellingReplacementCost(String value) throws Throwable {
        checkCheckbox(percentOfDwellingReplacementCost, value, "5 Percent Of Dwelling Replacement Cost");
    }

    public void setEarthquakeDeductible(String condition, String value) {
        if (condition.equalsIgnoreCase("Yes")) {
            assertCellValue(earthquakeDeductible, value, "Earthquake Deductible");
        } else {
            typeTextEnter(earthquakeDeductible, value, "Earthquake Deductible");
        }
    }

    public void setEarthquakeDeductibleHO(Map<String, String> data) {
        if (data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost").equalsIgnoreCase("Yes") || data.get("Broad_10_Percent_Of_Dwelling_Replacement_Cost").equalsIgnoreCase("Yes")) {
            assertCellValue(earthquakeDeductible, data.get("Broad_Earthquake_Deductible"), "Earthquake Deductible");
        } else {
            typeTextEnter(earthquakeDeductible, data.get("Broad_Earthquake_Deductible"), "Earthquake Deductible");
        }
    }

    public void setBrickVeneerSurfaceArea(String value) throws Throwable {
        clickElement(earthquakeCoverageOptionsBlock);
        pause(1500);
        typeTextEnter(brickVeneerSurfaceArea, value, "Brick-Veneer Surface Area");
        saveChanges();
    }

    private void setEarthquakeDeductibleHO_END(Map<String, String> data) {
        if (data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_END").equalsIgnoreCase("Yes") || data.get("Broad_10_Percent_Of_Dwelling_Replacement_Cost_END").equalsIgnoreCase("Yes")) {
            assertCellValue(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_END"), "Earthquake Deductible");
        } else {
            typeTextEnter(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_END"), "Earthquake Deductible");
        }
    }

    private void setEarthquakeDeductibleHO_OOS_END(Map<String, String> data) {
        if (data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_OOS_END").equalsIgnoreCase("Yes") || data.get("Broad_10_Percent_Of_Dwelling_Replacement_Cost_OOS_END").equalsIgnoreCase("Yes")) {
            assertCellValue(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_OOS_END"), "Earthquake Deductible");
        } else {
            typeTextEnter(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_OOS_END"), "Earthquake Deductible");
        }
    }

    private void setEarthquakeDeductibleHO_RNW(Map<String, String> data) {
        if (data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_RNW").equalsIgnoreCase("Yes") || data.get("Broad_10_Percent_Of_Dwelling_Replacement_Cost_RNW").equalsIgnoreCase("Yes")) {
            assertCellValue(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_RNW"), "Earthquake Deductible");
        } else {
            typeTextEnter(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_RNW"), "Earthquake Deductible");
        }
    }

    public void setEarthquakeDeductibleHO(Map<String, String> data, int i) {
        if (data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_" + i).equalsIgnoreCase("Yes") || data.get("Broad_10_Percent_Of_Dwelling_Replacement_Cost_" + i).equalsIgnoreCase("Yes")) {
            assertCellValue(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_" + i), "Earthquake Deductible");
        } else {
            typeTextEnter(earthquakeDeductible, data.get("Broad_Earthquake_Deductible_" + i), "Earthquake Deductible");
        }
    }

    public void fillEarthquakeBroadDetailHS(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option").equalsIgnoreCase("Broad")) {
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage"), data.get("Broad_Earthquake_Other_Structures"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content"));
            setEarthquakeLossOfUseHS(data.get("Broad_Earthquake_Loss_Of_Use"), data.get("Risk_Addresses_Residence_Type"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override"));
            setLossAssessmentCoverageOverrideHS(data.get("Broad_Loss_Assessment_Override"), data.get("Broad_Loss_Assessment_Coverage_Override"),0);
            setLossAssessmentDeductibleCoverageHS(data.get("Broad_Loss_Assessment_Deductible_Coverage"), 0);
            if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Broad_Brick_Veneer_Surface_Area"));
            }
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost"));
            setEarthquakeDeductible(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost"), data.get("Broad_Earthquake_Deductible"));
            saveChanges();
        }
    }

    public void fillEarthquakeBroadDetailHS_END(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END").equalsIgnoreCase("Broad")) {
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_END"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_END"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content_END"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_END"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_END"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_END"), data.get("Broad_Earthquake_Other_Structures_END"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_END"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content_END"));
            setEarthquakeLossOfUseHS(data.get("Broad_Earthquake_Loss_Of_Use_END"), data.get("Risk_Addresses_Residence_Type"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_END"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_END"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_END"));
            setLossAssessmentCoverageOverrideHS(data.get("Broad_Loss_Assessment_Override_END"), data.get("Broad_Loss_Assessment_Coverage_Override_END"),0);
            setLossAssessmentDeductibleCoverageHS(data.get("Broad_Loss_Assessment_Deductible_Coverage_END"), 0);
            if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Broad_Brick_Veneer_Surface_Area_END"));
            }
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_END"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_END"));
            setEarthquakeDeductible(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_END"), data.get("Broad_Earthquake_Deductible_END"));
            saveChanges();
        }
    }

    public void fillEarthquakeBroadDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END").equalsIgnoreCase("Broad")) {
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_OOS_END"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_OOS_END"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content_OOS_END"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_OOS_END"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_OOS_END"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_OOS_END"), data.get("Broad_Earthquake_Other_Structures_OOS_END"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_OOS_END"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content_OOS_END"));
            setEarthquakeLossOfUseHS(data.get("Broad_Earthquake_Loss_Of_Use_OOS_END"), data.get("Risk_Addresses_Residence_Type"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_OOS_END"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_OOS_END"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_OOS_END"));
            setLossAssessmentCoverageOverrideHS(data.get("Broad_Loss_Assessment_Override_OOS_END"), data.get("Broad_Loss_Assessment_Coverage_Override_OOS_END"),0);
            setLossAssessmentDeductibleCoverageHS(data.get("Broad_Loss_Assessment_Deductible_Coverage_OOS_END"), 0);
            if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Broad_Brick_Veneer_Surface_Area_OOS_END"));
            }
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_OOS_END"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_OOS_END"));
            setEarthquakeDeductible(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_OOS_END"), data.get("Broad_Earthquake_Deductible_OOS_END"));
            saveChanges();
        }
    }

    public void fillEarthquakeBroadDetailHS_RNW(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_RNW").equalsIgnoreCase("Broad")) {
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_RNW"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_RNW"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content_RNW"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_RNW"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_RNW"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_RNW"), data.get("Broad_Earthquake_Other_Structures_RNW"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_RNW"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content_RNW"));
            setEarthquakeLossOfUseHS(data.get("Broad_Earthquake_Loss_Of_Use_RNW"), data.get("Risk_Addresses_Residence_Type"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_RNW"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_RNW"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_RNW"));
            setLossAssessmentCoverageOverrideHS(data.get("Broad_Loss_Assessment_Override_OOS_END"), data.get("Broad_Loss_Assessment_Coverage_Override_RNW"),0);
            setLossAssessmentDeductibleCoverageHS(data.get("Broad_Loss_Assessment_Deductible_Coverage_RNW"), 0);
            if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Broad_Brick_Veneer_Surface_Area_RNW"));
            }
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_RNW"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_RNW"));
            setEarthquakeDeductible(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_OOS_END"), data.get("Broad_Earthquake_Deductible_RNW"));
            saveChanges();
        }
    }

    public void fillEarthquakeBroadDetailHO(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            verifyBlockExists("Broad");
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage"), data.get("Broad_Earthquake_Dwelling"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content"));
            setEarthquakeLossOfUse(data.get("Broad_Earthquake_Loss_Of_Use"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override"));
            setLossAssessmentCoverageOverrideHS(data.get("Broad_Loss_Assessment_Override"), data.get("Broad_Loss_Assessment_Coverage_Override"),0);
            setLossAssessmentDeductibleCoverageHS(data.get("Broad_Loss_Assessment_Deductible_Coverage"),0);
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost"));
            setEarthquakeDeductibleHO(data);
            saveChanges();
        }
    }

    public void fillEarthquakeBroadDetailHO_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            verifyBlockExists("Broad");
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_END"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_END"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content_END"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_END"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_END"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_END"), data.get("Broad_Earthquake_Dwelling_END"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_END"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content_END"));
            setEarthquakeLossOfUse(data.get("Broad_Earthquake_Loss_Of_Use_END"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_END"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_END"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_END"));
            setLossAssessmentCoverageOverride(data.get("Broad_Loss_Assessment_Override_END"), data.get("Broad_Loss_Assessment_Coverage_Override_END"));
            setLossAssessmentDeductibleCoverage(data.get("Broad_Loss_Assessment_Deductible_Coverage_END"));
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_END"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_END"));
            setEarthquakeDeductibleHO_END(data);
            saveChanges();
        }
    }

    public void fillEarthquakeBroadDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            verifyBlockExists("Broad");
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_OOS_END"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_OOS_END"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content_OOS_END"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_OOS_END"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_OOS_END"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_OOS_END"), data.get("Broad_Earthquake_Dwelling_OOS_END"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_OOS_END"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content_OOS_END"));
            setEarthquakeLossOfUse(data.get("Broad_Earthquake_Loss_Of_Use_OOS_END"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_OOS_END"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_OOS_END"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_OOS_END"));
            setLossAssessmentCoverageOverride(data.get("Broad_Loss_Assessment_Override_OOS_END"), data.get("Broad_Loss_Assessment_Coverage_Override_OOS_END"));
            setLossAssessmentDeductibleCoverage(data.get("Broad_Loss_Assessment_Deductible_Coverage_OOS_END"));
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_OOS_END"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_OOS_END"));
            setEarthquakeDeductibleHO_OOS_END(data);
            saveChanges();
        }
    }

    public void fillEarthquakeBroadDetailHO_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_RNW");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            verifyBlockExists("Broad");
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_RNW"));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_RNW"));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content_RNW"));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_RNW"));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_RNW"));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_RNW"), data.get("Broad_Earthquake_Dwelling_RNW"));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_RNW"));
            setEarthquakeContent(data.get("Broad_Earthquake_Content_RNW"));
            setEarthquakeLossOfUse(data.get("Broad_Earthquake_Loss_Of_Use_RNW"));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_RNW"));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_RNW"));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_RNW"));
            setLossAssessmentCoverageOverride(data.get("Broad_Loss_Assessment_Override_RNW"), data.get("Broad_Loss_Assessment_Coverage_Override_RNW"));
            setLossAssessmentDeductibleCoverage(data.get("Broad_Loss_Assessment_Deductible_Coverage_RNW"));
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_RNW"));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_RNW"));
            setEarthquakeDeductibleHO_RNW(data);
            saveChanges();
        }
    }



    public void fillEarthquakeBroadDetailHO(Map<String, String> data, int i) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_" + i);
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            verifyBlockExists("Broad");
            verifyHomeownersCoverageLimitsDwelling(data.get("Broad_Homeowners_Coverage_Limits_Dwelling_" + i));
            verifyHomeownersOtherStructures(data.get("Broad_Homeowners_Other_Structures_" + i));
            verifyHomeownersContent(data.get("Broad_Homeowners_Content_" + i));
            verifyHomeownersLossOfUse(data.get("Broad_Homeowners_Loss_Of_Use_" + i));
            setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_" + i));
            setEarthquakeDwelling(data.get("Broad_Do_You_Wish_To_Purchase_Agreed_Value_Earthquake_Coverage_" + i), data.get("Broad_Earthquake_Dwelling_" + i));
            setEarthquakeOtherStructures(data.get("Broad_Earthquake_Other_Structures_" + i));
            setEarthquakeContent(data.get("Broad_Earthquake_Content_" + i));
            setEarthquakeLossOfUse(data.get("Broad_Earthquake_Loss_Of_Use_" + i));
            verifyEQDeductibleAmount(data.get("Broad_EQ_Deductible_Amount_" + i));
            setLossAssessmentCoverage(data.get("Broad_Loss_Assessment_Coverage_" + i));
            setLossAssessmentOverride(data.get("Broad_Loss_Assessment_Override_" + i));
            setLossAssessmentCoverageOverride(data.get("Broad_Loss_Assessment_Override_" + i), data.get("Broad_Loss_Assessment_Coverage_Override_" + i));
            setLossAssessmentDeductibleCoverage(data.get("Broad_Loss_Assessment_Deductible_Coverage_" + i));
            setExtendEnsuingFungiIncreaseForEarthquakePeril(data.get("Broad_Extend_Ensuing_Fungi_Increase_For_Earthquake_Peril_" + i));
            set5PercentOfDwellingReplacementCost(data.get("Broad_5_Percent_Of_Dwelling_Replacement_Cost_" + i));
            setEarthquakeDeductibleHO(data, i);
            saveChanges();
        }
    }

}