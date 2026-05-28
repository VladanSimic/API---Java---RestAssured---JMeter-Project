package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class FineArtsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public FineArtsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Total Scheduled Fine Art')]/../../../../div//input")
    WebElement totalFACC;
    @FindBy(xpath = "//div[contains(text(),'Total Blanket Fine Art')]/../../../../div//input")
    WebElement totalBlanketFACC;
    @FindBy(xpath = "(//div[text()='*The HVI represents the highest valued item between both the scheduled and blanket limits.']/../../../../div//input)[2]")
    WebElement HVIValueFACC;
    @FindBy(xpath = "(//div[text()='Item Value']/../../../../div//input)[3]")
    List<WebElement> itemValue;
    @FindBy(xpath = "(//div[text()='Item Description']/../../../../div//textarea)[3]")
    WebElement FACCItemDescription;
    @FindBy(xpath = "//div[contains(text(),'Fine Arts Earthquake')]/../../../../div//input")
    WebElement faEarthquake;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='Yes']/../span/input)[3]")
    WebElement FACChasAppraised2YearsYes;
    @FindBy(xpath = "(//div[contains(text(),'been appraised in the last 2 years?')]/../../../../div//label[text()='No']/../span/input)[3]")
    WebElement FACChasAppraised2YearsNo;
    @FindBy(xpath = "//div[contains(text(),'member insuring the entire Fine Arts')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement FACCMemberInsuringEntireYes;
    @FindBy(xpath = "//div[contains(text(),'member insuring the entire Fine Arts')]/../../../../div//label[text()='No']/../span/input")
    WebElement FACCMemberInsuringEntireNo;
    @FindBy(xpath = "(//label[contains(text(),'EQ Deductible')]/..//input)[1]")
    WebElement eqDeductible;
    @FindBy(xpath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[2]")
    List<WebElement> blanketCoverageSingleArticleLimitWithWW;
    @FindBy(xpath = "(//div[text()='Blanket Coverage Single Article Limit']/../../../../div//input)[1]")
    List<WebElement> blanketCoverageSingleArticleLimitNoWW;
    @FindBy(xpath = "//span[text()='save changes']")
    WebElement saveChanges;
    @FindBy(xpath = "//div[contains(text(),'fine arts')]")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'fine arts')]/../../../../../..//table//tr/td[3]")
    List<WebElement> descriptionOfItem;
    @FindBy(xpath = "//div[contains(text(),'fine arts')]/../../../../../..//table//tr/td[4]")
    List<WebElement> limitOfItem;
    @FindBy(xpath = "//div[text()='fine arts']/../../../../../../../../../..//div[text()='Total Scheduled Fine Art Coverage ($)']/../../../..//input")
    WebElement totalScheduledFineArts;
    @FindBy(xpath = "//div[text()='fine arts']/../../../../../../../../../..//div[text()='Total Blanket Fine Art Coverage ($)']/../../../..//input")
    WebElement totalBlanketFineArts;
    @FindBy(xpath = "(//div[text()='fine arts']/ancestor::tr/following-sibling::tr[.//div[contains(text(), '*The HVI represents')]]//input)[1]")
    WebElement HVIValueFineArts;
    @FindBy(xpath = "//div[text()='fine arts']/ancestor::tr/following-sibling::tr[.//div[text()='Item Description']][1]//textarea")
    WebElement ItemDescriptionFAC;
    @FindBy(xpath = "//div[text()='fine arts']/../../../../../../../../../..//div[text()='Total Fine Art Coverage ($)']/../../../..//input")
    WebElement totalFineArtCoverage;
    @FindBy(xpath = "(//div[text()='fine arts']/../../../../../../../../../..//div[text()='Blanket Coverage Single Article Limit']/../../../..//input)[2]")
    List<WebElement> fineArtsBlanketCoverageSingleArticleLimit;
    @FindBy(xpath = "//div[contains(text(),'fine arts')]/../../../../../..//table//tr/td[5]")
    List<WebElement> limitOfItemCO;
    @FindBy(xpath = "//div[contains(text(),'fine arts')]/../../../../../..//table//tr/td[6]//input[2]")
    List<WebElement> agreedValueYes;
    @FindBy(xpath = "//div[contains(text(),'fine arts')]/../../../../../..//table//tr/td[7]")
    List<WebElement> appraisalDateCO;


    //CO
    public void fillFineArtsCollectibles(Map<String, String> data) throws Throwable {
        verifyBlockExists("fine arts");
        if(data.get("Add_Fine_Arts_Collectibles").equalsIgnoreCase("Yes")) {
            typeText(totalFACC, data.get("Total_Scheduled_FACC"));
            typeText(totalBlanketFACC, data.get("Total_Blanket_FACC"));
            clickElement(saveChanges);
//        if (data.get("Total_Blanket_Jewelry") != null &&
//                !data.get("Total_Blanket_Jewelry").equalsIgnoreCase("") &&
//                !data.get("Total_Blanket_Jewelry").equalsIgnoreCase("0")) {
//
//        } else {
//        }
            if (itemValue.size() > 0) {
                typeText(itemValue.get(0), data.get("FACC_HVI_Value"));
            }
            if (blanketCoverageSingleArticleLimitWithWW.size() > 0) {
                typeText(blanketCoverageSingleArticleLimitWithWW.get(0), data.get("Fine_Art_Blanket_Single_Article_Limit_Amt"));
            } else if (blanketCoverageSingleArticleLimitNoWW.size() > 0) {
                typeText(blanketCoverageSingleArticleLimitNoWW.get(0), data.get("Fine_Art_Blanket_Single_Article_Limit_Amt"));
            }
            typeText(FACCItemDescription, data.get("FACC_Item_Description"));
            if (data.get("State").equalsIgnoreCase("CA")) {
                if (faEarthquake.isDisplayed() || eqDeductible.isDisplayed()) {
                    typeText(faEarthquake, data.get("Fine_Arts_Earthquake"));
                    pause(2000);
                    if (eqDeductible.isDisplayed() && hasValue(data.get("FA_EQ_Deductible_Override"))) {
                        checkCheckbox(eqDeductible, data.get("FA_EQ_Deductible_Override"));
                    }
                }
            } else if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("HI")) {
                typeText(HVIValueFACC, data.get("FACC_HVI_Value"));
            }
            choose(FACChasAppraised2YearsYes, FACChasAppraised2YearsNo, data.get("FACC_Has_Appraised_2_Years"));
            choose(FACCMemberInsuringEntireYes, FACCMemberInsuringEntireNo, data.get("FACC_Member_Insuring_Entire_Fine_Arts"));
            pause(3000);
        }
    }

    public void fillFineArtsBlockHS(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Fine_Arts").equalsIgnoreCase("Yes")) {
            setTotalScheduledFineArt(data.get("Fine_Arts_Block_Total_Scheduled_Fine_Art"));
            setTotalBlanketFineArt(data.get("Fine_Arts_Block_Total_Blanket_Fine_Art"));
            setFACHVIValue(data.get("Fine_Arts_Block_FAC_HVI_Value"));
            setTotalFineArtCov(data.get("Fine_Arts_Block_Total_Fine_Arts_Coverage"));
            setBlanketSingleArticleLimitAmt(data.get("Fine_Arts_Block_Blanket_Coverage_Single_Article_Limit"));
            setFACItemDescription(data.get("Fine_Arts_Block_FAC_Item_Description"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillFineArtsBlockHS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Fine_Arts_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledFineArt(data.get("Fine_Arts_Block_Total_Scheduled_Fine_Art_END"));
            setTotalBlanketFineArt(data.get("Fine_Arts_Block_Total_Blanket_Fine_Art_END"));
            setFACHVIValue(data.get("Fine_Arts_Block_FAC_HVI_Value_END"));
            setTotalFineArtCov(data.get("Fine_Arts_Block_Total_Fine_Arts_Coverage_END"));
            setBlanketSingleArticleLimitAmt(data.get("Fine_Arts_Block_Blanket_Coverage_Single_Article_Limit_END"));
            setFACItemDescription(data.get("Fine_Arts_Block_FAC_Item_Description_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillFineArtsBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Fine_Arts_OOS_END").equalsIgnoreCase("Yes")) {
            setTotalScheduledFineArt(data.get("Fine_Arts_Block_Total_Scheduled_Fine_Art_OOS_END"));
            setTotalBlanketFineArt(data.get("Fine_Arts_Block_Total_Blanket_Fine_Art_OOS_END"));
            setFACHVIValue(data.get("Fine_Arts_Block_FAC_HVI_Value_OOS_END"));
            setTotalFineArtCov(data.get("Fine_Arts_Block_Total_Fine_Arts_Coverage_OOS_END"));
            setBlanketSingleArticleLimitAmt(data.get("Fine_Arts_Block_Blanket_Coverage_Single_Article_Limit_OOS_END"));
            setFACItemDescription(data.get("Fine_Arts_Block_FAC_Item_Description_OOS_END"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillFineArtsBlockHS_RNW(Map<String, String> data) throws Throwable {
        if (data.get("Collections_Fine_Arts_RNW").equalsIgnoreCase("Yes")) {
            setTotalScheduledFineArt(data.get("Fine_Arts_Block_Total_Scheduled_Fine_Art_RNW"));
            setTotalBlanketFineArt(data.get("Fine_Arts_Block_Total_Blanket_Fine_Art_RNW"));
            setFACHVIValue(data.get("Fine_Arts_Block_FAC_HVI_Value_RNW"));
            setTotalFineArtCov(data.get("Fine_Arts_Block_Total_Fine_Arts_Coverage_RNW"));
            setBlanketSingleArticleLimitAmt(data.get("Fine_Arts_Block_Blanket_Coverage_Single_Article_Limit_RNW"));
            setFACItemDescription(data.get("Fine_Arts_Block_FAC_Item_Description_RNW"));
            saveChanges();
            pause(2000);
        }

    }

    public void setTotalFineArtCov(String value) {
        typeTextEnter(totalFineArtCoverage, value, "Total Fine Art Cov");
    }

    public void setBlanketSingleArticleLimitAmt(String value) {
        if (fineArtsBlanketCoverageSingleArticleLimit.size() > 0) {
            typeText(fineArtsBlanketCoverageSingleArticleLimit.get(0), value, "Blanket Single Article Limit Amt");
            clickBlock();
        }
    }

    public void setFACItemDescription(String value) {
        typeText(ItemDescriptionFAC, value, "Description of item");
        clickBlock();
    }

    public void setFACHVIValue(String value) {
        typeText(HVIValueFineArts, value, "HVI Value Fine Art");
        clickBlock();
    }

    public void setTotalBlanketFineArt(String value) {
        typeText(totalBlanketFineArts, value, "Total Blanket Fine Art");
        clickBlock();
    }

    public void setTotalScheduledFineArt(String value) {
        typeText(totalScheduledFineArts, value, "Total Scheduled Fine Art");
        clickBlock();
    }

    public void setLimitOfItem(String value, int i) {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItem.get(i), "Limit of item");
            typeTextEnter(driver.switchTo().activeElement(), value, "Limit of item");
        }
    }

    public void setDescriptionOfItem(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickBlock();
            clickElement(descriptionOfItem.get(i), "Description of item FA");
            typeText(driver.switchTo().activeElement(), value, "Description of item FA");
        }
    }

    public void clickBlock() {
        clickElement(block, "Block");
    }

    public void setLimitOfItemCO(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickBlock();
            clickElement(limitOfItemCO.get(i), "Limit of item");
            pause(300);
            typeTextEnter(driver.switchTo().activeElement(), value, "Limit of item");
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
