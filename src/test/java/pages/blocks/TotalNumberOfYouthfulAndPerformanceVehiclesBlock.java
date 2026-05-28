package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class TotalNumberOfYouthfulAndPerformanceVehiclesBlock extends CommonComponentsAndActions {

    public TotalNumberOfYouthfulAndPerformanceVehiclesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total Number of Youthful Drivers']/../../../..//input")
    WebElement totalNumberOfYouthfulDrivers;
    @FindBy(xpath = "//div[text()='Total Number of Performance Vehicles']/../../../..//input")
    WebElement totalNumberOfPerformanceVehicles;

    public void fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA(Map<String, String> data) {
        verifyTotalNumberOfYouthfulDrivers(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Youthful_Drivers"));
        verifyTotalNumberOfPerformanceVehicles(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Performance_Vehicles"));
    }

    public void fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_END(Map<String, String> data) {
        verifyTotalNumberOfYouthfulDrivers(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Youthful_Drivers_END"));
        verifyTotalNumberOfPerformanceVehicles(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Performance_Vehicles_END"));
    }

    public void fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_OOS_END(Map<String, String> data) {
        verifyTotalNumberOfYouthfulDrivers(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Youthful_Drivers_OOS_END"));
        verifyTotalNumberOfPerformanceVehicles(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Performance_Vehicles_OOS_END"));
    }

    public void fillTotalNumberOfYouthfulAndPerformanceVehiclesDetailsPA_RNW(Map<String, String> data) {
        verifyTotalNumberOfYouthfulDrivers(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Youthful_Drivers_RNW"));
        verifyTotalNumberOfPerformanceVehicles(data.get("Total_Number_Youthful_And_Performance_Vehicles_Total_Number_Of_Performance_Vehicles_RNW"));
    }

    public void verifyTotalNumberOfYouthfulDrivers(String s) {
        assertCellValue(totalNumberOfYouthfulDrivers, s, "Total Number Of Youthful Drivers");
    }

    public void verifyTotalNumberOfPerformanceVehicles(String s) {
        assertCellValue(totalNumberOfPerformanceVehicles, s, "Total Number Of Performance Vehicles");
    }
}