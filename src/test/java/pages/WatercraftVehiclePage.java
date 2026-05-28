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

public class WatercraftVehiclePage extends CommonComponentsAndActions {

    WebDriver driver;
    VesselBlock vesselBlock;
    VesselAndEngineDetailsBlock vesselAndEngineDetailsBlock;
    BerthingLocationBlock berthingLocationBlock;
    GeoLocationDetailsBlock geoLocationDetailsBlock;
    NavigationalLimitsBlock navigationalLimitsBlock;
    SelectCoveragesBlock selectCoveragesBlock;
    VesselUnderwritingDetailsBlock vesselUnderwritingDetailsBlock;
    OptionalCoveragesExclusionsBlock optionalCoveragesExclusionsBlock;
    SevereWeatherPlanBlock severeWeatherPlanBlock;
    VesselDetailsBlock vesselDetailsBlock;
    EngineDetailsBlock engineDetailsBlock;
    WatersNavigatedBlock watersNavigatedBlock;
    SafetyEquipmentBlock safetyEquipmentBlock;
    WatercraftLossHistoryBlock watercraftLossHistoryBlock;
    LossPayeeAdditionalInterestBlock lossPayeeAdditionalInterestBlock;
    TrustLlcOtherLegalEntityPage trustLlcOtherLegalEntityPage;
    MunicipalityTaxReportBlock municipalityTaxReportBlock;

    public WatercraftVehiclePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        vesselBlock = new VesselBlock(driver);
        vesselAndEngineDetailsBlock = new VesselAndEngineDetailsBlock(driver);
        berthingLocationBlock = new BerthingLocationBlock(driver);
        geoLocationDetailsBlock = new GeoLocationDetailsBlock(driver);
        navigationalLimitsBlock = new NavigationalLimitsBlock(driver);
        severeWeatherPlanBlock = new SevereWeatherPlanBlock(driver);
        selectCoveragesBlock = new SelectCoveragesBlock(driver);
        vesselUnderwritingDetailsBlock = new VesselUnderwritingDetailsBlock(driver);
        optionalCoveragesExclusionsBlock = new OptionalCoveragesExclusionsBlock(driver);
        vesselDetailsBlock = new VesselDetailsBlock(driver);
        engineDetailsBlock = new EngineDetailsBlock(driver);
        watersNavigatedBlock = new WatersNavigatedBlock(driver);
        safetyEquipmentBlock = new SafetyEquipmentBlock(driver);
        watercraftLossHistoryBlock = new WatercraftLossHistoryBlock(driver);
        lossPayeeAdditionalInterestBlock = new LossPayeeAdditionalInterestBlock(driver);
        trustLlcOtherLegalEntityPage = new TrustLlcOtherLegalEntityPage(driver);
        municipalityTaxReportBlock = new MunicipalityTaxReportBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Vessel titled in the name of']/../../../..//input")
    WebElement vesselTitledInTheNameOf;
    @FindBy(xpath = "//div[text()='Ownership']/../../../..//input")
    WebElement ownership;
    @FindBy(xpath = "//a[number(substring(normalize-space(text()), 1, 1)) = number(substring(normalize-space(text()), 1, 1))]")
    List<WebElement> watercraftPage;

    public void fillWatercraftVehiclePageDetails(Map<String, String> data) throws Throwable {
        goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
        verifyBlockExists("vessel");
        if (data.get("Vehicle_GTE_27_Feet").equalsIgnoreCase("Yes") && Integer.parseInt(data.get("Length")) > 27) {
            vesselBlock.fillVesselDetails(data);
            vesselDetailsBlock.fillVesselDetails(data);
            engineDetailsBlock.fillEngineDetails(data);
            berthingLocationBlock.fillBerthingLocationDetails(data);
            geoLocationDetailsBlock.fillGeoLocationDetailsPW(data);
            navigationalLimitsBlock.fillNavigationalLimitsDetails(data);
        } else if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("WA")) {
            vesselBlock.fillVesselDetails(data);
            vesselAndEngineDetailsBlock.fillVesselAndEngineDetails(data);
            berthingLocationBlock.fillBerthingLocationDetails(data);
            geoLocationDetailsBlock.fillGeoLocationDetailsPW(data);
            navigationalLimitsBlock.fillNavigationalLimitsDetails(data);
            if (data.get("State").equalsIgnoreCase("LA") || data.get("State").equalsIgnoreCase("FL")) {
                severeWeatherPlanBlock.fillSevereWeatherPlanDetails(data);
            }
            selectCoveragesBlock.fillCoverageDetailsPW(data);
            vesselUnderwritingDetailsBlock.fillVesselUnderwritingDetails(data);
            optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionDetailsPW(data);
            fillRequiredToBindInformation(data);
        } else {
            vesselDetailsBlock.fillVesselDetails(data);
            engineDetailsBlock.fillEngineDetails(data);
            berthingLocationBlock.fillBerthingLocationDetails(data);
            geoLocationDetailsBlock.fillGeoLocationDetailsPW(data);
            watersNavigatedBlock.fillWatersNavigatedDetails(data);
            safetyEquipmentBlock.fillSafetyEquipmentDetails(data);
            watercraftLossHistoryBlock.fillWatercraftLossHistoryDetails(data);
            fillRequiredToBindInformation(data);
        }
    }

    public void fillRequiredToBindInformation(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional for quote, required to bind");
//        setVesselTitledInTheNameOf(data.get("Vessel_In_The_Name_Of"));
        //TODO - make changes to support multiple drivers, not just customer PW
        setVesselTitledInTheNameOf(data.get("First_Name") + " " + data.get("Last_Name"));
        setOwnership(data.get("Ownership"));
        if (!data.get("Ownership").equalsIgnoreCase("Owned")) {
            lossPayeeAdditionalInterestBlock.fillLossPayeeAdditionalInsuredAdditionalOwnerPW(data);
            trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterestPW(data);
        }
    }

    private void setOwnership(String value) throws Throwable {
        clickElement(ownership);
        pause(2000);
        typeText(driver.switchTo().activeElement(), value);
        clickFooter();
    }

    private void setVesselTitledInTheNameOf(String value) throws Throwable {
        clickElement(vesselTitledInTheNameOf);
        pause(2000);
        try {
            clickElement(driver.findElement(By.xpath("//li[contains(text(),'" + value + "')]")));
        } catch (Exception e) {
            typeText(vesselTitledInTheNameOf, value);
        }
    }

    public void visitWatercraftAndFillKYTaxReportData() throws Throwable {
        for (int i = 0; i < watercraftPage.size(); i++) {
            clickFooter();
            clickElement(watercraftPage.get(i), "Watercraft");
            pause(4000);
            municipalityTaxReportBlock.fillKYTaxReportDummyData("PW");
            clickFooter();
        }
    }
}