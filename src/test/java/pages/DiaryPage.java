package pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DiaryPage extends CommonComponentsAndActions {
    WebDriver driver;
    public Map<String, String> data = DataManager.getInstance().getData();

    public DiaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#emailradio-inputEl")
    WebElement radioBtnEmail;
    @FindBy(css = "[name='Diary_EmailToList']")
    WebElement fieldEmailTo;
    @FindBy(css = "[name='Diary_EmailCcList']")
    WebElement fieldEmailCc;
    @FindBy(css = "[name='Diary_TaskTitle']")
    WebElement fieldDiaryTaskTitle;
    @FindBy(css = "[name='Diary_TaskDescription']")
    WebElement fieldDiaryTaskDescription;
    @FindBy(xpath = "//a[contains(text(),'$$')]/../../..//td[1]//span")
    WebElement documentInList;
    @FindBy(css = "#mini-diary-submit-button-btnInnerEl")
    WebElement btnSubmit;

    @FindBy(xpath = "//*[contains(text(), 'Renewal Offer Not Sent')]/../../../td[6]/div")
    List<WebElement> assignedTo;


    public void sendMiniDiaryEmail(String to, String cc) throws Throwable {
        setRadioButtonEmail();
        setEmailTo(to);
        setEmailCc(cc);
        setDiaryTaskTitle("Mini-Diary Testing");
        setDiaryTaskDescription("We are testing description.");
        clickOnSubmit();
    }

    public void setRadioButtonEmail() throws Throwable {
        clickElement(radioBtnEmail, "Email");
    }

    public void setEmailTo(String value) {
        typeText(fieldEmailTo, value, "Email To");
    }

    public void setEmailCc(String value) {
        typeText(fieldEmailCc, value, "Email Cc");
    }

    public void setDiaryTaskTitle(String value) {
        typeText(fieldDiaryTaskTitle, value, "Task Title");
    }

    public void setDiaryTaskDescription(String value) {
        typeText(fieldDiaryTaskDescription, value, "Task Description");
    }

    public void clickOnSubmit() {
        clickElement(btnSubmit, "Submit");
    }

    public void verifyCreatedDateToday(int index, String document) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String today = sdf.format(new Date());

        List<WebElement> dateCells = driver.findElements(By.xpath("//*[contains(text(), '" + document + "')]/../../../td[2]/div"));

        if (index < 0 || index >= dateCells.size()) {
            failAssertion("Invalid index: " + index + ". Available elements: " + dateCells.size());
            return;
        }

        WebElement dateElement = dateCells.get(index);
        String elementText = dateElement.getText().trim();

        if (!today.equalsIgnoreCase(elementText)) {
            scrollToWebElement(dateElement);
            reportScreenshot("Screenshot", "Date mismatch. Expected: " + today + " | Actual: " + elementText);
            failAssertion("Date mismatch. Expected: " + today + " | Actual: " + elementText);
        } else {
            scrollToWebElement(dateElement);
            reportScreenshot("Screenshot", "Date match. Task created: " + elementText);
            successLog("Date match. Task created today: " + elementText);
        }
    }

    public void verifyCarrierTasksBlock(int index, String type, String document, String columnNumber) {

        List<WebElement> dateCells = driver.findElements(By.xpath("//*[contains(text(), '" + document + "')]/../../../td[" + columnNumber + "]/div"));

        if (index < 0 || index >= dateCells.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = dateCells.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task field mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Task field mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task field match. Task type: " + elementText);
            successLog("Task field match. Task type: " + elementText);
        }
    }

    public void verifyTaskDueDate(int index, int daysToIncrement, String document) {
        List<WebElement> dateCells = driver.findElements(By.xpath("//*[contains(text(), '" + document + "')]/../../../td[7]/div"));

        if (index < 0 || index >= dateCells.size()) {
            failAssertion("Invalid index: " + index);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, daysToIncrement);
        String expectedDate = sdf.format(calendar.getTime());

        String elementText = dateCells.get(index).getText().trim();

        if (!expectedDate.equalsIgnoreCase(elementText)) {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task 'Due' mismatch. Expected: " + expectedDate + " | Actual: " + elementText);
            failAssertion("Task 'Due' mismatch. Expected: " + expectedDate + " | Actual: " + elementText);
        } else {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task 'Assigned To' match. Task 'Assigned To': " + elementText);
            successLog("Task 'Due' match. Date: " + elementText);
        }
    }

    public void verifyTaskSummaryFields(String field, String expectedValue) {
        String xpath = "//*[text()='" + field + "']/../../../../div/div";
        String actualValue = driver.findElement(By.xpath(xpath)).getText().trim();

        if (!expectedValue.equals(actualValue)) {
            reportScreenshot("Screenshot", "Task field mismatch. Expected: " + expectedValue + " | Actual: " + actualValue);
            failAssertion("Field mismatch for '" + field + "'. Expected: '" + expectedValue + "' | Actual: '" + actualValue + "'");
        } else {
            reportScreenshot("Screenshot", "Field match for '" + field + "'. Value: " + actualValue);
            successLog("Field match for '" + field + "'. Value: " + actualValue);
        }
    }

    public void verifyTaskDueDateSummary(String field, int daysToIncrement) {
        String xpath = "//*[text()='" + field + "']/../../../../div/div";
        String actualValue = driver.findElement(By.xpath(xpath)).getText().trim();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, daysToIncrement);
        String expectedDate = sdf.format(calendar.getTime());


        if (!actualValue.equalsIgnoreCase(expectedDate)) {
            reportScreenshot("Screenshot", "Task 'Due' mismatch. Expected: " + expectedDate + " | Actual: " + actualValue);
            failAssertion("Task 'Due Date' mismatch. Expected: " + expectedDate + " | Actual: " + actualValue);
        } else {
            reportScreenshot("Screenshot", "Task 'Due Date' match. Date: " + actualValue);
            successLog("Task 'Due Date' match. Date: " + actualValue);
        }
    }

    public void verifyCreatedDateTodayCustomerLevel(int index, String task, String block) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String today = sdf.format(new Date());
        List<WebElement> dateCells = driver.findElements(By.xpath("//div[text()='" + block + "']/../../../../../..//*[contains(text(), '" + task + "')]/../../../td[1]/div"));

        if (index < 0 || index >= dateCells.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = dateCells.get(index).getText().trim();

        if (!today.equalsIgnoreCase(elementText)) {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Date mismatch. Expected: " + today + " | Actual: " + elementText);
            failAssertion("Date mismatch. Expected: " + today + " | Actual: " + elementText);
        } else {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Date match. Task created today: " + elementText);
            successLog("Date match. Task created today: " + elementText);
        }
    }

    public void verifyIncompleteTasksBlock(int index, String type, String task, String block, String columnNumber) {
        List<WebElement> dateCells = driver.findElements(By.xpath("//div[text()='" + block + "']/../../../../../..//*[contains(text(), '" + task + "')]/../../../td[" + columnNumber + "]/div"));

        if (index < 0 || index >= dateCells.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = dateCells.get(index).getText().trim();

        if (!type.equalsIgnoreCase(elementText)) {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task field mismatch. Expected: " + type + " | Actual: " + elementText);
            failAssertion("Task field mismatch. Expected: " + type + " | Actual: " + elementText);
        } else {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task field match. Task type: " + elementText);
            successLog("Task field match. Task type: " + elementText);
        }
    }

    public void verifyTaskDueDateCustomerLevel(int index, int daysToIncrement, String task, String block) {
        List<WebElement> dateCells = driver.findElements(By.xpath("//div[text()='" + block + "']/../../../../../..//*[contains(text(), '" + task + "')]/../../../td[6]/div"));

        if (index < 0 || index >= dateCells.size()) {
            failAssertion("Invalid index: " + index);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, daysToIncrement);
        String expectedDate = sdf.format(calendar.getTime());

        String elementText = dateCells.get(index).getText().trim();

        if (!expectedDate.equalsIgnoreCase(elementText)) {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task 'Due' mismatch. Expected: " + expectedDate + " | Actual: " + elementText);
            failAssertion("Task 'Due' mismatch. Expected: " + expectedDate + " | Actual: " + elementText);
        } else {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task 'Assigned To' match. Task 'Assigned To': " + elementText);
            successLog("Task 'Due' match. Date: " + elementText);
        }
    }

    public String getPrimaryUWFromUI() {

        return assignedTo.get(0).getText().trim();
    }

    public void iClickOnRenewalNotSentLink(Map<String, String> data) {
        String fullName = data.get("First_Name") + " " + data.get("Last_Name");
        String xpath = "//*[contains(text(), '" + fullName + "')]/../../../td[6]//span";
        WebElement element = driver.findElement(By.xpath(xpath));

        clickElement(element, "Clicked: " + fullName + " Renewal Offer Not Sent");
    }

    public void verifyCustomerDiaryTableRows(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        int index = 0;

        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        for (List<String> columns : rows) {
            String createdDate = columns.get(0);
            String taskType = columns.get(1);
            String taskTitle = columns.get(2);
            String createdBy = columns.get(3);
            String assignedTo = columns.get(4);
            String dueText = columns.get(5);
            String taskStatus = columns.get(6);
            String internalFlag = columns.get(7);
            String task = columns.get(8);
            String block = columns.get(9);
            String taskName = task + " " + data.get("Last_Name") + " " + data.get("First_Name");

            if (hasValue(createdDate) && createdDate.equalsIgnoreCase("Today"))
                verifyCreatedDateTodayCustomerLevel(index, task, block);

            if (hasValue(taskType))
                verifyIncompleteTasksBlock(index, taskType, taskName, block, "2");

            if (hasValue(taskTitle) && taskTitle.equalsIgnoreCase("PURE Programs renewal offer for")) {
                verifyIncompleteTasksBlock(index, taskName, taskName, block, "3");
            } else {
                verifyIncompleteTasksBlock(index, taskTitle, task, block, "3");
            }

            if (hasValue(createdBy))
                verifyIncompleteTasksBlock(index, createdBy, task, block, "4");

            if (hasValue(assignedTo))
                verifyIncompleteTasksBlock(index, assignedTo, task, block, "5");

            if (hasValue(dueText)) {
                try {
                    int due = Integer.parseInt(dueText.trim());
                    verifyTaskDueDateCustomerLevel(index, due, task, block);
                } catch (NumberFormatException e) {
                    commonComponentsAndActions.failAssertion("Invalid number format for due date: " + dueText);
                }
            }

            if (hasValue(taskStatus))
                verifyIncompleteTasksBlock(index, taskStatus, task, block, "7");

            if (hasValue(internalFlag))
                verifyIncompleteTasksBlock(index, internalFlag, task, block, "8");

            index++;
        }
    }

    public void verifyCarrierAllTasksTableRows(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size()); // skip header
        int index = 0;

        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        for (List<String> columns : rows) {
            String createdDate = columns.get(0);
            String taskType = columns.get(1);
            String taskTitle = columns.get(2);
            String createdBy = columns.get(3);
            String assignedTo = columns.get(4);
            String dueText = columns.get(5);
            String taskStatus = columns.get(6);
            String task = columns.get(7);
            String policyID = data.get("Policy_ID");
            String effectiveDate = incrementYear(data.get("Effective_Date"));
            String fullStateName = getFullStateName(data.get("State"));

            if (hasValue(createdDate) && createdDate.equalsIgnoreCase("Today"))
                verifyCreatedDateToday(index, task);

            if (hasValue(taskType))
                verifyCarrierTasksBlock(index, taskType, task, "3");

            if (hasValue(taskTitle) && taskTitle.equalsIgnoreCase("PURE Programs renewal offer for")) {
                verifyCarrierTasksBlock(index, taskTitle + " " + data.get("Last_Name") + " " + data.get("First_Name"), task, "4");
            } else if (hasValue(taskTitle) && taskTitle.equalsIgnoreCase("A Renewal Offer is now available for")) {
                verifyCarrierTasksBlock(index, policyID + " - " + effectiveDate + " - " + fullStateName + " - A renewal offer is now available for " + data.get("First_Name") + " " + data.get("Last_Name") + ", " + data.get("Customer_ID"), task, "4");
            } else if (hasValue(taskTitle) && taskTitle.equalsIgnoreCase("Renewal Review for")) {
                verifyCarrierTasksBlock(index, policyID + " - " + effectiveDate + " - " + fullStateName + " - Renewal Review for " + data.get("First_Name") + " " + data.get("Last_Name") + ", " + data.get("Customer_ID"), task, "4");
            } else {
                verifyCarrierTasksBlock(index, taskTitle, task, "4");
            }

            if (hasValue(createdBy))
                verifyCarrierTasksBlock(index, createdBy, task, "5");

            if (hasValue(assignedTo))
                verifyCarrierTasksBlock(index, assignedTo, task, "6");

            if (hasValue(dueText)) {
                try {
                    int due = Integer.parseInt(dueText.trim());
                    verifyTaskDueDate(index, due, task);
                } catch (NumberFormatException e) {
                    commonComponentsAndActions.failAssertion("Invalid number format for due date: " + dueText);
                }
            }

            if (hasValue(taskStatus))
                verifyCarrierTasksBlock(index, taskStatus, task, "8");

            index++;
        }
    }

    public void verifyTaskContentsDetails(DataTable table) {
        List<List<String>> rows = table.asLists();
        List<String> columns = rows.get(1);

        String taskType = columns.get(0);
        String title = columns.get(1);
        String taskStatus = columns.get(2);
        String taskInternalFlag = columns.get(3);
        String assignedTo = columns.get(4);
        String dueDate = columns.get(5);
        String createdDate = columns.get(6);
        String relatedTo = columns.get(7);
        String notes = columns.get(8);
        String agencyName = columns.get(9);

        String customerName = data.get("First_Name") + " " + data.get("Last_Name");
        String customerID = data.get("Customer_ID");
        String policyID = data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1";
        String effectiveDate = incrementYear(data.get("Effective_Date"));
        String fullStateName = getFullStateName(data.get("State"));

        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        if (hasValue(taskType))
            verifyTaskSummaryFields("Task Type", taskType);

        if (hasValue(title) && title.equalsIgnoreCase("PURE Programs renewal offer for")) {
            verifyTaskSummaryFields("Title", title + " " + data.get("Last_Name") + " " + data.get("First_Name"));
        } else if (hasValue(title) && title.equalsIgnoreCase("A Renewal Offer is now available for")) {
            verifyTaskSummaryFields("Title", data.get("Policy_ID") + " - " + effectiveDate + " - " + fullStateName + " - A renewal offer is now available for " + data.get("First_Name") + " " + data.get("Last_Name") + ", " + data.get("Customer_ID"));
        } else if (hasValue(title) && title.equalsIgnoreCase("Renewal Review for")) {
            verifyTaskSummaryFields("Title", data.get("Policy_ID") + " - " + effectiveDate + " - " + fullStateName + " - Renewal Review for " + data.get("First_Name") + " " + data.get("Last_Name") + ", " + data.get("Customer_ID"));
        } else {
            verifyTaskSummaryFields("Title", title);
        }

        if (hasValue(taskStatus))
            verifyTaskSummaryFields("Task Status", taskStatus);

        if (hasValue(taskInternalFlag))
            verifyTaskSummaryFields("Task Internal Flag", taskInternalFlag);

        if (hasValue(assignedTo))
            verifyTaskSummaryFields("Assigned To", assignedTo);

        if (hasValue(dueDate)) {
            try {
                int due = Integer.parseInt(dueDate.trim());
                verifyTaskDueDateSummary("Due Date", due);
            } catch (NumberFormatException e) {
                commonComponentsAndActions.failAssertion("Invalid number format for due date: " + dueDate);
            }
        }

        if (hasValue(createdDate))
            verifyTaskSummaryFields("Creation Date", createdDate);

        if (hasValue(relatedTo) && relatedTo.equalsIgnoreCase("Customer"))
            verifyTaskSummaryFields("Related To", customerName + " Policy #: " + policyID + " | Transaction: Renewal");

        if (hasValue(notes) && notes.equalsIgnoreCase("Renewal Offer Not Sent")) {
            verifyTaskSummaryFields(
                    "Notes",
                    "Policyholder Name: " + customerID +
                            " Policy Number: " + data.get("Policy_ID") + " " +
                            "\"Renewal Offer Not Sent. Please review and complete any referrals and rate the policy so renewal offer can be sent.\""
            );
        } else if (hasValue(notes) && notes.equalsIgnoreCase("PURE Programs renewal offer")) {
            verifyTaskSummaryFields(
                    "Notes", "A non-admitted renewal offer was sent to your client You can view the renewal" +
                            " offer in PURE Online. Since this coverage is being offered by a non-admitted insurer," +
                            " you, and potentially your client, are required to electronically sign one or" +
                            " more documents in order for the renewal coverage to be effective. " +
                            "You will soon receive a separate email asking you to sign these documents." +
                            " CUSTOMER INFORMATION Name: " + data.get("Last_Name") + " " + data.get("First_Name") +
                            " Customer ID: " + customerID + " Policy Number: " + policyID + " Effective Date: " + effectiveDate + " Questions? Contact your PURE Programs Underwriter."
            );
        } else if (hasValue(notes) && notes.equalsIgnoreCase("A Renewal Offer is now available for")) {
            verifyTaskSummaryFields(
                    "Notes", "An offer of renewal was sent to your insured today. Coverage is once again being offered by an eligible non-admitted insurer, therefore please note that this policy will not automatically renew. Please email your bind request to renewals@pureprograms.com and attach any required documents. To determine if a Diligent Effort form is required for this risk state, visit https://www.pureprograms.com/policy-issuance-resources. The renewal offer can be downloaded from the documents tab in PURE Online. If you have questions, please contact your Underwriter or email renewals@pureprograms.com. Thank you!"
            );
        } else if (hasValue(notes) && notes.equalsIgnoreCase("Renewal Review for")) {
            verifyTaskSummaryFields(
                    "Notes", "Policyholder Name: " + customerName + " Policy Number: " + policyID + " Following are the Underwriting Referrals for Renewal Review:"
            );
        }

        if (hasValue(agencyName))
            verifyTaskSummaryFields("Agency Name", agencyName);
    }

    public static String incrementYear(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date = LocalDate.parse(dateStr, formatter);
        LocalDate incremented = date.plusYears(1);

        return incremented.format(formatter);
    }


}



