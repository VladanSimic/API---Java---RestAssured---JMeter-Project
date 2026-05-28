package steps.dragon;

import config.FileLogger;
import excel.DataManager;
import excel.ExcelDataTransfer;
import excel.ExcelManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import pages.*;
import pages.blocks.*;
import pages.flows.HomeownersFlow;
import pages.utils.CommonComponentsAndActions;
import pages.utils.CustomFileUtils;
import pages.utils.QuoteCreator;
import pages.utils.SoftAssertion;
import selenium.DriverManager;
import sql.SQLManager;
import steps.BaseTest;
import steps.dragon.common.NavigationSteps;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

import static net.sourceforge.htmlunit.cyberneko.HTMLElements.I;

public class DragonSteps extends BaseTest {

    public DragonSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();

    public String ENV = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ENV");
    public String DBStore = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("DBStore");
    public String EXECUTION_ID = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("EXECUTION_ID");
    public String USER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("USER");

    Map<String, String> data = DataManager.getInstance().getData();
    public String POLICY_ID;
    public String CUSTOMER_ID;
    public String Scenario_ID;
    public String USER_SESSION_ID;
    public String CURRENT_OBJECT_ID;
    public String CANCELLATION_DATE;
    public boolean skip;
    public String date1;
    public String date2;

    // FILL HOMEOWNERS PAGES STEPS
    @And("I fill out HO quote cover page")
    public void iFillOutQuoteCoverPageHO() throws Throwable {
        new HomeownersPolicyCoverPage(driver).fillOutHomeownersPolicyCoverPage(data);
    }

    @And("I fill out HO quote basic location coverage details page")
    public void iFillOutBasicLocationCoverageDetailsPageHO() throws Throwable {
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage(data);
    }

    @And("I fill out HO quote basic location coverage details page for {string} {string} {int}")
    public void iFillOutBasicLocationCoverageDetailsPageHO(String city, String state, int i) throws Throwable {
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageTemp(data, city, state, i);
    }

    @And("I fill out HO quote optional coverages page")
    public void iFillOutOptionalCoveragesPageHO() throws Throwable {
        new OptionalCoveragesPage(driver).fillOptionalCoveragesHO(data);
    }

    @And("I fill out HO quote elevation certificate details page")
    public void iFillOutElevationCertificateDetailsPageHO() throws Throwable {
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
    }

    @And("I fill out HO quote previous losses coverages page")
    public void iFillOutPreviousLossesCoveragesPageHO() throws Throwable {
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
    }

    @And("I fill out HO quote additional interests coverages page")
    public void iFillOutAdditionalInterestsPageHO() throws Throwable {
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
    }

    @And("I fill out HO quote member information page")
    public void iFillOutMemberInformationPageHO() throws Throwable {
        new MemberInformationPage(driver).fillMemberInformationPage(data);
    }

    @And("I fill out FS quote member information page")
    public void iFillOutMemberInformationPageFS() throws Throwable {
        new MemberInformationPage(driver).fillMemberInformationPageFS(data);
    }

    @And("I fill out HO quote manuscript endorsements page")
    public void iFillOutManuscriptEndorsementsPageHO() throws Throwable {
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHO(data);
    }

