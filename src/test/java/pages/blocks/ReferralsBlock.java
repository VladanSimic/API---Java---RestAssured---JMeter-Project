package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ReferralsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ReferralsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='referrals' or 'underwriting alerts raised']/../../../../../..//table//td[3]")
    List<WebElement> underwriterNotesEX;
    @FindBy(xpath = "//div[text()='referrals' or 'underwriting alerts raised']/../../../../../..//table//td[3]//textarea")
    List<WebElement> underwriterNotesDivEX;
    @FindBy(xpath = "//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../..//table//td[4]/div")
    List<WebElement> overriddenEX;

    @FindBy(xpath = "//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../..//table//td[5]/div[2]//*")
    List<WebElement> overriddenDiv;
    @FindBy(xpath = "//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../..//table//td[2]/div")
    List<WebElement> referralAlerts;
    @FindBy(xpath = "//li[text()='Yes']")
    List<WebElement> yesSelect;
    @FindBy(xpath = "//ul[@role='listbox' and @aria-hidden='false']//li[@role='option' and text()='Yes']")
    WebElement yesSelectNew;
    @FindBy(xpath = "//div[text()='referrals' or text() = 'underwriting alerts raised']")
    WebElement referralBlock;
    @FindBy(xpath = "//div[text()='authority referrals']/../../../../../..//table//td[3]")
    List<WebElement> authorityUnderwriterNotes;
    @FindBy(xpath = "//div[text()='authority referrals']/../../../../../..//table//td[3]//textarea")
    List<WebElement> authorityUnderwriterNotesDiv;
    @FindBy(xpath = "//div[text()='authority referrals']/../../../../../..//table//td[4]/div")
    List<WebElement> authorityOverridden;
    @FindBy(xpath = "//div[text()='authority referrals']/../../../../../..//table//td[4]")
    List<WebElement> authorityUnderwriterNotes2;
    @FindBy(xpath = "//div[text()='authority referrals']/../../../../../..//table//td[4]//textarea")
    List<WebElement> authorityUnderwriterNotesDiv2;
    @FindBy(xpath = "//div[text()='authority referrals']/../../../../../..//table//td[5]/div")
    List<WebElement> authorityOverridden2;

    @FindBy(xpath = "//div[text()='authority referrals']/../../../../../..//table//td[4]/div")
    List<WebElement> authorityOverriddenEX;

    @FindBy(xpath = "//div[contains(text(),'Underwriting Comments to Broker')]/../../../../div//textarea")
    WebElement commentsForBroker;
    @FindBy(xpath = "//div[contains(text(),'There is a potential conflict with the OFAC')]")
    List<WebElement> isOFACPresent;
    @FindBy(xpath = "//div[contains(text(),'Sanctions screening cannot be completed at this time')]")
    List<WebElement> ofacScreeningNotCompleted;
    @FindBy(xpath = "//*[contains(text(),'score is an F')]")
    List<WebElement> scoreIsAnFReferral;
    @FindBy(xpath = "//div[text()='authority referrals']")
    WebElement authorityReferralsDiv;


    public void fillUnderwriterNotes(String note) throws Throwable {
        List<WebElement> underwriterNotes = driver.findElements(By.xpath("//td[contains(@class,'yellowMandatory')]//div[contains(@style,'!')]"));

        for (WebElement underwriterNote : underwriterNotes) {
            pause(2000);
            clickElement(underwriterNote);
            pause(2000);
            driver.switchTo().activeElement().sendKeys(note);
            clickElement(referralBlock);
        }
    }

    public void setAllOverriddenYes() throws Throwable {
        List<WebElement> overridden = driver.findElements(By.xpath("//span[contains(text(),'Overridden?')]/../../../../../../../../..//td[contains(@class,'yellowMandatory')]//div[contains(@style,'!')]/../..//td[contains(@class,'oslookuplistcolumn')]"));

        for (WebElement webElement : overridden) {
            if (webElement.isEnabled()) {
                scrollToWebElement(webElement, "Overridden?");
                pause(3000);
                clickElement(webElement, "Accepted?");
                pause(2000);
                clickElement(yesSelectNew, "Yes");
            }
        }
    }

    public void setAllOverriddenYesTemp() throws Throwable {

        List<WebElement> overridden = driver.findElements(By.xpath("//div[text()='referrals']/../../../../../..//table//td[5]/div"));

        for (WebElement webElement : overridden) {
            pause(2000);
            clickElement(webElement);
            pause(2000);
            clickElement(yesSelectNew);
            pause(2000);
        }
    }

    public void setAllOverriddenYesTempEXES() throws Throwable {

        List<WebElement> overridden = driver.findElements(By.xpath("//div[text()='referrals']/../../../../../..//table//td[4]/div"));

        for (WebElement webElement : overridden) {
            pause(2000);
            clickElement(webElement);
            pause(2000);
            clickElement(yesSelectNew);
            pause(2000);
        }
    }

    public void setAllOverriddenYesTempEndRnw() throws Throwable {
        List<WebElement> overridden = driver.findElements(By.xpath("//div[text()='underwriting alerts raised']/../../../../../..//table//td[5]/div"));

        for (WebElement webElement : overridden) {
            pause(2000);
            clickElement(webElement);
            pause(2000);
            clickElement(yesSelectNew);
            pause(2000);
        }
    }

    public void fillAuthorityUnderwriterNotes(String note) throws Throwable {
        try {
            for (WebElement underwriterNote : authorityUnderwriterNotes) {
                clickElement(underwriterNote);
                pause(2000);
                clickElement(underwriterNote);
                pause(2000);
                authorityUnderwriterNotesDiv.get(0).sendKeys(note);
                clickElement(referralBlock);
            }
        } catch (Exception e) {
            for (WebElement underwriterNote : authorityUnderwriterNotes2) {
                clickElement(underwriterNote);
                pause(2000);
                clickElement(underwriterNote);
                pause(2000);
                authorityUnderwriterNotesDiv2.get(0).sendKeys(note);
                clickElement(referralBlock);
            }
        }
    }

    public void setAuthorityAllOverriddenYes(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Admitted_Or_Surplus")) && data.get("Admitted_Or_Surplus").equalsIgnoreCase("Admitted") && data.get("Admitted_Line").equalsIgnoreCase("Excess Liability")) {
            if (authorityOverriddenEX.size() > 0) {
                for (WebElement webElement : authorityOverriddenEX) {
                    clickElement(authorityReferralsDiv);
                    clickElement(webElement, "Accepted?");
                    pause(2000);
                    clickElement(yesSelectNew, "Yes");
                }
            }
        } else {
            try {
                if (authorityOverridden.size() > 0) {
                    for (WebElement webElement : authorityOverridden) {
                        clickElement(authorityReferralsDiv);
                        clickElement(webElement, "Accepted?");
                        pause(2000);
                        clickElement(yesSelectNew, "Yes");
                    }
                }
            } catch (Exception e) {
                if (authorityOverridden2.size() > 0) {
                    for (WebElement webElement : authorityOverridden2) {
                        clickElement(authorityReferralsDiv);
                        clickElement(webElement, "Accepted?");
                        pause(2000);
                        clickElement(yesSelectNew, "Yes");
                    }
                }
            }
        }
    }

    public void acceptReferrals(String comment) throws Throwable {
        fillCommentForBroker(comment);
        accept();
        approved();
    }

    public void acceptReferralsEND(String comment) throws Throwable {
        fillCommentForBroker(comment);
        approved();
    }

    public void fillCommentForBroker(String comment) throws Throwable {
        typeText(commentsForBroker, comment);
    }

    public void accept() throws Throwable {
        try {
            if (elementExists(driver.findElements(By.xpath("//span[text()='accept']"))))
                clickElement(accept);
            if (elementExists(driver.findElements(By.xpath("//span[text()='OK']"))))
                clickElement(ok);
        } catch (Exception e) {
            //
        }
    }

    public void approved() throws Throwable {
        if (elementExists(driver.findElements(By.xpath("//span[text()='>>>approved']"))))
            clickElement(approved);
    }

    //TODO
    public List<WebElement> getReferrals() {
        return referralAlerts;
    }

    //TODO
    public void acceptUnacceptedReferral(String note) throws Throwable {
        int collNum = 0;

        if (driver.findElements(By.xpath("//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../../div[2]/div/div/div/div[5]/div/div/div/div/span[text()='Overridden?']")).size() > 0) {
            collNum = 5;
        } else {
            collNum = 4;
        }

        List<WebElement> overridden = driver.findElements(By.xpath("//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../..//table//td[" + collNum + "]/div"));

        int collNum2 = 0;

        if (driver.findElements(By.xpath("//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../../div[2]/div/div/div/div[4]/div/div/div/div/span[text()='Underwriter Notes']")).size() > 0) {
            collNum = 4;
        } else {
            collNum = 3;
        }

        List<WebElement> underwriterNotes = driver.findElements(By.xpath("//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../..//table//td[" + collNum2 + "]"));
        List<WebElement> underwriterNotesDiv = driver.findElements(By.xpath("//div[text()='referrals' or text() = 'underwriting alerts raised']/../../../../../..//table//td[" + collNum + "]//textarea"));

        for (int i = 0; i < overridden.size(); i++) {
            if (overridden.get(i).getText().equalsIgnoreCase("No")) {
                clickElement(underwriterNotes.get(i));
                Thread.sleep(1000);
                typeText(underwriterNotesDiv.get(0), note);
                Thread.sleep(1000);
                clickElement(overridden.get(i));
                Thread.sleep(1000);
                clickElement(yesSelect.get(0));
            }
        }
    }

    public void verifyOFACReferral(String value) throws Throwable {
        pause(7000);
        boolean isPresent = isOFACPresent.size() > 0;

        if (ofacScreeningNotCompleted.size() > 0) {
            navigateToQuoteDetailsPage();
            rateQuote();
            pause(5000);
            navigateToUnderwritingReferralsPage();
            pause(2000);
            if (ofacScreeningNotCompleted.size() > 0)
                failAssertion("OFAC Integration Timed Out");
        }

        if ((value.equalsIgnoreCase("positive") && !isPresent) || (!value.equalsIgnoreCase("positive") && isPresent))
            failAssertion("OFAC Verification Failed. Expected: " + value);
        else
            successLog("OFAC Verification Passed");
    }

    public void verifyOFACReferral(int expectedReferrals) throws Throwable {
        pause(9000);
        int actualReferrals = isOFACPresent.size();

        if (expectedReferrals != actualReferrals) {
            failAssertion("Expected " + expectedReferrals + ", found " + actualReferrals + " OFAC referrals on the UI");
        }
    }

    public boolean didGradeFailReferral() {
        return scoreIsAnFReferral.size() != 0;
    }

    public void setAllReferralsToYes() throws InterruptedException {
        List<WebElement> overridden = driver.findElements(By.xpath("//span[contains(text(),'Overridden?')]/../../../../../../../../..//td[contains(@class,'oslookuplistcolumn')]"));

        for (WebElement webElement : overridden) {
            if (webElement.isEnabled()) {
                scrollToWebElement(webElement, "Overridden?");
                pause(3000);
                clickElement(webElement, "Accepted?");
                pause(2000);
                clickElement(yesSelectNew, "Yes");
            }
        }
    }

    public void verifyGenericErrorReferralsNotPresent() throws Throwable {
        pause(7000);
        String referralPath = "//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '$$')]";
        String[] listOfReferrals = {"A system error is preventing us from obtaining an Insurance Score",
                "Sanctions screening cannot be completed at this time.",
                "score is an F", "Home non-CAT grade is a C", "Sapiens referral error: The system was unable to confirm referrals"};
        List<WebElement> element = List.of();
        boolean isPresent = false;

        for (String referral : listOfReferrals) {
            element = driver.findElements(By.xpath(referralPath.replace("$$", referral.toLowerCase())));
            if (!element.isEmpty()) {
                isPresent = true;
                scrollToWebElement(element.get(element.size() - 1));
                reportScreenshot("UW_Referrals_Failure_" + System.currentTimeMillis(), "Generic System Error UW referral is present");
                break;
            }
        }

        if (isPresent) {
            failAssertion("Failure UW referral is present. Referral text: " + element.get(element.size() - 1).getText());
        }
    }

    public void confirmReferralCanBeApproved(String referral, String approvableOrNot) {
        String xpathField = String.format("//div[text() = '%s']/../../../..//td[5]", referral);

        WebElement targetField = driver.findElement(By.xpath(xpathField));
        scrollToWebElement(targetField);

        String fieldClass = targetField.getAttribute("class");
        boolean isReadOnly = fieldClass != null && fieldClass.contains("gridCellReadOnly");

        if (approvableOrNot.equalsIgnoreCase("Not Approvable")) {
            if (isReadOnly) {
                successLog("Referral '" + referral + "' is correctly non-approvable (read-only).");
                reportScreenshot("Referral Status", "Referral '" + referral + "' is non-approvable as expected.");
            } else {
                failAssertion("Referral '" + referral + "' should not be approvable, but it is editable.");
                reportScreenshot("Referral Status", "Editable referral found where non-approvable was expected.");
            }
        } else if (approvableOrNot.equalsIgnoreCase("Approvable")) {
            if (isReadOnly) {
                failAssertion("Referral '" + referral + "' should be approvable, but it is read-only.");
                reportScreenshot("Referral Status", "Read-only referral found where approvable was expected.");
            } else {
                successLog("Referral '" + referral + "' is correctly approvable (editable).");
                reportScreenshot("Referral Status", "Referral '" + referral + "' is approvable as expected.");
            }
        } else {
            failAssertion("Invalid input for 'approvableOrNot': " + approvableOrNot);
            reportScreenshot("Referral Status", "Test failed due to invalid input: '" + approvableOrNot + "'");
        }
    }

    public void approveAndOverride() throws Throwable {
        List<WebElement> overriddenElements = driver.findElements(
                By.xpath("//td//div[contains(@style,'!')]/../..//td[contains(@class,'oslookuplistcolumn')]//div[not(text()='Yes')]")
        );

        for (WebElement element : overriddenElements) {
            pause(500);
            clickFooter();
            typeTextFast(element, "Yes", "Referral override.");
        }
        clickFooter();

        List<WebElement> underwriterNotes = driver.findElements(
                By.xpath("//td[contains(@class,'yellowMandatory')]//div[contains(@style,'!')]")
        );

        for (WebElement element : underwriterNotes) {
            pause(500);
            clickFooter();
            typeTextFast(element, "Accepted", "Referral Comment");
        }
        clickFooter();
    }

    public void verifyReferralType(String referralText, String referralType){

        WebElement referralToBeVerified = driver.findElement(By.xpath("//td//div[contains(text(),'"+ referralText +"')]/../..//td[3]/div"));
        String referralTypeTextOnUI = referralToBeVerified.getText();

        if (isElementDisplayed(referralToBeVerified) && referralTypeTextOnUI.equalsIgnoreCase(referralType)) {
            infoLog("Referral type matches");
        } else {
         failAssertion("Referral type" + referralTypeTextOnUI + "does not match expected" + referralType);
        }
    }

}