package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.*;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class PolicyPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();
    String lastAddedCityState;

    @And("I fill out the policy page for CC line of business")
    public void iFillOutPolicyPageForCC() throws Throwable {
        new PolicyPage(driver).fillPolicyPageCC(data);
    }

    @And("I fill out the policy page for FS line of business")
    public void iFillOutPolicyPageForFS() throws Throwable {
        new PolicyPage(driver).fillPolicyPageFS(data);
    }

    @And("I fill out the policy information block for CC line of business")
    public void iFillOutPolicyInformationBlockForCC() throws Throwable {
        new PolicyInformationBlock(driver).fillPolicyInformationDetailsCC(data);
    }

    @And("I fill out the insurance information block for CC line of business")
    public void iFillOutInsuranceInformationBlockForCC() throws Throwable {
        new InsuranceInformationBlock(driver).fillInsuranceInformationDetailsCC(data);
    }

    @And("I fill out the underwriting company block for CC line of business")
    public void iFillOutUnderwritingCompanyBlockForCC() throws Throwable {
        new UnderwritingCompanyBlock(driver).fillUnderwritingCompanyDetailsCC(data);
    }

    @And("I fill out the named insured block for CC line of business")
    public void iFillOutNamedInsuredBlockForCC() throws Throwable {
        new NamedInsuredBlock(driver).fillNamedInsuredDetailsCC(data);
    }

    @And("I fill out the project type block for CC line of business")
    public void iFillOutProjectTypeBlockForCC() throws Throwable {
        new ProjectTypeBlock(driver).fillProjectTypeDetailsCC(data);
    }

    @And("I set the term to {string}")
    public void iSetTerm(String term) {
        new PolicyInformationBlock(driver).setTerm(term);
    }

    @And("I set the effective date to {string}")
    public void setEffectiveDate(String date) throws InterruptedException {
        new PolicyInformationBlock(driver).setEffectiveDate(date);
    }

    @And("I verify the expiration date is {string}")
    public void verifyExpirationDate(String date) {
        new PolicyInformationBlock(driver).verifyExpirationDate(date);
    }

    @And("I set the named insured type to {string}")
    public void setNamedInsuredType(String type) throws Throwable {
        new PolicyInformationBlock(driver).setNamedInsuredType(type);
    }

    @And("I set the state or political figure to {string}")
    public void setStateOrPoliticalFigure(String value) throws Throwable {
        new PolicyInformationBlock(driver).setStateOrPoliticalFigure(value);
    }

    @And("I set the quote name to {string}")
    public void setQuoteName(String name) throws Throwable {
        new PolicyInformationBlock(driver).setQuoteName(name);
    }

    @And("I set the licenced producer to {string}")
    public void setLicencedProducer(String licencedProducer) {
        new PolicyInformationBlock(driver).setLicencedProducer(licencedProducer);
    }

    @And("I set the advisor servicer to {string}")
    public void setAdvisorServicer(String advisorServicer) {
        new PolicyInformationBlock(driver).setAdvisorServicer(advisorServicer);
    }

    @And("I click create new entity")
    public void createNewEntity() throws InterruptedException {
        new PolicyInformationBlock(driver).clickCreateNewEntity();
    }

    @And("I set the entity name to {string}")
    public void setEntityName(String entityName) {
        new PolicyInformationBlock(driver).setEntityName(entityName);
    }

    @And("I set the policy information trust llc or other legal entity to {string}")
    public void setTrustLLC(String entityName) {
        new PolicyInformationBlock(driver).setTrustLLC(entityName);
    }

    @And("I set the current homeowners insurance carrier to {string}")
    public void setCurrentHomeownersInsuranceCarrier(String carrier) throws InterruptedException {
        new InsuranceInformationBlock(driver).setCurrentHomeownersInsuranceCarrier(carrier);
    }

    @And("I set the current premium to {string}")
    public void setCurrentPremium(String premium) {
        new InsuranceInformationBlock(driver).setCurrentPremium(premium);
    }

    @And("I set the carrier name to {string}")
    public void setCarrierName(String name) {
        new InsuranceInformationBlock(driver).setCarrierName(name);
    }

    @And("I verify that the underwriting company is {string}")
    public void verifyUnderwritingCompany(String value) {
        new UnderwritingCompanyBlock(driver).verifyUnderwritingCompany(value);
    }

    @And("I check the manager override {string}")
    public void checkManagerOverride(String override) throws Throwable {
        new UnderwritingCompanyBlock(driver).checkManagerOverride(override);
    }

    @And("I verify that the insurance score tier is {string}")
    public void verifyInsuranceScoreTier(String value) {
        new CreditScoreTiersBlock(driver).verifyInsuranceScoreTier(value);
    }

    @And("I verify that the insurance score tier original is {string}")
    public void verifyInsuranceScoreTierOriginal(String value) {
        new CreditScoreTiersBlock(driver).verifyInsuranceScoreTierOriginal(value);
    }

    @And("I verify that the insurance score for rating is {string}")
    public void verifyInsuranceScoreForRating(String value) {
        new CreditScoreTiersBlock(driver).verifyInsuranceScoreForRating(value);
    }

    @And("I verify that the insurance score for rating original is {string}")
    public void verifyInsuranceScoreForRatingOriginal(String value) {
        new CreditScoreTiersBlock(driver).verifyInsuranceScoreForRatingOriginal(value);
    }

    @And("I set the named insured prefix to {string}")
    public void setNamedInsuredPrefix(String prefix) {
        new NamedInsuredBlock(driver).setPrefix(prefix, 0);
    }

    @And("I set the named insured first name to {string}")
    public void setNamedInsuredFirstName(String firstName) throws Throwable {
        new NamedInsuredBlock(driver).setFirstName(firstName, 0);
    }

    @And("I set the named insured MI to {string}")
    public void setNamedInsuredMI(String MI) {
        new NamedInsuredBlock(driver).setMI(MI, 0);
    }

    @And("I set the named insured last name to {string}")
    public void setNamedInsuredLastName(String lastName) {
        new NamedInsuredBlock(driver).setLastName(lastName, 0);
    }

    @And("I set the named insured suffix to {string}")
    public void setNamedInsuredSuffix(String suffix) {
        new NamedInsuredBlock(driver).setSuffix(suffix, 0);
    }

    @And("I click the named insured block")
    public void clickBlock() {
        new NamedInsuredBlock(driver).clickBlock();
    }

    @And("I click the add named insured button")
    public void clickAddNamedInsured() throws Throwable {
        new NamedInsuredBlock(driver).clickAddNamedInsured();
    }

    @And("I set the additional named insured {int} prefix to {string}")
    public void setAdditionalNamedInsuredPrefix(int index, String prefix) {
        new NamedInsuredBlock(driver).setPrefix(prefix, index);
    }

    @And("I set the additional named insured {int} first name to {string}")
    public void setAdditionalNamedInsuredFirstName(int index, String firstName) throws Throwable {
        clickBlock();
        new NamedInsuredBlock(driver).setFirstName(firstName, index);
    }

    @And("I set the additional named insured {int} MI to {string}")
    public void setAdditionalNamedInsuredMI(int index, String MI) {
        new NamedInsuredBlock(driver).setMI(MI, index);
    }

    @And("I set the additional named insured {int} last name to {string}")
    public void setAdditionalNamedInsuredLastName(int index, String lastName) {
        new NamedInsuredBlock(driver).setLastName(lastName, index);
    }

    @And("I set the additional named insured {int} suffix to {string}")
    public void setAdditionalNamedInsuredSuffix(int index, String suffix) {
        new NamedInsuredBlock(driver).setSuffix(suffix, index);
    }

    @And("I set the project type to {string}")
    public void setProjectType(String projectType) throws Throwable {
        new ProjectTypeBlock(driver).setProjectType(projectType);
    }

    @And("I set the has the foundation stage been completed to {string}")
    public void setHasTheFoundationStageBeenCompleted(String value) throws Throwable {
        new ProjectTypeBlock(driver).setHasTheFoundationStageBeenCompleted(value);
    }

    @And("I set the has the project started to {string}")
    public void setHasTheProjectStarted(String value) throws Throwable {
        new ProjectTypeBlock(driver).setHasTheProjectStarted(value);
    }

    @And("I set the when did the project start to {string}")
    public void setWhenDidItStart(String date) {
        new ProjectTypeBlock(driver).setWhenDidItStart(date);
    }

    @And("I set the when will the project start to {string}")
    public void setWhenWillItStart(String date) {
        new ProjectTypeBlock(driver).setWhenWillItStart(date);
    }

    @And("I set the anticipated start date to {string}")
    public void setAnticipatedStartDate(String date) {
        new ProjectTypeBlock(driver).setAnticipatedStartDate(date);
    }

    @And("I set the FAC reinsurance required to {string}")
    public void setFACReinsuranceRequired(String fac) throws Throwable {
        new ProjectTypeBlock(driver).setFACReinsuranceRequired(fac);
    }

    @And("I set the carrier to {string}")
    public void setCarrier(String carrier) {
        new ProjectTypeBlock(driver).setCarrier(carrier);
    }

    @And("I set the limit to {string}")
    public void setLimit(String limit) {
        new ProjectTypeBlock(driver).setLimit(limit);
    }

    @And("I set the expiration date to {string}")
    public void setExpirationDate(String date) {
        new ProjectTypeBlock(driver).setExpirationDate(date);
    }

    @And("I set the certificate to {string}")
    public void setCertificate(String certificate) {
        new ProjectTypeBlock(driver).setCertificate(certificate);
    }

    @And("I set the FAC premium to {string}")
    public void setFACPremium(String premium) {
        new ProjectTypeBlock(driver).setFACPremium(premium);
    }

    @And("I verify that Census Tract is pulled")
    public void isCensusTractPulled() {
        new PolicyInformationBlock(driver).verifyCensusTract("NotEmpty");
    }

    @And("I set name of resident to {string}")
    public void setNameOfResident(String value) {
        new PolicyInformationBlock(driver).setNameOfResident(value);
    }

    @And("I click Create new Entity")
    public void clickOnCreateNewEntity() throws InterruptedException {
        new PolicyInformationBlock(driver).clickCreateNewEntity();
    }

    @And("I set the named insured {int} to {string}")
    public void setNamedInsured(int index, String value) throws Throwable {
        new NamedInsuredBlock(driver).setNamedInsured(value, index);
    }

    @And("I click add additional risk addresses")
    public void clickAddAdditionalAddresses() throws Throwable {
        new RiskAddressesBlock(driver).clickAddAddress();
    }

    @And("I set risk address {int} residence type to {string}")
    public void iSetRiskResidenceTypeTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setResidenceType(value, index);
    }

    @And("I set risk address {int} address line 1 to {string}")
    public void iSetRiskAddressLineTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setAddressLine(value, index);
    }

    @And("I set risk address {int} city to {string}")
    public void iSetRiskAddressCityTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setCity(value, index);
    }

    @And("I set risk address {int} zip to {string}")
    public void iSetRiskAddressZIPTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setZIP(value, index);
    }

    @And("I set risk address {int} state to {string}")
    public void iSetRiskAddressStateTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setState(value, index);
    }

    @And("I set risk address {int} replacement cost to {string}")
    public void iSetRiskAddressReplacementCostTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setReplacementCostValue(value, index);
    }

    @And("I set risk address {int} other structures to {string}")
    public void iSetRiskAddressOtherStructuresTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setOtherStructuresLimit(value, index);
    }

    @And("I set risk address {int} contents to {string}")
    public void iSetRiskAddressContentsTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setContentsLimit(value, index);
    }

    @And("I set risk address {int} windstorm or hail deductible to {string}")
    public void iSetRiskAddressWindstormOrHailTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setWindOrHailDed(value, index);
    }

    @And("I set risk address {int} number of family units to {string}")
    public void iSetRiskAddressNumFamilyUnitsTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setNumberOfFamilyUnits(value, index);
    }

    @And("I set risk address {int} AOP Ded to {string}")
    public void iSetRiskAddressAOPDedTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setAOPDed(value, index);
    }

    @And("I set risk address {int} calendar year hurricane ded to {string}")
    public void iSetRiskAddressCalendarYearHurricaneDedTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setCalendarYearHurricaneDed(value, index);
    }

    @And("I set risk address {int} Loss of Use to {string}")
    public void iSetRiskAddressLossOfUseTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setLossOfUseLimit(value, index);
    }

    @And("I verify that Territory is {string}")
    public void verifyTerritoryIsPulled(String value) {
        new PolicyInformationBlock(driver).verifyTerritory(value);
    }

    @And("I override Census Tract to {string}")
    public void iOverrideCensusTractTo(String value) throws Throwable {
        new PolicyInformationBlock(driver).overrideCensusTract(value);
    }

    @And("I verify that Manager Census Tract is {string}")
    public void iVerifyManagerCensusTract(String value) {
        new PolicyInformationBlock(driver).verifyManagerCensusTractOverrideCheckbox(value);
    }

    @And("I click add additional named insured")
    public void iClickAddAdditionalNamedInsured() throws Throwable {
        new NamedInsuredBlock(driver).clickAddNamedInsured();
    }

    @And("I set additional named insured {int} first name to {string}")
    public void iSetAdditionalNamedInsuredFirstName(int index, String value) throws Throwable {
        new NamedInsuredBlock(driver).setFirstName(value, index);
    }

    @And("I set additional named insured {int} last name to {string}")
    public void iSetAdditionalNamedInsuredLastName(int index, String value) throws Throwable {
        new NamedInsuredBlock(driver).setLastName(value, index);
    }

    @And("I click risk address {int} AOP Ded cell")
    public void clickAOPDedCell(int index) throws InterruptedException {
        new RiskAddressesBlock(driver).clickAOPDed(index);
    }

    @And("I set underwriting company to {string}")
    public void setUnderwritingCompanyTo(String value) throws Throwable {
        new UnderwritingCompanyBlock(driver).setUnderwritingCompany(value);
    }

    @And("I set personal liability limit to {string}")
    public void setPersonalLiabilityLimit(String value) throws Throwable {
        new LiabilityCoveragesBlock(driver).setPersonalLiabilityLimit(value);
    }

    @And("I click delete {int} additional risk address")
    public void clickAddAdditionalAddresses(int index) throws Throwable {
        new RiskAddressesBlock(driver).clickDelete(index);
    }

    @And("I set do you employ any domestic employees to {string} on Excess Liability Policy page")
    public void setEmployAnyDomesticEmployees(String value) throws Throwable {
        new GeneralInformationBlock(driver).setDomesticEmployees(value);
    }

    @And("I set how many employees to {string} on Excess Liability Policy page")
    public void setHowManyEmployees(String value) throws Throwable {
        new GeneralInformationBlock(driver).setHowManyEmployees(value);
    }

    @And("I set Household Own Recreational Vehicle to {string} on Excess Liability Policy page")
    public void setHouseholdOwnRecreationalVehicle(String value) throws Throwable {
        new GeneralInformationBlock(driver).setHouseHoldOwnRecreationalVehicle(value);
    }

    @And("I set Household Own Moped or Scooter to {string} on Excess Liability Policy page")
    public void setHouseholdOwnMopedOrScooter(String value) throws Throwable {
        new GeneralInformationBlock(driver).setHouseHoldOwnMotorcycleMopedScooter(value);
    }

    @And("I fill out CO risk location characteristics block")
    public void fillOutCORiskLocationCharacteristicsBlock() throws Throwable {
        new RiskLocationCharacteristicsBlock(driver).fillRiskLocationCharacteristics(data);
    }

    @And("I set policy information does the member have pure fleet auto insurance policy to {string}")
    public void doesMemberHavePureFleetAutoInsurancePolicy(String value) throws Throwable {
        new PolicyInformationBlock(driver).setDoesTheMemberHaveAPurePrivateAuto(value);
    }

    @And("I set risk address {int} Deductible to {string}")
    public void iSetRiskAddressDeductibleTo(int index, String value) throws Throwable {
        new RiskAddressesBlock(driver).setDeductible(value, index);
    }

    @And("I set Did Member Request RePull Of Insurance Score Upon Renewal to {string}")
    public void iSetDidMemberReqRePull(String value) throws Throwable {
        new CreditScoreTiersBlock(driver).setDidMemberRequestRePullOfInsuranceScoreUponRenewal(value);
    }

    @And("I verify carrier partner on {string}")
    public void iVerifyCarrierPartnerOn(String trx) throws Throwable {
        new UnderwritingCompanyBlock(driver).verifyCarrierPartner(data, trx);
    }

    @And("I verify carrier partner {string}")
    public void iVerifyCarrierPartner(String carrier) {
        new UnderwritingCompanyBlock(driver).verifyCarrier(carrier);
    }

    @And("I override underwriting company to {string}")
    public void iChoseUnderwritingCompany(String company) throws Throwable {
        new UnderwritingCompanyBlock(driver).selectUnderwritingCompany(data, company);
    }

    @And("I navigate to Homeowner Policy Page and add new risk location with basic details")
    public void addNewRiskLocationAndFillOutWithBasicDetails(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            String city = columns.get(1);
            String state = columns.get(2);
            String zip = columns.get(3);
            String residenceType = columns.get(4);
            String coverageAmount = columns.get(5);
            String lossOfUse = columns.get(6);
            String aopDed = columns.get(7);
            String hurricaneDed = columns.get(8);
            String i;

            new CommonComponentsAndActions(driver).navigateToHomeownerPolicyPage();
            new HomeownersPolicyCoverPage(driver).addNewLocationAndChangeDataHO(addressLine1, city, state, zip, residenceType,
                    coverageAmount, lossOfUse, aopDed, hurricaneDed);
            try{
                i = columns.get(9);
                if(hasValue(i)){
                    new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageTemp(data, city, state, Integer.parseInt(i));
                } else {
                    new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage(data);
                }
            } catch (Exception e) {}
            new OptionalCoveragesPage(driver).fillOptionalCoveragesHO(data);
            new FloodCoveragePage(driver).fillFloodCoveragePageHO(data);
            new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
            new WildfirePage(driver).fillWildfireDetailsPageHO(data);
            new EarthquakePage(driver).fillEarthquakeDetailsPageHO(data);
            new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
            new InspectionPage(driver).fillOutInspectionDetailsHO(data);
            new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
            new BindingInformationPage(driver).fillOutBindingInformationHO(data);
            new MemberInformationPage(driver).fillMemberInformationPage(data);
        }
    }

    @And("I navigate to Homeowner Policy Page and add new risk location with basic details {int}")
    public void addNewRiskLocationAndFillOutWithBasicDetails(DataTable table, int i) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            String city = columns.get(1);
            String state = columns.get(2);
            String zip = columns.get(3);
            String residenceType = columns.get(4);
            String coverageAmount = columns.get(5);
            String lossOfUse = columns.get(6);
            String aopDed = columns.get(7);
            String hurricaneDed = columns.get(8);

            new CommonComponentsAndActions(driver).navigateToHomeownerPolicyPage();
            new HomeownersPolicyCoverPage(driver).addNewLocationAndChangeDataHO(addressLine1, city, state, zip, residenceType,
                    coverageAmount, lossOfUse, aopDed, hurricaneDed);
            new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageTemp(data, city, state, i);
            new OptionalCoveragesPage(driver).fillOptionalCoveragesHO(data);
            new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
            new WildfirePage(driver).fillWildfireDetailsPageHO(data);
            new EarthquakePage(driver).fillEarthquakeDetailsPageHO(data);
            new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
            new InspectionPage(driver).fillOutInspectionDetailsHO(data);
            if (!data.get("State").equalsIgnoreCase("HI")) {
                new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
            }
            new BindingInformationPage(driver).fillOutBindingInformationHO(data);
            new MemberInformationPage(driver).fillMemberInformationPage(data);
        }
    }

    @And("I navigate to Homeowner Policy Page and add new risk location with basic details only")
    public void addNewRiskLocationAndFillOutWithBasicDetailsOnly(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            String city = columns.get(1);
            String state = columns.get(2);
            String zip = columns.get(3);
            String residenceType = columns.get(4);
            String coverageAmount = columns.get(5);
            String lossOfUse = columns.get(6);
            String aopDed = columns.get(7);
            String hurricaneDed = columns.get(8);

            new CommonComponentsAndActions(driver).navigateToHomeownerPolicyPage();
            new HomeownersPolicyCoverPage(driver).addNewLocationAndChangeDataHO(addressLine1, city, state, zip, residenceType,
                    coverageAmount, lossOfUse, aopDed, hurricaneDed);
        }
    }

    @Then("I navigate to Home Surplus Lines Policy page and add new risk location with basic details only")
    public void addNewRiskLocationAndFillOutWithBasicDetailsOnlyHS(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            String city = columns.get(1);
            String state = columns.get(2);
            String zip = columns.get(3);
            String residenceType = columns.get(4);
            String coverageAmount = columns.get(5);
            String lossOfUse = columns.get(6);
            String aopDed = columns.get(7);
            String hurricaneDed = columns.get(8);

            new CommonComponentsAndActions(driver).navigateToHomeSurplusLinesPolicyPage();
            new HomeownersPolicyCoverPage(driver).addNewLocationAndChangeDataHS(addressLine1, city, state, zip, residenceType,
                    coverageAmount, lossOfUse, aopDed, hurricaneDed);
        }
    }

    @And("I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page")
    public void addNewRiskLocationAndFillOutWithBasicDetailsExceptFloodPage(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            String city = columns.get(1);
            String state = columns.get(2);
            String zip = columns.get(3);
            String residenceType = columns.get(4);
            String coverageAmount = columns.get(5);
            String lossOfUse = columns.get(6);
            String aopDed = columns.get(7);
            String hurricaneDed = columns.get(8);
            String i;

            new CommonComponentsAndActions(driver).navigateToHomeownerPolicyPage();
            new HomeownersPolicyCoverPage(driver).addNewLocationAndChangeDataHO(addressLine1, city, state, zip, residenceType,
                    coverageAmount, lossOfUse, aopDed, hurricaneDed);
            try{
                i = columns.get(9);
                if(hasValue(i)){
                    new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageTemp(data, city, state, Integer.parseInt(i));
                } else {
                    new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage(data);
                }
            } catch (Exception e) {}
            new OptionalCoveragesPage(driver).fillOptionalCoveragesHO(data);
            new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
            new WildfirePage(driver).fillWildfireDetailsPageHO(data);
            new EarthquakePage(driver).fillEarthquakeDetailsPageHO(data);
            new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
            new InspectionPage(driver).fillOutInspectionDetailsHO(data);
            new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
            new BindingInformationPage(driver).fillOutBindingInformationHO(data);
            new MemberInformationPage(driver).fillMemberInformationPage(data);
        }
    }

    @And("I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page for {string}")
    public void addNewRiskLocationAndFillOutWithBasicDetailsExceptFloodPageMultipleStates(String stateFromExamples, DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String state = columns.get(2);
            if (state.equalsIgnoreCase(stateFromExamples)) {
                String addressLine1 = columns.get(0);
                String city = columns.get(1);
                String zip = columns.get(3);
                String residenceType = columns.get(4);
                String coverageAmount = columns.get(5);
                String lossOfUse = columns.get(6);
                String aopDed = columns.get(7);
                String hurricaneDed = columns.get(8);
                String i;

                lastAddedCityState = city + " " + state;
                new CommonComponentsAndActions(driver).navigateToHomeownerPolicyPage();
                new HomeownersPolicyCoverPage(driver).addNewLocationAndChangeDataHO(addressLine1, city, state, zip, residenceType,
                        coverageAmount, lossOfUse, aopDed, hurricaneDed);
                try {
                    i = columns.get(9);
                    if (hasValue(i)) {
                        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageTemp(data, city, state, Integer.parseInt(i));
                    } else {
                        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage(data);
                    }
                } catch (Exception e) {
                }
                new OptionalCoveragesPage(driver).fillOptionalCoveragesHO(data);
                new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
                new WildfirePage(driver).fillWildfireDetailsPageHO(data);
                new EarthquakePage(driver).fillEarthquakeDetailsPageHO(data);
                new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
                new InspectionPage(driver).fillOutInspectionDetailsHO(data);
                new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
                new BindingInformationPage(driver).fillOutBindingInformationHO(data);
                new MemberInformationPage(driver).fillMemberInformationPage(data);
                break;
            }
        }
    }

    @And("I navigate to the newly added location page")
    public void iNavigateToTheNewlyAddedLocationPage() throws Throwable {
        new CommonComponentsAndActions(driver).goToPage(lastAddedCityState);
    }

    @And("I set operator {int} relationship to insured on Watercraft to {string}")
    public void iSetOperatorRelationShipToInsuredOnWC(int i, String value) throws Throwable {
        new ListOfOperatorsBlock(driver).setRelationshipToInsured(value, i);
    }

}