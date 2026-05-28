package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class TransactionDetailsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public TransactionDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Choose Transaction Type']/../../../..//input")
    WebElement transactionTypeEl;
    @FindBy(xpath = "//div[text()='New Transaction Effective Date']/../../../..//input")
    WebElement transactionEffectiveDate;
    @FindBy(xpath = "//div[text()='Cancellation Requested by:']/../../../..//input")
    WebElement cancellationRequestedByEl;
    @FindBy(xpath = "//div[text()='Cancellation Reason']/../../../..//input")
    WebElement cancellationReasonEl;
    @FindBy(xpath = "//div[text()='Sub-Type']/../../../..//input")
    WebElement subTypeEl;
    @FindBy(xpath = "//div[text()='Cancellation Method']/../../../..//input")
    WebElement cancellationMethodEl;
    @FindBy(xpath = "//div[contains(text(),'ODEN notice')]/../../../../../../..//textarea")
    WebElement odenNoticeEl;
    @FindBy(xpath = "//div[contains(text(),'Refer to PURE Programs?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement referToPureYes;
    @FindBy(xpath = "//div[contains(text(),'Refer to PURE Programs?')]/../../../../div//label[text()='No']/..//input")
    WebElement referToPureNo;
    @FindBy(xpath = "//div[text()='Reason for not referring']/../../../..//input")
    WebElement reasonForNotReferringEl;
    @FindBy(xpath = "//div[text()='Additional Comments']/../../../..//textarea")
    WebElement additionalCommentsEl;
    @FindBy(xpath = "//div[text()='Notes']/../../../..//input")
    WebElement notesEl;
    @FindBy(xpath = "//div[text()='Add additional comments to ODEN notice?']/../../../../div//label[text()='Yes']/..//input")
    WebElement addCommentsToOdenYes;
    @FindBy(xpath = "//div[text()='Add additional comments to ODEN notice?']/../../../../div//label[text()='No']/..//input")
    WebElement addCommentsToOdenNo;

    public void setTransactionType(String transactionType, String subType, String notes, String odenNotice, String addCommentsToOden) throws Throwable {
        clickNewTransaction();
        typeTextEnter(transactionTypeEl, transactionType, "Transaction Type");
        typeTextEnter(subTypeEl, subType, "Sub Type");
        typeTextEnter(notesEl, notes, "Notes");
        typeTextEnter(odenNoticeEl, odenNotice, "Oden Notice");
        choose(addCommentsToOdenYes, addCommentsToOdenNo, addCommentsToOden, "Add Comments To Oden");
    }

    public void setReferToPure(String referToPURE, String reasonForNotReferring, String additionalComments) throws Throwable {
        choose(referToPureYes, referToPureNo, referToPURE, "Refer To Pure");
        if (!referToPURE.equalsIgnoreCase("Yes")) {
            typeTextEnter(reasonForNotReferringEl, reasonForNotReferring, "Reason For Not Referring");
            pause(1000);
            if (reasonForNotReferring.equalsIgnoreCase("Other - Please explain")) {
                typeTextEnter(additionalCommentsEl, additionalComments, "Additional Comments");
                clickNext();
            }
        }
        clickNext();
    }

    public void setCancellation(String chooseTransaction, String newTransactionEffectiveDate, String notes, String cancellationRequestedBy) throws Throwable {
        clickNewTransaction();
        typeTextEnter(transactionTypeEl, chooseTransaction, "Transaction Type");
        typeTextEnter(transactionEffectiveDate, newTransactionEffectiveDate, "New Transaction Effective Date");
        typeTextEnter(notesEl, notes, "Notes");
        typeTextEnter(cancellationRequestedByEl, cancellationRequestedBy, "Cancellation Requested By");
        clickNext();
    }

    public void setCancellationReason(String cancellationMethod, String cancellationReason) {
        typeTextEnter(cancellationMethodEl, cancellationMethod, "Cancellation Method");
        typeTextEnter(cancellationReasonEl, cancellationReason, "Cancellation Reason");
    }

    public void setCancellationReferToPure(String referToPURE, String reasonForNotReferring, String additionalComments) throws Throwable {
        choose(referToPureYes, referToPureNo, referToPURE, "Refer To Pure");
        if (!referToPURE.equalsIgnoreCase("Yes")) {
            typeTextEnter(reasonForNotReferringEl, reasonForNotReferring, "Reason For Not Referring");
            pause(1000);
            if (reasonForNotReferring.equalsIgnoreCase("Other - Please explain")) {
                typeTextEnter(additionalCommentsEl, additionalComments, "Additional Comments");
            }
        }
        clickProcess();
        clickOK();
        clickProcess();
        clickOK();
    }
}