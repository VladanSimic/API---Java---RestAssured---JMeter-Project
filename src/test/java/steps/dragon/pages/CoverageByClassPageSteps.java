package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.CoverageByClassPage;
import pages.CoveragesPage;
import pages.blocks.SelectCoveragesBlock;
import pages.blocks.VehiclesBlock;
import pages.blocks.WorldwideJewleryBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class CoverageByClassPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I navigate to Coverage by Class and add worldwide jewelry class")
    public void iFillCoverageJewelryClass() throws Throwable {
        WorldwideJewleryBlock block = new WorldwideJewleryBlock(driver);
        block.goToPage("Coverage by Class");
        block.fillWorldwideJewelryCO(data);
    }


}