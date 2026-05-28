package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class SubcontractorsLimitsOfInsuranceBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public SubcontractorsLimitsOfInsuranceBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Does the Company require all subcontractors carry CGL and Workers Compensation insurance?']/../../../..//label[text()='Yes']/..//input")
    WebElement requireAllSubcontractorsYes;
    @FindBy(xpath = "//div[text()='Does the Company require all subcontractors carry CGL and Workers Compensation insurance?']/../../../..//label[text()='No']/..//input")
    WebElement requireAllSubcontractorsNo;
    @FindBy(xpath = "//div[text()='Does the Company  require the subcontractors to submit Certificates of Insurance as part of the subcontract bid process?']/../../../..//label[text()='Yes']/..//input")
    WebElement requireTheSubcontractorsToSubmitYes;
    @FindBy(xpath = "//div[text()='Does the Company  require the subcontractors to submit Certificates of Insurance as part of the subcontract bid process?']/../../../..//label[text()='No']/..//input")
    WebElement requireTheSubcontractorsToSubmitNo;

    public void fillSubcontractorsLimitsInsuranceDetailsCC(Map<String, String> data) throws Throwable {
        setDoesTheCompanyRequireAllSubcontractors(data.get("Subcontractors_Limits_Insurance_Does_The_Company_Require_All_Subcontractors"));
        setDoesTheCompanyRequireTheSubcontractorsToSubmit(data.get("Subcontractors_Limits_Insurance_Does_The_Company_Require_The_Subcontractors_to_Submit"));
        verifyBlockExists("limits of insurance");
    }

    public void fillSubcontractorsLimitsInsuranceDetailsCC_END(Map<String, String> data) throws Throwable {
        setDoesTheCompanyRequireAllSubcontractors(data.get("Subcontractors_Limits_Insurance_Does_The_Company_Require_All_Subcontractors_END"));
        setDoesTheCompanyRequireTheSubcontractorsToSubmit(data.get("Subcontractors_Limits_Insurance_Does_The_Company_Require_The_Subcontractors_to_Submit_END"));
        saveChanges();
    }

    public void setDoesTheCompanyRequireAllSubcontractors(String value) throws Throwable {
        choose(requireAllSubcontractorsYes, requireAllSubcontractorsNo, value, "Does the company require all subcontractors");
    }

    public void setDoesTheCompanyRequireTheSubcontractorsToSubmit(String value) throws Throwable {
        choose(requireTheSubcontractorsToSubmitYes, requireTheSubcontractorsToSubmitNo, value, "Does the company require the subcontractors to submit");
    }

}