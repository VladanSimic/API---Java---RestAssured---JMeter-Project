package pages;

import excel.DataManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class NewTransactionPage extends CommonComponentsAndActions {
    WebDriver driver;

    public NewTransactionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Choose Transaction Type']/../../../..//input")
    WebElement transactionType;
    @FindBy(xpath = "//div[text()='Endorsement Type']/../../../..//input")
    WebElement endorsementType;
    @FindBy(xpath = "//div[text()='New Transaction Effective Date']/../../../..//input")
    WebElement newTransactionEffectiveDate;
    @FindBy(xpath = "//div[text()='Description (THIS WILL APPEAR ON BILL)']/../../../..//input[@aria-hidden='false']")
    WebElement description;
    @FindBy(xpath = "//div[text()='Notes']/../../../..//input")
    WebElement notes;
    @FindBy(xpath = "//div[text()=\"new transaction details\"]")
    WebElement newTransactionDetailsBlock;
    @FindBy(xpath = "//div[text()='Cancellation Requested by:']/../../../..//input")
    WebElement cancellationRequestedBy;
    @FindBy(xpath = "//div[text()='Flat- cancel with MEP applied?']/../../../..//input")
    WebElement flatCancelMEP;
    @FindBy(xpath = "//div[text()='Reason for flat-cancelling with Minimum Earned Premium']/../../../..//textarea")
    WebElement reasonForFlatCancel;

    public void setTransactionType(String transactionTypeValue) throws Throwable {
        newTransactionDetailsBlock.click();
        pause(5000);
        typeTextEnter(transactionType, transactionTypeValue, "Transaction type");
    }

    public void setEndorsementType(String endorsementTypeValue) throws Throwable {
        pause(3000);
        clickElement(newTransactionDetailsBlock, "Transaction Details Block");
        typeText(endorsementType, endorsementTypeValue, "Endorsement Type");
    }

    public void setNewTransactionEffectiveDate(String date) throws Throwable {
        clickElement(newTransactionDetailsBlock, "Transaction Details Block");
        typeText(newTransactionEffectiveDate, date, "Transaction Effective date");
    }

    public void setDescription(String descriptionValue) throws Throwable {
        newTransactionDetailsBlock.click();
        pause(2000);
        try {
            typeText(description, descriptionValue);
        } catch (Exception e) {

        }
    }

    public void setNotes(String notesValue) throws Throwable {
        newTransactionDetailsBlock.click();
        typeText(notes, notesValue);
    }

    public void fillEndorsementTransactionDetails(Map<String, String> data) throws Throwable {
        setTransactionType(data.get("Transaction_Type_END"));
        setEndorsementType(data.get("Endorsement_Type_END"));
        setNewTransactionEffectiveDate(data.get("Endorsement_Effective_Date_END"));
        setDescription(data.get("Description_END"));
        setNotes(data.get("Notes_END"));
        DataManager.getInstance().setKey("Current_Term_Eff_Date", data.get("Endorsement_Effective_Date_END"));
    }

    public void fillOOSEndorsementTransactionDetails(Map<String, String> data) throws Throwable {
        setTransactionType(data.get("Transaction_Type_OOS"));
        setEndorsementType(data.get("Endorsement_Type_OOS"));
        setNewTransactionEffectiveDate(data.get("Endorsement_Effective_Date_OOS"));
        setDescription(data.get("Description_OOS"));
        setNotes(data.get("Notes_OOS"));
    }

    public void setCancellationRequestedBy(String s) {
        typeTextEnter(cancellationRequestedBy, s, "Cancellation requested by");
    }

    public void setFlatCancelMEP(String text) {
        typeTextEnter(flatCancelMEP, text, "Flat Cancel MEP");
    }

    public void setReasonForFlatCancel(String text) {
        typeTextEnter(reasonForFlatCancel, text, "Reason for flat cancel");
    }
}