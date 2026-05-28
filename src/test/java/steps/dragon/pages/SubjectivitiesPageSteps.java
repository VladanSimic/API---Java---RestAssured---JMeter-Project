package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.SubjectivitiesPage;
import pages.SubjectivityPage;
import pages.blocks.ManualSubjectivitiesBlock;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class SubjectivitiesPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote subjectivities page")
    public void iFillOutSubjectivitiesPagePA() throws Throwable {
        new SubjectivitiesPage(driver).fillSubjectivitiesPagePA(data);
    }

    @And("I fill out PA endorsement subjectivity page")
    public void iFillOutSubjectivitiesPagePA_END() throws Throwable {
        new SubjectivityPage(driver).fillSubjectivityPagePA_END(data);
    }

    @And("I fill out PA quote manual subjectivities block")
    public void iFillOutManualSubjectivitiesBlock() throws Throwable {
        new ManualSubjectivitiesBlock(driver).fillManualSubjectivitiesDetailsPA(data);
    }

    @And("I fill out PA endorsement manual subjectivities block")
    public void iFillOutManualSubjectivitiesBlock_END() throws Throwable {
        new ManualSubjectivitiesBlock(driver).fillManualSubjectivitiesDetailsPA_END(data);
    }
    //PA pages and blocks steps - END

    // block steps - START
    @And("I set manual subjectivities {int} condition name to {string}")
    public void iSetManualSubjectivitiesConditionName(int i, String value) {
        new ManualSubjectivitiesBlock(driver).setConditionName(value, i);
    }

    @And("I set manual subjectivities {int} notes to {string}")
    public void iSetManualSubjectivitiesNotes(int i, String value) throws Throwable {
        new ManualSubjectivitiesBlock(driver).setNotes(value, i);
    }

    @And("I set manual subjectivities {int} pend to {string}")
    public void iSetManualSubjectivitiesPend(int i, String value) throws Throwable {
        new ManualSubjectivitiesBlock(driver).setPend(value, i);
    }
    // block steps - END

    @And("I fill out the subjectivities page for CC line of business")
    public void iFillSubjectivitiesPageCC() throws Throwable {
        new SubjectivitiesPage(driver).fillSubjectivitiesPageCC(data);
    }

    @And("I fill out the manual subjectivities details for CC line of business")
    public void iFillAdditionalInterestsDetailsCC() throws Throwable {
        new ManualSubjectivitiesBlock(driver).fillManualSubjectivitiesDetailsCC(data);
    }

    @And("I set the manual subjectivities condition {int} name to {string}")
    public void setConditionName(int index, String value) {
        new ManualSubjectivitiesBlock(driver).setConditionName(value, index);
    }

    @And("I set the manual subjectivities {int} notes to {string}")
    public void setNotes(int index, String value) throws Throwable {
        new ManualSubjectivitiesBlock(driver).setNotes(value, index);
    }

    @And("I set the manual subjectivities {int} pend to {string}")
    public void setPend(int index, String value) throws Throwable {
        new ManualSubjectivitiesBlock(driver).setPend(value, index);
    }

}