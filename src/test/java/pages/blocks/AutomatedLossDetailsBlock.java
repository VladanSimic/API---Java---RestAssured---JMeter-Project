package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class AutomatedLossDetailsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public AutomatedLossDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillAutomatedLossDetailCC(Map<String, String> data) throws Throwable {
        // TODO CC
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            verifyBlockExists("previous loss");
            saveChanges();
        }
    }

    public void fillAutomatedLossDetailCC_END(Map<String, String> data) throws Throwable {
        // TODO CC
        saveChanges();
    }

    public void fillAutomatedLossDetailHS(Map<String, String> data) throws Throwable {
        // TODO HS
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            verifyBlockExists("automated  loss details");
            saveChanges();
        }
    }

    public void fillAutomatedLossDetailHS_END(Map<String, String> data) throws Throwable {
        // TODO HS END
        saveChanges();
    }

    public void fillAutomatedLossDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        // TODO HS OOS END
        saveChanges();
    }

    public void fillAutomatedLossDetailHS_RNW(Map<String, String> data) throws Throwable {
        // TODO HS RNW
        saveChanges();
    }

    public void fillAutomatedLossDetailFS(Map<String, String> data) {

    }
}