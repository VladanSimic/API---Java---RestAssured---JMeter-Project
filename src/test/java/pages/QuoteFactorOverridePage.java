package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class QuoteFactorOverridePage extends CommonComponentsAndActions {
    WebDriver driver;

    public QuoteFactorOverridePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void overrideAll() {
        clickElement(overrideAll, "Override All");
    }

    public void processOverride() {
        clickElement(processOverride, "Process Override");
    }

}