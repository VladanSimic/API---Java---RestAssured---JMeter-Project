package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class FloodCoveragePage extends CommonComponentsAndActions {

    WebDriver driver;

    OptionalFloodCoverageBlock optionalFloodCoverageBlock;
    FloodInformationBlock floodInformationBlock;
    ExcessFloodBlock excessFloodBlock;
    PrimaryFloodCoverageBlock primaryFloodCoverageBlock;
    ElevationCertificateBlock elevationCertificateBlock;

    public FloodCoveragePage(WebDriver driver) {
        super(driver);
        optionalFloodCoverageBlock = new OptionalFloodCoverageBlock(driver);
        floodInformationBlock = new FloodInformationBlock(driver);
        excessFloodBlock = new ExcessFloodBlock(driver);
        primaryFloodCoverageBlock = new PrimaryFloodCoverageBlock(driver);
        elevationCertificateBlock = new ElevationCertificateBlock(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillFloodCoveragePageHONoCondition(Map<String, String> data) throws Throwable {
        goToPage("Flood Coverage");
        optionalFloodCoverageBlock.fillOptionalFloodCoverages(data);
        floodInformationBlock.fillOutFloodInformationDetails(data);
        elevationCertificateBlock.fillOutElevationCertificateInformationHONoCondition(data);
        primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails(data);
        excessFloodBlock.fillOutExcessFloodDetails(data);
    }

    public void fillFloodCoveragePageHO(Map<String, String> data) throws Throwable {
        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State"))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages(data);
                floodInformationBlock.fillOutFloodInformationDetails(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails(data);
                excessFloodBlock.fillOutExcessFloodDetailsPF(data);
            }
        }

        if (isFloodDate2(data.get("Effective_Date"))) {
            if (isFloodState2(data.get("State"))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages(data);
                floodInformationBlock.fillOutFloodInformationDetails(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails(data);
                excessFloodBlock.fillOutExcessFloodDetailsPF(data);
            }
        }
    }

    public void fillFloodCoveragePageHO_END(Map<String, String> data) throws Throwable {
        if (isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState1a(data.get("State_END"))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages_END(data);
                floodInformationBlock.fillOutFloodInformationDetails_END(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails_END(data);
                excessFloodBlock.fillOutExcessFloodDetails_END(data);
            }
        }

        if (isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState2(data.get("State_END"))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages_END(data);
                floodInformationBlock.fillOutFloodInformationDetails_END(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails_END(data);
                excessFloodBlock.fillOutExcessFloodDetails_END(data);
            }
        }
    }

    public void fillFloodCoveragePageHO_OOS_END(Map<String, String> data) throws Throwable {
        //TODO decrement date by 1 for OOS
        if (isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState1a(data.get("State_OOS_END"))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages_OOS_END(data);
                floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails_OOS_END(data);
                excessFloodBlock.fillOutExcessFloodDetails_OOS_END(data);

            }
        }

        if (isFloodDate2(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState2(data.get("State_OOS_END"))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages_OOS_END(data);
                floodInformationBlock.fillOutFloodInformationDetails_OOS_END(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails_OOS_END(data);
                excessFloodBlock.fillOutExcessFloodDetails_OOS_END(data);
            }
        }
    }

    public void fillFloodCoveragePageHO_RNW(Map<String, String> data) throws Throwable {
        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State_RNW"))) {
                goToPage("Flood Coverage");
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages_RNW(data);
                floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails_RNW(data);
                excessFloodBlock.fillOutExcessFloodDetails_RNW(data);
            }
        }

        if (isFloodDate2(data.get("Effective_Date"))) {
            if (isFloodState2(data.get("State_RNW"))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages_RNW(data);
                floodInformationBlock.fillOutFloodInformationDetails_RNW(data);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails_RNW(data);
                excessFloodBlock.fillOutExcessFloodDetails_RNW(data);
            }
        }
    }

    public void fillFloodCoveragePageHO(Map<String, String> data, int i) throws Throwable {
        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State_" + i))) {
                goToPage("Flood Coverage");
                optionalFloodCoverageBlock.fillOptionalFloodCoverages(data, i);
                floodInformationBlock.fillOutFloodInformationDetails(data, i);
                elevationCertificateBlock.fillOutElevationCertificateInformationHO(data, i);
                primaryFloodCoverageBlock.fillOutPrimaryFloodCoveragesDetails(data);
                excessFloodBlock.fillOutExcessFloodDetails(data, i);
            }
        }
    }

}