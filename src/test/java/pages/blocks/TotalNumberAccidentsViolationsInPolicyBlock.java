package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class TotalNumberAccidentsViolationsInPolicyBlock extends CommonComponentsAndActions {

    public TotalNumberAccidentsViolationsInPolicyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total # chargeable accidents']/../../../..//input")
    WebElement chargeableAccidents;
    @FindBy(xpath = "//div[text()='Total # of COMP Claims']/../../../..//input")
    WebElement COMPClaims;
    @FindBy(xpath = "//div[text()='Total # AAF(36 Month)']/../../../..//input")
    WebElement AAF36Month;
    @FindBy(xpath = "//div[text()='Total # NAF(60 Month)']/../../../..//input")
    WebElement NAF60Month;
    @FindBy(xpath = "//div[text()='3 Years Clean record']/../../../..//input")
    WebElement years3CleanRecord;
    @FindBy(xpath = "//div[text()='Total # chargeable violations']/../../../..//input")
    WebElement chargeableViolations;
    @FindBy(xpath = "//div[text()='Total # of MIN (No Waiver)']/../../../..//input")
    WebElement MINNoWaiver;
    @FindBy(xpath = "//div[text()='Total # Moving Viol 36 month']/../../../..//input")
    WebElement movingViol36Month;
    @FindBy(xpath = "//div[text()='Total # NAF(36 Month)']/../../../..//input")
    WebElement NAF36Month;
    @FindBy(xpath = "//div[text()='5 Years Clean record']/../../../..//input")
    WebElement years5CleanRecord;
    @FindBy(xpath = "//div[text()='Total # non-chargeable violations']/../../../..//input")
    WebElement nonChargeableViolations;
    @FindBy(xpath = "//div[text()='Total # AAF(60 Month)']/../../../..//input")
    WebElement AAF60Month;
    @FindBy(xpath = "//div[text()='Total # Moving Viol 60 month']/../../../..//input")
    WebElement MovingViol60Month;
    @FindBy(xpath = "//div[text()='Total waived']/../../../..//input")
    WebElement violationsWaived;

    public void fillTotalNumberAccidentsViolationsInPolicyDetailsPA(Map<String, String> data) {
        verifyChargeableAccidents(data.get("Total_Number_Accidents_Violations_Chargeable_Accidents"));
        verifyCOMPClaims(data.get("Total_Number_Accidents_Violations_COMP_Claims"));
        verifyAAF36Month(data.get("Total_Number_Accidents_Violations_AAF_36_Month"));
        verifyNAF60Month(data.get("Total_Number_Accidents_Violations_NAF_60_Month"));
        verifyYears3CleanRecord(data.get("Total_Number_Accidents_Violations_3_Years_Clean_Record"));
        verifyChargeableViolations(data.get("Total_Number_Accidents_Violations_Chargeable_Violations"));
        verifyMINNoWaiver(data.get("Total_Number_Accidents_Violations_MIN_No_Waiver"));
        verifyMovingViol36Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_36_Month"));
        verifyNAF36Month(data.get("Total_Number_Accidents_Violations_NAF_36 Month"));
        verifyYears5CleanRecord(data.get("Total_Number_Accidents_Violations_5_Years_Clean_Record"));
        verifyNonChargeableViolations(data.get("Total_Number_Accidents_Violations_Non_Chargeable_Violations"));
        verifyAAF60Month(data.get("Total_Number_Accidents_Violations_AAF_60_Month"));
        verifyMovingViol60Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_60_Month"));
        verifyViolationsWaived(data.get("Total_Number_Accidents_Violations_Waived"));
    }

    public void fillTotalNumberAccidentsViolationsInPolicyDetailsPA_END(Map<String, String> data) {
        verifyChargeableAccidents(data.get("Total_Number_Accidents_Violations_Chargeable_Accidents_END"));
        verifyCOMPClaims(data.get("Total_Number_Accidents_Violations_COMP_Claims_END"));
        verifyAAF36Month(data.get("Total_Number_Accidents_Violations_AAF_36_Month_END"));
        verifyNAF60Month(data.get("Total_Number_Accidents_Violations_NAF_60_Month_END"));
        verifyYears3CleanRecord(data.get("Total_Number_Accidents_Violations_3_Years_Clean_Record_END"));
        verifyChargeableViolations(data.get("Total_Number_Accidents_Violations_Chargeable_Violations_END"));
        verifyMINNoWaiver(data.get("Total_Number_Accidents_Violations_MIN_No_Waiver_END"));
        verifyMovingViol36Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_36_Month_END"));
        verifyNAF36Month(data.get("Total_Number_Accidents_Violations_NAF_36 Month_END"));
        verifyYears5CleanRecord(data.get("Total_Number_Accidents_Violations_5_Years_Clean_Record_END"));
        verifyNonChargeableViolations(data.get("Total_Number_Accidents_Violations_Non_Chargeable_Violations_END"));
        verifyAAF60Month(data.get("Total_Number_Accidents_Violations_AAF_60_Month_END"));
        verifyMovingViol60Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_60_Month_END"));
        verifyViolationsWaived(data.get("Total_Number_Accidents_Violations_Waived_END"));
    }

    public void fillTotalNumberAccidentsViolationsInPolicyDetailsPA_OOS_END(Map<String, String> data) {
        verifyChargeableAccidents(data.get("Total_Number_Accidents_Violations_Chargeable_Accidents_OOS_END"));
        verifyCOMPClaims(data.get("Total_Number_Accidents_Violations_COMP_Claims_OOS_END"));
        verifyAAF36Month(data.get("Total_Number_Accidents_Violations_AAF_36_Month_OOS_END"));
        verifyNAF60Month(data.get("Total_Number_Accidents_Violations_NAF_60_Month_OOS_END"));
        verifyYears3CleanRecord(data.get("Total_Number_Accidents_Violations_3_Years_Clean_Record_OOS_END"));
        verifyChargeableViolations(data.get("Total_Number_Accidents_Violations_Chargeable_Violations_OOS_END"));
        verifyMINNoWaiver(data.get("Total_Number_Accidents_Violations_MIN_No_Waiver_OOS_END"));
        verifyMovingViol36Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_36_Month_OOS_END"));
        verifyNAF36Month(data.get("Total_Number_Accidents_Violations_NAF_36 Month_OOS_END"));
        verifyYears5CleanRecord(data.get("Total_Number_Accidents_Violations_5_Years_Clean_Record_OOS_END"));
        verifyNonChargeableViolations(data.get("Total_Number_Accidents_Violations_Non_Chargeable_Violations_OOS_END"));
        verifyAAF60Month(data.get("Total_Number_Accidents_Violations_AAF_60_Month_OOS_END"));
        verifyMovingViol60Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_60_Month_OOS_END"));
        verifyViolationsWaived(data.get("Total_Number_Accidents_Violations_Waived_OOS_END"));
    }

    public void fillTotalNumberAccidentsViolationsInPolicyDetailsPA_RNW(Map<String, String> data) {
        verifyChargeableAccidents(data.get("Total_Number_Accidents_Violations_Chargeable_Accidents_RNW"));
        verifyCOMPClaims(data.get("Total_Number_Accidents_Violations_COMP_Claims_RNW"));
        verifyAAF36Month(data.get("Total_Number_Accidents_Violations_AAF_36_Month_RNW"));
        verifyNAF60Month(data.get("Total_Number_Accidents_Violations_NAF_60_Month_RNW"));
        verifyYears3CleanRecord(data.get("Total_Number_Accidents_Violations_3_Years_Clean_Record_RNW"));
        verifyChargeableViolations(data.get("Total_Number_Accidents_Violations_Chargeable_Violations_RNW"));
        verifyMINNoWaiver(data.get("Total_Number_Accidents_Violations_MIN_No_Waiver_RNW"));
        verifyMovingViol36Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_36_Month_RNW"));
        verifyNAF36Month(data.get("Total_Number_Accidents_Violations_NAF_36 Month_RNW"));
        verifyYears5CleanRecord(data.get("Total_Number_Accidents_Violations_5_Years_Clean_Record_RNW"));
        verifyNonChargeableViolations(data.get("Total_Number_Accidents_Violations_Non_Chargeable_Violations_RNW"));
        verifyAAF60Month(data.get("Total_Number_Accidents_Violations_AAF_60_Month_RNW"));
        verifyMovingViol60Month(data.get("Total_Number_Accidents_Violations_Moving_Viol_60_Month_RNW"));
        verifyViolationsWaived(data.get("Total_Number_Accidents_Violations_Waived_RNW"));
    }

    public void verifyChargeableAccidents(String s) {
        assertCellValue(chargeableAccidents, s, "Chargeable Accidents");
    }

    public void verifyCOMPClaims(String s) {
        assertCellValue(COMPClaims, s, "COMP Claims");
    }

    public void verifyAAF36Month(String s) {
        assertCellValue(AAF36Month, s, "AAF 36 Month");
    }

    public void verifyNAF60Month(String s) {
        assertCellValue(NAF60Month, s, "NAF 60 Month");
    }

    public void verifyYears3CleanRecord(String s) {
        assertCellValue(years3CleanRecord, s, "3 Years Clean Record");
    }

    public void verifyChargeableViolations(String s) {
        assertCellValue(chargeableViolations, s, "Chargeable Violations");
    }

    public void verifyMINNoWaiver(String s) {
        assertCellValue(MINNoWaiver, s, "MIN No Waiver");
    }

    public void verifyMovingViol36Month(String s) {
        assertCellValue(movingViol36Month, s, "Moving Viol 36 Month");
    }

    public void verifyNAF36Month(String s) {
        assertCellValue(NAF36Month, s, "NAF 36 Month");
    }

    public void verifyYears5CleanRecord(String s) {
        assertCellValue(years5CleanRecord, s, "5 Years Clean Record");
    }

    public void verifyNonChargeableViolations(String s) {
        assertCellValue(nonChargeableViolations, s, "Non Chargeable Violations");
    }

    public void verifyAAF60Month(String s) {
        assertCellValue(AAF60Month, s, "AAF60Month");
    }

    public void verifyMovingViol60Month(String s) {
        assertCellValue(MovingViol60Month, s, "Moving Viol 60 Month");
    }

    public void verifyViolationsWaived(String s) {
        assertCellValue(violationsWaived, s, "Violations Waived");
    }
}