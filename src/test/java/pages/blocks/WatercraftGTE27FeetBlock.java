package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class WatercraftGTE27FeetBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WatercraftGTE27FeetBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Do you intend to quote and insure any vessel greater than or equal to 27 ft?')]/../../../..//label[text()='No']/..//input")
    WebElement vehicleGTE27FeetNo;
    @FindBy(xpath = "//div[contains(text(),'Do you intend to quote and insure any vessel greater than or equal to 27 ft?')]/../../../..//label[text()='Yes']/..//input")
    WebElement vehicleGTE27FeetYes;

    public void fillWatercraftGTE27Details(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercrafts >= 27 feet");
        setVehicleGTE27Feet(data.get("Vehicle_GTE_27_Feet"));
    }

    public void setVehicleGTE27Feet(String yesNo) throws Throwable {
        choose(vehicleGTE27FeetYes, vehicleGTE27FeetNo, yesNo);
    }
}



