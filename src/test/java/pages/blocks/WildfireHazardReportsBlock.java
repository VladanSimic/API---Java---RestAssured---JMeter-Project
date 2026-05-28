package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WildfireHazardReportsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public WildfireHazardReportsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Wildfire Hazard Severity']/../../../..//input")
    WebElement wildfireHazardSeverity;
    @FindBy(xpath = "//div[text()='Wildfire Risk Factor']/../../../..//input")
    WebElement wildfireRiskFactor;
    @FindBy(xpath = "//div[text()='Wildfire Risk Score']/../../../..//input")
    WebElement wildfireRiskScore;
    @FindBy(xpath = "//div[text()='Wildfire Hazard Severity override']/../../../..//input")
    WebElement wildfireHazardSeverityOverride;
    @FindBy(xpath = "//div[text()='Land Use Density Class']/../../../..//input")
    WebElement landUseDensityClass;
    @FindBy(xpath = "//div[text()='Distance to Wild Lands (feet)']/../../../..//input")
    WebElement distanceToWildLands;

    public void fillWildfireHazardReportsDetailCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("Wildfire Hazard Reports");
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override"));
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands"));
        saveChanges();
    }

    public void fillWildfireHazardReportsDetailCC_END(Map<String, String> data) throws Throwable {
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_END"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_END"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_END"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_END"));
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_END"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_END"));
        saveChanges();
    }

    public void verifyWildfireHazardSeverity(String value) {
        assertCellValue(wildfireHazardSeverity, value, "Wildfire Hazard Severity");
    }

    public void verifyWildfireRiskFactor(String value) {
        assertCellValue(wildfireRiskFactor, value, "Wildfire Risk Factor");
    }

    public void verifyWildfireRiskScore(String value) {
        assertCellValue(wildfireRiskScore, value, "Wildfire Risk Score");
    }

    public void setWildfireHazardSeverityOverride(String value) throws Throwable {
        typeTextEnter(wildfireHazardSeverityOverride, value, "Wildfire Hazard Severity Override");
        pause(3000);
        clickFooter();
    }

    public void verifyLandUseDensityClass(String value) {
        assertCellValue(landUseDensityClass, value, "Land Use Density Class");
    }

    public void verifyDistanceToWildLands(String value) {
        assertCellValue(distanceToWildLands, value, "Distance To Wild Lands");
    }

    public String getSeverity() {
        return wildfireHazardSeverity.getAttribute("value");
    }

    public void fillWildfireHazardReportsDetailHS(Map<String, String> data) throws Throwable {
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override"));
        saveChanges();
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands"));
        saveChanges();
    }

    public void fillWildfireHazardReportsDetailHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("Wildfire Hazard Reports (underwriters only)");
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override"));
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands"));
    }

    public void fillWildfireHazardReportsDetailHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Wildfire Hazard Reports (underwriters only)");
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_END"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_END"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_END"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_END"));
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_END"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_END"));
    }

    public void fillWildfireHazardReportsDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Wildfire Hazard Reports (underwriters only)");
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_OOS_END"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_OOS_END"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_OOS_END"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_OOS_END"));
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_OOS_END"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_OOS_END"));
    }

    public void fillWildfireHazardReportsDetailHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("Wildfire Hazard Reports (underwriters only)");
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_RNW"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_RNW"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_RNW"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_RNW"));
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_RNW"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_RNW"));
    }

    public void fillWildfireHazardReportsDetailHO(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("Wildfire Hazard Reports (underwriters only)");
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_" + i));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_" + i));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_" + i));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_" + i));
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_" + i));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_" + i));
    }

    public void fillWildfireHazardReportsDetailHS_END(Map<String, String> data) throws Throwable {
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_END"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_END"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_END"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_END"));
        saveChanges();
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_END"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_END"));
        saveChanges();
    }

    public void fillWildfireHazardReportsDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_OOS_END"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_OOS_END"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_OOS_END"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_OOS_END"));
        saveChanges();
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_OOS_END"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_OOS_END"));
        saveChanges();
    }

    public void fillWildfireHazardReportsDetailHS_RNW(Map<String, String> data) throws Throwable {
        verifyWildfireHazardSeverity(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_RNW"));
        verifyWildfireRiskFactor(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Factor_RNW"));
        verifyWildfireRiskScore(data.get("Wildfire_Hazard_Reports_Wildfire_Risk_Score_RNW"));
        setWildfireHazardSeverityOverride(data.get("Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override_RNW"));
        saveChanges();
        verifyLandUseDensityClass(data.get("Wildfire_Hazard_Reports_Land_Use_Density_Class_RNW"));
        verifyDistanceToWildLands(data.get("Wildfire_Hazard_Reports_Distance_To_Wild_Lands_RNW"));
        saveChanges();
    }

}