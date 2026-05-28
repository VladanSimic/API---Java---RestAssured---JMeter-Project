package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class LiabilityCoveragesBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public LiabilityCoveragesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Personal Liability Limit']/../../../..//input")
    WebElement liabilityCoverageLimit;
    @FindBy(xpath = "//div[text()='Medical Payments Limit']/../../../..//input")
    WebElement liabilityCoverageLimit2;

    public void selectLiabilityCoveragesLimit(Map<String, String> data) throws Throwable {
        verifyBlockExists("liability coverages");
        typeTextEnter(liabilityCoverageLimit, data.get("Personal_Liability_Limit"), "Personal Liability Limit");
        saveChanges();
    }

    public void selectLiabilityCoveragesLimit_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("liability coverages");
        typeTextEnter(liabilityCoverageLimit, data.get("Personal_Liability_Limit_END"), "Personal Liability Limit");
        saveChanges();
    }

    public void selectLiabilityCoveragesLimit_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("liability coverages");
        typeTextEnter(liabilityCoverageLimit, data.get("Personal_Liability_Limit_OOS_END"), "Personal Liability Limit");
        saveChanges();
    }

    public void selectLiabilityCoveragesLimit_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("liability coverages");
        typeTextEnter(liabilityCoverageLimit, data.get("Personal_Liability_Limit_RNW"), "Personal Liability Limit");
        saveChanges();
    }

    public void medicalPaymentLimit(String value) throws Throwable {
        typeText(liabilityCoverageLimit2, value);
    }

    public void selectLiabilityCoveragesLimitHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("liability coverages");
        typeText(liabilityCoverageLimit, data.get("Liability_Coverages_Personal_Liability_Limit"), "Personal Liability Limit");
        saveChanges();
    }

    public void selectLiabilityCoveragesLimitHS_END(Map<String, String> data) throws Throwable {
        typeText(liabilityCoverageLimit, data.get("Liability_Coverages_Personal_Liability_Limit_END"), "Personal Liability Limit_END");
        saveChanges();
    }

    public void selectLiabilityCoveragesLimitHS_OOS_END(Map<String, String> data) throws Throwable {
        typeText(liabilityCoverageLimit, data.get("Liability_Coverages_Personal_Liability_Limit_OOS_END"), "Personal Liability Limit_OOS_END");
        saveChanges();
    }

    public void selectLiabilityCoveragesLimitHS_RNW(Map<String, String> data) throws Throwable {
        typeText(liabilityCoverageLimit, data.get("Liability_Coverages_Personal_Liability_Limit_RNW"), "Personal Liability Limit_RNW");
        saveChanges();
    }

    public void setPersonalLiabilityLimit(String value) throws Throwable {
        typeTextEnter(liabilityCoverageLimit, value, "Personal Liability Limit");
        clickFooter();
    }

    public void selectLiabilityCoveragesLimitFS(Map<String, String> data) {

    }

}