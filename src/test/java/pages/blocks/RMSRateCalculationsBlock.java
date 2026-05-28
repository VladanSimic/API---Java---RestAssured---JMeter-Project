package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class RMSRateCalculationsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public RMSRateCalculationsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total Insured Value']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement totalInsuredValueSystem;
    @FindBy(xpath = "//div[text()='Total Insured Value']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement totalInsuredValueModification;
    @FindBy(xpath = "//div[text()='Total Insured Value']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement totalInsuredValueFinal;
    @FindBy(xpath = "//div[text()='Total Insured Value']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement totalInsuredValueROL;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (Unadjusted) ']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioUnadjustedSystem;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (Unadjusted) ']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioUnadjustedModification;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (Unadjusted) ']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioUnadjustedFinal;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (Unadjusted) ']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioUnadjustedROL;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (FR Adjusted)']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioFRAdjustedSystem;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (FR Adjusted)']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioFRAdjustedModification;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (FR Adjusted)']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioFRAdjustedFinal;
    @FindBy(xpath = "//div[text()='Wind Premium to Combined AAL Ratio (FR Adjusted)']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement windPremiumToCombinedAALRatioFRAdjustedROL;
    @FindBy(xpath = "//div[text()='Wind Premium']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement windPremiumSystem;
    @FindBy(xpath = "//div[text()='Wind Premium']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement windPremiumModification;
    @FindBy(xpath = "//div[text()='Wind Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement windPremiumFinal;
    @FindBy(xpath = "//div[text()='Wind Premium']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement windPremiumROL;
    @FindBy(xpath = "//div[text()='Non-Wind Premium']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement nonWindPremiumSystem;
    @FindBy(xpath = "//div[text()='Non-Wind Premium']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement nonWindPremiumModification;
    @FindBy(xpath = "//div[text()='Non-Wind Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement nonWindPremiumFinal;
    @FindBy(xpath = "//div[text()='Non-Wind Premium']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement nonWindPremiumROL;
    @FindBy(xpath = "//div[text()='Wildfire Premium']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement wildfirePremiumSystem;
    @FindBy(xpath = "//div[text()='Wildfire Premium']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement wildfirePremiumModification;
    @FindBy(xpath = "//div[text()='Wildfire Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement wildfirePremiumFinal;
    @FindBy(xpath = "//div[text()='Wildfire Premium']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement wildfirePremiumROL;
    @FindBy(xpath = "//div[text()='Base Location Premium']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement baseLocationPremiumSystem;
    @FindBy(xpath = "//div[text()='Base Location Premium']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement baseLocationPremiumModification;
    @FindBy(xpath = "//div[text()='Base Location Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement baseLocationPremiumFinal;
    @FindBy(xpath = "//div[text()='Base Location Premium']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement baseLocationPremiumROL;
    @FindBy(xpath = "//div[text()='Liability Premium']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement liabilityPremiumSystem;
    @FindBy(xpath = "//div[text()='Liability Premium']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement liabilityPremiumModification;
    @FindBy(xpath = "//div[text()='Liability Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement liabilityPremiumFinal;
    @FindBy(xpath = "//div[text()='Liability Premium']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement liabilityPremiumROL;
    @FindBy(xpath = "//div[text()='Optional Coverages Premium']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement optionalCoveragesPremiumSystem;
    @FindBy(xpath = "//div[text()='Optional Coverages Premium']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement optionalCoveragesPremiumModification;
    @FindBy(xpath = "//div[text()='Optional Coverages Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement optionalCoveragesPremiumFinal;
    @FindBy(xpath = "//div[text()='Optional Coverages Premium']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement optionalCoveragesPremiumROL;
    @FindBy(xpath = "//div[text()='Collection Premium + Modifications']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement collectionPremiumModificationsSystem;
    @FindBy(xpath = "//div[text()='Collection Premium + Modifications']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement collectionPremiumModificationsModification;
    @FindBy(xpath = "//div[text()='Collection Premium + Modifications']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement collectionPremiumModificationsFinal;
    @FindBy(xpath = "//div[text()='Collection Premium + Modifications']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement collectionPremiumModificationsROL;
    @FindBy(xpath = "//div[text()='Total Premium']/../../../../../../../../../../../td[2]//div[@aria-readonly='true']")
    WebElement totalPremiumSystem;
    @FindBy(xpath = "//div[text()='Total Premium']/../../../../../../../../../../../td[3]//div[@aria-readonly='true']")
    WebElement totalPremiumModification;
    @FindBy(xpath = "//div[text()='Total Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement totalPremiumFinal;
    @FindBy(xpath = "//div[text()='Total Premium (Reflects Seasonality)']/../../../../../../../../../../../td[5]//div[@aria-readonly='true']")
    WebElement totalPremiumROL;
    @FindBy(xpath = "//div[text()='Total Premium (Reflects Seasonality)']")
    WebElement totalPremiumROLLabel;
    @FindBy(xpath = "//div[text()='Manuscript Endorsement Premium']/../../../../../../../../../../../td[4]//div[@aria-readonly='true']")
    WebElement manuscriptEndorsementPremiumTotal;

    public void fillRMSRateCalculationsCC(Map<String, String> data) throws Throwable {
        super.verifyBlockExists("rate calculations");
        verifyTotalInsuredValueSystem(data.get("RMS_Rate_Calculations_Total_Insured_Value_System"));
        verifyTotalInsuredValueModification(data.get("RMS_Rate_Calculations_Total_Insured_Value_Modification"));
        verifyTotalInsuredValueFinal(data.get("RMS_Rate_Calculations_Total_Insured_Value_Final"));
        verifyTotalInsuredValueROL(data.get("RMS_Rate_Calculations_Total_Insured_Value_ROL"));
        verifyWindPremiumToCombinedAALRatioUnadjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_System"));
        verifyWindPremiumToCombinedAALRatioUnadjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Modification"));
        verifyWindPremiumToCombinedAALRatioUnadjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Final"));
        verifyWindPremiumToCombinedAALRatioUnadjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_ROL"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_System"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Modification"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Final"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_ROL"));
        verifyWindPremiumSystem(data.get("RMS_Rate_Calculations_Wind_Premium_System"));
        verifyWindPremiumModification(data.get("RMS_Rate_Calculations_Wind_Premium_Modification"));
        verifyWindPremiumFinal(data.get("RMS_Rate_Calculations_Wind_Premium_Final"));
        verifyWindPremiumROL(data.get("RMS_Rate_Calculations_Wind_Premium_ROL"));
        verifyNonWindPremiumSystem(data.get("RMS_Rate_Calculations_Non_Wind_Premium_System"));
        verifyNonWindPremiumModification(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Modification"));
        verifyNonWindPremiumFinal(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Final"));
        verifyNonWindPremiumROL(data.get("RMS_Rate_Calculations_Non_Wind_Premium_ROL"));
        verifyWildfirePremiumSystem(data.get("RMS_Rate_Calculations_Wildfire_Premium_System"));
        verifyWildfirePremiumModification(data.get("RMS_Rate_Calculations_Wildfire_Premium_Modification"));
        verifyWildfirePremiumFinal(data.get("RMS_Rate_Calculations_Wildfire_Premium_Final"));
        verifyWildfirePremiumROL(data.get("RMS_Rate_Calculations_Wildfire_Premium_ROL"));
        verifyBaseLocationPremiumSystem(data.get("RMS_Rate_Calculations_Base_Location_Premium_System"));
        verifyBaseLocationPremiumModification(data.get("RMS_Rate_Calculations_Base_Location_Premium_Modification"));
        verifyBaseLocationPremiumFinal(data.get("RMS_Rate_Calculations_Base_Location_Premium_Final"));
        verifyBaseLocationPremiumROL(data.get("RMS_Rate_Calculations_Base_Location_Premium_ROL"));
        verifyLiabilityPremiumSystem(data.get("RMS_Rate_Calculations_Liability_Premium_System"));
        verifyLiabilityPremiumModification(data.get("RMS_Rate_Calculations_Liability_Premium_Modification"));
        verifyLiabilityPremiumFinal(data.get("RMS_Rate_Calculations_Liability_Premium_Final"));
        verifyLiabilityPremiumROL(data.get("RMS_Rate_Calculations_Liability_Premium_ROL"));
        verifyOptionalCoveragesPremiumSystem(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_System"));
        verifyOptionalCoveragesPremiumModification(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Modification"));
        verifyOptionalCoveragesPremiumFinal(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Final"));
        verifyOptionalCoveragesPremiumROL(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_ROL"));
        verifyCollectionPremiumModificationsSystem(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_System"));
        verifyCollectionPremiumModificationsModification(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Modification"));
        verifyCollectionPremiumModificationsFinal(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Final"));
        verifyCollectionPremiumModificationsROL(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_ROL"));
        verifyTotalPremiumSystem(data.get("RMS_Rate_Calculations_Total_Premium_System"));
        verifyTotalPremiumModification(data.get("RMS_Rate_Calculations_Total_Premium_Modification"));
        verifyTotalPremiumFinal(data.get("RMS_Rate_Calculations_Total_Premium_Final"));
        verifyTotalPremiumROL(data.get("RMS_Rate_Calculations_Total_Premium_ROL"));
    }

    public void fillRMSRateCalculationsCC_END(Map<String, String> data) {
        verifyTotalInsuredValueSystem(data.get("RMS_Rate_Calculations_Total_Insured_Value_System_END"));
        verifyTotalInsuredValueModification(data.get("RMS_Rate_Calculations_Total_Insured_Value_Modification_END"));
        verifyTotalInsuredValueFinal(data.get("RMS_Rate_Calculations_Total_Insured_Value_Final_END"));
        verifyTotalInsuredValueROL(data.get("RMS_Rate_Calculations_Total_Insured_Value_ROL_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_System_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Modification_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Final_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_ROL_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_System_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Modification_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Final_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_ROL_END"));
        verifyWindPremiumSystem(data.get("RMS_Rate_Calculations_Wind_Premium_System_END"));
        verifyWindPremiumModification(data.get("RMS_Rate_Calculations_Wind_Premium_Modification_END"));
        verifyWindPremiumFinal(data.get("RMS_Rate_Calculations_Wind_Premium_Final_END"));
        verifyWindPremiumROL(data.get("RMS_Rate_Calculations_Wind_Premium_ROL_END"));
        verifyNonWindPremiumSystem(data.get("RMS_Rate_Calculations_Non_Wind_Premium_System_END"));
        verifyNonWindPremiumModification(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Modification_END"));
        verifyNonWindPremiumFinal(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Final_END"));
        verifyNonWindPremiumROL(data.get("RMS_Rate_Calculations_Non_Wind_Premium_ROL_END"));
        verifyWildfirePremiumSystem(data.get("RMS_Rate_Calculations_Wildfire_Premium_System_END"));
        verifyWildfirePremiumModification(data.get("RMS_Rate_Calculations_Wildfire_Premium_Modification_END"));
        verifyWildfirePremiumFinal(data.get("RMS_Rate_Calculations_Wildfire_Premium_Final_END"));
        verifyWildfirePremiumROL(data.get("RMS_Rate_Calculations_Wildfire_Premium_ROL_END"));
        verifyBaseLocationPremiumSystem(data.get("RMS_Rate_Calculations_Base_Location_Premium_System_END"));
        verifyBaseLocationPremiumModification(data.get("RMS_Rate_Calculations_Base_Location_Premium_Modification_END"));
        verifyBaseLocationPremiumFinal(data.get("RMS_Rate_Calculations_Base_Location_Premium_Final_END"));
        verifyBaseLocationPremiumROL(data.get("RMS_Rate_Calculations_Base_Location_Premium_ROL_END"));
        verifyLiabilityPremiumSystem(data.get("RMS_Rate_Calculations_Liability_Premium_System_END"));
        verifyLiabilityPremiumModification(data.get("RMS_Rate_Calculations_Liability_Premium_Modification_END"));
        verifyLiabilityPremiumFinal(data.get("RMS_Rate_Calculations_Liability_Premium_Final_END"));
        verifyLiabilityPremiumROL(data.get("RMS_Rate_Calculations_Liability_Premium_ROL_END"));
        verifyOptionalCoveragesPremiumSystem(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_System_END"));
        verifyOptionalCoveragesPremiumModification(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Modification_END"));
        verifyOptionalCoveragesPremiumFinal(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Final_END"));
        verifyOptionalCoveragesPremiumROL(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_ROL_END"));
        verifyCollectionPremiumModificationsSystem(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_System_END"));
        verifyCollectionPremiumModificationsModification(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Modification_END"));
        verifyCollectionPremiumModificationsFinal(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Final_END"));
        verifyCollectionPremiumModificationsROL(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_ROL_END"));
        verifyTotalPremiumSystem(data.get("RMS_Rate_Calculations_Total_Premium_System_END"));
        verifyTotalPremiumModification(data.get("RMS_Rate_Calculations_Total_Premium_Modification_END"));
        verifyTotalPremiumFinal(data.get("RMS_Rate_Calculations_Total_Premium_Final_END"));
        verifyTotalPremiumROL(data.get("RMS_Rate_Calculations_Total_Premium_ROL_END"));
    }

    public void fillRMSRateCalculationsHS(Map<String, String> data) {
        verifyTotalInsuredValueSystem(data.get("RMS_Rate_Calculations_Total_Insured_Value_System"));
        verifyTotalInsuredValueModification(data.get("RMS_Rate_Calculations_Total_Insured_Value_Modification"));
        verifyTotalInsuredValueFinal(data.get("RMS_Rate_Calculations_Total_Insured_Value_Final"));
        verifyTotalInsuredValueROL(data.get("RMS_Rate_Calculations_Total_Insured_Value_ROL"));
        verifyWindPremiumToCombinedAALRatioUnadjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_System"));
        verifyWindPremiumToCombinedAALRatioUnadjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Modification"));
        verifyWindPremiumToCombinedAALRatioUnadjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Final"));
        verifyWindPremiumToCombinedAALRatioUnadjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_ROL"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_System"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Modification"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Final"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_ROL"));
        verifyWindPremiumSystem(data.get("RMS_Rate_Calculations_Wind_Premium_System"));
        verifyWindPremiumModification(data.get("RMS_Rate_Calculations_Wind_Premium_Modification"));
        verifyWindPremiumFinal(data.get("RMS_Rate_Calculations_Wind_Premium_Final"));
        verifyWindPremiumROL(data.get("RMS_Rate_Calculations_Wind_Premium_ROL"));
        verifyNonWindPremiumSystem(data.get("RMS_Rate_Calculations_Non_Wind_Premium_System"));
        verifyNonWindPremiumModification(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Modification"));
        verifyNonWindPremiumFinal(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Final"));
        verifyNonWindPremiumROL(data.get("RMS_Rate_Calculations_Non_Wind_Premium_ROL"));
        verifyWildfirePremiumSystem(data.get("RMS_Rate_Calculations_Wildfire_Premium_System"));
        verifyWildfirePremiumModification(data.get("RMS_Rate_Calculations_Wildfire_Premium_Modification"));
        verifyWildfirePremiumFinal(data.get("RMS_Rate_Calculations_Wildfire_Premium_Final"));
        verifyWildfirePremiumROL(data.get("RMS_Rate_Calculations_Wildfire_Premium_ROL"));
        verifyBaseLocationPremiumSystem(data.get("RMS_Rate_Calculations_Base_Location_Premium_System"));
        verifyBaseLocationPremiumModification(data.get("RMS_Rate_Calculations_Base_Location_Premium_Modification"));
        verifyBaseLocationPremiumFinal(data.get("RMS_Rate_Calculations_Base_Location_Premium_Final"));
        verifyBaseLocationPremiumROL(data.get("RMS_Rate_Calculations_Base_Location_Premium_ROL"));
        verifyLiabilityPremiumSystem(data.get("RMS_Rate_Calculations_Liability_Premium_System"));
        verifyLiabilityPremiumModification(data.get("RMS_Rate_Calculations_Liability_Premium_Modification"));
        verifyLiabilityPremiumFinal(data.get("RMS_Rate_Calculations_Liability_Premium_Final"));
        verifyLiabilityPremiumROL(data.get("RMS_Rate_Calculations_Liability_Premium_ROL"));
        verifyOptionalCoveragesPremiumSystem(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_System"));
        verifyOptionalCoveragesPremiumModification(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Modification"));
        verifyOptionalCoveragesPremiumFinal(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Final"));
        verifyOptionalCoveragesPremiumROL(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_ROL"));
        verifyCollectionPremiumModificationsSystem(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_System"));
        verifyCollectionPremiumModificationsModification(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Modification"));
        verifyCollectionPremiumModificationsFinal(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Final"));
        verifyCollectionPremiumModificationsROL(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_ROL"));
        verifyTotalPremiumSystem(data.get("RMS_Rate_Calculations_Total_Premium_System"));
        verifyTotalPremiumModification(data.get("RMS_Rate_Calculations_Total_Premium_Modification"));
        verifyTotalPremiumFinal(data.get("RMS_Rate_Calculations_Total_Premium_Final"));
        verifyTotalPremiumROL(data.get("RMS_Rate_Calculations_Total_Premium_ROL"));
    }

    public void fillRMSRateCalculationsHS_END(Map<String, String> data) {
        verifyTotalInsuredValueSystem(data.get("RMS_Rate_Calculations_Total_Insured_Value_System_END"));
        verifyTotalInsuredValueModification(data.get("RMS_Rate_Calculations_Total_Insured_Value_Modification_END"));
        verifyTotalInsuredValueFinal(data.get("RMS_Rate_Calculations_Total_Insured_Value_Final_END"));
        verifyTotalInsuredValueROL(data.get("RMS_Rate_Calculations_Total_Insured_Value_ROL_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_System_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Modification_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Final_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_ROL_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_System_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Modification_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Final_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_ROL_END"));
        verifyWindPremiumSystem(data.get("RMS_Rate_Calculations_Wind_Premium_System_END"));
        verifyWindPremiumModification(data.get("RMS_Rate_Calculations_Wind_Premium_Modification_END"));
        verifyWindPremiumFinal(data.get("RMS_Rate_Calculations_Wind_Premium_Final_END"));
        verifyWindPremiumROL(data.get("RMS_Rate_Calculations_Wind_Premium_ROL_END"));
        verifyNonWindPremiumSystem(data.get("RMS_Rate_Calculations_Non_Wind_Premium_System_END"));
        verifyNonWindPremiumModification(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Modification_END"));
        verifyNonWindPremiumFinal(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Final_END"));
        verifyNonWindPremiumROL(data.get("RMS_Rate_Calculations_Non_Wind_Premium_ROL_END"));
        verifyWildfirePremiumSystem(data.get("RMS_Rate_Calculations_Wildfire_Premium_System_END"));
        verifyWildfirePremiumModification(data.get("RMS_Rate_Calculations_Wildfire_Premium_Modification_END"));
        verifyWildfirePremiumFinal(data.get("RMS_Rate_Calculations_Wildfire_Premium_Final_END"));
        verifyWildfirePremiumROL(data.get("RMS_Rate_Calculations_Wildfire_Premium_ROL_END"));
        verifyBaseLocationPremiumSystem(data.get("RMS_Rate_Calculations_Base_Location_Premium_System_END"));
        verifyBaseLocationPremiumModification(data.get("RMS_Rate_Calculations_Base_Location_Premium_Modification_END"));
        verifyBaseLocationPremiumFinal(data.get("RMS_Rate_Calculations_Base_Location_Premium_Final_END"));
        verifyBaseLocationPremiumROL(data.get("RMS_Rate_Calculations_Base_Location_Premium_ROL_END"));
        verifyLiabilityPremiumSystem(data.get("RMS_Rate_Calculations_Liability_Premium_System_END"));
        verifyLiabilityPremiumModification(data.get("RMS_Rate_Calculations_Liability_Premium_Modification_END"));
        verifyLiabilityPremiumFinal(data.get("RMS_Rate_Calculations_Liability_Premium_Final_END"));
        verifyLiabilityPremiumROL(data.get("RMS_Rate_Calculations_Liability_Premium_ROL_END"));
        verifyOptionalCoveragesPremiumSystem(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_System_END"));
        verifyOptionalCoveragesPremiumModification(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Modification_END"));
        verifyOptionalCoveragesPremiumFinal(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Final_END"));
        verifyOptionalCoveragesPremiumROL(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_ROL_END"));
        verifyCollectionPremiumModificationsSystem(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_System_END"));
        verifyCollectionPremiumModificationsModification(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Modification_END"));
        verifyCollectionPremiumModificationsFinal(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Final_END"));
        verifyCollectionPremiumModificationsROL(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_ROL_END"));
        verifyTotalPremiumSystem(data.get("RMS_Rate_Calculations_Total_Premium_System_END"));
        verifyTotalPremiumModification(data.get("RMS_Rate_Calculations_Total_Premium_Modification_END"));
        verifyTotalPremiumFinal(data.get("RMS_Rate_Calculations_Total_Premium_Final_END"));
        verifyTotalPremiumROL(data.get("RMS_Rate_Calculations_Total_Premium_ROL_END"));
    }

    public void fillRMSRateCalculationsHS_OOS_END(Map<String, String> data) {
        verifyTotalInsuredValueSystem(data.get("RMS_Rate_Calculations_Total_Insured_Value_System_OOS_END"));
        verifyTotalInsuredValueModification(data.get("RMS_Rate_Calculations_Total_Insured_Value_Modification_OOS_END"));
        verifyTotalInsuredValueFinal(data.get("RMS_Rate_Calculations_Total_Insured_Value_Final_OOS_END"));
        verifyTotalInsuredValueROL(data.get("RMS_Rate_Calculations_Total_Insured_Value_ROL_OOS_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_System_OOS_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Modification_OOS_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Final_OOS_END"));
        verifyWindPremiumToCombinedAALRatioUnadjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_ROL_OOS_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_System_OOS_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Modification_OOS_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Final_OOS_END"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_ROL_OOS_END"));
        verifyWindPremiumSystem(data.get("RMS_Rate_Calculations_Wind_Premium_System_OOS_END"));
        verifyWindPremiumModification(data.get("RMS_Rate_Calculations_Wind_Premium_Modification_OOS_END"));
        verifyWindPremiumFinal(data.get("RMS_Rate_Calculations_Wind_Premium_Final_OOS_END"));
        verifyWindPremiumROL(data.get("RMS_Rate_Calculations_Wind_Premium_ROL_OOS_END"));
        verifyNonWindPremiumSystem(data.get("RMS_Rate_Calculations_Non_Wind_Premium_System_OOS_END"));
        verifyNonWindPremiumModification(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Modification_OOS_END"));
        verifyNonWindPremiumFinal(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Final_OOS_END"));
        verifyNonWindPremiumROL(data.get("RMS_Rate_Calculations_Non_Wind_Premium_ROL_OOS_END"));
        verifyWildfirePremiumSystem(data.get("RMS_Rate_Calculations_Wildfire_Premium_System_OOS_END"));
        verifyWildfirePremiumModification(data.get("RMS_Rate_Calculations_Wildfire_Premium_Modification_OOS_END"));
        verifyWildfirePremiumFinal(data.get("RMS_Rate_Calculations_Wildfire_Premium_Final_OOS_END"));
        verifyWildfirePremiumROL(data.get("RMS_Rate_Calculations_Wildfire_Premium_ROL_OOS_END"));
        verifyBaseLocationPremiumSystem(data.get("RMS_Rate_Calculations_Base_Location_Premium_System_OOS_END"));
        verifyBaseLocationPremiumModification(data.get("RMS_Rate_Calculations_Base_Location_Premium_Modification_OOS_END"));
        verifyBaseLocationPremiumFinal(data.get("RMS_Rate_Calculations_Base_Location_Premium_Final_OOS_END"));
        verifyBaseLocationPremiumROL(data.get("RMS_Rate_Calculations_Base_Location_Premium_ROL_OOS_END"));
        verifyLiabilityPremiumSystem(data.get("RMS_Rate_Calculations_Liability_Premium_System_OOS_END"));
        verifyLiabilityPremiumModification(data.get("RMS_Rate_Calculations_Liability_Premium_Modification_OOS_END"));
        verifyLiabilityPremiumFinal(data.get("RMS_Rate_Calculations_Liability_Premium_Final_OOS_END"));
        verifyLiabilityPremiumROL(data.get("RMS_Rate_Calculations_Liability_Premium_ROL_OOS_END"));
        verifyOptionalCoveragesPremiumSystem(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_System_OOS_END"));
        verifyOptionalCoveragesPremiumModification(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Modification_OOS_END"));
        verifyOptionalCoveragesPremiumFinal(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Final_OOS_END"));
        verifyOptionalCoveragesPremiumROL(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_ROL_OOS_END"));
        verifyCollectionPremiumModificationsSystem(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_System_OOS_END"));
        verifyCollectionPremiumModificationsModification(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Modification_OOS_END"));
        verifyCollectionPremiumModificationsFinal(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Final_OOS_END"));
        verifyCollectionPremiumModificationsROL(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_ROL_OOS_END"));
        verifyTotalPremiumSystem(data.get("RMS_Rate_Calculations_Total_Premium_System_OOS_END"));
        verifyTotalPremiumModification(data.get("RMS_Rate_Calculations_Total_Premium_Modification_OOS_END"));
        verifyTotalPremiumFinal(data.get("RMS_Rate_Calculations_Total_Premium_Final_OOS_END"));
        verifyTotalPremiumROL(data.get("RMS_Rate_Calculations_Total_Premium_ROL_OOS_END"));
    }

    public void fillRMSRateCalculationsHS_RNW(Map<String, String> data) {
        verifyTotalInsuredValueSystem(data.get("RMS_Rate_Calculations_Total_Insured_Value_System_RNW"));
        verifyTotalInsuredValueModification(data.get("RMS_Rate_Calculations_Total_Insured_Value_Modification_RNW"));
        verifyTotalInsuredValueFinal(data.get("RMS_Rate_Calculations_Total_Insured_Value_Final_RNW"));
        verifyTotalInsuredValueROL(data.get("RMS_Rate_Calculations_Total_Insured_Value_ROL_RNW"));
        verifyWindPremiumToCombinedAALRatioUnadjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_System_RNW"));
        verifyWindPremiumToCombinedAALRatioUnadjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Modification_RNW"));
        verifyWindPremiumToCombinedAALRatioUnadjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_Final_RNW"));
        verifyWindPremiumToCombinedAALRatioUnadjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_Unadjusted_ROL_RNW"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_System_RNW"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedModification(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Modification_RNW"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_Final_RNW"));
        verifyWindPremiumToCombinedAALRatioFRAdjustedROL(data.get("RMS_Rate_Calculations_Wind_Premium_To_Combined_AAL_Ratio_FR_Adjusted_ROL_RNW"));
        verifyWindPremiumSystem(data.get("RMS_Rate_Calculations_Wind_Premium_System_RNW"));
        verifyWindPremiumModification(data.get("RMS_Rate_Calculations_Wind_Premium_Modification_RNW"));
        verifyWindPremiumFinal(data.get("RMS_Rate_Calculations_Wind_Premium_Final_RNW"));
        verifyWindPremiumROL(data.get("RMS_Rate_Calculations_Wind_Premium_ROL_RNW"));
        verifyNonWindPremiumSystem(data.get("RMS_Rate_Calculations_Non_Wind_Premium_System_RNW"));
        verifyNonWindPremiumModification(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Modification_RNW"));
        verifyNonWindPremiumFinal(data.get("RMS_Rate_Calculations_Non_Wind_Premium_Final_RNW"));
        verifyNonWindPremiumROL(data.get("RMS_Rate_Calculations_Non_Wind_Premium_ROL_RNW"));
        verifyWildfirePremiumSystem(data.get("RMS_Rate_Calculations_Wildfire_Premium_System_RNW"));
        verifyWildfirePremiumModification(data.get("RMS_Rate_Calculations_Wildfire_Premium_Modification_RNW"));
        verifyWildfirePremiumFinal(data.get("RMS_Rate_Calculations_Wildfire_Premium_Final_RNW"));
        verifyWildfirePremiumROL(data.get("RMS_Rate_Calculations_Wildfire_Premium_ROL_RNW"));
        verifyBaseLocationPremiumSystem(data.get("RMS_Rate_Calculations_Base_Location_Premium_System_RNW"));
        verifyBaseLocationPremiumModification(data.get("RMS_Rate_Calculations_Base_Location_Premium_Modification_RNW"));
        verifyBaseLocationPremiumFinal(data.get("RMS_Rate_Calculations_Base_Location_Premium_Final_RNW"));
        verifyBaseLocationPremiumROL(data.get("RMS_Rate_Calculations_Base_Location_Premium_ROL_RNW"));
        verifyLiabilityPremiumSystem(data.get("RMS_Rate_Calculations_Liability_Premium_System_RNW"));
        verifyLiabilityPremiumModification(data.get("RMS_Rate_Calculations_Liability_Premium_Modification_RNW"));
        verifyLiabilityPremiumFinal(data.get("RMS_Rate_Calculations_Liability_Premium_Final_RNW"));
        verifyLiabilityPremiumROL(data.get("RMS_Rate_Calculations_Liability_Premium_ROL_RNW"));
        verifyOptionalCoveragesPremiumSystem(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_System_RNW"));
        verifyOptionalCoveragesPremiumModification(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Modification_RNW"));
        verifyOptionalCoveragesPremiumFinal(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_Final_RNW"));
        verifyOptionalCoveragesPremiumROL(data.get("RMS_Rate_Calculations_Optional_Coverages_Premium_ROL_RNW"));
        verifyCollectionPremiumModificationsSystem(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_System_RNW"));
        verifyCollectionPremiumModificationsModification(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Modification_RNW"));
        verifyCollectionPremiumModificationsFinal(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_Final_RNW"));
        verifyCollectionPremiumModificationsROL(data.get("RMS_Rate_Calculations_Collection_Premium_Modifications_ROL_RNW"));
        verifyTotalPremiumSystem(data.get("RMS_Rate_Calculations_Total_Premium_System_RNW"));
        verifyTotalPremiumModification(data.get("RMS_Rate_Calculations_Total_Premium_Modification_RNW"));
        verifyTotalPremiumFinal(data.get("RMS_Rate_Calculations_Total_Premium_Final_RNW"));
        verifyTotalPremiumROL(data.get("RMS_Rate_Calculations_Total_Premium_ROL_RNW"));
    }

    public void verifyTotalInsuredValueSystem(String value) {
        if (hasValue(value))
            assertEquals(totalInsuredValueSystem.getText(), value, "Total Insured Value System");
    }

    public void verifyTotalInsuredValueModification(String value) {
        if (hasValue(value))
            assertEquals(totalInsuredValueModification.getText(), value, "Total Insured Value Modification");
    }

    public void verifyTotalInsuredValueFinal(String value) {
        if (hasValue(value))
            assertEquals(totalInsuredValueFinal.getText(), value, "Total Insured Value Final");
    }

    public void verifyTotalInsuredValueROL(String value) {
        if (hasValue(value))
            assertEquals(totalInsuredValueROL.getText(), value, "Total Insured Value ROL");
    }

    public void verifyWindPremiumToCombinedAALRatioUnadjustedSystem(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioUnadjustedSystem.getText(), value, "Wind Premium To Combined AAL Ratio Unadjusted System");
    }

    public void verifyWindPremiumToCombinedAALRatioUnadjustedModification(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioUnadjustedModification.getText(), value, "Wind Premium To Combined AAL Ratio Unadjusted Modification");
    }

    public void verifyWindPremiumToCombinedAALRatioUnadjustedFinal(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioUnadjustedFinal.getText(), value, "Wind Premium To Combined AAL Ratio Unadjusted Final");
    }

    public void verifyWindPremiumToCombinedAALRatioUnadjustedROL(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioUnadjustedROL.getText(), value, "Wind Premium To Combined AAL Ratio Unadjusted ROL");
    }

    public void verifyWindPremiumToCombinedAALRatioFRAdjustedSystem(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioFRAdjustedSystem.getText(), value, "Wind Premium To Combined AAL Ratio FR Adjusted System");
    }

    public void verifyWindPremiumToCombinedAALRatioFRAdjustedModification(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioFRAdjustedModification.getText(), value, "Wind Premium To Combined AAL Ratio FR Adjusted Modification");
    }

    public void verifyWindPremiumToCombinedAALRatioFRAdjustedFinal(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioFRAdjustedFinal.getText(), value, "Wind Premium To Combined AAL Ratio FR Adjusted Final");
    }

    public void verifyWindPremiumToCombinedAALRatioFRAdjustedROL(String value) {
        if (hasValue(value))
            assertEquals(windPremiumToCombinedAALRatioFRAdjustedROL.getText(), value, "Wind Premium To Combined AAL Ratio FR Adjusted ROL");
    }

    public void verifyWindPremiumSystem(String value) {
        if (hasValue(value))
            assertEquals(windPremiumSystem.getText(), value, "Wind Premium System");
    }

    public void verifyWindPremiumModification(String value) {
        if (hasValue(value))
            assertEquals(windPremiumModification.getText(), value, "Wind Premium Modification");
    }

    public void verifyWindPremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(windPremiumFinal.getText(), value, "Wind Premium Final");
    }

    public void verifyWindPremiumROL(String value) {
        if (hasValue(value))
            assertEquals(windPremiumROL.getText(), value, "Wind Premium ROL");
    }

    public void verifyNonWindPremiumSystem(String value) {
        if (hasValue(value))
            assertEquals(nonWindPremiumSystem.getText(), value, "Non Wind Premium System");
    }

    public void verifyNonWindPremiumModification(String value) {
        if (hasValue(value))
            assertEquals(nonWindPremiumModification.getText(), value, "Non Wind Premium Modification");
    }

    public void verifyNonWindPremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(nonWindPremiumFinal.getText(), value, "Non Wind Premium Final");
    }

    public void verifyNonWindPremiumROL(String value) {
        if (hasValue(value))
            assertEquals(nonWindPremiumROL.getText(), value, "Non Wind Premium ROL");
    }

    public void verifyWildfirePremiumSystem(String value) {
        if (hasValue(value))
            assertEquals(wildfirePremiumSystem.getText(), value, "Wildfire Premium System");
    }

    public void verifyWildfirePremiumModification(String value) {
        if (hasValue(value))
            assertEquals(wildfirePremiumModification.getText(), value, "Wildfire Premium Modification");
    }

    public void verifyWildfirePremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(wildfirePremiumFinal.getText(), value, "Wildfire Premium Final");
    }

    public void verifyWildfirePremiumFinal() {
        Assert.assertTrue(hasValue(wildfirePremiumFinal.getText()), "Wildfire Premium Final");
        reportScreenshot("Wildfire premium", "Wildfire premium");
    }

    public void verifyWildfirePremiumROL(String value) {
        if (hasValue(value))
            assertEquals(wildfirePremiumROL.getText(), value, "Wildfire Premium ROL");
    }

    public void verifyBaseLocationPremiumSystem(String value) {
        if (hasValue(value))
            assertEquals(baseLocationPremiumSystem.getText(), value, "Base Location Premium System");
    }

    public void verifyBaseLocationPremiumModification(String value) {
        if (hasValue(value))
            assertEquals(baseLocationPremiumModification.getText(), value, "Base Location Premium Modification");
    }

    public void verifyBaseLocationPremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(baseLocationPremiumFinal.getText(), value, "Base Location Premium Final");
    }

    public void verifyBaseLocationPremiumROL(String value) {
        if (hasValue(value))
            assertEquals(baseLocationPremiumROL.getText(), value, "Base Location Premium ROL");
    }

    public void verifyLiabilityPremiumSystem(String value) {
        if (hasValue(value))
            assertEquals(liabilityPremiumSystem.getText(), value, "Liability Premium System");
    }

    public void verifyLiabilityPremiumModification(String value) {
        if (hasValue(value))
            assertEquals(liabilityPremiumModification.getText(), value, "Liability Premium Modification");
    }

    public void verifyLiabilityPremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(liabilityPremiumFinal.getText(), value, "Liability Premium Final");
    }

    public void verifyLiabilityPremiumROL(String value) {
        if (hasValue(value))
            assertEquals(liabilityPremiumROL.getText(), value, "Liability Premium ROL");
    }

    public void verifyOptionalCoveragesPremiumSystem(String value) {
        if (hasValue(value))
            assertEquals(optionalCoveragesPremiumSystem.getText(), value, "Optional Coverages Premium System");
    }

    public void verifyOptionalCoveragesPremiumModification(String value) {
        if (hasValue(value))
            assertEquals(optionalCoveragesPremiumModification.getText(), value, "Optional Coverages Premium Modification");
    }

    public void verifyOptionalCoveragesPremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(optionalCoveragesPremiumFinal.getText(), value, "Optional Coverages Premium Final");
    }

    public void verifyOptionalCoveragesPremiumROL(String value) {
        if (hasValue(value))
            assertEquals(optionalCoveragesPremiumROL.getText(), value, "Optional Coverages Premium ROL");
    }

    public void verifyCollectionPremiumModificationsSystem(String value) {
        if (hasValue(value))
            assertEquals(collectionPremiumModificationsSystem.getText(), value, "Collection Premium Modifications System");
    }

    public void verifyCollectionPremiumModificationsModification(String value) {
        if (hasValue(value))
            assertEquals(collectionPremiumModificationsModification.getText(), value, "Collection Premium Modifications Modification");
    }

    public void verifyCollectionPremiumModificationsFinal(String value) {
        if (hasValue(value))
            assertEquals(collectionPremiumModificationsFinal.getText(), value, "Collection Premium Modifications Final");
    }

    public void verifyCollectionPremiumModificationsROL(String value) {
        if (hasValue(value))
            assertEquals(collectionPremiumModificationsROL.getText(), value, "Collection Premium Modifications ROL");
    }

    public void verifyTotalPremiumSystem(String value) {
        if (hasValue(value))
            assertEquals(totalPremiumSystem.getText(), value, "Total Premium System");
    }

    public void verifyTotalPremiumModification(String value) {
        if (hasValue(value))
            assertEquals(totalPremiumModification.getText(), value, "Total Premium Modification");
    }

    public void verifyTotalPremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(totalPremiumFinal.getText(), value, "Total Premium Final");
    }

    public void verifyTotalPremiumROL(String value) {
        if (hasValue(value))
            assertEquals(totalPremiumROL.getText(), value, "Total Premium ROL");
    }

    public void verifyTotalPremiumROLLabel(String value) {
        if (hasValue(value))
            assertEquals(totalPremiumROLLabel.getText(), value, "Total Premium ROL Label");
    }

    public void verifyManuscriptEndorsementPremiumFinal(String value) {
        if (hasValue(value))
            assertEquals(manuscriptEndorsementPremiumTotal.getText(), value, "Manuscript Endorsement Premium");
    }

    public void verifyBlockExists(String state) throws Throwable {
        if (!state.equalsIgnoreCase("HI"))
            super.verifyBlockExists("rate calculations");
    }

}