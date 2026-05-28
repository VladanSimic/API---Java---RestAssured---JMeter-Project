package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class LossClaimHistoryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LossClaimHistoryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Any prior')]/../../../..//label[text()='Yes']/..//input")
    WebElement priorLossesYes;
    @FindBy(xpath = "//div[contains(text(),'Any prior')]/../../../..//label[text()='No']/..//input")
    public WebElement priorLossesNo;

    public void setPriorLossesNo() throws Throwable {
        clickElement(priorLossesNo);
    }

    public void setPriorLossesYes() throws Throwable {
        clickElement(priorLossesYes);
    }

    public void setPriorLosses(String loss) throws Throwable {
        choose(priorLossesYes, priorLossesNo, loss, "Prior losses");
    }

    public void fillLossClaimHistoryDetailCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses"));
        saveChanges();
    }

    public void fillLossClaimHistoryDetailCC_END(Map<String, String> data) throws Throwable {
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_END"));
        saveChanges();
    }

    public void fillLossClaimHistoryDetailsHS(String value) throws Throwable {
        verifyBlockExists("loss/claim history");
        choose(priorLossesYes, priorLossesNo, value, "Prior Collection Losses");
    }

    public void fillLossClaimHistoryDetailsHS_END(String value) throws Throwable {
        choose(priorLossesYes, priorLossesNo, value, "Prior Collection Losses");
    }

    public void fillLossClaimHistoryDetailsHS_OOS_END(String value) throws Throwable {
        choose(priorLossesYes, priorLossesNo, value, "Prior Collection Losses");
    }

    public void fillLossClaimHistoryDetailsHS_RNW(String value) throws Throwable {
        choose(priorLossesYes, priorLossesNo, value, "Prior Collection Losses");

    }

    public void fillLossClaimHistoryDetailHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses"));
    }

    public void fillLossClaimHistoryDetailHS_END(Map<String, String> data) throws Throwable {
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_END"));
    }

    public void fillLossClaimHistoryDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_OOS_END"));
    }

    public void fillLossClaimHistoryDetailHS_RNW(Map<String, String> data) throws Throwable {
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_RNW"));
    }

    public void fillLossClaimHistoryDetailHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses"));
    }

    public void fillLossClaimHistoryDetailHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_END"));
    }

    public void fillLossClaimHistoryDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_OOS_END"));
    }

    public void fillLossClaimHistoryDetailHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_RNW"));
    }

    public void fillLossClaimHistoryDetailHO(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses_" + i));
    }

    public void fillLossClaimHistoryDetailFS(Map<String, String> data) throws Throwable {
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Losses"));
    }

    public void fillLossClaimHistoryDetailsCO(Map<String, String> data) throws Throwable {
        verifyBlockExists("loss/claim history");
        setPriorLosses(data.get("Loss_Claim_History_Any_Prior_Collection_Losses"));
    }
}