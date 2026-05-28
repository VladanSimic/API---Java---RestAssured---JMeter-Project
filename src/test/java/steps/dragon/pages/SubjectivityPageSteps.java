package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.SubjectivitiesPage;
import pages.SubjectivityPage;
import pages.blocks.ManualSubjectivitiesBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class SubjectivityPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I visit Subjectivity page and populate subjectivities with document {string}")
    public void uploadDocumentAndPopulateSubjectivities(String doc) throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Subjectivity");
        new SubjectivityPage(driver).uploadDocAndPopulateSubjectivities(doc);
    }
}