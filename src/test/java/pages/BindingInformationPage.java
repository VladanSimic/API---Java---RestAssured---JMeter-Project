package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AdditionalLocationBindingInformationBlock;
import pages.blocks.AppraisalInformationBlock;
import pages.utils.CommonComponentsAndActions;


import java.util.Map;

public class BindingInformationPage extends CommonComponentsAndActions {
    WebDriver driver;
    AdditionalLocationBindingInformationBlock additionalLocationBindingInformationBlock;
    AppraisalInformationBlock appraisalInformationBlock;

    public BindingInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        additionalLocationBindingInformationBlock = new AdditionalLocationBindingInformationBlock(driver);
        appraisalInformationBlock = new AppraisalInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillOutBindingInformationHO(Map<String, String> data) throws Throwable {
        if (goToPage("Binding Information")) {
            additionalLocationBindingInformationBlock.fillOutAdditionalLocationBindingInformation(data);
            appraisalInformationBlock.fillOutAppraisalInformation(data);
        }
    }
    public void fillOutBindingInformationHO_END(Map<String, String> data) throws Throwable {
        if (goToPage("Binding Information")) {
            additionalLocationBindingInformationBlock.fillOutAdditionalLocationBindingInformation_END(data);
            appraisalInformationBlock.fillOutAppraisalInformation_END(data);
        }
    }

    public void fillOutBindingInformationHO_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Binding Information")) {
            additionalLocationBindingInformationBlock.fillOutAdditionalLocationBindingInformation_OOS_END(data);
            appraisalInformationBlock.fillOutAppraisalInformation_OOS_END(data);
        }
    }

    public void fillOutBindingInformationHO_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Binding Information")) {
            additionalLocationBindingInformationBlock.fillOutAdditionalLocationBindingInformation_RNW(data);
            appraisalInformationBlock.fillOutAppraisalInformation_RNW(data);
        }
    }

    public void fillOutBindingInformationCO(Map<String, String> data) throws Throwable {
        goToPage("Additional Binding Information");
        additionalLocationBindingInformationBlock.fillOutAdditionalLocationBindingInformation(data);
        appraisalInformationBlock.fillOutAppraisalInformation(data);
    }

    public void fillOutBindingInformation(Map<String, String> data, int i) throws Throwable {
        additionalLocationBindingInformationBlock.fillOutAdditionalLocationBindingInformation(data, i);
        appraisalInformationBlock.fillOutAppraisalInformation(data, i);
    }


}