package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.BillDeliveryOptionsBlock;
import pages.utils.CommonComponentsAndActions;

public class BillingPreferancePage extends CommonComponentsAndActions {
    WebDriver driver;
    BillDeliveryOptionsBlock billDeliveryOptionsBlock;

    public BillingPreferancePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        billDeliveryOptionsBlock = new BillDeliveryOptionsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void sendBillToMember() throws Throwable {
        billDeliveryOptionsBlock.sendBillToMember();
    }

}