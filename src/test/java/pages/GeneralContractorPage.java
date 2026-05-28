package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class GeneralContractorPage extends CommonComponentsAndActions {
    WebDriver driver;
    GeneralContractorInformationBlock generalContractorInformationBlock;
    UnderwritingOnlyBlock underwritingOnlyBlock;
    GeneralContractorsLimitsOfInsuranceBlock generalContractorsLimitsOfInsuranceBlock;
    SubcontractorsLimitsOfInsuranceBlock subcontractorsLimitsOfInsuranceBlock;
    GeneralContractorLiabilityCoverageBlock generalContractorLiabilityCoverageBlock;
    LossHistoryBlock lossHistoryBlock;
    GeneralContractorPriorLossHistoryBlock generalContractorPriorLossHistoryBlock;
    ProjectManagerContactInformationBlock projectManagerContactInformationBlock;

    public GeneralContractorPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        generalContractorInformationBlock = new GeneralContractorInformationBlock(driver);
        underwritingOnlyBlock = new UnderwritingOnlyBlock(driver);
        generalContractorsLimitsOfInsuranceBlock = new GeneralContractorsLimitsOfInsuranceBlock(driver);
        subcontractorsLimitsOfInsuranceBlock = new SubcontractorsLimitsOfInsuranceBlock(driver);
        generalContractorLiabilityCoverageBlock = new GeneralContractorLiabilityCoverageBlock(driver);
        lossHistoryBlock = new LossHistoryBlock(driver);
        generalContractorPriorLossHistoryBlock = new GeneralContractorPriorLossHistoryBlock(driver);
        projectManagerContactInformationBlock = new ProjectManagerContactInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillGeneralContractorPageCC(Map<String, String> data) throws Throwable {
        goToPage("General Contractor");
        generalContractorInformationBlock.fillGeneralContractorInformationDetailsCC(data);
        underwritingOnlyBlock.fillUnderwritingOnlyDetailsCC(data);
        generalContractorsLimitsOfInsuranceBlock.fillGeneralContractorsLimitsOfInsuranceDetailsCC(data);
        subcontractorsLimitsOfInsuranceBlock.fillSubcontractorsLimitsInsuranceDetailsCC(data);
        generalContractorLiabilityCoverageBlock.fillGeneralContractorLiabilityCoverageDetailsCC(data);
        lossHistoryBlock.fillLossHistoryDetailsCC(data);
        generalContractorPriorLossHistoryBlock.fillGeneralContractorPriorLossHistoryDetailsCC(data);
        saveChanges();
    }

    public void fillGeneralContractorPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("General Contractor");
        generalContractorInformationBlock.fillGeneralContractorInformationDetailsCC_END(data);
        underwritingOnlyBlock.fillUnderwritingOnlyDetailsCC_END(data);
        generalContractorsLimitsOfInsuranceBlock.fillGeneralContractorsLimitsOfInsuranceDetailsCC_END(data);
        subcontractorsLimitsOfInsuranceBlock.fillSubcontractorsLimitsInsuranceDetailsCC_END(data);
        generalContractorLiabilityCoverageBlock.fillGeneralContractorLiabilityCoverageDetailsCC_END(data);
        lossHistoryBlock.fillLossHistoryDetailsCC_END(data);
        generalContractorPriorLossHistoryBlock.fillGeneralContractorPriorLossHistoryDetailsCC_END(data);
    }

    public void fillGeneralContractorPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }
}