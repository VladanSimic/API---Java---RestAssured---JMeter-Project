package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class GeneralContractorLiabilityCoverageBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public GeneralContractorLiabilityCoverageBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Is the general contractor liability coverage adequate for this project?']/../../../..//input")
    WebElement coverageAdequateForThisProject;
    @FindBy(xpath = "//div[text()='general contractor liability coverage (underwriting only)']/../../../../../../..//label[text()='Manager override']/..//input")
    WebElement managerOverride;

    public void fillGeneralContractorLiabilityCoverageDetailsCC(Map<String, String> data) throws Throwable {
        setIsTheGeneralContractorLiabilityCoverage(data.get("General_Contractor_Liability_Coverage_Is_The_General_Contractor_Liability_Coverage"));
        setManagerOverride(data.get("General_Contractor_Liability_Coverage_Manager_Override"), data.get("User_Role"));
    }

    public void fillGeneralContractorLiabilityCoverageDetailsCC_END(Map<String, String> data) throws Throwable {
        setIsTheGeneralContractorLiabilityCoverage(data.get("General_Contractor_Liability_Coverage_Is_The_General_Contractor_Liability_Coverage_END"));
        setManagerOverride(data.get("General_Contractor_Liability_Coverage_Manager_Override_END"));
        saveChanges();
    }

    public void setIsTheGeneralContractorLiabilityCoverage(String value) throws Throwable {
        typeTextEnter(coverageAdequateForThisProject, value, "Is the general contractor liability coverage adequate for this project");
        clickFooter();
    }

    public void setManagerOverride(String value, String userRole) throws Throwable {
        if (hasValue(userRole)) {
            if (!userRole.equalsIgnoreCase("UnderwritingTechnicianRole") &&
                    !userRole.equalsIgnoreCase("SeniorUWTechnicianRole") &&
                    !userRole.equalsIgnoreCase("UWSA1") &&
                    !userRole.equalsIgnoreCase("UWSA2") &&
                    !userRole.equalsIgnoreCase("UWSSA") &&
                    !userRole.equalsIgnoreCase("UWSRM")) {
                checkCheckbox(managerOverride, value, "Manager override");
            }
        } else {
            checkCheckbox(managerOverride, value, "Manager override");
        }
    }

    public void setManagerOverride(String value) throws Throwable {
        checkCheckbox(managerOverride, value, "Manager override");
    }

}