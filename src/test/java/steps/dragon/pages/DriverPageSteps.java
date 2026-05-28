package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.DriverDetailsPage;
import pages.blocks.DriverDetailsBlock;
import pages.blocks.DriverIncidentsBlock;
import pages.blocks.OperatorsBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class DriverPageSteps extends BaseTest {
    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I click add incident on driver details page")
    public void iClickAddIncident() throws Throwable {
        new DriverIncidentsBlock(driver).clickAdd();
    }

    @And("I set incident {int} source to {string} on driver details page")
    public void iSetIncidentSource(int i, String value) throws Throwable {
        new DriverIncidentsBlock(driver).setIncidentSource(value, i);
    }

    @And("I set incident {int} accident or violation to {string} on driver details page")
    public void iSetAccidentOrViolation(int i, String value) throws Throwable {
        new DriverIncidentsBlock(driver).setAccidentOrViolation(value, i);
    }

    @And("I set incident {int} conviction date to {string} on driver details page")
    public void iSetConvictionDate(int i, String value) throws Throwable {
        new DriverIncidentsBlock(driver).setIncidentDate(value, i, data.get("State"));
    }

    @And("I navigate to driver details page")
    public void iNavigateToDriverDetailsPage() throws Throwable {
        new DriverDetailsPage(driver).navigateToDriverDetailsPage(data, "First_Name", "MI", "Last_Name");
    }

    @And("I verify if Clue Data is {string} on driver details page")
    public void iVerifyIfClueDataIsOnDriverDetailsPage(String value) throws Throwable {
        new DriverDetailsPage(driver).verifyIfCLUEDataReturned(value);
    }

    @And("I set incident {int} conviction date to {string} on driver details page for {string}")
    public void iSetConvictionDate(int i, String value, String state) throws Throwable {
        new DriverIncidentsBlock(driver).setIncidentDate(value, i, state);
    }

}
