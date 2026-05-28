package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.PreviousClaimLossesPage;
import pages.blocks.AutomatedLossDetailsBlock;
import pages.blocks.LossClaimHistoryBlock;
import pages.blocks.PreviousLossDetailsBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class PreviousClaimLossesPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the previous losses coverages page for CC line of business")
    public void iFillOutPreviousLossesCoveragesPageCC() throws Throwable {
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageCC(data);
    }

    @And("I fill out the loss claim history details for CC line of business")
    public void iFillLossClaimHistoryDetailCC() throws Throwable {
        new LossClaimHistoryBlock(driver).fillLossClaimHistoryDetailCC(data);
    }

    @And("I fill out the previous loss details for CC line of business")
    public void iFillPreviousLossDetailsCC() throws Throwable {
        new PreviousLossDetailsBlock(driver).fillPreviousLossDetailCC(data);
    }

    @And("I fill out the automated loss details for CC line of business")
    public void iFillAutomatedLossDetailsCC() throws Throwable {
        new AutomatedLossDetailsBlock(driver).fillAutomatedLossDetailCC(data);
    }

    @And("I set loss claim history any prior losses to {string}")
    public void setPriorLosses(String value) throws Throwable {
        new LossClaimHistoryBlock(driver).setPriorLosses(value);
    }

    @And("I set the previous loss details {int} source to {string}")
    public void setSource(int index, String value) throws Throwable {
        new PreviousLossDetailsBlock(driver).setSource(value, index);
    }

    @And("I set the previous loss details loss {int} date to {string}")
    public void setLossDate(int index, String value) throws Throwable {
        new PreviousLossDetailsBlock(driver).setLossDate(value, index);
    }

    @And("I set the previous loss details loss {int} type to {string}")
    public void setLossType(int index, String value) throws Throwable {
        new PreviousLossDetailsBlock(driver).setLossType(value, index);
    }

    @And("I set the previous loss details amount {int} paid to {string}")
    public void setAmountPaid(int index, String value) throws Throwable {
        new PreviousLossDetailsBlock(driver).setAmountPaid(value, index);
    }

    @And("I set the previous loss details claim {int} closed to {string}")
    public void setClaimClosed(int index, String value) throws Throwable {
        new PreviousLossDetailsBlock(driver).setClaimClosed(value, index);
    }

    @And("I verify if CLUE Data is {string} on previous claim losses page")
    public void iVerifyCLUEDataIsReturned(String value) throws Throwable {
        new PreviousClaimLossesPage(driver).verifyIfCLUEDataReturned(value);
    }

    @And("I delete previous loss {int} on previous claim losses page")
    public void iDeletePreviousLoss(int index) throws Throwable {
        new PreviousLossDetailsBlock(driver).deleteLoss(index);
    }

    @And("I click add previous loss on previous claim losses page")
    public void iClickAddPreviousLoss() throws Throwable {
        new PreviousLossDetailsBlock(driver).clickAdd();
    }

}