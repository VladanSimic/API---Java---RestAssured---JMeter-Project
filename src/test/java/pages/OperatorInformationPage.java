package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.IncidentsBlock;
import pages.blocks.OperatorsBlock;
import pages.blocks.PreviousIncidentsCLUEBlock;

import java.util.List;
import java.util.Map;

public class OperatorInformationPage extends CommonComponentsAndActions {
    WebDriver driver;

    OperatorsBlock operatorsBlock;
    IncidentsBlock incidentsBlock;
    PreviousIncidentsCLUEBlock previousIncidentsCLUEBlock;

    public OperatorInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;

        operatorsBlock = new OperatorsBlock(driver);
        incidentsBlock = new IncidentsBlock(driver);
        previousIncidentsCLUEBlock = new PreviousIncidentsCLUEBlock(driver);

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='previous incidents from CLUE reports']/../../../../../..//tr")
    List<WebElement> clueDataReturned;


    public void fillOperatorInformationPage(Map<String, String> data) throws Throwable {
        goToPage("Operator Information");
        operatorsBlock.fillOperatorDetails(data);
        operatorsBlock.addAdditionalOperators(data);
        incidentsBlock.addIncidents(data);
    }

    public void fillOperatorInformationPage_END(Map<String, String> data) throws Throwable {
        goToPage("Operator Information");
        operatorsBlock.fillOperatorDetails_END(data);
        operatorsBlock.addAdditionalOperators_END(data);
        operatorsBlock.deleteOperators_END(data);
        incidentsBlock.addIncidents_END(data);
    }

    public void fillOperatorInformationPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Operator Information");
        operatorsBlock.fillOperatorDetails_OOS_END(data);
        operatorsBlock.addAdditionalOperators_OOS_END(data);
        operatorsBlock.deleteOperators_OOS_END(data);
        incidentsBlock.addIncidents_OOS_END(data);
    }

    public void fillOperatorInformationPage_RNW(Map<String, String> data) throws Throwable {
        goToPage("Operator Information");
        operatorsBlock.fillOperatorDetails_RNW(data);
        operatorsBlock.addAdditionalOperators_RNW(data);
        operatorsBlock.deleteOperators_RNW(data);
        incidentsBlock.addIncidents_RNW(data);
    }


    //ES
    public void fillOperatorInformationPageES(Map<String, String> data) throws Throwable {
        goToPage("Operator Information");
        verifyBlockExists("operators obtained through online reports");
        operatorsBlock.fillOperatorDetailsES(data);
        operatorsBlock.addAdditionalOperatorsES(data);
        operatorsBlock.fillAutoClueReportsES(data);
        incidentsBlock.addIncidentsES(data);
    }

    public boolean isCLUEDataReturned() {
        return clueDataReturned.size() != 0;
    }

    public void verifyIfCLUEDataReturned(String value) throws Throwable {
        pause(2000);
        reportScreenshot("CLUE_Data_" + System.currentTimeMillis(), "CLUE Data");

        if (value.equalsIgnoreCase("Returned")) {
            if (!isCLUEDataReturned())
                failAssertion("CLUE Data is not returned");
            else
                successLog("CLUE Data is returned");
        } else {
            if (isCLUEDataReturned())
                failAssertion("CLUE Data is returned");
            else
                successLog("CLUE Data is not returned");
        }
    }


}