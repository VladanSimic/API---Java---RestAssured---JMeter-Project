package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class PolicyDeliveryOptionsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public PolicyDeliveryOptionsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'opt out')]/../../../../div[1]//label[text()='No']/..//input")
    public WebElement optOutNo;
    @FindBy(xpath = "//div[contains(text(),'opt out')]/../../../../div[1]//label[text()='Yes']/..//input")
    public WebElement optOutYes;
    @FindBy(xpath = "//label[contains(text(),'Print and Mail by PURE')]/..//input")
    public WebElement printByPure;
    @FindBy(xpath = "//label[contains(text(),'Agency Email delivery (New Business only).')]/..//input")
    public WebElement agencyDelivery;
    @FindBy(xpath = "//div[contains(text(),'involved in new business delivery')]/../../../../div[1]//label[text()='No']/..//input")
    public WebElement newBusinessDeliveryNo;

    public void optOutElectronicDelivery(String optOut) throws Throwable {
        if (optOut.equalsIgnoreCase("Yes")) {
            pause(2000);
            if (optOutYes.isEnabled()) {
                clickElement(optOutYes);
            }
        } else {
            if (optOutNo.isEnabled()) {
                clickElement(optOutNo);
            }
        }
    }

    public void howToDeliverDocs(String deliveryOption) throws Throwable {
        if (deliveryOption.equalsIgnoreCase("PrintByPure")) {
            /*try {
                clickElement(printByPure);
            } catch (Exception e) {
                //
            }*/
            if(isElementDisplayed(printByPure, 5)){
                clickElement(printByPure);
            }
        } else {
            try {
                clickElement(agencyDelivery);
            } catch (Exception e) {
                //
            }
        }
    }

    public void newBusinessDelivery(String yesOrNo) throws Throwable {
        pause(3000);
        if (yesOrNo.equalsIgnoreCase("No")) {
            try {
                if (newBusinessDeliveryNo.isDisplayed()) {
                    clickElement(newBusinessDeliveryNo);
                } else {
                    //
                }
            } catch (Exception e) {
                //
            }
        } else {
            clickElement(agencyDelivery);
        }
    }
}