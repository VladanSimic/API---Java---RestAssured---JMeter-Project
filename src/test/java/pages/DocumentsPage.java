package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DocumentsPage extends CommonComponentsAndActions {
    WebDriver driver;


    public DocumentsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[2]/div")
    List<WebElement> documentID;
    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[3]/div")
    List<WebElement> documentType;
    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[4]/div")
    List<WebElement> description;
    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[5]/div")
    List<WebElement> documentLink;
    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[6]/div")
    List<WebElement> documentGenerationStatus;
    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[7]/div")
    List<WebElement> documentDeliveryStatus;
    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[8]/div")
    List<WebElement> deliveryDateTime;
    @FindBy(xpath = "//*[text()='document list']/../../../../../..//table//td[9]/div")
    List<WebElement> internalView;


    public void verifyDocumentID(int index, String type) {
        if (index < 0 || index >= documentID.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = documentID.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            reportScreenshot("Screenshot", "Document ID mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Document ID mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            reportScreenshot("Screenshot", "Document ID match. Document ID: " + elementText);
            successLog("Document ID match. Document ID: " + elementText);
        }
    }

    public void verifyDocumentType(int index, String type) {
        if (index < 0 || index >= documentType.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = documentType.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            reportScreenshot("Screenshot", "Document Type mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Document Type mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            reportScreenshot("Screenshot", "Document Type match. Document Type: " + elementText);
            successLog("Document Type match. Document ID: " + elementText);
        }
    }

    public void verifyColumnValue(int index, String expectedText, String block, String columnNumber) {
        String xpath = "//*[text()='" + block + "']/../../../../../..//table//td[" + columnNumber + "]/div";
        List<WebElement> columnCells = driver.findElements(By.xpath(xpath));

        if (index < 0 || index >= columnCells.size()) {
            failAssertion("Invalid index: " + index + ", available elements: " + columnCells.size());
        }

        String actualText = columnCells.get(index).getText().trim();

        if (!expectedText.equalsIgnoreCase(actualText)) {
            reportScreenshot("Screenshot", "Value mismatch. Expected: " + expectedText + " | Actual: " + actualText);
            failAssertion("Value mismatch. Expected: " + expectedText + " | Actual: " + actualText);
        } else {
            reportScreenshot("Screenshot", "Value match. Text: " + actualText);
            successLog("Value match. Text: " + actualText);
        }
    }


    public void verifyDocumentLink(int index, String type) {
        if (index < 0 || index >= documentLink.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = documentLink.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            reportScreenshot("Screenshot", "Document Link mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Document Link mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            reportScreenshot("Screenshot", "Document Link match. Document Link: " + elementText);
            successLog("Document Link match. Document Link: " + elementText);
        }
    }

    public void verifyDocumentGenerationStatus(int index, String type) {
        if (index < 0 || index >= documentGenerationStatus.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = documentGenerationStatus.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            reportScreenshot("Screenshot", "Document Generation Status mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Document Generation Status mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            reportScreenshot("Screenshot", "Document Generation Status match. Document Generation Status: " + elementText);
            successLog("Document Generation Status match. Document Generation Status: " + elementText);
        }
    }

    public void verifyDocumentDeliveryStatus(int index, String type) {
        if (index < 0 || index >= documentDeliveryStatus.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = documentDeliveryStatus.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            reportScreenshot("Screenshot", "Document Delivery Status mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Document Delivery Status mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            reportScreenshot("Screenshot", "Document Delivery Status match. Document Delivery Status: " + elementText);
            successLog("Document Delivery Status match. Document Delivery Status: " + elementText);
        }
    }

    public void verifyDocumentDateAndTime(int index, String type) {
        if (index < 0 || index >= deliveryDateTime.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = deliveryDateTime.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            reportScreenshot("Screenshot", "Delivery Date and Time mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Delivery Date and Time mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            reportScreenshot("Screenshot", "Delivery Date and Time match. Delivery Date and Time: " + elementText);
            successLog("Delivery Date and Time match. Delivery Date and Time: " + elementText);
        }
    }

    public void verifyInternalView(int index, String type) {
        if (index < 0 || index >= internalView.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = internalView.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            reportScreenshot("Screenshot", "Internal View mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Internal View mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            reportScreenshot("Screenshot", "Internal View match. Internal View: " + elementText);
            successLog("Internal View match. Internal View: " + elementText);
        }

    }

    public List<String> getDocumentIDs(List<String> documentNames) {
        List<String> documentIDs = new ArrayList<>();

        for (String documentName : documentNames) {
            try {
                String xpath = "//span[contains(text(),'" + documentName + "')]/../../../td[2]/div";
                WebElement documentElement = driver.findElement(By.xpath(xpath));
                String documentID = documentElement.getText();
                documentIDs.add(documentID);
                System.out.println("Found Document ID for " + documentName + ": " + documentID);
            } catch (NoSuchElementException e) {
                System.err.println("Document not found: " + documentName);
            }
        }
        System.out.println(documentIDs);
        return documentIDs;
    }

    public void regenerateDocumentAndNavigateBack(String transaction) throws Throwable {
        clickElement(regenerateDocuments);
        if (verifyElementOnUI("Auto Package", true)) {
            pause(30000);
        }else {
            pause(15000);
        }
        clickElement(policyBreadcrumb);
        clickElement(transactionsOrEndorsements);

        int num = driver.findElements(By.xpath("//span[text()='" + transaction + "']")).size();
        clickElement(driver.findElements(By.xpath("//span[text()='" + transaction + "']")).get(num - 1));

        pause(25000);
        clickElement(documentsTab, "documents");
    }


}



