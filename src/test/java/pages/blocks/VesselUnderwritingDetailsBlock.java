package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class VesselUnderwritingDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public VesselUnderwritingDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Is the vessel chartered')]/../../../..//label[text()='No']/..//input")
    WebElement vesselChartedToOthersNo;
    @FindBy(xpath = "//div[contains(text(),'Is the vessel chartered')]/../../../..//label[text()='Yes']/..//input")
    WebElement vesselChartedToOthersYes;
    @FindBy(xpath = "//div[text()='Is the vessel used for racing?']/../../../..//label[text()='No']/..//input")
    WebElement vesselUsedForRacingNo;
    @FindBy(xpath = "//div[text()='Is the vessel used for racing?']/../../../..//label[text()='Yes']/..//input")
    WebElement vesselUsedForRacingYes;
    @FindBy(xpath = "//div[text()='Was the vessel purchased as salvage or previously damaged?']/../../../..//label[text()='No']/..//input")
    WebElement vesselSalvageOrDamagedNo;
    @FindBy(xpath = "//div[text()='Was the vessel purchased as salvage or previously damaged?']/../../../..//label[text()='Yes']/..//input")
    WebElement vesselSalvageOrDamagedYes;
    @FindBy(xpath = "//div[text()='Is the vessel used for waterskiing?']/../../../..//label[text()='No']/..//input")
    WebElement vesselUsedForWaterskiingNo;
    @FindBy(xpath = "//div[text()='Are any full-time or part-time crew employed in service of yacht?']/../../../..//label[text()='Yes']/..//input")
    WebElement fullTimePartTimeCrewEmployedYes;
    @FindBy(xpath = "//div[text()='Are any full-time or part-time crew employed in service of yacht?']/../../../..//label[text()='No']/..//input")
    WebElement fullTimePartTimeCrewEmployedNo;
    @FindBy(xpath = "//div[text()='Is the vessel used for waterskiing?']/../../../..//label[text()='Yes']/..//input")
    WebElement vesselUsedForWaterskiingYes;
    @FindBy(xpath = "//div[text()='Do you employ any captain or crew?']/../../../..//label[text()='No']/..//input")
    WebElement vesselEmployCaptainOrCrewNo;
    @FindBy(xpath = "//div[text()='Do you employ any captain or crew?']/../../../..//label[text()='Yes']/..//input")
    WebElement vesselEmployCaptainOrCrewYes;
    @FindBy(xpath = "//div[text()='Any existing damage to the vessel?']/../../../..//label[text()='No']/..//input")
    WebElement vesselExistingDamageNo;
    @FindBy(xpath = "//div[text()='Any existing damage to the vessel?']/../../../..//label[text()='Yes']/..//input")
    WebElement vesselExistingDamageYes;
    @FindBy(xpath = "//div[contains(text(),'Is the vessel currently for sale?')]/../../../..//label[text()='No']/..//input")
    WebElement vesselCurrentlyForSaleNo;
    @FindBy(xpath = "//div[contains(text(),'Is the vessel currently for sale?')]/../../../..//label[text()='Yes']/..//input")
    WebElement vesselCurrentlyForSaleYes;
    @FindBy(xpath = "//div[contains(text(),'Is the vessel used commercially or for business purposes?')]/../../../..//label[text()='No']/..//input")
    WebElement vesselUsedCommerciallyNo;
    @FindBy(xpath = "//div[contains(text(),'Is the vessel used commercially or for business purposes?')]/../../../..//label[text()='Yes']/..//input")
    WebElement vesselUsedCommerciallyYes;

    public void fillVesselUnderwritingDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("vessel underwriting details");
        if (data.get("Vehicle_GTE_27_Feet").equalsIgnoreCase("Yes") && Integer.parseInt(data.get("Length")) > 27) {
            setVesselChartedToOthers(data.get("Vessel_Charted_To_Others"));
            setVesselUsedForRacing(data.get("Vessel_Used_For_Racing"));
            setVesselSalvageOrDamaged(data.get("Vessel_Salvage_Or_Damaged"));
            setFullTimePartTimeCrew(data.get("Full_Time_Part_Time_Crew"));
            setVesselUsedForWaterskiing(data.get("Vessel_Used_For_Waterskiing"));
            setIsVesselCurrentlyForSale(data.get("Vessel_Currently_For_Sale"));
            setVesselExistingDamage(data.get("Vessel_Existing_Damage"));
        } else if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("WA")) {
            setVesselChartedToOthers(data.get("Vessel_Charted_To_Others"));
            setVesselUsedForRacing(data.get("Vessel_Used_For_Racing"));
            setVesselSalvageOrDamaged(data.get("Vessel_Salvage_Or_Damaged"));
            setVesselUsedForWaterskiing(data.get("Vessel_Used_For_Waterskiing"));
            setVesselEmployCaptainOrCrew(data.get("Vessel_Employ_Captain_Or_Crew"));
            setVesselExistingDamage(data.get("Vessel_Existing_Damage"));
        } else {
            setIsVesselCurrentlyForSale(data.get("Vessel_Currently_For_Sale"));
            setVesselChartedToOthers(data.get("Vessel_Charted_To_Others"));
            setIsTheVesselUsedCommerciallyOrForBusiness(data.get("Vessel_Used_Commercially"));
            setVesselUsedForRacing(data.get("Vessel_Used_For_Racing"));
            setVesselUsedForWaterskiing(data.get("Vessel_Used_For_Waterskiing"));
            setVesselSalvageOrDamaged(data.get("Vessel_Salvage_Or_Damaged"));
            setVesselExistingDamage(data.get("Vessel_Existing_Damage"));
        }
    }

    private void setIsVesselCurrentlyForSale(String value) throws Throwable {
        choose(vesselCurrentlyForSaleYes, vesselCurrentlyForSaleNo, value);
    }

    private void setIsTheVesselUsedCommerciallyOrForBusiness(String value) throws Throwable {
        choose(vesselUsedCommerciallyYes, vesselUsedCommerciallyNo, value);
    }

    private void setVesselChartedToOthers(String value) throws Throwable {
        choose(vesselChartedToOthersYes, vesselChartedToOthersNo, value);
    }

    private void setVesselUsedForRacing(String value) throws Throwable {
        choose(vesselUsedForRacingYes, vesselUsedForRacingNo, value);
    }

    private void setVesselSalvageOrDamaged(String value) throws Throwable {
        choose(vesselSalvageOrDamagedYes, vesselSalvageOrDamagedNo, value);
    }

    private void setVesselUsedForWaterskiing(String value) throws Throwable {
        choose(vesselUsedForWaterskiingYes, vesselUsedForWaterskiingNo, value);
    }

    private void setVesselEmployCaptainOrCrew(String value) throws Throwable {
        choose(vesselEmployCaptainOrCrewYes, vesselEmployCaptainOrCrewNo, value);
    }

    private void setVesselExistingDamage(String value) throws Throwable {
        choose(vesselExistingDamageYes, vesselExistingDamageNo, value);
    }

    private void setFullTimePartTimeCrew(String value) throws Throwable {
        choose(fullTimePartTimeCrewEmployedYes, fullTimePartTimeCrewEmployedNo, value);
    }
}