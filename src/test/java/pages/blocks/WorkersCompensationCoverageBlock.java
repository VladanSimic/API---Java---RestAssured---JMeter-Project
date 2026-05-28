package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WorkersCompensationCoverageBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public WorkersCompensationCoverageBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='How many total full-time inside and outside employees?']/../../../..//input")
    WebElement howManyTotalFullTimeInsideAndOutSideEmployees;

    @FindBy(xpath = "//div[contains(text(),'total full-time')]/../../../..//input")
    WebElement totalFullTime;
    @FindBy(xpath = "//div[contains(text(),'Workers Compensation')]/../../../..//input")
    WebElement workerCompensation;

    public void fillWorkerCoverageDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("workers compensation coverage");
        setTotalFullTime(data.get("Worker_Total_Full_Time"));
        setWorkerCompensation(data.get("Workers_Compensation"));
    }

    public void fillWorkerCoverageDetails_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("workers compensation coverage");
        setTotalFullTime(data.get("Worker_Total_Full_Time_END"));
        setWorkerCompensation(data.get("Workers_Compensation_END"));
    }

    public void fillWorkerCoverageDetails_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("workers compensation coverage");
        setTotalFullTime(data.get("Worker_Total_Full_Time_OOS_END"));
        setWorkerCompensation(data.get("Workers_Compensation_OOS_END"));
    }

    public void fillWorkerCoverageDetails_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("workers compensation coverage");
        setTotalFullTime(data.get("Worker_Total_Full_Time_RNW"));
        setWorkerCompensation(data.get("Workers_Compensation_RNW"));
    }

    public void setTotalFullTime(String fullTime) throws Throwable {
        clickElement(totalFullTime, "total full time");
        pause(3000);
        typeTextEnter(driver.switchTo().activeElement(), fullTime, "full time");
        clickFooter();
    }

    public void setWorkerCompensation(String compensation) throws Throwable {
        clickElement(workerCompensation, "worker compensation");
        typeTextEnter(driver.switchTo().activeElement(), compensation, "compensation");
        clickFooter();
    }

}