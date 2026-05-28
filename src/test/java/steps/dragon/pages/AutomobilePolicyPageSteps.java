package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.AutomobilePolicyPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class AutomobilePolicyPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote cover page")
    public void iFillOutQuoteCoverPagePA() throws Throwable {
        new AutomobilePolicyPage(driver).fillAutomobilePolicyPagePA(data);
    }

    @And("I fill out PA quote policy information block")
    public void iFillOutPolicyInformationBlockPA() throws Throwable {
        new PolicyInformationBlock(driver).fillPolicyInformationDetailsPA(data);
    }

    @And("I fill out PA quote primary address block")
    public void iFillOutPrimaryAddressBlockPA() throws Throwable {
        new PrimaryAddressBlock(driver).fillPrimaryAddressDetailsPA(data);
    }

    @And("I fill out PA quote insurance information block")
    public void iFillOutInsuranceInformationBlockPA() throws Throwable {
        new InsuranceInformationBlock(driver).fillInsuranceInformationDetailsPA(data);
    }

    @And("I fill out PA quote credit score tiers block")
    public void iFillOutCreditScoreTiersBlockPA() throws Throwable {
        new CreditScoreTiersBlock(driver).fillCreditScoreTiersDetailsPA(data);
    }

    @And("I fill out PA quote account level characteristics block")
    public void iFillOutAccountLevelCharacteristicsBlockPA() throws Throwable {
        new AccountLevelCharacteristicsBlock(driver).fillAccountLevelCharacteristicsDetailsPA(data);
    }

    @And("I fill out PA endorsement cover page")
    public void iFillOutQuoteCoverPagePA_END() throws Throwable {
        new AutomobilePolicyPage(driver).fillAutomobilePolicyPagePA_END(data);
    }

    @And("I fill out PA endorsement policy information block")
    public void iFillOutPolicyInformationBlockPA_END() throws Throwable {
        new PolicyInformationBlock(driver).fillPolicyInformationDetailsPA_END(data);
    }

    @And("I fill out PA endorsement primary address block")
    public void iFillOutPrimaryAddressBlockPA_END() throws Throwable {
        new PrimaryAddressBlock(driver).fillPrimaryAddressDetailsPA_END(data);
    }

    @And("I fill out PA endorsement insurance information block")
    public void iFillOutInsuranceInformationBlockPA_END() throws Throwable {
        new InsuranceInformationBlock(driver).fillInsuranceInformationDetailsPA_END(data);
    }

    @And("I fill out PA endorsement credit score tiers block")
    public void iFillOutCreditScoreTiersBlockPA_END() throws Throwable {
        new CreditScoreTiersBlock(driver).fillCreditScoreTiersDetailsPA_END(data);
    }

    @And("I fill out PA endorsement account level characteristics block")
    public void iFillOutAccountLevelCharacteristicsBlockPA_END() throws Throwable {
        new AccountLevelCharacteristicsBlock(driver).fillAccountLevelCharacteristicsDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    //Policy information block steps - START
    @And("I click on obtain operators and vehicles")
    public void iClickOnObtainOperatorsAndVehicles() throws Throwable {
        new AutomobilePolicyPage(driver).clickObtainOperatorsAndVehicles();
    }

    @And("I set policy information term to {string}")
    public void iSetPolicyInformationTerm(String term) {
        new PolicyInformationBlock(driver).setTerm(term);
    }

    @And("I set policy information effective date to {string}")
    public void iSetPolicyInformationEffectiveDate(String value) throws InterruptedException {
        new PolicyInformationBlock(driver).setEffectiveDate(value);
    }

    @And("I verify policy information expiration date is {string}")
    public void iVerifyPolicyInformationExpirationDate(String value) {
        new PolicyInformationBlock(driver).verifyExpirationDate(value);
    }

    @And("I set policy information named Insured type to {string}")
    public void iSetPolicyInformationNamedInsuredType(String value) throws Throwable {
        new PolicyInformationBlock(driver).setNamedInsuredType(value);
    }

    @And("I set policy information trust LLC or other legal entity type to {string} and entity name to {string}")
    public void iSetPolicyInformationTrustLLCOrOtherLegalEntityName(String type, String entityName) throws InterruptedException {
        new PolicyInformationBlock(driver).setTrustLLCOrOtherLegalEntityName(type, entityName);
    }

    @And("I set policy information policy rewrite to {string} and policy number to {string}")
    public void iSetPolicyInformationPolicyRewrite(String rewrite, String policyNumber) throws Throwable {
        new PolicyInformationBlock(driver).setPolicyRewrite(rewrite, policyNumber);
    }

    @And("I set policy information does the member have pure homeowners to {string}")
    public void iSetPolicyInformationDoesTheMemberHavePureHomeowners(String value) throws Throwable {
        new PolicyInformationBlock(driver).setDoesTheMemberHavePureHomeowners(value);
    }

    @And("I set policy information does the member have pure personal excess to {string}")
    public void iSetPolicyInformationDoesTheMemberHavePurePersonalExcess(String value) throws Throwable {
        new PolicyInformationBlock(driver).setDoesTheMemberHavePurePersonalExcess(value);
    }

    @And("I set policy information does the member have pure jewelry to {string}")
    public void iSetPolicyInformationDoesTheMemberHavePureJewelry(String value) throws Throwable {
        new PolicyInformationBlock(driver).setDoesTheMemberHavePureJewelry(value);
    }

    @And("I set policy information quote name to {string}")
    public void iSetPolicyInformationQuoteName(String value) throws Throwable {
        new PolicyInformationBlock(driver).setQuoteName(value);
    }

    @And("I set policy information licenced producer to {string}")
    public void iSetPolicyInformationLicencedProducer(String value) {
        new PolicyInformationBlock(driver).setLicencedProducer(value);
    }

    @And("I set policy information advisor servicer to {string}")
    public void iSetPolicyInformationAdvisorServicer(String value) {
        new PolicyInformationBlock(driver).setAdvisorServicer(value);
    }
    //Policy information block steps - END

    //Primary address block steps - START
    @And("I set primary address primary Location to {string}")
    public void iSetPrimaryAddressPrimaryLocation(String value) {
        new PrimaryAddressBlock(driver).setPrimaryLocation(value);
    }

    @And("I set primary address address line 1 to {string}")
    public void iSetPrimaryAddressAddressLine1(String value) {
        new PrimaryAddressBlock(driver).setAddressLine1(value);
    }

    @And("I set primary address address line 2 to {string}")
    public void iSetPrimaryAddressAddressLine2(String value) {
        new PrimaryAddressBlock(driver).setAddressLine2(value);
    }

    @And("I set primary address city to {string}")
    public void iSetPrimaryAddressCity(String value) throws Throwable {
        new PrimaryAddressBlock(driver).setCity(value);
    }

    @And("I verify primary address state to {string}")
    public void iVerifyPrimaryAddressState(String value) {
        new PrimaryAddressBlock(driver).verifyState(value);
    }

    @And("I set primary address ZIP code to {string}")
    public void iSetPrimaryAddressZIPCode(String value) {
        new PrimaryAddressBlock(driver).setZIPCode(value);
    }
    //Primary address block steps - END

    //Insurance information block - START
    @And("I set insurance information current prior carrier to {string}")
    public void iSetInsuranceInformationCurrentPriorCarrier(String value) {
        new InsuranceInformationBlock(driver).setCurrentPriorCarrier(value);
    }

    @And("I set insurance information Laps In Coverage to {string}")
    public void iSetInsuranceInformationLapsInCoverage(String value) throws Throwable {
        new InsuranceInformationBlock(driver).setLapsInCoverage(value);
    }

    @And("I set insurance information FoR to {string}")
    public void iSetInsuranceInformationFoR(String value) throws Throwable {
        new InsuranceInformationBlock(driver).setFoR(value);
    }

    @And("I set insurance information Premium to {string}")
    public void iSetInsuranceInformationPremium(String value) throws Throwable {
        new InsuranceInformationBlock(driver).setPremium(value);
    }
    //Insurance information block - START

    // TODO PA STEPS - Credit score

    //Account level characteristics block - START
    @And("I set account level characteristics non CAT to {string}")
    public void iSetAccountLevelCharacteristicsNonCAT(String value) throws Throwable {
        new AccountLevelCharacteristicsBlock(driver).setNonCAT(value);
    }

    @And("I set account level characteristics  two or more properties to {string}")
    public void iSetAccountLevelCharacteristicsTwoOrMoreProperties(String value) throws Throwable {
        new AccountLevelCharacteristicsBlock(driver).setTwoOrMoreProperties(value);
    }
    //Account level characteristics block - END

    // TODO PA STEPS - Account Level Characteristics

}