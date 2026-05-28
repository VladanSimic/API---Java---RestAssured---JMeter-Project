package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class TrustLlcOtherLegalEntityPolicyInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public TrustLlcOtherLegalEntityPolicyInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[contains(text(),'maintain any other insurance policies')]/../../../..//label[text()='Yes']/..//input")
    WebElement MaintainAnyOtherInsurancePoliciesYes;
    @FindBy(xpath = "//div[contains(text(),'maintain any other insurance policies')]/../../../..//label[text()='No']/..//input")
    WebElement MaintainAnyOtherInsurancePoliciesNo;
    @FindBy(xpath = "//span[text()='Update']")
    WebElement update;

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("Policy Information");
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockCC_END(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_END"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA_END(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_END"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_OOS_END"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_RNW"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHS(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHS_END(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_END"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHS_RNW(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_RNW"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_OOS_END"));
        saveChanges();
    }

    public void clickUpdate() {
        clickElement(update, "Update");
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("Policy Information");
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Policy Information");
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_END"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Policy Information");
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_OOS_END"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("Policy Information");
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_RNW"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC(Map<String, String> data, int i) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_" + i));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC_END(Map<String, String> data, int i) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_END_" + i));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC_OOS_END(Map<String, String> data, int i) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_OOS_END_" + i));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockLLC_RNW(Map<String, String> data, int i) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies_RNW_" + i));
        saveChanges();
    }

    public void setDoesTheEntityMaintainAnyOtherInsurancePolicies(String value) throws Throwable {
        choose(MaintainAnyOtherInsurancePoliciesYes, MaintainAnyOtherInsurancePoliciesNo, value, "Maintain Any Other Insurance Policies");
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockPF(Map<String, String> data) throws Throwable {
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies"));
        saveChanges();
    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockFS(Map<String, String> data) {

    }

    public void fillTrustLlcOtherLegalEntityPolicyInformationBlockES(Map<String, String> data) throws Throwable {
        verifyBlockExists("Policy Information");
        setDoesTheEntityMaintainAnyOtherInsurancePolicies(data.get("Policy_Information_Does_The_Entity_Maintain_Any_Other_Insurance_Policies"));
        saveChanges();
    }
}