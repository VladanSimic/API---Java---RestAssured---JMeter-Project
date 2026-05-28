package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.QuoteBasicInformationPage;
import pages.QuotesPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class QuoteBasicInformationPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    /**
     * @throws Throwable throwable
     * @description - Used to initiate a new quote
     * @precondition - User has entered data into excel
     */
    @And("I initiate a new quote")
    public void iInitiateANewQuote() throws Throwable {
        iClickNewQuoteButton();
        iSearchAndSelectAnAgency();
        iFillOutQuoteBasicInformationPage();
    }

    @And("I initiate a new quote as broker")
    public void iInitiateANewQuoteAsBroker() throws Throwable {
        iClickNewQuoteButton();
        iFillOutQuoteBasicInformationPage();
    }

    /**
     * @throws Throwable throwable
     * @description - Used to fill out the quote basic information page
     * @precondition - User is on the quote basic information page
     * @precondition - User has entered data into excel
     */
    @And("I fill out the quote basic information page")
    public void iFillOutQuoteBasicInformationPage() throws Throwable {
        new QuoteBasicInformationPage(driver).fillOutQuoteBasicInformationPage(data, ENV);
    }

    /**
     * @throws Throwable throwable
     * @description - Used to fill out the client information block
     * @precondition - User is on the quote basic information page
     * @precondition - User has entered data into excel
     */
    @And("I fill out the client information block")
    public void fillOutClientInformationDetails() throws Throwable {
        new ClientInformationBlock(driver).fillOutClientInformationDetails(data);
    }

    /**
     * @throws Throwable throwable
     * @description - Used to fill out the lines of business block
     * @precondition - User is on the quote basic information page
     * @precondition - User has entered data into excel
     */
    @And("I fill out the lines of business block")
    public void fillOutLinesOfBusinessDetails() throws Throwable {
        new LinesOfBusinessBlock(driver).fillOutLinesOfBusinessDetails(data);
    }

    /**
     * @throws Throwable throwable
     * @description - Used to fill out the underwriting report authorization block
     * @precondition - User is on the quote basic information page
     * @precondition - User has entered data into excel
     */
    @And("I fill out the underwriting report authorization block")
    public void fillOutUnderwritingReportAuthorizationDetails() throws Throwable {
        new UnderwritingReportAuthorizationBlock(driver).fillOutUnderwritingReportAuthorizationDetails(data);
    }

    /**
     * @throws Throwable throwable
     * @description - Used to fill out the producer information block
     * @precondition - User is on the quote basic information page
     * @precondition - User has entered data into excel
     */
    @And("I fill out the producer information block")
    public void fillOutProducerInformationDetails() throws Throwable {
        new ProducerInformationBlock(driver).fillOutProducerInformationDetails(data, ENV);
    }

    /**
     * @description - Used to verify the license warning messages are visible
     * @precondition - User is on the quote basic information page
     */
    @And("I verify that the license warning messages are visible")
    public void verifyLicenseWarningMessages() throws Exception {
        new LicenseWarningBlock(driver).verifyLicenseWarningMessages();
    }

    /**
     * @throws Throwable throwable
     * @description - Used to click the new quote button
     * @precondition - User is on the quote basic information page
     */
    @And("I click new quote button")
    public void iClickNewQuoteButton() throws Throwable {
        new QuotesPage(driver).newQuote();
        pause(3);
    }

    /**
     * @throws Throwable throwable
     * @description - Used to search and select an agency
     * @precondition - User is on the quote basic information page
     * @precondition - User has entered data into excel
     */
    @And("I search and select an agency")
    public void iSearchAndSelectAnAgency() throws Throwable {
        new QuotesPage(driver).searchAndSelectAgency(data, ENV);
    }

    /**
     * @param date effective date
     * @throws Throwable throwable
     * @description - Used to enter the effective date
     * @precondition - User is on the quote basic information page
     */
    @And("I enter the effective date {string}")
    public void iEnterTheEffectiveDate(String date) throws Throwable {
        new ClientInformationBlock(driver).setEffectiveDate(date);
    }

    /**
     * @param dob date of birth
     * @throws Throwable throwable
     * @description - Used to enter the date of birth
     * @precondition - User is on the quote basic information page
     */
    @And("I enter the date of birth {string}")
    public void iEnterTheDateOfBirth(String dob) throws Throwable {
        new ClientInformationBlock(driver).setDateOfBirth(dob);
    }

    /**
     * @param state risk state
     * @throws Throwable throwable
     * @description - Used to select the risk state
     * @precondition - User is on the quote basic information page
     */
    @And("I select the risk state {string}")
    public void iSelectTheRiskState(String state) throws Throwable {
        new LinesOfBusinessBlock(driver).setRiskState(state);
    }

    /**
     * @param line admitted or surplus line
     * @description - Used to check the admitted or surplus line
     * @precondition - User is on the quote basic information page
     */
    @And("I check admitted or surplus line {string}")
    public void iCheckAdmittedOrSurplusLine(String line) throws Throwable {
        new LinesOfBusinessBlock(driver).selectAdmittedOrSurplus(line);
    }

    /**
     * @description - Used to check the line of business
     * @precondition - User is on the quote basic information page
     */
    @And("I check the line of business {string}")
    public void iCheckTheLineOfBusiness(String line) {
        new LinesOfBusinessBlock(driver).selectAdmittedLine(line);
    }

    /**
     * @param value has the customer lived at the same address more than six months
     * @throws Throwable throwable
     * @description - Used to check has the customer lived at the same address more than six months
     * @precondition - User is on the quote basic information page
     */
    @And("I check has the customer lived at the same address more than six months {string}")
    public void iCheckLivedAtAddressMoreThanSixMonths(String value) throws Throwable {
        new ClientInformationBlock(driver).livedAtAddressMoreThanSixMonths(value);
    }

    @And("I check has the customer lived at the same address more than six months")
    public void iCheckLivedAtAddressMoreThanSixMonths() throws Throwable {
        new ClientInformationBlock(driver).livedAtAddressMoreThanSixMonths(data.get("More_Than_Six_Months"));
    }

    /**
     * @param value is the customer entertainer athlete or political figure
     * @throws Throwable throwable
     * @description - Used to check is the customer entertainer athlete or political figure
     * @precondition - User is on the quote basic information page
     */
    @And("I check is the customer entertainer athlete or political figure {string}")
    public void iCheckEntertainerAthletePoliticalFigure(String value) throws Throwable {
        new ClientInformationBlock(driver).entertainerAthletePoliticalFigure(value);
    }

    /**
     * @throws Throwable throwable
     * @description - Used to check is the customer entertainer athlete or political figure
     * @precondition - User is on the quote basic information page
     */
    @And("I check is the customer entertainer athlete or political figure")
    public void iCheckEntertainerAthletePoliticalFigure() throws Throwable {
        new ClientInformationBlock(driver).entertainerAthletePoliticalFigure(data.get("Entertainer_Athlete"));
    }

    /**
     * @param required is disclosure required
     * @param made     is disclosure made
     * @throws Throwable throwable
     * @description - Used to check is the disclosure required and made
     * @precondition - User is on the quote basic information page
     */
    @And("I check is disclosure required {string} and made {string}")
    public void iCheckIsDisclosureRequiredAndHasBeenMade(String required, String made) throws Throwable {
        new UnderwritingReportAuthorizationBlock(driver).setIsDisclosureRequiredAndHasBeenMade(required, made);
    }

    @And("I set disclosure of consumer reports made to Yes")
    public void iSetDisclosureOfConsumerReportsMadeToYes() throws InterruptedException {
        new UnderwritingReportAuthorizationBlock(driver).setHasDisclosureOfConsumerReportsBeenMadeToYes();
    }

    /**
     * @param producer licensed producer
     * @description - Used to the select licensed producer
     * @precondition - User is on the quote basic information page
     */
    @And("I select licensed producer {string}")
    public void iSelectLicensedProducer(String producer) throws InterruptedException {
        new ProducerInformationBlock(driver).setLicensedProducer(producer);
    }

    /**
     * @param advisor advisor servicer
     * @description - Used to the select advisor servicer
     * @precondition - User is on the quote basic information page
     */
    @And("I select advisor servicer {string}")
    public void iSelectAdvisorServicer(String advisor) throws InterruptedException {
        new ProducerInformationBlock(driver).setAdvisorServicer(advisor);
    }

    /**
     * @param name first name
     * @description - Used to the enter customers first name
     * @precondition - User is on the quote basic information page
     */
    @And("I enter customers first name {string}")
    public void iSetFirstName(String name) throws Throwable {
        new ClientInformationBlock(driver).setFirstName(name);
    }

    /**
     * @param lastName last name
     * @description - Used to the enter customers last name
     * @precondition - User is on the quote basic information page
     */
    @And("I enter customers last name {string}")
    public void iSetLastName(String lastName) {
        new ClientInformationBlock(driver).setLastName(lastName);
    }

    /**
     * @param prefix prefix
     * @description - Used to enter customers prefix
     * @precondition - User is on the quote basic information page
     */
    @And("I enter customers prefix {string}")
    public void iSetPrefix(String prefix) {
        new ClientInformationBlock(driver).setPrefix(prefix);
    }

    /**
     * @param mi MI
     * @description - Used to enter customers MI
     * @precondition - User is on the quote basic information page
     */
    @And("I enter customers MI {string}")
    public void iSetMI(String mi) {
        new ClientInformationBlock(driver).setMI(mi);
    }

    /**
     * @param suffix suffix
     * @description - Used to enter customers suffix
     * @precondition - User is on the quote basic information page
     */
    @And("I enter customers suffix {string}")
    public void iSetSuffix(String suffix) {
        new ClientInformationBlock(driver).setSuffix(suffix);
    }

    /**
     * @param occupation member occupation
     * @description - Used to enter member occupation
     * @precondition - User is on the quote basic information page
     */
    @And("I enter member occupation {string}")
    public void iSetMemberOccupation(String occupation) {
        new ClientInformationBlock(driver).setMemberOccupation(occupation);
    }

    /**
     * @param employer member employer
     * @description - Used to enter member employer
     * @precondition - User is on the quote basic information page
     */
    @And("I enter member employer {string}")
    public void iSetMemberEmployer(String employer) {
        new ClientInformationBlock(driver).setMemberEmployer(employer);
    }

    /**
     * @param address address line 1
     * @description - Used to enter primary address line 1
     * @precondition - User is on the quote basic information page
     */
    @And("I enter primary address line 1 {string}")
    public void iSetPrimaryRiskAddressLine1(String address) {
        new ClientInformationBlock(driver).setPrimaryRiskAddressLine1(address);
    }

    /**
     * @param city address city
     * @description - Used to enter enter address city
     * @precondition - User is on the quote basic information page
     */
    @And("I enter address city {string}")
    public void iSetCity(String city) {
        new ClientInformationBlock(driver).setCity(city);
    }

    /**
     * @param zip zip code
     * @description - Used to enter address zip code
     * @precondition - User is on the quote basic information page
     */
    @And("I enter address zip code {string}")
    public void iSetZipCode(String zip) {
        new ClientInformationBlock(driver).setZipCode(zip);
    }

    /**
     * @param state address state
     * @description - Used to select address state
     * @precondition - User is on the quote basic information page
     */
    @And("I select address state {string}")
    public void iSetState(String state) {
        new ClientInformationBlock(driver).setState(state);
    }

    /**
     * @throws Throwable throwable
     * @description - Used to set the Address, City, Zip and State
     * @precondition - User is on the quote basic information page
     * @precondition - User has entered data into excel
     */
    @And("I set Address, City, Zip and State")
    public void iSetAddressCityZipAndState() throws Throwable {
        new ClientInformationBlock(driver).setAddressCityZipAndState(data);
    }

    /**
     * @param value spouse or partner
     * @description - Used to check spouse or partner
     * @precondition - User is on the quote basic information page
     */
    @And("I check spouse or partner {string}")
    public void iCheckSpouseOrPartner(String value) throws InterruptedException {
        new ClientInformationBlock(driver).setSpousePartner(value);
    }

    /**
     * @throws InterruptedException interrupted exception
     * @description - Used to click the next button
     * @precondition - User is on the quote basic information page
     */
    @And("I click the next button")
    public void iClickTheNextButton() throws InterruptedException {
        new QuoteBasicInformationPage(driver).clickNext();
    }

    /**
     * @description - Used to click the create new customer button
     * @precondition - User is on the quote basic information page
     */
    @And("I click the create new customer button")
    public void iClickTheCreateNewCustomerButton() {
        new QuoteBasicInformationPage(driver).clickCreateNewCustomer();
    }

    @And("I enter the effective date")
    public void iEnterTheEffectiveDate() throws Throwable {
        new ClientInformationBlock(driver).setEffectiveDate(data.get("Effective_Date"));
    }

    @And("I enter the date of birth")
    public void iEnterTheDateOfBirth() throws Throwable {
        new ClientInformationBlock(driver).setDateOfBirth(data.get("Date_Of_Birth"));
    }

    @And("I select the risk state")
    public void iSelectTheRiskState() throws Throwable {
        new LinesOfBusinessBlock(driver).setRiskState(data.get("State"));
    }

    @And("I check admitted or surplus line")
    public void iCheckAdmittedOrSurplusLine() throws Throwable {
        new LinesOfBusinessBlock(driver).selectAdmittedOrSurplus(data.get("Admitted_Or_Surplus"));
    }

    @And("I check the line of business")
    public void iCheckTheLineOfBusiness() {
        new LinesOfBusinessBlock(driver).selectAdmittedLine(data.get("Admitted_Line"));
    }

    @And("I check is disclosure required and made")
    public void iCheckIsDisclosureRequiredAndMade() throws Throwable {
        new UnderwritingReportAuthorizationBlock(driver)
                .setIsDisclosureRequiredAndHasBeenMade(data.get("Disclosure_Required"),
                        data.get("Disclosure_Made")
                );
    }

    @And("I select licensed producer")
    public void iSelectLicensedProducer() throws InterruptedException {
        if (ENV.equalsIgnoreCase("DR_PROD")) {
            new ProducerInformationBlock(driver).setLicensedProducer(data.get("Licensed_Producer_PROD"));
        } else {
            new ProducerInformationBlock(driver).setLicensedProducer(data.get("Licensed_Producer_" + ENV));
        }
    }

    @And("I select advisor servicer")
    public void iSelectAdvisorServicer() throws InterruptedException {
        if (ENV.equalsIgnoreCase("DR_PROD")) {
            new ProducerInformationBlock(driver).setAdvisorServicer(data.get("Advisor_Servicer_PROD"));
        } else {
            new ProducerInformationBlock(driver).setAdvisorServicer(data.get("Advisor_Servicer_" + ENV));
        }
    }

    @And("I enter customers prefix")
    public void iEnterCustomersPrefix() {
        new ClientInformationBlock(driver).setPrefix(data.get("Prefix"));
    }

    @And("I enter customers first name")
    public void iEnterCustomersFirstName() throws Throwable {
        new ClientInformationBlock(driver).setFirstName(data.get("First_Name"));
    }

    @And("I enter customers last name")
    public void iEnterCustomersLastName() {
        new ClientInformationBlock(driver).setLastName(data.get("Last_Name"));
    }

    @And("I enter customers MI")
    public void iEnterCustomersMI() {
        new ClientInformationBlock(driver).setMI(data.get("MI"));
    }

    @And("I enter customers suffix")
    public void iEnterCustomersSuffix() {
        new ClientInformationBlock(driver).setSuffix(data.get("Suffix"));
    }

    @And("I enter member occupation")
    public void iEnterMemberOccupation() {
        new ClientInformationBlock(driver).setMemberOccupation(data.get("Member_Occupation"));
    }

    @And("I enter member employer")
    public void iEnterMemberEmployer() {
        new ClientInformationBlock(driver).setMemberEmployer(data.get("Member_Employer"));
    }

    @And("I check spouse or partner")
    public void iCheckSpouseOrPartner() throws InterruptedException {
        new ClientInformationBlock(driver).setSpousePartner(data.get("Spouse_Partner"));
    }

    @And("I partially fill out quote basic information page")
    public void iFillOutQuoteBasicInfoPagePF() throws Throwable {
        new QuoteBasicInformationPage(driver).fillOutQuoteBasicInformationPagePF(data);
    }

}