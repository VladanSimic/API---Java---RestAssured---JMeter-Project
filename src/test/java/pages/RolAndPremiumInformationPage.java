package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class RolAndPremiumInformationPage extends CommonComponentsAndActions {
    WebDriver driver;
    WarningBlock warningBlock;
    RMSRiskModelInformationBlock rmsRiskModelInformationBlock;
    RMSRateCalculationsBlock rmsRateCalculationsBlock;
    RMSOtherAALsBlock rmsOtherAALsBlock;
    RiskCharacteristicsUsedInRiskModelBlock riskCharacteristicsUsedInRiskModelBlock;
    LocationCoveragesBlock locationCoveragesBlock;

    public RolAndPremiumInformationPage(WebDriver driver) {
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

    public void RolAndPremiumInformationHS(Map<String, String> data) throws Throwable {
        if (goToPage("ROL and Premium Information")) {
            warningBlock.fillWarningDetailsHS(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS(data);
            locationCoveragesBlock.fillLocationCoveragesHS(data);
        }
    }

    public void RolAndPremiumInformationHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("ROL and Premium Information")) {
            warningBlock.fillWarningDetailsHS_END(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS_END(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS_END(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS_END(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS_END(data);
            locationCoveragesBlock.fillLocationCoveragesHS_END(data);
        }
    }

    public void RolAndPremiumInformationHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("ROL and Premium Information")) {
            warningBlock.fillWarningDetailsHS_OOS_END(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS_OOS_END(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS_OOS_END(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS_OOS_END(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS_OOS_END(data);
            locationCoveragesBlock.fillLocationCoveragesHS_OOS_END(data);
        }
    }

    public void RolAndPremiumInformationHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("ROL and Premium Information")) {
            warningBlock.fillWarningDetailsHS_RNW(data);
            rmsRiskModelInformationBlock.fillRMSRiskModelInformationHS_RNW(data);
            rmsRateCalculationsBlock.fillRMSRateCalculationsHS_RNW(data);
            rmsOtherAALsBlock.fillRMSOtherAALsHS_RNW(data);
            riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsUsedInRiskModelHS_RNW(data);
            locationCoveragesBlock.fillLocationCoveragesHS_RNW(data);
        }
    }
}