package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LocationCoveragePage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.Map;

public class BasicLocationPageSteps extends BaseTest {

    public BasicLocationPageSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the basic location page for CC line of business")
    public void iFillOutBasicLocationPageForCC() throws Throwable {
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageCC(data);
    }

    @And("I fill out the project details block for CC line of business")
    public void iFillProjectAddressCC() throws Throwable {
        new ProjectAddressBlock(driver).fillProjectAddressCC(data);
    }

    @And("I fill out the geo location details block for CC line of business")
    public void iFillGeoLocationDetailsCC() throws Throwable {
        new GeoLocationDetailsBlock(driver).fillGeoLocationDetailsCC(data);
    }

    @And("I fill out the location details block for CC line of business")
    public void iFillLocationDetailsCC() throws Throwable {
        new LocationDetailsBlock(driver).fillLocationDetailsCC(data);
    }

    @And("I fill out the project details and deductibles block for CC line of business")
    public void iFillProjectDetailsAndDeductiblesCC() throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).fillProjectDetailsAndDeductiblesCC(data);
    }

    @And("I fill out the construction details block for CC line of business")
    public void iFillConstructionDetailsCC() throws Throwable {
        new ConstructionDetailsBlock(driver).fillConstructionDetailsCC(data);
    }

    @And("I fill out the wind mitigation block for CC line of business")
    public void iFillBasicWindMitigationDetailsCC() throws Throwable {
        new WindMitigationBlock(driver).fillBasicWindMitigationDetailsCC(data);
    }

    @And("I fill out the contract terms block for CC line of business")
    public void iFillContractTermsDetailsCC() throws Throwable {
        new ContractTermsBlock(driver).fillContractTermsDetailsCC(data);
    }

    @And("I fill out the usage block for CC line of business")
    public void iFillUsageDetailsCC() throws Throwable {
        new UsageBlock(driver).fillUsageDetailsCC(data);
    }

    @And("I fill out the construction protection credits and safeguards block for CC line of business")
    public void iFillConstructionProtectionCreditsAndSafeguardsBlockCC() throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).fillConstructionProtectionCreditsAndSafeguardsBlockCC(data);
    }

    @And("I fill out the flood information block for CC line of business")
    public void iFillFloodInformationDetailsCC() throws Throwable {
        new FloodInformationBlock(driver).fillFloodInformationDetailsCC(data);
    }

    @And("I fill out the sinkhole block for CC line of business")
    public void iFillSinkholeDetailsCC() throws Throwable {
        new SinkholeBlock(driver).fillSinkholeDetailsCC(data);
    }

    @And("I fill out the wind pool block for CC line of business")
    public void iFillWindPoolDetailsCC() throws Throwable {
        new WindPoolBlock(driver).fillWindPoolDetailsCC(data);
    }

    @And("I set the risk address 1 to {string}")
    public void setRiskAddress1(String address) throws Throwable {
        new ProjectAddressBlock(driver).riskAddress1(address);
    }

    @And("I set the risk address 2 to {string}")
    public void setRiskAddress2(String address) throws Throwable {
        new ProjectAddressBlock(driver).riskAddress2(address);
    }

    @And("I set the city to {string}")
    public void setCity(String city) throws Throwable {
        new ProjectAddressBlock(driver).city(city);
    }

    @And("I set the state to {string}")
    public void setState(String state) throws Throwable {
        new ProjectAddressBlock(driver).state(state);
    }

    @And("I set the zip to {string}")
    public void setZip(String zip) throws Throwable {
        new ProjectAddressBlock(driver).zip(zip);
    }

    @And("I set the use user entered address for geocoding to {string}")
    public void setUseUserEnteredAddressForGeocoding(String value) throws Throwable {
        new GeoLocationDetailsBlock(driver).useUserEnteredAddressForGeocoding(value);
    }

    @And("I verify that the longitude is {string}")
    public void verifyLongitude(String longitude) {
        new GeoLocationDetailsBlock(driver).verifyLongitude(longitude);
    }

    @And("I verify that the latitude is {string}")
    public void setVerifyLatitude(String latitude) {
        new GeoLocationDetailsBlock(driver).verifyLatitude(latitude);
    }

    @And("I verify that the geo coded location is {string}")
    public void verifyGeoCodedLocation(String location) {
        new GeoLocationDetailsBlock(driver).verifyGeoCodedLocation(location);
    }

    @And("I verify that the location using google maps is {string}")
    public void verifyLocationUsingGoogleMaps() {
        new GeoLocationDetailsBlock(driver).verifyLocationUsingGoogleMaps(data);
    }

    @And("I verify that the location using bing maps is {string}")
    public void verifyLocationUsingBingMaps() {
        new GeoLocationDetailsBlock(driver).verifyLocationUsingBingMaps(data);
    }

    @And("I set the protection class to {string}")
    public void setProtectionClass(String protectionClass) throws Throwable {
        new LocationDetailsBlock(driver).setProtectionClass(protectionClass);
    }

    @And("I set the check extreme protection class override to {string}")
    public void iSetCheckExtremeProtectionClassOverride(String value) throws Throwable {
        new LocationDetailsBlock(driver).checkExtremeProtectionClassOverride(value);
    }

    @And("I verify that the location details county is {string}")
    public void verifyCountyLocationDetails(String county) {
        new LocationDetailsBlock(driver).verifyCounty(county);
    }

    @And("I set the check manager PPC Override to {string}")
    public void iSetCheckManagerPPCOverride(String PPCOverride) throws Throwable {
        new LocationDetailsBlock(driver).checkManagerPPCOverride(PPCOverride);
    }

    @And("I set the check manager DTC override to {string}")
    public void iSetCheckManagerDTCOverride(String DTCOverride) throws Throwable {
        new LocationDetailsBlock(driver).checkManagerDTCOverride(DTCOverride);
    }

    @And("I set the protection class override to {string}")
    public void setProtectionClassOverride(String classOverride) {
        new LocationDetailsBlock(driver).setProtectionClassOverride(classOverride);
    }

    @And("I set the distance to coast override to {string}")
    public void setDistanceToCoastOverride(String coastOverride) throws InterruptedException {
        new LocationDetailsBlock(driver).setDistanceToCoastOverride(coastOverride);
    }

    @And("I set the residence type to {string}")
    public void setResidenceType(String residenceType) throws InterruptedException {
        new ProjectDetailsAndDeductiblesBlock(driver).setResidenceType(residenceType);
    }

    @And("I set the dwelling to {string}")
    public void setDwelling(String dwelling) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setDwelling(dwelling);
    }

    @And("I set the additions and alterations to {string}")
    public void setAdditionsAlterations(String additionsAlterations) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setAdditionsAlterations(additionsAlterations);
    }

    @And("I set the dwelling project budget to {string}")
    public void setDwellingProjectBudget(String dwellingProjectBudget) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setDwellingProjectBudget(dwellingProjectBudget);
    }

    @And("I set the estimated final dwelling to {string}")
    public void setEstimatedFinalDwelling(String estimatedFinalDwelling) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setEstimatedFinalDwelling(estimatedFinalDwelling);
    }

    @And("I set the other structures project budget to {string}")
    public void setOtherStructuresProjectBudget(String otherStructuresProjectBudget) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setOtherStructuresProjectBudget(otherStructuresProjectBudget);
    }

    @And("I set the estimated final other structures to {string}")
    public void setEstimatedFinalOtherStructures(String estimatedFinalOtherStructures) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setEstimatedFinalOtherStructures(estimatedFinalOtherStructures);
    }

    @And("I set the additions alterations project budget to {string}")
    public void setAdditionsAlterationsProjectBudget(String additionsAlterationsProjectBudget) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setAdditionsAlterationsProjectBudget(additionsAlterationsProjectBudget);
    }

    @And("I set the estimated final additions alterations to {string}")
    public void setEstimatedFinalAdditionsAlterations(String estimatedFinalAdditionsAlterations) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setEstimatedFinalAdditionsAlterations(estimatedFinalAdditionsAlterations);
    }

    @And("I set the AOP ded to {string}")
    public void setAOPDed(String AOPDed) throws InterruptedException {
        new ProjectDetailsAndDeductiblesBlock(driver).setAOPDed(AOPDed);
    }

    @And("I set the other structures to {string}")
    public void setOtherStructures(String structures) {
        new ProjectDetailsAndDeductiblesBlock(driver).setOtherStructures(structures);
    }

    @And("I set the loss of use to {string}")
    public void setLossOfUse(String lossOfUse) {
        new ProjectDetailsAndDeductiblesBlock(driver).setLossOfUse(lossOfUse);
    }

    @And("I set the contents to {string}")
    public void setContents(String contents) {
        new ProjectDetailsAndDeductiblesBlock(driver).setContents(contents);
    }

    @And("I set the named storm deductible to {string}")
    public void setNamedStormDeductible(String stormDeductible) throws InterruptedException {
        new ProjectDetailsAndDeductiblesBlock(driver).setNamedStormDeductible(stormDeductible);
    }

    @And("I set the hail deductible to {string}")
    public void setHailDeductible(String hailDeductible) {
        new ProjectDetailsAndDeductiblesBlock(driver).setHailDeductible(hailDeductible);
    }

    @And("I set the WF deductible to {string}")
    public void setWFDeductible(String WFDeductible) throws Throwable {
        new ProjectDetailsAndDeductiblesBlock(driver).setWFDeductible(WFDeductible);
    }

    @And("I verify that the TIV is {string}")
    public void VerifyTIV(String TIV) {
        new ProjectDetailsAndDeductiblesBlock(driver).verifyTIV(TIV);
    }

    @And("I set the planned construction type to {string}")
    public void setPlannedConstructionType(String constructionType) throws InterruptedException {
        new ConstructionDetailsBlock(driver).setPlannedConstructionType(constructionType);
    }

    @And("I set the planned enclosure date to {string}")
    public void setPlannedEnclosureDate(String enclosureDate) {
        new ConstructionDetailsBlock(driver).setPlannedEnclosureDate(enclosureDate);
    }

    @And("I set the planned completion date to {string}")
    public void setPlannedCompletionDate(String completionDate) {
        new ConstructionDetailsBlock(driver).setPlannedCompletionDate(completionDate);
    }

    @And("I set the planned structural changes to {string}")
    public void setPlannedStructuralChanges(String structuralChanges) throws Throwable {
        new ConstructionDetailsBlock(driver).setPlannedStructuralChanges(structuralChanges);
    }

    @And("I set the planned total square footage to {string}")
    public void setPlannedTotalSquareFootage(String squareFootage) {
        new ConstructionDetailsBlock(driver).setPlannedTotalSquareFootage(squareFootage);
    }

    @And("I set the roof shape to {string}")
    public void setRoofShape(String roofShape) throws Throwable {
        new WindMitigationBlock(driver).setRoofShape(roofShape);
    }

    @And("I set the roof covering to {string}")
    public void setRoofCovering(String roofCovering) throws Throwable {
        new WindMitigationBlock(driver).setRoofCovering(roofCovering);
    }

    @And("I set the roof covering material to {string}")
    public void setRoofCoveringMaterial(String value) throws Throwable {
        new WindMitigationBlock(driver).setRoofCoveringMaterial(value);
    }

    @And("I set the secondary water resistance to {string}")
    public void setSecondaryWaterResistance(String waterResistance) throws Throwable {
        new WindMitigationBlock(driver).setSecondaryWaterResistance(waterResistance);
    }

    @And("I set the roof wall connection to {string}")
    public void setRoofWallConnection(String wallConnection) throws Throwable {
        new WindMitigationBlock(driver).setRoofWallConnection(wallConnection);
    }

    @And("I set the opening protection to {string}")
    public void setOpeningProtection(String openingProtection) throws Throwable {
        new WindMitigationBlock(driver).setOpeningProtection(openingProtection);
    }

    @And("I set the roof deck attachment to {string}")
    public void setRoofDeckAttachment(String deckAttachment) throws Throwable {
        new WindMitigationBlock(driver).setRoofDeckAttachment(deckAttachment);
    }

    @And("I set the signed contract with the general contractor to {string}")
    public void setSignedContractWithTheGeneralContractor(String generalContractor) {
        new ContractTermsBlock(driver).setSignedContractWithTheGeneralContractor(generalContractor);
    }

    @And("I set the member waived right of subrogation to {string}")
    public void setMemberWaivedRightOfSubrogation(String subrogation) {
        new ContractTermsBlock(driver).setMemberWaivedRightOfSubrogation(subrogation);
    }

    @And("I set the what is intended occupancy of the home to {string}")
    public void setWhatIsIntendedOccupancyOfTheHome(String value) {
        new UsageBlock(driver).setWhatIsIntendedOccupancyOfTheHome(value);
    }

    @And("I set the other occupancy to {string}")
    public void setOtherOccupancy(String otherOccupancy) {
        new UsageBlock(driver).setOtherOccupancy(otherOccupancy);
    }

    @And("I set the fire alarm to {string} and as {string}")
    public void setFireAlarm(String fireAlarm, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setFireAlarm(fireAlarm, required);
    }

    @And("I set the burglar alarm to {string} and as {string}")
    public void setBurglarAlarm(String burglarAlarm, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setBurglarAlarm(burglarAlarm, required);
    }

    @And("I set the fire extinguishers to {string} and as {string}")
    public void setFireExtinguishers(String fireExtinguishers, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setFireExtinguishers(fireExtinguishers, required);
    }

    @And("I set the fire proof storage cabinet to {string} and as {string}")
    public void setFireProofStorageCabinet(String storageCabinet, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setFireProofStorageCabinet(storageCabinet, required);
    }

    @And("I set the watchman security guard to {string} and as {string}")
    public void setWatchmanSecurityGuard(String securityGuard, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setWatchmanSecurityGuard(securityGuard, required);
    }

    @And("I set the video surveillance to {string} and as {string}")
    public void setVideoSurveillance(String videoSurveillance, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setVideoSurveillance(videoSurveillance, required);
    }

    @And("I set the oily rag disposal to {string} and as {string}")
    public void setOilyRagDisposal(String oilyRagDisposal, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setOilyRagDisposal(oilyRagDisposal, required);
    }

    @And("I set the no smoking policy to {string} and as {string}")
    public void setNoSmokingPolicy(String noSmokingPolicy, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setNoSmokingPolicy(noSmokingPolicy, required);
    }

    @And("I set the signage to {string} and as {string}")
    public void setSignage(String signage, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setSignage(signage, required);
    }

    @And("I set the exterior lighting to {string} and as {string}")
    public void setExteriorLighting(String exteriorLighting, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setExteriorLighting(exteriorLighting, required);
    }

    @And("I set the full perimeter fence to {string} and as {string}")
    public void setFullPerimeterFence(String fullPerimeterFence, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setFullPerimeterFence(fullPerimeterFence, required);
    }

    @And("I set the gated driveway to {string} and as {string}")
    public void setGatedDriveway(String gatedDriveway, String required) throws Throwable {
        new ConstructionProtectionCreditsAndSafeguardsBlock(driver).setGatedDriveway(gatedDriveway, required);
    }

    @And("I set the flood zone to {string}")
    public void setFloodZone(String floodZone) throws Throwable {
        new FloodInformationBlock(driver).setFloodZone(floodZone);
        pause(3);
    }

    @And("I set the is home in CBRA zone to {string}")
    public void setIsHomeInCBRAZone(String CBRAZone) throws Throwable {
        new FloodInformationBlock(driver).setIsHomeInCBRAZone(CBRAZone);
    }

    @And("I set base flood elevation to {string}")
    public void iSetBaseFloodElevationTo(String value) throws Throwable {
        new ElevationCertificateBlock(driver).setBaseFloodElevation(value);
    }

    @And("I set the NFIP policy with max limits required to {string} and I set do you purchase NFIP policy to {string}")
    public void setNFIPPolicyWithMaxLimitsRequired(String NFIPPolicyWithMaxLimitsRequired, String policy) throws Throwable {
        new FloodInformationBlock(driver).setNFIPPolicyWithMaxLimitsRequired(NFIPPolicyWithMaxLimitsRequired, policy);
    }

    @And("I set the check manager flood zone override to {string}")
    public void setCheckManagerFloodZoneOverride(String floodZoneOverride) throws Throwable {
        new FloodInformationBlock(driver).checkManagerFloodZoneOverride(floodZoneOverride);
    }

    @And("I verify that the RiskMeterFloodZone is {string}")
    public void verifyRiskMeterFloodZone(String floodZone) {
        new FloodInformationBlock(driver).verifyRiskMeterFloodZone(floodZone);
    }

    @And("I verify that the panel number is {string}")
    public void verifyPanelNumber(String panelNumber) {
        new FloodInformationBlock(driver).verifyPanelNumber(panelNumber);
    }

    @And("I verify that the panel date is {string}")
    public void verifyPanelDate(String panelDate) {
        new FloodInformationBlock(driver).verifyPanelDate(panelDate);
    }

    @And("I verify that the distance to closest sinkhole is {string}")
    public void verifyDistanceToClosestSinkhole(String closestSinkhole) {
        new SinkholeBlock(driver).verifyDistanceToClosestSinkhole(closestSinkhole);
    }

    @And("I verify that the number of sinkholes found within 0.50 miles is {string}")
    public void verifyNumberOfSinkholesFoundWithin_0_50_Miles(String value) {
        new SinkholeBlock(driver).verifyNumberOfSinkholesFoundWithin_0_50_Miles(value);
    }

    @And("I verify that the number of sinkholes found within 0.20 miles is {string}")
    public void verifyNumberOfSinkholesFoundWithin_0_20_Miles(String value) {
        new SinkholeBlock(driver).verifyNumberOfSinkholesFoundWithin_0_20_Miles(value);
    }

    @And("I verify that the date reported is {string}")
    public void verifyDateReported(String dateReported) {
        new SinkholeBlock(driver).verifyDateReported(dateReported);
    }

    @And("I verify that the number of sinkholes found within 1.50 miles is {string}")
    public void verifyNumberOfSinkholesFoundWithin_1_50_Miles(String value) {
        new SinkholeBlock(driver).verifyNumberOfSinkholesFoundWithin_1_50_Miles(value);
    }

    @And("I verify that the ref num is {string}")
    public void verifyRefNum(String refNum) {
        new SinkholeBlock(driver).verifyRefNum(refNum);
    }

    @And("I verify that the sinkhole claims under investigation is {string}")
    public void verifySinkholeClaimsUnderInvestigation(String investigation) {
        new SinkholeBlock(driver).verifySinkholeClaimsUnderInvestigation(investigation);
    }

    @And("I verify that the wind pool territory or zone is {string}")
    public void verifyWindPoolTerritoryOrZone(String territoryOrZone) {
        new WindPoolBlock(driver).verifyWindPoolTerritoryOrZone(territoryOrZone);
    }

    @And("I verify that the wind pool block state is {string}")
    public void verifyState(String state) {
        new WindPoolBlock(driver).verifyState(state);
    }

    @And("I verify that the wind pool block county is {string}")
    public void verifyCountyWindPoolBlock(String county) {
        new WindPoolBlock(driver).verifyCounty(county);
    }

    @And("I verify that the wind pool state county FIPS code is {string}")
    public void verifyWindPoolStateCountyFIPSCode(String FIPSCode) {
        new WindPoolBlock(driver).verifyWindPoolStateCountyFIPSCode(FIPSCode);
    }

    @And("I should see distance to coast override value is {string}")
    public void shouldSeeDistanceToCoastOverrideValueIs(String distanceToCoast) {
        new LocationDetailsBlock(driver).verifyDistanceToCoastOverride(distanceToCoast);
    }

    @And("I verify year built is {string}")
    public void verifyBuiltYear(String value) {
        new ConstructionDetailsBlock(driver).verifyYearBuilt(value);
    }

    @And("I verify that ISO returned only PPC value {string}")
    public void verifyPPCDropdownValue(String value) throws Throwable {
        new ConstructionDetailsBlock(driver).verifyProtectionClassDropdownValue(value);
        reportScreenshot("PPC Dropdown" + System.currentTimeMillis(), "ISO Protection Class Integration");
    }

    @And("I verify that ISO did not return more than {int} PPC values")
    public void verifyPPCDropdownSize(int value) throws Throwable {
        new ConstructionDetailsBlock(driver).verifyProtectionClassDropdownSize(value);
        reportScreenshot("PPC Dropdown" + System.currentTimeMillis(), "ISO Protection Class Integration");
    }

    @And("I verify that Geocoding is pulled")
    public void isGeocodingPulled() {
        verifyLongitude("NotEmpty");
        setVerifyLatitude("NotEmpty");
        verifyGeoCodedLocation("NotEmpty");
        reportScreenshot("GeoCoding" + System.currentTimeMillis(), "GeoCoding Integration");
    }

    @And("I verify that prefill is pulled")
    public void isPrefillPulled() throws Throwable {
        new HomeRatingCharacteristicsAvailableForPrefilBlock(driver).setAvailableForPrefill(data);
        verifyBuiltYear("NotEmpty");
        reportScreenshot("HO Prefill" + System.currentTimeMillis(), "Prefill Integration");
    }

    @And("I verify if RiskMeter is pulled")
    public void isRiskMeterPulled() {
        if (ENV.contains("PROD") && data.get("State").equalsIgnoreCase("KY")) {
            System.out.println("Skipping RM check for KY for PROD environments");
            Allure.addAttachment("RM", "Skipping RM check for KY for PROD environments");
        } else {
            verifyRiskMeterFloodZone("NotEmpty");
            verifyPanelDate("NotEmpty");
            verifyPanelNumber("NotEmpty");
            reportScreenshot("RiskMeter" + System.currentTimeMillis(), "RiskMeter Integration");
        }
    }


    @And("I verify that KY Tax Report tax code is {string}")
    public void verifyKYTaxCode(String taxCode) {
        new MunicipalityTaxReportBlock(driver).verifyTaxCode(taxCode);
    }

    @And("I verify that KY Tax Report city code is {string}")
    public void verifyKYCityCode(String cityCode) {
        new MunicipalityTaxReportBlock(driver).verifyCityCode(cityCode);
    }

    @And("I verify that KY Tax Report min tax is {string}")
    public void verifyKYMinTax(String minTax) {
        new MunicipalityTaxReportBlock(driver).verifyMinTax(minTax);
    }

    @And("I verify that KY Tax Report eff date low is {string}")
    public void verifyKYEffDateLow(String val) {
        new MunicipalityTaxReportBlock(driver).verifyEffDateLow(val);
    }

    @And("I verify that KY Tax Report eff date high is {string}")
    public void verifyKYEffDateHigh(String val) {
        new MunicipalityTaxReportBlock(driver).verifyEffDateHigh(val);
    }

    @And("I verify that KY Tax Report county name is {string}")
    public void verifyKYReportCountyName(String countyName) {
        new MunicipalityTaxReportBlock(driver).verifyCountyName(countyName);
    }

    @And("I verify that KY Tax Report FIPS is {string}")
    public void verifyKYFips(String fips) {
        new MunicipalityTaxReportBlock(driver).verifyFIPS(fips);
    }

    @And("I verify that KY Tax Report is pulled")
    public void verifyKYTaxReportPulled() {
        verifyKYCityCode("NotEmpty");
        verifyKYMinTax("NotEmpty");
        verifyKYEffDateLow("NotEmpty");
        verifyKYEffDateHigh("NotEmpty");
        verifyKYReportCountyName("NotEmpty");
        verifyKYFips("NotEmpty");
        reportScreenshot("KY Tax Code" + System.currentTimeMillis(), "KY Tax Code Integration");
    }

    @And("I verify that Roof Age Confidence is {string}")
    public void verifyRoofAgeConfidence(String roofConfidence) {
        new RoofCharacteristicBlock(driver).verifyRoofAgeConfidence(roofConfidence);
    }

    @And("I verify that 3rd Party Roof Replacement Year is {string}")
    public void verifyThirdPartyRoofReplacementYear(String value) {
        new RoofCharacteristicBlock(driver).verifyThirdPartyRoofReplacementYear(value);
    }

    @And("I verify that Verisk Report is pulled")
    public void verifyVeriskReportPulled() {
        // Will be turned off in the future, currently only in PRE-PROD & PROD
        if (!ENV.contains("PROD")) {
            reportScreenshot("Verisk" + System.currentTimeMillis(), "Verisk Integration");
            verifyRoofAgeConfidence("NotEmpty");
            verifyThirdPartyRoofReplacementYear("NotEmpty");
        }

    }

    @And("I verify that Weather Analytics is pulled")
    public void verifyIfWeatherAnalyticsPulled() throws Throwable {
        HailAssessmentBlock block = new HailAssessmentBlock(driver);

        block.clickRefreshBtn();
        block.verifyLikelihoodCell("NotEmpty");
        block.verifyDataReceivedOn("NotEmpty");
        reportScreenshot("Weather Analytics" + System.currentTimeMillis(), "Weather Analytics Integration");
    }

    @And("I verify that Storm Surge is pulled")
    public void verifyIfSurgeScorePulled() {
        new StormSurgeBlock(driver).verifySurgeScore("NotEmpty");
        reportScreenshot("Storm Surge" + System.currentTimeMillis(), "Storm Surge Integration");
    }

    @And("I verify that Sinkhole is pulled")
    public void verifyIfSinkholePulled() {
        SinkholeBlock block = new SinkholeBlock(driver);

        block.verifyDateReported("NotEmpty");
        block.verifyDistanceToClosestSinkhole("NotEmpty");
        reportScreenshot("Sinkhole" + System.currentTimeMillis(), "Sinkhole Integration");
    }

    @And("I verify that WindPool is pulled")
    public void verifyIfWindPoolPulled() {
        WindPoolBlock block = new WindPoolBlock(driver);

        block.verifyWindPoolTerritoryOrZone("NotEmpty");
        block.verifyState("NotEmpty");
        block.verifyCounty("NotEmpty");
        block.verifyWindPoolStateCountyFIPSCode("NotEmpty");
        reportScreenshot("WindPool" + System.currentTimeMillis(), "WindPool Integration");
    }

    @And("I verify that ISO Report is pulled")
    public void verifyISOReport() {
        LocationDetailsBlock block = new LocationDetailsBlock(driver);
        reportScreenshot("ISO_RiskMeter_" + System.currentTimeMillis(), "ISO/RiskMeter Report");
        if (block.verifyIfReportFailed() || !block.verifyIfSuccessfulReports())
            new CommonComponentsAndActions(driver).failAssertion("ISO/RiskMeter Report Failed");
    }

    @When("I set project description to {string}")
    public void iSetProjectDescriptionTo(String value) throws Throwable {
        new ConstructionDetailsBlock(driver).setProjectDescription(value);
    }

    @When("I delete project description")
    public void iDeleteProjectDescriptionTo() throws Throwable {
        new ConstructionDetailsBlock(driver).deleteProjectDescription();
    }

    @Then("I verify project description field is {string}")
    public void iVerifyProjectDescriptionFieldIs(String value) {
        if (value.equalsIgnoreCase("Mandatory")) {
            Assert.assertTrue(new ConstructionDetailsBlock(driver).isProjectDescriptionMandatory());
        } else if (value.equalsIgnoreCase("Not Mandatory")) {
            Assert.assertFalse(new ConstructionDetailsBlock(driver).isProjectDescriptionMandatory());
        } else if (value.equalsIgnoreCase("Not Empty")) {
            Assert.assertTrue(new ConstructionDetailsBlock(driver).isProjectDescriptionEmpty());
        }
        reportScreenshot("ProjectDescription", "ProjectDescription");
    }

    @And("I verify flood integration based on flood zone {string}")
    public void iVerifyFloodInformationBasedOnFloodZone(String value) {
        new FloodInformationBlock(driver).verifyFloodInformationBasedOnFloodZone(value);
    }

    @And("I set Barrier Island to {string}")
    public void iSetBarrierIsland(String value) throws Throwable {
        new ConstructionDetailsBlock(driver).setBarrierIsland(value);
    }

    @And("I insert Weather Analytics information into {string} data")
    public void insertWeatherAnalyticsInformationIntoData(String trx) {
        new HailAssessmentBlock(driver).insertWeatherAnalyticsIntoData(data.get("City_Name_Txt") + " " + data.get("State"), trx);
    }

    @And("I read Weather Analytics information from {string} trx data and check if it's {string} for location")
    public void verifyWeatherAnalyticsInformationFromData(String trx, String option) throws Throwable {
        new HailAssessmentBlock(driver).verifyWeatherAnalyticsFromData(data.get("City_Name_Txt") + " " + data.get("State"), trx, option);
    }

    @And("I verify that Hail Assessment Refresh button is {string}")
    public void verifyHailAssessmentRefreshButton(String value) {
        new HailAssessmentBlock(driver).verifyIfRefreshButtonIsDisplayed(value);
    }

    @And("I click Refresh Hail Assessment button")
    public void clickRefreshHailAssessmentButton() throws Throwable {
        new HailAssessmentBlock(driver).clickRefreshBtn();
    }

    @And("I set home fortification to {string}")
    public void iSetHomeFortification(String value) {
        new RoofCharacteristicBlock(driver).setHomeFortification(value);
    }

    @And("I set year roof replaced to {string}")
    public void iSetYearRoofReplaced(String value) throws Throwable {
        new RoofCharacteristicBlock(driver).setYearRoofReplaced(value);
    }

    @And("I set fortified designation to {string} designation expiration date to {string}")
    public void iSetFortifiedDesignation(String value, String expDate) {
        new WindMitigationBlock(driver).setFortifiedDesignation(value, expDate);
    }

    @And("I set Year Renovated to {string} on Location Details Page")
    public void iSetYearRenovatedTo(String value) {
        new ConstructionDetailsBlock(driver).setYearRenovated(value);
    }

    @And("I verify that the Standardized Address is pulled")
    public void verifyStandardizedAddressIsPulled() {
        new GeoLocationDetailsBlock(driver).verifyStandardizedAddress("pulled");
    }

    @And("I fill out the construction details block for HO")
    public void iFillConstructionDetailsHO() throws Throwable {
        new ConstructionDetailsBlock(driver).fillBasicConstructionDetails(data);
    }

    @And("I fill out Basic Construction Details HS")
    public void iFillOutBasicConstructionDetailsHS() throws Throwable {
        new ConstructionDetailsBlock(driver).fillBasicConstructionDetailsHS(data);
    }

    @And("I fill out the usage block for HO")
    public void iFillUsageDetailsHO() throws Throwable {
        new UsageBlock(driver).fillUsageDetails(data);
    }

    @And("I fill out the mortgagee information block for HO")
    public void iFillMortgageeInformationHO() throws Throwable {
        new MortgageeInformationBlock(driver).setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
    }

    @And("I fill out the risk characteristics block for HO")
    public void iFillRiskCharacteristicsHO() throws Throwable {
        new RiskCharacteristicsUsedInRiskModelBlock(driver).fillRiskCharacteristicsBlockHO(data);
    }

    @And("I verify Square Footage is {string}")
    public void verifySquareFt(String value) {
        new ConstructionDetailsBlock(driver).verifySquareFootage(value);
    }

    @And("I verify Foundation Type is {string}")
    public void verifyFoundationType(String value) {
        new ConstructionDetailsBlock(driver).verifyFoundationType(value);
    }

    @And("I verify Construction Type is {string}")
    public void verifyConstructionType(String value) {
        new ConstructionDetailsBlock(driver).verifyConstructionType(value);
    }

}