    @And("I fill out HO quote application page")
    public void iFillOutApplicationPageHO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Application");
        //TODO IMPLEMENT STEP HO
    }

    @And("I fill out HO quote subjectivities page")
    public void iFillOutSubjectivitiesPageHO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Subjectivities");
        //TODO IMPLEMENT STEP HO
    }

    @And("I fill out HO quote wildfire details page")
    public void iFillOutWildfireDetailsPageHO() throws Throwable {
        new WildfirePage(driver).fillWildfireDetailsPageHO(data);
    }

    @And("I fill out HO quote earthquake details page")
    public void iFillOutEarthquakeDetailsPageHO() throws Throwable {
        new EarthquakePage(driver).fillEarthquakeDetailsPageHO(data);
    }

    @And("I fill out HO quote inspection details page")
    public void iFillOutInspectionDetailsPageHO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Inspection");
        new InspectionPage(driver).fillOutInspectionDetails(data);
    }

    @And("I fill out HO quote exclusion forms page")
    public void iFillOutExclusionFormsPageHO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Exclusion Forms");
        //TODO IMPLEMENT STEP HO
    }

    @And("I fill out HO quote residence employees details page")
    public void iFillOutResidenceEmployeeDetailsPageHO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Residence Employees");
        new ResidenceEmployeePage(driver).fillResidenceEmployeeDetails(data);
    }

    @And("I fill out HO previous claim losses page")
    public void fillOutPreviousClaimLosses() throws Throwable {
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
    }

    @And("I fill out HS previous claim losses page")
    public void fillOutPreviousClaimLossesHS() throws Throwable {
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHS(data);
    }

    @And("I fill out FS previous claim losses page")
    public void fillOutPreviousClaimLossesFS() throws Throwable {
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageFS(data);
    }

    // FILL HOMEOWNERS SURPLUS PAGES STEPS
    @And("I fill out HS quote cover page")
    public void iFillOutQuoteCoverPageHS() throws Throwable {
        new PolicyPage(driver).fillPolicyPageHS(data);
    }

    @And("I fill out HS quote basic location coverage details page")
    public void iFillOutBasicLocationCoverageDetailsPageHS() throws Throwable {
        new LocationCoveragePage(driver).fillLocationCoveragePageHS(data);
    }

    @And("I fill out HS quote optional coverages page")
    public void iFillOutOptionalCoveragesPageHS() throws Throwable {
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageHS(data);
    }

    @And("I fill out HS quote earthquake details page")
    public void iFillOutEarthquakeDetailsPageHS() throws Throwable {
        new EarthquakePage(driver).fillEarthquakeDetailsPageHS(data);
    }

    @And("I fill out HS quote elevation certificate details page")
    public void iFillOutElevationCertificateDetailsPageHS() throws Throwable {
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPageHS(data);
    }

    @And("I fill out FS quote elevation certificate details page")
    public void iFillOutElevationCertificateDetailsPageFS() throws Throwable {
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPageFS(data);
    }

    @And("I fill out HS quote previous losses coverages page")
    public void iFillOutPreviousLossesCoveragesPageHS() throws Throwable {
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHS(data);
    }

    @And("I fill out HS quote member information page")
    public void iFillOutMemberInformationPageHS() throws Throwable {
        new MemberInformationPage(driver).fillMemberInformationPageHS(data);
    }

    @And("I fill out HS quote application page")
    public void iFillOutApplicationPageHS() throws Throwable {
        new ApplicationPage(driver).fillApplicationPageHS(data);
    }

    @And("I fill out HS RNW application page")
    public void iFillOutApplicationPageRNWHS() throws Throwable {
        new ApplicationPage(driver).fillApplicationPageHS_RNW(data);
    }

    @And("I fill out HS quote collections coverage by class page")
    public void iFillOutCollectionsCoverageByClassPageHS() throws Throwable {
        new CollectionsPage(driver).fillCollectionsPageHS(data);
    }

    @And("I fill out HS quote collections schedule page")
    public void iFillOutCollectionsSchedulePageHS() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Collection Schedule");
        new CoverageSchedulePage(driver).fillCollectionScheduleHS(data);
    }

    // FILL EXCESS LIABILITY PAGES STEPS
    @And("I fill out EX quote cover page")
    public void iFillOutQuoteCoverPageEX() throws Throwable {
        new ExcessLiabilityCoverPage(driver).fillExcessLiabilityCoverPage(data);
    }

    @And("I fill out EX quote operator information page")
    public void iFillOutOperatorInformationPageEX() throws Throwable {
        new OperatorInformationPage(driver).fillOperatorInformationPage(data);
    }

    @And("I fill out EX quote additional insured page")
    public void iFillOutAdditionalInsuredPageEX() throws Throwable {
        new AdditionalInsuredPage(driver).fillAdditionalInsuredPage(data);
    }

    @And("I fill out EX quote property information page")
    public void iFillOutPropertyInformationPageEX() throws Throwable {
        new PropertyInformationPage(driver).fillPropertyInformationPage(data);
    }

    @And("I fill out EX quote watercraft information page")
    public void iFillOutWatercraftInformationPageEX() throws Throwable {
        new WatercraftInformationPage(driver).fillWatercraftInformationPage(data);
    }

    @And("I fill out EX quote select coverages page")
    public void iFillOutSelectCoveragesPageEX() throws Throwable {
        new SelectCoveragesPage(driver).fillSelectCoveragesPage(data);
    }

    @And("I fill out EX quote optional coverages page")
    public void iFillOutOptionalCoveragesPageEX() throws Throwable {
        new OptionalCoveragesPage(driver).fillOptionalCoveragesEX(data);
    }

    @And("I fill out EX quote manuscript endorsements page")
    public void iFillOutManuscriptEndorsementsPageEX() throws Throwable {
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPage(data);
    }

    @And("I fill out EX quote subjectivities page")
    public void iFillOutSubjectivitiesPageEX() throws Throwable {
        new SubjectivitiesPage(driver).fillSubjectivitiesPage(data);
    }

    //FILL EXCESS LIABILITY SURPLUS PAGES STEPS
    @And("I fill out ES quote cover page")
    public void iFillOutQuoteCoverPageES() throws Throwable {
        new PolicyPage(driver).fillPolicyPageES(data);
    }

    @And("I fill out ES quote operator information page")
    public void iFillOutOperatorInformationPageES() throws Throwable {
        new OperatorInformationPage(driver).fillOperatorInformationPageES(data);
    }

    @And("I fill out ES quote additional insured page")
    public void iFillOutAdditionalInsuredPageES() throws Throwable {
        new AdditionalInsuredPage(driver).fillAdditionalInsuredPage(data);
    }

    @And("I fill out ES quote property information page")
    public void iFillOutPropertyInformationPageES() throws Throwable {
        new PropertyInformationPage(driver).fillPropertyInformationPage(data);
    }

    @And("I fill out ES quote vehicles and watercraft page")
    public void iFillOutVehiclesAndWatercraftPageES() throws Throwable {
        new VehiclesAndWatercraftPage(driver).fillVehicleAndWatercraftPageES(data);
    }

    @And("I fill out ES quote member information page")
    public void iFillOutMemberInformationPageES() throws Throwable {
        new MemberInformationPage(driver).fillMemberInformationPage(data);
    }

    @And("I fill out ES quote select coverages page")
    public void iFillOutSelectCoveragesPageES() throws Throwable {
        new SelectCoveragesPage(driver).fillSelectCoveragesPage(data);
    }

    @And("I fill out ES quote coverage information page")
    public void iFillOutCoverageInformationPageES() throws Throwable {
        new CoverageInformationPage(driver).fillOutCoverageInformationPage(data);
    }

    @And("I fill out ES quote manuscript endorsements page")
    public void iFillOutManuscriptEndorsementsPageES() throws Throwable {
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPage(data);
    }

    @And("I fill out ES quote application page")
    public void iFillOutApplicationPageES() throws Throwable {
        new ApplicationPage(driver).fillApplicationPageES(data);
    }

    @And("I fill out ES quote subjectivities page")
    public void iFillOutSubjectivitiesPageES() throws Throwable {
        new SubjectivitiesPage(driver).fillSubjectivitiesPage(data);
    }

    // FILL PERSONAL WATERCRAFT PAGES STEPS
    @And("I fill out PW quote cover page")
    public void iFillOutQuoteCoverPagePW() throws Throwable {
        new WatercraftPolicyCoverPage(driver).fillOutWatercraftPolicyCoverPage(data);
    }

    @And("I fill out PW quote vessel page")
    public void iFillOutVesselPagePW() throws Throwable {
        new WatercraftVehiclePage(driver).fillWatercraftVehiclePageDetails(data);
    }

    @And("I fill out PW quote vessel underwriting page")
    public void iFillOutVesselUnderwritingPagePW() throws Throwable {
        new VesselUnderwritingPage(driver).fillVesselUnderwritingDetails(data);
    }

    @And("I fill out PW quote manuscript endorsements page")
    public void iFillOutManuscriptEndorsementsPagePW() throws Throwable {
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPagePW(data);
    }

    @And("I fill out PW quote previous claims mvr activity page")
    public void iFillOutPreviousClaimsMVRActivityPagePW() throws Throwable {
        new PreviousClaimsMVRActivityPage(driver).fillPreviousClaimsMVRActivityDetails(data);
    }

    @And("I fill out PW quote subjectivities page")
    public void iFillOutSubjectivitiesPagePW() throws Throwable {
        new SubjectivitiesPage(driver).fillSubjectivitiesPagePW(data);
    }

    @And("I fill out PW quote operator details page")
    public void iFillOutOperatorDetailsPagePW() throws Throwable {
        new OperatorDetailsPage(driver).fillOperatorDetails(data);
    }

    @And("I fill out PW quote vessel coverage page")
    public void iFillOutVesselCoveragePagePW() throws Throwable {
        new VesselCoveragePage(driver).fillVesselCoverageDetails(data);
    }
    // FILL PERSONAL AUTO PAGES STEPS

    //FILL COLLECTIONS PAGES STEPS
    @And("I fill out CO quote cover page")
    public void iFillOutQuoteCoverPageCO() throws Throwable {
        new CollectionsPolicyPage(driver).fillCollectionsPolicyPage(data);
    }

    @And("I fill out CO quote coverage by class page")
    public void iFillOutQuoteCoverageByClassPageCO() throws Throwable {
        new CoverageByClassPage(driver).fillCoverageByClassPage(data);
    }

    @And("I fill out CO quote coverage schedule page")
    public void iFillOutQuoteCoverageSchedulePageCO() throws Throwable {
        new CoverageSchedulePage(driver).fillCoverageSchedulePage(data);
    }

    @And("I fill out CO quote previous claims loss history page")
    public void iFillOutQuotePreviousClaimsLossHistoryPageCO() throws Throwable {
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesCO(data);
    }

    @And("I fill out CO quote additional binding information page")
    public void iFillOutQuoteAdditionalBindingInformationPageCO() throws Throwable {
        new BindingInformationPage(driver).fillOutBindingInformationCO(data);
    }

    @And("I fill out CO quote additional insured interest page")
    public void iFillOutQuoteAdditionalInsuredInterestPageCO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Additional Insured/Interest");
        //TODO IMPLEMENT STEP CO
    }

    @And("I fill out CO quote optional coverages page")
    public void iFillOutQuoteOptionalCoveragesPageCO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Optional Coverages");
        //TODO IMPLEMENT STEP CO
    }

    @And("I fill out CO quote manuscript endorsements page")
    public void iFillOutQuoteManuscriptEndorsementsPageCO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Manuscript Endorsements");
        //TODO IMPLEMENT STEP CO
    }

    @And("I fill out CO quote subjectivities page")
    public void iFillOutQuoteSubjectivitiesPageCO() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Subjectivities");
        //TODO IMPLEMENT STEP CO
    }

    // CREATING QUOTE STEPS
    @And("I create a new {string} quote")
    public void iCreateANewLOBQuote(String LOB) throws Throwable {
        new QuoteCreator(driver).createQuote(LOB, data);
    }

    // CREATING POLICY STEPS
    @And("I have created a new {string} NB policy")
    public void iHaveCreatedANewLOBNBPolicy(String LOB) throws Throwable {
        new LoginPage(driver).login(ENV, "Field");
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.navigateToQuotesPage();

        QuotesPage quotesPage = new QuotesPage(driver);
        quotesPage.newQuote();
        if (data.containsKey("AGENCY_NAME") && data.containsKey("AGENCY_ID")) {
            quotesPage.searchAndSelectCustomAgency(data.get("AGENCY_NAME"), data.get("AGENCY_ID"));
        } else {
            quotesPage.searchAndSelectAgencyAdvanced(ENV, data);
        }
        new QuoteBasicInformationPage(driver).fillOutQuoteBasicInformationPage(data, ENV);

        iCreateANewLOBQuote(LOB);
        iRateAQuote();
        commonComponentsAndActions.navigateToUnderwritingReferralsPage();
        iAcceptUnderwritingReferrals();
        iBindAQuote();
        iOverrideSubjectivities();
    }

    // REFERRALS STEPS
    @And("I accept underwriting referrals")
    public void iAcceptUnderwritingReferrals() throws Throwable {
        if (!skip) {
            UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

            uwRefPage.setUnderwriter(data.get("Underwriter"));
            new ReferralsBlock(driver).approveAndOverride();
            uwRefPage.acceptReferrals("Accepted");

            if (data.get("State").equals("SC") || data.get("State").equals("FL")) {
                if (commonComponentsAndActions.elementExists(commonComponentsAndActions.requestIssue)) {
                    commonComponentsAndActions.clickRequestIssue();
                } else if (commonComponentsAndActions.elementExists(commonComponentsAndActions.requestBind)) {
                    commonComponentsAndActions.clickRequestBind();
                }
            }
        }
    }

    @And("I accept underwriter referrals temp")
    public void iAcceptReferralsTemp() throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.setUnderwriter("Danijel Radoja");
        uwRefPage.overrideReferrals();
        uwRefPage.acceptReferrals("Accepted");
    }

    @And("I accept underwriter referrals FS")
    public void iAcceptReferralsFS() throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.setUnderwriter(data.get("Underwriter"));
        uwRefPage.overrideReferrals();
        uwRefPage.acceptReferrals("Accepted");
    }

    @And("I accept underwriter referrals END")
    public void iAcceptReferralsEND() throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.setUnderwriter(data.get("Underwriter"));
        uwRefPage.overrideReferrals("Accepted", data);
        uwRefPage.acceptReferralsEND("Accepted");
    }

    @And("I accept underwriter referrals on endorsement and renewal temp")
    public void iAcceptReferralsTempEndRnw() throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.setUnderwriter("Danijel Radoja");
        uwRefPage.overrideReferralsEndRnw();
        uwRefPage.acceptReferrals("Accepted");
    }

    @And("I accept underwriter referrals EX and ES temp")
    public void iAcceptReferralsTempEX() throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.setUnderwriter("Danijel Radoja");
        uwRefPage.overrideReferralsExEs();
        uwRefPage.acceptReferrals("Accepted");
    }

    @And("I verify that referral {string} is {string}")
    public void OFACiVerifyThatReferralIsTriggered(String referralID, String triggered) throws Throwable {
//        try {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.verifyReferralTrigger(referralID, triggered);
//        } catch (Exception e) {
//            iGetCustomerAccountID();
//            Assert.assertTrue(false);
//        }
    }

    @And("I verify that referral with {string} is {string}")
    public void OFACiVerifyThatReferralWithIsTriggered(String referralID, String triggered) throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.verifyReferralContainedTriggered(referralID, triggered);
    }

    @And("I verify that referral {string} {string}")
    public void iVerifyThatReferralCanBeApproved(String referralID, String approvable) throws Throwable {
//        try {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.verifyReferralApproval(referralID, approvable);
//        } catch (Exception e) {
//            iGetCustomerAccountID();
//            Assert.assertTrue(false);
//        }
    }

    @And("I review referrals")
    public void iReviewReferrals() throws Throwable {
        new CommonComponentsAndActions(driver).clickReviewReferrals();
    }

    // INTEGRATIONS STEPS
    @And("I get ES auto CLUE results")
    public void iGetESAutoCLUEResults() throws Throwable {
        new CommonComponentsAndActions(driver).getAutoClueReports();
    }

    @And("I get PW NADA Results")
    public void iCallNADAAndGetResults() throws Throwable {
        new CommonComponentsAndActions(driver).callAndGetNADAResults(data);
    }

    @And("I get credit score results")
    public void iGetCreditScore() throws Throwable {
        new CommonComponentsAndActions(driver).getCreditScoreReports(data);
    }

    @And("I click quote proposal")
    public void iClickQuoteProposal() throws Throwable {
        new CommonComponentsAndActions(driver).clickQuoteProposal();
    }

    @And("I verify that quote proposal document status is completed")
    public void iVerifyThatQuoteProposalDocumentStatusIsCompleted() throws InterruptedException {
        if (driver.findElements(By.xpath("//div[contains(text(),'document list')]")).size() == 0) {
            pause(15);
        }
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Completed')]")).isDisplayed());
    }

    @And("I run home CLUE")
    public void iRunHomeCLUE() throws Throwable {
        new ClueMVRPage(driver).runHomeClue(data);
    }

    @And("I verify home CLUE processing is complete")
    public void iVerifyHomeCLUEprocessingIsComplete() throws InterruptedException {
        pause(3);
        try {
            Assert.assertTrue(driver.findElement(By.xpath("//div[text()='home CLUE reports order history']/../../../../../..//span[contains(text(),'processing complete')]")).isDisplayed());
            driver.findElement(By.xpath("//div[text()='home CLUE reports order history']/../../../../../..//span[contains(text(),'processing complete')]")).click();
        } catch (Exception e) {
            Assert.assertTrue(driver.findElement(By.xpath("//div[text()='home CLUE reports order history']/../../../../../..//span[contains(text(),'Subject Data Missing')]")).isDisplayed());
            driver.findElement(By.xpath("//div[text()='home CLUE reports order history']/../../../../../..//span[contains(text(),'Subject Data Missing')]")).click();
        }
        pause(1);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        pause(2);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='C.L.U.E. - Comprehensive Loss Underwriting Exchange Personal Property System']")).isDisplayed());

        driver.close();
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    @And("I run auto CLUE")
    public void iRunAutoCLUE() throws Throwable {
        new ClueMVRPage(driver).runAutoClue(data);
    }

    @And("I verify auto CLUE processing is complete")
    public void iVerifyAutoCLUEprocessingIsComplete() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='auto CLUE reports order history']/../../../../../..//span[contains(text(),'processing complete')]")).isDisplayed());
        driver.findElement(By.xpath("//div[text()='auto CLUE reports order history']/../../../../../..//span[contains(text(),'processing complete')]")).click();
        pause(1);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        pause(5);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='CLUE Interface System - Requested CLUE Detailed Results Print Report']")).isDisplayed());

        driver.close();
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    @And("I verify that {string} insurance score is pulled")
    public void iVerifyThatInsuranceScoreIsPulled(String lob) throws Throwable {
        if (!data.get("State").equals("CA"))
            switch (lob) {
                case "HO": {
                    new CommonComponentsAndActions(driver).goToPage("Homeowners Policy");

                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "");
                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                }
                break;
                case "PA": {
                    new CommonComponentsAndActions(driver).goToPage("Automobile Policy");

                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "");
                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                }
                break;
                case "PW": {
                    new CommonComponentsAndActions(driver).goToPage("Watercraft Policy");

                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Applicant Insurance Score']/../../../..//input")).get(0).getAttribute("value"), "");
                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Rating Tier']/../../../..//input")).get(0).getAttribute("value"), "");
                }
                break;
                case "CO": {
                    new CommonComponentsAndActions(driver).goToPage("Collections");

                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
//                Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "");
                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                }
                break;
                case "HS": {
                    new CommonComponentsAndActions(driver).goToPage("Home Surplus Lines Policy");

                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Insurance Score Tier']/../../../..//input")).get(0).getAttribute("value"), "");
                }
                break;
                case "ES": {
                    new CommonComponentsAndActions(driver).goToPage("Excess Liability Policy");

                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
//                Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "");
                    Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                }
                break;
            }
    }

    @And("I verify that geo location is pulled")
    public void iVerifyThatGeoLocationIsPulled() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage(data.get("City_Name_Txt") + " " + data.get("State"));

        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Longitude']/../../../..//input")).getAttribute("value"), "");
        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Latitude']/../../../..//input")).getAttribute("value"), "");
        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Geocoded location']/../../../..//input")).getAttribute("value"), "");
    }

    @And("I verify that flood information is pulled")
    public void iVerifyThatFloodInformationIsPulled() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage(data.get("City_Name_Txt") + " " + data.get("State"));

        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Flood Zone']/../../../..//input")).getAttribute("value"), "");
        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='RiskMeter Flood Zone']/../../../..//input")).getAttribute("value"), "");
        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Panel Number']/../../../..//input")).getAttribute("value"), "");
        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Panel Date']/../../../..//input")).getAttribute("value"), "");
    }

    @And("I verify earthquake reports are pulled")
    public void iVerifyEarthquakeReportsArePulled() throws Throwable {
        EarthquakeReportsAndReadOnlyInformationBlock earthquakeReportsAndReadOnlyInformationBlock = new EarthquakeReportsAndReadOnlyInformationBlock(driver);
        earthquakeReportsAndReadOnlyInformationBlock.verifyMMI("NotEmpty");
        earthquakeReportsAndReadOnlyInformationBlock.verifySoilGrade("NotEmpty");
        earthquakeReportsAndReadOnlyInformationBlock.verifyDistanceToControllingFaultLineMiles("NotEmpty");
        earthquakeReportsAndReadOnlyInformationBlock.reportScreenshot("Earthquake report", "Earthquake report");
    }

    @And("I verify wildfire hazard reports are pulled")
    public void iVerifyWildfireHazardReportsArePulled() throws Throwable {
        WildfireCreditsDebitsBlock wildfireCreditsDebitsBlock = new WildfireCreditsDebitsBlock(driver);
        wildfireCreditsDebitsBlock.verifyHazardSeverity("NotEmpty");
        wildfireCreditsDebitsBlock.verifyRiskFactor("NotEmpty", data.get("State"));
        wildfireCreditsDebitsBlock.verifyRiskScore("NotEmpty");
        wildfireCreditsDebitsBlock.verifyLandUseDensityClass("NotEmpty");
        wildfireCreditsDebitsBlock.verifyDistanceToWildLands("NotEmpty");
        wildfireCreditsDebitsBlock.reportScreenshot("Wildfire Hazard Report", "Wildfire Hazard Report");
    }

    // BIND AND RATE STEPS
    @And("I rate a quote")
    public void iRateAQuote() throws Throwable {
        new CommonComponentsAndActions(driver).rateQuote();
        pause(10);
    }

    @And("I rate a quote with duration {string} to file {string}")
    public void iRateAQuoteWithDuration(String TC_ID, String fileName) throws Throwable {
        long startTime = System.currentTimeMillis();
        new CommonComponentsAndActions(driver).rateQuote();
        new PremiumSummaryPage(driver).verifyThatPremiumSummaryBlockIsVisible();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        try {
            FileLogger.logToFile(fileName, String.valueOf(duration), TC_ID);
        } catch (Exception e) {

        }
    }

    @And("I rate an endorsement with duration {string} to file {string}")
    public void iRateAnEndorsementWithDuration(String TC_ID, String fileName) throws Throwable {
        long startTime = System.currentTimeMillis();
        new CommonComponentsAndActions(driver).clickEndorsementRate();
        new PremiumSummaryPage(driver).verifyThatPremiumSummaryBlockIsVisible();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        try {
            FileLogger.logToFile(fileName, String.valueOf(duration), TC_ID);
        } catch (Exception e) {

        }
    }


    @And("I click renewed premium with duration {string} to file {string}")
    public void iClickRenewedPremiumWithDuration(String TC_ID, String fileName) throws Throwable {
        long startTime = System.currentTimeMillis();
        new CommonComponentsAndActions(driver).clickRenewedPremium();
        skip = new CommonComponentsAndActions(driver).isRenewalPolicyExtensionProcessable();
        if (skip) {
            new CommonComponentsAndActions(driver).reportScreenshot("TransactionNotProcessable", "TransactionNotProcessable");
        }
        new PremiumSummaryPage(driver).verifyThatPremiumSummaryBlockIsVisible();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        try {
            FileLogger.logToFile(fileName, String.valueOf(duration), TC_ID);
        } catch (Exception e) {

        }
    }

    @And("I external rate a quote with duration {string} to file {string}")
    public void iExtRateAQuoteWithDuration(String TC_ID, String fileName) throws Throwable {
        long startTime = System.currentTimeMillis();
        new CommonComponentsAndActions(driver).extRateQuote();
        new PremiumSummaryPage(driver).verifyThatPremiumSummaryBlockIsVisible();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        FileLogger.logToFile(fileName, String.valueOf(duration), TC_ID);
    }

    @And("I click external rate")
    public void iClickExternalRate() throws Throwable {
        new CommonComponentsAndActions(driver).clickExtRate();
    }

    @And("I request bind")
    public void iRequestBind() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        try {
            commonComponentsAndActions.clickRequestBind();
        } catch (Exception e) {
            commonComponentsAndActions.clickBind();
        }

        new PolicyDeliveryPage(driver).fillPolicyDelivery("Yes", "PrintByPure");

        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.clickConfirm();
        commonComponentsAndActions.clickRequestBind();
        try {
            commonComponentsAndActions.clickCancel();
            commonComponentsAndActions.clickOK();
        } catch (Exception e) {

        }
        POLICY_ID = new CustomerSummaryPage(driver).getPolicyID();

        commonComponentsAndActions.writePolicyIdsInFile(POLICY_ID);

        reportScreenshot(POLICY_ID, POLICY_ID);
        Assert.assertTrue(commonComponentsAndActions.hasValue(POLICY_ID));

        System.out.println("\n/----------------------POLICY ID----------------------/");
        System.out.println("Policy ID: " + POLICY_ID + " State: " + data.get("State"));
        System.out.println("/-----------------------------------------------------/\n");
    }

    @And("I bind a quote")
    public void iBindAQuote() throws Throwable {
        RequiredFormsPage requiredFormsPage = new RequiredFormsPage(driver);
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        EditAttachmentPage editAttachmentPage = new EditAttachmentPage(driver);
        SummaryPage summaryPage = new SummaryPage(driver);
        PolicyDeliveryPage policyDeliveryPage = new PolicyDeliveryPage(driver);
        CustomerSummaryPage customerSummaryPage = new CustomerSummaryPage(driver);

        if (!commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//span[contains(text(),'bind')]")))) {
            try {
                new CommonComponentsAndActions(driver).navigateToQuoteDetailsPage();
                iRateAQuote();
            } catch (Exception e) {
                //
            }
            new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
            iAcceptUnderwritingReferrals();
            iRateAQuote();
        }

        if (commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//div[contains(text(),'Rating factors cannot be obtained for one or more characteristics.')]")))) {
            new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
            iAcceptUnderwritingReferrals();
            iRateAQuote();

            commonComponentsAndActions.clickCreateRequiredForms();
            requiredFormsPage.fillSignaturePreferenceAndUpload();
            editAttachmentPage.addAttachment(data);
            requiredFormsPage.generateDocuments();
            requiredFormsPage.goToSummary();
            summaryPage.clickQuoteLink();
        }

        pause(5);
        if (commonComponentsAndActions.isElementPresentByXPath("//span[contains(text(),'>>> request bind')]"))
            commonComponentsAndActions.clickRequestBind();
        if (data.get("Admitted_Line").equalsIgnoreCase("Collection")) {
            pause(5);
            if (commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//*[@id='os-messages']//span"))) &&
                    driver.findElements(By.xpath("//*[@id='os-messages']//span")).get(0).getText().equalsIgnoreCase("HVI was updated and premium may have been impacted. If calculated HVI is incorrect, please contact u/w manager.")) {
                commonComponentsAndActions.clickRate();
                commonComponentsAndActions.navigateToUnderwritingReferralsPage();
                iAcceptUnderwritingReferrals();
            }
        }
        try {
            if (!commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//span[contains(text(),'bind')]")))) {
                new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
                iAcceptUnderwritingReferrals();
                iRateAQuote();
            }
        } catch (Exception e) {
            new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
            iAcceptUnderwritingReferrals();
            iRateAQuote();
        }

        try {
            commonComponentsAndActions.clickBind();
        } catch (Exception e) {
            new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
            iAcceptUnderwritingReferrals();
        }

        //CO - HVI message
        pause(5);
        if (commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//*[@id='os-messages']//span"))) &&
                driver.findElements(By.xpath("//*[@id='os-messages']//span")).get(0).getText().contains("In order to continue the bind process")) {

            commonComponentsAndActions.clickPremium();
            commonComponentsAndActions.clickCreateRequiredForms();

            requiredFormsPage.fillSignaturePreferenceAndUpload();

            editAttachmentPage.addAttachment(data);


            //temp comment - excluding eSign integration
//            requiredFormsPage.generateDocuments();

//            if (commonComponentsAndActions.isVisibleOnly(By.xpath("//span[text()='Cancel']"))) {
//                commonComponentsAndActions.clickCancel();
//                commonComponentsAndActions.clickOK();
//            }
//
//            if (commonComponentsAndActions.isVisibleOnly(By.xpath("//span[text()='send email for eSignature']"))) {
//                commonComponentsAndActions.clickSendEmailSignature();
//            }

            requiredFormsPage.goToSummary();

            summaryPage.clickQuoteLink();

            commonComponentsAndActions.clickBind();
        }
        pause(7);

        if (commonComponentsAndActions.isPSEValidationPresent()) {
            commonComponentsAndActions.customer.click();
            pause(3);
            commonComponentsAndActions.requiredFormsTab.click();
            pause(3);
            requiredFormsPage.fillSignaturePreferenceAndUpload();
            editAttachmentPage.addAttachment(data);
            requiredFormsPage.goToSummary();
            summaryPage.clickQuoteLink();
            commonComponentsAndActions.clickBind();
            pause(6);
        }

        if (commonComponentsAndActions.isElementDisplayed(commonComponentsAndActions.bind, 2))
            commonComponentsAndActions.clickBind();

        if (commonComponentsAndActions.isPSEValidationPresent()) {
            commonComponentsAndActions.customer.click();
            pause(3);
            commonComponentsAndActions.requiredFormsTab.click();
            pause(3);
            requiredFormsPage.fillSignaturePreferenceAndUpload();
            editAttachmentPage.addAttachment(data);
            requiredFormsPage.goToSummary();
            summaryPage.clickQuoteLink();
            commonComponentsAndActions.clickBind();
        }

        policyDeliveryPage.fillPolicyDelivery("Yes", "PrintByPure");

        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.clickConfirm();
        try {
            data.put("Grand_Total_Premium_NB", new BillingChoicesPage(driver).retrieveGrandTotal());
        } catch (Exception e) {
            data.put("Grand_Total_Premium_NB", "null");
        }
        commonComponentsAndActions.clickRequestBind();
        if (commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//span[text()='Cancel']")))) {
            if (driver.findElements(By.xpath("//span[text()='Cancel']")).get(0).isDisplayed()) {
                commonComponentsAndActions.clickCancel();
                commonComponentsAndActions.clickOK();
            }
        }

        POLICY_ID = customerSummaryPage.getPolicyID();
        data.put("Policy_ID", POLICY_ID);

        try {
            USER_SESSION_ID = data.get("SESSION_ID");
        } catch (Exception e) {
            USER_SESSION_ID = "Failed to get User Session Id -- error: " + e;
        }

        if (hasValue(DBStore) && DBStore.equalsIgnoreCase("Yes") && hasValue(CUSTOMER_ID) && hasValue(POLICY_ID)) {
            SQLManager.updatePolicyIdOnTransaction(CUSTOMER_ID, POLICY_ID);
        }

        Assert.assertTrue(commonComponentsAndActions.hasValue(POLICY_ID));

        try {
            commonComponentsAndActions.writePolicyIdsInFile(POLICY_ID + ", " + data.get("Effective_Date"));
            pause(3);
            reportTextAttachment("POLICY ID: " + POLICY_ID, POLICY_ID);
        } catch (Exception e) {

        }

        System.out.println("\n/----------------------POLICY ID----------------------/");
        System.out.println("Policy ID: " + POLICY_ID + " State: " + data.get("State"));
        System.out.println("/-----------------------------------------------------/\n");
    }

    @And("I click bind")
    public void iClickBind() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickBind();
    }

    @And("I override subjectivities")
    public void iOverrideSubjectivities() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        new CustomerSummaryPage(driver).goToPolicy();
        commonComponentsAndActions.navigateToTransactionsOrEndorsementsPage();
        commonComponentsAndActions.navigateToNewBusinessTransaction("1");
        commonComponentsAndActions.navigateToSubjectivitiesPage();
        try {
            new SubjectivitiesPage(driver).overrideSubjectivities();
            commonComponentsAndActions.clickManualBind();
        } catch (Exception e) {
            //
        }
    }

    @And("I fill policy delivery details {string} {string}")
    public void fillPolicyDelivery(String optOut, String deliveryOptions) throws Throwable {
        new PolicyDeliveryPage(driver).fillPolicyDelivery(optOut, deliveryOptions);

        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.clickConfirm();
    }

    @And("I override subjectivities for New Business Rewrite transaction")
    public void iOverrideSubjectivitiesForNBRewrite() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.navigateToTransactionsOrEndorsementsPage();
        commonComponentsAndActions.navigateToNewBusinessRewriteTransaction("1");
        commonComponentsAndActions.navigateToSubjectivitiesPage();

        new SubjectivitiesPage(driver).overrideSubjectivities();
        commonComponentsAndActions.clickManualBind();
    }

    @And("I override subjectivities on subjectivities page")
    public void iOverrideSubjectivitiesOnSubjectivitiesPage() throws Throwable {
        new SubjectivitiesPage(driver).overrideSubjectivities();
    }

    @And("I click manual bind")
    public void iClickManualBind() throws Throwable {
        new CommonComponentsAndActions(driver).clickManualBind();
    }

    // TRANSACTIONS STEPS
    @And("I initiate new endorsement")
    public void iInitiateNewEndorsement() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickNewTransaction();
        pause(5);
        new NewTransactionPage(driver).fillEndorsementTransactionDetails(data);
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.saveChanges();
        DataManager.getInstance().setKey("Current_Term_Transaction", "Endorsement");
    }

    @And("I initiate new endorsement {int}")
    public void iInitiateNewEndorsementDate(int i) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickNewTransaction();
        pause(5);
        if (data.containsKey("Endorsement_Effective_Date_END")) {
            DataManager.getInstance().replaceKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getIncrementDate(data.get("Endorsement_Effective_Date_END"), i));
        } else {
            DataManager.getInstance().setKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getIncrementDate(data.get("Endorsement_Effective_Date_END"), i));
        }
        new NewTransactionPage(driver).fillEndorsementTransactionDetails(data);
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.saveChanges();
        DataManager.getInstance().setKey("Current_Term_Transaction", "Endorsement");
    }

    @And("I initiate new endorsement {int} months ahead")
    public void iInitiateNewEndorsementMonthsAhead(int i) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickNewTransaction();
        pause(5);
        if (data.containsKey("Endorsement_Effective_Date_END")) {
            DataManager.getInstance().replaceKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getIncrementMonth(data.get("Effective_Date"), i));
        } else {
            DataManager.getInstance().setKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getIncrementMonth(data.get("Effective_Date"), i));
        }
        new NewTransactionPage(driver).fillEndorsementTransactionDetails(data);
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.saveChanges();
        DataManager.getInstance().setKey("Current_Term_Transaction", "Endorsement");
    }

    @And("I initiate new oos endorsement")
    public void iInitiateNewOOSEndorsement() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickNewTransaction();
        if (data.containsKey("Endorsement_Effective_Date_END")) {
            DataManager.getInstance().replaceKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getDecrementDate(data.get("Endorsement_Effective_Date_END"), 1));
        } else {
            DataManager.getInstance().setKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getDecrementDate(data.get("Endorsement_Effective_Date_END"), 1));
        }
        pause(5);
        new NewTransactionPage(driver).fillEndorsementTransactionDetails(data);
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.saveChanges();
        commonComponentsAndActions.clickModifyOOS();
        DataManager.getInstance().setKey("Current_Term_Transaction", "OOS Endorsement");
    }

    @And("I initiate new oos endorsement on {string}")
    public void iInitiateNewOOSEndorsement(String date) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickNewTransaction();
        if (data.containsKey("Endorsement_Effective_Date_END")) {
            DataManager.getInstance().replaceKey("Endorsement_Effective_Date_END", date);
        } else {
            DataManager.getInstance().setKey("Endorsement_Effective_Date_END", date);
        }
        pause(5);
        new NewTransactionPage(driver).fillEndorsementTransactionDetails(data);
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.saveChanges();
        commonComponentsAndActions.clickModifyOOS();
        DataManager.getInstance().setKey("Current_Term_Transaction", "OOS Endorsement");
    }

    @And("I initiate new oos endorsement {int} months ahead")
    public void iInitiateNewOOSEndorsementMonthsAhead(int i) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickNewTransaction();
        pause(5);
        if (data.containsKey("Endorsement_Effective_Date_END")) {
            DataManager.getInstance().replaceKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getIncrementMonth(data.get("Effective_Date"), i));
        } else {
            DataManager.getInstance().setKey("Endorsement_Effective_Date_END", commonComponentsAndActions.getIncrementMonth(data.get("Effective_Date"), i));
        }
        pause(5);
        new NewTransactionPage(driver).fillEndorsementTransactionDetails(data);
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.saveChanges();
        commonComponentsAndActions.clickModifyOOS();
        DataManager.getInstance().setKey("Current_Term_Transaction", "OOS Endorsement");
    }

    @And("I review changes")
    public void iReviewChanges() throws Throwable {
        new CommonComponentsAndActions(driver).clickReviewChanges();
    }

    @And("I rate an endorsement")
    public void iRateAnEndorsement() throws Throwable {
        new CommonComponentsAndActions(driver).clickEndorsementRate();
    }

    @And("I issue an endorsement")
    public void iIssueAnEndorsement() throws Throwable {
        new CommonComponentsAndActions(driver).clickIssue();
    }

    @And("I issue a CC endorsement")
    public void iIssueACCEndorsement() throws Throwable {
        pause(15);
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        boolean issue = commonComponentsAndActions.isElementPresentByXPath("//span[text()='>>> issue']");

//        if (!issue) {
//            commonComponentsAndActions.navigateToHomePage();
//            commonComponentsAndActions.navigateToRatingLogPage();
//
//            new RatingLogPage(driver).searchAndSelectAPolicyByHHID(data.get("Account_ID"));
//            new QuoteFactorOverridePage(driver).overrideAll();
//            new QuoteFactorOverridePage(driver).processOverride();
//            commonComponentsAndActions.navigateBack();
//
//            if (ENV.equalsIgnoreCase("AWS_STG")) {
//                commonComponentsAndActions.navigateToCustomersPage();
//                new CustomersPage(driver).selectACustomerByID(data.get("Account_ID"));
//            } else if (ENV.equalsIgnoreCase("AWS_QA")) {
//                commonComponentsAndActions.navigateToQuotesPage();
//                new QuotesPage(driver).searchAndSelectAQuote(data.get("Account_ID"));
//            }
//
//            commonComponentsAndActions.navigateToCustomerPage();
//            new CustomerSummaryPage(driver).openPolicy(data.get("Policy_ID"));
//            commonComponentsAndActions.navigateToTransactionsOrEndorsementsPage();
//
//            new TransactionsOrEndorsementsPage(driver).openFirstEndorsement();
//
//            commonComponentsAndActions.navigateToPolicyImagePage("No");
//            commonComponentsAndActions.clickReviewChanges();
//            commonComponentsAndActions.clickEndorsementRate();
//
//        }
        commonComponentsAndActions.clickIssue();
    }

    @And("I add changes on {string} endorsement")
    public void iAddChangesOnEndorsement(String LOB) throws Throwable {
        new QuoteCreator(driver).createEndorsement(LOB, data);
    }

    @And("I add changes on OOS {string} endorsement")
    public void iAddChangesOnOOSEndorsement(String LOB) throws Throwable {
        new QuoteCreator(driver).createOOSEndorsement(LOB, data);
    }

    @And("I have issued an Endorsement for {string} Policy")
    public void iHaveIssuedAnEndorsementForLOBPolicy(String LOB) throws Throwable {
        new LoginPage(driver).login(ENV, "Field");
        new CommonComponentsAndActions(driver).navigateToPoliciesPage();
        iSelectAPolicyByID();
        new CommonComponentsAndActions(driver).navigateToTransactionsOrEndorsementsPage();
        iInitiateNewEndorsement();
        iAddChangesOnEndorsement(LOB);
        iReviewChanges();
        iRateAQuote();
        new CommonComponentsAndActions(driver).navigateToUnderwritingAlertsTab();
        iAcceptUnderwritingReferrals();
        iIssueAnEndorsement();
    }

    @And("I modify OOS")
    public void iModifyOOS() throws Throwable {
        new CommonComponentsAndActions(driver).clickModifyOOS();
    }

    @And("I process {string} endorsements on {string}")
    public void iProcessEndorsements(String num, String date) throws Throwable {
        if (date.equalsIgnoreCase("TODAY")) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDateTime now = LocalDateTime.now();
            date = dtf.format(now);
        }
        for (int i = 1; i <= Integer.parseInt(num); i++) {
            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            NewTransactionPage newTransactionPage = new NewTransactionPage(driver);

            commonComponentsAndActions.clickNewTransaction();
            newTransactionPage.setTransactionType("Endorsement");
            newTransactionPage.setEndorsementType("Other");
            newTransactionPage.setNewTransactionEffectiveDate(date);

            newTransactionPage.setDescription("Description");
            newTransactionPage.setNotes("Notes");
            commonComponentsAndActions.clickNext();

            try {
                iReviewChanges();
            } catch (Exception e) {
                iModifyOOS();
                iReviewChanges();
            }

            iRateAQuote();
            new CommonComponentsAndActions(driver).navigateToUnderwritingAlertsTab();
            iAcceptUnderwritingReferrals();
            iIssueAnEndorsement();
        }
    }

    @And("I create an endorsement on {string} without processing")
    public void iCreateAnEndorsementOnWithoutProcessing(String date) throws Throwable {
        NewTransactionPage newTransactionPage = new NewTransactionPage(driver);

        newTransactionPage.clickNewTransaction();
        newTransactionPage.setTransactionType("Endorsement");
        newTransactionPage.setEndorsementType("Other");
        newTransactionPage.setNewTransactionEffectiveDate(date);

        newTransactionPage.setDescription("Description");
        newTransactionPage.setNotes("Notes");
//        newTransactionPage.clickNext();
//
//        try {
//            iReviewChanges();
//        } catch (Exception e) {
//            iModifyOOS();
//            iReviewChanges();
//        }
//
//        iRateAQuote();
//        newTransactionPage.clickSaveAndExit();
    }

    @And("I issue an endorsement for {string} policy")
    public void iIssueAnEndorsementForPolicy(String LOB) throws Throwable {
        new CommonComponentsAndActions(driver).navigateToPoliciesPage();
        iSelectAPolicyByID();
        new CommonComponentsAndActions(driver).navigateToTransactionsOrEndorsementsPage();
        iInitiateNewEndorsement();
        iAddChangesOnEndorsement(LOB);
        iReviewChanges();
        iRateAQuote();
        new CommonComponentsAndActions(driver).navigateToUnderwritingAlertsTab();
        iAcceptUnderwritingReferrals();
        iIssueAnEndorsement();
    }

    @And("I create a renewal without process")
    public void iCreateARenewalWithoutProcess() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickCreateRenewal();
        commonComponentsAndActions.clickOK();
    }

    @And("I create a renewal")
    public void iCreateARenewal() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickCreateRenewal();
        commonComponentsAndActions.clickOK();
        pause(5);
        int num = driver.findElements(By.xpath("//span[text()='Renewal']/../../..//td[17]/div")).size();
        boolean RENEWAL_IN_RATED_STATUS = commonComponentsAndActions.getText(driver.findElements(By.xpath("//span[text()='Renewal']/../../..//td[17]/div")).get(num - 1)).equals("PolicyTransactionRated");
        List<WebElement> renewalEffDate = driver.findElements(By.xpath("//span[text()='Renewal']/../../..//td[9]/div"));
        DataManager.getInstance().setKey("RENEWAL_IN_RATED_STATUS", RENEWAL_IN_RATED_STATUS ? "Yes" : "No");
        DataManager.getInstance().setKey("Current_Term_Eff_Date", renewalEffDate.get(renewalEffDate.size() - 1).getText().trim());
        DataManager.getInstance().setKey("Current_Term_Transaction", "Renewal");
        commonComponentsAndActions.clickRenewal();
    }

    @And("I check renewed premium")
    public void iCheckRenewedPremium() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToRenewedPremiumPage();
    }

    @And("I process a renewal")
    public void iProcessARenewal() throws Throwable {
        pause(3);
        if (!ENV.contains("PROD"))
            if (driver.findElements(By.xpath("//div[contains(text(),'Underwriting Comments to Broker')]/../../../../div//textarea")).size() > 0) {
                iAcceptUnderwritingReferrals();
            }
        pause(2);
        if (driver.findElements(By.xpath("//span[text()='>>> review changes']")).size() > 0) {
            iReviewChanges();
        }
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        //  try {
        if (!commonComponentsAndActions.isElementDisplayed(commonComponentsAndActions.processRenewal, 5)) {
            commonComponentsAndActions.clickPolicyImage();
            commonComponentsAndActions.clickReviewChanges();
            commonComponentsAndActions.clickRenewedPremium();
            commonComponentsAndActions.clickProcessRenewal();
//            reviewAndAcceptReferralsOnRenewal();
//            commonComponentsAndActions.clickProcessRenewal();

        } else {
            commonComponentsAndActions.clickProcessRenewal();
        }
        // } catch (Exception e) {
//            reviewAndAcceptReferralsOnRenewal();
//            commonComponentsAndActions.clickProcessRenewal();
        //}

        if (driver.findElements(By.xpath("//span[contains(text(),'You are attempting to process a renewal with an effective date greater than')]")).size() > 0) {
            new CommonComponentsAndActions(driver).clickProcessRenewal();
        }
    }

    @And("I auto process a renewal")
    public void iAutoProcessARenewal() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickRenewalTransaction();
        commonComponentsAndActions.clickAutoProcessRenewal();
        commonComponentsAndActions.clickOK();
    }

    @And("I auto process {string} renewal")
    public void iAutoProcessRenewals(String num) throws Throwable {
        String RENEWAL_IN_RATED_STATUS = DataManager.getInstance().getKey("RENEWAL_IN_RATED_STATUS");
        for (int i = 1; i <= Integer.parseInt(num); i++) {
            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[text()='AUTO CREATE RNWL']")));
            pause(10);
            int lastRenewal = driver.findElements(By.xpath("//span[text()='Renewal']")).size() - 1;
            commonComponentsAndActions.clickElement(driver.findElements(By.xpath("//span[text()='Renewal']")).get(lastRenewal));
            new CommonComponentsAndActions(driver).navigateToPolicyImagePage(RENEWAL_IN_RATED_STATUS);
            if (hasValue(data.get("Admitted_Or_Surplus")) && data.get("Admitted_Or_Surplus").equalsIgnoreCase("Surplus")) {
                if (data.get("Admitted_Line").equalsIgnoreCase("Home Surplus Lines")) {
                    //HS
                    new CommonComponentsAndActions(driver).goToPage("Application");
                    iAcceptUnderwritingReferrals();
                    new CommonComponentsAndActions(driver).navigateToPolicyImagePage(RENEWAL_IN_RATED_STATUS);
                    new CommonComponentsAndActions(driver).goToPage("Application");
                    new ApplicationMandatoryFormsBlock(driver).fillStatementOfDiligent();
                } else {
                    //ES
                    new CommonComponentsAndActions(driver).goToPage("Application");
                    new ApplicationMandatoryFormsBlock(driver).fillStatementOfDiligent();
                }
            }
            iReviewChanges();

            iCheckRenewedPremium();
            try {
                iProcessARenewal();
            } catch (Exception e) {
                iReviewReferrals();
                iAcceptUnderwritingReferrals();
                iProcessARenewal();
            }
            pause(10);
        }
    }

    @And("I add changes on {string} renewal")
    public void iAddChangesOnRenewal(String LOB) throws Throwable {
        new QuoteCreator(driver).createRenewal(LOB, data);
    }

    @And("I select a transaction {string}")
    public void iSelectATransaction(String transaction) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        int num = driver.findElements(By.xpath("//span[text()='" + transaction + "']")).size();
        commonComponentsAndActions.clickElement(driver.findElements(By.xpath("//span[text()='" + transaction + "']")).get(num - 1));
    }

    @Then("I get customer account ID")
    public void iGetCustomerAccountID() throws Throwable {
        pause(3);
        new CommonComponentsAndActions(driver).navigateToCustomerPage();
        pause(10);
        CUSTOMER_ID = new CustomerSummaryPage(driver).getAccountID();
        data.put("Customer_ID", CUSTOMER_ID);
        reportTextAttachment("Customer ID: ", CUSTOMER_ID);
        new CommonComponentsAndActions(driver).writeToExistingFileAppended("results/AllCustomerIDs.txt", CUSTOMER_ID + ", " + data.get("State") + " " + (hasValue(POLICY_ID) ? POLICY_ID : ""));
        System.out.println("Customer Account ID: " + CUSTOMER_ID + " State: " + data.get("State"));
    }

    @Then("I get customer primary state on customer details page")
    public void iGetCustomerAccountState() throws Throwable {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);
        actions.clickElement(actions.customerDetailsTab);
        pause(5);
        data.put("Quote_Line_And_Name_Block_State", driver.findElement(By.xpath("//div[text()='member primary mailing address']/../../../../../..//tr//td[6]//div")).getText());
    }

    @Then("I get customer account ID and Quote Name")
    public void iGetCustomerAccountIDQuoteName() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCustomerPage();
        pause(10);
        CUSTOMER_ID = new CustomerSummaryPage(driver).getAccountID();
        reportTextAttachment("Customer ID: ", CUSTOMER_ID);
        new CommonComponentsAndActions(driver).writeToExistingFileAppended("results/AllCustomerIDsAndQuoteName.txt", "TC_ID: " + data.get("TC_ID") + ", Customer ID : " + CUSTOMER_ID + ", " + " Quote Name : " + data.get("Last_Name") + " State: " + data.get("State") + ", " + (hasValue(POLICY_ID) ? POLICY_ID : ""));
    }

    @And("I select customer by ID")
    public void iSelectCustomerByID() throws Throwable {
        new CustomersPage(driver).selectACustomerByID(CUSTOMER_ID);
    }

    @And("I select a customer")
    public void iSelectCustomer() throws Throwable {
        new CustomersPage(driver).selectACustomerByID(data.get("Customer_ID"));
    }

    @And("I select customer by ID {string}")
    public void iSelectCustomerByID(String id) throws Throwable {
        new CustomersPage(driver).selectACustomerByID(id);
    }

    @And("I open quote under customer")
    public void iOpenQuoteUnderCustomer() throws Throwable {
        new CustomerSummaryPage(driver).openQuote();
    }

    @And("I select a user by User Login ID on User Setup page {string}")
    public void iSelectAUserByUserLoginID(String userLoginID) throws Throwable {
        new UserSetupPage(driver).selectUserByLoginID(userLoginID);
    }

    @And("I select a user by User Full Name {string}")
    public void iSelectAUserByUserFullName(String userFullName) throws Throwable {
        new SubRolePage(driver).selectUserByUserFullName(userFullName);
    }

    @And("I select broker by Broker ID{string}")
    public void iSelectBrokerBy(String brokerID) throws Throwable {
        new PartnersPage(driver).selectBrokerByID(brokerID);
    }

    @And("I select a policy by ID")
    public void iSelectAPolicyByID() throws Throwable {
        if (data.containsKey("Policy_ID") && !data.get("Policy_ID").equals("")) {
            POLICY_ID = data.get("Policy_ID");
        }
        new PoliciesPage(driver).selectAPolicyByID(POLICY_ID);
    }

    @And("I select a policy by ID {string}")
    public void iSelectAPolicyByID(String policyID) throws Throwable {
        POLICY_ID = policyID;
        new PoliciesPage(driver).selectAPolicyByID(policyID);
    }

    @And("I exit policy")
    public void iExitPolicy() throws Throwable {
        if (!skip) {
            new CommonComponentsAndActions(driver).clickExitPolicy();
        } else {
            new CommonComponentsAndActions(driver).clickExit();
        }
    }

    @And("I exit transaction")
    public void iExitTransaction() throws Throwable {
        pause(5);
        new CommonComponentsAndActions(driver).clickExitTransaction();
    }

    @And("I exit customer")
    public void iExitCustomer() throws Throwable {
        new CommonComponentsAndActions(driver).clickExitCustomer();
    }

    @And("I exit from policy image page")
    public void iExitFromPolicyImagePage() throws Throwable {
        new CommonComponentsAndActions(driver).clickExit();
    }

    @And("I exit quote")
    public void iExitQuote() throws Throwable {
        new CommonComponentsAndActions(driver).clickExit();
    }

    @And("I take screenshot")
    public void iTakeScreenshot() {
        new CommonComponentsAndActions(driver).reportScreenshot("Screenshot_" + System.currentTimeMillis(), "Screenshot");
    }

    @And("I take screenshot {string}")
    public void iTakeScreenshot(String name) throws MalformedURLException {
        reportScreenshot(name, name);
    }

    @And("I pause for {string} seconds")
    public void iPauseForSeconds(String time) throws InterruptedException {
        pause(Integer.parseInt(time));
    }

    @And("I get the premiums")
    public void iGetThePremiums() {
        data.putAll(new PremiumSummaryPage(driver).getPremiumList());
        DataManager.getInstance().setData(data);
        System.out.println("PREMIUM SUMMARY");
//        for (Map.Entry<String, String> entry : tempData.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("KEY: " + key + " VALUE: " + value);
//        }
    }

    @And("I compare UI premiums")
    public void iCompareUIPremiums() {
        PremiumSummaryPage premiumSummaryPage = new PremiumSummaryPage(driver);
        Map<String, String> tempData2 = premiumSummaryPage.getPremiumList();

//      Assert.assertEquals(tempData, tempData2);
        //TODO - I compare UI premiums step
    }

    @And("I compare InforceSheets PA premiums")
    public void iCompareInforceSheetsPAPremiums() {
//      Assert.assertEquals(tempData.get("Vehicle Premium"), data.get("Vehicle_Expected_Premium_1"));
        // TODO - I compare InforceSheets PA premiums
    }

    @And("I compare InforceSheets EX premiums")
    public void iCompareInforceSheetsEXPremiums() {
//      Assert.assertEquals(tempData.get(""), data.get("EX_Expected_Premium"));
        // TODO - I compare InforceSheets EX premiums
    }

    @And("I edit customer insurance score")
    public void iEditCustomerInsuranceScore() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        if (commonComponentsAndActions.hasValue(data.get("Insurance_Score"))) {
            String customerName = data.get("First_Name") + " " + data.get("Last_Name");
            //Clicks customer link
            commonComponentsAndActions.navigateToCustomerPage();
            //          commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[text()='Customer: " + customerName + "']")));
            //click insurance score management
            commonComponentsAndActions.clickElement(commonComponentsAndActions.insuranceScoreManagement);//    @FindBy(xpath = "//span[text()='insurance score management']")
            //click new report
            commonComponentsAndActions.clickElement(commonComponentsAndActions.newReport);//    @FindBy(xpath = "//span[text()='new report']")
            pause(5);
            //set member
            commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//ul[@aria-hidden='false']/li[text()='" + customerName + "']")));
            //set insurance score model
            commonComponentsAndActions.typeText(driver.findElement(By.xpath("//div[text()='Insurance Score Model']/../../../..//input")), "Attract One - CW");
            //set insurance score
            commonComponentsAndActions.typeText(driver.findElement(By.xpath("//div[text()='Insurance Score']/../../../..//input")), data.get("Insurance_Score"));
            //set comment
            commonComponentsAndActions.typeText(driver.findElement(By.xpath("//div[text()='Comments']/../../../..//textarea")), "Comment");

            commonComponentsAndActions.saveChanges();

            //navigate to summary
            commonComponentsAndActions.clickElement(commonComponentsAndActions.customerSummary);//    @FindBy(xpath = "//span[text()='summary']")

            //navigate to quote
            //commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[text()='Personal Auto - Idaho']")));
            commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[contains(text(), '" + data.get("Admitted_Line") + "')]")));

            //          commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[contains(text(), '" + data.get("Admitted_Line") + "s')]")));
            //navigate to quote details
            commonComponentsAndActions.clickElement(commonComponentsAndActions.quoteDetails);//    @FindBy(xpath = "//span[text()='quote details']")

        }
    }

    @And("I add additional locations")
    public void iAddAdditionalLocations() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.goToPage("Homeowners Policy");

        new HomeownersPolicyCoverPage(driver).addAdditionalLocations(data);

        commonComponentsAndActions.orderPropertyDetails();
        commonComponentsAndActions.pause(5000);

        int locations = data.get("Additional_Locations").split(",").length;

        for (int i = 1; i <= locations; i++) {
            new QuoteCreator(driver).addAdditionalLocationsHO_NB(data, i);
        }
    }

    @And("I download file")
    public void iDownloadFile() throws Throwable {
        new CommonComponentsAndActions(driver).fileDownload(driver.findElement(By.xpath("//span[contains(text(),'Home Surp')]")));
    }

    @And("I verify {string} document is generated")
    public void iVerifyDocumentIsGenerated(String doc) {
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'" + doc + "')]")).isDisplayed());
        new CommonComponentsAndActions(driver).reportScreenshot("DocumentGenerated", "DocumentGenerated");
    }

    @And("I download document {string}")
    public void iDownloadDocument(String doc) throws IOException, InterruptedException {
        new CommonComponentsAndActions(driver).fileDownload(driver.findElement(By.xpath("//span[contains(text(),'" + doc + "')]")));
    }

    @And("I verify that annual mileage is pulled")
    public void iVerifyThatAnnualMileageIsPulled() throws Throwable {
        String[] additionalVehicles = data.get("Additional_Vehicles").split(",");

        for (int i = 1; i <= additionalVehicles.length; i++) {
            new VehiclesDetailsPage(driver).navigateToVehicleDetailsPage(
                    data,
                    "Vehicle_Year_" + i,
                    "Vehicle_Make_" + i,
                    "Vehicle_Model_" + i
            );

            Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Date Pulled: ']/../../../../div/div")).getText(), "");
        }
    }

    @And("I verify that agreed value is pulled")
    public void iVerifyThatAgreedValueIsPulled() throws Throwable {
        String[] additionalVehicles = data.get("Additional_Vehicles").split(",");

        for (int i = 1; i <= additionalVehicles.length; i++) {
            new VehiclesDetailsPage(driver).navigateToVehicleDetailsPage(
                    data,
                    "Vehicle_Year_" + i,
                    "Vehicle_Make_" + i,
                    "Vehicle_Model_" + i
            );

            Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='Market Value Current Term']/../../../..//input")).getAttribute("value"), "");
        }
    }

    @And("I run auto MVR")
    public void iRunAutoMVR() throws Throwable {
        new ClueMVRPage(driver).runAutoMVR(data);
    }

    @And("I verify auto MVR processing is complete")
    public void iVerifyAutoMVRProcessingIsComplete() throws InterruptedException {
        pause(7);
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='MVR reports order history']/../../../../../..//table//tr/td[5]//span")).isDisplayed());
        Assert.assertNotEquals(driver.findElement(By.xpath("//div[text()='MVR reports order history']/../../../../../..//table//tr/td[5]//span")).getText(), "");

        driver.findElement(By.xpath("//div[text()='MVR reports order history']/../../../../../..//table//tr/td[5]//span")).click();

        pause(5);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        pause(2);
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Driver Record Information from State Motor Vehicle Records')]")).isDisplayed());

        driver.close();
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    @And("I open mini diary")
    public void iOpenMiniDiary() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToMiniDiary();
        pause(2);
    }

    @And("I create a new task in mini diary")
    public void iCreateANewTaskInMiniDiary() throws InterruptedException {
        driver.findElement(By.cssSelector("#taskradio-inputEl")).click();

        driver.findElement(By.xpath("//label[text()='Y']/..//input")).click();

        driver.findElement(By.xpath("//input[contains(@id,'datefield')]")).sendKeys("10/10/22");
        driver.findElement(By.cssSelector("[name='Diary_Task_AssignedToList']")).sendKeys("Ana Vasic");

        driver.findElement(By.cssSelector("[name='Diary_Task_TypeList']")).sendKeys("Miscellaneous");

        driver.findElement(By.xpath("//input[contains(@id,'textfield') and @name='Diary_TaskTitle']")).sendKeys("Test");
        driver.findElement(By.cssSelector("[name='Diary_TaskDescription']")).sendKeys("Test");

        driver.findElement(By.cssSelector("#mini-diary-submit-button-btnInnerEl")).click();
        pause(2);
    }

    @And("I verify task is listed in the diary {string}")
    public void iVerifyTaskIsListedInTheDiary(String task) throws Throwable {
        new CommonComponentsAndActions(driver).navigateToDiaryTab();
        pause(2);
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='" + task + "']")).isDisplayed());
    }

    @And("I select a policy by ID {string} from policies list")
    public void iSelectAPolicyByIDFromPoliciesList(String policyID) {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='" + policyID + "']")), 0);
    }

    @And("I select created policy")
    public void iSelectCreatedPolicy() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='" + data.get("Policy_ID") + "']")), 0);
    }

    @And("I select renewal policy")
    public void iSelectRenewalPolicy() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='" + data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1" + "']")), 0);
    }

    @And("I click bor transfer button")
    public void iClickBorTransferButton() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='bor transfer']")), 0);
    }

    @And("I select bor customer {string}")
    public void iSelectBorCustomer(String borCustomer) throws Throwable {
        new CommonComponentsAndActions(driver).typeTexts(driver.findElements(By.xpath("//div[text()='Customer Search']/../../../..//input")), 0, borCustomer);
        pause(3);
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//li[contains(text()," + borCustomer + ")]")), 0);
    }

    @And("I select bor broker {string}")
    public void iSelectBorBroker(String borBroker) throws Throwable {
        new CommonComponentsAndActions(driver).typeTexts(driver.findElements(By.xpath("//div[text()='New Broker Search']/../../../..//input")), 0, borBroker);
        pause(3);
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//li[contains(text()," + borBroker + ")]")), 0);
    }

    @And("I click display customer details button")
    public void iClickDisplayCustomerDetailsButton() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='Display Customer Details']")), 0);
    }

    @And("I set licensed producer for bor policies")
    public void iSetLicensedProducerForBorPolicies() throws Throwable {
        CommonComponentsAndActions ca = new CommonComponentsAndActions(driver);
        List<WebElement> producers = driver.findElements(By.xpath("//div[text()='States']/../../../../../..//table//td[4]/div"));

        for (int i = 0; i < producers.size(); i++) {
            ca.clickElements(driver.findElements(By.xpath("//div[text()='States']")), 0);
            pause(2);
            ca.clickElements(producers, i);
            WebElement ae = driver.switchTo().activeElement();
            ae.sendKeys(Keys.ARROW_DOWN);
            ae.sendKeys(Keys.ENTER);
            pause(2);
        }
    }

    @And("I set advisor for bor policies")
    public void iSetAdvisorForBorPolicies() throws Throwable {
        CommonComponentsAndActions ca = new CommonComponentsAndActions(driver);
        List<WebElement> producers = driver.findElements(By.xpath("//div[text()='States']/../../../../../..//table//td[5]/div"));

        for (int i = 0; i < producers.size(); i++) {
            ca.clickElements(driver.findElements(By.xpath("//div[text()='States']")), 0);
            pause(2);
            ca.clickElements(producers, i);
            WebElement ae = driver.switchTo().activeElement();
            ae.sendKeys(Keys.ARROW_DOWN);
            ae.sendKeys(Keys.ENTER);
            pause(2);
        }
    }

    @And("I schedule bor transfer")
    public void iScheduleBorTransfer() {
        new CommonComponentsAndActions(driver).clickElements(driver.findElements(By.xpath("//span[text()='>>> schedule bor transfer']")), 0);
    }

    @And("I verify that agency transfer is scheduled successfully")
    public void iVerifyThatAgencyTransferIsScheduledSuccessfully() {
        Assert.assertTrue(driver.findElement(By.xpath("//li/span[text()='The Agency Transfer was scheduled successfully.']")).isDisplayed());
    }

    @And("I create performance execution record ID with defined scenario ID {string}")
    public void iCreatePerformanceExecutionRecordIDWithDefinedScenarioID(String scenarioId) throws Throwable {
        pause(5);
        Scenario_ID = scenarioId;
        USER_SESSION_ID = data.get("SESSION_ID");
        if (hasValue(USER_SESSION_ID)) {
            SQLManager.connectAndInsertPerfResults(EXECUTION_ID, scenarioId, USER_SESSION_ID);
        } else {
            pause(5);
            USER_SESSION_ID = new CommonComponentsAndActions(driver).getUserSessionId();
            SQLManager.connectAndInsertPerfResults(EXECUTION_ID, scenarioId, USER_SESSION_ID);
        }
    }

    @And("I get customer ID, store to DB and return to Policy Info Page")
    public void iGetCustomerIDStoreToDBAndReturnToPolicyInfoPage() throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCustomerPage();
        CUSTOMER_ID = new CustomerSummaryPage(driver).getAccountID();
        pause(8);
        SQLManager.writeToPerformanceTransaction(EXECUTION_ID, Scenario_ID, CUSTOMER_ID);
        pause(5);
        new CustomerSummaryPage(driver).openQuote();
        pause(3);
        new CommonComponentsAndActions(driver).navigateToQuoteDetailsPage();
    }

    @And("I set {string} as Agency Name and {string} as Agency ID")
    public void iSetAsAgencyNameAndAsAgencyID(String agencyName, String agencyId) {
        DataManager.getInstance().setKey("AGENCY_NAME", agencyName);
        DataManager.getInstance().setKey("AGENCY_ID", agencyId);
    }

    @And("I think for {int} to {int} seconds")
    public void iThinkForToSeconds(int min, int max) throws InterruptedException {
        Random r = new Random();
        int seconds = r.nextInt((max - min) + 1) + min;
        Thread.sleep(seconds * 1000L);
    }

    @And("I think for {int} to {int} seconds and I keep navigating to policies and customers page {int} times")
    public void iThinkForToSecondsAndIKeepNavigatingToPoliciesAndCustomersPage(int min, int max, int times) throws Throwable {
        System.out.println(LocalDateTime.now());
        for (int i = 1; i <= times; i++) {
            for (int j = 0; j < 2; j++) {
                new CommonComponentsAndActions(driver).navigateToPoliciesPage();
                iThinkForToSeconds(min, max);
            }
            for (int j = 0; j < 8; j++) {
                new CommonComponentsAndActions(driver).navigateToCustomersPage();
                iThinkForToSeconds(min, max);
            }
        }
        System.out.println(LocalDateTime.now());
    }

    @And("I think for {int} to {int} seconds and i keep navigating to transactions and endorsements page for {int} times for {string}")
    public void iThinkForToSecondsAndIKeepNavigatingToTransactionsAndEndorsementsPageForTimes(int min, int max, int times, String policyID) throws Throwable {
        new CommonComponentsAndActions(driver).navigateToPoliciesPage();
        iSelectAPolicyByID(policyID);
        for (int i = 1; i <= times; i++) {
            iThinkForToSeconds(min, max);
            new CommonComponentsAndActions(driver).navigateToTransactionsOrEndorsementsPage();
            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            commonComponentsAndActions.clickElement(commonComponentsAndActions.customerSummary);
        }
    }

    @And("I think for {int} to {int} seconds and i keep clicking customer summary tab for {int} times")
    public void iThinkForToSecondsAndIKeepClickingCustomerSummaryTabForTimes(int min, int max, int times) throws Throwable {
        for (int i = 1; i <= times; i++) {
            iThinkForToSeconds(min, max);
            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            commonComponentsAndActions.clickElement(commonComponentsAndActions.customerSummary);
        }
    }

    @And("I think for {int} to {int} seconds an I keep navigating to policy image page for {int} times")
    public void iThinkForToSecondsAnIKeepNavigatingToPolicyImagePageForTimes(int min, int max, int times) throws Throwable {
        String RENEWAL_IN_RATED_STATUS = DataManager.getInstance().getKey("RENEWAL_IN_RATED_STATUS");

        for (int i = 1; i <= times; i++) {
            iThinkForToSeconds(min, max);
            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            commonComponentsAndActions.clickElement(commonComponentsAndActions.customerSummary);
            commonComponentsAndActions.navigateToPolicyImagePage(RENEWAL_IN_RATED_STATUS);
        }
    }

    @And("I think for {int} to {int} seconds and i keep logging in as {string} for {int} times")
    public void iThinkForToSecondsAndIKeepLoggingInForTimes(int min, int max, String user, int times) throws Throwable {
        for (int i = 1; i <= times; i++) {
            iThinkForToSeconds(min, max);
            new LoginPage(driver).login(ENV, user);
        }
    }

    @And("I think for {int} to {int} seconds and i keep navigating to quote summary page for {int} times for {string}")
    public void iThinkForToSecondsAndIKeepNavigatingToQuoteSummaryPageForTimesFor(int min, int max, int times, String accountID) throws Throwable {
        new CommonComponentsAndActions(driver).navigateToCustomersPage();
        iSelectCustomerByID(accountID);
        driver.findElement(By.xpath("//div[text()='all quotes']/../../../../../..//table[@class='x-grid-item']//td[1]//span")).click();
        for (int i = 1; i <= times; i++) {
            iThinkForToSeconds(min, max);
            new CommonComponentsAndActions(driver).clickQuoteSummaryPage();
        }
    }

    @And("I print {string} - {string}")
    public void iPrint(String arg0, String arg1) {
        System.out.println(arg0 + " " + arg1);
    }

    @Then("I bind a CC quote")
    public void iBindACCQuote() throws Throwable {
        pause(10);

        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        boolean requestBind = commonComponentsAndActions.isElementPresentByXPath("//span[contains(text(),'>>> request bind')]");
        boolean bind = commonComponentsAndActions.isElementPresentByXPath("//span[contains(text(),'bind')]");

        if (requestBind)
            commonComponentsAndActions.clickRequestBind();
        if (bind)
            commonComponentsAndActions.clickBind();

//        if (ENV.equalsIgnoreCase("AWS_STG") && !bind) {
//            commonComponentsAndActions.navigateToCustomerPage();
//            pause(10);
//            data.put("Account_ID", new CustomerSummaryPage(driver).getAccountID());
//            commonComponentsAndActions.navigateToHomePage();
//            commonComponentsAndActions.navigateToRatingLogPage();
//            new RatingLogPage(driver).searchAndSelectQuoteByHHID(data.get("Account_ID"));
//            new QuoteFactorOverridePage(driver).overrideAll();
//            new QuoteFactorOverridePage(driver).processOverride();
//            commonComponentsAndActions.navigateBack();
//            commonComponentsAndActions.navigateToCustomersPage();
//            new CustomersPage(driver).selectACustomerByID(data.get("Account_ID"));
//            new CustomerSummaryPage(driver).navigateToQuote();
//            commonComponentsAndActions.clickRequestBind();
//            commonComponentsAndActions.clickBind();
//        } else if (ENV.equalsIgnoreCase("AWS_QA") && !bind) {
//            commonComponentsAndActions.navigateToCustomerPage();
//            pause(10);
//            data.put("Account_ID", new CustomerSummaryPage(driver).getAccountID());
//            commonComponentsAndActions.navigateToHomePage();
//            commonComponentsAndActions.navigateToRatingLogPage();
//            new RatingLogPage(driver).searchAndSelectQuoteByHHID(data.get("Account_ID"));
//            new QuoteFactorOverridePage(driver).overrideAll();
//            new QuoteFactorOverridePage(driver).processOverride();
//            commonComponentsAndActions.navigateBack();
//            commonComponentsAndActions.navigateToQuotesPage();
//            new QuotesPage(driver).searchAndSelectAQuote(data.get("Account_ID"));
//            commonComponentsAndActions.clickRequestBind();
//            commonComponentsAndActions.clickBind();
//        }

        new PolicyDeliveryPage(driver).fillPolicyDelivery("Yes", "PrintByPure");

        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.clickConfirm();
        try {
            data.put("Grand_Total_Premium_NB", new BillingChoicesPage(driver).retrieveGrandTotal());
        } catch (Exception e) {
            data.put("Grand_Total_Premium_NB", "null");
        }
        commonComponentsAndActions.clickRequestBind();

        POLICY_ID = new CustomerSummaryPage(driver).getPolicyID();
        data.put("Policy_ID", POLICY_ID);
        reportTextAttachment(POLICY_ID, POLICY_ID);
        try {
            commonComponentsAndActions.writePolicyIdsInFile(POLICY_ID + ", " + data.get("Effective_Date"));
            pause(3);
        } catch (Exception e) {

        }
    }

    @And("I override rating")
    public void overrideRatingLog() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.navigateToCustomerPage();
        pause(10);
        data.put("Account_ID", new CustomerSummaryPage(driver).getAccountID());
        commonComponentsAndActions.navigateToHomePage();
        commonComponentsAndActions.navigateToRatingLogPage();
        new RatingLogPage(driver).searchAndSelectQuoteByHHID(data.get("Account_ID"));
        new QuoteFactorOverridePage(driver).overrideAll();
        new QuoteFactorOverridePage(driver).processOverride();
        commonComponentsAndActions.navigateBack();
        commonComponentsAndActions.navigateToCustomersPage();
        new CustomersPage(driver).selectACustomerByID(data.get("Account_ID"));
        new CustomerSummaryPage(driver).navigateToQuote();
    }

    @And("I select a quote by customer id {string}")
    public void iSelectAQuoteByCustomerId(String customerID) throws Throwable {
        new QuotesPage(driver).searchAndSelectAQuote(customerID);
    }

    @Then("I verify the Line Of Authority")
    public void iVerifyThatForLineOfAuthority(DataTable table) {
        SubRolePage subRolePage = new SubRolePage(driver);

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String lineOfAuthority = columns.get(0);
            String authority = columns.get(1);
            String limit = columns.get(2);

            subRolePage.verifyAuthority(lineOfAuthority, authority, limit);
        }
        new CommonComponentsAndActions(driver).reportScreenshot("Authority", "Authority");
    }

    @And("I select a subrole by name {string}")
    public void iSelectASubroleByName(String name) throws Throwable {
        new SubRolePage(driver).selectUserByUserFullName(name);
    }

    @Then("Import inforce sheet data")
    public void importInforceSheetData(DataTable table) throws Exception {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String inforceSheetWorkbookName = columns.get(0);
            String inforceSheetSheetName = columns.get(1);
            String templateWorkbookName = columns.get(2);
            String targetWorkbookName = columns.get(3);
            String targetSheetName = columns.get(4);
            String propertiesFilePath = columns.get(5);
            String row = columns.get(6);

            ExcelDataTransfer.transferData(
                    inforceSheetWorkbookName,
                    inforceSheetSheetName,
                    templateWorkbookName,
                    targetWorkbookName,
                    targetSheetName,
                    propertiesFilePath,
                    Integer.parseInt(row)
            );
        }
    }

    @Then("I create cancellation transaction")
    public void iCreateCancellationTransaction(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String requestedBy = columns.get(0);
            String effectiveDate = columns.get(1);
            String notes = columns.get(2);
            String method = columns.get(3);
            String reason = columns.get(4);
            String flatCancelMEP = columns.get(5);
            String reasonForFlatCancel = columns.get(6);

            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            NewTransactionPage newTransactionPage = new NewTransactionPage(driver);
            CancellationPage cancellationPage = new CancellationPage(driver);

            commonComponentsAndActions.clickNewTransaction();
            newTransactionPage.setTransactionType("Cancellation");
            pause(2);
            String date;
            if (effectiveDate.equalsIgnoreCase("Tomorrow")) {
                if (hasValue(data.get("Endorsement_Effective_Date_END"))) {
                    date = data.get("Endorsement_Effective_Date_END");
                } else {
                    date = data.get("Effective_Date");
                }
                date = commonComponentsAndActions.getIncrementDate(date, 1);
            } else {
                date = effectiveDate.equalsIgnoreCase("Today") ? data.get("Effective_Date") : effectiveDate;
            }
            newTransactionPage.setNewTransactionEffectiveDate(date);
            CANCELLATION_DATE = date;
            newTransactionPage.setCancellationRequestedBy(requestedBy);
            newTransactionPage.setNotes(notes);
            commonComponentsAndActions.clickNext();
            try {
                cancellationPage.setCancellationMethod(method);
                cancellationPage.setCancellationReason(reason);
                if (hasValue(flatCancelMEP)) {
                    newTransactionPage.setFlatCancelMEP(flatCancelMEP);
                }
                if (hasValue(reasonForFlatCancel)) {
                    newTransactionPage.setReasonForFlatCancel(reasonForFlatCancel);
                }
                commonComponentsAndActions.clickProcess();
                commonComponentsAndActions.clickOK();
            } catch (Exception e) {
                commonComponentsAndActions.clickModifyOOS();
                cancellationPage.setCancellationMethod(method);
                cancellationPage.setCancellationReason(reason);
                if (hasValue(flatCancelMEP)) {
                    newTransactionPage.setFlatCancelMEP(flatCancelMEP);
                }
                if (hasValue(reasonForFlatCancel)) {
                    newTransactionPage.setReasonForFlatCancel(reasonForFlatCancel);
                }
                commonComponentsAndActions.clickProcess();
                commonComponentsAndActions.clickOK();
            }
            commonComponentsAndActions.ifDisplayedClickProcessAndOK();
        }
    }

    @Then("I create and process cancellation transaction on a specific date")
    public void iCreateCancellationTransactionOnSpecificDate(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String requestedBy = columns.get(0);
            String effectiveDate = columns.get(1);
            String notes = columns.get(2);
            String method = columns.get(3);
            String reason = columns.get(4);
            String flatCancelMEP = columns.get(5);
            String reasonForFlatCancel = columns.get(6);

            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            NewTransactionPage newTransactionPage = new NewTransactionPage(driver);
            CancellationPage cancellationPage = new CancellationPage(driver);

            commonComponentsAndActions.clickNewTransaction();
            newTransactionPage.setTransactionType("Cancellation");
            pause(2);
            newTransactionPage.setNewTransactionEffectiveDate(effectiveDate);
            newTransactionPage.setCancellationRequestedBy(requestedBy);
            newTransactionPage.setNotes(notes);
            commonComponentsAndActions.clickNext();
            try {
                cancellationPage.setCancellationMethod(method);
                cancellationPage.setCancellationReason(reason);
                if (hasValue(flatCancelMEP)) {
                    newTransactionPage.setFlatCancelMEP(flatCancelMEP);
                }
                if (hasValue(reasonForFlatCancel)) {
                    newTransactionPage.setReasonForFlatCancel(reasonForFlatCancel);
                }
                commonComponentsAndActions.clickProcess();
                commonComponentsAndActions.clickOK();
            } catch (Exception e) {
                commonComponentsAndActions.clickModifyOOS();
                cancellationPage.setCancellationMethod(method);
                cancellationPage.setCancellationReason(reason);
                if (hasValue(flatCancelMEP)) {
                    newTransactionPage.setFlatCancelMEP(flatCancelMEP);
                }
                if (hasValue(reasonForFlatCancel)) {
                    newTransactionPage.setReasonForFlatCancel(reasonForFlatCancel);
                }
                commonComponentsAndActions.clickProcess();
                commonComponentsAndActions.clickOK();
            }
            commonComponentsAndActions.ifDisplayedClickProcessAndOK();
        }
    }

    @Then("I create reinstatement transaction")
    public void iCreateReinstatementTransaction(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String description = columns.get(0);
            String notes = columns.get(1);
            String claimsLosses = columns.get(2);
            String reason = columns.get(3);

            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            NewTransactionPage newTransactionPage = new NewTransactionPage(driver);
            ReinstatementPage reinstatementPage = new ReinstatementPage(driver);

            commonComponentsAndActions.clickNewTransaction();
            newTransactionPage.setTransactionType("Reinstatement");
            pause(2);
            if (hasValue(CANCELLATION_DATE)) {
                newTransactionPage.setNewTransactionEffectiveDate(CANCELLATION_DATE);
            } else {
                newTransactionPage.setNewTransactionEffectiveDate(data.get("Effective_Date"));
            }
            newTransactionPage.setDescription(description);
            newTransactionPage.setNotes(notes);
            commonComponentsAndActions.clickNext();
            reinstatementPage.setClaimsLossesPostCancellation(claimsLosses);
            reinstatementPage.setReinstatementReason(reason);
            commonComponentsAndActions.clickProcess();
            commonComponentsAndActions.clickOK();
        }
        DataManager.getInstance().setKey("Current_Term_Transaction", "Reinstatement");
    }

    @Then("I create new business rewrite transaction")
    public void iCreateNewBusinessRewriteTransaction(DataTable table) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        NewTransactionPage newTransactionPage = new NewTransactionPage(driver);

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String notes = columns.get(0);
            String effectiveDate = columns.get(1);

            commonComponentsAndActions.clickNewTransaction();
            newTransactionPage.setTransactionType("New Business Rewrite");
            pause(2);
            newTransactionPage.setNewTransactionEffectiveDate(
                    effectiveDate.equalsIgnoreCase("DayAfterNewBusiness")
                            ? getTomorrowsDate()
                            : effectiveDate.equalsIgnoreCase("DayAfterEffectiveDate")
                            ? getDateAfterEffective(data.get("Effective_Date"))
                            : effectiveDate
            );

            newTransactionPage.setNotes(notes);

            commonComponentsAndActions.clickNext();
            commonComponentsAndActions.clickNext();
        }
        DataManager.getInstance().setKey("Current_Term_Transaction", "Rewrite");
    }

    @And("I complete rewrite transaction")
    public void iCompleteRewriteTransaction() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickCompleteRewriteTransaction();
        try {
            commonComponentsAndActions.clickCancel();
            commonComponentsAndActions.clickOK();
        } catch (Exception e) {
        }
    }

    @And("I add changes on {string} new business rewrite")
    public void iAddChangesOnNewBusinessRewrite(String arg0) {
        //TODO
    }

    @And("I select new business rewrite transaction")
    public void iSelectNewBusinessRewriteTransaction() {
        new TransactionsOrEndorsementsPage(driver).selectNewBusinessRewrite();
    }

    @Then("I select the first endorsement transaction")
    public void iSelectTheFirstEndorsementTransaction() {
        new TransactionsOrEndorsementsPage(driver).openFirstEndorsement();
    }

    @Then("I verify state mandated assessments {string}")
    public void iVerifyStateMandatedAssessments(String text) throws InterruptedException {
        pause(2);
        new CommonComponentsAndActions(driver).assertStateMandatedAssessmentsInclude(text);
    }

    @Then("I verify base rate {string}")
    public void iVerifyBaseRate(String baseRate) {
        new PremiumDetailPage(driver).verifyBaseRate(baseRate);
    }

    @Then("I verify base rates {string}")
    public void iVerifyBaseRates(String baseRates) {
        new PremiumDetailPage(driver).verifyBaseRates(baseRates);
    }

    @Then("I verify coverage factor and factor value")
    public void iVerifyBaseRate(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String coverage = columns.get(0);
            String factor = columns.get(1);
            String value = columns.get(2);
            new PremiumDetailPage(driver).verifyBaseRate(coverage, factor, value);
        }
    }

    @Then("I verify coverage {string} factor {string} is not present")
    public void iVerifyBaseRateNtPresent(String coverage, String factor) {
        new PremiumDetailPage(driver).verifyBaseRateNotPresent(coverage, factor);
    }

    @Then("I verify coverage factor and factor value for location")
    public void iVerifyBaseRateLocation(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String location = columns.get(0);
            String coverage = columns.get(1);
            String factor = columns.get(2);
            String value = columns.get(3);
            new PremiumDetailPage(driver).verifyBaseRateLocation(location, coverage, factor, value);
        }
    }

    @When("I initiate a policy extension")
    public void iInitiateAPolicyExtension() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        commonComponentsAndActions.clickExtendPolicy();
        commonComponentsAndActions.clickOK();
        iSelectATransaction("Policy Extension");
        commonComponentsAndActions.navigateToPolicyImagePage("No");
    }

    @And("I add changes on policy extension")
    public void iAddChangesOnPolicyExtension() throws Throwable {
        new QuoteCreator(driver).createPolicyExtension(data);
    }

    @And("I click renewed premium")
    public void iClickRenewedPremium() throws InterruptedException {
        new CommonComponentsAndActions(driver).clickRenewedPremium();
        skip = new CommonComponentsAndActions(driver).isRenewalPolicyExtensionProcessable();
        if (skip) {
            new CommonComponentsAndActions(driver).reportScreenshot("TransactionNotProcessable", "TransactionNotProcessable");
        }
        pause(10);
    }

    @And("I click review referrals")
    public void iClickReviewReferrals() throws Throwable {
        if (!skip)
            new CommonComponentsAndActions(driver).clickReviewReferrals();
    }

    @Then("I click process renewal")
    public void iClickProcessRenewal() throws Throwable {
        if (!skip)
            new CommonComponentsAndActions(driver).clickProcessRenewal();
    }

    @Then("I should see inspection fee")
    public void iShouldSeeInspectionFee() {
        //Premium summary page grand total, 350 inspection fee,  -
    }

    @Then("I verify validation messages are displayed")
    public void iVerifyValidationMessagesAreDisplayed(DataTable table) {
        OptionalCoveragesPage optionalCoveragesPage = new OptionalCoveragesPage(driver);
        int messageOrder = 1;
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String validationMessage = columns.get(0);
            optionalCoveragesPage.verifyValidationMessage(validationMessage, messageOrder);
            messageOrder++;
        }
        new CommonComponentsAndActions(driver).reportScreenshot("Validation messages should be displayed", "Validation messages should be displayed");
    }

    @Then("I verify validation messages are not displayed")
    public void iVerifyValidationMessagesAreNotDisplayed(DataTable table) {
        OptionalCoveragesPage optionalCoveragesPage = new OptionalCoveragesPage(driver);
        int messageOrder = 1;
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String validationMessage = columns.get(0);
            optionalCoveragesPage.verifyValidationMessageNotDisplayed(validationMessage, messageOrder);
            messageOrder++;
        }
        new CommonComponentsAndActions(driver).reportScreenshot("Validation messages should not be displayed", "Validation messages should not be displayed");
    }

    @Then("I verify wildfire premium is calculated")
    public void iVerifyWildfirePremiumIsCalculated() {
        new RMSRateCalculationsBlock(driver).verifyWildfirePremiumFinal();
    }

    @Then("I verify new values are present {string}")
    public void iVerifyNewValuesArePresent(String values) {
        new ChangeSummaryPage(driver).verifyChanges(values);
    }

    @Then("I should not be able to bind")
    public void iShouldNotBeAbleToBind() throws Throwable {
        pause(10);

        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        boolean requestBind = commonComponentsAndActions.isElementPresentByXPath("//span[contains(text(),'>>> request bind')]");
        boolean bind = commonComponentsAndActions.isElementPresentByXPath("//span[contains(text(),'bind')]");

        if (requestBind)
            commonComponentsAndActions.clickRequestBind();
        if (bind)
            commonComponentsAndActions.clickBind();

        pause(10);
        commonComponentsAndActions.reportScreenshot("Should_not_be_able_to_bind" + System.currentTimeMillis(), "Should_not_be_able_to_bind" + System.currentTimeMillis());
    }

    @And("I click order property details button")
    public void iClickOrderPropertyDetailsButton() throws Throwable {
        new CommonComponentsAndActions(driver).orderPropertyDetails();
    }

    @Then("I verify that the sinkhole report is pulled")
    public void iVerifyThatTheSinkholeReportIsPulled() {
        SinkholeBlock sinkholeBlock = new SinkholeBlock(driver);
        sinkholeBlock.verifyDistanceToClosestSinkhole("NotEmpty");
        sinkholeBlock.verifyNumberOfSinkholesFoundWithin_0_50_Miles("NotEmpty");
        sinkholeBlock.verifyNumberOfSinkholesFoundWithin_0_20_Miles("NotEmpty");
        sinkholeBlock.verifyDateReported("NotEmpty");
        sinkholeBlock.verifyNumberOfSinkholesFoundWithin_1_50_Miles("NotEmpty");
        sinkholeBlock.verifyRefNum("NotEmpty");
        sinkholeBlock.reportScreenshot("SinkholeReport", "SinkholeReport");
    }

    @And("I verify that the flood report is pulled")
    public void iVerifyThatTheFloodReportIsPulled() {
        FloodInformationBlock floodInformationBlock = new FloodInformationBlock(driver);
        floodInformationBlock.verifyPanelDate("NotEmpty");
        floodInformationBlock.verifyPanelNumber("NotEmpty");
        floodInformationBlock.verifyRiskMeterFloodZone("NotEmpty");
        floodInformationBlock.reportScreenshot("FloodReport", "FloodReport");
    }

    @And("I verify that the wildfire report is pulled")
    public void iVerifyThatTheWildfireReportIsPulled() {
        //
    }

    @And("I verify that earthquake report is pulled")
    public void iVerifyThatEarthquakeReportIsPulled() {
        //
    }

    @And("I verify that the geocoding report is pulled")
    public void iVerifyThatTheGeocodingReportIsPulled() {
        GeoLocationDetailsBlock geoLocationDetailsBlock = new GeoLocationDetailsBlock(driver);
        geoLocationDetailsBlock.verifyLatitude("NotEmpty");
        geoLocationDetailsBlock.verifyLongitude("NotEmpty");
        geoLocationDetailsBlock.verifyGeoCodedLocation("NotEmpty");
        geoLocationDetailsBlock.reportScreenshot("GeocodingReport", "GeocodingReport");
    }

    @And("I verify that the PPC report is pulled")
    public void iVerifyThatThePPCReportIsPulled() {
        //
    }

    @And("I verify that the distance to coast report is pulled")
    public void iVerifyThatTheDistanceToCoastReportIsPulled() {
        LocationDetailsBlock locationDetailsBlock = new LocationDetailsBlock(driver);
        locationDetailsBlock.verifyDistanceToCoastReadOnly("NotEmpty");
        locationDetailsBlock.reportScreenshot("DistanceToCoastReport", "DistanceToCoastReport");
    }

    @And("I navigate to previous page")
    public void iNavigateToPreviousPage() {
        new CommonComponentsAndActions(driver).navigateToPreviousPage();
    }

    @Then("I verify that the credit score report is pulled")
    public void iVerifyThatTheCreditScoreReportIsPulled() {
        CreditScoreTiersBlock creditScoreTiersBlock = new CreditScoreTiersBlock(driver);
        creditScoreTiersBlock.verifyInsuranceScoreForRating("pulled");
        creditScoreTiersBlock.verifyInsuranceScoreTier("NotEmpty");
        creditScoreTiersBlock.verifyDatePulled("NotEmpty");
        creditScoreTiersBlock.verifyApplicantInsuranceScore("NotEmpty");
        creditScoreTiersBlock.verifyInsuranceScoreType("NotEmpty");
        creditScoreTiersBlock.reportScreenshot("CreditScoreReport", "CreditScoreReport");
    }

    @And("I navigate to premium summary page")
    public void iNavigateToPremiumSummaryPage() {
        new CommonComponentsAndActions(driver).navigateToPremiumSummaryPage();
    }

    @And("I verify total premium value {string}")
    public void iVerifyTotalPremiumValue(String value) {
        new PremiumSummaryPage(driver).verifyTotalPremiumValue(value);
    }

    @And("I verify total annualized premium value {string}")
    public void iVerifyTotalAnnualizedPremiumValue(String value) {
        new PremiumSummaryPage(driver).verifyTotalAnnualizedPremiumValue(value);
    }

    @And("I verify inspection fee value {string}")
    public void iVerifyInspectionFeeValue(String value) {
        new PremiumSummaryPage(driver).verifyInspectionFeeValue(value);
    }

    @And("I verify surplus contribution fee value {string}")
    public void iVerifySurplusContributionFeeValue(String value) {
        new PremiumSummaryPage(driver).verifySurplusContributionFeeValue(value);
    }

    @And("I verify surplus lines broker fee value {string}")
    public void iVerifySurplusLinesBrokerFeeValue(String value) {
        new PremiumSummaryPage(driver).verifySurplusLinesBrokerFeeValue(value);
    }

    @And("I verify state mandated assessments value {string}")
    public void iVerifyStateMandatedAssessmentsValue(String value) {
        new PremiumSummaryPage(driver).verifyStateMandatedAssessmentsValue(value);
    }

    @And("I verify grand total value {string}")
    public void iVerifyGrandTotalValue(String value) {
        new PremiumSummaryPage(driver).verifyGrandTotalValue(value);
    }

    @And("I verify loss of use value {string}")
    public void iVerifyLossOfUseValue(String value) {
        new ExcessFloodBlock(driver).verifyLossOfUse(value);
    }

    @And("I print premium details")
    public void iPrintPremiumDetails() {
        new PremiumSummaryPage(driver).printPremiumDetails(data.get("State"));
    }

    @And("I verify that the wind pool report is pulled")
    public void iVerifyThatTheWindPoolReportIsPulled() {
        WindPoolBlock windPoolBlock = new WindPoolBlock(driver);
        windPoolBlock.verifyWindPoolTerritoryOrZone("NotEmpty");
        windPoolBlock.verifyState("NotEmpty");
        windPoolBlock.reportScreenshot("WindReport", "WindReport");
    }

    @And("I verify that the protection class report is pulled")
    public void iVerifyThatTheProtectionClassReportIsPulled() {
        LocationDetailsBlock locationDetailsBlock = new LocationDetailsBlock(driver);
        locationDetailsBlock.verifyProtectionClassDropdownValue("NotEmpty");
        locationDetailsBlock.verifyProtectionClassReadOnlyValue("NotEmpty");
        locationDetailsBlock.reportScreenshot("ProtectionClassReport", "ProtectionClassReport");
    }

    @Then("I click dropdown {string}")
    public void iClickDropdown(String element) throws Throwable {
        new CommonComponentsAndActions(driver).clickDropdownElement(element);
    }

    @And("I verify dropdown values")
    public void iVerifyDropdownValues(DataTable table) throws InterruptedException {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.pause(3000);
        commonComponentsAndActions.reportScreenshot("Dropdown values", "Dropdown values");
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        int expectedDropdownSize = rows.size();
        int actualDropdownSize = commonComponentsAndActions.dropdownOptions.size();
        int i = 0;
        for (List<String> columns : rows) {
            String value = columns.get(0);
            commonComponentsAndActions.verifyDropdownValue(value, i);
            i++;
        }
        if (expectedDropdownSize != actualDropdownSize)
            commonComponentsAndActions.failAssertion("Dropdown actual size doesn't match. Expected: " + expectedDropdownSize + ", found: " + actualDropdownSize);
    }

    @Then("I verify error message is shown {string}")
    public void iVerifyErrorMessageIsShown(String message) {
        new CommonComponentsAndActions(driver).verifyElementExistsByText(message);
    }

    @When("I click exit button")
    public void iClickExitButton() throws Throwable {
        new CommonComponentsAndActions(driver).clickExit();
    }

    @And("I click create application")
    public void iClickCreateApplication() {
        new CommonComponentsAndActions(driver).clickCreateApplication();
    }

    @Then("I verify combined per occurrence limit is less than {string}")
    public void iVerifyCombinedPerOccurrenceLimitIsLessThan(String value) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).verifyCombinedPerOccurrenceLimitIsLessThan(value);
    }

    @Then("I click process policy extension")
    public void iClickProcessPolicyExtension() throws Throwable {
        if (!ENV.contains("PRE_PROD")) {
            try {
                new CommonComponentsAndActions(driver).clickProcessPolicyExtension();
            } catch (Exception e) {
                pause(3);
                try {
                    new CommonComponentsAndActions(driver).navigateToPolicyImagePage(data.get("RENEWAL_IN_RATED_STATUS"));
                } catch (Exception ee) {
                    new CommonComponentsAndActions(driver).clickPolicyImage();
                }
                iReviewChanges();
                iClickRenewedPremium();
                new CommonComponentsAndActions(driver).clickProcessPolicyExtension();
            }
        }
    }

    @When("I click more changes button")
    public void iClickMoreChangesButton() throws InterruptedException {
        new CommonComponentsAndActions(driver).clickMoreChangesButton();
    }

    @And("I click request bind")
    public void clickRequestBind() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        try {
            commonComponentsAndActions.clickRequestBind();
        } catch (Exception e) {
            commonComponentsAndActions.clickBind();
        }
    }

    @And("I download document {string} and check if it's not null")
    public void iDownloadDocumentAndCheckSize(String doc) throws Throwable {
        new CommonComponentsAndActions(driver).downloadPolicyDocumentAndVerifyIfNotNull(doc, data);
    }

    @And("I download documents and check if it's not null")
    public void iDownloadDocumentsAndCheckSize(DataTable table) throws Throwable {
        List<Map<String, String>> documents = table.asMaps(String.class, String.class);
        for (Map<String, String> document : documents) {
            new CommonComponentsAndActions(driver).downloadPolicyDocumentAndVerifyIfNotNull(document.get("document"), data);
        }
    }

    @And("I verify that LC360 Rules are pulled")
    public void verifyLC360Rules() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Member Information");
        pause(2);
        new MemberInformationPage(driver).verifyLC360();
    }

    @And("I verify that {string} insurance score is not zero")
    public void iVerifyThatInsuranceScoreIsNotZero(String lob) throws Throwable {
        if (!ENV.contains("PROD")) {
            if (!data.get("State").equals("CA"))
                switch (lob) {
                    case "HO": {
                        new CommonComponentsAndActions(driver).goToPage("Homeowners Policy");
                        pause(2);
                        reportScreenshot("Insurance_Score" + System.currentTimeMillis(), "Insurance Score");

                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "0");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Insurance Score for Rating']/../../../..//input")).get(0).getText(), "0");
                    }
                    break;
                    case "PA": {
                        new CommonComponentsAndActions(driver).goToPage("Automobile Policy");
                        pause(2);
                        reportScreenshot("Insurance_Score" + System.currentTimeMillis(), "Insurance Score");

                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "0");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Insurance Score for Rating']/../../../..//input")).get(0).getText(), "0");

                    }
                    break;
                    case "PW": {
                        new CommonComponentsAndActions(driver).goToPage("Watercraft Policy");
                        pause(2);
                        reportScreenshot("Insurance_Score" + System.currentTimeMillis(), "Insurance Score");

                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Applicant Insurance Score']/../../../..//input")).get(0).getAttribute("value"), "");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Rating Tier']/../../../..//input")).get(0).getAttribute("value"), "");
                    }
                    break;
                    case "CO": {
                        new CommonComponentsAndActions(driver).goToPage("Collections");
                        pause(2);
                        reportScreenshot("Insurance_Score" + System.currentTimeMillis(), "Insurance Score");

                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
//                Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                    }
                    break;
                    case "HS": {
                        new CommonComponentsAndActions(driver).goToPage("Home Surplus Lines Policy");
                        pause(2);
                        reportScreenshot("Insurance_Score" + System.currentTimeMillis(), "Insurance Score");

                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Insurance Score Tier']/../../../..//input")).get(0).getAttribute("value"), "");
                    }
                    break;
                    case "ES": {
                        new CommonComponentsAndActions(driver).goToPage("Excess Liability Policy");
                        pause(2);
                        reportScreenshot("Insurance_Score" + System.currentTimeMillis(), "Insurance Score");

                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div")).get(0).getText(), "");
//                Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div")).get(0).getText(), "");
                    }
                    break;
                    case "EX": {
                        new CommonComponentsAndActions(driver).goToPage("Excess Liability Policy");
                        pause(2);
                        reportScreenshot("Insurance_Score" + System.currentTimeMillis(), "Insurance Score");

                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div")).get(0).getText(), "0");
                        Assert.assertNotEquals(driver.findElements(By.xpath("//div[text()='Insurance Score for Rating']/../../../..//input")).get(0).getText(), "0");
                    }
                    break;
                }
        } else {
            System.out.println("Skipping Insurance score not zero logic for PROD environment due to test data");
            Allure.addAttachment("Insurance Score", "Skipping Insurance Score check for PROD environment due to test data");
        }
    }

    @And("I generate and verify quote proposal document {string}")
    public void doQuoteProposal(String docName) throws Throwable {
        new PremiumSummaryPage(driver).generateAndVerifyQuoteProposal(docName, data);
    }

    @And("I fill out HO quote binding information page")
    public void fillOutBindingInformationHO() throws Throwable {
        new BindingInformationPage(driver).fillOutBindingInformationHO(data);
    }

    @And("I verify that Flood Elevation Certificate is pulled")
    public void isFloodElevationCertificatePulled() throws Throwable {
        ElevationCertificateBlock block = new ElevationCertificateBlock(driver);
        pause(2);
        reportScreenshot("Flood Elevation Certificate" + System.currentTimeMillis(), "Flood Elevation Certificate Integration");

        if (ENV.contains("TRUEUP_")) {
            new CommonComponentsAndActions(driver).goToPage(data.get("City_Name_Txt") + " " + data.get("State"));
        } else {
            new CommonComponentsAndActions(driver).goToPage("Elevation Certificate");
            block.verifyRiskMeterFloodZone("NotEmpty");
            block.verifyPanelNumber("NotEmpty");
            block.verifyPanelDate("NotEmpty");
        }
        block.verifyBFEFromRiskMeter("NotEmpty");
    }

    @And("I fill out HO quote elevation certificate details")
    public void iFillOutElevationCertificateDetails() throws Throwable {
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
    }

    @And("I fill out HO quote elevation certificate details block")
    public void iFillOutElevationCertificateDetailsBlock() throws Throwable {
        new ElevationCertificateBlock(driver).fillOutElevationCertificateInformationHO(data);
    }

    @And("I verify that LexisNexis returned data")
    public void isLexisNexisPulled() throws InterruptedException {
        pause(2);
        if (!new OperatorsObtainedThroughOnlineReportsBlock(driver).verifyIfDataReturned() ||
                !new VehiclesObtainedThroughOnlineReportsBlock(driver).verifyIfDataReturned()) {
            reportScreenshot("LexisNexis" + System.currentTimeMillis(), "LexisNexis Integration");
            Assert.fail("LexisNexis failed");
        }
        new CommonComponentsAndActions(driver).successLog("LexisNexis returned data");
        reportScreenshot("LexisNexis" + System.currentTimeMillis(), "LexisNexis Integration");
    }

    @And("I upload and sign required forms")
    public void iSignRequiredForms() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        RequiredFormsPage requiredFormsPage = new RequiredFormsPage(driver);
        pause(3);
        commonComponentsAndActions.clickElement(commonComponentsAndActions.customer);
        pause(3);
        commonComponentsAndActions.clickElement(commonComponentsAndActions.requiredFormsTab);
        pause(3);
        requiredFormsPage.fillSignaturePreferenceAndUpload();
        new EditAttachmentPage(driver).addAttachment(data);
        requiredFormsPage.goToSummary();
    }

    @And("I verify that collection is converted to large schedule")
    public void collectionConvertedToLargeSchedule() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Coverage Schedule");
        pause(7);
        new CoverageSchedulePage(driver).verifyIfConvertedToLargeSchedule();
    }

    @And("I export and verify large schedule file")
    public void iExportAndVerifyLargeSchedule() throws Throwable {
        new CoverageSchedulePage(driver).exportAndVerifyLargeScheduleSize();
    }

    @And("I verify that NADA PW is working")
    public void iAssertNADAPW() throws Throwable {
        new CommonComponentsAndActions(driver).callAndAssertNADA(data);
    }

    @And("I verify that PW Prefill is working")
    public void iAssertPWPrefill() throws InterruptedException {
        pause(2);
        reportScreenshot("PW Prefill" + System.currentTimeMillis(), "PW Prefill");
        WebElement vesselBlock = driver.findElements(By.xpath("//div[text()='vessel']")).get(0);
        vesselBlock.click();
        driver.switchTo().frame("vesselIframe");
        Assert.assertNotEquals(driver.findElement(By.xpath("//td[contains(@ng-bind,'|currency')]")).getText(), "$0.00");
        driver.switchTo().parentFrame();
    }

    @And("I verify that HS Risk Model used is {string}")
    public void iVerifyHSRiskModelUsed(String value) throws Throwable {
        new RiskModelInformationPage(driver).verifyHSRiskModel(value);
    }

    @And("I verify that inflation factor is applied")
    public void iVerifyInflationFactor() throws Throwable {
        new CommonComponentsAndActions(driver).clickElement(
                driver.findElements(By.xpath("//a[contains(text(),'Policy')]")).get(0)
        );
        pause(2);

        String lob = data.get("Admitted_Line");

        int replacementCost;
        if (lob.equalsIgnoreCase("Home Surplus Lines")) {
            replacementCost = Integer.parseInt(data.get("Risk_Addresses_Replacement_Cost"));
        } else {
            replacementCost = Integer.parseInt(data.get("Replacement_Cost"));
        }

        int replacementCostOnRenewal = Integer.parseInt(
                driver.findElement(By.xpath("//label//div[text()='Replacement Cost']/../../../..//input"))
                        .getAttribute("value").replace(",", "")
        );

        String dateString = driver.findElement(By.xpath("//label//div[text()='Effective Date']/../../../..//input"))
                .getAttribute("value");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate effectiveDateOnRenewal = LocalDate.parse(dateString, formatter);

        int expectedReplacementCost;

        switch (lob) {
            case "Homeowner": {
                LocalDate pdFiling;
                if (data.get("State").equalsIgnoreCase("CA")) {
                    pdFiling = LocalDate.of(2026, 1, 27);
                } else if (data.get("State").equalsIgnoreCase("IL")) {
                    pdFiling = LocalDate.of(2026, 1, 6);
                } else if (data.get("State").equalsIgnoreCase("MN")) {
                    pdFiling = LocalDate.of(2026, 1, 7);
                } else if (data.get("State").equalsIgnoreCase("KY")) {
                    pdFiling = LocalDate.of(2026, 1, 17);
                } else if (data.get("State").equalsIgnoreCase("IA") || data.get("State").equalsIgnoreCase("TX")) {
                    pdFiling = LocalDate.of(2026, 1, 16);
                } else if (data.get("State").equalsIgnoreCase("DC")) {
                    pdFiling = LocalDate.of(2025, 12, 30);
//            } else if (data.get("State").equalsIgnoreCase("NC")) {
//                pdFiling = LocalDate.of(2025, 12, 17);
                } else {
                    pdFiling = LocalDate.of(2026, 1, 1);
                }

                if (effectiveDateOnRenewal.isAfter(pdFiling) || effectiveDateOnRenewal.isEqual(pdFiling)) {
                    expectedReplacementCost = (int) (replacementCost + replacementCost * 0.05);
                } else {
                    expectedReplacementCost = (int) (replacementCost + replacementCost * 0.07);
                }
                break;
            }

            case "Home Surplus Lines": {
                LocalDate pdFiling = LocalDate.of(2026, 1, 1);
                if (effectiveDateOnRenewal.isAfter(pdFiling) || effectiveDateOnRenewal.isEqual(pdFiling)) {
                    expectedReplacementCost = (int) (replacementCost + replacementCost * 0.05);
                } else {
                    expectedReplacementCost = (int) (replacementCost + replacementCost * 0.07);
                }
                break;
            }

            default:
                throw new IllegalArgumentException("Unsupported LOB: " + lob);
        }

        Assert.assertEquals(replacementCostOnRenewal, expectedReplacementCost);
    }

    @And("I review and accept referrals on renewal if any")
    public void reviewAndAcceptReferralsOnRenewal() throws Throwable {
        pause(2);
        if (driver.findElements(By.xpath("//span[text()='renewed premium']")).size() > 0) {
            new CommonComponentsAndActions(driver).navigateToRenewedPremiumPage();
        }
        pause(2);
        if (driver.findElements(By.xpath("//span[contains(text(),'review referrals')]")).size() > 0) {
            new CommonComponentsAndActions(driver).clickReviewReferrals();
            iAcceptUnderwritingReferrals();
        }
    }

    @And("I review and accept referrals on endorsement if any")
    public void reviewAndAcceptReferralsOnEndorsement() throws Throwable {
        try {
            if (driver.findElements(By.xpath("//span[contains(text(),'review referrals')]")).size() > 0) {
                new CommonComponentsAndActions(driver).clickReviewReferrals();
                iAcceptReferralsEND();
            }
        } catch (Exception e) {
            //
        }
    }

    @And("I navigate to driver page and verify RMV")
    public void navigateToDriverAndVerifyRMV() throws Throwable {
        new DriverDetailsBlock(driver).verifyRMVWithRerate(data);
    }

    @And("I create a new email in mini diary email {string}, cc {string}")
    public void iCreateANewEmailInMiniDiary(String to, String cc) throws Throwable {
        new DiaryPage(driver).sendMiniDiaryEmail(to, cc);
    }

    @And("I upload and import Large Schedule collection file {string}")
    public void uploadAndImportLargeScheduleCollection(String doc) throws Throwable {
        new CoverageSchedulePage(driver).uploadAndImportLargeSchedule(doc);
    }

    @And("I convert to Collection large schedule")
    public void iConvertToCollectionLargeSchedule() throws Throwable {
        new CoverageByClassPage(driver).convertToLargeSchedule();
    }

    @And("I check premiums if they are equal for {string} and {string}")
    public void iCheckIfPremiumsAreEqual(String trx1, String trx2) throws InterruptedException {
        new TransactionsOrEndorsementsPage(driver).compareIfGrandTotalPremiumsAreMatching(trx1, trx2, "equal");
    }

    @And("I check premiums if they are {string} for {string} and {string}")
    public void iCheckIfPremiumsAreEqualOrNot(String value, String trx1, String trx2) throws InterruptedException {
        new TransactionsOrEndorsementsPage(driver).compareIfGrandTotalPremiumsAreMatching(trx1, trx2, value);
    }

    @And("I click roll forward")
    public void iClickRollForward() {
        try {
            new CommonComponentsAndActions(driver).clickRollForward();
        } catch (Exception e) {

        }
    }

    @And("I verify municipality tax total for all locations {string}")
    public void iVerifyMunicipalityTaxTotalForAllLocations(String value) {
        new PremiumSummaryPage(driver).verifyMunicipalityTaxTotalForAllLocations(value);
    }

    @And("I verify municipality tax total service fee {string}")
    public void iVerifyMunicipalityTaxTotalServiceFee(String value) {
        new PremiumSummaryPage(driver).verifyMunicipalityTaxTotalServiceFee(value);
    }

    @And("I verify kentucky state surcharge {string}")
    public void iVerifyKentuckyStateSurcharge(String value) {
        new PremiumSummaryPage(driver).verifyKentuckyStateSurcharge(value);
    }

    @And("I click on end submission button")
    public void iClickOnEndSubmissionButton() {
        new CommonComponentsAndActions(driver).clickEndSubmissionButton();
    }

    @Then("I refer quote to Pure programs")
    public void iReferQuoteToPurePrograms(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String reasonForEnding = columns.get(0);
            String referToHomeSurplus = columns.get(1);
            String reasonForNotReferring = columns.get(2);
            String additionalComments = columns.get(3);
            String generalReason = columns.get(4);
            String generalReasonComments = columns.get(5);

            new ReasonForEndSubmissionBlock(driver).setReasonForEnding(reasonForEnding, generalReason, generalReasonComments, data.get("State"));
            new ReasonForEndSubmissionBlock(driver).setReferToHomeSurplus(referToHomeSurplus, reasonForNotReferring, additionalComments, generalReason, generalReasonComments, data.get("State"));
            new CommonComponentsAndActions(driver).reportScreenshot("Refer Quote To Pure Programs", "Refer Quote To Pure Programs");
        }
        iClickOnEndSubmissionButton();
        pause(20);
    }

    @And("I refer policy to Pure programs")
    public void iReferPolicyToPurePrograms(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String transactionType = columns.get(0);
            String subType = columns.get(1);
            String notes = columns.get(2);
            String odenNotice = columns.get(3);
            String referToPURE = columns.get(4);
            String reasonForNotReferring = columns.get(5);
            String additionalComments = columns.get(6);
            String addCommentsToOden = columns.get(7);

            new TransactionDetailsBlock(driver).setTransactionType(transactionType, subType, notes, odenNotice, addCommentsToOden);
            new TransactionDetailsBlock(driver).setReferToPure(referToPURE, reasonForNotReferring, additionalComments);
        }
    }

    @And("I verify that Home quote is Declined")
    public void iVerifyThatHomeQuoteDeclined() {
        new CustomerSummaryPage(driver).verifyThatHomeQuoteDeclined();
    }

    @And("I verify that Refer to Home Surplus quote is created")
    public void iVerifyThatHomeQuoteReferToHomeSurplusQuote() {
        new CustomerSummaryPage(driver).verifyThatHomeQuoteReferToHomeSurplusQuote();
    }

    @And("I verify that Home policy refer to Home Surplus quote")
    public void iVerifyThatHomePolicyReferToHomeSurplusQuote() {
        new CustomerSummaryPage(driver).verifyThatHomePolicyReferToHomeSurplusQuote();
    }

    @And("I verify that Cancelled Home policy refers to Home Surplus quote")
    public void iVerifyThatCancelledHomePolicyReferToHomeSurplusQuote() {
        new CustomerSummaryPage(driver).verifyThatCancelledHomePolicyReferToHomeSurplusQuote();
    }

    @And("I verify that Home quote does not refer to Home Surplus quote")
    public void iVerifyThatHomeQuoteDoesNotReferToHomeSurplusQuote() {
        new CustomerSummaryPage(driver).verifyThatHomeQuoteDoesNotReferToHomeSurplusQuote();
    }

    @Then("I refer cancelled policy to Pure programs")
    public void iReferCancelledPolicyToPurePrograms(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String chooseTransaction = columns.get(0);
            String newTransactionEffectiveDate = columns.get(1);
            String notes = columns.get(2);
            String cancellationRequestedBy = columns.get(3);
            String cancellationMethod = columns.get(4);
            String cancellationReason = columns.get(5);
            String referToPURE = columns.get(6);
            String reasonForNotReferring = columns.get(7);
            String additionalComments = columns.get(8);

            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            String date = data.get("Effective_Date");
            if (newTransactionEffectiveDate.equalsIgnoreCase("Tomorrow")) {
                date = commonComponentsAndActions.getIncrementDate(date, 1);
            } else if (newTransactionEffectiveDate.equalsIgnoreCase("Today")) {
                date = data.get("Effective_Date");
            } else {
                date = newTransactionEffectiveDate;
            }

            new TransactionDetailsBlock(driver).setCancellation(chooseTransaction, date, notes, cancellationRequestedBy);
            new TransactionDetailsBlock(driver).setCancellationReason(cancellationMethod, cancellationReason);
            new TransactionDetailsBlock(driver).setCancellationReferToPure(referToPURE, reasonForNotReferring, additionalComments);
        }
    }

    @And("I set {string} as Licensed Producer and {string} as Advisor Servicer")
    public void iSetAsLicensedProducerAndAsAdvisorServicer(String licensedProducer, String advisorServicer) {
        DataManager.getInstance().setKey("Licensed_Producer_AWS_QA", licensedProducer);
        DataManager.getInstance().setKey("Advisor_Servicer_AWS_QA", advisorServicer);
    }

    @Then("I verify that Home policy is Cancelled")
    public void iVerifyThatHomePolicyIsCancelled() {
        new CustomerSummaryPage(driver).verifyThatHomePolicyIsCancelled();
    }

    @Then("I verify that Home policy is Active")
    public void iVerifyThatHomePolicyIsActive() {
        new CustomerSummaryPage(driver).verifyThatHomePolicyIsActive();
    }

    @Then("I verify that {string} policy is active")
    public void iVerifyThatHomePolicyIsActive(String lob) {
        new CustomerSummaryPage(driver).verifyThatPolicyIsActive(lob);
    }

    @And("I verify that Home policy does not refer to Home Surplus quote")
    public void iVerifyThatHomePolicyDoesNotReferToHomeSurplusQuote() {
        new CustomerSummaryPage(driver).verifyThatHomePolicyDoesNotReferToHomeSurplusQuote();
    }

    @Then("I verify that refer to Pure programs - No is display on summary policy transaction")
    public void iVerifyThatReferToPureProgramsNoIsDisplayOnSummaryPolicyTransaction() {
        new SummaryTransactionPage(driver).verifyThatReferToPureProgramsNoIsDisplayOnSummaryPolicyTransaction();
    }

    @And("I verify that reason for not referring is display on summary policy transaction")
    public void iVerifyThatReasonForNotReferringIsDisplayOnSummaryPolicyTransaction() {
        new SummaryTransactionPage(driver).verifyThatReasonForNotReferringIsDisplayOnSummaryPolicyTransaction();
    }

    @And("I verify that additional comments is display on summary policy transaction")
    public void iVerifyThatAdditionalCommentsIsDisplayOnSummaryPolicyTransaction() {
        new SummaryTransactionPage(driver).verifyThatAdditionalCommentsIsDisplayOnSummaryPolicyTransaction();
    }

    @Then("I verify that refer to Pure programs - Yes is display on summary policy transaction")
    public void iVerifyThatReferToPureProgramsYesIsDisplayOnSummaryPolicyTransaction() {
        new SummaryTransactionPage(driver).verifyThatReferToPureProgramsYesIsDisplayOnSummaryPolicyTransaction();
    }

    @And("I navigate to HS quote")
    public void iNavigateToHSQuote() throws Throwable {
        new CommonComponentsAndActions(driver).clickElement(driver.findElement(By.xpath("//span[contains(text(),'Home Surplus Lines - ')]")));
    }

    @And("I set Effective Date {int} days in the past")
    public void iSetPast(int i) throws ParseException {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        if (data.containsKey("Effective_Date")) {
            DataManager.getInstance().replaceKey("Effective_Date", commonComponentsAndActions.getDecrementDate(DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(LocalDateTime.now()), i));
        } else {
            DataManager.getInstance().setKey("Effective_Date", commonComponentsAndActions.getDecrementDate(DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(LocalDateTime.now()), i));
        }
    }

    @And("I set Effective Date {int} days in the future")
    public void iSetInTheFuture(int i) throws ParseException {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        if (data.containsKey("Effective_Date")) {
            DataManager.getInstance().replaceKey("Effective_Date", commonComponentsAndActions.getIncrementDate(data.get("Effective_Date"), i));
        } else {
            DataManager.getInstance().setKey("Effective_Date", commonComponentsAndActions.getIncrementDate(data.get("Effective_Date"), i));
        }
    }

    @And("I verify that the quote has the system current date as effective date")
    public void verifyThatTheQuoteHasTheSystemCurrentDateAsEffectiveDate() {
        new PolicyInformationBlock(driver).verifyThatTheQuoteHasTheSystemCurrentDateAsEffectiveDate();
    }

    @And("I verify that the quote has the same future effective date as the admitted Home quote")
    public void verifyThatTheQuoteHasTheSameFutureEffectiveDateAsTheAdmittedHomeQuote() {
        new PolicyInformationBlock(driver).verifyThatTheQuoteHasTheSameFutureEffectiveDateAsTheAdmittedHomeQuote(data);
    }

    @And("I click on the footer")
    public void iClickOnTheFooter() throws Throwable {
        new CommonComponentsAndActions(driver).clickFooter();
    }

    @And("I fill out PA quote driver assignment page if visible")
    public void iFillOutDriverAssignmentPageIfVisible() throws Throwable {
        if (new DriverAssignmentPage(driver).goToPage("Driver Assignment"))
            new DriverAssignmentPage(driver).assignDrivers(data);
    }

    @And("I expand node tree if needed")
    public void iExpandNodeTree() throws Throwable {
        new CommonComponentsAndActions(driver).iExpandNodeTreeIfNeeded();
    }

    @And("I fill out HS quote wildfire details page")
    public void iFillOutHSWildfire() throws Throwable {
        new WildfirePage(driver).fillWildfireDetailsPageHS(data);
    }

    @And("I generate premium items")
    public void iGeneratePremiumItems() {
        new CommonComponentsAndActions(driver).clickGeneratePremiumItems();
    }

    @And("I switch to new created node")
    public void switchToNewCreatedNode() throws Throwable {
        new CommonComponentsAndActions(driver).switchToNewCreatedNode();
    }

    @And("I approve uw referrals if visible and navigate back to policy image page")
    public void iApproveUWReferralsIfVisibleAndNavigateToPolicyIMG() throws Throwable {
        new UnderwritingReferralsPage(driver).approveAndAcceptUWReferralsIfVisible(data);
        new CommonComponentsAndActions(driver).navigateToPolicyImagePage("no");
    }

    @And("I approve uw referrals if visible")
    public void iApproveUWReferralsIfVisible() throws Throwable {
        new UnderwritingReferralsPage(driver).approveAndAcceptUWReferralsIfVisible(data);
    }

    @And("I verify {string} input {string} has value {string}")
    public void iVerifyInputHasValue(String input, String pos, String value) throws Throwable {
        try {
            new CommonComponentsAndActions(driver).assertCellValue(driver.findElements(By.xpath("//div[text()='" + input + "']/../../../../div//input[@aria-hidden=\"false\"]")).get(Integer.parseInt(pos) - 1), value, input);
        } catch (Exception e) {
            try {
                new CommonComponentsAndActions(driver).assertCellValue(driver.findElements(By.xpath("//font[text()='" + input + "']/../../../../../..//input")).get(Integer.parseInt(pos) - 1), value, input);
            } catch (Exception ee) {
                new CommonComponentsAndActions(driver).assertCellValue(driver.findElements(By.xpath("//div[text()='" + input + "']/../../../../..//input")).get(Integer.parseInt(pos) - 1), value, input);
            }
        }
        new CommonComponentsAndActions(driver).reportScreenshot(input + "_" + System.currentTimeMillis(), input + "_" + System.currentTimeMillis());
    }

    @And("I verify {string} {string} input {string} has value {string}")
    public void iVerifyBlockInputHasValue(String block, String input, String pos, String value) throws Throwable {
        new CommonComponentsAndActions(driver).assertCellValue(driver.findElements(By.xpath("    //div[text()='" + block + "']/../../../../../../../../../../../..//div[text()='" + input + "']/../../../../..//input")).get(Integer.parseInt(pos) - 1), value, input);
        new CommonComponentsAndActions(driver).reportScreenshot(input + "_" + System.currentTimeMillis(), input + "_" + System.currentTimeMillis());
    }

    @And("I verify {string} {int} checkbox is {string}")
    public void iVerifyCheckboxHasValue(String input, int i, String value) throws Throwable {
        if (value.equalsIgnoreCase("checked")) {
            Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + input + "']/../../../..//input")).get(i).isSelected());
        } else if (value.equalsIgnoreCase("not checked")) {
            Assert.assertFalse(driver.findElements(By.xpath("//div[text()='" + input + "']/../../../..//input")).get(i).isSelected());
        } else if (value.equalsIgnoreCase("visible")) {
            Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + input + "']/../../../..//input")).get(i).isDisplayed());
        } else {
            Assert.assertFalse(driver.findElements(By.xpath("//div[text()='" + input + "']/../../../..//input")).get(i).isDisplayed());
        }
    }

    @And("I verify {string} input {int} has value {string}")
    public void iVerifyInputHasValue(String input, int i, String value) throws Throwable {
        new CommonComponentsAndActions(driver).assertCellValue(driver.findElement(By.xpath("(//div[text()='" + input + "' and contains(@osviewid,'Label')]/ancestor::*[descendant::input][1]/descendant::input[1][@aria-hidden='false'])[" + i + "]")), value, input);
        new CommonComponentsAndActions(driver).reportScreenshot(input + "_" + System.currentTimeMillis(), input + "_" + System.currentTimeMillis());
    }

    @And("I verify {string} input has no value {string}")
    public void iVerifyInputHasNoValue(String input, String value) throws Throwable {
        new CommonComponentsAndActions(driver).assertCellValue(driver.findElement(By.xpath("//div[text()='" + input + "']/../../../../div//input[@aria-hidden=\"false\"]")), "NotHasValue:" + value, input);
        new CommonComponentsAndActions(driver).reportScreenshot(input + "_" + System.currentTimeMillis(), input + "_" + System.currentTimeMillis());
    }

    @And("I verify {string} input is not displayed")
    public void iVerifyInputHasValue(String input) {
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + input + "']/../../../..//input")).size() < 1);
    }

    @When("I get date pulled as {string}")
    public void iGetDatePulledAs(String arg0) {
        if (!hasValue(date1)) {
            date1 = driver.findElement(By.xpath("//div[text()='Date Pulled: ']/../../../..//div[@aria-readonly=\"true\"]")).getText();
        } else {
            date2 = driver.findElement(By.xpath("//div[text()='Date Pulled: ']/../../../..//div[@aria-readonly=\"true\"]")).getText();
        }
    }

    @Then("I should verify that {string} is older than {string}")
    public void iShouldVerifyThatIsOlderThan(String date1p, String date2p) {
        Assert.assertTrue(new CommonComponentsAndActions(driver).isSecondDateAfterFirstDate(date1, date2));
    }

    @And("I click auto create renewal")
    public void iNavigateToTransactionsOrEndorsements() throws Throwable {
        new CommonComponentsAndActions(driver).clickAutoCreateRenewal();
    }

    @And("I click auto create renewal nd")
    public void iNavigateToTransactionsOrEndorsementsND() throws Throwable {
        new CommonComponentsAndActions(driver).clickAutoCreateRenewalND();
    }

    @And("I click refer to underwriting button")
    public void iClickReferToUnderwritingButton() {
        new CommonComponentsAndActions(driver).clickReferToUnderwritingButton();
    }

    @And("I select a quote to be referred")
    public void iSelectAQuoteToBeReferred() {
        new CommonComponentsAndActions(driver).selectQuoteToBeReferred();
    }

    @And("I click continue referral to uw")
    public void iClickContinueReferralToUw() {
        new CommonComponentsAndActions(driver).iClickContinueReferralToUw();
    }

    @And("I add broker comments {string}")
    public void iAddBrokerComments(String comment) {
        new CommonComponentsAndActions(driver).iAddBrokerComments(comment);
    }

    @And("I click exit customer")
    public void iClickExitCustomer() {
        new CommonComponentsAndActions(driver).iClickExitCustomer();
    }

    @And("I refer a quote to underwriter")
    public void iReferAQuoteToUnderwriter() {
        iClickReferToUnderwritingButton();
        iSelectAQuoteToBeReferred();
        iClickContinueReferralToUw();
        iAddBrokerComments("refer");
        iClickReferToUnderwritingButton();
        iClickReferToUnderwritingButton();
    }

    @Then("I save coverage factor and value for {string} in {string} in {string} excel file for {string}")
    public void iSaveCoverageFactorAndValueForInExcel(String tcID, String us, String fileName, String transaction) throws IOException {
        try {
            String[] values = new PremiumDetailPage(driver).getCoverageFactorValue();
            new ExcelManager().writeBaseRatesDataToFile("src/test/test_data/dragon/us/expectedResults/" + us + "/" + fileName + "_" + tcID + "_" + CUSTOMER_ID, values, transaction);

        } catch (Exception e) {
            //
        }
        String[] values = new PremiumDetailPage(driver).getCoverageFactorValue();
        new ExcelManager().writeBaseRatesDataToFile("src/test/test_data/dragon/us/expectedResults/" + us + "/" + fileName + "_" + tcID + "_" + CUSTOMER_ID, values, transaction);
    }

    @Then("I verify that base rates match the expected values from {string} {string} {string} {string} for {string}")
    public void iVerifyThatBaseRatesMatchTheExpectedValuesFromFor(String tcID, String us, String fileName, String customerID, String transaction) throws IOException {
        List<List<String>> excelData = new ExcelManager().getExpectedBaseRateData(tcID, us, fileName, transaction, customerID);

        for (int i = 0; i < excelData.size(); i++) {
            String tableXpath = "//div[text()='quote premium debug information']/../../../../../..//*[contains(@class, 'x-grid-with-row-lines')]/div[contains(@class,'x-grid-item-container')]/table[" + (i + 1) + "]";
            String coverageXpath = tableXpath + "//tr/td[4]";
            String factorXpath = tableXpath + "//tr/td[6]";
            String valueXpath = tableXpath + "//tr/td[7]";

            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

            commonComponentsAndActions.scrollToWebElement(driver.findElement(By.xpath(coverageXpath)));
            WebElement coverageCell = driver.findElement(By.xpath(coverageXpath));

            WebElement factorCell = driver.findElement(By.xpath(factorXpath));

            WebElement valueCell = driver.findElement(By.xpath(valueXpath));

            String coverageText = coverageCell.getText().trim();
            String factorText = factorCell.getText().trim();
            String valueText = valueCell.getText().trim();

            SoftAssertion.assertEquals(excelData.get(i).get(0), coverageText);
            SoftAssertion.assertEquals(excelData.get(i).get(1), factorText);
            SoftAssertion.assertEquals(excelData.get(i).get(2), valueText);
        }
    }

    @Then("I compare {string} with {string} base rates in {string}")
    public void iCompareWithBaseRates(String file1, String file2, String folder) throws IOException {
        String path = "src/test/test_data/dragon/us/expectedResults/" + folder;
        ExcelManager.compareExcelFiles(path + file1, path + file2);
    }

    @Then("I verify {string} and {string} total after values match")
    public void iVerifyAndTotalAfterValuesMatch(String tx1, String tx2) throws InterruptedException {
        new TransactionsOrEndorsementsPage(driver).compareTransactionTotalAfterValue(tx1, tx2);
    }

    @Then("I verify that referrals are triggered {string}")
    public void iVerifyThatReferralsAreTriggered(String trigger) throws IOException {
        String[] referrals = data.get("Rule_IDs").split(",");

        for (String referral : referrals) {
            new UnderwritingReferralsPage(driver).verifyReferralTrigger(referral.trim(), trigger);
        }
    }

    @And("I do not include claim {string}")
    public void iDoNotIncludeClaim(String reason) throws Throwable {
        pause(5);
        new CommonComponentsAndActions(driver).clickElement(driver.findElement(By.xpath("//*[text()='Home CLUE Report has been received']")), "Home CLUE Report has been received");
        new CommonComponentsAndActions(driver).clickElement(driver.findElement(By.xpath("//*[text()='Include Claim?']/../../../../../../../../../..//tr//td[11]/div")), "Include claim");
        new CommonComponentsAndActions(driver).typeTextEnter(driver.switchTo().activeElement(), "Do not Include - " + reason, "Include Claim");
        new ClueMVRPage(driver).clickAssignClaims();
    }

    @And("I check checkbox {string}")
    public void iCheckCheckbox(String arg0) throws Throwable {
        try {
            new CommonComponentsAndActions(driver).checkCheckbox(driver.findElement(By.xpath("//*[contains(text(),'" + arg0 + "')]/..//input")), "Yes", arg0);
        } catch (Exception e) {
            try {
                new CommonComponentsAndActions(driver).checkCheckbox(driver.findElement(By.xpath("//*[contains(text(),'" + arg0 + "')]/../../../..//input")), "Yes", arg0);
            } catch (Exception ignored) {
            }
        }
    }

    @And("I choose {string} for {string}")
    public void iChoose(String answer, String question) throws Throwable {
        try {
            new CommonComponentsAndActions(driver).choose(
                    driver.findElement(By.xpath("(//div[contains(text(),'" + question + "')]/../../../../div//label[text()='Yes']/..//input)[last()]")),
                    driver.findElement(By.xpath("(//div[contains(text(),'" + question + "')]/../../../../div//label[text()='No']/..//input)[last()]")),
                    answer
            );
        } catch (Exception e) {
            new CommonComponentsAndActions(driver).choose(
                    driver.findElement(By.xpath("//*[contains(text(),'" + question + "')]/../../../../../div//label[text()='Yes']/..//input")),
                    driver.findElement(By.xpath("//*[contains(text(),'" + question + "')]/../../../../../div//label[text()='Yes']/..//input")),
                    answer
            );
        }
    }

    @And("I type to textarea {string}")
    public void iTypeToTextarea(String arg0) {
        new CommonComponentsAndActions(driver).typeText(driver.findElement(By.xpath("//textarea[@aria-hidden='false']")), arg0, arg0);
    }

    @And("I select dropdown value {string} for {string}")
    public void iSelectDropdownValueFor(String value, String label) {
        new CommonComponentsAndActions(driver).typeTextEnter(driver.findElement(By.xpath("//*[text()='" + label + "']/../../../../../../../../../../..//input")), value, label);
    }

    @And("I create ITNR transaction")
    public void iCreateITNRTransaction(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String subType = columns.get(0);
            String notes = columns.get(1);
            String instructions1 = columns.get(2);
            String instructions2 = columns.get(3);

            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            NewTransactionPage newTransactionPage = new NewTransactionPage(driver);

            commonComponentsAndActions.clickNewTransaction();
            newTransactionPage.setTransactionType("Intent to Non-Renew");
            pause(2);
            commonComponentsAndActions.typeTextEnter(driver.findElement(By.xpath("//*[text()='Sub-Type']/../../../..//input")), subType, "Sub Type");
            commonComponentsAndActions.typeText(driver.findElement(By.xpath("//*[text()='Notes']/../../../..//input")), notes, "Notes");
            commonComponentsAndActions.typeText(driver.findElements(By.xpath("//textarea")).get(1), instructions1, "Notes");
            commonComponentsAndActions.typeText(driver.findElements(By.xpath("//textarea")).get(2), instructions2, "Notes");
            commonComponentsAndActions.clickNext();
            commonComponentsAndActions.clickNext();
        }
    }

    @Then("I verify PSE Membership Agreement is mark as Signed")
    public void iVerifyPSEMembershipAgreementIsMarkAsSigned() throws Throwable {
        RequiredFormsPage requiredFormsPage = new RequiredFormsPage(driver);
        new CommonComponentsAndActions(driver).navigateToRequiredFormsTab();
        new MemberApplicationAndAgreementsBlock(driver).PSEMembershipAgreementIsSigned();
        requiredFormsPage.goToSummary();
    }

    @Then("I verify Surplus Contribution is displayed")
    public void iVerifySurplusContributionIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("(//div[text()='Surplus Contribution']/../../../../div)[1]")).isDisplayed(), "Surplus Contribution is displayed");
        reportScreenshot("Surplus_Contribution", "Surplus_Contribution");
    }

    @Then("I verify {string} is displayed")
    public void iVerifyCellIsVisible(String label) {
        Assert.assertTrue(driver.findElement(By.xpath("(//div[text()='" + label + "'])[1]")).isDisplayed(), label + " is displayed");
        reportScreenshot(" " + label + "is displayed", " " + label + "is displayed");
    }

    @Then("I verify that Surplus Lines Broker Fee is not displayed")
    public void iVerifyThatSurplusLinesBrokerFeeIsNotDisplayed() {
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='Surplus Lines Broker Fee']/../../../../div/div")).isEmpty(), "Surplus Lines Broker Fee is not displayed");
        reportScreenshot("Surplus_Lines_Broker_Fee", "Surplus_Lines_Broker_Fee");
    }

    @Then("I verify Surplus Contribution is not displayed")
    public void iVerifySurplusContributionIsNotDisplayed() {
        Assert.assertTrue(driver.findElements(By.xpath("(//div[text()='Surplus Contribution']/../../../../div)[1]")).isEmpty(), "Surplus Contribution is not displayed");
        reportScreenshot("Surplus_Contribution_Is_Not_Displayed", "Surplus_Contribution_Is_Not_Displayed");
    }

    @Then("I verify {string} block is exists")
    public void iVerifyStringBlockIsExists(String block) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'" + block + "')]")).isDisplayed(), "TIV block is displayed");
        reportScreenshot(block + " block is displayed", block + " block is displayed");
    }

    @Then("I verify that Aggregation Zone Current TIV is displayed and has value")
    public void iVerifyThatAggregationZoneCurrentTIVIsDisplayedAndHasValue() throws Throwable {
        pause(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Aggregation Zone Current TIV']/../../../../../../../../div")).isDisplayed(), "Aggregation Zone Current TIV");
        pause(3000);
        Assert.assertTrue(driver.findElement(By.xpath("(//span[text()='Aggregation Zone Current TIV']/../../../../../../../../..//tr[@aria-selected='true']//td)[5]/div")).isDisplayed(), "Aggregation Zone Current TIV");
        reportScreenshot("Aggregation Zone Current TIV is displayed", "Aggregation Zone Current TIV is displayed");
    }

    //TODO move to GenericSteps
    //TODO make more generic steps

    @Then("I verify dropdown size is {int}")
    public void iVerifyDropdownSize(int size) {
        new CommonComponentsAndActions(driver).verifyDropdownSize(size);
    }

    @And("I verify if element with message {string} is {string} on the UI")
    public void verifyElementWithMessage(String message, String displayedOrNot) {
        new CommonComponentsAndActions(driver).verifyElementOnUI(message, displayedOrNot);
    }

    @And("I verify if element with message {string} is displayed {int} times")
    public void verifyElementWithMessageSize(String message, int expectedCount) {
        new CommonComponentsAndActions(driver).verifyElementOnUI(message, expectedCount);
    }

    @And("I click >>> process")
    public void iClickProcess() {
        new CommonComponentsAndActions(driver).clickProcess();
    }

    @And("I click ok")
    public void iClickOK() throws Throwable {
        new CommonComponentsAndActions(driver).clickOK();
    }

    @And("I minimize node tree except the first node")
    public void iMinimizeNodeTree() throws Throwable {
        new CommonComponentsAndActions(driver).iMinimizeNodeTreeExceptTheFirstNode();
    }

    @And("I verify that the premium is calculated and displayed on Premium Summary page")
    public void iVerifyPremiumCalculationAndDisplay() {
        Assert.assertNotEquals((driver.findElement(By.xpath("//div[text()='Total Premium']/../../../../div/div"))).getText(), "0$");
        reportScreenshot("Generic" + System.currentTimeMillis(), "Generic scenarios");
    }

    @And("I verify block {string} exists")
    public void verifyBlockExistsOnUI(String block) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.verifyBlockExists(block);
    }

    @And("I verify block {string} exists with special tag")
    public void verifyBlockExistsOnUIWithTagT(String block) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.verifyBlockExistsWithTagT(block);
    }

    @Then("I verify that the old Dragon rating is used {string}")
    public void iVerifyDragonRating(String scenarioNumber) {
        PremiumDetailPage premiumDetailPage = new PremiumDetailPage(driver);
        premiumDetailPage.iVerifyDragonRating(scenarioNumber);
    }

    @Then("I verify that the new Coherent rating is used {string}")
    public void iVerifyCoherentRating(String scenarioNumber) {
        PremiumDetailPage premiumDetailPage = new PremiumDetailPage(driver);
        premiumDetailPage.iVerifyCoherentRating(scenarioNumber);
    }

    @Then("I execute a query and validate {string}")
    public void iExecuteQuery(String query) throws IOException {
        SQLManager sqlManager = new SQLManager();
        String premiumTest = sqlManager.connectAndExecuteSelectStatementCoherent(query, ENV, CURRENT_OBJECT_ID);
        premiumTest = premiumTest.replace("-", "");
        float difference = Float.parseFloat(premiumTest);
        if (premiumTest != null) {
            if (difference > 1) {
                Assert.fail();
            }
        } else {
            Assert.fail();
        }
    }

    @Then("I verify that the rating was successfully completed")
    public void verifyRatingStatus() {
        List<WebElement> errorElements = driver.findElements(By.xpath("//*[contains(text(),'Rating failed. Please re-rate or contact underwriter for review.')]"));
        if (!errorElements.isEmpty()) {
            Assert.fail("Rating failed. Error message displayed: 'Rating failed. Please re-rate or contact underwriter for review.'");
        }
    }

    @When("I select {string} for {string} on {string}")
    public void iSelectOptionForFieldOnPage(String option, String field, String page) throws Throwable {
        new CommonComponentsAndActions(driver).selectFieldOption(data, field, option, page);
    }

    @Then("I get current object ID")
    public void iCurrentID() {
        CURRENT_OBJECT_ID = new CommonComponentsAndActions(driver).getCurrentObjectId();
    }

    @Then("I search and verify data is returned using Location Search Tool")
    public void iSearchForLocationDataUsingLocationSearch(DataTable table) throws Throwable {
        RiskLocationsPage page = new RiskLocationsPage(driver);

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            page.switchToPageFrame();
            page.setAddressLine1(columns.get(0));
            page.setCity(columns.get(1));
            page.setState(columns.get(2));
            page.setZip(columns.get(3));
            page.clickRetrieveMatchingLocations();
            page.switchBackToContentFrame();
            page.verifyIfDataIsReturned();
        }
    }

    @Then("I search and verify data is returned using General Guidance Tool")
    public void iSearchForDataUsingGeneralGuidanceTool(DataTable table) throws Throwable {
        GeneralGuidanceToolPage page = new GeneralGuidanceToolPage(driver);
        page.switchToNewWindowsHandle();

        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            page.fillOutAndVerifyDwellingGuidanceToolPage(columns.get(0), columns.get(1), columns.get(2),
                    columns.get(3), columns.get(4));
        }
    }

    @And("I download the file {string} and verify keywords")
    public void iDownloadTheFileAndVerifyKeywords(String documentName, DataTable dataTable) throws Throwable {
        List<String> keywords = dataTable.asList();
        new CustomFileUtils(driver).downloadFileAndVerifyKeywords(documentName, keywords);
    }

    @And("I download the file {string} with index {int} and verify keywords")
    public void iDownloadTheFileAndVerifyKeywords(String documentName, int index, DataTable dataTable) throws Throwable {
        List<String> keywords = dataTable.asList();
        new CustomFileUtils(driver).downloadFileAndVerifyKeywords(documentName, index, keywords);
    }

    @And("I write text to {string} and value is {string}")
    public void iWriteTextToFieldAndValueIs(String field, String text) throws Throwable {
        new CommonComponentsAndActions(driver).writeTextToField(field, text);
    }

    @And("I verify that the options for fields are selected")
    public void iVerifyMultipleOptionsForFields(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : rows) {
            String yesOrNo = row.get("YesOrNo");
            String coverageType = row.get("CoverageType");
            new CommonComponentsAndActions(driver).verifyFieldOptionChecked(coverageType, yesOrNo);
        }
    }

    @And("I verify radio buttons are disabled")
    public void iVerifyRadioButtonAreDisabled(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : rows) {
            String yesOrNo = row.get("Option");
            String field = row.get("Field");
            new CommonComponentsAndActions(driver).verifyRadioOptionDisabled(field, yesOrNo);
        }
    }

    @Then("I should see exactly {int} visible input fields for {string}")
    public void iShouldSeeExactlyVisibleInputFieldsFor(int expectedVisibleCount, String text) {
        new CommonComponentsAndActions(driver).verifyVisibleFields(expectedVisibleCount, text);
    }

    @Then("I verify that the hidden field {string} for {string} BV has no values")
    public void iVerifyThatHiddenFieldHasNoValue(String field, String bv) {
        new CommonComponentsAndActions(driver).verifyHiddenFieldHasNoValueForBV(field, bv);
    }

    @Then("I verify that the hidden field {string} for {string} BV has {int} values")
    public void iVerifyThatHiddenFieldHasNoValue(String field, String bv, int expected) {
        new CommonComponentsAndActions(driver).verifyHiddenFieldHasValueForBV(field, bv, expected);
    }

    @And("I expand cover page tree")
    public void iExpandCoverPageTree() {
        new CommonComponentsAndActions(driver).expandCoverPageTree();
    }

    @And("I expand location page tree")
    public void iExpandLocationPageTree() {
        new CommonComponentsAndActions(driver).expandLocationPageTree();
    }

    @Then("I verify page {string} is {string} in tree")
    public void iVerifyPageIsInTree(String pageName, String condition) {
        new CommonComponentsAndActions(driver).verifyPageVisibility(pageName, condition);
    }

    @And("I verify page {string} is {string} page")
    public void iVerifyPageIsPage(String pageName, String pagePosition) {
        new CommonComponentsAndActions(driver).verifyPagePosition(pageName, pagePosition);
    }

    @Then("I verify block {string} is {string} on page")
    public void iVerifyBlockIsOnPage(String blockName, String condition) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyBlockVisibility(blockName, condition);
    }

    @Then("I verify checkbox {string} is {string} on page")
    public void iVerifyCheckboxIsOnPage(String checkboxName, String condition) {
        new CommonComponentsAndActions(driver).verifyCheckboxVisibility(checkboxName, condition);
    }

    @Then("I verify checkbox {string} is {string}")
    public void iVerifyCheckboxAvailable(String checkboxName, String condition) {
        new CommonComponentsAndActions(driver).verifyCheckboxAvailability(checkboxName, condition);
    }

    @Then("I verify the {string} label with {string} and {string} radio buttons is {string} in {string} block")
    public void iVerifyTheLabelWithAndRadioButtonsIsDisplayed(String labelText, String firstOption, String secondOption, String condition, String blockName) {
        new CommonComponentsAndActions(driver).verifyYesNoRadioButtons(labelText, firstOption, secondOption, condition, blockName);
    }

    @Then("I verify the {string} question with yes and no radio buttons is {string} in {string} block")
    public void iVerifyTheQuestionWithAndRadioButtonsIsDisabled(String question, String condition, String blockName) {
        new CommonComponentsAndActions(driver).verifyYesNoRadioButtonsDisabled(question, condition, blockName);
    }

    @Then("I verify the {string} distant label with {string} and {string} radio buttons is {string}")
    public void iVerifyTheDistantLabelWithAndRadioButtonsIsDisplayed(String labelText, String firstOption, String secondOption, String condition) {
        new CommonComponentsAndActions(driver).verifyYesNoRadioButtonsDistantLabel(labelText, firstOption, secondOption, condition);
    }

    @Then("I verify {string} has no default answer")
    public void iVerifyNoDefaultAnswer(String question) {
        new CommonComponentsAndActions(driver).verifyNoDefaultAnswer(question);
    }

    @Then("I verify {string} distant question doesn't have default answer")
    public void iVerifyNoDefaultAnswerDistant(String question) {
        new CommonComponentsAndActions(driver).verifyNoDefaultAnswerDistant(question);
    }

    @Then("I verify input field {string} is {string} in {string} block")
    public void iVerifyInputFieldIsInBlock(String fieldName, String condition, String blockName) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyInputFieldVisibility(fieldName, condition, blockName);
    }

    @Then("I verify input field {string} is read only with value {string}")
    public void iVerifyInputFieldIsReadOnlyWithValue(String inputLabel, String value) {
        new CommonComponentsAndActions(driver).verifyInputFieldReadOnlyValue(inputLabel, value);
    }

    @Then("I verify link {string} is {string} in {string} block")
    public void iVerifyLinkIsVisible(String link, String condition, String block) {
        new CommonComponentsAndActions(driver).verifyLinkIsVisible(link, condition, block);
    }

    @Then("I verify checkbox is {string} for label {string} in {string} block")
    public void iVerifyCheckboxIsVisibleForLabel(String condition, String labelName, String blockName) {
        new CommonComponentsAndActions(driver).verifyCheckboxVisibilityForLabel(condition, labelName, blockName);
    }

    @Then("I verify textbox {string} is {string} in {string} block")
    public void iVerifyTextboxIsInBlock(String textboxName, String condition, String blockName) {
        new CommonComponentsAndActions(driver).verifyTextboxVisibility(textboxName, condition, blockName);
    }

    @Then("I verify dropdown {string} is {string} in {string} block")
    public void iVerifyDropdownIsInBlock(String dropdownName, String condition, String blockName) {
        new CommonComponentsAndActions(driver).verifyDropdownVisibility(dropdownName, condition, blockName);
    }

    @Then("I verify value {string} is {string} for {string} field")
    public void iVerifyFieldValueVisibility(String fieldValue, String condition, String fieldName) {
        new CommonComponentsAndActions(driver).verifyFieldValueVisibility(fieldValue, condition, fieldName);
    }

    @Then("I verify read only field {string} is {string} in {string} block")
    public void iVerifyReadOnlyFieldIsInBlock(String fieldName, String condition, String blockName) {
        new CommonComponentsAndActions(driver).verifyReadOnlyFieldVisibility(fieldName, condition, blockName);
    }

    @Then("I click {string} radio button for label {string}")
    public void iClickRadioButtonForLabel(String option, String labelName) throws Throwable {
        try {
            new CommonComponentsAndActions(driver).clickRadioButtonForLabel(option, labelName);
        } catch (Exception e) {
        }
    }

    @Then("I click {string} radio button for distant label {string}")
    public void iClickRadioButtonForDistantLabel(String option, String labelName) throws Throwable {
        new CommonComponentsAndActions(driver).clickRadioButtonForDistantLabel(option, labelName);
    }

    @When("I initiate a new quote for a new customer")
    public void iInitiateNewQuoteForNewCustomer() throws Throwable {
        if (!hasValue(USER) || !USER.equalsIgnoreCase("BROKER")) {
            new CommonComponentsAndActions(driver).navigateToQuotesPage();
        }
        pause(30);
        new QuotesPage(driver).newQuote();
        pause(30);
        if (!hasValue(USER) || !USER.equalsIgnoreCase("BROKER")) {
            new QuotesPage(driver).searchAndSelectAgency(data, ENV);
        }
        new QuoteBasicInformationPage(driver).fillOutQuoteBasicInformationPage(data, ENV);
        iGetCustomerAccountID();
        iOpenQuoteUnderCustomer();
        new CommonComponentsAndActions(driver).navigateToQuoteDetailsPage();
    }

    @When("I create a new {string} quote for a new customer")
    public void iCreateNewQuoteForNewCustomer(String lob) throws Throwable {
        new CommonComponentsAndActions(driver).navigateToQuotesPage();
        new QuotesPage(driver).newQuote();
        pause(3);
        new QuotesPage(driver).searchAndSelectAgency(data, ENV);
        new QuoteBasicInformationPage(driver).fillOutQuoteBasicInformationPage(data, ENV);
        pause(5);
        iGetCustomerAccountID();
        iOpenQuoteUnderCustomer();
        new CommonComponentsAndActions(driver).navigateToQuoteDetailsPage();
        iCreateANewLOBQuote(lob);
    }

    @Then("I verify flood coverage page is {string}")
    public void iVerifyFloodCoveragePageIs(String condition) throws Throwable {
        iVerifyPageIsInTree("Flood Coverage", condition);
        iVerifyPageIsPage("Flood Coverage", "4");
        iTakeScreenshot("Flood Coverage - " + condition);

        if (condition.equalsIgnoreCase("visible")) {
            new CommonComponentsAndActions(driver).goToPage("Flood Coverage");
            iTakeScreenshot("Flood Coverage Page");
        }
    }

    @When("I rate, bind and initiate new endorsement")
    public void iRateBindAndInitiateNewEndorsement() throws Throwable {
        iRateAQuote();
        new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
        iAcceptUnderwritingReferrals();
        iBindAQuote();
        iOverrideSubjectivities();
        iSelectCreatedPolicy();
        new CommonComponentsAndActions(driver).navigateToTransactionsOrEndorsementsPage();
        iInitiateNewEndorsement();
    }

    @When("I rate, bind and initiate new renewal")
    public void iRateBindAndInitiateNewRenewal() throws Throwable {
        iRateAQuote();
        new CommonComponentsAndActions(driver).navigateToUnderwritingReferralsPage();
        iAcceptUnderwritingReferrals();
        iBindAQuote();
        iOverrideSubjectivities();
        iSelectCreatedPolicy();
        new CommonComponentsAndActions(driver).navigateToTransactionsOrEndorsementsPage();
        iCreateARenewal();
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        pause(3);
        try {
            commonComponentsAndActions.navigateToPolicyImagePage(data.get("RENEWAL_IN_RATED_STATUS"));
        } catch (Exception e) {
            commonComponentsAndActions.clickPolicyImage();
        }

        new CommonComponentsAndActions(driver).saveChanges();
        pause(5);

        //if there is a hard stop referral
        if (!driver.findElements(By.xpath("//div[text()='policy | transaction | underwriting review']")).isEmpty()) {
            new DragonSteps().iAcceptUnderwritingReferrals();
            commonComponentsAndActions.clickPolicyImage();
        }
    }

    @When("I review changes, issue an endorsement and create a renewal")
    public void iReviewChangesIssueAnEndorsementAndCreateARenewal() throws Throwable {
        iReviewChanges();
        iRateAQuote();
        new CommonComponentsAndActions(driver).navigateToUnderwritingAlertsTab();
        iAcceptUnderwritingReferrals();
        iIssueAnEndorsement();
        iCreateARenewal();
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        pause(3);
        try {
            commonComponentsAndActions.navigateToPolicyImagePage(data.get("RENEWAL_IN_RATED_STATUS"));
        } catch (Exception e) {
            commonComponentsAndActions.clickPolicyImage();
        }

        new CommonComponentsAndActions(driver).saveChanges();
        pause(5);

        //if there is a hard stop referral
        if (!driver.findElements(By.xpath("//div[text()='policy | transaction | underwriting review']")).isEmpty()) {
            new DragonSteps().iAcceptUnderwritingReferrals();
            commonComponentsAndActions.clickPolicyImage();
        }
    }

    @When("I review changes, process a renewal and create oos endorsement {string}")
    public void iReviewChangesProcessARenewalAndCreateOOSEndorsement(String date) throws Throwable {
        iReviewChanges();
        iClickRenewedPremium();
        new CommonComponentsAndActions(driver).navigateToUnderwritingAlertsTab();
        iAcceptUnderwritingReferrals();
        iClickProcessRenewal();
        iInitiateNewOOSEndorsement(date);
    }

    @When("I review changes, rate and issue an endorsement")
    public void iReviewChangesRateAndIssueAnEndorsement() throws Throwable {
        iReviewChanges();
        iRateAQuote();
        new CommonComponentsAndActions(driver).navigateToUnderwritingAlertsTab();
        iAcceptUnderwritingReferrals();
        iIssueAnEndorsement();
    }

    @Then("I verify that {string} label with {string} and {string} radio buttons is {string} on page")
    public void iVerifyThatLabelWithAndRadioButtonsIsOnPage(String labelText, String firstOption, String secondOption, String condition) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyYesNoRadioButtonsUnnamedBlocks(labelText, firstOption, secondOption, condition);
    }

    @Then("I verify that the {string} element is {string} on the UI")
    public void iVerifyThatTheElementIsOnTheUI(String element, String displayedOrNot) {
        new CommonComponentsAndActions(driver).verifyElementOnUI(element, displayedOrNot);
    }

    @Then("I verify that the UI change for the {string} type with the specified {string} block {string} is {string} on the UI")
    public void iVerifyThatTheUIChangeForTheTypeWithTheSpecifiedBlockIsOnTheUI(String elementType, String blockName, String labelName, String displayedOrNot) {
        new CommonComponentsAndActions(driver).verifyElementIsDisplayed(elementType, blockName, labelName, displayedOrNot);
    }

    @Then("I verify that {string} factor should not rated")
    public void iVerifyThatFactorShouldNotRated(String factor) {
        new PremiumDetailPage(driver).iVerifyFactorShouldNOTBeRated(factor);
    }

    @Then("I verify that referral is triggered")
    public void iVerifyThatReferralIsTriggered(DataTable table) throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        List<Map<String, String>> referrals = table.asMaps(String.class, String.class);
        for (Map<String, String> referral : referrals) {
            uwRefPage.verifyReferralTriggeredOrNot(referral.get("referrals").trim(), referral.get("triggeredOrNot").trim());
        }
    }

    @Then("I verify that Deductible Scenarios button is not displayed")
    public void verifyDeductibleScenarios() {
        List<WebElement> errorElements = driver.findElements(By.xpath("//span[text()='deductible scenarios']"));
        if (!errorElements.isEmpty()) {
            Assert.fail("Dedictible scenarios are not being displayed");
        }
    }

    @Then("I verify error message is not shown {string}")
    public void iVerifyErrorMessageIsNotShown(String message) {
        new CommonComponentsAndActions(driver).verifyElementOnUI(message, "Not Displayed");
    }

    @And("I verify EQ report and save changes")
    public void iVerifyEQReportAndSaveChanges() throws Throwable {
        pause(3);
        List<WebElement> mmi = driver.findElements(By.xpath("//div[text()='MMI']/../../../../..//input"));
        int attempts = 0;
        int maxAttempts = 4;

        try {
            if (!mmi.isEmpty()) {
                while (attempts < maxAttempts) {
                    String value = mmi.get(0).getAttribute("value");
                    if (!hasValue(value)) {
                        new CommonComponentsAndActions(driver).saveChanges();
                    } else {
                        break;
                    }
                    attempts++;
                    pause(3);
                }
            }
        } catch (Exception e) {
        }
    }

    @Then("I click on the {string} dropdown after scrolling {string}")
    public void iClickOnTheDropdownAfterScrolling(String labelName, String direction) throws Throwable {
        new CommonComponentsAndActions(driver).clickDropdownAfterScrolling(labelName, direction);
    }

    @Then("I type {string} to {string} dropdown")
    public void iTypeToDropdown(String value, String dropdownName) throws Throwable {
        new CommonComponentsAndActions(driver).typeToDropdown(value, dropdownName);
    }

    @Then("I click on cell {int} in row {int}")
    public void iClickRowAndCell(int cellNum, int rowNum) throws Throwable {
        new CommonComponentsAndActions(driver).clickRowAndCell(cellNum, rowNum);
    }

    @Then("I verify button {string} is {string} in {string} block")
    public void iVerifyButtonIsInBlock(String buttonName, String condition, String blockName) {
        new CommonComponentsAndActions(driver).verifyButtonVisibility(buttonName, condition, blockName);
    }

    @Then("I get text from {string} input field in {string} block")
    public void iGetTextFromInputFieldInBlock(String fieldName, String blockName) {
        new CommonComponentsAndActions(driver).getTextFromInputFieldInBlock(fieldName, blockName);
    }

    @Then("I verify {string} is defaulted to {string}")
    public void iVerifyIsDefaultedTo(String question, String answer) {
        new CommonComponentsAndActions(driver).verifyDefaultAnswer(question, answer);
    }

    @Then("I verify {string} value {string} is displayed in {string} block")
    public void iVerifyValueIsDisplayedInBlock(String fieldName, String value, String block) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyValueDisplayedInBlock(fieldName, value, block);
    }

    @Then("I verify {string} value {string} is not displayed in {string} block")
    public void iVerifyValueIsNotDisplayedInBlock(String fieldName, String value, String block) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyValueNotDisplayedInBlock(fieldName, value, block);
    }

    @Then("I scroll {string} the page")
    public void iScrollThePage(String direction) throws InterruptedException {
        new CommonComponentsAndActions(driver).scrollPage(direction);
    }

    @Then("I type {string} to {string} date field")
    public void iTypeToDateField(String date, String fieldName) {
        new CommonComponentsAndActions(driver).typeDateToDateField(date, fieldName);
    }

    @Then("I verify input field {string} is empty")
    public void iVerifyInputFieldIsEmpty(String fieldName) {
        new CommonComponentsAndActions(driver).verifyInputFieldIsEmpty(fieldName);
    }

    @Then("I verify input field {string} is read-only in {string} block")
    public void iVerifyInputFieldIsReadOnly(String fieldName, String block) {
        new CommonComponentsAndActions(driver).verifyInputFieldIsReadOnly(fieldName, block);
    }

    @Then("I verify input field {string} in {string} block is read only and has value")
    public void iVerifyInputFieldInBlockIsReadOnlyAndHasValue(String fieldName, String blockName) {
        new CommonComponentsAndActions(driver).verifyInputFieldInBlockIsReadOnlyWithValue(fieldName, blockName);
    }

    @Then("I verify input field {string} with index {int} in {string} block is read only and has value")
    public void iVerifyInputFieldWithIndexInBlockIsReadOnlyAndHasValue(String fieldName, int index, String block) {
        new CommonComponentsAndActions(driver).verifyInputFieldWithIndexInBlockIsReadOnlyWithValue(fieldName, index, block);
    }

    @When("I get text from row {int} cell {int} in {string} block and verify {string} field has a value")
    public void iClickRowCellInBlockAndVerifyFieldHasAValue(int row, int cell, String block, String fieldName) throws Throwable {
        new CommonComponentsAndActions(driver).verifyTableCellsValue(row, cell, block, fieldName);
    }

    @Then("I verify question {string} with Yes and No answers is hidden in {string} block")
    public void iVerifyQuestionWithYesNoAnswersIsHiddenInBlock(String question, String block) {
        new CommonComponentsAndActions(driver).verifyQuestionIsHidden(question, block);
    }

    @Then("I verify section {string} is {string} in {string} block")
    public void iVerifySectionIsInBlock(String sectionName, String condition, String blockName) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifySectionVisibility(sectionName, condition, blockName);
    }

    @Then("I verify dropdown {string} is hidden")
    public void iVerifyDropdownIsHidden(String input) {
        new CommonComponentsAndActions(driver).verifyDropdownIsHidden(input);
    }

    @Then("I verify input {string} is hidden")
    public void iVerifyInputIsHidden(String input) {
        new CommonComponentsAndActions(driver).verifyInputIsHidden(input);
    }

    @Then("I verify dropdown {string} is displayed")
    public void iVerifyInputFieldIsDisplayed(String input) {
        new CommonComponentsAndActions(driver).verifyDropdownIsDisplayed(input);
    }

    @Then("I verify input {string} is displayed")
    public void iVerifyInputIsDisplayed(String input) {
        new CommonComponentsAndActions(driver).verifyInputIsDisplayed(input);
    }

    @Then("I verify input {string} is empty")
    public void iVerifyInputIsEmpty(String input) {
        new CommonComponentsAndActions(driver).verifyInputIsEmpty(input);
    }

    @Then("I delete value from {string} input field")
    public void iDeleteValueFromInputField(String input) {
        new CommonComponentsAndActions(driver).deleteInputValue(input);
    }

    @Then("I verify block {string} is at position {int} on page")
    public void iVerifyBlockIsAtPositionOnPage(String block, int position) {
        new CommonComponentsAndActions(driver).verifyBlockPosition(block, position);
    }

    @Then("I verify read only combobox field {string} is {string} in {string} block")
    public void iVerifyReadOnlyComboboxFieldIsInBlock(String fieldName, String condition, String blockName) {
        new CommonComponentsAndActions(driver).verifyReadOnlyComboboxFieldVisibility(fieldName, condition, blockName);
    }

    @When("I click {string} checkbox in {string} block")
    public void iClickCheckboxInBlock(String checkbox, String block) throws InterruptedException {
        new CommonComponentsAndActions(driver).clickCheckboxInBlock(checkbox, block);
    }

    @Then("I fill out all pages except Flood Coverage page")
    public void iFillOutAllPagesExceptFloodCoveragePage() throws Throwable {
        iFillOutQuoteCoverPageHO();
        iFillOutBasicLocationCoverageDetailsPageHO();
        iFillOutOptionalCoveragesPageHO();
        iFillOutElevationCertificateDetailsPageHO();
        fillOutPreviousClaimLosses();
        iFillOutAdditionalInterestsPageHO();
        iFillOutMemberInformationPageHO();
        iFillOutManuscriptEndorsementsPageHO();
        iFillOutApplicationPageHO();
        iFillOutSubjectivitiesPageHO();
        iFillOutWildfireDetailsPageHO();
        iFillOutEarthquakeDetailsPageHO();
        iFillOutInspectionDetailsPageHO();
        iFillOutResidenceEmployeeDetailsPageHO();
    }

    @Then("I fill out HO Flood Coverage page")
    public void iFillOutHOFloodCoveragePage() throws Throwable {
        new FloodCoveragePage(driver).fillFloodCoveragePageHO(data);
    }

    @Then("I fill out HO Primary Flood Coverage block")
    public void iFillOutHOPrimaryFloodCoverageBlock() throws Throwable {
        new PrimaryFloodCoverageBlock(driver).fillOutPrimaryFloodCoveragesDetails(data);
    }

    @Then("I fill out FS Primary Flood Coverage block")
    public void iFillOutFSPrimaryFloodCoverageBlock() throws Throwable {
        new PrimaryFloodCoverageBlock(driver).fillPrimaryFloodCoverageDetailsFS(data);
    }

    @Then("I fill out HO Flood Coverage page for additional location")
    public void iFillOutHOFloodCoveragePageAdditional() throws Throwable {
        new FloodCoveragePage(driver).fillFloodCoveragePageHONoCondition(data);
    }

    @When("I fill out all pages except Cover page")
    public void iFillOutAllPagesExceptCoverPage() throws Throwable {
        iFillOutBasicLocationCoverageDetailsPageHO();
        iFillOutOptionalCoveragesPageHO();
        iFillOutHOFloodCoveragePage();
        iFillOutElevationCertificateDetailsPageHO();
        fillOutPreviousClaimLosses();
        iFillOutAdditionalInterestsPageHO();
        iFillOutMemberInformationPageHO();
        iFillOutManuscriptEndorsementsPageHO();
        iFillOutWildfireDetailsPageHO();
        iFillOutEarthquakeDetailsPageHO();
        iFillOutInspectionDetailsPageHO();
        iFillOutResidenceEmployeeDetailsPageHO();
    }

    @Then("I scroll to {string} element")
    public void iScrollToElement(String element) {
        WebElement field = driver.findElement(By.xpath("//*[text()='" + element + "']"));
        new CommonComponentsAndActions(driver).scrollToWebElement(field);
    }

    @Then("I verify textarea {string} is {string} in {string} block")
    public void iVerifyTextareaIsInBlock(String textarea, String condition, String block) {
        new CommonComponentsAndActions(driver).verifyTextareaVisibility(textarea, condition, block);
    }

    @Then("I verify {string} value {string} is displayed on page")
    public void iVerifyValueIsDisplayed(String fieldName, String value) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyValueDisplayed(fieldName, value);
    }

    @Then("I verify {string} value {string} is not displayed on page")
    public void iVerifyValueIsNotDisplayed(String fieldName, String value) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyValueNotDisplayed(fieldName, value);
    }

    @Then("I verify input field {string} is read only and has value")
    public void iVerifyInputFieldIsReadOnlyAndHasValue(String fieldName) {
        new CommonComponentsAndActions(driver).verifyInputFieldIsReadOnlyWithValue(fieldName);
    }

    @Then("I verify input field {string} with index {int} is read only and has value")
    public void iVerifyInputFieldIndexIsReadOnlyAndHasValue(String fieldName, int index) {
        new CommonComponentsAndActions(driver).verifyInputFieldIndexIsReadOnlyWithValue(fieldName, index);
    }

    @When("I set the page zoom to 75 percent")
    public void iSetThePageZoomToPercent() throws AWTException, InterruptedException {
        new CommonComponentsAndActions(driver).zoomPage();
    }

    @Then("I verify input field {string} with index {int} is {string} in {string} block")
    public void iVerifyInputFieldWithIndexIsInBlock(String input, int index, String condition, String block) {
        new CommonComponentsAndActions(driver).verifyInputFieldIndexBlock(input, index, condition, block);
    }

    @Then("I verify {string} with index {int} value {string} is displayed in {string} block")
    public void iVerifyWithIndexValueIsDisplayedInBlock(String fieldName, int index, String value, String block) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyValueIndexInBlock(fieldName, index, value, block);
    }

    @Then("I verify {string} with index {int} value {string} is displayed in {string} block and it is read only")
    public void iVerifyWithIndexValueIsDisplayedInBlockReadOnly(String fieldName, int index, String value, String block) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyValueIndexInBlockReadOnly(fieldName, index, value, block);
    }

    @Then("I scroll to the bottom of the page")
    public void iScrollToTheBottomOfThePage() throws InterruptedException {
        new CommonComponentsAndActions(driver).scrollToBottom();
    }

    @Then("I verify {string} field is {string}")
    public void iVerifyFieldIs(String field, String value) throws InterruptedException {
        pause(10);
        if (value.equalsIgnoreCase("mandatory")) {
            Assert.assertTrue(new CommonComponentsAndActions(driver).isFieldMandatory(field));
        } else if (value.equalsIgnoreCase("not mandatory")) {
            Assert.assertFalse(new CommonComponentsAndActions(driver).isFieldMandatory(field));
        }
    }

    @Then("I verify {string} question is {string}")
    public void iVerifyDistantQuestion(String question, String value) throws InterruptedException {
        pause(10);
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        if (value.equalsIgnoreCase("mandatory")) {
            Assert.assertTrue(commonComponentsAndActions.isDistantQuestionMandatory(question));
        } else if (value.equalsIgnoreCase("not mandatory")) {
            Assert.assertFalse(commonComponentsAndActions.isDistantQuestionMandatory(question));
        } else if (value.equalsIgnoreCase("enabled")) {
            Assert.assertTrue(commonComponentsAndActions.isQuestionEnabled(question));
        } else if (value.equalsIgnoreCase("disabled")) {
            Assert.assertFalse(commonComponentsAndActions.isQuestionEnabled(question));
        }
    }

    @And("I verify {string} page is not visible")
    public void iVerifyPageIsNotVisible(String page) {
        Assert.assertEquals(driver.findElements(By.xpath("//a[text()='" + page + "']")).size(), 0);
    }

    @And("I click {string} block")
    public void iClickBlock(String arg0) {
        new CommonComponentsAndActions(driver).clickElement(driver.findElement(By.xpath("//div[text()='" + arg0 + "']")), arg0 + " block");
    }

    @When("I set what is the building diagram number to {string}")
    public void iSetWhatIsTheBuildingDiagramNumberTo(String arg0) throws Throwable {
        new ElevationCertificatePage(driver).setWhatIsTheBuildingDiagramNumber(arg0);
    }

    @And("I set do you purchase NFIP policy to {string}")
    public void iSetDoYouPurchaseNFIPPolicyTo(String arg0) throws Throwable {
        new FloodInformationBlock(driver).setDoYouPurchaseNFIPPolicy(arg0);
    }

    @And("I set replacement cost {string} to {string}")
    public void iSetReplacementCostTo(String arg0, String arg1) throws Throwable {
        new RiskAddressesBlock(driver).setReplacementCostValue(arg1, Integer.parseInt(arg0) - 1);
    }

    @And("I set contents {string} to {string}")
    public void iSetContentsTo(String arg0, String arg1) throws Throwable {
        new RiskAddressesBlock(driver).setContentsLimit(arg1, Integer.parseInt(arg0) - 1);
    }

    @Then("I verify input field {string} in {string} block is read only and empty")
    public void iVerifyInputFieldInBlockIsReadOnlyAndEmpty(String fieldName, String blockName) {
        new CommonComponentsAndActions(driver).verifyInputFieldInBlockIsReadOnlyAndEmpty(fieldName, blockName);
    }

    @Then("I verify {string} field with index {int} is read only and empty in {string} block")
    public void iVerifyFieldWithIndexIsReadOnlyAndEmptyInBlock(String fieldName, int index, String blockName) {
        new CommonComponentsAndActions(driver).verifyInputFieldIndexInBlockIsReadOnlyAndEmpty(fieldName, index, blockName);
    }

    @Then("I type {string} to {string} field with index {int}")
    public void iTypeToFieldWithIndex(String value, String fieldName, int index) throws Throwable {
        new CommonComponentsAndActions(driver).typeToFieldIndex(value, fieldName, index);
    }

    @Then("I type {string} to {string} input field")
    public void iTypeToInputField(String value, String fieldName) throws InterruptedException {
        new CommonComponentsAndActions(driver).typeToInputField(value, fieldName);
    }

    @And("I verify button {string} is {string} on page")
    public void iVerifyButtonIsOnPage(String btn, String condition) {
        new CommonComponentsAndActions(driver).verifyBtnVisibilityOnPage(btn, condition);
    }

    @Then("I verify that the system navigates to the {string} page")
    public void iVerifyThatTheSystemNavigatesToThePage(String page) {
        new CommonComponentsAndActions(driver).verifyNavigatedPage(page);
    }

    @Then("I verify {string} dropdown values do not contain trailing spaces")
    public void iVerifyDropdownValuesDoNotContainTrailingSpaces(String dropdownName) throws InterruptedException, IOException {
        new CommonComponentsAndActions(driver).iVerifyDropdownValuesDoNotContainTrailingSpaces(dropdownName);
    }

    @Then("I verify that {string} tab is {string} on page")
    public void iVerifyThatTabIsOnPage(String tab, String condition) {
        new CommonComponentsAndActions(driver).verifyTabVisibilityOnPage(tab, condition);
    }

    @Then("I get text from row {int} cell {int} in {string} block and verify it has {string} value")
    public void iGetTextFromRowCellInBlockAndVerifyFieldHasValue(int row, int cell, String block, String value) {
        new CommonComponentsAndActions(driver).verifyColumnCellValue(row, cell, block, value);
    }

    @Then("I verify following options are not present in the {string} dropdown")
    public void iVerifyFollowingOptionsAreNotPresentInTheDropdown(String dropdownName, DataTable dataTable) {
        new CommonComponentsAndActions(driver).verifyOptionsNotPresentInDropdown(dropdownName, dataTable);
    }

    @Then("I verify I am on {string} step")
    public void iVerifyIAmOnStep(String step) {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@osviewid=\"currentStep\"]")).getText(), step, step);
    }

    @Then("I verify {string} span is visible")
    public void iVerifySpanIsVisible(String arg0) {
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'" + arg0 + "')]")).isDisplayed());
    }

    @Then("I verify Selection information text is displayed")
    public void iVerifySelectionInformationTextIsDisplayed() {
        WebElement element = driver.findElement(By.xpath("//div[@style='display:inline' and contains(text(), 'The limits selected below are solely used to pre-populate')]"));
        String actualText = element.getText().replace("\n", " ").replace("\r", " ").trim();
        String expectedText = "The limits selected below are solely used to pre-populate your standalone Non-Admitted Primary Flood quote and do not provide any coverage under this policy. Once limits have been selected, please click the button [\"Click here to create a Non-Admitted Primary Flood quote\"] to generate a new Non-Admitted Primary Flood quote. Your new quote will appear on the Account Summary screen within the Quote section.";
        Assert.assertEquals(actualText, expectedText);
    }

    @When("I click {string} button")
    public void iClickBtn(String button) throws Throwable {
        new CommonComponentsAndActions(driver).clickBtn(button);
    }

    @When("I click {string} button if it is visible")
    public void iClickBtnVisible(String button) throws Throwable {
        new CommonComponentsAndActions(driver).clickBtnVisible(button);
    }

    @When("I click {string} button index {int}")
    public void iClickButtonIndex(String button, int index) throws Throwable {
        new CommonComponentsAndActions(driver).clickBtnIndex(button, index);
    }

    @Then("I verify label {string} is bold")
    public void iVerifyLabelIsBold(String label) {
        new CommonComponentsAndActions(driver).verifyLabelBold(label);
    }

    @Then("I verify textbox {string} has value {string}")
    public void iVerifyTextboxHasValue(String textbox, String value) throws InterruptedException {
        pause(5);
        WebElement field = driver.findElement(By.xpath("//div[text()='" + textbox + "']/../..//div[text()='" + value + "']"));
        Assert.assertTrue(field.isDisplayed());
    }

    @Then("I verify {string} is {string} on page")
    public void iVerifyIsOnPage(String arg0, String arg1) {
        if (arg1.equalsIgnoreCase("visible")) {
            Assert.assertTrue(driver.findElement(By.cssSelector("body")).getText().contains(arg0));
        } else {
            Assert.assertFalse(driver.findElement(By.cssSelector("body")).getText().contains(arg0));
        }
    }

    @And("I click override flood zone")
    public void iClickOverrideFloodZone() throws Throwable {
        try {
            new FloodInformationBlock(driver).checkManagerFloodZoneOverride("Yes");
        } catch (Exception e) {
        }
    }

    @Then("I verify {string} is displayed and has value for {string} field")
    public void iVerifyIsDisplayedAndHasValueForField(String label, String fieldList) {
        new CommonComponentsAndActions(driver).verifyHasValueFieldListTable(label, fieldList);
    }

    @Then("I verify {string} label is {string} in {string} block")
    public void iVerifyLabelIsInBlock(String label, String condition, String block) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyLabelVisibilityInBlock(label, condition, block);
    }

    @Then("I verify {string} label is {string} on page")
    public void iVerifyLabelOnPage(String label, String condition) {
        new CommonComponentsAndActions(driver).verifyLabelVisibilityOnPage(label, condition);
    }

    @Then("I verify input field {string} is read only")
    public void iVerifyInputFieldIsReadOnly(String arg0) {
        new CommonComponentsAndActions(driver).verifyInputFieldIsReadOnly(arg0);
    }

    @Then("I verify that the documentation upload date and time pulled")
    public void iVerifyThatTheDateAndTimePulled() throws Throwable {
        new CommonComponentsAndActions(driver).verifyTableCellsValue(1, 7, "Primary Excess Insurance Information", "");
    }


    @And("The user verifies the dropdown values for field")
    public void theUserVerifiesTheDropdownValuesForField(DataTable dataTable) throws Throwable {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : rows) {
            String expectedField = row.get("Field");
            String expectedValue = row.get("Value");
            String shouldAppear = row.get("YesOrNo");
            new CommonComponentsAndActions(driver).verifyDropdownListVisibility(expectedField, expectedValue, shouldAppear);
        }
    }

    @Then("the status of {string} transaction {int} should be {string}")
    public void verifyTransactionStatusStep(String transactionId, int number, String expectedStatus) {
        int index = number - 1;
        new PolicyPage(driver).verifyTransactionStatus(transactionId, expectedStatus, index);
    }

    @And("I click create renewal button")
    public void iCreateRenewalButtonOnly() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickCreateRenewal();
        commonComponentsAndActions.clickOK();
        pause(5);
    }

    @And("I verify field {string} has a value between {string} and {string}")
    public void iVerifyFieldHasValueInRange(String field, String minValue, String maxValue) throws Throwable {
        new CommonComponentsAndActions(driver).verifyFieldValueInRange(field, minValue, maxValue);
    }

    @And("I compare {string} factor on {string} page after re-rating for {string} transaction")
    public void iCompareFactorsAfterReRate(String field, String page, String trx) throws Throwable {
        new PolicySummaryPage(driver).compareFieldValueBeforeAndAfterReRate(field, page, trx);
    }

    @And("I click {string}")
    public void iClickButton(String value) {
        new CommonComponentsAndActions(driver).iClickSelected(value);
    }

    @And("I click {string} with index {int}")
    public void iClickButtonWithIndex(String value, int index) {
        new CommonComponentsAndActions(driver).iClickSelectedWithIndex(value, index);
    }

    @Then("I verify that {string} checkbox is {string}")
    public void verifyCheckbox(String fieldLabel, String expectedState) {
        new CommonComponentsAndActions(driver).verifyCheckboxState(fieldLabel, expectedState);
    }

    @Then("I check checkbox field {string}")
    public void iCheckCheckBoxField(String fieldLabel) {
        new CommonComponentsAndActions(driver).iCheckCheckBoxField(fieldLabel);
    }

    @And("I think for {int} to {int} seconds and i keep clicking home tab for {int} times")
    public void iThinkForToSecondsAndIKeepClickingHomeTabForTimes(int min, int max, int times) throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.clickElement(commonComponentsAndActions.home);
        for (int i = 1; i <= times; i++) {
            iThinkForToSeconds(min, max);
            commonComponentsAndActions.clickElement(commonComponentsAndActions.home);
        }
    }

    @And("I verify that field {string} has value {string}")
    public void iVerifyThatFieldHasValue(String field, String expected) throws Throwable {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);

        String value = actions.iGetValueFromField(field);

        if (!value.equalsIgnoreCase(expected)) {
            actions.failAssertion("Field value is not correct. Expected: " + expected + " | Actual: " + value);
        }
    }

    @Then("I verify field {string} is {string}")
    public void theFieldShouldBeEditableOrNot(String field, String expectedStatus) {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);
        boolean isEditable = actions.isFieldEditable(field);

        boolean shouldBeEditable = expectedStatus.equalsIgnoreCase("editable");

        if (isEditable == shouldBeEditable) {
            actions.successLog("Field '" + field + "' is " + expectedStatus + " as expected.");
        } else {
            String actualStatus = isEditable ? "editable" : "not editable";
            actions.failAssertion("Expected field '" + field + "' to be " + expectedStatus + ", but it was " + actualStatus + ".");
        }
    }

    @Then("I switch to window {int} handle")
    public void iSwitchToWindowHandle(int window) throws Throwable {
        new CommonComponentsAndActions(driver).switchToNewWindowsHandle(window);
    }

    @Then("I close new window handle and return to previous one")
    public void iCloseTheCurrentWindowHandleAndNavigateToPreviousOne() {
        new CommonComponentsAndActions(driver).closeCurrentWindowAndReturn();
    }

    @And("I refresh DragonSteps data")
    public void refreshDragonStepsData() {
        data = DataManager.getInstance().getData();
    }

    @Then("I verify that field {string} has value {string} and should be read-only {string} at index {int}")
    public void the_field_should_display_and_be_read_only_at_index(String fieldLabel, String expectedText, String yesOrNo, int index) {
        new CommonComponentsAndActions(driver).compareTextOnUI(fieldLabel, expectedText, yesOrNo, index);
    }

    @And("I bind a quote for surplus")
    public void iBindAQuoteHS() throws Throwable {
        RequiredFormsPage requiredFormsPage = new RequiredFormsPage(driver);
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        EditAttachmentPage editAttachmentPage = new EditAttachmentPage(driver);
        SummaryPage summaryPage = new SummaryPage(driver);
        PolicyDeliveryPage policyDeliveryPage = new PolicyDeliveryPage(driver);
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        ReferralsBlock uwRefBlock = new ReferralsBlock(driver);

        if (!commonComponentsAndActions.requestBind.isEmpty()) {
            clickRequestBind();
        }
        if (!driver.findElements(By.xpath("//font[contains(text(),'This risk is subject to UW review and completion')]")).isEmpty()) {
            commonComponentsAndActions.navigateToUnderwritingReferralsPage();
            uwRefBlock.approveAndOverride();
            uwRefPage.setUnderwriter(data.get("Underwriter"));
            uwRefPage.acceptReferrals("Broker");
        }

        if (!commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//span[contains(text(),'bind')]")))) {
            commonComponentsAndActions.navigateToQuoteDetailsPage();
            iRateAQuote();
            if (!commonComponentsAndActions.tivIneligible.isEmpty()
                    && data.get("State").equalsIgnoreCase("NC")
                    || data.get("State").equalsIgnoreCase("MA")
                    || data.get("State").equalsIgnoreCase("SC")
                    || data.get("State").equalsIgnoreCase("NY")
                    || data.get("State").equalsIgnoreCase("FL")) {
                iRateAQuote();
            }
            commonComponentsAndActions.navigateToUnderwritingReferralsPage();
            uwRefBlock.approveAndOverride();
            uwRefPage.setUnderwriter(data.get("Underwriter"));
            uwRefPage.acceptReferrals("Broker");
        }

//        if (!driver.findElements(By.xpath("//font[contains(text(),'This risk is subject to UW review and completion')]")).isEmpty()) {
//            commonComponentsAndActions.navigateToUnderwritingReferralsPage();
//            uwRefBlock.approveAndOverride();
//            uwRefPage.setUnderwriter(data.get("Underwriter"));
//            uwRefPage.acceptReferrals("Broker");
//        }
        if (!commonComponentsAndActions.requestBind.isEmpty()) {
            clickRequestBind();
        }

        commonComponentsAndActions.clickBind();
        pause(6);
        if (commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//*[@id='os-messages']//span"))) && driver.findElements(By.xpath("//*[@id='os-messages']//span")).get(0).getText().contains("A signed PSE Membership Agreement is needed for this policy. Please collect and upload the signed agreement under the required forms tab")) {
            commonComponentsAndActions.customer.click();
            pause(6);
            commonComponentsAndActions.requiredFormsTab.click();
            pause(10);
            requiredFormsPage.fillSignaturePreferenceAndUpload();
            editAttachmentPage.addAttachment(data);
            requiredFormsPage.goToSummary();
            summaryPage.clickQuoteLink();
            commonComponentsAndActions.clickBind();
        }
        policyDeliveryPage.fillPolicyDelivery("Yes", "PrintByPure");
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.clickConfirm();
        try {
            data.put("Grand_Total_Premium_NB", new BillingChoicesPage(driver).retrieveGrandTotal());
        } catch (Exception e) {
            data.put("Grand_Total_Premium_NB", "null");
        }
        commonComponentsAndActions.clickRequestBind();
        if (commonComponentsAndActions.elementExists(driver.findElements(By.xpath("//span[text()='Cancel']")))) {
            if (driver.findElements(By.xpath("//span[text()='Cancel']")).get(0).isDisplayed()) {
                commonComponentsAndActions.clickCancel();
                commonComponentsAndActions.clickOK();
            }
        }
        POLICY_ID = new CustomerSummaryPage(driver).getPolicyID();
        ;
        data.put("Policy_ID", POLICY_ID);
        try {
            USER_SESSION_ID = data.get("SESSION_ID");
        } catch (Exception e) {
            USER_SESSION_ID = "Failed to get User Session Id -- error: " + e;
        }
        if (hasValue(DBStore) && DBStore.equalsIgnoreCase("Yes") && hasValue(CUSTOMER_ID) && hasValue(POLICY_ID)) {
            SQLManager.updatePolicyIdOnTransaction(CUSTOMER_ID, POLICY_ID);
        }
        Assert.assertTrue(commonComponentsAndActions.hasValue(POLICY_ID));
        try {
            commonComponentsAndActions.writePolicyIdsInFile(POLICY_ID + ", " + data.get("Effective_Date"));
            pause(3);
            reportTextAttachment("POLICY ID: " + POLICY_ID, POLICY_ID);
        } catch (Exception e) {
        }
        System.out.println("\n/----------------------POLICY ID----------------------/");
        System.out.println("Policy ID: " + POLICY_ID + " State: " + data.get("State"));
        System.out.println("/-----------------------------------------------------/\n");

    }

    @And("I override and accept underwriting referrals")
    public void iAcceptReferralsHS() throws Throwable {
        UnderwritingReferralsPage uwRefPage = new UnderwritingReferralsPage(driver);
        uwRefPage.setUnderwriter("A");
        new ReferralsBlock(driver).approveAndOverride();
        uwRefPage.acceptReferrals("Accepted");
    }

    @And("I get referral list from underwriting alerts")
    public void iGetReferralsListFromUWPage() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        String gatheredText = commonComponentsAndActions.getAllTextsFromGrid();
        data.put("Referral_List", gatheredText);
    }

    @Then("I verify all texts from hashmap with key {string} are displayed on the page")
    public void verifyAllTextsDisplayedFromHashMap(String key) {
        new CommonComponentsAndActions(driver).verifyTextsDisplayed(data.get(key));
    }

    @Then("I verify coverage {string} {int} on premium details is {string}")
    public void iVerifyCoverageOnPremiumDetailsIs(String coverage, int index, String value) {
        new PremiumSummaryPage(driver).verifyCoverageOnPremiumDetailsIs(coverage, index, value);
    }

    @Then("I select a Policy by ID {string} on customer summary page")
    public void iSelectAPolicy(String policyID) {
        new CustomerAccountSummaryPage(driver).clickOnPolicyByIDOnCustomerSummaryPage(policyID);
    }

    @And("I verify that tree node with value {string} is {string}")
    public void iVerifyThatTreeNodeIsNotVisible(String nodeValue, String displayedOrNot) throws InterruptedException {
        new OperatorsAndVehiclePage(driver).isTreeNodeDisplayed(nodeValue, displayedOrNot);
    }

    @Then("I click {string} button on UI")
    public void iClickButtonOnUI(String button) throws Throwable {
        new CustomerAccountSummaryPage(driver).clickBtn(button);
    }

    @And("I delete first transaction after New Business")
    public void iDeleteFirstTransactionAfterNewBusiness() throws InterruptedException {
        new TransactionsOrEndorsementsPage(driver).deleteFirstTransactionAfterNewBusiness();
    }

    @And("I click {string} button for backdated transaction with losses during time period")
    public void iClickButtonForBackDatedTransactionWithLossesDuringTimePeriod(String yesOrNo) {
        new TransactionsOrEndorsementsPage(driver).clickBackdatedTrxPreviousLossesDuringThisPeriodYesOrNo(yesOrNo);
    }

    @And("I check that radio button for label {string} option {string} is {string}")
    public void iCheckThatRadioButtonForLabelMandatory(String labelName, String option, String mandatoryYesOrNo) {
        new CommonComponentsAndActions(driver).checkIsRadioBtnMandatoryForLabel(labelName, option, mandatoryYesOrNo);
    }

    @And("I check that text area with title {string} is {string}")
    public void iCheckThatTextAreaWithTitleMandatory(String textareaTitle, String mandatoryYesOrNo) {
        new CommonComponentsAndActions(driver).checkIsTextareaMandatory(textareaTitle, mandatoryYesOrNo);
    }

    @Then("I verify coverage {string} {int} on premium details is {string} on end")
    public void iVerifyCoverageOnPremiumDetailsIsEnd(String coverage, int index, String value) {
        new PremiumSummaryPage(driver).verifyCoverageOnPremiumDetailsIsEnd(coverage, index, value);
    }

    @Then("I verify coverage {string} {int} on premium details is {string} on rnw")
    public void iVerifyCoverageOnPremiumDetailsIsRnw(String coverage, int index, String value) {
        new PremiumSummaryPage(driver).verifyCoverageOnPremiumDetailsIsRnw(coverage, index, value);
    }

    @Then("I check that field with name {string} is {string}")
    public void iCheckThatFieldWithNameIsMandatory(String name, String mandatoryYesOrNo) {
        new CommonComponentsAndActions(driver).checkIsFieldMandatoryByXPath(name, mandatoryYesOrNo);
    }

    @And("I verify that textarea {string} with {string} bv is {string}")
    public void iVerifyThatTextAreaWithBvIsDisplayed(String text, String bv, String condition) throws InterruptedException {
        new CommonComponentsAndActions(driver).verifyTextareaFieldIsVisibleWithInputField(text, bv, condition);
    }

    @And("I verify that element {string} within block {string} is {string}")
    public void iVerifyThatElementWithinBlockIsDisplayed(String elementValue, String blockName, String expectation) throws InterruptedException {
        new CommonComponentsAndActions(driver).isElementVisibleWithinBlock(elementValue, blockName, expectation);
    }

    @Then("I verify that field {string} has readonly set to {string} for element index {int}")
    public void iVerifyThatFieldHasReadOnlySetTo(String fieldName, String trueOrFalse, int index) {
        new CommonComponentsAndActions(driver).verifyFieldEditableStatus(fieldName, trueOrFalse, index);
    }

    @And("I verify that input field for element {string} has a default value of {string}")
    public void iVerifyThatInputFieldForElementHasDefaultValueOf(String fieldLabel, String value) {
        new CommonComponentsAndActions(driver).verifyDefaultValueOfInputFieldForElement(fieldLabel, value);
    }

    @And("I click add button with index {int}")
    public void iClickAddButtonWithIndex(int index) throws Throwable {
        new CommonComponentsAndActions(driver).clickAddBtnWithIndex(index);
    }

    @And("I verify that radio button {string} for label {string} within block {string} is {string}")
    public void iVerifyRadioBtnChecked(String option, String labelName, String blockName, String expectation) {
        new CommonComponentsAndActions(driver).verifyRadioButtonIsChecked(labelName, blockName, option, expectation);
    }

    @Then("I rate an FS quote")
    public void iRateAnFSQuote() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        iRateAQuote();

        for (int i = 0; i < 3; i++) {
            List<WebElement> nextButton = driver.findElements(By.xpath("//span[contains(text(),'>>> next') or contains(text(),'>>next') or contains(text(),'>>>next')]"));
            if (!nextButton.isEmpty()) {
                commonComponentsAndActions.clickElement(nextButton.get(0), "next");
                pause(7);

                if (!driver.findElements(By.xpath("//*[@osviewid='mode_3_msg_1']")).isEmpty()) {
                    pause(15);
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }

    @Then("I rate and bind an FS quote")
    public void iRateAndBindAnFSQuote() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        PolicyDeliveryPage policyDeliveryPage = new PolicyDeliveryPage(driver);
        CustomerSummaryPage customerSummaryPage = new CustomerSummaryPage(driver);
        iRateAQuote();

        for (int i = 0; i < 3; i++) {
            List<WebElement> nextButton = driver.findElements(By.xpath("//span[contains(text(),'>>> next') or contains(text(),'>>next') or contains(text(),'>>>next')]"));
            if (!nextButton.isEmpty()) {
                commonComponentsAndActions.clickElement(nextButton.get(0), "next");
                if (ENV.equalsIgnoreCase("AWS_QA")) {
                    pause(15);
                } else {
                    pause(7);
                }

                if (!driver.findElements(By.xpath("//*[@osviewid='mode_3_msg_1']")).isEmpty()) {
                    pause(15);
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        commonComponentsAndActions.navigateToUnderwritingReferralsPage();
        iAcceptUnderwritingReferrals();
        if (!data.get("State").equals("SC") && !data.get("State").equals("FL")) {
            commonComponentsAndActions.clickRequestBind();
        }
        iCheckCheckbox("I confirm the above statements.");
        pause(5);
        commonComponentsAndActions.clickBind();
        policyDeliveryPage.fillPolicyDelivery("Yes", data.get("Policy_Delivery_Option"));
        commonComponentsAndActions.clickNext();
        commonComponentsAndActions.clickConfirm();
        commonComponentsAndActions.clickRequestBind();
        POLICY_ID = customerSummaryPage.getFSPolicyID();
        data.put("Policy_ID", POLICY_ID);
        try {
            USER_SESSION_ID = data.get("SESSION_ID");
        } catch (Exception e) {
            USER_SESSION_ID = "Failed to get User Session Id -- error: " + e;
        }
        if (hasValue(DBStore) && DBStore.equalsIgnoreCase("Yes") && hasValue(CUSTOMER_ID) && hasValue(POLICY_ID)) {
            SQLManager.updatePolicyIdOnTransaction(CUSTOMER_ID, POLICY_ID);
        }
        Assert.assertTrue(commonComponentsAndActions.hasValue(POLICY_ID));
        try {
            commonComponentsAndActions.writePolicyIdsInFile(POLICY_ID + ", " + data.get("Effective_Date"));
            pause(3);
            reportTextAttachment("POLICY ID: " + POLICY_ID, POLICY_ID);
        } catch (Exception e) {
        }
        System.out.println("\n/----------------------POLICY ID----------------------/");
        System.out.println("\t\t\tPolicy ID: " + POLICY_ID + " State: " + data.get("State"));
        System.out.println("/-----------------------------------------------------/\n");
    }

    @Then("I review changes FS")
    public void iReviewChangesFS() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        iRateAQuote();
        for (int i = 0; i < 3; i++) {
            WebElement reviewChanges = driver.findElement(By.xpath("//span[contains(text(),'>>> review changes')] | //span[contains(text(),'>>>review changes')]"));
            commonComponentsAndActions.clickElement(reviewChanges, "review changes");
            pause(7);
            if (!driver.findElements(By.xpath("//*[@osviewid='mode_3_msg_1']")).isEmpty()) {
                pause(15);
            } else {
                break;
            }
        }
    }

    @And("I click to create a Non-Admitted Primary Flood quote")
    public void iClickToCreateANonAdmittedPrimaryFloodQuote() throws Throwable {
        new CommonComponentsAndActions(driver).clickToCreateNonAdmittedPrimaryFloodQuote();
    }

    @And("I open new flood quote under customer")
    public void iOpenNewFloodQuoteUnderCustomer() {
        new CustomerSummaryPage(driver).openFSQuote();
    }

    @Then("I click Link to Flood Surplus Lines")
    public void iClickFSLink() throws Throwable {
        new CommonComponentsAndActions(driver).clickFSLink();
    }

    @And("I fill KY Tax Report with dummy data for {string} LOB")
    public void fillKYTaxReportWithDummyData(String lob) throws Throwable {
        if (data.get("State").equalsIgnoreCase("KY")) {
            switch (lob) {
                case "PA": {
                    new AutomobilePolicyPage(driver).visitAutomobilePolicyPageFillKYTaxReportData();
                }
                break;
                case "EX": {
                    new ExcessLiabilityCoverPage(driver).visitExcessPolicyPageFillKYTaxReportData();
                }
                break;
                case "CO": {
                    new CollectionsPolicyPage(driver).visitCollectionPolicyPageFillKYTaxReportData();
                }
                break;
                case "PW": {
                    new WatercraftVehiclePage(driver).visitWatercraftAndFillKYTaxReportData();
                }
                break;
            }
        }
    }

    @And("I set would you like non admitted primary flood quote to {string}")
    public void iSetWouldYouLikeNonAdmittedPrimaryFloodQuoteTo(String arg0) throws Throwable {
        new PrimaryFloodCoverageBlock(driver).setWouldYouLikeToQuote(arg0);
    }

    @When("I create a new FS quote from new {string} quote")
    public void iCreateANewFSQuoteFromNewQuote(String arg0) throws Throwable {
        if (arg0.equalsIgnoreCase("HS")) {
            iInitiateNewQuoteForNewCustomer();
            iFillOutQuoteCoverPageHS();
            iFillOutBasicLocationCoverageDetailsPageHS();
            iFillOutOptionalCoveragesPageHS();
            iFillOutEarthquakeDetailsPageHO();
            iFillOutWildfireDetailsPageHO();
            fillOutPreviousClaimLossesHS();
            iFillOutMemberInformationPageHS();
            new NavigationSteps().iNavigateToLocationPage();
            iClickRadioButtonForLabel("Yes", "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?");
            new CommonComponentsAndActions(driver).saveChanges();
            iClickToCreateANonAdmittedPrimaryFloodQuote();
            new CommonComponentsAndActions(driver).saveChanges();
            pause(10);
            iClickFSLink();
            iCreateANewLOBQuote("PF");
        } else if (arg0.equalsIgnoreCase("HO")) {
            iInitiateNewQuoteForNewCustomer();
            iFillOutQuoteCoverPageHO();
            iFillOutBasicLocationCoverageDetailsPageHO();
            iFillOutPreviousLossesCoveragesPageHO();
            iFillOutMemberInformationPageHO();

            if (data.get("State").equalsIgnoreCase("CO") ||
                    data.get("State").equalsIgnoreCase("GA") ||
                    data.get("State").equalsIgnoreCase("CT") ||
                    data.get("State").equalsIgnoreCase("MA") ||
                    data.get("State").equalsIgnoreCase("NJ") ||
                    data.get("State").equalsIgnoreCase("IL") ||
                    data.get("State").equalsIgnoreCase("PA") ||
                    data.get("State").equalsIgnoreCase("VA") ||
                    data.get("State").equalsIgnoreCase("RI")
            ) {
                iFillOutHOFloodCoveragePage();
            } else {
                iFillOutEarthquakeDetailsPageHO();
                iFillOutWildfireDetailsPageHO();
                iFillOutOptionalCoveragesPageHO();
            }

            iClickToCreateANonAdmittedPrimaryFloodQuote();
            iClickFSLink();
            iCreateANewLOBQuote("PF");
        }
    }

    @When("I initiate a new FS quote from new {string} quote")
    public void iInitiateANewFSQuoteFromNewQuote(String arg0) throws Throwable {
        if (arg0.equalsIgnoreCase("HS")) {
            iInitiateNewQuoteForNewCustomer();
            iFillOutQuoteCoverPageHS();
            iFillOutBasicLocationCoverageDetailsPageHS();
            iFillOutOptionalCoveragesPageHS();
            iFillOutEarthquakeDetailsPageHO();
            iFillOutWildfireDetailsPageHO();
            fillOutPreviousClaimLossesHS();
            iFillOutMemberInformationPageHS();
            new NavigationSteps().iNavigateToLocationPage();
            iClickRadioButtonForLabel("Yes", "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?");
            new CommonComponentsAndActions(driver).saveChanges();
            iClickToCreateANonAdmittedPrimaryFloodQuote();
            new CommonComponentsAndActions(driver).saveChanges();
            pause(10);
            iClickFSLink();
            DataManager.getInstance().getData().put("QUOTE_ID", new CommonComponentsAndActions(driver).getCurrentObjectId());
        } else if (arg0.equalsIgnoreCase("HO")) {
            iInitiateNewQuoteForNewCustomer();
            iFillOutQuoteCoverPageHO();
            iFillOutBasicLocationCoverageDetailsPageHO();
            iFillOutPreviousLossesCoveragesPageHO();
            iFillOutMemberInformationPageHO();

            if (data.get("State").equalsIgnoreCase("CO") ||
                    data.get("State").equalsIgnoreCase("GA") ||
                    data.get("State").equalsIgnoreCase("CT") ||
                    data.get("State").equalsIgnoreCase("MA") ||
                    data.get("State").equalsIgnoreCase("NJ") ||
                    data.get("State").equalsIgnoreCase("IL") ||
                    data.get("State").equalsIgnoreCase("PA") ||
                    data.get("State").equalsIgnoreCase("VA") ||
                    data.get("State").equalsIgnoreCase("RI")
            ) {
                iFillOutHOFloodCoveragePage();
            } else {
                iFillOutEarthquakeDetailsPageHO();
                iFillOutWildfireDetailsPageHO();
                iFillOutOptionalCoveragesPageHO();
            }

            iClickToCreateANonAdmittedPrimaryFloodQuote();
            iClickFSLink();
            DataManager.getInstance().getData().put("QUOTE_ID", new CommonComponentsAndActions(driver).getCurrentObjectId());
        }
    }

    @Then("I verify {string} cancellation premium")
    public void iVerifyCancellationPremium(String cancelType) {
        new TransactionsOrEndorsementsPage(driver).verifyFlatProRateCancellation(cancelType);
    }

    @And("I make general changes required on renewal for {string} LOB")
    public void makeChangesRequiredGeneralRenewalFlows(String lob) throws Throwable {
        if (lob.equalsIgnoreCase("HO")) {
            new HomeownersFlow(driver).fillMissingDataOnRenewal(data.get("State"));
        }
    }
}