package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.AdditionalInterestsPage;
import pages.TrustLlcOtherLegalEntityPage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class TrustLLCOtherLegalEntityPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //CC pages and blocks steps - START
    @And("I fill out the trust LLC other legal entity page for CC line of business")
    public void iFillTrustLLCOtherLegalEntityPageCC() throws Throwable {
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageCC(data);
    }

    @And("I fill out the Llc trust questionnaire block for CC line of business")
    public void iFillLlcTrustQuestionnaireBlockCC() throws Throwable {
        new LlcTrustQuestionnaireBlock(driver).fillLlcTrustQuestionnaireBlockCC(data);
    }

    @And("I fill out the what is the address of location legal entity owns block for CC line of business")
    public void iFillWhatIsTheAddressOfLocationLegalEntityOwnsBlockCC() throws Throwable {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).fillWhatIsTheAddressOfLocationLegalEntityOwnsBlockCC(data);
    }

    @And("I fill out the please provide the principal beneficial owners name or employees bloc for CC line of business")
    public void iFillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocCC() throws Throwable {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlocCC(data);
    }

    @And("I fill out the please provide additional details block for CC line of business")
    public void iFillPleaseProvideAdditionalDetailsBlockCC() throws Throwable {
        new PleaseProvideAdditionalDetailsBlock(driver).fillPleaseProvideAdditionalDetailsBlockCC(data);
    }

    @And("I fill out the trust Llc other legal entity policy information block for CC line of business")
    public void iFillTrustLlcOtherLegalEntityPolicyInformationBlockCC() throws Throwable {
        new TrustLlcOtherLegalEntityPolicyInformationBlock(driver).fillTrustLlcOtherLegalEntityPolicyInformationBlockCC(data);
    }
    //CC pages and blocks steps - END

    //PA pages and blocks steps - START
    @And("I fill out PA quote trust llc other legal entity page")
    public void iFillOutTrustLlcOtherLegalEntityPagePA() throws Throwable {
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPagePA(data);
    }

    @And("I fill out PA endorsement trust llc other legal entity page")
    public void iFillOutTrustLlcOtherLegalEntityPagePA_END() throws Throwable {
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPagePA_END(data);
    }

    @And("I fill out PA quote llc trust questionnaire block")
    public void iFillOutLlcTrustQuestionnaireBlockPA() throws Throwable {
        new LlcTrustQuestionnaireBlock(driver).fillLlcTrustQuestionnaireDetailsPA(data);
    }

    @And("I fill out PA quote what is the address of location legal entity owns block")
    public void iFillOutWhatIsTheAddressOfLocationLegalEntityOwnsBlockPA() throws Throwable {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA(data);
    }

    @And("I fill out PA quote please provide the principal beneficial owners name or e mployees block")
    public void iFillOutPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockPA() throws Throwable {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA(data);
    }

    @And("I fill out PA quote please provide additional details block")
    public void iFillOutPleaseProvideAdditionalDetailsBlockPA() throws Throwable {
        new PleaseProvideAdditionalDetailsBlock(driver).fillPleaseProvideAdditionalDetailsDetailsPA(data);
    }

    @And("I fill out PA quote trust llc other legal entity policy information block")
    public void iFillOutTrustLlcOtherLegalEntityPolicyInformationBlockPA() throws Throwable {
        new TrustLlcOtherLegalEntityPolicyInformationBlock(driver).fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA(data);
    }

    @And("I fill out PA endorsement llc trust questionnaire block")
    public void iFillOutLlcTrustQuestionnaireBlockPA_END() throws Throwable {
        new LlcTrustQuestionnaireBlock(driver).fillLlcTrustQuestionnaireDetailsPA_END(data);
    }

    @And("I fill out PA endorsement what is the address of location legal entity owns block")
    public void iFillOutWhatIsTheAddressOfLocationLegalEntityOwnsBlockPA_END() throws Throwable {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).fillWhatIsTheAddressOfLocationLegalEntityOwnsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement please provide the principal beneficial owners name or employees block")
    public void iFillOutPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlockPA_END() throws Throwable {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).fillPleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesDetailsPA_END(data);
    }

    @And("I fill out PA endorsement please provide additional details block")
    public void iFillOutPleaseProvideAdditionalDetailsBlockPA_END() throws Throwable {
        new PleaseProvideAdditionalDetailsBlock(driver).fillPleaseProvideAdditionalDetailsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement trust llc other legal entity policy information block")
    public void iFillOutTrustLlcOtherLegalEntityPolicyInformationBlockPA_END() throws Throwable {
        new TrustLlcOtherLegalEntityPolicyInformationBlock(driver).fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    //Llc trust questionnaire block steps - START

    @And("I verify that LLC trust questionnaire legal entity name is {string}")
    public void iVerifyLegalEntityName(String value) {
        new LlcTrustQuestionnaireBlock(driver).verifyLegalEntityName(value);
    }

    @And("I set the LLC trust questionnaire legal entity name to {string}")
    public void setLegalEntityName(String value) {
        new LlcTrustQuestionnaireBlock(driver).setLegalEntityName(value);
    }

    @And("I set the LLC trust questionnaire tax ID or FEIN to {string}")
    public void setTaxIDOrFEIN(String value) {
        new LlcTrustQuestionnaireBlock(driver).setTaxIDOrFEIN(value);
    }

    @And("I set the LLC trust questionnaire address line 1 to {string}")
    public void setAddressLine1(String value) {
        new LlcTrustQuestionnaireBlock(driver).setAddressLine1(value);
    }

    @And("I set the LLC trust questionnaire address line 2 to {string}")
    public void setAddressLine2(String value) {
        new LlcTrustQuestionnaireBlock(driver).setAddressLine2(value);
    }

    @And("I set the LLC trust questionnaire city to {string}")
    public void setCity(String value) {
        new LlcTrustQuestionnaireBlock(driver).setCity(value);
    }

    @And("I set the LLC trust questionnaire block legal entity type to {string}")
    public void setLegalEntityType(String value) throws Throwable {
        new LlcTrustQuestionnaireBlock(driver).setLegalEntityType(value);
    }

    @And("I set the LLC trust questionnaire block other legal entity type to {string}")
    public void setOtherLegalEntityType(String value) {
        new LlcTrustQuestionnaireBlock(driver).setOtherLegalEntityType("Other", value);
    }

    @And("I set the LLC trust questionnaire state to {string}")
    public void setState(String value) throws Throwable {
        new LlcTrustQuestionnaireBlock(driver).setState(value);
    }

    @And("I set the LLC trust questionnaire ZIP to {string}")
    public void setZIP(String value) {
        new LlcTrustQuestionnaireBlock(driver).setZIP(value);
    }
    //LLC trust questionnaire block steps - END

    //What is the address of location legal entity owns block steps - START
    @And("I set the what is the address of location legal entity owns {int} address line 1 to {string}")
    public void setAddressLine1(int index, String value) throws InterruptedException {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).setAddressLine1(value, index);
    }

    @And("I set the what is the address of location legal entity owns {int} address line 2 to {string}")
    public void setAddressLine2(int index, String value) throws InterruptedException {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).setAddressLine2(value, index);
    }

    @And("I set the what is the address of location legal entity owns {int} city to {string}")
    public void setCity(int index, String value) throws InterruptedException {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).setCity(value, index);
    }

    @And("I set the what is the address of location legal entity owns {int} state to {string}")
    public void setState(int index, String value) throws InterruptedException {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).setState(value, index);
    }

    @And("I set the what is the address of location legal entity owns {int} ZIP to {string}")
    public void setZIP(int index, String value) {
        new WhatIsTheAddressOfLocationLegalEntityOwnsBlock(driver).setZIP(value, index);
    }
    //What is the address of location legal entity owns block steps - END

    //Please provide the principal beneficial owners name or employees block steps - START
    @And("I set the please provide the principal beneficial owners name or employees {int} first name to {string}")
    public void setNameOrEmployeesFirstName(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setNameOrEmployeesFirstName(value, index);
    }

    @And("I set the please provide the principal beneficial owners name or employees {int} last name to {string}")
    public void setNameOrEmployeesLastName(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setNameOrEmployeesLastName(value, index);
    }

    @And("I set the please provide the principal beneficial owners name or employees {int} DOB to {string}")
    public void setNameOrEmployeesDOB(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setNameOrEmployeesDOB(value, index);
    }

    @And("I set the please provide the principal beneficial owners name or employees {int} type to {string}")
    public void setNameOrEmployeesType(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setNameOrEmployeesType(value, index);
    }

    @And("I set the please provide the principal beneficial owners name or employees {int} relationship to named insured to {string}")
    public void setNameOrEmployeesRelationshipToNamedInsured(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setRelationshipToNamedInsured(value, index);
    }

    @And("I set the please provide the principal beneficial owners relationship to {int} named insured to {string}")
    public void setRelationshipToNamedInsured(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setRelationshipToNamedInsured(value, index);
    }

    @And("I set the please provide the principal beneficial owners name or employees {int} occupation to {string}")
    public void setNameOrEmployeesOccupation(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setNameOrEmployeesOccupation(value, index);
    }

    @And("I set the please provide additional details what is the intent or purpose of the entity to {string}")
    public void setWhatIsTheIntentOrPurposeOfTheEntity(String value) {
        new PleaseProvideAdditionalDetailsBlock(driver).setWhatIsTheIntentOrPurposeOfTheEntity(value);
    }

    @And("I set the please provide additional details does the entity generate income or conduct business to {string}")
    public void setDoesTheEntityGenerateIncomeOrConductBusiness(String value) throws Throwable {
        new PleaseProvideAdditionalDetailsBlock(driver).setDoesTheEntityGenerateIncomeOrConductBusiness(value);
    }

    @And("I set the please provide additional details does the entity generate income or conduct business please provide details to {string}")
    public void setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(String value) throws InterruptedException {
        new PleaseProvideAdditionalDetailsBlock(driver).setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails("Yes", value);
    }

    @And("I set the please provide additional details does the entity generate income in any other ways to {string}")
    public void setDoesTheEntityGenerateIncomeInAnyOtherWays(String value) throws Throwable {
        new PleaseProvideAdditionalDetailsBlock(driver).setDoesTheEntityGenerateIncomeInAnyOtherWays(value);
    }

    @And("I set the please provide additional details does the entity generate income in any other ways please provide details to {string}")
    public void setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(String value) throws InterruptedException {
        new PleaseProvideAdditionalDetailsBlock(driver).setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails("Yes", value);
    }

    @And("I set the please provide additional details does the entity own any other real estate vehicles watercraft or other tangible assets to {string}")
    public void setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(String value) throws Throwable {
        new PleaseProvideAdditionalDetailsBlock(driver).setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(value);
    }

    @And("I set the please provide additional details does the entity own any other real estate vehicles watercraft or other tangible assets please provide details to {string}")
    public void setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(String value) throws InterruptedException {
        new PleaseProvideAdditionalDetailsBlock(driver).setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails("Yes", value);
    }
    //Please provide the principal beneficial owners name or employees block steps - END

    //Trust llc other legal entity policy information block steps - START
    @And("I set the policy information does the entity maintain any other insurance policies to {string}")
    public void setDoesTheEntityMaintainAnyOtherInsurancePolicies(String value) throws Throwable {
        new TrustLlcOtherLegalEntityPolicyInformationBlock(driver).setDoesTheEntityMaintainAnyOtherInsurancePolicies(value);
    }

    @And("I click update LLC button")
    public void iClickUpdateLLCButton() {
        new TrustLlcOtherLegalEntityPolicyInformationBlock(driver).clickUpdate();
    }
    //Trust llc other legal entity policy information block steps - END

    //Please provide the principal beneficial owners name or employees block steps - START
    @And("I click add principal beneficial owner button")
    public void iClickAddPrincipalBeneficialOwnerButton() throws InterruptedException {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).clickAdd();
    }
    //Please provide the principal beneficial owners name or employees block steps - END

    @And("I click add another legal entity inside legal entity beneficial owner block")
    public void iClickAddLegalEntity() {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).clickAddEntity();
    }

    @And("I set legal entity {int} name to {string} inside legal entity beneficial owner block")
    public void iSetLegalEntityName(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setLegalEntityName(value, index);
    }

    @And("I set legal entity {int} address line 1 to {string} inside legal entity beneficial owner block")
    public void iSetLegalEntityAddressLine1(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setLegalEntityAddressLine1(value, index);
    }

    @And("I set legal entity {int} address line 2 to {string} inside legal entity beneficial owner block")
    public void iSetLegalEntityAddressLine2(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setLegalEntityAddressLine2(value, index);
    }

    @And("I set legal entity {int} city to {string} inside legal entity beneficial owner block")
    public void iSetLegalEntityCity(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setLegalEntityCity(value, index);
    }

    @And("I set legal entity {int} state to {string} inside legal entity beneficial owner block")
    public void iSetLegalEntityState(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setLegalEntityState(value, index);
    }

    @And("I set legal entity {int} zip to {string} inside legal entity beneficial owner block")
    public void iSetLegalEntityZIP(int index, String value) {
        new PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock(driver).setLegalEntityZIP(value, index);
    }

    @Then("I fill out the Trust LLC other legal entity page for PF LOB")
    public void iFillOutTheTrustLLCOtherLegalEntityPageForPFLOB() throws Throwable {
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPagePF(data);
    }
}