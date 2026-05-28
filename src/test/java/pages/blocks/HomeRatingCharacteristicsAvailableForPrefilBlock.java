package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class HomeRatingCharacteristicsAvailableForPrefilBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public HomeRatingCharacteristicsAvailableForPrefilBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'information shown above prefilled')]/../../../../div//label[text()='Yes']/..//input")
    WebElement prefillYes;
    @FindBy(xpath = "//div[contains(text(),'information shown above prefilled')]/../../../../div//label[text()='No']/..//input")
    WebElement prefillNo;

    public void setAvailableForPrefill(Map<String, String> data) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'information shown above prefilled')]/../../../../div//label[text()='Yes']/..//input")))
            choose(prefillYes, prefillNo, data.get("Prefill"));
    }

    public void setAvailableForPrefill(Map<String, String> data, int i) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'information shown above prefilled')]/../../../../div//label[text()='Yes']/..//input")))
            choose(prefillYes, prefillNo, data.get("Prefill_" + i));
    }
}