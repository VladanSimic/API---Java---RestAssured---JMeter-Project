package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.SubjectivityPage;
import pages.blocks.SelectCoveragesBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class VesselDetailPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I set AOP Deductible to {string} on Vessel Detail page")
    public void setAOPDedTo(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setAOPDeductible(value);
    }

    @And("I set Hurricane Deductible to {string} on Vessel Detail page")
    public void setHurricaneDedTo(String value) throws Throwable {
        new SelectCoveragesBlock(driver).setHurricaneDeductible(value);
    }


}