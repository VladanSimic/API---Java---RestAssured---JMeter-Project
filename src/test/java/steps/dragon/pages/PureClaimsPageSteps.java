package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.PureManualClaimsPage;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class PureClaimsPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I add a new manual claim on Pure Claims page")
    public void IAddaNewManualClaimOnPureClaimsPage() throws Throwable {
        new PureManualClaimsPage(driver).clickAddBtn();
    }

    @Then("I verify that the {string} field is {string} on Pure Claims Page")
    public void IVerifyThatTheVehicleTypeFieldIsVisibleOnPureClaimsPage(String text, String expectation) throws Throwable {
        new PureManualClaimsPage(driver).verifyElementDisplayedOnUI(text, expectation);
    }

    @Then("I Verify That The Vehicle Type Field Has The Following Options")
    public void IVerifyThatTheVehicleTypeFieldHasTheFollowingOptions() throws Throwable {
       new PureManualClaimsPage(driver).clickVehicleTypeBtn();
    }

    @And("I Verify That The Pure Manual Claims Tab Is Not Visible")
    public void IVerifyThatThePureManualClaimsTabIsNotVisible() {
        new PureManualClaimsPage(driver).isPureClaimsTabVisible();
    }


    @Then("I Verify That Driver Is Changed To Rated Driver")
    public void IVerifyThatDriverIsChangedToRatedDriver() {
        new PureManualClaimsPage(driver).isRatedDriverVisible();
    }

    @And("I Verify That Incident Is Changed To Rated Accident")
    public void IVerifyThatIncidentIsChangedToRatedAccident() {
        new PureManualClaimsPage(driver).isRatedAccidentVisible();
    }

    @And("I Verify That Vehicle Type Field is {string}")
    public void IVerifyThatVehicleTypeFieldIsNotMandatory(String mandatoryYesOrNo) {
        new PureManualClaimsPage(driver).isVehicleTypeMandatory(mandatoryYesOrNo);
    }

    @And("I Verify That Claim Operator Field Is Visible")
    public void IVerifyThatClaimOperatorFieldIsVisible() {
        new PureManualClaimsPage(driver).isClaimOperatorVisible();
    }

    @Then("I fill out {string} Claim Mandatory Fields and Save Claim")
    public void IfilloutClaimMandatoryFieldsandSaveClaim(String LOB, DataTable table) throws Throwable {
        new PureManualClaimsPage(driver).fillOutManualClaimInfo(LOB, data, table);
    }

    @And("I Verify That Vehicle Involved Field is {string}")
    public void IVerifyThatVehicleInvolvedFieldIsNotMandatory(String mandatoryYesOrNo) {
        new PureManualClaimsPage(driver).isVehicleInvolvedMandatory(mandatoryYesOrNo);
    }

    @And("I Verify That Column Claim Number Is Visible On Customer Summary Page")
    public void IVerifyThatColumnClaimNumberIsVisibleOnCustomerSummaryPage() {
        new PureManualClaimsPage(driver).isClaimNumberColumnVisible();
    }
    @And("I Verify That Column Claim Number Is Not Visible On Customer Summary Page")
    public void IVerifyThatColumnClaimNumberIsNotVisibleOnCustomerSummaryPage() {
        new PureManualClaimsPage(driver).isClaimNumberColumnNotVisible();
    }

    @And("I Verify that Claim Loss Cause Field Is Visible")
    public void IVerifythatClaimLossCauseFieldIsVisible() {
        new PureManualClaimsPage(driver).isClaimLossCauseVisisble();
    }

    @And("I Fill Out Multiple Manual Claims For {string} and Save Them")
    public void FillOutMultipleManualClaimsandSaveThem(String LOB, DataTable table) throws Throwable {
        new PureManualClaimsPage(driver).fillOutMultipleManualClaims(LOB, data, table);
    }

    @And("I click previous losses Yes Button")
    public void iClickPreviousLossesYesButton() throws Throwable {
        new PureManualClaimsPage(driver).clickPrevLossesYesBtn();
    }

    @And("I click Yes button for any Pure claims on Pure claims page")
    public void iClickYesButtonOnPureClaimsPage() throws Throwable {
        new PureManualClaimsPage(driver).clickPrevLossesYesBtn();
    }

    @Then("I add an auto claim on watercraft Pure Claims page")
    public void iAddAnAutoClaimOnWatercraftPureClaimsPage() {
        new PureManualClaimsPage(driver).clickAddForAutoClaimOnWcPureClaims();
    }
}
