package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.OperatorsAndVehiclePage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class PropertyInformationPageSteps extends BaseTest {
    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I add new location on property information page")
    public void addNewLocation(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        PropertyInformationBlock block = new PropertyInformationBlock(driver);
        int index = block.returnIndexOfLastLocation();

        for (List<String> columns : rows) {
            String addressLine1 = columns.get(0);
            if (addressLine1.equalsIgnoreCase("Copy")) {
                String original = block.getAddressLine1(0);
                addressLine1 = block.extractStreetNumAndIncrement(original, index + 1);
            }
            String city = columns.get(1);
            if (city.equalsIgnoreCase("Copy"))
                city = block.getCity(0);
            String state = columns.get(2);
            if (state.equalsIgnoreCase("Copy"))
                state = block.getState(0);
            String zipCode = columns.get(3);
            if (zipCode.equalsIgnoreCase("Copy"))
                zipCode = block.getZIPCode(0);
            String swimmingPool = columns.get(4);
            String usage = columns.get(5);
            String dwellingType = columns.get(6);

            block.clickAdd();
            index++;
            block.setAddressLine1(addressLine1, index);
            block.setCity(city, index);
            block.setState(state, index);
            block.setZipCode(zipCode, index);
            block.setSwimmingPool(swimmingPool, index);
            block.setUsage(usage, index);
            block.setDwellingType(dwellingType, index);
            block.setIsResidenceRented("No", index);
        }
    }

}
