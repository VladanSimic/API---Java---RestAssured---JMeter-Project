package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class PolicyBillDeliveryPage extends CommonComponentsAndActions {
    WebDriver driver;
    PolicyDeliveryBlock policyDeliveryBlock;
    MembersPrimaryMailingAddressBlock membersPrimaryMailingAddressBlock;
    MailingAddressDetailsBlock mailingAddressDetailsBlock;
    CurrentBillingDetailsForThisPolicyBlock currentBillingDetailsForThisPolicyBlock;

    public PolicyBillDeliveryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        policyDeliveryBlock = new PolicyDeliveryBlock(driver);
        membersPrimaryMailingAddressBlock = new MembersPrimaryMailingAddressBlock(driver);
        mailingAddressDetailsBlock = new MailingAddressDetailsBlock(driver);
        currentBillingDetailsForThisPolicyBlock = new CurrentBillingDetailsForThisPolicyBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillPolicyBillDeliveryPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Policy/Bill Delivery");
    }

    public void fillPolicyBillDeliveryPagePA(Map<String, String> data) {
        //TODO PA NB - Low
    }

    public void fillPolicyBillDeliveryPagePA_END(Map<String, String> data) {
        //TODO PA END - Low
    }

    public void fillPolicyBillDeliveryPagePA_OOS_END(Map<String, String> data) {
        //TODO PA OOS - Low
    }

    public void fillPolicyBillDeliveryPagePA_RNW(Map<String, String> data) {
        //TODO PA RNW - Low
    }

    public void fillPolicyBillDeliveryPageHO(Map<String, String> data) {
        //TODO
    }

    public void fillPolicyBillDeliveryPageHO_END(Map<String, String> data) {
        //TODO
    }

    public void fillPolicyBillDeliveryPageHO_OOS_END(Map<String, String> data) {
        //TODO
    }

    public void fillPolicyBillDeliveryPageHO_RNW(Map<String, String> data) {
        //TODO
    }
}