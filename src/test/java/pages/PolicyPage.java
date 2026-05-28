package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class PolicyPage extends CommonComponentsAndActions {

    WebDriver driver;

    PolicyInformationBlock policyInformationBlock;
    CreditScoreTiersBlock creditScoreTiersBlock;
    InsuranceInformationBlock insuranceInformationBlock;
    NamedInsuredBlock nameInsuredBlock;
    RiskAddressesBlock riskAddressesBlock;
    LiabilityCoveragesBlock liabilityCoveragesBlock;
    UnderwritingCompanyBlock underwritingCompanyBlock;
    GeneralInformationBlock generalInformationBlock;
    ProjectTypeBlock projectTypeBlock;
    PrimaryLocationBlock primaryLocationBlock;
    PrimaryFloodCoverageBlock primaryFloodCoverageBlock;
    ConstructionDetailsBlock constructionDetailsBlock;
    FloodInformationBlock floodInformationBlock;

    public PolicyPage(WebDriver driver) {
        super(driver);
        this.driver = driver;

        policyInformationBlock = new PolicyInformationBlock(driver);
        insuranceInformationBlock = new InsuranceInformationBlock(driver);
        creditScoreTiersBlock = new CreditScoreTiersBlock(driver);
        nameInsuredBlock = new NamedInsuredBlock(driver);
        riskAddressesBlock = new RiskAddressesBlock(driver);
        liabilityCoveragesBlock = new LiabilityCoveragesBlock(driver);
        underwritingCompanyBlock = new UnderwritingCompanyBlock(driver);
        generalInformationBlock = new GeneralInformationBlock(driver);
        projectTypeBlock = new ProjectTypeBlock(driver);
        primaryLocationBlock = new PrimaryLocationBlock(driver);
        primaryFloodCoverageBlock = new PrimaryFloodCoverageBlock(driver);
        constructionDetailsBlock = new ConstructionDetailsBlock(driver);
        floodInformationBlock = new FloodInformationBlock(driver);

        PageFactory.initElements(driver, this);
    }

    public void fillPolicyPageHS(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHS(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHS(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsHS(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHS(data);
        nameInsuredBlock.fillNamedInsuredDetailsHS(data);
        riskAddressesBlock.fillRiskAddressDetailsHS(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimitHS(data);
        saveChanges();
    }

    public void fillPolicyPageHS_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHS_END(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHS_END(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsHS_END(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHS_END(data);
        nameInsuredBlock.fillNamedInsuredDetailsHS_END(data);
        riskAddressesBlock.fillRiskAddressDetailsHS_END(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimitHS_END(data);
        saveChanges();
    }

    public void fillPolicyPageHS_OOS_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHS_OOS_END(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHS_OOS_END(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsHS_OOS_END(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHS_OOS_END(data);
        nameInsuredBlock.fillNamedInsuredDetailsHS_OOS_END(data);
        riskAddressesBlock.fillRiskAddressDetailsHS_OOS_END(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimitHS_OOS_END(data);
        saveChanges();
    }

    public void fillPolicyPageHS_RNW(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHS_RNW(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHS_RNW(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsHS_RNW(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHS_RNW(data);
        nameInsuredBlock.fillNamedInsuredDetailsHS_RNW(data);
        riskAddressesBlock.fillRiskAddressDetailsHS_RNW(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimitHS_RNW(data);
        saveChanges();
    }

    public void fillPolicyPageES(Map<String, String> data) throws Throwable {
        goToPage("Excess Liability Policy");
        pause(3000);
        insuranceInformationBlock.fillInsuranceInformationDetailsES(data);
        policyInformationBlock.fillPolicyInformationDetailsES(data);
        primaryLocationBlock.fillPrimaryLocationDetails(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsES(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsES(data);
    }

    public void fillPolicyPageCC(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsCC(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsCC(data);
        creditScoreTiersBlock.fillCreditScoreTiersBlock(data);
        nameInsuredBlock.fillNamedInsuredDetailsCC(data);
        projectTypeBlock.fillProjectTypeDetailsCC(data);
        saveChanges();
        pause(5000);
    }

    public void fillPolicyPageCC_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsCC_END(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsCC_END(data);
        creditScoreTiersBlock.fillCreditScoreTiersBlock_END(data);
        nameInsuredBlock.fillNamedInsuredDetailsCC_END(data);
        projectTypeBlock.fillProjectTypeDetailsCC_END(data);
    }

    public void fillPolicyPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillPolicyPageFS(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsFS(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsFS(data);
        underwritingCompanyBlock.fillUnderwritingCompanyDetailsFS(data);
        nameInsuredBlock.fillNamedInsuredDetailsFS(data);
//        riskAddressesBlock.fillRiskAddressDetailsFS(data);
        primaryFloodCoverageBlock.fillPrimaryFloodCoverageDetailsFS(data);
//        constructionDetailsBlock.fillBasicConstructionDetailsFS(data);
//        floodInformationBlock.fillFloodInformationDetailsFS(data);
        saveChanges();
    }
    public String saveTransactionPremium(String transaction, int index) {
        String xpath = String.format("//*[text()='%s']/../../..//td[12]", transaction);

        List<WebElement> premiums = driver.findElements(By.xpath(xpath));

        if (premiums.isEmpty()) {
            failAssertion("No matching transactions found for: " + transaction);
            return "";
        }

        if (index < 0 || index >= premiums.size()) {
            failAssertion("Invalid index: " + index + ". Found " + premiums.size() + " matching transactions.");
            return "";
        }

        return premiums.get(index).getText().trim();
    }

    public String saveTransactionTotalPremium(String transaction, int index) {
        String xpath = String.format("//*[text()='%s']/../../..//td[16]", transaction);
        List<WebElement> premiums = driver.findElements(By.xpath(xpath));

        if (premiums.isEmpty()) {
            failAssertion("No matching transactions found for: " + transaction);
            return "";
        }

        if (index < 0 || index >= premiums.size()) {
            failAssertion("Invalid index: " + index + ". Found " + premiums.size() + " matching transactions.");
            return "";
        }

        return premiums.get(index).getText().trim();
    }

    public void verifyTransactionStatus(String transaction, String expectedStatus, int index) {
        String xpath = String.format("//*[text()='%s']/../../..//td[17]", transaction);

        List<WebElement> statusElements = driver.findElements(By.xpath(xpath));

        if (statusElements.isEmpty()) {
            failAssertion("No matching transactions found for: " + transaction);
            return;
        }

        if (index < 0 || index >= statusElements.size()) {
            failAssertion("Invalid index: " + index + ". Found " + statusElements.size() + " matching transactions.");
            return;
        }

        WebElement statusElement = statusElements.get(index);
        String actualStatus = statusElement.getText().trim();

        String message = String.format("Transaction: %s | Expected: %s | Actual: %s",
                transaction, expectedStatus, actualStatus);

        if (actualStatus.equalsIgnoreCase(expectedStatus)) {
            reportScreenshot("Status_" + index, "Status matched: " + message);
            successLog("Status matched: " + message);
        } else {
            reportScreenshot("Status_" + index, "Status mismatch: " + message);
            failAssertion("Status mismatch: " + message);
        }
    }

}