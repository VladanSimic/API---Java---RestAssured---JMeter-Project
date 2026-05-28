package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.DriverDetailsPage;
import pages.OperatorInformationPage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;
import steps.dragon.common.NavigationSteps;

import java.util.Map;

public class OperatorInformationPageSteps extends BaseTest {
    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();


    @And("I click add operator")
    public void iClickAddOperator() throws Throwable {
        new OperatorsBlock(driver).clickAddOperator();
    }

    @And("I set operator first name to {string} for operator {int}")
    public void iSetFirstNameForOperator(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setFirstName(value, index);
    }

    @And("I set operator mi name to {string} for operator {int}")
    public void iSetMINameForOperator(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setMI(value, index);
    }

    @And("I set operator last name to {string} for operator {int}")
    public void iSetLastNameForOperator(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setLastName(value, index);
    }

    @And("I set operator DOB to {string} for operator {int}")
    public void iSetDOBForOperator(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setDOB(value, index);
    }


    @And("I set operator license state to {string} for operator {int}")
    public void iSetLicenseStateForOperator(String value, int index) {
        new OperatorsBlock(driver).setLicenseState(value, index);
    }

    @And("I set operator license number to {string} for operator {int}")
    public void iSetLicenseNumberForOperator(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setLicenseNumber(value, index);
    }

    @And("I set operator relationship to named insured to {string} for operator {int}")
    public void iSetRelationshipForNamedInsuredForOperator(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setRelationshipToInsured(value, index);
    }

    @And("I set operator resided at risk location for more than 6 months to {string} for operator {int}")
    public void iResidedAtRiskLocationForOperator(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setResidedAtRiskLocation(value, index);
    }

    @And("I click add incident on operator information page")
    public void iClickAddIncident() throws Throwable {
        new OperatorIncidentsBlock(driver).clickAdd();
    }

    @And("I set incident {int} source to {string} on operator information page")
    public void iSetIncidentSource(int i, String value) throws Throwable {
        new OperatorIncidentsBlock(driver).setIncidentSource(value, i);
    }

    @And("I set incident {int} accident or violation to {string} on operator information page")
    public void iSetAccidentOrViolation(int i, String value) throws Throwable {
        new OperatorIncidentsBlock(driver).setAccidentOrViolation(value, i);
    }

    @And("I set incident {int} conviction date to {string} on operator information page")
    public void iSetConvictionDate(int i, String value) throws Throwable {
        new OperatorIncidentsBlock(driver).setIncidentDate(value, i);
    }

    @And("I navigate to operator information page")
    public void iNavigateToDriverDetailsPage() throws Throwable {
        new OperatorInformationPage(driver).goToPage("Operator Information");
    }

    @And("I set operator excluded {string} for operator {int}")
    public void iClickAddOperatorExcluded(String value, int index) throws Throwable {
        new OperatorsBlock(driver).setExclude(value, index);
    }

    @And("I verify if Clue Data is {string} on operator information page")
    public void iVerifyIfClueDataIsOnDriverDetailsPage(String value) throws Throwable {
        new OperatorInformationPage(driver).verifyIfCLUEDataReturned(value);
    }

    @And("I verify copied claim information for {string} is correct")
    public void iVerifyCopiedClaimInformationIsCorrect(String LOB, DataTable table ) {
        new IncidentsBlock(driver).verifyDetailsOfCopiedIncident(LOB, table, data);
    }

    @And("I set incident {int} driver to {string} on operator information page")
    public void iSetIncidentDriver(int i, String value) throws Throwable {
        new OperatorIncidentsBlock(driver).setIncidentSource(value, i);
    }

}
