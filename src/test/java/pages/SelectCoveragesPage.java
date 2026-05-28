package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.LiabilityLimitsBlock;

import java.util.Map;

public class SelectCoveragesPage extends CommonComponentsAndActions {
    WebDriver driver;
    LiabilityLimitsBlock liabilityLimitsBlock;

    public SelectCoveragesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        liabilityLimitsBlock = new LiabilityLimitsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillSelectCoveragesPage(Map<String, String> data) throws Throwable {
        goToPage("Select Coverages");
        verifyBlockExists("select coverage");
        verifyBlockExists("liability limits");
        if (data.get("Admitted_Line").equalsIgnoreCase("Excess Liability") &&
                (hasValue(data.get("Admitted_Or_Surplus")) && data.get("Admitted_Or_Surplus").equalsIgnoreCase("Surplus"))) {
            liabilityLimitsBlock.setExcessLiability(data.get("Excess_Liability_Limit"));
            liabilityLimitsBlock.setUIM(data.get("UIM_Limit"));
            liabilityLimitsBlock.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit"));
            liabilityLimitsBlock.setExpandedDefense(data.get("Expanded_Defense"));

        } else {
            liabilityLimitsBlock.setExcessLiability(data.get("Excess_Liability_Limit"));
            saveChanges();
            try {
                liabilityLimitsBlock.setUIM(data.get("UIM_Limit"));
                liabilityLimitsBlock.setRejectUIMCoverage(data.get("Reject_UIM_Coverage"));
            } catch (Exception e) {

            }
            liabilityLimitsBlock.setRejectUIMCoverage(data.get("Reject_UIM_Coverage"));
            liabilityLimitsBlock.setEmploymentPracticesLiability(data.get("Employment_Practices_Liability_Limit"), data.get("How_Many_Employees"));
            liabilityLimitsBlock.setNotForProfitDirectorsAndOfficersLiability(data.get("Directors_And_Officers_Liability_Limit"));
            if (data.get("State").equals("NY") || data.get("State").equals("WA")) {
                //liabilityLimitsComponent.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit"));
            } else {
                liabilityLimitsBlock.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit"));
            }
            saveChanges();
        }

    }

    public void fillSelectCoveragesPage_END(Map<String, String> data) throws Throwable {
        goToPage("Select Coverages");
        liabilityLimitsBlock.setExcessLiability(data.get("Excess_Liability_Limit_END"));
        saveChanges();
        liabilityLimitsBlock.setUIM(data.get("UIM_Limit_END"));
        liabilityLimitsBlock.setEmploymentPracticesLiability(data.get("Employment_Practices_Liability_Limit_END"), data.get("How_Many_Employees_END"));
        liabilityLimitsBlock.setNotForProfitDirectorsAndOfficersLiability(data.get("Directors_And_Officers_Liability_Limit_END"));
        if (data.get("State").equals("NY")) {
            //liabilityLimitsComponent.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit"));
        } else {
            liabilityLimitsBlock.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit_END"));
        }
        saveChanges();
    }

    public void fillSelectCoveragesPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Select Coverages");
        liabilityLimitsBlock.setExcessLiability(data.get("Excess_Liability_Limit_OOS_END"));
        saveChanges();
        liabilityLimitsBlock.setUIM(data.get("UIM_Limit_OOS_END"));
        liabilityLimitsBlock.setEmploymentPracticesLiability(data.get("Employment_Practices_Liability_Limit_OOS_END"), data.get("How_Many_Employees_OOS_END"));
        liabilityLimitsBlock.setNotForProfitDirectorsAndOfficersLiability(data.get("Directors_And_Officers_Liability_Limit_OOS_END"));
        if (data.get("State").equals("NY")) {
            //liabilityLimitsComponent.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit"));
        } else {
            liabilityLimitsBlock.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit_OOS_END"));
        }
        saveChanges();
    }

    public void fillSelectCoveragesPage_RNW(Map<String, String> data) throws Throwable {
        goToPage("Select Coverages");
        liabilityLimitsBlock.setExcessLiability(data.get("Excess_Liability_Limit_RNW"));
        saveChanges();
        liabilityLimitsBlock.setUIM(data.get("UIM_Limit_RNW"));
        liabilityLimitsBlock.setEmploymentPracticesLiability(data.get("Employment_Practices_Liability_Limit_RNW"), data.get("How_Many_Employees_RNW"));
        liabilityLimitsBlock.setNotForProfitDirectorsAndOfficersLiability(data.get("Directors_And_Officers_Liability_Limit_RNW"));
        if (data.get("State").equals("NY")||data.get("State").equals("WA")) {
            //liabilityLimitsComponent.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit"));
        } else {
            liabilityLimitsBlock.setUninsuredUnderinsuredLiability(data.get("Underinsured_Liability_Limit_RNW"));
        }
        saveChanges();
    }
}