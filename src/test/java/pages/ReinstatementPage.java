package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class ReinstatementPage extends CommonComponentsAndActions {
    WebDriver driver;

    public ReinstatementPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Claims/Losses post cancellation?']/../../../..//input")
    WebElement claimsLossesPostCancellation;
    @FindBy(xpath = "//div[text()='Reinstatement Reason']/../../../..//input")
    WebElement reinstatementReason;

    public void setClaimsLossesPostCancellation(String s) {
        typeTextEnter(claimsLossesPostCancellation, s, "Claims Losses Post Cancellation");
    }

    public void setReinstatementReason(String s) {
        typeTextEnter(reinstatementReason, s, "Reinstatement Reason");
    }

}