package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.PolicySummaryPage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class PolicySummaryPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote policy summary page")
    public void iFillOutPolicySummaryPagePA() throws Throwable {
        new PolicySummaryPage(driver).fillPolicySummaryPagePA(data);
    }

    @And("I fill out PA endorsement policy summary page")
    public void iFillOutPolicySummaryPagePA_END() throws Throwable {
        new PolicySummaryPage(driver).fillPolicySummaryPagePA_END(data);
    }

    @And("I fill out PA quote policy summary summary of vehicles block")
    public void iFillOutSummaryOfVehiclesBlock() {
        new SummaryOfVehiclesBlock(driver).fillSummaryOfVehiclesDetailsPA(data);
    }

    @And("I fill out PA quote policy summary incidents block")
    public void iFillOutIncidentsBlock() {
        new IncidentsBlock(driver).fillIncidentDetailsPA(data);
    }

    @And("I fill out PA quote policy summary driver incidents included in household averaging block")
    public void iFillOutDriverIncidentsIncludedInHouseholdAveragingBlock() {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA(data);
    }

    @And("I fill out PA quote policy summary discounts block")
    public void iFillOutDiscountsBlock() {
        new DiscountsBlock(driver).fillDiscountsDetailsPA(data);
    }

    @And("I fill out PA quote policy summary total number of youthful and performance vehicles block")
    public void iFillOutTotalNumberOfYouthfulAndPerformanceVehiclesBlock() {
        new TotalNumberOfYouthfulAndPerformanceVehiclesBlock(driver).fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA(data);
    }

    @And("I fill out PA quote policy summary discounts and surcharges block")
    public void iFillOutDiscountsAndSurchargesBlock() throws Throwable {
        new DiscountsAndSurchargesBlock(driver).fillDiscountsAndSurchargesDetailsPA(data);
    }

    @And("I fill out PA endorsement policy summary summary of vehicles block")
    public void iFillOutSummaryOfVehiclesBlock_END() {
        new SummaryOfVehiclesBlock(driver).fillSummaryOfVehiclesDetailsPA_END(data);
    }

    @And("I fill out PA endorsement policy summary incidents block")
    public void iFillOutIncidentsBlock_END() {
        new IncidentsBlock(driver).fillIncidentDetailsPA_END(data);
    }

    @And("I fill out PA endorsement policy summary driver incidents included in household averaging block")
    public void iFillOutDriverIncidentsIncludedInHouseholdAveragingBlock_END() {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_END(data);
    }

    @And("I fill out PA endorsement policy summary discounts block")
    public void iFillOutDiscountsBlock_END() {
        new DiscountsBlock(driver).fillDiscountsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement policy summary total number of youthful and performance vehicles block")
    public void iFillOutTotalNumberOfYouthfulAndPerformanceVehiclesBlock_END() {
        new TotalNumberOfYouthfulAndPerformanceVehiclesBlock(driver).fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_END(data);
    }

    @And("I fill out PA endorsement policy summary discounts and surcharges block")
    public void iFillOutDiscountsAndSurchargesBlock_END() throws Throwable {
        new DiscountsAndSurchargesBlock(driver).fillDiscountsAndSurchargesDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    //summary of vehicles block steps - START
    @And("I verify policy summary summary of vehicles vehicle {int} is {string}")
    public void iVerifySummaryOfVehiclesVehicle(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyVehicle(value, i);
    }

    @And("I verify policy summary summary of vehicles vehicle type {int} is {string}")
    public void iVerifySummaryOfVehiclesVehicleType(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyVehicleType(value, i);
    }

    @And("I verify policy summary summary of vehicles usage {int} is {string}")
    public void iVerifySummaryOfVehiclesUsage(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyUsage(value, i);
    }

    @And("I verify policy summary summary of vehicles mileage band year {int} is {string}")
    public void iVerifySummaryOfVehiclesMileageBandYear(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyMileageBandYear(value, i);
    }

    @And("I verify policy summary summary of assigned driver {int} is {string}")
    public void iVerifySummaryOfVehiclesAssignedDriver(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyAssignedDriver(value, i);
    }
    //summary of vehicles block steps - END

    //incidents block steps - START
    @And("I verify policy summary incidents driver {int} is {string}")
    public void iVerifyIncident(int i, String value) {
        new IncidentsBlock(driver).verifyDriver(value, i);
    }

    @And("I verify policy summary incidents source {int} is {string}")
    public void iVerifyIncidentsSource(int i, String value) {
        new IncidentsBlock(driver).verifySource(value, i);
    }

    @And("I verify policy summary incident violation type {int} is {string}")
    public void iVerifyIncidentsViolationType(int i, String value) {
        new IncidentsBlock(driver).verifyViolationType(value, i);
    }

    @And("I verify policy summary incident date of violation {int} is {string}")
    public void iVerifyIncidentsDateOfViolation(int i, String value) {
        new IncidentsBlock(driver).verifyDateOfViolation(value, i);
    }
    //incidents block steps - END

    //Driver incidents included in household averaging blok steps - START
    @And("I verify policy summary driver incidents included additional driver is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsAdditionalDriver(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyAdditionalDriver(value, row, col);
    }

    @And("I verify policy summary driver incidents included aaf is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsAAF(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyAAF(value, row, col);
    }

    @And("I verify policy summary driver incidents included afb is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsAFB(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyAFB(value, row, col);
    }

    @And("I verify policy summary driver incidents included cpa is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsCPA(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyCPA(value, row, col);
    }

    @And("I verify policy summary driver incidents included maj is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsMAJ(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyMAJ(value, row, col);
    }

    @And("I verify policy summary driver incidents included min is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsMIN(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyMIN(value, row, col);
    }

    @And("I verify policy summary driver incidents included spd is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsSPD(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifySPD(value, row, col);
    }

    @And("I verify policy summary driver incidents included ind is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsIND(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyIND(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure aaf is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPUREAAF(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPUREAAF(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure afb is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPUREAFB(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPUREAFB(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure cpa is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPURECPA(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPURECPA(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure maj is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPUREMAJ(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPUREMAJ(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure min is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPUREMIN(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPUREMIN(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure naf is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPURENAF(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPURENAF(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure spd is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPURESPD(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPURESPD(value, row, col);
    }

    @And("I verify policy summary driver incidents included pure ind is {string} for row {int} for {int} column")
    public void iVerifyDriverIncidentsPUREIND(String value, int row, int col) {
        new DriverIncidentsIncludedInHouseholdAveragingBlock(driver).verifyPUREIND(value, row, col);
    }
    //Driver incidents included in household averaging block steps - END

    //Discounts block steps - START
    @And("I verify policy summary discounts 3 years clean record is {string}")
    public void iVerifyDiscounts3YearsCleanRecord(String value) {
        new DiscountsBlock(driver).verify3YearsCleanRecord(value);
    }
    @And("I verify policy summary discounts {string} is {string}")
    public void iVerifyDiscounts3And5YearsCleanRecordDisplayedOrNot(String text, String displayedOrNot ) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions=new CommonComponentsAndActions(driver);
        commonComponentsAndActions.goToPage("Policy Summary");
        commonComponentsAndActions.verifyElementOnUI(text, displayedOrNot);
    }
    @And("I verify policy summary discounts 5 years clean record is {string}")
    public void iVerifyDiscounts5YearsCleanRecord(String value) {
        new DiscountsBlock(driver).verify5YearsCleanRecord(value);
    }
    //Discounts block steps - END

    //Total number of youthful and performance vehicles block steps - START
    @And("I verify policy summary total number of youthful drivers is {string}")
    public void iVerifyTotalNumberOfYouthfulDrivers(String value) {
        new TotalNumberOfYouthfulAndPerformanceVehiclesBlock(driver).verifyTotalNumberOfYouthfulDrivers(value);
    }

    @And("I verify policy summary total number of performance vehicles is {string}")
    public void iVerifyTotalNumberOfPerformanceVehicles(String value) {
        new TotalNumberOfYouthfulAndPerformanceVehiclesBlock(driver).verifyTotalNumberOfPerformanceVehicles(value);
    }
    //Total number of youthful and performance vehicles block steps - END

    //Discounts and surcharges block steps - START
    @And("I set policy summary discounts and surcharges covid mileage credit to {string}")
    public void iSetDiscountsAndSurchargesCovidMileageCredit(String value) throws Throwable {
        new DiscountsAndSurchargesBlock(driver).setDiscountsAndSurchargesCovidMileageCredit(value);
    }

    @And("I set policy summary discounts and surcharges trx number to {string}")
    public void iSetDiscountsAndSurchargesTrxNumber(String value) {
        new DiscountsAndSurchargesBlock(driver).setDiscountsAndSurchargesTrxNumber(value);
    }

    @And("I set policy summary discounts and surcharges is this original covid19 transaction to {string}")
    public void iSetDiscountsAndSurchargesIsThisOriginalCovid19Transaction(String value) {
        new DiscountsAndSurchargesBlock(driver).setDiscountsAndSurchargesIsThisOriginalCovid19Transaction(value);
    }
    //Discounts and surcharges block steps - START

}