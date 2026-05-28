package pages;

import excel.DataManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WatercraftPolicyCoverPage extends CommonComponentsAndActions {

    WebDriver driver;
    Map<String, String> data = DataManager.getInstance().getData();
    PolicyInformationBlock policyInformationBlock;
    WatercraftGTE27FeetBlock watercraftGTE27FeetBlock;
    WatercraftObtainedThroughOnlineReportsBlock watercraftObtainedThroughOnlineReportsBlock;
    WatercraftObtainedFromMemberAccountBlock watercraftObtainedFromMemberAccountBlock;
    ManuallyEnteredWatercraftBlock manuallyEnteredWatercraftBlock;
    ListOfOperatorsBlock listOfOperatorsBlock;
    InsuranceInformationBlock insuranceInformationBlock;
    WatercraftInformationBlock watercraftInformationBlock;

    public WatercraftPolicyCoverPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        policyInformationBlock = new PolicyInformationBlock(driver);
        watercraftGTE27FeetBlock = new WatercraftGTE27FeetBlock(driver);
        watercraftObtainedThroughOnlineReportsBlock = new WatercraftObtainedThroughOnlineReportsBlock(driver);
        watercraftObtainedFromMemberAccountBlock = new WatercraftObtainedFromMemberAccountBlock(driver);
        manuallyEnteredWatercraftBlock = new ManuallyEnteredWatercraftBlock(driver);
        listOfOperatorsBlock = new ListOfOperatorsBlock(driver);
        insuranceInformationBlock = new InsuranceInformationBlock(driver);
        watercraftInformationBlock = new WatercraftInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Watercraft Policy']")
    WebElement watercraftPolicy;


    public void fillOutWatercraftPolicyCoverPage(Map<String, String> data) throws Throwable {
        if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("WA")) {
            policyInformationBlock.fillPolicyInformationDetailsPW(data);
            verifyBlockExists("primary address");
            watercraftGTE27FeetBlock.fillWatercraftGTE27Details(data);
            watercraftObtainedThroughOnlineReportsBlock.fillWatercraftObtainedThroughOnlineReportsDetails(data);
            watercraftObtainedFromMemberAccountBlock.fillWatercraftObtainedFromMemberAccountDetails(data);
            manuallyEnteredWatercraftBlock.fillManuallyEnteredWatercraftDetails(data);
            listOfOperatorsBlock.fillListOfOperatorsDetails(data);
            saveChanges();
        } else {
            policyInformationBlock.fillPolicyInformationDetailsPW(data);
            insuranceInformationBlock.fillInsuranceInformationDetailsPW(data);
            watercraftInformationBlock.fillWatercraftInformationDetailsPW(data);
        }
    }

    public void addWatercraftAndFillBasicDetails(String state, String policyType, String year, String manufacturer,
                              String model, String length, String hullMachineryValue) throws Throwable {

        int index;
        if (state.equalsIgnoreCase("CA") || state.equalsIgnoreCase("WA")) {
            watercraftInformationBlock.clickAdd();
            index = watercraftInformationBlock.returnIndexOfLastWatercraft();
            watercraftInformationBlock.setYearPW(year, state, index);
            watercraftInformationBlock.setManufacturerPW(manufacturer, state, index);
            watercraftInformationBlock.setModelPW(model, state, index);
            watercraftInformationBlock.setHullAndMachineryLimit(hullMachineryValue, state, index);
            watercraftInformationBlock.setLengthPW(length, state, index);
        } else {
            manuallyEnteredWatercraftBlock.clickAdd();
            index = manuallyEnteredWatercraftBlock.returnIndexOfLastWatercraft();
            manuallyEnteredWatercraftBlock.setPolicyType(policyType, index);
            manuallyEnteredWatercraftBlock.setYear(year, index);
            manuallyEnteredWatercraftBlock.setManufacturer(manufacturer, index);
            manuallyEnteredWatercraftBlock.setModel(model, index);
            manuallyEnteredWatercraftBlock.setLength(length, index);
        }
        saveChanges();

        data.put("Year", year);
        data.put("Manufacturer", manufacturer);
        data.put("Model", model);

        goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
        new WatercraftVehiclePage(driver).fillWatercraftVehiclePageDetails(data);

        if (goToPage("Vessel Underwriting"))
            new VesselUnderwritingPage(driver).fillVesselUnderwritingDetails(data);

        if (goToPage("Vessel Coverage"))
            new VesselCoveragePage(driver).fillVesselCoverageDetails(data);
    }

    public void navigateToWatercraftPolicyPage() {
       clickElement(watercraftPolicy, "Watercraft Policy");
    }

}