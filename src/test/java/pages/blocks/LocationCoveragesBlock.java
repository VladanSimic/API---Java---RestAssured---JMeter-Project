package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class LocationCoveragesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LocationCoveragesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Residence Type:']/../../../..//div[@aria-readonly=\"true\"]")
    WebElement residenceType;
    @FindBy(xpath = "//div[text()='Dwelling:']/../../../..//div[@aria-readonly=\"true\"]")
    WebElement dwelling;
    @FindBy(xpath = "//div[text()='Other Structures:']/../../../..//div[@aria-readonly=\"true\"]")
    WebElement otherStructures;
    @FindBy(xpath = "//div[text()='Contents:']/../../../..//div[@aria-readonly=\"true\"]")
    WebElement contents;
    @FindBy(xpath = "//div[text()='Loss of Use:']/../../../..//div[@aria-readonly=\"true\"]")
    WebElement lossOfUse;
    @FindBy(xpath = "//div[text()='All Perils Deductible:']/../../../..//div[@aria-readonly=\"true\"]")
    WebElement allPerilsDeductible;
    @FindBy(xpath = "//div[text()='Hurricane Deductible:']/../../../..//div[@aria-readonly=\"true\"]")
    WebElement hurricaneDeductible;

    public void fillLocationCoveragesCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("location coverages");
        verifyResidenceType(data.get("Location_Coverages_Residence_Type"));
        verifyDwelling(data.get("Location_Coverages_Dwelling"));
        verifyOtherStructures(data.get("Location_Coverages_Other_Structures"));
        verifyContents(data.get("Location_Coverages_Contents"));
        verifyLossOfUse(data.get("Location_Coverages_Loss_Of_Use"));
        verifyAllPerilsDeductible(data.get("Location_Coverages_All_Perils_Deductible"));
        verifyHurricaneDeductible(data.get("Location_Coverages_Hurricane_Deductible"));
    }

    public void fillLocationCoveragesCC_END(Map<String, String> data) {
        verifyResidenceType(data.get("Location_Coverages_Residence_Type_END"));
        verifyDwelling(data.get("Location_Coverages_Dwelling_END"));
        verifyOtherStructures(data.get("Location_Coverages_Other_Structures_END"));
        verifyContents(data.get("Location_Coverages_Contents_END"));
        verifyLossOfUse(data.get("Location_Coverages_Loss_Of_Use_END"));
        verifyAllPerilsDeductible(data.get("Location_Coverages_All_Perils_Deductible_END"));
        verifyHurricaneDeductible(data.get("Location_Coverages_Hurricane_Deductible_END"));
    }

    public void fillLocationCoveragesHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("location coverages");
        verifyResidenceType(data.get("Location_Coverages_Residence_Type"));
        verifyDwelling(data.get("Location_Coverages_Dwelling"));
        verifyOtherStructures(data.get("Location_Coverages_Other_Structures"));
        verifyContents(data.get("Location_Coverages_Contents"));
        verifyLossOfUse(data.get("Location_Coverages_Loss_Of_Use"));
        verifyAllPerilsDeductible(data.get("Location_Coverages_All_Perils_Deductible"));
        verifyHurricaneDeductible(data.get("Location_Coverages_Hurricane_Deductible"));
    }

    public void fillLocationCoveragesHS_END(Map<String, String> data) {
        verifyResidenceType(data.get("Location_Coverages_Residence_Type_END"));
        verifyDwelling(data.get("Location_Coverages_Dwelling_END"));
        verifyOtherStructures(data.get("Location_Coverages_Other_Structures_END"));
        verifyContents(data.get("Location_Coverages_Contents_END"));
        verifyLossOfUse(data.get("Location_Coverages_Loss_Of_Use_END"));
        verifyAllPerilsDeductible(data.get("Location_Coverages_All_Perils_Deductible_END"));
        verifyHurricaneDeductible(data.get("Location_Coverages_Hurricane_Deductible_END"));
    }

    public void fillLocationCoveragesHS_OOS_END(Map<String, String> data) {
        verifyResidenceType(data.get("Location_Coverages_Residence_Type_OOS_END"));
        verifyDwelling(data.get("Location_Coverages_Dwelling_OOS_END"));
        verifyOtherStructures(data.get("Location_Coverages_Other_Structures_OOS_END"));
        verifyContents(data.get("Location_Coverages_Contents_OOS_END"));
        verifyLossOfUse(data.get("Location_Coverages_Loss_Of_Use_OOS_END"));
        verifyAllPerilsDeductible(data.get("Location_Coverages_All_Perils_Deductible_OOS_END"));
        verifyHurricaneDeductible(data.get("Location_Coverages_Hurricane_Deductible_OOS_END"));
    }

    public void fillLocationCoveragesHS_RNW(Map<String, String> data) {
        verifyResidenceType(data.get("Location_Coverages_Residence_Type_RNW"));
        verifyDwelling(data.get("Location_Coverages_Dwelling_RNW"));
        verifyOtherStructures(data.get("Location_Coverages_Other_Structures_RNW"));
        verifyContents(data.get("Location_Coverages_Contents_RNW"));
        verifyLossOfUse(data.get("Location_Coverages_Loss_Of_Use_RNW"));
        verifyAllPerilsDeductible(data.get("Location_Coverages_All_Perils_Deductible_RNW"));
        verifyHurricaneDeductible(data.get("Location_Coverages_Hurricane_Deductible_RNW"));
    }

    public void verifyResidenceType(String value) {
        if (hasValue(value))
            assertEquals(residenceType.getText(), value, "Location Coverages Residence Type");
    }

    public void verifyDwelling(String value) {
        if (hasValue(value))
            assertEquals(dwelling.getText(), value, "Location Coverages Dwelling");
    }

    public void verifyOtherStructures(String value) {
        if (hasValue(value))
            assertEquals(otherStructures.getText(), value, "Location Coverages Other Structures");
    }

    public void verifyContents(String value) {
        if (hasValue(value))
            assertEquals(contents.getText(), value, "Location Coverages Contents");
    }

    public void verifyLossOfUse(String value) {
        if (hasValue(value))
            assertEquals(lossOfUse.getText(), value, "Location Coverages Loss Of Use");
    }

    public void verifyAllPerilsDeductible(String value) {
        if (hasValue(value))
            assertEquals(allPerilsDeductible.getText(), value, "Location Coverages All Perils Deductible");
    }

    public void verifyHurricaneDeductible(String value) {
        if (hasValue(value))
            assertEquals(hurricaneDeductible.getText(), value, "Location Coverages Hurricane Deductible");
    }

}