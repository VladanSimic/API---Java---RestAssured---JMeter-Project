package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class SinkholeBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public SinkholeBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Distance to Closest Sinkhole']/../../../..//input")
    WebElement distanceToClosestSinkhole;
    @FindBy(xpath = "//div[text()='Number of Sinkholes found within .50 miles']/../../../..//input")
    WebElement numberOfSinkholesFoundWithin_0_50_Miles;
    @FindBy(xpath = "//div[text()='Number of Sinkholes found within .20 miles']/../../../..//input")
    WebElement numberOfSinkholesFoundWithin_0_20_Miles;
    @FindBy(xpath = "//div[text()='Date Reported']/../../../..//input")
    WebElement dateReported;
    @FindBy(xpath = "//div[text()='Number of Sinkholes found within 1.50 miles']/../../../..//input")
    WebElement numberOfSinkholesFoundWithin_1_50_Miles;
    @FindBy(xpath = "//div[text()='Ref_num']/../../../..//input")
    WebElement refNum;
    @FindBy(xpath = "//div[text()='Sinkhole claims under investigation']/../../../..//input")
    WebElement sinkholeClaimsUnderInvestigation;

    public void fillSinkholeDetailsCC(Map<String, String> data) throws Throwable {
        verifyDistanceToClosestSinkhole(data.get("Sinkhole_Distance_To_Closest_Sinkhole"));
        verifyNumberOfSinkholesFoundWithin_0_50_Miles(data.get("Sinkhole_Number_Of_Sinkholes_Found_Within_0_50_Miles"));
        verifyNumberOfSinkholesFoundWithin_0_20_Miles(data.get("Sinkhole_Number_Of_Sinkholes_found_Within_0_20_Miles"));
        verifyDateReported(data.get("Sinkhole_Date_Reported"));
        verifyNumberOfSinkholesFoundWithin_1_50_Miles(data.get("Sinkhole_Number_Of_Sinkholes_Found_Within_1_50_Miles"));
        verifyRefNum(data.get("Sinkhole_Ref_Num"));
        verifySinkholeClaimsUnderInvestigation(data.get("Sinkhole_Sinkhole_Claims_Under_Investigation"));
        saveChanges();
    }

    public void fillSinkholeDetailsCC_END(Map<String, String> data) throws Throwable {
        verifyDistanceToClosestSinkhole(data.get("Sinkhole_Distance_To_Closest_Sinkhole_END"));
        verifyNumberOfSinkholesFoundWithin_0_50_Miles(data.get("Sinkhole_Number_Of_Sinkholes_Found_Within_0_50_Miles_END"));
        verifyNumberOfSinkholesFoundWithin_0_20_Miles(data.get("Sinkhole_Number_Of_Sinkholes_found_Within_0_20_Miles_END"));
        verifyDateReported(data.get("Sinkhole_Date_Reported_END"));
        verifyNumberOfSinkholesFoundWithin_1_50_Miles(data.get("Sinkhole_Number_Of_Sinkholes_Found_Within_1_50_Miles_END"));
        verifyRefNum(data.get("Sinkhole_Ref_Num_END"));
        verifySinkholeClaimsUnderInvestigation(data.get("Sinkhole_Sinkhole_Claims_Under_Investigation_END"));
        saveChanges();
    }

    public void verifySinkholeClaimsUnderInvestigation(String value) {
        assertCellValue(sinkholeClaimsUnderInvestigation, value, "Sinkhole Claims Under Investigation");
    }

    public void verifyRefNum(String value) {
        assertCellValue(refNum, value, "Ref Num");
    }

    public void verifyNumberOfSinkholesFoundWithin_1_50_Miles(String value) {
        assertCellValue(numberOfSinkholesFoundWithin_1_50_Miles, value, "Number Of Sinkholes Found Within 1 50 Miles");
    }

    public void verifyDateReported(String value) {
        assertCellValue(dateReported, value, "Date Reported");
    }

    public void verifyNumberOfSinkholesFoundWithin_0_20_Miles(String value) {
        assertCellValue(numberOfSinkholesFoundWithin_0_20_Miles, value, "Number Of Sinkholes found Within 0 20 Miles");
    }

    public void verifyNumberOfSinkholesFoundWithin_0_50_Miles(String value) {
        assertCellValue(numberOfSinkholesFoundWithin_0_50_Miles, value, "Number Of Sinkholes Found Within 0 50 Miles");
    }

    public void verifyDistanceToClosestSinkhole(String value) {
        assertCellValue(distanceToClosestSinkhole, value, "Distance To Closest Sinkhole");
    }

}