package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class GeneralContractorInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public GeneralContractorInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Company Name']/../../../..//input")
    WebElement companyName;
    @FindBy(xpath = "//div[text()='Business Address line 1']/../../../..//input")
    WebElement businessAddressLine1;
    @FindBy(xpath = "//div[text()='Business Address line 2']/../../../..//input")
    WebElement businessAddressLine2;
    @FindBy(xpath = "//div[text()='City']/../../../..//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='Zip']/../../../..//input")
    WebElement zip;
    @FindBy(xpath = "//div[text()='Company website']/../../../..//input")
    WebElement companyWebsite;
    @FindBy(xpath = "//div[text()='State']/../../../..//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='Primary Phone']/../../../..//input")
    WebElement primaryPhone;
    @FindBy(xpath = "//div[text()='Date GC Company was established/incorporated']/../../../..//input")
    WebElement dateGCCompanyWasEstablishedIncorporated;
    @FindBy(xpath = "//div[text()='General contractor license #']/../../../..//input")
    WebElement generalContractorLicense;
    @FindBy(xpath = "//div[text()='FEIN']/../../../..//input")
    WebElement fein;

    public void fillGeneralContractorInformationDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("general contractor information");
        try {
            setCompanyName(data.get("General_Contractor_Information_Company_Name"));
        } catch (Exception e) {
            //TODO CC figure out the visibility conditions of this field, seems not to be there for Home Vacant
        }
        setBusinessAddressLine1(data.get("General_Contractor_Information_Business_Address_Line1"));
        setBusinessAddressLine2(data.get("General_Contractor_Information_Business_Address_Line2"));
        setCity(data.get("General_Contractor_Information_City"));
        setZip(data.get("General_Contractor_Information_Zip"));
        setCompanyWebsite(data.get("General_Contractor_Information_Company_Website"));
        setState(data.get("General_Contractor_Information_State"));
        setPrimaryPhone(data.get("General_Contractor_Information_Primary_Phone"));
        setDateGCCompanyWasEstablishedIncorporated(data.get("General_Contractor_Information_Date_GC_Company_Was_Established_Incorporated"));
        setGeneralContractorLicense(data.get("General_Contractor_Information_General_Contractor_License"));
        setFEIN(data.get("General_Contractor_Information_FEIN"));
        saveChanges();
    }

    public void fillGeneralContractorInformationDetailsCC_END(Map<String, String> data) throws Throwable {
        setCompanyName(data.get("General_Contractor_Information_Company_Name_END"));
        setBusinessAddressLine1(data.get("General_Contractor_Information_Business_Address_Line1_END"));
        setBusinessAddressLine2(data.get("General_Contractor_Information_Business_Address_Line2_END"));
        setCity(data.get("General_Contractor_Information_City_END"));
        setZip(data.get("General_Contractor_Information_Zip_END"));
        setCompanyWebsite(data.get("General_Contractor_Information_Company_Website_END"));
        setState(data.get("General_Contractor_Information_State_END"));
        setPrimaryPhone(data.get("General_Contractor_Information_Primary_Phone_END"));
        setDateGCCompanyWasEstablishedIncorporated(data.get("General_Contractor_Information_Date_GC_Company_Was_Established_Incorporated_END"));
        setGeneralContractorLicense(data.get("General_Contractor_Information_General_Contractor_License_END"));
        setFEIN(data.get("General_Contractor_Information_FEIN_END"));
        saveChanges();
    }

    public void setCompanyName(String value) {
        typeText(companyName, value, "Company Name");
    }

    public void setBusinessAddressLine1(String value) {
        typeText(businessAddressLine1, value, "Business Address Line1");
    }

    public void setBusinessAddressLine2(String value) {
        typeText(businessAddressLine2, value, "Business Address Line2");
    }

    public void setCity(String value) {
        typeText(city, value, "City");
    }

    public void setZip(String value) {
        typeText(zip, value, "Zip");
    }

    public void setCompanyWebsite(String value) {
        typeText(companyWebsite, value, "Company Website");
    }

    public void setState(String value) {
        typeTextEnter(state, value, "State");
    }

    public void setPrimaryPhone(String value) {
        typeText(primaryPhone, value, "Primary Phone");
    }

    public void setDateGCCompanyWasEstablishedIncorporated(String value) {
        typeTextEnter(dateGCCompanyWasEstablishedIncorporated, value, "Date GC Company Was Established Incorporated");
    }

    public void setGeneralContractorLicense(String value) {
        typeText(generalContractorLicense, value, "General Contractor License");
    }

    public void setFEIN(String value) {
        typeText(fein, value, "FEIN");
    }

}