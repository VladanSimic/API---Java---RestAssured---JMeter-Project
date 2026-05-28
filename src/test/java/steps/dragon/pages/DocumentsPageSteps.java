package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.CustomerDocumentsPage;
import pages.DocumentsPage;
import selenium.DriverManager;
import steps.BaseTest;
import java.util.List;
import java.util.Map;

public class DocumentsPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I upload 19mb document on customer documents tab")
    public void iUploadDocument() throws Throwable {
        new CustomerDocumentsPage(driver).uploadDocument("19mb.pdf", "Alarm Certificate", "Test");
    }

    @And("I upload PSE 19mb document on customer documents tab")
    public void uploadDocument() throws Throwable {
        new CustomerDocumentsPage(driver).uploadDocument("19mb.pdf", "PSE Membership Agreement", "Test");
    }

    @And("I verify document table content")
    public void verifyTasksContents(DataTable table) {
        new CustomerDocumentsPage(driver).verifyTasksContents(table);
    }

}
