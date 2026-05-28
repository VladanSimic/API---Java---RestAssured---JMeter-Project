package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.EditAttachmentPage;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class AdditionalExcessLiabilityCoverageUWOnlyBlock extends CommonComponentsAndActions {
    WebDriver driver;
    EditAttachmentPage attachmentPage;

    public AdditionalExcessLiabilityCoverageUWOnlyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.attachmentPage = new EditAttachmentPage(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'primary excess liability coverage')]/../../../..//label[text()='Yes']/..//input")
    WebElement excessPoliciesAsPrimaryCoverageYes;
    @FindBy(xpath = "//div[contains(text(),'primary excess liability coverage')]/../../../..//label[text()='No']/..//input")
    WebElement excessPoliciesAsPrimaryCoverageNo;
    @FindBy(xpath = "//span[text()='add']")
    WebElement addBtn;
    @FindBy(xpath = "//div[text()='Additional Excess Liability Coverage (underwriters only)']")
    List<WebElement> additionalExcessLiabilityBlock;
    @FindBy(xpath = "//div[text()='Excess Over Excess Liability Coverage (underwriters only)']")
    WebElement excessOverExcessLiabilityCoverageBlock;
    @FindBy(xpath = "//span[text()='Upload']/../../../../../..//table//span[text()='Upload']")
    WebElement clickUpload;

    public void addAdditionalCoverages(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("State"));
        if (hasValue(data.get("Excess_Policies_As_Primary_Coverage")) && data.get("Excess_Policies_As_Primary_Coverage").equalsIgnoreCase("Yes")) {
            clickElement(excessPoliciesAsPrimaryCoverageYes);

            for (int i = 1; i <= Integer.parseInt(data.get("Excess_Liability_Coverages_Num")); i++) {
                if (i != 1) {
                    clickElement(addBtn);
                }
                pause(2000);
                if (isElementDisplayed(excessOverExcessLiabilityCoverageBlock)) {
                    clickElement(excessOverExcessLiabilityCoverageBlock);
                }
                if (!additionalExcessLiabilityBlock.isEmpty()) {
                    clickElement(additionalExcessLiabilityBlock.get(1));
                }
                setCarrierName(data.get("Excess_Liability_Carrier_Name").split(",")[i - 1], i);
                setEffectiveDate(data.get("Excess_Liability_Effective_Date").split(",")[i - 1], i);
                setExpirationDate(data.get("Excess_Liability_Expiration_Date").split(",")[i - 1], i);
                setPolicyLimit(formatNum(data.get("Excess_Liability_Policy_Limit").split(",")[i - 1]), i);
                //setOtherLimit(data.get("Excess_Liability_Other_Limit_END").split(",")[i - 1], i ); - ui field not editable
                clickUpload();
                attachmentPage.addAttachmentEX(data);
                //uploadFile(data); "Excess_Liability_Upload_File_Name"
                //TODO UPLOAD - EX NB Additional Coverages
            }

        } else {
            clickElement(excessPoliciesAsPrimaryCoverageNo);
        }
    }

    public void addAdditionalCoverages_END(Map<String, String> data) throws Throwable {
        if (data.get("Excess_Policies_As_Primary_Coverage_END").equalsIgnoreCase("Yes")) {
            if(isElementDisplayed(excessPoliciesAsPrimaryCoverageYes)) {
                clickElement(excessPoliciesAsPrimaryCoverageYes);
            }
            for (int i = 1; i <= Integer.parseInt(data.get("Excess_Liability_Coverages_Num_END")); i++) {
                if (i != 1) {
                    clickElement(addBtn);
                }
                int totalExcessPolicies = i + Integer.parseInt(data.get("Excess_Liability_Coverages_Num"));
                pause(2000);
                if(isElementDisplayed(excessOverExcessLiabilityCoverageBlock)) {
                    clickElement(excessOverExcessLiabilityCoverageBlock);
                }
                setCarrierName(data.get("Excess_Liability_Carrier_Name_END").split(",")[i - 1], totalExcessPolicies);
                setEffectiveDate(data.get("Excess_Liability_Effective_Date_END").split(",")[i - 1], totalExcessPolicies);
                setExpirationDate(data.get("Excess_Liability_Expiration_Date_END").split(",")[i - 1], totalExcessPolicies);
                setPolicyLimit(formatNum(data.get("Excess_Liability_Policy_Limit_END").split(",")[i - 1]), totalExcessPolicies);
                //setOtherLimit(data.get("Excess_Liability_Other_Limit_END").split(",")[i - 1], totalExcessPolicies ); - ui field not editable
                clickUpload();
                attachmentPage.addAttachmentEX(data);
                //uploadFile(data);
                //TODO UPLOAD - EX END Additional Coverages
            }

        } else {
            clickElement(excessPoliciesAsPrimaryCoverageNo);
        }
    }

    public void addAdditionalCoverages_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Excess_Policies_As_Primary_Coverage_OOS_END").equalsIgnoreCase("Yes")) {
            clickElement(excessPoliciesAsPrimaryCoverageYes);

            for (int i = 1; i <= Integer.parseInt(data.get("Excess_Liability_Coverages_Num_OOS_END")); i++) {
                if (i != 1) {
                    clickElement(addBtn);
                }
                int totalExcessPolicies = i + Integer.parseInt(data.get("Excess_Liability_Coverages_Num"));
                pause(2000);
                clickElement(additionalExcessLiabilityBlock.get(1));
                setCarrierName(data.get("Excess_Liability_Carrier_Name_OOS_END").split(",")[i - 1], totalExcessPolicies);
                setEffectiveDate(data.get("Excess_Liability_Effective_Date_OOS_END").split(",")[i - 1], totalExcessPolicies);
                setExpirationDate(data.get("Excess_Liability_Expiration_Date_OOS_END").split(",")[i - 1], totalExcessPolicies);
                setPolicyLimit(formatNum(data.get("Excess_Liability_Policy_Limit_OOS_END").split(",")[i - 1]), totalExcessPolicies);
                //setOtherLimit(data.get("Excess_Liability_Other_Limit_OOS_END").split(",")[i - 1], totalExcessPolicies ); - ui field not editable
                clickUpload();
                attachmentPage.addAttachmentEX(data);
                //uploadFile(data);
                //TODO UPLOAD - EX OOS END Additional Coverages
            }

        } else {
            clickElement(excessPoliciesAsPrimaryCoverageNo);
        }
    }

    public void addAdditionalCoverages_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Excess_Policies_As_Primary_Coverage_RNW").equalsIgnoreCase("Yes")) {
            clickElement(excessPoliciesAsPrimaryCoverageYes);
            int totalExcessPolicies = 0;
            int endorsementTotalExcessPolicies = Integer.parseInt(data.get("Excess_Liability_Coverages_Num_END"));
            for (int i = 1; i <= Integer.parseInt(data.get("Excess_Liability_Coverages_Num_RNW")); i++) {
                if (i != 1) {
                    clickElement(addBtn);
                }
                if (data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
                    totalExcessPolicies = i + Integer.parseInt(data.get("Excess_Liability_Coverages_Num")) + endorsementTotalExcessPolicies;
                } else {
                    totalExcessPolicies = i + Integer.parseInt(data.get("Excess_Liability_Coverages_Num"));
                }
                pause(2000);
                if (isElementDisplayed(excessOverExcessLiabilityCoverageBlock)) {
                    clickElement(excessOverExcessLiabilityCoverageBlock);
                }
                pause(2000);
                setCarrierName(data.get("Excess_Liability_Carrier_Name_RNW").split(",")[i - 1], totalExcessPolicies);
                setEffectiveDate(data.get("Excess_Liability_Effective_Date_RNW").split(",")[i - 1], totalExcessPolicies);
                setExpirationDate(data.get("Excess_Liability_Expiration_Date_RNW").split(",")[i - 1], totalExcessPolicies);
                setPolicyLimit(formatNum(data.get("Excess_Liability_Policy_Limit_RNW").split(",")[i - 1]), totalExcessPolicies);
                //setOtherLimit(data.get("Excess_Liability_Other_Limit_RNW").split(",")[i - 1], totalExcessPolicies ); - ui field not editable
                clickUpload();
                attachmentPage.addAttachmentEX(data);
                //uploadFile(data);
                //TODO UPLOAD - EX RNW Additional Coverages
            }

        } else {
            if (isElementDisplayed(excessPoliciesAsPrimaryCoverageNo)) {
                clickElement(excessPoliciesAsPrimaryCoverageNo);
            }
        }
    }

    public void setEffectiveDate(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[text()='Effective Date']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[2]/div")) {
            typeTextToActiveElement(value, "//span[text()='Effective Date']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[2]/div");
        }
    }

    public void setExpirationDate(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[text()='Expiration Date']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[3]/div")) {
            typeTextToActiveElement(value, "//span[text()='Expiration Date']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[3]/div");
        }
    }

    public void setCarrierName(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[text()='Carrier Name']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div")) {
            typeTextToActiveElement(value, "//span[text()='Carrier Name']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div");
        }
    }

    public void setPolicyLimit(String value, int i) throws Throwable {
        if (isElementPresentByXPath("//span[text()='Policy Limit']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[4]/div")) {
            typeTextToActiveElement(value, "//span[text()='Policy Limit']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[4]/div");
        }
    }

    public void verifyBlockExists(String state) throws Throwable {
        switch (state) {
            case "AZ":
            case "CO":
            case "IL":
            case "GA":
            case "CT":
            case "FL":
            case "WA":
            case "OR":
            case "MN":
            case "UT":
            case "TX":
            case "NH":
            case "CA":
            case "MO":
            case "MI":
            case "NC": {
                super.verifyBlockExists("Excess Over Excess Liability");
            }
            break;
            default: {
                super.verifyBlockExists("Additional Excess Liability Coverage");
            }
        }
    }
    void clickUpload() throws Throwable {
        if(isElementDisplayed(clickUpload)){
            clickElement(clickUpload, "Click upload");
        }
    }


}