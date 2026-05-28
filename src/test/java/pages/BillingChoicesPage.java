package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class BillingChoicesPage extends CommonComponentsAndActions {
    WebDriver driver;

    public BillingChoicesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@osviewid='PAI_501006_OT_440_OI_1_BI_727507_CI_9744407' and @role='textbox']")
    WebElement total;


    public String retrieveGrandTotal() {
        if (total == null || total.getText() == null) {
            return "null";
        }
        return total.getText().trim();
    }

}