package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class VesselDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public VesselDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Hull Identification']/../../../..//input")
    WebElement hullIdentification;
    @FindBy(xpath = "//div[text()='Year Purchased']/../../../..//input")
    WebElement yearPurchased;
    @FindBy(xpath = "//div[contains(text(),'What is the vessel registered state?')]/../../../..//input")
    WebElement vesselRegisteredState;
    @FindBy(xpath = "//div[text()='Hull Material']/../../../..//input")
    WebElement hullMaterial;
    @FindBy(xpath = "//div[text()='Hull Design']/../../../..//input")
    WebElement hullDesign;
    @FindBy(xpath = "//div[text()='Type']/../../../..//input")
    WebElement type;

    public void fillVesselDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("vessel details");
        setHullIdentification(data.get("Hull_Identification"));
        setYearPurchased(data.get("Year_Purchased"));
        setWhatIsTheVesselRegisteredState(data.get("What_Is_The_Vessel_Registered_State"));
        setHullMaterial(data.get("Hull_Material"));
        setHullDesign(data.get("Hull_Design"));
        setType(data.get("Type"));
        saveChanges();
    }

    private void setType(String typeTxt) throws Throwable {
        typeText(type, typeTxt);
    }

    private void setHullDesign(String hull_design) throws Throwable {
        typeText(hullDesign, hull_design);
    }

    private void setHullMaterial(String hull_material) throws Throwable {
        typeText(hullMaterial, hull_material);
    }

    private void setWhatIsTheVesselRegisteredState(String what_is_the_vessel_registered_state) throws Throwable {
        typeText(vesselRegisteredState, what_is_the_vessel_registered_state);
    }

    private void setYearPurchased(String year_purchased) throws Throwable {
        typeText(yearPurchased, year_purchased);
    }

    private void setHullIdentification(String hull_identification) throws Throwable {
        typeText(hullIdentification, hull_identification);
    }
}