package steps.dragon.common;

import excel.DataManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pages.utils.CommonComponentsAndActions;
import pages.utils.SoftAssertion;
import pages.utils.TeamsNotifier;
import selenium.DriverManager;
import sql.SQLManager;
import steps.BaseTest;

import java.util.Arrays;
import java.util.Map;

public class Hooks extends BaseTest {

    WebDriver driver;
    Map<String, String> data;
    public String APIOnly = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("APIOnly");
    public String ENV = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ENV");

    @Before
    public void setup(Scenario scenario) throws Exception {
        if (!(hasValue(APIOnly) && APIOnly.equalsIgnoreCase("Yes"))) {
            if (hasValue(RAMP_UP) && RAMP_UP.equalsIgnoreCase("Yes")) {
                iThinkForToSeconds(1, 240);
            }
            init(BROWSER, WAIT_TIME);
            setScenarioName(scenario.getName());
            createFileToStoreData("results/PolicyIDs.txt");
            logPGActions();
            driver = DriverManager.getInstance().getWebDriver();
        }
    }


    @After
    public void tearDown(Scenario scenario) throws Throwable {
        if (!(hasValue(APIOnly) && APIOnly.equalsIgnoreCase("Yes"))) {
            data = DataManager.getInstance().getData();
            driver = DriverManager.getInstance().getWebDriver();

            if (hasValue(DBStore) && DBStore.equalsIgnoreCase("Yes") && hasValue(EXECUTION_ID)) {
                if (!scenario.isFailed()) {
                    SQLManager.markExecutionResultStatus(EXECUTION_ID, "100");
                } else if (scenario.isFailed()) {
                    SQLManager.markExecutionResultStatus(EXECUTION_ID, "200");
                }
                SQLManager.markExecutionAsCompleted(EXECUTION_ID);
            }

            CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
            String usid = data.get("SESSION_ID");
            if (scenario.isFailed() || SoftAssertion.isFailed()) {
                commonComponentsAndActions.writeToExistingFileAppended("results/AllPolicyIDs.txt",
                        "FAILED" + " | " + getScenarioName() + " | Eff. Date: " + data.get("Effective_Date") +
                                " | " +
                                "US ID: " + (hasValue(usid) ? usid : "N/A") +
                                " | QUOTE ID: " + (hasValue(data.get("QUOTE_ID")) ? data.get("QUOTE_ID") : "N/A") +
                                " | POLICY ID: " + (hasValue(data.get("Policy_ID")) ? data.get("Policy_ID") : "N/A"));
                System.out.println("Failure_" + data.get("Admitted_Line") + " (" + data.get("Admitted_Or_Surplus") + ")" + data.get("State") + "_" + (hasValue(usid) ? usid : "Unable to get USID"));
                reportScreenshot("Failure_" + data.get("Admitted_Line") + " (" + data.get("Admitted_Or_Surplus") + ")" + data.get("State") + System.currentTimeMillis(), "Screenshot taken on the end of the test");
            } else {
                commonComponentsAndActions.writeToExistingFileAppended("results/AllPolicyIDs.txt",
                        "PASS" + " | " + getScenarioName() + " | Eff. Date: " + data.get("Effective_Date") +
                                " | " +
                                "US ID: " + (hasValue(usid) ? usid : "N/A") +
                                " | QUOTE ID: " + (hasValue(data.get("QUOTE_ID")) ? data.get("QUOTE_ID") : "N/A") +
                                " | POLICY ID: " + (hasValue(data.get("Policy_ID")) ? data.get("Policy_ID") : "N/A"));

            }
           quit();
            SoftAssertion.assertAll();
        }
    }

}