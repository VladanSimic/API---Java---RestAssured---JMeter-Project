package pages;

import excel.DataManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.PolicyDeliveryOptionsBlock;
import pages.blocks.PrintAndMailDeliveryPreferenceBlock;

public class PolicyDeliveryPage extends CommonComponentsAndActions {
    WebDriver driver;
    PolicyDeliveryOptionsBlock policyDeliveryOptionsBlock;
    PrintAndMailDeliveryPreferenceBlock printAndMailDeliveryPreferenceBlock;

    public PolicyDeliveryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        policyDeliveryOptionsBlock = new PolicyDeliveryOptionsBlock(driver);
        printAndMailDeliveryPreferenceBlock = new PrintAndMailDeliveryPreferenceBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillPolicyDeliveryOptions(String OptOutOfDelivery, String DeliveryOptions) throws Throwable {
        policyDeliveryOptionsBlock.optOutElectronicDelivery(OptOutOfDelivery);
        policyDeliveryOptionsBlock.howToDeliverDocs(DeliveryOptions);
        //if(OptOutOfDelivery.equalsIgnoreCase("No")) {
            policyDeliveryOptionsBlock.newBusinessDelivery("No");
        //}
    }

    public void fillPrintAndDeliveryOptions() throws Throwable {
        printAndMailDeliveryPreferenceBlock.fillPrintAndDeliveryOptions();
    }

    public void fillPolicyDelivery(String optOutOfDelivery, String deliveryOptions) throws Throwable {
        fillPolicyDeliveryOptions(optOutOfDelivery, deliveryOptions);
        fillPrintAndDeliveryOptions();
    }

}