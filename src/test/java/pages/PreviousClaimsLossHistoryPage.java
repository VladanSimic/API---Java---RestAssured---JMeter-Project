package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AutomatedLossDetailsBlock;
import pages.blocks.LossClaimHistoryBlock;
import pages.blocks.PreviousLossDetailsBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class PreviousClaimsLossHistoryPage extends CommonComponentsAndActions {
    WebDriver driver;
    LossClaimHistoryBlock lossClaimHistoryBlock;
    PreviousLossDetailsBlock previousLossDetailsBlock;

    public PreviousClaimsLossHistoryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        lossClaimHistoryBlock = new LossClaimHistoryBlock(driver);
        previousLossDetailsBlock = new PreviousLossDetailsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;

    public void fillPreviousClaimsLossHistoryPageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Previous Claims/Loss History"))
            lossClaimHistoryBlock.fillLossClaimHistoryDetailsHS(data.get("Loss_Claim_History_Any_Prior_Collection_Losses"));
        previousLossDetailsBlock.fillPreviousLossDetailsHS(data);
    }

    public void fillPreviousClaimsLossHistoryPageHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Previous Claims/Loss History"))
            lossClaimHistoryBlock.fillLossClaimHistoryDetailsHS_END(data.get("Loss_Claim_History_Any_Prior_Collection_Losses_END"));
        previousLossDetailsBlock.fillPreviousLossDetailsHS_END(data);
    }

    public void fillPreviousClaimsLossHistoryPageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Previous Claims/Loss History"))
            lossClaimHistoryBlock.fillLossClaimHistoryDetailsHS_OOS_END(data.get("Loss_Claim_History_Any_Prior_Collection_Losses_OOS_END"));
        previousLossDetailsBlock.fillPreviousLossDetailsHS_OOS_END(data);
    }

    public void fillPreviousClaimsLossHistoryPageHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Previous Claims/Loss History"))
            lossClaimHistoryBlock.fillLossClaimHistoryDetailsHS_RNW(data.get("Loss_Claim_History_Any_Prior_Collection_Losses_RNW"));
        previousLossDetailsBlock.fillPreviousLossDetailsHS_RNW(data);
    }
}