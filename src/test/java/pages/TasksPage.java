package pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TasksPage extends CommonComponentsAndActions {
    WebDriver driver;
    public Map<String, String> data = DataManager.getInstance().getData();

    public TasksPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'pre-renewal tasks')]/../../../../../..//*[contains(text(), 'Created')]")
    WebElement preRenewalTasksCreated;
    @FindBy(xpath = "(//div[contains(text(),'renewal tasks')]/../../../../../..//*[text()='Created'])[3]")
    WebElement renewalTasksCreated;
    @FindBy(xpath = "//div[contains(text(),'pre-renewal tasks')]/../../../../../..//*[text()='Created']/../../../../div[2]")
    WebElement preRenewalTasksCreatedDropdown;
    @FindBy(xpath = "(//div[contains(text(),'renewal tasks')]/../../../../../..//*[text()='Created'])[3]/../../../../div[2]")
    WebElement renewalTasksCreatedDropdown;

    public void verifyCreatedDateToday(int index, String block) {
        String fullName = data.get("Last_Name") + " " + data.get("First_Name");
        List<WebElement> dateCells = driver.findElements(By.xpath("//div[contains(text(),'" + block + "')]/../../../../../..//*[contains(text(), '" + fullName + "')]/../../../td[2]/div"));

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String today = sdf.format(new Date());

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


    public void verifyPreRenewalTasks(int index, String expected, String block, String columnNumber) {
        String fullName = data.get("First_Name") + " " + data.get("Last_Name");
        List<WebElement> dateCells = driver.findElements(By.xpath("//div[contains(text(),'" + block + "')]/../../../../../..//*[contains(text(), '" + fullName + "')]/../../../td[" + columnNumber + "]/div"));

        if (index < 0 || index >= dateCells.size()) {
            failAssertion("Invalid index: " + index);
        }

        String elementText = dateCells.get(index).getText().trim();

        if (!expected.equalsIgnoreCase(elementText)) {
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task field mismatch. Expected: " + expected + " | Actual: " + elementText);
            failAssertion("Task field mismatch. Expected: " + expected + " | Actual: " + elementText);
        } else {
            successLog("Task field match. Task type: " + elementText);
            scrollToWebElement(dateCells.get(index));
            reportScreenshot("Screenshot", "Task field match. Task type: " + elementText);
        }
    }

    public void verifyTaskDueDate(int index, int daysToIncrement, String block) {
        String fullName = data.get("First_Name") + " " + data.get("Last_Name");
        List<WebElement> dateCells = driver.findElements(By.xpath("//div[contains(text(),'" + block + "')]/../../../../../..//*[contains(text(), '" + fullName + "')]/../../../td[3]/div"));

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

    public void sortTasksDescending() throws Throwable {
        try {
            pause(3000);
            scrollToWebElement(driver.findElement(By.xpath("//*[text()='quote tasks']")));
            Actions action = new Actions(driver);
            action.moveToElement(preRenewalTasksCreated).click(preRenewalTasksCreatedDropdown).build().perform();
            pause(2000);
            action.moveToElement(preRenewalTasksCreated).click(preRenewalTasksCreatedDropdown).build().perform();
            pause(2000);
            clickElement(driver.findElement(By.xpath("//*[text()='Sort Descending']")));
            pause(2000);

        } catch (Exception e) {
            pause(3000);
            scrollToWebElement(driver.findElement(By.xpath("//*[text()='quote tasks']")));
            pause(2000);
            Actions action = new Actions(driver);
            action.moveToElement(preRenewalTasksCreated).click(preRenewalTasksCreatedDropdown).build().perform();
            pause(2000);
            action.moveToElement(preRenewalTasksCreated).click(preRenewalTasksCreatedDropdown).build().perform();
            pause(2000);
            clickElement(driver.findElement(By.xpath("//*[text()='Sort Descending']")));
            pause(2000);
        }
    }

    public void sortRenewalTasksDescending() throws Throwable {
        try {
            pause(3000);
            scrollToWebElement(driver.findElement(By.xpath("//*[text()='renewal tasks']")));
            Actions action = new Actions(driver);
            action.moveToElement(renewalTasksCreated).click(renewalTasksCreatedDropdown).build().perform();
            pause(2000);
            action.moveToElement(renewalTasksCreated).click(renewalTasksCreatedDropdown).build().perform();
            pause(2000);
            clickElement(driver.findElement(By.xpath("//*[text()='Sort Descending']")));
            pause(2000);

        } catch (Exception e) {
            pause(3000);
            scrollToWebElement(driver.findElement(By.xpath("//*[text()='renewal tasks']")));
            pause(2000);
            Actions action = new Actions(driver);
            action.moveToElement(renewalTasksCreated).click(renewalTasksCreatedDropdown).build().perform();
            pause(2000);
            action.moveToElement(renewalTasksCreated).click(renewalTasksCreatedDropdown).build().perform();
            pause(2000);
            clickElement(driver.findElement(By.xpath("//*[text()='Sort Descending']")));
            pause(2000);
        }
    }

    public void verifyTaskElementOnUI(Map<String, String> data, String displayedOrNot) {
        String fullName = data.get("First_Name") + " " + data.get("Last_Name") + " Policy #: " + data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1" + " | Transaction: Renewal";

        boolean isElementPresent = !driver.findElements(By.xpath("//*[contains(text(),'" + fullName + "')]")).isEmpty();

        if (displayedOrNot.equalsIgnoreCase("Not Displayed") && isElementPresent) {
            failAssertion("Element with message: " + fullName + " is displayed when it shouldn't be");
            reportScreenshot("Failure_" + fullName + "_element_" + System.currentTimeMillis(), fullName);
        } else if (!displayedOrNot.equalsIgnoreCase("Not Displayed") && !isElementPresent) {
            failAssertion("Element with message: " + fullName + " is not displayed when it should be");
            reportScreenshot("Failure_element_" + System.currentTimeMillis(), fullName);
        } else if (displayedOrNot.equalsIgnoreCase("Displayed")) {
            scrollToWebElement(driver.findElement(By.xpath("//*[contains(text(),'" + fullName + "')]")));
            reportScreenshot("Success_Element_Visible_" + System.currentTimeMillis(), fullName);
        }
    }

    public void verifyTasksPageTableRows(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        int index = 0;

        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);

        for (List<String> columns : rows) {
            String createdDate = columns.get(0);
            String dueDate = columns.get(1);
            String creator = columns.get(2);
            String assignedTo = columns.get(3);
            String taskTitle = columns.get(4);
            String relatedTo = columns.get(5);
            String taskStatus = columns.get(6);
            String taskType = columns.get(7);
            String block = columns.get(8);

            if (hasValue(createdDate) && createdDate.equalsIgnoreCase("Today"))
                verifyCreatedDateToday(index, block);

            if (hasValue(dueDate)) {
                try {
                    int due = Integer.parseInt(dueDate.trim());
                    verifyTaskDueDate(index, due, block);
                } catch (NumberFormatException e) {
                    commonComponentsAndActions.failAssertion("Invalid number format for due date: " + dueDate);
                }
            }

            if (hasValue(creator))
                verifyPreRenewalTasks(index, creator, block, "4");

            if (hasValue(assignedTo))
                verifyPreRenewalTasks(index, assignedTo, block, "5");

            if (hasValue(taskTitle) && taskTitle.equalsIgnoreCase("PURE Programs renewal offer for")) {
                verifyPreRenewalTasks(index, taskTitle + " " + data.get("Last_Name") + " " + data.get("First_Name"), block, "6");
            } else if (hasValue(taskTitle)) {
                verifyPreRenewalTasks(index, taskTitle, block, "6");
            }

            if (hasValue(relatedTo) && relatedTo.equalsIgnoreCase("Customer")) {
                String policyID = data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1";
                String relatedToText = data.get("First_Name") + " " + data.get("Last_Name") + " : " + policyID + " | Transaction: Renewal";
                verifyPreRenewalTasks(index, relatedToText, block, "7");
            } else if (hasValue(relatedTo) && relatedTo.equalsIgnoreCase("PURE Programs renewal offer for")) {
                String policyID = data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1";
                String relatedToText = data.get("First_Name") + " " + data.get("Last_Name") + " Policy #: " + policyID + " | Transaction: Renewal";
                verifyPreRenewalTasks(index, relatedToText, block, "7");
            }

            if (hasValue(taskStatus))
                verifyPreRenewalTasks(index, taskStatus, block, "8");

            if (hasValue(taskType))
                verifyPreRenewalTasks(index, taskType, block, "9");

            index++;
        }
    }


}
