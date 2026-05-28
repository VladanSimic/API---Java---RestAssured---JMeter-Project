package pages;

import excel.ExcelManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.ReferralsBlock;
import pages.utils.SoftAssertion;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UnderwritingReferralsPage extends CommonComponentsAndActions {
    WebDriver driver;
    ReferralsBlock referralsBlock;

    public UnderwritingReferralsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        referralsBlock = new ReferralsBlock(driver);

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='OK']")
    WebElement popUpOK;
    @FindBy(xpath = "//span[text()=\"TIV\"]/../../../../../../../../../div[2]/div/div/table[1]//tr/td[2]/div")
    public WebElement TIV;
    @FindBy(xpath = "//div[text()='Underwriter']/../../../..//input")
    WebElement underwriter;
    @FindBy(xpath = "//span[div[contains(text(), 'grade update failed')]]")
    List<WebElement> gradeFailedMsg;
    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr")
    List<WebElement> gradeRows;
    @FindBy(xpath = "//div[contains(text(),'underwriting scoring grade')]")
    List<WebElement> noPUREGradeAnalytics;

    public void overrideReferrals(String note, Map<String, String> data) throws Throwable {
        pause(2000);
        referralsBlock.setAllOverriddenYes();
        referralsBlock.fillUnderwriterNotes(note);
        referralsBlock.setAuthorityAllOverriddenYes(data);
        referralsBlock.fillAuthorityUnderwriterNotes(note);
        pause(2000);
    }

    public void overrideReferrals() throws Throwable {
        pause(2000);
        referralsBlock.setAllOverriddenYesTemp();
    }

    public void overrideReferralsExEs() throws Throwable {
        pause(2000);
        referralsBlock.setAllOverriddenYesTempEXES();
    }

    public void overrideReferralsEndRnw() throws Throwable {
        pause(2000);
        referralsBlock.setAllOverriddenYesTempEndRnw();
    }

    public void acceptReferrals(String comment) throws Throwable {
        referralsBlock.acceptReferrals(comment);
    }

    public void acceptReferralsEND(String comment) throws Throwable {
        referralsBlock.acceptReferralsEND(comment);
    }

    public void acceptUnacceptedReferrals(String note) throws Throwable {
        referralsBlock.acceptUnacceptedReferral(note);
    }

    public void acceptReferralsPopUp() throws Throwable {
        clickElement(popUpOK);
    }

    public void verifyReferralTrigger(String referralID, String triggered) throws IOException {
        Map<String, String> data = new ExcelManager().getRowDataByCellValue("src/test/test_data/dragon/Referrals.xlsx", "Referrals", referralID);

        List<WebElement> referrals = referralsBlock.getReferrals();
        boolean isTriggered = false;

        for (WebElement referral : referrals) {
            if (referral.getText().equals(data.get("PC_COVERAGE_RULE_DESC"))) {
                scrollToWebElement(referral, "Referrals block");
                reportScreenshot("ReferralTriggered", "Referral Triggered");
                isTriggered = true;
            }
        }

        if (triggered.equalsIgnoreCase("Yes") || triggered.equalsIgnoreCase("triggered")) {
            SoftAssertion.assertTrue(isTriggered, "Expected: " + data.get("PC_COVERAGE_RULE_DESC") + " to be shown");
        } else {
            reportScreenshot("ReferralNotTriggered", "Referral Not Triggered");
            SoftAssertion.assertTrue(!isTriggered, "Expected: " + data.get("PC_COVERAGE_RULE_DESC") + " not to be shown");
        }

    }

    public void verifyReferralTriggeredOrNot(String referralName, String triggeredOrNot) throws IOException {
        List<WebElement> referrals = referralsBlock.getReferrals();
        boolean isTriggered = false;

        for (WebElement referral : referrals) {
            if (referral.getText().equals(referralName)) {
                scrollToWebElement(referral, "Referrals block");
                reportScreenshot("ReferralTriggered", "Referral Triggered");
                isTriggered = true;
            }
        }

     /*   if (isTriggered) {
            SoftAssertion.assertTrue(isTriggered, "Expected: " + referralName + " to be shown");
        } else {
            reportScreenshot("ReferralNotTriggered", "Referral Not Triggered");
            SoftAssertion.assertTrue(true, "Expected: " + referralName + " not to be shown");
        }*/

        if (triggeredOrNot.equalsIgnoreCase("Not Triggered") && isTriggered) {
            failAssertion("Referrals with text: " + referralName + " is triggered when it shouldn't be");
            reportScreenshot("Failure_" + referralName + "_referrals_" + System.currentTimeMillis(), referralName.substring(0, 5));
        } else if (!triggeredOrNot.equalsIgnoreCase("Not Triggered") && !isTriggered) {
            failAssertion("Referrals with text: " + referralName + " is not triggered when it should be");
            reportScreenshot("Failure_referrals_" + System.currentTimeMillis(), referralName.substring(0, 10));
        } else if (triggeredOrNot.equalsIgnoreCase("Triggered")) {
            SoftAssertion.assertTrue(isTriggered, "Expected: " + referralName + " to be triggered");
            reportScreenshot("Success_referrals_" + System.currentTimeMillis(), referralName.substring(0, 10));
        }else if (triggeredOrNot.equalsIgnoreCase("Not Triggered")) {
            SoftAssertion.assertTrue(!isTriggered, "Expected: " + referralName + " to be not triggered");
            reportScreenshot("Success_referrals_" + System.currentTimeMillis(), referralName.substring(0, 10));
        }
    }

    public void verifyReferralContainedTriggered(String referralID, String triggered) throws IOException {
        Map<String, String> data = new ExcelManager().getRowDataByCellValue("src/test/test_data/dragon/Referrals.xlsx", "Referrals", referralID);

        List<WebElement> referrals = referralsBlock.getReferrals();
        boolean isTriggered = false;

        for (int i = 0; i < referrals.size(); i++) {
            if (referrals.get(i).getText().contains(data.get("PC_COVERAGE_RULE_DESC"))) {
                scrollToWebElement(referrals.get(i), "Referrals block");
                reportScreenshot("ReferralTriggered", "Referral Triggered");
                isTriggered = true;
            }
        }

        if (triggered.equalsIgnoreCase("Yes") || triggered.equalsIgnoreCase("triggered")) {
            Assert.assertTrue(isTriggered, "Expected: " + data.get("PC_COVERAGE_RULE_DESC") + " to be shown");
        } else {
            reportScreenshot("ReferralNotTriggered", "Referral Not Triggered");
            Assert.assertFalse(isTriggered, "Expected: " + data.get("PC_COVERAGE_RULE_DESC") + " not to be shown");
        }

    }

    public void verifyReferralApproval(String referralID, String approvable) throws Throwable {
        Map<String, String> data = new ExcelManager().getRowDataByCellValue("src/test/test_data/dragon/Referrals.xlsx", "Referrals", referralID);

        List<WebElement> referrals = referralsBlock.getReferrals();

        int refRowNum = 100;
        int collNum = 0;

        for (int i = 0; i < referrals.size(); i++) {
            if (referrals.get(i).getText().equals(data.get("PC_COVERAGE_RULE_DESC"))) {
                refRowNum = i;
            }
        }

        if (driver.findElements(By.xpath("//div[text()='referrals' or contains(text(),'underwriting alerts raised')]/../../../../../../div[2]/div/div/div/div[5]/div/div/div/div/span[text()='Overridden?']")).size() > 0) {
            collNum = 5;
        } else {
            collNum = 4;
        }

        if (refRowNum != 100) {
            clickElement(driver.findElement(By.xpath("//div[text()='referrals' or contains(text(),'underwriting alerts raised')]/../../../../../../div[2]//table[" + (refRowNum + 1) + "]//td[" + collNum + "]/div")));
            pause(3000);
            if (approvable.equalsIgnoreCase("Yes") || approvable.equalsIgnoreCase("can be approved")) {
                Assert.assertTrue(driver.findElements(By.xpath("//li[text()='Yes']")).size() > 0, "Expected: User should be able to approve the referral! Actual: user could not approve the referral!"); //&& driver.findElements(By.xpath("//li[text()='Yes']")).get(0).isDisplayed()
            } else {
                Assert.assertTrue(driver.findElements(By.xpath("//li[text()='Yes']")).size() == 0, "Expected: User should not be able to approve the referral! Actual: user could approve the referral!");
            }
        }
    }

    public void setUnderwriter(String value) throws Throwable {
        // Added if because sometimes on HS underwriter cell is not visible
        if (isElementDisplayed(underwriter, 10)) {
            pause(1000);
            typeTextEnter(underwriter, value, "Underwriter");
            clickFooter();
            pause(1000);
            if (getUnderwriter().equalsIgnoreCase("") || getUnderwriter().contains("Select") || getUnderwriter().contains("- Select -")) {
                setUnderwriter();
            }
        }
    }

    public void setUnderwriter() throws Throwable {
        pause(1000);
        if (isElementDisplayed(underwriter)) {
            try {
                underwriter.click();
            } catch (Exception e) {
                try {
                    underwriter.clear();
                    underwriter.click();
                    driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
                    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
                } catch (Exception ignored) {

                }
            }
            try {
                underwriter.clear();
                underwriter.click();
                driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            } catch (Exception ignored) {

            }
        }
    }

    public String getUnderwriter() throws Throwable {
        pause(1000);
        if (isElementDisplayed(underwriter)) {
            if (hasValue(underwriter.getText())) {
                return underwriter.getText();
            } else {
                return underwriter.getAttribute("value");
            }
        } else {
            return "";
        }
    }

    public boolean checkUnderwriterIs(String value) {
        return underwriter.getText().contains(value);
    }

