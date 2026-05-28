package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.ApplicationPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class FloodCoveragePageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I verify Primary Flood Coverage Block Limit Dwelling and Other Structures is {string}")
    public void iVerifyPFDwellingAndOtherStructures(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyDwellingOtherStructures(value);
    }

    @And("I verify Primary Flood Coverage Block Limit Contents is {string}")
    public void iVerifyPFContents(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyContents(value);
    }

    @And("I verify Primary Flood Coverage Block Loss of Use is {string}")
    public void iVerifyPFLossOfUse(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyLossOfUse(value);
    }

    @And("I verify Primary Flood Coverage Block Limit Deductible is {string}")
    public void iVerifyPFDeductible(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyDeductible(value);
    }

    @And("I verify Primary Flood Coverage Block Limit Basement Improvements is {string}")
    public void iVerifyPFBasementImprovements(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyBasementImprovements(value);
    }

    @And("I verify Primary Flood Coverage Block Limit Basement Contents is {string}")
    public void iVerifyPFBasementContents(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyBasementContents(value);
    }

    @And("I verify Primary Flood Coverage Block Limit Elevated Risk Credit is {string}")
    public void iVerifyPFElevatedRiskCredit(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyElevatedRiskCredit(value);
    }

    @And("I verify Primary Flood Coverage Block Limit High PML Load is {string}")
    public void iVerifyPFHighPmlLoad(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyHighPmlLoad(value);
    }

    @And("I verify Primary Flood Coverage Block Eligibility Response is {string}")
    public void iVerifyPFEligibilityResponse(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyEligibilityResponse(value);
    }

    @And("I verify Contents on Flood Surplus Lines Policy Page is {string}")
    public void iVerifyContentsOnFSCoverPage(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyContentsOnly(value);
    }

    @And("I verify Dwelling on Flood Surplus Lines Policy Page is {string}")
    public void iVerifyDwellingOnFSCoverPage(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyDwellingOnly(value);
    }

    @And("I verify Other Structures on Flood Surplus Lines Policy Page is {string}")
    public void iVerifyOtherStructuresOnFSCoverPage(String value) {
        new PrimaryFloodCoverageBlock(driver).verifyOtherStructuresOnly(value);
    }

}