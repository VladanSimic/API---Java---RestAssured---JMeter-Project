package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class InsuranceInformationBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public InsuranceInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label//div[text()='Current Homeowners Insurance Carrier']/../../../..//input")
    WebElement currentHomeownersInsuranceCarrier;
    @FindBy(xpath = "//label//div[text()='Current Premium']/../../../..//input")
    List<WebElement> currentPremium;
    @FindBy(xpath = "//label//div[text()='Carrier Name']/../../../..//input")
    WebElement carrierName;
    @FindBy(xpath = "//label//div[text()='Insurance Score Tier']/../../../..//input")
    WebElement insuranceScoreTier;
    @FindBy(xpath = "//label//div[text()='Most Recent Insurance Score Tier']/../../../..//input")
    WebElement mostRecentScoreTier;
    @FindBy(xpath = "//label//div[text()='Insurance Score for Rating']/../../../..//input")
    WebElement insuranceScoreForRating;
    @FindBy(xpath = "//label//div[text()='Most Recent Insurance Score']/../../../..//input")
    WebElement mostRecentInsuranceScore;
    @FindBy(xpath = "//div[contains(text(),'Current/ Prior')]/../../../..//input")
    WebElement currentPriorCarrier;
    @FindBy(xpath = "//div[text()='Lapse in Coverage?']/../../../..//input")
    WebElement lapsInCoverage;
    @FindBy(xpath = "//div[text()='For']/../../../..//input")
    WebElement foR;
    @FindBy(xpath = "//div[text()='Premium ($)']/../../../..//input")
    WebElement premium;
    @FindBy(xpath = "//label//div[text()='Current Collections Insurance Company']/../../../..//input")
    List<WebElement> currentCollectionsInsuranceCompany;
    @FindBy(xpath = "//label//div[text()='Current Excess Liability Insurance Carrier']/../../../..//input")
    List<WebElement> currentExcessLiabilityInsuranceCarrier;
    @FindBy(xpath = "//div[text()='Current Primary Flood Insurance Carrier']/../../../..//input")
    WebElement currentPFInsuranceCarrier;

    public void fillInsuranceInformationDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("insurance information");
        setCurrentPriorCarrier(data.get("Insurance_Information_Current_Prior_Carrier"));
        setLapsInCoverage(data.get("Insurance_Information_Lapse_In_Coverage"));
        saveChanges();
        setFoR(data.get("Insurance_Information_For"));
        setPremium(data.get("Insurance_Information_Premium"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsPA_END(Map<String, String> data) throws Throwable {
        setCurrentPriorCarrier(data.get("Insurance_Information_Current_Prior_Carrier_END"));
        setLapsInCoverage(data.get("Insurance_Information_Lapse_In_Coverage_END"));
        saveChanges();
        setFoR(data.get("Insurance_Information_For_END"));
        setPremium(data.get("Insurance_Information_Premium_END"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setCurrentPriorCarrier(data.get("Insurance_Information_Current_Prior_Carrier_OOS_END"));
        setLapsInCoverage(data.get("Insurance_Information_Lapse_In_Coverage_OOS_END"));
        saveChanges();
        setFoR(data.get("Insurance_Information_For_OOS_END"));
        setPremium(data.get("Insurance_Information_Premium_OOS_END"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setCurrentPriorCarrier(data.get("Insurance_Information_Current_Prior_Carrier_RNW"));
        setLapsInCoverage(data.get("Insurance_Information_Lapse_In_Coverage_RNW"));
        saveChanges();
        setFoR(data.get("Insurance_Information_For_RNW"));
        setPremium(data.get("Insurance_Information_Premium_RNW"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsCO(Map<String, String> data) throws Throwable {
        pause(3000);
        verifyBlockExists("insurance information");
        try {
            setCurrentCollectionsInsuranceCompany(data.get("Current_Collections_Insurance_Company"));
        } catch (Exception e) {

        }
        setCurrentPremium(data.get("Current_Premium"));
    }

    public void fillInsuranceInformationDetailsHS(Map<String, String> data) throws Throwable {
        pause(3000);
        verifyBlockExists("insurance information");
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium"));
        checkAndReEnterInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsHS_END(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier_END"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium_END"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier_OOS_END"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium_OOS_END"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier_RNW"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium_RNW"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsES(Map<String, String> data) throws Throwable {
        pause(3000);
        setCurrentESInsuranceCompany(data.get("Current_ES_Insurance_Company"));
        setCurrentPremium(data.get("Current_Premium"));
        verifyBlockExists("insurance information");
    }

    public void fillInsuranceInformationDetailsPW(Map<String, String> data) throws Throwable {
        verifyBlockExists("insurance information");
    }

    public void fillInsuranceInformationDetailsCC(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium"));
        setCarrierName(data.get("Insurance_Information_Carrier_Name"));
        saveChanges();
    }

    public void fillInsuranceInformationDetailsHO(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium"));
        saveChanges();
        verifyBlockExists("insurance information");
    }

    public void fillInsuranceInformationDetailsHO_END(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier_END"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium_END"));
        saveChanges();
        verifyBlockExists("insurance information");
    }

    public void fillInsuranceInformationDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier_OOS_END"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium_OOS_END"));
        saveChanges();
        verifyBlockExists("insurance information");
    }

    public void fillInsuranceInformationDetailsHO_RNW(Map<String, String> data) throws Throwable {
        setCurrentHomeownersInsuranceCarrier(data.get("Insurance_Information_Current_Homeowners_Insurance_Carrier_RNW"));
        setCurrentPremium(data.get("Insurance_Information_Current_Premium_RNW"));
        saveChanges();
        verifyBlockExists("insurance information");
    }

    public void setCurrentHomeownersInsuranceCarrier(String CHICarrier) throws InterruptedException {
        typeTextEnter(currentHomeownersInsuranceCarrier, CHICarrier, "Current homeowner insurance carrier");
        pause(2000);
    }

    public void checkAndReEnterInsuranceCarrier(String CHICarrier) throws Throwable {
        if (!currentHomeownersInsuranceCarrier.getAttribute("value").equalsIgnoreCase(CHICarrier)) {
            typeTextEnter(currentHomeownersInsuranceCarrier, CHICarrier, "Current homeowner insurance carrier");
            clickFooter();
        }
    }

    public void setCurrentPremium(String CPremium) {
        if (currentPremium.size() > 0) {
            typeText(currentPremium.get(0), CPremium, "Current premium");
        }
    }

    public void setCarrierName(String value) {
        typeText(carrierName, value, "Carrier name");
    }

    public void setCurrentCollectionsInsuranceCompany(String CCIC) throws Throwable {
        if (currentCollectionsInsuranceCompany.size() > 0) {
            try {
                typeText(currentCollectionsInsuranceCompany.get(0), CCIC);
            } catch (Exception e) {
                //
            }
        }
    }

    public void setCurrentESInsuranceCompany(String CCIC) throws Throwable {
        if (currentExcessLiabilityInsuranceCarrier.size() > 0) {
            try {
                typeTextEnter(currentExcessLiabilityInsuranceCarrier.get(0), CCIC, "Current Excess Insurance Carrier");
            } catch (Exception e) {
                //
            }
        }
    }

    public void setInsuranceScoreTier(String ISTier) {
        insuranceScoreTier.sendKeys(ISTier);
    }

    public void setMostRecentScoreTier(String MRSTier) {
        mostRecentScoreTier.sendKeys(MRSTier);
    }

    public void setInsuranceScoreForRating(String ISFRating) {
        insuranceScoreForRating.sendKeys(ISFRating);
    }

    public void setMostRecentInsuranceScore(String MRIScore) {
        mostRecentInsuranceScore.sendKeys(MRIScore);
    }

    public void setCurrentPriorCarrier(String currentPriorCarrierValue) {
        //setAttributeValue(currentPriorCarrier,"value",currentPriorCarrierValue);
    }

    public void setLapsInCoverage(String lapsInCoverageValue) throws Throwable {
        pause(3000);
        typeText(lapsInCoverage, lapsInCoverageValue);
        //setAttributeValue(lapsInCoverage,"value",lapsInCoverageValue);
    }

    public void setFoR(String FoR) {
        //setAttributeValue(foR,"value",FoR);
    }

    public void setPremium(String premiumValue) throws Throwable {
        typeText(premium, premiumValue);
    }

    public void fillInsuranceInformationDetailsFS(Map<String, String> data) throws Throwable {
        verifyBlockExists("insurance information");
        setCurrentPrimaryFloodInsuranceCarrier(data.get("Current_Primary_Flood_Insurance_Carrier"));
    }

    public void setCurrentPrimaryFloodInsuranceCarrier(String currentPrimaryFloodInsuranceCarrier) throws InterruptedException {
        typeTextEnter(currentPFInsuranceCarrier, currentPrimaryFloodInsuranceCarrier, "Current primary flood insurance carrier");
        pause(2000);
    }

}