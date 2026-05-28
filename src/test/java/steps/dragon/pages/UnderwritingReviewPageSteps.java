package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.UnderwritingReferralsPage;
import pages.blocks.ReferralsBlock;
import pages.blocks.UnderwritingScoringGradeOutputBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class UnderwritingReviewPageSteps extends BaseTest {

    public UnderwritingReviewPageSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I verify if location grade failed")
    public void verifyIfLocationGradeFailed() {
        new UnderwritingReferralsPage(driver).didHomeGradeFail();
    }

    @And("I verify if Auto grade failed")
    public void verifyIfAutoGradeFailed() {
        new UnderwritingReferralsPage(driver).didAutoGradeFail();
    }

    @And("I verify if Excess grade failed")
    public void verifyIfExcessGradeFailed() {
        new UnderwritingReferralsPage(driver).didExcessGradeFail();
    }

    @And("I verify if there is no PURE Analytics Grade")
    public void verifyIfPUREAnalyticsGradeIsNotDisplayed() {
        new UnderwritingReferralsPage(driver).isThereNoPureAnalytics();
    }

    @And("I verify if OFAC returned {string}")
    public void verifyOFAC(String value) throws Throwable {
        new ReferralsBlock(driver).verifyOFACReferral(value);
    }

    @And("I verify if there are {int} OFAC referrals")
    public void verifyOFAC(int num) throws Throwable {
        new ReferralsBlock(driver).verifyOFACReferral(num);
    }

    @And("I save {string} Home Predictive Analysis results in data")
    public void saveHomePredictiveResults(String trx) {
        new UnderwritingScoringGradeOutputBlock(driver).insertHomeAnalyticsIntoData(trx);
    }

    @And("I verify Home Predictive Analysis results based on {string} data")
    public void iVerifyHomePredictiveBasedOnTrx(String trx) {
        new UnderwritingScoringGradeOutputBlock(driver).verifyHomePredictiveBasedOnSavedValues(data, trx);
    }

    @And("I verify Home Predictive Analysis for all locations if grade returned is {string}")
    public void iVerifyHomePredictiveForAllLocationsValueReturned(String value) {
        new UnderwritingScoringGradeOutputBlock(driver).verifyAllHomeNonCatGradeValues(value);
    }

    @And("I verify Old Home Predictive Analysis for all locations if grade returned is {string}")
    public void iVerifyOldHomePredictiveForAllLocationsValueReturned(String value) {
        new UnderwritingScoringGradeOutputBlock(driver).verifyOldHomeAnalyticsModelForAllLocations(value);
    }

    @And("I verify Auto Predictive Analysis for all if grade returned is {string}")
    public void iVerifyAutoPredictiveForAllValueReturned(String value) {
        new UnderwritingScoringGradeOutputBlock(driver).verifyAllAutoGradeValues(value);
    }

    @And("I verify Excess Predictive Analysis for all if grade returned is {string}")
    public void iVerifyExcessPredictiveForAllValueReturned(String value) {
        new UnderwritingScoringGradeOutputBlock(driver).verifyAllExcessGradeValues(value);
    }

    @And("I set all referrals to yes")
    public void iOverrideReferralsToYes() throws Throwable {
        new ReferralsBlock(driver).setAllReferralsToYes();
    }

    @And("I verify there are no generic failure uw referrals displayed on uw page")
    public void verifyNoGenericFailureReferrals() throws Throwable {
        new ReferralsBlock(driver).verifyGenericErrorReferralsNotPresent();
    }

    @And("I verify that the referral {string} is {string}")
    public void iVerifyThatTheReferralIsNotOverridable(String referral, String approavableOrNot) {
        new ReferralsBlock(driver).confirmReferralCanBeApproved(referral, approavableOrNot);
    }

    @And("I verify that referral {string} is a {string} type of referral")
    public void iVerifyThatReferralIsOfType(String referralText, String referralType) {
        new ReferralsBlock(driver).verifyReferralType(referralText, referralType);
    }
}
