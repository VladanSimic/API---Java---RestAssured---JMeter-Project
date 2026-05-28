package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class BankVaultedJewelryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public BankVaultedJewelryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total Scheduled Jewelry in Bank Vault Coverage ($)']/../../../../div//input")
    WebElement totalSJBVC;
    @FindBy(xpath = "//div[text()='bank vaulted jewelry']/../../../../../../../../../following-sibling::tr[1]//div[text()='Item Value']/../../../..//input")
    WebElement HVIValueSJBVC;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[2]")
    WebElement itemValue;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[2]")
    WebElement SJBVCItemDescription;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[2]")
    WebElement SJBVCHasAppraised2YearsYes;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[2]")
    WebElement SJBVCHasAppraised2YearsNo;
    @FindBy(xpath = "(//div[contains(text(),'member insuring the entire Jewelry Collection to the current value')]/../../../../div//label[text()='Yes']/../span/input)[1]")
    WebElement SJBVCInsuringEntireJCYes;
    @FindBy(xpath = "(//div[contains(text(),'member insuring the entire Jewelry Collection to the current value')]/../../../../div//label[text()='No']/../span/input)[1]")
    WebElement SJBVCInsuringEntireJCNo;
    @FindBy(xpath = "//div[text()='bank vaulted jewelry']")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'bank vaulted jewelry')]/../../../../../..//table//tr/td[3]")
    List<WebElement> descriptionOfItem;
    @FindBy(xpath = "//div[contains(text(),'bank vaulted jewelry')]/../../../../../..//table//tr/td[4]")
    List<WebElement> limitOfItem;
    @FindBy(xpath = "//div[text()='bank vaulted jewelry']/../../../../../../../../../..//div[text()='Total Scheduled Jewelry in Bank Vault Coverage ($)']/../../../..//input")
    WebElement totalScheduledJewelryInBankV;
    @FindBy(xpath = "//div[text()='bank vaulted jewelry']/../../../../../../../../../following-sibling::tr[1]//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../..//input")
    WebElement HVIValueBVJ;
    @FindBy(xpath = "//div[text()='bank vaulted jewelry']/ancestor::tr/following-sibling::tr[.//div[text()='Item Description']][1]//textarea")
    WebElement ItemDescriptionBVJ;
    @FindBy(xpath = "//div[contains(text(),'bank vaulted jewelry')]/../../../../../..//table//tr/td[5]")
    List<WebElement> limitOfItemCO;
    @FindBy(xpath = "//div[contains(text(),'bank vaulted jewelry')]/../../../../../..//table//tr/td[6]//input[2]")
    List<WebElement> agreedValueYes;
    @FindBy(xpath = "//div[contains(text(),'bank vaulted jewelry')]/../../../../../..//table//tr/td[7]")
    List<WebElement> appraisalDateCO;

    //CO
    public void fillBankVaultedJewelry(Map<String, String> data) throws Throwable {
        if(data.get("Add_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes")) {
            verifyBlockExists("bank vaulted jewelry");
            typeText(totalSJBVC, data.get("Total_Scheduled_Jewelry_BVC"));
            if (data.get("State").equalsIgnoreCase("CA") || data.get("State").equalsIgnoreCase("HI")) {
                typeText(itemValue, data.get("SJBVC_HVI_Value"));
            } else {
                typeText(HVIValueSJBVC, data.get("SJBVC_HVI_Value"));
            }
            typeText(SJBVCItemDescription, data.get("SJBVC_Item_Description"));
            choose(SJBVCHasAppraised2YearsYes, SJBVCHasAppraised2YearsNo, data.get("SJBVC_Has_Appraised_2_Years"));
            choose(SJBVCInsuringEntireJCYes, SJBVCInsuringEntireJCNo, data.get("SJBVC_Insuring_Entire_JC_Curr_Val"));
        }
    }

    public void fillBankVaultedJewelryHS(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelryInBankV(data.get("Bank_Vaulted_Jewelry_Block_Total_Scheduled_Jewelry_In_Bank_Vault"));
            setBankVaultedJewelryHVIValue(data.get("Bank_Vaulted_Jewelry_Block_BVJ_HVI_Value"));
            setBankVaultedJewelryItemDesc(data.get("Bank_Vaulted_Jewelry_Block_BVJ_Item_Description"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillBankVaultedJewelryHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Bank_Vaulted_Jewelry_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelryInBankV(data.get("Bank_Vaulted_Jewelry_Block_Total_Scheduled_Jewelry_In_Bank_Vault_END"));
            setBankVaultedJewelryHVIValue(data.get("Bank_Vaulted_Jewelry_Block_BVJ_HVI_Value_END"));
            setBankVaultedJewelryItemDesc(data.get("Bank_Vaulted_Jewelry_Block_BVJ_Item_Description_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillBankVaultedJewelryHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Bank_Vaulted_Jewelry_OOS_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelryInBankV(data.get("Bank_Vaulted_Jewelry_Block_Total_Scheduled_Jewelry_In_Bank_Vault_OOS_END"));
            setBankVaultedJewelryHVIValue(data.get("Bank_Vaulted_Jewelry_Block_BVJ_HVI_Value_OOS_END"));
            setBankVaultedJewelryItemDesc(data.get("Bank_Vaulted_Jewelry_Block_BVJ_Item_Description_OOS_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillBankVaultedJewelryHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Bank_Vaulted_Jewelry_RNW").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelryInBankV(data.get("Bank_Vaulted_Jewelry_Block_Total_Scheduled_Jewelry_In_Bank_Vault_RNW"));
            setBankVaultedJewelryHVIValue(data.get("Bank_Vaulted_Jewelry_Block_BVJ_HVI_Value_RNW"));
            setBankVaultedJewelryItemDesc(data.get("Bank_Vaulted_Jewelry_Block_BVJ_Item_Description_RNW"));
            saveChanges();
            pause(2000);
        }
    }

    public void setBankVaultedJewelryItemDesc(String value) throws InterruptedException {
        typeTextEnter(ItemDescriptionBVJ, value, "Item Description");
        pause(2000);
        clickBlock();

    }

    public void setBankVaultedJewelryHVIValue(String value) {
        typeTextEnter(HVIValueBVJ, value, "Bank Vaulted Jewelry HVI Value");
        clickBlock();
    }

    public void setTotalScheduledJewelryInBankV(String value) throws InterruptedException {
        typeTextEnter(totalScheduledJewelryInBankV, value, "Total Scheduled Jewelry BVJ");
        pause(2000);
        clickBlock();
    }

    public void setLimitOfItem(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItem.get(i), "Description of item");
            typeText(driver.switchTo().activeElement(), value, "Limit of item");
        }
    }

    public void setDescriptionOfItem(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(descriptionOfItem.get(i), "Description of item");
            typeText(driver.switchTo().activeElement(), value, "Description of item");
        }
    }

    public void clickBlock() {
        clickElement(block, "Block");

    }

    public void setLimitOfItemCO(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItemCO.get(i), "Limit of item");
            typeText(driver.switchTo().activeElement(), value, "Limit of item");
        }
    }

    public void setAgreedValueCO(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickBlock();
            clickElement(agreedValueYes.get(i), "Agreed Value");
        }
    }

    public void setAppraisalDateCO(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(appraisalDateCO.get(i), "Appraisal date");
            typeText(driver.switchTo().activeElement(), value, "Appraisal date");
        }
    }
}
