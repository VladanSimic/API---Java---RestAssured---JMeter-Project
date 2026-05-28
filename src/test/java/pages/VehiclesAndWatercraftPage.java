package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AdditionalVehiclesBlock;
import pages.blocks.WatercraftInformationBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class VehiclesAndWatercraftPage extends CommonComponentsAndActions {
    WebDriver driver;

    AdditionalVehiclesBlock additionalVehiclesBlock;
    WatercraftInformationBlock watercraftInformationBlock;

    public VehiclesAndWatercraftPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        watercraftInformationBlock = new WatercraftInformationBlock(driver);
        additionalVehiclesBlock = new AdditionalVehiclesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillVehicleAndWatercraftPageES(Map<String, String> data) throws Throwable {
        goToPage("Vehicles and Watercraft");
        verifyBlockExists("vehicles obtained through online reports");
        verifyBlockExists("additional vehicles");
        verifyBlockExists("watercraft information");
        additionalVehiclesBlock.addAdditionalVehicleES(data);
        watercraftInformationBlock.addWatercraftDetailsES(data);
    }

}
