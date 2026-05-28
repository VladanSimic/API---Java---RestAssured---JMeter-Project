package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ExcessFloodBlock extends CommonComponentsAndActions {

    public ExcessFloodBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Do you wish to include excess flood coverage?']/../../../..//label[text()='Yes']/..//input")
    WebElement excessFloodCoverageYes;
    @FindBy(xpath = "//div[text()='Do you wish to include excess flood coverage?']/../../../..//label[text()='No']/..//input")
    WebElement excessFloodCoverageNo;
    @FindBy(xpath = "(//div[text()='Dwelling']/../../../../../../../../../../..//input)[1]")
    WebElement excessCoverageLimitDwelling;
    @FindBy(xpath = "(//div[text()='Contents']/../../../../../../../../../../..//input)[1]")
    WebElement excessCoverageLimitContents;
    @FindBy(xpath = "//div[text()='excess flood']/../../../../../../../../..//div[text()='Refer Rate:']/../../../..//label[text()='Yes']/..//input")
    WebElement referRateYes;
    @FindBy(xpath = "//div[text()='excess flood']/../../../../../../../../..//div[text()='Refer Rate:']/../../../..//label[text()='No']/..//input")
    WebElement referRateNo;
    @FindBy(xpath = "//div[text()='Home Flood Rate']/../../../..//input")
    WebElement homeFloodRate;
    @FindBy(xpath = "//div[text()='Contents Flood Rate']/../../../..//input")
    WebElement contentsFloodRate;
    @FindBy(xpath = "//div[text()='Who is providing your underlying primary flood coverage?']/../../../..//input")
    WebElement whoIsProvidingUnderlyingPFCoverage;
    @FindBy(xpath = "//div[text()='Primary Flood Dwelling Limit']/../../../../../../../..//input")
    WebElement primaryFloodDwellingLimit;
    @FindBy(xpath = "//div[text()='Primary Flood Contents Limit']/../../../../../../../..//input")
    WebElement primaryFloodContentsLimit;
    @FindBy(xpath = "//div[text()='Excess Flood Dwelling Options']/../../../../../../../..//input")
    WebElement excessFloodDwelling;
    @FindBy(xpath = "//div[text()='Excess Flood Contents Options']/../../../../../../../..//input")
    WebElement excessFloodContents;

    public void verifyLossOfUse(String value) {
        assertEquals(driver.findElement(By.xpath("//div[text()='Excess Flood Loss of Use']/../../../../../../../../../../../td[3]//input")).getText().replace(" ", ""), value, "Loss Of Use");
    }

    public void fillOutExcessFloodDetails(Map<String, String> data) throws Throwable {
        setDoYouWishToIncludeExcessFloodCoverage(data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage"));
        if (data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage").equalsIgnoreCase("Yes")) {
            setWhatExcessCoverageLimitsDoYouWantToPurchase(data);
        }
        setReferRate(data.get("Excess_Flood_Refer_Rate"));
        if (data.get("Excess_Flood_Refer_Rate").equalsIgnoreCase("Yes")) {
            setReferRateData(data);
        }
    }

    public void fillOutExcessFloodDetailsPF(Map<String, String> data) throws Throwable {
        setDoYouWishToIncludeExcessFloodCoverage(data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage"));
        setReferRate(data.get("Excess_Flood_Refer_Rate"));

        if (data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage").equalsIgnoreCase("Yes")) {
            setWhoIsProvidingYourUnderlyingPFCoverage(data.get("Who_Is_Providing_Underlying_PF_Coverage"));

            if (data.get("Residence_Type").equalsIgnoreCase("Homeowner")) {
                setPFDwellingLimit(data.get("Excess_Flood_Coverage_Limit_Dwelling"));
                setExcessFloodDwelling(data.get("Excess_Flood_Dwelling_Options"));
                setPFContentsLimit(data.get("Excess_Flood_Coverage_Limit_Contents"));
                setExcessFloodContents(data.get("Excess_Flood_Contents_Options"));
            } else if (data.get("Residence_Type").equalsIgnoreCase("Condo/Co-op")) {
                setPFContentsLimit(data.get("Excess_Flood_Coverage_Limit_Contents"));
                setExcessFloodContents(data.get("Excess_Flood_Contents_Options"));
            }

            if (data.get("Excess_Flood_Refer_Rate").equalsIgnoreCase("Yes")) {
                setReferRateData(data);
            }
        }
    }

    public void setExcessFloodContents(String s) {
        typeTextEnter(excessFloodContents, s, "Excess flood contents");
    }

    public void setPFContentsLimit(String s) {
        typeText(primaryFloodContentsLimit, s, "Primary flood contents limit");
    }

    public void setExcessFloodDwelling(String s) {
        typeTextEnter(excessFloodDwelling, s, "Excess flood dwelling");
    }

    public void setPFDwellingLimit(String s) {
        typeText(primaryFloodDwellingLimit, s, "Primary flood dwelling limit");
    }

    public void fillOutExcessFloodDetails_END(Map<String, String> data) throws Throwable {
        setDoYouWishToIncludeExcessFloodCoverage(data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_END"));
        setReferRate(data.get("Excess_Flood_Refer_Rate_END"));

        if (data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_END").equalsIgnoreCase("Yes")) {
            setWhoIsProvidingYourUnderlyingPFCoverage(data.get("Who_Is_Providing_Underlying_PF_Coverage_END"));

            if (data.get("Residence_Type_END").equalsIgnoreCase("Homeowner")) {
                setPFDwellingLimit(data.get("Primary_Flood_Dwelling_Limit_END"));
                setExcessFloodDwelling(data.get("Excess_Dwelling_Limit_END"));
                setPFContentsLimit(data.get("Primary_Flood_Contents_Limit_END"));
                setExcessFloodContents(data.get("Excess_Contents_Limit_END"));
            } else if (data.get("Residence_Type_END").equalsIgnoreCase("Condo/Co-op")) {
                setPFContentsLimit(data.get("Primary_Flood_Contents_Limit_END"));
                setExcessFloodContents(data.get("Excess_Contents_Limit_END"));
            }

            if (data.get("Excess_Flood_Refer_Rate_END").equalsIgnoreCase("Yes")) {
                setReferRateData_END(data);
            }
        }
    }

    public void fillOutExcessFloodDetails_OOS_END(Map<String, String> data) throws Throwable {
        setDoYouWishToIncludeExcessFloodCoverage(data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_OOS_END"));
        setReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));

        if (data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_OOS_END").equalsIgnoreCase("Yes")) {
            setWhoIsProvidingYourUnderlyingPFCoverage(data.get("Who_Is_Providing_Underlying_PF_Coverage_OOS_END"));

            if (data.get("Residence_Type_OOS_END").equalsIgnoreCase("Homeowner")) {
                setPFDwellingLimit(data.get("Primary_Flood_Dwelling_Limit_OOS_END"));
                setExcessFloodDwelling(data.get("Excess_Dwelling_Limit_OOS_END"));
                setPFContentsLimit(data.get("Primary_Flood_Contents_Limit_OOS_END"));
                setExcessFloodContents(data.get("Excess_Contents_Limit_OOS_END"));
            } else if (data.get("Residence_Type_OOS_END").equalsIgnoreCase("Condo/Co-op")) {
                setPFContentsLimit(data.get("Primary_Flood_Contents_Limit_OOS_END"));
                setExcessFloodContents(data.get("Excess_Contents_Limit_OOS_END"));
            }

            if (data.get("Excess_Flood_Refer_Rate_OOS_END").equalsIgnoreCase("Yes")) {
                setReferRateData_OOS_END(data);
            }
        }
    }

    public void fillOutExcessFloodDetails_RNW(Map<String, String> data) throws Throwable {
        setDoYouWishToIncludeExcessFloodCoverage(data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_RNW"));
        setReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));

        if (data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_RNW").equalsIgnoreCase("Yes")) {
            setWhoIsProvidingYourUnderlyingPFCoverage(data.get("Who_Is_Providing_Underlying_PF_Coverage_RNW"));

            if (data.get("Residence_Type_RNW").equalsIgnoreCase("Homeowner")) {
                setPFDwellingLimit(data.get("Primary_Flood_Dwelling_Limit_RNW"));
                setExcessFloodDwelling(data.get("Excess_Dwelling_Limit_RNW"));
                setPFContentsLimit(data.get("Primary_Flood_Contents_Limit_RNW"));
                setExcessFloodContents(data.get("Excess_Contents_Limit_RNW"));
            } else if (data.get("Residence_Type_END").equalsIgnoreCase("Condo/Co-op")) {
                setPFContentsLimit(data.get("Primary_Flood_Contents_Limit_RNW"));
                setExcessFloodContents(data.get("Excess_Contents_Limit_RNW"));
            }

            if (data.get("Excess_Flood_Refer_Rate_RNW").equalsIgnoreCase("Yes")) {
                setReferRateData_RNW(data);
            }
        }
    }

    public void fillOutExcessFloodDetails(Map<String, String> data, int i) throws Throwable {
        setDoYouWishToIncludeExcessFloodCoverage(data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_" + i));
        if (data.get("Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage_" + i).equalsIgnoreCase("Yes")) {
            setWhatExcessCoverageLimitsDoYouWantToPurchase(data, i);
        }
        setReferRate(data.get("Excess_Flood_Refer_Rate_" + i));
        if (data.get("Excess_Flood_Refer_Rate_" + i).equalsIgnoreCase("Yes")) {
            setReferRateData(data, i);
        }
    }

    public void setReferRateData(Map<String, String> data) {
        typeTextEnter(homeFloodRate, data.get("Excess_Flood_Home_Flood_Rate"), "Home Flood Rate");
        typeTextEnter(contentsFloodRate, data.get("Excess_Flood_Contents_Flood_Rate"), "Contents Flood Rate");
    }

    private void setReferRateData_END(Map<String, String> data) {
        typeTextEnter(homeFloodRate, data.get("Excess_Flood_Home_Flood_Rate_END"), "Home Flood Rate");
        typeTextEnter(contentsFloodRate, data.get("Excess_Flood_Contents_Flood_Rate_END"), "Contents Flood Rate");
    }

    private void setReferRateData_OOS_END(Map<String, String> data) {
        typeTextEnter(homeFloodRate, data.get("Excess_Flood_Home_Flood_Rate_OOS_END"), "Home Flood Rate");
        typeTextEnter(contentsFloodRate, data.get("Excess_Flood_Contents_Flood_Rate_OOS_END"), "Contents Flood Rate");
    }

    private void setReferRateData_RNW(Map<String, String> data) {
        typeTextEnter(homeFloodRate, data.get("Excess_Flood_Home_Flood_Rate_RNW"), "Home Flood Rate");
        typeTextEnter(contentsFloodRate, data.get("Excess_Flood_Contents_Flood_Rate_RNW"), "Contents Flood Rate");
    }

    public void setReferRateData(Map<String, String> data, int i) {
        typeTextEnter(homeFloodRate, data.get("Excess_Flood_Home_Flood_Rate_" + i), "Home Flood Rate");
        typeTextEnter(contentsFloodRate, data.get("Excess_Flood_Contents_Flood_Rate_" + i), "Contents Flood Rate");
    }

    public void setReferRate(String s) throws Throwable {
        if (isElementDisplayed(referRateNo)) {
            choose(referRateYes, referRateNo, s, "Refer Rate");
        }
    }

    public void setWhatExcessCoverageLimitsDoYouWantToPurchase(Map<String, String> data) {
        typeTextEnter(excessCoverageLimitDwelling, data.get("Excess_Flood_Coverage_Limit_Dwelling"), "Dwelling");
        typeTextEnter(excessCoverageLimitContents, data.get("Excess_Flood_Coverage_Limit_Contents"), "Contents");
    }

    private void setWhatExcessCoverageLimitsDoYouWantToPurchase_END(Map<String, String> data) {
        typeTextEnter(excessCoverageLimitDwelling, data.get("Excess_Flood_Coverage_Limit_Dwelling_END"), "Dwelling");
        typeTextEnter(excessCoverageLimitContents, data.get("Excess_Flood_Coverage_Limit_Contents_END"), "Contents");
    }

    private void setWhatExcessCoverageLimitsDoYouWantToPurchase_OOS_END(Map<String, String> data) {
        typeTextEnter(excessCoverageLimitDwelling, data.get("Excess_Flood_Coverage_Limit_Dwelling_OOS_END"), "Dwelling");
        typeTextEnter(excessCoverageLimitContents, data.get("Excess_Flood_Coverage_Limit_Contents_OOS_END"), "Contents");
    }

    private void setWhatExcessCoverageLimitsDoYouWantToPurchase_RNW(Map<String, String> data) {
        typeTextEnter(excessCoverageLimitDwelling, data.get("Excess_Flood_Coverage_Limit_Dwelling_RNW"), "Dwelling");
        typeTextEnter(excessCoverageLimitContents, data.get("Excess_Flood_Coverage_Limit_Contents_RNW"), "Contents");
    }

    public void setWhatExcessCoverageLimitsDoYouWantToPurchase(Map<String, String> data, int i) {
        typeTextEnter(excessCoverageLimitDwelling, data.get("Excess_Flood_Coverage_Limit_Dwelling_" + i), "Dwelling");
        typeTextEnter(excessCoverageLimitContents, data.get("Excess_Flood_Coverage_Limit_Contents_" + i), "Contents");
    }

    public void setDoYouWishToIncludeExcessFloodCoverage(String s) throws Throwable {
        choose(excessFloodCoverageYes, excessFloodCoverageNo, s, "Include Excess Flood Coverage");
    }

    public void setWhoIsProvidingYourUnderlyingPFCoverage(String value) {
        typeTextEnter(whoIsProvidingUnderlyingPFCoverage, value, "Who is providing your underlying PF coverage ");
    }

}