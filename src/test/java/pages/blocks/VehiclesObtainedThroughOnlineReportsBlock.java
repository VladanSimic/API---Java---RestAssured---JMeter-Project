package pages.blocks;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehiclesObtainedThroughOnlineReportsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public VehiclesObtainedThroughOnlineReportsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'vehicles obtained')]/../../../../../..//table//tr/td[1]/div[text()='Yes']/../../td[1]/div")
    List<WebElement> obtainedVehiclesInclude;
    @FindBy(xpath = "//div[contains(text(),'vehicles obtained')]/../../../../../..//table//tr/td[1]/div[text()='Yes']/../../td[2]/div")
    List<WebElement> obtainedVehiclesType;
    @FindBy(xpath = "//div[contains(text(),'vehicles obtained')]/../../../../../..//table//tr/td[1]/div[text()='Yes']/../../td[3]/div")
    List<WebElement> obtainedVehiclesYear;
    @FindBy(xpath = "//div[contains(text(),'vehicles obtained')]/../../../../../..//table//tr/td[1]/div[text()='Yes']/../../td[4]/div")
    List<WebElement> obtainedVehiclesMake;
    @FindBy(xpath = "//div[contains(text(),'vehicles obtained')]/../../../../../..//table//tr/td[1]/div[text()='Yes']/../../td[5]/div")
    List<WebElement> obtainedVehiclesModel;
    @FindBy(xpath = "//div[contains(text(),'vehicles obtained')]/../../../../../..//table//tr/td[1]/div[text()='Yes']/../../td[6]/div")
    List<WebElement> obtainedVehiclesVIN;
    @FindBy(xpath = "//div[contains(text(),'vehicles obtained')]/../../../../../..//table//tr/td[1]/div[text()='Yes']/../../td[7]/div")
    List<WebElement> obtainedVehiclesTrimLevel;
    @FindBy(xpath = "//div[text()='vehicles obtained through online reports new']/../../../../../..//table//td[1]/div")
    List<WebElement> vehicleRows;

    public Map<String, String> getVehicleData() {
        Map<String, String> data = new HashMap<>();
        data.put("Obtained_Vehicle_Num", String.valueOf(obtainedVehiclesType.size()));
        for (int i = 0; i < obtainedVehiclesType.size(); i++) {
            try {
                data.put("Obtained_Vehicle_Type_" + (i + 1), getText(obtainedVehiclesType.get(i)));
            } catch (Exception e) {
                clickElementWithOffset(obtainedVehiclesType.get(i), 30, 30);
                data.put("Obtained_Vehicle_Type_" + (i + 1), getText(obtainedVehiclesType.get(i)));
            }
            try {
                data.put("Obtained_Vehicle_Year_" + (i + 1), getText(obtainedVehiclesYear.get(i)));
            } catch (Exception e) {
                clickElementWithOffset(obtainedVehiclesYear.get(i), 30, 30);
                data.put("Obtained_Vehicle_Year_" + (i + 1), getText(obtainedVehiclesYear.get(i)));
            }
            try {
                data.put("Obtained_Vehicle_Make_" + (i + 1), getText(obtainedVehiclesMake.get(i)));
            } catch (Exception e) {
                clickElementWithOffset(obtainedVehiclesMake.get(i), 30, 30);
                data.put("Obtained_Vehicle_Make_" + (i + 1), getText(obtainedVehiclesMake.get(i)));
            }
            try {
                data.put("Obtained_Vehicle_Model_" + (i + 1), getText(obtainedVehiclesModel.get(i)));
            } catch (Exception e) {
                clickElementWithOffset(obtainedVehiclesModel.get(i), 30, 30);
                data.put("Obtained_Vehicle_Model_" + (i + 1), getText(obtainedVehiclesModel.get(i)));
            }
        }
        return data;
    }

    public boolean verifyIfDataReturned() {
        return vehicleRows.size() != 0;
    }

    public void excludeObtainedVehicles() throws Throwable {
        if (vehicleRows.size() > 0) {
            for (int i = 0; i < vehicleRows.size(); i++) {
                clickElement(footer);
                try {
                    vehicleRows.get(i).click();
                } catch (Exception e) {
                    vehicleRows = driver.findElements(By.xpath("//div[text()='vehicles obtained through online reports new']/../../../../../..//table//td[1]/div"));
                    vehicleRows.get(i).click();
                }
                pause(2000);
                driver.switchTo().activeElement().sendKeys("No");
                clickElement(footer);
                pause(5000);
                clickElement(footer);
            }
            DataManager.getInstance().setKey("Obtained_Vehicle_Num", "0");
        }
    }

    public void verifyVehiclesObtainedThroughOnlineReports(DataTable table) {
        int i = 0;
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String includeVal = columns.get(0);
            String vehicleTypeVal = columns.get(1);
            String yearVal = columns.get(2);
            String makeVal = columns.get(3);
            String modelVal = columns.get(4);
            String vinVal = columns.get(5);
            String trimLevelVal = columns.get(6);

            assertEquals(obtainedVehiclesInclude.get(i).getText(), includeVal, "Include");
            assertEquals(obtainedVehiclesType.get(i).getText(), vehicleTypeVal, "Vehicle Type");
            assertEquals(obtainedVehiclesYear.get(i).getText(), yearVal, "Year");
            assertEquals(obtainedVehiclesMake.get(i).getText(), makeVal, "Make");
            assertEquals(obtainedVehiclesModel.get(i).getText(), modelVal, "Model");
            assertEquals(obtainedVehiclesVIN.get(i).getText(), vinVal, "VIN");
            assertEquals(obtainedVehiclesTrimLevel.get(i).getText(), trimLevelVal, "Trim Level");

            i++;
        }
        reportScreenshot("Obtained Vehicles" + System.currentTimeMillis(), "Obtained Vehicles");
    }

}