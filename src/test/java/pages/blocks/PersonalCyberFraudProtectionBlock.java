package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class PersonalCyberFraudProtectionBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public PersonalCyberFraudProtectionBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Fraud and Cyber Defense Coverage ']/../../../../../../div//label[text()='Yes']/..//input")
    WebElement defenceCoverageYes;
    @FindBy(xpath = "//div[text()='Fraud and Cyber Defense Coverage ']/../../../../../../div//label[text()='No']/..//input")
    WebElement defenceCoverageNo;
    @FindBy(xpath = "//div[text()='Limit']/../../../..//input")
    WebElement limit;
    @FindBy(xpath = "//div[text()='Deductible']/../../../..//input")
    WebElement deductible;

    @FindBy(xpath = "//div[contains(text(), 'has the insured or family member ever received any claim')]/../../../..//label[text()='No']")
    WebElement hasTheInsuredNo;

    @FindBy(xpath = "//div[contains(text(), 'has the insured or family member ever received any claim')]/../../../..//label[text()='Yes']")
    WebElement hasTheInsuredYes;
    @FindBy(xpath = "//div[contains(text(), 'have you or family member experienced a financial')]/../../../..//label[text()='No']")
    WebElement haveYouOrFamilyMemberExperiencedNo;

    @FindBy(xpath = "//div[contains(text(), 'have you or family member experienced a financial')]/../../../..//label[text()='Yes']")
    WebElement haveYouOrFamilyMemberExperiencedYes;

    public void setHasTheInsuredYes() throws Throwable {
        clickElement(hasTheInsuredYes);
    }

    public void setHasTheInsuredNo() throws Throwable {
        clickElement(hasTheInsuredNo);
    }

    public void setHasTheInsured(String value) throws Throwable {
        if (hasValue(value)) {
            choose(hasTheInsuredYes, hasTheInsuredNo, value, "Has The Insured ");
        }

    }

    public void setHaveYouOrFamilyMemberExperienced(String value) throws Throwable {
        if (hasValue(value)) {
            choose(haveYouOrFamilyMemberExperiencedYes, haveYouOrFamilyMemberExperiencedNo, value, "Have you or Family member Experienced");
        }
    }

    public void setHaveYouOrFamilyMemberExperiencedYes() throws Throwable {
        clickElement(haveYouOrFamilyMemberExperiencedYes);
    }

    public void setDefenceCoverageYes() throws Throwable {
        clickElement(defenceCoverageYes);
    }

    public void setDefenceCoverageNo() throws Throwable {
        clickElement(defenceCoverageNo);
    }

    public void setLimit(String value) throws Throwable {
        typeText(limit, value);

    }

    public void deductible(String value) throws Throwable {
        typeText(deductible, value);
    }

    public void setDefenceCoverage(String value) throws Throwable {
        if (hasValue(value)) {
            choose(defenceCoverageYes, defenceCoverageNo, value, "Defence Coverage");
        }

    }

    public void fillPersonalCyberSecurityAndFraudProtectionHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("Personal Cyber Security and Fraud Protection");
        setDefenceCoverage(data.get("Personal_Cyber_Security_and_Fraud_Protection"));
        setLimit(data.get("Personal_Cyber_Security_and_Fraud_Protection_Limit"));
        //TODO
        setHasTheInsured(data.get("Has_The_Insured"));
        setHaveYouOrFamilyMemberExperienced(data.get("Have_You_Or_Family_Member_Experienced"));
    }

    public void fillPersonalCyberSecurityAndFraudProtectionHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Personal Cyber Security and Fraud Protection");
        setDefenceCoverage(data.get("Personal_Cyber_Security_and_Fraud_Protection_END"));
        setLimit(data.get("Personal_Cyber_Security_and_Fraud_Protection_Limit_END"));
        //TODO
        setHasTheInsured(data.get("Has_The_Insured_END"));
        setHaveYouOrFamilyMemberExperienced(data.get("Have_You_Or_Family_Member_Experienced_END"));
    }


    public void fillPersonalCyberSecurityAndFraudProtectionHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Personal Cyber Security and Fraud Protection");
        setDefenceCoverage(data.get("Personal_Cyber_Security_and_Fraud_Protection_OOS_END"));
        setLimit(data.get("Personal_Cyber_Security_and_Fraud_Protection_Limit_OOS_END"));
        //TODO
        setHasTheInsured(data.get("Has_The_Insured_OOS_END"));
        setHaveYouOrFamilyMemberExperienced(data.get("Have_You_Or_Family_Member_Experienced_OOS_END"));
    }

    public void fillPersonalCyberSecurityAndFraudProtectionHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("Personal Cyber Security and Fraud Protection");
        setDefenceCoverage(data.get("Personal_Cyber_Security_and_Fraud_Protection_RNW"));
        setLimit(data.get("Personal_Cyber_Security_and_Fraud_Protection_Limit_RNW"));
        //TODO
        setHasTheInsured(data.get("Has_The_Insured_RNW"));
        setHaveYouOrFamilyMemberExperienced(data.get("Have_You_Or_Family_Member_Experienced_RNW"));
    }
}
