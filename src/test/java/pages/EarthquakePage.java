package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class EarthquakePage extends CommonComponentsAndActions {
    WebDriver driver;
    EarthquakeCoverageOptionsBlock earthquakeCoverageOptionsBlock;
    EarthquakeReportsAndReadOnlyInformationBlock earthquakeReportsAndReadOnlyInformationBlock;
    EarthquakeBasicBlock earthquakeBasicBlock;
    EarthquakeBroadBlock earthquakeBroadBlock;
    EarthquakeUnderwritingOnlyBlock earthquakeUnderwritingOnlyBlock;

    public EarthquakePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        earthquakeCoverageOptionsBlock = new EarthquakeCoverageOptionsBlock(driver);
        earthquakeBasicBlock = new EarthquakeBasicBlock(driver);
        earthquakeBroadBlock = new EarthquakeBroadBlock(driver);
        earthquakeUnderwritingOnlyBlock = new EarthquakeUnderwritingOnlyBlock(driver);
        earthquakeReportsAndReadOnlyInformationBlock = new EarthquakeReportsAndReadOnlyInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillEarthquakeDetailsPage(Map<String, String> data, int i) throws Throwable {
        switch (data.get("State")) {
            case "WA": {
                //TODO check does something need to be done here
            }
            break;
            default: {
                earthquakeCoverageOptionsBlock.setEarthquakeCoverageOptions(data.get("Earthquake_Coverage_Option_" + i));
            }
        }
    }

    public void fillEarthquakeDetailsPageCC(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailCC(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailCC(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailCC(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailCC(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailCC(data);
        }
    }

    public void fillEarthquakeDetailsPageCC_END(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailCC_END(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailCC_END(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailCC_END(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailCC_END(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailCC_END(data);
        }
    }

    public void fillEarthquakeDetailsPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillEarthquakeDetailsPageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHS(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHS(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHS(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHS(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHS(data);
            saveChanges();
        }
    }

    public void fillEarthquakeDetailsPageHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHS_END(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHS_END(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHS_END(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHS_END(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHS_END(data);
        }
    }

    public void fillEarthquakeDetailsPageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHS_OOS_END(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHS_OOS_END(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHS_OOS_END(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHS_OOS_END(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHS_OOS_END(data);
        }
    }

    public void fillEarthquakeDetailsPageHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHS_RNW(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHS_RNW(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHS_RNW(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHS_RNW(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHS_RNW(data);
        }
    }

    public void fillEarthquakeDetailsPageHO(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            if (data.get("State").equalsIgnoreCase("CA"))
                earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHO(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHO(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHO(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHO(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHO(data);
        }
    }

    public void fillEarthquakeDetailsPageHO_END(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            if (data.get("State").equalsIgnoreCase("CA"))
                earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHO_END(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHO_END(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHO_END(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHO_END(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHO_END(data);
        }
    }

    public void fillEarthquakeDetailsPageHO_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            if (data.get("State").equalsIgnoreCase("CA"))
                earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHO_OOS_END(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHO_OOS_END(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHO_OOS_END(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHO_OOS_END(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHO_OOS_END(data);
        }
    }

    public void fillEarthquakeDetailsPageHO_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Earthquake")) {
            if (data.get("State").equalsIgnoreCase("CA"))
                earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHO_RNW(data);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHO_RNW(data);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHO_RNW(data);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHO_RNW(data);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHO_RNW(data);
        }
    }

    public void fillEarthquakeDetailsPageHO(Map<String, String> data, int i) throws Throwable {
        if (goToPage("Earthquake")) {
            if (data.get("State").equalsIgnoreCase("CA"))
                earthquakeCoverageOptionsBlock.fillEarthquakeCoverageOptionsDetailHO(data, i);
            earthquakeReportsAndReadOnlyInformationBlock.fillEarthquakeReportsAndReadOnlyInformationDetailHO(data, i);
            earthquakeBasicBlock.fillEarthquakeBasicDetailHO(data, i);
            earthquakeBroadBlock.fillEarthquakeBroadDetailHO(data, i);
            earthquakeUnderwritingOnlyBlock.fillEarthquakeUnderwritingOnlyDetailHO(data, i);
        }
    }


}