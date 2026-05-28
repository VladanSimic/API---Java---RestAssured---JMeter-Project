package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class AdditionalVehiclesBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public AdditionalVehiclesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='additional vehicles']/../../../../../..//span[text()='delete']")
    List<WebElement> deleteVehicle;
    @FindBy(xpath = "//div[text()='Vehicle Type']/../../../..//input[@aria-hidden=\"false\"]")
    List<WebElement> vehicleType;
    @FindBy(xpath = "//div[text()='Year']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> year;
    @FindBy(xpath = "//div[text()='Make']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> make;
    @FindBy(xpath = "//div[text()='Model']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> model;
    @FindBy(xpath = "//div[text()='Short VIN']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> shortVIN;
    @FindBy(xpath = "//div[text()='VIN']/../../../..//input[@aria-hidden='false']")
    List<WebElement> VIN;
    @FindBy(xpath = "//div[text()='Trim Level']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> trimLevel;
    @FindBy(xpath = "//div[text()='VIN Override']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> VINOverride;
    @FindBy(xpath = "//div[contains(text(),'additional vehicles')]/../../../../../..//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[contains(text(),'additional vehicles')]")
    WebElement additionalVehiclesBlock;
    @FindBy(xpath = "//div[text()='additional operators']")
    WebElement additionalOperatorsBlock;
    @FindBy(xpath = "//div[text()='Body Type']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> bodyType;
    @FindBy(xpath = "//div[text()='Exclude']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> excludeCheckbox;
    @FindBy(xpath = "//div[text()='Hi-Performance (UW-Only)']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> highPerformance;
    @FindBy(xpath = "//div[text()='Hi-Performance Override (UW Only)']/../../../../div//input[@aria-hidden=\"false\"]")
    List<WebElement> highPerformanceOverride;

    public void fillAdditionalVehiclesDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("additional vehicles");
        String[] additionalVehicles = data.get("Additional_Vehicles").split(",");

        for (int i = 1; i <= additionalVehicles.length; i++) {
            String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_" + i);

            addVehicle();
            pause(5000);

            if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                setVINOverride(data.get("Vehicle_Details_VIN_Override_" + i), i - 1);
                saveChanges();
            }

            setVIN(data.get("Vehicle_Details_VIN_Number_" + i), i - 1);
            pause(5000);

            setVehicleType(vehicleTypeValue, i - 1);

            if (data.get("Vehicle_Details_VIN_Override_" + i).equalsIgnoreCase("Yes") || !vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                setYear(data.get("Vehicle_Details_Year_" + i), i - 1);
                setMake(data.get("Vehicle_Details_Make_" + i), i - 1);
                setModel(data.get("Vehicle_Details_Model_" + i), i - 1);
            }

            if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                setTrimLevel(data.get("Vehicle_Details_Trim_Level_" + i), i - 1);
            } else {
                if (data.get("State").equalsIgnoreCase("NC") &&
                        (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_" + i), i - 1);
                }
            }
            clickFooter();

            if (!VIN.get(i - 1).getAttribute("value").equalsIgnoreCase(data.get("Vehicle_Details_VIN_Number_" + i))) {
                setVIN(data.get("Vehicle_Details_VIN_Number_" + i), i - 1);
                saveChanges();
            }

            if (!vehicleType.get(i - 1).getAttribute("value").equalsIgnoreCase(data.get("Vehicle_Details_Vehicle_Type_" + i))) {
                setVehicleType(vehicleTypeValue, i - 1);
                saveChanges();
            }

            if (data.get("Vehicle_Details_VIN_Override_" + i).equalsIgnoreCase("Yes") || !vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                setYear(data.get("Vehicle_Details_Year_" + i), i - 1);
                setMake(data.get("Vehicle_Details_Make_" + i), i - 1);
                setModel(data.get("Vehicle_Details_Model_" + i), i - 1);
                setVIN(data.get("Vehicle_Details_VIN_Number_" + i), i - 1);
            }
            setVIN(data.get("Vehicle_Details_VIN_Number_" + i), i - 1);
            clickFooter();
        }
    }

    public void fillAdditionalVehiclesDetailsPA_END(Map<String, String> data) throws Throwable {
        String[] vehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] vehiclesEND = data.get("Additional_Vehicles_END").split(",");

//        //Modify vehicles
//        for (int i = 1; i <= vehiclesEND.length; i++) {
//            if (vehiclesEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < vehiclesNB.length; j++){
//                    if(vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i-1].split("_MOD")[0])){
//                        if (data.get("Vehicle_Details_Vehicle_Type_END_" + i).equalsIgnoreCase("Private Passenger")) {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Details_Vehicle_Type_END_" + i), j);
//                            setVINOverride(data.get("Vehicle_Details_VIN_Override_END_" + i), j);
//                            setYear(data.get("Vehicle_Details_Year_END_" + i), j);
//                            setMake(data.get("Vehicle_Details_Make_END_" + i), j);
//                            setModel(data.get("Vehicle_Details_Model_END_" + i), j);
//                            setShortVIN(data.get("Vehicle_Details_ShortVIN_END_" + i), j);
//                            setVIN(data.get("Vehicle_Details_VIN_Number_END_" + i), j);
//                            saveChanges();
//                            setTrimLevel(data.get("Vehicle_Details_Trim_Level_END_" + i), j);
//                            saveChanges();
//                        } else {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Details_Vehicle_Type_END_" + i), j);
//                            setYear(data.get("Vehicle_Details_Year_END_" + i), j);
//                            setMake(data.get("Vehicle_Details_Make_END_" + i), j);
//                            setModel(data.get("Vehicle_Details_Model_END_" + i), j);
//                            saveChanges();
//                        }
//                    }
//                }
//            }
//        }

        int totalCount = vehiclesNB.length;
        //Add vehicles
        for (int i = 1; i <= vehiclesEND.length; i++) {
            if (vehiclesEND[i - 1].contains("_ADD")) {
                String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_END_" + i);

                addVehicle();
                pause(5000);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setVINOverride(data.get("Vehicle_Details_VIN_Override_END_" + i), totalCount);
                }

                setVIN(data.get("Vehicle_Details_VIN_Number_END_" + i), totalCount);
                pause(5000);

                setVehicleType(vehicleTypeValue, totalCount);
                if (data.get("Vehicle_Details_VIN_Override_END_" + i).equalsIgnoreCase("Yes") || !vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setYear(data.get("Vehicle_Details_Year_END_" + i), totalCount);
                    setMake(data.get("Vehicle_Details_Make_END_" + i), totalCount);
                    setModel(data.get("Vehicle_Details_Model_END_" + i), totalCount);
                }
                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_END_" + i), totalCount);
                } else {
                    if (data.get("State").equalsIgnoreCase("NC") &&
                            (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                    || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                    || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                        setTrimLevel(data.get("Vehicle_Details_Trim_Level_END_" + i), totalCount);
                    }
                }
                clickFooter();

                if (!VIN.get(i - 1).getAttribute("value").equalsIgnoreCase(data.get("Vehicle_Details_VIN_Number_END_" + i))) {
                    setVIN(data.get("Vehicle_Details_VIN_Number_END_" + i), totalCount);
                    clickFooter();
                }
                if (data.get("Vehicle_Details_VIN_Override_END_" + i).equalsIgnoreCase("Yes") || !vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setYear(data.get("Vehicle_Details_Year_END_" + i), totalCount);
                    setMake(data.get("Vehicle_Details_Make_END_" + i), totalCount);
                    setModel(data.get("Vehicle_Details_Model_END_" + i), totalCount);
                }
                clickFooter();
                saveChanges();

                totalCount++;
            }
        }

//        //Delete vehicles
//        for (int i = 0; i < vehiclesEND.length; i++) {
//            if (vehiclesEND[i].contains("_DEL")) {
//                for (int j = 0; j < vehiclesNB.length; j++) {
//                    if (vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i].split("_DEL")[0])) {
//                        clickElement(deleteVehicle.get(j));
//                    }
//                }
//            }
//        }
    }

    public void fillAdditionalVehiclesDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");
        String[] additionalVehiclesRNW = data.get("Additional_Vehicles_RNW").split(",");
        String[] additionalVehiclesOOSEND = data.get("Additional_Vehicles_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalVehiclesNB.length;

        //If there was END transaction and it happened before OOS add END to the total count
        if (endPosition > -1 && endPosition < oosPosition) {
            for (String s : additionalVehiclesEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was RNW transaction and it happened before OOS add RNW to the total count
        if (rnwPosition > -1 && rnwPosition < oosPosition) {
            for (String s : additionalVehiclesRNW) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add vehicles
        for (int i = 1; i <= additionalVehiclesOOSEND.length; i++) {
            if (additionalVehiclesOOSEND[i - 1].contains("_ADD")) {
                String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i);

                addVehicle();
                pause(5000);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setVINOverride(data.get("Vehicle_Details_VIN_Override_OOS_END_" + i), totalCount);
                }

                setVIN(data.get("Vehicle_Details_VIN_Number_OOS_END_" + i), totalCount);
                pause(5000);

                setVehicleType(vehicleTypeValue, totalCount);

                setYear(data.get("Vehicle_Details_Year_OOS_END_" + i), totalCount);
                setMake(data.get("Vehicle_Details_Make_OOS_END_" + i), totalCount);
                setModel(data.get("Vehicle_Details_Model_OOS_END_" + i), totalCount);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_OOS_END_" + i), totalCount);
                } else {
                    if (data.get("State").equalsIgnoreCase("NC") &&
                            (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                    || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                    || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                        setTrimLevel(data.get("Vehicle_Details_Trim_Level_OOS_END_" + i), totalCount);
                    }
                }
                clickFooter();

                if (!VIN.get(i - 1).getAttribute("value").equalsIgnoreCase(data.get("Vehicle_Details_VIN_Number_OOS_END_" + i))) {
                    setVIN(data.get("Vehicle_Details_VIN_Number_OOS_END_" + i), totalCount);
                    saveChanges();
                }

                setYear(data.get("Vehicle_Details_Year_OOS_END_" + i), totalCount);
                setMake(data.get("Vehicle_Details_Make_OOS_END_" + i), totalCount);
                setModel(data.get("Vehicle_Details_Model_OOS_END_" + i), totalCount);

                clickFooter();

                totalCount++;
            }
        }

//        Modify vehicles
//        for (int i = 1; i <= vehiclesEND.length; i++) {
//            if (vehiclesEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < vehiclesNB.length; j++){
//                    if(vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i-1].split("_MOD")[0])){
//                        if (data.get("Vehicle_Type_END_" + i).equalsIgnoreCase("Private Passenger")) {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_END_" + i), j);
//                            setVINOverride(data.get("Vehicle_VIN_Override_END_" + i), j);
//                            setYear(data.get("Vehicle_Year_END_" + i), j);
//                            setMake(data.get("Vehicle_Make_END_" + i), j);
//                            setModel(data.get("Vehicle_Model_END_" + i), j);
//                            setShortVIN(data.get("Vehicle_ShortVIN_END_" + i), j);
//                            setVIN(data.get("Vehicle_VIN_END_" + i), j);
//                            saveChanges();
//                            setTrimLevel(data.get("Vehicle_TrimLevel_END_" + i), j);
//                            saveChanges();
//                        } else {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_END_" + i), j);
//                            setYear(data.get("Vehicle_Year_END_" + i), j);
//                            setMake(data.get("Vehicle_Make_END_" + i), j);
//                            setModel(data.get("Vehicle_Model_END_" + i), j);
//                            saveChanges();
//                        }
//                    }
//                }
//            }
//        }
//
//        Delete vehicles
//        for (int i = 0; i < vehiclesEND.length; i++) {
//            if (vehiclesEND[i].contains("_DEL")) {
//                for (int j = 0; j < vehiclesNB.length; j++) {
//                    if (vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i].split("_DEL")[0])) {
//                        clickElement(deleteVehicle.get(j));
//                    }
//                }
//            }
//        }

        //TODO PA OOS - Additional vehicles - Modification and Deletion - Mid
    }

    public void fillAdditionalVehiclesDetailsPA_RNW(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");
        String[] additionalVehiclesRNW = data.get("Additional_Vehicles_RNW").split(",");
        String[] additionalVehiclesOOSEND = data.get("Additional_Vehicles_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalVehiclesNB.length;

        //If there was END transaction and it happened before RNW add END to the total count
        if (endPosition > -1 && endPosition < rnwPosition) {
            for (String s : additionalVehiclesEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was OOS transaction and it happened before RNW add OOS to the total count
        if (oosPosition > -1 && oosPosition < rnwPosition) {
            for (String s : additionalVehiclesOOSEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add vehicles
        for (int i = 1; i <= additionalVehiclesRNW.length; i++) {
            if (additionalVehiclesRNW[i - 1].contains("_ADD")) {
                String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_RNW_" + i);

                addVehicle();
                pause(5000);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setVINOverride(data.get("Vehicle_Details_VIN_Override_RNW_" + i), totalCount);
                }

                setVIN(data.get("Vehicle_Details_VIN_Number_RNW_" + i), totalCount);
                pause(5000);

                setVehicleType(vehicleTypeValue, totalCount);
                if (data.get("Vehicle_Details_VIN_Override_RNW_" + i).equalsIgnoreCase("Yes") || !vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setYear(data.get("Vehicle_Details_Year_RNW_" + i), totalCount);
                    setMake(data.get("Vehicle_Details_Make_RNW_" + i), totalCount);
                    setModel(data.get("Vehicle_Details_Model_RNW_" + i), totalCount);
                }
                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_RNW_" + i), totalCount);
                } else {
                    if (data.get("State").equalsIgnoreCase("NC") &&
                            (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                    || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                    || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                        setTrimLevel(data.get("Vehicle_Details_Trim_Level_RNW_" + i), totalCount);
                    }
                }
                clickFooter();

                if (!VIN.get(i - 1).getAttribute("value").equalsIgnoreCase(data.get("Vehicle_Details_VIN_Number_RNW_" + i))) {
                    setVIN(data.get("Vehicle_Details_VIN_Number_RNW_" + i), totalCount);
                    saveChanges();
                }
                if (data.get("Vehicle_Details_VIN_Override_RNW_" + i).equalsIgnoreCase("Yes") || !vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setYear(data.get("Vehicle_Details_Year_RNW_" + i), totalCount);
                    setMake(data.get("Vehicle_Details_Make_RNW_" + i), totalCount);
                    setModel(data.get("Vehicle_Details_Model_RNW_" + i), totalCount);
                }
                clickFooter();
                totalCount++;
            }
        }

//        Modify vehicles
//        for (int i = 1; i <= vehiclesEND.length; i++) {
//            if (vehiclesEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < vehiclesNB.length; j++){
//                    if(vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i-1].split("_MOD")[0])){
//                        if (data.get("Vehicle_Type_RNW_" + i).equalsIgnoreCase("Private Passenger")) {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_RNW_" + i), j);
//                            setVINOverride(data.get("Vehicle_VIN_Override_RNW_" + i), j);
//                            setYear(data.get("Vehicle_Year_RNW_" + i), j);
//                            setMake(data.get("Vehicle_Make_RNW_" + i), j);
//                            setModel(data.get("Vehicle_Model_RNW_" + i), j);
//                            setShortVIN(data.get("Vehicle_ShortVIN_RNW_" + i), j);
//                            setVIN(data.get("Vehicle_VIN_RNW_" + i), j);
//                            saveChanges();
//                            setTrimLevel(data.get("Vehicle_TrimLevel_RNW_" + i), j);
//                            saveChanges();
//                        } else {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_RNW_" + i), j);
//                            setYear(data.get("Vehicle_Year_RNW_" + i), j);
//                            setMake(data.get("Vehicle_Make_RNW_" + i), j);
//                            setModel(data.get("Vehicle_Model_RNW_" + i), j);
//                            saveChanges();
//                        }
//                    }
//                }
//            }
//        }
//
//        Delete vehicles
//        for (int i = 0; i < vehiclesEND.length; i++) {
//            if (vehiclesEND[i].contains("_DEL")) {
//                for (int j = 0; j < vehiclesNB.length; j++) {
//                    if (vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i].split("_DEL")[0])) {
//                        clickElement(deleteVehicle.get(j));
//                    }
//                }
//            }
//        }
//        TODO PA RNW - Additional vehicles - Modification and Deletion - Mid
    }

    public void fillAdditionalVehiclesDetailsPACarfax(Map<String, String> data) throws Throwable {
        String[] additionalVehicles = data.get("Additional_Vehicles").split(",");

        for (int i = 1; i <= additionalVehicles.length; i++) {
            addVehicle();
            pause(5000);

            String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_" + i);

            if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                setVINOverride(data.get("Vehicle_Details_VIN_Override_" + i), i - 1);
                saveChanges();
            }

            setVIN(data.get("Vehicle_Details_VIN_Number_" + i), i - 1);
            saveChanges();

            setVehicleType(vehicleTypeValue, i - 1);
            saveChanges();

            if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                setTrimLevel(data.get("Vehicle_Details_Trim_Level_" + i), i - 1);
            } else {
                if (data.get("State").equalsIgnoreCase("NC") &&
                        (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_" + i), i - 1);
                }
            }

            saveChanges();
        }
    }

    public void fillAdditionalVehiclesDetailsPACarfax_END(Map<String, String> data) throws Throwable {
        String[] vehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] vehiclesEND = data.get("Additional_Vehicles_END").split(",");

        int totalCount = vehiclesNB.length;
        //Add vehicles
        for (int i = 1; i <= vehiclesEND.length; i++) {
            if (vehiclesEND[i - 1].contains("_ADD")) {
                String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_END_" + i);

                addVehicle();
                pause(5000);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setVINOverride(data.get("Vehicle_Details_VIN_Override_END_" + i), totalCount);
                }

                setVIN(data.get("Vehicle_Details_VIN_Number_END_" + i), totalCount);
                pause(5000);

                setVehicleType(vehicleTypeValue, totalCount);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_END_" + i), totalCount);
                } else {
                    if (data.get("State").equalsIgnoreCase("NC") &&
                            (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                    || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                    || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                        setTrimLevel(data.get("Vehicle_Details_Trim_Level_END_" + i), totalCount);
                    }
                }

                saveChanges();
                totalCount++;
            }
        }

//        //Delete vehicles
//        for (int i = 0; i < vehiclesEND.length; i++) {
//            if (vehiclesEND[i].contains("_DEL")) {
//                for (int j = 0; j < vehiclesNB.length; j++) {
//                    if (vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i].split("_DEL")[0])) {
//                        clickElement(deleteVehicle.get(j));
//                    }
//                }
//            }
//        }
    }

    public void fillAdditionalVehiclesDetailsPACarfax_RNW(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");
        String[] additionalVehiclesRNW = data.get("Additional_Vehicles_RNW").split(",");
        String[] additionalVehiclesOOSEND = data.get("Additional_Vehicles_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalVehiclesNB.length;

        //If there was END transaction and it happened before RNW add END to the total count
        if (endPosition > -1 && endPosition < rnwPosition) {
            for (String s : additionalVehiclesEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was OOS transaction and it happened before RNW add OOS to the total count
        if (oosPosition > -1 && oosPosition < rnwPosition) {
            for (String s : additionalVehiclesOOSEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //Add vehicles
        for (int i = 1; i <= additionalVehiclesRNW.length; i++) {
            if (additionalVehiclesRNW[i - 1].contains("_ADD")) {
                String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_RNW_" + i);

                addVehicle();
                pause(5000);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setVINOverride(data.get("Vehicle_Details_VIN_Override_RNW_" + i), totalCount);
                }

                setVIN(data.get("Vehicle_Details_VIN_Number_RNW_" + i), totalCount);
                pause(5000);

                setVehicleType(vehicleTypeValue, totalCount);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_RNW_" + i), totalCount);
                } else {
                    if (data.get("State").equalsIgnoreCase("NC") &&
                            (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                    || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                    || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                        setTrimLevel(data.get("Vehicle_Details_Trim_Level_RNW_" + i), totalCount);
                    }
                }

                saveChanges();
                totalCount++;
            }
        }

//        Modify vehicles
//        for (int i = 1; i <= vehiclesEND.length; i++) {
//            if (vehiclesEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < vehiclesNB.length; j++){
//                    if(vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i-1].split("_MOD")[0])){
//                        if (data.get("Vehicle_Type_RNW_" + i).equalsIgnoreCase("Private Passenger")) {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_RNW_" + i), j);
//                            setVINOverride(data.get("Vehicle_VIN_Override_RNW_" + i), j);
//                            setYear(data.get("Vehicle_Year_RNW_" + i), j);
//                            setMake(data.get("Vehicle_Make_RNW_" + i), j);
//                            setModel(data.get("Vehicle_Model_RNW_" + i), j);
//                            setShortVIN(data.get("Vehicle_ShortVIN_RNW_" + i), j);
//                            setVIN(data.get("Vehicle_VIN_RNW_" + i), j);
//                            saveChanges();
//                            setTrimLevel(data.get("Vehicle_TrimLevel_RNW_" + i), j);
//                            saveChanges();
//                        } else {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_RNW_" + i), j);
//                            setYear(data.get("Vehicle_Year_RNW_" + i), j);
//                            setMake(data.get("Vehicle_Make_RNW_" + i), j);
//                            setModel(data.get("Vehicle_Model_RNW_" + i), j);
//                            saveChanges();
//                        }
//                    }
//                }
//            }
//        }
//
//        Delete vehicles
//        for (int i = 0; i < vehiclesEND.length; i++) {
//            if (vehiclesEND[i].contains("_DEL")) {
//                for (int j = 0; j < vehiclesNB.length; j++) {
//                    if (vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i].split("_DEL")[0])) {
//                        clickElement(deleteVehicle.get(j));
//                    }
//                }
//            }
//        }
//        TODO PA RNW - Additional vehicles - Modification and Deletion - Mid
    }

    public void fillAdditionalVehiclesDetailsPACarfax_OOS_END(Map<String, String> data) throws Throwable {
        String[] transactions = data.get("Transactions").split(",");

        String[] additionalVehiclesNB = data.get("Additional_Vehicles").split(",");
        String[] additionalVehiclesEND = data.get("Additional_Vehicles_END").split(",");
        String[] additionalVehiclesRNW = data.get("Additional_Vehicles_RNW").split(",");
        String[] additionalVehiclesOOSEND = data.get("Additional_Vehicles_OOS_END").split(",");

        int endPosition = getPosition(transactions, "END");
        int oosPosition = getPosition(transactions, "OOS");
        int rnwPosition = getPosition(transactions, "RNW");

        //Total count starts as NB count
        int totalCount = additionalVehiclesNB.length;

        //If there was END transaction and it happened before OOS add END to the total count
        if (endPosition > -1 && endPosition < oosPosition) {
            for (String s : additionalVehiclesEND) {
                if (s.contains("_ADD")) {
                    totalCount++;
                }
            }
        }

        //If there was RNW transaction and it happened before OOS add RNW to the total count
//        if(rnwPosition >-1 && rnwPosition<oosPosition){
//            for (String s : additionalVehiclesRNW) {
//                if (s.contains("_ADD")) {
//                    totalCount++;
//                }
//            }
//        }

        //Add vehicles
        for (int i = 1; i <= additionalVehiclesOOSEND.length; i++) {
            if (additionalVehiclesOOSEND[i - 1].contains("_ADD")) {
                String vehicleTypeValue = data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i);

                addVehicle();
                pause(5000);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setVINOverride(data.get("Vehicle_Details_VIN_Override_OOS_END_" + i), totalCount);
                }

                setVIN(data.get("Vehicle_Details_VIN_Number_OOS_END_" + i), totalCount);
                pause(5000);

                setVehicleType(vehicleTypeValue, totalCount);

                if (vehicleTypeValue.equalsIgnoreCase("Private Passenger")) {
                    setTrimLevel(data.get("Vehicle_Details_Trim_Level_OOS_END_" + i), totalCount);
                } else {
                    if (data.get("State").equalsIgnoreCase("NC") &&
                            (vehicleTypeValue.equalsIgnoreCase("Antique Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Classic Collectors Car")
                                    || vehicleTypeValue.equalsIgnoreCase("Golf Carts")
                                    || vehicleTypeValue.equalsIgnoreCase("Motorcycles/Mopeds/Scooters")
                                    || vehicleTypeValue.equalsIgnoreCase("Travel Trailer"))) {
                        setTrimLevel(data.get("Vehicle_Details_Trim_Level_OOS_END_" + i), totalCount);
                    }
                }

                saveChanges();
                totalCount++;
            }
        }

//        Modify vehicles
//        for (int i = 1; i <= vehiclesEND.length; i++) {
//            if (vehiclesEND[i-1].contains("_MOD")) {
//                for(int j = 0; j < vehiclesNB.length; j++){
//                    if(vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i-1].split("_MOD")[0])){
//                        if (data.get("Vehicle_Type_END_" + i).equalsIgnoreCase("Private Passenger")) {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_END_" + i), j);
//                            setVINOverride(data.get("Vehicle_VIN_Override_END_" + i), j);
//                            setYear(data.get("Vehicle_Year_END_" + i), j);
//                            setMake(data.get("Vehicle_Make_END_" + i), j);
//                            setModel(data.get("Vehicle_Model_END_" + i), j);
//                            setShortVIN(data.get("Vehicle_ShortVIN_END_" + i), j);
//                            setVIN(data.get("Vehicle_VIN_END_" + i), j);
//                            saveChanges();
//                            setTrimLevel(data.get("Vehicle_TrimLevel_END_" + i), j);
//                            saveChanges();
//                        } else {
//                            pause(5000);
//                            setVehicleType(data.get("Vehicle_Type_END_" + i), j);
//                            setYear(data.get("Vehicle_Year_END_" + i), j);
//                            setMake(data.get("Vehicle_Make_END_" + i), j);
//                            setModel(data.get("Vehicle_Model_END_" + i), j);
//                            saveChanges();
//                        }
//                    }
//                }
//            }
//        }
//
//        Delete vehicles
//        for (int i = 0; i < vehiclesEND.length; i++) {
//            if (vehiclesEND[i].contains("_DEL")) {
//                for (int j = 0; j < vehiclesNB.length; j++) {
//                    if (vehiclesNB[j].equalsIgnoreCase(vehiclesEND[i].split("_DEL")[0])) {
//                        clickElement(deleteVehicle.get(j));
//                    }
//                }
//            }
//        }

        //TODO PA OOS - Additional vehicles - Modification and Deletion - Mid
    }

    public void deleteVehicle(int index) throws Throwable {
        clickElement(deleteVehicle.get(index));
    }

    public void addVehicle() throws Throwable {
     /*   try {
            clickElement(additionalOperatorsBlock);
            clickElement(add);
        } catch (Exception e) {
            clickElement(add);
        }*/
        if (isElementDisplayed(additionalOperatorsBlock, 5)) {
            clickElement(additionalOperatorsBlock);
            clickElement(add);
        } else {
            clickElement(add);
        }
    }

    public void setVehicleType(String vehicleTypeValue, int index) throws Throwable {
        if (hasValue(vehicleTypeValue) && !vehicleType.get(index).getAttribute("value").equalsIgnoreCase(vehicleTypeValue)) {
            clickElement(additionalVehiclesBlock);
            pause(2000);
            typeTextEnter(vehicleType.get(index), vehicleTypeValue, "Vehicle Type " + index);
            pause(2000);
            clickFooter();
            pause(2000);
        }
    }

    public void setYear(String yearValue, int index) throws Throwable {
        if (hasValue(yearValue) && !year.get(index).getAttribute("value").equalsIgnoreCase(yearValue)) {
            clickElement(additionalVehiclesBlock);
            typeText(year.get(index), yearValue, "Year");
            if (!year.get(index).getText().equalsIgnoreCase(yearValue)) {
                setAttributeValue(year.get(index), "value", yearValue);
            }
            pause(3000);
            clickFooter();
        }
    }

    public void setMake(String makeValue, int index) throws Throwable {
        if (hasValue(makeValue) &&
                !make.get(index).getAttribute("value").equalsIgnoreCase(makeValue)) {
            try {
                pause(2000);
                clickElement(additionalVehiclesBlock);
                make.get(index).clear();
                make.get(index).sendKeys(makeValue);
                make.get(index).sendKeys(Keys.ENTER);
                clickElement(additionalVehiclesBlock);
                clickFooter();
            } catch (Exception e) {
                clickElement(additionalVehiclesBlock);
                make.get(index).click();
                pause(3000);
                driver.findElement(By.xpath("//li[text()='" + makeValue + "']")).click();
                pause(3000);
                clickElement(additionalVehiclesBlock);
                clickFooter();
            }
        }
    }

    public void setModel(String modelValue, int index) throws Throwable {
        if (hasValue(modelValue) &&
                !model.get(index).getAttribute("value").equalsIgnoreCase(modelValue)) {
            try {
                clickElement(additionalVehiclesBlock);
                model.get(index).clear();
                model.get(index).sendKeys(modelValue);
                model.get(index).sendKeys(Keys.ENTER);
                clickElement(additionalVehiclesBlock);
                clickFooter();
            } catch (Exception e) {
                clickElement(additionalVehiclesBlock);
                model.get(index).click();
                pause(3000);
                driver.findElement(By.xpath("//li[text()='" + modelValue + "']")).click();
                pause(3000);
                clickElement(additionalVehiclesBlock);
                clickFooter();
            }
        }
    }

    public void setShortVIN(String shortVINValue, int index) throws Throwable {
        if (hasValue(shortVINValue) &&
                !shortVIN.get(index).getAttribute("value").equalsIgnoreCase(shortVINValue)) {
            clickElement(additionalVehiclesBlock);
            pause(2000);
            clickElementJS(shortVIN.get(index));
            shortVIN.get(index).clear();
            shortVIN.get(index).sendKeys(shortVINValue);
            shortVIN.get(index).sendKeys(Keys.ENTER);
            pause(3000);
            clickElement(additionalVehiclesBlock);
            pause(3000);
        } else {
//            clickElement(additionalVehiclesBlock);
//            pause(2000);
//            shortVIN.get(index).click();
//            pause(2000);
//            clickElementJS(driver.findElement(By.xpath("//ul[@aria-hidden='false']/li[2]")));
        }
    }

    public void setVIN(String VINValue, int index) throws Throwable {
        pause(5000);
        if (hasValue(VINValue) && VIN.get(index).getText() != null || !VIN.get(index).getText().equals("")) {
            try {
                clickElement(additionalVehiclesBlock);
                pause(2000);
                typeTextEnter(VIN.get(index), VINValue, "VIN Value");
                clickFooter();
            } catch (Exception e) {
                clickElementJS(VIN.get(index));
                pause(3000);
                driver.findElement(By.xpath("//li[text()='" + VINValue + "']")).click();
                pause(3000);
                clickElement(additionalVehiclesBlock);
                clickFooter();
            }
        }
        if (!VIN.get(index).getText().equalsIgnoreCase(VINValue) || !VIN.get(index).getAttribute("value").equalsIgnoreCase(VINValue)) {
            typeTextEnter(VIN.get(index), VINValue, "VIN Value");
            clickFooter();
        }
    }

    public void setTrimLevel(String trimLevelValue, int index) throws Throwable {
        if (hasValue(trimLevelValue)) {
            try {
                clickElement(additionalVehiclesBlock);
                typeTextEnter(trimLevel.get(index), trimLevelValue, "Trim Level");
                saveChanges();
            } catch (Exception e) {
                trimLevel.get(index).clear();
                trimLevel.get(index).sendKeys(trimLevelValue);
                trimLevel.get(index).sendKeys(Keys.ENTER);
                clickElement(additionalVehiclesBlock);
                clickFooter();
            }
        } else {
            try {
                clickElement(additionalVehiclesBlock);
                pause(2000);
                trimLevel.get(index).click();
                pause(2000);
                clickElement(driver.findElement(By.xpath("//ul[@aria-hidden='false']/li[2]")));
                clickFooter();
            } catch (Exception e) {
                System.out.println("No trim level in the dropdown");
            }
        }
    }

    public void setVINOverride(String VINOverrideValue, int index) throws Throwable {
        if (hasValue(VINOverrideValue)) {
            checkCheckbox(VINOverride.get(index), VINOverrideValue);
            pause(2000);
            saveChanges();
        }
    }

    public void setBodyTypeES(String value, int index) throws Throwable {
        if (hasValue(value) && !bodyType.get(index).getAttribute("value").equalsIgnoreCase(value)) {
            clickElement(additionalVehiclesBlock);
            pause(3000);
            typeTextEnter(bodyType.get(index), value, "Vehicle Year Type " + index);
            pause(3000);
            clickFooter();
            pause(3000);
        }
    }

    public void setExclude(String value, int index) throws Throwable {
        if (hasValue(value)) {
            checkCheckbox(excludeCheckbox.get(index), value);
            pause(2000);
            saveChanges();
        }
    }

    public void setHighPerformanceOverride(String value, int index) throws Throwable {
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            checkCheckbox(highPerformanceOverride.get(index), value);
            pause(2000);
            saveChanges();
        }
    }

    public void setHighPerformance(String value, int index) throws Throwable {
        if (hasValue(value)) {
            typeTextEnter(highPerformance.get(index), value, "Set High Performance");
            pause(2000);
            saveChanges();
        }
    }

    public void setYearES(String value, int index) throws Throwable {
        if (hasValue(value) && !year.get(index).getAttribute("value").equalsIgnoreCase(value)) {
            clickElement(additionalVehiclesBlock);
            pause(3000);
            typeTextEnter(year.get(index), value, "Vehicle Year " + index);
            pause(3000);
            clickFooter();
            pause(2000);
            saveChanges();
        }
    }

    public void setMakeES(String value, int index) throws Throwable {
        if (hasValue(value) && !make.get(index).getAttribute("value").equalsIgnoreCase(value)) {
            clickElement(additionalVehiclesBlock);
            pause(3000);
            typeTextEnter(make.get(index), value, "Vehicle Make " + index);
            pause(3000);
            clickFooter();
            pause(3000);
            saveChanges();
        }
    }

    public void setModelES(String value, int index) throws Throwable {
        if (hasValue(value) && !model.get(index).getAttribute("value").equalsIgnoreCase(value)) {
            clickElement(additionalVehiclesBlock);
            pause(3000);
            typeTextEnter(model.get(index), value, "Vehicle Model " + index);
            pause(3000);
            clickFooter();
            pause(3000);
            saveChanges();
        }
    }

    public void addAdditionalVehicleES(Map<String, String> data) throws Throwable {
        verifyBlockExists("additional vehicles");
        if (hasValue(data.get("Vehicles_Num"))) {
            int num = Integer.parseInt(data.get("Vehicles_Num"));
            for (int i = 0; i < num; i++) {
                clickElement(add);
                clickElement(additionalVehiclesBlock);

                String vehicleType = data.get("Vehicles_Type").split(",")[i];

                setVehicleType(vehicleType, i);
                saveChanges();
                setYearES(data.get("Vehicles_Year").split(",")[i], i);
                setMakeES(data.get("Vehicles_Make").split(",")[i], i);
                setModelES(data.get("Vehicles_Model").split(",")[i], i);
                if ("Private Passenger".equalsIgnoreCase(vehicleType)) {
                    setBodyTypeES(data.get("Vehicles_Body_Type").split(",")[i], i);
                }
                setExclude(data.get("Vehicles_Exclude").split(",")[i], i);
                setHighPerformanceOverride(data.get("Vehicles_High_Performance_Override").split(",")[i], i);
                setHighPerformance(data.get("Vehicles_High_Performance").split(",")[i], i);
                saveChanges();
            }
        }
    }

}