package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.GeneralContractorPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class GeneralContractorPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the general contractor page for CC line of business")
    public void iFillOutGeneralContractorPageForCC() throws Throwable {
        new GeneralContractorPage(driver).fillGeneralContractorPageCC(data);
    }

    @And("I fill out the general contractor information block for CC line of business")
    public void iFillProjectAddressCC() throws Throwable {
        new GeneralContractorInformationBlock(driver).fillGeneralContractorInformationDetailsCC(data);
    }

    @And("I fill out the underwriting only block for CC line of business")
    public void fillUnderwritingOnlyDetailsCC() throws Throwable {
        new UnderwritingOnlyBlock(driver).fillUnderwritingOnlyDetailsCC(data);
    }

    @And("I fill out the general contractors limits of insurance block for CC line of business")
    public void fillGeneralContractorsLimitsOfInsuranceDetailsCC() throws Throwable {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).fillGeneralContractorsLimitsOfInsuranceDetailsCC(data);
    }

    @And("I fill out the subcontractors limits of insurance block for CC line of business")
    public void fillSubcontractorsLimitsInsuranceDetailsCC() throws Throwable {
        new SubcontractorsLimitsOfInsuranceBlock(driver).fillSubcontractorsLimitsInsuranceDetailsCC(data);
    }

    @And("I fill out the general contractor liability coverage block for CC line of business")
    public void fillGeneralContractorLiabilityCoverageDetailsCC() throws Throwable {
        new GeneralContractorLiabilityCoverageBlock(driver).fillGeneralContractorLiabilityCoverageDetailsCC(data);
    }

    @And("I fill out the loss history block for CC line of business")
    public void fillLossHistoryDetailsCC() throws Throwable {
        new LossHistoryBlock(driver).fillLossHistoryDetailsCC(data);
    }

    @And("I fill out the general contractor prior loss history Block for CC line of business")
    public void fillGeneralContractorPriorLossHistoryDetailsCC() throws Throwable {
        new GeneralContractorPriorLossHistoryBlock(driver).fillGeneralContractorPriorLossHistoryDetailsCC(data);
    }

    @And("I set the company name to {string}")
    public void setCompanyName(String name) {
        new GeneralContractorInformationBlock(driver).setCompanyName(name);
    }

    @And("I set the business address line 1 to {string}")
    public void setBusinessAddressLine1(String line1) {
        new GeneralContractorInformationBlock(driver).setBusinessAddressLine1(line1);
    }

    @And("I set the business address line 2 to {string}")
    public void setBusinessAddressLine2(String line2) {
        new GeneralContractorInformationBlock(driver).setBusinessAddressLine2(line2);
    }

    @And("I set the general contractor information city to {string}")
    public void setCity(String city) {
        new GeneralContractorInformationBlock(driver).setCity(city);
    }

    @And("I set the general contractor information zip to {string}")
    public void setZip(String zip) {
        new GeneralContractorInformationBlock(driver).setZip(zip);
    }

    @And("I set the company website to {string}")
    public void setCompanyWebsite(String website) {
        new GeneralContractorInformationBlock(driver).setCompanyWebsite(website);
    }

    @And("I set the general contractor information state to {string}")
    public void setState(String state) {
        new GeneralContractorInformationBlock(driver).setState(state);
    }

    @And("I set the primary phone to {string}")
    public void setPrimaryPhone(String phone) {
        new GeneralContractorInformationBlock(driver).setPrimaryPhone(phone);
    }

    @And("I set the date GC company was established incorporated to {string}")
    public void setDateGCCompanyWasEstablishedIncorporated(String incorporated) {
        new GeneralContractorInformationBlock(driver).setDateGCCompanyWasEstablishedIncorporated(incorporated);
    }

    @And("I set the general contractor license to {string}")
    public void setGeneralContractorLicense(String license) {
        new GeneralContractorInformationBlock(driver).setGeneralContractorLicense(license);
    }

    @And("I set the FEIN to {string}")
    public void setFEIN(String FEIN) {
        new GeneralContractorInformationBlock(driver).setFEIN(FEIN);
    }

    @And("I set the is the general contractor approved to {string}")
    public void setIsTheGeneralContractorApproved(String approved) {
        new UnderwritingOnlyBlock(driver).setIsTheGeneralContractorApproved(approved);
    }

    @And("I set the comments to {string}")
    public void setComments(String comments) {
        new UnderwritingOnlyBlock(driver).setComments(comments);
    }

    @And("I set the GC project size authority to {string}")
    public void setGCProjectSizeAuthority(String authority) {
        new UnderwritingOnlyBlock(driver).setGCProjectSizeAuthority(authority);
    }

    @And("I set the PURE preferred contractor to {string}")
    public void setPUREPreferredContractor(String contractor) {
        new UnderwritingOnlyBlock(driver).setPUREPreferredContractor(contractor);
    }

    @And("I set the CGL limits per occurrence to {string}")
    public void setCGLLimitsPerOccurrence(String occurrence) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setCGLLimitsPerOccurrence(occurrence);
    }

    @And("I set the CGL limits aggregate to {string}")
    public void setCGLLimitsAggregate(String aggregate) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setCGLLimitsAggregate(aggregate);
    }

    @And("I set the CGL limits expiration date to {string}")
    public void setCGLLimitsExpirationDate(String expirationDate) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setCGLLimitsExpirationDate(expirationDate);
    }

    @And("I set the excess limits per occurrence to {string}")
    public void setExcessLimitsPerOccurrence(String occurrence) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setExcessLimitsPerOccurrence(occurrence);
    }

    @And("I set the excess limits aggregate to {string}")
    public void setExcessLimitsAggregate(String aggregate) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setExcessLimitsAggregate(aggregate);
    }

    @And("I set the excess limits expiration date to {string}")
    public void setExcessLimitsExpirationDate(String expirationDate) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setExcessLimitsExpirationDate(expirationDate);
    }

    @And("I set the combined per occurrence limit to {string}")
    public void setCombinedPerOccurrenceLimit(String limit) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setCombinedPerOccurrenceLimit(limit);
    }

    @And("I set the is workers compensation coverage provided to employees to {string}")
    public void setIsWorkersCompensationCoverageProvidedToEmployees(String employees) throws Throwable {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setIsWorkersCompensationCoverageProvidedToEmployees(employees);
    }

    @And("I set the COI expiration date to {string}")
    public void setCOIExpirationDate(String received) {
        new GeneralContractorsLimitsOfInsuranceBlock(driver).setCOIExpirationDate(received);
    }

    @And("I set the does the company require all subcontractors to {string}")
    public void setDoesTheCompanyRequireAllSubcontractors(String allSubcontractors) throws Throwable {
        new SubcontractorsLimitsOfInsuranceBlock(driver).setDoesTheCompanyRequireAllSubcontractors(allSubcontractors);
    }

    @And("I set the does the company require the subcontractors to submit to {string}")
    public void setDoesTheCompanyRequireTheSubcontractorsToSubmit(String submit) throws Throwable {
        new SubcontractorsLimitsOfInsuranceBlock(driver).setDoesTheCompanyRequireTheSubcontractorsToSubmit(submit);
    }

    @And("I set the is the general contractor liability coverage to {string}")
    public void setIsTheGeneralContractorLiabilityCoverage(String coverage) throws Throwable {
        new GeneralContractorLiabilityCoverageBlock(driver).setIsTheGeneralContractorLiabilityCoverage(coverage);
    }

    @And("I set the manager override to {string}")
    public void setManagerOverride(String override) throws Throwable {
        new GeneralContractorLiabilityCoverageBlock(driver).setManagerOverride(override);
    }

    @And("I set the loss or claim to {string}")
    public void setLossOrClaim(String claim) throws Throwable {
        new LossHistoryBlock(driver).setLossOrClaim(claim);
    }

}