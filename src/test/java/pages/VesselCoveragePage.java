package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.OperatorAssignmentBlock;
import pages.blocks.VesselBlock;

import java.util.Map;

public class VesselCoveragePage extends CommonComponentsAndActions {
    WebDriver driver;
    VesselBlock vesselBlock;
    OperatorAssignmentBlock operatorAssignmentBlock;

    public VesselCoveragePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        vesselBlock = new VesselBlock(driver);
        operatorAssignmentBlock = new OperatorAssignmentBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillVesselCoverageDetails(Map<String, String> data) throws Throwable {
        goToPage("Vessel Coverage");
        vesselBlock.setAOPDeductible(data.get("AOP_Deductible"));
        operatorAssignmentBlock.assignOperator(data);
    }
}
