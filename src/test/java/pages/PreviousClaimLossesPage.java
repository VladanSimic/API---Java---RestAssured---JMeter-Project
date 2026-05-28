package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.blocks.AutomatedLossDetailsBlock;
import pages.blocks.LossClaimHistoryBlock;
import pages.blocks.PreviousLossDetailsBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class PreviousClaimLossesPage extends CommonComponentsAndActions {
    WebDriver driver;
    LossClaimHistoryBlock lossClaimHistoryBlock;
    PreviousLossDetailsBlock previousLossDetailsBlock;
    AutomatedLossDetailsBlock automatedLossDetailsBlock;

    public PreviousClaimLossesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        lossClaimHistoryBlock = new LossClaimHistoryBlock(driver);
        previousLossDetailsBlock = new PreviousLossDetailsBlock(driver);
        automatedLossDetailsBlock = new AutomatedLossDetailsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[1]/div")
    WebElement source;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[1]/div[2]//input")
    WebElement sourceInput;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[2]/div")
    WebElement date;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[3]/div")
    WebElement lossType;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[4]/div/input[1]")
    WebElement catLossNo;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[4]/div/input[2]")
    WebElement catLossYes;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[5]/div")
    WebElement amountPaid;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../../div[2]/div[3]//tbody/tr/td[6]/div")
    WebElement claimClosedElement;
    @FindBy(xpath = "//div[text()='previous loss details from CLUE Reports']/../../../../../..//tr")
    List<WebElement> clueDataReturned;

    public void fillOutPreviousLossesCoveragesPage(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        pause(5000);
        verifyBlockExists("loss/claim history");
        if (data.get("Previous_Claims_Losses") != null && data.get("Previous_Claims_Losses").equalsIgnoreCase("Yes")) {
//            lossClaimHistoryComponent.setPriorLossesYes();
//            clickElement(add);
//            pause(180000);
//            setSource(data.get("Source"));
//            setLossDate(data.get("Loss_Date"));
//            setLossType(data.get("Loss_Type"));
//            catLoss(data.get("Cat_Loss"));
//            setAmountPaid(data.get("Amount_Paid"));
//            claimClosed(data.get("Claim_Closed"));
        } else {
            try {
                lossClaimHistoryBlock.setPriorLossesNo();
            } catch (Exception e) {
                pause(5000);
                lossClaimHistoryBlock.setPriorLossesNo();
            }
        }
    }

    public void fillOutPreviousLossesCoveragesPageCC(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailCC(data);
        previousLossDetailsBlock.fillPreviousLossDetailCC(data);
        automatedLossDetailsBlock.fillAutomatedLossDetailCC(data);
    }

    public void fillOutPreviousLossesCoveragesPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailCC_END(data);
        previousLossDetailsBlock.fillPreviousLossDetailCC_END(data);
        automatedLossDetailsBlock.fillAutomatedLossDetailCC_END(data);
    }

    public void fillOutPreviousLossesCoveragesCO(Map<String, String> data) throws Throwable {
        goToPage("Previous Claims/Loss History");
            lossClaimHistoryBlock.fillLossClaimHistoryDetailsCO(data);
            previousLossDetailsBlock.fillPreviousLossDetailsCO(data);

    }

    public void fillOutPreviousLossesCoveragesPage(Map<String, String> data, int i) throws Throwable {
        if (data.get("Previous_Claims_Losses_" + 1) != null && data.get("Previous_Claims_Losses_" + 1).equalsIgnoreCase("Yes")) {
//            lossClaimHistoryComponent.setPriorLossesYes();
//            clickElement(add);
//            pause(180000);
//            setSource(data.get("Source"));
//            setLossDate(data.get("Loss_Date"));
//            setLossType(data.get("Loss_Type"));
//            catLoss(data.get("Cat_Loss"));
//            setAmountPaid(data.get("Amount_Paid"));
//            claimClosed(data.get("Claim_Closed"));
        } else {
            lossClaimHistoryBlock.setPriorLossesNo();
        }
        saveChanges();
    }

    private void claimClosed(String claim_closed) throws Throwable {
        clickElement(lossType);
        pause(2000);
        clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + claim_closed + "')]")));
    }

    private void setAmountPaid(String amount_paid) throws Throwable {
        clickElement(amountPaid);
        //setAttributeValue(amountPaid,"value",amount_paid);
        typeText(amountPaid, amount_paid);
    }

    private void catLoss(String cat_loss) throws Throwable {
        choose(catLossYes, catLossNo, cat_loss);
    }

    private void setLossType(String loss_type) throws Throwable {
        clickElement(lossType);
        pause(2000);
        clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + loss_type + "')]")));
    }

    private void setLossDate(String loss_date) throws Throwable {
        clickElement(date);
        //setAttributeValue(date,"value",loss_date);
        typeText(date, loss_date);
    }

    private void setSource(String sourceValue) throws Throwable {
        clickElement(source);
        pause(2000);
        //setAttributeValue(sourceInput,"value",sourceValue);
        typeText(sourceInput, sourceValue);
    }

    public void fillOutPreviousLossesCoveragesPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillOutPreviousLossesCoveragesPageHS(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHS(data);
        previousLossDetailsBlock.fillPreviousLossDetailHS(data);
        automatedLossDetailsBlock.fillAutomatedLossDetailHS(data);
    }

    public void fillOutPreviousLossesCoveragesPageHS_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHS_OOS_END(data);
        previousLossDetailsBlock.fillPreviousLossDetailHS_OOS_END(data);
        automatedLossDetailsBlock.fillAutomatedLossDetailHS_OOS_END(data);
    }

    public void fillOutPreviousLossesCoveragesPageHS_END(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHS_END(data);
        previousLossDetailsBlock.fillPreviousLossDetailHS_END(data);
        automatedLossDetailsBlock.fillAutomatedLossDetailHS_END(data);
    }

    public void fillOutPreviousLossesCoveragesPageHS_RNW(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHS_RNW(data);
        previousLossDetailsBlock.fillPreviousLossDetailHS_RNW(data);
        automatedLossDetailsBlock.fillAutomatedLossDetailHS_RNW(data);
    }

    public void fillOutPreviousLossesCoveragesPageHO(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHO(data);
        previousLossDetailsBlock.fillPreviousLossDetailHO(data);
    }

    public void fillOutPreviousLossesCoveragesPageHO_END(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHO_END(data);
        previousLossDetailsBlock.fillPreviousLossDetailHO_END(data);
    }

    public void fillOutPreviousLossesCoveragesPageHO_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHO_OOS_END(data);
        previousLossDetailsBlock.fillPreviousLossDetailHO_OOS_END(data);
    }

    public void fillOutPreviousLossesCoveragesPageHO_RNW(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHO_RNW(data);
        previousLossDetailsBlock.fillPreviousLossDetailHO_RNW(data);
    }

    public void fillOutPreviousLossesCoveragesPageHO(Map<String, String> data, int i) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailHO(data, i);
        previousLossDetailsBlock.fillPreviousLossDetailHO(data, i);
    }

    public boolean isCLUEDataReturned() {
        return clueDataReturned.size() != 0;
    }

    public void verifyIfCLUEDataReturned(String value) throws Throwable {
        pause(2000);
        reportScreenshot("CLUE_Data_" + System.currentTimeMillis(), "CLUE Data");

        if (value.equalsIgnoreCase("Returned")) {
            if (!isCLUEDataReturned())
                failAssertion("CLUE Data is not returned");
            else
                successLog("CLUE Data is returned");
        } else {
            if (isCLUEDataReturned())
                failAssertion("CLUE Data is returned");
            else
                successLog("CLUE Data is not returned");
        }
    }

    public void fillOutPreviousLossesCoveragesPageFS(Map<String, String> data) throws Throwable {
        goToPage("Previous Claim/Losses");
        lossClaimHistoryBlock.fillLossClaimHistoryDetailFS(data);
        previousLossDetailsBlock.fillPreviousLossDetailFS(data);
        automatedLossDetailsBlock.fillAutomatedLossDetailFS(data);
    }


}