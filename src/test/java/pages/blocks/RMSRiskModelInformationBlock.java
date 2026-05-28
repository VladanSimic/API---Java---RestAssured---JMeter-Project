package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class RMSRiskModelInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public RMSRiskModelInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='RMS risk model information ']/../../../../../..//table//tr[2]/td[1]/div")
    WebElement hurricaneAAL;
    @FindBy(xpath = "//div[text()='RMS risk model information ']/../../../../../..//table//tr[2]/td[2]/div")
    WebElement frAdjustment;
    @FindBy(xpath = "//div[text()='RMS risk model information ']/../../../../../..//table//tr[2]/td[3]/div")
    WebElement dtc;
    @FindBy(xpath = "//div[text()='RMS risk model information ']/../../../../../..//table//tr[2]/td[4]/div")
    WebElement riskModelUsed;
    @FindBy(xpath = "//div[text()='RMS risk model information ']/../../../../../..//table//tr[2]/td[5]/div")
    WebElement datePulled;

    public void fillRMSRiskModelInformationCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk model information");
        verifyHurricaneAAL(data.get("RMS_Risk_Model_Information_Hurricane_AAL"));
        verifyFRAdjustment(data.get("RMS_Risk_Model_Information_FR_Adjustment"));
        verifyDTC(data.get("RMS_Risk_Model_Information_DTC"));
        verifyRiskModelUsed(data.get("RMS_Risk_Model_Information_Risk_Model_Used"));
        verifyDatePulled(data.get("RMS_Risk_Model_Information_Date_Pulled"));
    }

    public void fillRMSRiskModelInformationCC_END(Map<String, String> data) {
        verifyHurricaneAAL(data.get("RMS_Risk_Model_Information_Hurricane_AAL_END"));
        verifyFRAdjustment(data.get("RMS_Risk_Model_Information_FR_Adjustment_END"));
        verifyDTC(data.get("RMS_Risk_Model_Information_DTC_END"));
        verifyRiskModelUsed(data.get("RMS_Risk_Model_Information_Risk_Model_Used_END"));
        verifyDatePulled(data.get("RMS_Risk_Model_Information_Date_Pulled_END"));
    }

    public void verifyHurricaneAAL(String value) {
        assertCellValue(hurricaneAAL, value, "Hurricane AAL");
    }

    public void verifyFRAdjustment(String value) {
        assertCellValue(frAdjustment, value, "FR Adjustment");
    }

    public void verifyDTC(String value) {
        assertCellValue(dtc, value, "DTC");
    }

    public void verifyRiskModelUsed(String value) {
        assertCellValue(riskModelUsed, value, "Risk Model Used");
    }

    public void verifyDatePulled(String value) {
        assertCellValue(datePulled, value, "Date Pulled");
    }

    public void fillRMSRiskModelInformationHS(Map<String, String> data) {
        verifyHurricaneAAL(data.get("RMS_Risk_Model_Information_Hurricane_AAL"));
        verifyFRAdjustment(data.get("RMS_Risk_Model_Information_FR_Adjustment"));
        verifyDTC(data.get("RMS_Risk_Model_Information_DTC"));
        verifyRiskModelUsed(data.get("RMS_Risk_Model_Information_Risk_Model_Used"));
        verifyDatePulled(data.get("RMS_Risk_Model_Information_Date_Pulled"));
        verifyBlockExists(data.get("State"));
    }

    public void fillRMSRiskModelInformationHS_END(Map<String, String> data) {
        verifyHurricaneAAL(data.get("RMS_Risk_Model_Information_Hurricane_AAL_END"));
        verifyFRAdjustment(data.get("RMS_Risk_Model_Information_FR_Adjustment_END"));
        verifyDTC(data.get("RMS_Risk_Model_Information_DTC_END"));
        verifyRiskModelUsed(data.get("RMS_Risk_Model_Information_Risk_Model_Used_END"));
        verifyDatePulled(data.get("RMS_Risk_Model_Information_Date_Pulled_END"));
    }

    public void fillRMSRiskModelInformationHS_OOS_END(Map<String, String> data) {
        verifyHurricaneAAL(data.get("RMS_Risk_Model_Information_Hurricane_AAL_OOS_END"));
        verifyFRAdjustment(data.get("RMS_Risk_Model_Information_FR_Adjustment_OOS_END"));
        verifyDTC(data.get("RMS_Risk_Model_Information_DTC_OOS_END"));
        verifyRiskModelUsed(data.get("RMS_Risk_Model_Information_Risk_Model_Used_OOS_END"));
        verifyDatePulled(data.get("RMS_Risk_Model_Information_Date_Pulled_OOS_END"));
    }

    public void fillRMSRiskModelInformationHS_RNW(Map<String, String> data) {
        verifyHurricaneAAL(data.get("RMS_Risk_Model_Information_Hurricane_AAL_RNW"));
        verifyFRAdjustment(data.get("RMS_Risk_Model_Information_FR_Adjustment_RNW"));
        verifyDTC(data.get("RMS_Risk_Model_Information_DTC_RNW"));
        verifyRiskModelUsed(data.get("RMS_Risk_Model_Information_Risk_Model_Used_RNW"));
        verifyDatePulled(data.get("RMS_Risk_Model_Information_Date_Pulled_RNW"));
    }

    public void verifyBlockExists(String state) {
        if (BLOCK_VALIDATION.equalsIgnoreCase("Yes")) {
            if (!state.equalsIgnoreCase("CA")) {
                List<WebElement> riskModelInformationBlock = driver.findElements(By.xpath(blockValidation.replace("$$", "risk model information")));
                List<WebElement> notAvailableInThisStateBlock = driver.findElements(By.xpath(blockValidation.replace("$$", "not available in this state")));

                if (riskModelInformationBlock.isEmpty() && notAvailableInThisStateBlock.isEmpty())
                    failAssertion("risk model information block is not displayed");
            }
        }
    }
}






