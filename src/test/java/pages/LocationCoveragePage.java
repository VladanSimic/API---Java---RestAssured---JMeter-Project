package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class LocationCoveragePage extends CommonComponentsAndActions {
    WebDriver driver;

    HomeRatingCharacteristicsAvailableForPrefilBlock homeRatingCharacteristicsAvailableForPrefilBlock;
    //    LocationCoveragesBlock locationCoveragesBlock;
    ProjectAddressBlock projectDetailsBlock;
    GeoLocationDetailsBlock geoLocationDetailsBlock;
    UsageBlock usageBlock;
    MortgageeInformationBlock mortgageeInformationBlock;
    ConstructionDetailsBlock constructionDetailsBlock;
    RiskCharacteristicsUsedInRiskModelBlock riskCharacteristicsUsedInRiskModelBlock;
    WindMitigationBlock windMitigationBlock;
    ProtectionBlock protectionBlock;
    FloodInformationBlock floodInformationBlock;
    ExcessFloodBlock excessFloodBlock;
    ElevationCertificateBlock elevationCertificateBlock;
    StormSurgeBlock stormSurgeBlock;
    WindPoolBlock windPoolBlock;
    SinkholeBlock sinkholeBlock;
    RoofCharacteristicBlock roofCharacteristicBlock;
    LocationDetailsBlock locationDetailsBlock;
    ProjectDetailsAndDeductiblesBlock projectDetailsAndDeductiblesBlock;
    ContractTermsBlock contractTermsBlock;
    ConstructionProtectionCreditsAndSafeguardsBlock constructionProtectionCreditsAndSafeguardsBlock;
    OptionalCoverageExcessFloodBlock optionalCoverageExcessFloodBlock;
    MunicipalityTaxReportBlock municipalityTaxReportBlock;

    public LocationCoveragePage(WebDriver driver) {
        super(driver);
        this.driver = driver;

//        locationCoveragesBlock = new LocationCoveragesBlock(driver);
        projectDetailsBlock = new ProjectAddressBlock(driver);
        geoLocationDetailsBlock = new GeoLocationDetailsBlock(driver);
        usageBlock = new UsageBlock(driver);
        mortgageeInformationBlock = new MortgageeInformationBlock(driver);
        constructionDetailsBlock = new ConstructionDetailsBlock(driver);
        riskCharacteristicsUsedInRiskModelBlock = new RiskCharacteristicsUsedInRiskModelBlock(driver);
        windMitigationBlock = new WindMitigationBlock(driver);
        protectionBlock = new ProtectionBlock(driver);
        floodInformationBlock = new FloodInformationBlock(driver);
        excessFloodBlock = new ExcessFloodBlock(driver);
        optionalCoverageExcessFloodBlock = new OptionalCoverageExcessFloodBlock(driver);
        elevationCertificateBlock = new ElevationCertificateBlock(driver);
        stormSurgeBlock = new StormSurgeBlock(driver);
        windPoolBlock = new WindPoolBlock(driver);
        roofCharacteristicBlock = new RoofCharacteristicBlock(driver);
        homeRatingCharacteristicsAvailableForPrefilBlock = new HomeRatingCharacteristicsAvailableForPrefilBlock(driver);
        locationDetailsBlock = new LocationDetailsBlock(driver);
        projectDetailsAndDeductiblesBlock = new ProjectDetailsAndDeductiblesBlock(driver);
        contractTermsBlock = new ContractTermsBlock(driver);
        constructionProtectionCreditsAndSafeguardsBlock = new ConstructionProtectionCreditsAndSafeguardsBlock(driver);
        sinkholeBlock = new SinkholeBlock(driver);
        municipalityTaxReportBlock = new MunicipalityTaxReportBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()=\"TIV\"]/../../../../div/div")
    public WebElement TIV;

    By informationShownPrefillNo = By.xpath("//div[contains(text(),'information shown above')]/../../../../div//label[text()='No']/..//input");
    By informationShownPrefillYes = By.xpath("//div[contains(text(),'information shown above')]/../../../../div//label[text()='Yes']/..//input");
    //TODO USE PAGE FACTORY AND MOVE TO BLOCK^^^

    public void fillBasicLocationCoverageDetailsPage(Map<String, String> data) throws Throwable {
        goToPage(data.get("City_Name_Txt") + " " + data.get("State"));

        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "MD":
                    case "MS":
                    case "AL":
                    case "LA":
                    case "DE":
                    case "HI":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "NY":
                    case "TX": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "PA":
                    case "RI":
                    case "VA": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WY":
                    case "ME":
                    case "AZ":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "MI": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO(data);
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "NJ":
                    case "CT":
                    case "MA":
                    case "GA": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "WI": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "AR":
                    case "NC": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "MD":
                    case "HI":
                    case "LA":
                    case "FL":
                    case "TX":
                    case "SC": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "RI": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "IL":
                    case "CO":
                    case "CT":
                    case "GA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "NJ": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "MA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State")) {
                    case "MD":
                    case "HI":
                    case "FL":
                    case "SC":
                    case "DC":
                    case "DE": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "RI":
                    case "VA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "TX":
                    case "AK":
                    case "NY":
                    case "LA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "AR": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "PA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    case "IL":
                    case "CO":
                    case "GA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "NJ":
                    case "CT":
                    case "MA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                }
            }
            break;
        }
    }

    public void fillBasicLocationCoverageDetailsPageTemp(Map<String, String> data, String city, String state, int i) throws Throwable {
        goToPage(city + " " + state, i);
        orderPropertyDetails();

        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "MD":
                    case "MS":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "TX":
                    case "GA": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "RI":
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WY":
                    case "ME":
                    case "AZ":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "MI": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO(data);
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "WI": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "AR":
                    case "NC": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "MD":
                    case "HI":
                    case "LA":
                    case "FL":
                    case "TX":
                    case "SC":
                    case "MA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "RI": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    case "ID": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO(data);
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State")) {
                    case "MD":
                    case "HI":
                    case "FL":
                    case "SC":
                    case "DC":
                    case "CT":
                    case "DE":
                    case "NJ": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "RI":
                    case "VA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }

                    }
                    break;
                    case "TX":
                    case "MA":
                    case "AK":
                    case "NY":
                    case "LA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "AR": {
                        usageBlock.fillUsageDetails(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                    break;
                    case "PA": {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        windMitigationBlock.fillBasicWindMitigationDetails(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO(data);
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails(data);
                        constructionDetailsBlock.fillBasicConstructionDetails(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics(data);
                        protectionBlock.fillOutBasicProtectionDetails(data);
                        floodInformationBlock.fillOutFloodInformationDetails(data);
                    }
                }
            }
            break;
        }
    }

    public void fillBasicLocationCoverageDetailsPage_END(Map<String, String> data) throws Throwable {
        goToPage(data.get("City_Name_Txt_END") + " " + data.get("State_END"));

        switch (data.get("Residence_Type_END")) {
            case "Homeowner": {
                switch (data.get("State_END")) {
                    case "AK":
                    case "MD":
                    case "MS":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "TX":
                    case "GA": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "RI":
                    case "VA":
                    case "PA": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WY":
                    case "ME":
                    case "AZ":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "MI": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_END(data);
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    break;
                    case "WI": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_END")) {
                    case "AR":
                    case "NC": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "MD":
                    case "HI":
                    case "LA":
                    case "FL":
                    case "TX":
                    case "SC":
                    case "MA": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "RI": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_END(data);
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    break;
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_END")) {
                    case "MD":
                    case "HI":
                    case "FL":
                    case "SC":
                    case "DC":
                    case "CT":
                    case "DE":
                    case "NJ": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "RI":
                    case "VA": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    break;
                    case "TX":
                    case "MA":
                    case "AK":
                    case "NY":
                    case "LA": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "AR": {
                        usageBlock.fillUsageDetails_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                    break;
                    case "PA": {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_END(data);
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        if (!isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_END(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_END(data);
                    }
                }
            }
            break;
        }
    }

    public void fillBasicLocationCoverageDetailsPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage(data.get("City_Name_Txt_OOS_END") + " " + data.get("State_OOS_END"));

        switch (data.get("Residence_Type_OOS_END")) {
            case "Homeowner": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "MD":
                    case "MS":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "TX":
                    case "GA": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "RI":
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WY":
                    case "ME":
                    case "AZ":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "MI": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_OOS_END(data);
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    break;
                    case "WI": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_OOS_END")) {
                    case "AR":
                    case "NC": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "MD":
                    case "HI":
                    case "LA":
                    case "FL":
                    case "TX":
                    case "SC":
                    case "MA": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "RI": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_OOS_END(data);
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    break;
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_OOS_END")) {
                    case "MD":
                    case "HI":
                    case "FL":
                    case "SC":
                    case "DC":
                    case "CT":
                    case "DE":
                    case "NJ": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "RI":
                    case "VA": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    break;
                    case "TX":
                    case "MA":
                    case "AK":
                    case "NY":
                    case "LA": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "AR": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_OOS_END"));
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                    break;
                    case "PA": {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_OOS_END(data);
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        if (!isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails_OOS_END(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_OOS_END(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_OOS_END(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_OOS_END(data);
                        protectionBlock.fillOutBasicProtectionDetails_OOS_END(data);
                        floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                    }
                }
            }
            break;
        }
    }

    public void fillBasicLocationCoverageDetailsPage_RNW(Map<String, String> data) throws Throwable {
        goToPage(data.get("City_Name_Txt_RNW") + " " + data.get("State_RNW"));

        switch (data.get("Residence_Type_RNW")) {
            case "Homeowner": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "MD":
                    case "MS":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                    case "TX":
                    case "GA": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "RI":
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WY":
                    case "ME":
                    case "AZ":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "MI": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_RNW(data);
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    break;
                    case "WI": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op": {
                switch (data.get("State_RNW")) {
                    case "AR":
                    case "NC": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "MD":
                    case "HI":
                    case "LA":
                    case "FL":
                    case "TX":
                    case "SC":
                    case "MA": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "RI": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    break;
                    case "ID": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "DC": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_RNW(data);
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    break;
                    case "PA":
                    case "VA": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    default: {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                }
            }
            break;
            case "Tenants": {
                switch (data.get("State_RNW")) {
                    case "MD":
                    case "HI":
                    case "FL":
                    case "SC":
                    case "DC":
                    case "CT":
                    case "DE":
                    case "NJ": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "RI":
                    case "VA": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    break;
                    case "TX":
                    case "MA":
                    case "AK":
                    case "NY":
                    case "LA": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "AR": {
                        usageBlock.fillUsageDetails_RNW(data);
                        mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_RNW"));
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                    break;
                    case "PA": {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        windMitigationBlock.fillBasicWindMitigationDetails_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate2(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    case "IL":
                    case "CO": {
                        geoLocationDetailsBlock.fillGeoLocationDetailsHO_RNW(data);
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                        }
                    }
                    break;
                    default: {
                        usageBlock.fillUsageDetails_RNW(data);
                        constructionDetailsBlock.fillBasicConstructionDetails_RNW(data);
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO_RNW(data);
                        roofCharacteristicBlock.fillInRoofCharacteristics_RNW(data);
                        protectionBlock.fillOutBasicProtectionDetails_RNW(data);
                        floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                    }
                }
            }
            break;
        }
    }

    public void fillBasicLocationCoverageDetailsPage(Map<String, String> data, int i) throws Throwable {
        pause(5000);
        if (isVisibleOnly(informationShownPrefillNo)) {
            setInformationPrefill("No");
        }
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                        switch (data.get("State_" + i)) {
                            case "AK":
                            case "MD":
                            case "MS":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "NC":
                            case "SC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "TX":
                            case "GA":
                            case "MI": {
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_" + i));
                                pause(6000);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                pause(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "RI":
                            case "PA":
                            case "VA": {
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_" + i));
                                pause(6000);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                pause(6000);
                                if (!isFloodDate2(data.get("Effective_Date"))) {
                                    floodInformationBlock.fillOutFloodInformationDetails(data, i);
                                }
                            }
                            break;
                            case "DC": {
                                homeRatingCharacteristicsAvailableForPrefilBlock.setAvailableForPrefill(data, i);
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_" + i));
                                pause(6000);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                pause(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WY":
                            case "ME":
                            case "AZ":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "TN":
                            case "WA":
                            case "CA": {
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_" + i));
                                pause(6000);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                pause(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "IL":
                            case "CO": {
                                geoLocationDetailsBlock.fillGeoLocationDetailsHO(data, i);
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_" + i));
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlock(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                if (!isFloodDate1(data.get("Effective_Date"))) {
                                    floodInformationBlock.fillOutFloodInformationDetails(data, i);
                                }
                            }
                            break;
                            case "ID":
                            case "WI": {
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocationFont(data.get("Is_There_Mortgage_" + i));
                                pause(6000);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                pause(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "AR":
                            case "NC": {
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_" + i));
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "KS":
                            case "AZ":
                            case "DC":
                            case "IA":
                            case "KY":
                            case "AK":
                            case "IN":
                            case "NV":
                            case "MN":
                            case "OH":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "MO":
                            case "ND":
                            case "MT":
                            case "OK":
                            case "OR":
                            case "WA":
                            case "SD":
                            case "WI":
                            case "UT":
                            case "WV":
                            case "TN":
                            case "VT":
                            case "ME":
                            case "CT":
                            case "AL":
                            case "WY":
                            case "CA":
                            case "DE":
                            case "GA":
                            case "NJ":
                            case "MI":
                            case "MS":
                            case "ID":
                            case "NY": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "PA":
                            case "VA": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                if (!isFloodDate2(data.get("Effective_Date"))) {
                                    floodInformationBlock.fillOutFloodInformationDetails(data, i);
                                }
                            }
                            break;
                            case "MD":
                            case "HI":
                            case "LA":
                            case "FL":
                            case "TX":
                            case "SC":
                            case "MA": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "RI": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                if (!isFloodDate2(data.get("Effective_Date"))) {
                                    floodInformationBlock.fillOutFloodInformationDetails(data, i);
                                }
                            }
                            break;
                            case "IL":
                            case "CO": {
                                geoLocationDetailsBlock.fillGeoLocationDetailsHO(data, i);
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                if (!isFloodDate1(data.get("Effective_Date"))) {
                                    floodInformationBlock.fillOutFloodInformationDetails(data, i);
                                }
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AR":
                            case "NC": {
                                usageBlock.fillUsageDetails(data, i);
                                mortgageeInformationBlock.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage_" + i));
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                Thread.sleep(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "KS":
                            case "AZ":
                            case "IA":
                            case "KY":
                            case "IN":
                            case "NV":
                            case "MN":
                            case "OH":
                            case "NE":
                            case "NH":
                            case "NM":
                            case "MO":
                            case "ND":
                            case "MT":
                            case "OK":
                            case "OR":
                            case "WA":
                            case "SD":
                            case "WI":
                            case "UT":
                            case "WV":
                            case "TN":
                            case "VT":
                            case "ME":
                            case "AL":
                            case "WY":
                            case "CA":
                            case "GA":
                            case "MI":
                            case "MS":
                            case "ID": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                Thread.sleep(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "MD":
                            case "HI":
                            case "LA":
                            case "FL":
                            case "TX":
                            case "SC":
                            case "MA":
                            case "AK":
                            case "DC":
                            case "CT":
                            case "DE":
                            case "NJ":
                            case "NY": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                Thread.sleep(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "RI":
                            case "PA":
                            case "VA": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                Thread.sleep(6000);
                                if (!isFloodDate2(data.get("Effective_Date"))) {
                                    floodInformationBlock.fillOutFloodInformationDetails(data, i);
                                }
                            }
                            break;
                            case "IL":
                            case "CO": {
                                geoLocationDetailsBlock.fillGeoLocationDetailsHO(data, i);
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                riskCharacteristicsUsedInRiskModelBlock.fillRiskCharacteristicsBlockHO(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                if (!isFloodDate1(data.get("Effective_Date"))) {
                                    floodInformationBlock.fillOutFloodInformationDetails(data, i);
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "MD":
                            case "MS":
                            case "RI":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "FL":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "PA":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "DC":
                            case "AR":
                            case "IA":
                            case "ID":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WY":
                            case "ME":
                            case "AZ":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "CO":
                            case "TN":
                            case "WA": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "CA": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                roofCharacteristicBlock.fillInRoofCharacteristics(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "WI":
                        }
                    }
                    break;
                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "ID": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                Thread.sleep(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                            case "FL": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                Thread.sleep(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                        }
                    }
                    break;
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "AZ":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "NV":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "CA":
                            case "AL":
                            case "LA":
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "SC":
                            case "CT":
                            case "NY":
                            case "NJ":
                            case "ID":
                            case "FL": {
                                usageBlock.fillUsageDetails(data, i);
                                constructionDetailsBlock.fillBasicConstructionDetails(data, i);
                                windMitigationBlock.fillBasicWindMitigationDetails(data, i);
                                protectionBlock.fillOutBasicProtectionDetails(data, i);
                                Thread.sleep(6000);
                                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
        }
    }
    //TODO REFACTOR SPLIT BY LOB HO HS

    public void setInformationPrefill(String choose) throws Throwable {
        choose(driver.findElement(informationShownPrefillYes), driver.findElement(informationShownPrefillNo), choose);
    }

    public void fillBasicLocationCoverageDetailsPageCC(Map<String, String> data) throws Throwable {
        actionButtonNext();
        saveChanges();
        pause(6000);
        clickOrderPropertyDetails();
        projectDetailsBlock.fillProjectAddressCC(data);
        geoLocationDetailsBlock.fillGeoLocationDetailsCC(data);
        locationDetailsBlock.fillLocationDetailsCC(data);
        projectDetailsAndDeductiblesBlock.fillProjectDetailsAndDeductiblesCC(data);
        constructionDetailsBlock.fillConstructionDetailsCC(data);
        windMitigationBlock.fillBasicWindMitigationDetailsCC(data);
        contractTermsBlock.fillContractTermsDetailsCC(data);
        usageBlock.fillUsageDetailsCC(data);
        constructionProtectionCreditsAndSafeguardsBlock.fillConstructionProtectionCreditsAndSafeguardsBlockCC(data);
        floodInformationBlock.fillFloodInformationDetailsCC(data);
        sinkholeBlock.fillSinkholeDetailsCC(data);
        windPoolBlock.fillWindPoolDetailsCC(data);
        if (data.get("State").equalsIgnoreCase("SD") || data.get("State").equalsIgnoreCase("UT") || data.get("State").equalsIgnoreCase("IA")) {
            saveChanges();
            new LocationCoveragePage(driver).clickOrderPropertyDetails();
            saveChanges();
            locationDetailsBlock.setProtectionClass(data.get("Location_Details_Protection_Class"));
        }
        saveChanges();
    }

    public void fillBasicLocationCoverageDetailsPageCC_END(Map<String, String> data) throws Throwable {
        actionButtonNext();
        projectDetailsBlock.fillProjectAddressCC_END(data);
        geoLocationDetailsBlock.fillGeoLocationDetailsCC_END(data);
        locationDetailsBlock.fillLocationDetailsCC_END(data);
        projectDetailsAndDeductiblesBlock.fillProjectDetailsAndDeductiblesCC_END(data);
        constructionDetailsBlock.fillConstructionDetailsCC_END(data);
        windMitigationBlock.fillBasicWindMitigationDetailsCC_END(data);
        contractTermsBlock.fillContractTermsDetailsCC_END(data);
        usageBlock.fillUsageDetailsCC_END(data);
        constructionProtectionCreditsAndSafeguardsBlock.fillConstructionProtectionCreditsAndSafeguardsBlockCC_END(data);
        floodInformationBlock.fillFloodInformationDetailsCC_END(data);
        sinkholeBlock.fillSinkholeDetailsCC_END(data);
        windPoolBlock.fillWindPoolDetailsCC_END(data);
    }

    public void fillBasicLocationCoverageDetailsPageCC_EXT(Map<String, String> data) throws Throwable {
        actionButtonNext();
        constructionDetailsBlock.fillConstructionDetailsCC_EXT(data);
    }

    public void clickOrderPropertyDetails() throws InterruptedException {
        clickElement(orderPropertyDetails, "Order property details");
        pause(5000);
    }

    public void fillLocationCoveragePageHS(Map<String, String> data) throws Throwable {
        navigateToLocation(data);
        pause(500);
        saveChanges();
        clickOrderPropertyDetails();
        pause(8000);
        locationDetailsBlock.fillLocationDetailsHS(data);
        geoLocationDetailsBlock.fillGeoLocationDetailsHS(data);
        usageBlock.fillUsageDetailsHS(data);
        constructionDetailsBlock.fillBasicConstructionDetailsHS(data);
        if (data.get("State").equalsIgnoreCase("CA")) {
            roofCharacteristicBlock.fillInRoofCharacteristicsHS(data);
        } else {
            windMitigationBlock.fillBasicWindMitigationDetailsHS(data);
        }
        protectionBlock.fillOutBasicProtectionDetailsHS(data);
        floodInformationBlock.fillFloodInformationDetailsHS(data);
        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1b(data.get("State"))){
                    optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS(data);
            }
        }

        if (isFloodDate2(data.get("Effective_Date"))) {
            if (data.get("State").equalsIgnoreCase("RI")){
                optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS(data);
            }
        }
        verifyBlockExists("location coverages");
        saveChanges();
    }

    public void fillLocationCoveragePageHS_END(Map<String, String> data) throws Throwable {
        actionButtonNext();
        pause(500);
        saveChanges();
        usageBlock.fillUsageDetailsHS_END(data);
        locationDetailsBlock.fillLocationDetailsHS_END(data);
        geoLocationDetailsBlock.fillGeoLocationDetailsHS_END(data);
        constructionDetailsBlock.fillBasicConstructionDetailsHS_END(data);
        if (data.get("State").equalsIgnoreCase("CA")) {
            roofCharacteristicBlock.fillInRoofCharacteristicsHS_END(data);
        } else {
            windMitigationBlock.fillBasicWindMitigationDetailsHS_END(data);
        }
        protectionBlock.fillOutBasicProtectionDetailsHS_END(data);
        floodInformationBlock.fillFloodInformationDetailsHS_END(data);
        saveChanges();

    }

    public void fillLocationCoveragePageHS_OOS_END(Map<String, String> data) throws Throwable {
        actionButtonNext();
        pause(500);
        saveChanges();
        usageBlock.fillUsageDetailsHS_OOS_END(data);
        locationDetailsBlock.fillLocationDetailsHS_OOS_END(data);
        geoLocationDetailsBlock.fillGeoLocationDetailsHS_OOS_END(data);
        constructionDetailsBlock.fillBasicConstructionDetailsHS_OOS_END(data);
        if (data.get("State").equalsIgnoreCase("CA")) {
            roofCharacteristicBlock.fillInRoofCharacteristicsHS_OOS_END(data);
        } else {
            windMitigationBlock.fillBasicWindMitigationDetailsHS_OOS_END(data);
        }
        protectionBlock.fillOutBasicProtectionDetailsHS_OOS_END(data);
        floodInformationBlock.fillFloodInformationDetailsHS_OOS_END(data);
        saveChanges();
    }

    public void fillLocationCoveragePageHS_RNW(Map<String, String> data) throws Throwable {
        actionButtonNext();
        pause(500);
        saveChanges();
        usageBlock.fillUsageDetailsHS_RNW(data);
        locationDetailsBlock.fillLocationDetailsHS_RNW(data);
        geoLocationDetailsBlock.fillGeoLocationDetailsHS_RNW(data);
        constructionDetailsBlock.fillBasicConstructionDetailsHS_RNW(data);
        if (data.get("State").equalsIgnoreCase("CA")) {
            roofCharacteristicBlock.fillInRoofCharacteristicsHS_RNW(data);
        } else {
            windMitigationBlock.fillBasicWindMitigationDetailsHS_RNW(data);
        }
        protectionBlock.fillOutBasicProtectionDetailsHS_RNW(data);
        floodInformationBlock.fillFloodInformationDetailsHS_RNW(data);
        saveChanges();
    }

    public void fillLocationCoveragePageFS(Map<String, String> data) throws Throwable {
        actionButtonNext();
        pause(500);
        saveChanges();
//        clickOrderPropertyDetails();
//        pause(8000);
        locationDetailsBlock.fillLocationDetailsFS(data);
        geoLocationDetailsBlock.fillGeoLocationDetailsFS(data);
        usageBlock.fillUsageDetailsFS(data);
        constructionDetailsBlock.fillBasicConstructionDetailsFS(data);
        if (data.get("State").equalsIgnoreCase("CA")) {
            roofCharacteristicBlock.fillInRoofCharacteristicsFS(data);
        } else {
            windMitigationBlock.fillBasicWindMitigationDetailsFS(data);
        }
        protectionBlock.fillOutBasicProtectionDetailsFS(data);
        floodInformationBlock.fillFloodInformationDetailsFS(data);
        verifyBlockExists("location coverages");
        saveChanges();
    }

    public void navigateToCCLocation(Map<String, String> data) throws InterruptedException {
        clickElement(driver.findElement(By.xpath("//a[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = translate('" + data.get("Project_Address_City") + " " + data.get("State") + "', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')]")), "Navigated to location page");
        pause(2500);
        if (driver.findElements(By.xpath("//div[text()='location details']")).size() == 0) {
            clickElement(driver.findElement(By.xpath("//a[translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = translate('" + data.get("Project_Address_City") + " " + data.get("State") + "', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')]")), "Navigated to location page");
            pause(2500);
        }
    }

}