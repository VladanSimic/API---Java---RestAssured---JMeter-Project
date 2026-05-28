package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class DiscountsBlock extends CommonComponentsAndActions {

    public DiscountsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='3 Years Clean record']/../../../..//input")
    WebElement years3CleanRecord;
    @FindBy(xpath = "//div[text()='5 Years Clean record']/../../../..//input")
    WebElement years5CleanRecord;

    public void fillDiscountsDetailsPA(Map<String, String> data) {
        verify3YearsCleanRecord(data.get("Discounts_3_Years_Clean_Record"));
        verify5YearsCleanRecord(data.get("Discounts_5_Years_Clean_Record"));
    }

    public void fillDiscountsDetailsPA_END(Map<String, String> data) {
        verify3YearsCleanRecord(data.get("Discounts_3_Years_Clean_Record_END"));
        verify5YearsCleanRecord(data.get("Discounts_5_Years_Clean_Record_END"));
    }

    public void fillDiscountsDetailsPA_OOS_END(Map<String, String> data) {
        verify3YearsCleanRecord(data.get("Discounts_3_Years_Clean_Record_OOS_END"));
        verify5YearsCleanRecord(data.get("Discounts_5_Years_Clean_Record_OOS_END"));
    }

    public void fillDiscountsDetailsPA_RNW(Map<String, String> data) {
        verify3YearsCleanRecord(data.get("Discounts_3_Years_Clean_Record_RNW"));
        verify5YearsCleanRecord(data.get("Discounts_5_Years_Clean_Record_RNW"));
    }

    public void verify3YearsCleanRecord(String s) {
        assertCellValue(years3CleanRecord, s, "3 Years Clean Record");
    }

    public void verify5YearsCleanRecord(String s) {
        assertCellValue(years5CleanRecord, s, "5 Years Clean Record");
    }
}