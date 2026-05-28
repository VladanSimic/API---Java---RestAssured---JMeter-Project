package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class RiskCharacteristicsUsedInRiskModelBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public RiskCharacteristicsUsedInRiskModelBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='BCEG']/../../../..//input[not(@aria-hidden='true')]")
    List<WebElement> BCEG;
    @FindBy(xpath = "//div[text()='Year Built:']/../../../..//input")
    WebElement yearBuilt;
    @FindBy(xpath = "//div[text()='Construction Type:']/../../../..//input")
    WebElement constructionType;
    @FindBy(xpath = "//div[text()='Construction Type (RMS Code):']/../../../..//input")
    WebElement constructionTypeRMSCode;
    @FindBy(xpath = "//div[text()='Sheath Attach:']/../../../..//input")
    WebElement sheathAttach;
    @FindBy(xpath = "//div[text()='Sheath Attach (RMS Code):']/../../../..//input")
    WebElement sheathAttachRMSCode;
    @FindBy(xpath = "//div[text()='# of Stories:']/../../../..//input")
    WebElement numberOfStories;
    @FindBy(xpath = "//div[text()='Roof Shape:']/../../../..//input")
    WebElement roofShape;
    @FindBy(xpath = "//div[text()='Roof Shape (RMS Code):']/../../../..//input")
    WebElement roofShapeRMSCode;
    @FindBy(xpath = "//div[text()='Opening Protection:']/../../../..//input")
    WebElement openingProtection;
    @FindBy(xpath = "//div[text()='Opening Protection (RMS Code):']/../../../..//input")
    WebElement openingProtectionRMSCode;
    @FindBy(xpath = "//div[text()='Square Foot:']/../../../..//input")
    WebElement squareFoot;
    @FindBy(xpath = "//div[text()='Roof Anchors:']/../../../..//input")
    WebElement roofAnchors;
    @FindBy(xpath = "//div[text()='Roof Anchors (RMS Code):']/../../../..//input")
    WebElement roofAnchorsRMSCode;
    @FindBy(xpath = "//div[text()='Occupancy (RMS Code):']/../../../..//input")
    WebElement occupancyRMSCode;
    @FindBy(xpath = "//div[text()='Roof Cover:']/../../../..//input")
    WebElement roofCover;
    @FindBy(xpath = "//div[text()='Roof Cover (RMS Code):']/../../../..//input")
    WebElement roofCoverRMSCode;
    @FindBy(xpath = "//div[text()='Age of roof:']/../../../..//input")
    WebElement ageOfRoof;
    @FindBy(xpath = "//div[text()='Manager BCEG override']/../../../../div/..//input")
    WebElement managerBCEGOverrideYes;
    @FindBy(xpath = "//div[text()='BCEG Override']/../../../../div/..//input")
    WebElement managerBCEGOverrideInput;

    public void fillRiskCharacteristicsUsedInRiskModelCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk characteristics used in risk model");
        verifyYearBuilt(data.get("Risk_Characteristics_Used_In_Risk_Model_Year_Built"));
        verifyConstructionType(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type"));
        verifyConstructionTypeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_RMS_Code"));
        verifySheathAttach(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach"));
        verifySheathAttachRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_RMS_Code"));
        verifyNumberOfStories(data.get("Risk_Characteristics_Used_In_Risk_Model_Number_Of_Stories"));
        verifyRoofShape(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape"));
        verifyRoofShapeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_RMS_Code"));
        verifyOpeningProtection(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection"));
        verifyOpeningProtectionRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_RMS_Code"));
        verifySquareFoot(data.get("Risk_Characteristics_Used_In_Risk_Model_Square_Foot"));
        verifyRoofAnchors(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors"));
        verifyRoofAnchorsRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_RMS_Code"));
        verifyOccupancyRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Occupancy_RMS_Code"));
        verifyRoofCover(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover"));
        verifyRoofCoverRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_RMS_Code"));
        verifyAgeOfRoof(data.get("Risk_Characteristics_Used_In_Risk_Model_Age_Of_Roof"));
    }

    public void fillRiskCharacteristicsUsedInRiskModelCC_END(Map<String, String> data) {
        verifyYearBuilt(data.get("Risk_Characteristics_Used_In_Risk_Model_Year_Built_END"));
        verifyConstructionType(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_END"));
        verifyConstructionTypeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_RMS_Code_END"));
        verifySheathAttach(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_END"));
        verifySheathAttachRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_RMS_Code_END"));
        verifyNumberOfStories(data.get("Risk_Characteristics_Used_In_Risk_Model_Number_Of_Stories_END"));
        verifyRoofShape(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_END"));
        verifyRoofShapeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_RMS_Code_END"));
        verifyOpeningProtection(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_END"));
        verifyOpeningProtectionRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_RMS_Code_END"));
        verifySquareFoot(data.get("Risk_Characteristics_Used_In_Risk_Model_Square_Foot_END"));
        verifyRoofAnchors(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_END"));
        verifyRoofAnchorsRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_RMS_Code_END"));
        verifyOccupancyRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Occupancy_RMS_Code_END"));
        verifyRoofCover(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_END"));
        verifyRoofCoverRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_RMS_Code_END"));
        verifyAgeOfRoof(data.get("Risk_Characteristics_Used_In_Risk_Model_Age_Of_Roof_END"));
    }

    public void fillRiskCharacteristicsUsedInRiskModelHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk characteristics used in risk model");
        verifyYearBuilt(data.get("Risk_Characteristics_Used_In_Risk_Model_Year_Built"));
        verifyConstructionType(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type"));
        verifyConstructionTypeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_RMS_Code"));
        verifySheathAttach(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach"));
        verifySheathAttachRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_RMS_Code"));
        verifyNumberOfStories(data.get("Risk_Characteristics_Used_In_Risk_Model_Number_Of_Stories"));
        verifyRoofShape(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape"));
        verifyRoofShapeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_RMS_Code"));
        verifyOpeningProtection(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection"));
        verifyOpeningProtectionRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_RMS_Code"));
        verifySquareFoot(data.get("Risk_Characteristics_Used_In_Risk_Model_Square_Foot"));
        verifyRoofAnchors(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors"));
        verifyRoofAnchorsRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_RMS_Code"));
        verifyOccupancyRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Occupancy_RMS_Code"));
        verifyRoofCover(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover"));
        verifyRoofCoverRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_RMS_Code"));
        verifyAgeOfRoof(data.get("Risk_Characteristics_Used_In_Risk_Model_Age_Of_Roof"));
    }

    public void fillRiskCharacteristicsUsedInRiskModelHS_END(Map<String, String> data) {
        verifyYearBuilt(data.get("Risk_Characteristics_Used_In_Risk_Model_Year_Built_END"));
        verifyConstructionType(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_END"));
        verifyConstructionTypeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_RMS_Code_END"));
        verifySheathAttach(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_END"));
        verifySheathAttachRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_RMS_Code_END"));
        verifyNumberOfStories(data.get("Risk_Characteristics_Used_In_Risk_Model_Number_Of_Stories_END"));
        verifyRoofShape(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_END"));
        verifyRoofShapeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_RMS_Code_END"));
        verifyOpeningProtection(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_END"));
        verifyOpeningProtectionRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_RMS_Code_END"));
        verifySquareFoot(data.get("Risk_Characteristics_Used_In_Risk_Model_Square_Foot_END"));
        verifyRoofAnchors(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_END"));
        verifyRoofAnchorsRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_RMS_Code_END"));
        verifyOccupancyRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Occupancy_RMS_Code_END"));
        verifyRoofCover(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_END"));
        verifyRoofCoverRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_RMS_Code_END"));
        verifyAgeOfRoof(data.get("Risk_Characteristics_Used_In_Risk_Model_Age_Of_Roof_END"));
    }

    public void fillRiskCharacteristicsUsedInRiskModelHS_OOS_END(Map<String, String> data) {
        verifyYearBuilt(data.get("Risk_Characteristics_Used_In_Risk_Model_Year_Built_OOS_END"));
        verifyConstructionType(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_OOS_END"));
        verifyConstructionTypeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_RMS_Code_OOS_END"));
        verifySheathAttach(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_OOS_END"));
        verifySheathAttachRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_RMS_Code_OOS_END"));
        verifyNumberOfStories(data.get("Risk_Characteristics_Used_In_Risk_Model_Number_Of_Stories_OOS_END"));
        verifyRoofShape(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_OOS_END"));
        verifyRoofShapeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_RMS_Code_OOS_END"));
        verifyOpeningProtection(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_OOS_END"));
        verifyOpeningProtectionRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_RMS_Code_OOS_END"));
        verifySquareFoot(data.get("Risk_Characteristics_Used_In_Risk_Model_Square_Foot_OOS_END"));
        verifyRoofAnchors(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_OOS_END"));
        verifyRoofAnchorsRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_RMS_Code_OOS_END"));
        verifyOccupancyRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Occupancy_RMS_Code_OOS_END"));
        verifyRoofCover(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_OOS_END"));
        verifyRoofCoverRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_RMS_Code_OOS_END"));
        verifyAgeOfRoof(data.get("Risk_Characteristics_Used_In_Risk_Model_Age_Of_Roof_OOS_END"));
    }

    public void fillRiskCharacteristicsUsedInRiskModelHS_RNW(Map<String, String> data) {
        verifyYearBuilt(data.get("Risk_Characteristics_Used_In_Risk_Model_Year_Built_RNW"));
        verifyConstructionType(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_RNW"));
        verifyConstructionTypeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Construction_Type_RMS_Code_RNW"));
        verifySheathAttach(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_RNW"));
        verifySheathAttachRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Sheath_Attach_RMS_Code_RNW"));
        verifyNumberOfStories(data.get("Risk_Characteristics_Used_In_Risk_Model_Number_Of_Stories_RNW"));
        verifyRoofShape(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_RNW"));
        verifyRoofShapeRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Shape_RMS_Code_RNW"));
        verifyOpeningProtection(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_RNW"));
        verifyOpeningProtectionRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Opening_Protection_RMS_Code_RNW"));
        verifySquareFoot(data.get("Risk_Characteristics_Used_In_Risk_Model_Square_Foot_RNW"));
        verifyRoofAnchors(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_RNW"));
        verifyRoofAnchorsRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Anchors_RMS_Code_RNW"));
        verifyOccupancyRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Occupancy_RMS_Code_RNW"));
        verifyRoofCover(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_RNW"));
        verifyRoofCoverRMSCode(data.get("Risk_Characteristics_Used_In_Risk_Model_Roof_Cover_RMS_Code_RNW"));
        verifyAgeOfRoof(data.get("Risk_Characteristics_Used_In_Risk_Model_Age_Of_Roof_RNW"));
    }

    public void fillRiskCharacteristicsBlockHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk characteristics");
        setBCEG(data.get("Risk_Characteristics_BCEG"));
        setManagerOverrideBCEG(data.get("Risk_Characteristics_Manager_BCEG_Override"));
        saveChanges();
    }

    public void fillRiskCharacteristicsBlockHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk characteristics");
        setBCEG(data.get("Risk_Characteristics_BCEG_END"));
        setManagerOverrideBCEG(data.get("Risk_Characteristics_Manager_BCEG_Override_END"));
        saveChanges();
    }

    public void fillRiskCharacteristicsBlockHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk characteristics");
        setBCEG(data.get("Risk_Characteristics_BCEG_OOS_END"));
        setManagerOverrideBCEG(data.get("Risk_Characteristics_Manager_BCEG_Override_OOS_END"));
        saveChanges();
    }

    public void fillRiskCharacteristicsBlockHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk characteristics");
        setBCEG(data.get("Risk_Characteristics_BCEG_RNW"));
        setManagerOverrideBCEG(data.get("Risk_Characteristics_Manager_BCEG_Override_RNW"));
        saveChanges();
    }

    public void fillRiskCharacteristicsBlock(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("risk characteristics");
        setBCEG(data.get("Risk_Characteristics_BCEG_" + i));
        setManagerOverrideBCEG(data.get("Risk_Characteristics_Manager_BCEG_Override_" + i));
        saveChanges();
    }

    public void fillRiskCharacteristicsBlockHO(Map<String, String> data, int i) throws Throwable {
        if (BCEG.size() > 0) {
            pause(3500);
            typeText(BCEG.get(0), "05");
            pause(5000);
            if (!BCEG.get(0).getAttribute("value").equalsIgnoreCase("99")) {
                try {
                    clickElement(BCEG.get(0));
                    pause(3000);
                    driver.findElements(By.xpath("//li[@role=\"option\"]")).get(1).click();
                    pause(3000);
                } catch (Exception e) {
                    BCEG.get(0).click();
                    pause(1000);
                    BCEG.get(0).sendKeys(Keys.ARROW_DOWN);
                    pause(1000);
                    BCEG.get(0).sendKeys(Keys.ENTER);
                }
            }
        }
    }

    public void verifyYearBuilt(String value) {
        assertCellValue(yearBuilt, value, "Risk Characteristics Used In Risk Model Year Built");
    }

    public void verifyConstructionType(String value) {
        assertCellValue(constructionType, value, "Risk Characteristics Used In Risk Model Construction Type");
    }

    public void verifyConstructionTypeRMSCode(String value) {
        assertCellValue(constructionTypeRMSCode, value, "Risk Characteristics Used In Risk Model Construction Type RMS Code");
    }

    public void verifySheathAttach(String value) {
        assertCellValue(sheathAttach, value, "Risk Characteristics Used In Risk Model Sheath Attach");
    }

    public void verifySheathAttachRMSCode(String value) {
        assertCellValue(sheathAttachRMSCode, value, "Risk Characteristics Used In Risk Model Sheath Attach RMS Code");
    }

    public void verifyNumberOfStories(String value) {
        assertCellValue(numberOfStories, value, "Risk Characteristics Used In Risk Model Number Of Stories");
    }

    public void verifyRoofShape(String value) {
        assertCellValue(roofShape, value, "Risk Characteristics Used In Risk Model Roof Shape");
    }

    public void verifyRoofShapeRMSCode(String value) {
        assertCellValue(roofShapeRMSCode, value, "Risk Characteristics Used In Risk Model Roof Shape RMS Code");
    }

    public void verifyOpeningProtection(String value) {
        assertCellValue(openingProtection, value, "Risk Characteristics Used In Risk Model Opening Protection");
    }

    public void verifyOpeningProtectionRMSCode(String value) {
        assertCellValue(openingProtectionRMSCode, value, "Risk Characteristics Used In Risk Model Opening Protection RMS Code");
    }

    public void verifySquareFoot(String value) {
        assertCellValue(squareFoot, value, "Risk Characteristics Used In Risk Model Square Foot");
    }

    public void verifyRoofAnchors(String value) {
        assertCellValue(roofAnchors, value, "Risk Characteristics Used In Risk Model Roof Anchors");
    }

    public void verifyRoofAnchorsRMSCode(String value) {
        assertCellValue(roofAnchorsRMSCode, value, "Risk Characteristics Used In Risk Model Roof Anchors RMS Code");
    }

    public void verifyOccupancyRMSCode(String value) {
        assertCellValue(occupancyRMSCode, value, "Risk Characteristics Used In Risk Model Occupancy RMS Code");
    }

    public void verifyRoofCover(String value) {
        assertCellValue(roofCover, value, "Risk Characteristics Used In Risk Model Roof Cover");
    }

    public void verifyRoofCoverRMSCode(String value) {
        assertCellValue(roofCoverRMSCode, value, "Risk Characteristics Used In Risk Model Roof Cover RMS Code");
    }

    public void verifyAgeOfRoof(String value) {
        assertCellValue(ageOfRoof, value, "Risk Characteristics Used In Risk Model Age Of Roof");
    }

    public void setBCEG(String value) throws Throwable {
        if (hasValue(value)) {
            clickElement(BCEG.get(0), "BCEG");
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "BCEG");
            clickFooter();
            pause(4000);
            if (!BCEG.get(0).getAttribute("value").equalsIgnoreCase(value)) {
                clickElement(BCEG.get(0));
                pause(2000);
                BCEG.get(0).sendKeys(Keys.ARROW_DOWN);
                pause(2000);
                BCEG.get(0).sendKeys(Keys.ENTER);
            }
        }
    }

    public void setManagerOverrideBCEG(String value) throws Throwable {
        if (hasValue(value) && !value.equalsIgnoreCase("No")) {
            setManagerBCEGOverrideYes("Yes");
            setBCEGOverride(value);
        }
    }

    public void setManagerBCEGOverrideYes(String value) throws Throwable {
        checkCheckbox(managerBCEGOverrideYes, value);
        pause(2000);
    }

    public void setBCEGOverride(String value) throws Throwable {
        typeTextEnter(managerBCEGOverrideInput, value, "BCEG Override");
        clickFooter();
    }


}