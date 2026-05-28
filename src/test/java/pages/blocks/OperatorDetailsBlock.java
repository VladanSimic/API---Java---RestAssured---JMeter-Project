package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OperatorDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OperatorDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Gender']/../../../..//input")
    WebElement gender;
    @FindBy(xpath = "//div[text()='Marital Status']/../../../..//input")
    WebElement maritalStatus;
    @FindBy(xpath = "//div[text()='License Status']/../../../..//input")
    WebElement licenseStatus;
    @FindBy(xpath = "//div[text()='How long have you been licensed in the US?']/../../../..//input")
    WebElement howLongLicensedInUS;
    @FindBy(xpath = "//div[text()=\"Driver's License Number\"]/../../../..//input")
    WebElement driversLicenseNumber;
    @FindBy(xpath = "//div[text()=\"Driver's License State\"]/../../../..//input")
    WebElement driversLicenseState;
    @FindBy(xpath = "//div[text()='Occupation']/../../../..//input")
    WebElement driversOccupation;
    @FindBy(xpath = "//div[text()='Employer']/../../../..//input")
    WebElement driversLicenseEmployer;

    public void fillOperatorDetails(Map<String, String> data) throws Throwable {
        setGender(data.get("Gender"));
        setMaritalStatus(data.get("Marital_Status"));
        setLicenseStatus(data.get("License_Status"));
        setHowLongLicensedInUS(data.get("How_Long_Licensed_In_US"));
        setDriversLicenseNumber(data.get("Driver_License_Number"));
        setDriversLicenceState(data.get("Driver_License_State"));
        setDriverOccupation(data.get("Driver_Occupation"));
        setDriverEmployer(data.get("Driver_Employer"));
    }

    public void setGender(String value) throws Throwable {
        pause(2000);
        typeText(gender, value);
    }

    public void setMaritalStatus(String value) throws Throwable {
        typeText(maritalStatus, value);
    }

    public void setLicenseStatus(String value) throws Throwable {
        typeText(licenseStatus, value);
        saveChanges();
    }

    public void setDriversLicenseNumber(String value) throws Throwable {
        typeText(driversLicenseNumber, value);
    }

    public void setDriversLicenceState(String value) throws Throwable {
        typeText(driversLicenseState, value);
    }

    public void setDriverOccupation(String value) throws Throwable {
        typeText(driversOccupation, value);
    }

    public void setDriverEmployer(String value) throws Throwable {
        typeText(driversLicenseEmployer, value);
    }

    public void setHowLongLicensedInUS(String value) throws Throwable {
        typeText(howLongLicensedInUS, value);
    }
}