//    public void verifyReferralApprovalEX(String referralID, String approvable) throws Throwable {
//        Map<String, String> data = new ExcelUtilities().getRowDataByCellValue("src/test/test_data/dragon/Referrals.xlsx","Referrals",referralID);
//
//        List<WebElement> referrals = referralsComponent.getReferrals();
//
//        int refRowNum = 100;
//
//        for(int i = 0; i<referrals.size();i++){
//            if(referrals.get(i).getText().equals(data.get("PC_COVERAGE_RULE_DESC"))){
//                refRowNum = i;
//            }
//        }
//
//        if(refRowNum!=100){
//            clickElement(driver.findElement(By.xpath("//div[contains(text(),'referrals')]/../../../../../../div[2]//table["+(refRowNum+1)+"]//td[4]/div")));
//            pause(2000);
//            if(approvable.equalsIgnoreCase("Yes")){
//                Assert.assertTrue(driver.findElements(By.xpath("//li[text()='Yes']")).size()>0); //&& driver.findElements(By.xpath("//li[text()='Yes']")).get(0).isDisplayed()
//            } else {
//                Assert.assertTrue(driver.findElements(By.xpath("//li[text()='Yes']")).size()==0);
//            }
//        }
//    }

//    public void overrideReferralsEX(String note) throws Throwable {
//        referralsComponent.fillUnderwriterNotesEX(note);
//        referralsComponent.setAllOverriddenYesEX();
//        referralsComponent.fillAuthorityUnderwriterNotesEX(note);
//        referralsComponent.setAuthorityAllOverriddenYesEX();
//        pause(2000);
//    }

    public void didHomeGradeFail() {
        reportScreenshot("Location Grade_" + System.currentTimeMillis(), "Location Grade");
        if (gradeRows.isEmpty() || !gradeFailedMsg.isEmpty())
            Assert.fail("Location grade failed for this address");
        else
            successLog("Location Grade is present");
    }

    public void didAutoGradeFail() {
        reportScreenshot("Auto Grade_" + System.currentTimeMillis(), "Auto Grade");
        if (gradeRows.isEmpty() || !gradeFailedMsg.isEmpty())
            Assert.fail("Auto Grade failed");
        else
            successLog("Auto Grade is present");
    }

    public void didExcessGradeFail() {
        reportScreenshot("Excess Grade_" + System.currentTimeMillis(), "Auto Grade");
        if (gradeRows.isEmpty() || referralsBlock.didGradeFailReferral())
            Assert.fail("Excess Grade failed");
        else
            successLog("Excess Grade is present");
    }

    public void isThereNoPureAnalytics() {
        reportScreenshot("NoPUREAnalytics_" + System.currentTimeMillis(), "No PURE Analytics");
        if (!noPUREGradeAnalytics.isEmpty())
            Assert.fail("No PURE Analytics failed");
        else
            successLog("No PURE Analytics passed");
    }

    public void approveAndAcceptUWReferralsIfVisible(Map<String, String> data) throws Throwable {
        if (driver.findElements(By.xpath("//div[text()='underwriting alerts raised']")).size() != 0) {
            overrideReferrals("Accepted", data);
            acceptReferrals("Accepted");
            pause(2000);
        }
    }

    public void approveReferralsIfDisplayedAndNavigateBackToPolicy(int waitTime, Map<String, String> data) throws Throwable {
        if (isElementDisplayed(underwritingAlertsRaisedBlock, waitTime)) {
            approveAndAcceptUWReferralsIfVisible(data);
            if (isElementDisplayed(moreChanges, waitTime))
                clickMoreChangesButton();
            else
                navigateToPolicyImagePage("Rated");
        }
    }

}