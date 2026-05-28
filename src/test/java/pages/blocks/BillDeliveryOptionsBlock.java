package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class BillDeliveryOptionsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public BillDeliveryOptionsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[contains(text(),'Send Bill to Member')]/..//input")
    WebElement sendBillToMember;

    public void sendBillToMember() throws Throwable {
        clickElement(sendBillToMember);
    }

}