package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class CreditScoreBlock extends CommonComponentsAndActions {

    public CreditScoreBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Member']/../../../..//div[@aria-readonly]")
    WebElement member;
    @FindBy(xpath = "//div[text()='Insurance Score Model']/../../../..//div[@aria-readonly]")
    WebElement insuranceScoreModel;
    @FindBy(xpath = "//div[text()='Order Date']/../../../..//input")
    WebElement orderDate;
    @FindBy(xpath = "//div[text()='End Date']/../../../..//input")
    WebElement endDate;
    @FindBy(xpath = "//div[text()='Insurance Score']/../../../..//input")
    WebElement insuranceScore;
    @FindBy(xpath = "//div[text()='Updated By']/../../../..//div[@aria-readonly]")
    WebElement updatedBy;

    public void fillCreditScoreDetailsPA(Map<String, String> data) {
        verifyMember(data.get("Credit_Score_Member"));
        verifyInsuranceScoreModel(data.get("Credit_Score_Insurance_Score_Model"));
        verifyOrderDate(data.get("Credit_Score_Order_Date"));
        verifyEndDate(data.get("Credit_Score_End_Date"));
        verifyInsuranceScore(data.get("Credit_Score_Insurance_Score"));
        verifyUpdatedBy(data.get("Credit_Score_Updated_By"));
    }

    public void fillCreditScoreDetailsPA_END(Map<String, String> data) {
        verifyMember(data.get("Credit_Score_Member_END"));
        verifyInsuranceScoreModel(data.get("Credit_Score_Insurance_Score_Model_END"));
        verifyOrderDate(data.get("Credit_Score_Order_Date_END"));
        verifyEndDate(data.get("Credit_Score_End_Date_END"));
        verifyInsuranceScore(data.get("Credit_Score_Insurance_Score_END"));
        verifyUpdatedBy(data.get("Credit_Score_Updated_By_END"));
    }

    public void fillCreditScoreDetailsPA_OOS_END(Map<String, String> data) {
        verifyMember(data.get("Credit_Score_Member_OOS_END"));
        verifyInsuranceScoreModel(data.get("Credit_Score_Insurance_Score_Model_OOS_END"));
        verifyOrderDate(data.get("Credit_Score_Order_Date_OOS_END"));
        verifyEndDate(data.get("Credit_Score_End_Date_OOS_END"));
        verifyInsuranceScore(data.get("Credit_Score_Insurance_Score_OOS_END"));
        verifyUpdatedBy(data.get("Credit_Score_Updated_By_OOS_END"));
    }

    public void fillCreditScoreDetailsPA_RNW(Map<String, String> data) {
        verifyMember(data.get("Credit_Score_Member_RNW"));
        verifyInsuranceScoreModel(data.get("Credit_Score_Insurance_Score_Model_RNW"));
        verifyOrderDate(data.get("Credit_Score_Order_Date_RNW"));
        verifyEndDate(data.get("Credit_Score_End_Date_RNW"));
        verifyInsuranceScore(data.get("Credit_Score_Insurance_Score_RNW"));
        verifyUpdatedBy(data.get("Credit_Score_Updated_By_RNW"));
    }

    public void verifyMember(String s) {
        assertEquals(member.getText(), s, "Score Member");
    }

    public void verifyInsuranceScoreModel(String s) {
        assertEquals(insuranceScoreModel.getText(), s, "Insurance Score Model");
    }

    public void verifyOrderDate(String s) {
        assertCellValue(orderDate, s, "Order Date");
    }

    public void verifyEndDate(String s) {
        assertCellValue(endDate, s, "End Date");
    }

    public void verifyInsuranceScore(String s) {
        assertCellValue(insuranceScore, s, "Insurance Score");
    }

    public void verifyUpdatedBy(String s) {
        assertEquals(updatedBy.getText(), s, "Score Updated By");
    }
}