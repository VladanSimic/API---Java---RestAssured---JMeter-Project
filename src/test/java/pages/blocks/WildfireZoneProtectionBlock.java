package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WildfireZoneProtectionBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WildfireZoneProtectionBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'adequate defensible space around the home')]/../../../..//input")
    WebElement adequateSpaceAroundHome;
    @FindBy(xpath = "//div[contains(text(),'Eave soffits and Attic Vents')]/../../../..//input")
    WebElement eaveSoffitsAtticVents;
    @FindBy(xpath = "//div[contains(text(),'Chimneys fitted ')]/../../../..//input")
    WebElement chimneysFitted;
    @FindBy(xpath = "//div[contains(text(),'Firewood or other combustible materials')]/../../../..//input")
    WebElement firewoodOrOtherCombustibleMaterials;
    @FindBy(xpath = "//div[contains(text(),'Combustible structures or fuel tanks')]/../../../..//input")
    WebElement combustibleStructuresOrFuelTanks;

    public void fillWildfireZoneProtectionInfo(Map<String, String> data) throws Throwable {
        typeText(adequateSpaceAroundHome, data.get("Adequate_Space_Around_Home"));
        typeText(eaveSoffitsAtticVents, data.get("Eave_Soffits_Attic_Vents"));
        typeText(chimneysFitted, data.get("Chimneys_Fitted"));
        typeText(firewoodOrOtherCombustibleMaterials, data.get("Firewood_Or_Other_Combustible_Materials"));
        typeText(combustibleStructuresOrFuelTanks, data.get("Combustible_Structures_Or_Fuel_Tanks"));
    }

}