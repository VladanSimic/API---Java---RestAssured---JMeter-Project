package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.InsuranceScoreBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class InsuranceScoreManagementPage extends CommonComponentsAndActions {
    WebDriver driver;
    InsuranceScoreBlock insuranceScoreBlock;


    public InsuranceScoreManagementPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        insuranceScoreBlock = new InsuranceScoreBlock(driver);
    }

    public void orderNewReportAndChangeScore(Map<String, String> data, String score) throws Throwable {
        clickNewReport();
        insuranceScoreBlock.setInsuranceScore(data, score);
    }


    public void clickNewReport() throws InterruptedException {
        clickElement(newReport, "New Report");
        pause(2000);
    }

}
