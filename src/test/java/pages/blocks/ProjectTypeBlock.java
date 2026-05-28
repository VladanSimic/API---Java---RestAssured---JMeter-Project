package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ProjectTypeBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ProjectTypeBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Project Type']/../../../..//input")
    WebElement projectType;
    @FindBy(xpath = "//div[text()='Has the project started?']/../../../..//label[text()='Yes']/..//input")
    WebElement hasTheProjectStartedYes;
    @FindBy(xpath = "//div[text()='Has the project started?']/../../../..//label[text()='No']/..//input")
    WebElement hasTheProjectStartedNo;
    @FindBy(xpath = "//div[text()='FAC Reinsurance Required?']/../../../..//label[text()='Yes']/..//input")
    WebElement FACReinsuranceRequiredYes;
    @FindBy(xpath = "//div[text()='FAC Reinsurance Required?']/../../../..//label[text()='No']/..//input")
    WebElement FACReinsuranceRequiredNo;
    @FindBy(xpath = "//div[text()='FAC Premium']/../../../..//input")
    WebElement FACPremium;
    @FindBy(xpath = "//div[text()='Certificate #']/../../../..//input")
    WebElement certificate;
    @FindBy(xpath = "//div[text()='Expiration Date']/../../../..//input[@aria-readonly='false']")
    WebElement expirationDate;
    @FindBy(xpath = "//div[text()='Limit']/../../../..//input")
    WebElement limit;
    @FindBy(xpath = "//div[text()='Carrier']/../../../..//input")
    WebElement carrier;
    @FindBy(xpath = "//div[text()='When will it start?']/../../../..//input")
    WebElement whenWillItStart;
    @FindBy(xpath = "//div[text()='When did it start?']/../../../..//input")
    WebElement whenDidItStart;
    @FindBy(xpath = "//div[text()='Has the foundation stage been completed prior to the policy effective date?']/../../../..//label[text()='Yes']/..//input")
    WebElement hasTheFoundationStageBeenCompletedYes;
    @FindBy(xpath = "//div[text()='Has the foundation stage been completed prior to the policy effective date?']/../../../..//label[text()='No']/..//input")
    WebElement hasTheFoundationStageBeenCompletedNo;
    @FindBy(xpath = "//div[text()='Anticipated Start Date']/../../../..//input")
    WebElement anticipatedStartDate;

    public void fillProjectTypeDetailsCC(Map<String, String> data) throws Throwable {
        String projectType = data.get("Project_Type_Project_Type");
        verifyBlockExists("project type");
        if (hasValue(projectType)) {
            setProjectType(projectType);
            switch (projectType) {
                case "Ground Up Construction": {
                    setHasTheFoundationStageBeenCompleted(data.get("Project_Type_Has_The_Foundation_Stage_Been_Completed"));
                    setHasTheProjectStarted(data.get("Project_Type_Has_The_Project_Started"));
                    setWhenProjectStartsHaveStarted(data);
                }
                break;
                case "Major Renovation/Remodel": {
                    setHasTheProjectStarted(data.get("Project_Type_Has_The_Project_Started"));
                    setWhenProjectStartsHaveStarted(data);
                }
                break;
                case "Vacant Pending Reno": {
                    setAnticipatedStartDate(data.get("Project_Type_Anticipated_Start_Date"));
                }
                break;
            }
        }

        setFACReinsuranceRequired(data);
        saveChanges();
    }

    public void fillProjectTypeDetailsCC_END(Map<String, String> data) throws Throwable {
        String projectTypeEND = data.get("Project_Type_Project_Type_END");

        if (hasValue(projectTypeEND)) {
            setProjectType(projectTypeEND);

            switch (data.get("Project_Type_Project_Type_END")) {
                case "Ground Up Construction": {
                    setHasTheFoundationStageBeenCompleted(data.get("Project_Type_Has_The_Foundation_Stage_Been_Completed_END"));
                    setHasTheProjectStarted(data.get("Project_Type_Has_The_Project_Started_END"));
                    setWhenProjectStartsHaveStarted_END(data);
                }
                break;
                case "Major Renovation/Remodel": {
                    setHasTheProjectStarted(data.get("Project_Type_Has_The_Project_Started_END"));
                    setWhenProjectStartsHaveStarted_END(data);
                }
                break;
                case "Vacant Pending Reno": {
                    setAnticipatedStartDate(data.get("Project_Type_Anticipated_Start_Date_END"));
                }
                break;
            }
        }

        setFACReinsuranceRequired_END(data);
        saveChanges();
    }

    private void setFACReinsuranceRequired_END(Map<String, String> data) throws Throwable {
        String reinsuranceRequired = data.get("Project_Type_FAC_Reinsurance_Required");
        String reinsuranceRequiredEND = data.get("Project_Type_FAC_Reinsurance_Required_END");

        setFACReinsuranceRequired(reinsuranceRequiredEND);
        if (hasValue(reinsuranceRequired) && reinsuranceRequired.equalsIgnoreCase("Yes") ||
                hasValue(reinsuranceRequiredEND) && reinsuranceRequiredEND.equalsIgnoreCase("Yes")) {
            setCarrier(data.get("Project_Type_Carrier_END"));
            setLimit(data.get("Project_Type_Limit_END"));
            setExpirationDate(data.get("Project_Type_Expiration_Date_END"));
            setCertificate(data.get("Project_Type_Certificate_END"));
            setFACPremium(data.get("Project_Type_FAC_Premium_END"));
        }
    }

    private void setWhenProjectStartsHaveStarted_END(Map<String, String> data) {
        if (data.get("Project_Type_Has_The_Project_Started_END").equalsIgnoreCase("Yes")) {
            setWhenDidItStart(data.get("Project_Type_When_Did_It_Start_END"));
        } else {
            setWhenWillItStart(data.get("Project_Type_When_Will_It_Start_END"));
        }
    }

    public void setFACReinsuranceRequired(Map<String, String> data) throws Throwable {
        String reinsuranceRequired = data.get("Project_Type_FAC_Reinsurance_Required");
        setFACReinsuranceRequired(reinsuranceRequired);
        if (hasValue(reinsuranceRequired) && reinsuranceRequired.equalsIgnoreCase("Yes")) {
            setCarrier(data.get("Project_Type_Carrier"));
            setLimit(data.get("Project_Type_Limit"));
            setExpirationDate(data.get("Project_Type_Expiration_Date"));
            setCertificate(data.get("Project_Type_Certificate"));
            setFACPremium(data.get("Project_Type_FAC_Premium"));
        }
    }

    public void setFACReinsuranceRequired(String FAC) throws Throwable {
        choose(FACReinsuranceRequiredYes, FACReinsuranceRequiredNo, FAC, "FAC Reinsurance Required");
    }

    public void setAnticipatedStartDate(String value) {
        typeText(anticipatedStartDate, value, "Project type Anticipated Date");
    }

    public void setFACPremium(String value) {
        typeText(FACPremium, value, "Project FAC premium");
    }

    public void setCertificate(String value) {
        typeText(certificate, value, "Project type certificate");
    }

    public void setExpirationDate(String value) {
        typeText(expirationDate, value, "Project type expiration date");
    }

    public void setLimit(String value) {
        typeText(limit, value, "Project type limit");
    }

    public void setCarrier(String value) {
        typeText(carrier, value, "Project type carrier");
    }

    public void setWhenProjectStartsHaveStarted(Map<String, String> data) {
        String condition = data.get("Project_Type_Has_The_Project_Started");
        if (hasValue(condition) && condition.equalsIgnoreCase("Yes")) {
            setWhenDidItStart(data.get("Project_Type_When_Did_It_Start"));
        } else {
            setWhenWillItStart(data.get("Project_Type_When_Will_It_Start"));
        }
    }

    public void setWhenWillItStart(String value) {
        typeText(whenWillItStart, value, "When will it start");
    }

    public void setWhenDidItStart(String value) {
        typeText(whenDidItStart, value, "When did it start");
    }

    public void setHasTheFoundationStageBeenCompleted(String value) throws Throwable {
        choose(hasTheFoundationStageBeenCompletedYes, hasTheFoundationStageBeenCompletedNo, value, "Has the foundation stage been completed");
    }

    public void setHasTheProjectStarted(String value) throws Throwable {
        choose(hasTheProjectStartedYes, hasTheProjectStartedNo, value, "Has the project started");
    }

    public void setProjectType(String value) throws Throwable {
        typeTextEnter(projectType, value, "Project Type");
        pause(3000);
        if (hasValue(projectType.getAttribute("value")) && projectType.getAttribute("value").contains("Select")) {
            typeTextEnter(projectType, value, "Project Type");
            pause(3000);
        }
        saveChanges();
    }

}