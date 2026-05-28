package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.WatercraftPolicyCoverPage;
import pages.blocks.ManuallyEnteredWatercraftBlock;
import pages.blocks.WatercraftInformationBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class WatercraftPolicyPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I navigate to Watercraft Policy Page and add new watercraft with basic details")
    public void addNewWatercraft(DataTable table) throws Throwable {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        WatercraftPolicyCoverPage page = new WatercraftPolicyCoverPage(driver);

        for (List<String> columns : rows) {
            String policyType = columns.get(0);
            String year = columns.get(1);
            String manufacturer = columns.get(2);
            String model = columns.get(3);
            String length = columns.get(4);
            String hullAndMachinery = columns.get(5);

            page.navigateToWatercraftPolicyPage();
            page.addWatercraftAndFillBasicDetails(data.get("State"), policyType, year,
                    manufacturer, model, length, hullAndMachinery);
        }
    }


}