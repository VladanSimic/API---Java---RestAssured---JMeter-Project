package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import pages.EditAttachmentPage;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ApplicationMandatoryFormsBlock extends CommonComponentsAndActions {

    WebDriver driver;
    EditAttachmentPage editAttachmentPage;
    public String BROWSER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER");
    public String LOB = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("LOB");

    public ApplicationMandatoryFormsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        editAttachmentPage = new EditAttachmentPage(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@osviewid='PAI_679433_OT_24_OI_1_BI_1624433_CI_17346133']")
    WebElement surplusLinesHomeownersApplication;
    @FindBy(xpath = "//span[@osviewid='PAI_679433_OT_24_OI_1_BI_1624433_CI_17315533']")
    WebElement surplusLinesHomeownersApplicationUploadButton;
    @FindBy(xpath = "//input[@osviewid='PAI_679433_OT_24_OI_1_BI_1727633_CI_18029733']")
    WebElement surplusLinesHomeownersApplicationNJ;
    @FindBy(xpath = "//span[@osviewid='PAI_679433_OT_24_OI_1_BI_1727633_CI_18024633']")
    WebElement surplusLinesHomeownersApplicationUploadButtonNJ;
    @FindBy(xpath = "//input[@osviewid='PAI_679433_OT_24_OI_1_BI_1727633_CI_18029833']")
    WebElement certificateOfEffortNJ;
    @FindBy(xpath = "//span[@osviewid='PAI_679433_OT_24_OI_1_BI_1727633_CI_18026233']")
    WebElement certificateUploadButtonNJ;
    @FindBy(xpath = "//input[@osviewid='PAI_679433_OT_24_OI_1_BI_1736633_CI_18104433']")
    WebElement surplusLinesHomeownersApplicationMA;
    @FindBy(xpath = "//span[@osviewid='PAI_679433_OT_24_OI_1_BI_1736633_CI_18099333']")
    WebElement surplusLinesHomeownersApplicationUploadButtonMA;
    @FindBy(xpath = "//input[@osviewid='PAI_679433_OT_24_OI_1_BI_1736633_CI_18104533']")
    WebElement br7MA;
    @FindBy(xpath = "//span[@osviewid='PAI_679433_OT_24_OI_1_BI_1736633_CI_18100933']")
    WebElement uploadButtonBr7MA;
    @FindBy(xpath = "//input[@osviewid='PAI_679433_OT_24_OI_1_BI_1879833_CI_19380633']")
    WebElement surplusLinesHomeownersApplicationTX;
    @FindBy(xpath = "//input[@osviewid='PAI_679433_OT_24_OI_1_BI_1879833_CI_19380733']")
    WebElement stDiligentEffortTX;
    @FindBy(xpath = "//span[@osviewid='PAI_679433_OT_24_OI_1_BI_1879833_CI_19375333']")
    WebElement surplusLinesHomeownersApplicationUploadButtonTX;
    @FindBy(xpath = "//span[@osviewid='PAI_679433_OT_24_OI_1_BI_1879833_CI_19377133']")
    WebElement stDiligentEffortUploadButtonTX;
    @FindBy(xpath = "//div[contains(text(),'Surplus Lines Excess Liability Application')]/../../../../../../../../../../../td[2]//input")
    WebElement surplusExcessLiabilityApplication;
    @FindBy(xpath = "//div[contains(text(),'Surplus Lines Excess Liability Application')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement surplusExcessLiabilityApplicationUploadButton;
    @FindBy(xpath = "//div[contains(text(),'Part C Affidavit and the Notice of Excess Line Placement/Total Cost Form')]/../../../../../../../../../../../td[2]//input")
    WebElement noticeOfExcessLinePlacement;
    @FindBy(xpath = "//div[contains(text(),'Part C Affidavit and the Notice of Excess Line Placement/Total Cost Form')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement noticeOfExcessLinePlacementUploadButton;
    @FindBy(xpath = "//div[contains(text(),'Home - Underlying policy Declarations page')]/../../../../../../../../../../../td[2]//input")
    WebElement underlyingPolicyDeclarations;
    @FindBy(xpath = "//div[contains(text(),'Home - Underlying policy Declarations page')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement underlyingPolicyDeclarationsUploadButton;
    @FindBy(xpath = "//div[contains(text(),'SL-2 CA Diligent Search Report')]/../../../../../../../../../../../td[2]//input")
    WebElement sl2DiligentSearch;
    @FindBy(xpath = "//div[contains(text(),'SL-2 CA Diligent Search Report')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement sl2DiligentSearchUploadButton;
    @FindBy(xpath = "//div[contains(text(),'SL-1 CA Confidential Report')]/../../../../../../../../../../../td[2]//input")
    WebElement sl1ConfidentialReport;
    @FindBy(xpath = "//div[contains(text(),'SL-1 CA Confidential Report')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement sl1ConfidentialReportUploadButton;
    @FindBy(xpath = "//div[contains(text(),'D-1 CA Freestanding Disclosure')]/../../../../../../../../../../../td[2]//input")
    WebElement d1FreestandingDisclosure;
    @FindBy(xpath = "//div[contains(text(),'D-1 CA Freestanding Disclosure')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement d1FreestandingDisclosureUploadButton;
    @FindBy(xpath = "//div[contains(text(),'Statement of Diligent Effort')]/../../../../../../../../../../../td[2]//input")
    List<WebElement> statementDiligentEffort;
    @FindBy(xpath = "//div[contains(text(),'Statement of Diligent Effort')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement statementDiligentEffortUploadButton;
    @FindBy(xpath = "//div[contains(text(),'Surplus Lines Homeowners')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement surplusLinesHomeownersUploadButton;
    @FindBy(xpath = "//div[contains(text(),'Surplus Lines Homeowners')]/../../../../../../../../../../../td[2]//input")
    WebElement surplusLinesHomeownersInputField;
    @FindBy(xpath = "//div[contains(text(),'BR-7')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement br7UploadButton;
    @FindBy(xpath = "//div[contains(text(),'BR-7')]/../../../../../../../../../../../td[2]//input")
    WebElement br7InputField;
    @FindBy(xpath = "//div[contains(text(),'Statement of Diligent')]/../../../../../../../../../../../td[2]//input")
    WebElement statementOfDiligentInputField;
    @FindBy(xpath = "//div[contains(text(),'Statement of Diligent')]/../../../../../../../../../../../td[3]//span[text()='upload']")
    WebElement statementOfDiligentUploadButton;
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
    @FindBy(xpath = "//div[text()='Surplus Lines Homeowners Application']/../../../../../../../../../../..//input")
    WebElement surplusLinesHomeownersApplicationFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Surplus Lines Homeowners Application']/../../../../../../../../../../..//span[text()='upload']")
    WebElement surplusLinesHomeownersApplicationFormUpload;
    @FindBy(xpath = "//div[text()='Older Home Questionnaire']/../../../../../../../../../../..//input")
    WebElement olderHomeQuestionnaireFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Older Home Questionnaire']/../../../../../../../../../../..//span[text()='upload']")
    WebElement olderHomeQuestionnaireFormFormUpload;
    @FindBy(xpath = "//div[text()='Part C Affidavit and the Notice of Excess Line Placement/Total Cost Form']/../../../../../../../../../../..//input")
    WebElement noticeOfExcessLinePlacementTotalCostFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Part C Affidavit and the Notice of Excess Line Placement/Total Cost Form']/../../../../../../../../../../..//span[text()='upload']")
    WebElement noticeOfExcessLinePlacementTotalCostFormUpload;
    @FindBy(xpath = "//div[text()='BR-7']/../../../../../../../../../../..//input")
    WebElement br7FormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='BR-7']/../../../../../../../../../../..//span[text()='upload']")
    WebElement br7FormUpload;
    @FindBy(xpath = "//div[text()='SL-1 CA Confidential Report of Placement']/../../../../../../../../../../..//input")
    WebElement sl1CAConfidentialFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='SL-1 CA Confidential Report of Placement']/../../../../../../../../../../..//span[text()='upload']")
    WebElement sl1CAConfidentialFormUpload;
    @FindBy(xpath = "//div[text()=' SL-2 CA Diligent Search Report']/../../../../../../../../../../..//input")
    WebElement sl2CADiligentFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()=' SL-2 CA Diligent Search Report']/../../../../../../../../../../..//span[text()='upload']")
    WebElement sl2CADiligentFormUpload;
    @FindBy(xpath = "//div[text()='Agreed Value Settlement Basis Acknowledgement Notice']/../../../../../../../../../../..//input")
    WebElement agreedValueSettlementBasisAcknowledgementNoticeFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Agreed Value Settlement Basis Acknowledgement Notice']/../../../../../../../../../../..//span[text()='upload']")
    WebElement agreedValueSettlementBasisAcknowledgementNoticeFormUpload;
    @FindBy(xpath = "//div[text()='Statement of Diligent Effort']/../../../../../../../../../../..//input")
    WebElement statementOfDiligentEffortFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Ex-Wind Acknowledgement Form']/../../../../../../../../../../..//input")
    WebElement exWindAcknowledgmentFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Ex-Wind Acknowledgement Form']/../../../../../../../../../../..//span[text()='upload']")
    WebElement exWindAcknowledgmentFormUpload;
    @FindBy(xpath = "//div[text()='Statement of Diligent Effort']/../../../../../../../../../../..//span[text()='upload']")
    WebElement statementOfDiligentEffortFormUpload;
    @FindBy(xpath = "//div[text()='Roof Replacement Documentation']/../../../../../../../../../../..//input")
    WebElement roofReplacementDocumentFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Roof Replacement Documentation']/../../../../../../../../../../..//span[text()='upload']")
    WebElement roofReplacementDocumentFormUpload;
    @FindBy(xpath = "//div[text()='Certificate of Effort']/../../../../../../../../../../..//input")
    WebElement certificateOfEffortFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()='Certificate of Effort']/../../../../../../../../../../..//span[text()='upload']")
    WebElement certificateOfEffortFormUpload;
    @FindBy(xpath = "//div[text()='Effective Date']/../../../..//input")
    WebElement effectiveDate;
    @FindBy(xpath = "//div[text()='Expiration Date']/../../../..//input")
    WebElement expirationDate;
    @FindBy(xpath = "//div[text()=' D-1 CA Freestanding Disclosure Statement']/../../../../../../../../../../..//input")
    WebElement d1CAFreestandingDisclosureStatementFormReviewedAndAccepted;
    @FindBy(xpath = "//div[text()=' D-1 CA Freestanding Disclosure Statement']/../../../../../../../../../../..//span[text()='upload']")
    WebElement d1CAFreestandingDisclosureStatementFormUpload;

    public void fillApplicationDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("application and mandatory forms");
        try {
            uploadOlderHomeQuestionnaireForm(data);
        } catch (Exception e) {
        }
        switch (data.get("State")) {
            case "AL": {
                uploadSurplusLinesHomeownersApplicationForm(data);
            }
            break;
            case "NY": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm(data);
            }
            break;
            case "MA": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadBR7Form(data);
            }
            break;
            case "GA": {
                uploadSurplusLinesHomeownersApplicationForm(data);
            }
            break;
            case "CA": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadSl1CAConfidentialReportOfPlacement(data);
                uploadSL2CADiligentSearchReport(data);
                uploadD1CAFreestandingDisclosureStatement(data);
                uploadAgreedValueSettlementBasisAcknowledgementNotice(data);
            }
            break;
            case "LA": {
                uploadSurplusLinesHomeownersApplicationForm(data);
            }
            break;
            case "MT": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
            case "HI": {
                uploadSurplusLinesHomeownersApplicationForm(data);
            }
            break;
            case "SC": {
                uploadSurplusLinesHomeownersApplicationForm(data);
            }
            break;
            case "UT": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
            case "CO": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
            case "TX": {
                uploadSurplusLinesHomeownersApplicationForm(data);
            }
            break;
            case "NC": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
            case "FL": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
                uploadRoofReplacementDocument(data);
                if (data.get("Risk_Addresses_Hurricane_Deductible").equalsIgnoreCase("Ex-Wind"))
                    uploadExWindAcknowledgementForm(data);
            }
            break;
            case "AZ": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
            case "WY": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
            case "MS": {
                uploadSurplusLinesHomeownersApplicationForm(data);
            }
            break;
            case "NJ": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadCertificateOfEffort(data);
            }
            break;
            case "CT": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
            case "RI": {
                uploadSurplusLinesHomeownersApplicationForm(data);
                uploadStatementOfDiligentEffort(data);
            }
            break;
        }
        saveChanges();
    }

    public void fillApplicationDetailsHS_END(Map<String, String> data) throws Throwable {
        try {
            uploadOlderHomeQuestionnaireForm(data);
        } catch (Exception e) {
        }
        switch (data.get("State")) {
            case "AL": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
            }
            break;
            case "NY": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm_END(data);
            }
            break;
            case "MA": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadBR7Form_END(data);
            }
            break;
            case "GA": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
            }
            break;
            case "CA": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadSl1CAConfidentialReportOfPlacement_END(data);
                uploadSL2CADiligentSearchReport_END(data);
                uploadD1CAFreestandingDisclosureStatement_END(data);
                uploadAgreedValueSettlementBasisAcknowledgementNotice_END(data);
            }
            break;
            case "LA": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
            }
            break;
            case "MT": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "HI": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
            }
            break;
            case "SC": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "UT": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "CO": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "TX": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
            }
            break;
            case "NC": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "FL": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
                uploadRoofReplacementDocument_END(data);
            }
            break;
            case "AZ": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "WY": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "MS": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
            }
            break;
            case "NJ": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadCertificateOfEffort_END(data);
            }
            break;
            case "CT": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
                uploadStatementOfDiligentEffort_END(data);
            }
            break;
            case "RI": {
                uploadSurplusLinesHomeownersApplicationForm_END(data);
            }
            break;
        }
        saveChanges();
    }

    public void fillApplicationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        try {
            uploadOlderHomeQuestionnaireForm(data);
        } catch (Exception e) {
        }
        switch (data.get("State")) {
            case "CT": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            case "RI": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
            }
            case "AL": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
            }
            break;
            case "NY": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm_OOS_END(data);
            }
            break;
            case "MA": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadBR7Form_OOS_END(data);
            }
            break;
            case "GA": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
            }
            break;
            case "CA": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadSl1CAConfidentialReportOfPlacement_OOS_END(data);
                uploadSL2CADiligentSearchReport_OOS_END(data);
                uploadD1CAFreestandingDisclosureStatement_OOS_END(data);
                uploadAgreedValueSettlementBasisAcknowledgementNotice_OOS_END(data);
            }
            break;
            case "LA": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
            }
            break;
            case "MT": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            break;
            case "HI": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
            }
            break;
            case "SC": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            break;
            case "UT": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            break;
            case "CO": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            break;
            case "TX": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
            }
            break;
            case "NC": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            break;
            case "FL": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
                uploadRoofReplacementDocument_OOS_END(data);
            }
            break;
            case "AZ": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            break;
            case "WY": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadStatementOfDiligentEffort_OOS_END(data);
            }
            break;
            case "MS": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
            }
            break;
            case "NJ": {
                uploadSurplusLinesHomeownersApplicationForm_OOS_END(data);
                uploadCertificateOfEffort_OOS_END(data);
            }
            break;
        }
        saveChanges();
    }

    public void fillApplicationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        try {
            uploadOlderHomeQuestionnaireForm(data);
        } catch (Exception e) {
        }
        switch (data.get("State")) {
            case "AL": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
            }
            break;
            case "NY": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm_RNW(data);
            }
            break;
            case "MA": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadBR7Form_RNW(data);
            }
            break;
            case "GA": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
            }
            break;
            case "CA": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadSl1CAConfidentialReportOfPlacement_RNW(data);
                uploadSL2CADiligentSearchReport_RNW(data);
                uploadD1CAFreestandingDisclosureStatement_RNW(data);
                uploadAgreedValueSettlementBasisAcknowledgementNotice_RNW(data);
            }
            break;
            case "LA": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
            }
            break;
            case "MT": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
            }
            break;
            case "HI": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
            }
            break;
            case "SC": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
            }
            break;
            case "UT": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
            }
            break;
            case "CO": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
            }
            break;
            case "TX": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);

            }
            break;
            case "NC": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
            }
            break;
            case "FL": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
                uploadRoofReplacementDocument_RNW(data);
            }
            break;
            case "AZ": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
            }
            break;
            case "WY": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
            }
            break;
            case "MS": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
            }
            break;
            case "NJ": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadCertificateOfEffort_RNW(data);
            }
            break;
            case "CT": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
                uploadStatementOfDiligentEffort_RNW(data);
            }
            break;
            case "RI": {
                uploadSurplusLinesHomeownersApplicationForm_RNW(data);
            }
            break;
        }
        saveChanges();
    }

    public void uploadCertificateOfEffort(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort")) && data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort").equalsIgnoreCase("Yes")) {
            typeText(certificateOfEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort"), "Certificate Of Effort");
            clickElement(certificateOfEffortFormUpload, "Certificate Of Effort Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_File_Upload"));
        }
    }

    public void uploadCertificateOfEffort_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_END")) && data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_END").equalsIgnoreCase("Yes")) {
            typeText(certificateOfEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_END"), "Certificate Of Effort");
            clickElement(certificateOfEffortFormUpload, "Certificate Of Effort Form Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_File_Upload_END"));
        }
    }

    public void uploadCertificateOfEffort_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(certificateOfEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_OOS_END"), "Certificate Of Effort");
            clickElement(certificateOfEffortFormUpload, "Certificate Of Effort Form Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_File_Upload_OOS_END"));
        }
    }

    public void uploadCertificateOfEffort_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_RNW")) && data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_RNW").equalsIgnoreCase("Yes")) {
            typeText(certificateOfEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_RNW"), "Certificate Of Effort");
            clickElement(certificateOfEffortFormUpload, "Certificate Of Effort Form Upload_RNW");
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Certificate_Of_Effort_File_Upload_RNW"));
        }
    }

    public void uploadStatementOfDiligentEffort(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort")) && data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort").equalsIgnoreCase("Yes")) {
            typeText(statementOfDiligentEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort"), "Statement Of Diligent Effort");
            clickElement(statementOfDiligentEffortFormUpload, "Statement Of Diligent Effort Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_File_Upload"));
        }
    }

    public void uploadExWindAcknowledgementForm(Map<String, String> data) throws Throwable {
        typeText(exWindAcknowledgmentFormReviewedAndAccepted, "Yes");
        clickElement(exWindAcknowledgmentFormUpload, "Ex-Wind Acknowledgment Form Upload");
        setDocumentName("Ex-Wind Form");
        setDescription("Test Description");
        upload("dummyUpload.pdf");
    }

    public void uploadStatementOfDiligentEffort_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_END")) && data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_END").equalsIgnoreCase("Yes")) {
            pause(1000);
            typeText(statementOfDiligentEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_END"), "Statement Of Diligent Effort");
            clickElement(statementOfDiligentEffortFormUpload, "Statement Of Diligent Effort Form Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_File_Upload_END"));
        }
    }

    public void uploadStatementOfDiligentEffort_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(statementOfDiligentEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_OOS_END"), "Statement Of Diligent Effort");
            clickElement(statementOfDiligentEffortFormUpload, "Statement Of Diligent Effort Form Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_File_Upload_OOS_END"));
        }
    }

    public void uploadStatementOfDiligentEffort_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_RNW")) && data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_RNW").equalsIgnoreCase("Yes")) {
            typeText(statementOfDiligentEffortFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_RNW"), "Statement Of Diligent Effort");
            clickElement(statementOfDiligentEffortFormUpload, "Statement Of Diligent Effort Form Upload_RNW");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Statement_Of_Diligent_Effort_File_Upload_RNW"));
        }
    }

    public void uploadRoofReplacementDocument(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document")) && data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document").equalsIgnoreCase("Yes")) {
            typeText(roofReplacementDocumentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document"), "Roof Replacement Document");
            clickElement(roofReplacementDocumentFormUpload, "Roof Replacement Document Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Roof_Replacement_Document_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_File_Upload"));
        }
    }

    public void uploadRoofReplacementDocument_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_END")) && data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_END").equalsIgnoreCase("Yes")) {
            typeText(roofReplacementDocumentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_END"), "Roof Replacement Document");
            clickElement(roofReplacementDocumentFormUpload, "Roof Replacement Document Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Roof_Replacement_Document_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_File_Upload_END"));
        }
    }

    public void uploadRoofReplacementDocument_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(roofReplacementDocumentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_OOS_END"), "Roof Replacement Document");
            clickElement(roofReplacementDocumentFormUpload, "Roof Replacement Document Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Roof_Replacement_Document_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_File_Upload_OOS_END"));
        }
    }

    public void uploadRoofReplacementDocument_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_RNW")) && data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_RNW").equalsIgnoreCase("Yes")) {
            typeText(roofReplacementDocumentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_RNW"), "Roof Replacement Document");
            clickElement(roofReplacementDocumentFormUpload, "Roof Replacement Document Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Roof_Replacement_Document_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Roof_Replacement_Document_File_Upload_RNW"));
        }
    }

    public void uploadAgreedValueSettlementBasisAcknowledgementNotice(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice")) && data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice").equalsIgnoreCase("Yes")) {
            typeText(agreedValueSettlementBasisAcknowledgementNoticeFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice"), "Agreed Value Settlement Basis Acknowledgement Notice");
            clickElement(agreedValueSettlementBasisAcknowledgementNoticeFormUpload, "Agreed Value Settlement Basis Acknowledgement Notice Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_File_Upload"));
        }
    }

    public void uploadAgreedValueSettlementBasisAcknowledgementNotice_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_END")) && data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_END").equalsIgnoreCase("Yes")) {
            typeText(agreedValueSettlementBasisAcknowledgementNoticeFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_END"), "Agreed Value Settlement Basis Acknowledgement Notice");
            clickElement(agreedValueSettlementBasisAcknowledgementNoticeFormUpload, "Agreed Value Settlement Basis Acknowledgement Notice Form Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_File_Upload_END"));
        }
    }

    public void uploadAgreedValueSettlementBasisAcknowledgementNotice_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(agreedValueSettlementBasisAcknowledgementNoticeFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_OOS_END"), "Agreed Value Settlement Basis Acknowledgement Notice");
            clickElement(agreedValueSettlementBasisAcknowledgementNoticeFormUpload, "Agreed Value Settlement Basis Acknowledgement Notice Form Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_File_Upload_OOS_END"));
        }
    }

    public void uploadAgreedValueSettlementBasisAcknowledgementNotice_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_RNW")) && data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_RNW").equalsIgnoreCase("Yes")) {
            typeText(agreedValueSettlementBasisAcknowledgementNoticeFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_RNW"), "Agreed Value Settlement Basis Acknowledgement Notice");
            clickElement(agreedValueSettlementBasisAcknowledgementNoticeFormUpload, "Agreed Value Settlement Basis Acknowledgement Notice Form Upload_RNW");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Agreed_Value_Settlement_Basis_Acknowledgement_Notice_File_Upload_RNW"));
        }
    }

    public void uploadD1CAFreestandingDisclosureStatement(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement")) && data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement").equalsIgnoreCase("Yes")) {
            typeText(d1CAFreestandingDisclosureStatementFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement"), "D 1 CA Freestanding Disclosure Statement");
            clickElement(d1CAFreestandingDisclosureStatementFormUpload, "D 1 CA Freestanding Disclosure Statement Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Description"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Effective_Date"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Expiration_Date"));
            upload(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_File_Upload"));
        }
    }

    public void uploadD1CAFreestandingDisclosureStatement_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_END")) && data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_END").equalsIgnoreCase("Yes")) {
            typeText(d1CAFreestandingDisclosureStatementFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_END"), "D 1 CA Freestanding Disclosure Statement");
            clickElement(d1CAFreestandingDisclosureStatementFormUpload, "D 1 CA Freestanding Disclosure Statement Form Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Description_END"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Effective_Date_END"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Expiration_Date_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_File_Upload_END"));
        }
    }

    public void uploadD1CAFreestandingDisclosureStatement_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(d1CAFreestandingDisclosureStatementFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_OOS_END"), "D 1 CA Freestanding Disclosure Statement");
            clickElement(d1CAFreestandingDisclosureStatementFormUpload, "D 1 CA Freestanding Disclosure Statement Form Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Description_OOS_END"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Effective_Date_OOS_END"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Expiration_Date_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_File_Upload_OOS_END"));
        }
    }

    public void uploadD1CAFreestandingDisclosureStatement_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_RNW")) && data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_RNW").equalsIgnoreCase("Yes")) {
            pause(1000);
            typeText(d1CAFreestandingDisclosureStatementFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_RNW"), "D 1 CA Freestanding Disclosure Statement");
            clickElement(d1CAFreestandingDisclosureStatementFormUpload, "D 1 CA Freestanding Disclosure Statement Form Upload_RNW");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Description_RNW"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Effective_Date_RNW"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_Expiration_Date_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_D_1_CA_Freestanding_Disclosure_Statement_File_Upload_RNW"));
        }
    }

    public void uploadSL2CADiligentSearchReport(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report")) && data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report").equalsIgnoreCase("Yes")) {
            pause(1000);
            typeText(sl2CADiligentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report"), "SL 2 CA Confidential Diligent Search Report");
            clickElement(sl2CADiligentFormUpload, "SL 2 CA Confidential Diligent Search Report Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_File_Upload"));
        }
    }

    public void uploadSL2CADiligentSearchReport_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_END")) && data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_END").equalsIgnoreCase("Yes")) {
            typeText(sl2CADiligentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_END"), "SL 2 CA Confidential Diligent Search Report");
            clickElement(sl2CADiligentFormUpload, "SL 2 CA Confidential Diligent Search Report Form Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_File_Upload_END"));
        }
    }

    public void uploadSL2CADiligentSearchReport_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(sl2CADiligentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_OOS_END"), "SL 2 CA Confidential Diligent Search Report");
            clickElement(sl2CADiligentFormUpload, "SL 2 CA Confidential Diligent Search Report Form Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_File_Upload_OOS_END"));
        }
    }

    public void uploadSL2CADiligentSearchReport_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_RNW")) && data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_RNW").equalsIgnoreCase("Yes")) {
            typeText(sl2CADiligentFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_RNW"), "SL 2 CA Confidential Diligent Search Report");
            clickElement(sl2CADiligentFormUpload, "SL 2 CA Confidential Diligent Search Report Form Upload_RNW");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_2_CA_Diligent_Search_Report_File_Upload_RNW"));
        }
    }

    public void uploadSl1CAConfidentialReportOfPlacement(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement")) && data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement").equalsIgnoreCase("Yes")) {
            typeText(sl1CAConfidentialFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement"), "SL 1 CA Confidential Report Of Placement");
            clickElement(sl1CAConfidentialFormUpload, "SL 1 CA Confidential Report Of Placement Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Description"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Effective_Date"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Expiration_Date"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_File_Upload"));
        }
    }

    public void uploadSl1CAConfidentialReportOfPlacement_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_END")) && data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_END").equalsIgnoreCase("Yes")) {
            typeText(sl1CAConfidentialFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_END"), "SL 1 CA Confidential Report Of Placement");
            clickElement(sl1CAConfidentialFormUpload, "SL 1 CA Confidential Report Of Placement Form Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Description_END"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Effective_Date_END"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Expiration_Date_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_File_Upload_END"));
        }
    }

    public void uploadSl1CAConfidentialReportOfPlacement_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(sl1CAConfidentialFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_OOS_END"), "SL 1 CA Confidential Report Of Placement");
            clickElement(sl1CAConfidentialFormUpload, "SL 1 CA Confidential Report Of Placement Form Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Description_OOS_END"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Effective_Date_OOS_END"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Expiration_Date_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_File_Upload_OOS_END"));
        }
    }

    public void uploadSl1CAConfidentialReportOfPlacement_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_RNW")) && data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_RNW").equalsIgnoreCase("Yes")) {
            typeText(sl1CAConfidentialFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_RNW"), "SL 1 CA Confidential Report Of Placement");
            clickElement(sl1CAConfidentialFormUpload, "SL 1 CA Confidential Report Of Placement Form Upload_RNW");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Description_RNW"));
            setEffectiveDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Effective_Date_RNW"));
            setExpirationDate(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_Expiration_Date_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_SL_1_CA_Confidential_Report_Of_Placement_File_Upload_RNW"));
        }
    }

    public void setExpirationDate(String value) throws InterruptedException {
        typeTextEnter(expirationDate, value, "Expiration Date");
        pause(2000);
    }

    public void setEffectiveDate(String value) throws InterruptedException {
        typeTextEnter(effectiveDate, value, "Effective Date");
        pause(2000);
    }

    public void uploadBR7Form(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_BR_7")) && data.get("Application_And_Mandatory_Forms_Block_BR_7").equalsIgnoreCase("Yes")) {
            typeText(br7FormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_BR_7"), "BR 7 Form");
            clickElement(br7FormUpload, "BR 7 Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_BR_7_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_BR_7_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_BR_7_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_BR_7_File_Upload"));
        }
    }

    public void uploadBR7Form_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_BR_7_END")) && data.get("Application_And_Mandatory_Forms_Block_BR_7_END").equalsIgnoreCase("Yes")) {
            typeText(br7FormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_BR_7_END"), "BR 7 Form");
            clickElement(br7FormUpload, "BR 7 Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_BR_7_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_BR_7_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_BR_7_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_BR_7_File_Upload_END"));
        }
    }

    public void uploadBR7Form_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_BR_7_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_BR_7_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(br7FormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_BR_7_OOS_END"), "BR 7 Form");
            clickElement(br7FormUpload, "BR 7 Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_BR_7_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_BR_7_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_BR_7_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_BR_7_File_Upload_OOS_END"));
        }
    }

    public void uploadBR7Form_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_BR_7_RNW")) && data.get("Application_And_Mandatory_Forms_Block_BR_7_RNW").equalsIgnoreCase("Yes")) {
            typeText(br7FormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_BR_7_RNW"), "BR 7 Form");
            clickElement(br7FormUpload, "BR 7 Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_BR_7_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_BR_7_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_BR_7_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_BR_7_File_Upload_RNW"));
        }

    }

    public void uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form")) && data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form").equalsIgnoreCase("Yes")) {
            typeText(noticeOfExcessLinePlacementTotalCostFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form"), "Notice Of Excess Line Placement Total Cost Form");
            clickElement(noticeOfExcessLinePlacementTotalCostFormUpload, "Notice Of Excess Line Placement Total Cost Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_File_Upload"));
        }
    }

    public void uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_END")) && data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_END").equalsIgnoreCase("Yes")) {
            typeText(noticeOfExcessLinePlacementTotalCostFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_END"), "Notice Of Excess Line Placement Total Cost Form");
            clickElement(noticeOfExcessLinePlacementTotalCostFormUpload, "Notice Of Excess Line Placement Total Cost Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_File_Upload_END"));
        }
    }

    public void uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(noticeOfExcessLinePlacementTotalCostFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_OOS_END"), "Notice Of Excess Line Placement Total Cost Form");
            clickElement(noticeOfExcessLinePlacementTotalCostFormUpload, "Notice Of Excess Line Placement Total Cost Form Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_File_Upload_OOS_END"));
        }
    }

    public void uploadPartCAffidavitAndTheNoticeOfExcessLinePlacementTotalCostForm_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_RNW")) && data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_RNW").equalsIgnoreCase("Yes")) {
            typeText(noticeOfExcessLinePlacementTotalCostFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_RNW"), "Notice Of Excess Line Placement Total Cost Form");
            if (data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_RNW").equalsIgnoreCase("Yes")) {
                clickElement(noticeOfExcessLinePlacementTotalCostFormUpload, "Notice Of Excess Line Placement Total Cost Form Upload");
                verifyContents(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Contents_RNW"));
                setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Document_Name_RNW"));
                setDescription(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_Description_RNW"));
                upload(data.get("Application_And_Mandatory_Forms_Block_Part_C_Affidavit_And_The_Notice_Of_Excess_Line_Placement_Total_Cost_Form_File_Upload_RNW"));
            }
        }

    }

    public void uploadOlderHomeQuestionnaireForm(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire")) && data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire").equalsIgnoreCase("Yes")) {
            typeText(olderHomeQuestionnaireFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire"), "Older Home Questionnaire");
            clickElement(olderHomeQuestionnaireFormFormUpload, "Older Home Questionnaire Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_File_Upload"));
        }
    }

    public void uploadOlderHomeQuestionnaireForm_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_END")) && data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_END").equalsIgnoreCase("Yes")) {
            typeText(olderHomeQuestionnaireFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_END"), "Older Home Questionnaire");
            clickElement(olderHomeQuestionnaireFormFormUpload, "Older Home Questionnaire Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_File_Upload_END"));
        }
    }

    public void uploadOlderHomeQuestionnaireForm_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(olderHomeQuestionnaireFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_OOS_END"), "Older Home Questionnaire");
            clickElement(olderHomeQuestionnaireFormFormUpload, "Older Home Questionnaire Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_File_Upload_OOS_END"));
        }
    }

    public void uploadOlderHomeQuestionnaireForm_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_RNW")) && data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_RNW").equalsIgnoreCase("Yes")) {
            typeText(olderHomeQuestionnaireFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_RNW"), "Older Home Questionnaire");
            clickElement(olderHomeQuestionnaireFormFormUpload, "Older Home Questionnaire Upload_RNW");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Older_Home_Questionnaire_File_Upload_RNW"));
        }
    }

    public void uploadSurplusLinesHomeownersApplicationForm(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application")) && data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application").equalsIgnoreCase("Yes")) {
            typeText(surplusLinesHomeownersApplicationFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application"), "Surplus Lines Homeowners Application");
            clickElement(surplusLinesHomeownersApplicationFormUpload, "Surplus Lines Homeowners Application Upload");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Contents"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Document_Name"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Description"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_File_Upload"));
        }
    }

    public void uploadSurplusLinesHomeownersApplicationForm_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_END")) && data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_END").equalsIgnoreCase("Yes")) {
            typeText(surplusLinesHomeownersApplicationFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_END"), "Surplus Lines Homeowners Application");
            clickElement(surplusLinesHomeownersApplicationFormUpload, "Surplus Lines Homeowners Application Upload_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Contents_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Document_Name_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Description_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_File_Upload_END"));
        }
    }

    public void uploadSurplusLinesHomeownersApplicationForm_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_OOS_END")) && data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_OOS_END").equalsIgnoreCase("Yes")) {
            typeText(surplusLinesHomeownersApplicationFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_OOS_END"), "Surplus Lines Homeowners Application");
            clickElement(surplusLinesHomeownersApplicationFormUpload, "Surplus Lines Homeowners Application Upload_OOS_END");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Contents_OOS_END"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Document_Name_OOS_END"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Description_OOS_END"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_File_Upload_OOS_END"));
        }
    }

    public void uploadSurplusLinesHomeownersApplicationForm_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_RNW")) && data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_RNW").equalsIgnoreCase("Yes")) {
            typeText(surplusLinesHomeownersApplicationFormReviewedAndAccepted, data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_RNW"), "Surplus Lines Homeowners Application");
            clickElement(surplusLinesHomeownersApplicationFormUpload, "Surplus Lines Homeowners Application Upload_RNW");
            verifyContents(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Contents_RNW"));
            setDocumentName(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Document_Name_RNW"));
            setDescription(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_Description_RNW"));
            upload(data.get("Application_And_Mandatory_Forms_Block_Surplus_Lines_Homeowners_Application_File_Upload_RNW"));
        }
    }

    public void acceptSurplusLinesESApplication(Map<String, String> data) throws Throwable {
        try {
            typeText(surplusExcessLiabilityApplication, "Yes");
        } catch (Exception e) {
            clickElementWithOffset(surplusExcessLiabilityApplication, 30, 30);
            typeText(surplusExcessLiabilityApplication, "Yes");
        }
//        clickElement(surplusExcessLiabilityApplicationUploadButton);
//        editAttachmentPage.addAttachment(data);

        switch (data.get("State")) {
            case "NY": {
                typeText(noticeOfExcessLinePlacement, "Yes");
//                clickElement(noticeOfExcessLinePlacementUploadButton);
//                editAttachmentPage.addAttachment(data);
            }
            break;
            case "CA": {
                typeText(sl2DiligentSearch, "Yes");
//                clickElement(sl2DiligentSearchUploadButton);
//                editAttachmentPage.addAttachment(data);
            }
            break;
            case "NJ": {
                typeText(certificateOfEffortFormReviewedAndAccepted, "Yes");
            }
            break;
            case "CT":
            case "MA":
            case "TX":
            case "FL":
            case "AL":
            case "NC":
            case "GA":
            case "LA":
            case "MS": {
                typeText(statementDiligentEffort.get(0), "Yes");
//                clickElement(statementDiligentEffortUploadButton);
//                editAttachmentPage.addAttachment(data);
            }
            break;
        }

        typeText(underlyingPolicyDeclarations, "Yes");
//        clickElement(underlyingPolicyDeclarationsUploadButton);
//        editAttachmentPage.addAttachment(data);
    }

    public void fillStatementOfDiligent() throws Throwable {
        if (statementDiligentEffort.size() > 0) {
            typeText(statementDiligentEffort.get(0), "Yes");
        }
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
        if (hasValue(value)) {
            if ((hasValue(BROWSER) && (BROWSER.equalsIgnoreCase("GRID_H") || BROWSER.equalsIgnoreCase("GRID"))) && (hasValue(LOB) && LOB.equalsIgnoreCase("HS"))) {
                //If the same upload issue is happening on other LOB's remove the LOB condition
                clickExit();
                clickOK();
            } else {
                System.out.println("UPLOAD");
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
    }

    public void clickUpload() {
        clickElement(upload, "Upload");
    }

    public void clickUploadFile() {
        clickElement(uploadFile, "File upload");
    }

    public void fillStatementOfDiligent(String yesOrNo) throws Throwable {
        if (statementDiligentEffort.size() > 0 && yesOrNo.equalsIgnoreCase("Yes")) {
            typeText(statementDiligentEffort.get(0), "Yes");
        } else if (statementDiligentEffort.size() > 0) {
            typeText(statementDiligentEffort.get(0), "No");
        }
    }

}