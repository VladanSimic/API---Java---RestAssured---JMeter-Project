package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.VehiclesDetailsPage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class VehicleDetailPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    //PA pages and blocks steps - START
    @And("I fill out PA quote vehicle details page")
    public void iFillOutVehicleDetailsPagePA() throws Throwable {
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA(data);
    }

    @And("I fill out PA endorsement vehicle details page")
    public void iFillOutVehicleDetailsPagePA_END() throws Throwable {
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA_END(data);
    }

    @And("I fill out PA renewal vehicle details page")
    public void iFillOutVehicleDetailsPagePA_RNW() throws Throwable {
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA_RNW(data);
    }

    @And("I fill out PA oos endorsement vehicle details page")
    public void iFillOutVehicleDetailsPagePA_OOS_END() throws Throwable {
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA_OOS_END(data);
    }

    @And("I fill out PA quote vehicle {int} details block")
    public void iFillOutVehicleDetailsBlockPA(int i) throws Throwable {
        new VehicleDetailsBlock(driver).fillVehicleDetailsPA(data, i);
    }

    @And("I fill out PA quote vehicle {int} ownership block")
    public void iFillOutOwnershipDetailsPA(int i) throws Throwable {
        new OwnershipBlock(driver).fillOwnershipDetailsPA(data, i);
    }

    @And("I fill out PA quote vehicle {int} loss payee additional interest details block")
    public void iFillOutPayeeAdditionalInterestDetailsPA(int i) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).fillLossPayeeAdditionalInterestDetailsPA(data, i);
    }

    @And("I fill out PA quote vehicle {int} symbols block")
    public void iFillOutSymbolDetailsPA(int i) throws Throwable {
        new SymbolsBlock(driver).fillSymbolDetailsPA(data, i);
    }

    @And("I fill out PA quote vehicle {int} territory factors block")
    public void iFillOutTerritoryFactorsDetailsPA(int i) throws Throwable {
        new TerritoryFactorsBlock(driver).fillTerritoryFactorsDetailsPA(data, i);
    }

    @And("I fill out PA endorsement vehicle {int} details block")
    public void iFillOutVehicleDetailsBlockPA_END(int i) throws Throwable {
        new VehicleDetailsBlock(driver).fillVehicleDetailsPA_END(data, i);
    }

    @And("I fill out PA endorsement vehicle {int} ownership block")
    public void iFillOutOwnershipDetailsPA_END(int i) throws Throwable {
        new OwnershipBlock(driver).fillOwnershipDetailsPA_END(data, i);
    }

    @And("I fill out PA endorsement vehicle {int} loss payee additional interest details block")
    public void iFillOutPayeeAdditionalInterestDetailsPA_END(int i) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).fillLossPayeeAdditionalInterestDetailsPA_END(data, i);
    }

    @And("I fill out PA endorsement vehicle {int} symbols block")
    public void iFillOutSymbolDetailsPA_END(int i) throws Throwable {
        new SymbolsBlock(driver).fillSymbolDetailsPA_END(data, i);
    }

    @And("I fill out PA endorsement vehicle {int} territory factors block")
    public void iFillOutTerritoryFactorsDetailsPA_END(int i) {
        new TerritoryFactorsBlock(driver).fillTerritoryFactorsDetailsPA_END(data, i);
    }
    //PA pages and blocks steps - END

    // Vehicle details block steps - START
    @And("I set vehicle details garaging code to {string}")
    public void iSetGaragingCode(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setGaragingCode(value);
    }

    @And("I set vehicle details vehicle registered to {string}")
    public void iSetVehicleRegistered(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setVehicleRegistered(value);
    }

    @And("I set vehicle details vehicle vacation use to {string}")
    public void iSetVehicleVacationUse(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setVehicleVacationUse(value);
    }

    @And("I set vehicle details vehicle use to {string}")
    public void iSetVehicleUse(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setVehicleUse(value);
    }

    @And("I set vehicle details vehicle insure by another PURE policy to {string}")
    public void iSetVehicleInsureByAnotherPUREPolicy(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setVehicleInsureByAnotherPUREPolicy(value);
    }

    @And("I set vehicle details mileage band year to {string}")
    public void iSetMileageBandYear(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setMileageBandYear(value);
    }

    @And("I set vehicle details ABS to {string}")
    public void iSetABS(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setABS(value);
    }

    @And("I set vehicle details airbag to {string}")
    public void iSetAirbag(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAirbag(value);
    }

    @And("I set vehicle details VIN etching to {string}")
    public void iSetVINEtching(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setVINEtching(value);
    }

    @And("I set vehicle details vehicle recovery to {string}")
    public void iSetVehicleRecovery(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setVehicleRecovery(value);
    }

    @And("I set vehicle details disabling device to {string} status {string}")
    public void iSetDisablingDevice(String device, String status) throws Throwable {
        new VehicleDetailsBlock(driver).setDisablingDevice(device, status);
    }

    @And("I set vehicle details current term override to {string} and override {string}")
    public void iSetCurrentTermOverride(String override, String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCurrentTermOverride(override, value);
    }

    @And("I verify vehicle details market value is {string}")
    public void iVerifyMarketValue(String value) {
        new VehicleDetailsBlock(driver).verifyMarketValue(value);
    }

    @And("I set vehicle details agreed value of vehicle to {string}")
    public void iSetAgreedValueOfVehicle(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAgreedValueOfVehicle(value);
    }

    @And("I set vehicle details cost new to {string}")
    public void iSetCostNew(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCostNew(value);
    }

    @And("I set vehicle details engine size to {string}")
    public void iSetEngineSize(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setEngineSize(value);
    }

    @And("I set vehicle details agreed value to {string}")
    public void iSetAgreedValue(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAgreedValue(value);
    }

    @And("I set vehicle details agreed value current term to {string}")
    public void iSetAgreedValueCurrentTerm(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAgreedValueCurrentTerm(value);
    }

    @And("I set vehicle details enter info without lookup to {string}")
    public void iSetEnterInfoWithoutLookup(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setEnterInfoWithoutLookup(value);
    }

    @And("I set vehicle details custom or additional equipment {string} to {string}")
    public void iSetCustomOrAdditionalEquipment(String yesNo, String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCustomOrAdditionalEquipment(yesNo, value);
    }

    @And("I set vehicle details vehicle kept in garage to {string}")
    public void iSetVehicleKeptInGarage(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setVehicleKeptInGarage(value);
    }

    @And("I set vehicle details estimated annual mileage to {string}")
    public void iSetEstimatedAnnualMileage(String value) throws Throwable {
        try {
            new VehicleDetailsBlock(driver).setEstimatedAnnualMileage(value);
        } catch (Exception e) {
        }
    }

    @And("I verify vehicle details prefill annual mileage is {string}")
    public void iVerifyPrefillAnnualMileage(String value) {
        new VehicleDetailsBlock(driver).verifyPrefillAnnualMileage(value);
    }

    @And("I verify vehicle details prefill version is {string}")
    public void iVerifyPrefillVersion(String value) {
        new VehicleDetailsBlock(driver).verifyPrefillVersion(value);
    }

    @And("I set vehicle details annual mileage to {string}")
    public void iSetAnnualMileage(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAnnualMileage(value);
    }

    @And("I set vehicle details motorcycle accident prevention to {string}")
    public void iSetMotorcycleAccidentPrevention(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setMotorcycleAccidentPrevention(value);
    }

    @And("I set vehicle details driven by to {string}")
    public void iSetDrivenBy(String value) {
        new VehicleDetailsBlock(driver).setDrivenBy(value);
    }

    @And("I set vehicle details motorcycle accident prevention date to {string}")
    public void iSetMotorcycleAccidentPreventionDate(String value) {
        new VehicleDetailsBlock(driver).setMotorcycleAccidentPreventionDate(value);
    }

    @And("I set vehicle details alarm only to {string}")
    public void iSetAlarmOnly(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAlarmOnly(value);
    }

    @And("I set vehicle details active disabling device 2a to {string}")
    public void iSetActiveDisablingDevice2a(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setActiveDisablingDevice2a(value);
    }

    @And("I set vehicle details active disabling device 2b to {string}")
    public void iSetActiveDisablingDevice2b(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setActiveDisablingDevice2b(value);
    }

    @And("I set vehicle details active disabling device 2c to {string}")
    public void iSetActiveDisablingDevice2c(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setActiveDisablingDevice2c(value);
    }

    @And("I set vehicle details passive disabling device to {string}")
    public void iSetPassiveDisablingDevice(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setPassiveDisablingDevice(value);
    }

    @And("I set vehicle details anti theft device to {string}")
    public void iSetAntiTheftDevice(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAntiTheftDevice(value);
    }

    @And("I set vehicle details other anti theft device 4a to {string}")
    public void iSetOtherAntiTheftDevice4a(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setOtherAntiTheftDevice4a(value);
    }

    @And("I set vehicle details other anti theft device 4b to {string}")
    public void iSetOtherAntiTheftDevice4b(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setOtherAntiTheftDevice4b(value);
    }

    @And("I set vehicle details other anti theft device 4c to {string}")
    public void iSetOtherAntiTheftDevice4c(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setOtherAntiTheftDevice4c(value);
    }

    @And("I set vehicle details other anti theft device 4d to {string}")
    public void iSetOtherAntiTheftDevice4d(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setOtherAntiTheftDevice4d(value);
    }

    @And("I set vehicle details other anti theft devices low jack 4e to {string}")
    public void iSetOtherAntiTheftDevicesLowJack4e(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setOtherAntiTheftDevicesLowJack4e(value);
    }

    @And("I set vehicle details snowbird vehicle to {string}")
    public void iSetSnowbirdVehicle(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setSnowbirdVehicle(value);
    }

    @And("I set vehicle details auxiliary lighting discount to {string}")
    public void iSetAuxiliaryLightingDiscount(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAuxiliaryLightingDiscount(value);
    }

    @And("I set vehicle details category I to {string}")
    public void iSetCategoryI(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategoryI(value);
    }

    @And("I set vehicle details category II to {string}")
    public void iSetCategoryII(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategoryII(value);
    }

    @And("I set vehicle details category III to {string}")
    public void iSetCategoryIII(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategoryIII(value);
    }

    @And("I set vehicle details category IV to {string}")
    public void iSetCategoryIV(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategoryIV(value);
    }

    @And("I set vehicle details stored in car condo to {string}")
    public void iSetStoredInCarCondo(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setStoredInCarCondo(value);
    }

    @And("I set vehicle details agree to use pure direct repair program to {string}")
    public void iSetAgreeToUsePureDirectRepairProgram(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setAgreeToUsePureDirectRepairProgram(value);
    }

    @And("I set vehicle details motorcycle training course to {string}")
    public void iSetMotorcycleTrainingCourse(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setMotorcycleTrainingCourse(value);
    }

    @And("I set vehicle details motorcycle training course completion date to {string}")
    public void iSetMotorcycleTrainingCourseCompletionDate(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setMotorcycleTrainingCourseCompletionDate(value);
    }

    @And("I set vehicle details year first licensed to operate motorcycle to {string}")
    public void iSetYearFirstLicensedToOperateMotorcycle(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setYearFirstLicensedToOperateMotorcycle(value);
    }

    @And("I set vehicle details category 1 to {string}")
    public void iSetCategory1(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategory1(value);
    }

    @And("I set vehicle details category 2 to {string}")
    public void iSetCategory2(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategory2(value);
    }

    @And("I set vehicle details category 3 to {string}")
    public void iSetCategory3(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategory3(value);
    }

    @And("I set vehicle details category 4 to {string}")
    public void iSetCategory4(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategory4(value);
    }

    @And("I set vehicle details category 5 to {string}")
    public void iSetCategory5(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setCategory5(value);
    }

    @And("I set vehicle details premium town code to {string}")
    public void iSetPremiumTownCode(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setPremiumTownCode(value);
    }

    @And("I set vehicle details stated amount to {string}")
    public void iSetStatedAmount(String value) throws Throwable {
        new VehicleDetailsBlock(driver).setStatedAmount(value);
    }

    @And("I set vehicle details was the vehicle purchased new to {string} and when to {string}")
    public void iSetWasTheVehiclePurchasedNew(String yesNo, String value) throws Throwable {
        new VehicleDetailsBlock(driver).setWasTheVehiclePurchasedNew(yesNo, value);
    }
    // Vehicle details block steps - END

    // Ownership block steps - START

    @And("I set ownership ownership to {string}")
    public void iSetOwnership(String value) throws Throwable {
        new OwnershipBlock(driver).setOwnership(value);
    }

    @And("I set ownership is there an additional insured to {string}")
    public void iSetIsThereAnAdditionalInsured(String value) throws Throwable {
        new OwnershipBlock(driver).setIsThereAnAdditionalInsured(value);
    }

    @And("I set ownership vehicle titled in the name to {string}")
    public void iSetVehicleTitledInTheName(String value) throws Throwable {
        new OwnershipBlock(driver).setVehicleTitledInTheName(value);
    }

    @And("I set ownership additional name on the ID to {string}")
    public void iSetAdditionalNameOnTheID(String value) throws Throwable {
        new OwnershipBlock(driver).setAdditionalNameOnTheID(value);
    }
    // Ownership block steps - END

    // Loss Payee Additional Interest block steps - START
    @And("I set loss payee additional interest {int} interest type to {string}")
    public void iSetInterestType(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setInterestType(value, index);
    }

    @And("I set loss payee additional interest {int} LLC trust to {string}")
    public void iSetLLCTrust(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setLLCTrust(value, index);
    }

    @And("I set loss payee additional interest {int} loss payee to {string}")
    public void iSetLossPayee(int index, String value) {
        new LossPayeeAdditionalInterestBlock(driver).setLossPayee(value, index);
    }

    @And("I set loss payee additional interest {int} street address to {string}")
    public void iSetStreetAddress(int index, String value) {
        new LossPayeeAdditionalInterestBlock(driver).setStreetAddress(value, index);
    }

    @And("I set loss payee additional interest {int} city to {string}")
    public void iSetCity(int index, String value) {
        new LossPayeeAdditionalInterestBlock(driver).setCity(value, index);
    }

    @And("I set loss payee additional interest {int} state to {string}")
    public void iSetState(int index, String value) {
        new LossPayeeAdditionalInterestBlock(driver).setState(value, index);
    }

    @And("I set loss payee additional interest {int} ZIP to {string}")
    public void iSetZIP(int index, String value) {
        new LossPayeeAdditionalInterestBlock(driver).setZIP(value, index);
    }
    // Loss Payee Additional Interest block steps - END

    // Symbol block steps - START
    @And("I verify symbol liability symbol is {string}")
    public void iVerifyLiabilitySymbol(String value) {
        new SymbolsBlock(driver).verifyLiabilitySymbol(value);
    }

    @And("I verify symbol COLL symbol is {string}")
    public void iVerifyCOLLSymbol(String value) {
        new SymbolsBlock(driver).verifyCOLLSymbol(value);
    }

    @And("I verify symbol LPMP rate plan is {string}")
    public void iVerifyLPMPRatePlan(String value) {
        new SymbolsBlock(driver).verifyLPMPRatePlan(value);
    }

    @And("I set symbols liability Symbol to {string}")
    public void iSetLiabilitySymbol(String value) throws Throwable {
        new SymbolsBlock(driver).setLiabilitySymbol(value);
    }

    @And("I set symbols COLL symbol to {string}")
    public void iSetCOLLSymbol(String value) throws Throwable {
        new SymbolsBlock(driver).setCOLLSymbol(value);
    }

    @And("I verify symbol MP symbol is {string}")
    public void iVerifyMPSymbol(String value) {
        new SymbolsBlock(driver).verifyMPSymbol(value);
    }

    @And("I verify symbol OTC symbol is {string}")
    public void iVerifyOTCSymbol(String value) throws Throwable {
        new SymbolsBlock(driver).verifyOTCSymbol(value);
    }

    @And("I set symbols MP symbol to {string}")
    public void iSetMPSymbol(String value) throws Throwable {
        new SymbolsBlock(driver).setMPSymbol(value);
    }

    @And("I set symbols OTC symbol to {string}")
    public void iSetOTCSymbol(String value) throws Throwable {
        new SymbolsBlock(driver).setOTCSymbol(value);
    }

    @And("I verify symbol PIPMP symbol is {string}")
    public void iVerifyPIPMPSymbol(String value) throws Throwable {
        new SymbolsBlock(driver).verifyPIPMPSymbol(value);
    }

    @And("I set symbols PIPMP Symbol to {string}")
    public void iSetPIPMPSymbol(String value) throws Throwable {
        new SymbolsBlock(driver).setPIPMPSymbol(value);
    }

    @And("I verify symbol COMP symbol is {string}")
    public void iVerifyCOMPSymbol(String value) {
        new SymbolsBlock(driver).verifyCOMPSymbol(value);
    }

    @And("I set symbols COMP Symbol to {string}")
    public void iSetCOMPSymbol(String value) throws Throwable {
        new SymbolsBlock(driver).setCOMPSymbol(value);
    }
    // Symbol block steps - START

    // Territory factors block steps - END
    @And("I verify territory factors garaging location terr is {string}")
    public void iVerifyGaragingLocationTerr(String value) {
        new TerritoryFactorsBlock(driver).verifyGaragingLocationTerr(value);
    }

    @And("I verify territory factors garaging zip code is {string}")
    public void iVerifyGaragingZipcode(String value) {
        new TerritoryFactorsBlock(driver).verifyGaragingZipcode(value);
    }

    @And("I verify territory factors PD terr factor is {string}")
    public void iVerifyPDTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyPDTerrFactor(value);
    }

    @And("I verify territory factors COMP terr factor is {string}")
    public void iVerifyCOMPTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyCOMPTerrFactor(value);
    }

    @And("I verify territory factors COLL terr factor is {string}")
    public void iVerifyCOLLTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyCOLLTerrFactor(value);
    }

    @And("I verify territory factors COMP factor is {string}")
    public void iVerifyCOMPFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyCOMPFactor(value);
    }

    @And("I verify territory factors COLL factor is {string}")
    public void iVerifyCOLLFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyCOLLFactor(value);
    }

    @And("I verify territory factors BI terr factor is {string}")
    public void iVerifyBITerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyBITerrFactor(value);
    }

    @And("I verify territory factors MED terr factor is {string}")
    public void iVerifyMEDTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyMEDTerrFactor(value);
    }

    @And("I verify territory factors UIM is {string}")
    public void iVerifyUIM(String value) {
        new TerritoryFactorsBlock(driver).verifyUIM(value);
    }

    @And("I verify territory factors UM terr factor is {string}")
    public void iVerifyUMTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUMTerrFactor(value);
    }

    @And("I verify territory factors MP is {string}")
    public void iVerifyMP(String value) {
        new TerritoryFactorsBlock(driver).verifyMP(value);
    }

    @And("I verify territory factors UMBIUIMBI is {string}")
    public void iVerifyUMBIUIMBI(String value) {
        new TerritoryFactorsBlock(driver).verifyUMBIUIMBI(value);
    }

    @And("I verify territory factors UMPD is {string}")
    public void iVerifyUMPD(String value) {
        new TerritoryFactorsBlock(driver).verifyUMPD(value);
    }

    @And("I verify territory factors UMBI is {string}")
    public void iVerifyUMBI(String value) {
        new TerritoryFactorsBlock(driver).verifyUMBI(value);
    }

    @And("I verify territory factors PIP is {string}")
    public void iVerifyPIP(String value) {
        new TerritoryFactorsBlock(driver).verifyPIP(value);
    }

    @And("I verify territory factors UIMBI is {string}")
    public void iVerifyUIMBI(String value) {
        new TerritoryFactorsBlock(driver).verifyUIMBI(value);
    }

    @And("I verify territory factors UMPD terr factor is {string}")
    public void iVerifyUMPDTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUMPDTerrFactor(value);
    }

    @And("I verify territory factors UMUIM terr factor is {string}")
    public void iVerifyUMUIMTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUMUIMTerrFactor(value);
    }

    @And("I verify territory factors UMBI terr factor is {string}")
    public void iVerifyUMBITerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUMBITerrFactor(value);
    }

    @And("I verify territory factors UIMBI terr factor is {string}")
    public void iVerifyUIMBITerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUIMBITerrFactor(value);
    }

    @And("I verify territory factors UMBIUIM is {string}")
    public void iVerifyUMBIUIM(String value) {
        new TerritoryFactorsBlock(driver).verifyUMBIUIM(value);
    }

    @And("I verify territory factors basic FPB is {string}")
    public void iVerifyBasicFPB(String value) {
        new TerritoryFactorsBlock(driver).verifyBasicFPB(value);
    }

    @And("I verify territory factors added FPB MP is {string}")
    public void iVerifyAddedFPBMP(String value) {
        new TerritoryFactorsBlock(driver).verifyAddedFPBMP(value);
    }

    @And("I verify territory factors non stacked UMBI is {string}")
    public void iVerifyNonStackedUMBI(String value) {
        new TerritoryFactorsBlock(driver).verifyNonStackedUMBI(value);
    }

    @And("I verify territory factors non stacked UIMBI is {string}")
    public void iVerifyNonStackedUIMBI(String value) {
        new TerritoryFactorsBlock(driver).verifyNonStackedUIMBI(value);
    }

    @And("I verify territory factors stacked UMBI is {string}")
    public void iVerifyStackedUMBI(String value) {
        new TerritoryFactorsBlock(driver).verifyStackedUMBI(value);
    }

    @And("I verify territory factors stacked UIMBI is {string}")
    public void iVerifyStackedUIMBI(String value) {
        new TerritoryFactorsBlock(driver).verifyStackedUIMBI(value);
    }

    @And("I verify territory factors UIMPD is {string}")
    public void iVerifyUIMPD(String value) {
        new TerritoryFactorsBlock(driver).verifyUIMPD(value);
    }

    @And("I verify territory factors Tow is {string}")
    public void iVerifyTow(String value) {
        new TerritoryFactorsBlock(driver).verifyTow(value);
    }

    @And("I verify territory factors Rental is {string}")
    public void iVerifyRental(String value) {
        new TerritoryFactorsBlock(driver).verifyRental(value);
    }

    @And("I verify territory factors UIM_BI is {string}")
    public void iVerifyUIM_BI(String value) {
        new TerritoryFactorsBlock(driver).verifyUIM_BI(value);
    }

    @And("I verify territory factors BI factor is {string}")
    public void iVerifyBIFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyBIFactor(value);
    }

    @And("I verify territory factors PD factor is {string}")
    public void iVerifyPDFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyPDFactor(value);
    }

    @And("I verify territory factors UMBI factor is {string}")
    public void iVerifyUMBIFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUMBIFactor(value);
    }

    @And("I verify territory factors UMPD factor is {string}")
    public void iVerifyUMPDFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUMPDFactor(value);
    }

    @And("I verify territory factors comp endorsement Fctr is {string}")
    public void iVerifyCompEndorsementFctr(String value) {
        new TerritoryFactorsBlock(driver).verifyCompEndorsementFctr(value);
    }

    @And("I verify territory factors col endorsement Fctr is {string}")
    public void iVerifyColEndorsementFctr(String value) {
        new TerritoryFactorsBlock(driver).verifyColEndorsementFctr(value);
    }

    @And("I verify territory factors UM_UIM terr factor is {string}")
    public void iVerifyUM_UIMTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyUM_UIMTerrFactor(value);
    }

    @And("I verify territory factors APIP is {string}")
    public void iVerifyAPIP(String value) {
        new TerritoryFactorsBlock(driver).verifyAPIP(value);
    }

    @And("I verify territory factors PD is {string}")
    public void iVerifyPD(String value) {
        new TerritoryFactorsBlock(driver).verifyPD(value);
    }

    @And("I verify territory factors BI is {string}")
    public void iVerifyBI(String value) {
        new TerritoryFactorsBlock(driver).verifyBI(value);
    }

    @And("I verify territory factors MED PAY is {string}")
    public void iVerifyMEDPAY(String value) {
        new TerritoryFactorsBlock(driver).verifyMEDPAY(value);
    }

    @And("I verify territory factors LIM COLL is {string}")
    public void iVerifyLIMCOLL(String value) {
        new TerritoryFactorsBlock(driver).verifyLIMCOLL(value);
    }

    @And("I verify territory factors UM is {string}")
    public void iVerifyUM(String value) {
        new TerritoryFactorsBlock(driver).verifyUM(value);
    }

    @And("I verify territory factors OBEL is {string}")
    public void iVerifyOBEL(String value) {
        new TerritoryFactorsBlock(driver).verifyOBEL(value);
    }

    @And("I verify territory factors PIP terr factor is {string}")
    public void iVerifyPIPTerrFactor(String value) {
        new TerritoryFactorsBlock(driver).verifyPIPTerrFactor(value);
    }

    @And("I verify territory factors ME is {string}")
    public void iVerifyME(String value) {
        new TerritoryFactorsBlock(driver).verifyME(value);
    }

    @And("I verify territory factors PPI is {string}")
    public void iVerifyPPI(String value) {
        new TerritoryFactorsBlock(driver).verifyPPI(value);
    }
    // Territory factors block steps - END

    @And("I visit vehicle detail page and verify NADA and CARFAX")
    public void iVerifyNadaAndCarfax() throws Throwable {
        VehicleDetailsBlock detailsBlock = new VehicleDetailsBlock(driver);

        for (int i = 0; i < data.get("Additional_Vehicles").split(",").length; i++) {
            iVisitVehicleDetailsNode();
            pause(5);
            // MI Auto doesn't have Carfax implemented 02/05/2024
            if (!data.get("State").equalsIgnoreCase("MI"))
                detailsBlock.verifyCarfax();

            detailsBlock.verifyNada("NotEmpty");
        }
    }

    @And("I visit vehicle detail page and verify CARFAX")
    public void iVerifyCarfax() throws Throwable {
        VehicleDetailsBlock detailsBlock = new VehicleDetailsBlock(driver);
            iVisitVehicleDetailsNode();
            pause(5);
            detailsBlock.verifyCarfax();
    }

    @And("I visit vehicle detail page on NB and change agreed value to {string}")
    public void iChangeAgreedValueTo(String val) throws Throwable {
        iVisitVehicleDetailsNode();
        pause(3);
        try {
            new VehicleDetailsBlock(driver).setCurrentTermOverride("Yes", val);
        } catch (Exception e) {
            // No checkbox
        }
        pause(2);
        if (data.get("Vehicle_Details_Vehicle_Type_1").equalsIgnoreCase("Private Passenger")) {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).sendKeys(val);
        } else {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).sendKeys(val);
        }
        driver.findElement(By.cssSelector("#footer-panel-innerCt")).click();
    }

    @And("I visit vehicle detail page on renewal and change agreed value to {string}")
    public void iChangeAgreedValueOnRenewalTo(String val) throws Throwable {
        iVisitVehicleDetailsNode();
        pause(3);
        try {
            new VehicleDetailsBlock(driver).setPermanentOverride("Yes", val);
        } catch (Exception e) {
            // No checkbox
        }
        pause(2);
        if (data.get("Vehicle_Details_Vehicle_Type_1").equalsIgnoreCase("Private Passenger")) {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).sendKeys(val);
        } else {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).sendKeys(val);
        }
        driver.findElement(By.cssSelector("#footer-panel-innerCt")).click();
    }

    @And("I visit vehicle detail page on OOS and change agreed value to {string}")
    public void iChangeAgreedValueOnOOSTo(String val) throws Throwable {
        iVisitVehicleDetailsNode();
        pause(3);
        try {
            new VehicleDetailsBlock(driver).setPermanentOverride("Yes", val);
        } catch (Exception e) {
            // No checkbox
        }
        pause(2);
        if (data.get("Vehicle_Details_Vehicle_Type_1").equalsIgnoreCase("Private Passenger")) {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).sendKeys(val);
        } else {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).sendKeys(val);
        }
        driver.findElement(By.cssSelector("#footer-panel-innerCt")).click();
    }

    @And("I visit vehicle detail page on endorsement and change agreed value to {string}")
    public void iChangeAgreedValueOnEndorsementTo(String val) throws Throwable {
        iVisitVehicleDetailsNode();
        pause(3);
        try {
            new VehicleDetailsBlock(driver).setPermanentOverride("Yes", val);
        } catch (Exception e) {
            // No checkbox
        }
        pause(2);
        if (data.get("Vehicle_Details_Vehicle_Type_1").equalsIgnoreCase("Private Passenger")) {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value Current Term')]/../../../..//input")).sendKeys(val);
        } else {
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).clear();
            driver.findElement(By.xpath("//div[contains(text(),'Agreed Value')]/../../../..//input[1]")).sendKeys(val);
        }
        driver.findElement(By.cssSelector("#footer-panel-innerCt")).click();
    }

    @And("I click add loss payee or additional interest on vehicle details page")
    public void iAddLossPayeeOrAdditionalInterest() throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).clickAddPayee();
    }

    @And("I set loss payee or interest {int} type to {string} on vehicle details page")
    public void iSetLossPayeeTypeTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setInterestType(value, index);
    }

    @And("I set loss payee or interest {int} llc or trust to {string} on vehicle details page")
    public void iSetLossPayeeLLCOrTrustTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setLLCOrTrust(value, index);
    }

    @And("I set loss payee or interest {int} name to {string} on vehicle details page")
    public void iSetLossPayeeNameTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setName(value, index);
    }

    @And("I set loss payee or interest {int} street address to {string} on vehicle details page")
    public void iSetLossPayeeStreetAddressTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setStreetAddress(value, index);
    }

    @And("I set loss payee or interest {int} city to {string} on vehicle details page")
    public void iSetLossPayeeCityTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setCity(value, index);
    }

    @And("I set loss payee or interest {int} state to {string} on vehicle details page")
    public void iSetLossPayeeStateTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setState(value, index);
    }

    @And("I set loss payee or interest {int} ZIP to {string} on vehicle details page")
    public void iSetLossPayeeZIPTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setZIP(value, index);
    }

    @And("I set loss payee or interest {int} Zip to {string} on vehicle details page")
    public void iSetLossPayeeZipTo(int index, String value) throws Throwable {
        new LossPayeeAdditionalInterestBlock(driver).setZIP(value, index);
    }

    @And("I navigate to vehicle {int} details page")
    public void iVisitVehicleNumDetailsPage(int index) throws Throwable {
        new VehiclesDetailsPage(driver).navigateToVehicleDetailsPage(data,
                "Vehicle_Details_Year_" + index,
                "Vehicle_Details_Make_" + index,
                "Vehicle_Details_Model_" + index);
    }

    @And("I change vehicle ownership to {string}")
    public void iChangeOwnershipTo(String value) throws Throwable {
        new OwnershipBlock(driver).setOwnership(value);
    }

    private void iVisitVehicleDetailsNode() throws Throwable {
        VehicleDetailsBlock detailsBlock = new VehicleDetailsBlock(driver);

        String[] additionalVehicles = data.get("Additional_Vehicles").split(",");
        //Maybe add additional logic to check only for PPA in the future
        for (int i = 1; i <= additionalVehicles.length; i++) {
            new VehiclesDetailsPage(driver).navigateToVehicleDetailsPage(data,
                    "Vehicle_Details_Year_" + i,
                    "Vehicle_Details_Make_" + i,
                    "Vehicle_Details_Model_" + i);
        }
        //TODO PA - Move this from steps class
    }

    @Then("I verify vehicle characteristics block is displayed with")
    public void iVerifyVehicleCharacteristicsBlockIsDisplayedWith(DataTable table) {
        new VehiclesDetailsPage(driver).verifyVehicleCharacteristicsBlock(table);
    }

    @Then("I verify symbols block is displayed with")
    public void iVerifySymbolsBlockIsDisplayedWith(DataTable table) {
        new VehiclesDetailsPage(driver).verifyVehicleSymbolsBlock(table);
    }

    @Then("I verify vehicle characteristics block is not displayed")
    public void iVerifyVehicleCharacteristicsBlockIsNotDisplayed() {
        new VehiclesDetailsPage(driver).verifyVehicleCharacteristicsBlockIsNotDisplayed();
    }

    @Then("I verify {string} field is displayed")
    public void iVerifyFieldIsDisplayed(String label) {
        new CommonComponentsAndActions(driver).verifyInputFieldExists(label);
    }

    @Then("I verify {string} field is not displayed")
    public void iVerifyFieldIsNotDisplayed(String label) {
        new CommonComponentsAndActions(driver).verifyInputFieldDoesNotExist(label);
    }

    @Then("I verify private passenger carfax fields")
    public void iVerifyPrivatePassengerCarfaxFields(DataTable table) {
        new VehicleDetailsBlock(driver).verifyCarfax(table, "PrivatePassenger");
    }

    @Then("I verify classic collectors carfax fields")
    public void iVerifyClassicCollectorsCarfaxFields(DataTable table) {
        new VehicleDetailsBlock(driver).verifyCarfax(table, "ClassicCollectors");
    }

    @Then("I verify antique collectors carfax fields")
    public void iVerifyAntiqueCollectorsCarfaxFields(DataTable table) {
        new VehicleDetailsBlock(driver).verifyCarfax(table, "AntiqueCollectors");
    }

    @Then("I verify exotic collectors carfax fields")
    public void iVerifyExoticCollectorsCarfaxFields(DataTable table) {
        new VehicleDetailsBlock(driver).verifyCarfax(table, "ExoticCollectors");
    }

    @Then("I verify vehicle characteristics block is first block under lost payee block")
    public void iVerifyVehicleCharacteristicsBlockIsFirstBlockUnderLostPayeeBlock() {
        new VehicleCharacteristicsBlock(driver).verifyPositionAfterLossPayeeBlock();
    }

    @Then("I verify that {string} input {string} is not visible")
    public void iVerifyThatInputIsNotVisible(String text, String pos) {
        new VehicleDetailsBlock(driver).verifyCellNotExistsByLabel(text, Integer.parseInt(pos));
    }

    @Then("I verify that {string} input {string} is visible")
    public void iVerifyThatInputIsVisible(String text, String pos) {
        new VehicleDetailsBlock(driver).verifyCellExistsByLabel(text, Integer.parseInt(pos));
    }

    @Then("I verify message {string} is shown")
    public void iVerifyMessageIsVisible(String text) {
        new VehicleDetailsBlock(driver).verifyMessage(text);
    }

    @Then("I verify message {string} is not shown")
    public void iVerifyMessageIsNotVisible(String text) {
        new VehicleDetailsBlock(driver).verifyMessageNotExists(text);
    }

    @And("I navigate to vehicle {int} details from {string}")
    public void iVisitVehicleNumDetailsPage(int index, String transaction) throws Throwable {
       if (transaction.equalsIgnoreCase("New Business")){
           new VehiclesDetailsPage(driver).navigateToVehicleDetailsPage(data,
                   "Vehicle_Details_Year_" + index,
                   "Vehicle_Details_Make_" + index,
                   "Vehicle_Details_Model_" + index);
       }else if(transaction.equalsIgnoreCase("Endorsement")) {
           new VehiclesDetailsPage(driver).navigateToVehicleDetailsPage(data,
                   "Vehicle_Details_Year_END_" + index,
                   "Vehicle_Details_Make_END_" + index,
                   "Vehicle_Details_Model_END_" + index);
       }else {
           new VehiclesDetailsPage(driver).navigateToVehicleDetailsPage(data,
                   "Vehicle_Details_Year_RNW_" + index,
                   "Vehicle_Details_Make_RNW_" + index,
                   "Vehicle_Details_Model_RNW_" + index);
       }
    }

}