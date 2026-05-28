package pages;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class PolicySummaryPage extends CommonComponentsAndActions {
    WebDriver driver;
    public Map<String, String> data = DataManager.getInstance().getData();

    SummaryOfVehiclesBlock summaryOfVehiclesBlock;
    IncidentsBlock incidentsBlock;
    IncludedInTieringBlock includedInTieringBlock;
    DriverIncidentsIncludedInHouseholdAveragingBlock driverIncidentsIncludedInHouseholdAveragingBlock;
    DiscountsBlock discountsBlock;
    DriverDiscountsBlock driverDiscountsBlock;
    TotalNumberOfYouthfulAndPerformanceVehiclesBlock totalNumberOfYouthfulAndPerformanceVehclesBlock;
    DiscountsAndSurchargesBlock discountsAndSurchargesBlock;

    public PolicySummaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        summaryOfVehiclesBlock = new SummaryOfVehiclesBlock(driver);
        incidentsBlock = new IncidentsBlock(driver);
        includedInTieringBlock = new IncludedInTieringBlock(driver);
        driverIncidentsIncludedInHouseholdAveragingBlock = new DriverIncidentsIncludedInHouseholdAveragingBlock(driver);
        discountsBlock = new DiscountsBlock(driver);
        driverDiscountsBlock = new DriverDiscountsBlock(driver);
        totalNumberOfYouthfulAndPerformanceVehclesBlock = new TotalNumberOfYouthfulAndPerformanceVehiclesBlock(driver);
        discountsAndSurchargesBlock = new DiscountsAndSurchargesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillPolicySummaryPagePA(Map<String, String> data) throws Throwable {
        if (goToPage("Policy Summary")) {
            if (data.get("State").equalsIgnoreCase("CA")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA(data);
                incidentsBlock.fillIncidentDetailsPA(data);
                driverDiscountsBlock.fillDriverDiscountsDetailsPA(data);
            } else if (data.get("State").equalsIgnoreCase("NY")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA(data);
                incidentsBlock.fillIncidentDetailsPA(data);
                includedInTieringBlock.fillIncludedInTieringDetails(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA(data);
                discountsBlock.fillDiscountsDetailsPA(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA(data);
            } else {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA(data);
                incidentsBlock.fillIncidentDetailsPA(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA(data);
                discountsBlock.fillDiscountsDetailsPA(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA(data);
            }
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA(data);
        }
    }

    public void fillPolicySummaryPagePA_END(Map<String, String> data) throws Throwable {
        if (goToPage("Policy Summary")) {
            if (data.get("State").equalsIgnoreCase("CA")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_END(data);
                incidentsBlock.fillIncidentDetailsPA_END(data);
                driverDiscountsBlock.fillDriverDiscountsDetailsPA_END(data);
            } else if (data.get("State").equalsIgnoreCase("NY")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_END(data);
                incidentsBlock.fillIncidentDetailsPA_END(data);
                includedInTieringBlock.fillIncludedInTieringDetails_END(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_END(data);
                discountsBlock.fillDiscountsDetailsPA_END(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_END(data);
            } else {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_END(data);
                incidentsBlock.fillIncidentDetailsPA_END(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_END(data);
                discountsBlock.fillDiscountsDetailsPA_END(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_END(data);
            }
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA_END(data);
        }
    }

    public void fillPolicySummaryPagePA_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Policy Summary")) {
            if (data.get("State").equalsIgnoreCase("CA")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_OOS_END(data);
                incidentsBlock.fillIncidentDetailsPA_OOS_END(data);
                driverDiscountsBlock.fillDriverDiscountsDetailsPA_OOS_END(data);
            } else if (data.get("State").equalsIgnoreCase("NY")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_OOS_END(data);
                incidentsBlock.fillIncidentDetailsPA_OOS_END(data);
                includedInTieringBlock.fillIncludedInTieringDetails_OOS_END(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_OOS_END(data);
                discountsBlock.fillDiscountsDetailsPA_OOS_END(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_OOS_END(data);
            } else {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_OOS_END(data);
                incidentsBlock.fillIncidentDetailsPA_OOS_END(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_OOS_END(data);
                discountsBlock.fillDiscountsDetailsPA_OOS_END(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_OOS_END(data);
            }
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA_OOS_END(data);
        }
    }

    public void fillPolicySummaryPagePA_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Policy Summary")) {
            if (data.get("State").equalsIgnoreCase("CA")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_RNW(data);
                incidentsBlock.fillIncidentDetailsPA_RNW(data);
                driverDiscountsBlock.fillDriverDiscountsDetailsPA_RNW(data);
            } else if (data.get("State").equalsIgnoreCase("NY")) {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_RNW(data);
                incidentsBlock.fillIncidentDetailsPA_RNW(data);
                includedInTieringBlock.fillIncludedInTieringDetails_RNW(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_RNW(data);
                discountsBlock.fillDiscountsDetailsPA_RNW(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_RNW(data);
            } else {
                summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_RNW(data);
                incidentsBlock.fillIncidentDetailsPA_RNW(data);
                driverIncidentsIncludedInHouseholdAveragingBlock.fillDriverIncidentsIncludedInHouseholdAveragingDetailsPA_RNW(data);
                discountsBlock.fillDiscountsDetailsPA_RNW(data);
                totalNumberOfYouthfulAndPerformanceVehclesBlock.fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_RNW(data);
            }
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA_RNW(data);
        }
    }

    public void comparePremiumFromTransactionLevel() {

        String totalAnnualizedPremium = driver.findElement(By.xpath("//*[text()='Total Annualized Premium']/../../../../div/div"))
                .getText().trim();
        String grandTotal = driver.findElement(By.xpath("//*[text()='Grand Total']/../../../../div/div"))
                .getText().trim();

        String expectedPremium = data.get("Premium_Transaction");
        String expectedGrandTotal = data.get("TotalPremium_Transaction");

        boolean isTotalAnnualizedMatch = totalAnnualizedPremium.equalsIgnoreCase(expectedPremium);
        boolean isGrandTotalMatch = grandTotal.equalsIgnoreCase(expectedGrandTotal);

        if (!isTotalAnnualizedMatch || !isGrandTotalMatch) {
            StringBuilder errorMsg = new StringBuilder("Premium mismatch detected:");

            if (!isTotalAnnualizedMatch) {
                errorMsg.append("\n - Total Annualized Premium expected: ").append(expectedPremium)
                        .append(", actual: ").append(totalAnnualizedPremium);
            }
            if (!isGrandTotalMatch) {
                errorMsg.append("\n - Grand Total expected: ").append(expectedGrandTotal)
                        .append(", actual: ").append(grandTotal);
            }

            failAssertion(errorMsg.toString());
        }
    }

    public void iProcessRenewalOrNavigateToPolicyImage() throws Throwable {
        if (isElementDisplayed(processRenewal, 7)) {
            clickProcessRenewal();
        } else {
            clickPolicyImage();
            pause(2000);
            clickReviewChanges();
            pause(3000);
            if (isElementDisplayed(reviewChanges)) {
                clickReviewChanges();
            }
            clickRenewedPremium();
            pause(2000);
            clickProcessRenewal();
        }
    }

    public void goToSummaryAndUpdateRenewal() throws Throwable {
        clickElement(quoteSummary);
        pause(3000);
        if (isElementDisplayed(updateRenewal)) {
            clickElement(updateRenewal);
        } else {
            clickPolicyImage();
        }
    }


    public void compareFieldValueBeforeAndAfterReRate(String field, String page, String trx) throws Throwable {
        PolicySummaryPage policySummaryPage = new PolicySummaryPage(driver);
        String factor1 = iGetValueFromField(field);
        if (trx.equalsIgnoreCase("Renewal")) {
            policySummaryPage.goToSummaryAndUpdateRenewal();
            clickReviewChanges();
            clickRenewedPremium();
            if (isElementPresentByXPath("//span[text()='policy image']")) {
                navigateToPolicyImagePage("No");
            } else {
                navigateToUnderwritingAlertsTab();
                navigateToPolicyImagePage("No");
            }
        } else if (trx.contains("Endorsement")) {
            clickReviewChanges();
            clickEndorsementRate();
            navigateToPolicyImagePage("No");
        } else {
            clickReviewChanges();
            clickRate();
            navigateToQuoteDetailsPage();
        }

        goToPage(page);

        String factor2 = iGetValueFromField(field);

        if (!factor1.equalsIgnoreCase(factor2)) {
            failAssertion("Factors before: " + factor1 + ", Factor After: " + factor2);
        }
    }

}
