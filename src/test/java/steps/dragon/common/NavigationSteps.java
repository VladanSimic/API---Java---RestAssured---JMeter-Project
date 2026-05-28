package steps.dragon.common;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LocationCoveragePage;
import pages.PolicySummaryPage;
import pages.PureManualClaimsPage;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;
import steps.dragon.DragonSteps;

import java.util.Map;

public class NavigationSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I click save changes button")
    public void iClickSaveChangesButton() throws Throwable {
        new CommonComponentsAndActions(driver).saveChanges();
    }

    @When("I navigate to quotes page")
    public void iNavigateToQuotesPage() {
        new CommonComponentsAndActions(driver).navigateToQuotesPage();
    }

    @And("I navigate to {string} page through the Tree")
    public void iNavigateToPageThroughTree(String page) throws Throwable {
        new CommonComponentsAndActions(driver).goToPage(page);
    }

    @When("I navigate to policies")
    public void iNavigateToPolicies() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToPoliciesPage();
    }

    @When("I navigate to user setup page")
    public void iNavigateToUserSetupPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToUserSetupPage();
    }

    @And("I navigate to Home")
    public void iNavigateToHome() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToHomePage();
    }

    @And("I navigate to Partners tab")
    public void iNavigateToPartnersTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToPartnersTabPage();
    }

    @And("I navigate to SubRoles page")
    public void iNavigateToSubRolesPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToSubRolesPage();
    }

    @And("I navigate to underwriting referrals page")
    public void iNavigateToUnderwritingReferrals() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
    }

    @And("I navigate to underwriting tab")
    public void iNavigateToUnderwritingTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToUnderwritingTabPage();
    }

    @And("I navigate to transactions or endorsements")
    public void iNavigateToTransactionsOrEndorsements() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToTransactionsOrEndorsementsPage();
    }

    @And("I navigate to customers page")
    public void iNavigateToCustomersPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCustomersPage();
    }

    @And("I navigate to underwriting alerts tab")
    public void iNavigateToUnderwritingAlertsTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToUnderwritingAlertsTab();
    }

    @And("I navigate to policy image page")
    public void iNavigateToPolicyImagePage() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        pause(3);
        try {
            commonComponentsAndActions.navigateToPolicyImagePage(data.get("RENEWAL_IN_RATED_STATUS"));
        } catch (Exception e) {
            commonComponentsAndActions.clickPolicyImage();
        }

        iClickSaveChangesButton();
        pause(5);

        //if there is a hard stop referral
        if (!driver.findElements(By.xpath("//div[text()='policy | transaction | underwriting review']")).isEmpty()) {
            new DragonSteps().iAcceptUnderwritingReferrals();
            commonComponentsAndActions.clickPolicyImage();
        }
    }

    @And("I navigate to policy image page without save")
    public void iNavigateToPolicyImagePageWithoutSave() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        pause(3);
        try {
            commonComponentsAndActions.navigateToPolicyImagePage(data.get("RENEWAL_IN_RATED_STATUS"));
        } catch (Exception e) {
            commonComponentsAndActions.clickPolicyImage();
        }
    }

    @And("I navigate to next page")
    public void iNavigateToNextPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToNextPage();
    }

    @And("I navigate via action button next")
    public void iNavigateViaActionButtonNext() throws Throwable {
        new CommonComponentsAndActions(driver).actionButtonNext();
    }

    @And("I navigate to Location Details Page")
    public void iNavigateToLocationDetailsPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToLocation(data);
        pause(3);
    }

    @And("I navigate to Homeowner Policy Page")
    public void iNavigateToHomeownerPolicyPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToHomeownerPolicyPage();
    }

    @And("I navigate to quotes detail page")
    public void iNavigateToQuoteDetails() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToQuoteDetailsPage();
    }

    @And("I navigate to premium page")
    public void iNavigateToPremiumPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToPremiumPage();
    }

    @And("I navigate to New Business {string}")
    public void iNavigateToNewBusiness(String num) throws Throwable {
        data.put("currentTransactionDownload", "New Business"); //used for download document
        new CommonComponentsAndActions(driver).navigateToNewBusinessTransaction(num);
    }

    @And("I navigate to Endorsement {string}")
    public void iNavigateToEndorsement(String num) throws Throwable {
        data.put("currentTransactionDownload", "Endorsement"); //used for download document
        new CommonComponentsAndActions(driver).navigateToEndorsementTransaction(num);
    }

    @And("I navigate to Renewal {string}")
    public void iNavigateToRenewal(String num) throws Throwable {
        new CommonComponentsAndActions(driver).navigateToRenewalTransaction(num);
    }

    @And("I navigate to documents tab")
    public void iNavigateToDocumentsTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToDocumentsTab();
    }

    @And("I navigate to {string} page")
    public void iNavigateToPage(String page) throws Throwable {
        new CommonComponentsAndActions(driver).goToPage(page);
    }

    @And("I navigate to {string} {int} page")
    public void iNavigateToPage(String page, int i) throws Throwable {
        new CommonComponentsAndActions(driver).goToPage(page, i);
    }

    @And("I navigate to account summary tab")
    public void iNavigateToAccountSummaryTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToAccountSummaryTab();
        pause(2);
    }

    @And("I navigate to customer details tab")
    public void iNavigateToCustomerDetailsTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCustomerDetailsTab();
        pause(2);
    }

    @And("I navigate to member flag tab")
    public void iNavigateToMemberFlagTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToMemberFlagTab();
        pause(2);
    }

    @And("I navigate to policy delivery preferences tab")
    public void iNavigateToPolicyDeliveryPreferencesTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToPolicyDeliveryPreferencesTab();
        pause(2);
    }

    @And("I navigate to billing delivery preferences tab")
    public void iNavigateToBillingDeliveryPreferencesTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToBillingDeliveryPreferencesTab();
        pause(2);
    }

    @And("I navigate to required forms tab")
    public void iNavigateToRequiredFormsTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToRequiredFormsTab();
        pause(2);
    }

    @And("I navigate to proposals tab")
    public void iNavigateToProposalsTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToProposalsTab();
        pause(2);
    }

    @And("I navigate to diary tab")
    public void iNavigateToDiaryTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToDiaryTab();
        pause(2);
    }

    @And("I navigate to history tab")
    public void iNavigateToHistoryTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToHistoryTab();
        pause(2);
    }

    @And("I navigate to insurance score management tab")
    public void iNavigateToInsuranceScoreManagementTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToInsuranceScoreManagementTab();
    }

    @And("I navigate to broker history tab")
    public void iNavigateToBrokerHistoryTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToBrokerHistoryTab();
        pause(2);
    }

    @And("I navigate to account referral tab")
    public void iNavigateToAccountReferralTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToAccountReferralTab();
        pause(2);
    }

    @And("I navigate to a broker link")
    public void iNavigateToABrokerLink() {
        try {
            new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//div[text()='all policies']/../../../../../..//table//td[7]//span")), 0);
        } catch (Exception e) {
            new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//div[text()='all quotes']/../../../../../..//table//td[5]//span")), 0);
        }
    }

    @And("I navigate to broker details tab")
    public void iNavigateToBrokerDetailsTab() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='broker details']")), 0);
    }

    @And("I navigate to personnel tab")
    public void iNavigateToPersonnelTab() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='personnel']")), 0);
    }

    @And("I navigate to licenses tab")
    public void iNavigateToLicensesTab() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='licenses']")), 0);
    }

    @And("I navigate to producer codes tab")
    public void iNavigateToProducerCodesTab() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='producer codes']")), 0);
    }

    @And("I navigate to change licensed producer tab")
    public void iNavigateToChangeLicensedProducerTab() {
        new CommonComponentsAndActions(driver).clickElementJS(driver.findElement(By.xpath("//span[text()='change licensed producer']/../../..")));
    }

    @And("I navigate to claims tab")
    public void iNavigateToClaimsTab() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='pure claims']")), 0);
    }

    @And("I navigate to partners page")
    public void iNavigateToPartnersPage() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='partners']")), 0);
    }

    @And("I navigate to PA quote")
    public void iNavigateToPAQuote() throws Throwable {
        new CommonComponentsAndActions(driver).clickElement(driver.findElement(By.xpath("//span[contains(text(),'Personal Auto - ')]")));
    }

    @And("I navigate to EX quote")
    public void iNavigateToEXQuote() throws Throwable {
        new CommonComponentsAndActions(driver).clickElement(driver.findElement(By.xpath("//span[contains(text(),'Excess Liability - ')]")));
    }

    @And("I navigate to location page")
    public void iNavigateToLocationPage() throws Throwable {
        iNavigateToPage(data.get("City_Name_Txt") + " " + data.get("State"));
    }

    @And("I navigate to policy summary tab")
    public void iNavigateToPolicySummaryTab() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickElement(commonComponentsAndActions.customerSummary);
    }

    @And("I navigate to quote")
    public void iNavigateToQuote() throws InterruptedException {
        pause(1);
        driver.findElement(By.xpath("//div[text()='all quotes']/../../../../../..//table[@class='x-grid-item']//td[1]//span")).click();
    }

    @And("I navigate to customer summary page")
    public void iNavigateToCustomerSummaryPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCustomerPage();
    }

    @And("I navigate to CLUE-MVR tab")
    public void iNavigateToCLUEMVRTab() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCLUEMVRPage();
    }

    @And("I navigate to subjectivities")
    public void iNavigateToSubjectivities() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToSubjectivitiesPage();
    }

    @And("I navigate to quote summary page")
    public void iNavigateToQuoteSummaryPage() throws Throwable {
        new CommonComponentsAndActions(driver).clickQuoteSummaryPage();
    }

    @And("I navigate to the next page with action button next")
    public void iNavigateToNextPageWithActionButtonNext() throws Throwable {
        new CommonComponentsAndActions(driver).actionButtonNext();
    }

    @And("I navigate to premium details page")
    public void iNavigateToPremiumDetailsPage() throws InterruptedException {
        new CommonComponentsAndActions(driver).navigateToPremiumDetails();
        pause(8);
    }

    @And("I return to premium summary page")
    public void iReturnToPremiumSummaryPage() {
        new CommonComponentsAndActions(driver).returnToPremiumSummaryPage();
    }

    @And("I navigate to customer page")
    public void iNavigateToCustomer() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCustomerPage();
        pause(5);
    }

    @And("I navigate to Home Surplus Lines Policy Page")
    public void iNavigateToHomeSurplusLinesPolicyPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToHomeSurplusLinesPolicyPage();
    }

    @And("I navigate to Excess Policy Page")
    public void iNavigateToExcessPolicyPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Excess Liability Policy");
    }

    @And("I navigate to Automobile Policy Page")
    public void iNavigateToAutomobilePolicyPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Automobile Policy");
    }

    @And("I navigate to Additional Insured Page")
    public void iNavigateToAdditionalInsuredPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Additional Insured");
    }

    @And("I navigate to Collections Page")
    public void iNavigateToCollectionsPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Collections");
    }

    @And("I navigate to Additional Insured and Interest Page")
    public void iNavigateToAdditionalInsuredInterestsPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Additional Insured/Interest");
    }

    @And("I navigate to Additional Interests Page")
    public void iNavigateToAdditionalInterestsPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Additional Interests");
    }

    @And("I navigate to Watercraft Policy Page")
    public void iNavigateToWatercraftPolicyPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Watercraft Policy");
    }

    @And("I click prev button")
    public void iClickPrevButton() throws InterruptedException {
        new CommonComponentsAndActions(driver).clickPrevButton();
    }

    @And("I navigate to Optional Coverages Page")
    public void iNavigateToOptionalCoveragesPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Optional Coverages");
    }

    @And("I navigate to policy")
    public void iNavigateToPolicy() throws Throwable {
        new CommonComponentsAndActions(driver).clickOnPolicy();
    }

    @And("I navigate to FS policy")
    public void iNavigateToFSPolicy() throws Throwable {
        new CommonComponentsAndActions(driver).clickOnFSPolicy();
    }

    @When("I click the next page button")
    public void iClickTheNextPageButton() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToNextPage();
    }

    @And("I click return to premium summary page button")
    public void returnToPremiumSummaryPageButton() {
        new CommonComponentsAndActions(driver).clickReturnToPremiumSummaryPage();
    }

    @And("I go to summary and click update renewal")
    public void iGoToSummaryAndClickUpdateRenewal() throws Throwable {
        new PolicySummaryPage(driver).goToSummaryAndUpdateRenewal();
    }

    @And("I navigate to policy bread crumb")
    public void iNavigateToPolicyBreadCrumb() {
        new CommonComponentsAndActions(driver).navigateToPolicyBreadCrumb();
    }

    @And("I navigate to {string} bread crumb")
    public void iNavigateToBreadCrumb(String breadCrumb) {
        new CommonComponentsAndActions(driver).navigateToBreadCrumb(breadCrumb);
    }

    @And("I navigate to Wildfire Page")
    public void iNavigateToWildfirePage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Wildfire");
    }

    @And("I navigate to Previous Claim Losses Page")
    public void iNavigateToPreviousClaimsLossesPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Previous Claim/Losses");
    }

    @And("I navigate to Previous Claims-MVR Activity Page")
    public void iNavigateToPreviousClaimsMVRActivityPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Previous Claims/MVR Activity");
    }

    @And("I navigate to New Business summary page")
    public void iNavigateToNewBusinessSummaryPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToNewBusinessTransactionSummary();
    }

    @When("I navigate to Locations tab")
    public void iNavigateToLocationsTab() {
        new CommonComponentsAndActions(driver).navigateToLocationsTab();
    }

    @And("I navigate to General Guidance Tool Page")
    public void iNavigateToGeneralGuidanceTool() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("General Guidance Tool");
    }

    @And("I navigate to Risk Management tab")
    public void iNavigateToRiskManagementTab() throws InterruptedException {
        new CommonComponentsAndActions(driver).navigateToRiskManagementTab();
    }


    @And("I process renewal or navigate to policy image and review changes and process renewal")
    public void iProcessRenewalOrNavigateToPolicyImagePageReviewChangesAndProcessRenewal() throws Throwable {
        new PolicySummaryPage(driver).iProcessRenewalOrNavigateToPolicyImage();
    }

    @And("I navigate to Operators and Vehicles Page")
    public void iNavigateToOperatorsAndVehiclesPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Operators & Vehicles");
    }

    @And("I navigate to Property Information page")
    public void iNavigateToPropertyInformationPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Property Information");
    }

    @And("I navigate to Coverages Page")
    public void iNavigateToCoveragesPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Coverages");
    }

    @Then("I navigate to {string} tab")
    public void iNavigateToTab(String tab) {
        new CommonComponentsAndActions(driver).navigateToTab(tab);
    }

    @And("I navigate to CC Location Details Page")
    public void iNavigateToCCLocationDetailsPage() throws Throwable {
        new LocationCoveragePage(driver).navigateToCCLocation(data);
        pause(3);
    }

    @And("I navigate to Watercraft Information Page")
    public void iNavigateToWatercraftInformationPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Watercraft Information");
    }

    @And("I navigate to Vehicles and Watercraft Page")
    public void iNavigateToVehiclesAndWatercraftPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Vehicles and Watercraft");
    }


    @Then("I navigate to Pure Claims tab")
    public void iNavigateToPureClaimsTab() {
        new PureManualClaimsPage(driver).clickOnPureClaims();
    }
}