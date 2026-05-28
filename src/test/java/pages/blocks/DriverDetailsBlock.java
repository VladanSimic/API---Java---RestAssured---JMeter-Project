package pages.blocks;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class DriverDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public DriverDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Gender']/../../../..//input")
    WebElement gender;
    @FindBy(xpath = "//div[text()='SSN']/../../../..//input")
    WebElement ssn;
    @FindBy(xpath = "//div[text()='Marital Status']/../../../..//input")
    WebElement maritalStatus;
    @FindBy(xpath = "//div[text()='Highest Level Education Completed']/../../../..//input")
    WebElement highestLevelOfEducation;
    @FindBy(xpath = "//div[text()='Highway Traffic  Safety Program completion date']/../../../..//input")
    WebElement highwayTrafficSafetyCompletionDate;
    @FindBy(xpath = "//div[text()='Accident Prevention Training Course Completion Date?']/../../../..//input")
    WebElement accidentPreventionCourseCompletionDate;
    @FindBy(xpath = "//div[text()='License Status']/../../../..//input")
    WebElement licenseStatus;
    @FindBy(xpath = " //div[text()='The first year you were licensed in the US, Canada or Puerto Rico?']/../../../..//input")
    WebElement theFirstYearYouWereLicensedInTheUSCanadaOrPuertoRico;
    @FindBy(xpath = "//div[text()='How long have you been licensed in the US?']/../../../..//input")
    WebElement howLongLicensedInUS;
    @FindBy(xpath = "//div[contains(text(),\"SR-22\")]/../../../..//label[text()='No']/..//input")
    WebElement sr22CertNo;
    @FindBy(xpath = "//div[contains(text(),\"SR-22\")]/../../../..//label[text()='Yes']/..//input")
    WebElement sr22CertYes;
    @FindBy(xpath = "//div[contains(text(),'Vehicle with Student at School?')]/../../../..//label[text()='No']/..//input")
    WebElement vehicleWithStudentAtSchoolNo;
    @FindBy(xpath = "//div[contains(text(),'Vehicle with Student at School?')]/../../../..//label[text()='Yes']/..//input")
    WebElement vehicleWithStudentAtSchoolYes;
    @FindBy(xpath = "//div[contains(text(),\"Has the driver's license been suspended\")]/../../../..//label[text()='No']/..//input")
    WebElement licenseSuspendedNo;
    @FindBy(xpath = "//div[contains(text(),\"Has the driver's license been suspended\")]/../../../..//label[text()='Yes']/..//input")
    WebElement licenseSuspendedYes;
    @FindBy(xpath = "//div[contains(text(),\"Has the driver's license lapsed\")]/../../../..//label[text()='No']/..//input")
    WebElement licenseLapsedNo;
    @FindBy(xpath = "//div[contains(text(),\"Has the driver's license lapsed\")]/../../../..//label[text()='Yes']/..//input")
    WebElement licenseLapsedYes;
    @FindBy(xpath = "//div[contains(text(),\"driver spend 3 or more months\")]/../../../..//label[text()='Yes']/..//input")
    WebElement spend3OrMoreMonthsYes;
    @FindBy(xpath = "//div[contains(text(),\"driver spend 3 or more months\")]/../../../..//label[text()='No']/..//input")
    WebElement spend3OrMoreMonthsNo;
    @FindBy(xpath = "//div[contains(text(),\"Highway Traffic Safety\")]/../../../..//label[text()='Yes']/..//input")
    WebElement highwaySafetyYes;
    @FindBy(xpath = "//div[contains(text(),\"Highway Traffic Safety\")]/../../../..//label[text()='No']/..//input")
    WebElement highwaySafetyNo;
    @FindBy(xpath = "//div[contains(text(),'Accident Prevention Course') or contains(text(),'Accident Prevention Training')]/../../../..//label[text()='Yes']/..//input")
    WebElement accidentPreventionYes;
    @FindBy(xpath = "//div[contains(text(),\"Accident Prevention Course\") or contains(text(),\"Accident Prevention Training\")]/../../../..//label[text()='No']/..//input")
    WebElement accidentPreventionNo;
    @FindBy(xpath = "//div[contains(text(),\"Defensive Driving Course\") or contains(text(),\"Defensive Driver Course\")]/../../../..//label[text()='Yes']/..//input")
    WebElement defenciveDriverCourseYes;
    @FindBy(xpath = "//div[contains(text(),\"Defensive Driving Course\") or contains(text(),\"Defensive Driver Course\")]/../../../..//label[text()='No']/..//input")
    WebElement defenciveDriverCourseNo;
    @FindBy(xpath = "//div[text()='Defensive Driver Course Completion Date']/../../../..//input")
    WebElement defenciveDriverCourseDate;
    @FindBy(xpath = "//div[text()='Type of course completed?']/../../../..//input")
    WebElement defenciveDriverCourseType;
    @FindBy(xpath = "//div[contains(text(),\"Active military personnel?\")]/../../../..//label[text()='Yes']/..//input")
    WebElement militaryPersonnelYes;
    @FindBy(xpath = "//div[contains(text(),\"Active military personnel?\")]/../../../..//label[text()='No']/..//input")
    WebElement militaryPersonnelNo;
    @FindBy(xpath = "//div[contains(text(),\"licensed in another state\")]/../../../..//label[text()='Yes']/..//input")
    WebElement licensedInAnotherStateYes;
    @FindBy(xpath = "//div[contains(text(),\"licensed in another state\")]/../../../..//label[text()='No']/..//input")
    WebElement licensedInAnotherStateNo;
    @FindBy(xpath = "//div[contains(text(),\"assigned to another vehicle\")]/../../../..//label[text()='Yes']/..//input")
    WebElement assignedToAnotherVehicleYes;
    @FindBy(xpath = "//div[contains(text(),\"assigned to another vehicle\")]/../../../..//label[text()='No']/..//input")
    WebElement assignedToAnotherVehicleNo;
    @FindBy(xpath = "//div[contains(text(),\"Is the member's primary home located in\")]/../../../..//label[text()='Yes']/..//input")
    WebElement isHomeInYes;
    @FindBy(xpath = "//div[contains(text(),\"Is the member's primary home located in\")]/../../../..//label[text()='No']/..//input")
    WebElement isHomeInNo;
    @FindBy(xpath = "//div[contains(text(),\"Is the driver a member of the Montana National Guard?\")]/../../../..//label[text()='Yes']/..//input")
    WebElement memberOfMontanaGuardYes;
    @FindBy(xpath = "//div[contains(text(),\"Is the driver a member of the Montana National Guard?\")]/../../../..//label[text()='No']/..//input")
    WebElement memberOfMontanaGuardNo;
    @FindBy(xpath = "//div[text()=\"Driver's License State\"]/../../../..//input")
    WebElement driverLicenseState;
    @FindBy(xpath = "//div[text()=\"Driver's License Number\"]/../../../..//input")
    WebElement driverLicenseNumber;
    @FindBy(xpath = "//div[text()=\"Driver's Occupation\"]/../../../..//input")
    List<WebElement> driverOccupation;
    @FindBy(xpath = "//div[text()=\"Occupation\"]/../../../..//input")
    WebElement occupation;
    @FindBy(xpath = "//div[text()=\"Prior Licensed State\"]/../../../..//input")
    WebElement priorLicensedState;
    @FindBy(xpath = "//div[text()=\"Prior Driver License Number\"]/../../../..//input")
    WebElement priorLicenseDriverNumber;
    @FindBy(xpath = "//div[text()=\"Relationship to Insured\"]/../../../..//input")
    WebElement relationshipToInsured;
    @FindBy(xpath = "//div[contains(text(),\"Training Course\")]/../../../..//label[text()='Yes']/..//input")
    WebElement driverTrainingCourseCompletedYes;
    @FindBy(xpath = "//div[contains(text(),\"Training Course\")]/../../../..//label[text()='No']/..//input")
    WebElement driverTrainingCourseCompletedNo;
    @FindBy(xpath = "//div[contains(text(),\"Louisiana Application for Military Discount submitted\")]/../../../..//label[text()='Yes']/..//input")
    WebElement militaryDiscountYes;
    @FindBy(xpath = "//div[contains(text(),\"Louisiana Application for Military Discount submitted\")]/../../../..//label[text()='No']/..//input")
    WebElement militaryDiscountNo;
    @FindBy(xpath = "//div[text()=\"Driver Training Course Completion Date\"]/../../../..//input")
    WebElement driverTrainingCourseCompletedDate;
    @FindBy(xpath = "//div[contains(text(),\"Full-Time Student?\")]/../../../..//label[text()='Yes']/..//input")
    WebElement fullTimeStudentYes;
    @FindBy(xpath = "//div[contains(text(),\"Mature Driver Training Course completed?\")]/../../../..//label[text()='Yes']/..//input")
    WebElement matureDriverTrainingCourseYes;
    @FindBy(xpath = "//div[contains(text(),\"Mature Driver Training Course completed?\")]/../../../..//label[text()='No']/..//input")
    WebElement matureDriverTrainingCourseNo;
    @FindBy(xpath = "//div[contains(text(),\"Mature Operator Motor Vehicle Accident Prevention Course completed?\")]/../../../..//label[text()='Yes']/..//input")
    WebElement matureOperatorTrainingCourseYes;
    @FindBy(xpath = "//div[contains(text(),\"Mature Operator Motor Vehicle Accident Prevention Course completed?\")]/../../../..//label[text()='No']/..//input")
    WebElement matureOperatorTrainingCourseNo;
    @FindBy(xpath = "//div[contains(text(),\"Mature Driver Training Course Completion Date\")]/../../../..//..//input")
    WebElement matureDriverTrainingCourseDate;
    @FindBy(xpath = "//div[contains(text(),\"Mature Operator Motor Vehicle Accident Prevention Course completed?\")]/../../../..//..//input")
    WebElement matureOperatorTrainingCourseDate;
    @FindBy(xpath = "//div[contains(text(),\"Full-Time Student?\")]/../../../..//label[text()='No']/..//input")
    WebElement fullTimeStudentNo;
    @FindBy(xpath = "//div[contains(text(),\"current grade average\")]/../../../..//label[text()='Yes']/..//input")
    WebElement currentGradeAverageBYes;
    @FindBy(xpath = "//div[contains(text(),\"current grade average\")]/../../../..//label[text()='No']/..//input")
    WebElement currentGradeAverageBNo;
    @FindBy(xpath = "//div[contains(text(),'The first year you were licensed')]/../../../..//input")
    WebElement firstYearLicensed;
    @FindBy(xpath = "//div[contains(text(),\"Mobile Device Control\")]/../../../..//label[text()='No']/..//input")
    WebElement mobileDeviceControlNo;
    @FindBy(xpath = "//div[contains(text(),\"Mobile Device Control\")]/../../../..//label[text()='Yes']/..//input")
    WebElement mobileDeviceControlYes;
    @FindBy(xpath = "//div[contains(text(),\"Does this driver take any autos listed on the policy with him/ her?\")]/../../../..//label[text()='No']/..//input")
    WebElement takeAutosNo;
    @FindBy(xpath = "//div[contains(text(),\"Does this driver take any autos listed on the policy with him/ her?\")]/../../../..//label[text()='Yes']/..//input")
    WebElement takeAutosYes;

    public void fillDriverDetailsDetailsPA(Map<String, String> data) throws Throwable {
        pause(2000);
        verifyBlockExists("driver details");
        setDriverSSN(data.get("Driver_Details_SSN"));
        pause(2000);
        setDriverMaritalStatus(data.get("Driver_Details_Marital_Status"));
        setDriverLicenseStatus(data.get("Driver_Details_License_Status"));

        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_How_Long_Have_You_Been_Licensed_In_The_US"));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Highest_Level_Education_Completed"));

        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_SR_22_Certificate_Of_Insurance_Required"));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year"));
            if (hasValue(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year")) && data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year").equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her"));
            }
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("WI")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed"));
            if (hasValue(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed")) && data.get("Driver_Details_Accident_Prevention_Training_Course_Completed").equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Accident_Prevention_Training_Course_Completion_Date"));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years"));
        if (data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years").equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Prior_Licensed_State"));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Prior_Driver_License_Number"));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years"));
            if (hasValue(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years")) && data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years").equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Highway_Traffic_Safety_Program_Completion_Date"));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Is_The_Driver_A_Member_Of_The_Montana_National_Guard"));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State"));
            if (hasValue(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State")) && data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State").equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In"));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In"));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Has_License_Been_Suspended"));
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US"));
            setHasLicenseElapsed(data.get("Driver_Details_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years"));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US"));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Defensive_Driver_Course_Completed"));
            if (hasValue(data.get("Driver_Details_Defensive_Driver_Course_Completed")) && data.get("Driver_Details_Defensive_Driver_Course_Completed").equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Defensive_Driver_Course_Completed_Type"));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Defensive_Driver_Course_Completed_Date"));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Active_Military_Personnel"));
            if (hasValue(data.get("Driver_Details_Active_Military_Personnel")) && data.get("Driver_Details_Active_Military_Personnel").equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Louisiana_Application_For_Military_Discount_Submitted"));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA") || data.get("State").equalsIgnoreCase("NE")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years"));
            if (hasValue(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years")) && data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years").equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Driver_Training_Course_Completion_Date"));
            }
        }

        setFullTimeStudent("Driver_Details_Full_Time_Student");

        setMatureDriverTrainingCourseCompleted("Driver_Details_Mature_Driver_Training", "Driver_Details_Mature_Driver_Training_Date");
        setMatureOperatorTrainingCourseCompleted("Driver_Details_Mature_Driver_Training", "Driver_Details_Mature_Driver_Training_Date");

        saveChanges();
    }

    public void fillDriverDetailsDetailsPA_END(Map<String, String> data) throws Throwable {
        pause(2000);

        setDriverSSN(data.get("Driver_Details_SSN_END"));
        setDriverMaritalStatus(data.get("Driver_Details_Marital_Status_END"));
        setDriverLicenseStatus(data.get("Driver_Details_License_Status_END"));
        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_How_Long_Have_You_Been_Licensed_In_The_US_END"));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Highest_Level_Education_Completed_END"));

        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_SR_22_Certificate_Of_Insurance_Required_END"));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_END"));
            if (hasValue(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_END")) && data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_END").equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_END"));
            if (hasValue(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_END")) && data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_END").equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Accident_Prevention_Training_Course_Completion_Date_END"));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_END"));
        if (hasValue(data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_END")) && data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_END").equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Prior_Licensed_State_END"));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Prior_Driver_License_Number_END"));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_END"));
            if (hasValue(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_END")) && data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_END").equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Highway_Traffic_Safety_Program_Completion_Date_END"));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Is_The_Driver_A_Member_Of_The_Montana_National_Guard_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_END"));
            if (hasValue(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_END")) && data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_END").equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In_END"));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Has_License_Been_Suspended_END"));
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US_END"));
            setHasLicenseElapsed(data.get("Driver_Details_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_END"));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US_END"));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Defensive_Driver_Course_Completed_END"));
            if (hasValue(data.get("Driver_Details_Defensive_Driver_Course_Completed_END")) && data.get("Driver_Details_Defensive_Driver_Course_Completed_END").equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Defensive_Driver_Course_Completed_Type_END"));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Defensive_Driver_Course_Completed_Date_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Active_Military_Personnel_END"));
            if (hasValue(data.get("Driver_Details_Active_Military_Personnel_END")) && data.get("Driver_Details_Active_Military_Personnel_END").equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Louisiana_Application_For_Military_Discount_Submitted_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_END"));
            if (hasValue(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_END")) && data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_END").equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Driver_Training_Course_Completion_Date_END"));
            }
        }
    }

    public void fillDriverDetailsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        pause(2000);

        setDriverSSN(data.get("Driver_Details_SSN_OOS_END"));
        setDriverMaritalStatus(data.get("Driver_Details_Marital_Status_OOS_END"));
        setDriverLicenseStatus(data.get("Driver_Details_License_Status_OOS_END"));
        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_How_Long_Have_You_Been_Licensed_In_The_US_OOS_END"));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Highest_Level_Education_Completed_OOS_END"));

        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_SR_22_Certificate_Of_Insurance_Required_OOS_END"));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_OOS_END"));
            if (hasValue(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_OOS_END")) && data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_OOS_END").equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her_OOS_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_OOS_END"));
            if (hasValue(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_OOS_END")) && data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_OOS_END").equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Accident_Prevention_Training_Course_Completion_Date_OOS_END"));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_OOS_END"));
        if (hasValue(data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_OOS_END")) && data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_OOS_END").equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Prior_Licensed_State_OOS_END"));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Prior_Driver_License_Number_OOS_END"));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_OOS_END"));
            if (hasValue(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_OOS_END")) && data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_OOS_END").equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Highway_Traffic_Safety_Program_Completion_Date_OOS_END"));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Is_The_Driver_A_Member_Of_The_Montana_National_Guard_OOS_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_OOS_END"));
            if (hasValue(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_OOS_END")) && data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_OOS_END").equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In_OOS_END"));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In_OOS_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Has_License_Been_Suspended_OOS_END"));
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US_OOS_END"));
            setHasLicenseElapsed(data.get("Driver_Details_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_OOS_END"));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US_OOS_END"));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Defensive_Driver_Course_Completed_OOS_END"));
            if (hasValue(data.get("Driver_Details_Defensive_Driver_Course_Completed_OOS_END")) && data.get("Driver_Details_Defensive_Driver_Course_Completed_OOS_END").equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Defensive_Driver_Course_Completed_Type_OOS_END"));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Defensive_Driver_Course_Completed_Date_OOS_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Active_Military_Personnel_OOS_END"));
            if (hasValue(data.get("Driver_Details_Active_Military_Personnel_END")) && data.get("Driver_Details_Active_Military_Personnel_END").equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Louisiana_Application_For_Military_Discount_Submitted_OOS_END"));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_OOS_END"));
            if (hasValue(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_OOS_END")) && data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_OOS_END").equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Driver_Training_Course_Completion_Date_OOS_END"));
            }
        }
    }

    public void fillDriverDetailsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        pause(2000);

        setDriverSSN(data.get("Driver_Details_SSN_RNW"));
        setDriverMaritalStatus(data.get("Driver_Details_Marital_Status_RNW"));
        setDriverLicenseStatus(data.get("Driver_Details_License_Status_RNW"));
        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_How_Long_Have_You_Been_Licensed_In_The_US_RNW"));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Highest_Level_Education_Completed_RNW"));

        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_SR_22_Certificate_Of_Insurance_Required_RNW"));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_RNW"));
            if (hasValue(data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_RNW")) && data.get("Driver_Details_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_RNW").equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her_RNW"));
            }
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_RNW"));
            if (hasValue(data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_RNW")) && data.get("Driver_Details_Accident_Prevention_Training_Course_Completed_RNW").equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Accident_Prevention_Training_Course_Completion_Date_RNW"));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_RNW"));
        if (hasValue(data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_RNW")) && data.get("Driver_Details_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_RNW").equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Prior_Licensed_State_RNW"));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Prior_Driver_License_Number_RNW"));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_v"));
            if (hasValue(data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_RNW")) && data.get("Driver_Details_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_Last_3_Years_RNW").equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Highway_Traffic_Safety_Program_Completion_Date_RNW"));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Is_The_Driver_A_Member_Of_The_Montana_National_Guard_RNW"));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_RNW"));
            if (hasValue(data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_RNW")) && data.get("Driver_Details_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_RNW").equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In_RNW"));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Is_The_Members_Primary_Home_Located_In_RNW"));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Has_License_Been_Suspended_RNW"));
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US_RNW"));
            setHasLicenseElapsed(data.get("Driver_Details_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_RNW"));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_The_First_Year_You_Were_Licensed_In_The_US_RNW"));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Defensive_Driver_Course_Completed_RNW"));
            if (hasValue(data.get("Driver_Details_Defensive_Driver_Course_Completed_END")) && data.get("Driver_Details_Defensive_Driver_Course_Completed_END").equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Defensive_Driver_Course_Completed_Type_RNW"));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Defensive_Driver_Course_Completed_Date_RNW"));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Active_Military_Personnel_RNW"));
            if (hasValue(data.get("Driver_Details_Active_Military_Personnel_RNW")) && data.get("Driver_Details_Active_Military_Personnel_RNW").equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Louisiana_Application_For_Military_Discount_Submitted_RNW"));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_RNW"));
            if (hasValue(data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_RNW")) && data.get("Driver_Details_Driver_Training_Course_Completed_In_Last_5_Years_RNW").equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Driver_Training_Course_Completion_Date_RNW"));
            }
        }
    }

    public void fillAdditionalDriverDetailsPA(Map<String, String> data, int index) throws Throwable {
        pause(2000);

        setDriverSSN(data.get("Driver_Details_Additional_Driver_SSN_" + index));
        setDriverMaritalStatus(data.get("Driver_Details_Additional_Driver_Marital_Status_" + index));
        setDriverLicenseStatus(data.get("Driver_Details_Additional_Driver_License_Status_" + index));
        setFirstYearYouWereLicensedInTheUSCanadaOrPuertoRico(data.get("Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_" + index));
        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_Additional_Driver_How_Long_Have_You_Been_Licensed_In_The_US_" + index));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Additional_Driver_Highest_Level_Education_Completed_" + index));
        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_Additional_Driver_SR_22_Certificate_Of_Insurance_Required_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_" + index)) && data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_" + index).equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her_" + index));
            }
        }
        setFullTimeStudent("Driver_Details_Full_Time_Student");
        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("WI")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_" + index)) && data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_" + index).equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completion_Date_" + index));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_" + index));
        if (hasValue(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_" + index)) && data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_" + index).equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Additional_Driver_Prior_Licensed_State_" + index));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Additional_Driver_Prior_Driver_License_Number_" + index));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_" + index)) && data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_" + index).equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Additional_Driver_Highway_Traffic_Safety_Program_Completion_Date_" + index));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Additional_Driver_Is_The_Driver_A_Member_Of_The_Montana_National_Guard_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_" + index)) && data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_" + index).equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_" + index));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Additional_Driver_Has_License_Been_Suspended_" + index));
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_" + index));
            setHasLicenseElapsed(data.get("Driver_Details_Additional_Driver_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_" + index));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_" + index)) && data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_" + index).equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Type_" + index));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Date_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_" + index)) && data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_" + index).equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Additional_Driver_Louisiana_Application_For_Military_Discount_Submitted_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA")|| data.get("State").equalsIgnoreCase("NE")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_" + index)) && data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_" + index).equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Training_Course_Completion_Date_" + index));
            }
        }
    }

    public void fillAdditionalDriverDetailsPA_END(Map<String, String> data, int index) throws Throwable {
        pause(2000);

        setDriverSSN(data.get("Driver_Details_Additional_Driver_SSN_END_" + index));
        setDriverMaritalStatus(data.get("Driver_Details_Additional_Driver_Marital_Status_END_" + index));
        setDriverLicenseStatus(data.get("Driver_Details_Additional_Driver_License_Status_END_" + index));
        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_Additional_Driver_How_Long_Have_You_Been_Licensed_In_The_US_END_" + index));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Additional_Driver_Highest_Level_Education_Completed_END_" + index));

        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_Additional_Driver_SR_22_Certificate_Of_Insurance_Required_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_END_" + index)) && data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_END_" + index).equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_END_" + index)) && data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_END_" + index).equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completion_Date_END_" + index));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_END_" + index));
        if (hasValue(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_END_" + index)) && data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_END_" + index).equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Additional_Driver_Prior_Licensed_State_END_" + index));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Additional_Driver_Prior_Driver_License_Number_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_END_" + index)) && data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_END_" + index).equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Additional_Driver_Highway_Traffic_Safety_Program_Completion_Date_END_" + index));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Additional_Driver_Is_The_Driver_A_Member_Of_The_Montana_National_Guard_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_END_" + index)) && data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_END_" + index).equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_END_" + index));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Additional_Driver_Has_License_Been_Suspended_END_" + index));
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_END_" + index));
            setHasLicenseElapsed(data.get("Driver_Details_Additional_Driver_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_END_" + index)) && data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_END_" + index).equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Type_END_" + index));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Date_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_END_" + index)) && data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_END_" + index).equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Additional_Driver_Louisiana_Application_For_Military_Discount_Submitted_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_END_" + index)) && data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_END_" + index).equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Training_Course_Completion_Date_END_" + index));
            }
        }
    }

    public void fillAdditionalDriverDetailsPA_OOS_END(Map<String, String> data, int index) throws Throwable {
        pause(2000);

        setDriverSSN(data.get("Driver_Details_Additional_Driver_SSN_OOS_END_" + index));
        setDriverMaritalStatus(data.get("Driver_Details_Additional_Driver_Marital_Status_OOS_END_" + index));
        setDriverLicenseStatus(data.get("Driver_Details_Additional_Driver_License_Status_OOS_END_" + index));
        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_Additional_Driver_How_Long_Have_You_Been_Licensed_In_The_US_OOS_END_" + index));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Additional_Driver_Highest_Level_Education_Completed_OOS_END_" + index));

        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_Additional_Driver_SR_22_Certificate_Of_Insurance_Required_OOS_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_OOS_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_OOS_END_" + index).equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her_OOS_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_OOS_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_OOS_END_" + index).equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completion_Date_OOS_END_" + index));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_OOS_END_" + index));
        if (hasValue(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_OOS_END_" + index).equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Additional_Driver_Prior_Licensed_State_OOS_END_" + index));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Additional_Driver_Prior_Driver_License_Number_OOS_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_OOS_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_OOS_END_" + index).equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Additional_Driver_Highway_Traffic_Safety_Program_Completion_Date_OOS_END_" + index));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Additional_Driver_Is_The_Driver_A_Member_Of_The_Montana_National_Guard_OOS_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_OOS_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_OOS_END_" + index).equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_OOS_END_" + index));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_OOS_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Additional_Driver_Has_License_Been_Suspended_OOS_END_" + index));
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_OOS_END_" + index));
            setHasLicenseElapsed(data.get("Driver_Details_Additional_Driver_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_OOS_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_OOS_END_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_OOS_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_OOS_END_" + index).equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Type_OOS_END_" + index));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Date_OOS_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_OOS_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_OOS_END_" + index).equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Additional_Driver_Louisiana_Application_For_Military_Discount_Submitted_OOS_END_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_OOS_END_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_OOS_END_" + index)) && data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_OOS_END_" + index).equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Training_Course_Completion_Date_OOS_END_" + index));
            }
        }
    }

    public void fillAdditionalDriverDetailsPA_RNW(Map<String, String> data, int index) throws Throwable {
        pause(2000);

        setDriverSSN(data.get("Driver_Details_Additional_Driver_SSN_RNW_" + index));
        setDriverMaritalStatus(data.get("Driver_Details_Additional_Driver_Marital_Status_RNW_" + index));
        setDriverLicenseStatus(data.get("Driver_Details_Additional_Driver_License_Status_RNW_" + index));
        if (!data.get("State").equalsIgnoreCase("CA") &&
                !data.get("State").equalsIgnoreCase("MA") &&
                !data.get("State").equalsIgnoreCase("NC")) {
            setHowlLongLicensedInUS(data.get("Driver_Details_Additional_Driver_How_Long_Have_You_Been_Licensed_In_The_US_RNW_" + index));
        }
        setHighestLevelOfEducationCompleted(data.get("Driver_Details_Additional_Driver_Highest_Level_Education_Completed_RNW_" + index));

        if (data.get("State").equalsIgnoreCase("AK") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("FL") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("AR")) {
            setSR22Certificate(data.get("Driver_Details_Additional_Driver_SR_22_Certificate_Of_Insurance_Required_RNW_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DC") ||
                data.get("State").equalsIgnoreCase("IN") ||
                data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("CT") ||
                data.get("State").equalsIgnoreCase("SD") ||
                data.get("State").equalsIgnoreCase("MO") ||
                data.get("State").equalsIgnoreCase("WI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("PA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("SC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MT") ||
                data.get("State").equalsIgnoreCase("KY") ||
                data.get("State").equalsIgnoreCase("OK") ||
                data.get("State").equalsIgnoreCase("ND")) {
            setDoesTheDriverSpend3OrMoreMonthsOutOfState(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_RNW_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Does_This_Driver_Spend_3_Or_More_Months_Out_Of_State_Each_Year_RNW_" + index).equalsIgnoreCase("Yes")) {
                setDoesThisDriverTakeAnyAutosListedOnThePolicy(data.get("Driver_Details_Additional_Driver_Does_This_Driver_Take_Any_Autos_Listed_On_The_Policy_With_Him_Her_RNW_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("MD") ||
                data.get("State").equalsIgnoreCase("TX") ||
                data.get("State").equalsIgnoreCase("OK")) {
            setAccidentPreventionCourse(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_RNW_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completed_RNW_" + index).equalsIgnoreCase("Yes")) {
                setAccidentPreventionCourseCompletionDate(data.get("Driver_Details_Additional_Driver_Accident_Prevention_Training_Course_Completion_Date_RNW_" + index));
            }
        }

        setLicensedInAnotherState(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_RNW_" + index));
        if (hasValue(data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Have_You_Been_Licensed_In_Another_State_In_The_Past_2_years_RNW_" + index).equalsIgnoreCase("Yes")) {
            setPriorLicensedState(data.get("Driver_Details_Additional_Driver_Prior_Licensed_State_RNW_" + index));
            setPriorDriverLicenseNumber(data.get("Driver_Details_Additional_Driver_Prior_Driver_License_Number_RNW_" + index));
        }

        if (data.get("State").equalsIgnoreCase("MT")) {
            setHighwayTrafficSafety(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_RNW_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Has_The_Driver_Completed_A_Highway_Traffic_Safety_Program_Within_The_last_3_Years_RNW_" + index).equalsIgnoreCase("Yes")) {
                setHighwayTrafficSafetyCompletionDate(data.get("Driver_Details_Additional_Driver_Highway_Traffic_Safety_Program_Completion_Date_RNW_" + index));
                setIsDriverMemberOfMontanaGuard(data.get("Driver_Details_Additional_Driver_Is_The_Driver_A_Member_Of_The_Montana_National_Guard_RNW_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("ND") ||
                data.get("State").equalsIgnoreCase("TN") ||
                data.get("State").equalsIgnoreCase("VA") ||
                data.get("State").equalsIgnoreCase("NH") ||
                data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("HI") ||
                data.get("State").equalsIgnoreCase("RI") ||
                data.get("State").equalsIgnoreCase("MA") ||
                data.get("State").equalsIgnoreCase("ME") ||
                data.get("State").equalsIgnoreCase("KY")) {
            setIsDriverAssignedToAnotherVehicle(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_RNW_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_RNW_" + index).equalsIgnoreCase("Yes")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_RNW_" + index));
            }
            if (data.get("State").equalsIgnoreCase("RI")) {
                setIsHomeLocatedIn(data.get("Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_RNW_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("CA")) {
            setHasLicenseBeenSuspended(data.get("Driver_Details_Additional_Driver_Has_License_Been_Suspended_RNW_" + index));
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_RNW_" + index));
            setHasLicenseElapsed(data.get("Driver_Details_Additional_Driver_Has_The_Drivers_License_Lapsed_Within_The_Previous_3_Years_RNW_" + index));
        }

        if (data.get("State").equalsIgnoreCase("NC") ||
                data.get("State").equalsIgnoreCase("MA")) {
            setFirstYearLicensed(data.get("Driver_Details_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_RNW_" + index));
        }

        if (data.get("State").equalsIgnoreCase("DE") ||
                data.get("State").equalsIgnoreCase("NJ") ||
                data.get("State").equalsIgnoreCase("LA")) {
            setDefenciveDriverCourseCompleted(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_RNW_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_RNW_" + index).equalsIgnoreCase("Yes")) {
                if (data.get("State").equalsIgnoreCase("DE")) {
                    setDefenciveDriverCourseCompletedType(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Type_RNW_" + index));
                }
                setDefenciveDriverCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Defensive_Driver_Course_Completed_Date_RNW_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("LA")) {
            setIsDriverMilitaryPersonnel(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_RNW_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Active_Military_Personnel_RNW_" + index).equalsIgnoreCase("Yes")) {
                setLouisianaApplicationForMilitaryDiscountSubmitted(data.get("Driver_Details_Additional_Driver_Louisiana_Application_For_Military_Discount_Submitted_RNW_" + index));
            }
        }

        if (data.get("State").equalsIgnoreCase("MA")) {
            setDriverTrainingCourseCompleted(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_RNW_" + index));
            if (hasValue(data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_RNW_" + index)) && data.get("Driver_Details_Additional_Driver_Training_Course_Completed_In_Last_5_Years_RNW_" + index).equalsIgnoreCase("Yes")) {
                setDriverTrainingCourseCompletedDate(data.get("Driver_Details_Additional_Driver_Training_Course_Completion_Date_RNW_" + index));
            }
        }
    }

    public void setLouisianaApplicationForMilitaryDiscountSubmitted(String value) throws Throwable {
        choose(militaryDiscountYes, militaryDiscountNo, value);
    }

    public void setAccidentPreventionCourseCompletionDate(String value) {
        typeText(accidentPreventionCourseCompletionDate, value, "Accident Prevention Course Completion Date");
    }

    public void setIsDriverMemberOfMontanaGuard(String value) throws Throwable {
        choose(memberOfMontanaGuardYes, memberOfMontanaGuardNo, value, "Member Of Montana Guard");
    }

    public void setHighwayTrafficSafetyCompletionDate(String value) {
        typeText(highwayTrafficSafetyCompletionDate, value, "Highway Traffic Safety Completion Date");
    }

    public void setIsHomeLocatedIn(String value) throws Throwable {
        choose(isHomeInYes, isHomeInNo, value, "Is Home Located In ND");
    }

    public void setDoesThisDriverTakeAnyAutosListedOnThePolicy(String value) throws Throwable {
        choose(takeAutosYes, takeAutosNo, value, "Does This Driver Take Any Autos Listed On The Policy");
    }

    public void setHighestLevelOfEducationCompleted(String value) {
        typeTextEnter(highestLevelOfEducation, value, "Highest Level Of Education");
    }

    public void setDriverSSN(String value) {
        typeText(ssn, value, "SSN");
    }

    public void setHasLicenseBeenSuspended(String has_license_been_suspended) throws Throwable {
        choose(licenseSuspendedYes, licenseSuspendedNo, has_license_been_suspended);
    }

    public void setHasLicenseElapsed(String licenseElapsed) throws Throwable {
        choose(licenseLapsedYes, licenseLapsedNo, licenseElapsed);
    }

    public void setFirstYearLicensed(String first_year_licensed) throws Throwable {
        pause(1000);
        typeText(firstYearLicensed, first_year_licensed);
    }

    public void setDriversOccupation(String value) throws Throwable {
        if (elementExists(driverOccupation)) {
            typeText(driverOccupation.get(0), value);
        } else {
            typeText(occupation, value);
        }
    }

    public void setDriversLicenseNumber(String value) throws Throwable {
        typeText(driverLicenseNumber, value);
    }

    public void setDriversLicensedState(String value) throws Throwable {
        typeText(driverLicenseState, value);
    }

    public void setDriverRelationshipToInsured(String value) throws Throwable {
        typeText(relationshipToInsured, value);
    }

    public void setPriorDriverLicenseNumber(String value) throws Throwable {
        typeText(priorLicenseDriverNumber, value);
    }

    public void setPriorLicensedState(String value) throws Throwable {
        typeText(priorLicensedState, value);
    }

    public void setLicensedInAnotherState(String value) throws Throwable {
        choose(licensedInAnotherStateYes, licensedInAnotherStateNo, value);
    }

    public void setIsDriverAssignedToAnotherVehicle(String value) throws Throwable {
        choose(assignedToAnotherVehicleYes, assignedToAnotherVehicleNo, value);
    }

    public void setSR22Certificate(String value) throws Throwable {
        if (driver.findElements(By.xpath("//div[contains(text(),\"SR-22\")]/../../../..//label[text()='Yes']/..//input")).size() > 0)
            choose(sr22CertYes, sr22CertNo, value);
    }

    public void setDoesTheDriverSpend3OrMoreMonthsOutOfState(String value) throws Throwable {
        choose(spend3OrMoreMonthsYes, spend3OrMoreMonthsNo, value);
    }

    public void setHighwayTrafficSafety(String value) throws Throwable {
        choose(highwaySafetyYes, highwaySafetyNo, value);
    }

    public void setAccidentPreventionCourse(String value) throws Throwable {
        choose(accidentPreventionYes, accidentPreventionNo, value);
    }

    public void setDefenciveDriverCourseCompleted(String value) throws Throwable {
        choose(defenciveDriverCourseYes, defenciveDriverCourseNo, value);
    }

    public void setDefenciveDriverCourseCompletedDate(String value) {
        typeTextEnter(defenciveDriverCourseDate, value, "Defencive Driver Course Completed Date");
    }

    public void setDefenciveDriverCourseCompletedType(String value) throws Throwable {
        typeText(defenciveDriverCourseType, value);
    }

    public void setIsDriverMilitaryPersonnel(String value) throws Throwable {
        choose(militaryPersonnelYes, militaryPersonnelNo, value);
    }

    public void setHowlLongLicensedInUS(String value) throws Throwable {
        saveChanges();
        typeText(howLongLicensedInUS, value);
    }

    public void setDriverLicenseStatus(String value) throws Throwable {
        typeText(licenseStatus, value);
    }

    public void setAdditionalDriverVehicleWithStudentAtSchool(String value) throws Throwable {
        choose(vehicleWithStudentAtSchoolYes, vehicleWithStudentAtSchoolNo, value);
    }

    public void setDriverMaritalStatus(String value) throws Throwable {
        typeText(maritalStatus, value);
    }

    public void setDriverGender(String value) throws Throwable {
        typeText(gender, value);
    }

    public void setDriverTrainingCourseCompleted(String value) throws Throwable {
        choose(driverTrainingCourseCompletedYes, driverTrainingCourseCompletedNo, value);
    }

    public void setDriverTrainingCourseCompletedDate(String value) throws Throwable {
        typeText(driverTrainingCourseCompletedDate, value);
    }

    public void setFullTimeStudent(String value) throws Throwable {
        if (isElementDisplayed(fullTimeStudentYes))
            choose(fullTimeStudentYes, fullTimeStudentNo, value);
    }

    public void setCurrentGradeAverage(String value) throws Throwable {
        choose(currentGradeAverageBYes, currentGradeAverageBNo, value);
    }

    public void setMobileDeviceControl(String value) throws Throwable {
        if (hasValue(value))
            choose(mobileDeviceControlYes, mobileDeviceControlNo, value);
    }

    public Boolean validateRMV(Map<String, String> data) throws Throwable {
        pause(3000);
        if (hasValue(data.get("MI"))) {
            clickElement(driver.findElement(By.xpath("//a[contains(text(),'" + data.get("First_Name") + "') and contains(text(),'" + data.get("MI") + "') and contains(text(),'" + data.get("Last_Name") + "')]")));
        } else {
            clickElement(driver.findElement(By.xpath("//a[contains(text(),'" + data.get("First_Name") + "') and contains(text(),'" + data.get("Last_Name") + "')]")));
        }
        pause(2000);
        reportScreenshot("RMV MA Auto" + System.currentTimeMillis(), "RMV Integration");
        return driver.findElements(By.xpath("//div[text()='(optional to quote, required to bind)']/../../../../../following-sibling::div//tr/td//label//div[contains(text(),'Report Failed :')]")).size() == 0
                && driver.findElements(By.xpath("//div[text()='driver details']/../../../../../../../../../following-sibling::tr[2]//label//div[contains(text(),'Report Failed :')]")).size() == 0;
    }

    public void verifyRMVWithRerate(Map<String, String> data) throws Throwable {
        if (!validateRMV(data)) {
            rateQuote();
            pause(10000);
            navigateToQuoteDetailsPage();
            pause(2000);
            Allure.addAttachment("RMV Check failed first time", "Re-rating the quote and checking integration again");
            if (!validateRMV(data)) {
                Assert.fail("MA RMV Integration Failed");
            }
        }
    }

    public void setMatureDriverTrainingCourseCompleted(String value, String date) throws Throwable {
        if (isElementDisplayed(matureDriverTrainingCourseYes)) {
            choose(matureDriverTrainingCourseYes, matureDriverTrainingCourseNo, value);
            if (value.equalsIgnoreCase("Yes"))
                typeTextEnter(matureDriverTrainingCourseDate, date, "Mature Driver Training Course Date");
        }
    }

    public void setMatureOperatorTrainingCourseCompleted(String value, String date) throws Throwable {
        if (isElementDisplayed(matureOperatorTrainingCourseYes)) {
            choose(matureOperatorTrainingCourseYes, matureOperatorTrainingCourseNo, value);
            if (value.equalsIgnoreCase("Yes"))
                typeTextEnter(matureOperatorTrainingCourseDate, date, "Mature Driver Training Course Date");
        }
    }

    public void setFirstYearYouWereLicensedInTheUSCanadaOrPuertoRico(String value) throws Throwable {
        pause(1000);
        if (isElementDisplayed(theFirstYearYouWereLicensedInTheUSCanadaOrPuertoRico)) {
            typeText(theFirstYearYouWereLicensedInTheUSCanadaOrPuertoRico, value);
        }
    }

}