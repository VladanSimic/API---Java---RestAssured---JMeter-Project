package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class EarthquakeUnderwritingOnlyBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public EarthquakeUnderwritingOnlyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[text()='Increase max to 50% Loss of Use?(max of $1,800,000) ']/../../../..//input)[2]")
    WebElement increaseMaxTo50PercentLossOfUseYes;
    @FindBy(xpath = "(//div[text()='Increase max to 50% Loss of Use?(max of $1,800,000) ']/../../../..//input)[1]")
    WebElement increaseMaxTo50PercentLossOfUseNo;
    @FindBy(xpath = "(//div[text()='Extended Replacement Cost']/../../../..//input)[2]")
    WebElement extendedReplacementCostYes;
    @FindBy(xpath = "(//div[text()='Extended Replacement Cost']/../../../..//input)[1]")
    WebElement extendedReplacementCostNo;

    public void fillEarthquakeUnderwritingOnlyDetailCC(Map<String, String> data) throws Throwable {
        setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use"));
        setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost"));
    }

    public void fillEarthquakeUnderwritingOnlyDetailCC_END(Map<String, String> data) throws Throwable {
        setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_END"));
        setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_END"));
    }

    public void setIncreaseMaxTo50PercentLossOfUse(String value) throws Throwable {
        choose(increaseMaxTo50PercentLossOfUseYes, increaseMaxTo50PercentLossOfUseNo, value, "Increase Max To 50 Percent Loss Of Use");
    }

    public void setExtendedReplacementCost(String value) throws Throwable {
        choose(extendedReplacementCostYes, extendedReplacementCostNo, value, "Extended Replacement Cost");
    }

    public void fillEarthquakeUnderwritingOnlyDetailHS(Map<String, String> data) throws Throwable {
        if (data.get("Earthquake_Coverage_Options_Earth_Coverage_Option").equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost"));
        }
    }

    public void fillEarthquakeUnderwritingOnlyDetailHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END").equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_END"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_END"));
        }
    }

    public void fillEarthquakeUnderwritingOnlyDetailHO(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost"));
            verifyBlockExists("Underwriting only");
        }
    }

    public void fillEarthquakeUnderwritingOnlyDetailHO_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_END");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_END"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_END"));
            verifyBlockExists("Underwriting only");
        }
    }

    public void fillEarthquakeUnderwritingOnlyDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_OOS_END"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_OOS_END"));
            verifyBlockExists("Underwriting only");
        }
    }

    public void fillEarthquakeUnderwritingOnlyDetailHO_RNW(Map<String, String> data) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_RNW");
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_RNW"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_RNW"));
            verifyBlockExists("Underwriting only");
        }
    }

    public void fillEarthquakeUnderwritingOnlyDetailHO(Map<String, String> data, int i) throws Throwable {
        String condition = data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_" + i);
        if (hasValue(condition) && condition.equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_" + i));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_" + i));
            verifyBlockExists("Underwriting only");
        }
    }


    public void fillEarthquakeUnderwritingOnlyDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_OOS_END").equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_OOS_END"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_OOS_END"));
        }
    }

    public void fillEarthquakeUnderwritingOnlyDetailHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Earthquake_Coverage_Options_Earth_Coverage_Option_RNW").equalsIgnoreCase("Broad")) {
            setIncreaseMaxTo50PercentLossOfUse(data.get("Underwriting_Only_Increase_Max_To_50_Percent_Loss_Of_Use_RNW"));
            setExtendedReplacementCost(data.get("Underwriting_Only_Extended_Replacement_Cost_RNW"));
        }
    }


}