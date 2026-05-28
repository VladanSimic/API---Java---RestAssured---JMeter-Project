package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class GeneralContractorsLimitsOfInsuranceBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public GeneralContractorsLimitsOfInsuranceBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='CGL Limits']/../../../../../../../../../../..//div[text()='Per Occurrence']/../../../..//input")
    WebElement cglLimitsPerOccurrence;
    @FindBy(xpath = "//div[text()='CGL Limits']/../../../../../../../../../../..//div[text()='Aggregate']/../../../..//input")
    WebElement cglLimitsAggregate;
    @FindBy(xpath = "//div[text()='CGL Limits']/../../../../../../../../../../..//div[text()='Expiration Date']/../../../..//input")
    WebElement cglLimitsExpirationDate;
    @FindBy(xpath = "//div[text()='Excess Limits']/../../../../../../../../../../..//div[text()='Per Occurrence']/../../../..//input")
    WebElement excessLimitsPerOccurrence;
    @FindBy(xpath = "//div[text()='Excess Limits']/../../../../../../../../../../..//div[text()='Aggregate']/../../../..//input")
    WebElement excessLimitsAggregate;
    @FindBy(xpath = "//div[text()='Excess Limits']/../../../../../../../../../../..//div[text()='Expiration Date']/../../../..//input")
    WebElement excessLimitsExpirationDate;
    @FindBy(xpath = "//div[text()='Combined Per Occurrence Limit']/../../../../../../../../../../..//input[@type='text']")
    WebElement combinedPerOccurrenceLimit;
    @FindBy(xpath = "//div[text()='Is Workers Compensation coverage provided to employees?']/../../../../../../../../../../..//label[text()='Yes']/..//input")
    WebElement isWorkersCompensationCoverageProvidedToEmployeesYes;
    @FindBy(xpath = "//div[text()='Is Workers Compensation coverage provided to employees?']/../../../../../../../../../../..//label[text()='No']/..//input")
    WebElement isWorkersCompensationCoverageProvidedToEmployeesNo;
    @FindBy(xpath = "//div[text()='Is Workers Compensation coverage provided to employees?']/../../../../../../../../../../..//div[text()='Expiration Date']/../../../..//input")
    WebElement workersCompensationExpirationDate;
    @FindBy(xpath = "//div[text()='COI Expiration Date']/../../../..//input")
    WebElement coiExpirationDate;

    public void fillGeneralContractorsLimitsOfInsuranceDetailsCC(Map<String, String> data) throws Throwable {
        setCGLLimitsPerOccurrence(data.get("General_Contractors_Limits_Of_Insurance_CGL_Limits_Per_Occurrence"));
        setCGLLimitsAggregate(data.get("General_Contractors_Limits_Of_Insurance_CGL_Limits_Aggregate"));
        setCGLLimitsExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_CGL_Limits_ExpirationDate"));
        setExcessLimitsPerOccurrence(data.get("General_Contractors_Limits_Of_Insurance_Excess_Limits_Per_Occurrence"));
        setExcessLimitsAggregate(data.get("General_Contractors_Limits_Of_Insurance_Excess_Limits_Aggregate"));
        setExcessLimitsExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_Excess_Limits_Expiration_Date"));
        setCombinedPerOccurrenceLimit(data.get("General_Contractors_Limits_Of_Insurance_Combined_Per_Occurrence_Limit"));
        setIsWorkersCompensationCoverageProvidedToEmployees(data.get("General_Contractors_Limits_Of_Insurance_Is_Workers_Compensation_Coverage_Provided_To_Employees"));
        setWorkersCompensationExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_Is_Workers_Compensation_Coverage_Provided_To_Employees"), data.get("General_Contractors_Limits_Of_Insurance_Workers_Compensation_Expiration_Date"));
        setCOIExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_COI_Expiration_Date"));
        verifyBlockExists("general contractors limits of insurance");
    }

    public void fillGeneralContractorsLimitsOfInsuranceDetailsCC_END(Map<String, String> data) throws Throwable {
        setCGLLimitsPerOccurrence(data.get("General_Contractors_Limits_Of_Insurance_CGL_Limits_Per_Occurrence_END"));
        setCGLLimitsAggregate(data.get("General_Contractors_Limits_Of_Insurance_CGL_Limits_Aggregate_END"));
        setCGLLimitsExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_CGL_Limits_ExpirationDate_END"));
        setExcessLimitsPerOccurrence(data.get("General_Contractors_Limits_Of_Insurance_Excess_Limits_Per_Occurrence_END"));
        setExcessLimitsAggregate(data.get("General_Contractors_Limits_Of_Insurance_Excess_Limits_Aggregate_END"));
        setExcessLimitsExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_Excess_Limits_Expiration_Date_END"));
        setCombinedPerOccurrenceLimit(data.get("General_Contractors_Limits_Of_Insurance_Combined_Per_Occurrence_Limit_END"));
        setIsWorkersCompensationCoverageProvidedToEmployees(data.get("General_Contractors_Limits_Of_Insurance_Is_Workers_Compensation_Coverage_Provided_To_Employees_END"));
        setWorkersCompensationExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_Is_Workers_Compensation_Coverage_Provided_To_Employees_END"), data.get("General_Contractors_Limits_Of_Insurance_Workers_Compensation_Expiration_Date_END"));
        setCOIExpirationDate(data.get("General_Contractors_Limits_Of_Insurance_COI_Expiration_Date_END"));
        saveChanges();
    }

    public void setWorkersCompensationExpirationDate(String yesNo, String date) {
        if (hasValue(yesNo) && yesNo.equalsIgnoreCase("Yes")) {
            typeTextEnter(workersCompensationExpirationDate, date, "Workers compensation expiration date");
        }
    }

    public void setCGLLimitsPerOccurrence(String value) {
        typeText(cglLimitsPerOccurrence, value, "CGL limits per occurrence");
    }

    public void setCGLLimitsAggregate(String value) {
        typeText(cglLimitsAggregate, value, "CGL limits aggregate");
    }

    public void setCGLLimitsExpirationDate(String value) {
        typeTextEnter(cglLimitsExpirationDate, value, "CGL limits expiration date");
    }

    public void setExcessLimitsPerOccurrence(String value) {
        typeText(excessLimitsPerOccurrence, value, "Excess limits per occurrence");
    }

    public void setExcessLimitsAggregate(String value) {
        typeText(excessLimitsAggregate, value, "Excess limits aggregate");
    }

    public void setExcessLimitsExpirationDate(String value) {
        typeTextEnter(excessLimitsExpirationDate, value, "Excess limits expiration date");
    }

    public void setCombinedPerOccurrenceLimit(String value) {
        assertCellValue(combinedPerOccurrenceLimit, value, "Combined per occurrence limit");
    }

    public void setIsWorkersCompensationCoverageProvidedToEmployees(String value) throws Throwable {
        choose(isWorkersCompensationCoverageProvidedToEmployeesYes, isWorkersCompensationCoverageProvidedToEmployeesNo, value, "Is workers compensation coverage provided to employees");
    }

    public void setCOIExpirationDate(String value) {
        typeTextEnter(coiExpirationDate, value, "COI expiration date");
    }

    public void verifyCombinedPerOccurrenceLimitIsLessThan(String value) {
        Assert.assertTrue(Integer.parseInt(combinedPerOccurrenceLimit.getAttribute("value").replace(",", "")) < Integer.parseInt(value));
    }
}