package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class CoinsSilverStampsFursMIBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public CoinsSilverStampsFursMIBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Total Scheduled Coins, Silver, Stamps, Furs')]/../../../../div//input")
    WebElement totalCSSF;
    @FindBy(xpath = "//div[contains(text(),'Total Blanket Coins, Silver, Stamps, Furs')]/../../../../div//input")
    WebElement totalBlanketCSSF;
    @FindBy(xpath = "(//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../../div//input)[3]")
    WebElement HVIValueCSSF;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[5]")
    WebElement itemValue;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[4]")
    WebElement itemValueHI;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[4]")
    WebElement CSSFItemDescription;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[5]")
    WebElement CSSFItemDescriptionCO;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[4]")
    WebElement CSSFItemDescriptionHI;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[4]")
    WebElement CSSFHasAppraised2YearsYes;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[4]")
    WebElement CSSFHasAppraised2YearsNo;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[5]")
    WebElement CSSFHasAppraised2YearsYesCO;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[4]")
    WebElement CSSFHasAppraised2YearsYesHI;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[4]")
    WebElement CSSFHasAppraised2YearsNoHI;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[5]")
    WebElement CSSFHasAppraised2YearsNoCO;
    @FindBy(xpath = "//div[contains(text(),'member insuring the entire Coins, Silver, Stamps, Furs')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement CSSFMemberInsuringEntireYes;
    @FindBy(xpath = "//div[contains(text(),'member insuring the entire Coins, Silver, Stamps, Furs')]/../../../../div//label[text()='No']/../span/input")
    WebElement CSSFMemberInsuringEntireNo;
    @FindBy(xpath = "//span[text()='save changes']")
    WebElement saveChanges;
    @FindBy(xpath = "//div[contains(text(),'Coins, Silver, Stamps, Furs') or contains(text(),'coins, silver, stamps, furs')]")
    WebElement block;
    @FindBy(xpath = "(//div[contains(text(),'Coins, Silver, Stamps, Furs') or contains(text(),'coins, silver, stamps, furs')]/../../../../../../../../..//table//tr/td[3])")
    List<WebElement> descriptionOfItem;
    @FindBy(xpath = "//div[contains(text(),'Coins, Silver, Stamps, Furs') or contains(text(),'coins, silver, stamps, furs')]/../../../../../../../..//table//tr/td[4]")
    List<WebElement> limitOfItem;
    @FindBy(xpath = "//div[text()='coins, silver, stamps, furs, musical instruments']/../../../../../../../../../..//div[text()='Total Scheduled Coins, Silver, Stamps, Furs, Musical Instruments Coverage ($)']/../../../..//input")
    WebElement totalScheduledCSSFMI;
    @FindBy(xpath = "//div[text()='coins, silver, stamps, furs, musical instruments']/../../../../../../../../../..//div[text()='Total Blanket Coins, Silver, Stamps, Furs, Musical Instruments Coverage ($)']/../../../..//input")
    WebElement totalBlanketCSSFMI;
    @FindBy(xpath = "(//div[text()='coins, silver, stamps, furs, musical instruments']/ancestor::tr/following-sibling::tr[.//div[contains(text(), '*The HVI represents')]]//input)[1]")
    WebElement CSSFMIHVIValue;
    @FindBy(xpath = "//div[text()='coins, silver, stamps, furs, musical instruments']/ancestor::tr/following-sibling::tr[.//div[text()='Item Description']][1]//textarea")
    WebElement itemDescriptionCSSFMI;
    @FindBy(xpath = "//div[text()='coins, silver, stamps, furs, musical instruments']/../../../../../../../../../..//div[text()='Total Coins, Silver, Stamps, Furs, Musical Instruments Coverage ($)']/../../../..//input")
    WebElement totalCSSFMICoverage;
    @FindBy(xpath = "//div[text()='coins, silver, stamps, furs, musical instruments']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input[@aria-hidden='false' and not(contains(@class, 'x-hide-display')) and not(ancestor::div[contains(@style, 'display: none') or contains(@style, 'visibility: hidden')])]")
    List<WebElement> blanketSingleArticleLimitCSSFMI;
    @FindBy(xpath = "//div[contains(text(),'coins, silver, stamps, furs')]/../../../../../..//table//tr/td[5]")
    List<WebElement> limitOfItemCO;
    @FindBy(xpath = "//div[contains(text(),'coins, silver, stamps, furs')]/../../../../../..//table//tr/td[6]//input[2]")
    List<WebElement> agreedValueYes;
    @FindBy(xpath = "//div[contains(text(),'coins, silver, stamps, furs') or contains(text(),'coins, silver, stamps, furs, musical instruments')]/../../../../../..//table//tr/td[7]")
    List<WebElement> appraisalDateCO;


    //CO
    public void fillCoinsSilverStampsFursMI(Map<String, String> data) throws Throwable {
        verifyBlockExists("coins, silver, stamps, furs");
        if(data.get("Add_Coins_Silver_Stamps_Furs").equalsIgnoreCase("Yes")) {
            int coverageCounter;
            List<WebElement> blanketCoverageSingleArticleLimit;
            String xPath;
            typeText(totalCSSF, data.get("Total_Scheduled_CSSF"));
            if (data.get("Total_Blanket_CSSF") != null && !data.get("Total_Blanket_CSSF").equalsIgnoreCase("")) {
                typeText(totalBlanketCSSF, data.get("Total_Blanket_CSSF"));
                clickElement(saveChanges);
                coverageCounter = countCoverageHasBlanketCoverage(data, "Total_Blanket_Jewelry") +
                        countCoverageHasBlanketCoverage(data, "Total_Blanket_FACC") +
                        countCoverageHasBlanketCoverage(data, "Total_Blanket_CC") +
                        1; //for some reason, fine arts are having initialized Single Article limit without having blanket.
                xPath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[" + (coverageCounter) + "]";
                System.out.println("xpath: " + xPath);
                blanketCoverageSingleArticleLimit = driver.findElements(By.xpath(xPath));
                if (blanketCoverageSingleArticleLimit.size() > 0) {
                    try {
                        typeText(blanketCoverageSingleArticleLimit.get(0), data.get("Coins_Stamps_Blanket_Single_Article_Limit_Amt"));
                    } catch (Exception e) {
                        coverageCounter = countCoverageHasBlanketCoverage(data, "Total_Blanket_Jewelry") +
                                countCoverageHasBlanketCoverage(data, "Total_Blanket_FACC") +
                                countCoverageHasBlanketCoverage(data, "Total_Blanket_CC");
                        xPath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[" + (coverageCounter) + "]";
                        blanketCoverageSingleArticleLimit = driver.findElements(By.xpath(xPath));
                        typeText(blanketCoverageSingleArticleLimit.get(0), data.get("Coins_Stamps_Blanket_Single_Article_Limit_Amt"));
                    }
                }
            }
            if (data.get("State").equalsIgnoreCase("CA")) {
                typeText(itemValue, data.get("CSSF_HVI_Value"));
                typeText(CSSFItemDescriptionCO, data.get("CSSF_Item_Description"));
                choose(CSSFHasAppraised2YearsYesCO, CSSFHasAppraised2YearsNoCO, data.get("CSSF_Has_Appraised_2_Years"));
            } else if (data.get("State").equalsIgnoreCase("HI")) {
                //TODO temp solution - need to dynamically recognize selected coverages and generate the path based on indexes
                typeText(itemValueHI, data.get("CSSF_HVI_Value"));
                typeText(CSSFItemDescriptionHI, data.get("CSSF_Item_Description"));
                choose(CSSFHasAppraised2YearsYesHI, CSSFHasAppraised2YearsNoHI, data.get("CSSF_Has_Appraised_2_Years"));
            } else {
                typeText(HVIValueCSSF, data.get("CSSF_HVI_Value"));
                typeText(CSSFItemDescription, data.get("CSSF_Item_Description"));
                choose(CSSFHasAppraised2YearsYes, CSSFHasAppraised2YearsNo, data.get("CSSF_Has_Appraised_2_Years"));
            }
            choose(CSSFMemberInsuringEntireYes, CSSFMemberInsuringEntireNo, data.get("CSSF_Member_Insuring_Coins_Silver_S_F"));
            pause(3000);
        }
    }

    public int countCoverageHasBlanketCoverage(Map<String, String> data, String testDataBlanket) {
        return (data.get(testDataBlanket) != null
                && !data.get(testDataBlanket).equalsIgnoreCase("")
                && !data.get(testDataBlanket).equalsIgnoreCase("0")) ? 1 : 0;
    }

    public void fillCoinsSilverStampsFursMIBlockHS(Map<String, String> data) throws Throwable {
        if (data.get("Collections_CSSFMI").equalsIgnoreCase("Yes")) {
            setTotalScheduledCSSFMI(data.get("CSSFMI_Block_Total_Scheduled_CSSFMI"));
            setTotalBlanketCSSFMI(data.get("CSSFMI_Block_Total_Blanket_CSSFMI"));
            setCSSFMIHVIValue(data.get("CSSFMI_Block_CSSFMI_HVI_Value"));
            setBlanketSingleArticleLimitAmt(data.get("CSSFMI_Block_Blanket_Coverage_Single_Article_Limit"));
            setCCSSFMIItemDescription(data.get("CSSFMI_Block_Item_Description"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillCoinsSilverStampsFursMIBlockHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_CSSFMI_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledCSSFMI(data.get("CSSFMI_Block_Total_Scheduled_CSSFMI_END"));
            setTotalBlanketCSSFMI(data.get("CSSFMI_Block_Total_Blanket_CSSFMI_END"));
            setCSSFMIHVIValue(data.get("CSSFMI_Block_CSSFMI_HVI_Value_END"));
            setBlanketSingleArticleLimitAmt(data.get("CSSFMI_Block_Blanket_Coverage_Single_Article_Limit_END"));
            setCCSSFMIItemDescription(data.get("CSSFMI_Block_Item_Description_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillCoinsSilverStampsFursMIBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_CSSFMI_OOS_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledCSSFMI(data.get("CSSFMI_Block_Total_Scheduled_CSSFMI_OOS_END"));
            setTotalBlanketCSSFMI(data.get("CSSFMI_Block_Total_Blanket_CSSFMI_OOS_END"));
            setCSSFMIHVIValue(data.get("CSSFMI_Block_CSSFMI_HVI_Value_OOS_END"));
            setBlanketSingleArticleLimitAmt(data.get("CSSFMI_Block_Blanket_Coverage_Single_Article_Limit_OOS_END"));
            setCCSSFMIItemDescription(data.get("CSSFMI_Block_Item_Description_OOS_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillCoinsSilverStampsFursMIBlockHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Collections_CSSFMI_RNW").equalsIgnoreCase("Yes")) {
            setTotalScheduledCSSFMI(data.get("CSSFMI_Block_Total_Scheduled_CSSFMI_RNW"));
            setTotalBlanketCSSFMI(data.get("CSSFMI_Block_Total_Blanket_CSSFMI_RNW"));
            setCSSFMIHVIValue(data.get("CSSFMI_Block_CSSFMI_HVI_Value_RNW"));
            setBlanketSingleArticleLimitAmt(data.get("CSSFMI_Block_Blanket_Coverage_Single_Article_Limit_RNW"));
            setCCSSFMIItemDescription(data.get("CSSFMI_Block_Item_Description_RNW"));
            saveChanges();
            pause(2000);
        }

    }

    public void setBlanketSingleArticleLimitAmt(String value) {
        if (blanketSingleArticleLimitCSSFMI.size() > 0) {
            typeText(blanketSingleArticleLimitCSSFMI.get(0), value, "Blanket Single Article Limit Amt");
            clickBlock();
        }
    }

    public void setCCSSFMIItemDescription(String value) {
        typeText(itemDescriptionCSSFMI, value, "Description of item");
        clickBlock();

    }

    public void setCSSFMIHVIValue(String value) {
        typeText(CSSFMIHVIValue, value, "HVI Value CSSFMI");
        clickBlock();
    }

    public void setTotalBlanketCSSFMI(String value) {
        typeText(totalBlanketCSSFMI, value, "Total Blanket CSSFMI");
        clickBlock();
    }

    public void setTotalScheduledCSSFMI(String value) {
        typeText(totalScheduledCSSFMI, value, "Total Scheduled CSSFMI");
        clickBlock();
    }

    public void clickBlock() {
        clickElement(block, "Block");
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
