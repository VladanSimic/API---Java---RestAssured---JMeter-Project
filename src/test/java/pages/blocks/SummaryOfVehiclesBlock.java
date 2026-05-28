package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class SummaryOfVehiclesBlock extends CommonComponentsAndActions {

    public SummaryOfVehiclesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='summary of vehicles']/../../../../../..//table//td[1]/div")
    List<WebElement> vehicle;
    @FindBy(xpath = "//div[text()='summary of vehicles']/../../../../../..//table//td[2]/div")
    List<WebElement> vehicleType;
    @FindBy(xpath = "//div[text()='summary of vehicles']/../../../../../..//table//td[2]/div")
    List<WebElement> usage;
    @FindBy(xpath = "//div[text()='summary of vehicles']/../../../../../..//table//td[3]/div")
    List<WebElement> mileageBandYear;
    @FindBy(xpath = "//div[text()='summary of vehicles']/../../../../../..//table//td[4]/div")
    List<WebElement> assignedDriver;

    public void fillSummaryOfVehiclesDetailsPA(Map<String, String> data) {
        for (int i = 1; i <= data.get("Additional_Vehicles").split(",").length; i++) {
            verifyVehicle(data.get("Vehicle_Details_Year_" + i) + " " + data.get("Vehicle_Details_Make_" + i) + " " + data.get("Vehicle_Details_Model_" + i), i - 1);
            switch (data.get("State")) {
                case "AZ": {
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_" + i), i - 1);
                }
                break;

                case "MO":
                case "MN":
                case "NV":
                case "PA":
                case "WI":
                case "MD":
                case "NY":
                case "MI":
                case "IN": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_" + i), i - 1);
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_" + i), i - 1);
                }
                break;

                case "IA":
                case "CO":
                case "KY":
                case "KS":
                case "IL":
                case "DC":
                case "NM":
                case "RI":
                case "AL":
                case "LA":
                case "WY":
                case "CT":
                case "MA":
                case "UT":
                case "MS":
                case "FL":
                case "TX":
                case "GA":
                case "VA":
                case "ID":
                case "AR":
                case "NE": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i), i - 1);
                }
                break;

                case "OH":
                case "TN":
                case "SC":
                case "OK": {
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i), i - 1);
                }
                break;

                case "SD":
                case "NH":
                case "OR":
                case "ND":
                case "HI":
                case "DE":
                case "WV":
                case "WA":
                case "NJ":
                case "NC":
                case "ME":
                case "CA":
                case "VT":
                case "MT": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_" + i), i - 1);
                    verifyAssignedDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
                }
                break;
            }
        }
    }

    public void fillSummaryOfVehiclesDetailsPA_END(Map<String, String> data) {
        for (int i = 1; i <= data.get("Additional_Vehicles_END").split(",").length; i++) {
            verifyVehicle(data.get("Vehicle_Details_Year_END_" + i) + " " + data.get("Vehicle_Details_Make_END_" + i) + " " + data.get("Vehicle_Details_Model_END_" + i), i - 1);
            switch (data.get("State")) {
                case "AZ": {
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_END_" + i), i - 1);
                }
                break;

                case "MO":
                case "MN":
                case "NV":
                case "PA":
                case "WI":
                case "MD":
                case "NY":
                case "MI":
                case "IN": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_END_" + i), i - 1);
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_END_" + i), i - 1);
                }
                break;

                case "IA":
                case "CO":
                case "KY":
                case "KS":
                case "IL":
                case "DC":
                case "NM":
                case "RI":
                case "AL":
                case "LA":
                case "WY":
                case "CT":
                case "MA":
                case "UT":
                case "MS":
                case "FL":
                case "TX":
                case "GA":
                case "VA":
                case "ID":
                case "AR":
                case "NE": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_END_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i), i - 1);
                }
                break;

                case "OH":
                case "TN":
                case "SC":
                case "OK": {
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i), i - 1);
                }
                break;

                case "SD":
                case "NH":
                case "OR":
                case "ND":
                case "HI":
                case "DE":
                case "WV":
                case "WA":
                case "NJ":
                case "NC":
                case "ME":
                case "CA":
                case "VT":
                case "MT": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_END_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_END_" + i), i - 1);
                    verifyAssignedDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
                }
                break;
            }
        }
        //TODO PA END - Summary of vehicles - Low
    }

    public void fillSummaryOfVehiclesDetailsPA_OOS_END(Map<String, String> data) {
        for (int i = 1; i <= data.get("Additional_Vehicles_OOS_END").split(",").length; i++) {
            verifyVehicle(data.get("Vehicle_Details_Year_OOS_END_" + i) + " " + data.get("Vehicle_Details_Make_OOS_END_" + i) + " " + data.get("Vehicle_Details_Model_OOS_END_" + i), i - 1);
            switch (data.get("State")) {
                case "AZ": {
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i), i - 1);
                }
                break;

                case "MO":
                case "MN":
                case "NV":
                case "PA":
                case "WI":
                case "MD":
                case "NY":
                case "MI":
                case "IN": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i), i - 1);
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_OOS_END_" + i), i - 1);
                }
                break;

                case "IA":
                case "CO":
                case "KY":
                case "KS":
                case "IL":
                case "DC":
                case "NM":
                case "RI":
                case "AL":
                case "LA":
                case "WY":
                case "CT":
                case "MA":
                case "UT":
                case "MS":
                case "FL":
                case "TX":
                case "GA":
                case "VA":
                case "ID":
                case "AR":
                case "NE": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i), i - 1);
                }
                break;

                case "OH":
                case "TN":
                case "SC":
                case "OK": {
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i), i - 1);
                }
                break;

                case "SD":
                case "NH":
                case "OR":
                case "ND":
                case "HI":
                case "DE":
                case "WV":
                case "WA":
                case "NJ":
                case "NC":
                case "ME":
                case "CA":
                case "VT":
                case "MT": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_OOS_END_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_OOS_END_" + i), i - 1);
                    verifyAssignedDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
                }
                break;
            }
        }
        //TODO PA OOS - Summary of vehicles - Low
    }

    public void fillSummaryOfVehiclesDetailsPA_RNW(Map<String, String> data) {
        for (int i = 1; i <= data.get("Additional_Vehicles_RNW").split(",").length; i++) {
            verifyVehicle(data.get("Vehicle_Details_Year_RNW_" + i) + " " + data.get("Vehicle_Details_Make_RNW_" + i) + " " + data.get("Vehicle_Details_Model_RNW_" + i), i - 1);
            switch (data.get("State")) {
                case "AZ": {
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_RNW_" + i), i - 1);
                }
                break;

                case "MO":
                case "MN":
                case "NV":
                case "PA":
                case "WI":
                case "MD":
                case "NY":
                case "MI":
                case "IN": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i), i - 1);
                    verifyVehicleType(data.get("Vehicle_Details_Vehicle_Type_RNW_" + i), i - 1);
                }
                break;

                case "IA":
                case "CO":
                case "KY":
                case "KS":
                case "IL":
                case "DC":
                case "NM":
                case "RI":
                case "AL":
                case "LA":
                case "WY":
                case "CT":
                case "MA":
                case "UT":
                case "MS":
                case "FL":
                case "TX":
                case "GA":
                case "VA":
                case "ID":
                case "AR":
                case "NE": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i), i - 1);
                }
                break;

                case "OH":
                case "TN":
                case "SC":
                case "OK": {
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i), i - 1);
                }
                break;

                case "SD":
                case "NH":
                case "OR":
                case "ND":
                case "HI":
                case "DE":
                case "WV":
                case "WA":
                case "NJ":
                case "NC":
                case "ME":
                case "CA":
                case "VT":
                case "MT": {
                    verifyUsage(data.get("Vehicle_Details_Vehicle_Use_RNW_" + i), i - 1);
                    verifyMileageBandYear(data.get("Vehicle_Details_Mileage_Band_Year_RNW_" + i), i - 1);
                    verifyAssignedDriver(data.get("First_Name") + " " + data.get("Last_Name"), i);
                }
                break;
            }
        }
        //TODO PA RNW - Summary of vehicles - Low
    }

    public void verifyVehicle(String s, int i) {
        assertEquals(vehicle.get(i).getText(), s, "Vehicle");
    }

    public void verifyUsage(String s, int i) {
        assertEquals(usage.get(i).getText(), s, "Usage");
    }

    public void verifyVehicleType(String s, int i) {
        assertEquals(vehicleType.get(i).getText(), s, "Vehicle Type");
    }

    public void verifyMileageBandYear(String s, int i) {
        assertEquals(mileageBandYear.get(i).getText(), s, "Mileage Band Year");
    }

    public void verifyAssignedDriver(String s, int i) {
        assertEquals(assignedDriver.get(i).getText(), s, "Assigned Driver");
    }
}
