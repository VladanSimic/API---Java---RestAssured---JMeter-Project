package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.WatercraftPolicyCoverPage;
import pages.blocks.ManuallyEnteredWatercraftBlock;
import pages.blocks.PropertyInformationBlock;
import pages.blocks.WatercraftGTE27FeetBlock;
import pages.blocks.WatercraftInformationBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class WatercraftInformationPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I add watercraft on watercraft information page")
    public void addNewWatercraft(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        WatercraftInformationBlock block = new WatercraftInformationBlock(driver);
        int index = block.returnIndexOfLastWatercraftEX();

        for (List<String> columns : rows) {
            String make = columns.get(0);
            String model = columns.get(1);
            String hullValue = columns.get(2);
            String length = columns.get(3);
            String horsePower = columns.get(4);
            String maxDesignSpeed = columns.get(5);

            block.clickAdd();
            index++;
            block.setMake(make, index + 1);
            block.setModel(model, index + 1);
            block.setHullValue(hullValue, index + 1);
            block.setLength(length, index + 1);
            block.setHorsepower(horsePower, index + 1);
            block.setMaxDesignSpeed(maxDesignSpeed, index + 1);
        }
    }


}