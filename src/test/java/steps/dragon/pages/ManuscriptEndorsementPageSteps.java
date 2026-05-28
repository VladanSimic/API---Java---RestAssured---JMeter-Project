package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.ManuscriptEndorsementsPage;
import pages.blocks.ManuscriptEndorsementBlock;
import pages.blocks.ManuscriptEndorsementsDetailsSubPage;
import pages.blocks.PolicyInformationBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class ManuscriptEndorsementPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //CC pages and blocks steps - START
    @And("I fill out the manuscript endorsement page for CC line of business")
    public void iFillManuscriptEndorsementsPageCC() throws Throwable {
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageCC(data);
    }

    @And("I fill out the manuscript endorsement details for CC line of business")
    public void iFillAdditionalInterestsDetailsCC() throws Throwable {
        new ManuscriptEndorsementBlock(driver).fillManuscriptEndorsementsDetailsCC(data);
    }

    @And("I fill out the manuscript endorsement details sub page for CC line of business")
    public void iFillManuscriptEndorsementDetailsSubPage() throws Throwable {
        new ManuscriptEndorsementsDetailsSubPage(driver).fillManuscriptEndorsementDetailsSubPageCC(data);
    }
    //CC pages and blocks steps - END

    //PA pages and blocks steps - START
    @And("I fill out PA quote manuscript endorsements page")
    public void iFillOutManuscriptEndorsementsPagePA() throws Throwable {
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPagePA(data);
    }

    @And("I fill out PA endorsement manuscript endorsements page")
    public void iFillOutManuscriptEndorsementsPagePA_END() throws Throwable {
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPagePA_END(data);
    }

    @And("I fill out PA quote manuscript endorsement block")
    public void iFillOutManuscriptEndorsementsBlock() throws Throwable {
        new ManuscriptEndorsementBlock(driver).fillManuscriptEndorsementsDetailsPA(data);
    }

    @And("I fill out PA quote manuscript endorsement details sub page block")
    public void iFillOutManuscriptEndorsementsDetailsSubPageBlock() throws Throwable {
        new ManuscriptEndorsementsDetailsSubPage(driver).fillManuscriptEndorsementDetailsSubPagePA(data);
    }

    @And("I fill out PA endorsement manuscript endorsement block")
    public void iFillOutManuscriptEndorsementsBlock_END() throws Throwable {
        new ManuscriptEndorsementBlock(driver).fillManuscriptEndorsementsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement manuscript endorsement details sub page block")
    public void iFillOutManuscriptEndorsementsDetailsSubPageBlock_END() throws Throwable {
        new ManuscriptEndorsementsDetailsSubPage(driver).fillManuscriptEndorsementDetailsSubPagePA_END(data);
    }
    //PA pages and blocks steps - END

    // Manuscript endorsement block steps - START
    @And("I set the manuscript endorsements {int} type to {string} PA")
    public void iSetManuscriptEndorsementTypePA(int index, String value) throws Throwable {
        new ManuscriptEndorsementBlock(driver).setManuscriptEndorsementTypePA(value, index);
    }

    @And("I set the manuscript endorsements {int} title to {string} PA")
    public void iSetManuscriptEndorsementTitlePA(int index, String value) throws Throwable {
        new ManuscriptEndorsementBlock(driver).setManuscriptEndorsementTitlePA(value, index);
    }

    @And("I set the manuscript endorsement {int} annual manual premium to {string} PA")
    public void iSetManuscriptEndorsementAnnualManualPremiumPA(int index, String value) throws Throwable {
        new ManuscriptEndorsementBlock(driver).setManuscriptEndorsementAnnualManualPremiumPA(value, index);
    }
    // Manuscript endorsement block steps - END

    // Manuscript endorsement details sub page steps - START
    @And("I set manuscript endorsement sub page vehicle to {string} and premium to {string}")
    public void iSetVehicle(String vehicle, String premium) throws Throwable {
        new ManuscriptEndorsementsDetailsSubPage(driver).addVehicle(vehicle, premium);
    }

    @And("I set manuscript endorsement sub page premium adjustment rationale to {string}")
    public void iSetPremiumAdjustmentRationale(String value) {
        new ManuscriptEndorsementsDetailsSubPage(driver).setPremiumAdjustmentRationale(value);
    }

    @And("I set manuscript endorsement sub page endorsement text to {string}")
    public void iSetEndorsementText(String value) {
        new ManuscriptEndorsementsDetailsSubPage(driver).setEndorsementText(value);
    }
    // Manuscript endorsement details sub page steps - END

    @And("I click add manuscript endorsement")
    public void addManuscriptEndorsement() {
        new ManuscriptEndorsementBlock(driver).clickAdd();
    }

    @And("I set the manuscript endorsements {int} type to {string}")
    public void setType(int index, String value) {
        new ManuscriptEndorsementBlock(driver).setTypeCC(value, index - 1);
    }

    @And("I set the manuscript endorsements {int} title to {string}")
    public void setTitle(int index, String value) {
        new ManuscriptEndorsementBlock(driver).setTitle(value, index - 1);
    }

    @And("I set the manuscript endorsements {int} manual premium to {string}")
    public void setManualPremium(int index, String value) {
        new ManuscriptEndorsementBlock(driver).setManualPremium(value, index - 1);
    }

    @And("I set the manuscript endorsements annual ROL {int} override to {string}")
    public void setAnnualROLOverride(int index, String value) {
        new ManuscriptEndorsementBlock(driver).setAnnualROLOverride(value, index - 1);
    }

    @And("I set the manuscript endorsements system non wind annual {int} ROL to {string}")
    public void setSystemNonWindAnnualROL(int index, String value) {
        new ManuscriptEndorsementBlock(driver).setSystemNonWindAnnualROL(value, index);
    }

    @And("I set the manuscript endorsements system wind annual {int} ROL to {string}")
    public void setSystemWindAnnualROL(int index, String value) {
        new ManuscriptEndorsementBlock(driver).setSystemWindAnnualROL(value, index);
    }

    @And("I verify that manuscript endorsements type is {string}")
    public void iVerifyManuscriptEndorsementType(String value) {
        new ManuscriptEndorsementsDetailsSubPage(driver).verifyManuscriptEndorsementType(value);
    }

    @And("I verify that manuscript endorsements system non wind annual ROL is {string}")
    public void iVerifySystemNonWindAnnualROL(String value) {
        new ManuscriptEndorsementsDetailsSubPage(driver).verifySystemNonWindAnnualROL(value);
    }

    @And("I verify that manuscript endorsements system wind annual ROL is {string}")
    public void iVerifySystemWindAnnualROL(String value) {
        new ManuscriptEndorsementsDetailsSubPage(driver).verifySystemWindAnnualROL(value);
    }

    @And("I verify that manuscript endorsements system wildfire annual ROL is {string}")
    public void iVerifySystemWildfireAnnualROL(String value) {
        new ManuscriptEndorsementsDetailsSubPage(driver).verifySystemWildfireAnnualROL(value);
    }

    @And("I set manuscript endorsements details endorsement text premium adjustment rationale to {string}")
    public void setEndorsementTextPremiumAdjustmentRationale(String value) {
        new ManuscriptEndorsementsDetailsSubPage(driver).setEndorsementTextPremiumAdjustmentRationale(value);
    }

}