package pages.blocks;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class VehicleDetailsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public VehicleDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Custom or Additional Equipment to be insured')]/../../../..//label[text()='No']/..//input")
    WebElement customOrAdditionalEquipmentToBeInsuredNo;
    @FindBy(xpath = "//div[contains(text(),'Custom or Additional Equipment to be insured')]/../../../..//label[text()='Yes']/..//input")
    WebElement customOrAdditionalEquipmentToBeInsuredYes;
    @FindBy(xpath = "//div[contains(text(),'kept in a garage')]/../../../..//label[text()='No']/..//input")
    WebElement keptInAGarageWithSecurityNo;
    @FindBy(xpath = "//div[contains(text(),'kept in a garage')]/../../../..//label[text()='Yes']/..//input")
    WebElement keptInAGarageWithSecurityYes;
    @FindBy(xpath = "//div[contains(text(),'snowbird use vehicle')]/../../../..//label[text()='No']/..//input")
    WebElement snowbirdVehicleNo;
    @FindBy(xpath = "//div[contains(text(),'snowbird use vehicle')]/../../../..//label[text()='Yes']/..//input")
    WebElement snowbirdVehicleYes;
    @FindBy(xpath = "//div[contains(text(),'vehicle registered in')]/../../../..//label[text()='No']/..//input")
    WebElement vehicleRegisteredInStateNo;
    @FindBy(xpath = "//div[contains(text(),'vehicle registered in')]/../../../..//label[text()='Yes']/..//input")
    WebElement vehicleRegisteredInStateYes;
    @FindBy(xpath = "//div[contains(text(),'Was the vehicle purchased new (no previous titled owner)')]/../../../..//label[text()='No']/..//input")
    WebElement vehiclePurchasedNewNo;
    @FindBy(xpath = "//div[contains(text(),'Was the vehicle purchased new (no previous titled owner)')]/../../../..//label[text()='Yes']/..//input")
    WebElement vehiclePurchasedNewYes;
    @FindBy(xpath = "//div[contains(text(),'Auxiliary Lighting Discount?')]/../../../..//label[text()='Yes']/..//input")
    WebElement auxiliaryLightingDiscountYes;
    @FindBy(xpath = "//div[contains(text(),'Auxiliary Lighting Discount?')]/../../../..//label[text()='No']/..//input")
    WebElement auxiliaryLightingDiscountNo;
    @FindBy(xpath = "//div[contains(text(),'Additional Coverage for Custom or Additional Equipment')]/../../../..//input")
    WebElement additionalCoverageForCustomEquipment;
    @FindBy(xpath = "//div[contains(text(),'Vacation Use Vehicle')]/../../../..//label[text()='No']/..//input")
    WebElement vacationUseVehicleNo;
    @FindBy(xpath = "//div[contains(text(),'Vacation Use Vehicle')]/../../../..//label[text()='Yes']/..//input")
    WebElement vacationUseVehicleYes;
    @FindBy(xpath = "//div[contains(text(),'vacation use vehicle')]/../../../..//label[text()='No']/..//input")
    WebElement vacationUseVehicleLCNo;
    @FindBy(xpath = "//div[contains(text(),'vacation use vehicle')]/../../../..//label[text()='Yes']/..//input")
    WebElement vacationUseVehicleLCYes;
    @FindBy(xpath = "//div[contains(text(),'vehicle insured by another PURE policy')]/../../../..//label[text()='No']/..//input")
    WebElement vehicleInsureByAnotherPUREPolicyNo;
    @FindBy(xpath = "//div[contains(text(),'vehicle insured by another PURE policy')]/../../../..//label[text()='Yes']/..//input")
    WebElement vehicleInsureByAnotherPUREPolicyYes;
    @FindBy(xpath = "//div[contains(text(),'Vehicle Use')]/../../../..//input")
    WebElement vehicleUse;
    @FindBy(xpath = "//div[contains(text(),'When was the vehicle purchased?')]/../../../..//input")
    WebElement whenWasTheVehiclePurchased;
    @FindBy(xpath = "//div[contains(text(),'Stated Amount')]/../../../..//input")
    WebElement statedAmount;
    @FindBy(xpath = "//font[contains(text(),'Estimated Annual Mileage')]/../../../../../../..//input")
    WebElement estimatedAnnualMileageFont;
    @FindBy(xpath = "//font[contains(text(),'Estimated Annual Mileage')]/../../../../../..//input")
    WebElement estimatedAnnualMileageFont2;
    @FindBy(xpath = "//div[contains(text(),'Estimated Annual Mileage')]/../../../..//input")
    WebElement estimatedAnnualMileage;
    @FindBy(xpath = "//div[contains(text(),'Year first licensed to operate a motorcycle?')]/../../../..//input")
    WebElement yearFirstLicensedToOperateMotorcycle;
    @FindBy(xpath = "//div[contains(text(),'Annual Mileage')]/../../../..//input")
    WebElement annualMileage;
    @FindBy(xpath = "//label[contains(text(),'ABS')]/..//input")
    WebElement ABS;
    @FindBy(xpath = "//label[contains(text(),'Passive Restraint')]/..//input")
    WebElement passiveRestraint;
    @FindBy(xpath = "//label[contains(text(),'Airbag')]/..//input")
    WebElement airbag;
    @FindBy(xpath = "//label[contains(text(),'VIN Etching')]/..//input")
    WebElement VINEtching;
    @FindBy(xpath = "//label[contains(text(),'Anti-Theft Devices')]/..//input")
    WebElement antiTheftDevices;
    @FindBy(xpath = "//label[contains(text(),'Category I')]/..//input")
    WebElement categoryI;
    @FindBy(xpath = "//label[contains(text(),'Category II')]/..//input")
    WebElement categoryII;
    @FindBy(xpath = "//label[contains(text(),'Category III')]/..//input")
    WebElement categoryIII;
    @FindBy(xpath = "//label[contains(text(),'Category IV')]/..//input")
    WebElement categoryIV;
    @FindBy(xpath = "//label[contains(text(),'Category 1')]/..//input")
    WebElement category1;
    @FindBy(xpath = "//label[contains(text(),'Category 2')]/..//input")
    WebElement category2;
    @FindBy(xpath = "//label[contains(text(),'Category 3')]/..//input")
    WebElement category3;
    @FindBy(xpath = "//label[contains(text(),'Category 4')]/..//input")
    WebElement category4;
    @FindBy(xpath = "//label[contains(text(),'Category 5')]/..//input")
    WebElement category5;
    @FindBy(xpath = "//label[contains(text(),'Vehicle Recovery')]/..//input")
    WebElement vehicleRecovery;
    @FindBy(xpath = "//label[contains(text(),'Disabling Device')]/..//input")
    WebElement disablingDevice;
    @FindBy(xpath = "//label[contains(text(),'Passive')]/..//input[@type='radio']")
    WebElement passive;
    @FindBy(xpath = "//label[contains(text(),'Active')]/..//input[@type='radio']")
    WebElement active;
    @FindBy(xpath = "//div[contains(text(),'Current Term Override')]/../../../..//input")
    WebElement currentTermOverride;
    @FindBy(xpath = "//div[contains(text(),'Temporary override')]/../../../..//input")
    WebElement tempOverride;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")
    WebElement agreedValueCurrentTerm;
    @FindBy(xpath = "//div[contains(text(),'Market Value Current Term')]/../../../..//input")
    WebElement marketValueCurrentTerm;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value of Vehicle')]/../../../..//input")
    WebElement agreedValueOfVehicle;
    @FindBy(xpath = "//div[contains(text(),'Market Value')]/../../../..//input")
    WebElement marketValue;
    @FindBy(xpath = "//div[contains(text(),'Original Agreed Value')]/../../../..//input")
    WebElement originalAgreedValue;
    @FindBy(xpath = "//div[contains(text(),'Mileage Band/Year')]/../../../..//input")
    WebElement mileageBandYear;
    @FindBy(xpath = "//div[contains(text(),'Premium Town - Code')]/../../../..//input")
    WebElement premiumTownCode;
    @FindBy(xpath = "//div[contains(text(),'Cost new$')]/../../../..//input")
    WebElement costNew;
    @FindBy(xpath = "//div[contains(text(),'Engine Size (cc)')]/../../../..//input")
    WebElement engineSize;
    @FindBy(xpath = "//div[text()='Garaging Zip Code']/../../../..//input")
    WebElement garagingZIPCode;
    @FindBy(xpath = "//div[contains(text(),'Agree to use PURE Direct Repair Program? (10% Physical Damage Discount)')]/../../../..//label[text()='No']/..//input")
    WebElement pureDirectRepairProgramNo;
    @FindBy(xpath = "//div[contains(text(),'Agree to use PURE Direct Repair Program? (10% Physical Damage Discount)')]/../../../..//label[text()='Yes']/..//input")
    WebElement pureDirectRepairProgramYes;
    @FindBy(xpath = "//div[contains(text(),'Stored in Car Condo?')]/../../../..//label[text()='No']/..//input")
    WebElement storedInCarCondoNo;
    @FindBy(xpath = "//div[contains(text(),'Stored in Car Condo?')]/../../../..//label[text()='Yes']/..//input")
    WebElement storedInCarCondoYes;
    @FindBy(xpath = "//div[text()='Driven By']/../../../..//input")
    WebElement drivenBy;
    @FindBy(xpath = "//div[text()='Agreed Value of Vehicle$']/../../../..//input")
    WebElement agreedValue;
    @FindBy(xpath = "//div[text()='Market Value Current Term']/../../../..//input")
    WebElement currentTermMarketValue;
    @FindBy(xpath = "//div[contains(text(),'Motorcycle Accident Prevention Course Completed?')]/../../../..//label[text()='Yes']/..//input")
    WebElement motorcyclePreventionYes;
    @FindBy(xpath = "//div[contains(text(),'Motorcycle Accident Prevention Course Completed?')]/../../../..//label[text()='No']/..//input")
    WebElement motorcyclePreventionNo;
    @FindBy(xpath = "//div[contains(text(),'Motorcycle Training Course?')]/../../../..//label[text()='No']/..//input")
    WebElement motorcycleTrainingCourseNo;
    @FindBy(xpath = "//div[contains(text(),'Motorcycle Training Course?')]/../../../..//label[text()='Yes']/..//input")
    WebElement motorcycleTrainingCourseYes;
    @FindBy(xpath = "//div[contains(text(),'Motorcycle Training Course completion date?')]/../../../..//input")
    WebElement motorcycleTrainingCourseCompletionDate;
    @FindBy(xpath = "//div[contains(text(),'Prefill Annual Mileage')]/../../../..//input")
    WebElement prefillAnnualMileage;
    @FindBy(xpath = "//div[contains(text(),'Motorcycle Accident Prevention Course Completion Date')]/../../../..//input")
    WebElement motorcyclePreventionDate;
    @FindBy(xpath = "//div[contains(text(),'Prefill Version')]/../../../..//input")
    WebElement prefillVersion;
    @FindBy(xpath = "//label[contains(text(),'Enter Info without lookup')]/..//input")
    WebElement enterInfoWithoutLookup;
    @FindBy(xpath = "//label[contains(text(),'Alarm only')]/..//input")
    WebElement alarmOnly;
    @FindBy(xpath = "//label[contains(text(),'Active Disabling Device 2.a')]/..//input")
    WebElement activeDisablingDevice2a;
    @FindBy(xpath = "//label[contains(text(),'Active Disabling Device 2.b')]/..//input")
    WebElement activeDisablingDevice2b;
    @FindBy(xpath = "//label[contains(text(),'Active Disabling Device 2.c')]/..//input")
    WebElement activeDisablingDevice2c;
    @FindBy(xpath = "//label[contains(text(),'Passive Disabling Device')]/..//input")
    WebElement passiveDisablingDevice;
    @FindBy(xpath = "//label[contains(text(),'Anti-Theft Device')]/..//input")
    WebElement antiTheftDevice;
    @FindBy(xpath = "//label[contains(text(),'Other Anti-theft Device 4.a')]/..//input")
    WebElement otherAntiTheftDevice4a;
    @FindBy(xpath = "//label[contains(text(),'Other Anti-theft Device 4.b')]/..//input")
    WebElement otherAntiTheftDevice4b;
    @FindBy(xpath = "//label[contains(text(),'Other Anti-theft Device 4.c')]/..//input")
    WebElement otherAntiTheftDevice4c;
    @FindBy(xpath = "//label[contains(text(),'Other Anti-theft Device 4.d')]/..//input")
    WebElement otherAntiTheftDevice4d;
    @FindBy(xpath = "//label[contains(text(),'Other Anti-theft Device s Low-Jack 4.e')]/..//input")
    WebElement otherAntiTheftDevicesLowJack4e;
    @FindBy(xpath = "//div[text()='vehicle details']")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'Permanent Override')]/../../../..//input")
    WebElement permanentOverride;
    @FindBy(xpath = "//div[contains(text(),'Mobile Device Control')]/../../../..//label[text()='No']/..//input")
    WebElement mobileDeviceControlNo;
    @FindBy(xpath = "//div[contains(text(),'Mobile Device Control')]/../../../..//label[text()='Yes']/..//input")
    WebElement mobileDeviceControlYes;


    public void fillVehicleDetailsPA(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("vehicle details");
        try {
            checkTemporaryOverride(data.get("Vehicle_Details_Temporary_Override_" + i));
        } catch (Exception e) {
        }

        switch (data.get("State")) {
            case "AK":
                fillVehicleDetailsAK(data, i);
                break;
            case "AZ":
                fillVehicleDetailsAZ(data, i);
                break;
            case "AR":
                fillVehicleDetailsAR(data, i);
                break;
            case "OK":
                fillVehicleDetailsOK(data, i);
                break;
            case "IN":
                fillVehicleDetailsIN(data, i);
                break;
            case "KS":
                fillVehicleDetailsKS(data, i);
                break;
            case "CO":
                fillVehicleDetailsCO(data, i);
                break;
            case "IL":
                fillVehicleDetailsIL(data, i);
                break;
            case "KY":
                fillVehicleDetailsKY(data, i);
                break;
            case "IA":
                fillVehicleDetailsIA(data, i);
                break;
            case "DC":
                fillVehicleDetailsDC(data, i);
                break;
            case "MN":
                fillVehicleDetailsMN(data, i);
                break;
            case "MO":
                fillVehicleDetailsMO(data, i);
                break;
            case "ND":
                fillVehicleDetailsND(data, i);
                break;
            case "MT":
                fillVehicleDetailsMT(data, i);
                break;
            case "NE":
                fillVehicleDetailsNE(data, i);
                break;
            case "NM":
                fillVehicleDetailsNM(data, i);
                break;
            case "OH":
                fillVehicleDetailsOH(data, i);
                break;
            case "RI":
                fillVehicleDetailsRI(data, i);
                break;
            case "TN":
                fillVehicleDetailsTN(data, i);
                break;
            case "UT":
                fillVehicleDetailsUT(data, i);
                break;
            case "WI":
                fillVehicleDetailsWI(data, i);
                break;
            case "WY":
                fillVehicleDetailsWY(data, i);
                break;
            case "AL":
                fillVehicleDetailsAL(data, i);
                break;
            case "CT":
                fillVehicleDetailsCT(data, i);
                break;
            case "LA":
                fillVehicleDetailsLA(data, i);
                break;
            case "MS":
                fillVehicleDetailsMS(data, i);
                break;
            case "NJ":
                fillVehicleDetailsNJ(data, i);
                break;
            case "SC":
                fillVehicleDetailsSC(data, i);
                break;
            case "VA":
                fillVehicleDetailsVA(data, i);
                break;
            case "FL":
                fillVehicleDetailsFL(data, i);
                break;
            case "TX":
                fillVehicleDetailsTX(data, i);
                break;
            case "GA":
                fillVehicleDetailsGA(data, i);
                break;
            case "MI":
                fillVehicleDetailsMI(data, i);
                break;
            case "ID":
                fillVehicleDetailsID(data, i);
                break;
            case "WV":
                fillVehicleDetailsWV(data, i);
                break;
            case "NV":
                fillVehicleDetailsNV(data, i);
                break;
            case "PA":
                fillVehicleDetailsPAState(data, i);
                break;
            case "VT":
                fillVehicleDetailsVT(data, i);
                break;
            case "WA":
                fillVehicleDetailsWA(data, i);
                break;
            case "SD":
                fillVehicleDetailsSD(data, i);
                break;
            case "OR":
                fillVehicleDetailsOR(data, i);
                break;
            case "NH":
                fillVehicleDetailsNH(data, i);
                break;
            case "DE":
                fillVehicleDetailsDE(data, i);
                break;
            case "MD":
                fillVehicleDetailsMD(data, i);
                break;
            case "NY":
                fillVehicleDetailsNY(data, i);
                break;
            case "CA":
                fillVehicleDetailsCA(data, i);
                break;
            case "MA":
                fillVehicleDetailsMA(data, i);
                break;
            case "ME":
                fillVehicleDetailsME(data, i);
                break;
            case "NC":
                fillVehicleDetailsNC(data, i);
                break;
            case "HI":
                fillVehicleDetailsHI(data, i);
                break;
        }

        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                String val = agreedValueCurrentTerm.getAttribute("value");
                if (!hasValue(val) || val.equalsIgnoreCase("$ 0.00") || val.equalsIgnoreCase("0") || val.equalsIgnoreCase("")) {
                    setCurrentTermOverride("Yes", data.get("Vehicle_Details_Agreed_Value_Current_Term_" + i));
                }
            }
            break;
            case "Motor Home":
            case "Classic Collectors Car": {
                try {
                    String val = agreedValueOfVehicle.getAttribute("value");
                    if (!hasValue(val) || val.equalsIgnoreCase("$ 0.00") || val.equalsIgnoreCase("0") || val.equalsIgnoreCase("")) {
                        setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                    }
                } catch (Exception e) {
                    //
                }
            }
            break;
        }
    }

    public void checkTemporaryOverride(String s) throws Throwable {
        checkCheckbox(tempOverride, s, "Temporary Override");
    }

    public void fillVehicleDetailsGA(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Collectors Trailer":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMI(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                try {
                    setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                } catch (Exception e) {
                    //
                }
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsFL(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setStoredInCarCondo(data.get("Vehicle_Details_Stored_In_Car_Condo_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVA(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNY(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Collectors Trailer":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNJ(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_" + i));
                setCategoryI(data.get("Vehicle_Details_Category_I_" + i));
                setCategoryII(data.get("Vehicle_Details_Category_II_" + i));
                setCategoryIII(data.get("Vehicle_Details_Category_III_" + i));
                setCategoryIV(data.get("Vehicle_Details_Category_IV_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNC(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setMobileDeviceControl(data.get("Does_Vehicle_Have_Mobile_Device_Control_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_" + i));
            }
            break;
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setWasTheVehiclePurchasedNew(data.get("Vehicle_Details_Was_The_Vehicle_Purchased_New_" + i), data.get("Vehicle_Details_When_Was_The_Vehicle_Purchased_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMobileDeviceControl(data.get("Does_Vehicle_Have_Mobile_Device_Control_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMA(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_" + i));
                setCategory1(data.get("Vehicle_Details_Category_1_" + i));
                setCategory2(data.get("Vehicle_Details_Category_2_" + i));
                setCategory3(data.get("Vehicle_Details_Category_3_" + i));
                setCategory4(data.get("Vehicle_Details_Category_4_" + i));
                setCategory5(data.get("Vehicle_Details_Category_5_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsHI(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCA(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setYearFirstLicensedToOperateMotorcycle(data.get("Vehicle_Details_Year_First_Licensed_To_Operate_Motorcycle_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWY(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWA(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Exotic Collectors Car":
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsRI(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMS(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsID(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIA(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts":
            case "Travel Trailer":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNE(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVT(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Snowmobile":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsME(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "ATV":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNH(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Dune Buggies":
            case "Snowmobiles":
            case "ATV": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMN(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAuxiliaryLightingDiscount(data.get("Vehicle_Details_Auxiliary_Lighting_Discount_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));

            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWV(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSD(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Snowmobiles":
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDE(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOR(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMotorcycleTrainingCourse(data.get("Vehicle_Details_Motorcycle_Training_Course_" + i));
                if (data.get("Vehicle_Details_Motorcycle_Training_Course_" + i).equalsIgnoreCase("Yes")) {
                    setMotorcycleTrainingCourseCompletionDate(data.get("Vehicle_Details_Motorcycle_Training_Course_Completed_Date_" + i));
                }
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsND(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMT(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "ATVs": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMO(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWI(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsPAState(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Dune Buggies":
            case "Golf Carts":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNV(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKS(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                if (isElementDisplayed(mileageBandYear))
                    setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                else
                    setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setAgreedValueCurrentTerm(data.get("Vehicle_Details_Agreed_Value_Current_Term_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_AMarket_Value_" + i));

            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIN(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_AMarket_Value_" + i));

            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAZ(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setEnterInfoWithoutLookup(data.get("Vehicle_Details_Enter_Info_Without_Lookup_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));

            }
            break;
            case "Dune Buggies":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCT(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setPassiveRestraint(data.get("Vehicle_Details_Discounts_Passive_Restraint_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Golf Carts":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsUT(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsLA(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSC(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTX(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Recreational Trailer":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDC(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAL(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKY(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                setAlarmOnly(data.get("Vehicle_Details_Alarm_Only_" + i));
                setActiveDisablingDevice2a(data.get("Vehicle_Details_Active_Disabling_Device_2a_" + i));
                setActiveDisablingDevice2b(data.get("Vehicle_Details_Active_Disabling_Device_2b_" + i));
                setActiveDisablingDevice2c(data.get("Vehicle_Details_Active_Disabling_Device_2c_" + i));
                setPassiveDisablingDevice(data.get("Vehicle_Details_Passive_Disabling_Device_" + i));
                setAntiTheftDevice(data.get("Vehicle_Details_Anti_Theft_Device_" + i));
                setOtherAntiTheftDevice4a(data.get("Vehicle_Details_Other_Anti_Theft_Device_4a_" + i));
                setOtherAntiTheftDevice4b(data.get("Vehicle_Details_Other_Anti_Theft_Device_4b_" + i));
                setOtherAntiTheftDevice4c(data.get("Vehicle_Details_Other_Anti_Theft_Device_4c_" + i));
                setOtherAntiTheftDevice4d(data.get("Vehicle_Details_Other_Anti_Theft_Device_4d_" + i));
                setOtherAntiTheftDevicesLowJack4e(data.get("Vehicle_Details_Other_Anti_Theft_Devices_Low_Jack_4e_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTN(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMD(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOH(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNM(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIL(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));

            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCO(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                setAgreedValueCurrentTerm(data.get("Vehicle_Details_Agreed_Value_Current_Term_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Collectors Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAK(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
                setAgreedValue(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOK(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car":
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));

            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setMotorcycleAccidentPrevention(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_" + i));
                setMotorcycleAccidentPreventionDate(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_Date_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAR(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_" + i));

            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_" + i), data, i);
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsPA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("State")) {
            case "AK":
                fillVehicleDetailsAK_END(data, i);
                break;
            case "AZ":
                fillVehicleDetailsAZ_END(data, i);
                break;
            case "AR":
                fillVehicleDetailsAR_END(data, i);
                break;
            case "OK":
                fillVehicleDetailsOK_END(data, i);
                break;
            case "IN":
                fillVehicleDetailsIN_END(data, i);
                break;
            case "KS":
                fillVehicleDetailsKS_END(data, i);
                break;
            case "CO":
                fillVehicleDetailsCO_END(data, i);
                break;
            case "IL":
                fillVehicleDetailsIL_END(data, i);
                break;
            case "KY":
                fillVehicleDetailsKY_END(data, i);
                break;
            case "IA":
                fillVehicleDetailsIA_END(data, i);
                break;
            case "DC":
                fillVehicleDetailsDC_END(data, i);
                break;
            case "MN":
                fillVehicleDetailsMN_END(data, i);
                break;
            case "MO":
                fillVehicleDetailsMO_END(data, i);
                break;
            case "ND":
                fillVehicleDetailsND_END(data, i);
                break;
            case "MT":
                fillVehicleDetailsMT_END(data, i);
                break;
            case "NE":
                fillVehicleDetailsNE_END(data, i);
                break;
            case "NM":
                fillVehicleDetailsNM_END(data, i);
                break;
            case "OH":
                fillVehicleDetailsOH_END(data, i);
                break;
            case "RI":
                fillVehicleDetailsRI_END(data, i);
                break;
            case "TN":
                fillVehicleDetailsTN_END(data, i);
                break;
            case "UT":
                fillVehicleDetailsUT_END(data, i);
                break;
            case "WI":
                fillVehicleDetailsWI_END(data, i);
                break;
            case "WY":
                fillVehicleDetailsWY_END(data, i);
                break;
            case "AL":
                fillVehicleDetailsAL_END(data, i);
                break;
            case "CT":
                fillVehicleDetailsCT_END(data, i);
                break;
            case "LA":
                fillVehicleDetailsLA_END(data, i);
                break;
            case "MS":
                fillVehicleDetailsMS_END(data, i);
                break;
            case "NJ":
                fillVehicleDetailsNJ_END(data, i);
                break;
            case "SC":
                fillVehicleDetailsSC_END(data, i);
                break;
            case "VA":
                fillVehicleDetailsVA_END(data, i);
                break;
            case "FL":
                fillVehicleDetailsFL_END(data, i);
                break;
            case "TX":
                fillVehicleDetailsTX_END(data, i);
                break;
            case "GA":
                fillVehicleDetailsGA_END(data, i);
                break;
            case "MI":
                fillVehicleDetailsMI_END(data, i);
                break;
            case "ID":
                fillVehicleDetailsID_END(data, i);
                break;
            case "WV":
                fillVehicleDetailsWV_END(data, i);
                break;
            case "NV":
                fillVehicleDetailsNV_END(data, i);
                break;
            case "PA":
                fillVehicleDetailsPAState_END(data, i);
                break;
            case "VT":
                fillVehicleDetailsVT_END(data, i);
                break;
            case "WA":
                fillVehicleDetailsWA_END(data, i);
                break;
            case "SD":
                fillVehicleDetailsSD_END(data, i);
                break;
            case "OR":
                fillVehicleDetailsOR_END(data, i);
                break;
            case "NH":
                fillVehicleDetailsNH_END(data, i);
                break;
            case "DE":
                fillVehicleDetailsDE_END(data, i);
                break;
            case "MD":
                fillVehicleDetailsMD_END(data, i);
                break;
            case "NY":
                fillVehicleDetailsNY_END(data, i);
                break;
            case "CA":
                fillVehicleDetailsCA_END(data, i);
                break;
            case "MA":
                fillVehicleDetailsMA_END(data, i);
                break;
            case "ME":
                fillVehicleDetailsME_END(data, i);
                break;
            case "NC":
                fillVehicleDetailsNC_END(data, i);
                break;
            case "HI":
                fillVehicleDetailsHI_END(data, i);
                break;
        }
    }

    public void fillVehicleDetailsGA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Collectors Trailer":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMI_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsFL_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setStoredInCarCondo(data.get("Vehicle_Details_Stored_In_Car_Condo_END_") + i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNY_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Collectors Trailer":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNJ_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_END_" + i));
                setCategoryI(data.get("Vehicle_Details_Category_I_END_" + i));
                setCategoryII(data.get("Vehicle_Details_Category_II_END_" + i));
                setCategoryIII(data.get("Vehicle_Details_Category_III_END_" + i));
                setCategoryIV(data.get("Vehicle_Details_Category_IV_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNC_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_END_" + i));
            }
            break;
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setWasTheVehiclePurchasedNew(data.get("Vehicle_Details_Was_The_Vehicle_Purchased_New_END_" + i), data.get("Vehicle_Details_When_Was_The_Vehicle_Purchased_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_END_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_END_" + i));
                setCategory1(data.get("Vehicle_Details_Category_1_END_" + i));
                setCategory2(data.get("Vehicle_Details_Category_2_END_" + i));
                setCategory3(data.get("Vehicle_Details_Category_3_END_" + i));
                setCategory4(data.get("Vehicle_Details_Category_4_END_" + i));
                setCategory5(data.get("Vehicle_Details_Category_5_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsHI_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setYearFirstLicensedToOperateMotorcycle(data.get("Vehicle_Details_Year_First_Licensed_To_Operate_Motorcycle_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWY_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Exotic Collectors Car":
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsRI_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsID_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts":
            case "Travel Trailer":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNE_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVT_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Snowmobile":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsME_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "ATV":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNH_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Dune Buggies":
            case "Snowmobiles":
            case "ATV": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMN_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAuxiliaryLightingDiscount(data.get("Vehicle_Details_Auxiliary_Lighting_Discount_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));

            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWV_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSD_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Snowmobiles":
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDE_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOR_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMotorcycleTrainingCourse(data.get("Vehicle_Details_Motorcycle_Training_Course_END_" + i));
                if (data.get("Vehicle_Details_Motorcycle_Training_Course_END_" + i).equalsIgnoreCase("Yes")) {
                    setMotorcycleTrainingCourseCompletionDate(data.get("Vehicle_Details_Motorcycle_Training_Course_Completed_Date_END_" + i));
                }
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsND_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMT_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMO_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWI_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsPAState_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "Golf Carts":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNV_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                if (isElementDisplayed(mileageBandYear))
                    setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                else
                    setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIN_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAZ_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setEnterInfoWithoutLookup(data.get("Vehicle_Details_Enter_Info_Without_Lookup_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCT_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setPassiveRestraint(data.get("Vehicle_Details_Discounts_Passive_Restraint_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Golf Carts":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsUT_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsLA_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSC_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTX_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Recreational Trailer":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDC_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAL_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKY_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                setAlarmOnly(data.get("Vehicle_Details_Alarm_Only_END_" + i));
                setActiveDisablingDevice2a(data.get("Vehicle_Details_Active_Disabling_Device_2a_END_" + i));
                setActiveDisablingDevice2b(data.get("Vehicle_Details_Active_Disabling_Device_2b_END_" + i));
                setActiveDisablingDevice2c(data.get("Vehicle_Details_Active_Disabling_Device_2c_END_" + i));
                setPassiveDisablingDevice(data.get("Vehicle_Details_Passive_Disabling_Device_END_" + i));
                setAntiTheftDevice(data.get("Vehicle_Details_Anti_Theft_Device_END_" + i));
                setOtherAntiTheftDevice4a(data.get("Vehicle_Details_Other_Anti_Theft_Device_4a_END_" + i));
                setOtherAntiTheftDevice4b(data.get("Vehicle_Details_Other_Anti_Theft_Device_4b_END_" + i));
                setOtherAntiTheftDevice4c(data.get("Vehicle_Details_Other_Anti_Theft_Device_4c_END_" + i));
                setOtherAntiTheftDevice4d(data.get("Vehicle_Details_Other_Anti_Theft_Device_4d_END_" + i));
                setOtherAntiTheftDevicesLowJack4e(data.get("Vehicle_Details_Other_Anti_Theft_Devices_Low_Jack_4e_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTN_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMD_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOH_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNM_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIL_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCO_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Collectors Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAK_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));

            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
                setAgreedValue(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOK_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car":
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setMotorcycleAccidentPrevention(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_END_" + i));
                setMotorcycleAccidentPreventionDate(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_Date_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAR_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_END_" + i), data, i);
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsPA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("State")) {
            case "AK":
                fillVehicleDetailsAK_OOS_END(data, i);
                break;
            case "AZ":
                fillVehicleDetailsAZ_OOS_END(data, i);
                break;
            case "AR":
                fillVehicleDetailsAR_OOS_END(data, i);
                break;
            case "OK":
                fillVehicleDetailsOK_OOS_END(data, i);
                break;
            case "IN":
                fillVehicleDetailsIN_OOS_END(data, i);
                break;
            case "KS":
                fillVehicleDetailsKS_OOS_END(data, i);
                break;
            case "CO":
                fillVehicleDetailsCO_OOS_END(data, i);
                break;
            case "IL":
                fillVehicleDetailsIL_OOS_END(data, i);
                break;
            case "KY":
                fillVehicleDetailsKY_OOS_END(data, i);
                break;
            case "IA":
                fillVehicleDetailsIA_OOS_END(data, i);
                break;
            case "DC":
                fillVehicleDetailsDC_OOS_END(data, i);
                break;
            case "MN":
                fillVehicleDetailsMN_OOS_END(data, i);
                break;
            case "MO":
                fillVehicleDetailsMO_OOS_END(data, i);
                break;
            case "ND":
                fillVehicleDetailsND_OOS_END(data, i);
                break;
            case "MT":
                fillVehicleDetailsMT_OOS_END(data, i);
                break;
            case "NE":
                fillVehicleDetailsNE_OOS_END(data, i);
                break;
            case "NM":
                fillVehicleDetailsNM_OOS_END(data, i);
                break;
            case "OH":
                fillVehicleDetailsOH_OOS_END(data, i);
                break;
            case "RI":
                fillVehicleDetailsRI_OOS_END(data, i);
                break;
            case "TN":
                fillVehicleDetailsTN_OOS_END(data, i);
                break;
            case "UT":
                fillVehicleDetailsUT_OOS_END(data, i);
                break;
            case "WI":
                fillVehicleDetailsWI_OOS_END(data, i);
                break;
            case "WY":
                fillVehicleDetailsWY_OOS_END(data, i);
                break;
            case "AL":
                fillVehicleDetailsAL_OOS_END(data, i);
                break;
            case "CT":
                fillVehicleDetailsCT_OOS_END(data, i);
                break;
            case "LA":
                fillVehicleDetailsLA_OOS_END(data, i);
                break;
            case "MS":
                fillVehicleDetailsMS_OOS_END(data, i);
                break;
            case "NJ":
                fillVehicleDetailsNJ_OOS_END(data, i);
                break;
            case "SC":
                fillVehicleDetailsSC_OOS_END(data, i);
                break;
            case "VA":
                fillVehicleDetailsVA_OOS_END(data, i);
                break;
            case "FL":
                fillVehicleDetailsFL_OOS_END(data, i);
                break;
            case "TX":
                fillVehicleDetailsTX_OOS_END(data, i);
                break;
            case "GA":
                fillVehicleDetailsGA_OOS_END(data, i);
                break;
            case "MI":
                fillVehicleDetailsMI_OOS_END(data, i);
                break;
            case "ID":
                fillVehicleDetailsID_OOS_END(data, i);
                break;
            case "WV":
                fillVehicleDetailsWV_OOS_END(data, i);
                break;
            case "NV":
                fillVehicleDetailsNV_OOS_END(data, i);
                break;
            case "PA":
                fillVehicleDetailsPAState_OOS_END(data, i);
                break;
            case "VT":
                fillVehicleDetailsVT_OOS_END(data, i);
                break;
            case "WA":
                fillVehicleDetailsWA_OOS_END(data, i);
                break;
            case "SD":
                fillVehicleDetailsSD_OOS_END(data, i);
                break;
            case "OR":
                fillVehicleDetailsOR_OOS_END(data, i);
                break;
            case "NH":
                fillVehicleDetailsNH_OOS_END(data, i);
                break;
            case "DE":
                fillVehicleDetailsDE_OOS_END(data, i);
                break;
            case "MD":
                fillVehicleDetailsMD_OOS_END(data, i);
                break;
            case "NY":
                fillVehicleDetailsNY_OOS_END(data, i);
                break;
            case "CA":
                fillVehicleDetailsCA_OOS_END(data, i);
                break;
            case "MA":
                fillVehicleDetailsMA_OOS_END(data, i);
                break;
            case "ME":
                fillVehicleDetailsME_OOS_END(data, i);
                break;
            case "NC":
                fillVehicleDetailsNC_OOS_END(data, i);
                break;
            case "HI":
                fillVehicleDetailsHI_OOS_END(data, i);
                break;
        }
    }

    public void fillVehicleDetailsGA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Collectors Trailer":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMI_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsFL_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setStoredInCarCondo(data.get("Vehicle_Details_Stored_In_Car_Condo_OOS_END_") + i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNY_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Collectors Trailer":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNJ_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_OOS_END_" + i));
                setCategoryI(data.get("Vehicle_Details_Category_I_OOS_END_" + i));
                setCategoryII(data.get("Vehicle_Details_Category_II_OOS_END_" + i));
                setCategoryIII(data.get("Vehicle_Details_Category_III_OOS_END_" + i));
                setCategoryIV(data.get("Vehicle_Details_Category_IV_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNC_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setWasTheVehiclePurchasedNew(data.get("Vehicle_Details_Was_The_Vehicle_Purchased_New_OOS_END_" + i), data.get("Vehicle_Details_When_Was_The_Vehicle_Purchased_OOS_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_OOS_END_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_OOS_END_" + i));
                setCategory1(data.get("Vehicle_Details_Category_1_OOS_END_" + i));
                setCategory2(data.get("Vehicle_Details_Category_2_OOS_END_" + i));
                setCategory3(data.get("Vehicle_Details_Category_3_OOS_END_" + i));
                setCategory4(data.get("Vehicle_Details_Category_4_OOS_END_" + i));
                setCategory5(data.get("Vehicle_Details_Category_5_OOS_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsHI_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setYearFirstLicensedToOperateMotorcycle(data.get("Vehicle_Details_Year_First_Licensed_To_Operate_Motorcycle_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWY_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Exotic Collectors Car":
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsRI_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMS_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsID_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts":
            case "Travel Trailer":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNE_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVT_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Snowmobile":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsME_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "ATV":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNH_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Dune Buggies":
            case "Snowmobiles":
            case "ATV": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMN_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAuxiliaryLightingDiscount(data.get("Vehicle_Details_Auxiliary_Lighting_Discount_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));

            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWV_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSD_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Snowmobiles":
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDE_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOR_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMotorcycleTrainingCourse(data.get("Vehicle_Details_Motorcycle_Training_Course_OOS_END_" + i));
                if (data.get("Vehicle_Details_Motorcycle_Training_Course_OOS_END_" + i).equalsIgnoreCase("Yes")) {
                    setMotorcycleTrainingCourseCompletionDate(data.get("Vehicle_Details_Motorcycle_Training_Course_Completed_Date_OOS_END_" + i));
                }
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsND_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMT_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMO_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWI_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsPAState_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "Golf Carts":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNV_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKS_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIN_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAZ_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setEnterInfoWithoutLookup(data.get("Vehicle_Details_Enter_Info_Without_Lookup_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCT_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setPassiveRestraint(data.get("Vehicle_Details_Discounts_Passive_Restraint_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Golf Carts":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsUT_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsLA_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSC_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTX_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Recreational Trailer":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDC_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAL_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKY_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                setAlarmOnly(data.get("Vehicle_Details_Alarm_Only_OOS_END_" + i));
                setActiveDisablingDevice2a(data.get("Vehicle_Details_Active_Disabling_Device_2a_OOS_END_" + i));
                setActiveDisablingDevice2b(data.get("Vehicle_Details_Active_Disabling_Device_2b_OOS_END_" + i));
                setActiveDisablingDevice2c(data.get("Vehicle_Details_Active_Disabling_Device_2c_OOS_END_" + i));
                setPassiveDisablingDevice(data.get("Vehicle_Details_Passive_Disabling_Device_OOS_END_" + i));
                setAntiTheftDevice(data.get("Vehicle_Details_Anti_Theft_Device_OOS_END_" + i));
                setOtherAntiTheftDevice4a(data.get("Vehicle_Details_Other_Anti_Theft_Device_4a_OOS_END_" + i));
                setOtherAntiTheftDevice4b(data.get("Vehicle_Details_Other_Anti_Theft_Device_4b_OOS_END_" + i));
                setOtherAntiTheftDevice4c(data.get("Vehicle_Details_Other_Anti_Theft_Device_4c_OOS_END_" + i));
                setOtherAntiTheftDevice4d(data.get("Vehicle_Details_Other_Anti_Theft_Device_4d_OOS_END_" + i));
                setOtherAntiTheftDevicesLowJack4e(data.get("Vehicle_Details_Other_Anti_Theft_Devices_Low_Jack_4e_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTN_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMD_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOH_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNM_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIL_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCO_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Collectors Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAK_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_OOS_END_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
                setAgreedValue(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOK_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car":
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setMotorcycleAccidentPrevention(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_OOS_END_" + i));
                setMotorcycleAccidentPreventionDate(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_Date_OOS_END_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAR_OOS_END(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_OOS_END_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_OOS_END_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_OOS_END_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_OOS_END_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_OOS_END_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_OOS_END_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_OOS_END_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_OOS_END_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_OOS_END_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_OOS_END_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_OOS_END_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_OOS_END_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_OOS_END_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_OOS_END_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_OOS_END_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_OOS_END_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_OOS_END_" + i), data, i);
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_OOS_END_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_OOS_END_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_OOS_END_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_OOS_END_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_OOS_END_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsPA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("State")) {
            case "AK":
                fillVehicleDetailsAK_RNW(data, i);
                break;
            case "AZ":
                fillVehicleDetailsAZ_RNW(data, i);
                break;
            case "AR":
                fillVehicleDetailsAR_RNW(data, i);
                break;
            case "OK":
                fillVehicleDetailsOK_RNW(data, i);
                break;
            case "IN":
                fillVehicleDetailsIN_RNW(data, i);
                break;
            case "KS":
                fillVehicleDetailsKS_RNW(data, i);
                break;
            case "CO":
                fillVehicleDetailsCO_RNW(data, i);
                break;
            case "IL":
                fillVehicleDetailsIL_RNW(data, i);
                break;
            case "KY":
                fillVehicleDetailsKY_RNW(data, i);
                break;
            case "IA":
                fillVehicleDetailsIA_RNW(data, i);
                break;
            case "DC":
                fillVehicleDetailsDC_RNW(data, i);
                break;
            case "MN":
                fillVehicleDetailsMN_RNW(data, i);
                break;
            case "MO":
                fillVehicleDetailsMO_RNW(data, i);
                break;
            case "ND":
                fillVehicleDetailsND_RNW(data, i);
                break;
            case "MT":
                fillVehicleDetailsMT_RNW(data, i);
                break;
            case "NE":
                fillVehicleDetailsNE_RNW(data, i);
                break;
            case "NM":
                fillVehicleDetailsNM_RNW(data, i);
                break;
            case "OH":
                fillVehicleDetailsOH_RNW(data, i);
                break;
            case "RI":
                fillVehicleDetailsRI_RNW(data, i);
                break;
            case "TN":
                fillVehicleDetailsTN_RNW(data, i);
                break;
            case "UT":
                fillVehicleDetailsUT_RNW(data, i);
                break;
            case "WI":
                fillVehicleDetailsWI_RNW(data, i);
                break;
            case "WY":
                fillVehicleDetailsWY_RNW(data, i);
                break;
            case "AL":
                fillVehicleDetailsAL_RNW(data, i);
                break;
            case "CT":
                fillVehicleDetailsCT_RNW(data, i);
                break;
            case "LA":
                fillVehicleDetailsLA_RNW(data, i);
                break;
            case "MS":
                fillVehicleDetailsMS_RNW(data, i);
                break;
            case "NJ":
                fillVehicleDetailsNJ_RNW(data, i);
                break;
            case "SC":
                fillVehicleDetailsSC_RNW(data, i);
                break;
            case "VA":
                fillVehicleDetailsVA_RNW(data, i);
                break;
            case "FL":
                fillVehicleDetailsFL_RNW(data, i);
                break;
            case "TX":
                fillVehicleDetailsTX_RNW(data, i);
                break;
            case "GA":
                fillVehicleDetailsGA_RNW(data, i);
                break;
            case "MI":
                fillVehicleDetailsMI_RNW(data, i);
                break;
            case "ID":
                fillVehicleDetailsID_RNW(data, i);
                break;
            case "WV":
                fillVehicleDetailsWV_RNW(data, i);
                break;
            case "NV":
                fillVehicleDetailsNV_RNW(data, i);
                break;
            case "PA":
                fillVehicleDetailsPAState_RNW(data, i);
                break;
            case "VT":
                fillVehicleDetailsVT_RNW(data, i);
                break;
            case "WA":
                fillVehicleDetailsWA_RNW(data, i);
                break;
            case "SD":
                fillVehicleDetailsSD_RNW(data, i);
                break;
            case "OR":
                fillVehicleDetailsOR_RNW(data, i);
                break;
            case "NH":
                fillVehicleDetailsNH_RNW(data, i);
                break;
            case "DE":
                fillVehicleDetailsDE_RNW(data, i);
                break;
            case "MD":
                fillVehicleDetailsMD_RNW(data, i);
                break;
            case "NY":
                fillVehicleDetailsNY_RNW(data, i);
                break;
            case "CA":
                fillVehicleDetailsCA_RNW(data, i);
                break;
            case "MA":
                fillVehicleDetailsMA_RNW(data, i);
                break;
            case "ME":
                fillVehicleDetailsME_RNW(data, i);
                break;
            case "NC":
                fillVehicleDetailsNC_RNW(data, i);
                break;
            case "HI":
                fillVehicleDetailsHI_RNW(data, i);
                break;
        }
    }

    public void fillVehicleDetailsGA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Collectors Trailer":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMI_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsFL_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setStoredInCarCondo(data.get("Vehicle_Details_Stored_In_Car_Condo_RNW_") + i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreeToUsePureDirectRepairProgram(data.get("Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNY_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Collectors Trailer":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNJ_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_RNW_" + i));
                setCategoryI(data.get("Vehicle_Details_Category_I_RNW_" + i));
                setCategoryII(data.get("Vehicle_Details_Category_II_RNW_" + i));
                setCategoryIII(data.get("Vehicle_Details_Category_III_RNW_" + i));
                setCategoryIV(data.get("Vehicle_Details_Category_IV_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));

            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNC_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_RNW_" + i));
            }
            break;
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setWasTheVehiclePurchasedNew(data.get("Vehicle_Details_Was_The_Vehicle_Purchased_New_RNW_" + i), data.get("Vehicle_Details_When_Was_The_Vehicle_Purchased_RNW_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_RNW_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
                setStatedAmount(data.get("Vehicle_Details_Stated_Amount_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setAntiTheftDevices(data.get("Vehicle_Details_Anti_Theft_Devices_RNW_" + i));
                setCategory1(data.get("Vehicle_Details_Category_1_RNW_" + i));
                setCategory2(data.get("Vehicle_Details_Category_2_RNW_" + i));
                setCategory3(data.get("Vehicle_Details_Category_3_RNW_" + i));
                setCategory4(data.get("Vehicle_Details_Category_4_RNW_" + i));
                setCategory5(data.get("Vehicle_Details_Category_5_RNW_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setPremiumTownCode(data.get("Vehicle_Details_Premium_Town_Code_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsHI_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setYearFirstLicensedToOperateMotorcycle(data.get("Vehicle_Details_Year_First_Licensed_To_Operate_Motorcycle_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWY_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Exotic Collectors Car":
            case "Antique Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsRI_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMS_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsID_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Travel Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts":
            case "Travel Trailer":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNE_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsVT_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Dune Buggy":
            case "ATVs":
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Snowmobile":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsME_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "ATV":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNH_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Dune Buggies":
            case "Snowmobiles":
            case "ATV": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMN_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setSnowbirdVehicle(data.get("Vehicle_Details_Is_This_A_Snowbird_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAuxiliaryLightingDiscount(data.get("Vehicle_Details_Auxiliary_Lighting_Discount_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));

            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWV_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Travel Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSD_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Snowmobiles":
            case "ATVs":
            case "Dune Buggy":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDE_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOR_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMotorcycleTrainingCourse(data.get("Vehicle_Details_Motorcycle_Training_Course_RNW_" + i));
                if (data.get("Vehicle_Details_Motorcycle_Training_Course_RNW_" + i).equalsIgnoreCase("Yes")) {
                    setMotorcycleTrainingCourseCompletionDate(data.get("Vehicle_Details_Motorcycle_Training_Course_Completed_Date_RNW_" + i));
                }
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsND_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMT_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "ATVs":
            case "Dune Buggy": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
            }
            break;
            case "Travel Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMO_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsWI_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsPAState_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Dune Buggies":
            case "Golf Carts":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNV_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKS_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIN_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAZ_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setEnterInfoWithoutLookup(data.get("Vehicle_Details_Enter_Info_Without_Lookup_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Dune Buggies":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Golf Carts": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCT_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setPassiveRestraint(data.get("Vehicle_Details_Discounts_Passive_Restraint_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Golf Carts":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsUT_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsLA_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsSC_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTX_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Recreational Trailer":
            case "Snowmobiles":
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsDC_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAL_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Dune Buggies":
            case "Recreational Trailer":
            case "Snowmobiles":
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Collectors Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsKY_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                setAlarmOnly(data.get("Vehicle_Details_Alarm_Only_RNW_" + i));
                setActiveDisablingDevice2a(data.get("Vehicle_Details_Active_Disabling_Device_2a_RNW_" + i));
                setActiveDisablingDevice2b(data.get("Vehicle_Details_Active_Disabling_Device_2b_RNW_" + i));
                setActiveDisablingDevice2c(data.get("Vehicle_Details_Active_Disabling_Device_2c_RNW_" + i));
                setPassiveDisablingDevice(data.get("Vehicle_Details_Passive_Disabling_Device_RNW_" + i));
                setAntiTheftDevice(data.get("Vehicle_Details_Anti_Theft_Device_RNW_" + i));
                setOtherAntiTheftDevice4a(data.get("Vehicle_Details_Other_Anti_Theft_Device_4a_RNW_" + i));
                setOtherAntiTheftDevice4b(data.get("Vehicle_Details_Other_Anti_Theft_Device_4b_RNW_" + i));
                setOtherAntiTheftDevice4c(data.get("Vehicle_Details_Other_Anti_Theft_Device_4c_RNW_" + i));
                setOtherAntiTheftDevice4d(data.get("Vehicle_Details_Other_Anti_Theft_Device_4d_RNW_" + i));
                setOtherAntiTheftDevicesLowJack4e(data.get("Vehicle_Details_Other_Anti_Theft_Devices_Low_Jack_4e_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Snowmobiles":
            case "Dune Buggies":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsTN_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsMD_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;

            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOH_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsNM_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "Recreational Trailer":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsIL_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "All Terrain Vehicles":
            case "Golf Carts":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsCO_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Collectors Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Recreational Trailer": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAK_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleVacationUse(data.get("Vehicle_Details_Is_This_A_Vacation_Use_Vehicle_RNW_" + i));
                setVehicleUse(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer":
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car":
            case "Collectors Trailer":
            case "Motor Home": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
                setAgreedValue(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsOK_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Exotic Collectors Car":
            case "Classic Collectors Car": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setMotorcycleAccidentPrevention(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_RNW_" + i));
                setMotorcycleAccidentPreventionDate(data.get("Vehicle_Details_Motorcycle_Accident_Prevention_Date_RNW_" + i));
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void fillVehicleDetailsAR_RNW(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Vehicle_Details_Vehicle_Type_RNW_" + i)) {
            case "Private Passenger": {
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleKeptInGarage(data.get("Vehicle_Details_Is_The_Vehicle_Kept_In_A_Garage_With_24_Hour_Security_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setGaragingCode(data.get("Vehicle_Details_Garaging_Zip_Code_RNW_" + i));
                setVehicleInsureByAnotherPUREPolicy(data.get("Vehicle_Details_Is_There_A_Private_Passenger_Vehicle_Insured_By_Another_PURE_Policy_RNW_" + i));
                setEstimatedAnnualMileage(data.get("Vehicle_Details_Estimated_Annual_Mileage_RNW_" + i));
                setABS(data.get("Vehicle_Details_Discounts_ABS_RNW_" + i));
                setAirbag(data.get("Vehicle_Details_Discounts_Airbag_RNW_" + i));
                setVINEtching(data.get("Vehicle_Details_Anti_Theft_Types_VIN_Etching_RNW_" + i));
                setVehicleRecovery(data.get("Vehicle_Details_Anti_Theft_Types_Vehicle_Recovery_RNW_" + i));
                setDisablingDevice(data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Device_RNW_" + i), data.get("Vehicle_Details_Anti_Theft_Types_Disabling_Status_RNW_" + i));
                setCurrentTermOverride(data.get("Vehicle_Details_Current_Term_Override_RNW_" + i), data.get("Vehicle_Details_Current_Term_Override_Value_RNW_" + i));
                verifyMarketValue(data.get("Vehicle_Details_Market_Value_Current_Term_RNW_" + i));
                verifyPrefillAnnualMileage(data.get("Vehicle_Details_Prefill_Annual_Mileage_RNW_" + i));
                verifyPrefillVersion(data.get("Vehicle_Details_Prefill_Version_RNW_" + i));
            }
            break;
            case "Golf Carts":
            case "All Terrain Vehicles":
            case "Dune Buggies":
            case "Snowmobiles":
            case "Recreational Trailer": {
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Motor Home": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setCustomOrAdditionalEquipment(data.get("Vehicle_Details_Does_The_Vehicle_Have_Custom_Or_Additional_Equipment_To_Be_Insured_RNW_" + i), data.get("Vehicle_Details_Additional_Coverage_For_Custom_Or_Additional_Equipment_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
            }
            break;
            case "Antique Collectors Car":
            case "Classic Collectors Car":
            case "Exotic Collectors Car": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setMarketValue(data.get("Vehicle_Details_Market_Value_RNW_" + i));
            }
            break;
            case "Motorcycles/Mopeds/Scooters": {
                setDrivenBy(data.get("Vehicle_Details_Driven_By_RNW_" + i), data, i);
                setAnnualMileage(data.get("Vehicle_Details_Annual_Mileage_RNW_" + i));
                setVehicleRegistered(data.get("Vehicle_Details_Is_This_Vehicle_Registered_In_RNW_" + i));
                setAgreedValueOfVehicle(data.get("Vehicle_Details_Agreed_Value_Of_Vehicle_RNW_" + i));
                setCostNew(data.get("Vehicle_Details_Cost_New_RNW_" + i));
                setEngineSize(data.get("Vehicle_Details_Engine_Size_RNW_" + i));
            }
            break;
        }
    }

    public void setAntiTheftDevices(String value) throws Throwable {
        checkCheckbox(antiTheftDevices, value, "Anti Theft Devices");
    }

    public void setCategoryI(String value) throws Throwable {
        checkCheckbox(categoryI, value, "Category I");
    }

    public void setCategoryII(String value) throws Throwable {
        checkCheckbox(categoryII, value, "Category II");
    }

    public void setCategoryIII(String value) throws Throwable {
        checkCheckbox(categoryIII, value, "Category III");
    }

    public void setCategoryIV(String value) throws Throwable {
        checkCheckbox(categoryIV, value, "Category IV");
    }

    public void setCategory1(String value) throws Throwable {
        checkCheckbox(category1, value, "Category 1");
    }

    public void setCategory2(String value) throws Throwable {
        checkCheckbox(category2, value, "Category 2");
    }

    public void setCategory3(String value) throws Throwable {
        checkCheckbox(category3, value, "Category 3");
    }

    public void setCategory4(String value) throws Throwable {
        checkCheckbox(category4, value, "Category 4");
    }

    public void setCategory5(String value) throws Throwable {
        checkCheckbox(category5, value, "Category 5");
    }

    public void setStoredInCarCondo(String value) throws Throwable {
        choose(storedInCarCondoYes, storedInCarCondoNo, value, "Stored in car condo");
    }

    public void setEnterInfoWithoutLookup(String s) throws Throwable {
        checkCheckbox(enterInfoWithoutLookup, s, "Enter Info Without Lookup");
    }

    public void setAlarmOnly(String s) throws Throwable {
        checkCheckbox(alarmOnly, s, "Alarm Only");
    }

    public void setActiveDisablingDevice2a(String s) throws Throwable {
        checkCheckbox(activeDisablingDevice2a, s, "Active Disabling Device 2a");
    }

    public void setActiveDisablingDevice2b(String s) throws Throwable {
        checkCheckbox(activeDisablingDevice2b, s, "Active Disabling Device 2b");
    }

    public void setActiveDisablingDevice2c(String s) throws Throwable {
        checkCheckbox(activeDisablingDevice2c, s, "Active Disabling Device 2c");
    }

    public void setPassiveDisablingDevice(String s) throws Throwable {
        checkCheckbox(passiveDisablingDevice, s, "Passive Disabling Device");
    }

    public void setAntiTheftDevice(String s) throws Throwable {
        checkCheckbox(antiTheftDevice, s, "Anti Theft Device");
    }

    public void setOtherAntiTheftDevice4a(String s) throws Throwable {
        checkCheckbox(otherAntiTheftDevice4a, s, "Other Anti Theft Device 4a");
    }

    public void setOtherAntiTheftDevice4b(String s) throws Throwable {
        checkCheckbox(otherAntiTheftDevice4b, s, "Other Anti Theft Device 4b");
    }

    public void setOtherAntiTheftDevice4c(String s) throws Throwable {
        checkCheckbox(otherAntiTheftDevice4c, s, "Other Anti Theft Device 4c");
    }

    public void setOtherAntiTheftDevice4d(String s) throws Throwable {
        checkCheckbox(otherAntiTheftDevice4d, s, "Other Anti Theft Device 4d");
    }

    public void setOtherAntiTheftDevicesLowJack4e(String s) throws Throwable {
        checkCheckbox(otherAntiTheftDevicesLowJack4e, s, "Other Anti Theft Devices Low Jack 4e");
    }

    public void setMotorcycleAccidentPrevention(String motorcycle_accident_prevention) throws Throwable {
        choose(motorcyclePreventionYes, motorcyclePreventionNo, motorcycle_accident_prevention);
    }

    public void setMotorcycleAccidentPreventionDate(String value) {
        typeTextEnter(motorcyclePreventionDate, value, "Motorcycle Accident Prevention Date");
    }

    public void setDrivenBy(String name, Map<String, String> data, int i) throws Throwable {
        if (hasValue(name)) {
            typeText(drivenBy, name);
        } else {
            typeTextEnter(drivenBy, data.get("First_Name") + " " + data.get("Last_Name"), "Driven By");
        }
    }

    public void setDrivenBy(String driver) {
        typeTextEnter(drivenBy, driver, "Driven By");
    }

    public void setAgreeToUsePureDirectRepairProgram(String yesOrNo) throws Throwable {
        try {
            pause(2000);
            choose(pureDirectRepairProgramYes, pureDirectRepairProgramNo, yesOrNo, "Agree To Use Pure Direct Repair Program");
            saveChanges();
        } catch (Exception e) {
        }
    }

    public void setGaragingCode(String value) throws Throwable {
        if (hasValue(value)) {
            garagingZIPCode.clear();
            //setAttributeValue(garagingZIPCode, "value", value);
            typeText(garagingZIPCode, value);
        }
    }

    public void setCustomOrAdditionalEquipment(String yesOrNo, String value) throws Throwable {
        clickBlock();
        choose(customOrAdditionalEquipmentToBeInsuredYes, customOrAdditionalEquipmentToBeInsuredNo, yesOrNo);
        if (hasValue(yesOrNo)) {
            if (yesOrNo.equalsIgnoreCase("Yes")) {
                setCoverageForAdditionalEquipment(value);
            }
        }
    }

    private void clickBlock() {
        clickElement(block, "Vehicle details block");
    }

    public void setCoverageForAdditionalEquipment(String value) throws Throwable {
        typeText(additionalCoverageForCustomEquipment, value);
    }

    public void setVehicleKeptInGarage(String value) throws Throwable {
        choose(keptInAGarageWithSecurityYes, keptInAGarageWithSecurityNo, value);
    }

    public void setSnowbirdVehicle(String value) throws Throwable {
        choose(snowbirdVehicleYes, snowbirdVehicleNo, value);
    }

    public void setVehicleRegistered(String value) throws Throwable {
        choose(vehicleRegisteredInStateYes, vehicleRegisteredInStateNo, value);
    }

    public void setWasTheVehiclePurchasedNew(String value, String date) throws Throwable {
        choose(vehiclePurchasedNewYes, vehiclePurchasedNewNo, value);
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            typeTextEnter(whenWasTheVehiclePurchased, date, "When Was The Vehicle Purchased");
        }
    }

    public void setAuxiliaryLightingDiscount(String value) throws Throwable {
        choose(auxiliaryLightingDiscountYes, auxiliaryLightingDiscountNo, value);
    }

    public void setVehicleVacationUse(String value) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'Vacation Use Vehicle')]/../../../..//label[text()='Yes']/..//input"))) {
            choose(vacationUseVehicleYes, vacationUseVehicleNo, value);
        } else if (isVisibleOnly(By.xpath("//div[contains(text(),'vacation use vehicle')]/../../../..//label[text()='Yes']/..//input"))) {
            choose(vacationUseVehicleLCYes, vacationUseVehicleLCNo, value);
        }
    }

    public void setVehicleInsureByAnotherPUREPolicy(String value) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'vehicle insured by another PURE policy')]/../../../..//label[text()='Yes']/..//input")))
            choose(vehicleInsureByAnotherPUREPolicyYes, vehicleInsureByAnotherPUREPolicyNo, value);
    }

    public void setVehicleUse(String value) throws Throwable {
        if (isElementDisplayed(vehicleUse, 2)) {
            typeText(vehicleUse, value);
        }
    }

    public void setStatedAmount(String value) throws Throwable {
        typeText(statedAmount, value);
    }

    public void setYearFirstLicensedToOperateMotorcycle(String s) throws Throwable {
        typeText(yearFirstLicensedToOperateMotorcycle, s);
    }

    public void setEstimatedAnnualMileage(String value) throws Throwable {
        pause(2000);
        try {
            typeText(estimatedAnnualMileage, value);
        } catch (Exception e) {
            try {
                typeText(estimatedAnnualMileageFont, value);
            } catch (Exception ee) {
                typeText(estimatedAnnualMileageFont2, value);
            }
        }
    }

    public void setAnnualMileage(String value) throws Throwable {
        pause(2000);
        try {
            typeTextEnter(annualMileage, value, "Annual Mileage");
        } catch (Exception e) {
            //
        }
    }

    public void setABS(String value) throws Throwable {
        checkCheckbox(ABS, value);
    }

    public void setPassiveRestraint(String value) throws Throwable {
        checkCheckbox(passiveRestraint, value);
    }

    public void setAirbag(String value) throws Throwable {
        checkCheckbox(airbag, value);
    }

    public void setVINEtching(String value) throws Throwable {
        checkCheckbox(VINEtching, value);
    }

    public void setVehicleRecovery(String value) throws Throwable {
        checkCheckbox(vehicleRecovery, value);
    }

    public void setDisablingDevice(String value, String status) throws Throwable {
        checkCheckbox(disablingDevice, value);
        pause(5000);
        if (hasValue(status)) {
            if (status.equalsIgnoreCase("Passive")) {
                if (isElementDisplayed(passive)) {
                    clickElement(passive);
                }
            } else {
                if (isElementDisplayed(active)) {
                    clickElement(active);
                }
            }
        }
    }

    public void setCurrentTermOverride(String yesOrNo, String value) throws Throwable {
        if (hasValue(value)) {
            try {
                if (isElementDisplayed(permanentOverride)) {
                    checkCheckbox(permanentOverride, yesOrNo);
                } else {
                    checkCheckbox(currentTermOverride, yesOrNo);
                }
                if (yesOrNo.equalsIgnoreCase("Yes")) {
                    setAgreedValueCurrentTerm(value);
                }
            } catch (Exception e) {
                //
            }
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void setAgreedValueCurrentTerm(String value) throws Throwable {
        typeText(agreedValueCurrentTerm, value);
    }

    public void setAgreedValueOfVehicle(String value) throws Throwable {
        if (hasValue(value)) {
            if (isElementDisplayed(agreedValueOfVehicle)) {
                typeText(agreedValueOfVehicle, value);
            }
        }
    }

    public void setMarketValue(String value) throws Throwable {
        try {
            String val = marketValue.getAttribute("value");
            if (!hasValue(val) || val.equalsIgnoreCase("$ 0.00") || val.equalsIgnoreCase("0") || val.equalsIgnoreCase("")) {
                typeText(marketValue, value);
            }
        } catch (Exception e) {
        }
    }

    public void setMileageBandYear(String value) throws Throwable {
        if (isElementDisplayed(mileageBandYear)) {
            typeText(mileageBandYear, value);
            setAttributeValue(mileageBandYear, "value", value);
        } else if (isElementDisplayed(estimatedAnnualMileageFont)) {
            typeText(estimatedAnnualMileageFont, value);
        } else if (isElementDisplayed(estimatedAnnualMileageFont2)) {
            typeText(estimatedAnnualMileageFont2, value);
        }
    }

    public void setCostNew(String value) throws Throwable {
        typeText(costNew, value);
    }

    public void setEngineSize(String value) throws Throwable {
        typeText(engineSize, value);
    }

    public void setAgreedValue(String value) throws Throwable {
        String val = agreedValue.getAttribute("value");
        if (!hasValue(val) || val.equalsIgnoreCase("$ 0.00") || val.equalsIgnoreCase("0") || val.equalsIgnoreCase("")) {
            typeText(agreedValue, value);
        }
    }

    public void setPremiumTownCode(String value) throws Throwable {
        typeText(premiumTownCode, value);
        setAttributeValue(premiumTownCode, "value", value);
    }

    public void setMotorcycleTrainingCourse(String s) throws Throwable {
        choose(motorcycleTrainingCourseYes, motorcycleTrainingCourseNo, s);
    }

    public void setMotorcycleTrainingCourseCompletionDate(String s) throws Throwable {
        typeText(motorcycleTrainingCourseCompletionDate, s);
    }

    public void verifyPrefillAnnualMileage() {
        if (driver.findElements(By.xpath("//div[contains(text(),'Prefill Annual Mileage')]/../../../..//input")).size() > 0) {
            //First mandatory check, if service unavailable message is displayed then fail the test
            if (driver.findElements(By.xpath("//*[contains(text(),'Third party mileage service is currently unavailable')]")).size() > 0)
                Assert.fail("Carfax is unavailable");
            reportScreenshot("AnnualMileage_" + System.currentTimeMillis(), "Annual Mileage");
        }
    }

    public void verifyNada(String value) {
        verifyAgreedValueCurrentTerm(value);
    }

    public void verifyCarfax() {
        verifyPrefillAnnualMileage();
    }

    public void verifyCarfax(DataTable table, String type) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        if (type.equalsIgnoreCase("PrivatePassenger")) {
            for (List<String> columns : rows) {
                String estimatedAnnualMileageVal = columns.get(0);
                String prefillAnnualMileageVal = columns.get(1);
                String prefillVersionVal = columns.get(2);
                String agreedValueCurrentTermVal = columns.get(3);
                String marketValueCurrentTermVal = columns.get(4);
                if (isElementDisplayed(estimatedAnnualMileage)) {
                    assertCellValue(estimatedAnnualMileage, estimatedAnnualMileageVal, "Estimated Annual Mileage");
                } else if (isElementDisplayed(estimatedAnnualMileageFont)) {
                    assertCellValue(estimatedAnnualMileageFont, estimatedAnnualMileageVal, "Estimated Annual Mileage");
                }
                assertCellValue(prefillAnnualMileage, prefillAnnualMileageVal, "Prefill Annual Mileage");
                assertCellValue(prefillVersion, prefillVersionVal, "Prefill Version");
                assertCellValue(agreedValueCurrentTerm, agreedValueCurrentTermVal, "Agreed Value Current Term");
                assertCellValue(marketValueCurrentTerm, marketValueCurrentTermVal, "Market Value Current Term");
            }
        } else {
            for (List<String> columns : rows) {
                String estimatedAnnualMileageVal = columns.get(0);
                String prefillAnnualMileageVal = columns.get(1);
                String prefillVersionVal = columns.get(2);
                String agreedValueOfVehicleVal = columns.get(3);
                String originalAgreedValueVal = columns.get(4);

                assertCellValue(estimatedAnnualMileage, estimatedAnnualMileageVal, "Estimated Annual Mileage");
                assertCellValue(prefillAnnualMileage, prefillAnnualMileageVal, "Prefill Annual Mileage");
                assertCellValue(prefillVersion, prefillVersionVal, "Prefill Version");
                assertCellValue(agreedValueOfVehicle, agreedValueOfVehicleVal, "Agreed Value Of Vehicle");
                assertCellValue(originalAgreedValue, originalAgreedValueVal, "Original Agreed Value");
            }
        }
        reportScreenshot("Carfax_" + System.currentTimeMillis(), "Carfax");
    }

    public void verifyAgreedValueCurrentTerm(String value) {
        assertCellValue(agreedValueCurrentTerm, value, "Agreed Value Current Term");
    }

    public void verifyPrefillAnnualMileage(String value) {
        assertCellValue(prefillAnnualMileage, value, "Prefill Annual Mileage");
    }

    public void verifyPrefillVersion(String value) {
        assertCellValue(prefillVersion, value, "Prefill Version");
    }

    public void verifyMarketValue(String value) {
        assertCellValue(currentTermMarketValue, value, "Current Term Market Value");
    }

    public void setPermanentOverride(String yesOrNo, String value) throws Throwable {
        if (hasValue(value)) {
            checkCheckbox(permanentOverride, yesOrNo);
            if (yesOrNo.equalsIgnoreCase("Yes")) {
                setAgreedValueCurrentTerm(value);
            }
        }

    }

    public void verifyMessage(String text) {
        assertEquals(driver.findElement(By.xpath("//div[text()='" + text + "']")).getText(), text, "Message");
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='" + text + "']")).isDisplayed());
        reportScreenshot("Message_" + System.currentTimeMillis(), "Message");
    }

    public void verifyMessageNotExists(String text) {
        Assert.assertTrue(driver.findElements(By.xpath("//div[text()='" + text + "']")).size() < 1);
        reportScreenshot("Message_" + System.currentTimeMillis(), "Message");
    }

    public void setMobileDeviceControl(String value) throws Throwable {
        pause(3000);
        if (hasValue(value))
            if (isElementDisplayed(mobileDeviceControlYes) || isElementDisplayed(mobileDeviceControlNo)) {
                choose(mobileDeviceControlYes, mobileDeviceControlNo, value);
            }
    }
}
