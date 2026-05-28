package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WindPoolBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WindPoolBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Wind Pool Territory or Zone']/../../../..//input")
    WebElement windPoolTerritoryOrZone;
    @FindBy(xpath = "//div[text()='wind pool']/../../../../../..//div[text()='State']/../../../..//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='County']/../../../..//input")
    WebElement county;
    @FindBy(xpath = "//div[text()='StateCounty FIPS Code']/../../../..//input")
    WebElement windPoolStateCountyFIPSCode;

    public void fillWindPoolDetailsCC(Map<String, String> data) throws Throwable {
        verifyWindPoolTerritoryOrZone(data.get("Wind_Pool_Wind_Pool_Territory_Or_Zone"));
        verifyState(data.get("Wind_Pool_State"));
        verifyCounty(data.get("Wind_Pool_County"));
        verifyWindPoolStateCountyFIPSCode(data.get("Wind_Pool_State_County_FIPS_Code"));
        saveChanges();
    }

    public void fillWindPoolDetailsCC_END(Map<String, String> data) throws Throwable {
        verifyWindPoolTerritoryOrZone(data.get("Wind_Pool_Wind_Pool_Territory_Or_Zone_END"));
        verifyState(data.get("Wind_Pool_State_END"));
        verifyCounty(data.get("Wind_Pool_County_END"));
        verifyWindPoolStateCountyFIPSCode(data.get("Wind_Pool_State_County_FIPS_Code_END"));
        saveChanges();
    }

    public void verifyWindPoolStateCountyFIPSCode(String value) {
        assertCellValue(windPoolStateCountyFIPSCode, value, "State County FIPS Code");
    }

    public void verifyCounty(String value) {
        assertCellValue(county, value, "County");
    }

    public void verifyState(String value) {
        assertCellValue(state, value, "State");
    }

    public void verifyWindPoolTerritoryOrZone(String value) {
        assertCellValue(windPoolTerritoryOrZone, value, "Wind Pool Territory Or Zone");
    }

}