package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class CollectionsPolicyPage extends CommonComponentsAndActions {
    WebDriver driver;
    PolicyInformationBlock policyInformationBlock;
    InsuranceInformationBlock insuranceInformationBlock;
    RiskLocationCharacteristicsBlock riskLocationCharacteristicsBlock;
    NamedInsuredBlock nameInsuredComponent;
    CreditScoreTiersBlock creditScoreTiersBlock;
    MunicipalityTaxReportBlock municipalityTaxReportBlock;

    public CollectionsPolicyPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        policyInformationBlock = new PolicyInformationBlock(driver);
        insuranceInformationBlock = new InsuranceInformationBlock(driver);
        riskLocationCharacteristicsBlock = new RiskLocationCharacteristicsBlock(driver);
        nameInsuredComponent = new NamedInsuredBlock(driver);
        creditScoreTiersBlock = new CreditScoreTiersBlock(driver);
        municipalityTaxReportBlock = new MunicipalityTaxReportBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillCollectionsPolicyPage(Map<String, String> data) throws Throwable {
        policyInformationBlock.fillPolicyInformationDetailsCO(data);
        insuranceInformationBlock.fillInsuranceInformationDetailsCO(data);
        riskLocationCharacteristicsBlock.fillRiskLocationCharacteristics(data);
        nameInsuredComponent.fillNamedInsuredDetailsCO(data);
        verifyBlockExists("risk location");
    }

    public void visitCollectionPolicyPageFillKYTaxReportData() throws Throwable {
        goToPage("Collections");
        municipalityTaxReportBlock.fillKYTaxReportDummyData("CO");
    }

}
