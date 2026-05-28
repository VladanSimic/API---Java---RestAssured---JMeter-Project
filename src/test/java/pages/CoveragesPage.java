package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.SelectCoveragesBlock;
import pages.blocks.VehiclesBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class CoveragesPage extends CommonComponentsAndActions {

    WebDriver driver;

    SelectCoveragesBlock selectCoveragesBlock;
    VehiclesBlock vehiclesBlock;

    public CoveragesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        selectCoveragesBlock = new SelectCoveragesBlock(driver);
        vehiclesBlock = new VehiclesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillCoveragesPagePA(Map<String, String> data) throws Throwable {
        goToPage("Coverages");
        if (data.get("State").equalsIgnoreCase("AZ") ||
                data.get("State").equalsIgnoreCase("CO") ||
                data.get("State").equalsIgnoreCase("KS") ||
                data.get("State").equalsIgnoreCase("VT") ||
                data.get("State").equalsIgnoreCase("WA") ||
                data.get("State").equalsIgnoreCase("FL")) {
            selectCoveragesBlock.fillCoveragesDetailsPA(data);
            vehiclesBlock.fillVehicleDetailsPA(data);
        } else {
            vehiclesBlock.fillVehicleDetailsPA(data);
            selectCoveragesBlock.fillCoveragesDetailsPA(data);
        }
        vehiclesBlock.fillObtainedVehiclesDetailsPA(data.get("State"));
        saveChanges();
    }

    public void fillCoveragesPagePA_END(Map<String, String> data) throws Throwable {
        goToPage("Coverages");
        if (data.get("State").equalsIgnoreCase("AZ")) {
            selectCoveragesBlock.fillCoveragesDetailsPA_END(data);
            vehiclesBlock.fillVehicleDetailsPA_END(data);
        } else {
            vehiclesBlock.fillVehicleDetailsPA_END(data);
            selectCoveragesBlock.fillCoveragesDetailsPA_END(data);
        }
        saveChanges();
    }

    public void fillCoveragesPagePA_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Coverages");
        if (data.get("State").equalsIgnoreCase("AZ")) {
            selectCoveragesBlock.fillCoveragesDetailsPA_OOS_END(data);
            vehiclesBlock.fillVehicleDetailsPA_OOS_END(data);
        } else {
            vehiclesBlock.fillVehicleDetailsPA_OOS_END(data);
            selectCoveragesBlock.fillCoveragesDetailsPA_OOS_END(data);
        }
        saveChanges();
    }

    public void fillCoveragesPagePA_RNW(Map<String, String> data) throws Throwable {
        goToPage("Coverages");
        if (data.get("State").equalsIgnoreCase("AZ")) {
            selectCoveragesBlock.fillCoveragesDetailsPA_RNW(data);
            vehiclesBlock.fillVehicleDetailsPA_RNW(data);
        } else {
            vehiclesBlock.fillVehicleDetailsPA_RNW(data);
            selectCoveragesBlock.fillCoveragesDetailsPA_RNW(data);
        }
        saveChanges();
    }
}