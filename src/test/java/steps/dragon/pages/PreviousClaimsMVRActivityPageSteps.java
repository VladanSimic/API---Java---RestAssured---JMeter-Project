package steps.dragon.pages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.PreviousClaimsMVRActivityPage;
import pages.blocks.AutoIncidentsBlock;
import pages.blocks.WatercraftLossHistoryBlock;
import steps.BaseTest;
import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import selenium.DriverManager;


import java.util.Map;

public class PreviousClaimsMVRActivityPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I verify copied auto claim details on WC")
    public void iVerifyCopiedAutoClaimDetailsOnWC(DataTable table) {
        new AutoIncidentsBlock(driver).verifyDetailsOfCopiedAutoClaim(table, data);
    }

    @And("I verify copied watercraft claim details on WC")
    public void iVerifyCopiedWatercraftClaimDetailsOnWC(DataTable table) {
        new AutoIncidentsBlock(driver).verifyDetailsOfCopiedWatercraftClaim(table, data);
    }

    @Then("I set selected watercraft with sheet data")
    public void iSetSelectedWatercraftWithSheetData() {
        new WatercraftLossHistoryBlock(driver).setSelectedVesselWithSheetData(data);
    }

    @And("I set selected operator with sheet data")
    public void iSetSelectedOperatorWithSheetData(){
        new AutoIncidentsBlock(driver).setSelectedOperatorWithSheetData(data);
    }
}
