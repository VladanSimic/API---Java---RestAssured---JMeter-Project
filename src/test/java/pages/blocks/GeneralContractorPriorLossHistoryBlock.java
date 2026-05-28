package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class GeneralContractorPriorLossHistoryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public GeneralContractorPriorLossHistoryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='general contractor prior loss history']/../../../../../..//table//td[1]/div")
    List<WebElement> source;
    @FindBy(xpath = "//div[text()='general contractor prior loss history']/../../../../../..//table//td[2]/div")
    List<WebElement> lossDate;
    @FindBy(xpath = "//div[text()='general contractor prior loss history']/../../../../../..//table//td[3]/div")
    List<WebElement> lossType;
    @FindBy(xpath = "//div[text()='general contractor prior loss history']/../../../../../..//table//td[4]/div")
    List<WebElement> catLoss;
    @FindBy(xpath = "//div[text()='general contractor prior loss history']/../../../../../..//table//td[5]/div")
    List<WebElement> amountPaid;
    @FindBy(xpath = "//div[text()='general contractor prior loss history']/../../../../../..//table//td[6]/div")
    List<WebElement> claimClosed;
    @FindBy(xpath = "//div[text()='general contractor prior loss history']/../../../../../..//table//td[7]/div")
    List<WebElement> description;
    @FindBy(xpath = "//div[text()=\"subcontractor's limits of insurance\"]")
    WebElement subcontractorLimitsOfInsuranceBlock;

    public void fillGeneralContractorPriorLossHistoryDetailsCC(Map<String, String> data) throws Throwable {
        String priorLossOrClaim = data.get("General_Contractor_Loss_Or_Claim");
        String lossHistory = data.get("General_Contractor_Prior_Loss_History");

        if (hasValue(priorLossOrClaim) && priorLossOrClaim.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("prior loss history");
                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickSubcontractorLimitsOfInsuranceBlock();
                    if (losses == 1) {
                        setLossHistorySource(data.get("General_Contractor_Prior_Loss_History_Source_1"), i);
                        setLossHistoryLossDate(data.get("General_Contractor_Prior_Loss_History_Loss_Date_1"), i);
                        setLossHistoryLossType(data.get("General_Contractor_Prior_Loss_History_Loss_Type_1"), i);
                        setLossHistoryCATLoss(data.get("General_Contractor_Prior_Loss_History_CAT_Loss_1"), i);
                        setLossHistoryAmountPaid(data.get("General_Contractor_Prior_Loss_History_Amount_Paid_1"), i);
                        setLossHistoryClaimClosed(data.get("General_Contractor_Prior_Loss_History_Claim_Closed_1"), i);
                        setLossHistoryClaimDescription(data.get("General_Contractor_Prior_Loss_History_Claim_Description_1"), i);
                    } else {
                        setLossHistorySource(data.get("General_Contractor_Prior_Loss_History_Source_" + (i + 1)), i);
                        setLossHistoryLossDate(data.get("General_Contractor_Prior_Loss_History_Loss_Date_" + (i + 1)), i);
                        setLossHistoryLossType(data.get("General_Contractor_Prior_Loss_History_Loss_Type_" + (i + 1)), i);
                        setLossHistoryCATLoss(data.get("General_Contractor_Prior_Loss_History_CAT_Loss_" + (i + 1)), i);
                        setLossHistoryAmountPaid(data.get("General_Contractor_Prior_Loss_History_Amount_Paid_" + (i + 1)), i);
                        setLossHistoryClaimClosed(data.get("General_Contractor_Prior_Loss_History_Claim_Closed_" + (i + 1)), i);
                        setLossHistoryClaimDescription(data.get("General_Contractor_Prior_Loss_History_Claim_Description_" + (i + 1)), i);
                    }
                }
            }
        }
        saveChanges();
    }

    public void fillGeneralContractorPriorLossHistoryDetailsCC_END(Map<String, String> data) throws Throwable {
        String priorLossOrClaim = hasValue(data.get("General_Contractor_Loss_Or_Claim_END")) ? data.get("General_Contractor_Loss_Or_Claim_END") : data.get("General_Contractor_Loss_Or_Claim");

        if (hasValue(priorLossOrClaim) && priorLossOrClaim.equalsIgnoreCase("Yes")) {
            if (hasValue(data.get("General_Contractor_Prior_Loss_History_END"))) {
                //TODO count losses on NB, enable removing losses on END CC
                int losses = data.get("General_Contractor_Prior_Loss_History_END").split(",").length;

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickSubcontractorLimitsOfInsuranceBlock();
                    if (losses == 1) {
                        setLossHistorySource(data.get("General_Contractor_Prior_Loss_History_Source_END_1"), i);
                        setLossHistoryLossDate(data.get("General_Contractor_Prior_Loss_History_Loss_Date_END_1"), i);
                        setLossHistoryLossType(data.get("General_Contractor_Prior_Loss_History_Loss_Type_END_1"), i);
                        setLossHistoryCATLoss(data.get("General_Contractor_Prior_Loss_History_CAT_Loss_END_1"), i);
                        setLossHistoryAmountPaid(data.get("General_Contractor_Prior_Loss_History_Amount_Paid_END_1"), i);
                        setLossHistoryClaimClosed(data.get("General_Contractor_Prior_Loss_History_Claim_Closed_END_1"), i);
                        setLossHistoryClaimDescription(data.get("General_Contractor_Prior_Loss_History_Claim_Description_END_1"), i);
                    } else {
                        setLossHistorySource(data.get("General_Contractor_Prior_Loss_History_Source_END_" + (i + 1)), i);
                        setLossHistoryLossDate(data.get("General_Contractor_Prior_Loss_History_Loss_Date_END_" + (i + 1)), i);
                        setLossHistoryLossType(data.get("General_Contractor_Prior_Loss_History_Loss_Type_END_" + (i + 1)), i);
                        setLossHistoryCATLoss(data.get("General_Contractor_Prior_Loss_History_CAT_Loss_END_" + (i + 1)), i);
                        setLossHistoryAmountPaid(data.get("General_Contractor_Prior_Loss_History_Amount_Paid_END_" + (i + 1)), i);
                        setLossHistoryClaimClosed(data.get("General_Contractor_Prior_Loss_History_Claim_Closed_END_" + (i + 1)), i);
                        setLossHistoryClaimDescription(data.get("General_Contractor_Prior_Loss_History_Claim_Description_END_" + (i + 1)), i);
                    }
                }
            }
        }
        saveChanges();
    }

    public void clickSubcontractorLimitsOfInsuranceBlock() {
        clickElement(subcontractorLimitsOfInsuranceBlock, "Subcontractor limits of insurance block");
    }

    public void clickAdd() {
        clickElement(add, "Add");
    }

    public void setLossHistoryClaimDescription(String value, int i) {
        if (hasValue(value)) {
            clickElement(description.get(i), "Description" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "Description" + i);
        }
    }

    public void setLossHistoryClaimClosed(String value, int i) {
        if (hasValue(value)) {
            clickElement(claimClosed.get(i), "Claim Closed_" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "Claim Closed_" + i);
        }
    }

    public void setLossHistoryAmountPaid(String value, int i) {
        if (hasValue(value)) {
            clickElement(amountPaid.get(i), "Amount Paid_" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "Amount Paid_" + i);
        }
    }

    public void setLossHistoryCATLoss(String value, int i) {
        if (hasValue(value)) {
            clickElement(catLoss.get(i), "CAT Loss_" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "CAT Loss_" + i);
        }
    }

    public void setLossHistoryLossType(String value, int i) {
        if (hasValue(value)) {
            clickElement(lossType.get(i), "Loss Type_" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "Loss Type_" + i);
        }
    }

    public void setLossHistoryLossDate(String value, int i) {
        if (hasValue(value)) {
            clickElement(lossDate.get(i), "Loss Date_" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "Loss Date_" + i);
        }
    }

    public void setLossHistorySource(String value, int i) {
        if (hasValue(value)) {
            clickElement(source.get(i), "Source_" + i);
            typeTextEnter(driver.switchTo().activeElement(), value, "Source_" + i);
        }
    }

}