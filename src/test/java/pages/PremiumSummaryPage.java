package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import pages.utils.SoftAssertion;
import steps.dragon.DragonSteps;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PremiumSummaryPage extends CommonComponentsAndActions {
    WebDriver driver;

    public PremiumSummaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='details']/../../../../../../div[2]//table//td[2]")
    List<WebElement> premiumName;
    @FindBy(xpath = "//div[text()='details']/../../../../../../div[2]//table//td[5]")
    List<WebElement> premium;
    @FindBy(xpath = "//span[contains(text(),'quote proposal')]")
    List<WebElement> quoteProposal;
    @FindBy(xpath = "//a//span[text()='premium']")
    List<WebElement> tabPremium;
    @FindBy(xpath = "//a//span[text()='quote details']")
    WebElement tabQuoteDetails;
    @FindBy(xpath = "//div[text()='premium summary']")
    WebElement premiumSummaryBlock;
    @FindBy(xpath = "(//div[text()='premium summary']/../../../../../..//table//td//div//div[@role='textbox'])[1]")
    WebElement totalPremium;
    @FindBy(xpath = "//div[text()='State Mandated Assessments']/../../../../div/div[@role='textbox']")
    WebElement stateMandatedAssessments;
    @FindBy(xpath = "//span[text()='deductible scenarios']")
    WebElement deductibleScenariosButton;
    @FindBy(xpath = "//div[text()='Total Location Premium']/../../td[last()]")
    WebElement totalLocationPremium;
    @FindBy(xpath = "//div[text()='Grand Total']/../../../../div/div[@osviewid]")
    public WebElement grandTotal;
    @FindBy(xpath = "//span[contains(text(),'Send renewal Offer')]")
    WebElement sendRenewalOffer;

    public Map<String, String> getPremiumList() {
        Map<String, String> premiumMap = new HashMap<>();
        for (int i = 0; i < premiumName.size(); i++) {
            if (premiumName.get(i).getText().trim().length() > 2 && premium.get(i).getText().trim().length() > 2) {
                String key = "Premium_" + premiumName.get(i).getText().trim();
                String val = premium.get(i).getText().trim();
                int count = 0;
                while (premiumMap.containsKey(key)) {
                    key = key + "_" + ++count;
                }
                premiumMap.put(key, val);
            }
        }
        storeMapToTxt("fileOne.txt", premiumMap);
        return premiumMap;
    }

    public void storeMapToTxt(String fileName, Map<String, String> premiumMap) {
        try {
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);

            for (Map.Entry<String, String> m : premiumMap.entrySet()) {
                pw.println(m.getKey() + "=" + m.getValue());
            }

            pw.flush();
            pw.close();
            fos.close();
        } catch (Exception e) {
            //
        }
    }

    public void verifyTotalPremiumValue(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Total Premium']/../../../../div/div")).getText().replace(" ", ""), value, "Total premium");
    }

    public void verifyTotalAnnualizedPremiumValue(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Total Annualized Premium']/../../../../div/div")).getText().replace(" ", ""), value, "Total annualized premium");
    }

    public void verifyInspectionFeeValue(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Inspection Fee']/../../../../div/div")).getText().replace(" ", ""), value, "Inspection Fee");
    }

    public void verifySurplusLinesBrokerFeeValue(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Surplus Lines Broker Fee']/../../../../div/div")).getText().replace(" ", ""), value, "Surplus Lines Broker Fee");
    }

    public void verifyStateMandatedAssessmentsValue(String value) {
        assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'State Mandated Assessments')]/../../../../div/div")).getText().replace(" ", ""), value, "State Mandated Assessments*");
    }

    public void verifyGrandTotalValue(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Grand Total']/../../../../div/div[@osviewid]")).getText().replace(" ", ""), value, "Grand Total");
    }

    public void printPremiumDetails(String state) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(state);
        System.out.println(driver.findElement(By.xpath("//div[text()='Total Premium']/../../../../div/div")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Inspection Fee']/../../../../div/div")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Surplus Lines Broker Fee']/../../../../div/div")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='State Mandated Assessments*']/../../../../div/div")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Grand Total']/../../../../div/div[@osviewid]")).getText());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public void generateAndVerifyQuoteProposal(String docName, Map<String, String> data) throws Throwable {
        DragonSteps steps = new DragonSteps();

        pause(3000);
        if (quoteProposal.size() == 0) {
            if (data.get("Admitted_Line").equalsIgnoreCase("Collection")) {
                pause(5000);
                if (elementExists(driver.findElements(By.xpath("//*[@id='os-messages']//span"))) &&
                        driver.findElements(By.xpath("//*[@id='os-messages']//span")).get(0).getText().equalsIgnoreCase("HVI was updated and premium may have been impacted. If calculated HVI is incorrect, please contact u/w manager.")) {
                    clickRate();
                    navigateToUnderwritingReferralsPage();
                    steps.iAcceptUnderwritingReferrals();
                }
                clickElement(tabPremium.get(0), "Premium");
                pause(2000);
            } else if (data.get("State").equals("FL")) {
                // Switching from summary to premium tab because of unique FL logic for accepting UWs
                if (tabPremium.size() == 0) {
                    clickElement(tabQuoteDetails, "Quote Details");
                    pause(2000);
                    rateQuote();
                    pause(5000);
                }
                pause(3000);
                clickElement(tabPremium.get(0), "Premium");
            } else {
                clickRequestBind();
            }
        }
        pause(3000);
        try {
            clickQuoteProposal();
        } catch (Exception e) {
            clickElement(tabQuoteDetails, "Quote Details");
            pause(2000);
            rateQuote();
            pause(13000);
            try {
                clickQuoteProposal();
            } catch (Exception ee) {
                if (requestBind.size() != 0) {
                    clickRequestBind();
                }
                navigateToUnderwritingReferralsPage();
                steps.iAcceptUnderwritingReferrals();
                pause(2000);
                clickElement(tabPremium.get(0), "Premium");
                pause(2000);
                clickQuoteProposal();
            }
        }
        pause(10000);
        steps.iVerifyThatQuoteProposalDocumentStatusIsCompleted();
        try {
            downloadPolicyDocumentAndVerifyIfNotNull(docName, data);
        } catch (IndexOutOfBoundsException e) {
            try {
                pause(3000);
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(tabs.size() - 1));
                pause(5000);
                downloadPolicyDocumentAndVerifyIfNotNull(docName, data);
            } catch (Exception ee) {
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                //Close all the tabs that do not contain .jsp in their url
                for (String tab : tabs) {
                    reportScreenshot("Before closing windows in catch block", "Before closing");
                    driver.switchTo().window(tab);
                    if (!driver.getCurrentUrl().contains(".jsp"))
                        driver.close();
                }
                //Switch to last window and do the logic
                reportScreenshot("After closing windows in catch block", "After closing");
                driver.switchTo().window(tabs.get(tabs.size() - 1));
                reportScreenshot("Switching to last window", "Switching to last window");
                pause(5000);
                downloadDocAndCheckSize(docName);
            }
        }
    }

    public void verifyMunicipalityTaxTotalForAllLocations(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Municipality Tax total for all locations']/../../../../div/div")).getText().replace(" ", ""), value, "Inspection Fee");
    }

    public void verifyMunicipalityTaxTotalServiceFee(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Municipality Tax Service Fee']/../../../../div/div")).getText().replace(" ", ""), value, "Inspection Fee");
    }

    public void verifyKentuckyStateSurcharge(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Kentucky State Surcharge']/../../../../div/div")).getText().replace(" ", ""), value, "Inspection Fee");
    }

    public void verifyThatPremiumSummaryBlockIsVisible() {
        assertEquals(premiumSummaryBlock.getText(), "premium summary", "Premium summary");
    }

    public void verifySurplusContributionFeeValue(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Surplus Contribution']/../../../../div/div")).getText().replace(" ", ""), value, "Surplus Contribution");
    }

    public String getTotalPremium() {
        return totalPremium.getText().trim();
    }

    public void validateFLHomeTaxDiscount(int expectedLocations, String transaction) {
        int eligibleLocations = 0;
        String rowXPath, locationXPath, coverageXPath, limitXPath, premiumXPath;

        if (transaction.equalsIgnoreCase("New Business") || transaction.equalsIgnoreCase("Quote")) {
            rowXPath = "//div[text()='details']//./../../../../../..//tr";
            locationXPath = rowXPath + "//td[1]//div";
            coverageXPath = rowXPath + "//td[2]//div";
            limitXPath = rowXPath + "//td[3]//div";
            premiumXPath = rowXPath + "//td[5]//div";
        } else {
            rowXPath = "//span[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='coverage']/../../../../../../../../..//tr";
            locationXPath = rowXPath + "//td[2]//div";
            coverageXPath = rowXPath + "//td[3]//div";
            limitXPath = rowXPath + "//td[4]//div";
            premiumXPath = rowXPath + "//td[7]//div";
        }

        List<WebElement> rows = driver.findElements(By.xpath(rowXPath));
        List<WebElement> location = driver.findElements(By.xpath(locationXPath));
        List<WebElement> coverage = driver.findElements(By.xpath(coverageXPath));
        List<WebElement> limit = driver.findElements(By.xpath(limitXPath));
        List<WebElement> premium = driver.findElements(By.xpath(premiumXPath));

        for (int i = 0; i < rows.size(); i++) {
            if (location.get(i).getText().contains(",")) {
                boolean hasDwellingLimit = !limit.get(i).getText().equalsIgnoreCase(" ") && !limit.get(i).getText().equalsIgnoreCase("&nbsp;");

                if (coverage.get(i).getText().equalsIgnoreCase("Dwelling") && hasDwellingLimit) {
                    eligibleLocations++;
                    double locationPremium = 0;
                    double optionalCovPremium = 0;
                    double expectedDiscount = 0;

                    for (int j = i + 1; j < rows.size(); j++) {
                        if (location.get(j).getText().contains(",")) {
                            break;
                        }

                        String premiumText = premium.get(j).getText().trim();
                        if (coverage.get(j).getText().equalsIgnoreCase("Location Premium")) {
                            locationPremium = Double.parseDouble(premiumText.replace("$", "").replace(",", "").trim());
                        } else if (coverage.get(j).getText().equalsIgnoreCase("Optional Coverages Premium")) {
                            optionalCovPremium = premiumText.isEmpty() ? 0.0 : Double.parseDouble(premiumText.replace("$", "").replace(",", "").trim());
                        } else if (coverage.get(j).getText().contains("Legislative Premium Discount")) {
                            expectedDiscount = Double.parseDouble(premiumText.replace("$", "").replace(",", "").trim());
                            break;
                        }
                    }

                    if (locationPremium == 0 && expectedDiscount == 0) {
                        continue;
                    }

                    double calculatedDiscount = (locationPremium + optionalCovPremium) * 0.0175;
                    calculatedDiscount = customRound(calculatedDiscount);
                    calculatedDiscount = -calculatedDiscount;

                    if (Math.abs(calculatedDiscount - expectedDiscount) > 0.01) {
                        Assert.fail("Location " + eligibleLocations + " Discount mismatch. Expected: $" + expectedDiscount + ", but got: $" + calculatedDiscount);
                    }
                } else {
                    // Skip this location if there is no dwelling limit
                    continue;
                }
            }
        }

        if (eligibleLocations != expectedLocations) {
            Assert.fail("Number of eligible locations is incorrect. Expected: " + expectedLocations + ", but got: " + eligibleLocations);
        }
    }

    public void validatePremiumSummaryTable(String transaction, String expectedLocation, String coverage, String limit, String deductible, String premium) {
        String rowXPath, locationXPath, coverageXPath, limitXPath, deductibleXPath, premiumXPath;

        if (transaction.equalsIgnoreCase("New Business") || transaction.equalsIgnoreCase("Quote")) {
            rowXPath = "//div[text()='details']//./../../../../../..//tr";
            locationXPath = rowXPath + "//td[1]//div";
            coverageXPath = rowXPath + "//td[2]//div";
            limitXPath = rowXPath + "//td[3]//div";
            deductibleXPath = rowXPath + "//td[4]//div";
            premiumXPath = rowXPath + "//td[5]//div";
        } else {
            rowXPath = "//span[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='coverage']/../../../../../../../../..//tr";
            locationXPath = rowXPath + "//td[2]//div";
            coverageXPath = rowXPath + "//td[3]//div";
            limitXPath = rowXPath + "//td[4]//div";
            deductibleXPath = rowXPath + "//td[5]//div";
            premiumXPath = rowXPath + "//td[7]//div";
        }

        List<WebElement> rows = driver.findElements(By.xpath(rowXPath));
        List<WebElement> locationCell = driver.findElements(By.xpath(locationXPath));
        List<WebElement> coverageCell = driver.findElements(By.xpath(coverageXPath));
        List<WebElement> limitCell = driver.findElements(By.xpath(limitXPath));
        List<WebElement> deductibleCell = driver.findElements(By.xpath(deductibleXPath));
        List<WebElement> premiumCell = driver.findElements(By.xpath(premiumXPath));
        boolean coverageFound = false;
        boolean locationFound = false;
        for (int i = 0; i < rows.size(); i++) {
            if (locationCell.get(i).getText().contains(expectedLocation)) {
                locationFound = true;
                for (int j = i; j < rows.size(); j++) {
                    if (!locationCell.get(j).getText().equalsIgnoreCase(" ") && !locationCell.get(j).getText().contains(expectedLocation)) {
                        break;
                    }

                    if (coverage.contains("!")) {
                        if (coverageCell.get(j).getText().equalsIgnoreCase(coverage.substring(1))) {
                            failAssertion("Coverage " + coverage.substring(1) + " found when it shouldn't be visible.");
                            return;
                        }
                    } else {
                        if (coverageCell.get(j).getText().equalsIgnoreCase(coverage)) {
                            String limitUI = limitCell.get(j).getText().trim();
                            String deductibleUI = deductibleCell.get(j).getText().trim();
                            String premiumUI = premiumCell.get(j).getText().replaceAll("\\s+", "").trim();

                            if (hasValue(limit))
                                SoftAssertion.assertEquals(limitUI, limit, "Limit " + limit + " for object: " + expectedLocation);
                            if (hasValue(deductible))
                                SoftAssertion.assertEquals(deductibleUI, deductible, "Deductible " + deductible + " for object: " + expectedLocation);
                            if (hasValue(premium))
                                SoftAssertion.assertEquals(premiumUI, premium, "Premium for object: " + expectedLocation);

                            coverageFound = true;
                            break;
                        }
                    }
                }
                break;
            }
        }

        if (!coverageFound && !coverage.contains("!")) {
            failAssertion("Coverage " + coverage + " not found for location " + expectedLocation);
        }

        if (!locationFound) {
            failAssertion("Location " + expectedLocation + " not found");
        }
    }

    public void validateFloridaStateMandatedAssessments(String LOB) throws Exception {
        //FL 1% FIGA (US47210) - EFF 01/18/2025
        double totalPremium = parseCurrency(getTotalPremium());
        double stateMandated = parseCurrency(stateMandatedAssessments.getText());
        double expected = 0.00;

        switch (LOB) {
            case "Homeowner": {
                expected = (totalPremium * 0.01) + 2.00;
            }
            break;
            case "Excess Liability":
            case "Collection":
            case "Personal Watercraft": {
                expected = (totalPremium * 0.01);
            }
            break;
            default: {
                throw new Exception("LOB not found/supported");
            }
        }
        double tolerance = 0.0001;

        if (Math.abs(stateMandated - expected) > tolerance) {
            failAssertion("State Mandated Assessments do not match! Expected: " + expected + ", found: " + stateMandated);
        }
    }

    public void verifyDeductibleScenarios() {
        if (deductibleScenariosButton.isDisplayed()) {
            Assert.fail();
        }
    }

    public void clickSendRenewalOffer() throws Throwable {
        clickElement(sendRenewalOffer);
    }

    public String retrieveGrandTotal() {
        if (isElementDisplayed(grandTotal, 15)) {
            clickElement(grandTotal, "grand total");
            return grandTotal.getText();
        }
        return "null";
    }

    public void verifyPremiumTextIsVisibleOnUI(String expectedText) {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);
        String actualValue = driver.findElement(By.xpath("//div[text()='premium summary']/../../../../../../..//tr[1]//span[1]/div")).getText();
        WebElement element = driver.findElement(By.xpath("//div[text()='premium summary']/../../../../../../..//tr[1]//span[1]/div"));

        if (!expectedText.equalsIgnoreCase(actualValue)) {
            actions.failAssertion("Expected text is not match the actual. Expected: " + expectedText + "Actual: " + actualValue);
            actions.scrollToWebElement(element);
            reportScreenshot("Actual", "Expected: " + expectedText + "Actual: " + actualValue);
        } else {
            actions.successLog("PASS: Expected: " + expectedText + "Actual: " + actualValue);
        }
    }


    public void verifyCoverageOnPremiumDetailsIs(String coverage, int index, String value) {
        String xpath = "//div[text()='details']//../../../../../..//tr/td[2]/div[text()='" + coverage + "']/../../td[3]/div";
        if (!value.equalsIgnoreCase("not visible")) {
            Assert.assertEquals(driver.findElements(By.xpath(xpath)).get(index - 1).getText(), value);
        } else {
            Assert.assertEquals(driver.findElements(By.xpath(xpath)).size(), 0);
        }
    }

    public void verifyCoverageOnPremiumDetailsIsEnd(String coverage, int index, String value) {
        String xpath = "//div[text()='coverages and premiums']//./../../../../../..//table//td[3]/div[text()='" + coverage + "']/../../td[4]/div";

        if (!value.equalsIgnoreCase("not visible")) {
            Assert.assertEquals(driver.findElements(By.xpath(xpath)).get(index - 1).getText(), value);
        } else {
            Assert.assertEquals(driver.findElements(By.xpath(xpath)).size(), 0);
        }
    }

    public void verifyCoverageOnPremiumDetailsIsRnw(String coverage, int index, String value) {
        String xpath = "//div[text()='coverages and premiums']//./../../../../../..//table//td[3]/div[text()='" + coverage + "']/../../td[4]/div";

        if (!value.equalsIgnoreCase("not visible")) {
            Assert.assertEquals(driver.findElements(By.xpath(xpath)).get(index - 1).getText(), value);
        } else {
            Assert.assertEquals(driver.findElements(By.xpath(xpath)).size(), 0);
        }
    }
}