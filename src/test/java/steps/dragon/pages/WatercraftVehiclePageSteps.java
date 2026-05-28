package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.VehiclesAndWatercraftPage;
import pages.VehiclesDetailsPage;
import pages.WatercraftVehiclePage;
import pages.blocks.*;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class WatercraftVehiclePageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I navigate to Watercraft Vehicle details page")
    public void iNavigateToWatercraftVehicleDetailsPage() throws Throwable {
        new WatercraftVehiclePage(driver).goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
    }

    @And("I add watercraft on vehicles and watercraft page")
    public void addNewWatercraft(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        WatercraftInformationBlock block = new WatercraftInformationBlock(driver);
        int index = block.returnIndexOfLastWatercraftES();

        for (List<String> columns : rows) {
            String make = columns.get(0);
            String model = columns.get(1);
            String hullValue = columns.get(2);
            String length = columns.get(3);
            String horsePower = columns.get(4);

            block.clickAdd();
            index++;
            block.setMakeES(make, index);
            block.setModelES(model, index);
            block.setHullValueES(hullValue, index);
            block.setLengthES(length, index);
            block.setHorsePowerES(horsePower, index);
        }
    }


}