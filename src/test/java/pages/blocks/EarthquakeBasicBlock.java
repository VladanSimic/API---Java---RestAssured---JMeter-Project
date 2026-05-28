package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class EarthquakeBasicBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public EarthquakeBasicBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Dwelling']/../../../..//input")
    WebElement dwelling;
    @FindBy(xpath = "//div[text()='Other Structures']/../../../..//input")
    WebElement otherStructures;
    @FindBy(xpath = "//div[text()='Contents Limit']/../../../..//input")
    WebElement contentsLimit;
    @FindBy(xpath = "//div[text()='Loss of Use']/../../../..//input")
    WebElement lossOfUse;
    @FindBy(xpath = "//div[text()='EQ Deductible Amount']/../../../..//input")
    WebElement eqDeductibleAmount;
    @FindBy(xpath = "//div[text()='Loss Assessment Coverage']/../../../..//input")
    WebElement lossAssessmentCoverage;
    @FindBy(xpath = "//label[text()='Loss Assessment Override']/..//input")
    WebElement lossAssessmentOverride;
    @FindBy(xpath = "//div[text()='Loss Assessment Coverage Override']/../../../..//input")
    WebElement lossAssessmentCoverageOverride;
    @FindBy(xpath = "//div[text()='Loss Assessment Deductible']/../../../..//input")
    WebElement lossAssessmentDeductible;
    @FindBy(xpath = "//div[text()='Earthquake Deductible']/../../../..//input")
    WebElement earthquakeDeductible;
    @FindBy(xpath = "//div[text()='Brick-Veneer Surface Area']/../../../..//input")
    WebElement brickVeneerSurfaceArea;
    @FindBy(xpath = "//div[text()='Brick-Veneer Surface Area']")
    WebElement brickVeneerSurfaceAreaLabel;

    public void fillEarthquakeBasicDetailCC(Map<String, String> data) throws Throwable {
        verifyDwelling(data.get("Basic_Dwelling"));
        verifyOtherStructures(data.get("Basic_Other_Structures"));
        setContentsLimit(data.get("Basic_Contents_Limit"));
        setLossOfUse(data.get("Basic_Loss_of_Use"));
        verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount"));
        verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage"));
        setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override"));
        setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override"), data.get("Basic_Loss_Assessment_Coverage_Override"));
        setLossAssessmentDeductible(data.get("Basic_Loss_Assessment_Deductible"));
        verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible"));
    }

    public void fillEarthquakeBasicDetailCC_END(Map<String, String> data) throws Throwable {
        verifyDwelling(data.get("Basic_Dwelling_END"));
        verifyOtherStructures(data.get("Basic_Other_Structures_END"));
        setContentsLimit(data.get("Basic_Contents_Limit_END"));
        setLossOfUse(data.get("Basic_Loss_of_Use_END"));
        verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_END"));
        verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_END"));
        setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_END"));
        setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_END"), data.get("Basic_Loss_Assessment_Coverage_Override_END"));
        setLossAssessmentDeductible(data.get("Basic_Loss_Assessment_Deductible_END"));
        verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_END"));
    }

    public void verifyDwelling(String value) {
        assertCellValue(dwelling, value, "Dwelling");
    }

    public void verifyOtherStructures(String value) {
        assertCellValue(otherStructures, value, "Other Structures");
    }

    public void setContentsLimit(String value) {
        typeTextEnter(contentsLimit, value, "Contents Limit");
    }

    public void setLossOfUse(String value) {
        typeTextEnter(lossOfUse, value, "Loss Of Use");
    }

    public void verifyEQDeductibleAmount(String value) {
        assertCellValue(eqDeductibleAmount, value, "EQ Deductible Amount");
    }

    public void verifyLossAssessmentCoverage(String value) {
        assertCellValue(lossAssessmentCoverage, value, "Loss Assessment Coverage");
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

    public void setLossAssessmentDeductible(String value) {
        typeTextEnter(lossAssessmentDeductible, value, "Loss Assessment Deductible");
    }

    public void setLossAssessmentDeductibleHS(String value) throws Throwable {
        if (hasValue(value)) {
        pause(500);
        clickElement(lossAssessmentDeductible);
        pause(500);
        setAttributeValue(lossAssessmentDeductible, "value", value);
        }
    }

    public void verifyEarthquakeDeductible(String value) {
        assertCellValue(earthquakeDeductible, value, "Earthquake Deductible");
    }

    public void setBrickVeneerSurfaceArea(String value) throws Throwable {
        clickElement(brickVeneerSurfaceAreaLabel);
        pause(1500);
        typeTextEnter(brickVeneerSurfaceArea, value, "Brick-Veneer Surface Area");
    }

    public void fillEarthquakeBasicDetailHS(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option").equalsIgnoreCase("Basic")){
            verifyDwelling(data.get("Basic_Dwelling"));
            verifyOtherStructures(data.get("Basic_Other_Structures"));
            setContentsLimit(data.get("Basic_Contents_Limit"));
            setLossOfUse(data.get("Basic_Loss_of_Use"));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount"));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage"));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override"));
            pause(1000);
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override"), data.get("Basic_Loss_Assessment_Coverage_Override"));
            setLossAssessmentDeductibleHS(data.get("Basic_Loss_Assessment_Deductible"));
            if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Basic_Brick_Veneer_Surface_Area"));
            }
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible"));
            saveChanges();
        }
    }

    public void fillEarthquakeBasicDetailHS_END(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END").equalsIgnoreCase("Basic")){
        verifyDwelling(data.get("Basic_Dwelling_END"));
        verifyOtherStructures(data.get("Basic_Other_Structures_END"));
        setContentsLimit(data.get("Basic_Contents_Limit_END"));
        setLossOfUse(data.get("Basic_Loss_of_Use_END"));
        verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_END"));
        verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_END"));
        setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_END"));
        setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_END"), data.get("Basic_Loss_Assessment_Coverage_Override_END"));
        setLossAssessmentDeductibleHS(data.get("Basic_Loss_Assessment_Deductible_END"));
        if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Basic_Brick_Veneer_Surface_Area_END"));
        }
        verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_END"));
        saveChanges();
        }
    }

    public void fillEarthquakeBasicDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END").equalsIgnoreCase("Basic")) {
            verifyDwelling(data.get("Basic_Dwelling_OOS_END"));
            verifyOtherStructures(data.get("Basic_Other_Structures_OOS_END"));
            setContentsLimit(data.get("Basic_Contents_Limit_OOS_END"));
            setLossOfUse(data.get("Basic_Loss_of_Use_OOS_END"));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_OOS_END"));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_OOS_END"));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_OOS_END"));
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_OOS_END"), data.get("Basic_Loss_Assessment_Coverage_Override_OOS_END"));
            setLossAssessmentDeductibleHS(data.get("Basic_Loss_Assessment_Deductible_OOS_END"));
            if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Basic_Brick_Veneer_Surface_Area_OOS_END"));
            }
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_OOS_END"));
            saveChanges();
        }
    }

    public void fillEarthquakeBasicDetailHS_RNW(Map<String, String> data) throws Throwable {
        if(data.get("Earthquake_Coverage_Options_Earth_Coverage_Option").equalsIgnoreCase("Basic")) {
            verifyDwelling(data.get("Basic_Dwelling_RNW"));
            verifyOtherStructures(data.get("Basic_Other_Structures_RNW"));
            setContentsLimit(data.get("Basic_Contents_Limit_RNW"));
            setLossOfUse(data.get("Basic_Loss_of_Use_RNW"));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_RNW"));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_RNW"));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_RNW"));
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_RNW"), data.get("Basic_Loss_Assessment_Coverage_Override_RNW"));
            setLossAssessmentDeductibleHS(data.get("Basic_Loss_Assessment_Deductible_RNW"));
            if (data.get("Construction_Details_Construction_Type").equalsIgnoreCase("Brick - Veneer")) {
                setBrickVeneerSurfaceArea(data.get("Basic_Brick_Veneer_Surface_Area_RNW"));
            }
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_RNW"));
            saveChanges();
        }
    }

    public void fillEarthquakeBasicDetailHO(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option");
        if (hasValue(condition) && condition.equalsIgnoreCase("Basic")) {
            verifyBlockExists("Basic");
            verifyDwelling(data.get("Basic_Dwelling"));
            verifyOtherStructures(data.get("Basic_Other_Structures"));
            setContentsLimit(data.get("Basic_Contents_Limit"));
            setLossOfUse(data.get("Basic_Loss_of_Use"));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount"));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage"));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override"));
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override"), data.get("Basic_Loss_Assessment_Coverage_Override"));
            setLossAssessmentDeductible(data.get("Basic_Loss_Assessment_Deductible"));
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible"));
            saveChanges();
        }
    }

    public void fillEarthquakeBasicDetailHO_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END");
        if (hasValue(condition) && condition.equalsIgnoreCase("Basic")) {
            verifyBlockExists("Basic");
            verifyDwelling(data.get("Basic_Dwelling_END"));
            verifyOtherStructures(data.get("Basic_Other_Structures_END"));
            setContentsLimit(data.get("Basic_Contents_Limit_END"));
            setLossOfUse(data.get("Basic_Loss_of_Use_END"));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_END"));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_END"));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_END"));
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_END"), data.get("Basic_Loss_Assessment_Coverage_Override_END"));
            setLossAssessmentDeductible(data.get("Basic_Loss_Assessment_Deductible_END"));
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_END"));
            saveChanges();
        }
    }


    public void fillEarthquakeBasicDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END");
        if (hasValue(condition) && condition.equalsIgnoreCase("Basic")) {
            verifyBlockExists("Basic");
            verifyDwelling(data.get("Basic_Dwelling_OOS_END"));
            verifyOtherStructures(data.get("Basic_Other_Structures_OOS_END"));
            setContentsLimit(data.get("Basic_Contents_Limit_OOS_END"));
            setLossOfUse(data.get("Basic_Loss_of_Use_OOS_END"));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_OOS_END"));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_OOS_END"));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_OOS_END"));
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_OOS_END"), data.get("Basic_Loss_Assessment_Coverage_Override_OOS_END"));
            setLossAssessmentDeductible(data.get("Basic_Loss_Assessment_Deductible_OOS_END"));
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_OOS_END"));
            saveChanges();
        }
    }

    public void fillEarthquakeBasicDetailHO_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_RNW");
        if (hasValue(condition) && condition.equalsIgnoreCase("Basic")) {
            verifyBlockExists("Basic");
            verifyDwelling(data.get("Basic_Dwelling_RNW"));
            verifyOtherStructures(data.get("Basic_Other_Structures_RNW"));
            setContentsLimit(data.get("Basic_Contents_Limit_RNW"));
            setLossOfUse(data.get("Basic_Loss_of_Use_RNW"));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_RNW"));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_RNW"));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_RNW"));
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_RNW"), data.get("Basic_Loss_Assessment_Coverage_Override_RNW"));
            setLossAssessmentDeductible(data.get("Basic_Loss_Assessment_Deductible_RNW"));
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_RNW"));
            saveChanges();
        }
    }

    public void fillEarthquakeBasicDetailHO(Map<String, String> data, int i) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_" + i);
        if (hasValue(condition) && condition.equalsIgnoreCase("Basic")) {
            verifyBlockExists("Basic");
            verifyDwelling(data.get("Basic_Dwelling_" + i));
            verifyOtherStructures(data.get("Basic_Other_Structures_" + i));
            setContentsLimit(data.get("Basic_Contents_Limit_" + i));
            setLossOfUse(data.get("Basic_Loss_of_Use_" + i));
            verifyEQDeductibleAmount(data.get("Basic_EQ_Deductible_Amount_" + i));
            verifyLossAssessmentCoverage(data.get("Basic_Loss_Assessment_Coverage_" + i));
            setLossAssessmentOverride(data.get("Basic_Loss_Assessment_Override_" + i));
            setLossAssessmentCoverageOverride(data.get("Basic_Loss_Assessment_Override_" + i), data.get("Basic_Loss_Assessment_Coverage_Override_" + i));
            setLossAssessmentDeductible(data.get("Basic_Loss_Assessment_Deductible_" + i));
            verifyEarthquakeDeductible(data.get("Basic_Earthquake_Deductible_" + i));
            saveChanges();
        }
    }

}