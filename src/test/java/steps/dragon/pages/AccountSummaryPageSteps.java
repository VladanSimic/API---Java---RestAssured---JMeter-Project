package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.AccountSummaryPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class AccountSummaryPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote account summary page")
    public void iFillOutAccountSummaryPagePA() throws Throwable {
        new AccountSummaryPage(driver).fillAccountSummaryPagePA(data);
    }

    @And("I fill out PA endorsement account summary page")
    public void iFillOutAccountSummaryPagePA_END() throws Throwable {
        new AccountSummaryPage(driver).fillAccountSummaryPagePA_END(data);
    }

    @And("I fill out PA quote account summary credit score block block")
    public void iFillOutCreditScoreBlock() {
        new CreditScoreBlock(driver).fillCreditScoreDetailsPA(data);
    }

    @And("I fill out PA quote account summary summary of vehicles block")
    public void iFillOutAccountSummaryOfVehiclesBlock() {
        new SummaryOfVehiclesBlock(driver).fillSummaryOfVehiclesDetailsPA(data);
    }

    @And("I fill out PA quote account summary incidents block")
    public void iFillOutAccountSummaryIncidentsBlock() {
        new IncidentsBlock(driver).fillIncidentDetailsPA(data);
    }

    @And("I fill out PA quote account summary total number accidents violations in policy block")
    public void iFillOutAccountSummaryTotalNumberAccidentsViolationsInPolicyBlock() {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).fillTotalNumberAccidentsViolationsInPolicyDetailsPA(data);
    }

    @And("I fill out PA quote account summary discounts and surcharges block")
    public void iFillOutAccountSummaryDiscountsAndSurchargesBlock() throws Throwable {
        new DiscountsAndSurchargesBlock(driver).fillDiscountsAndSurchargesDetailsPA(data);
    }

    @And("I fill out PA endorsement account summary credit score block block")
    public void iFillOutCreditScoreBlock_END() {
        new CreditScoreBlock(driver).fillCreditScoreDetailsPA_END(data);
    }

    @And("I fill out PA endorsement account summary summary of vehicles block")
    public void iFillOutAccountSummaryOfVehiclesBlock_END() {
        new SummaryOfVehiclesBlock(driver).fillSummaryOfVehiclesDetailsPA_END(data);
    }

    @And("I fill out PA endorsement account summary incidents block")
    public void iFillOutAccountSummaryIncidentsBlock_END() {
        new IncidentsBlock(driver).fillIncidentDetailsPA_END(data);
    }

    @And("I fill out PA endorsement account summary total number accidents violations in policy block")
    public void iFillOutAccountSummaryTotalNumberAccidentsViolationsInPolicyBlock_END() {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).fillTotalNumberAccidentsViolationsInPolicyDetailsPA_END(data);
    }

    @And("I fill out PA endorsement account summary discounts and surcharges block")
    public void iFillOutAccountSummaryDiscountsAndSurchargesBlock_END() throws Throwable {
        new DiscountsAndSurchargesBlock(driver).fillDiscountsAndSurchargesDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    // Credit Score block steps - START
    @And("I verify account summary credit score member is {string}")
    public void iVerifyMember(String value) {
        new CreditScoreBlock(driver).verifyMember(value);
    }

    @And("I verify account summary credit score insurance score model is {string}")
    public void iVerifyInsuranceScoreModel(String value) {
        new CreditScoreBlock(driver).verifyInsuranceScoreModel(value);
    }

    @And("I verify account summary credit score order date is {string}")
    public void iVerifyOrderDate(String value) {
        new CreditScoreBlock(driver).verifyOrderDate(value);
    }

    @And("I verify account summary credit score end date is {string}")
    public void iVerifyEndDate(String value) {
        new CreditScoreBlock(driver).verifyEndDate(value);
    }

    @And("I verify account summary credit score insurance score is {string}")
    public void iVerifyInsuranceScore(String value) {
        new CreditScoreBlock(driver).verifyInsuranceScore(value);
    }

    @And("I verify account summary credit score updated by is {string}")
    public void iVerifyUpdatedBy(String value) {
        new CreditScoreBlock(driver).verifyUpdatedBy(value);
    }
    // CreditScore block steps - END

    //summary of vehicles block steps - START
    @And("I verify account summary summary of vehicles vehicle {int} is {string}")
    public void iVerifySummaryOfVehiclesVehicle(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyVehicle(value, i);
    }

    @And("I verify account summary summary of vehicles vehicle type {int} is {string}")
    public void iVerifySummaryOfVehiclesVehicleType(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyVehicleType(value, i);
    }

    @And("I verify account summary summary of vehicles usage {int} is {string}")
    public void iVerifySummaryOfVehiclesUsage(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyUsage(value, i);
    }

    @And("I verify account summary summary of vehicles mileage band year {int} is {string}")
    public void iVerifySummaryOfVehiclesMileageBandYear(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyMileageBandYear(value, i);
    }

    @And("I verify account summary summary of assigned driver {int} is {string}")
    public void iVerifySummaryOfVehiclesAssignedDriver(int i, String value) {
        new SummaryOfVehiclesBlock(driver).verifyAssignedDriver(value, i);
    }
    //Summary of vehicles Block steps - END

    //incidents block steps - START
    @And("I verify account summary incidents driver {int} is {string}")
    public void iVerifyIncident(int i, String value) {
        new IncidentsBlock(driver).verifyDriver(value, i);
    }

    @And("I verify account summary incidents source {int} is {string}")
    public void iVerifyIncidentsSource(int i, String value) {
        new IncidentsBlock(driver).verifySource(value, i);
    }

    @And("I verify account summary incident violation type {int} is {string}")
    public void iVerifyIncidentsViolationType(int i, String value) {
        new IncidentsBlock(driver).verifyViolationType(value, i);
    }

    @And("I verify account summary incident date of violation {int} is {string}")
    public void iVerifyIncidentsDateOfViolation(int i, String value) {
        new IncidentsBlock(driver).verifyDateOfViolation(value, i);
    }
    //incidents block steps - END

    //TotalNumberAccidentsViolationsInPolicy block steps - START
    @And("I verify account summary total number of accidents chargeable accidents is {string}")
    public void iVerifyChargeableAccidents(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyChargeableAccidents(value);
    }

    @And("I verify account summary total number of comp claims is {string}")
    public void iVerifyCOMPClaims(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyCOMPClaims(value);
    }

    @And("I verify account summary total number of aaf 36 month is {string}")
    public void iVerifyAAF36Month(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyAAF36Month(value);
    }

    @And("I verify account summary total number of naf 60 month is {string}")
    public void iVerifyNAF60Month(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyNAF60Month(value);
    }

    @And("I verify account summary total number of 3 years clean record is {string}")
    public void iVerifyYears3CleanRecord(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyYears3CleanRecord(value);
    }

    @And("I verify account summary total number of chargeable violations is {string}")
    public void iVerifyChargeableViolations(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyChargeableViolations(value);
    }

    @And("I verify account summary total number of min no waiver is {string}")
    public void iVerifyMINNoWaiver(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyMINNoWaiver(value);
    }

    @And("I verify account summary total number of naf 36 month is {string}")
    public void iVerifyNAF36Month(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyNAF36Month(value);
    }

    @And("I verify account summary total number of 5 years clean record is {string}")
    public void iVerifyYears5CleanRecord(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyYears5CleanRecord(value);
    }

    @And("I verify account summary total number of non chargeable violations is {string}")
    public void iVerifyNonChargeableViolations(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyNonChargeableViolations(value);
    }

    @And("I verify account summary total number of aaf 60 month is {string}")
    public void iVerifyAAF60Month(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyAAF60Month(value);
    }

    @And("I verify account summary total number of moving viol 60 month is {string}")
    public void iVerifyMovingViol60Month(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyMovingViol60Month(value);
    }

    @And("I verify account summary total number of violations waived is {string}")
    public void iVerifyViolationsWaived(String value) {
        new TotalNumberAccidentsViolationsInPolicyBlock(driver).verifyViolationsWaived(value);
    }
    //TotalNumberAccidentsViolationsInPolicy block steps - END

    //Discounts and surcharges block steps - START
    @And("I set account summary discounts and surcharges covid mileage credit to {string}")
    public void iSetDiscountsAndSurchargesCovidMileageCredit(String value) throws Throwable {
        new DiscountsAndSurchargesBlock(driver).setDiscountsAndSurchargesCovidMileageCredit(value);
    }

    @And("I set account summary discounts and surcharges trx number to {string}")
    public void iSetDiscountsAndSurchargesTrxNumber(String value) {
        new DiscountsAndSurchargesBlock(driver).setDiscountsAndSurchargesTrxNumber(value);
    }

    @And("I set account summary discounts and surcharges is this original covid19 transaction to {string}")
    public void iSetDiscountsAndSurchargesIsThisOriginalCovid19Transaction(String value) {
        new DiscountsAndSurchargesBlock(driver).setDiscountsAndSurchargesIsThisOriginalCovid19Transaction(value);
    }
    //Discounts and surcharges block steps - START

}