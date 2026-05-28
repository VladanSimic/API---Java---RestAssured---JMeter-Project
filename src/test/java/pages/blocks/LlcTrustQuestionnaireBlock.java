package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class LlcTrustQuestionnaireBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LlcTrustQuestionnaireBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[text()='Legal Entity Name']/../../../../..//input")
    WebElement legalEntityName;
    @FindBy(xpath = "//div[text()='Tax ID or FEIN']/../../../../..//input")
    WebElement taxIDOrFEIN;
    @FindBy(xpath = "//div[text()='LLC/Trust Questionnaire']/../../../../../..//div[text()='Address line 1']/../../../../..//input")
    WebElement addressLine1;
    @FindBy(xpath = "//div[text()='LLC/Trust Questionnaire']/../../../../../..//div[text()='Address line 2']/../../../../..//input")
    WebElement addressLine2;
    @FindBy(xpath = "//div[text()='LLC/Trust Questionnaire']/../../../../../..//div[text()='City']/../../../../..//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='Legal Entity Type']/../../../../..//input")
    WebElement legalEntityType;
    @FindBy(xpath = "//div[text()='Legal Entity Type']/../../../../../../../../../../../../tr[3]/td[2]//input")
    WebElement otherLegalEntityType;
    @FindBy(xpath = "//div[text()='LLC/Trust Questionnaire']/../../../../../..//div[text()='State']/../../../../..//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='LLC/Trust Questionnaire']/../../../../../..//div[text()='ZIP']/../../../../..//input")
    WebElement zip;
    @FindBy(xpath = "//div[text()='First Name']/../../../../..//input")
    WebElement firstName;
    @FindBy(xpath = "//div[text()='Last Name']/../../../../..//input")
    WebElement lastName;
    @FindBy(xpath = "//div[text()='DOB']/../../../../..//input")
    WebElement dob;
    @FindBy(xpath = "//div[text()='Type']/../../../../..//input")
    WebElement type;
    @FindBy(xpath = "//div[text()='Relationship to named insured']/../../../../..//input")
    WebElement relationshipToNamedInsured;
    @FindBy(xpath = "//div[contains(text(),'What is the address')]/../../../../../..//div[text()='Address line 1']/../../../../..//input")
    WebElement addressesAddress1;
    @FindBy(xpath = "//div[contains(text(),'What is the address')]/../../../../../..//div[text()='City']/../../../../..//input")
    WebElement addressesCity;
    @FindBy(xpath = "//div[contains(text(),'What is the address')]/../../../../../..//div[text()='ZIP']/../../../../..//input")
    WebElement addressesZIP;
    @FindBy(xpath = "//div[contains(text(),'What is the address')]/../../../../../..//div[text()='State']/../../../../..//input")
    WebElement addressesState;
    @FindBy(xpath = "//div[contains(text(),'purpose of the Entity')]/../../../..//textarea")
    WebElement purposeOfTheEntity;
    @FindBy(xpath = "//div[contains(text(),'Entity generate income or conduct business')]/../../../../div//label[text()='No']/..//input")
    WebElement entityGenerateIncomeOrConductBusinessNo;
    @FindBy(xpath = "//div[contains(text(),'Entity generate income or conduct business')]/../../../../div//label[text()='Yes']/..//input")
    WebElement entityGenerateIncomeOrConductBusinessYes;
    @FindBy(xpath = "//div[contains(text(),'Entity generate income in any other ways')]/../../../../div//label[text()='No']/..//input")
    WebElement entityGenerateIncomeInAnyOtherWaysNo;
    @FindBy(xpath = "//div[contains(text(),'Entity generate income in any other ways')]/../../../../div//label[text()='Yes']/..//input")
    WebElement entityGenerateIncomeInAnyOtherWaysYes;
    @FindBy(xpath = "//div[contains(text(),'Entity own any other real estate')]/../../../../div//label[text()='No']/..//input")
    WebElement entityOwnAnyOtherRealEstateNo;
    @FindBy(xpath = "//div[contains(text(),'Entity own any other real estate')]/../../../../div//label[text()='Yes']/..//input")
    WebElement entityOwnAnyOtherRealEstateYes;
    @FindBy(xpath = "//div[contains(text(),'Entity maintain any other insurance policies')]/../../../../div//label[text()='No']/..//input")
    WebElement entityMaintainAnyOtherInsurancePoliciesNo;
    @FindBy(xpath = "//div[contains(text(),'Entity maintain any other insurance policies')]/../../../../div//label[text()='Yes']/..//input")
    WebElement entityMaintainAnyOtherInsurancePoliciesYes;

    public void fillLlcTrustQuestionnaireBlockCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("LLC/Trust Questionnaire");
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2"));
        setCity(data.get("LLC_Trust_Questionnaire_City"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type"));
        setState(data.get("LLC_Trust_Questionnaire_State"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockCC_END(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_END"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_END"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_END"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_END"));
        setCity(data.get("LLC_Trust_Questionnaire_City_END"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_END"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_END"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_END"));
        setState(data.get("LLC_Trust_Questionnaire_State_END"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_END"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockHS(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2"));
        setCity(data.get("LLC_Trust_Questionnaire_City"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type"));
        setState(data.get("LLC_Trust_Questionnaire_State"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockHS_END(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_END"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_END"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_END"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_END"));
        setCity(data.get("LLC_Trust_Questionnaire_City_END"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_END"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_END"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_END"));
        setState(data.get("LLC_Trust_Questionnaire_State_END"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_END"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_OOS_END"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_OOS_END"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_OOS_END"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_OOS_END"));
        setCity(data.get("LLC_Trust_Questionnaire_City_OOS_END"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_OOS_END"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_OOS_END"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_OOS_END"));
        setState(data.get("LLC_Trust_Questionnaire_State_OOS_END"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_OOS_END"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockHS_RNW(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_RNW"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_RNW"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_RNW"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_RNW"));
        setCity(data.get("LLC_Trust_Questionnaire_City_RNW"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_RNW"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_RNW"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_RNW"));
        setState(data.get("LLC_Trust_Questionnaire_State_RNW"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_RNW"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireDetailsPA(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line 2"));
        setCity(data.get("LLC_Trust_Questionnaire_City"));
        setState(data.get("LLC_Trust_Questionnaire_State"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP"));
        saveChanges();
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"), data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_Other"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireDetailsPA_END(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_END"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_END"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_END"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line 2_END"));
        setCity(data.get("LLC_Trust_Questionnaire_City_END"));
        setState(data.get("LLC_Trust_Questionnaire_State_END"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_END"));
        saveChanges();
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_END"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_END"), data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_Other_END"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_OOS_END"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_OOS_END"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_OOS_END"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line 2_OOS_END"));
        setCity(data.get("LLC_Trust_Questionnaire_City_OOS_END"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_OOS_END"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_OOS_END"), data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_Other_OOS_END"));
        setState(data.get("LLC_Trust_Questionnaire_State_OOS_END"));
        saveChanges();
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_OOS_END"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireDetailsPA_RNW(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_RNW"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_RNW"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_RNW"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line 2_RNW"));
        setCity(data.get("LLC_Trust_Questionnaire_City_RNW"));
        setState(data.get("LLC_Trust_Questionnaire_State_RNW"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_RNW"));
        saveChanges();
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_RNW"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_RNW"), data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_Other_RNW"));
        saveChanges();
    }

    public void fillLLCPageQuestionaireAndDetails(Map<String, String> data) throws Throwable {
        fillLlcTrustQuestionnaireBlock(data);
        fillWhatIsAddressesBlock(data);
        fillAdditionalDetails();
    }

    public void fillLlcTrustQuestionnaireBlockHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("LLC/Trust Questionnaire");
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2"));
        setCity(data.get("LLC_Trust_Questionnaire_City"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type"));
        setState(data.get("LLC_Trust_Questionnaire_State"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("LLC/Trust Questionnaire");
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_END"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_END"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_END"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_END"));
        setCity(data.get("LLC_Trust_Questionnaire_City_END"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_END"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_END"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_END"));
        setState(data.get("LLC_Trust_Questionnaire_State_END"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_END"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("LLC/Trust Questionnaire");
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_OOS_END"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_OOS_END"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_OOS_END"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_OOS_END"));
        setCity(data.get("LLC_Trust_Questionnaire_City_OOS_END"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_OOS_END"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_OOS_END"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_OOS_END"));
        setState(data.get("LLC_Trust_Questionnaire_State_OOS_END"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_OOS_END"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("LLC/Trust Questionnaire");
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_RNW"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_RNW"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_RNW"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_RNW"));
        setCity(data.get("LLC_Trust_Questionnaire_City_RNW"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_RNW"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_RNW"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_RNW"));
        setState(data.get("LLC_Trust_Questionnaire_State_RNW"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_RNW"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlock(Map<String, String> data) throws Throwable {
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN"));
        pause(1000);
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1"));
        pause(1000);
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2"));
        setCity(data.get("LLC_Trust_Questionnaire_City"));
        pause(1000);
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type"));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type"));
        pause(1000);
        setState(data.get("LLC_Trust_Questionnaire_State"));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP"));
        pause(1000);
        saveChanges();
    }

    public void fillWhatIsAddressesBlock(Map<String, String> data) throws Throwable {
        typeText(addressesAddress1, data.get("LLC_Trust_Questionnaire_Address_Line_1"), "Address Line 1");
        pause(1000);
        typeText(addressesCity, data.get("LLC_Trust_Questionnaire_City"), "City");
        pause(1000);
        typeText(addressesState, data.get("LLC_Trust_Questionnaire_State"), "State");
        pause(1000);
        typeText(addressesZIP, data.get("LLC_Trust_Questionnaire_ZIP"), "ZIP");
        pause(1000);
        saveChanges();
    }

    public void fillAdditionalDetails() throws Throwable {
        typeText(purposeOfTheEntity, "test Entity", "Purpose of Entity");
        pause(1000);
        clickElement(entityGenerateIncomeOrConductBusinessNo, "Entity Generate Income or Conduct Business");
        pause(1000);
        clickElement(entityGenerateIncomeInAnyOtherWaysNo, "Entity Generate Income in Any Other Ways");
        pause(1000);
        clickElement(entityOwnAnyOtherRealEstateNo, "Entity Own Any Other Real Estate");
        pause(1000);
        clickElement(entityMaintainAnyOtherInsurancePoliciesNo, "Entity maintain any other insurance policies");
        pause(1000);
        saveChanges();
    }

    public void verifyLegalEntityName(String value) {
        assertCellValue(legalEntityName, value, "Legal Entity Name");
    }

    public void setTaxIDOrFEIN(String value) {
        typeText(taxIDOrFEIN, value, "Tax ID Or FEIN");
    }

    public void setAddressLine1(String value) {
        typeText(addressLine1, value, "Address Line 1");
    }

    public void setAddressLine2(String value) {
        typeText(addressLine2, value, "Address Line 2");
    }

    public void setCity(String value) {
        typeText(city, value, "City");
    }

    public void setLegalEntityType(String value) throws Throwable {
        typeTextEnter(legalEntityType, value, "Legal Entity Type");
        clickFooter();
    }

    public void setOtherLegalEntityType(String type, String value) {
        if (type.equalsIgnoreCase("Other")) {
            typeText(otherLegalEntityType, value, "Other Legal Entity Type");
        }
    }

    public void setState(String value) throws Throwable {
        typeTextEnter(state, value, "State");
        clickFooter();
    }

    public void setZIP(String value) {
        typeTextEnter(zip, value, "ZIP");
    }

    public void setFirstName(String value) {
        typeText(firstName, value, "First Name");
    }

    public void setLastName(String value) {
        typeText(lastName, value, "Last Name");
    }

    public void setDob(String value) {
        typeText(dob, value, "DOB");
    }

    public void setType(String value) {
        typeTextEnter(type, value, "Type");
    }

    public void setRelationshipToNamedInsured(String value) {
        typeTextEnter(relationshipToNamedInsured, value, "Relationship to named insured");
    }

    public void setLegalEntityName(String value) {
        typeText(legalEntityName, value, "Legal Entity Name");
    }

    public void fillLlcTrustQuestionnaireBlock(Map<String, String> data, int i) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_" + i));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_" + i));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_" + i));
        pause(1000);
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_" + i));
        setCity(data.get("LLC_Trust_Questionnaire_City_" + i));
        pause(1000);
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_" + i));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_" + i), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_" + i));
        pause(1000);
        setState(data.get("LLC_Trust_Questionnaire_State_" + i));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_" + i));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlock_END(Map<String, String> data, int i) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_END_" + i));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_END_" + i));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_END_" + i));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_END_" + i));
        setCity(data.get("LLC_Trust_Questionnaire_City_END_" + i));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_END_" + i));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_END_" + i), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_END_" + i));
        setState(data.get("LLC_Trust_Questionnaire_State_END_" + i));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_END_" + i));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlock_OOS_END(Map<String, String> data, int i) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_OOS_END_" + i));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_OOS_END_" + i));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_OOS_END_" + i));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_OOS_END_" + i));
        setCity(data.get("LLC_Trust_Questionnaire_City_OOS_END_" + i));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_OOS_END_" + i));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_OOS_END_" + i), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_OOS_END_" + i));
        setState(data.get("LLC_Trust_Questionnaire_State_OOS_END_" + i));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_OOS_END_" + i));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlock_RNW(Map<String, String> data, int i) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name_RNW_" + i));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN_RNW_" + i));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1_RNW_" + i));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2_RNW_" + i));
        setCity(data.get("LLC_Trust_Questionnaire_City_RNW_" + i));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_RNW_" + i));
        pause(1000);
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Block_Legal_Entity_Type_RNW_" + i), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type_RNW_" + i));
        setState(data.get("LLC_Trust_Questionnaire_State_RNW_" + i));
        pause(1000);
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP_RNW_" + i));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockPF(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line_2"));
        setCity(data.get("LLC_Trust_Questionnaire_City"));
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"), data.get("LLC_Trust_Questionnaire_Other_Legal_Entity_Type"));
        setState(data.get("LLC_Trust_Questionnaire_State"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP"));
        saveChanges();
    }

    public void fillLlcTrustQuestionnaireBlockFS(Map<String, String> data) {

    }

    public void fillLlcTrustQuestionnaireDetailsES(Map<String, String> data) throws Throwable {
        verifyLegalEntityName(data.get("LLC_Trust_Questionnaire_Legal_Entity_Name"));
        setTaxIDOrFEIN(data.get("LLC_Trust_Questionnaire_Tax_ID_Or_FEIN"));
        setAddressLine1(data.get("LLC_Trust_Questionnaire_Address_Line_1"));
        setAddressLine2(data.get("LLC_Trust_Questionnaire_Address_Line 2"));
        setCity(data.get("LLC_Trust_Questionnaire_City"));
        setState(data.get("LLC_Trust_Questionnaire_State"));
        setZIP(data.get("LLC_Trust_Questionnaire_ZIP"));
        saveChanges();
        setLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"));
        setOtherLegalEntityType(data.get("LLC_Trust_Questionnaire_Legal_Entity_Type"), data.get("LLC_Trust_Questionnaire_Legal_Entity_Type_Other"));
        saveChanges();
    }
}