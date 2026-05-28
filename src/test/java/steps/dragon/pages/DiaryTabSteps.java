package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.*;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class DiaryTabSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I verify carrier all tasks table")
    public void verifyTasks(DataTable table) {
        new DiaryPage(driver).verifyCarrierAllTasksTableRows(table);
    }


    @And("I verify tasks table on Customer Diary")
    public void verifyTasksTableOnCustomer(DataTable table) {
        new DiaryPage(driver).verifyCustomerDiaryTableRows(table);
    }

    @And("I verify task contents")
    public void verifyTasksContents(DataTable table) {
        new DiaryPage(driver).verifyTaskContentsDetails(table);
    }

    @And("I write date to field {string} with offset {int}")
    public void iClickOnRenewalNotSentTask(String field, int offSetDays) throws Throwable {
        new CommonComponentsAndActions(driver).writeDateToField(field, offSetDays);
    }

    @And("I click on renewal offer not sent task")
    public void iClickOnRenewalNotSentTask() {
        new DiaryPage(driver).iClickOnRenewalNotSentLink(data);
    }

    @And("I save primary UW from the task")
    public void iVerifyThatTaskIsAssignedToPrimarySurplusUW() throws Throwable {
        DiaryPage diaryPage = new DiaryPage(driver);

        String primaryUW = diaryPage.getPrimaryUWFromUI();
        pause(3);

        data.put("Primary_UW", primaryUW);
    }

    @And("I navigate to agency underwriting tab")
    public void iNavigateToAgencyUnderwritingTab() throws Throwable {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);
        actions.navigateToCustomerPage();
        actions.iClickSelected("Underc0de");
        actions.iClickSelected("underwriting");
        pause(3);
    }

    @And("I verify that Primary UW is the assigned correctly")
    public void iVerifyThatPrimaryUwIsAssignedCorrectly() throws Throwable {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);
        String assignedUW = data.get("Primary_UW");
        String primaryUI = actions.iGetValueFromField("Surplus Primary Underwriter");

        if (!assignedUW.equalsIgnoreCase(primaryUI)) {
            actions.failAssertion("Primary UW is not correct. Assigned: " + assignedUW + " | Actual: " + primaryUI);
        }
    }

}

