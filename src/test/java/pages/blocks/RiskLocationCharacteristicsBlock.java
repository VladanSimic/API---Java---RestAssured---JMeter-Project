package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class RiskLocationCharacteristicsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public RiskLocationCharacteristicsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Burglar Alarm')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement burglarAlarmYes;
    @FindBy(xpath = "//div[contains(text(),'Burglar Alarm')]/../../../../div//label[text()='No']/../span/input")
    WebElement burglarAlarmNo;
    @FindBy(xpath = "//div[contains(text(),'Fire Alarm')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement fireAlarmYes;
    @FindBy(xpath = "//div[contains(text(),'Fire Alarm')]/../../../../div//label[text()='No']/../span/input")
    WebElement fireAlarmNo;
    @FindBy(xpath = "//div[contains(text(),'unoccupied for 3')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement unoccupiedFor3Yes;
    @FindBy(xpath = "//div[contains(text(),'unoccupied for 3')]/../../../../div//label[text()='No']/../span/input")
    WebElement unoccupiedFor3No;
    @FindBy(xpath = "//div[contains(text(),'live-in full time caretaker')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement fullTimeCaretakerYes;
    @FindBy(xpath = "//div[contains(text(),'live-in full time caretaker')]/../../../../div//label[text()='No']/../span/input")
    WebElement fullTimeCaretakerNo;
    @FindBy(xpath = "//div[contains(text(),'permanently installed generator')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement permanentlyInstalledGeneratorYes;
    @FindBy(xpath = "//div[contains(text(),'permanently installed generator')]/../../../../div//label[text()='No']/../span/input")
    WebElement permanentlyInstalledGeneratorNo;
    @FindBy(xpath = "//div[contains(text(),'insured risk shuttered')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement insuredRiskShutteredYes;
    @FindBy(xpath = "//div[contains(text(),'insured risk shuttered')]/../../../../div//label[text()='No']/../span/input")
    WebElement insuredRiskShutteredNo;
    @FindBy(xpath = "//div[text()='Construction Type of Home']/../../../../div//input")
    WebElement constructionTypeOfHome;
    @FindBy(xpath = "//div[text()='Protection Class Code']/../../../../div//input")
    WebElement protectionClassCOde;
    @FindBy(xpath = "//div[text()='Number of Floors at the Risk Location']/../../../../div//input")
    WebElement noOfFloorsRiskLocation;
    @FindBy(xpath = "//div[text()='Year Built']/../../../../div//input")
    WebElement yearBuilt;
    @FindBy(xpath = "//div[contains(text(),'located on a grade that is')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement locatedOnGradeThatIsYes;
    @FindBy(xpath = "//div[contains(text(),'located on a grade that is')]/../../../../div//label[text()='No']/../span/input")
    WebElement locatedOnGradeThatIsNo;
    @FindBy(xpath = "//div[contains(text(),'supported by stilts, posts')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement supportedByStiltsPostsYes;
    @FindBy(xpath = "//div[contains(text(),'supported by stilts, posts')]/../../../../div//label[text()='No']/../span/input")
    WebElement supportedByStiltsPostsNo;
    @FindBy(xpath = "//div[contains(text(),'Automatic Seismic Shut-Off')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement automaticSeismicShutOffYes;
    @FindBy(xpath = "//div[contains(text(),'Automatic Seismic Shut-Off')]/../../../../div//label[text()='No']/../span/input")
    WebElement automaticSeismicShutOffNo;


    //CO
    public void fillRiskLocationCharacteristics(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk location characteristics");
        choose(burglarAlarmYes, burglarAlarmNo, data.get("Risk_Location_Burglar_Alarm"));
        choose(fireAlarmYes, fireAlarmNo, data.get("Risk_Location_Fire_Alarm"));
        choose(unoccupiedFor3Yes, unoccupiedFor3No, data.get("Unoccupied_3_months"));
        choose(fullTimeCaretakerYes, fullTimeCaretakerNo, data.get("Risk_Location_live_in_Caretaker"));
        choose(permanentlyInstalledGeneratorYes, permanentlyInstalledGeneratorNo, data.get("Home_Permanently_Installed_Generator"));
        if (!data.get("State").equalsIgnoreCase("CA")) {
            choose(insuredRiskShutteredYes, insuredRiskShutteredNo, data.get("Insured_Risk_Shuttered"));
        } else {
            typeText(noOfFloorsRiskLocation, data.get("No_Floors_Risk_Location"));
            typeText(yearBuilt, data.get("Year_Built"));
            choose(locatedOnGradeThatIsYes, locatedOnGradeThatIsNo, data.get("Located_On_Grade_That_Is_20"));
            choose(supportedByStiltsPostsYes, supportedByStiltsPostsNo, data.get("Supported_By_Stilts_Posts"));
            choose(automaticSeismicShutOffYes, automaticSeismicShutOffNo, data.get("Automatic_Seismic_Shut_Off"));
        }
        typeText(constructionTypeOfHome, data.get("Construction_Type_Of_Home"));
        typeText(protectionClassCOde, data.get("Protection_Class_Code"));
    }
}
