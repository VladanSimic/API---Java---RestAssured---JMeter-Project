package pages.utils;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.github.sukgu.Shadow;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import pages.PolicySummaryPage;
import pages.PremiumSummaryPage;
import pages.SummaryPage;
import selenium.DriverManager;
import steps.BaseTest;
import steps.dragon.common.NavigationSteps;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class CommonComponentsAndActions {

    public WebDriver driver;

    int WAIT_TIME = Integer.parseInt(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("WAIT_TIME"));
    String SCREENSHOTS = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("SCREENSHOTS");
    public String BROWSER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER");
    public int IMPLICIT_WAIT = new BaseTest().getImplicitWait();
    public String SOFT_ASSERT = (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("SOFT_ASSERT") != null)
            ? Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("SOFT_ASSERT") : "No";
    String ASSERTIONS = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ASSERTIONS");
    public String ENV = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ENV");
    public String BLOCK_VALIDATION = (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BLOCK_VALIDATION") != null)
            ? Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BLOCK_VALIDATION") : "No";
    public String USER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("USER");

    public CommonComponentsAndActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // HEADER ELEMENTS - START
    @FindBy(xpath = "//span[text()='Home']")
    public WebElement home;
    @FindBy(xpath = "//span[text()='tasks']")
    public WebElement tasks;
    @FindBy(xpath = "//span[text()='agent resources']")
    public WebElement agentResources;
    @FindBy(xpath = "//span[text()='customers']")
    public WebElement customers;
    @FindBy(xpath = "//span[text()='quotes']")
    public WebElement quotes;
    @FindBy(xpath = "//span[text()='policies']")
    public WebElement policies;
    @FindBy(xpath = "//span[text()='locations']")
    public WebElement locations;
    @FindBy(xpath = "//span[text()='partners']")
    public WebElement partners;
    @FindBy(xpath = "//span[text()='user setup']")
    public WebElement userSetup;
    @FindBy(xpath = "//span[text()='sub roles']")
    public WebElement subRoles;
    @FindBy(xpath = "//span[text()='rating log']")
    public WebElement ratingLog;
    @FindBy(xpath = "//span[text()='logout']")
    public WebElement logout;
    @FindBy(xpath = "//div[@id='os-bread-crumb-bar']//span[text()='next']")
    public WebElement actionButtonNext;
    @FindBy(xpath = "//span[text()='underwriting referrals']")
    public WebElement underwritingReferrals;
    @FindBy(xpath = "//span[text()='premium summary']")
    public WebElement premiumSummary;
    @FindBy(xpath = "//span[text()='Click here to create a Non-Admitted Primary Flood quote']")
    public WebElement createNonAdmittedPrimaryFloodQuote;
    @FindBy(xpath = "//span[contains(text(),'Customer: ')]/../../..")
    public WebElement customer;
    @FindBy(xpath = "//span[text()='premium']")
    public WebElement premium;
    @FindBy(xpath = "//span[text()='search']")
    public WebElement search;
    @FindBy(xpath = "//span[text()='documents']")
    public WebElement documentsTab;
    @FindBy(xpath = "//span[contains(text(),'Customer:')]")
    public WebElement customerLink;
    @FindBy(xpath = "//span[text()='underwriting']")
    public WebElement underwritingTab;
    @FindBy(xpath = "//span[text()='transactions/endorsements']")
    public WebElement transactionsOrEndorsements;
    @FindBy(xpath = "//span[contains(text(),'Policy:')]")
    public WebElement policyBreadcrumb;
    @FindBy(xpath = "//span[text()='New Business']")
    public List<WebElement> newBusinessTransaction;
    @FindBy(xpath = "//span[text()='New Business Rewrite']")
    public List<WebElement> newBusinessRewriteTransaction;
    @FindBy(xpath = "//span[text()='New Business']")
    public WebElement newBusinessTransactionSummary;
    @FindBy(xpath = "//span[text()='subjectivities']")
    public WebElement subjectivities;
    @FindBy(xpath = "//span[text()='>>> manual bind ']")
    public WebElement manualBind;
    @FindBy(xpath = "//span[contains(text(),'>>> process')]")
    public WebElement process;
    @FindBy(xpath = "//span[contains(text(),'Extend Policy')]")
    public WebElement extendPolicy;
    @FindBy(xpath = "//span[contains(text(),'premium details')]")
    public WebElement premiumDetails;
    @FindBy(xpath = "//span[contains(text(),'return to premium summary page')]")
    public WebElement returnToPremiumSummaryPage;
    @FindBy(xpath = "//span[contains(text(),'>>> complete rewrite transaction')]")
    public WebElement completeRewriteTransaction;
    @FindBy(xpath = "//span[text()='exit policy']")
    public WebElement exitPolicy;
    @FindBy(xpath = "//span[text()='exit']")
    public WebElement exit;
    @FindBy(xpath = "//span[text()='create renewal']")
    public WebElement createRenewal;
    @FindBy(xpath = "//span[text()='Renewal']")
    public WebElement renewal;
    @FindBy(xpath = "//span[text()='policy image']")
    public WebElement policyImage;
    @FindBy(xpath = "//span[text()='renewed premium']")
    public WebElement renewedPremium;
    @FindBy(xpath = "//span[text()='create application']")
    public WebElement createApplication;
    @FindBy(xpath = "//span[text()='process renewal']")
    public WebElement processRenewal;
    @FindBy(xpath = "//span[text()='process policy extension']")
    public WebElement processPolicyExtension;
    @FindBy(xpath = "//span[text()='exit transaction']")
    public WebElement exitTransaction;
    @FindBy(xpath = "//span[text()='underwriting alerts']")
    public WebElement underwritingAlerts;
    @FindBy(xpath = "//div[text()='underwriting alerts raised']")
    public WebElement underwritingAlertsRaisedBlock;
    @FindBy(xpath = "//a[text()=\"Homeowners Policy\"]")
    public WebElement homeownerPolicyPage;
    @FindBy(xpath = "//a[text()=\"Home Surplus Lines Policy\"]")
    public WebElement HSPolicyPage;
    @FindBy(xpath = "//span[text()=\"Endorsement\"]")
    public List<WebElement> endorsement;
    @FindBy(xpath = "//span[text()='quote details']")
    public WebElement quoteDetails;
    @FindBy(xpath = "//span[text()='insurance score management']")
    public WebElement insuranceScoreManagement;
    @FindBy(xpath = "//span[text()='new report']")
    public WebElement newReport;
    @FindBy(xpath = "//span[text()='summary']")
    public WebElement customerSummary;
    @FindBy(xpath = "(//span[text()='end submission'])|(//span[text()='>>> end submission'])")
    public WebElement endSubmission;
    @FindBy(xpath = "//span[text()='account summary']")
    public WebElement accountSummaryTab;
    @FindBy(xpath = "//span[text()='customer details']")
    public WebElement customerDetailsTab;
    @FindBy(xpath = "//*[contains(text(),'member flag')]")
    public WebElement memberFlagTab;
    @FindBy(xpath = "//span[text()='policy delivery preferences']")
    public WebElement policyDeliveryPreferencesTab;
    @FindBy(xpath = "//span[text()='billing delivery preferences']")
    public WebElement billingDeliveryPreferencesTab;
    @FindBy(xpath = "//span[text()='required forms']")
    public WebElement requiredFormsTab;
    @FindBy(xpath = "//span[text()='proposals']")
    public WebElement proposalsTab;
    @FindBy(xpath = "//span[text()='diary']")
    public WebElement diaryTab;
    @FindBy(xpath = "//span[text()='history']")
    public WebElement historyTab;
    @FindBy(xpath = "//span[text()='insurance score management']")
    public WebElement insuranceScoreManagementTab;
    @FindBy(xpath = "//span[text()='broker history']")
    public WebElement brokerHistoryTab;
    @FindBy(xpath = "//span[text()='account referral']")
    public WebElement accountReferralTab;
    @FindBy(css = "a.osDiaryButton ")
    public WebElement miniDiaryTab;
    @FindBy(xpath = "//span[text()='summary']")
    public WebElement quoteSummary;
    @FindBy(xpath = "//span[text()='prev']")
    public WebElement prev;
    @FindBy(xpath = "//span[text()=\"Renewal\"]")
    public List<WebElement> renewalTrx;
    @FindBy(xpath = "//span[text()='>>>roll forward']")
    public WebElement rollForward;
    @FindBy(css = ".x-tree-elbow-plus")
    public WebElement plus;
    @FindBy(xpath = "//ul[@role='listbox' and @aria-hidden='false']//li[@role='option']")
    public List<WebElement> dropdownOptions;
    @FindBy(xpath = "//div[contains(@class,'x-tree-elbow-img x-tree-elbow-plus x-tree-expander')]")
    public WebElement treeExpander;
    @FindBy(xpath = "//div[contains(@class,' x-tree-elbow-img x-tree-elbow-end-plus x-tree-expander')]/..//a")
    public WebElement newCreatedNode;
    @FindBy(xpath = "//div[text()='all policies']/../../../../../..//table//tr[@role='row']//td[1]//span")
    public WebElement policy;
    @FindBy(xpath = "//div[text()='all policies']/../../../../../..//table//tr[@role='row']//span[contains(text(),'FS')]")
    public WebElement FSPolicy;
    @FindBy(xpath = "//span[contains(text(),'Policy: ')]")
    public WebElement policyBreadCrumb;
    @FindBy(xpath = "//div[contains(@class,'x-tree-expander')]")
    public List<WebElement> treeExpanderList;
    @FindBy(xpath = "//span[text()='update renewal']")
    public WebElement updateRenewal;
    // HEADER ELEMENTS - END

    // FOOTER ELEMENTS - START
    @FindBy(xpath = "//span[contains(text(),'>>> next') or contains(text(),'>>next') or contains(text(),'>>>next')]")
    public WebElement next;
    @FindBy(xpath = "//span[text()='next']")
    public WebElement nextPage;
    @FindBy(xpath = "//span[contains(text(),'>>> create  new customer')]")
    public WebElement createNewCustomer;
    @FindBy(xpath = "//span[text()='save changes']")
    public WebElement saveChanges;
    @FindBy(xpath = "//span[contains(text(), 'rate')]")
    public List<WebElement> rate;
    @FindBy(xpath = "//span[contains(text(),'xxx ext rate app')]")
    public List<WebElement> extRate;
    @FindBy(xpath = "//span[text()='accept']")
    public WebElement accept;
    @FindBy(xpath = "//span[text()='more changes']")
    public WebElement moreChanges;
    @FindBy(xpath = "//span[text()='>>>approved']")
    public WebElement approved;
    @FindBy(xpath = "//span[text()='send email for eSignature']")
    public WebElement sendEmailSignature;
    @FindBy(xpath = "//span[text()='create required forms']")
    public WebElement createRequiredForms;
    @FindBy(xpath = "//span[contains(text(),'request issue')]")
    public List<WebElement> requestIssue;
    @FindBy(xpath = "//span[contains(text(),'review referrals')]")
    public WebElement reviewReferrals;
    @FindBy(xpath = "//span[text()='bind']")
    public WebElement bind;
    @FindBy(xpath = "//span[contains(text(),'>>confirm')]")
    public WebElement confirm;
    @FindBy(xpath = "//span[contains(text(),'>>> request bind')]")
    public List<WebElement> requestBind;
    @FindBy(xpath = "//span[contains(text(),'new quote')]")
    public WebElement newQuote;
    @FindBy(xpath = "//span/span[contains(text(),'obtain operators and vehicles')]")
    public List<WebElement> obtainOperatorsAndVehicles;
    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancel;
    @FindBy(xpath = "//span[text()='>>> new']")
    public WebElement newTransaction;
    @FindBy(xpath = "//span[text()='>>> review changes']")
    public WebElement reviewChanges;
    @FindBy(xpath = "//span[text()='exit customer']")
    public WebElement exitCustomer;
    @FindBy(xpath = "//span[text()='>>> rate']")
    public WebElement endorsementRate;
    @FindBy(xpath = "//span[text()='>>> issue']")
    public WebElement issue;
    @FindBy(xpath = "//span[text()='Renewal']/../../../td[1]//span")
    public WebElement renewalTransaction;
    @FindBy(xpath = "//span[text()='AUTO PROCESS RNWL']")
    public WebElement autoProcessRenewal;
    @FindBy(xpath = "//span[text()='AUTO CREATE RNWL']")
    public WebElement autoCreateRenewal;
    @FindBy(xpath = "//span[text()='AUTO CREATE RNWL ND']")
    public WebElement autoCreateRenewalND;
    @FindBy(xpath = "//span[text()='>>> modify out-of-sequence']")
    public WebElement modifyOOS;
    @FindBy(xpath = "//span[text()='>>> create quote']")
    public WebElement createQuote;
    @FindBy(xpath = "//span[text()='save and exit']")
    public WebElement saveAndExit;
    @FindBy(xpath = "//span[text()='order property details']")
    public WebElement orderPropertyDetails;
    @FindBy(xpath = "//span[text()='quote proposal']")
    public WebElement quoteProposal;
    @FindBy(xpath = "//span[text()='quote proposal (surplus)']")
    public WebElement quoteProposalSurplus;
    @FindBy(xpath = "//span[text()='CLUE/MVR reports']")
    public WebElement clueMVR;
    @FindBy(xpath = "//a[text()='Coverages']")
    public WebElement coveragesPagePA;
    @FindBy(xpath = "//span[text()='OK'] | (//span[text()='OK'])[2]")
    public WebElement ok;
    @FindBy(xpath = "//span[text()='override all']")
    public WebElement overrideAll;
    @FindBy(xpath = "//span[text()='>>> generate premium items']")
    public WebElement generatePremiumItems;
    @FindBy(xpath = "//span[text()='process override']")
    public WebElement processOverride;
    @FindBy(xpath = "//span[text()='back']")
    public WebElement back;
    @FindBy(css = "#footer-panel-innerCt")
    public WebElement footer;
    @FindBy(xpath = "//span[text()='upload schedule']")
    public WebElement uploadSchedule;
    @FindBy(xpath = "//span[text()='import items']")
    public WebElement importItems;
    @FindBy(xpath = "//span[text()='File Upload']")
    public WebElement fileUpload;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement browseFileBtn;
    @FindBy(xpath = "//span[text()='Upload']")
    public WebElement uploadBtn;
    @FindBy(xpath = "//span[text()='>>> refer to underwriting' or text()='refer to underwriting']")
    public WebElement referToUnderwriting;
    @FindBy(xpath = "//div[text()='quotes available to refer in']/../../../../../..//table//tr/td[last()]//input")
    public WebElement referQuote;
    @FindBy(xpath = "//span[text()='continue referral to UW']")
    public WebElement continueReferralToUW;
    @FindBy(xpath = "//textarea")
    public WebElement textarea;
    public String blockValidation = "//div[@class='x-panel-header x-header x-docked x-unselectable x-panel-header-default x-horizontal x-panel-header-horizontal x-panel-header-default-horizontal x-top x-panel-header-top x-panel-header-default-top x-docked-top x-panel-header-docked-top x-panel-header-default-docked-top x-box-layout-ct x-docked-noborder-top x-docked-noborder-right x-docked-noborder-left']//div[@style='display:inline' and contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '$$')]";
    @FindBy(xpath = "//span[text()='return to premium summary page']")
    public WebElement returnToPremiumSummary;
    @FindBy(xpath = "//span[text()='review policy image']")
    WebElement reviewPolicyImage;
    @FindBy(xpath = "//span[text()='regenerate forms']")
    public WebElement regenerateDocuments;
    @FindBy(xpath = "//*[contains(text(),'TIV Ineligible for current carrier.')]")
    public List<WebElement> tivIneligible;
    @FindBy(xpath = "//span[text()='add'] | //span[text()='Add']")
    public WebElement addBtn;
    public String blockValidationWithTagT = "//div//t[contains(text(),'$$')]";
    public String genericSpan = "//span[text()='$$']";
    public String genericAhref = "//a[contains(text(), '$$')]";
    // FOOTER ELEMENTS - END

    // SPECIAL ELEMENTS
    @FindBy(css = ".x-tree-elbow-plus")
    public WebElement coverPageExpandNode;
    @FindBy(css = ".x-tree-elbow-end-plus")
    public WebElement locationPageExpandNode;


    // SELENIUM ACTIONS - START
    public void clickElement(WebElement element) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
//        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        logPGActions(element);
        try {
            scrollToWebElement(element, element.getTagName());
        } catch (Exception r) {
            scrollToWebElement(element, element.getTagName());
        }
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            element.click();
            clickElementWithOffset(element, 30, 30);
        } catch (Exception e) {
            waitForPreLoadingMask();
            extendSession();
            //added to try
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            //end of added to try

            //added to avoid stale element which was hovering element because of autofocus options from dropdown
            if (driver.findElements(By.xpath("//img")).size() > 0) {
                driver.findElements(By.xpath("//img")).get(0).click();
            }
            element.click();
            clickElementWithOffset(element, 30, 30);
        }
        waitForMask();
    }

    public void clickElements(List<WebElement> elements, int i) {
        if (elements.size() > 0) {
            try {
                scrollToWebElement(elements.get(i));
                Actions actions = new Actions(driver);
                actions.moveToElement(elements.get(i)).build().perform();
                elements.get(i).click();
            } catch (Exception e) {
                extendSession();
                scrollToWebElement(elements.get(i));
                Actions actions = new Actions(driver);
                actions.moveToElement(elements.get(i)).build().perform();
                elements.get(i).click();
            }
        }
    }

    public void clickElementWithOffset(WebElement element, int xOffset, int yOffset) {
        Actions actions = new Actions(driver);
        try {
            actions.moveToElement(element, xOffset, yOffset).build().perform();
        } catch (Exception e) {
        }
    }

    public void clickElementJS(WebElement element) {
        try {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
                scrollToWebElement(element, element.getTagName());
                wait.until(ExpectedConditions.visibilityOf(element));
                wait.until(ExpectedConditions.elementToBeClickable(element));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                //waitForMask();
            } catch (StaleElementReferenceException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void choose(WebElement elementYes, WebElement elementNo, String yesOrNo) throws Throwable {
        if (hasValue(yesOrNo)) {
            if (elementYes.isDisplayed()) {
                if (yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("1")) {
                    try {
                        clickElement(elementYes);
                    } catch (Exception e) {
                        pause(3000);
                        clickElement(elementYes);
                    }
                    //success logger
                } else {
                    try {
                        clickElement(elementNo);
                    } catch (Exception e) {
                        pause(3000);
                        clickElement(elementNo);
                    }
                }
            } else {
                //logger -- the element doesn't exist for this state or so..
            }
        } else {
            //logger - there was nothing in test data, so skipping
        }
    }

    public void checkCheckbox(WebElement element, String checked) throws Throwable {
        if (hasValue(checked)) { //used to skip if test data empty -- meaning if there's no UI field, you should leave test data empty
            if (checked.equalsIgnoreCase("Yes") || checked.equalsIgnoreCase("1")) {
                if (!element.isSelected()) {
                    clickElement(element);
                }
            } else {
                if (element.isSelected()) {
                    clickElement(element);
                }
            }
        }
    }

    public void checkCheckboxes(List<WebElement> elements, int i, String checked) throws Throwable {
        if (hasValue(checked) && elements.size() > 0) {
            if (checked.equalsIgnoreCase("Yes") || checked.equalsIgnoreCase("1")) {
                if (!elements.get(i).isSelected()) {
                    clickElements(elements, i);
                }
            } else {
                if (elements.get(i).isSelected()) {
                    clickElements(elements, i);
                }
            }
        }
    }

    public void typeText(WebElement element, String text) throws Throwable {
        if (hasValue(text)) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            scrollToWebElement(element, element.getTagName());
            clickElement(element);
            element.clear();
            element.sendKeys(text);
            try {
                pause(500);
                element.sendKeys(Keys.ENTER);
                try {
                    element.sendKeys(Keys.TAB);
                } catch (Exception e) {
                    extendSession();
                    element.sendKeys(Keys.ENTER);
                }
            } catch (StaleElementReferenceException e) {
                //
                System.out.println("exception: " + e);
            }
            clickElementWithOffset(element, 30, 30);
        } else {
            //System.out.println("Missing value in Excel, skipping field");
        }
    }

    public void typeTexts(List<WebElement> elements, int i, String text) throws Throwable {
        if (hasValue(text) && elements.size() > 0) {
            clickElements(elements, i);
            elements.get(i).clear();
            elements.get(i).sendKeys(text);
            try {
                elements.get(i).sendKeys(Keys.ENTER);
                elements.get(i).sendKeys(Keys.TAB);
            } catch (Exception ignored) {
                extendSession();
                elements.get(i).sendKeys(Keys.ENTER);
            }
        }
    }

    public void OKTATypeText(WebElement element, String text) throws Throwable {
        if (hasValue(text)) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
            scrollToWebElement(element, element.getTagName());
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            clickElement(element);
            element.clear();
            element.sendKeys(text);
//            try {
//                pause(1000);
//                element.sendKeys(Keys.ENTER);
//                element.sendKeys(Keys.TAB);
//            }catch (StaleElementReferenceException e){
//                //
//                System.out.println("exception: " + e);
//            }
//            clickElementWithOffset(element, 30, 30);
        } else {
            //System.out.println("Missing value in Excel, skipping field");
        }
    }

    public void typeTextToActiveElement(String value, String xpath) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath(xpath)));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void scrollToWebElement(WebElement element, String errMsg) {
        try {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            actions.perform();
            pause(1000);
        } catch (Exception e) {
            System.out.println("Unable to scroll to " + errMsg);
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    public void scrollToWebElement(WebElement element) {
        try {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            actions.perform();
            pause(1000);
        } catch (Exception e) {
            System.out.println("Unable to scroll");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    public void waitForMask() {
        ExpectedCondition<Boolean> xMasked = driver -> !((Boolean) driver.findElement(By.tagName("body")).getAttribute("class").contains("x-masked"));
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME)).until(xMasked);
    }

    public void waitForPreLoadingMask() throws InterruptedException {
        pause(200);
        if (driver.findElements(By.xpath("//*[text()='processing']")).size() != 0) {
            ExpectedCondition<Boolean> processing = driver -> !(driver.findElement(By.xpath("//div[text()='processing']")).isDisplayed());
            new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME)).until(processing);
        }
        ExpectedCondition<Boolean> xMasked = driver -> !((Boolean) driver.findElement(By.tagName("body")).getAttribute("class").contains("x-mask"));
        try {
            new WebDriverWait(driver, Duration.ofSeconds(30)).until(xMasked);
        } catch (Exception e) {
        }
        pause(200);
    }

    public void pause(int ms) throws InterruptedException {
        warningLog("Pausing for " + (ms / 1000) + " sec");
        Thread.sleep(ms);
    }

    public void extendSession() {
        if (driver.findElements(By.xpath("//div[@role='presentation' and @class='x-mask x-border-box']")).size() > 0
                && driver.findElements(By.xpath("//div[@role='presentation' and @class='x-mask x-border-box']")).get(0).isDisplayed()) {
            driver.findElement(By.xpath("//span[@osviewid=\"OS_USER_SESSION_EXTEND_YES\"]")).click();
        }
    }

    public String getText(WebElement element) {
        String text = "";
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            text = element.getText().trim();
        } catch (Exception e) {
            System.out.println("LOG - Tried to get text from " + element.getTagName() + " element");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        return text;
    }

    public void setAttributeValue(WebElement element, String attribute, String value) {
        if (hasValue(value)) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attribute, value);
            } catch (Exception e) {
                System.out.println("LOG - Tried to set " + value + " value to " + attribute + " attribute to " + element.getTagName() + " element");
            }
        }
    }

    public void acceptAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("LOG - Tried to accept an alert");
            System.out.println(e.getMessage());
            e.getStackTrace().toString();
        }
    }
    // SELENIUM ACTIONS - END

    // LOGGING AND REPORTING - START
    public void writePGActionsInFile(String action) throws Exception {
        if (hasValue(action)) {
            File file = new File("results/PageActionsLog.txt");
            if (file.exists()) {
                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(action);
                bw.close();
            } else {
                file.createNewFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(action);
                bw.close();
            }
        }
    }

    public void logPGActions(WebElement element) throws Exception {
        if (hasValue(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("PGActions")) &&
                Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("PGActions").equalsIgnoreCase("Yes")) {
            if (hasValue(element.getText())) {
                writePGActionsInFile(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " - Clicked on: " + element.getText());
                if (hasValue(driver.findElement(By.cssSelector("[osviewid='currentStep']")).getText())) {
                    writePGActionsInFile(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " - PG Action Info: " + driver.findElement(By.cssSelector("[osviewid='currentStep']")).getText());
                }
            }
        }
    }

    public void writePolicyIdsInFile(String policyId) throws Exception {
        File file = new File("results/PolicyIDs.txt");
        if (file.exists()) {
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append("\n").append(policyId);
            bw.close();
        }
    }

    public void writeToExistingFileAppended(String file, String text) {
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(text);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshot(String fileName) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("results/screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reportScreenshot(String screenshotName, String screenshotDesc) {
        if (hasValue(SCREENSHOTS) && SCREENSHOTS.equalsIgnoreCase("Yes")) {
            takeScreenshot(screenshotName);
            Path content = Paths.get("results/screenshots/" + screenshotName + ".png");
            try (InputStream is = Files.newInputStream(content)) {
                Allure.addAttachment(screenshotDesc, is);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void reportTextAttachment(String name, String text) {
        Allure.addAttachment(name, text);
    }

    public void reportPDFAttachment(String name, String fileName) throws IOException {
        File file = new File(fileName);
        InputStream in = new FileInputStream(file);
        Allure.addAttachment(name, "pdf", in, ".pdf");
    }

    public void reportHTMLAttachment(String name, String text) {
        Allure.addAttachment(name, "HTML", text);
    }

    public void reportJSONAttachment(String name, String fileName) throws IOException {
        File file = new File(fileName);
        InputStream in = new FileInputStream(file);
        Allure.addAttachment(name, "application/json", in, ".json");
    }

    // LOGGING AND REPORTING - END

    // NAVIGATION - START
    public boolean goToPage(String page) throws Throwable {
        setImplicitWaitTo(1);
        String xpath = "//a[text()='" + page + "']";
        pause(5000);
        if (isElementPresentByXPath(xpath)) {
            try {
                clickElement(driver.findElement(By.xpath(xpath)), page + " page");
            } catch (Exception e) {
                //Used for staleElement
                pause(3000);
                xpath = "//a[text()='" + page + "']";
                driver.findElement(By.xpath(xpath)).click();
            }
            setImplicitWaitToDefault();
            pause(5000);
            return true;
        } else if (isElementPresentByXPath(xpath + "/..")) {
            clickElement(driver.findElement(By.xpath(xpath + "/..")), page + " page");
            setImplicitWaitToDefault();
            pause(5000);
            return true;
        } else {
            setImplicitWaitToDefault();
            return false;
        }
    }

    public void goToPage(String page, int i) throws Throwable {
        if (i == -1) {
            List<WebElement> pages = driver.findElements(By.xpath("//a[text()='" + page + "']"));
            clickElement(pages.get(pages.size() - 1), page);
        } else {
            clickElement(driver.findElements(By.xpath("//a[text()='" + page + "']")).get(i - 1), page + " page");
        }
    }

    public void navigateToLocation(Map<String, String> data) throws InterruptedException {
        clickElement(driver.findElement(By.xpath("//a[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = translate('" + data.get("City_Name_Txt") + " " + data.get("State") + "', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')]")), "Navigated to location page");
        pause(2500);
        if (driver.findElements(By.xpath("//div[text()='location details']")).size() == 0) {
            clickElement(driver.findElement(By.xpath("//a[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = translate('" + data.get("City_Name_Txt") + " " + data.get("State") + "', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')]")), "Navigated to location page");
            pause(2500);
        }
    }

    public void navigateToPoliciesPage() throws Throwable {
        clickElement(policies);
    }

    public void navigateToQuotesPage() {
        clickElement(quotes, "Quotes page");
    }

    public void navigateToUserSetupPage() throws Throwable {
        clickElement(userSetup);
    }

    public void navigateToHomePage() {
        clickElement(home, "Home");
    }

    public void navigateToRatingLogPage() {
        clickElement(ratingLog, "Rating log");
    }

    public void navigateToPartnersTabPage() throws Throwable {
        clickElement(partners);
    }

    public void navigateToSubRolesPage() throws Throwable {
        clickElement(subRoles);
    }

    public void navigateToUnderwritingReferralsPage() throws Throwable {
        try {
            if (driver.findElements(By.xpath("//div[contains(@id,'osServerErrorWindow')]//*[@data-qtip=\"Close dialog\"]")).size() > 0) {
                clickElement(driver.findElement(By.xpath("//div[contains(@id,'osServerErrorWindow')]//*[@data-qtip=\"Close dialog\"]")), "Close dialog");
            }
        } catch (Exception e) {

        }
        try {
            clickElement(underwritingReferrals);
        } catch (Exception e) {
            clickElement(underwritingAlerts);
        }
        pause(3000);
    }

    public void navigateToTransactionsOrEndorsementsPage() throws Throwable {
        clickElement(policyBreadcrumb);
        clickElement(transactionsOrEndorsements);
    }

    public void navigateToUnderwritingTabPage() throws Throwable {
        clickElement(underwritingTab);
    }

    public void navigateToCustomersPage() throws Throwable {
        clickElement(customers);
    }

    public void navigateToUnderwritingAlertsTab() throws Throwable {
        try {
            clickElement(underwritingAlerts);
        } catch (Exception e) {

        }
        pause(3000);
    }

    public void navigateToPolicyImagePage(String renewalRatedStatus) throws Throwable {
        if (hasValue(renewalRatedStatus) && renewalRatedStatus.equalsIgnoreCase("Yes")) {
            pause(2000);
            clickElement(driver.findElement(By.xpath("//span[text()='update renewal']")));
            pause(2000);
            clickElement(driver.findElements(By.xpath("//div[contains(@class,'treepanel')]//a")).get(0));
            pause(2000);
        } else {
            clickElement(policyImage);
        }
    }

    public void clickPolicyImage() throws Throwable {
        clickElement(policyImage);
    }

    public void navigateToNextPage() throws Throwable {
        clickElement(nextPage);
    }

    public void navigateToHomeownerPolicyPage() throws Throwable {
        try {
            clickElement(homeownerPolicyPage);
        } catch (Exception e) {
            clickElement(homeownerPolicyPage, "Homeowners Policy page");
        }
    }

    public void navigateToHomeSurplusLinesPolicyPage() throws Throwable {
        clickElement(HSPolicyPage);
        pause(3000);
    }

    public void navigateToNewBusinessTransaction(String num) throws Throwable {
        clickElement(newBusinessTransaction.get(Integer.parseInt(num) - 1));
    }

    public void navigateToNewBusinessTransactionSummary() throws Throwable {
        clickElement(newBusinessTransactionSummary);
    }

    public void navigateToNewBusinessRewriteTransaction(String num) throws Throwable {
        clickElement(newBusinessRewriteTransaction.get(Integer.parseInt(num) - 1));
    }

    public void navigateToEndorsementTransaction(String num) throws Throwable {
        clickElement(endorsement.get(Integer.parseInt(num) - 1));
    }

    public void navigateToRenewalTransaction(String num) throws Throwable {
        pause(1000);
        clickElement(renewalTrx.get(Integer.parseInt(num) - 1), "Renewal");
    }

    public void navigateToQuoteDetailsPage() throws Throwable {
        clickElement(quoteDetails, "Quote details");
        pause(3000);
    }

    public void navigateToPremiumPage() throws Throwable {
        clickElement(premium);
    }

    public void navigateToSubjectivitiesPage() throws Throwable {
        clickElement(subjectivities);
    }

    public void navigateToCustomerPage() throws Throwable {
        clickElement(customerLink, "Customer");
    }

    public void navigateToRenewedPremiumPage() throws Throwable {
        clickElement(renewedPremium);
    }

    public void navigateToDocumentsTab() throws Throwable {
        clickElement(documentsTab, "documents");
    }

    public void navigateToCLUEMVRPage() throws Throwable {
        try {
            clickElement(clueMVR);
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='CLUE/MVR reports']")));
        }
    }

    public void navigateToAccountSummaryTab() throws Throwable {
        clickElement(accountSummaryTab);
    }

    public void navigateToCustomerDetailsTab() throws Throwable {
        clickElement(customerDetailsTab);
    }

    public void navigateToMemberFlagTab() throws Throwable {
        clickElement(memberFlagTab);
    }

    public void navigateToPolicyDeliveryPreferencesTab() throws Throwable {
        clickElement(policyDeliveryPreferencesTab);
    }

    public void navigateToBillingDeliveryPreferencesTab() throws Throwable {
        clickElement(billingDeliveryPreferencesTab);
    }

    public void navigateToRequiredFormsTab() throws Throwable {
        clickElement(requiredFormsTab);
    }

    public void navigateToProposalsTab() throws Throwable {
        clickElement(proposalsTab);
    }

    public void navigateToDiaryTab() throws Throwable {
        clickElement(diaryTab);
    }

    public void navigateToHistoryTab() throws Throwable {
        clickElement(historyTab);
    }

    public void navigateToInsuranceScoreManagementTab() throws Throwable {
        try {
            clickElement(insuranceScoreManagementTab);
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='insurance score management']")));
        }
        pause(2000);
    }

    public void navigateToBrokerHistoryTab() throws Throwable {
        clickElement(brokerHistoryTab);
    }

    public void navigateToAccountReferralTab() throws Throwable {
        clickElement(accountReferralTab);
    }

    public void navigateToMiniDiary() throws Throwable {
        try {
            clickElement(miniDiaryTab);
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("a.osDiaryButton ")));
        }
    }

    public void navigateBack() {
        clickElement(back, "Back");
    }
    // NAVIGATION - END

    // ACTION CLICKS - START
    public void actionButtonNext() throws Throwable {
//        clickElement(actionButtonNext, "Action button next");
        /*
            Changed due to Jenkins executions and small screen size
            Method basically gets the current active node and clicks the next one
         */
        List<WebElement> allNodes = driver.findElements(By.xpath("//td[contains(@class, 'current-tree-node')]//a"));
        WebElement currentNode = driver.findElement(By.xpath("//td[contains(@class, ' current-tree-node')]//a"));
        int isMatch = 0;
        for (WebElement node : allNodes) {
            try {
                if (isMatch > 0) {
                    clickElement(node, node.getText());
                    break;
                }
                if (node.getText().equalsIgnoreCase(currentNode.getText())) {
                    isMatch++;
                }
            } catch (Exception e) {
                pause(2000);
                allNodes = driver.findElements(By.xpath("//td[contains(@class, 'current-tree-node')]//a"));
                currentNode = driver.findElement(By.xpath("//td[contains(@class, ' current-tree-node')]//a"));
                int index = allNodes.indexOf(node);

                if (index != -1 && index < allNodes.size()) {
                    node = allNodes.get(index);

                    if (node.getText().equalsIgnoreCase(currentNode.getText())) {
                        isMatch++;
                    }
                }
            }
        }
    }

    public void clickPrevButton() throws InterruptedException {
        clickElement(prev, "Previous");
        pause(3000);
        if (driver.findElements(By.xpath("//a[text()='Driver Assignment']")).size() > 0) {
            clickElement(prev, "Previous");
            pause(3000);
        }
    }

    public void saveChanges() throws Throwable {
        if (driver.findElements(By.xpath("//span[text()='save changes']")).size() > 0) {
            clickElement(saveChanges, "Save changes");
        }
        pause(5000);
    }

    public void clickManualBind() throws Throwable {
        clickElement(manualBind);
    }

    public void clickRate() throws Throwable {
        if (rate.size() <= 0) {
            navigateToQuoteDetailsPage();
            pause(3000);
        }
        clickElement(rate.get(0), "Rate");
    }

    public void clickMoreChangesButton() throws InterruptedException {
        clickElement(moreChanges, "More changes");
        pause(2000);
    }

    public void rateQuote() throws Throwable {
        if (!elementExists(rate)) {
            navigateToQuoteDetailsPage();
        }
        try {
            clickRate();
        } catch (Exception e) {
            clickRate();
        }
    }

    public void extRateQuote() throws Throwable {
        if (!elementExists(extRate)) {
            navigateToQuoteDetailsPage();
        }
        try {
            clickExtRate();
        } catch (Exception e) {
            clickExtRate();
        }
    }

    public void clickExtRate() throws Throwable {
        if (extRate.size() <= 0) {
            navigateToQuoteDetailsPage();
            pause(3000);
        }
        clickElement(extRate.get(0), "ExtRate");
    }

    public void clickNewTransaction() throws Throwable {
        /*try {
            clickElement(cancel, "Cancel");
            clickOK();
        } catch (Exception e) {
            //
        }
        clickElement(newTransaction);*/
        if (isElementDisplayed(cancel)) {
            clickElement(cancel, "Cancel");
            clickOK();
        }
        if (isElementDisplayed(newTransaction, 5)) {
            clickElement(newTransaction);
        }
    }

    public void clickNext() throws InterruptedException {
        clickElement(next, "Next");
    }

    public void clickCreateNewCustomer() {
        if (isElementDisplayed(createNewCustomer, 3))
            clickElement(createNewCustomer, "Create new customer");
    }

    public void clickReviewChanges() throws Throwable {
        clickElement(reviewChanges);
        pause(5000);
    }

    public void clickEndorsementRate() throws Throwable {
        PremiumSummaryPage premiumSummaryPage = new PremiumSummaryPage(driver);
        clickElement(endorsementRate);
        pause(5000);
        if (isElementDisplayed(premiumSummaryPage.grandTotal, 360)) {
            clickElement(premiumSummaryPage.grandTotal, "Rate Wait Test");
        }
    }

    public void clickIssue() throws Throwable {
        clickElement(issue);
        pause(5000);
        try {
            clickElement(ok);
        } catch (Exception e) {
        }
    }

    public void clickModifyOOS() throws Throwable {
        clickElement(modifyOOS);
    }

    public void clickCreateRenewal() throws Throwable {
        pause(5000);
        clickElement(policyBreadcrumb);
        clickElement(createRenewal);
        pause(3000);
    }

    public void clickOK() throws Throwable {
        clickElement(ok);
    }

    public void clickRenewal() throws Throwable {
        clickElement(renewal);
    }

    public void clickProcessRenewal() throws Throwable {
        clickElement(processRenewal, "Process Renewal");
    }

    public void clickProcessPolicyExtension() {
        clickElement(processPolicyExtension, "process policy extension");
    }

    public void clickRenewalTransaction() throws Throwable {
        clickElement(renewalTransaction);
    }

    public void clickAutoProcessRenewal() throws Throwable {
        clickElement(autoProcessRenewal);
    }

    public void clickAutoCreateRenewal() throws Throwable {
        clickElement(autoCreateRenewal);
    }

    public void clickAutoCreateRenewalND() throws Throwable {
        clickElement(autoCreateRenewalND);
    }

    public void clickExitPolicy() throws Throwable {
        clickElement(exitPolicy);
    }

    public void clickExitTransaction() throws Throwable {
        clickElement(exitTransaction);
    }

    public void clickExitCustomer() throws Throwable {
        clickElement(exitCustomer);
    }

    public void clickExit() throws Throwable {
        clickElement(exit);
    }

    public void clickRequestBind() throws Throwable {
        try{
        clickElement(requestBind.get(0), "Request bind");
        pause(3500);
        } catch (Exception e){}
    }

    public void clickBind() throws Throwable {
        clickElement(bind, "Bind");
    }

    public void clickConfirm() throws Throwable {
        clickElement(confirm, "confirm");
    }

    public void clickCancel() throws Throwable {
        clickElement(cancel);
    }

    public void clickRequestIssue() throws Throwable {
        clickElement(requestIssue.get(0));
        pause(3500);
    }

    public void clickReviewReferrals() throws Throwable {
        clickElement(reviewReferrals, "Review Referrals");
    }

    public void clickCreateQuote() throws Throwable {
        clickElement(createQuote);
    }

    public void clickSaveAndExit() throws Throwable {
        clickElement(saveAndExit);
    }

    public void clickObtainOperatorsAndVehicles() throws Throwable {
        clickElements(obtainOperatorsAndVehicles, 0);
        pause(5000);
        if (obtainOperatorsAndVehicles.size() > 0) {
            try {
                clickElements(obtainOperatorsAndVehicles, 0);
            } catch (Exception e) {
                //
            }
        }
        waitForObtainedVehicles();
    }

    private void waitForObtainedVehicles() throws InterruptedException {
        while (true) {
            if (driver.findElements(By.xpath("//span[text()='Cancel']")).size() == 0) {
                break;
            } else {
                pause(5000);
            }
        }
    }

    public void clickPremium() throws Throwable {
        clickElement(premium);
    }

    public void clickCreateRequiredForms() throws Throwable {
        clickElement(createRequiredForms);
    }

    public void clickSendEmailSignature() throws Throwable {
        clickElement(sendEmailSignature);
        pause(3500);
    }

    public void clickSearch() {
        clickElement(search, "Search");
    }

    public void clickProcess() {
        clickElement(process, "Process");
    }

    public void clickCompleteRewriteTransaction() {
        clickElement(completeRewriteTransaction, "Complete rewrite transaction");
    }

    public void navigateToPremiumDetails() {
        clickElement(premiumDetails, "Premium details");
    }

    public void returnToPremiumSummaryPage() {
        clickElement(returnToPremiumSummaryPage, "Return to premium summary page");
    }

    public void clickExtendPolicy() {
        clickElement(extendPolicy, "Extend Policy");
    }

    public void clickRenewedPremium() {
        clickElement(renewedPremium, "Renewed premium");
    }

    public void clickCreateApplication() {
        clickElement(createApplication, "Create application");
    }

    public void clickEndSubmissionButton() {
        clickElement(endSubmission, "End Submission");
    }
    // ACTION CLICKS - END

    // TODO GO THROUGH THE METHODS UNSORTED
    public void getAutoClueReports() throws Throwable {
        goToPage("Operator Information");
        pause(3000);
        String memberAddress = "";
        String orderDate = "";
        String receivedDate = "";
        String orderBy = "";
        String pendingStatus = "";


        if (driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[1]/div")).size() > 0) {
            memberAddress = driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[1]/div")).get(0).getText();
        } else {
            memberAddress = "Not found";
        }

        if (driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[2]/div")).size() > 0) {
            orderDate = driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[2]/div")).get(0).getText();
        } else {
            orderDate = "Not found";
        }

        if (driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[3]/div")).size() > 0) {
            receivedDate = driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[3]/div")).get(0).getText();
        } else {
            receivedDate = "Not found";
        }

        if (driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[4]/div")).size() > 0) {
            orderBy = driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[4]/div")).get(0).getText();
        } else {
            orderBy = "Not found";
        }

        if (driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[5]/div")).size() > 0) {
            pendingStatus = driver.findElements(By.xpath("//div[@data-qtip='CLUE request member and address']/../../../../../div[2]//td[5]/div")).get(0).getText();
        } else {
            pendingStatus = "Not found";
        }

        reportTextAttachment("ES Auto CLUE - " + pendingStatus,
                "Member Address: " + memberAddress +
                        "\nOrder Date: " + orderDate +
                        "\nReceived Date: " + receivedDate +
                        "\nOrder By: " + orderBy +
                        "\nPending Status: " + pendingStatus);

        reportScreenshot("ES_Auto_CLUE_Screenshot", "ES Auto CLUE - Screenshot");
    }

    public void callAndGetNADAResults(Map<String, String> data) throws Throwable {
        goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
        pause(5000);
        if (elementExists(driver.findElements(By.xpath("//div[text()='vessel']")))) {
            WebElement vesselBlock = driver.findElements(By.xpath("//div[text()='vessel']")).get(0);
            vesselBlock.click();
        }

        driver.switchTo().frame("vesselIframe");
        List<WebElement> year = driver.findElements(By.xpath("//input[@ng-model='year']"));
        List<WebElement> nadaMake = driver.findElements(By.xpath("//select[@ng-model='make']"));
        List<WebElement> nadaModel = driver.findElements(By.xpath("//select[@ng-model='modelTrim']"));
        List<WebElement> nadaEngine = driver.findElements(By.xpath("//select[@ng-model='options']"));
        List<WebElement> nadaResult = driver.findElements(By.xpath("//td[contains(@ng-bind,'|currency')]"));
        pause(5000);

        if (elementExists(nadaMake)) {
            nadaMake.get(0).click();
            pause(1000);
            selectByText(nadaMake.get(0), data.get("NADA_Manufacturer"));
            pause(1000);
            year.get(0).click();
        } else {
            System.out.println("No element make present...");
        }
        if (elementExists(nadaModel)) {
            pause(5000);
            nadaModel.get(0).click();
            pause(1000);
            selectByText(nadaModel.get(0), data.get("NADA_Model"));
            pause(1000);
            year.get(0).click();
        }
        if (elementExists(nadaEngine)) {
            pause(5000);
            nadaEngine.get(0).click();
            pause(1000);
            selectByText(nadaEngine.get(0), data.get("NADA_Engine"));
            pause(1000);
            year.get(0).click();
        }
        if (elementExists(nadaResult)) {
            pause(5000);
            reportTextAttachment("NADA PW Integration - " + nadaResult.get(0).getText(), "Hull and Machinery Market Value: " + nadaResult.get(0).getText());
            reportScreenshot("NADA_PW_Integration_Screenshot_" + System.currentTimeMillis(), "NADA PW Integration - Screenshot");
        } else {
            reportTextAttachment("NADA PW Integration - Not Found", System.currentTimeMillis() + "_Not found");
            reportScreenshot("NADA_PW_Integration_Screenshot", "NADA PW Integration - Screenshot");
        }
        driver.switchTo().parentFrame();
    }

    /**
     * The method does two steps.
     * First, goes to Customer > insurance score management > takes the screenshot and attaches to Report
     * Second, the Policy Info page > block Credit Score > gets the info and attaches to Report
     *
     * @param data Access the data from Excel
     */
    public void getCreditScoreReports(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("CA")) {
            pause(1000);
            clickElement(driver.findElements(By.xpath("//span[contains(text(), 'Customer:')]")).get(0));
            clickElement(driver.findElements(By.xpath("//span[contains(text(), 'insurance score')]")).get(0));
            pause(3000);
            reportScreenshot("Insurance_Score_Management", "Customer > insurance score management");
            pause(1000);
            clickElement(driver.findElements(By.xpath("//span[text()='summary']")).get(0));
            new SummaryPage(driver).clickQuoteLink();
            pause(1000);
            navigateToQuoteDetailsPage();

            switch (data.get("Admitted_Line")) {
                case "Personal Auto": {
                    goToPage("Automobile Policy");
                    creditScoreQuoteLevel();
                }
                break;
                case "Homeowner": {
                    goToPage("Homeowners Policy");
                    creditScoreQuoteLevel();
                }
                break;
                case "Personal Watercraft": {
                    goToPage("Watercraft Policy");
                    creditScoreQuoteLevelPW();
                }
                break;
                case "Collection": {
                    goToPage("Collections");
                    creditScoreQuoteLevel();
                }
                break;
                case "Excess Liability": {
                    goToPage("Excess Liability Policy");
                    //only IL state after June 11th
                    if (data.get("Admitted_Or_Surplus").equalsIgnoreCase("Admitted")) {
                        if (data.get("State").equalsIgnoreCase("IL")) {
                            creditScoreQuoteLevel();
                        }
                    } else {
                        creditScoreQuoteLevel();
                    }

                }
                break;
                case "Home Surplus Lines": {
                    goToPage("Home Surplus Lines Policy");
                    creditScoreQuoteLevel();
                }
                break;
            }


        }

    }

    public void creditScoreQuoteLevel() {
        String insuranceScoreType = "";
        String applicantInsuranceScore = "";
        String datePulled = "";
        String insuranceScoreForRating = "";
        String attractOneScore = "";
        String attractOneTier = "";

        List<WebElement> insuranceScoreTypeElement = driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[1]/div"));
        List<WebElement> applicantInsuranceScoreElement = driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[2]/div"));
        List<WebElement> datePulledElement = driver.findElements(By.xpath("//div[@data-qtip='Insurance Score Type']/../../../../../div[2]//td[3]/div"));
        List<WebElement> insuranceScoreForRatingElement = driver.findElements(By.xpath("//div[text()='Insurance Score for Rating']/../../../..//input"));
        List<WebElement> attractOneScoreElement = driver.findElements(By.xpath("//div[text()='Attract One Score']/../../../..//input"));
        List<WebElement> attractOneTierElement = driver.findElements(By.xpath("//div[text()='Attract One Tier']/../../../..//input"));

        if (elementExists(insuranceScoreTypeElement)) {
            insuranceScoreType = insuranceScoreTypeElement.get(0).getText();
            applicantInsuranceScore = applicantInsuranceScoreElement.get(0).getText();
            datePulled = datePulledElement.get(0).getText();

            if (elementExists(insuranceScoreForRatingElement)) {
                insuranceScoreForRating = insuranceScoreForRatingElement.get(0).getAttribute("value");
            }

            reportScreenshot("Credit_Score_Quote", "Quote > Credit Score");

            if (elementExists(attractOneScoreElement)) {
                attractOneScore = attractOneScoreElement.get(0).getAttribute("value");
                attractOneTier = attractOneTierElement.get(0).getAttribute("value");
                reportTextAttachment("Credit Score - " + applicantInsuranceScore,
                        "Insurance Score Type: " + insuranceScoreType +
                                "\nApplicant Insurance Score: " + applicantInsuranceScore +
                                "\nDate Pulled: " + datePulled +
                                "\nAttract One Score: " + attractOneScore +
                                "\nAttract One Tier: " + attractOneTier);
            } else {
                reportTextAttachment("Credit Score - " + applicantInsuranceScore,
                        "Insurance Score Type: " + insuranceScoreType +
                                "\nApplicant Insurance Score: " + applicantInsuranceScore +
                                "\nDate Pulled: " + datePulled +
                                "\nInsurance Score For Rating: " + insuranceScoreForRating);
            }

        } else {
            reportScreenshot("Credit_Score_Quote_Not_Found", "Quote > Credit Score - Not Found");
            reportTextAttachment("Credit Score - " + applicantInsuranceScore,
                    "Insurance Score Type: " + insuranceScoreType +
                            "\nApplicant Insurance Score: " + applicantInsuranceScore +
                            "\nDate Pulled: " + datePulled);
        }
    }

    public void creditScoreQuoteLevelPW() {
        String appInsuranceScore = "";
        String ratingTier = "";
        List<WebElement> appInsuranceScoreElement = driver.findElements(By.xpath("//div[text()='Applicant Insurance Score']/../../../..//input"));
        List<WebElement> ratingTierElement = driver.findElements(By.xpath("//div[text()='Rating Tier']/../../../..//input"));
        if (elementExists(appInsuranceScoreElement)) {
            appInsuranceScore = appInsuranceScoreElement.get(0).getAttribute("value");
        }
        if (elementExists(ratingTierElement)) {
            ratingTier = ratingTierElement.get(0).getAttribute("value");
        }

        reportScreenshot("Credit_Score_Quote", "Quote > Credit Score");
        reportTextAttachment("Credit Score - " + appInsuranceScore,
                "Applicant Insurance Score: " + appInsuranceScore +
                        "\nRating Tier: " + ratingTier);


    }

    /**
     * Choosing an option in Select by text
     *
     * @param element
     * @param optionText
     */
    public void selectByText(WebElement element, String optionText) throws Throwable {
        if (hasValue(optionText)) {
            Select select = new Select(element);
            select.selectByVisibleText(optionText);
        }
    }

    public void orderPropertyDetails() throws Throwable {
        try {
            clickElement(orderPropertyDetails);
            pause(25000);
        } catch (Exception e) {
        }
    }

    /**
     * Downloading
     */
    public void fileDownload(WebElement downloadLink) throws IOException, InterruptedException {
        Random r = new Random();
        int rand = r.nextInt(20);
        int tabSizeBeforeClickingDownload = driver.getWindowHandles().size();
        String downloadFileName = "";

        pause((rand + 1) * 1000);

        clickElement(downloadLink, downloadLink.getText());

        pause(5000);

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        if (tabs.size() > tabSizeBeforeClickingDownload) {
            pause(10000);
        }
        if (driver.findElements(By.xpath("//div[contains(text(),'Please wait while your documents are being generated')]")).size() > 0) {
            pause(20000);
        }

        if (BROWSER.equalsIgnoreCase("CHROME_H")) {
            pause(16000);
            try {
                downloadFileName = CustomFileUtils.getLatestDownloadedFileName(System.getProperty("user.dir") + "/results/downloads/" + DriverManager.getInstance() + "/");
            } catch (RuntimeException e) {
                clickElement(downloadLink, downloadLink.getText());
                pause(8000);
                downloadFileName = CustomFileUtils.getLatestDownloadedFileName(System.getProperty("user.dir") + "/results/downloads/" + DriverManager.getInstance() + "/");
            }
        } else {
            ((JavascriptExecutor) driver).executeScript("window.open('about:blank', '-blank')");
            tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(tabs.size() - 1));
            driver.get("chrome://downloads/");

            pause(16000);

            Shadow shadow = new Shadow(driver);
            List<WebElement> root = shadow.findElements("#file-link");
            downloadFileName = root.get(0).getText();

            driver.close();
            tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(tabs.size() - 1));
        }

        try {
            reportPDFAttachment(downloadFileName, System.getProperty("user.dir") + "/results/downloads/" + DriverManager.getInstance() + "/" + downloadFileName.replace(" - ", " - "));
        } catch (Exception e) {
            try {
                reportPDFAttachment(downloadFileName, System.getProperty("user.dir") + "/results/downloads/" + DriverManager.getInstance() + "/" + downloadFileName.replace(" (", "  ("));
            } catch (Exception ee) {
                try {
                    reportPDFAttachment(downloadFileName, System.getProperty("user.dir") + "/results/downloads/" + DriverManager.getInstance() + "/" + downloadFileName.replace("Excess ", "Excess  "));
                } catch (Exception eee) {
                    try {
                        reportPDFAttachment(downloadFileName, System.getProperty("user.dir") + "/results/downloads/" + DriverManager.getInstance() + "/" + downloadFileName);
                    } catch (Exception eeee) {
                        reportPDFAttachment(downloadFileName, System.getProperty("user.dir") + "/results/downloads/" + DriverManager.getInstance() + "/" + CustomFileUtils.getFirstFileName("/results/downloads/" + DriverManager.getInstance() + "/", downloadFileName.trim().substring(0, 2)));
                    }
                }
            }
        }
    }

    public void clickQuoteProposal() throws Throwable {
        try {
            clickElement(quoteProposal);
        } catch (Exception r) {
            clickElement(quoteProposalSurplus);
        }
        pause(3500);
    }

    public String getUserSessionId() {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(footer).click().keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("L").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
            pause(2000);
            WebElement usid = driver.findElement(By.xpath("//div[@class='x-toolbar-text x-status-text ready-icon x-box-item x-toolbar-item x-toolbar-text-default']"));
            String text = usid.getText();
            pause(500);

            List<WebElement> closeButtons = driver.findElements(By.xpath("//div[@class='x-tool-tool-el x-tool-img x-tool-close ']"));
            for (WebElement button : closeButtons) {
                if (button.isDisplayed() && button.isEnabled()) {
                    clickElement(button, "visible and clickable close button");
                    break;
                }
            }
            return extractSessionID(text);
        } catch (Exception e) {
            return "Failed to get User Session Id -- error: " + e;
        }
    }

    public String getCurrentObjectId() {
        try {
            pause(3000);
            Actions actions = new Actions(driver);
            actions.moveToElement(footer).click().keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("L").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
            pause(3000);
            WebElement usid = driver.findElement(By.xpath("//div[@class='x-toolbar-text x-status-text ready-icon x-box-item x-toolbar-item x-toolbar-text-default']"));
            String text = usid.getText();
            pause(500);
            clickElement(driver.findElement(By.xpath("//div[text()=('Diagnostics')]//..//..//..//..//div[@class='x-tool-tool-el x-tool-img x-tool-close ' and @ role= 'presentation']")), "close button");
            return extractCurrentObjectID(text);
        } catch (Exception e) {
            return "Failed to get Current Object Id -- error: " + e;
        }
    }

    private static String extractSessionID(String text) {
        String prefix = "session:";
        String suffix = ",";
        int startIndex = text.indexOf(prefix);
        if (startIndex != -1) {
            startIndex += prefix.length();
            int endIndex = text.indexOf(suffix, startIndex);
            if (endIndex != -1) {
                return text.substring(startIndex, endIndex).trim();
            }
        }
        return null;
    }

    private static String extractCurrentObjectID(String text) {
        String prefix = "object: ";
        String suffix = "";
        int startIndex = text.indexOf(prefix);
        if (startIndex != -1) {
            startIndex += prefix.length();
            int endIndex = text.length();
            if (endIndex != -1) {
                return text.substring(startIndex, endIndex).trim();
            }
        }
        return null;
    }

    public void clickQuoteSummaryPage() throws Throwable {
        clickElement(quoteSummary);
    }

    public String formatNum(String num) {
        double doubleNum = Double.parseDouble(num);
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return formatter.format(doubleNum).replace(".00", "");
    }

    public boolean isVisibleOnly(By locator) throws Throwable {
        boolean flag;
        try {
            if (driver.findElements(locator).size() > 0) {
                flag = driver.findElements(locator).get(0).isDisplayed();
            } else {
                flag = false;
            }
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean elementExists(List<WebElement> element) {
        try {
            return element.size() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public String updateXpath(String xpath, String updateValue) {
        return xpath.replace("$", updateValue);
    }

    public boolean hasValue(String data) {
        try {
            return !data.equals("") && !data.equals(" ");
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isYes(String data) {
        try {
            return !data.equals("") && !data.equals(" ") && data.equalsIgnoreCase("Yes");
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Call this method if you want to dynamically populate any type of grid
     *
     * @param blockTitle        Name of the block that's used to identify the grid
     * @param mdFillableColumns Comma separated values of  TEST DATA columns -- "NI_Name_Insured,,NI_First_Name,,NI_Last_Name,,,," -- must match!
     * @param gridRowsCount     Number of rows that should be populated
     */
    public void fillGridDynamically(Map<String, String> data, String blockTitle, String mdFillableColumns, int gridRowsCount) throws Throwable {
//        example of mdFillableColumns = "NI_Name_Insured,,NI_First_Name,,NI_Last_Name,,,," -- must match
        WebElement tempColumn;
        String[] mdColumnsArray;
        mdColumnsArray = mdFillableColumns.split(",");
        String ENV = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ENV");

        for (int j = 1; j <= gridRowsCount; j++) {
            if (!checkIfAllSameIndexPositionsAreEmpty(mdColumnsArray, data, j)) {
                //looping through the columns in the row
                for (int i = 0; i < mdColumnsArray.length; i++) {
                    if (mdColumnsArray[i] != null && !mdColumnsArray[i].trim().equalsIgnoreCase("")) {
                        tempColumn = driver.findElements(By.xpath(columnIndex(blockTitle, j, i + 1))).get(0);
                        String columnValue = data.get(mdColumnsArray[i]).split(",")[j - 1].trim();
                        if (mdColumnsArray[i].contains("Agreed_Value")) {
                            if (data.get(mdColumnsArray[i]).split(",")[j - 1].equalsIgnoreCase("Yes")) {
                                if (ENV.contains("TRUE")) {
                                    tempColumn = driver.findElements(By.xpath(columnIndex(blockTitle, j, i) + "/input[2]")).get(0);
                                } else {
                                    tempColumn = driver.findElements(By.xpath(columnIndex(blockTitle, j, i + 1) + "/input[2]")).get(0);
                                }
                            } else {
                                if (ENV.contains("TRUE")) {
                                    tempColumn = driver.findElements(By.xpath(columnIndex(blockTitle, j, i) + "/input[1]")).get(0);

                                } else {
                                    tempColumn = driver.findElements(By.xpath(columnIndex(blockTitle, j, i + 1) + "/input[1]")).get(0);
                                }
                            }
                            try {
                                typeText(driver.switchTo().activeElement(), columnValue);
                                clickElement(tempColumn);
                            } catch (Exception e) {
                                clickElement(tempColumn);
//                                typeText(driver.switchTo().activeElement(), columnValue);
                            }
                        } else {
                            if (!mdColumnsArray[i].contains("Appraisal_Date")) { //TODO appraisal date is a read only now..
                                try {
                                    pause(2000);
                                    typeText(driver.switchTo().activeElement(), columnValue);
                                } catch (Exception e) {
                                    clickElement(tempColumn);
                                    typeText(driver.switchTo().activeElement(), columnValue);
                                }
                            }
                        }
                        pause(2000);
                    }
                }
            }
        }
    }

    public String columnIndex(String blockTitle, int rowIndex, int colIndex) {
        return "//div[contains(text()," + "'" + blockTitle + "'" + ")]/../../../../../../div[2]/div[2]//table[" + rowIndex + "]//tr//td[" + colIndex + "]/div";
    }

    public boolean checkIfAllSameIndexPositionsAreEmpty(String[] mdColumnsArray, Map<String, String> data, int n) {
        int counter = 0;
        for (String s : mdColumnsArray) {
            if (("").equals(s) || ("").equals(data.get(s).split(",")[n - 1])) {
                counter += 1;
            }
        }
        return counter == mdColumnsArray.length;
    }

    public boolean isRenewalPolicyExtensionProcessable() throws InterruptedException {
        pause(2000);
        return elementExists(driver.findElements(By.xpath("//span[text()='This transaction can not be processed. The effective date is greater than 90 days from the current date.']"))) ||
                elementExists(driver.findElements(By.xpath("//span[text()='This transaction can not be processed. The effective date is greater than 100 days from the current date.']")));
    }
    // TODO UNSORTED ^^^

    // REFACTORED METHODS 04/2023 - START
    public void clickElement(WebElement element, String log) {
        infoLog("Starting to click element: " + log);

        // Wait for element to be visible and clickable
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(WAIT_TIME))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class);

        // Check if element is visible and clickable before scrolling to it
        WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(visibleElement));

        // Retry click up to 3 times
        boolean clicked = false;
        int retryCount = 0;
        while (!clicked && retryCount < 3) {
            try {
                hoverElement(clickableElement, log);
                clickableElement.click();
                clicked = true;
                infoLog("Element clicked successfully: " + log);
            } catch (Exception e) {
                retryCount++;
                warningLog("Element click failed (Attempt " + retryCount + "): " + log);
            }
        }

        // Log if click still fails
        if (!clicked) {
            errorLog("Element click failed after 3 attempts: " + log);
            try {
                infoLog("Retry with java script click element: " + log);
                clickElementJS(element);
            } catch (Exception e) {
            }
        }

        // Wait after click for any related actions or events to complete
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void typeText(WebElement element, String text, String log) {
        if (hasValue(text)) {
            infoLog("Starting to type: " + text + " to element: " + log);

            // Wait for element to be visible and clickable
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(WAIT_TIME))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(StaleElementReferenceException.class);

            WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
            WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(visibleElement));

            // Retry typing up to 3 times
            boolean typed = false;
            int retryCount = 0;
            while (!typed && retryCount < 3) {
                try {
                    // Clear existing text (if any) and type new text
                    try {
                        clickableElement.clear();
                    } catch (Exception clear) {
                        infoLog("Clearing of text from element failed: " + log);
                    }
                    clickableElement.sendKeys(text);
                    typed = true;
                    infoLog("Text: " + text + " typed successfully to element: " + log);
                } catch (Exception e) {
                    retryCount++;
                    warningLog("Text typing failed (Attempt " + retryCount + ") for: " + log);
                }
            }

            // Log if typing still fails
            if (!typed) {
                errorLog("Text: " + text + " typing failed after 3 attempts: " + log);
            }

            // Wait after type for any related actions or events to complete
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            warningLog("No data found to type for: " + log);
        }
    }

    public void typeTextEnter(WebElement element, String text, String log) {
        if (hasValue(text)) {
            infoLog("Starting to type: " + text + " to element: " + log);

            // Wait for element to be visible and clickable
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(WAIT_TIME))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(StaleElementReferenceException.class);

            WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
            WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(visibleElement));

            // Retry typing up to 3 times
            boolean typed = false;
            int retryCount = 0;
            while (!typed && retryCount < 3) {
                try {
                    // Clear existing text (if any) and type new text
                    clickableElement.clear();
                    clickableElement.sendKeys(text);
                    clickableElement.sendKeys(Keys.ENTER);
                    typed = true;
                    infoLog("Text: " + text + " typed successfully to element: " + log + " - With enter key pressed");
                } catch (Exception e) {
                    retryCount++;
                    warningLog("Text typing failed (Attempt " + retryCount + ") for: " + log);
                }
            }

            // Log if typing still fails
            if (!typed) {
                errorLog("Text: " + text + " typing failed after 3 attempts: " + log);
            }

            // Wait after type for any related actions or events to complete
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            warningLog("No data found to type for: " + log);
        }
    }

    public void choose(WebElement elementYes, WebElement elementNo, String yesOrNo, String log) throws Throwable {
        if (hasValue(yesOrNo)) {
            if (ENV.contains("DEV2")) {
                pause(15000);
            }
            if (yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("1")) {
                clickElement(elementYes, log + " Yes");
            } else {
                clickElement(elementNo, log + " No");
            }
        } else {
            warningLog("No data found to choose for: " + log);
        }
    }

    public void checkCheckbox(WebElement element, String checked, String log) throws Throwable {
        if (hasValue(checked)) {
            if (checked.equalsIgnoreCase("Yes") || checked.equalsIgnoreCase("1")) {
                if (!element.isSelected()) {
                    clickElement(element, log + " Checked");
                }
            } else {
                if (element.isSelected()) {
                    clickElement(element, log + " Unchecked");
                }
            }
        } else {
            warningLog("No data found to check for: " + log);
        }
    }

    public String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        return now.format(formatter);
    }

    public void hoverElement(WebElement element, String log) {
        infoLog("Starting to hover over element: " + log);

        // Wait for element to be visible and clickable
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(WAIT_TIME))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class);

        WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(visibleElement));

        // Hover over the element
        Actions actions = new Actions(driver);
        actions.moveToElement(clickableElement).build().perform();

        // Wait for element to be displayed on the page
        wait.until(ExpectedConditions.visibilityOf(visibleElement));

        infoLog("Element successfully hovered over: " + log);

        // Wait after hover for any related actions or events to complete
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementPresentByXPath(String xpath) {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        }
    }

    // LOGS
    public void infoLog(String message) {
        System.out.println(getCurrentDateTime() + " - " + message);
    }

    public void warningLog(String message) {
        System.out.println("\033[33m" + getCurrentDateTime() + " - " + message + "\033[0m");
    }

    public void errorLog(String message) {
        System.out.println("\033[31m" + getCurrentDateTime() + " - " + message + "\033[0m");
    }

    public void successLog(String message) {
        System.out.println("\033[32m" + getCurrentDateTime() + " - " + message + "\033[0m");
    }

    //ASSERTS
    public void assertCellValue(WebElement element, String value, String log) {
        if ((hasValue(ASSERTIONS) && ASSERTIONS.equalsIgnoreCase("Yes")) || !hasValue(ASSERTIONS)) {
            boolean hasValue = hasValue(value);
            if (hasValue) {
                scrollToWebElement(element);
                if (SOFT_ASSERT.equalsIgnoreCase("Yes")) {
                    if (value.equalsIgnoreCase("Empty")) {
                        SoftAssertion.assertEquals(element.getAttribute("value"), "");
                        successLog("Expected  " + log + "  to be: " + value);
                    } else if (value.equalsIgnoreCase("NotEmpty")) {
                        SoftAssertion.assertTrue(hasValue(element.getAttribute("value")));
                        successLog("Expected  " + log + "  to be: " + value);
                    } else if (value.equalsIgnoreCase("Null")) {
                        SoftAssertion.assertNull(element.getAttribute("value"));
                        successLog("Expected  " + log + "  to be: " + value);
                    } else if (value.equalsIgnoreCase("Skip")) {
                        warningLog("Validation for: " + log + " skipped!");
                    } else if (value.contains("NotHasValue:")) {
                        SoftAssertion.assertTrue(!element.getAttribute("value").contains(value.split(":")[1]), "Value expected not to be found: " + value.split(":")[1]);
                        successLog("Expected  " + log + "  to be: " + value);
                    } else {
                        SoftAssertion.assertEquals(element.getAttribute("value"), value);
                        successLog("Expected  " + log + "  to be: " + value);
                    }
                } else {
                    if (value.equalsIgnoreCase("Empty")) {
                        Assert.assertEquals(element.getAttribute("value"), "", log);
                        successLog("Expected  " + log + "  to be: " + value);
                    } else if (value.equalsIgnoreCase("NotEmpty")) {
                        Assert.assertTrue(hasValue(element.getAttribute("value")), log);
                        successLog("Expected  " + log + "  to be: " + value);
                    } else if (value.equalsIgnoreCase("Null")) {
                        Assert.assertNull(element.getAttribute("value"), log);
                        successLog("Expected  " + log + "  to be: " + value);
                    } else if (value.equalsIgnoreCase("Skip")) {
                        warningLog("Validation for: " + log + " skipped!");
                    } else if (value.contains("NotHasValue:")) {
                        Assert.assertFalse(element.getAttribute("value").contains(value.split(":")[1]), "Value expected not to be found: " + value.split(":")[1]);
                        successLog("Expected  " + log + "  to be: " + value);
                    } else {
                        Assert.assertEquals(element.getAttribute("value"), value, log);
                        successLog("Expected  " + log + "  to be: " + value);
                    }
                }
            } else {
                warningLog("Validation for: " + log + " skipped!");
            }
        } else {
            warningLog("Validation are turned off!");
        }
    }

    public void assertContains(String actual, String expected, String log) {
        if ((hasValue(ASSERTIONS) && ASSERTIONS.equalsIgnoreCase("Yes")) || !hasValue(ASSERTIONS)) {
            if (hasValue(expected)) {
                if (SOFT_ASSERT.equalsIgnoreCase("Yes")) {
                    if (expected.equalsIgnoreCase("Skip")) {
                        warningLog("Validation for: " + log + " skipped!");
                    } else {
                        SoftAssertion.assertTrue(actual.contains(expected));
                        successLog("Expected  " + expected + "  to be contained in: " + log);
                    }
                } else {
                    if (expected.equalsIgnoreCase("Skip")) {
                        warningLog("Validation for: " + log + " skipped!");
                    } else {
                        Assert.assertTrue(actual.contains(expected), log);
                        successLog("Expected  " + expected + "  to be contained in: " + log);
                    }
                }
            } else {
                warningLog("Validation for: " + log + " skipped!");
            }
        } else {
            warningLog("Validation are turned off!");
        }
    }

    public void assertEquals(String actual, String expected, String log) {
        if ((hasValue(ASSERTIONS) && ASSERTIONS.equalsIgnoreCase("Yes")) || !hasValue(ASSERTIONS)) {
            boolean hasValue = hasValue(expected);
            if (hasValue) {
                if (SOFT_ASSERT.equalsIgnoreCase("Yes")) {
                    if (expected.equalsIgnoreCase("Skip")) {
                        warningLog("Validation for: " + log + " skipped!");
                    } else if (expected.equalsIgnoreCase("Not Empty")) {
                        SoftAssertion.assertTrue(hasValue(actual));
                    } else {
                        if (expected.equalsIgnoreCase("Empty")) {
                            expected = "";
                        }
                        SoftAssertion.assertEquals(actual, expected);
                        successLog("Expected " + expected + " to be equal to: " + actual + " for: " + log);
                    }
                } else {
                    if (expected.equalsIgnoreCase("Skip")) {
                        warningLog("Validation for: " + log + " skipped!");
                    } else if (expected.equalsIgnoreCase("Not Empty")) {
                        Assert.assertTrue(hasValue(actual));
                    } else {
                        if (expected.equalsIgnoreCase("Empty")) {
                            expected = "";
                        }
                        Assert.assertEquals(actual, expected, log);
                        successLog("Expected " + expected + " to be equal to: " + actual + " for: " + log);
                    }
                }
            } else {
                warningLog("Validation for: " + log + " skipped!");
            }
        } else {
            warningLog("Validation are turned off!");
        }
    }

    public void assertRadio(WebElement element1, WebElement element2, String value, String log) {
        if ((hasValue(ASSERTIONS) && ASSERTIONS.equalsIgnoreCase("Yes")) || !hasValue(ASSERTIONS)) {
            boolean hasValue = hasValue(value);
            if (hasValue) {
                if (value.equalsIgnoreCase("Empty")) {
                    Assert.assertNull(element1.getAttribute("checked"));
                    successLog("Expected radio Yes for " + log + " not to be selected");
                    Assert.assertNull(element2.getAttribute("checked"));
                    successLog("Expected radio No for " + log + " not to be selected");
                } else if (value.equalsIgnoreCase("Yes")) {
                    Assert.assertEquals(element1.getAttribute("checked"), "checked");
                    successLog("Expected radio Yes for " + log + " to be selected");
                } else if (value.equalsIgnoreCase("No")) {
                    Assert.assertEquals(element2.getAttribute("checked"), "checked");
                    successLog("Expected radio No for " + log + " to be selected");
                } else if (value.equalsIgnoreCase("Skip")) {
                    warningLog("Validation for: " + log + " skipped!");
                }
            } else {
                warningLog("Validation for: " + log + " skipped!");
            }
        } else {
            warningLog("Validation are turned off!");
        }
    }

    //UTILS
    public String generateXpath(String template, String value) {
        if (template == null || value == null || !template.contains("$")) {
            throw new IllegalArgumentException("Invalid template or value");
        }

        if (value.contains("'") && !value.contains("\"")) {
            return template.replace("$", "\"" + value + "\"");
        }

        if (value.contains("\"") && !value.contains("'")) {
            return template.replace("$", "'" + value + "'");
        }

        if (value.contains("'") && value.contains("\"")) {
            String[] parts = value.split("\"");
            StringBuilder valueBuilder = new StringBuilder("concat('");
            for (int i = 0; i < parts.length; i++) {
                valueBuilder.append(parts[i]);
                if (i < parts.length - 1) {
                    valueBuilder.append("', '\"', '");
                }
            }
            valueBuilder.append("')");
            return template.replace("$", valueBuilder.toString());
        }

        return template.replace("$", "'" + value + "'");
    }

    public void assertStateMandatedAssessmentsInclude(String text) {
        Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'State Mandated Assessments Include')]")).getText(), text);
    }

    public void navigateToPremiumSummaryPage() {
        clickElement(premiumSummary, "Premium Summary");
    }

    public void clickReturnToPremiumSummaryPage() {
        clickElement(returnToPremiumSummary, "Return To Premium Summary Page");
    }

    public void navigateToPreviousPage() {
        clickElement(prev, "Previous page");
    }

    public void clickDropdownElement(String element) throws Throwable {
        List<WebElement> dropdowns;

        switch (element) {
            case "Personal Liability Coverage Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Soft Costs Coverage Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[2]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Earthquake Extension Deductible": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Deductible']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Contents Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Contents Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Loss of Use": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Loss of Use']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Loss Assessment Coverage": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Loss Assessment Coverage']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Loss Assessment Deductible": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Loss Assessment Deductible']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Excess Flood Loss of Use": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Excess Flood Loss of Use']/../../../../../../../../../../../td[3]/div//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Current Homeowners Insurance Carrier": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Current Homeowners Insurance Carrier']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "AOP Deductible": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='AOP Deductible']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "AOP Ded": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='AOP Ded']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Hurricane Deductible": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Hurricane Deductible']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Residence Type": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Residence Type']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "WF Deductible": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='WF Deductible']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Fire Peril Sublimit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Fire Peril Sublimit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Personal Liability Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Personal Liability Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Named Insured Type": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Named Insured Type']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Standardized Address": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Standardized Address']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Construction Type": {
                dropdowns = driver.findElements(By.xpath("//font[contains(text(),'Construction Type')]/../../../../../../..//div[2]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Exterior Wall Coverings": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Exterior Wall Coverings']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Protection Class": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Protection Class']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Protection Class Override": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Protection Class Override']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Distance to Coast override": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Distance to Coast override']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Foundation Type": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Foundation Type']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Roof Shape": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Roof Shape']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Roof Shape Font": {
                dropdowns = driver.findElements(By.xpath("//font[contains(text(),'Roof Shape')]/../../../../../../..//div[2]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Roof Covering": {
                dropdowns = driver.findElements(By.xpath("//font[contains(text(),'Roof Covering')]/../../../../../../..//div[2]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Secondary Water Resistance": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Secondary Water Resistance']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Water Leak Detection System": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Water Leak Detection System']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Roof Wall Connection": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Roof Wall Connection']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Opening Protection": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Opening Protection']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Roof Deck Attachment": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Roof Deck Attachment']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Perimeter Security Protection": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Perimeter Security Protection']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Flood Zone": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Flood Zone']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Ensuing Fungi Increase Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Incidental Business Threshold Increase Income Type": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Income Type']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Landscaping Increase Limit per Tree/Shrub": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit per Tree/Shrub']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Landscaping Increase Aggregate": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Aggregate']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Increase Sub-Limit for Screen Enclosures Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[2]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Backup of Sewer or Drain Increase Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[3]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Minimum Earned Premium Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[4]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Special Water Damage Deductible Coverage Type": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Coverage Type']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Special Water Damage Deductible": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Deductible']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[2]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Water Damage Sublimit Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Limit']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[7]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Previous loss details Source": {
                dropdowns = driver.findElements(By.xpath("//div[text()='previous loss details']/../../../../../..//table//td[1]/div"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Previous loss details Loss Type": {
                dropdowns = driver.findElements(By.xpath("//div[text()='previous loss details']/../../../../../..//table//td[3]/div"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Previous loss details Claim Closed?": {
                dropdowns = driver.findElements(By.xpath("//div[text()='previous loss details']/../../../../../..//table//td[5]/div"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Manuscript Endorsements Type": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Type']/../../../..//input)|(//div[text()='manuscript endorsements']/../../../../../..//table//td[1]/div)"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Worldwide Jewelry Blanket Coverage Single Article Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='worldwide jewelry']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Fine Arts Blanket Coverage Single Article Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='fine arts']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[2]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Collectibles Blanket Coverage Single Article Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='collectibles']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[3]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Coins, silver, stamps, furs, musical instrumentsBlanket Coverage Single Article Limit": {
                dropdowns = driver.findElements(By.xpath("//div[text()='coins, silver, stamps, furs, musical instruments']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input[@aria-hidden='false' and not(contains(@class, 'x-hide-display')) and not(ancestor::div[contains(@style, 'display: none') or contains(@style, 'visibility: hidden')])]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Wine Blanket Coverage Single Article Limit": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='wine']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[5]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Excess Flood Dwelling": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Dwelling']/../../../../../../../../../../../td[2]//input[@type='text']"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Excess Flood Contents": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Contents']/../../../../../../../../../../../td[2]//input[@type='text']"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Replacement Cost Coverage": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'Replacement Cost Coverage')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Earthquake Coverage  Option": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Earthquake Coverage  Option']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "MMI override": {
                dropdowns = driver.findElements(By.xpath("//div[text()='MMI override']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Soil Grade override": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Soil Grade override']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Basic Contents Limit": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Contents Limit']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Basic Loss of Use": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Loss of Use']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "EQ Loss Assessment Coverage Override": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Loss Assessment Coverage Override']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "EQ Loss Assessment Coverage": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Loss Assessment Coverage']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Basic Loss Assessment Deductible": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Loss Assessment Deductible']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Broad Earthquake Deductible": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Earthquake Deductible']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Broad Loss Assessment Deductible Coverage": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Loss Assessment Deductible Coverage']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Wildfire Hazard Severity": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Wildfire Hazard Severity override']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "What is the big picture of the brush risk?": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'big picture of the brush risk')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Fuel type and direction of fuel": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'Fuel type and direction of fuel')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Road access": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'Road access')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Slope & Topography?": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'Slope & Topography?')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "What size community is the home located in?": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'What size community is the home located in')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Home proximity to brush area?": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'Home proximity to brush area')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Is the home within an extreme mudflow zone?": {
                dropdowns = driver.findElements(By.xpath("//div[contains(text(),'Is the home within an extreme mudflow zone?')]/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Wildfire Threat override": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Wildfire Threat override']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Is There Adequate Defensible Space Around The Home": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Is there adequate defensible space around the home?']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Eave soffits and Attic Vents fitted with Narrow Mesh Screens": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Eave soffits and Attic Vents fitted with Narrow Mesh Screens']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Chimneys Fitted With Spark Arrestors": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Chimneys fitted with Spark Arrestors']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Firewood Or Other Combustible Materials Are Stored At Least 30 Feet From The Home": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Firewood or other combustible materials are stored at least 30 feet from the home']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Combustible Structures Or Fuel Tanks Are At Least 30 Feet": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Combustible structures or fuel tanks are at least 30 feet from the home and have at least 10 feet around clear combustible materials']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Openings In Tile Or Metal Roofs Bird Stopped": {
                dropdowns = driver.findElements(By.xpath("//div[text()='Openings in Tile or Metal Roofs Bird Stopped']/../../../..//input"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
            case "Type": {
                dropdowns = driver.findElements(By.xpath("(//div[text()='Type']/../../../..//input[@aria-autocomplete='list' and @aria-readonly='false'])[1]"));
                if (dropdowns.size() > 0 && dropdowns.get(0).isDisplayed()) {
                    clickElement(dropdowns.get(0));
                }
            }
            break;
        }
    }

    public void verifyDropdownValue(String value, int i) {
        Assert.assertEquals(driver.findElement(By.xpath("(//ul[@aria-hidden='false']/li[@role='option'])[" + (i + 1) + "]")).getText(), value);
    }

    public void verifyElementExistsByText(String message) {
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='" + message + "']")).isDisplayed());
        reportScreenshot("Text visible", "Text visible");
    }

    public void verifyCellNotExistsByLabel(String text, int pos) {
        Assert.assertEquals(driver.findElements(By.xpath("//div[text()='" + text + "']/../../../..//input")).get(pos - 1).getAttribute("aria-hidden"), "true");
        reportScreenshot(text + " not visible", text + " not visible");
    }

    public void verifyCellExistsByLabel(String text, int pos) {
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + text + "']/../../../..//input")).size() > 0);
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + text + "']/../../../..//input")).get(pos - 1).isDisplayed());
        reportScreenshot(text + " visible", text + " visible");
    }

    // REFACTORED METHODS 04/2023 - END
    public void callAndAssertNADA(Map<String, String> data) throws Throwable {
        goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
        pause(5000);
        if (elementExists(driver.findElements(By.xpath("//div[text()='vessel']")))) {
            WebElement vesselBlock = driver.findElements(By.xpath("//div[text()='vessel']")).get(0);
            vesselBlock.click();
        }

        driver.switchTo().frame("vesselIframe");
        List<WebElement> year = driver.findElements(By.xpath("//input[@ng-model='year']"));
        List<WebElement> nadaMake = driver.findElements(By.xpath("//select[@ng-model='make']"));
        List<WebElement> nadaModel = driver.findElements(By.xpath("//select[@ng-model='modelTrim']"));
        List<WebElement> nadaEngine = driver.findElements(By.xpath("//select[@ng-model='options']"));
        List<WebElement> nadaResult = driver.findElements(By.xpath("//td[contains(@ng-bind,'|currency')]"));
        pause(5000);

        if (elementExists(nadaMake)) {
            nadaMake.get(0).click();
            pause(1000);
            selectByText(nadaMake.get(0), data.get("NADA_Manufacturer"));
            pause(1000);
            year.get(0).click();
        } else {
            Assert.fail("NADA Failed");
        }
        if (elementExists(nadaModel)) {
            pause(5000);
            nadaModel.get(0).click();
            pause(1000);
            selectByText(nadaModel.get(0), data.get("NADA_Model"));
            pause(1000);
            year.get(0).click();
        } else {
            Assert.fail("NADA Failed");
        }
        if (elementExists(nadaEngine)) {
            pause(5000);
            nadaEngine.get(0).click();
            pause(1000);
            selectByText(nadaEngine.get(0), data.get("NADA_Engine"));
            pause(1000);
            year.get(0).click();
        } else {
            Assert.fail("NADA Failed");
        }

        if (elementExists(nadaResult)) {
            pause(5000);
            reportTextAttachment("NADA PW Integration - " + nadaResult.get(0).getText(), "Hull and Machinery Market Value: " + nadaResult.get(0).getText());
            reportScreenshot("NADA_PW_Integration_Screenshot_" + System.currentTimeMillis(), "NADA PW Integration - Screenshot");
        } else {
            reportTextAttachment("NADA PW Integration - Not Found", System.currentTimeMillis() + "_Not found");
            reportScreenshot("NADA_PW_Integration_Screenshot", "NADA PW Integration - Screenshot");
        }
        driver.switchTo().parentFrame();
    }

    /**
     * Call this method if you want to click on the file that is a link on the UI, download it and check if it's not null or size 0B
     *
     * @param doc Document name that will be clicked, downloaded and size verified
     */
    public Boolean downloadDocAndCheckSize(String doc) throws Throwable {
        File downloadedFile;
        CommonComponentsAndActions commonActions = new CommonComponentsAndActions(driver);
        pause(6000);
        commonActions.fileDownload(driver.findElement(By.xpath("//span[contains(text(),'" + doc + "')]")));

        String downloadDirectory = "results/downloads/" + DriverManager.getInstance() + "/";
        if (doc.contains("ID Card")) {
            downloadedFile = CustomFileUtils.getFirstFileByPartialName(downloadDirectory, "ID Card");
            if (downloadedFile == null)
                downloadedFile = CustomFileUtils.getFirstFileByPartialName(downloadDirectory, "Document");
            if (downloadedFile == null)
                // ID Card is often called null
                downloadedFile = CustomFileUtils.getFirstFileByPartialName(downloadDirectory, "null");
        } else {
            downloadedFile = CustomFileUtils.getFirstFileByPartialName(downloadDirectory, doc);
        }
        try {
            if (CustomFileUtils.isFileOverSize(downloadedFile, 15 * 1024)) {
                System.out.println("Document has been downloaded, verified and deleted");
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        } finally {
            if (downloadedFile == null) {
                downloadedFile = CustomFileUtils.getFirstFileByPartialName(downloadDirectory, "null");
            }
            FileUtils.forceDelete(downloadedFile);
            FileUtils.deleteDirectory(new File(downloadDirectory));
        }

        return true;
    }

    /**
     * This is the main method that is used on policy level to click, download and check size of document.
     * If fails first time it will re-try the action because of way system is built.
     * If file is null or 0B assert will trigger.
     *
     * @param doc  Document name that will be clicked, downloaded and size verified
     * @param data Used to get last transaction
     */
    public void downloadPolicyDocumentAndVerifyIfNotNull(String doc, Map<String, String> data) throws Throwable {
        pause(3000);
        if (!downloadDocAndCheckSize(doc)) {
            if (!doc.contains("Quote Proposal")) {
                ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(tabs.size() - 1));
                navigateToTransactionsOrEndorsementsPage();
                NavigationSteps navigationSteps = new NavigationSteps();
                if (hasValue(data.get("currentTransactionDownload"))
                        && data.get("currentTransactionDownload").equalsIgnoreCase("New Business")) {
                    navigationSteps.iNavigateToNewBusiness("1");
                    navigationSteps.iNavigateToDocumentsTab();
                    if (!downloadDocAndCheckSize(doc)) {
                        Assert.fail("File is null");
                    }
                } else if (hasValue(data.get("currentTransactionDownload"))
                        && data.get("currentTransactionDownload").equalsIgnoreCase("Endorsement")) {
                    navigationSteps.iNavigateToEndorsement("1");
                    navigationSteps.iNavigateToDocumentsTab();
                    downloadDocAndCheckSize(doc);
                    if (!downloadDocAndCheckSize(doc)) {
                        Assert.fail("File is null");
                    }
                }
            } else {
                if (!ENV.equalsIgnoreCase("AWS_QA")) {
                    if (!downloadDocAndCheckSize(doc)) {
                        Assert.fail("File is null");
                    }
                }

            }
        }
    }

    public String getDecrementDate(String date, int i) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.DATE, -i);
        return sdf.format(c.getTime());
    }

    public String getIncrementDate(String date, int i) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.DATE, +i);
        return sdf.format(c.getTime());
    }

    public String getDecrementMonth(String date, int i) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.MONTH, -i);
        return sdf.format(c.getTime());
    }

    public String getIncrementMonth(String date, int i) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.MONTH, +i);
        return sdf.format(c.getTime());
    }

    public void clickRollForward() {
        clickElement(rollForward, "Roll forward");
    }

    public void clickPlusInTree() {
        clickElement(plus, "Plus");
    }

    public void clickFooter() throws Throwable {
        clickElement(footer, "Footer");
        pause(1000);
    }

    public void setImplicitWaitToDefault() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
    }

    public void setImplicitWaitTo(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public void clickGeneratePremiumItems() {
        clickElement(generatePremiumItems, "Generate Premium Items");
    }

    public int getPosition(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public void iExpandNodeTreeIfNeeded() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(treeExpander));
        wait.until(ExpectedConditions.elementToBeClickable(treeExpander));
        String value = treeExpander.getCssValue("background-image");

        if (value.contains("elbow-plus"))
            clickElement(treeExpander);
        clickFooter();
    }

    public void switchToNewCreatedNode() throws InterruptedException {
        clickElement(newCreatedNode, "New Created Node");
        pause(5000);
    }

    public void failAssertion(String message) {
        if (hasValue(ASSERTIONS) && ASSERTIONS.equalsIgnoreCase("Yes") || !hasValue(ASSERTIONS)) {
            if (SOFT_ASSERT.equalsIgnoreCase("Yes")) {
                SoftAssertion.fail(message);
            } else {
                Assert.fail(message);
            }
        }
    }

    /**
     * Returns true or false depending on WebElement condition without throwing exception
     *
     * @param element WebElement to check
     */
    public boolean isElementDisplayed(WebElement element) {
        setImplicitWaitTo(1);
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        } finally {
            setImplicitWaitToDefault();
        }
    }

    /**
     * Returns true or false depending on WebElement condition without throwing exception
     *
     * @param element  WebElement to check
     * @param waitTime Set implicit wait to
     */
    public boolean isElementDisplayed(WebElement element, int waitTime) {
        setImplicitWaitTo(waitTime);
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        } finally {
            setImplicitWaitToDefault();
        }
    }

    public void clickOnPolicy() throws Throwable {
        clickElement(policy, "policy");
        pause(2000);
    }

    public void clickOnFSPolicy() throws Throwable {
        clickElement(FSPolicy, "policy");
        pause(2000);
    }

    public void verifyInputFieldExists(String label) {
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + label + "']/../../../..//input")).size() > 0);
        reportScreenshot(label + "_" + System.currentTimeMillis(), label);
    }

    public void verifyInputFieldDoesNotExist(String label) {
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + label + "']/../../../..//input")).size() < 1);
        reportScreenshot(label + "_" + System.currentTimeMillis(), label);
    }

    public void verifyValidationMessageDisplayed(String message) {
        try {
            assertEquals(driver.findElement(By.xpath("//*[@osviewid='mode_2_msg_1']")).getText(), message, "Validation message");
            Assert.assertTrue(driver.findElement(By.xpath("//*[@osviewid='mode_2_msg_1']")).isDisplayed());
            reportScreenshot("Validation_Message", "Validation_Message");
        } catch (Exception e) {
            try {
                assertEquals(driver.findElement(By.xpath("//*[@osviewid='mode_3_msg_1']")).getText(), message, "Validation message");
                Assert.assertTrue(driver.findElement(By.xpath("//*[@osviewid='mode_3_msg_1']")).isDisplayed());
                reportScreenshot("Validation_Message", "Validation_Message");
            } catch (Exception ee) {
                assertEquals(driver.findElement(By.xpath("//*[@osviewid='mode_3_msg_2']")).getText(), message, "Validation message");
                Assert.assertTrue(driver.findElement(By.xpath("//*[@osviewid='mode_3_msg_2']")).isDisplayed());
                reportScreenshot("Validation_Message", "Validation_Message");
            }
        }
    }

    public boolean isSecondDateAfterFirstDate(String date1, String date2) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        try {
            Date parsedDate1 = dateFormat.parse(date1);
            Date parsedDate2 = dateFormat.parse(date2);

            return parsedDate2.after(parsedDate1);
        } catch (ParseException e) {
            e.printStackTrace();
            return false; // In case of parse error, returning false.
        }
    }

    public void clickReferToUnderwritingButton() {
        clickElement(referToUnderwriting, "Refer to underwriting");
    }

    public void selectQuoteToBeReferred() {
        clickElement(referQuote, "Refer quote");
    }

    public void iClickContinueReferralToUw() {
        clickElement(continueReferralToUW, "Continue Referral To UW");
    }

    public void iAddBrokerComments(String comment) {
        typeText(textarea, comment, "Broker comment");
    }

    public void iClickExitCustomer() {
        clickElement(exitCustomer, "Exit customer");
    }

    public void verifyBlockExists(String block) throws Throwable {
        if (BLOCK_VALIDATION.equalsIgnoreCase("Yes")) {
            clickFooter();
            try {
                WebElement element = driver.findElement(By.xpath(blockValidation.replace("$$", block.toLowerCase())));
                scrollToWebElement(element);
                if (!isElementDisplayed(element, 5))
                    failAssertion(block + " block is not displayed");
            } catch (Exception e) {
                try {
                    pause(5000);
                    clickFooter();
                    WebElement element = driver.findElement(By.xpath(blockValidation.replace("$$", block.toLowerCase())));
                    scrollToWebElement(element);
                    if (!isElementDisplayed(element, 5))
                        failAssertion(block + " block is not displayed");
                } catch (Exception ee) {
                    System.out.println("Block Element not found.");
                    failAssertion(block + " block is not displayed");
                }
            }
        }
    }

    public void verifyBlockExistsWithTagT(String block) throws Throwable {
        if (BLOCK_VALIDATION.equalsIgnoreCase("Yes")) {
            clickFooter();
            try {
                WebElement element = driver.findElement(By.xpath(blockValidationWithTagT.replace("$$", block)));
                scrollToWebElement(element);
                if (!isElementDisplayed(element, 5))
                    failAssertion(block + " block is not displayed");
            } catch (Exception e) {
                try {
                    pause(5000);
                    clickFooter();
                    WebElement element = driver.findElement(By.xpath(blockValidationWithTagT.replace("$$", block)));
                    scrollToWebElement(element);
                    if (!isElementDisplayed(element, 5))
                        failAssertion(block + " block is not displayed");

                } catch (Exception ee) {
                    System.out.println("Block Element not found.");
                    failAssertion(block + " block is not displayed");
                }
            }
        }
    }

    public void navigateToPolicyBreadCrumb() {
        clickElement(policyBreadCrumb, "Policy bread crumb");
    }

    public void verifyDropdownSize(int size) {
        if (dropdownOptions.size() >= size + 1) {
            failAssertion("Size of dropdown greater than " + size + ". Found " + dropdownOptions.size());
        } else {
            successLog("Dropdown size matches expected input");
        }
    }

    //Used for rounding that is done in Dragon. Mostly used on premium summary page
    public double customRound(double value) {
        double fractionalPart = value - Math.floor(value);

        if (fractionalPart >= 0.50) {
            return Math.round(value);
        } else {
            return Math.floor(value);
        }
    }

    public void verifyElementOnUI(String text, String displayedOrNot) {
        boolean isElementPresent = !driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]")).isEmpty();

        if (displayedOrNot.equalsIgnoreCase("Not Displayed") && isElementPresent) {
            failAssertion("Element with message: " + text + " is displayed when it shouldn't be");
            reportScreenshot("Failure_" + text + "_element_" + System.currentTimeMillis(), text);
        } else if (!displayedOrNot.equalsIgnoreCase("Not Displayed") && !isElementPresent) {
            failAssertion("Element with message: " + text + " is not displayed when it should be");
            reportScreenshot("Failure_element_" + System.currentTimeMillis(), text);
        } else if (displayedOrNot.equalsIgnoreCase("Displayed")) {
            scrollToWebElement(driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")));
            reportScreenshot("Success_Element_Visible_" + System.currentTimeMillis(), text);
        }
    }

    public boolean verifyElementOnUI(String text, boolean displayedOrNot) {
        boolean isElementPresent = !driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]")).isEmpty();

        if (!displayedOrNot && isElementPresent) {
            return false;
        } else if (!displayedOrNot && !isElementPresent) {
            return false;
        } else {
            return true;
        }
    }

    public void verifyElementOnUI(String text, int expectedCount) {
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
        int actualCount = elements.size();

        if (actualCount != expectedCount) {
            failAssertion("Expected: " + expectedCount + " found: " + actualCount);
            reportScreenshot("Failure_" + text + "_element_mismatch_" + System.currentTimeMillis(), text);
        }
    }

    public boolean checkPDFilling(String nbEffectiveDate, String renewalEffectiveDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DataManager dataManager = DataManager.getInstance();
        LocalDate inputDate = LocalDate.parse(dataManager.getKey("Current_Term_Eff_Date"), formatter);
        LocalDate effectiveDate;
        String currentTermTransaction = dataManager.getKey("Current_Term_Transaction");

        if ("Renewal".equalsIgnoreCase(currentTermTransaction)) {
            effectiveDate = LocalDate.parse(renewalEffectiveDate, formatter);
        } else {
            effectiveDate = LocalDate.parse(nbEffectiveDate, formatter);
        }
        return inputDate.isAfter(effectiveDate) || inputDate.isEqual(effectiveDate);
    }

    public void iMinimizeNodeTreeExceptTheFirstNode() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        String value;
        for (int i = treeExpanderList.size() - 1; i > 0; i--) {
            wait.until(ExpectedConditions.visibilityOf(treeExpanderList.get(i)));
            wait.until(ExpectedConditions.elementToBeClickable(treeExpanderList.get(i)));
            value = treeExpanderList.get(i).getCssValue("background-image");
            if (value.contains("minus")) {
                clickFooter();
                clickElement(treeExpanderList.get(i), "tree node");
            }
            clickFooter();
        }
    }

    // Used for transaction processing where additional process and ok actions might be needed
    public void ifDisplayedClickProcessAndOK() throws Throwable {
        if (isElementDisplayed(process)) {
            clickProcess();
            clickOK();
        }
    }

    public void selectFieldOption(Map<String, String> data, String field, String yesOrNo, String page) throws Throwable {
        if (yesOrNo == null || yesOrNo.trim().isEmpty()) {
            return;
        }
        if (page.equalsIgnoreCase("Location")) {
            navigateToLocation(data);
            pause(3000);
        } else {
            goToPage(page);
            pause(3000);
        }
        String xpathYes = String.format("//div[contains(text(),'%s')]/../../../..//label[contains(text(),'Yes')]/..//input", field);
        String xpathNo = String.format("//div[contains(text(),'%s')]/../../../..//label[contains(text(),'No')]/..//input", field);

        WebElement elementYes = driver.findElement(By.xpath(xpathYes));
        WebElement elementNo = driver.findElement(By.xpath(xpathNo));

        if (elementYes.isEnabled() && elementNo.isEnabled()) {
            choose(elementYes, elementNo, yesOrNo, "Field: " + field);
        }
    }

    public void navigateToLocationsTab() {
        clickElement(locations, "locations tab");
    }

    public void navigateToRiskManagementTab() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Risk Management']/../../..")));
        pause(2000);
    }


    public void titleOfSectionFromTo(String from, String to) {
        List<WebElement> elementsFrom = driver.findElements(By.xpath("//*[contains(text(),'" + from + "')]"));
        List<WebElement> elementsTo = driver.findElements(By.xpath("//*[contains(text(),'" + to + "')]"));
        if (elementsFrom.isEmpty() && !elementsTo.isEmpty()) {
            scrollToWebElement(driver.findElement(By.xpath("//*[contains(text(),'" + to + "')]")));
            reportScreenshot("Success_Element_Visible_" + System.currentTimeMillis(), to);
        } else {
            failAssertion("Element with message: " + to + " is not displayed when it should be");
            reportScreenshot("Failure_element_" + System.currentTimeMillis(), to);
        }
    }

    public void iProcessRenewalOrNavigateToPolicyImage() throws Throwable {
        if (isElementDisplayed(processRenewal)) {
            clickProcessRenewal();
        } else {
            clickPolicyImage();
            pause(2000);
            clickReviewChanges();
            pause(3000);
            if (isElementDisplayed(reviewChanges)) {
                clickReviewChanges();
            }
            clickRenewedPremium();
            pause(2000);
            clickProcessRenewal();
        }
    }

    public void goToSummaryAndUpdateRenewal() throws Throwable {
        clickElement(quoteSummary);
        pause(3000);
        if (isElementDisplayed(updateRenewal)) {
            clickElement(updateRenewal);
        } else {
            clickPolicyImage();
        }
    }

    public void verifyElementDisplayedOnUI(String text, String expectation) throws InterruptedException {
        pause(5000);
        boolean isElementPresent = !driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]")).isEmpty();
        boolean shouldBeDisplayed = !expectation.equalsIgnoreCase("Not Displayed");

        if (isElementPresent != shouldBeDisplayed) {
            String message = shouldBeDisplayed
                    ? "Element with message: " + text + " is not displayed when it should be"
                    : "Element with message: " + text + " is displayed when it shouldn't be";

            reportScreenshot("Verify Element if Mismatch", text);
            failAssertion(message);
        }
        if (!isElementPresent && !shouldBeDisplayed) {
            reportScreenshot("Verify Element Not Displayed", text);
        }
        if (isElementPresent && shouldBeDisplayed) {
            String xpath = String.format("//*[contains(text(),'%s')]", text);
            WebElement inputField = driver.findElement(By.xpath(xpath));
            scrollToWebElement(inputField);
            reportScreenshot("Verify Element Displayed", text);
        }
    }

    public void writeTextToField(String field, String text) throws Throwable {
        if (text == null || text.trim().isEmpty()) {
            infoLog("Option is empty or null for field '" + field + "'. Skipping action.");
            return;
        }
        String xpath = String.format("//*[text()='%s']/../../../..//input[@aria-hidden='false']", field);
        WebElement inputField = driver.findElement(By.xpath(xpath));

        if (!inputField.isEnabled() || inputField.getAttribute("readonly") != null) {
            System.out.println("Field '" + field + "' is read-only or disabled. Skipping action.");
            return;
        }

        scrollToWebElement(inputField);
        pause(1000);
        typeTextEnter(inputField, text, field);
        infoLog("Entered text: '" + text + "' into field with label: '" + field + "'");
        clickFooter();
        pause(500);
    }


    public void verifyFieldOptionChecked(String field, String yesOrNo) throws InterruptedException {
        if (yesOrNo == null || yesOrNo.trim().isEmpty()) {
            throw new RuntimeException("No option specified for field: " + field);
        }

        String xpathOption = String.format("//div[contains(text(),'%s')]/../../../..//label[text()='%s']/..//input[@type='radio']", field, yesOrNo);
        WebElement radioButton = driver.findElement(By.xpath(xpathOption));
        scrollToWebElement(radioButton);
        pause(500);
        if (radioButton.isSelected()) {
            successLog(String.format("Verified: The '%s' option for field '%s' is selected.", yesOrNo, field));
        } else {
            failAssertion(String.format("The '%s' option for field '%s' is NOT selected.", yesOrNo, field));
        }
    }

    public void verifyRadioOptionDisabled(String field, String yesOrNo) throws InterruptedException {
        if (yesOrNo == null || yesOrNo.trim().isEmpty()) {
            throw new IllegalArgumentException("No option specified for field: " + field);
        }

        String xpathOption = String.format("//div[contains(text(),'%s')]/../../../..//label[text()='%s']/..//input[@type='radio']", field, yesOrNo);
        WebElement radioButton = driver.findElement(By.xpath(xpathOption));

        scrollToWebElement(radioButton);
        pause(500);

        if (!radioButton.isEnabled()) {
            successLog(String.format("Verified: The '%s' option for field '%s' is disabled.", yesOrNo, field));
        } else {
            failAssertion(String.format("The '%s' option for field '%s' is NOT disabled.", yesOrNo, field));
        }
    }

    public int parseOrDefault(String value, int defaultValue) {
        try {
            return value != null ? Integer.parseInt(value) : defaultValue;
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public void verifyVisibleFields(int expectedVisibleCount, String text) {
        String xpath = "//*[contains(text(),'" + text + "')]/../../../..//input[@aria-hidden='false']";

        List<WebElement> elements = driver.findElements(By.xpath(xpath));

        int actualCount = elements.size();

        if (actualCount != expectedVisibleCount) {
            failAssertion("Expected: " + expectedVisibleCount + " found: " + actualCount);
            reportScreenshot("Failure " + text + " element mismatch_" + System.currentTimeMillis(), text);
        }
        successLog("Expected visible fields: " + expectedVisibleCount + " found: " + actualCount);
        reportScreenshot("Pass", "Expected: " + expectedVisibleCount + " found: " + actualCount);
    }

    public void verifyHiddenFieldHasNoValueForBV(String field, String businessVariable) {
        String xpath = "//*[contains(text(),'" + field + "')]/../../../..//input[@aria-hidden='true' and contains(@name,'" + businessVariable + "')]";

        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        int actualCount = 0;
        StringBuilder invalidValues = new StringBuilder();

        for (WebElement element : elements) {
            String value = element.getAttribute("value");
            if (value != null && !value.isEmpty() && !value.equals("-Select-")) {
                actualCount++;
                invalidValues.append(value).append(", ");
            }
        }
        if (invalidValues.length() > 0) {
            invalidValues.setLength(invalidValues.length() - 2);
        }

        if (actualCount > 0) {
            reportScreenshot("Failure " + field + " has valid values " + System.currentTimeMillis(), field);
            reportTextAttachment("Values", "Expected no valid hidden field values for '" + field + "', but found: " + actualCount + " with values: " + invalidValues);
            failAssertion("Expected no valid hidden field values for '" + field + "', but found: " + actualCount + " with values: " + invalidValues);
        } else {
            reportScreenshot("Pass", "No valid values for hidden fields with aria-hidden='true'.");
            successLog("All hidden fields for '" + field + "' are empty or '-Select-'. No valid values found.");
        }
    }

    public void verifyHiddenFieldHasValueForBV(String field, String businessVariable, int expectedVisibleCount) {
        String xpath = "//*[contains(text(),'" + field + "')]/../../../..//input[@aria-hidden='true' and contains(@name,'" + businessVariable + "')]";

        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        int actualCount = 0;
        StringBuilder invalidValues = new StringBuilder();

        for (WebElement element : elements) {
            String value = element.getAttribute("value");
            if (value != null && !value.isEmpty() && !value.equals("-Select-")) {
                actualCount++;
                invalidValues.append(value).append(", ");
            }
        }
        if (invalidValues.length() > 0) {
            invalidValues.setLength(invalidValues.length() - 2);
        }

        if (actualCount != expectedVisibleCount) {
            reportScreenshot("Failure " + field + " has valid values " + System.currentTimeMillis(), field);
            reportTextAttachment("Values", "Expected no valid hidden field values for '" + field + "', but found: " + actualCount + " with values: " + invalidValues.toString());
            failAssertion("Expected " + expectedVisibleCount + " hidden field values for '" + field + "', but found: " + actualCount + " with values: " + invalidValues.toString());
        } else {
            successLog("All hidden fields for '" + field + "' are empty or '-Select-'. No valid values found.");
        }
    }

    public void reviewPolicyImage() throws Throwable {
        waitForMask();
        if (isElementDisplayed(reviewPolicyImage)) {
            clickElement(reviewPolicyImage);
        }
    }

    public void expandCoverPageTree() {
        coverPageExpandNode.click();
    }

    public void expandLocationPageTree() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(locationPageExpandNode));
            locationPageExpandNode.click();
        } catch (Exception e) {
        }
    }

    public void verifyPageVisibility(String pageName, String condition) {
        List<WebElement> pages = driver.findElements(By.xpath("//a[text()='" + pageName + "']"));
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(pages.size(), 1);
            Assert.assertTrue(pages.get(0).isDisplayed());
        } else {
            Assert.assertEquals(pages.size(), 0);
        }
    }

    public void verifyPagePosition(String pageName, String pagePosition) {
        //
    }

    public void verifyBlockVisibility(String blockName, String condition) throws InterruptedException {
        pause(5000);
        List<WebElement> blocks = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[contains(text(), '" + blockName + "')]")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(blocks.size(), 1);
            Assert.assertTrue(blocks.get(0).isDisplayed());
        } else {
            Assert.assertEquals(blocks.size(), 0);
        }
    }

    public void verifyCheckboxVisibility(String checkboxName, String condition) {
        List<WebElement> checkboxes = driver.findElements(
                By.xpath("//*[text()='" + checkboxName + "']/../../../..//input")
        );
        if (condition.equalsIgnoreCase("visible")) {
            scrollToWebElement(checkboxes.get(0));
            Assert.assertEquals(checkboxes.size(), 1);
            Assert.assertTrue(checkboxes.get(0).isDisplayed());
        } else {
            if (checkboxes.isEmpty()) {
                Assert.assertTrue(true);
            } else {
                Assert.assertFalse(checkboxes.get(0).isDisplayed());
            }
        }
    }

    public void verifyCheckboxAvailability(String checkboxName, String condition) {
        if (condition.equalsIgnoreCase("enabled")) {
            Assert.assertEquals(driver.findElement(By.xpath("//*[text()='" + checkboxName + "']/../../../..//input")).getAttribute("aria-disabled"), "false");
        } else {
            Assert.assertNotEquals(driver.findElement(By.xpath("//*[text()='" + checkboxName + "']/../../../..//input")).getAttribute("disabled"), "disabled");
        }
    }

    public void verifyYesNoRadioButtons(String labelText, String firstOption, String secondOption, String condition, String blockName) {
        try {
            WebElement radioButton1 = driver.findElement(
                    By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../..//div[text()='" + labelText + "']/../../../..//label[text()='" + firstOption + "'] | //div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + labelText + "']/../../../../../div//label[text()='" + firstOption + "']/..//input")
            );
            WebElement radioButton2 = driver.findElement(
                    By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../..//div[text()='" + labelText + "']/../../../..//label[text()='" + secondOption + "'] | //div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + labelText + "']/../../../../../div//label[text()='" + secondOption + "']/..//input")
            );

            if (condition.equalsIgnoreCase("visible")) {
                Assert.assertTrue(radioButton1.isDisplayed());
                Assert.assertTrue(radioButton2.isDisplayed());
            } else {
                Assert.assertFalse(radioButton1.isDisplayed());
                Assert.assertFalse(radioButton2.isDisplayed());
            }

        } catch (NoSuchElementException e) {
            if (condition.equalsIgnoreCase("visible")) {
                throw e;
            }
        }
    }

    public void verifyYesNoRadioButtonsDisabled(String question, String condition, String blockName) {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../..//div[text()='" + question + "']/../../../..//input | " +
                "//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + question + "']/../../../..//input | " +
                "//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + question + "']/../../../../..//input"));

        if (condition.equalsIgnoreCase("disabled")) {
            Assert.assertFalse(radioButtons.get(0).isEnabled());
            Assert.assertFalse(radioButtons.get(1).isEnabled());
        } else {
            Assert.assertTrue(radioButtons.get(0).isEnabled());
            Assert.assertTrue(radioButtons.get(1).isEnabled());
        }
    }

    public void verifyYesNoRadioButtonsDistantLabel(String labelName, String firstOption, String secondOption, String condition) {
        List<WebElement> radioButtons = driver.findElements(
                By.xpath("//div[text()=\"" + labelName + "\" and @style='display:inline']/../../../../../../../../../../../..//label[text()='" + firstOption + "' or text()='" + secondOption + "']"));
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(radioButtons.size(), 2);
            Assert.assertTrue(radioButtons.get(0).isDisplayed());
            Assert.assertTrue(radioButtons.get(1).isDisplayed());
        } else {
            Assert.assertEquals(radioButtons.size(), 0);
        }
    }

    public void verifyCheckboxVisibilityForLabel(String condition, String labelName, String blockName) {
        List<WebElement> checkboxes = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + labelName + "']/../../../..//input[@type='checkbox'] | //div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + labelName + "']/../../../..//input[@type='checkbox']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(checkboxes.size(), 1);
            Assert.assertTrue(checkboxes.get(0).isDisplayed());
        } else {
            Assert.assertEquals(checkboxes.size(), 0);
        }
    }

    public void verifyInputFieldVisibility(String fieldName, String condition, String blockName) throws InterruptedException {
        pause(10000);
        String xpath = "(" +
                "//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + fieldName + "']/../../../..//input[@aria-hidden='false'] | " +
                "//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "']/../../../..//input[@aria-hidden ='false'] | " +
                "//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "']/../../../../..//input[@aria-hidden ='false'] | " +
                "//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//*[text()='" + fieldName + "']/../../../../../..//input[@aria-hidden='false'] | " +
                "//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[contains(text(),'" + fieldName + "')]/../../../../../../../../../../../td[2]//input" +
                ")";
        try {
            WebElement inputField = driver.findElement(By.xpath(xpath));

            if (condition.equalsIgnoreCase("visible")) {
                Assert.assertTrue(inputField.isDisplayed());
            } else {
                Assert.assertFalse(inputField.isDisplayed());
            }

        } catch (NoSuchElementException e) {
            if (condition.equalsIgnoreCase("visible")) {
                throw e;
            }
        }
    }

    public void verifyTextboxVisibility(String textboxName, String condition, String blockName) {
        List<WebElement> textboxes = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + textboxName + "']/../../../..//div[@role='textbox']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(textboxes.size(), 1);
            Assert.assertTrue(textboxes.get(0).isDisplayed());
        } else {
            Assert.assertEquals(textboxes.size(), 0);
        }
    }

    public void verifyDropdownVisibility(String dropdownName, String condition, String blockName) {
        List<WebElement> dropdowns = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + dropdownName + "']/../../../../../../../../../../..//input[@value='- Select -']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(dropdowns.size(), 1);
            Assert.assertTrue(dropdowns.get(0).isDisplayed());
        } else {
            Assert.assertEquals(dropdowns.size(), 0);
        }
    }

    public void verifyFieldValueVisibility(String fieldValue, String condition, String fieldName) {
        List<WebElement> fields = driver.findElements(
                By.xpath("//div[text()='" + fieldName + "']/../../../..//div[text()='" + fieldValue + "']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(fields.size(), 1);
            Assert.assertTrue(fields.get(0).isDisplayed());
        } else {
            Assert.assertEquals(fields.size(), 0);
        }
    }

    public void verifyReadOnlyFieldVisibility(String fieldName, String condition, String blockName) {
        List<WebElement> readOnlyFields = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../..//div[text()='" + fieldName + "']/../../../../../../../../../../..//input[@role='textbox'] | //div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "']/../../../..//input[@role='textbox']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(readOnlyFields.size(), 1);
            Assert.assertTrue(readOnlyFields.get(0).isDisplayed());
        } else {
            Assert.assertEquals(readOnlyFields.size(), 0);
        }
    }

    public void clickRadioButtonForLabel(String option, String labelName) throws Throwable {
        try {
            clickElement(driver.findElement(By.xpath("//div[text()='" + labelName + "']/../../../..//label[text()='" + option + "']/..//input")), labelName);
        } catch (Exception e) {
            try {
                clickElement(driver.findElement(By.xpath("//div[contains(text(),'" + labelName + "')]/../../../..//label[text()='" + option + "']/..//input")), labelName);
            } catch (Exception ee) {
                clickElement(driver.findElement(By.xpath("//*[contains(text(),'" + labelName + "')]/../../../../../../../../../../../..//label[text()='" + option + "']/../..//input")), labelName);
            }
        }
        pause(2000);
    }

    public void clickRadioButtonForDistantLabel(String option, String labelName) throws Throwable {
        clickElement(driver.findElement(By.xpath("//div[text()=\"" + labelName + "\" and @style='display:inline']/../../../../../../../../../../../..//label[text()='" + option + "']/..//input | //div[text()=\"" + labelName + "\"]/../../../../../../../../../../../..//label[text()='" + option + "']/..//input | //div[contains(text(),\"" + labelName + "\")]/../../../..//label[text()='" + option + "']/..//input")), labelName);
        pause(2000);
    }

    public void verifyYesNoRadioButtonsUnnamedBlocks(String labelText, String firstOption, String secondOption, String condition) throws InterruptedException {
        pause(10000);
        List<WebElement> radioButton1 = driver.findElements(
                By.xpath("(//div[text()='" + labelText + "']/../../../..//label[text()='" + firstOption + "'])[last()]"));
        List<WebElement> radioButton2 = driver.findElements(
                By.xpath("(//div[text()='" + labelText + "']/../../../..//label[text()='" + secondOption + "'])[last()]"));

        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertTrue(!radioButton1.isEmpty() && radioButton1.get(0).isDisplayed());
            Assert.assertTrue(!radioButton2.isEmpty() && radioButton2.get(0).isDisplayed());
        } else {
            Assert.assertFalse(!radioButton1.isEmpty() && radioButton1.get(0).isDisplayed());
            Assert.assertFalse(!radioButton2.isEmpty() && radioButton2.get(0).isDisplayed());
        }
    }

    public void verifyElementIsDisplayed(String type, String blockName, String labelName, String displayedOrNot) {
        String elementType = type.equalsIgnoreCase("Checkbox") || type.equalsIgnoreCase("Text") || type.equalsIgnoreCase("Radio") ? "input" : type.equalsIgnoreCase("Block") ? "block" : "";
        boolean isElementPresent = elementType.equalsIgnoreCase("input") ? !driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")).isEmpty() && driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")).get(0).isDisplayed() :
                elementType.equalsIgnoreCase("block") && !driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']")).isEmpty() && driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']")).get(0).isDisplayed();
        if (!isElementPresent) {
            isElementPresent = elementType.equalsIgnoreCase("input") ? !driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//label[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")).isEmpty() && driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//label[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")).get(0).isDisplayed() :
                    elementType.equalsIgnoreCase("block") && !driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']")).isEmpty() && driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']")).get(0).isDisplayed();
        }
        if (displayedOrNot.equalsIgnoreCase("Not Displayed") && isElementPresent) {
            failAssertion("Element with message: " + labelName + " is displayed when it shouldn't be");
            reportScreenshot("Failure_" + labelName + "_element_" + System.currentTimeMillis(), labelName);
        } else if (!displayedOrNot.equalsIgnoreCase("Not Displayed") && !isElementPresent) {
            failAssertion("Element with message: " + labelName + " is not displayed when it should be");
            reportScreenshot("Failure_element_" + System.currentTimeMillis(), labelName);
        } else if (displayedOrNot.equalsIgnoreCase("Displayed")) {
            if (elementType.equalsIgnoreCase("input")) {
                if (isElementPresentByXPath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")) {
                    scrollToWebElement(driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")));
                } else if (isElementPresentByXPath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//label[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")) {
                    scrollToWebElement(driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//label[text()='" + labelName + "']/../../../..//input[@type='" + type.toLowerCase() + "']")));
                }
                reportScreenshot("Success_Element_Visible_" + System.currentTimeMillis(), labelName);
                SoftAssertion.assertTrue(isElementPresent, "Expected: " + labelName + " to be shown");
            } else {
                scrollToWebElement(driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']")));
                reportScreenshot("Success_Element_Visible_" + System.currentTimeMillis(), blockName);
                SoftAssertion.assertTrue(isElementPresent, "Expected: " + blockName + " to be shown");
            }
        } else if (displayedOrNot.equalsIgnoreCase("Not Displayed")) {
            if (elementType.equalsIgnoreCase("input")) {
                reportScreenshot("Success_Element_Visible_" + System.currentTimeMillis(), labelName);
                SoftAssertion.assertTrue(!isElementPresent, "Expected: " + labelName + " to be not shown");
            } else {
                reportScreenshot("Success_Element_Visible_" + System.currentTimeMillis(), blockName);
                SoftAssertion.assertTrue(!isElementPresent, "Expected: " + blockName + " to be not shown");
            }
        }
    }

    public void scrollPage(String direction) throws InterruptedException {
        WebElement scrollableElement = driver.findElement(By.cssSelector("#framework-body"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        if ("up".equalsIgnoreCase(direction)) {
            js.executeScript("arguments[0].scrollTop -= arguments[0].clientHeight * 1.7;", scrollableElement);
        } else if ("down".equalsIgnoreCase(direction)) {
            js.executeScript("arguments[0].scrollTop += arguments[0].clientHeight * 1.7;", scrollableElement);
        } else {
            errorLog("Invalid direction! Please use 'up' or 'down'.");
        }
        pause(3000);
    }

    public void clickDropdownAfterScrolling(String labelName, String direction) throws Throwable {
        scrollPage(direction);
        clickElement(driver.findElement(By.xpath("//div[text()='" + labelName + "']/../../../..//div[contains(@class,'x-form-arrow-trigger')] | //font[text()='" + labelName + "']/../../../../../..//div[contains(@class,'x-form-arrow-trigger')] | //div[text()='" + labelName + "']/../../../../../../../..//div[contains(@class,'x-form-arrow-trigger')]")), labelName);
        pause(3000);
    }

    public void typeToDropdown(String value, String dropdownName) throws Throwable {
        typeTextEnter(driver.findElement(By.xpath("//div[text()='" + dropdownName + "']/../../../..//input[@aria-hidden='false']")), value, dropdownName);
        pause(3000);
    }

    public void clickRowAndCell(int cellNum, int rowNum) throws Throwable {
        clickElement(driver.findElement(By.xpath("//span[text()='add']/../../../../../../..//table[" + rowNum + "]//td[" + cellNum + "]")), "row_" + rowNum + "_cell_" + cellNum);
        pause(3000);
    }

    public void verifyButtonVisibility(String buttonName, String condition, String blockName) {
        List<WebElement> buttons = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//span[text()='" + buttonName + "']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(buttons.size(), 1);
            Assert.assertTrue(buttons.get(0).isDisplayed());
        } else {
            Assert.assertEquals(buttons.size(), 0);
        }
    }

    public String getTextFromInputFieldInBlock(String fieldName, String blockName) {
        WebElement text = driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + fieldName + "']/../../../..//input[last()]"));
        if (isElementDisplayed(text) && hasValue(text.getText())) {
            return text.getAttribute("value");
        } else {
            return "";
        }
    }

    public void verifyInputFieldReadOnlyValue(String inputLabel, String value) {
        WebElement input = driver.findElement(By.xpath("//*[text()='" + inputLabel + "']/../../../..//input | //div[text()='" + inputLabel + "']/../../../../../../../../..//input"));
        assertEquals(input.getAttribute("value"), value, inputLabel);
        assertEquals(input.getAttribute("aria-readonly"), "true", inputLabel);
    }

    public void verifyLinkIsVisible(String link, String condition, String block) {
        List<WebElement> links = driver.findElements(By.xpath("//*[text()='" + block + "']/../../../../../..//a[text()='" + link + "']"));
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(links.size(), 1);
            Assert.assertTrue(links.get(0).isDisplayed());
        } else {
            Assert.assertEquals(links.size(), 0);
        }
    }

    public void verifyNoDefaultAnswer(String question) {
        List<WebElement> inputs = driver.findElements(By.xpath("//div[text()='" + question + "']/../../../..//input"));
        for (WebElement input : inputs) {
            Assert.assertFalse(input.isSelected());
        }
    }

    public void verifyNoDefaultAnswerDistant(String question) {
        List<WebElement> inputs = driver.findElements(By.xpath("//div[text()='" + question + "']/../../../../../../../../../../../..//input"));
        for (WebElement input : inputs) {
            Assert.assertFalse(input.isSelected());
        }
    }

    public void verifyDefaultAnswer(String question, String answer) {
        WebElement option = driver.findElement(By.xpath("//div[text()='" + question + "']/../../../..//label[text()='" + answer + "']/..//input | " +
                "//div[text()='" + question + "']/../../../../..//label[text()='" + answer + "']/..//input"));
        Assert.assertTrue(option.isSelected());
    }

    public void verifyValueDisplayedInBlock(String fieldName, String value, String block) throws InterruptedException {
        WebElement field = driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + fieldName + "']/../../../..//input[@value='" + value + "' and @aria-hidden='false']"));
        Assert.assertTrue(field.isDisplayed());
        pause(2000);
    }

    public void verifyValueNotDisplayedInBlock(String fieldName, String value, String block) {
        List<WebElement> fields = driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + fieldName + "']/../../../..//input[@value='" + value + "' and @aria-hidden='false']"));
        Assert.assertTrue(fields.isEmpty() || !fields.get(0).isDisplayed());
    }

    public void typeDateToDateField(String date, String fieldName) {
        WebElement dateField = driver.findElement(By.xpath("//div[text()='" + fieldName + "']/../../../..//input"));
        typeText(dateField, date, fieldName);
    }

    public void verifyInputFieldIsEmpty(String fieldName) {
        WebElement inputField = driver.findElement(By.xpath("//div[text()='" + fieldName + "']/../../../..//input"));
        Assert.assertTrue(inputField.getAttribute("value") == null || inputField.getAttribute("value").isEmpty());
    }

    public void verifyInputFieldIsReadOnly(String fieldName, String block) {
        List<WebElement> fields = driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + fieldName + "']/../../../..//input[@aria-hidden ='false']"));
        Assert.assertEquals(fields.get(0).getAttribute("aria-readonly"), "true", fieldName);
    }

    public void verifyInputFieldIsReadOnly(String fieldName) {
        List<WebElement> fields = driver.findElements(By.xpath("//div[text()='" + fieldName + "']/../../../..//input[@aria-hidden ='false']"));
        Assert.assertEquals(fields.get(0).getAttribute("aria-readonly"), "true", fieldName);
    }

    public void verifyInputFieldInBlockIsReadOnlyWithValue(String fieldName, String blockName) {
        WebElement inputField = driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "']/../../../..//input"));
        Assert.assertEquals(inputField.getAttribute("aria-readonly"), "true", fieldName);
        Assert.assertFalse(inputField.getAttribute("value") == null || inputField.getAttribute("value").isEmpty());
    }

    public void verifyInputFieldWithIndexInBlockIsReadOnlyWithValue(String fieldName, int index, String block) {
        WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input"));
        Assert.assertEquals(field.getAttribute("aria-readonly"), "true", fieldName);
        Assert.assertFalse(field.getAttribute("value") == null || field.getAttribute("value").isEmpty());
    }

    public void verifyTableCellsValue(int row, int cell, String block, String fieldName) throws Throwable {
        WebElement cellPos = driver.findElement(By.xpath("//div[text()='" + block + "']/../../../../../../..//table[" + row + "]//td[" + cell + "]//div"));
        Assert.assertFalse(cellPos.getText().isEmpty());
        pause(3000);
    }

    public void verifyQuestionIsHidden(String question, String block) {
        List<WebElement> hidden = driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../..//div[text()='" + question + "']/../../../..//div[@aria-hidden='true' and @role ='radiogroup']//*[text()='Yes' or text()='No' ]"));
        Assert.assertEquals(hidden.size(), 2);
    }

    public void verifySectionVisibility(String sectionName, String condition, String blockName) throws InterruptedException {
        List<WebElement> sections = driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../..//div[text()='" + sectionName + "'] | //div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + sectionName + "']"));
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(sections.size(), 1);
            Assert.assertTrue(sections.get(0).isDisplayed());
        } else {
            Assert.assertEquals(sections.size(), 0);
        }
    }

    public void verifyDropdownIsHidden(String input) {
        List<WebElement> hidden = driver.findElements(By.xpath("//div[text()='" + input + "']/../../../..//input[@aria-hidden='true']"));
        Assert.assertEquals(hidden.size(), 1);
    }

    public void verifyInputIsHidden(String input) {
        List<WebElement> hidden = driver.findElements(By.xpath("//div//*[text()='" + input + "']/../../../../../..//input"));
        Assert.assertEquals(hidden.get(0).getAttribute("aria-hidden"), "true", input);
    }

    public void verifyDropdownIsDisplayed(String input) {
        List<WebElement> displayed = driver.findElements(By.xpath("//div[text()='" + input + "']/../../../..//input"));
        Assert.assertEquals(displayed.size(), 1);
        Assert.assertEquals(displayed.get(0).getAttribute("aria-hidden"), "false", input);
    }

    public void verifyInputIsDisplayed(String input) {
        List<WebElement> displayed = driver.findElements(By.xpath("//div//*[text()='" + input + "']/../../../../../..//input"));
        List<WebElement> displayed2 = driver.findElements(By.xpath("//div//*[text()='" + input + "']/../../../..//input"));
        List<WebElement> displayed3 = driver.findElements(By.xpath("//div[text()='" + input + "']/../../../../../../../../../../..//input"));

        if (!displayed.isEmpty()) {
            Assert.assertEquals(displayed.size(), 1);
            Assert.assertEquals(displayed.get(0).getAttribute("aria-hidden"), "false", input);
        } else if (!displayed2.isEmpty()) {
            Assert.assertEquals(displayed2.size(), 1);
            Assert.assertEquals(displayed2.get(0).getAttribute("aria-hidden"), "false", input);
        } else {
            Assert.assertEquals(displayed3.size(), 1);
            Assert.assertEquals(displayed3.get(0).getAttribute("aria-hidden"), "false", input);
        }
    }

    public void verifyInputIsEmpty(String input) {
        WebElement inputField = driver.findElement(By.xpath("//div//*[text()='" + input + "']/../../../../../..//input"));
        Assert.assertTrue(inputField.getAttribute("value") == null || inputField.getAttribute("value").isEmpty());
    }

    public void deleteInputValue(String input) {
        WebElement field = driver.findElement(By.xpath("//div[text()='" + input + "']/../../../..//input"));
        field.clear();
    }

    public void verifyBlockPosition(String block, int position) {
        List<WebElement> blocks = driver.findElements(By.xpath("//div[contains(@class,'x-title-item')]/div[not(contains(text(), ' ')) and text() != '']"));
        int actualPosition = 0;
        for (int i = 0; i < blocks.size(); i++) {
            if (blocks.get(i).getText().equals(block)) {
                actualPosition = i + 1;
                break;
            }
        }
        Assert.assertEquals(actualPosition, position);
    }

    public void verifyReadOnlyComboboxFieldVisibility(String fieldName, String condition, String blockName) {
        List<WebElement> readOnlyFields = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "']/../../../../../../../../../../..//input[@role='combobox']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(readOnlyFields.size(), 1);
            Assert.assertTrue(readOnlyFields.get(0).isDisplayed());
        } else {
            Assert.assertEquals(readOnlyFields.size(), 0);
        }
    }

    public void clickCheckboxInBlock(String checkbox, String block) throws InterruptedException {
        clickElement(driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + checkbox + "']/../../../..//input[@type='checkbox']")), checkbox);
        pause(3000);
    }

    public void verifyTextareaVisibility(String textarea, String condition, String block) {
        List<WebElement> textareas = driver.findElements(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + textarea + "']/../../../..//textarea[@role='textbox'] | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + textarea + "']/..//div)[last()]")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(textareas.size(), 1);
            Assert.assertTrue(textareas.get(0).isDisplayed());
        } else {
            Assert.assertEquals(textareas.size(), 0);
        }
    }

    public void verifyValueDisplayed(String fieldName, String value) throws InterruptedException {
        WebElement field = driver.findElement(By.xpath("//div[text()='" + fieldName + "']/../../../..//input[@value='" + value + "'] | //div[text()='" + fieldName + "']/../../../../../../../../..//input[@value='" + value + "']"));
        Assert.assertTrue(field.isDisplayed());
        pause(2000);
    }

    public void verifyValueNotDisplayed(String fieldName, String value) throws InterruptedException {
        List<WebElement> field = driver.findElements(By.xpath("//div[text()='" + fieldName + "']/../../../..//input[@value='" + value + "'] | //div[text()='" + fieldName + "']/../../../../../../../../..//input[@value='" + value + "']"));
        if(field.isEmpty()){
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(field.get(0).isDisplayed());
        }
        pause(2000);
    }

    public void verifyInputFieldIsReadOnlyWithValue(String fieldName) {
        WebElement inputField = driver.findElement(By.xpath("//div[text()='" + fieldName + "']/../../../..//input[@role='textbox']"));
        Assert.assertEquals(inputField.getAttribute("aria-readonly"), "true", fieldName);
        Assert.assertFalse(inputField.getAttribute("value") == null || inputField.getAttribute("value").isEmpty());
    }

    public void verifyInputFieldIndexIsReadOnlyWithValue(String fieldName, int index) {
        WebElement inputField = driver.findElement(By.xpath("(//div[text()='" + fieldName + "']/../../../..//input)[" + index + "]"));
        Assert.assertEquals(inputField.getAttribute("aria-readonly"), "true", fieldName);
        Assert.assertFalse(inputField.getAttribute("value") == null || inputField.getAttribute("value").isEmpty());
    }

    public void zoomPage() throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
    }

    public void verifyInputFieldIndexBlock(String input, int index, String condition, String block) {
        try {
            WebElement inputField = driver.findElement(By.xpath("(//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + input + "'])[" + index + "]/../../../..//input | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../../..//div[text()='" + input + "'])[" + index + "]/../../../..//input | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../../..//div[text()='" + input + "'])[" + index + "]/../../../../..//input"));
            if (condition.equalsIgnoreCase("visible")) {
                Assert.assertTrue(inputField.isDisplayed());
            } else {
                Assert.assertFalse(inputField.isDisplayed());
            }

        } catch (NoSuchElementException e) {
            if (condition.equalsIgnoreCase("visible")) {
                throw e;
            }
        }
    }

    public void verifyValueIndexInBlock(String fieldName, int index, String value, String block) throws InterruptedException {
        WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input[@value='" + value + "'] | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input[@value='" + value + "'] | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input[@value='" + value + "']"));
        Assert.assertTrue(field.isDisplayed());
        pause(2000);
    }

    public void verifyValueIndexInBlockReadOnly(String fieldName, int index, String value, String block) throws InterruptedException {
        WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input[@value='" + value + "'] | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input[@value='" + value + "'] | (//div[contains(@class,'x-title-item')]/div[text()='" + block + "']/../../../../../../../../../..//div[text()='" + fieldName + "'])[last()]/../../../..//input[@value='" + value + "']"));
        Assert.assertTrue(field.isDisplayed());
        Assert.assertEquals(field.getAttribute("aria-readonly"), "true", fieldName);
        pause(2000);
    }

    public void scrollToBottom() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollableElement = driver.findElement(By.cssSelector("#framework-body"));
        js.executeScript("arguments[0].scrollTop += arguments[0].clientHeight * 3;", scrollableElement);
        pause(2000);
    }

    public boolean isFieldMandatory(String field) {
        List<WebElement> fields = driver.findElements(By.xpath("//div[text()='" + field + "']/../../../../div | //font[text()='" + field + "']/../../../../../../div | //p[text()='" + field + "']/../../../../../div | //div[text()='" + field + "']/../../../..//input/../../.. | //div[text()='" + field + "']/../../.."));
        boolean mandatory = false;

        for (WebElement webElement : fields) {
            if (webElement.getAttribute("class").contains("fieldMandatory") || webElement.getAttribute("class").contains("yellowMandatory") || webElement.getAttribute("class").contains("labelMandatory")) {
                mandatory = true;
                return mandatory;
            }
        }

        return mandatory;
    }

    public boolean isDistantQuestionMandatory(String question) {
        List<WebElement> fields = driver.findElements(By.xpath("//div[text()='" + question + "']/../../../../../../../../../../../..//input/../../.. | //div[text()='" + question + "']/../../../../../../..//input/../../.."));
        boolean mandatory = false;

        for (WebElement webElement : fields) {
            if (webElement.getAttribute("class").contains("fieldMandatory") || webElement.getAttribute("class").contains("yellowMandatory")) {
                mandatory = true;
            }
        }
        return mandatory;
    }

    public boolean isQuestionEnabled(String question) {
        List<WebElement> fields = driver.findElements(By.xpath("//div[text()='" + question + "']/../../../../../../../../../../../..//input/../../.. | //div[text()='" + question + "']/.././../../../../..//input/../../.."));
        boolean enabled = true;

        for (WebElement webElement : fields) {
            try {
                if (webElement.getAttribute("disabled").contains("disabled")) {
                    enabled = false;
                }
            } catch (Exception e) {
                enabled = true;
            }
        }
        return enabled;
    }

    public void verifyInputFieldInBlockIsReadOnlyAndEmpty(String fieldName, String blockName) {
        WebElement inputField = driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "']/../../../..//input | //div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "']/../../../../..//input"));
        Assert.assertEquals(inputField.getAttribute("aria-readonly"), "true", fieldName);
        Assert.assertTrue(inputField.getAttribute("value") == null || inputField.getAttribute("value").isEmpty());
    }

    public void verifyInputFieldIndexInBlockIsReadOnlyAndEmpty(String fieldName, int index, String blockName) {
        WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../../..//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input"));
        Assert.assertEquals(field.getAttribute("aria-readonly"), "true", fieldName);
        Assert.assertTrue(field.getAttribute("value") == null || field.getAttribute("value").isEmpty());
    }

    public void typeToFieldIndex(String value, String fieldName, int index) throws Throwable {
        typeTextEnter(driver.findElement(By.xpath("(//div[text()='" + fieldName + "'])[" + index + "]/../../../..//input")), value, fieldName);
        pause(2000);
    }

    public void typeToInputField(String value, String fieldName) throws InterruptedException {
        typeTextEnter(driver.findElement(By.xpath("(//div[text()='" + fieldName + "']/../../../..//input | //font[text()='" + fieldName + "']/../../../../../..//input | //p[text()='" + fieldName + "']/../../../../../..//input)")), value, fieldName);
        pause(2000);
    }

    public void verifyBtnVisibilityOnPage(String btn, String condition) {
        List<WebElement> buttons = driver.findElements(
                By.xpath("//span[text()='" + btn + "']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(buttons.size(), 1);
            Assert.assertTrue(buttons.get(0).isDisplayed());
        } else {
            Assert.assertEquals(buttons.size(), 0);
        }
    }

    public void verifyNavigatedPage(String page) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='" + page + "']")).isDisplayed());
    }

    public String getObjectId() {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(footer).click().keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("L").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
            pause(2000);
            WebElement usid = driver.findElement(By.xpath("//div[@class='x-toolbar-text x-status-text ready-icon x-box-item x-toolbar-item x-toolbar-text-default']"));
            String text = usid.getText();
            pause(1000);
            clickElement(driver.findElement(By.xpath("//div[@class='x-tool-tool-el x-tool-img x-tool-close ']")), "close button");
            return extractObjectID(text);

        } catch (Exception e) {
            return "Failed to get User Session Id -- error: " + e;
        }
    }

    private static String extractObjectID(String text) {
        String prefix = "current object:";
        int startIndex = text.indexOf(prefix);
        if (startIndex != -1) {
            startIndex += prefix.length();
            int endIndex = text.indexOf(",", startIndex);
            if (endIndex == -1) {
                endIndex = text.length();
            }
            return text.substring(startIndex, endIndex).trim();
        }
        return null;
    }

    public void iVerifyDropdownValuesDoNotContainTrailingSpaces(String dropdownName) throws InterruptedException, IOException {
        if (dropdownOptions.isEmpty() || !dropdownOptions.get(0).isDisplayed()) {
            infoLog("Dropdown '" + dropdownName + "' is not visible or has no options. Skipping verification.");
            return;
        }
        pause(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        SoftAssert softAssert = new SoftAssert();
        List<String> errors = new ArrayList<>();

        infoLog("Verifying dropdown: " + dropdownName);
        infoLog("Dropdown contains " + dropdownOptions.size() + " options:");

        for (WebElement dropdownOption : dropdownOptions) {
            String text = (String) js.executeScript("return arguments[0].textContent;", dropdownOption);

            if (text == null || text.trim().isEmpty()) {
                warningLog("Warning: Found an empty option in dropdown '" + dropdownName + "'. Skipping verification for this entry.");
                continue;
            }

            warningLog(" - '" + text + "'");

            if (text.charAt(0) == ' ') {
                String message = "Fail: Leading space detected in '" + text + "' (Dropdown: " + dropdownName + ")";
                errors.add(message);
                softAssert.fail(message);
            }
            if (text.charAt(text.length() - 1) == ' ') {
                String message = "Fail: Trailing space detected in '" + text + "' (Dropdown: " + dropdownName + ")";
                errors.add(message);
                softAssert.fail(message);
            }
            if (text.contains("  ")) {
                String message = "Fail: Double spaces detected in '" + text + "' (Dropdown: " + dropdownName + ")";
                errors.add(message);
                softAssert.fail(message);
            }
            if (!text.matches("[a-zA-Z0-9\\- $%.,/]*")) {
                String message = "Fail: Forbidden special characters detected in '" + text + "'";
                softAssert.fail(message);
                errors.add(message);
            }
            pause(500);
        }
        pause(2000);

        if (!errors.isEmpty()) {
            writeErrorsToFile(errors, dropdownName);
            for (String error : errors) {
                errorLog(error);
            }
        }
        try {
            softAssert.assertAll();
        } catch (AssertionError e) {
            errorLog("Soft assertions failed, but test is continuing. Errors:\n" + e.getMessage());
        }
        pause(3000);
    }

    public void writeErrorsToFile(List<String> errors, String dropdownName) throws IOException {
        String fileName = "DropdownResults.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Test Errors for Dropdown: " + dropdownName);
            writer.println("-------------------------------------");

            for (String error : errors) {
                writer.println(error);
            }
            writer.println();
        }
    }

    public void verifyTabVisibilityOnPage(String tab, String condition) {
        List<WebElement> buttons = driver.findElements(
                By.xpath("//span[text()='" + tab + "'] | //b[text()='" + tab + "']")
        );
        if (condition.equalsIgnoreCase("visible")) {
            Assert.assertEquals(buttons.size(), 1);
            Assert.assertTrue(buttons.get(0).isDisplayed());
        } else {
            Assert.assertEquals(buttons.size(), 0);
        }
    }

    public void verifyColumnCellValue(int row, int cell, String block, String value) {
        WebElement cellValue = driver.findElement(By.xpath("//div[text()='" + block + "']/../../../../../..//table[" + row + "]//tr//td[" + cell + "]//div"));
        Assert.assertEquals(cellValue.getText(), value);
    }

    public void verifyOptionsNotPresentInDropdown(String dropdownName, DataTable dataTable) {
        List<String> forbiddenValues = dataTable.column(0);
        List<WebElement> options = driver.findElements(By.xpath("//div[text()='" + dropdownName + "']/../../../../../..//div/ul/li[@role='option'] | //font[text()='" + dropdownName + "']/../../../../../../../../../../../../../../../../../../../../../../../../../../..//div//ul/li[@role='option']"));
        List<String> actualValues = options.stream().map(e -> e.getText().trim()).collect(Collectors.toList());

        for (int i = 1; i < forbiddenValues.size(); i++) {
            String forbidden = forbiddenValues.get(i);
            if (!actualValues.contains(forbidden)) {
                System.out.println("\u001B[32mValue '" + forbidden + "' is not present in the dropdown.\u001B[0m");
            } else {
                System.out.println("\u001B[31mValue '" + forbidden + "' is present in the dropdown.\u001B[0m");
            }
            Assert.assertFalse(actualValues.contains(forbidden));
        }
    }

    public void navigateToBreadCrumb(String breadCrumb) {
        clickElement(driver.findElement(By.xpath("//span[text()='" + breadCrumb + "']")), breadCrumb);
    }

    public void clickBtn(String button) throws InterruptedException {
        clickElement(driver.findElement(By.xpath("//span[text()='" + button + "']")), button);
        pause(3000);
    }

    public void clickBtnVisible(String button) throws InterruptedException {
        if (!driver.findElements(By.xpath("//span[text()='" + button + "']")).isEmpty() && isElementDisplayed((driver.findElements(By.xpath("//span[text()='" + button + "']"))).get(0), 5)) {
            clickElement(driver.findElement(By.xpath("//span[text()='" + button + "']")), button);
            pause(3000);
        }
    }

    public void clickBtnIndex(String button, int index) throws Throwable {
        clickElement(driver.findElement(By.xpath("(//span[text()='" + button + "'])[" + index + "]")), button);
        pause(3000);
    }

    public void verifyLabelBold(String label) {
        WebElement element = driver.findElement(By.xpath("//div[text()='" + label + "']"));
        Assert.assertTrue(element.getAttribute("style").replace(" ", "").contains("font-weight:bold"));
    }

    public boolean isReadOnly(WebElement element) {
        String readOnly = element.getAttribute("readonly");
        return readOnly != null;
    }

    public void navigateToTab(String tab) {
        clickElement(driver.findElement(By.xpath("//span[text()='" + tab + "']")), tab);
    }

    public void verifyLabelVisibilityInBlock(String label, String condition, String block) throws InterruptedException {
        pause(5000);
        try {
            WebElement element = driver.findElement(By.xpath("//div[contains(@class,'x-title-item')]/div[contains(text(), '" + block + "')]/../../../../../..//div[contains(text(), '" + label + "')] | //div[contains(@class,'x-title-item')]/div[contains(text(), '" + block + "')]/../../../../../..//b[contains(text(), '" + label + "')] | //div[contains(@class,'x-title-item')]/div[contains(text(), '" + block + "')]/../../../../../../../../../..//div[contains(text(), '" + label + "')]"));
            if (condition.equalsIgnoreCase("visible")) {
                Assert.assertTrue(element.isDisplayed());
            } else {
                Assert.assertFalse(element.isDisplayed());
            }
        } catch (NoSuchElementException e) {
            if (condition.equalsIgnoreCase("visible")) {
                throw e;
            }
        }
    }

    public void verifyLabelVisibilityOnPage(String label, String condition) {
        try {
            WebElement element = driver.findElement(By.xpath("//div[contains(text(), \"" + label + "\")] | //b[contains(text(), \"" + label + "\")]"));
            if (condition.equalsIgnoreCase("visible")) {
                Assert.assertTrue(element.isDisplayed());
            } else {
                Assert.assertFalse(element.isDisplayed());
            }
        } catch (NoSuchElementException e) {
            if (condition.equalsIgnoreCase("visible")) {
                throw e;
            }
        }
    }

    public void verifyHasValueFieldListTable(String label, String fieldList) {
        String[] fields = fieldList.split(",");

        for (String rawField : fields) {
            String fieldName = rawField.trim().toLowerCase();
            WebElement fieldElement;
            switch (fieldName) {
                case "limit":
                    fieldElement = driver.findElement(By.xpath("//tr[td = '" + label + "']/td[3]/div"));
                    break;
                case "deductible":
                    fieldElement = driver.findElement(By.xpath("//tr[td = '" + label + "']/td[4]/div"));
                    break;
                case "premiums":
                    fieldElement = driver.findElement(By.xpath("//tr[td = '" + label + "']/td[5]/div"));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown field: " + fieldName);
            }
            String value = fieldElement.getText();
            Assert.assertNotNull(value);
            Assert.assertFalse(value.trim().isEmpty());
        }
    }


    public void verifyFieldValueInRange(String field, String minValue, String maxValue) {
        String xpath = "//*[contains(text(),'" + field + "')]/../../../..//input[@aria-hidden='false']";
        WebElement element = driver.findElement(By.xpath(xpath));
        String actualValue = element.getAttribute("value");

        if (actualValue == null || actualValue.isEmpty()) {
            reportScreenshot("Field Value", "No Value");
            failAssertion("Field '" + field + "' has no value");
            return;
        }

        String trimmedValue = actualValue.split(" ")[0];

        try {
            double actualNum = Double.parseDouble(trimmedValue);
            double min = Double.parseDouble(minValue);
            double max = Double.parseDouble(maxValue);

            if (actualNum >= min && actualNum <= max) {
                successLog("Field: " + field + " has value '" + actualNum + "' within range [" + min + ", " + max + "]");
                reportScreenshot("Field Value Range", "In Range: " + actualValue);
            } else {
                reportScreenshot("Field Value Range", "Out of Range: " + actualValue);
                failAssertion("Field '" + field + "' value '" + actualNum + "' is NOT between " + min + " and " + max);
            }
        } catch (NumberFormatException e) {
            failAssertion("Field '" + field + "' value is not numeric. Cannot validate range. Value: '" + actualValue + "'");
        }
    }

    public String iGetValueFromField(String field) {
        String xpath = "//*[contains(text(),'" + field + "')]/../../../..//input[@aria-hidden='false']";
        WebElement element = driver.findElement(By.xpath(xpath));
        String rawValue = element.getAttribute("value");
        return rawValue == null ? "" : rawValue.trim();
    }

    public void compareTextOnUI(String fieldLabel, String expectedText, String yesOrNo, int index) {
        String xpath = "//*[contains(text(),'" + fieldLabel + "')]/../../../../div/div[@role='textbox']";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));

        if (index < 0 || index >= elements.size()) {
            throw new IllegalArgumentException("Index " + index + " is out of bounds for matched elements.");
        }

        WebElement element = elements.get(index);
        String actualText = element.getText().trim();
        String readonlyAttr = element.getAttribute("aria-readonly");

        boolean textMatches = actualText.equalsIgnoreCase(expectedText);
        boolean readonlyMatches = !"yes".equalsIgnoreCase(yesOrNo) || "true".equalsIgnoreCase(readonlyAttr);

        if (textMatches && readonlyMatches) {
            successLog("Text and read-only status are correct. Text: '" + actualText + "'");
            reportScreenshot("Success_" + System.currentTimeMillis(), "Text and read-only status are correct.");
        } else {
            StringBuilder errorMsg = new StringBuilder("Validation failed: ");
            if (!textMatches) {
                errorMsg.append("Text mismatch. Expected: '").append(expectedText)
                        .append("' but found: '").append(actualText).append("'. ");
            }
            if ("yes".equalsIgnoreCase(yesOrNo) && !"true".equalsIgnoreCase(readonlyAttr)) {
                errorMsg.append("Field is not read-only as expected.");
            }
            failAssertion(errorMsg.toString());
            reportScreenshot("Fail_" + System.currentTimeMillis(), "Text mismatch");
            reportTextAttachment("Attachment", errorMsg.toString());
        }
    }


    public void iClickSelected(String value) {
        String xpath = "//*[text()='" + value + "']";
        WebElement element = driver.findElement(By.xpath(xpath));

        clickElement(element, "Clicked: " + value);
    }

    public void iClickSelectedWithIndex(String value, int index) {
        String xpath = "//*[contains(text(),'" + value + "')]";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));

        if (index >= 0 && index < elements.size()) {
            WebElement element = elements.get(index);
            clickElement(element, "Clicked: " + value + " at index " + index);
        } else {
            throw new NoSuchElementException("No element found at index " + index + " for value: " + value);
        }
    }


    public String iGetPolicyNumberFromUI() {
        String xpath = "//*[text()='Policy #']/../../../../div/div";
        WebElement policyElement = driver.findElement(By.xpath(xpath));
        return policyElement.getText().trim();
    }

    public String replaceDollarOrSetDefaultKeyValue(String key) {
        String value = DataManager.getInstance().getData().get(key);
        return (value != null) ? value.replace("$", "").trim() : "0";
    }

    public String formatAndRoundGrandTotal(String grandTotal) {
        if (grandTotal == null || grandTotal.equalsIgnoreCase("not_set")) {
            return "0";
        }
        double value = parseCurrency(grandTotal);
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(value);
    }

    public double parseCurrency(String currency) {
        if (currency == null || currency.isEmpty()) {
            throw new NumberFormatException("Input string is null or empty");
        }
        return Double.parseDouble(currency.replace("$", "").replace(",", "").trim());
    }

    public void verifyCheckboxState(String fieldLabel, String expectedState) {
        String xpath = "//div[contains(text(),'" + fieldLabel + "')]/../../../../div//input[@type='checkbox']";

        WebElement checkbox = driver.findElement(By.xpath(xpath));
        boolean actualChecked = checkbox.isSelected();
        boolean expectedChecked = expectedState.equalsIgnoreCase("checked");

        if (actualChecked != expectedChecked) {
            failAssertion("Checkbox '" + fieldLabel + "' state mismatch. Expected: "
                    + expectedState + ", but was: " + (actualChecked ? "checked" : "unchecked"));
            reportScreenshot("Screenshot", "failure");
        } else {
            successLog("Filed checkbox | Expected: " + expectedState + " Actual: " + (actualChecked ? "checked" : "unchecked"));
            reportScreenshot("Screenshot", "Success");
        }
    }

    public void iCheckCheckBoxField(String fieldLabel) {
        String xpath = "//*[contains(text(),'" + fieldLabel + "')]/../../../..//input";

        WebElement checkbox = driver.findElement(By.xpath(xpath));
        clickElement(checkbox, "Field " + fieldLabel + " Checked");
    }

    public void writeDateToField(String field, int offsetDays) throws Throwable {
        String date = LocalDate.now()
                .plusDays(offsetDays)
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        WebElement input = driver.findElement(By.xpath(
                String.format("//*[text()='%s']/../../../..//input[@aria-hidden='false']", field)));

        if (!input.isEnabled() || input.getAttribute("readonly") != null) return;

        scrollToWebElement(input);
        pause(1000);
        typeTextEnter(input, date, field);
        clickFooter();
        pause(500);
    }

    public boolean isFieldEditable(String fieldLabel) {
        String xpath = "//*[contains(text(),'" + fieldLabel + "')]/../../../..//input[@aria-readonly='false']";
        WebElement input = driver.findElement(By.xpath(xpath));
        return input.isEnabled();
    }

    public void verifyDropdownListVisibility(String expectedField, String expectedValue, String shouldAppear) throws Throwable {
        String fieldXpath = String.format("//*[text()='%s']/../../../..//input[@aria-hidden='false']", expectedField);
        WebElement field = driver.findElement(By.xpath(fieldXpath));

        field.click();
        pause(500);

        reportScreenshot(expectedField, "Dropdrown values");

        String dropdownXpath = String.format("//*[text()='%s']/ancestor::body//ul[@aria-hidden='false']", expectedField);

        List<WebElement> dropdownItems = driver.findElements(By.xpath(dropdownXpath + "/li[@role='option']"));

        boolean valueFound = dropdownItems.stream().anyMatch(item -> item.getText().trim().equalsIgnoreCase(expectedValue));
        boolean shouldAppearBoolean = shouldAppear.equalsIgnoreCase("Yes");

        if (valueFound == shouldAppearBoolean) {
            successLog("PASS: Expected value '" + expectedValue + "' is " + (shouldAppearBoolean ? "present" : "not present") + " in the dropdown as expected.");
        } else {
            failAssertion("FAIL: Expected value '" + expectedValue + "' is " + (shouldAppearBoolean ? "not present" : "present") + " in the dropdown.");
        }
    }

    public void switchToNewWindowsHandle(int window) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(window));
        pause(1000);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().maximize();
    }

    public void closeCurrentWindowAndReturn() {
        driver.close();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }


    public String extractDocId(String url) {
        if (url == null || !url.contains("docid=")) {
            return null;
        }
        try {
            int startIndex = url.indexOf("docid=") + 6;
            int endIndex = url.indexOf("&", startIndex);

            if (endIndex == -1) {
                return url.substring(startIndex);
            }

            return url.substring(startIndex, endIndex);
        } catch (Exception e) {
            return null;
        }
    }

    public void typeTextFast(WebElement element, String text, String log) {
        int maxRetries = 2;

        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOf(element));
                wait.until(ExpectedConditions.elementToBeClickable(element));

                Actions actions = new Actions(driver);
                actions.moveToElement(element)
                        .pause(100)
                        .click()
                        .pause(600)
                        .sendKeys(text)
                        .build()
                        .perform();

                infoLog("Entered text: '" + text + "' into element: '" + log + "'");
                return;
            } catch (Exception e) {
                infoLog("Attempt " + attempt + " failed: " + e.getMessage());
            }
        }
        warningLog("Warning: Failed to type text after " + maxRetries + " attempts into element: '" + log + "'");
    }

    public String getAllTextsFromGrid() {
        StringBuilder textBuilder = new StringBuilder();

        List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'x-grid-view') and contains(@class,'x-grid-with-col-lines')]//td[2]"));

        for (WebElement element : elements) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                textBuilder.append(text).append(",");
            }
        }

        if (textBuilder.length() > 0) {
            textBuilder.setLength(textBuilder.length() - 1);
        }

        return textBuilder.toString();
    }

    public void verifyTextsDisplayed(String commaSeparatedTexts) {

        String[] texts = commaSeparatedTexts.split(",");

        for (String text : texts) {
            String dynamicXPath = "//*[text()='" + text + "']";

            List<WebElement> foundElements = driver.findElements(By.xpath(dynamicXPath));

            if (foundElements.size() > 0 && foundElements.get(0).isDisplayed()) {
                infoLog("Text '" + text + "' is displayed.");
            } else {
                infoLog("Text '" + text + "' is NOT displayed.");
                reportTextAttachment("Not displayed", text);
            }
        }
        reportScreenshot("Referrals", "Referrals");
        reportTextAttachment("Referral", commaSeparatedTexts);
    }

    public String getFullStateName(String abbreviation) {
        Map<String, String> stateMap = new HashMap<>();
        stateMap.put("AL", "Alabama");
        stateMap.put("AK", "Alaska");
        stateMap.put("AZ", "Arizona");
        stateMap.put("AR", "Arkansas");
        stateMap.put("CA", "California");
        stateMap.put("CO", "Colorado");
        stateMap.put("CT", "Connecticut");
        stateMap.put("DE", "Delaware");
        stateMap.put("FL", "Florida");
        stateMap.put("GA", "Georgia");
        stateMap.put("HI", "Hawaii");
        stateMap.put("ID", "Idaho");
        stateMap.put("IL", "Illinois");
        stateMap.put("IN", "Indiana");
        stateMap.put("IA", "Iowa");
        stateMap.put("KS", "Kansas");
        stateMap.put("KY", "Kentucky");
        stateMap.put("LA", "Louisiana");
        stateMap.put("ME", "Maine");
        stateMap.put("MD", "Maryland");
        stateMap.put("MA", "Massachusetts");
        stateMap.put("MI", "Michigan");
        stateMap.put("MN", "Minnesota");
        stateMap.put("MS", "Mississippi");
        stateMap.put("MO", "Missouri");
        stateMap.put("MT", "Montana");
        stateMap.put("NE", "Nebraska");
        stateMap.put("NV", "Nevada");
        stateMap.put("NH", "New Hampshire");
        stateMap.put("NJ", "New Jersey");
        stateMap.put("NM", "New Mexico");
        stateMap.put("NY", "New York");
        stateMap.put("NC", "North Carolina");
        stateMap.put("ND", "North Dakota");
        stateMap.put("OH", "Ohio");
        stateMap.put("OK", "Oklahoma");
        stateMap.put("OR", "Oregon");
        stateMap.put("PA", "Pennsylvania");
        stateMap.put("RI", "Rhode Island");
        stateMap.put("SC", "South Carolina");
        stateMap.put("SD", "South Dakota");
        stateMap.put("TN", "Tennessee");
        stateMap.put("TX", "Texas");
        stateMap.put("UT", "Utah");
        stateMap.put("VT", "Vermont");
        stateMap.put("VA", "Virginia");
        stateMap.put("WA", "Washington");
        stateMap.put("WV", "West Virginia");
        stateMap.put("WI", "Wisconsin");
        stateMap.put("WY", "Wyoming");

        return stateMap.getOrDefault(abbreviation.toUpperCase(), abbreviation);
    }

    public String returnElementAttributeValue(WebElement element) {
        String value = element.getAttribute("value");
        return value != null ? value : "";
    }

    public String extractStreetNumAndIncrement(String address, int amount) {
        if (address == null || address.isBlank())
            return address;

        String trimmed = address.trim();

        if (trimmed.toUpperCase().startsWith("PO BOX")) {
            String[] parts = trimmed.split(" ", 3);
            if (parts.length == 3) {
                try {
                    int poNumber = Integer.parseInt(parts[2]);
                    poNumber += amount;
                    return parts[0] + " " + parts[1] + " " + poNumber;
                } catch (NumberFormatException e) {
                    return address;
                }
            }
            return address;
        }

        String[] parts = trimmed.split(" ", 2);
        try {
            int number = Integer.parseInt(parts[0]);
            number += amount;
            return number + " " + (parts.length > 1 ? parts[1] : "");
        } catch (NumberFormatException e) {
            return address + " " + amount;
        }
    }

    public void clickAddBtn() throws Throwable {
        clickElement(addBtn);
        pause(1000);
    }

    public void checkIsElementMandatory(WebElement element, String mandatoryYesOrNo) {
        if (mandatoryYesOrNo.equalsIgnoreCase("Not Mandatory")) {
            if (element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is mandatory");
            } else successLog(element + " is not mandatory");

        } else {
            if (!element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is not mandatory");
            } else successLog(element + " is mandatory");
        }
    }

    public void isTreeNodeDisplayed(String nodeValue, String expectation) throws InterruptedException {
        pause(5000);

        boolean isElementPresent = !driver.findElements(By.xpath("//a[contains(text(),'" + nodeValue + "')]")).isEmpty();
        boolean shouldBeDisplayed = !expectation.equalsIgnoreCase("Not Displayed");

        if (isElementPresent != shouldBeDisplayed) {
            String message = shouldBeDisplayed
                    ? "Element with message: " + nodeValue + " is not displayed when it should be"
                    : "Element with message: " + nodeValue + " is displayed when it shouldn't be";

            failAssertion(message);
        }
        reportScreenshot("Verify Element", nodeValue);

        if (!isElementPresent && !shouldBeDisplayed) {
            reportScreenshot("Verify Element Not Displayed", nodeValue);
        }

        if (isElementPresent && shouldBeDisplayed) {
            String xpath = String.format("//a[contains(text(),'%s')]", nodeValue);
            WebElement inputField = driver.findElement(By.xpath(xpath));
            scrollToWebElement(inputField);
            reportScreenshot("Verify Element Displayed", nodeValue);
        }
    }

    public void checkIsRadioBtnMandatoryForLabel(String labelName, String option, String mandatoryYesOrNo) {
        WebElement element = driver.findElement(By.xpath("//div[text()='" + labelName + "']/../../../..//label[text()='" + option + "']/../../../..//input"));

        if (mandatoryYesOrNo.equalsIgnoreCase("Not Mandatory")) {
            if (element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is mandatory");
            } else successLog(element + " is not mandatory");

        } else {
            if (!element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is not mandatory");
            } else successLog(element + " is mandatory");
        }
    }

    public void checkIsTextareaMandatory(String textareaTitle, String mandatoryYesOrNo) {
        WebElement element = driver.findElement(By.xpath("//div[text()='" + textareaTitle + "']/../../../..//textarea"));

        if (mandatoryYesOrNo.equalsIgnoreCase("Not Mandatory")) {
            if (element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is mandatory");
            } else successLog(element + " is not mandatory");

        } else {
            if (!element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is not mandatory");
            } else successLog(element + " is mandatory");
        }
    }

    public void checkIsFieldMandatoryByXPath(String name, String mandatoryYesOrNo) {
        WebElement element = driver.findElement(By.xpath("//*[text()='" + name + "']/../../../..//input"));

        if (mandatoryYesOrNo.equalsIgnoreCase("Not Mandatory")) {
            if (element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is mandatory");
            } else successLog(element + " is not mandatory");

        } else {
            if (!element.getCssValue("background-color").equals("rgb(255, 255, 153)")) {
                failAssertion(element + " is not mandatory");
            } else successLog(element + " is mandatory");
        }
    }

    public void verifyTextareaFieldIsVisibleWithInputField(String text, String businessVariable, String expectation) throws InterruptedException {

        pause(5000);
        boolean isElementPresent = !driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]/../../../..//textarea[@aria-hidden='false' and contains(@name,'" + businessVariable + "')]")).isEmpty();
        boolean shouldBeDisplayed = !expectation.equalsIgnoreCase("Not Displayed");

        if (isElementPresent != shouldBeDisplayed) {
            String message = shouldBeDisplayed
                    ? "Element with message: " + text + " is not displayed when it should be"
                    : "Element with message: " + text + " is displayed when it shouldn't be";

            reportScreenshot("Verify Element if Mismatch", text);
            failAssertion(message);
        }
        if (!isElementPresent && !shouldBeDisplayed) {
            reportScreenshot("Verify Element Not Displayed", text);
        }
        if (isElementPresent && shouldBeDisplayed) {
            String xpath = String.format("//*[contains(text(),'%s')]", text);
            WebElement inputField = driver.findElement(By.xpath(xpath));
            scrollToWebElement(inputField);
            reportScreenshot("Verify Element Displayed", text);
        }
    }

    public void isElementVisibleWithinBlock(String elementValue, String blockName, String expectation) throws InterruptedException {
        pause(5000);

        boolean isElementPresent = !driver.findElements(By.xpath("//div[text()='" + blockName + "']/../../../../../..//div[text()='" + elementValue + "']")).isEmpty();
        boolean shouldBeDisplayed = !expectation.equalsIgnoreCase("Not Displayed");

        if (isElementPresent != shouldBeDisplayed) {
            String message = shouldBeDisplayed
                    ? "Element with message: " + elementValue + " is not displayed when it should be"
                    : "Element with message: " + elementValue + " is displayed when it shouldn't be";

            failAssertion(message);
        }
        reportScreenshot("Verify Element", elementValue);

        if (!isElementPresent && !shouldBeDisplayed) {
            reportScreenshot("Verify Element Not Displayed", elementValue);
        }

        if (isElementPresent && shouldBeDisplayed) {
            String xpath = String.format("//div[text()='" + blockName + "']/../../../../../..//div[text()='%s']", elementValue);
            WebElement inputField = driver.findElement(By.xpath(xpath));
            scrollToWebElement(inputField);
            reportScreenshot("Verify Element Displayed", elementValue);
        }
    }

    public void verifyFieldEditableStatus(String fieldLabel, String trueOrFalse, int index) {
        String xpath = "(//*[contains(text(),'" + fieldLabel + "')]/../../../..//input)[" + index + "]";

        WebElement element = driver.findElement(By.xpath(xpath));
        String readOnlyAttr = element.getAttribute("aria-readonly");

        if (trueOrFalse.equalsIgnoreCase("False") && !readOnlyAttr.equalsIgnoreCase(trueOrFalse)) {
            failAssertion("Element is not editable");
        } else successLog("Element is editable");

        if (trueOrFalse.equalsIgnoreCase("True") && !readOnlyAttr.equalsIgnoreCase(trueOrFalse)) {
            failAssertion("Element is editable");
        } else successLog("Element is not editable");
    }

    public void verifyDefaultValueOfInputFieldForElement(String fieldLabel, String value) {
        String xpath = "//div[text()='" + fieldLabel + "']/../../../..//input";

        WebElement element = driver.findElement(By.xpath(xpath));
        String elementInputDefaultValue = element.getAttribute("value");

        if (elementInputDefaultValue.equalsIgnoreCase(value)) {
            infoLog("Input default value:" + " " + elementInputDefaultValue + "is equal to" + " " + value);
        } else
            failAssertion("Input default value:" + " " + elementInputDefaultValue + "is not equal to" + " " + value);
    }

    public void clickAddBtnWithIndex(int index) throws Throwable {
        clickElement(driver.findElement(By.xpath("(//span[text()='add'] | //span[text()='Add'])[" + index + "]")));
        pause(2000);
    }

    public void verifyRadioButtonIsChecked(String labelName, String blockName, String option, String expectation) {
        WebElement radioButton = driver.findElement(
                By.xpath("//div[contains(@class,'x-title-item')]/div[text()='" + blockName + "']/../../../../../../../../..//div[text()='" + labelName + "']/../../../..//label[text()='" + option + "']/..//input"));

        if (radioButton.isSelected() && expectation.equalsIgnoreCase("Checked")) {
            successLog("Radio button is checked");
        } else if (!radioButton.isSelected() && expectation.equalsIgnoreCase("Checked")) {
            failAssertion("Radio button is not checked when it should be");
        }

        if (!radioButton.isSelected() && expectation.equalsIgnoreCase("Not checked")) {
            successLog("Radio button is not checked");
        } else if (radioButton.isSelected() && expectation.equalsIgnoreCase("Not checked")) {
            failAssertion("Radio button is checked when it shouldn't be");
        }
    }

    public boolean isPSEValidationPresent() {
        setImplicitWaitTo(2);
        boolean trueOrFalse;
        trueOrFalse = elementExists(driver.findElements(By.xpath("//*[@id='os-messages']//span"))) &&
                driver.findElements(By.xpath("//*[@id='os-messages']//span")).get(0).getText().contains("A signed PSE Membership Agreement is needed for this policy. Please collect and upload the signed agreement under the required forms tab");
        setImplicitWaitToDefault();
        return trueOrFalse;
    }

    public void clickToCreateNonAdmittedPrimaryFloodQuote() throws Throwable {
        clickFooter();
        clickElement(createNonAdmittedPrimaryFloodQuote, "Click here to create a Non-Admitted Primary Flood quote");
        saveChanges();
        pause(8000);
    }

    public void clickFSLink() throws Throwable {
        List<WebElement> link = driver.findElements(By.xpath("//a[contains(text(),'Link to Flood Surplus Lines')]"));
        if (!link.isEmpty()) {
            scrollToWebElement(link.get(0));
            clickElement(link.get(0), "Link to Flood Surplus Lines");
        } else {
            clickElement(driver.findElement(By.xpath("//span[text()='Click here to create a Non-Admitted Primary Flood quote']")), "Click here to create a Non-Admitted Primary Flood quote");
            saveChanges();
            pause(7000);
            scrollToWebElement(driver.findElements(By.xpath("//a[contains(text(),'Link to Flood Surplus Lines')]")).get(0));
            clickElement(driver.findElements(By.xpath("//a[contains(text(),'Link to Flood Surplus Lines')]")).get(0), "Link to Flood Surplus Lines");
        }
    }

    public void forEachNodePerformAction(By nodesLocator, Consumer<WebElement> perNode) throws Throwable {
        int count = driver.findElements(nodesLocator).size();
        for (int i = 0; i < count; i++) {
            clickFooter();

            WebElement node = driver.findElements(nodesLocator).get(i);
            clickElement(node, "Node");
            pause(4000);
            perNode.accept(driver.findElements(nodesLocator).get(i));
            clickFooter();
        }
    }

    public boolean isFloodDate1(String date) {
        return isSecondDateAfterFirstDate("09/07/2025", date) || date.equalsIgnoreCase("09/07/2025");
    }

    public boolean isFloodDate2(String date) {
        return isSecondDateAfterFirstDate("10/19/2025", date) || date.equalsIgnoreCase("10/19/2025");
    }

    public boolean isFloodState1(String state) {
        String[] arr = {"FL", "LA", "NC", "AL", "MS", "MA", "GA", "CT", "NJ", "CO"};
        return Arrays.asList(arr).contains(state);
    }

    public boolean isFloodState1a(String state) {
        String[] arr = {"IL", "CO", "NJ", "GA", "CT", "MA"};
        return Arrays.asList(arr).contains(state);
    }

    public boolean isFloodState1b(String state) {
        String[] arr = {"CA", "FL", "MS", "AL", "NC", "LA", "GA", "CT", "MA", "NJ", "CO"};
        return Arrays.asList(arr).contains(state);
    }

    public boolean isFloodState2(String state) {
        String[] arr = {"RI", "PA", "VA"};
        return Arrays.asList(arr).contains(state);
    }

}