package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.InspectionInformationBlock;

import java.util.Map;

public class InspectionPage extends CommonComponentsAndActions {
    WebDriver driver;
    InspectionInformationBlock inspectionInformationBlock;

    public InspectionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        inspectionInformationBlock = new InspectionInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillOutInspectionDetails(Map<String, String> data) throws Throwable {
        inspectionInformationBlock.fillOutInspectionInformation(data.get("InspectionName"), data.get("InspectionDate"));
    }

    public void fillOutInspectionDetailsHO(Map<String, String> data) throws Throwable {
        if (data.get("State").equalsIgnoreCase("SC") || data.get("State").equalsIgnoreCase("FL")) {
            if (data.get("Ex_Wind").equalsIgnoreCase("No")) {
                goToPage("Inspection");
                inspectionInformationBlock.fillOutInspectionInformation(data.get("InspectionName"), data.get("InspectionDate"));
                verifyBlockExists("submit inspection information");
                verifyBlockExists("inspection reports");
            }
        }
    }

    public void fillOutInspectionDetailsHO_END(Map<String, String> data) throws Throwable {
        if (data.get("State_END").equalsIgnoreCase("SC") || data.get("State_END").equalsIgnoreCase("FL")) {
            if (data.get("Ex_Wind_END").equalsIgnoreCase("No")) {
                goToPage("Inspection");
                inspectionInformationBlock.fillOutInspectionInformation(data.get("InspectionName_END"), data.get("InspectionDate_END"));
                verifyBlockExists("submit inspection information");
                verifyBlockExists("inspection reports");
            }
        }
    }

    public void fillOutInspectionDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("State_OOS_END").equalsIgnoreCase("SC") || data.get("State_OOS_END").equalsIgnoreCase("FL")) {
            if (data.get("Ex_Wind_OOS_END").equalsIgnoreCase("No")) {
                goToPage("Inspection");
                inspectionInformationBlock.fillOutInspectionInformation(data.get("InspectionName_OOS_END"), data.get("InspectionDate_OOS_END"));
                verifyBlockExists("submit inspection information");
                verifyBlockExists("inspection reports");
            }
        }
    }

    public void fillOutInspectionDetailsHO_RNW(Map<String, String> data) throws Throwable {
        if (data.get("State_RNW").equalsIgnoreCase("SC") || data.get("State_RNW").equalsIgnoreCase("FL")) {
            if (data.get("Ex_Wind_RNW").equalsIgnoreCase("No")) {
                goToPage("Inspection");
                inspectionInformationBlock.fillOutInspectionInformation(data.get("InspectionName_RNW"), data.get("InspectionDate_RNW"));
                verifyBlockExists("submit inspection information");
                verifyBlockExists("inspection reports");
            }
        }
    }

    public void fillOutInspectionDetails(Map<String, String> data, int i) throws Throwable {
        inspectionInformationBlock.fillOutInspectionInformation(data.get("InspectionName_" + i), data.get("InspectionDate_" + i));
    }


}