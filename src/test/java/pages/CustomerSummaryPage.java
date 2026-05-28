package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.blocks.AllPoliciesBlock;
import pages.blocks.AllQuotesBlock;
import pages.blocks.QuotesBlock;
import pages.utils.CommonComponentsAndActions;

import java.time.Duration;

public class CustomerSummaryPage extends CommonComponentsAndActions {
    WebDriver driver;
    WebDriverWait wdwait;
    AllPoliciesBlock allPoliciesBlock;
    QuotesBlock quotesBlock;
    AllQuotesBlock allQuotesBlock;

    public CustomerSummaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        allPoliciesBlock = new AllPoliciesBlock(driver);
        quotesBlock = new QuotesBlock(driver);
        allQuotesBlock = new AllQuotesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Account ID']/../../../../div/div[contains(@osviewid,'PAI')]")
    public WebElement accountID;
    @FindBy(xpath = "//div[text()='all quotes']/../../../../../../div[2]/div[3]//table//tr//td[1]//span")
    public WebElement quote;
    @FindBy(xpath = "//div[text()='broker quotes']/../../../../../../div[2]/div[2]//table//td[1]//span")
    public WebElement brokerQuote;
    @FindBy(xpath = "//span[contains(text(),'HO')]/../../following-sibling::td[9]//div")
    public WebElement homePolicy;
    @FindBy(xpath = "//span[contains(text(),'Homeowners')]/../../following-sibling::td[8]//div")
    public WebElement homeownersQuote;
    @FindBy(xpath = "//span[contains(text(),'Home Surplus Lines')]/../../following-sibling::td[8]//div")
    public WebElement hsQuote;

    public void navigateToQuote() throws Throwable {
        allQuotesBlock.navigateToQuote();
    }

    public String getPolicyID() throws Throwable {
        return allPoliciesBlock.getPolicyID();
    }

    public String getFSPolicyID() throws Throwable {
        return allPoliciesBlock.getFSPolicyID();
    }

    public String getAccountID() {
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdwait.until(ExpectedConditions.elementToBeClickable(accountID));
        return accountID.getText();
    }

    public void goToPolicy() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@osviewid=\"PAI_118101_OT_24_OI_1_BI_1817833_CI_18728633\"]"))));
        driver.findElement(By.xpath("//div[@osviewid=\"PAI_118101_OT_24_OI_1_BI_1817833_CI_18728633\"]")).click();
    }

    public void openQuote() throws Throwable {
        try {
            clickElement(quote);
        } catch (Exception e) {
            clickElement(brokerQuote);
        }
    }

    public void openPolicy(String policy_id) throws InterruptedException {
        pause(5000);
        clickElement(driver.findElement(By.xpath("//span[text()='" + policy_id + "']")), "Policy: " + policy_id);
    }

    public void verifyThatHomePolicyIsCancelled() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(homePolicy.getText(), "PolicyCancelled", "Policy status");
        commonComponentsAndActions.scrollToWebElement(homePolicy);
        reportScreenshot("PolicyCancelled" + System.currentTimeMillis(), "Home policy is Cancelled");
    }

    public void verifyThatHomePolicyReferToHomeSurplusQuote() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(homePolicy.getText(), "PolicyActive","Policy status");
        commonComponentsAndActions.scrollToWebElement(homePolicy);
        reportScreenshot("Refer to Home Surplus" + System.currentTimeMillis(), "Home policy refer to Home Surplus quote");
    }

    public void verifyThatCancelledHomePolicyReferToHomeSurplusQuote() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(homePolicy.getText(), "PolicyCancelled","Policy status");
        commonComponentsAndActions.scrollToWebElement(homePolicy);
        reportScreenshot("Refer to Home Surplus" + System.currentTimeMillis(), "Home policy refer to Home Surplus quote");
    }

    public void verifyThatHomePolicyDoesNotReferToHomeSurplusQuote() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        Assert.assertEquals(driver.findElements(By.xpath("//span[contains(text(),'Home Surplus Lines')]/../../following-sibling::td[8]//div")).size(), 0);
        commonComponentsAndActions.scrollToWebElement(homePolicy);
        reportScreenshot("NotRefer" + System.currentTimeMillis(), "Home policy does not refer to Home Surplus quote");
    }

    public void verifyThatHomeQuoteDeclined() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(homeownersQuote.getText(), "PolicyQuoteDeclined", "Quote is Declined");
        commonComponentsAndActions.scrollToWebElement(homeownersQuote);
        reportScreenshot("Quote is Declined" + System.currentTimeMillis(), "Home quote is Declined");
    }

    public void verifyThatHomeQuoteDoesNotReferToHomeSurplusQuote() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        Assert.assertEquals(driver.findElements(By.xpath("//span[contains(text(),'Home Surplus Lines')]/../../following-sibling::td[8]//div")).size(), 0);
        commonComponentsAndActions.scrollToWebElement(homeownersQuote);
        reportScreenshot("Not refer to Home Surplus" + System.currentTimeMillis(), "Home quote does not refer to Home Surplus quote");
    }

    public void verifyThatHomeQuoteReferToHomeSurplusQuote() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(hsQuote.getText(), "PolicyQuoteIncomplete", "Refer to Home Surplus");
        commonComponentsAndActions.scrollToWebElement(hsQuote);
        reportScreenshot("Refer to Home Surplus" + System.currentTimeMillis(), "Home quote refer to Home Surplus quote");
    }

    public void verifyThatHomePolicyIsActive() {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(homePolicy.getText(), "PolicyActive", "Policy Active");
        commonComponentsAndActions.scrollToWebElement(homePolicy);
        reportScreenshot("PolicyActive" + System.currentTimeMillis(), "Home policy is Active");
    }

    public void verifyThatPolicyIsActive(String lob) {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        commonComponentsAndActions.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'"+lob+"')]/../../following-sibling::td[9]//div")).getText(), "PolicyActive", "Policy Active");
    }

    public void openFSQuote() {
        clickElement(driver.findElement(By.xpath("//div[text()='all quotes']/../../../../../..//span[contains(text(),'Flood Surplus Lines')]")), "FS quote");
    }
}