package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import java.util.List;

public class MemberApplicationAndAgreementsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public MemberApplicationAndAgreementsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='upload']")
    List<WebElement> upload;
    @FindBy(xpath = "//div[text()='Subscription agreement is signed and complete?']/../../../../../../../../../../../td//a/span | //div[text()='PSE Membership agreement is signed and complete?']/../../../../../../../../../../../td//span[text()='upload']")
    List<WebElement> subsAgreeUpload;

    public void upload() throws Throwable {
        try {
            pause(3000);
            if (subsAgreeUpload.size() > 0) {
                clickElement(subsAgreeUpload.get(0));
            } else {
                clickElement(upload.size() > 1 ? upload.get(1) : upload.get(0)); //TODO temp resolution for more than 1 upload (PSE reason)
            }
        } catch (Exception e) {
            pause(3000);
            try {
                clickElement(subsAgreeUpload.get(0));
            } catch (Exception ee) {
                clickElement(subsAgreeUpload.get(1));
            }
        }
    }

    public void PSEMembershipAgreementIsSigned() {
        Assert.assertEquals(driver.findElements(By.xpath("//div[text()='PSE Membership agreement is signed and complete?']/../../../../../../../../../../../td//div[text()='Yes']")).size(), 1);
    }

    public void verifyTableCheckBox(int index, String visible, String expectedDisabledState) {
        List<WebElement> checkboxes = driver.findElements(By.xpath(
                "//*[text()='member application and agreements for signature package']/../../../../../..//tr/td[1]//input"));

        if (index < 0 || index >= checkboxes.size()) {
            failAssertion("Checkbox index " + index + " is out of range. Total checkboxes found: " + checkboxes.size());
            return;
        }

        WebElement checkbox = checkboxes.get(index);
        scrollToWebElement(checkbox);

        boolean expectedVisible = visible.equalsIgnoreCase("yes");
        boolean actualVisible = checkbox.isDisplayed();

        if (actualVisible != expectedVisible) {
            reportScreenshot("Checkbox Visibility Mismatch",
                    "Mismatch. Expected visible: " + expectedVisible + " | Actual: " + actualVisible);
            failAssertion("Mismatch. Expected visible: " + expectedVisible + " | Actual: " + actualVisible);
            return;
        }

        String expectedDisabled = expectedDisabledState.equalsIgnoreCase("yes") ? "true" :
                expectedDisabledState.equalsIgnoreCase("no") ? "false" :
                        expectedDisabledState.toLowerCase();

        String actualDisabled = checkbox.getAttribute("aria-disabled");

        if (!expectedDisabled.equalsIgnoreCase(actualDisabled)) {
            reportScreenshot("Checkbox State Mismatch",
                    "Mismatch. Expected aria-disabled: " + expectedDisabled +
                            " | Actual: " + actualDisabled);
            failAssertion("Mismatch. Expected aria-disabled: " + expectedDisabled +
                    " | Actual: " + actualDisabled);
        } else {
            reportScreenshot("Checkbox State Match",
                    "Match. aria-disabled: " + actualDisabled);
            successLog("Checkbox is in the expected state: " + actualDisabled);
        }
    }

    public void verifyTableText(int index, String expected, String column) {
        List<WebElement> text = driver.findElements(By.xpath(
                "//*[text()='member application and agreements for signature package']/../../../../../..//tr/td[" + column + "]//div[contains(@class,'x-form-readonly')]"));

        if (index < 0 || index >= text.size()) {
            String message = "Index " + index + " out of range. Total elements found: " + text.size();
            failAssertion(message);
            reportScreenshot("Table Text Index Error", message);
            return;
        }

        String elementText = text.get(index).getText().trim();

        if (!elementText.equalsIgnoreCase(expected)) {
            String message = "Mismatch for Table Text at index " + index +
                    ". Expected: '" + expected + "', but found: '" + elementText + "'";
            failAssertion(message);
            reportScreenshot("Table Text Mismatch", message);
        } else {
            String message = "Table Text matched at index " + index + ": '" + elementText + "'";
            successLog(message);
            reportScreenshot("Table Text Match", message);
        }
    }

    public void verifyTableDocumentLink(int index, String expectedLinkText, String expectedHref, String column) {
        List<WebElement> documentLinks = driver.findElements(By.xpath(
                "//*[text()='member application and agreements for signature package']/../../../../../..//tr/td[" + column + "]//a"));

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

    public void verifyTableButtonIsDisplayed(int index, String expectedVisible) {
        List<WebElement> buttons = driver.findElements(By.xpath(
                "//*[text()='member application and agreements for signature package']/../../../../../..//tr/td[7]//a"));

        boolean expected = expectedVisible.equalsIgnoreCase("yes");

        if (index < 0 || index >= buttons.size()) {
            if (!expected) {
                reportScreenshot("Button Not Found (Expected Not Visible)", "Button missing as expected.");
                return;
            }
            String message = "Button index " + index + " out of range. Total buttons found: " + buttons.size();
            failAssertion(message);
            reportScreenshot("Button Index Error", message);
            return;
        }

        WebElement button = buttons.get(index);
        scrollToWebElement(button);

        boolean actualVisible = button.isDisplayed();

        if (actualVisible != expected) {
            String message = "Button visibility mismatch at index " + index + ". Expected visible: " + expectedVisible +
                    ", but was " + (actualVisible ? "visible" : "not visible");
            reportScreenshot("Button Visibility Mismatch", message);
            failAssertion(message);
        } else {
            reportScreenshot("Button Visibility Match", "Button visibility is as expected: " + expectedVisible);
        }
    }

    public void checkDocumentForESign(String document) {
        String xpath = "//*[contains(text(),'" + document + "')]/../../../../../../../../../../..//td[1]//input";
        WebElement element = driver.findElement(By.xpath(xpath));

        clickElement(element, "Clicked checkbox for document: " + document);
    }

    public void checkESignPackage(String document) {
        String xpath = "//*[contains(text(),'" + document + "')]/../../td[1]//input";
        WebElement element = driver.findElement(By.xpath(xpath));

        clickElement(element, "Clicked checkbox for package: " + document);
    }

}