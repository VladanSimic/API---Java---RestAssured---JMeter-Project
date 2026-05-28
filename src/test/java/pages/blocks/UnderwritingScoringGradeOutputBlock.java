package pages.blocks;

import excel.DataManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;
import pages.utils.SoftAssertion;

import java.util.List;
import java.util.Map;

public class UnderwritingScoringGradeOutputBlock extends CommonComponentsAndActions {

    public UnderwritingScoringGradeOutputBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr//td[1]//div")
    List<WebElement> locationAddress;
    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr//td[5]//div")
    List<WebElement> aggregationScore;
    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr//td[6]//div")
    List<WebElement> nonCATGrade;
    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr//td[7]//div")
    List<WebElement> catScore;
    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr//td[3]//div")
    List<WebElement> oldLocationGrade;
    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr//td[2]//div")
    List<WebElement> autoGrade;
    @FindBy(xpath = "//div[text()='underwriting scoring grade output']/../../../../../..//tr//td[1]//div")
    List<WebElement> excessGrade;

    public void insertHomeAnalyticsIntoData(String trx) {
        Map<String, String> data = DataManager.getInstance().getData();

        for (int i = 0; i < locationAddress.size(); i++) {
            data.put(trx + "_HomeGrade_LocationAddress_" + (i + 1), getLocationAddress(i));
            data.put(trx + "_HomeGrade_AggregationScore_" + (i + 1), getAggregationScore(i));
            data.put(trx + "_HomeGrade_NonCATGrade_" + (i + 1), getNonCATGrade(i));
            data.put(trx + "_HomeGrade_CATScore_" + (i + 1), getCATScore(i));
        }
        data.put(trx + "_HomeGrade_TotalCount", String.valueOf(locationAddress.size()));
    }

    public String getLocationAddress(int i) {
        return locationAddress.get(i).getText();
    }

    public String getAggregationScore(int i) {
        return aggregationScore.get(i).getText();
    }

    public String getNonCATGrade(int i) {
        return nonCATGrade.get(i).getText();
    }

    public String getCATScore(int i) {
        return catScore.get(i).getText();
    }

    public void verifyAggregationScore(int index, String value) {
        String uiValue = aggregationScore.get(index).getText();
        if (!uiValue.equalsIgnoreCase(value))
            Assert.fail("Aggregation score is incorrect. Expected: " + value + ", but returned: " + uiValue);
    }

    public void verifyNonCATGrade(int index, String value) {
        String uiValue = nonCATGrade.get(index).getText();
        if (!uiValue.equalsIgnoreCase(value))
            Assert.fail("Non CAT Grade is incorrect. Expected: " + value + ", but returned: " + uiValue);
    }

    public void verifyCATScore(int index, String value) {
        String uiValue = catScore.get(index).getText();
        if (!uiValue.equalsIgnoreCase(value))
            Assert.fail("CAT score is incorrect. Expected: " + value + ", but returned: " + uiValue);
    }

    public void verifyHomePredictiveBasedOnSavedValues(Map<String, String> data, String trx) {
        int totalCountPerTrx = Integer.parseInt(data.get(trx + "_HomeGrade_TotalCount"));
        boolean matchFound = false;

        for (int i = 0; i < locationAddress.size(); i++) {
            String addressOnUI = locationAddress.get(i).getText();
            for (int y = 0; y < totalCountPerTrx; y++) {
                String addressInData = data.get(trx + "_HomeGrade_LocationAddress_" + (y + 1));
                if (addressOnUI.equalsIgnoreCase(addressInData)) {
                    verifyAggregationScore(i, data.get(trx + "_HomeGrade_AggregationScore_" + (y + 1)));
                    verifyNonCATGrade(i, data.get(trx + "_HomeGrade_NonCATGrade_" + (y + 1)));
                    verifyCATScore(i, data.get(trx + "_HomeGrade_CATScore_" + (y + 1)));
                    matchFound = true;
                    break;
                }
            }
        }
        if (!matchFound) {
            throw new RuntimeException("Location data is not found anymore");
        }
    }

    public void verifyAllHomeNonCatGradeValues(String value) {
        reportScreenshot("Location_Grade", "Location Grade Integration");
        for (WebElement grade : nonCATGrade) {
            if (!grade.getText().equalsIgnoreCase(value))
                failAssertion("Grade does not match! Expected " + value + ", but returned " + grade.getText());
            else
                successLog("Location grade is matching expected value");
        }
    }

    public void verifyOldHomeAnalyticsModelForAllLocations(String value) {
        reportScreenshot("Location_Grade", "Location Grade Integration");
        for (WebElement grade : oldLocationGrade) {
            if (!grade.getText().equalsIgnoreCase(value))
                failAssertion("Grade does not match! Expected " + value + ", but returned " + grade.getText());
            else
                successLog("Location grade is matching expected value");
        }
    }

    public void verifyAllAutoGradeValues(String value) {
        reportScreenshot("Auto_Grade", "Auto Grade Integration");
        for (WebElement grade : autoGrade) {
            if (!grade.getText().equalsIgnoreCase(value))
                failAssertion("Grade does not match! Expected " + value + ", but returned " + grade.getText());
            else
                successLog("Auto grade is matching expected value");
        }
    }

    public void verifyAllExcessGradeValues(String value) {
        reportScreenshot("Excess_Grade", "Excess Grade Integration");
        for (WebElement grade : excessGrade) {
            if (!grade.getText().equalsIgnoreCase(value))
                failAssertion("Grade does not match! Expected " + value + ", but returned " + grade.getText());
            else
                successLog("Excess grade is matching expected value");
        }
    }

}



