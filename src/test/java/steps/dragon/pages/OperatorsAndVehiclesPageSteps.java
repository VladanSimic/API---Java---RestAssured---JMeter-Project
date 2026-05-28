package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.blocks.AdditionalOperatorsBlock;
import pages.blocks.VehiclesObtainedThroughOnlineReportsBlock;
import pages.OperatorsAndVehiclePage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class OperatorsAndVehiclesPageSteps extends BaseTest {
    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote operators and vehicles page")
    public void iFillOutOperatorsAndVehiclesPagePA() throws Throwable {
        OperatorsAndVehiclePage operatorsAndVehiclePage = new OperatorsAndVehiclePage(driver);
        data = operatorsAndVehiclePage.fillOperatorsAndVehiclesPagePA(data);
        DataManager.getInstance().setData(data);
    }

    @And("I fill out PA endorsement operators and vehicles page")
    public void iFillOutOperatorsAndVehiclesPagePA_END() throws Throwable {
        new OperatorsAndVehiclePage(driver).fillOperatorsAndVehiclePagePA_END(data);
    }

    @And("I fill out PA additional vehicles block")
    public void iFillOutAdditionalVehiclesBlockPA() throws Throwable {
        new AdditionalVehiclesBlock(driver).fillAdditionalVehiclesDetailsPA(data);
    }

    @And("I fill out PA additional vehicles block carfax")
    public void iFillOutAdditionalVehiclesBlockPACarfax() throws Throwable {
        new AdditionalVehiclesBlock(driver).fillAdditionalVehiclesDetailsPACarfax(data);
    }

    @And("I fill out PA endorsement additional vehicles block carfax")
    public void iFillOutAdditionalEndorsementVehiclesBlockPACarfax() throws Throwable {
        new AdditionalVehiclesBlock(driver).fillAdditionalVehiclesDetailsPACarfax_END(data);
    }

    @And("I fill out PA renewal additional vehicles block carfax")
    public void iFillOutAdditionalRenewalVehiclesBlockPACarfax() throws Throwable {
        new AdditionalVehiclesBlock(driver).fillAdditionalVehiclesDetailsPACarfax_RNW(data);
    }

    @And("I fill out PA oos endorsement additional vehicles block carfax")
    public void iFillOutAdditionalOOSVehiclesBlockPACarfax() throws Throwable {
        new AdditionalVehiclesBlock(driver).fillAdditionalVehiclesDetailsPACarfax_OOS_END(data);
    }

    @And("I fill out PA additional operators block")
    public void iFillOutAdditionalOperatorsBlockPA() throws Throwable {
        new AdditionalOperatorsBlock(driver).fillAdditionalOperatorsDetailsPA(data);
    }

    @And("I fill out PA operators obtained through online reports block")
    public void iFillOutPAOperatorsObtainedThroughOnlineReportsBlock() throws Throwable {
        new OperatorsObtainedThroughOnlineReportsBlock(driver).fillOperatorsDetailsPA(data);
    }

    @And("I fill out PA endorsement additional Vehicles block")
    public void iFillOutAdditionalVehiclesBlockPA_END() throws Throwable {
        new AdditionalVehiclesBlock(driver).fillAdditionalVehiclesDetailsPA_END(data);
    }

    @And("I fill out PA endorsement additional operators block")
    public void iFillOutAdditionalOperatorsBlockPA_END() throws Throwable {
        new AdditionalOperatorsBlock(driver).fillAdditionalOperatorsDetailsPA_END(data);
    }

    @And("I fill out PA renewal additional operators block")
    public void iFillOutRenewalAdditionalOperatorsBlockPA() throws Throwable {
        new AdditionalOperatorsBlock(driver).fillAdditionalOperatorsDetailsPA_RNW(data);
    }

    @And("I fill out PA oos endorsement additional operators block")
    public void iFillOutOOSAdditionalOperatorsBlockPA() throws Throwable {
        new AdditionalOperatorsBlock(driver).fillAdditionalOperatorsDetailsPA_OOS_END(data);
    }

    //PA pages and blocks steps - END

    //Additional vehicles block steps - START

    @And("I set additional vehicle {int} VIN to {string}")
    public void iSetAdditionalVehicleVIN(int index, String value) throws Throwable {
        new AdditionalVehiclesBlock(driver).setVIN(value, index);
    }

    @And("I set additional vehicle {int} vehicle type to {string}")
    public void iSetAdditionalVehicleType(int index, String value) throws Throwable {
        new AdditionalVehiclesBlock(driver).setVehicleType(value, index);
    }

    @And("I set additional vehicle {int} VIN override to {string}")
    public void iSetAdditionalVehicleVINOverride(int index, String value) throws Throwable {
        new AdditionalVehiclesBlock(driver).setVINOverride(value, index);
    }

    @And("I set additional vehicle {int} year to {string}")
    public void iSetAdditionalVehicleYear(int index, String value) throws Throwable {
        new AdditionalVehiclesBlock(driver).setYear(value, index);
    }

    @And("I set additional vehicle {int} make to {string}")
    public void iSetAdditionalVehicleMake(int index, String value) throws Throwable {
        new AdditionalVehiclesBlock(driver).setMake(value, index);
    }

    @And("I set additional vehicle {int} model to {string}")
    public void iSetAdditionalVehicleModel(int index, String value) throws Throwable {
        new AdditionalVehiclesBlock(driver).setModel(value, index);
    }

    @And("I set additional vehicle {int} trim level to {string}")
    public void iSetAdditionalVehicleTrimLevel(int index, String value) throws Throwable {
        new AdditionalVehiclesBlock(driver).setTrimLevel(value, index);
    }
    //Additional vehicles block steps - END

    //Additional operators block steps - START
    @And("I set additional operator driver status to {string} for {string}")
    public void iSetAdditionalOperatorDriverStatus(String value, String state) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverStatus(value, state);
    }

    @And("I set additional operator non driver reason to {string} ")
    public void iSetAdditionalOperatorNonDriverReason(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setNonDriverReason(value);
    }

    @And("I set additional operator driver prefix to {string} ")
    public void iSetAdditionalOperatorDriverPrefix(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverPrefix(value);
    }

    @And("I set additional operator driver first name to {string} ")
    public void iSetAdditionalOperatorDriverFirstName(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverFirstName(value);
    }

    @And("I set additional operator driver driver MI to {string} ")
    public void iSetAdditionalOperatorDriverMI(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverMI(value);
    }

    @And("I set additional operator driver last name to {string} ")
    public void iSetAdditionalOperatorDriverLastName(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverLastName(value);
    }

    @And("I set additional operator driver suffix to {string} ")
    public void iSetAdditionalOperatorDriverSuffix(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverSuffix(value);
    }

    @And("I set additional operator driver DOB to {string} ")
    public void iSetAdditionalOperatorDriverDOB(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverDOB(value);
    }

    @And("I set additional operator exclude to {string} ")
    public void iSetAdditionalOperatorExclude(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setExclude(value);
    }

    @And("I set additional operator driver gender to {string} ")
    public void iSetAdditionalOperatorDriverGender(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverGender(value);
    }

    @And("I set additional operator driver license state to {string} ")
    public void iSetAdditionalOperatorDriverLicenseState(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverLicenseState(value);
    }

    @And("I set additional operator driver license number to {string} ")
    public void iSetAdditionalOperatorDriverLicenseNumber(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverLicenseNumber(value);
    }

    @And("I set additional operator relationship to insured to {string} ")
    public void iSetAdditionalOperatorRelationshipToInsured(String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setRelationshipToInsured(value);
    }

    @And("I set additional operator {int} additional driver status to {string} for {string}")
    public void iSetAdditionalOperatorDriverStatus(int num, String value, String state) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorDriverStatus(value, state, num);
    }

    @And("I set additional operator {int} additional driver non driver reason to {string}")
    public void iSetAdditionalOperatorNonDriverReason(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorNonDriverReason(value, index);
    }

    @And("I set additional operator {int} additional driver prefix to {string}")
    public void iSetAdditionalOperatorPrefix(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorPrefix(value, index);
    }

    @And("I set additional operator {int} additional driver first name to {string}")
    public void iSetAdditionalOperatorFirstName(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorFirstName(value, index);
    }

    @And("I set additional operator {int} additional driver MI to {string}")
    public void iSetAdditionalOperatorMI(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorMI(value, index);
    }

    @And("I set additional operator {int} additional driver last name to {string}")
    public void iSetAdditionalOperatorLastName(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorLastName(value, index);
    }

    @And("I set additional operator {int} additional driver suffix to {string}")
    public void iSetAdditionalOperatorSuffix(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorSuffix(value, index);
    }

    @And("I set additional operator {int} additional driver DOB to {string}")
    public void iSetAdditionalOperatorDOB(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalOperatorDOB(value, index);
    }

    @And("I set additional operator {int} additional driver exclude to {string}")
    public void iSetAdditionalOperatorDriverExclude(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalDriverExclude(value, index);
    }

    @And("I set additional operator {int} additional driver gender to {string}")
    public void iSetAdditionalOperatorAdditionalDriverGender(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalDriverGender(value, index);
    }

    @And("I set additional operator {int} additional driver license state to {string}")
    public void iSetAdditionalOperatorAdditionalDriverLicenseState(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalDriverLicenseState(value, index);
    }

    @And("I set additional operator {int} additional driver license number to {string}")
    public void iSetAdditionalOperatorAdditionalDriverLicenseNumber(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalDriverLicenseNumber(value, index);
    }

    @And("I set additional operator {int} additional driver relationship to insured to {string}")
    public void iSetAdditionalOperatorRelationshipToInsured(int index, String value) throws Throwable {
        new AdditionalOperatorsBlock(driver).setAdditionalRelationshipToInsured(value, index);
    }
    //Additional operators block steps - END

    //Vehicles obtained through online reports block steps - START
    @And("I exclude obtained vehicles if any")
    public void iExcludeObtainedVehicles() throws Throwable {
        pause(5);
        new VehiclesObtainedThroughOnlineReportsBlock(driver).excludeObtainedVehicles();
    }
    //Vehicles obtained through online reports block steps - END


    @And("I click add additional operator")
    public void iClickAddAdditionalOperator() throws Throwable {
        new AdditionalOperatorsBlock(driver).addAdditionalOperator();
    }

    @And("I set driver first name to {string} for driver {int}")
    public void iSetFirstNameForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setOperatorFirstName(value, index);
    }

    @And("I set driver mi name to {string} for driver {int}")
    public void iSetMINameForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setOperatorMI(value, index);
    }

    @And("I set driver last name to {string} for driver {int}")
    public void iSetLastNameForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setOperatorLastName(value, index);
    }

    @And("I set driver DOB to {string} for driver {int}")
    public void iSetDOBForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setOperatorDOB(value, index);
    }

    @And("I set driver status to {string} for driver {int}")
    public void iSetStatusForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverStatus(value, index, data.get("State"));
    }

    @And("I set driver gender to {string} for driver {int}")
    public void iSetGenderForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverGender(value, index);
    }

    @And("I set driver license state to {string} for driver {int}")
    public void iSetLicenseStateForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverLicenseState(value, index);
    }

    @And("I set driver license number to {string} for driver {int}")
    public void iSetLicenseNumberForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverLicenseNumber(value, index);
    }

    @And("I set driver relationship to named insured to {string} for driver {int}")
    public void iSetRelationshipForNamedInsuredForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setRelationshipToInsured(value, index);
    }

    @And("I set driver resided at policy location for more than 6 months to {string} for driver {int}")
    public void iResidedAtPolicyLocationForDriver(String value, int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setResidedAtPolicyLocation(value, index);
    }

    @And("I set driver excluded to yes for driver {int}")
    public void iSetDriverExcludedForDriver(int index) throws Throwable {
        new AdditionalOperatorsBlock(driver).setDriverExcluded(index);
    }

    @Then("I verify vehicles obtained through online reports")
    public void iVerifyVehiclesObtainedThroughOnlineReports(DataTable table) {
        new VehiclesObtainedThroughOnlineReportsBlock(driver).verifyVehiclesObtainedThroughOnlineReports(table);
    }

    @Then("I verify validation message {string} is displayed")
    public void iVerifyValidationMessageIsDisplayed(String message) {
        new CommonComponentsAndActions(driver).verifyValidationMessageDisplayed(message);
    }

    @Then("I verify {string} check box field is {string} on the UI")
    public void iVerifyFieldIsDisplayed(String element, String displayedOrNot) throws Throwable {
        new AdditionalOperatorsBlock(driver).verifyExcludeDriverField(element, displayedOrNot);


    }
    @And("I verify that operator tree node option with name {string} is {string}")
    public void iVerifyThatOperatorTreeNodeOptionIsNotVisible(String operatorName, String displayedOrNot) throws InterruptedException {
        new CommonComponentsAndActions(driver).isTreeNodeDisplayed(operatorName, displayedOrNot);
    }

    @Then("I verify operator added through END trx is present for {string} in the obtained operators block")
    public void iVerifyOperatorAddedThroughTrxIsPresentInObtainedOperatorsBlock(String LOB){
        new OperatorsObtainedFromActiveHouseholdsBlock(driver).verifyOperatorDetailsFromENDTrx(LOB, data);
    }

    @And("I mark {int} operator to be included and include them")
    public void iMarkOperatorToBeIncluded(int index) throws InterruptedException {
        new OperatorsObtainedFromActiveHouseholdsBlock(driver).markOperatorToBeIncludedByIndexAndInclude(index);
    }

}
