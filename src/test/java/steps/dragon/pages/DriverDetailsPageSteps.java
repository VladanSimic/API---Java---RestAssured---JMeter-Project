package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.DriverDetailsPage;
import pages.blocks.DriverDetailsBlock;
import pages.blocks.DriverIncidentsBlock;
import pages.blocks.OptionalToQuoteRequiredToBindBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class DriverDetailsPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote driver details page")
    public void iFillOutDriverDetailsPagePA() throws Throwable {
        new DriverDetailsPage(driver).fillDriverDetailsPagePA(data);
    }

    @And("I fill out PA endorsement driver details page")
    public void iFillOutDriverDetailsPagePA_END() throws Throwable {
        new DriverDetailsPage(driver).fillDriverDetailsPagePA_END(data);
    }

    @And("I fill out PA quote driver details block")
    public void iFillOutDriverDetailsBlockPA() throws Throwable {
        new DriverDetailsBlock(driver).fillDriverDetailsDetailsPA(data);
    }

    @And("I fill out PA quote Optional to quote required to bind block")
    public void iFillOptionalToQuoteRequiredToBindBlockPA() throws Throwable {
        new OptionalToQuoteRequiredToBindBlock(driver).fillOptionalToQuoteRequiredToBindDriverDetailsPA(data);
    }

    @And("I fill out PA quote driver incidents details block")
    public void iFillDriverIncidentsDetailsBlockPA() throws Throwable {
        new DriverIncidentsBlock(driver).fillDriverIncidentsDetailsPA(data);
    }

    @And("I fill out PA quote additional driver {int} details block")
    public void iFillOutDriverDetailsBlockPA(int index) throws Throwable {
        new DriverDetailsBlock(driver).fillAdditionalDriverDetailsPA(data, index);
    }

    @And("I fill out PA endorsement driver details block")
    public void iFillOutDriverDetailsBlockPA_END() throws Throwable {
        new DriverDetailsBlock(driver).fillDriverDetailsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement Optional to quote required to bind block")
    public void iFillOptionalToQuoteRequiredToBindBlockPA_END() throws Throwable {
        new OptionalToQuoteRequiredToBindBlock(driver).fillOptionalToQuoteRequiredToBindDriverDetailsPA_END(data);
    }

    @And("I fill out PA endorsement driver incidents details block")
    public void iFillDriverIncidentsDetailsBlockPA_END() throws Throwable {
        new DriverIncidentsBlock(driver).fillDriverIncidentsDetailsPA_END(data);
    }

    @And("I fill out PA endorsement additional driver {int} details block")
    public void iFillOutDriverDetailsBlockPA_END(int index) throws Throwable {
        new DriverDetailsBlock(driver).fillAdditionalDriverDetailsPA_END(data, index);
    }
    //PA pages and blocks steps - END

    //Driver details block steps - START
    @And("I set driver details driver SSN to {string}")
    public void iSetDriverSSN(String value) {
        new DriverDetailsBlock(driver).setDriverSSN(value);
    }

    @And("I set driver details driver marital status to {string}")
    public void iSetDriverMaritalStatus(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDriverMaritalStatus(value);
    }

    @And("I set driver details driver license status to {string}")
    public void iSetDriverLicenseStatus(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDriverLicenseStatus(value);
    }

    @And("I set driver details howl long licensed in US to {string}")
    public void iSetHowlLongLicensedInUS(String value) throws Throwable {
        new DriverDetailsBlock(driver).setHowlLongLicensedInUS(value);
    }

    @And("I set driver details highest level of education completed to {string}")
    public void iSetHighestLevelOfEducationCompleted(String value) throws Throwable {
        new DriverDetailsBlock(driver).setHighestLevelOfEducationCompleted(value);
    }

    @And("I set driver details SR22 certificate to {string}")
    public void iSetSR22Certificate(String value) throws Throwable {
        new DriverDetailsBlock(driver).setSR22Certificate(value);
    }

    @And("I set driver details does the driver Spend 3 or more months out of state to {string}")
    public void iSetDoesTheDriverSpend3OrMoreMonthsOutOfState(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDoesTheDriverSpend3OrMoreMonthsOutOfState(value);
    }

    @And("I set driver details does this driver take any autos listed on the policy to {string}")
    public void iSetDoesThisDriverTakeAnyAutosListedOnThePolicy(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDoesThisDriverTakeAnyAutosListedOnThePolicy(value);
    }

    @And("I set driver details accident prevention course to {string}")
    public void iSetAccidentPreventionCourse(String value) throws Throwable {
        new DriverDetailsBlock(driver).setAccidentPreventionCourse(value);
    }

    @And("I set driver details accident prevention course completion date to {string}")
    public void iSetAccidentPreventionCourseCompletionDate(String value) throws Throwable {
        new DriverDetailsBlock(driver).setAccidentPreventionCourseCompletionDate(value);
    }

    @And("I set driver details licensed in another state to {string}")
    public void iSetLicensedInAnotherState(String value) throws Throwable {
        new DriverDetailsBlock(driver).setLicensedInAnotherState(value);
    }

    @And("I set driver details prior driver license number to {string}")
    public void iSetPriorDriverLicenseNumber(String value) throws Throwable {
        new DriverDetailsBlock(driver).setPriorDriverLicenseNumber(value);
    }

    @And("I set driver details highway traffic safety to {string}")
    public void iSetHighwayTrafficSafety(String value) throws Throwable {
        new DriverDetailsBlock(driver).setHighwayTrafficSafety(value);
    }

    @And("I set driver details highway traffic safety completion date to {string}")
    public void iSetHighwayTrafficSafetyCompletionDate(String value) throws Throwable {
        new DriverDetailsBlock(driver).setHighwayTrafficSafetyCompletionDate(value);
    }

    @And("I set driver details is driver member of montana guard to {string}")
    public void iSetIsDriverMemberOfMontanaGuard(String value) throws Throwable {
        new DriverDetailsBlock(driver).setIsDriverMemberOfMontanaGuard(value);
    }

    @And("I set driver details is driver assigned to another vehicle to {string}")
    public void iSetIsDriverAssignedToAnotherVehicle(String value) throws Throwable {
        new DriverDetailsBlock(driver).setIsDriverAssignedToAnotherVehicle(value);
    }

    @And("I set driver details is home located in to {string}")
    public void iSetIsIsHomeLocatedIn(String value) throws Throwable {
        new DriverDetailsBlock(driver).setIsHomeLocatedIn(value);
    }

    @And("I set driver details has license been suspended to {string}")
    public void iSetHasLicenseBeenSuspended(String value) throws Throwable {
        new DriverDetailsBlock(driver).setHasLicenseBeenSuspended(value);
    }

    @And("I set driver details first year licensed to {string}")
    public void iSetFirstYearLicensed(String value) throws Throwable {
        new DriverDetailsBlock(driver).setFirstYearLicensed(value);
    }

    @And("I set driver details hasLicense elapsed to {string}")
    public void iSetHasLicenseElapsed(String value) throws Throwable {
        new DriverDetailsBlock(driver).setHasLicenseElapsed(value);
    }

    @And("I set driver details defencive driver course completed to {string}")
    public void iSetDefenciveDriverCourseCompleted(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDefenciveDriverCourseCompleted(value);
    }

    @And("I set driver details defencive driver course completed type to {string}")
    public void iSetDefenciveDriverCourseCompletedType(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDefenciveDriverCourseCompletedType(value);
    }

    @And("I set driver details defencive driver course completed date to {string}")
    public void iSetDefenciveDriverCourseCompletedDate(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDefenciveDriverCourseCompletedDate(value);
    }

    @And("I set driver details is driver military personnel to {string}")
    public void iSetIsDriverMilitaryPersonnel(String value) throws Throwable {
        new DriverDetailsBlock(driver).setIsDriverMilitaryPersonnel(value);
    }

    @And("I set driver details louisiana application for military discount submitted to {string}")
    public void iSetLouisianaApplicationForMilitaryDiscountSubmitted(String value) throws Throwable {
        new DriverDetailsBlock(driver).setLouisianaApplicationForMilitaryDiscountSubmitted(value);
    }

    @And("I set driver details driver training course completed to {string}")
    public void iSetDriverTrainingCourseCompleted(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDriverTrainingCourseCompleted(value);
    }

    @And("I set driver details driver training course completed date to {string}")
    public void iSetDriverTrainingCourseCompletedDate(String value) throws Throwable {
        new DriverDetailsBlock(driver).setDriverTrainingCourseCompletedDate(value);
    }
    //Driver details block steps - END

    //Optional to quote required to bind block steps - START
    @And("I set optional to quote required to bind drivers occupation to {string}")
    public void iSetDriversOccupation(String value) throws Throwable {
        new OptionalToQuoteRequiredToBindBlock(driver).setDriversOccupation(value);
    }
    //Optional to quote required to bind block steps - END

    //Driver Incidents Block steps - START
    @And("I set driver incidents {int} incident Source to {string}")
    public void iSetIncidentSource(int index, String value) throws Throwable {
        new DriverIncidentsBlock(driver).setIncidentSource(value, index);
    }

    @And("I set driver incidents {int} accident or violation to {string}")
    public void iSetAccidentOrViolation(int index, String value) throws Throwable {
        new DriverIncidentsBlock(driver).setAccidentOrViolation(value, index);
    }

    @And("I set driver incidents {int} incident date to {string}")
    public void iSetIncidentDate(int index, String value) throws Throwable {
        new DriverIncidentsBlock(driver).setIncidentDate(value, index);
    }
    //Driver Incidents Block steps - END

}