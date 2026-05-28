package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class MiscellaneousValuableItemsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public MiscellaneousValuableItemsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total Scheduled Miscellaneous Valuable Items Coverage ($)']/../../../../div//input")
    WebElement totalMiscValuableItems;
    @FindBy(xpath = "//div[text()='miscellaneous valuable items']")
    WebElement block;
    @FindBy(xpath = "//div[text()='miscellaneous valuable items']/../../../../../../../../..//table//tr/td[3]")
    List<WebElement> descriptionOfItem;
    @FindBy(xpath = "//div[contains(text(),'miscellaneous valuable items')]/../../../../../../../../..//table//tr/td[4]")
    List<WebElement> limitOfItem;
    @FindBy(xpath = "//div[text()='miscellaneous valuable items']/../../../../../../../../../..//div[text()='Total Scheduled Miscellaneous Valuable Items Coverage ($)']/../../../..//input")
    WebElement totalScheduledMiscellaneousValuableItem;
    @FindBy(xpath = "//div[contains(text(),'miscellaneous valuable items')]/../../../../../..//table//tr/td[5]")
    List<WebElement> limitOfItemCO;
    @FindBy(xpath = "//div[contains(text(),'miscellaneous valuable items')]/../../../../../..//table//tr/td[6]//input[2]")
    List<WebElement> agreedValueYes;
    @FindBy(xpath = "//div[contains(text(),'miscellaneous valuable items')]/../../../../../..//table//tr/td[7]")
    List<WebElement> appraisalDateCO;


    //CO
    public void fillMiscValuableItems(Map<String, String> data) throws Throwable {
        verifyBlockExists("miscellaneous valuable items");
        if(data.get("Add_Misc_Valuable_Items").equalsIgnoreCase("Yes")) {
            typeText(totalMiscValuableItems, data.get("Total_Scheduled_Misc_Val_Items"));
            pause(3000);
        }
    }

    public void fillMiscellaneousValuableItemsBlockHS(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Miscellaneous_Valuable_Items").equalsIgnoreCase("Yes")) {
            setTotalScheduledMiscValuableItems(data.get("Miscellaneous_Valuable_Items_Block_Total_Scheduled_Miscellaneous_Valuable_Items"));
            clickBlock();
        }
    }

    public void fillMiscellaneousValuableItemsBlockHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Miscellaneous_Valuable_Items_END").equalsIgnoreCase("Yes")) {
            clickBlock();
            setDescriptionOfItem(data.get("Miscellaneous_Valuable_Items_Description_Of_Item_END"));
            setLimitOfItem(data.get("Miscellaneous_Valuable_Items_Limit_Of_Item_END"));
            saveChanges();
        }
    }

    public void fillMiscellaneousValuableItemsBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Miscellaneous_Valuable_Items_OOS_END").equalsIgnoreCase("Yes")) {
            clickBlock();
            setDescriptionOfItem(data.get("Miscellaneous_Valuable_Items_Description_Of_Item_OOS_END"));
            setLimitOfItem(data.get("Miscellaneous_Valuable_Items_Limit_Of_Item_OOS_END"));
            saveChanges();
        }
    }

    public void fillMiscellaneousValuableItemsBlockHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Miscellaneous_Valuable_Items_RNW").equalsIgnoreCase("Yes")) {
            clickBlock();
            setDescriptionOfItem(data.get("Miscellaneous_Valuable_Items_Description_Of_Item_RNW"));
            setLimitOfItem(data.get("Miscellaneous_Valuable_Items_Limit_Of_Item_RNW"));
            saveChanges();
        }

    }

    public void setTotalScheduledMiscValuableItems(String value) throws InterruptedException {
        typeTextEnter(totalScheduledMiscellaneousValuableItem, value, "ScheduleMiscellaneous Valuable Item");
        pause(2000);
        clickBlock();
    }

    public void clickBlock() {
        clickElement(block, "Block");

    }

    public void setDescriptionOfItem(String value) {
        if (hasValue(value)) {
            clickElement(descriptionOfItem.get(0), "Description of item");
            typeText(driver.switchTo().activeElement(), value, "Description of item");
        }
    }

    public void setLimitOfItem(String value) {
        if (hasValue(value)) {
            clickElement(limitOfItem.get(0), "Description of item");
            typeText(driver.switchTo().activeElement(), value, "Description of item");
            clickBlock();
        }
    }

    public void setDescriptionOfItem(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(descriptionOfItem.get(i), "Description of item");
            typeText(driver.switchTo().activeElement(), value, "Description of item");
        }
    }

    public void setLimitOfItem(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItem.get(i), "Description of item");
            typeText(driver.switchTo().activeElement(), value, "Description of item");
        }
    }

    public void setLimitOfItemCO(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItemCO.get(i), "Limit of item");
            typeText(driver.switchTo().activeElement(), value, "Limit of item");
        }
    }

    public void setAppraisalDateCO(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(appraisalDateCO.get(i), "Appraisal date");
            typeText(driver.switchTo().activeElement(), value, "Appraisal date");
        }
    }

    public void setAgreedValueCO(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickBlock();
            clickElement(agreedValueYes.get(i), "Agreed Value");
        }
    }
}
