package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Map;

public class HomeUnderlyingPolicyBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public HomeUnderlyingPolicyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@osviewid='PAI_503706_OT_2477933_OI_1_BI_2035633_CI_20319333']")
    WebElement carrierName;
    @FindBy(xpath = "//div[@osviewid='PAI_503706_OT_2477933_OI_1_BI_2035633_CI_20318933']")
    WebElement effectiveDate;
    @FindBy(xpath = "//div[@osviewid='PAI_503706_OT_2477933_OI_1_BI_2035633_CI_20319133']")
    WebElement expirationDate;


    public void fillHomeUnderlyingPolicyBlock(Map<String,String> data) throws Throwable {
        pause(3000);
        setCarrierName();
        setEffectiveDate(data.get("Effective_Date"));
        setExpirationDate(data.get("Expiration_Date"));
    }

    public void setCarrierName() throws Throwable {
        pause(3000);
        clickElement(carrierName);
        typeText(driver.switchTo().activeElement(), "Automation");
        pause(500);
    }

    public void setEffectiveDate(String value) throws Throwable {
        clickElement(effectiveDate);
        typeText(driver.switchTo().activeElement(), value);
        pause(500);
    }

    public void setExpirationDate(String value) throws Throwable {
        ZoneId z = ZoneId.of("America/Montreal");
        LocalDate oneMonthLater = LocalDate.now(z).plusMonths(1);
        clickElement(expirationDate);
        typeText(driver.switchTo().activeElement(), oneMonthLater.toString(), value);
        pause(500);
    }
}
