package pages;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StatusDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class TransactionsOrEndorsementsPage extends CommonComponentsAndActions {
    WebDriver driver;

    public TransactionsOrEndorsementsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='transactions']/../../../../../..//table")
    List<WebElement> transactionRows;
    @FindBy(xpath = "(//div[contains(text(),'transactions')]/../../../../../..//table/tbody/tr//span)[3]")
    WebElement firstTrxAfterNBradioBtn;
    @FindBy(xpath = "//span[text()='delete']")
    WebElement deleteTransaction;
    @FindBy(xpath = "//div[text()='You are requesting a back dated transaction. In order to proceed, please ']/../../../..//label//u[text()='YES']/../..//input")
    WebElement backdatedTrxYesPrevLossesBtn;
    @FindBy(xpath = "//div[text()='You are requesting a back dated transaction. In order to proceed, please ']/../../../..//label//u[text()='NO']/../..//input")
    WebElement backdatedTrxNoPrevLossesBtn;

    public void openFirstEndorsement() {
        clickElement(driver.findElement(By.xpath("(//span[text()='Endorsement'])[1]")), "Endorsement");
    }

    public void selectNewBusinessRewrite() {
        new CommonComponentsAndActions(driver).clickElement(driver.findElement(By.xpath("//span[text()='New Business Rewrite']")), "New Business Rewrite");
    }

    /**
     * Call this method if you want to assert grand total of two transactions. If there are more than transactions with same name
     * the newest one will be used. Used mainly for NB and Non Premium Bearing Endorsement, or Renewal and Non Premium Bearing Endorsement.
     *
     * @param trx1 Name of the first transaction that you want to compare
     * @param trx2 Name of the second transaction that you want to compare
     */
    public void compareIfGrandTotalPremiumsAreMatching(String trx1, String trx2, String value) throws InterruptedException {
        pause(5000);
        String trxNameXPath = "//div[text()='transactions']/../../../../../..//table[$$]//tr//td[3]//div//span";
        String trxGrandTotalPremiumXPath = "//div[text()='transactions']/../../../../../..//table[$$]//tr//td[16]//div";
        WebElement trx1Element = null;
        WebElement trx2Element = null;

        for (int i = 1; i <= transactionRows.size(); i++) {
            String trxNameText = driver.findElement(By.xpath(trxNameXPath.replace("$$", String.valueOf(i)))).getText();

            if (trxNameText.equalsIgnoreCase(trx1)) {
                trx1Element = driver.findElement(By.xpath(trxGrandTotalPremiumXPath.replace("$$", String.valueOf(i))));
            }
            if (trxNameText.equalsIgnoreCase(trx2)) {
                trx2Element = driver.findElement(By.xpath(trxGrandTotalPremiumXPath.replace("$$", String.valueOf(i))));
            }
        }
        reportScreenshot("Transaction_Premiums_" + System.currentTimeMillis(), "Transaction Premiums");
        if (trx1Element != null && trx2Element != null) {
            String premiumOne = trx1Element.getText();
            String premiumTwo = trx2Element.getText();
            if (value.equalsIgnoreCase("equal"))
                assertEquals(premiumTwo, premiumOne, "Grand Total Premiums");
            else
                Assert.assertNotEquals(premiumTwo, premiumOne);
        } else {
            failAssertion("One or both elements not found.");
        }
    }

    public void compareTransactionTotalAfterValue(String tx1, String tx2) throws InterruptedException {
        pause(2000);
        String tx1Value = driver.findElement(By.xpath("//span[text()='" + tx1 + "']/../../..//td[16]/div")).getText();
        String tx2Value = driver.findElement(By.xpath("//span[text()='" + tx2 + "']/../../..//td[16]/div")).getText();
        reportTextAttachment("Total After Values", tx1 + " : " + tx1Value + " | " + tx2 + " : " + tx2Value);
        assertEquals(tx1Value, tx2Value, "Values do not match!");
    }

    public void deleteFirstTransactionAfterNewBusiness() throws InterruptedException {
        clickElement(firstTrxAfterNBradioBtn, "Clicked trx radio button");
        clickElement(deleteTransaction, "Clicked delete button on transaction page");
        pause(1000);
        clickElement(ok, "Clicked OK button");
    }

    public void clickBackdatedTrxPreviousLossesDuringThisPeriodYesOrNo(String yesOrNo) {
        if (yesOrNo.equalsIgnoreCase("Yes")) {
            clickElement(backdatedTrxYesPrevLossesBtn, "Clicked yes button for previous losses during this period");
        } else {
            clickElement(backdatedTrxNoPrevLossesBtn, "Clicked no button for previous losses during this period");
        }
    }

    public void verifyFlatProRateCancellation(String cancelType) {
        switch (cancelType) {
            case "FlatRate": {
                if (!driver.findElement(By.xpath("(//span[text()='Cancellation']/../../../td)[16]//div")).getText().equalsIgnoreCase("$ 0.00")) {
                    Assert.fail();
                }
            }
            break;
            case "ProRate": {
                if (driver.findElement(By.xpath("(//span[text()='Cancellation']/../../../td)[16]//div")).getText().equalsIgnoreCase("$ 0.00")) {
                    Assert.fail();
                }
            }
            break;
        }
    }
}
