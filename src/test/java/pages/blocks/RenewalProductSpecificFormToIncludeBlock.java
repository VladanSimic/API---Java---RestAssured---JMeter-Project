package pages.blocks;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RenewalProductSpecificFormToIncludeBlock extends CommonComponentsAndActions {
    WebDriver driver;
    public Map<String, String> data = DataManager.getInstance().getData();

    public RenewalProductSpecificFormToIncludeBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='upload']")
    List<WebElement> upload;

    @FindBy(xpath = "//div[text()='Subscription agreement is signed and complete?']/../../../../../../../../../../../td//a/span")
    List<WebElement> subsAgreeUpload;


    public void verifyTaskSelectColumn(int index, String expected, String block) {
        List<WebElement> column = driver.findElements(By.xpath("//*[contains(text(),'" + block + "')]/../../../../../..//tr/td[1]//input"));

        if (index < 0 || index >= column.size()) {
            failAssertion("Invalid index: " + index);
        }

        WebElement columnSelect = column.get(index);
        String elementType = columnSelect.getAttribute("type");

        if (!expected.equalsIgnoreCase(elementType)) {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot", "Element is not a checkbox. Found type: " + elementType);
            failAssertion("Expected a checkbox, but found type: " + elementType);
        } else {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot", "Column 'Select' match. Column 'Select' is type: " + elementType);
            successLog("Column Select match. Expected type: " + expected + " Column Type: " + elementType);
        }
    }

    public void verifyProductSpecificTable(int index, String expected, String columnNumber) {
        List<WebElement> column = driver.findElements(By.xpath("//*[contains(text(),'renewal: product specific forms to include in signature')]/../../../../../..//tr/td[" + columnNumber + "]"));

        if (index < 0 || index >= column.size()) {
            failAssertion("Invalid index: " + index);
        }

        WebElement columnProduct = column.get(index);
        String elementText = columnProduct.getText().trim();

        if (!elementText.contains(expected)) {
            scrollToWebElement(columnProduct);
            reportScreenshot("Screenshot", "Column Product mismatch. Expected: " + expected + " | Actual: " + elementText);
            failAssertion("Column Product mismatch. Expected: " + expected + " | Actual: " + elementText);
        } else {
            scrollToWebElement(columnProduct);
            reportScreenshot("Screenshot", "Column Product match. Column Product': " + elementText);
            successLog("Column Product match. Column Product: " + elementText);
        }
    }

    public void verifyESignPackagesTable(int index, String expected, String columnNumber) {
        List<WebElement> column = driver.findElements(By.xpath("//*[contains(text(),'eSign Packages - Document Tracking')]/../../../../../..//tr/td[" + columnNumber + "]"));

        if (index < 0 || index >= column.size()) {
            failAssertion("Invalid index: " + index);
        }

        WebElement columnProduct = column.get(index);
        String elementText = columnProduct.getText().trim().toLowerCase();

        if (!elementText.contains(expected.toLowerCase())) {
            scrollToWebElement(columnProduct);
            reportScreenshot("Screenshot_"+System.currentTimeMillis(), "Column ESign mismatch. Expected: " + expected + " | Actual: " + elementText);
            failAssertion("Column ESign mismatch. Expected: " + expected + " | Actual: " + elementText);
        } else {
            scrollToWebElement(columnProduct);
            reportScreenshot("Screenshot_"+System.currentTimeMillis(), "Column ESign match. Column ESign': " + elementText);
            successLog("Column ESign match. Column ESign: " + elementText);
        }
    }

    public void verifyBrokerInvitationDetailsName(int index, String expected, String block) {
        List<WebElement> list = driver.findElements(By.xpath("//*[text()='Member Document Package']/ancestor::tbody[2]//tbody[@role='presentation']//tbody[1]//tr//td[1]//div[@role='textbox']"));

        if (index < 0 || index >= list.size()) {
            failAssertion("Invalid index: " + index);
        }

        WebElement columnSelect = list.get(index);
        String elementText = columnSelect.getText().trim();

        if (!expected.equalsIgnoreCase(elementText)) {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot_" + System.currentTimeMillis(), "Text mismatch. ACTUAL : " + elementText + " | Expected: " + expected);
            failAssertion("Text mismatch. ACTUAL : " + elementText + " | Expected: " + expected);
        } else {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot", "Text match. ACTUAL : " + elementText + " | Expected: " + expected);
            successLog("Text match. ACTUAL : " + elementText + " | Expected: " + expected);
        }
    }

    public void verifyBrokerInvitationDocumentsName(int index, String expected, String block) {
        List<WebElement> list = driver.findElements(By.xpath("//*[text()='" + block + "']/ancestor::tbody[2]//tbody[@role='presentation']//tbody[1]//tr//td[2]//div[@role='textbox']/span"));

        if (index < 0 || index >= list.size()) {
            failAssertion("Invalid index: " + index);
        }

        WebElement columnSelect = list.get(index);
        String elementText = columnSelect.getText().trim();

        if (!expected.equalsIgnoreCase(elementText)) {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot_" + System.currentTimeMillis(), "Text mismatch. ACTUAL : " + elementText + " | Expected: " + expected);
            failAssertion("Text mismatch. ACTUAL : " + elementText + " | Expected: " + expected);
        } else {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot", "Text match. ACTUAL : " + elementText + " | Expected: " + expected);
            successLog("Text match. ACTUAL : " + elementText + " | Expected: " + expected);
        }
    }

    public void verifyMemberInvitationDetailsName(int index, String expected) {
        List<WebElement> list = driver.findElements(By.xpath("//td[@role='presentation' and @width='33%']//div[@style='display:inline']"));

        if (index < 0 || index >= list.size()) {
            failAssertion("Invalid index: " + index);
        }

        WebElement columnSelect = list.get(index);
        String elementText = columnSelect.getText().trim();

        if (!expected.equalsIgnoreCase(elementText)) {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot_" + System.currentTimeMillis(), "Text mismatch. ACTUAL : " + elementText + " | Expected: " + expected);
            failAssertion("Text mismatch. ACTUAL : " + elementText + " | Expected: " + expected);
        } else {
            scrollToWebElement(columnSelect);
            reportScreenshot("Screenshot", "Text match. ACTUAL : " + elementText + " | Expected: " + expected);
            successLog("Text match. ACTUAL : " + elementText + " | Expected: " + expected);
        }
    }

    public void verifyTableDocumentLink(int index, String expectedLinkText, String expectedHref) {
        List<WebElement> documentLinks = driver.findElements(By.xpath(
                "//td[@role='presentation' and @width='33%']//a"));

        if (index < 0 || index >= documentLinks.size()) {
            String message = "Index " + index + " out of range. Total elements found: " + documentLinks.size();
            failAssertion(message);
            reportScreenshot("Document Link Index Error", message);
            return;
        }

        WebElement linkElement = documentLinks.get(index);

        String actualLinkText = linkElement.getText().trim();
        String actualHref = linkElement.getAttribute("href").trim();

        boolean textMatches = actualLinkText.equalsIgnoreCase(expectedLinkText.trim());
        boolean hrefMatches = actualHref.toLowerCase().contains(expectedHref.trim().toLowerCase());

        if (!textMatches || !hrefMatches) {
            String message = "Mismatch for document link at index " + index + ". ";
            if (!textMatches) {
                message += "Expected link text: '" + expectedLinkText + "', Found: '" + actualLinkText + "'. ";
            }
            if (!hrefMatches) {
                message += "Expected href: '" + expectedHref + "', Found: '" + actualHref + "'.";
            }
            failAssertion(message);
            reportScreenshot("Document Link Mismatch", message);
        } else {
            String message = "Document link matched at index " + index +
                    ". Text: '" + actualLinkText + "', href: '" + actualHref + "'";
            successLog(message);
            reportScreenshot("Document Link Match", message);
        }

    }

    public void verifyESignPackagesBlock(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        String newEffectiveDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH));

        int index = 0;

        for (List<String> columns : rows) {
            String selectPackages = columns.get(0);
            String eSignaturePackages = columns.get(1);
            String history = columns.get(2);
            String packageSentDateTime = columns.get(3);
            String packageStatusDateTime = columns.get(4);
            String DocumentsIncluded = columns.get(5);
            String documentLink = columns.get(6);
            String documentCompletedSigned = columns.get(7);
            String completedDocumentLink = columns.get(8);

            RenewalProductSpecificFormToIncludeBlock programRequiredPage = new RenewalProductSpecificFormToIncludeBlock(driver);

            if (hasValue(selectPackages))
                programRequiredPage.verifyTaskSelectColumn(index, selectPackages, "eSign Packages - Document Tracking");
            if (hasValue(eSignaturePackages))
                programRequiredPage.verifyESignPackagesTable(index, eSignaturePackages, "2");
            if (hasValue(history))
                programRequiredPage.verifyESignPackagesTable(index, history, "3");
            if (hasValue(packageSentDateTime) && packageSentDateTime.equalsIgnoreCase("Today")) {
                programRequiredPage.verifyESignPackagesTable(index, newEffectiveDate, "4");
            } else {
                programRequiredPage.verifyESignPackagesTable(index, packageSentDateTime, "4");
            }
            if (hasValue(packageStatusDateTime)) {
                programRequiredPage.verifyESignPackagesTable(index, packageStatusDateTime+ " - " + newEffectiveDate, "5");
            }
            if (hasValue(DocumentsIncluded))
                programRequiredPage.verifyESignPackagesTable(index, DocumentsIncluded, "6");
            if (hasValue(documentLink) && documentLink.equalsIgnoreCase("Not Present")) {
                programRequiredPage.verifyESignPackagesTable(index, "", "7");
            } else if (hasValue(documentLink)) {
                programRequiredPage.verifyESignPackagesTable(index, documentLink, "7");
            }
            if (hasValue(documentCompletedSigned))
                programRequiredPage.verifyESignPackagesTable(index, documentCompletedSigned, "8");
            if (hasValue(completedDocumentLink))
                programRequiredPage.verifyESignPackagesTable(index, completedDocumentLink, "9");

            index++;
        }
    }

    public void verifyMemberApplicationAndAgreementsBlock(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        int index = 0;

        for (List<String> columns : rows) {
            String checkBox = columns.get(0);
            String disabled = columns.get(1);
            String documentName = columns.get(2);
            String documentLinkText = columns.get(3);
            String documentLink = columns.get(4);
            String question = columns.get(5);
            String yesOrNo = columns.get(6);
            String signedDocumentText = columns.get(7);
            String signedDocumentLinks = columns.get(8);
            String button = columns.get(9);

            MemberApplicationAndAgreementsBlock programRequiredPage = new MemberApplicationAndAgreementsBlock(driver);

            if (hasValue(checkBox))
                programRequiredPage.verifyTableCheckBox(index, checkBox, disabled);
            if (hasValue(documentName))
                programRequiredPage.verifyTableText(index + 1, documentName, "2");
            if (hasValue(documentLinkText))
                programRequiredPage.verifyTableDocumentLink(index, documentLinkText, documentLink, "3");
            if (hasValue(question))
                programRequiredPage.verifyTableText(index + 1, question, "4");
            if (hasValue(yesOrNo))
                programRequiredPage.verifyTableText(index, yesOrNo, "5");
            if (hasValue(signedDocumentText))
                programRequiredPage.verifyTableDocumentLink(index - 1, signedDocumentText, signedDocumentLinks, "6");
            if (hasValue(button))
                programRequiredPage.verifyTableButtonIsDisplayed(index, button);
            index++;
        }
    }

    public void verifyProductSpecificFormsToIncludeBlock(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        String newEffectiveDate = LocalDate.parse(data.get("Effective_Date"),
                        DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH))
                .plusYears(1)
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH));

        int index = 0;

        for (List<String> columns : rows) {
            String select = columns.get(0);
            String product = columns.get(1);
            String policyNumber = columns.get(2);
            String term = columns.get(3);
            String effectiveDate = columns.get(4);
            String premium = columns.get(5);
            String status = columns.get(6);
            String renewalForms = columns.get(7);

            RenewalProductSpecificFormToIncludeBlock programRequiredPage = new RenewalProductSpecificFormToIncludeBlock(driver);

            if (hasValue(select))
                programRequiredPage.verifyTaskSelectColumn(index, select, "renewal: product specific forms to include in signature");
            if (hasValue(product))
                programRequiredPage.verifyProductSpecificTable(index, product, "2");
            if (hasValue(policyNumber))
                programRequiredPage.verifyProductSpecificTable(index, data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1", "3");
            if (hasValue(term))
                programRequiredPage.verifyProductSpecificTable(index, term, "4");
            if (hasValue(effectiveDate))
                programRequiredPage.verifyProductSpecificTable(index, newEffectiveDate, "5");
            if (hasValue(premium))
                programRequiredPage.verifyProductSpecificTable(index, data.get("Premium_Transaction"), "6");
            if (hasValue(status))
                programRequiredPage.verifyProductSpecificTable(index, status, "7");
            if (hasValue(renewalForms))
                programRequiredPage.verifyProductSpecificTable(index, renewalForms, "8");
            index++;
        }
    }

    public void verifyESignHistoryBlock(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        String newEffectiveDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH));

        int index = 0;

        for (List<String> columns : rows) {
            String row = columns.get(0);
            String activity = columns.get(1);
            String time = columns.get(2);
            String status = columns.get(3);

            eSignPackagesBlock programRequiredPage = new eSignPackagesBlock(driver);

            if (hasValue(row))
                programRequiredPage.verifyDocuSignHistoryBlock(index, row, "1");
            if (hasValue(activity)) {
                String activityToCheck = activity.contains("{Customer}")
                        ? activity.replace("{Customer}", data.get("First_Name") + " " + data.get("Last_Name"))
                        : activity;

                programRequiredPage.verifyDocuSignHistoryBlock(index, activityToCheck, "2");
            }
            if (hasValue(time) && time.equalsIgnoreCase("Today")) {
                programRequiredPage.verifyDocuSignHistoryBlock(index, newEffectiveDate, "3");
            } else {
                programRequiredPage.verifyDocuSignHistoryBlock(index, time, "3");
            }
            if (hasValue(status))
                programRequiredPage.verifyDocuSignHistoryBlock(index, status, "4");

            index++;
        }
    }

    public void verifyESignInvitationDetailsMember(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        RenewalProductSpecificFormToIncludeBlock programRequiredPage = new RenewalProductSpecificFormToIncludeBlock(driver);

        int index = 0;

        for (List<String> columns : rows) {
            String document = columns.get(0);
            String linkName = columns.get(1);
            String link = columns.get(2);


            if (hasValue(document))
                programRequiredPage.verifyMemberInvitationDetailsName(index, document);
            if (hasValue(link) && hasValue(linkName))
                programRequiredPage.verifyTableDocumentLink(index, linkName, link);
            index++;
        }
    }

    public void verifyESignInvitationDetails(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        RenewalProductSpecificFormToIncludeBlock programRequiredPage = new RenewalProductSpecificFormToIncludeBlock(driver);

        int index = 0;

        for (List<String> columns : rows) {
            String name = columns.get(0);
            String documents = columns.get(1);


            if (hasValue(name) && name.equalsIgnoreCase("Customer")) {
                programRequiredPage.verifyBrokerInvitationDetailsName(index, data.get("First_Name") + " " + data.get("Last_Name") + " Policy #: " + data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1" + " | Transaction: Renewal", "Broker Document Package");
            } else {
                programRequiredPage.verifyBrokerInvitationDetailsName(index, name, "Broker Document Package");
            }
            if (hasValue(documents))
                programRequiredPage.verifyBrokerInvitationDocumentsName(index, documents, "Broker Document Package");

            index++;
        }
    }

}