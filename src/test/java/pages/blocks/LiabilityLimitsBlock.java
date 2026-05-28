package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class LiabilityLimitsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LiabilityLimitsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Excess Liability')]/../../../../../../../../../../../td[2]//input")
    WebElement excessLiability;
    @FindBy(xpath = "//div[contains(text(),'UIM')]/../../../../../../../../../../../td[2]//input")
    WebElement UIM;
    @FindBy(xpath = "//div[contains(text(),'Employment Practices Liability')]/../../../../../../../../../../../td[2]//input")
    WebElement employmentPracticesLiability;
    @FindBy(xpath = "//div[contains(text(),'Not For Profit Directors and Officers Liability')]/../../../../../../../../../../../td[2]//input")
    WebElement notForProfitDirectorsAndOfficersLiability;
    @FindBy(xpath = "//div[contains(text(),'Uninsured/Underinsured Liability')]/../../../../../../../../../../../td[2]//input")
    WebElement uninsuredUnderinsuredLiability;
    @FindBy(xpath = "//div[contains(text(),'Expanded Defense Coverage')]/../../../../../../../../../../../td[2]//input")
    List<WebElement> expandedDefense;

    @FindBy(xpath = "//div[text()=\"liability limits\"]")
    WebElement liabilityLimitsBlock;
    @FindBy(xpath = "//div[text()='How many employees?']/../../../..//input")
    WebElement howManyEmployees;
    @FindBy(xpath = "//label[text()='Reject UIM Coverage']/..//input")
    WebElement rejectUIMCoverage;

    public void setExcessLiability(String value) throws Throwable {
        pause(2000);
        clickElement(liabilityLimitsBlock);
        typeText(excessLiability, value);
        pause(1000);
    }

    public void setUIM(String value) throws Throwable {
       try{
           clickElement(liabilityLimitsBlock);
           typeText(UIM, value);
           pause(1000);
       }catch(Exception e){
           //
       }
    }

    public void setEmploymentPracticesLiability(String value, String numEmployees) throws Throwable {
        if (hasValue(value) && !value.equals("No Coverage")) {
            clickElement(liabilityLimitsBlock);
            typeText(employmentPracticesLiability, value);
            pause(1000);
            saveChanges();
            if (hasValue(numEmployees)) {
                setHowManyEmployees(numEmployees);
            }
        } else {
            clickElement(liabilityLimitsBlock);
            typeText(employmentPracticesLiability, value);
            pause(1000);
        }
    }

    public void setNotForProfitDirectorsAndOfficersLiability(String value) throws Throwable {
        clickElement(liabilityLimitsBlock);
        typeText(notForProfitDirectorsAndOfficersLiability, value);
        pause(1000);
    }

    public void setUninsuredUnderinsuredLiability(String liabilityValue) throws Throwable {
        clickElement(liabilityLimitsBlock);
        typeText(uninsuredUnderinsuredLiability, liabilityValue);
        pause(1000);
        saveChanges();
    }

    public void setExpandedDefense(String expandedDefenseValue) throws Throwable {
        if (expandedDefense.size() > 0) {
            clickElement(liabilityLimitsBlock);
            typeText(expandedDefense.get(0), expandedDefenseValue);
            pause(1000);
            saveChanges();
        }
    }

    private void setHowManyEmployees(String numEmployees) throws Throwable {
        clickElement(liabilityLimitsBlock);
        typeText(howManyEmployees, numEmployees);
        pause(1000);
    }

    public void setRejectUIMCoverage(String reject_uim_coverage) throws Throwable {
        if(isElementDisplayed(rejectUIMCoverage,5)) {
            checkCheckbox(rejectUIMCoverage, reject_uim_coverage);
        }
    }
}