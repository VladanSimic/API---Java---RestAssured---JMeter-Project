package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CreditScoreTiersBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public CreditScoreTiersBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Insurance Score Tier']/../../../..//input")
    WebElement insuranceScoreTier;
    @FindBy(xpath = "//div[text()='Insurance Score Tier Original']/../../../..//input")
    WebElement insuranceScoreTierOriginal;
    @FindBy(xpath = "//div[text()='Insurance Score for Rating']/../../../..//input")
    List<WebElement> insuranceScoreForRating;
    @FindBy(xpath = "//div[text()='Insurance Score for Rating Original']/../../../..//input")
    WebElement insuranceScoreForRatingOriginal;
    @FindBy(xpath = "//span[text()='Insurance Score Type']/../../../../../../../../..//table//td[1]/div")
    WebElement insuranceScoreType;
    @FindBy(xpath = "//span[text()='Applicant Insurance Score']/../../../../../../../../..//table//td[2]/div")
    WebElement applicantInsuranceScore;
    @FindBy(xpath = "//span[text()='Date Pulled']/../../../../../../../../..//table//td[3]/div")
    WebElement datePulled;
    @FindBy(xpath = "//label[text()='Did Member request re-pull of insurance score upon renewal?']/..//input")
    WebElement didMemberRequestRePull;

    public void fillCreditScoreTiersBlock(Map<String, String> data) {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Insurance_Score_Tier"));
        verifyInsuranceScoreTierOriginal(data.get("Credit_Score_Tiers_Insurance_Score_Tier_Original"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating"));
        verifyInsuranceScoreForRatingOriginal(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_Original"));
    }

    public void fillCreditScoreTiersBlock_END(Map<String, String> data) {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type_END"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score_END"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled_END"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Insurance_Score_Tier_END"));
        verifyInsuranceScoreTierOriginal(data.get("Credit_Score_Tiers_Insurance_Score_Tier_Original_END"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_END"));
        verifyInsuranceScoreForRatingOriginal(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_Original_END"));
    }

    public void fillCreditScoreTiersDetailsPA(Map<String, String> data) throws Throwable {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled"));
        setDidMemberRequestRePullOfInsuranceScoreUponRenewal(data.get("Credit_Score_Tiers_Did_Member_Request_Re_Pull_Of_Insurance_Score_Upon_Renewal"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Rating_Tier"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Policy_Rating_Tier"));
    }

    public void fillCreditScoreTiersDetailsPA_END(Map<String, String> data) throws Throwable {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type_END"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score_END"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled_END"));
        setDidMemberRequestRePullOfInsuranceScoreUponRenewal(data.get("Credit_Score_Tiers_Did_Member_Request_Re_Pull_Of_Insurance_Score_Upon_Renewal_END"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Rating_Tier_END"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Policy_Rating_Tier_END"));
    }

    public void fillCreditScoreTiersDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type_OOS_END"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score_OOS_END"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled_OOS_END"));
        setDidMemberRequestRePullOfInsuranceScoreUponRenewal(data.get("Credit_Score_Tiers_Did_Member_Request_Re_Pull_Of_Insurance_Score_Upon_Renewal_OOS_END"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Rating_Tier_OOS_END"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Policy_Rating_Tier_OOS_END"));
    }

    public void fillCreditScoreTiersDetailsPA_RNW(Map<String, String> data) throws Throwable {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type_RNW"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score_RNW"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled_RNW"));
        setDidMemberRequestRePullOfInsuranceScoreUponRenewal(data.get("Credit_Score_Tiers_Did_Member_Request_Re_Pull_Of_Insurance_Score_Upon_Renewal_RNW"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Rating_Tier_RNW"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Policy_Rating_Tier_RNW"));
    }

    public void setDidMemberRequestRePullOfInsuranceScoreUponRenewal(String value) throws Throwable {
        checkCheckbox(didMemberRequestRePull, value, "Did the member request re-pull");
    }

    public void verifyInsuranceScoreType(String value) {
        if (hasValue(value))
            if (value.equalsIgnoreCase("NotEmpty")) {
                Assert.assertNotSame("", insuranceScoreType.getAttribute("value"));
            } else {
                assertEquals(insuranceScoreType.getText(), value, "Insurance Score Type");
            }
    }

    public void verifyApplicantInsuranceScore(String value) {
        if (hasValue(value))
            if (value.equalsIgnoreCase("NotEmpty")) {
                Assert.assertNotSame("", applicantInsuranceScore.getAttribute("value"));
            } else {
                assertEquals(applicantInsuranceScore.getText(), value, "Applicant Insurance Score");
            }
    }

    public void verifyDatePulled(String value) {
        if (hasValue(value))
            if (value.equalsIgnoreCase("NotEmpty")) {
                Assert.assertNotSame("", datePulled.getAttribute("value"));
            } else {
                assertEquals(datePulled.getText(), value, "Date Pulled");
            }
    }

    public void verifyInsuranceScoreForRatingOriginal(String value) {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("pulled")) {
                Assert.assertTrue(hasValue(insuranceScoreForRatingOriginal.getAttribute("value")));
            } else {
                assertCellValue(insuranceScoreForRatingOriginal, value, "Insurance score for rating original");
            }
            reportScreenshot("Insurance Score", "Insurance Score");
        }
    }

    public void verifyInsuranceScoreForRating(String value) {
        if (hasValue(value)) {
            if (value.equalsIgnoreCase("pulled")) {
                Assert.assertTrue(hasValue(insuranceScoreForRating.get(0).getAttribute("value")));
            } else {
                Assert.assertFalse(elementExists(insuranceScoreForRating));
            }
            reportScreenshot("Insurance Score", "Insurance Score");
        }
    }

    public void verifyInsuranceScoreTierOriginal(String value) {
        assertCellValue(insuranceScoreTierOriginal, value, "Insurance score tier original");
    }

    public void verifyInsuranceScoreTier(String value) {
        assertCellValue(insuranceScoreTier, value, "Insurance score tier");
    }

    public void fillCreditScoreTiersDetailsHS(Map<String, String> data) {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Insurance_Score_Tier"));
        verifyInsuranceScoreTierOriginal(data.get("Credit_Score_Tiers_Insurance_Score_Tier_Original"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating"));
        verifyInsuranceScoreForRatingOriginal(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_Original"));
    }

    public void fillCreditScoreTiersDetailsHS_END(Map<String, String> data) {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type_END"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score_END"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled_END"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Insurance_Score_Tier_END"));
        verifyInsuranceScoreTierOriginal(data.get("Credit_Score_Tiers_Insurance_Score_Tier_Original_END"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_END"));
        verifyInsuranceScoreForRatingOriginal(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_Original_END"));
    }

    public void fillCreditScoreTiersDetailsHS_OOS_END(Map<String, String> data) {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type_OOS_END"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score_OOS_END"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled_OOS_END"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Insurance_Score_Tier_OOS_END"));
        verifyInsuranceScoreTierOriginal(data.get("Credit_Score_Tiers_Insurance_Score_Tier_Original_OOS_END"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_OOS_END"));
        verifyInsuranceScoreForRatingOriginal(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_Original_OOS_END"));
    }

    public void fillCreditScoreTiersDetailsHS_RNW(Map<String, String> data) {
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type_RNW"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score_RNW"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled_RNW"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Insurance_Score_Tier_RNW"));
        verifyInsuranceScoreTierOriginal(data.get("Credit_Score_Tiers_Insurance_Score_Tier_Original_RNW"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_RNW"));
        verifyInsuranceScoreForRatingOriginal(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating_Original_RNW"));
    }

    public void fillCreditScoreTiersDetailsHO(Map<String, String> data) throws Throwable {
        Set<String> notApplicableStates = Set.of("CA", "HI", "MD", "FL");

        if (!notApplicableStates.contains(data.get("State"))) {
            verifyBlockExists("credit score/ tiers");
        }
    }

    public void fillCreditScoreTiersDetailsHO_END(Map<String, String> data) throws Throwable {
        Set<String> notApplicableStates = Set.of("CA", "HI", "MD", "FL");

        if (!notApplicableStates.contains(data.get("State"))) {
            verifyBlockExists("credit score/ tiers");
        }
    }

    public void fillCreditScoreTiersDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        Set<String> notApplicableStates = Set.of("CA", "HI", "MD", "FL");

        if (!notApplicableStates.contains(data.get("State"))) {
            verifyBlockExists("credit score/ tiers");
        }
    }

    public void fillCreditScoreTiersDetailsHO_RNW(Map<String, String> data) throws Throwable {
        Set<String> notApplicableStates = Set.of("CA", "HI", "MD", "FL");

        if (!notApplicableStates.contains(data.get("State"))) {
            verifyBlockExists("credit score/ tiers");
        }
    }

    public void fillCreditScoreTiersDetailsCO(Map<String, String> data) throws Throwable {
        verifyBlockExists("credit score/ tiers");
    }

    public void fillCreditScoreTiersDetailsES(Map<String, String> data) throws Throwable {
        Set<String> notApplicableStates = Set.of("CA", "MA");
        if (!notApplicableStates.contains(data.get("State"))) {
            verifyBlockExists("credit score/ tiers");
        }
        verifyInsuranceScoreType(data.get("Credit_Score_Tiers_Insurance_Score_Type"));
        verifyApplicantInsuranceScore(data.get("Credit_Score_Tiers_Applicant_Insurance_Score"));
        verifyDatePulled(data.get("Credit_Score_Tiers_Date_Pulled"));
        verifyInsuranceScoreTier(data.get("Credit_Score_Tiers_Insurance_Score_Tier"));
        verifyInsuranceScoreForRating(data.get("Credit_Score_Tiers_Insurance_Score_For_Rating"));
    }

    public void fillCreditScoreTiersDetailsFS(Map<String, String> data) {

    }

}