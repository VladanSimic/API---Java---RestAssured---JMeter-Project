package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.OperatorExperienceBlock;
import pages.blocks.SelectCoveragesBlock;
import pages.blocks.VesselUnderwritingDetailsBlock;

import java.util.Map;

public class VesselUnderwritingPage extends CommonComponentsAndActions {
    WebDriver driver;
    VesselUnderwritingDetailsBlock vesselUnderwritingDetailsBlock;
    SelectCoveragesBlock selectCoveragesBlock;
    OperatorExperienceBlock operatorExperienceBlock;
    WatercraftVehiclePage watercraftVehiclePage;

    public VesselUnderwritingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        vesselUnderwritingDetailsBlock = new VesselUnderwritingDetailsBlock(driver);
        selectCoveragesBlock = new SelectCoveragesBlock(driver);
        operatorExperienceBlock = new OperatorExperienceBlock(driver);
        watercraftVehiclePage = new WatercraftVehiclePage(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillVesselUnderwritingDetails(Map<String, String> data) throws Throwable {
        goToPage("Vessel Underwriting");
        verifyBlockExists("vessel underwriting details");
        if (data.get("Vehicle_GTE_27_Feet").equalsIgnoreCase("Yes") && Integer.parseInt(data.get("Length")) > 27) {
            selectCoveragesBlock.fillCoverageDetailsPW(data);
            vesselUnderwritingDetailsBlock.fillVesselUnderwritingDetails(data);
            operatorExperienceBlock.fillOperatorExperienceComponent(data);
            watercraftVehiclePage.fillRequiredToBindInformation(data);
        } else {
            vesselUnderwritingDetailsBlock.fillVesselUnderwritingDetails(data);
        }
    }
}
