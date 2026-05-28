package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.MunicipalityTaxReportBlock;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.GeneralInformationBlock;
import pages.blocks.PolicyInformationBlock;
import pages.blocks.PrimaryLocationBlock;

import java.util.Map;

public class ExcessLiabilityCoverPage extends CommonComponentsAndActions {
    WebDriver driver;
    PolicyInformationBlock policyInformationBlock;
    PrimaryLocationBlock primaryLocationBlock;
    public GeneralInformationBlock generalInformationBlock;
    MunicipalityTaxReportBlock municipalityTaxReportBlock;

    public ExcessLiabilityCoverPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        policyInformationBlock = new PolicyInformationBlock(driver);
        primaryLocationBlock = new PrimaryLocationBlock(driver);
        generalInformationBlock = new GeneralInformationBlock(driver);
        municipalityTaxReportBlock = new MunicipalityTaxReportBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillExcessLiabilityCoverPage(Map<String, String> data) throws Throwable {
        goToPage("Excess Liability Policy");
        policyInformationBlock.fillPolicyInformationDetailsEX(data);
        primaryLocationBlock.fillPrimaryLocationDetails(data);
        generalInformationBlock.fillGeneralInformationDetails(data);
    }

    public void fillExcessLiabilityCoverPage_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsEX_END(data);
        generalInformationBlock.fillGeneralInformationDetails_END(data);
    }

    public void fillExcessLiabilityCoverPage_OOS_END(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsEX_OOS_END(data);
        generalInformationBlock.fillGeneralInformationDetails_OOS_END(data);
    }

    public void fillExcessLiabilityCoverPage_RNW(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsEX_RNW(data);
        generalInformationBlock.fillGeneralInformationDetails_RNW(data);
    }

    public void visitExcessPolicyPageFillKYTaxReportData() throws Throwable {
        goToPage("Excess Liability Policy");
        municipalityTaxReportBlock.fillKYTaxReportDummyData("EX");
    }

}
