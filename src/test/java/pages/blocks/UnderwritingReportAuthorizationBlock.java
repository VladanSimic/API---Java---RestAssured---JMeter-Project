package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class UnderwritingReportAuthorizationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public UnderwritingReportAuthorizationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'No disclosure')]/../../../../div//label[text()='No']/../span/input")
    WebElement disclosureRequiredNo;
    @FindBy(xpath = "//div[contains(text(),'No disclosure')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement disclosureRequiredYes;
    @FindBy(xpath = "//div[contains(text(),'Have you disclosed')]/../../../../div//label[text()='No disclosure has been made.']/../span/input")
    WebElement disclosureMadeToClientNo;
    @FindBy(xpath = "//div[contains(text(),'Have you disclosed')]/../../../../div//label[text()='Yes, a disclosure has been made.']/../span/input")
    WebElement disclosureMadeToClientYes;

    public void fillOutUnderwritingReportAuthorizationDetails(Map<String, String> data) throws Throwable {
        setIsDisclosureRequiredAndHasBeenMade(data.get("Disclosure_Required"), data.get("Disclosure_Made"));
    }

    public void setIsDisclosureRequiredAndHasBeenMade(String isDisclosureRequired, String hasDisclosureBeenMade) throws Throwable {
        if (hasValue(isDisclosureRequired) && isDisclosureRequired.equalsIgnoreCase("Yes")) {
            clickElement(disclosureRequiredYes, "Disclosure required Yes");
        } else if (hasValue(hasDisclosureBeenMade) && hasDisclosureBeenMade.equalsIgnoreCase("Yes")) {
            clickElement(disclosureRequiredNo, "Disclosure required No");
            clickElement(disclosureMadeToClientYes, "Disclosure made Yes");
        } else {
            clickElement(disclosureRequiredNo, "Disclosure required No");
            clickElement(disclosureMadeToClientNo, "Disclosure made Yes");
        }
    }

    public void setHasDisclosureOfConsumerReportsBeenMadeToYes() throws InterruptedException {
        pause(2000);
        clickElement(disclosureMadeToClientYes, "Disclosure reports made Yes");
    }

}