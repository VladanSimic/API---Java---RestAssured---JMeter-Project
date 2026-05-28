package pages;

import excel.DataManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class HomeownersPolicyCoverPage extends CommonComponentsAndActions {

    WebDriver driver;

    AccountsColumnBlock accountsColumnBlock;
    PolicyInformationBlock policyInformationBlock;
    InsuranceInformationBlock insuranceInformationBlock;
    CreditScoreTiersBlock creditScoreTiersBlock;
    NamedInsuredBlock namedInsuredBlock;
    RiskAddressesBlock riskAddressesBlock;
    LiabilityCoveragesBlock liabilityCoveragesBlock;
    PersonalCyberFraudProtectionBlock personalCyberFraudProtectionBlock;
    WorkersCompensationCoverageBlock workersCompensationCoverageBlock;

    public HomeownersPolicyCoverPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        accountsColumnBlock = new AccountsColumnBlock(driver);
        policyInformationBlock = new PolicyInformationBlock(driver);
        insuranceInformationBlock = new InsuranceInformationBlock(driver);
        creditScoreTiersBlock = new CreditScoreTiersBlock(driver);
        namedInsuredBlock = new NamedInsuredBlock(driver);
        riskAddressesBlock = new RiskAddressesBlock(driver);
        liabilityCoveragesBlock = new LiabilityCoveragesBlock(driver);
        personalCyberFraudProtectionBlock = new PersonalCyberFraudProtectionBlock(driver);
        workersCompensationCoverageBlock = new WorkersCompensationCoverageBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillOutHomeownersPolicyCoverPage(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHO(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHO(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHO(data);
        namedInsuredBlock.fillNamedInsuredDetailsHO(data);
        riskAddressesBlock.fillRiskAddressDetails(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimit(data);
        personalCyberFraudProtectionBlock.fillPersonalCyberSecurityAndFraudProtectionHO(data);
        if (data.get("State").equalsIgnoreCase("NJ"))
            workersCompensationCoverageBlock.fillWorkerCoverageDetails(data);
//        if (hasValue(data.get("Customer_ID"))) {
//            clickElement(orderPropertyDetails, "Order property details");
//        }
        pause(5000);
    }

    public void fillOutHomeownersPolicyCoverPage_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHO_END(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHO_END(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHO_END(data);
        namedInsuredBlock.fillNamedInsuredDetailsHO_END(data);
        riskAddressesBlock.fillRiskAddressDetailsHO_END(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimit_END(data);
        personalCyberFraudProtectionBlock.fillPersonalCyberSecurityAndFraudProtectionHO_END(data);
        if (data.get("State").equalsIgnoreCase("NJ"))
            workersCompensationCoverageBlock.fillWorkerCoverageDetails_END(data);
        pause(5000);
    }

    public void fillOutHomeownersPolicyCoverPage_OOS_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHO_OOS_END(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHO_OOS_END(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHO_OOS_END(data);
        namedInsuredBlock.fillNamedInsuredDetailsHO_OOS_END(data);
        riskAddressesBlock.fillRiskAddressDetailsHO_OOS_END(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimit_OOS_END(data);
        personalCyberFraudProtectionBlock.fillPersonalCyberSecurityAndFraudProtectionHO_OOS_END(data);
        if (data.get("State").equalsIgnoreCase("NJ"))
            workersCompensationCoverageBlock.fillWorkerCoverageDetails_OOS_END(data);
        pause(5000);
    }

    public void fillOutHomeownersPolicyCoverPage_RNW(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsHO_RNW(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsHO_RNW(data);
        creditScoreTiersBlock.fillCreditScoreTiersDetailsHO_RNW(data);
        namedInsuredBlock.fillNamedInsuredDetailsHO_RNW(data);
        riskAddressesBlock.fillRiskAddressDetailsHO_RNW(data);
        liabilityCoveragesBlock.selectLiabilityCoveragesLimit_RNW(data);
        personalCyberFraudProtectionBlock.fillPersonalCyberSecurityAndFraudProtectionHO_RNW(data);
        if (data.get("State").equalsIgnoreCase("NJ"))
            workersCompensationCoverageBlock.fillWorkerCoverageDetails_RNW(data);
        pause(5000);
    }

    public void addAdditionalLocations(Map<String, String> data) throws Throwable {
        riskAddressesBlock.addAndFillInNthAddress(data);
    }

    public void addAdditionalLocations_END(Map<String, String> data) throws Throwable {
        riskAddressesBlock.addAndFillInNthAddress_END(data);
    }

    public void addAdditionalLocations_OOS_END(Map<String, String> data) throws Throwable {
        riskAddressesBlock.addAndFillInNthAddress_OOS_END(data);
    }

    public void addAdditionalLocations_RNW(Map<String, String> data) throws Throwable {
        riskAddressesBlock.addAndFillInNthAddress_RNW(data);
    }

    public void addNewLocationAndChangeDataHO(String addressLine1, String city, String state, String zip, String type,
                                              String covAmount, String lossOfUse, String aop, String deductible) throws Throwable {
        //Add new location and assign a last index to it
        riskAddressesBlock.clickAddAddress();
        int assignedIndex = riskAddressesBlock.returnIndexOfLastLocation();
        // Mandatory cell input
        riskAddressesBlock.setAddressLine(addressLine1, assignedIndex);
        riskAddressesBlock.setCity(city, assignedIndex);
        riskAddressesBlock.setState(state, assignedIndex);
        riskAddressesBlock.setZIP(zip.replace("\"", ""), assignedIndex);
        if (!state.equalsIgnoreCase("AZ") && !state.equalsIgnoreCase("NV")) {
            riskAddressesBlock.setResidenceType(type, assignedIndex);
        } else {
            riskAddressesBlock.setPolicyType(type, assignedIndex);
        }
        if (covAmount.contains(";")) {
            riskAddressesBlock.setReplacementCostValue(covAmount.split(";")[0], assignedIndex);
            riskAddressesBlock.setContentsLimit(covAmount.split(";")[1], assignedIndex);
        } else {
            // Replacement Cost cell for HO, Contents for C/C/T
            if (type.equalsIgnoreCase("Homeowner"))
                riskAddressesBlock.setReplacementCostValue(covAmount, assignedIndex);
            else
                riskAddressesBlock.setContentsLimit(covAmount, assignedIndex);
        }

        riskAddressesBlock.setLossOfUseLimit(lossOfUse, assignedIndex);
        // If AOP is entered, somewhere it's not applicable
        if (aop != null) {
            riskAddressesBlock.fillOutAOPDeductibleHO(state, aop, assignedIndex);
            // In case that we trigger hard stop referral, known to happen because of saveChanges() inside AOP method
            if (isElementDisplayed(underwritingAlertsRaisedBlock, 3)) {
                new UnderwritingReferralsPage(driver).approveAndAcceptUWReferralsIfVisible(DataManager.getInstance().getData());
                clickMoreChangesButton();
            }
        }
        // W/H or Hail Deductible method for all states
        if (state.equalsIgnoreCase("AL")) {
            orderPropertyDetails();
            pause(15000);
        }
        if (deductible != null) {
            riskAddressesBlock.fillOutDeductibleHO(state, deductible, assignedIndex);
        }
        clickFooter();
        saveChanges();

        orderPropertyDetails();

        if (deductible != null) {
            riskAddressesBlock.fillOutDeductibleHO(state, deductible, assignedIndex);
        }

        // Slow performance when more locations are available on the policy
        if (assignedIndex > 2)
            pause(5000);
        switchToNewCreatedNode();
        if (state.equalsIgnoreCase("WV")) {
            pause(3000);
            orderPropertyDetails();
        }

        // Setting data in backend for next steps that fill out different nodes
        DataManager.getInstance().setKey("City_Name_Txt", city);
        DataManager.getInstance().setKey("Residence_Type", type);
    }

    public void addNewLocationAndChangeDataHS(String addressLine1, String city, String state, String zip, String type,
                                              String covAmount, String lossOfUse, String aop, String deductible) throws Throwable {
        //Add new location and assign a last index to it
        riskAddressesBlock.clickAddAddress();
        int assignedIndex = riskAddressesBlock.returnIndexOfLastLocation();
        // Mandatory cell input
        riskAddressesBlock.setAddressLine(addressLine1, assignedIndex);
        riskAddressesBlock.setCity(city, assignedIndex);
        riskAddressesBlock.setState(state, assignedIndex);
        riskAddressesBlock.setZIP(zip.replace("\"", ""), assignedIndex);
        if (!state.equalsIgnoreCase("AZ") && !state.equalsIgnoreCase("NV")) {
            riskAddressesBlock.setResidenceType(type, assignedIndex);
        } else {
            riskAddressesBlock.setPolicyType(type, assignedIndex);
        }
        if (covAmount.contains(";")) {
            riskAddressesBlock.setReplacementCostValue(covAmount.split(";")[0], assignedIndex);
            riskAddressesBlock.setContentsLimit(covAmount.split(";")[1], assignedIndex);
        } else {
            // Replacement Cost cell for HO, Contents for C/C/T
            if (type.equalsIgnoreCase("Homeowner"))
                riskAddressesBlock.setReplacementCostValue(covAmount, assignedIndex);
            else
                riskAddressesBlock.setContentsLimit(covAmount, assignedIndex);
        }

        riskAddressesBlock.setLossOfUseLimit(lossOfUse, assignedIndex);
        // If AOP is entered, somewhere it's not applicable
        if (aop != null) {
            riskAddressesBlock.fillOutAOPDeductibleHS(state, aop, assignedIndex);
            // In case that we trigger hard stop referral, known to happen because of saveChanges() inside AOP method
            if (isElementDisplayed(underwritingAlertsRaisedBlock, 3)) {
                new UnderwritingReferralsPage(driver).approveAndAcceptUWReferralsIfVisible(DataManager.getInstance().getData());
                clickMoreChangesButton();
            }
        }
        // W/H or Hail Deductible method for all states
        if (state.equalsIgnoreCase("AL")) {
            orderPropertyDetails();
            pause(15000);
        }
        if (deductible != null) {
            riskAddressesBlock.fillOutDeductibleHS(state, deductible, assignedIndex);
        }
        clickFooter();
        saveChanges();

        orderPropertyDetails();

        // Slow performance when more locations are available on the policy
        if (assignedIndex > 2)
            pause(5000);
        switchToNewCreatedNode();
        if (state.equalsIgnoreCase("WV")) {
            pause(3000);
            orderPropertyDetails();
        }

        // Setting data in backend for next steps that fill out different nodes
        DataManager.getInstance().setKey("City_Name_Txt", city);
        DataManager.getInstance().setKey("Residence_Type", type);
    }
}