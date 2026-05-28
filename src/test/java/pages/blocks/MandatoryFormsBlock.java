package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class MandatoryFormsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public MandatoryFormsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Diligent Effort Form']/../../../../../../../../../../..//input[@aria-autocomplete=\"list\"]")
    WebElement diligentEffortFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Diligent Effort Form']/../../../../../../../../../../..//input[@aria-autocomplete=\"none\"]")
    WebElement diligentEffortFormDateReceived;
    @FindBy(xpath = "//div[text()='Contract between Member and GC']/../../../../../../../../../../..//input[@aria-autocomplete=\"list\"]")
    WebElement contractBetweenMemberAndGCReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Contract between Member and GC']/../../../../../../../../../../..//input[@aria-autocomplete=\"none\"]")
    WebElement contractBetweenMemberAndGCDateReceived;
    @FindBy(xpath = "//div[text()='Member Application']/../../../../../../../../../../..//input[@aria-autocomplete=\"list\"]")
    WebElement memberApplicationReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Member Application']/../../../../../../../../../../..//input[@aria-autocomplete=\"none\"]")
    WebElement memberApplicationDateReceived;
    @FindBy(xpath = "//div[text()='Commercial General Liability (CGL) Certificate of Insurance']/../../../../../../../../../../..//input[@aria-autocomplete=\"list\"]")
    WebElement commercialGeneralLiabilityCGLCertificateOfInsuranceReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Commercial General Liability (CGL) Certificate of Insurance']/../../../../../../../../../../..//input[@aria-autocomplete=\"none\"]")
    WebElement commercialGeneralLiabilityCGLCertificateOfInsuranceDateReceived;
    @FindBy(xpath = "//div[text()='Diligent Effort Form']/../../../../../../../../../../..//span[text()=\"upload\"]")
    WebElement uploadDiligentEffortForm;
    @FindBy(xpath = "//div[text()='Contract between Member and GC']/../../../../../../../../../../..//span[text()=\"upload\"]")
    WebElement uploadContractBetweenMemberAndGCForm;
    @FindBy(xpath = "//div[text()='Member Application']/../../../../../../../../../../..//span[text()=\"upload\"]")
    WebElement uploadMemberApplicationForm;
    @FindBy(xpath = "//div[text()='Commercial General Liability (CGL) Certificate of Insurance']/../../../../../../../../../../..//span[text()=\"upload\"]")
    WebElement uploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm;
    @FindBy(xpath = "//div[text()='Contents']/../../../..//input")
    WebElement contents;
    @FindBy(xpath = "//div[text()='Document Name (appears as name on document link)']/../../../..//input")
    WebElement documentName;
    @FindBy(xpath = "//div[text()='Description']/../../../..//textarea")
    WebElement description;
    @FindBy(xpath = "//div[text()='Internal Use']/../../../..//input")
    WebElement internalUse;
    @FindBy(xpath = "//span[text()='Upload']")
    WebElement upload;
    @FindBy(xpath = "//span[text()='File Upload']")
    WebElement uploadFile;
    @FindBy(xpath = "//div[text()='Statement of Diligent Effort']/../../../../../../../../../../..//input")
    WebElement statementOfDiligentEffort;
    @FindBy(xpath = "//div[text()='Current Primary Flood Policy']/../../../../../../../../../../..//input")
    WebElement currentPFPolicy;

    public void fillMandatoryFormsDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("mandatory forms");
        if (!data.get("State").equalsIgnoreCase("SC"))
            addDiligentEffortForm(data);
        addContractBetweenMemberAndGC(data);
        addMemberApplication(data);
        addCommercialGeneralLiabilityCGLCertificateOfInsurance(data);
        saveChanges();
    }

    public void fillMandatoryFormsDetailsCC_END(Map<String, String> data) throws Throwable {
        addDiligentEffortForm_END(data);
        addContractBetweenMemberAndGC_END(data);
        addMemberApplication_END(data);
        addCommercialGeneralLiabilityCGLCertificateOfInsurance_END(data);
        saveChanges();
    }

    public void addDiligentEffortForm(Map<String, String> data) throws Throwable {
        setDiligentEffortFormDateReceived(data.get("Mandatory_Forms_Diligent_Effort_Form_Date_Received"));
        setDiligentEffortFormReviewedAndAccepted(data.get("Mandatory_Forms_Diligent_Effort_Form_Reviewed_And_Accepted"));
        uploadDiligentEffortForm(data);
    }

    public void addDiligentEffortForm_END(Map<String, String> data) throws Throwable {
        setDiligentEffortFormDateReceived(data.get("Mandatory_Forms_Diligent_Effort_Form_Date_Received_END"));
        setDiligentEffortFormReviewedAndAccepted(data.get("Mandatory_Forms_Diligent_Effort_Form_Reviewed_And_Accepted_END"));
        uploadDiligentEffortForm_END(data);
    }

    public void uploadDiligentEffortForm(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Diligent_Effort_Form_File_Upload"))) {
            clickUploadDiligentEffortForm();
            verifyContents(data.get("Mandatory_Forms_Diligent_Effort_Form_Contents"));
            setDocumentName(data.get("Mandatory_Forms_Diligent_Effort_Form_Document_Name"));
            setDescription(data.get("Mandatory_Forms_Diligent_Effort_Form_Description"));
            setInternalUse(data.get("Mandatory_Forms_Diligent_Effort_Form_Internal_Use"));
            upload(data.get("Mandatory_Forms_Diligent_Effort_Form_File_Upload"));
        }
    }

    public void uploadDiligentEffortForm_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Diligent_Effort_Form_File_Upload_END"))) {
            clickUploadDiligentEffortForm();
            verifyContents(data.get("Mandatory_Forms_Diligent_Effort_Form_Contents_END"));
            setDocumentName(data.get("Mandatory_Forms_Diligent_Effort_Form_Document_Name_END"));
            setDescription(data.get("Mandatory_Forms_Diligent_Effort_Form_Description_END"));
            setInternalUse(data.get("Mandatory_Forms_Diligent_Effort_Form_Internal_Use_END"));
            upload(data.get("Mandatory_Forms_Diligent_Effort_Form_File_Upload_END"));
        }
    }

    public void setDiligentEffortFormReviewedAndAccepted(String value) {
        typeText(diligentEffortFormReviewedAndAccepted, value, "Diligent effort form reviewed and accepted");
    }

    public void setDiligentEffortFormDateReceived(String value) {
        typeText(diligentEffortFormDateReceived, value, "Diligent effort form date received");
    }

    public void addContractBetweenMemberAndGC(Map<String, String> data) throws Throwable {
        setContractBetweenMemberAndGCDateReceived(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Date_Received"));
        setContractBetweenMemberAndGCReviewedAndAccepted(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Reviewed_And_Accepted"));
        uploadContractBetweenMemberAndGCForm(data);
    }

    public void addContractBetweenMemberAndGC_END(Map<String, String> data) throws Throwable {
        setContractBetweenMemberAndGCDateReceived(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Date_Received_END"));
        setContractBetweenMemberAndGCReviewedAndAccepted(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Reviewed_And_Accepted_END"));
        uploadContractBetweenMemberAndGCForm_END(data);
    }

    public void uploadContractBetweenMemberAndGCForm(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_File_Upload"))) {
            clickUploadContractBetweenMemberAndGCForm();
            verifyContents(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Contents"));
            setDocumentName(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Document_Name"));
            setDescription(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Description"));
            setInternalUse(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Internal_Use"));
            upload(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_File_Upload"));
        }
    }

    public void uploadContractBetweenMemberAndGCForm_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_File_Upload_END"))) {
            clickUploadContractBetweenMemberAndGCForm();
            verifyContents(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Contents_END"));
            setDocumentName(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Document_Name_END"));
            setDescription(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Description_END"));
            setInternalUse(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_Internal_Use_END"));
            upload(data.get("Mandatory_Forms_Contract_Between_Member_And_GC_File_Upload_END"));
        }
    }

    public void setContractBetweenMemberAndGCReviewedAndAccepted(String value) {
        typeText(contractBetweenMemberAndGCReviewedAndAccepted, value, "Contract between member and GCR reviewed and accepted");
    }

    public void setContractBetweenMemberAndGCDateReceived(String value) {
        typeText(contractBetweenMemberAndGCDateReceived, value, "Contract between member andGC date received");
    }

    public void addMemberApplication(Map<String, String> data) throws Throwable {
        setMemberApplicationDateReceived(data.get("Mandatory_Forms_Member_Application_Date_Received"));
        setMemberApplicationReviewedAndAccepted(data.get("Mandatory_Forms_Member_Application_Date_Reviewed_And_Accepted"));
        uploadMemberApplicationForm(data);
    }

    public void addMemberApplication_END(Map<String, String> data) throws Throwable {
        setMemberApplicationDateReceived(data.get("Mandatory_Forms_Member_Application_Date_Received_END"));
        setMemberApplicationReviewedAndAccepted(data.get("Mandatory_Forms_Member_Application_Date_Reviewed_And_Accepted_END"));
        uploadMemberApplicationForm_END(data);
    }

    public void uploadMemberApplicationForm(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Member_Application_File_Upload"))) {
            clickUploadMemberApplicationForm();
            verifyContents(data.get("Mandatory_Forms_Member_Application_Contents"));
            setDocumentName(data.get("Mandatory_Forms_Member_Application_Document_Name"));
            setDescription(data.get("Mandatory_Forms_Member_Application_Description"));
            setInternalUse(data.get("Mandatory_Forms_Member_Application_Internal_Use"));
            upload(data.get("Mandatory_Forms_Member_Application_File_Upload"));
        }
    }

    public void uploadMemberApplicationForm_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Member_Application_File_Upload_END"))) {
            clickUploadMemberApplicationForm();
            verifyContents(data.get("Mandatory_Forms_Member_Application_Contents_END"));
            setDocumentName(data.get("Mandatory_Forms_Member_Application_Document_Name_END"));
            setDescription(data.get("Mandatory_Forms_Member_Application_Description_END"));
            setInternalUse(data.get("Mandatory_Forms_Member_Application_Internal_Use_END"));
            upload(data.get("Mandatory_Forms_Member_Application_File_Upload_END"));
        }
    }

    public void setMemberApplicationReviewedAndAccepted(String value) {
        typeText(memberApplicationReviewedAndAccepted, value, "Member application reviewed and accepted");
    }

    public void setMemberApplicationDateReceived(String value) {
        typeText(memberApplicationDateReceived, value, "Member application date received");
    }

    public void addCommercialGeneralLiabilityCGLCertificateOfInsurance(Map<String, String> data) throws Throwable {
        setCommercialGeneralLiabilityCGLCertificateOfInsuranceDateReceived(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Date_Received"));
        setCommercialGeneralLiabilityCGLCertificateOfInsuranceReviewedAndAccepted(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Reviewed_and_Accepted"));
        uploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm(data);
    }

    public void addCommercialGeneralLiabilityCGLCertificateOfInsurance_END(Map<String, String> data) throws Throwable {
        setCommercialGeneralLiabilityCGLCertificateOfInsuranceDateReceived(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Date_Received_END"));
        setCommercialGeneralLiabilityCGLCertificateOfInsuranceReviewedAndAccepted(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Reviewed_and_Accepted_END"));
        uploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm_END(data);
    }

    public void uploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_File_Upload"))) {
            clickUploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm();
            verifyContents(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Contents"));
            setDocumentName(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Document_Name"));
            setDescription(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Description"));
            setInternalUse(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Internal_Use"));
            upload(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_File_Upload"));
        }
    }

    public void uploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_File_Upload_END"))) {
            clickUploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm();
            verifyContents(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Contents_END"));
            setDocumentName(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Document_Name_END"));
            setDescription(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Description_END"));
            setInternalUse(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_Internal_Use_END"));
            upload(data.get("Mandatory_Forms_Commercial_General_Liability_CGL_Certificate_Of_Insurance_File_Upload_END"));
        }
    }

    public void setCommercialGeneralLiabilityCGLCertificateOfInsuranceReviewedAndAccepted(String value) {
        typeText(commercialGeneralLiabilityCGLCertificateOfInsuranceReviewedAndAccepted, value, "Commercial general liability CGL certificate of insurance reviewed and accepted");
    }

    public void setCommercialGeneralLiabilityCGLCertificateOfInsuranceDateReceived(String value) {
        typeText(commercialGeneralLiabilityCGLCertificateOfInsuranceDateReceived, value, "Commercial general liability CGL certificate of insurance date received");
    }

    public void clickUploadDiligentEffortForm() {
        clickElement(uploadDiligentEffortForm, "Upload");
    }

    public void clickUploadContractBetweenMemberAndGCForm() {
        clickElement(uploadContractBetweenMemberAndGCForm, "Upload");
    }

    public void clickUploadMemberApplicationForm() {
        clickElement(uploadMemberApplicationForm, "Upload");
    }

    public void clickUploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm() {
        clickElement(uploadCommercialGeneralLiabilityCGLCertificateOfInsuranceForm, "Upload");
    }

    public void verifyContents(String value) {
        assertCellValue(contents, value, "Contents");
    }

    public void setDocumentName(String value) {
        typeText(documentName, value, "Document name");
    }

    public void setDescription(String value) {
        typeText(description, value, "Description");
    }

    public void setInternalUse(String value) {
        typeTextEnter(internalUse, value, "Internal use");
    }

    public void upload(String value) throws Throwable {
        System.out.println("UPLOAD");
        if (hasValue(value)) {
            clickUploadFile();
            System.out.println("UPLOAD 2");
            String path = System.getProperty("user.dir").replace("\\", "/") + "/src/test/test_data/upload/" + value;
            driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);

            pause(3000);
            clickUpload();
            clickOK();
            saveChanges();
        }
    }

    public void clickUpload() {
        clickElement(upload, "Upload");
    }

    public void clickUploadFile() {
        clickElement(uploadFile, "File upload");
    }

    public void fillMandatoryFormsDetailsFS() throws Throwable {
        if (isElementDisplayed(statementOfDiligentEffort)) {
            typeText(statementOfDiligentEffort, "Yes", "Statement of Diligent Effort");
        }
        if (isElementDisplayed(currentPFPolicy)) {
            typeText(currentPFPolicy, "Yes", "Current Primary Flood Policy");
        }
        verifyBlockExists("mandatory forms");
        saveChanges();
    }

}