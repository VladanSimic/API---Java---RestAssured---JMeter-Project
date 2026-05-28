package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class AutomobilePolicyPage extends CommonComponentsAndActions {
    WebDriver driver;
    PolicyInformationBlock policyInformationBlock;
    PrimaryAddressBlock primaryAddressBlock;
    InsuranceInformationBlock insuranceInformationBlock;
    CreditScoreTiersBlock creditScoreTiersBlock;
    AccountLevelCharacteristicsBlock accountLevelCharacteristicsBlock;
    MunicipalityTaxReportBlock municipalityTaxReportBlock;

    public AutomobilePolicyPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        policyInformationBlock = new PolicyInformationBlock(driver);
        primaryAddressBlock = new PrimaryAddressBlock(driver);
        insuranceInformationBlock = new InsuranceInformationBlock(driver);
        creditScoreTiersBlock = new CreditScoreTiersBlock(driver);
        accountLevelCharacteristicsBlock = new AccountLevelCharacteristicsBlock(driver);
        municipalityTaxReportBlock = new MunicipalityTaxReportBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillAutomobilePolicyPagePA(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsPA(data);
        primaryAddressBlock.fillPrimaryAddressDetailsPA(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsPA(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsPA(data);
        accountLevelCharacteristicsBlock.fillAccountLevelCharacteristicsDetailsPA(data);
    }

    public void fillAutomobilePolicyPagePA_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsPA_END(data);
        primaryAddressBlock.fillPrimaryAddressDetailsPA_END(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsPA_END(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsPA_END(data);
        accountLevelCharacteristicsBlock.fillAccountLevelCharacteristicsDetailsPA_END(data);
    }

    public void fillAutomobilePolicyPagePA_OOS_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsPA_OOS_END(data);
        primaryAddressBlock.fillPrimaryAddressDetailsPA_OOS_END(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsPA_OOS_END(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsPA_OOS_END(data);
        accountLevelCharacteristicsBlock.fillAccountLevelCharacteristicsDetailsPA_OOS_END(data);
    }

    public void fillAutomobilePolicyPagePA_RNW(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsPA_RNW(data);
        primaryAddressBlock.fillPrimaryAddressDetailsPA_RNW(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsPA_RNW(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsPA_RNW(data);
        accountLevelCharacteristicsBlock.fillAccountLevelCharacteristicsDetailsPA_RNW(data);
    }

    public void visitAutomobilePolicyPageFillKYTaxReportData() throws Throwable {
        goToPage("Automobile Policy");
        municipalityTaxReportBlock.fillKYTaxReportDummyData("PA");
    }

}