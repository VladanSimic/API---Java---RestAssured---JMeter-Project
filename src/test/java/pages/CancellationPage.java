package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.ApplicationMandatoryFormsBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class CancellationPage extends CommonComponentsAndActions {
    WebDriver driver;

    public CancellationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Cancellation Method']/../../../..//input")
    WebElement cancellationMethod;
    @FindBy(xpath = "//div[text()='Cancellation Reason']/../../../..//input")
    WebElement cancellationReason;

    public void setCancellationMethod(String s) {
        typeTextEnter(cancellationMethod, s, "Cancellation method");
    }

    public void setCancellationReason(String s) {
        typeTextEnter(cancellationReason, s, "Cancellation reason");
    }

}