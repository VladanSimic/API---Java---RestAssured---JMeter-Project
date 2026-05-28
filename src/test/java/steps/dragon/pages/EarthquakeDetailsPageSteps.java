package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.EarthquakePage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class EarthquakeDetailsPageSteps extends BaseTest {

    public EarthquakeDetailsPageSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the earthquake details page for CC line of business")
    public void iFillEarthquakeDetailsPageCC() throws Throwable {
        new EarthquakePage(driver).fillEarthquakeDetailsPageCC(data);
    }

    @And("I fill out the earthquake coverage options details block for CC line of business")
    public void iFillEarthquakeCoverageOptionsDetailCC() throws Throwable {
        new EarthquakeCoverageOptionsBlock(driver).fillEarthquakeCoverageOptionsDetailCC(data);
    }

    @And("I fill out the earthquake reports and read only information detail block for CC line of business")
    public void iFillEarthquakeReportsAndReadOnlyInformationDetailCC() throws Throwable {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).fillEarthquakeReportsAndReadOnlyInformationDetailCC(data);
    }

    @And("I fill out the earthquake basic detail block for CC line of business")
    public void iFillEarthquakeBasicDetailCC() throws Throwable {
        new EarthquakeBasicBlock(driver).fillEarthquakeBasicDetailCC(data);
    }

    @And("I fill out the earthquake broad detail block for CC line of business")
    public void iFillEarthquakeBroadDetailCC() throws Throwable {
        new EarthquakeBroadBlock(driver).fillEarthquakeBroadDetailCC(data);
    }

    @And("I fill out the earthquake underwriting only detail block for CC line of business")
    public void iFillEarthquakeUnderwritingOnlyDetailCC() throws Throwable {
        new EarthquakeUnderwritingOnlyBlock(driver).fillEarthquakeUnderwritingOnlyDetailCC(data);
    }

    @And("I set earthquake coverage option to {string}")
    public void setEarthquakeCoverageOptions(String value) throws Throwable {
        new EarthquakeCoverageOptionsBlock(driver).setEarthquakeCoverageOptions(value);
    }

    @And("I verify that earthquake reports and read only information MMI is {string}")
    public void iVerifyMMI(String value) {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).verifyMMI(value);
    }

    @And("I verify that earthquake reports and read only information soil grade is {string}")
    public void iVerifySoilGrade(String value) {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).verifySoilGrade(value);
    }

    @And("I verify that earthquake reports and read only information soil type is {string}")
    public void iVerifySoilType(String value) {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).verifySoilType(value);
    }

    @And("I set earthquake reports and read only information MMI override to {string}")
    public void setMMIOverride(String value) throws InterruptedException {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).setMMIOverride(value);
    }

    @And("I set Earthquake reports and read only information soil grade override to {string}")
    public void setSoilGradeOverride(String value) {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).setSoilGradeOverride(value);
    }

    @And("I verify that earthquake reports and read only information distance to controlling fault line miles is {string}")
    public void iVerifyDistanceToControllingFaultLineMiles(String value) {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).verifyDistanceToControllingFaultLineMiles(value);
    }

    @And("I verify that earthquake reports and read only information is the home located on a grade that is GT 20 in slope is {string}")
    public void iVerifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(String value) {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).verifyIsTheHomeLocatedOnAGradeThatIsGT20InSlope(value);
    }

    @And("I verify that earthquake reports and read only information is the home supported by stilts posts cantilevers or caissons is {string}")
    public void iVerifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(String value) {
        new EarthquakeReportsAndReadOnlyInformationBlock(driver).verifyIsTheHomeSupportedByStiltsPostsCantileversOrCaissons(value);
    }

    @And("I verify that basic dwelling is {string}")
    public void iVerifyDwelling(String value) {
        new EarthquakeBasicBlock(driver).verifyDwelling(value);
    }

    @And("I verify that basic other structures is {string}")
    public void iVerifyOtherStructures(String value) {
        new EarthquakeBasicBlock(driver).verifyOtherStructures(value);
    }

    @And("I set basic contents limit to {string}")
    public void setContentsLimit(String value) {
        new EarthquakeBasicBlock(driver).setContentsLimit(value);
    }

    @And("I set basic loss of use to {string}")
    public void setLossOfUse(String value) {
        new EarthquakeBasicBlock(driver).setLossOfUse(value);
    }

    @And("I verify that basic EQ deductible amount is {string}")
    public void iVerifyEQDeductibleAmount(String value) {
        new EarthquakeBasicBlock(driver).verifyEQDeductibleAmount(value);
    }

    @And("I verify that basic loss assessment coverage is {string}")
    public void iVerifyLossAssessmentCoverage(String value) {
        new EarthquakeBasicBlock(driver).verifyLossAssessmentCoverage(value);
    }

    @And("I set basic loss assessment override to {string}")
    public void setLossAssessmentOverride(String value) throws Throwable {
        new EarthquakeBasicBlock(driver).setLossAssessmentOverride(value);
    }

    @And("I set basic loss assessment coverage override to {string}")
    public void setLossAssessmentCoverageOverride(String value) {
        new EarthquakeBasicBlock(driver).setLossAssessmentCoverageOverride("Yes", value);
    }

    @And("I set basic loss assessment deductible to {string}")
    public void setLossAssessmentDeductible(String value) throws Throwable {
        new EarthquakeBasicBlock(driver).setLossAssessmentDeductible(value);
    }

    @And("I verify that basic earthquake deductible is {string}")
    public void iVerifyEarthquakeDeductible(String value) {
        new EarthquakeBasicBlock(driver).verifyEarthquakeDeductible(value);
    }

    @And("I verify that broad homeowners coverage limits dwelling is {string}")
    public void iVerifyHomeownersCoverageLimitsDwelling(String value) {
        new EarthquakeBroadBlock(driver).verifyHomeownersCoverageLimitsDwelling(value);
    }

    @And("I verify that broad homeowners other structures is {string}")
    public void iVerifyHomeownersOtherStructures(String value) {
        new EarthquakeBroadBlock(driver).verifyHomeownersOtherStructures(value);
    }

    @And("I verify that broad homeowners content is {string}")
    public void iVerifyHomeownersContent(String value) {
        new EarthquakeBroadBlock(driver).verifyHomeownersContent(value);
    }

    @And("I verify that broad homeowners loss of use is {string}")
    public void iVerifyHomeownersLossOfUse(String value) {
        new EarthquakeBroadBlock(driver).verifyHomeownersLossOfUse(value);
    }

    @And("I set broad do you wish to purchase agreed value earthquake coverage to {string}")
    public void setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(String value) throws Throwable {
        new EarthquakeBroadBlock(driver).setDoYouWishToPurchaseAgreedValueEarthquakeCoverage(value);
    }

    @And("I set broad earthquake dwelling to {string}")
    public void setBroadEarthquakeDwelling(String value) {
        new EarthquakeBroadBlock(driver).setEarthquakeDwelling("Yes", value);
    }

    @And("I set broad earthquake other structures to {string}")
    public void setEarthquakeOtherStructures(String value) {
        new EarthquakeBroadBlock(driver).setEarthquakeOtherStructures(value);
    }

    @And("I set broad earthquake content to {string}")
    public void setEarthquakeContent(String value) {
        new EarthquakeBroadBlock(driver).setEarthquakeContent(value);
    }

    @And("I set broad earthquake loss of use to {string}")
    public void setEarthquakeLossOfUse(String value) {
        new EarthquakeBroadBlock(driver).setEarthquakeLossOfUse(value);
    }

    @And("I verify that broad EQ deductible amount is {string}")
    public void iVerifyBroadEQDeductibleAmount(String value) {
        new EarthquakeBroadBlock(driver).verifyEQDeductibleAmount(value);
    }

    @And("I set broad loss assessment coverage to {string}")
    public void setLossAssessmentCoverage(String value) {
        new EarthquakeBroadBlock(driver).setLossAssessmentCoverage(value);
    }

    @And("I set broad loss assessment override to {string}")
    public void setBroadLossAssessmentOverride(String value) throws Throwable {
        new EarthquakeBroadBlock(driver).setLossAssessmentOverride(value);
    }

    @And("I set broad loss assessment coverage override to {string}")
    public void setBroadLossAssessmentCoverageOverride(String value, int i) throws Throwable {
        new EarthquakeBroadBlock(driver).setLossAssessmentCoverageOverrideHS("Yes", value,i);
    }

    @And("I set broad loss assessment deductible coverage to {string}")
    public void setLossAssessmentDeductibleCoverage(String lossAssessmentDedCov, int i) throws Throwable {
        new EarthquakeBroadBlock(driver).setLossAssessmentDeductibleCoverageHS(lossAssessmentDedCov,i);
    }

    @And("I set broad extend ensuing fungi increase for earthquake peril to {string}")
    public void setExtendEnsuingFungiIncreaseForEarthquakePeril(String value) throws Throwable {
        new EarthquakeBroadBlock(driver).setExtendEnsuingFungiIncreaseForEarthquakePeril(value);
    }

    @And("I set broad 5 percent of dwelling replacement cost to {string}")
    public void set5PercentOfDwellingReplacementCost(String value) throws Throwable {
        new EarthquakeBroadBlock(driver).set5PercentOfDwellingReplacementCost(value);
    }

    @And("I set broad earthquake deductible to {string}")
    public void setEarthquakeDeductible(String value) {
        new EarthquakeBroadBlock(driver).setEarthquakeDeductible("Yes", value);
    }

    @And("I set underwriting only increase max to 50 percent loss of use to {string}")
    public void setIncreaseMaxTo50PercentLossOfUse(String value) throws Throwable {
        new EarthquakeUnderwritingOnlyBlock(driver).setIncreaseMaxTo50PercentLossOfUse(value);
    }

    @And("I set underwriting only extended replacement cost to {string}")
    public void setExtendedReplacementCost(String value) throws Throwable {
        new EarthquakeUnderwritingOnlyBlock(driver).setExtendedReplacementCost(value);
    }

    @And("I verify Earthquake Report is pulled")
    public void isEQReportPulled() throws InterruptedException {
        pause(3);
        reportScreenshot("Earthquake Report" + System.currentTimeMillis(), "Earthquake Report Integration");
        iVerifyMMI("NotEmpty");
        iVerifySoilGrade("NotEmpty");
        iVerifySoilType("NotEmpty");
    }


}