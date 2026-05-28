package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.TasksPage;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class TasksPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I verify tasks table on tasks page")
    public void verifyTasksTableOnTasksPage(DataTable table) {
        new TasksPage(driver).verifyTasksPageTableRows(table);
    }

    @And("I verify if task element is {string} on the UI")
    public void verifyTasksTableOnTasksPage(String displayedOrNot) {
        new TasksPage(driver).verifyTaskElementOnUI(data, displayedOrNot);
    }

    @And("I sort pre renewal tasks descending")
    public void sortTasksDescending() throws Throwable {
        TasksPage page = new TasksPage(driver);
        page.sortTasksDescending();
    }

    @And("I sort renewal tasks descending")
    public void sortRenewalTasksDescending() throws Throwable {
        TasksPage page = new TasksPage(driver);
        page.sortRenewalTasksDescending();
    }

    @And("I verify renewal policy id on transaction summary")
    public void iVerifyRenewalPolicyID() {
        CommonComponentsAndActions actions = new CommonComponentsAndActions(driver);
        String policyNumber = data.get("Policy_ID").substring(0, data.get("Policy_ID").length() - 1) + "1";
        String policyNumberUI = actions.iGetPolicyNumberFromUI();
        if (!policyNumber.equalsIgnoreCase(policyNumberUI)) {
            actions.failAssertion("Policy Number is not a match. Expected: " + policyNumber + " | " + "Actual: " + policyNumberUI);
            reportScreenshot("Screenshot", "Policy Number is not a match. Expected: " + policyNumber + " | " + "Actual: " + policyNumberUI);
        } else {
            actions.successLog("Policy Number is a match. Expected: " + policyNumber + " | " + "Actual: " + policyNumberUI);
        }
    }

}

