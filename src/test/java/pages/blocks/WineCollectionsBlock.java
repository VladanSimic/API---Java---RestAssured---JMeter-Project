package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class WineCollectionsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WineCollectionsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total Scheduled Wine Coverage ($)']/../../../../div//input")
    WebElement totalWine;
    @FindBy(xpath = "//div[text()='Total Blanket Wine Coverage ($)']/../../../../div//input")
    WebElement totalBlanketWine;
    @FindBy(xpath = "(//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../../div//input)[4]")
    WebElement HVIValueWine;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[6]")
    WebElement itemValue;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[5]")
    WebElement itemValueHI;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[5]")
    WebElement WineItemDescription;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[6]")
    WebElement WineItemDescriptionCO;
    @FindBy(xpath = "//div[contains(text(),'member have a Temperature Alarm?')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement WineHaveTemperatureAlarmYes;
    @FindBy(xpath = "//div[contains(text(),'member have a Temperature Alarm?')]/../../../../div//label[text()='No']/../span/input")
    WebElement WineHaveTemperatureAlarmNo;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[5]")
    WebElement WineHasAppraised2YearsYes;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[5]")
    WebElement WineHasAppraised2YearsNo;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[6]")
    WebElement WineHasAppraised2YearsYesCO;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[6]")
    WebElement WineHasAppraised2YearsNoCO;
    @FindBy(xpath = "//div[contains(text(),'Insurance Amount represent the current value')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement WineInsuranceAmountRepresentCurrentValueYes;
    @FindBy(xpath = "//div[contains(text(),'Insurance Amount represent the current value')]/../../../../div//label[text()='No']/../span/input")
    WebElement WineInsuranceAmountRepresentCurrentValueNo;
    @FindBy(xpath = "//span[text()='save changes']")
    WebElement saveChanges;
    @FindBy(xpath = "//div[text()='wine']")
    WebElement block;
    @FindBy(xpath = "//div[text()='wine']/../../../../../..//table//tr/td[3]")
    List<WebElement> descriptionOfItem;
    @FindBy(xpath = "//div[text()='wine']/../../../../../..//table//tr/td[4]")
    List<WebElement> limitOfItem;
    @FindBy(xpath = "//div[text()='wine']/../../../../../../../../../..//div[text()='Total Scheduled Wine Coverage ($)']/../../../..//input")
    WebElement totalScheduledWine;
    @FindBy(xpath = "//div[text()='wine']/../../../../../../../../../..//div[text()='Total Blanket Wine Coverage ($)']/../../../..//input")
    WebElement totalBlanketWineCov;
    @FindBy(xpath = "//div[text()='wine']/../../../../../../../../../following-sibling::tr[2]//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../..//input")
    WebElement WineHVIValue;
    @FindBy(xpath = "//div[text()='wine']/ancestor::tr/following-sibling::tr[.//div[text()='Item Description']][1]//textarea")
    WebElement itemDescriptionWine;
    @FindBy(xpath = " //div[text()='wine']/../../../../../../../../../..//div[text()='Total Wine Coverage ($)']/../../../..//input")
    WebElement totalWineCoverage;
    @FindBy(xpath = "(//div[text()='wine']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[5]")
    List<WebElement> blanketSingleArticleLimitWine;
    @FindBy(xpath = "//div[text()='wine']/../../../../../..//table//tr/td[5]")
    List<WebElement> limitOfItemCO;
    @FindBy(xpath = "//div[text()='wine']/../../../../../..//table//tr/td[6]//input[2]")
    List<WebElement> agreedValueYes;
    @FindBy(xpath = "//div[text()='wine']/../../../../../..//table//tr/td[7]")
    List<WebElement> appraisalDateCO;


    //CO
    public void fillWineBlock(Map<String, String> data) throws Throwable {
        verifyBlockExists("wine");
        if(data.get("Add_Wine").equalsIgnoreCase("Yes")) {
            int coverageCounter;
            List<WebElement> blanketCoverageSingleArticleLimit;
            String xPath;
            typeText(totalWine, data.get("Total_Scheduled_Wine"));
            if (data.get("Total_Blanket_Wine") != null && !data.get("Total_Blanket_Wine").equalsIgnoreCase("")) {
                typeText(totalBlanketWine, data.get("Total_Blanket_Wine"));
                clickElement(saveChanges);
                coverageCounter = countCoverageHasBlanketCoverage(data, "Total_Blanket_Jewelry") +
                        countCoverageHasBlanketCoverage(data, "Total_Blanket_FACC") +
                        countCoverageHasBlanketCoverage(data, "Total_Blanket_CSSF");
                if (driver.findElements(By.xpath("//div[text()='collectibles']")).size() > 0) {
                    xPath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[" + (coverageCounter + 2) + "]";
                } else {
                    xPath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[" + (coverageCounter + 1) + "]";
                }
                System.out.println("xpath: " + xPath + " --- cov counter: " + coverageCounter);
                blanketCoverageSingleArticleLimit = driver.findElements(By.xpath(xPath));
                System.out.println(blanketCoverageSingleArticleLimit.size() + "--size");
                if (blanketCoverageSingleArticleLimit.size() > 0) {
                    typeText(blanketCoverageSingleArticleLimit.get(0), data.get("Wine_Blanket_Single_Article_Limit_Amt"));
                }
            }
            if (data.get("State").equalsIgnoreCase("CA")) {
                typeText(itemValue, data.get("Wine_HVI_Value"));
                typeText(WineItemDescriptionCO, data.get("Wine_Item_Description"));
                choose(WineHasAppraised2YearsYesCO, WineHasAppraised2YearsNoCO, data.get("Wine_Has_Appraised_2_Years"));
            } else if (data.get("State").equalsIgnoreCase("HI")) {
                typeText(itemValueHI, data.get("Wine_HVI_Value"));
                typeText(WineItemDescription, data.get("Wine_Item_Description"));
                choose(WineHasAppraised2YearsYes, WineHasAppraised2YearsNo, data.get("Wine_Has_Appraised_2_Years"));
            } else {
                typeText(HVIValueWine, data.get("Wine_HVI_Value"));
                typeText(WineItemDescription, data.get("Wine_Item_Description"));
                choose(WineHasAppraised2YearsYes, WineHasAppraised2YearsNo, data.get("Wine_Has_Appraised_2_Years"));
            }
            choose(WineHaveTemperatureAlarmYes, WineHaveTemperatureAlarmNo, data.get("Wine_Have_Temperature_Alarm"));
            choose(WineInsuranceAmountRepresentCurrentValueYes, WineInsuranceAmountRepresentCurrentValueNo, data.get("Wine_Insurance_Amount_Represent_Curr_Value"));
            pause(3000);
        }
    }

    public int countCoverageHasBlanketCoverage(Map<String, String> data, String testDataBlanket) {
        return (data.get(testDataBlanket) != null
                && !data.get(testDataBlanket).equalsIgnoreCase("")
                && !data.get(testDataBlanket).equalsIgnoreCase("0")) ? 1 : 0;
    }

    public void fillWineBlockHS(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Wine").equalsIgnoreCase("Yes")) {
            setTotalScheduledWine(data.get("Wine_Block_Total_Scheduled_Wine"));
            setTotalBlanketWine(data.get("Wine_Block_Total_Blanket_Wine"));
            setWineHVIValue(data.get("Wine_Block_HVI_Value"));
            setBlanketSingleArticleLimitAmt(data.get("Wine_Block_Blanket_Coverage_Single_Article_Limit"));
            setWineItemDescription(data.get("Wine_Block_Item_Description"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillWineBlockHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Wine_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledWine(data.get("Wine_Block_Total_Scheduled_Wine_END"));
            setTotalBlanketWine(data.get("Wine_Block_Total_Blanket_Wine_END"));
            setWineHVIValue(data.get("Wine_Block_HVI_Value_END"));
            setBlanketSingleArticleLimitAmt(data.get("Wine_Block_Blanket_Coverage_Single_Article_Limit_END"));
            setWineItemDescription(data.get("Wine_Block_Item_Description_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillWineBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Wine_OOS_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledWine(data.get("Wine_Block_Total_Scheduled_Wine_OOS_END"));
            setTotalBlanketWine(data.get("Wine_Block_Total_Blanket_Wine_OOS_END"));
            setWineHVIValue(data.get("Wine_Block_HVI_Value_OOS_END"));
            setBlanketSingleArticleLimitAmt(data.get("Wine_Block_Blanket_Coverage_Single_Article_Limit_OOS_END"));
            setWineItemDescription(data.get("Wine_Block_Item_Description_OOS_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillWineBlockHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Wine_RNW").equalsIgnoreCase("Yes")) {
            setTotalScheduledWine(data.get("Wine_Block_Total_Scheduled_Wine_RNW"));
            setTotalBlanketWine(data.get("Wine_Block_Total_Blanket_Wine_RNW"));
            setWineHVIValue(data.get("Wine_Block_HVI_Value_RNW"));
            setBlanketSingleArticleLimitAmt(data.get("Wine_Block_Blanket_Coverage_Single_Article_Limit_RNW"));
            setWineItemDescription(data.get("Wine_Block_Item_Description_RNW"));
            saveChanges();
            pause(2000);
        }

    }

    public void setBlanketSingleArticleLimitAmt(String value) {
        if (blanketSingleArticleLimitWine.size() > 0) {
            typeText(blanketSingleArticleLimitWine.get(0), value, "Blanket Single Article Limit Amt");
        }
    }

    public void setWineItemDescription(String value) {
        typeText(itemDescriptionWine, value, "Item Description Wine");
        clickBlock();

    }

    public void setWineHVIValue(String value) {
        typeText(WineHVIValue, value, "HVI Value Wine");
        clickBlock();
    }

    public void setTotalBlanketWine(String value) {
        typeText(totalBlanketWineCov, value, "Total Blanket Wine");
        clickBlock();
    }

    public void setTotalScheduledWine(String value) {
        typeText(totalScheduledWine, value, "Total Scheduled Wine");
        clickBlock();
    }

    public void setLimitOfItem(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItem.get(i), "Description of item");
            typeText(driver.switchTo().activeElement(), value, "Description of item");
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

    public void setLimitOfItemCO(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            pause(1000);
            clickBlock();
            clickElement(limitOfItemCO.get(i), "Limit of item W");
            typeText(driver.switchTo().activeElement(), value, "Limit of item W");
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
            pause(1000);
            clickBlock();
            clickElement(agreedValueYes.get(i), "Agreed Value");
        }
    }
}
