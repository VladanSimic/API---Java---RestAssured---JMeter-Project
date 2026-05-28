package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OptionalFloodCoverageBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OptionalFloodCoverageBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Flood Advantage']/../../../..//label[text()='Yes']/..//input")
    WebElement floodAdvantageYes;
    @FindBy(xpath = "//div[text()='Flood Advantage']/../../../..//label[text()='No']/..//input")
    WebElement floodAdvantageNo;
    @FindBy(xpath = "//div[text()='Excess Flood Coverage']/../../../..//label[text()='Yes']/..//input")
    WebElement excessFloodCoverageYes;
    @FindBy(xpath = "//div[text()='Excess Flood Coverage']/../../../..//label[text()='No']/..//input")
    WebElement excessFloodCoverageNo;
    @FindBy(xpath = "//div[text()='Refer Rate:']/../../../..//label[text()='Yes']/..//input")
    WebElement referRateYes;
    @FindBy(xpath = "//div[text()='Refer Rate:']/../../../..//label[text()='No']/..//input")
    WebElement referRateNo;
    @FindBy(xpath = "//div[text()='Dwelling']/../../../../../../../../../../..//input[@value='- Select -']")
    WebElement excessFloodDwelling;
    @FindBy(xpath = "//div[text()='Contents']/../../../../../../../../../../..//input[@value='- Select -']")
    WebElement excessFloodContents;
    @FindBy(xpath = "//div[text()='Home Flood Rate']/../../../..//input")
    WebElement homeFloodRate;
    @FindBy(xpath = "//div[text()='Contents Flood Rate']/../../../..//input")
    WebElement contentsFloodRate;
    @FindBy(xpath = "//div[text()='Flood Extension (DIC)']/../../../..//label[text()='Yes']/..//input")
    WebElement floodExtensionYes;
    @FindBy(xpath = "//div[text()='Flood Extension (DIC)']/../../../..//label[text()='No']/..//input")
    WebElement floodExtensionNo;
    @FindBy(xpath = "//div[text()='Flood Coverage Extension (DIC)']/../../../..//label[text()='Yes']/..//input")
    WebElement floodCoverageExtensionYes;
    @FindBy(xpath = "//div[text()='Flood Coverage Extension (DIC)']/../../../..//label[text()='No']/..//input")
    WebElement floodCoverageExtensionNo;

    public void setFloodAdvantage(String value) throws Throwable {
        if (isElementDisplayed(floodAdvantageYes))
            choose(floodAdvantageYes, floodAdvantageNo, value);
    }

    public void setFloodExtension(String value) throws Throwable {
        if (isElementDisplayed(floodExtensionYes))
            choose(floodExtensionYes, floodExtensionNo, value);
    }

    public void setFloodCoverageExtension(String value) throws Throwable {
        if (isElementDisplayed(floodCoverageExtensionYes))
            choose(floodCoverageExtensionYes, floodCoverageExtensionNo, value);
    }

    public void setExcessFloodCoverage(Map<String, String> data) throws Throwable {
        String efc = data.get("Optional_Coverages_Excess_Flood_Coverage");
        if (hasValue(efc) && isElementDisplayed(excessFloodCoverageYes)) {
            choose(excessFloodCoverageYes, excessFloodCoverageNo, efc);
            if (efc.equalsIgnoreCase("Yes")) {
                pause(3000);
                clickFooter();
                if (data.get("Residence_Type").equalsIgnoreCase("Homeowner")) {
                    typeTextEnter(excessFloodDwelling, data.get("Optional_Coverages_Excess_Flood_Dwelling"), "Dwelling");
                    pause(1000);
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents"), "Contents");
                } else {
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents"), "Contents");
                }
            }
        }
    }

    private void setExcessFloodCoverage_END(Map<String, String> data) throws Throwable {
        String efc = data.get("Optional_Coverages_Excess_Flood_Coverage_END");
        if (hasValue(efc)) {
            choose(excessFloodCoverageYes, excessFloodCoverageNo, efc);
            if (efc.equalsIgnoreCase("Yes")) {
                pause(3000);
                clickFooter();
                if (data.get("Residence_Type_END").equalsIgnoreCase("Homeowner")) {
                    typeTextEnter(excessFloodDwelling, data.get("Optional_Coverages_Excess_Flood_Dwelling_END"), "Dwelling");
                    pause(1000);
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents_END"), "Contents");
                } else {
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents_END"), "Contents");
                }
            }
        }
    }

    private void setExcessFloodCoverage_OOS_END(Map<String, String> data) throws Throwable {
        String efc = data.get("Optional_Coverages_Excess_Flood_Coverage_OOS_END");
        if (hasValue(efc)) {
            choose(excessFloodCoverageYes, excessFloodCoverageNo, efc);
            if (efc.equalsIgnoreCase("Yes")) {
                pause(3000);
                clickFooter();
                if (data.get("Residence_Type_OOS_END").equalsIgnoreCase("Homeowner")) {
                    typeTextEnter(excessFloodDwelling, data.get("Optional_Coverages_Excess_Flood_Dwelling_OOS_END"), "Dwelling");
                    pause(1000);
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents_OOS_END"), "Contents");
                } else {
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents_OOS_END"), "Contents");
                }
            }
        }
    }

    private void setExcessFloodCoverage_RNW(Map<String, String> data) throws Throwable {
        String efc = data.get("Optional_Coverages_Excess_Flood_Coverage_RNW");
        if (hasValue(efc)) {
            choose(excessFloodCoverageYes, excessFloodCoverageNo, efc);
            if (efc.equalsIgnoreCase("Yes")) {
                pause(3000);
                clickFooter();
                if (data.get("Residence_Type_RNW").equalsIgnoreCase("Homeowner")) {
                    typeTextEnter(excessFloodDwelling, data.get("Optional_Coverages_Excess_Flood_Dwelling_RNW"), "Dwelling");
                    pause(1000);
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents_RNW"), "Contents");
                } else {
                    typeTextEnter(excessFloodContents, data.get("Optional_Coverages_Excess_Flood_Contents_RNW"), "Contents");
                }
            }
        }
    }

    public void setExcessFloodCoverage(Map<String, String> data, int i) throws Throwable {
        String efc = data.get("Excess_Flood_Coverage_" + i);
        choose(excessFloodCoverageYes, excessFloodCoverageNo, efc);
        if (hasValue(efc) && efc.equalsIgnoreCase("Yes")) {
            pause(3000);
            //setAttributeValue(excessFloodDwelling,"value",data.get("Excess_Flood_Dwelling"));
            pause(2000);
            //setAttributeValue(excessFloodContents,"value",data.get("Excess_Flood_Contents"));
        }
    }

    public void setReferRate(Map<String, String> data) throws Throwable {
        String rr = data.get("Optional_Coverages_Refer_Rate");
        if (hasValue(rr)) {
            choose(referRateYes, referRateNo, rr);
            if (rr.equalsIgnoreCase("Yes")) {
                pause(3000);
                if (data.get("Residence_Type").equalsIgnoreCase("Homeowner")) {
                    typeText(homeFloodRate, data.get("Optional_Coverages_Home_Flood_Rate"));
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate"));
                } else {
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate"));
                }
            }
        }

    }

    private void setReferRate_END(Map<String, String> data) throws Throwable {
        String rr = data.get("Optional_Coverages_Refer_Rate_END");
        if (hasValue(rr)) {
            choose(referRateYes, referRateNo, rr);
            if (rr.equalsIgnoreCase("Yes")) {
                pause(3000);
                if (data.get("Residence_Type_END").equalsIgnoreCase("Homeowner")) {
                    typeText(homeFloodRate, data.get("Optional_Coverages_Home_Flood_Rate_END"));
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate_END"));
                } else {
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate_END"));
                }
            }
        }
    }

    private void setReferRate_OOS_END(Map<String, String> data) throws Throwable {
        String rr = data.get("Optional_Coverages_Refer_Rate_OOS_END");
        if (hasValue(rr)) {
            choose(referRateYes, referRateNo, rr);
            if (rr.equalsIgnoreCase("Yes")) {
                pause(3000);
                if (data.get("Residence_Type_OOS_END").equalsIgnoreCase("Homeowner")) {
                    typeText(homeFloodRate, data.get("Optional_Coverages_Home_Flood_Rate_OOS_END"));
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate_OOS_END"));
                } else {
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate_OOS_END"));
                }
            }
        }
    }

    private void setReferRate_RNW(Map<String, String> data) throws Throwable {
        String rr = data.get("Optional_Coverages_Refer_Rate_RNW");
        if (hasValue(rr)) {
            choose(referRateYes, referRateNo, rr);
            if (rr.equalsIgnoreCase("Yes")) {
                pause(3000);
                if (data.get("Residence_Type_RNW").equalsIgnoreCase("Homeowner")) {
                    typeText(homeFloodRate, data.get("Optional_Coverages_Home_Flood_Rate_RNW"));
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate_RNW"));
                } else {
                    typeText(contentsFloodRate, data.get("Optional_Coverages_Contents_Flood_Rate_RNW"));
                }
            }
        }
    }

    public void setReferRate(Map<String, String> data, int i) throws Throwable {
        String rr = data.get("Refer_Rate_" + i);
        choose(referRateYes, referRateNo, rr);
        if (hasValue(rr) && rr.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeText(homeFloodRate, data.get("Home_Flood_Rate_" + i));
            pause(2000);
            typeText(contentsFloodRate, data.get("Contents_Flood_Rate_" + i));
        }
    }

    public void fillOptionalFloodCoverages(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AR":
                    case "AZ":
                    case "DC":
                    case "KY":
                    case "KS":
                    case "IN":
                    case "IA":
                    case "NE":
                    case "ND":
                    case "MT":
                    case "MO":
                    case "MN":
                    case "NM":
                    case "OH":
                    case "OK":
                    case "WI":
                    case "WA":
                    case "UT":
                    case "VT":
                    case "TN":
                    case "SD":
                    case "OR":
                    case "MS":
                    case "ME":
                    case "AL":
                    case "WY":
                    case "NY":
                    case "SC":
                    case "MI":
                    case "ID": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage"));
                        setFloodExtension(data.get("Flood_Extension"));
                        setExcessFloodCoverage(data);
                        setReferRate(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "PA":
                    case "RI":
                    case "VA": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage"));
                        setFloodExtension(data.get("Flood_Extension"));
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            setExcessFloodCoverage(data);
                            setReferRate(data);
                        }
                    }
                    break;
                    case "IL":
                    case "NJ":
                    case "CT":
                    case "GA":
                    case "MA": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage"));
                        setFloodExtension(data.get("Flood_Extension"));
                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            setExcessFloodCoverage(data);
                            setReferRate(data);
                        }
                    }
                    break;
                    case "CO": {
                        if (isFloodDate1(data.get("Effective_Date"))) {
                            setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage"));
                            setFloodCoverageExtension(data.get("Flood_Coverage_Extension"));
                        }
                    }
                    break;
                    case "NH":
                    case "AK": {
                        setExcessFloodCoverage(data);
                        setReferRate(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "NV":
                    case "CA":
                    case "MD": {
                        setFloodAdvantage(data.get("Flood_Advantage"));
                        setExcessFloodCoverage(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "LA":
                    case "TX": {
                        setFloodExtension(data.get("Flood_Extension"));
                        setExcessFloodCoverage(data);
                        setReferRate(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "HI": {
                        setFloodCoverageExtension(data.get("Flood_Coverage_Extension"));
                        setExcessFloodCoverage(data);
                        setReferRate(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State")) {
                    case "DE":
                    case "WV":
                    case "NC":
                    case "FL": {
                    }
                    break;
                    case "CO": {
                        if (isFloodDate1(data.get("Effective_Date"))) {
                            setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage"));
                            setFloodExtension(data.get("Flood_Extension"));
                        }
                    }
                    break;
                    case "LA":
                    case "TX": {
                        setFloodExtension(data.get("Flood_Extension"));
                        setExcessFloodCoverage(data);
                        setReferRate(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    default: {
                        setExcessFloodCoverage(data);
                        setReferRate(data);
                    }
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalFloodCoverages_END(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type_END")) {
            case "Homeowner": {
                switch (data.get("State_END")) {
                    case "AR":
                    case "AZ":
                    case "DC":
                    case "KY":
                    case "KS":
                    case "IN":
                    case "IA":
                    case "NE":
                    case "ND":
                    case "MT":
                    case "MO":
                    case "MN":
                    case "NM":
                    case "OH":
                    case "OK":
                    case "WI":
                    case "WA":
                    case "UT":
                    case "VT":
                    case "TN":
                    case "SD":
                    case "RI":
                    case "PA":
                    case "OR":
                    case "MS":
                    case "ME":
                    case "MA":
                    case "CT":
                    case "AL":
                    case "WY":
                    case "NJ":
                    case "NY":
                    case "SC":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "ID": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage_END"));
                        setFloodExtension(data.get("Flood_Extension_END"));
                        setExcessFloodCoverage_END(data);
                        setReferRate_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "IL":
                    case "CO": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage_END"));
                        setFloodExtension(data.get("Flood_Extension_END"));

                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            setExcessFloodCoverage_END(data);
                            setReferRate_END(data);
                            verifyBlockExists("optional flood coverage");
                        }
                    }
                    break;
                    case "NH":
                    case "AK": {
                        setExcessFloodCoverage_END(data);
                        setReferRate_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "NV":
                    case "CA":
                    case "MD": {
                        setFloodAdvantage(data.get("Flood_Advantage_END"));
                        setExcessFloodCoverage_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "LA":
                    case "TX": {
                        setFloodExtension(data.get("Flood_Extension_END"));
                        setExcessFloodCoverage_END(data);
                        setReferRate_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "HI": {
                        setFloodCoverageExtension(data.get("Flood_Coverage_Extension_END"));
                        setExcessFloodCoverage_END(data);
                        setReferRate_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_END")) {
                    case "DE":
                    case "WV":
                    case "NC":
                    case "FL": {
                    }
                    break;
                    default: {
                        setExcessFloodCoverage_END(data);
                        setReferRate_END(data);
                    }
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalFloodCoverages_OOS_END(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type_OOS_END")) {
            case "Homeowner": {
                switch (data.get("State_OOS_END")) {
                    case "AR":
                    case "AZ":
                    case "DC":
                    case "KY":
                    case "KS":
                    case "IN":
                    case "IA":
                    case "NE":
                    case "ND":
                    case "MT":
                    case "MO":
                    case "MN":
                    case "NM":
                    case "OH":
                    case "OK":
                    case "WI":
                    case "WA":
                    case "UT":
                    case "VT":
                    case "TN":
                    case "SD":
                    case "RI":
                    case "PA":
                    case "OR":
                    case "MS":
                    case "ME":
                    case "MA":
                    case "CT":
                    case "AL":
                    case "WY":
                    case "NJ":
                    case "NY":
                    case "SC":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "ID": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage_OOS_END"));
                        setFloodExtension(data.get("Flood_Extension_OOS_END"));
                        setExcessFloodCoverage_OOS_END(data);
                        setReferRate_OOS_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "IL":
                    case "CO": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage_OOS_END"));
                        setFloodExtension(data.get("Flood_Extension_OOS_END"));

                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            setExcessFloodCoverage_OOS_END(data);
                            setReferRate_OOS_END(data);
                            verifyBlockExists("optional flood coverage");
                        }
                    }
                    break;
                    case "NH":
                    case "AK": {
                        setExcessFloodCoverage_OOS_END(data);
                        setReferRate_OOS_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "NV":
                    case "CA":
                    case "MD": {
                        setFloodAdvantage(data.get("Flood_Advantage_OOS_END"));
                        setExcessFloodCoverage_OOS_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "LA":
                    case "TX": {
                        setFloodExtension(data.get("Flood_Extension_OOS_END"));
                        setExcessFloodCoverage_OOS_END(data);
                        setReferRate_OOS_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "HI": {
                        setFloodCoverageExtension(data.get("Flood_Coverage_Extension_OOS_END"));
                        setExcessFloodCoverage_OOS_END(data);
                        setReferRate_OOS_END(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_OOS_END")) {
                    case "DE":
                    case "WV":
                    case "NC":
                    case "FL": {
                    }
                    break;
                    default: {
                        setExcessFloodCoverage_OOS_END(data);
                        setReferRate_OOS_END(data);
                    }
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalFloodCoverages_RNW(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type_RNW")) {
            case "Homeowner": {
                switch (data.get("State_RNW")) {
                    case "AR":
                    case "AZ":
                    case "DC":
                    case "KY":
                    case "KS":
                    case "IN":
                    case "IA":
                    case "NE":
                    case "ND":
                    case "MT":
                    case "MO":
                    case "MN":
                    case "NM":
                    case "OH":
                    case "OK":
                    case "WI":
                    case "WA":
                    case "UT":
                    case "VT":
                    case "TN":
                    case "SD":
                    case "RI":
                    case "PA":
                    case "OR":
                    case "MS":
                    case "ME":
                    case "MA":
                    case "CT":
                    case "AL":
                    case "WY":
                    case "NJ":
                    case "NY":
                    case "SC":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "ID": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage_RNW"));
                        setFloodExtension(data.get("Flood_Extension_RNW"));
                        setExcessFloodCoverage_RNW(data);
                        setReferRate_RNW(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "IL":
                    case "CO": {
                        setFloodAdvantage(data.get("Optional_Coverages_Flood_Advantage_RNW"));
                        setFloodExtension(data.get("Flood_Extension_RNW"));

                        if (!isFloodDate1(data.get("Effective_Date"))) {
                            setExcessFloodCoverage_RNW(data);
                            setReferRate_RNW(data);
                            verifyBlockExists("optional flood coverage");
                        }
                    }
                    break;
                    case "NH":
                    case "AK": {
                        setExcessFloodCoverage_RNW(data);
                        setReferRate_RNW(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "NV":
                    case "CA":
                    case "MD": {
                        setFloodAdvantage(data.get("Flood_Advantage_RNW"));
                        setExcessFloodCoverage_RNW(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "LA":
                    case "TX": {
                        setFloodExtension(data.get("Flood_Extension_RNW"));
                        setExcessFloodCoverage_RNW(data);
                        setReferRate_RNW(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                    case "HI": {
                        setFloodCoverageExtension(data.get("Flood_Coverage_Extension_RNW"));
                        setExcessFloodCoverage_RNW(data);
                        setReferRate_RNW(data);
                        verifyBlockExists("optional flood coverage");
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_RNW")) {
                    case "DE":
                    case "WV":
                    case "NC":
                    case "FL": {
                    }
                    break;
                    default: {
                        setExcessFloodCoverage_RNW(data);
                        setReferRate_RNW(data);
                    }
                }
            }
            break;
        }
        saveChanges();
    }

    public void fillOptionalFloodCoverages(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Residence_Type_" + i)) {
            case "Homeowner": {
                switch (data.get("State_" + i)) {
                    case "AR":
                    case "AZ":
                    case "DC":
                    case "KY":
                    case "KS":
                    case "IN":
                    case "IL":
                    case "IA":
                    case "NE":
                    case "ND":
                    case "MT":
                    case "MO":
                    case "MN":
                    case "NM":
                    case "OH":
                    case "OK":
                    case "WI":
                    case "WA":
                    case "UT":
                    case "VT":
                    case "TN":
                    case "SD":
                    case "RI":
                    case "PA":
                    case "OR":
                    case "MS":
                    case "ME":
                    case "MA":
                    case "CT":
                    case "AL":
                    case "WY":
                    case "NJ":
                    case "NY":
                    case "SC":
                    case "VA":
                    case "GA":
                    case "MI":
                    case "ID": {
                        setFloodAdvantage(data.get("Flood_Advantage_" + i));
                        setExcessFloodCoverage(data, i);
                        setReferRate(data, i);
                    }
                    break;
                    case "NH":
                    case "AK": {
                        setExcessFloodCoverage(data, i);
                        setReferRate(data, i);
                    }
                    break;
                    case "NV":
                    case "CA":
                    case "MD": {
                        setFloodAdvantage(data.get("Flood_Advantage_" + i));
                        setExcessFloodCoverage(data, i);
                    }
                    break;
                    case "LA":
                    case "TX": {
                        setFloodExtension(data.get("Flood_Extension_" + i));
                        setExcessFloodCoverage(data, i);
                        setReferRate(data, i);
                    }
                    break;
                    case "HI": {
                        setFloodCoverageExtension(data.get("Flood_Coverage_Extension_" + i));
                        setExcessFloodCoverage(data, i);
                        setReferRate(data, i);
                    }
                    break;
                }
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                //todo HO
            }
            break;
        }
    }

}