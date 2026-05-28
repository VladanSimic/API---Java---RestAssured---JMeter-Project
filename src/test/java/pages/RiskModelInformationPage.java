package pages;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class RiskModelInformationPage extends CommonComponentsAndActions {
    WebDriver driver;
    WarningBlock warningBlock;
    RMSRiskModelInformationBlock rmsRiskModelInformationBlock;
    RMSRateCalculationsBlock rmsRateCalculationsBlock;
    RMSOtherAALsBlock rmsOtherAALsBlock;
    RiskCharacteristicsUsedInRiskModelBlock riskCharacteristicsUsedInRiskModelBlock;
    LocationCoveragesBlock locationCoveragesBlock;

    public RiskModelInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        warningBlock = new WarningBlock(driver);
        rmsRiskModelInformationBlock = new RMSRiskModelInformationBlock(driver);
        rmsRateCalculationsBlock = new RMSRateCalculationsBlock(driver);
        rmsOtherAALsBlock = new RMSOtherAALsBlock(driver);
        riskCharacteristicsUsedInRiskModelBlock = new RiskCharacteristicsUsedInRiskModelBlock(driver);
        locationCoveragesBlock = new LocationCoveragesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'risk model information')]/../../../../../..//table//tr[2]/td[3]/div")
    WebElement riskModelUsedTextForAIR;
    @FindBy(xpath = "//div[contains(text(),'risk model information')]/../../../../../..//table//tr[2]/td[4]/div")
    WebElement timestampDatePulledForAIR;
    @FindBy(xpath = "//div[contains(text(),'risk model information')]/../../../../../..//table//tr[2]/td[4]/div")
    WebElement riskModelUsedTextForRMS;
    @FindBy(xpath = "//div[contains(text(),'risk model information')]/../../../../../..//table//tr[2]/td[5]/div")
    WebElement timestampDatePulledForRMS;

    public void fillRiskModelInformationPageCC(Map<String, String> data) throws Throwable {
        goToPage("Risk Model Information");
        warningBlock.fillWarningDetailsCC(data);
        rmsRiskModelInformationBlock.fillRMSRiskModelInformationCC(data);
        rmsRateCalculationsBlock.fillRMSRateCalculationsCC(data);
        rmsOtherAALsBlock.fillRMSOtherAALsCC(data);
        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelCC(data);
        locationCoveragesBlock.fillLocationCoveragesCC(data);
    }

    public void fillRiskModelInformationPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Risk Model Information");
        warningBlock.fillWarningDetailsCC_END(data);
        rmsRiskModelInformationBlock.fillRMSRiskModelInformationCC_END(data);
        rmsRateCalculationsBlock.fillRMSRateCalculationsCC_END(data);
        rmsOtherAALsBlock.fillRMSOtherAALsCC_END(data);
        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelCC_END(data);
        locationCoveragesBlock.fillLocationCoveragesCC_END(data);
    }

    public void fillRiskModelInformationPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillRiskModelInformationPageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Risk Model Information")) {
            warningBlock.fillWarningDetailsHS(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS(data);
            locationCoveragesBlock.fillLocationCoveragesHS(data);
        }
    }

    public void fillRiskModelInformationPageHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Risk Model Information")) {
            warningBlock.fillWarningDetailsHS_END(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS_END(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS_END(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS_END(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS_END(data);
            locationCoveragesBlock.fillLocationCoveragesHS_END(data);
        }
    }

    public void fillRiskModelInformationPageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Risk Model Information")) {
            warningBlock.fillWarningDetailsHS_OOS_END(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS_OOS_END(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS_OOS_END(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS_OOS_END(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS_OOS_END(data);
            locationCoveragesBlock.fillLocationCoveragesHS_OOS_END(data);
        }
    }

    public void fillRiskModelInformationPageHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Risk Model Information")) {
            warningBlock.fillWarningDetailsHS_RNW(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS_RNW(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS_RNW(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS_RNW(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS_RNW(data);
            locationCoveragesBlock.fillLocationCoveragesHS_RNW(data);
        }
    }

    public void verifyHSRiskModel(String value) throws Throwable {
        reportScreenshot("HS Risk Model_" + System.currentTimeMillis(), "HS Risk Model");

        if (value.equalsIgnoreCase("AIR")) {
            if (!riskModelUsedTextForAIR.getText().equalsIgnoreCase("AIR"))
                failAssertion("HS Risk Model used is not AIR");
        } else if (value.equalsIgnoreCase("RMS") || value.equalsIgnoreCase("RMS21")) {
            if (!riskModelUsedTextForRMS.getText().equalsIgnoreCase("RMS21"))
                failAssertion("HS Risk Model used is not RMS");

            if (timestampDatePulledForRMS.getText().isEmpty()) {
                saveChanges();
                pause(3500);
            }

            assertContains(timestampDatePulledForRMS.getText(), ":", "Date Pulled Timestamp");
        }
    }

    public void insertRiskModelUsedIntoData(String riskModel, String trx) {
        Map<String, String> data = DataManager.getInstance().getData();
        if (riskModel.equalsIgnoreCase("AIR")) {
            data.put(riskModel + "_RiskModel_Model_" + trx, riskModelUsedTextForAIR.getText().trim());
            data.put(riskModel + "_RiskModel_Timestamp_" + trx, timestampDatePulledForAIR.getText().trim());
        } else if (riskModel.equalsIgnoreCase("RMS") || riskModel.equalsIgnoreCase("RMS21")) {
            data.put(riskModel + "_RiskModel_Model_" + trx, riskModelUsedTextForRMS.getText().trim());
            data.put(riskModel + "_RiskModel_Timestamp_" + trx, timestampDatePulledForRMS.getText().trim());
        }
    }

    public void verifyRiskModelUsedFromData(String riskModel, String trx, String option) throws Throwable {
        Map<String, String> data = DataManager.getInstance().getData();
        String modelUsed = data.get(riskModel + "_RiskModel_Model_" + trx);
        String timeStamp = data.get(riskModel + "_RiskModel_Timestamp_" + trx);
        boolean matches = false;

        if (riskModel.equalsIgnoreCase("AIR")) {
            matches = riskModelUsedTextForAIR.getText().trim().equalsIgnoreCase(modelUsed) &&
                    timestampDatePulledForAIR.getText().trim().equalsIgnoreCase(timeStamp);
        } else if (riskModel.equalsIgnoreCase("RMS") || riskModel.equalsIgnoreCase("RMS21")) {
            matches = riskModelUsedTextForRMS.getText().trim().equalsIgnoreCase(modelUsed) &&
                    timestampDatePulledForRMS.getText().trim().equalsIgnoreCase(timeStamp);
        }

        if (option.equalsIgnoreCase("same") || option.equalsIgnoreCase("equal")) {
            if (!matches) {
                failAssertion("RiskModel or Timestamp does not match based on " + trx + " transaction data");
            }
        } else {
            if (matches) {
                failAssertion("RiskModel or Timestamp matches when it shouldn't based on " + trx + " transaction data");
            }
        }
        scrollToWebElement(riskModelUsedTextForAIR);
        reportScreenshot("RiskModel", "Risk Model Used report");
    }

}