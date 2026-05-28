package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class WorldwideJewleryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WorldwideJewleryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total Scheduled Jewelry Coverage ($)']/../../../../div//input")
    WebElement totalSJC;
    @FindBy(xpath = "//div[text()='Total Blanket Jewelry Coverage ($)']/../../../../div//input")
    WebElement totalBlanketJS;
    @FindBy(xpath = "(//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../../div//input)[1]")
    WebElement hviValueSJC;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[1]")
    WebElement itemValue;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[1]")
    WebElement SJCItemDescription;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[1]")
    WebElement hasAppraised2YearsYes;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[1]")
    WebElement hasAppraised2YearsNo;
    @FindBy(xpath = "(//div[contains(text(),'member keep Jewelry in a Home safe?')]/../../../../div//label[text()='Yes']/../span/input)[1]")
    WebElement keepJewelryHomeSafeYes;
    @FindBy(xpath = "(//div[contains(text(),'member keep Jewelry in a Home safe?')]/../../../../div//label[text()='No']/../span/input)[1]")
    WebElement keepJewelryHomeSafeNo;
    @FindBy(xpath = "//div[text()='Make of the Vault/ Safe']/../../../../div//input")
    WebElement makeOfVaultSafe;
    @FindBy(xpath = "//div[text()='Model of the Vault/ Safe']/../../../../div//input")
    WebElement modelOfVaultSafe;
    @FindBy(xpath = "(//div[contains(text(),'Vault/ Safe bolted to the ground?')]/../../../../div//label[text()='Yes']/../span/input)[1]")
    WebElement vaultSafeBoltedGroundYes;
    @FindBy(xpath = "(//div[contains(text(),'Vault/ Safe bolted to the ground?')]/../../../../div//label[text()='No']/../span/input)[1]")
    WebElement vaultSafeBoltedGroundNo;
    @FindBy(xpath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[1]")
    List<WebElement> blanketCoverageSingleArticleLimit;
    @FindBy(xpath = "//span[text()='save changes']")
    WebElement saveChanges;
    @FindBy(xpath = "//div[text()='What is the maximum amount of jewelry that will be out of the home at any one time?']/../../../../div//input")
    WebElement maxAmountOfJeweleryOutHome;
    @FindBy(xpath = "//div[contains(text(),'you like to add this credit')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement addCreditYes;
    @FindBy(xpath = "//div[contains(text(),'you like to add this credit')]/../../../../div//label[text()='No']/../span/input")
    WebElement addCreditNo;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[3]")
    List<WebElement> descriptionOfItem;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[4]")
    List<WebElement> limitOfItem;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[5]")
    List<WebElement> limitOfItemCO;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[6]//input[2]")
    List<WebElement> agreedValueYes;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[7]")
    List<WebElement> appraisalDateCO;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[8]")
    List<WebElement> deleteCO;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[5]")
    List<WebElement> appraisalDate;
    @FindBy(xpath = "//div[contains(text(),'worldwide jewelry')]/../../../../../..//table//tr/td[6]")
    List<WebElement> delete;
    @FindBy(xpath = "//div[text()='worldwide jewelry']/../../../../../../../../../..//div[text()='Total Scheduled Jewelry Coverage ($)']/../../../..//input")
    WebElement totalScheduledWordWideJewelry;
    @FindBy(xpath = "//div[text()='worldwide jewelry']/../../../../../../../../../..//div[text()='Total Blanket Jewelry Coverage ($)']/../../../..//input")
    WebElement totalBlanketWordWideJewelry;
    @FindBy(xpath = "(//div[contains(text(), 'worldwide jewelry')]/ancestor::table//div[contains(text(), '*The HVI represents the highest valued item')]/ancestor::tr//input)[1]")
    WebElement HVIValueWordWideJewelry;
    @FindBy(xpath = "(//div[text()='worldwide jewelry']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[1]")
    List<WebElement> blanketCoverageSingleArticleLimitWWJ;
    @FindBy(xpath = "//div[text()='worldwide jewelry']/ancestor::tr/following-sibling::tr[.//div[text()='Item Description']][1]//textarea")
    WebElement itemDescriptionWWJ;
    @FindBy(xpath = "//div[text()='worldwide jewelry']/../../../../../../../../../..//div[text()='Total Jewelry Coverage ($)']/../../../..//input")
    WebElement totalJewelryCoverage;


    public void fillWorldwideJewelryCO(Map<String, String> data) throws Throwable {
        verifyBlockExists("worldwide jewelry");
        if (data.get("Add_Worldwide_Jewelry").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelry(data.get("Total_Scheduled_Jewelry"));
            setTotalBlanketJewelry(data.get("Total_Blanket_Jewelry"));
            setBlanketSingleArticleLimitAmt(data.get("Worldwide_Blanket_Single_Article_Limit_Amt"));
            setSJCHVIValue(data.get("SJC_HVI_Value"));
            setSJCItemDescription(data.get("SJC_Item_Description"));
            setHasAppraised2Years(data.get("SJC_Has_Appraised_2_Years"));
            setKeepJewelryHomeSafe(data.get("SJC_Keep_Jewelry_Home_Safe"));
            setMakeOfVaultSafe(data.get("SJC_Make_of_Vault_Safe"));
            setModelOfVaultSafe(data.get("SJC_Model_of_Vault_Safe"));
            setVaultSafeBoltedGround(data.get("SJC_Vault_Safe_Bolted_Ground"), data.get("SJC_Would_Like_Add_Credit"), data.get("SJC_Amount_Jewelry_Out_Of_Home"));
        }
    }

    public void fillWorldwideJewelryHS(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Worldwide_Jewelry").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelry(data.get("Worldwide_Jewelry_Total_Scheduled_Jewelry"));
            setTotalBlanketJewelry(data.get("Worldwide_Jewelry_Total_Blanket_Jewelry"));
            setSJCHVIValue(data.get("Worldwide_Jewelry_SJC_HVI_Value"));
            setBlanketSingleArticleLimitAmt(data.get("Worldwide_Jewelry_Worldwide_Blanket_Single_Article_Limit_Amt"));
            setSJCItemDescription(data.get("Worldwide_Jewelry_SJC_Item_Description"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillWorldwideJewelryHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Worldwide_Jewelry_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelry(data.get("Worldwide_Jewelry_Total_Scheduled_Jewelry_END"));
            setTotalBlanketJewelry(data.get("Worldwide_Jewelry_Total_Blanket_Jewelry_END"));
            setSJCHVIValue(data.get("Worldwide_Jewelry_SJC_HVI_Value_END"));
            setBlanketSingleArticleLimitAmt(data.get("Worldwide_Jewelry_Worldwide_Blanket_Single_Article_Limit_Amt_END"));
            setSJCItemDescription(data.get("Worldwide_Jewelry_SJC_Item_Description_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillWorldwideJewelryHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Worldwide_Jewelry_OOS_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelry(data.get("Worldwide_Jewelry_Total_Scheduled_Jewelry_OOS_END"));
            setTotalBlanketJewelry(data.get("Worldwide_Jewelry_Total_Blanket_Jewelry_OOS_END"));
            setSJCHVIValue(data.get("Worldwide_Jewelry_SJC_HVI_Value_OOS_END"));
            setBlanketSingleArticleLimitAmt(data.get("Worldwide_Jewelry_Worldwide_Blanket_Single_Article_Limit_Amt_OOS_END"));
            setSJCItemDescription(data.get("Worldwide_Jewelry_SJC_Item_Description_OOS_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillWorldwideJewelryHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Worldwide_Jewelry_RNW").equalsIgnoreCase("Yes")) {
            setTotalScheduledJewelry(data.get("Worldwide_Jewelry_Total_Scheduled_Jewelry_RNW"));
            setTotalBlanketJewelry(data.get("Worldwide_Jewelry_Total_Blanket_Jewelry_RNW"));
            setSJCHVIValue(data.get("Worldwide_Jewelry_SJC_HVI_Value_RNW"));
            setBlanketSingleArticleLimitAmt(data.get("Worldwide_Jewelry_Worldwide_Blanket_Single_Article_Limit_Amt_RNW"));
            setSJCItemDescription(data.get("Worldwide_Jewelry_SJC_Item_Description_RNW"));
            saveChanges();
            pause(2000);
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
            clickElement(limitOfItem.get(i), "Limit of item");
            typeText(driver.switchTo().activeElement(), value, "Limit of item");
        }
    }

    public void clickBlock() {
        clickElement(block, "Block");
    }

    public void setTotalScheduledJewelry(String value) throws InterruptedException {
        typeTextEnter(totalScheduledWordWideJewelry, value, "Total Scheduled Jewelry");
        pause(2000);
        clickBlock();
    }

    public void setTotalBlanketJewelry(String value) throws InterruptedException {
        typeText(totalBlanketWordWideJewelry, value, "Total Blanket Jewelry");
        pause(3000);
        clickBlock();
    }

    public void setSJCHVIValue(String value) throws InterruptedException {
        if (isElementDisplayed(HVIValueWordWideJewelry) && HVIValueWordWideJewelry.isEnabled() && HVIValueWordWideJewelry.getAttribute("readonly") == null) {
            typeText(HVIValueWordWideJewelry, value, "SJC HVI Value");
            pause(3000);
            clickBlock();
        }
    }

    public void setBlanketSingleArticleLimitAmt(String value) {
        if (blanketCoverageSingleArticleLimitWWJ.size() > 0) {
            typeText(blanketCoverageSingleArticleLimitWWJ.get(0), value, "Blanket Single Article Limit Amt");
            clickBlock();
        }
    }

    public void setSJCItemDescription(String value) throws Throwable {
        if (itemDescriptionWWJ.isEnabled() && itemDescriptionWWJ.getAttribute("readonly") == null) {
            typeTextEnter(itemDescriptionWWJ, value, "SJC Item Description");
            pause(1000);
            clickBlock();
        }
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

    public void setHasAppraised2Years(String value) throws Throwable {
        choose(hasAppraised2YearsYes, hasAppraised2YearsNo, value, "Has Appraised 2 Years");
    }

    public void setKeepJewelryHomeSafe(String value) throws Throwable {
        choose(keepJewelryHomeSafeYes, keepJewelryHomeSafeNo, value, "Does the member keep jewelry home safe");
    }

    public void setMakeOfVaultSafe(String value) {
        typeText(makeOfVaultSafe, value, "Make of Vault Safe");
    }

    public void setModelOfVaultSafe(String value) {
        typeText(modelOfVaultSafe, value, "Model of Vault Safe");
    }

    public void setVaultSafeBoltedGround(String yesOrNo, String credit, String maxAmountJewelery) throws Throwable {
        if (hasValue(yesOrNo)) {
            choose(vaultSafeBoltedGroundYes, vaultSafeBoltedGroundNo, yesOrNo, "Vault Safe Bolted Ground");
            pause(2000);
            if (yesOrNo.equalsIgnoreCase("Yes")) {
                choose(addCreditYes, addCreditNo, credit, "Add Credit");
                if (hasValue(credit) && credit.equalsIgnoreCase("Yes")) {
                    pause(2000);
                    typeText(maxAmountOfJeweleryOutHome, maxAmountJewelery, "Max Amount Jewelery");
                }
            }
        }
    }

}