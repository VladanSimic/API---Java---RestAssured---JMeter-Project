package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.DriverAssignmentPage;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class DriverAssignmentPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote driver assignment page")
    public void iFillOutDriverAssignmentPagePA() throws Throwable {
        new DriverAssignmentPage(driver).fillDriverAssignmentPagePA(data);
    }

    @And("I fill out PA endorsement driver assignment page")
    public void iFillOutDriverAssignmentPagePA_END() throws Throwable {
        new DriverAssignmentPage(driver).fillDriverAssignmentPagePA_END(data);
    }

    @And("I fill out PA renewal driver assignment page")
    public void iFillOutDriverAssignmentPagePA_RNW() throws Throwable {
        new DriverAssignmentPage(driver).fillDriverAssignmentPagePA_RNW(data);
    }
    //PA pages and blocks steps - END

    // block steps - START

    // block steps - END

}