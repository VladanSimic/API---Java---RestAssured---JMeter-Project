package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.blocks.AllPoliciesBlock;
import pages.blocks.AllQuotesBlock;
import pages.blocks.QuotesBlock;
import pages.utils.CommonComponentsAndActions;

import java.time.Duration;

public class CustomerAccountSummaryPage extends CommonComponentsAndActions {

    public CustomerAccountSummaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Include in Overall Home Location Grade']/../../../../../../../../..//td//span[text()='include']")
    public WebElement accountGradeSummaryIncludeBtn;
    @FindBy(xpath = "//span[text()='Include in Overall Home Location Grade']/../../../../../../../../..//td//span[text()='include']")
    public WebElement accountGradeSummaryExcludeBtn;
    @FindBy(xpath = "//span[text()='Run Overall Home Location Grade']")
    public WebElement accountGradeSummaryRunOverallHomeGrade;
    @FindBy(xpath = "//div[contains(text(),'Home Model V3')]/../../../../../..//tr[@role='row']//td[5]//div")
    public WebElement accountGradeSummaryHomeV3AggregationScore;
    @FindBy(xpath = "//div[contains(text(),'Home Model V3')]/../../../../../..//tr[@role='row']//td[6]//div")
    public WebElement accountGradeSummaryHomeV3NonCATGrade;
    @FindBy(xpath = "//div[contains(text(),'Home Model V3')]/../../../../../..//tr[@role='row']//td[7]//div")
    public WebElement accountGradeSummaryHomeV3CATScore;



    public void iOrderHomeAnalyticsGrade() throws Throwable {
        clickInclude();
        clickRunHomeGrade();
    }

    public void clickInclude() {
        clickElement(accountGradeSummaryIncludeBtn, "include");
    }

    public void clickExclude() {
        clickElement(accountGradeSummaryExcludeBtn, "exclude");
    }

    public void clickRunHomeGrade() throws Throwable {
        clickElement(accountGradeSummaryRunOverallHomeGrade, "Run Overall Home Grade");
        pause(2000);
    }

    public String getHomeV3ModelAggregationScore() {
        return accountGradeSummaryHomeV3AggregationScore.getText();
    }

    public String getHomeV3ModelNonCATGrade() {
        return accountGradeSummaryHomeV3NonCATGrade.getText();
    }

    public String getHomeV3ModelCATScore() {
        return accountGradeSummaryHomeV3CATScore.getText();
    }

    public void verifyV3ModelAggregationScore(String value) {
        assertEquals(getHomeV3ModelAggregationScore(), value, "Home V3 Model - Aggregation Score");
    }

    public void verifyV3ModelNonCATGrade(String value) {
        assertEquals(getHomeV3ModelNonCATGrade(), value, "Home V3 Model - Non CAT Grade");
    }

    public void verifyV3ModelCATScore(String value) {
        assertEquals(getHomeV3ModelCATScore(), value, "Home V3 Model - CAT Score");
    }

    public void clickOnPolicyByIDOnCustomerSummaryPage(String policyID) {
        scrollToWebElement(driver.findElement(By.xpath(genericSpan.replace("$$", policyID))));
        clickElement(driver.findElement(By.xpath(genericSpan.replace("$$", policyID))), "Clicked " + policyID);
    }

}