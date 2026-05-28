package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class CollectiblesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public CollectiblesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Total Scheduled Collectibles')]/../../../../div//input")
    WebElement totalCC;
    @FindBy(xpath = "//div[contains(text(),'Total Blanket Collectibles')]/../../../../div//input")
    WebElement totalBlanketCC;
    @FindBy(xpath = "(//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../../div//input)[2]")
    WebElement HVIValueCC;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[4]")
    WebElement itemValue;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[4]")
    WebElement CCItemDescription;
    @FindBy(xpath = "//div[contains(text(),'Fine Arts Earthquake')]/../../../../div//input")
    WebElement faEarthquake;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[4]")
    WebElement CChasAppraised2YearsYes;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[4]")
    WebElement CChasAppraised2YearsNo;
    @FindBy(xpath = "//div[contains(text(),'member insuring the entire  Collectibles')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement CCMemberInsuringEntireYes;
    @FindBy(xpath = "//div[contains(text(),'member insuring the entire  Collectibles')]/../../../../div//label[text()='No']/../span/input")
    WebElement CCMemberInsuringEntireNo;
    @FindBy(xpath = "(//label[contains(text(),'EQ Deductible')]/..//input)[1]")
    WebElement eqDeductible;
    @FindBy(xpath = "//div[contains(text(),'collectibles')]")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'collectibles')]/../../../../../..//table//tr/td[3]")
    List<WebElement> descriptionOfItem;
    @FindBy(xpath = "//div[contains(text(),'collectibles')]/../../../../../..//table//tr/td[4]")
    List<WebElement> limitOfItem;
    @FindBy(xpath = "//div[text()='collectibles']/../../../../../../../../../..//div[text()='Total Scheduled Collectibles Coverage ($)']/../../../..//input")
    WebElement totalScheduledCollectibles;
    @FindBy(xpath = "//div[text()='collectibles']/../../../../../../../../../..//div[text()='Total Blanket Collectibles Coverage ($)']/../../../..//input")
    WebElement totalBlanketCollectibles;
    @FindBy(xpath = "//div[text()='collectibles']/../../../../../../../../../following-sibling::tr[2]//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../..//input")
    WebElement HVIValueCollectibles;
    @FindBy(xpath = "//div[text()='collectibles']/ancestor::tr/following-sibling::tr[.//div[text()='Item Description']][1]//textarea")
    WebElement ItemDescriptionCollectibles;
    @FindBy(xpath = "(//div[text()='collectibles']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[3]")
    List<WebElement> collectiblesBlanketCoverageSingleArticleLimit;
    @FindBy(xpath = "//div[text()='collectibles']/../../../../../..//table//tr/td[5]")
    List<WebElement> limitOfItemCO;
    @FindBy(xpath = "//div[text()='collectibles']/../../../../../..//table//tr/td[6]//input[1]")
    List<WebElement> agreedValueYes;
    @FindBy(xpath = "//div[text()='collectibles']/../../../../../..//table//tr/td[7]")
    List<WebElement> appraisalDateCO;

    //CO
    public void fillCollectibles(Map<String, String> data) throws Throwable {
        if (data.get("Add_Collectibles").equalsIgnoreCase("Yes")) {
            int coverageCounter;
            List<WebElement> blanketCoverageSingleArticleLimit;
            String xPath;
            if (data.get("State").equalsIgnoreCase("CA")) {
                verifyBlockExists("collectibles");
                typeText(totalCC, data.get("Total_Scheduled_CC"));
                typeText(totalBlanketCC, data.get("Total_Blanket_CC"));
                if (data.get("State").equalsIgnoreCase("CA")) {
                    typeText(itemValue, data.get("CC_HVI_Value"));
                    coverageCounter = countCoverageHasBlanketCoverage(data, "Total_Blanket_Jewelry") +
                            countCoverageHasBlanketCoverage(data, "Total_Blanket_FACC") +
                            1;
                    xPath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[" + (coverageCounter) + "]";
                    blanketCoverageSingleArticleLimit = driver.findElements(By.xpath(xPath));
                    if (blanketCoverageSingleArticleLimit.size() > 0 && hasValue(data.get("Total_Scheduled_CC"))) {
                        typeText(blanketCoverageSingleArticleLimit.get(0), "5000");
                    }
//            typeText(faEarthquake, data.get("Fine_Arts_Earthquake"));
//            checkCheckbox(eqDeductible, data.get("FA_EQ_Deductible_Override"));
                }
                typeText(CCItemDescription, data.get("CC_Item_Description"));
                choose(CChasAppraised2YearsYes, CChasAppraised2YearsNo, data.get("CC_Has_Appraised_2_Years"));
                choose(CCMemberInsuringEntireYes, CCMemberInsuringEntireNo, data.get("CC_Member_Insuring_Entire_Fine_Arts"));
                pause(3000);
            }
        }
    }

    public int countCoverageHasBlanketCoverage(Map<String, String> data, String testDataBlanket) {
        return (data.get(testDataBlanket) != null
                && !data.get(testDataBlanket).equalsIgnoreCase("")
                && !data.get(testDataBlanket).equalsIgnoreCase("0")) ? 1 : 0;
    }

    public void fillCollectiblesBlockHS(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Collectibles").equalsIgnoreCase("Yes")) {
            setTotalScheduledCollectibles(data.get("Collectibles_Block_Total_Scheduled_Collectibles"));
            setTotalBlanketCollectibles(data.get("Collectibles_Block_Total_Blanket_Collectibles"));
            setCollectiblesHVIValue(data.get("Collectibles_Block_Collectibles_HVI_Value"));
            setBlanketSingleArticleLimitAmt(data.get("Collectibles_Block_Blanket_Coverage_Single_Article_Limit"));
            setCollectiblesItemDescription(data.get("Collectibles_Block_Item_Description"));
            saveChanges();
            pause(2000);
        }
    }


    public void setBlanketSingleArticleLimitAmt(String value) {
        if (collectiblesBlanketCoverageSingleArticleLimit.size() > 0) {
            typeText(collectiblesBlanketCoverageSingleArticleLimit.get(0), value, "Blanket Single Article Limit Amt");
            clickBlock();
        }
    }

    public void fillCollectiblesBlockHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Collectibles_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledCollectibles(data.get("Collectibles_Block_Total_Scheduled_Collectibles_END"));
            setTotalBlanketCollectibles(data.get("Collectibles_Block_Total_Blanket_Collectibles_END"));
            setCollectiblesHVIValue(data.get("Collectibles_Block_Collectibles_HVI_Value_END"));
            setCollectiblesItemDescription(data.get("Collectibles_Block_Item_Description_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillCollectiblesBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Collectibles_OOS_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledCollectibles(data.get("Collectibles_Block_Total_Scheduled_Collectibles_OOS_END"));
            setTotalBlanketCollectibles(data.get("Collectibles_Block_Total_Blanket_Collectibles_OOS_END"));
            setCollectiblesHVIValue(data.get("Collectibles_Block_Collectibles_HVI_Value_OOS_END"));
            setCollectiblesItemDescription(data.get("Collectibles_Block_Item_Description_OOS_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillCollectiblesBlockHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Collectibles_RNW").equalsIgnoreCase("Yes")) {
            setTotalScheduledCollectibles(data.get("Collectibles_Block_Total_Scheduled_Collectibles_RNW"));
            setTotalBlanketCollectibles(data.get("Collectibles_Block_Total_Blanket_Collectibles_RNW"));
            setCollectiblesHVIValue(data.get("Collectibles_Block_Collectibles_HVI_Value_RNW"));
            setCollectiblesItemDescription(data.get("Collectibles_Block_Item_Description_RNW"));
            saveChanges();
            pause(2000);
        }
    }

    public void setCollectiblesItemDescription(String value) {
        typeText(ItemDescriptionCollectibles, value, "Description of item");
        clickBlock();
    }

    public void setCollectiblesHVIValue(String value) {
        typeText(HVIValueCollectibles, value, "HVI Collectibles");
        clickBlock();
    }

    public void setTotalBlanketCollectibles(String value) {
        typeText(totalBlanketCollectibles, value, "Total Scheduled Collectibles");
        clickBlock();
    }

    public void setTotalScheduledCollectibles(String value) throws InterruptedException {
        typeText(totalScheduledCollectibles, value, "Total Scheduled Collectibles");
        pause(2000);
        clickBlock();
    }

    public void setLimitOfItem(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItem.get(i), "Limit of item");
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
