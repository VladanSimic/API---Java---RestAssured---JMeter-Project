package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ProjectManagerContactInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ProjectManagerContactInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='First Name']/../../../..//input")
    WebElement firstName;
    @FindBy(xpath = "//div[text()='Last Name']/../../../..//input")
    WebElement lastName;
    @FindBy(xpath = "//div[text()='Email Address']/../../../..//input")
    WebElement email;
    @FindBy(xpath = "//div[text()='Phone Number']/../../../..//input")
    WebElement phoneNumber;

    public void fillProjectManagerConcatInformationDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("project manager contact information");
        setFirstName(data.get("Project_Manager_Contact_Information_First_Name"));
        setLastName(data.get("Project_Manager_Contact_Information_Last_Name"));
        setEmailAddress(data.get("Project_Manager_Contact_Information_Email_Address"));
        setPhoneNumber(data.get("Project_Manager_Contact_Information_Phone_Number"));
        saveChanges();
    }

    public void fillProjectManagerConcatInformationDetailsCC_END(Map<String, String> data) throws Throwable {
        setFirstName(data.get("Project_Manager_Contact_Information_First_Name_END"));
        setLastName(data.get("Project_Manager_Contact_Information_Last_Name_END"));
        setEmailAddress(data.get("Project_Manager_Contact_Information_Email_Address_END"));
        setPhoneNumber(data.get("Project_Manager_Contact_Information_Phone_Number_END"));
        saveChanges();
    }

    public void setFirstName(String value) {
        typeText(firstName, value, "First name");
    }

    public void setLastName(String value) {
        typeText(lastName, value, "Last name");
    }

    public void setEmailAddress(String value) {
        typeText(email, value, "Email address");
    }

    public void setPhoneNumber(String value) {
        typeText(phoneNumber, value, "Phone number");
    }

    public void fillProjectManagerConcatInformationDetailsHS(Map<String, String> data) throws Throwable {
        setFirstName(data.get("Project_Manager_Contact_Information_First_Name"));
        setLastName(data.get("Project_Manager_Contact_Information_Last_Name"));
        setEmailAddress(data.get("Project_Manager_Contact_Information_Email_Address"));
        setPhoneNumber(data.get("Project_Manager_Contact_Information_Phone_Number"));
        saveChanges();
    }

    public void fillProjectManagerConcatInformationDetailsHS_END(Map<String, String> data) throws Throwable {
        setFirstName(data.get("Project_Manager_Contact_Information_First_Name_END"));
        setLastName(data.get("Project_Manager_Contact_Information_Last_Name_END"));
        setEmailAddress(data.get("Project_Manager_Contact_Information_Email_Address_END"));
        setPhoneNumber(data.get("Project_Manager_Contact_Information_Phone_Number_END"));
        saveChanges();
    }

    public void fillProjectManagerConcatInformationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        setFirstName(data.get("Project_Manager_Contact_Information_First_Name_OOS_END"));
        setLastName(data.get("Project_Manager_Contact_Information_Last_Name_OOS_END"));
        setEmailAddress(data.get("Project_Manager_Contact_Information_Email_Address_OOS_END"));
        setPhoneNumber(data.get("Project_Manager_Contact_Information_Phone_Number_OOS_END"));
        saveChanges();
    }

    public void fillProjectManagerConcatInformationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        setFirstName(data.get("Project_Manager_Contact_Information_First_Name_RNW"));
        setLastName(data.get("Project_Manager_Contact_Information_Last_Name_RNW"));
        setEmailAddress(data.get("Project_Manager_Contact_Information_Email_Address_RNW"));
        setPhoneNumber(data.get("Project_Manager_Contact_Information_Phone_Number_RNW"));
        saveChanges();
    }

    public void fillProjectManagerConcatInformationDetailsFS(Map<String, String> data) {

    }
}