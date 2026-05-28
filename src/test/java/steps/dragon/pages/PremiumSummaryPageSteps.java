package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PolicyPage;
import pages.PolicySummaryPage;
import pages.PremiumDetailPage;
import pages.PremiumSummaryPage;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class PremiumSummaryPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I validate that FL Home 1.75% discount matches for {int} locations on transaction {string}")
    public void iValidateFLHomeTaxDiscount(int expectedLoc, String transaction) throws Throwable {
        new PremiumSummaryPage(driver).validateFLHomeTaxDiscount(expectedLoc, transaction);
    }

    @And("I validate homeowners base rate factors based on base rate excel file data")
    public void iValidateHOBaseRateFactors(DataTable table) {
        PremiumDetailPage page = new PremiumDetailPage(driver);

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String address = columns.get(0);
            String residenceType = columns.get(1);
            if (residenceType.equalsIgnoreCase("Homeowner"))
                page.validateFactor(address, "Base Premium", "Base Rate", data.get("ExpectedBaseRate_HO"), "+");
            else
                page.validateFactor(address, "Base Premium", "Base Rate", data.get("ExpectedBaseRate_CCT"), "+");
        }
    }

    @And("I validate Premium Summary Table on {string} transaction")
    public void iValidatePremiumSummaryTable(String value, DataTable table) {
        PremiumSummaryPage premiumSummaryPage = new PremiumSummaryPage(driver);

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String location = columns.get(0);
            String coverage = columns.get(1);
            String limit = columns.get(2);
            String deductible = columns.get(3);
            String premium = columns.get(4);
            premiumSummaryPage.validatePremiumSummaryTable(value, location, coverage, limit, deductible, premium);
        }
    }

    @And("I validate premium details page table")
    public void iValidatePremiumDetailsPageTable(DataTable table) {
        PremiumDetailPage page = new PremiumDetailPage(driver);

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String relatedObject = columns.get(0);
            if (relatedObject == null)
                relatedObject = "";

            if(relatedObject.contains("-"));
            relatedObject=relatedObject.split("-")[0];

            String coverage = columns.get(1);
            String factor = columns.get(2);
            String factorValue = columns.get(3);
            String method = columns.get(4);

            page.validateFactor(relatedObject, coverage, factor, factorValue, method);
        }
    }

    @And("I validate FIGA on Premium Summary Page")
    public void verifyFIGAOnPremiumSummaryPage() throws Exception {
        new PremiumSummaryPage(driver).validateFloridaStateMandatedAssessments(data.get("Admitted_Line"));
    }

    @Then("I verify location {int} flood premium {string}")
    public void iVerifyLocationFloodPremium(int i, String s) {
        String value = driver.findElements(By.xpath("//div[text()='details']/../../../../../..//tr/td[2]/*[text()='Total Primary Flood Premium']/../../td[5]/div")).get(i-1).getText();
        new CommonComponentsAndActions(driver).assertEquals(value, s, "Expected Flood Premium: " + s + " got: " + value);
    }

    @Then("I verify location {int} flood premium {string} endorsement")
    public void iVerifyLocationFloodPremiumEndorsement(int i, String s) {
        String value = driver.findElements(By.xpath("//div[text()='coverages and premiums']/../../../../../..//tr/td/*[text()='Total Primary Flood Premium']/../../td[7]/div")).get(i-1).getText();
        new CommonComponentsAndActions(driver).assertEquals(value, s, "Expected Flood Premium: " + s + " got: " + value);
    }
    @Then("I click send renewal offer button")
    public void iClickSendRenewalOfferButton() throws Throwable {
        new PremiumSummaryPage(driver).clickSendRenewalOffer();

    }

    @And("I get renewal grand total from UI")
    public void iGetGrandTotalFromUI() {
        DataManager.getInstance().getData().put("Grand_Total_RN", new PremiumSummaryPage(driver).retrieveGrandTotal());
    }

    @Then("I save {string} transaction {int} premium for comparison")
    public void iSaveTransactionPremiumTransaction(String transaction, int transactionNumber) {
        int index = transactionNumber - 1;
        String RENEWAL_PREMIUM = new PolicyPage(driver).saveTransactionPremium(transaction, index);
        data.put("Premium_Transaction", RENEWAL_PREMIUM);
    }

    @Then("I save {string} transaction {int} total premium for comparison")
    public void iSaveTransactionTotalPremiumTransaction(String transaction, int transactionNumber) {
        int index = transactionNumber - 1;
        String RENEWAL_TPREMIUM = new PolicyPage(driver).saveTransactionTotalPremium(transaction, index);
        data.put("TotalPremium_Transaction", RENEWAL_TPREMIUM);
    }

    @Then("I compare premiums on premium summary")
    public void iComparePremiumOnPremiumSummary() {
        new PolicySummaryPage(driver).comparePremiumFromTransactionLevel();
    }

    @Then("The text {string} should be on the UI")
    public void verifyPremiumTextVisibility(String expectedText) {
        new PremiumSummaryPage(driver).verifyPremiumTextIsVisibleOnUI(expectedText);
    }

}