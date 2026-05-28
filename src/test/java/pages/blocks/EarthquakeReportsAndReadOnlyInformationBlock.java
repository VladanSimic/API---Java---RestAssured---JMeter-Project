package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class EarthquakeReportsAndReadOnlyInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public EarthquakeReportsAndReadOnlyInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='MMI']/../../../../..//input")
    WebElement mmi;
    @FindBy(xpath = "//div[text()='Soil Grade']/../../../../..//input")
    WebElement soilGrade;
    @FindBy(xpath = "//div[text()='Soil Type']/../../../../..//input")
    WebElement soilType;
    @FindBy(xpath = "//div[text()='MMI override']/../../../../..//input")
    WebElement mmiOverride;
    @FindBy(xpath = "//div[text()='Soil Grade override']/../../../..//input")
    WebElement soilGradeOverride;
    @FindBy(xpath = "//div[text()='Distance to Controlling Fault Line (miles)']/../../../..//input")
    WebElement distanceToControllingFaultLineMiles;
    @FindBy(xpath = "(//div[text()='Is the home located on a grade that is > 20º in slope?']/../../../..//input)[2]")
    WebElement isTheHomeLocatedOnAGradeThatIsGT20InSlopeYes;
    @FindBy(xpath = "(//div[text()='Is the home located on a grade that is > 20º in slope?']/../../../..//input)[1]")
    WebElement isTheHomeLocatedOnAGradeThatIsGT20InSlopeNo;
    @FindBy(xpath = "(//div[text()='Is the home supported by stilts, posts, cantilevers or caissons?']/../../../..//input)[2]")
    WebElement isTheHomeSupportedByStiltsPostsCantileversOrCaissonsYes;
    @FindBy(xpath = "(//div[text()='Is the home supported by stilts, posts, cantilevers or caissons?']/../../../..//input)[1]")
    WebElement isTheHomeSupportedByStiltsPostsCantileversOrCaissonsNo;

    public void fillEarthquakeReportsAndReadOnlyInformationDetailCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake reports and read only information");
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Override"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Override"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailCC_END(Map<String, String> data) throws Throwable {
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_END"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_END"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_END"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Override_END"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Override_END"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_END"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_END"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_END"));
        saveChanges();
    }

    public void verifyMMI(String value) {
        assertCellValue(mmi, value, "MMI");
    }

    public void verifySoilGrade(String value) {
        assertCellValue(soilGrade, value, "Soil Grade");
    }

    public void verifySoilType(String value) {
        assertCellValue(soilType, value, "Soil Type");
    }

    public void setMMIOverride(String value) throws InterruptedException {
        pause(3000);
        typeText(mmiOverride, value, "MMI Override");
    }

    public void setSoilGradeOverride(String value) {
        typeText(soilGradeOverride, value, "Soil Grade Override");
    }

    public void verifyDistanceToControllingFaultLineMiles(String value) {
        assertCellValue(distanceToControllingFaultLineMiles, value, "Distance To Controlling Fault Line Miles");
    }

    public void verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(String value) {
        assertRadio(isTheHomeLocatedOnAGradeThatIsGT20InSlopeYes, isTheHomeLocatedOnAGradeThatIsGT20InSlopeNo, value, "Is The Home Located On A Grade That Is GT 20 In Slope");
    }

    public void verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(String value) {
        assertRadio(isTheHomeSupportedByStiltsPostsCantileversOrCaissonsYes, isTheHomeSupportedByStiltsPostsCantileversOrCaissonsNo, value, "Is The Home Supported By Stilts Posts Cantilevers Or Caissons");
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHS(Map<String, String> data) throws Throwable {
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Verify"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Verify"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_Verify"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_Verify"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_Verify"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_Verify"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHS_END(Map<String, String> data) throws Throwable {
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Verify_END"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Verify_END"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_Verify_END"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_END"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_END"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_Verify_END"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_Verify_END"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_Verify_END"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Verify_OOS_END"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Verify_OOS_END"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_Verify_OOS_END"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_OOS_END"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_OOS_END"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_Verify_OOS_END"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_Verify_OOS_END"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_Verify_OOS_END"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHS_RNW(Map<String, String> data) throws Throwable {
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Verify_RNW"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Verify_RNW"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_Verify_RNW"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_RNW"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_RNW"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_Verify_RNW"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_Verify_RNW"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_Verify_RNW"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake reports and read only information (underwriters only)");
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Override"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Override"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake reports and read only information (underwriters only)");
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_END"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_END"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_END"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Override_END"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Override_END"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_END"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_END"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_END"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake reports and read only information (underwriters only)");
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_OOS_END"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_OOS_END"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_OOS_END"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Override_OOS_END"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Override_OOS_END"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_OOS_END"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_OOS_END"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_OOS_END"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("Earthquake reports and read only information (underwriters only)");
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_RNW"));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_RNW"));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_RNW"));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Override_RNW"));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Override_RNW"));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_RNW"));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_RNW"));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_RNW"));
        saveChanges();
    }

    public void fillEarthquakeReportsAndReadOnlyInformationDetailHO(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("Earthquake reports and read only information (underwriters only)");
        verifyMMI(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_" + i));
        verifySoilGrade(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_" + i));
        verifySoilType(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Type_" + i));
        setMMIOverride(data.get("Earthquake_Reports_And_Read_Only_Information_MMI_Override_" + i));
        setSoilGradeOverride(data.get("Earthquake_Reports_And_Read_Only_Information_Soil_Grade_Override_" + i));
        verifyDistanceToControllingFaultLineMiles(data.get("Earthquake_Reports_And_Read_Only_Information_Distance_To_Controlling_Fault_Line_Miles_" + i));
        verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Located_On_A_Grade_That_Is_GT_20_In_Slope_" + i));
        verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(data.get("Earthquake_Reports_And_Read_Only_Information_Is_The_Home_Supported_By_Stilts_Posts_Cantilevers_Or_Caissons_" + i));
        saveChanges();
    }


}