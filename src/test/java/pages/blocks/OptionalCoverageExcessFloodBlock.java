package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class OptionalCoverageExcessFloodBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OptionalCoverageExcessFloodBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Do you wish to include excess flood coverage?')]/../../../..//label[text()='Yes']/..//input")
    WebElement includeExcessFloodYes;
    @FindBy(xpath = "//div[contains(text(),'Do you wish to include excess flood coverage?')]/../../../..//label[text()='No']/..//input")
    WebElement includeExcessFloodNo;
    @FindBy(xpath = "//div[text()='Dwelling']/../../../../../../../../../../../td[2]//input[@type='text']")
    WebElement purchaseDwelling;
    @FindBy(xpath = "//div[text()='Dwelling']/../../../../../../../../../../../td[3]//input[@type='text']")
    WebElement dwelling;
    @FindBy(xpath = "//div[text()='Contents']/../../../../../../../../../../../td[2]//input[@type='text']")
    WebElement purchaseContents;
    @FindBy(xpath = "//div[text()='Contents']/../../../../../../../../../../../td[3]//input[@type='text']")
    WebElement contents;
    @FindBy(xpath = "//div[contains(text(),'Refer Rate:')]/../../../..//label[text()='Yes']/..//input")
    WebElement referRateYes;
    @FindBy(xpath = "//div[contains(text(),'Refer Rate:')]/../../../..//label[text()='No']/..//input")
    WebElement referRateNo;
    @FindBy(xpath = "//div[text()='Underlying Flood Limits']/../../../../../../../../../../../following-sibling::tr[1]/td[3]//input[@type='text']")
    WebElement limitsDwelling;
    @FindBy(xpath = "//div[text()='Underlying Flood Limits']/../../../../../../../../../../../following-sibling::tr[2]/td[3]//input[@type='text']")
    WebElement limitContents;
    @FindBy(xpath = "//div[text()='Excess Flood Loss of Use']/../../../../../../../../../../../td[3]//input")
    WebElement lossOfUse;
    @FindBy(xpath = "//div[text()='Basement Property']/../../../../../../../../../../../td[3]//input")
    WebElement basementProperty;
    @FindBy(xpath = "//div[text()='Basement Contents']/../../../../../../../../../../../td[3]//input")
    WebElement basementContents;
    @FindBy(xpath = "//div[text()='Excess Flood Rebuilding to Code']/../../../../../../../../../../../td[3]//input")
    WebElement excessRebuildingToCode;
    @FindBy(xpath = "(//div[text()='Dwelling']/../../../../../../../../../../../td[3]//input)[2]")
    WebElement underlyingDwelling;
    @FindBy(xpath = "(//div[text()='Contents']/../../../../../../../../../../../td[3]//input)[2]")
    WebElement underlyingContents;


    public void fillCoverageExcessFloodBlockHS(Map<String, String> data) throws Throwable {
        switch (data.get("Risk_Addresses_Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "MT":
                    case "WY":
                    case "AZ":
                    case "UT":
                    case "HI": {
                        verifyBlockExists("excess flood");
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "TX": {
                        verifyBlockExists("excess flood");
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "GA":
                    case "CO":
                    case "CA": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "MA":
                    case "NC":
                    case "NY":
                    case "NJ":
                    case "SC":
                    case "FL": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    case "LA": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        verifyBlockExists("excess flood");
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        verifyBlockExists("excess flood");
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                }
                saveChanges();
            }
            break;

            case "Condo/Co-op": {
                switch (data.get("State")) {
                    case "MT": {
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "WY": {
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    case "TX": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "GA": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "AZ": {
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "UT": {
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "CO": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        verifyBlockExists("excess flood");
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    case "LA": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "MA": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "HI": {
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "NC": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "NY": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "NJ": {
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "SC":
                    case "FL": {
                        setIncludeExcessFloodHS(data);
                        chooseReferRate(data.get("Excess_Flood_Refer_Rate"));
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setIncludeExcessFloodHS(data);
                        saveChanges();
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    public void fillCoverageExcessFloodBlockHS_END(Map<String, String> data) throws Throwable {
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_END"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_END");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {

                            case "MT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            case "TX": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                verifyBlockExists("excess flood");
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            case "LA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;

                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "MT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            case "TX": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CA":{
                                verifyBlockExists("excess flood");
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            case "LA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setIncludeExcessFloodHS_END(data);
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_END"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                }
            }
        }
    }

    public void fillCoverageExcessFloodBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_OOS_END"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_OOS_END");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {

                            case "MT": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            case "TX": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CA":{
                                verifyBlockExists("excess flood");
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            case "LA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;

                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "MT": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            case "TX": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "CA":{
                                verifyBlockExists("excess flood");
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            case "LA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_OOS_END"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setIncludeExcessFloodHS_OOS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                }
            }
        }
    }

    public void fillCoverageExcessFloodBlockHS_RNW(Map<String, String> data) throws Throwable {
        String residenceType;
        if (hasValue(data.get("Risk_Addresses_Residence_Type_RNW"))) {
            residenceType = data.get("Risk_Addresses_Residence_Type_RNW");
        } else {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }
        switch (data.get("Admitted_Line")) {
            case "Home Surplus Lines": {
                switch (residenceType) {
                    case "Homeowner": {
                        switch (data.get("State")) {

                            case "MT": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            case "TX": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CA":{
                                verifyBlockExists("excess flood");
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            case "LA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;

                    case "Condo/Co-op": {
                        switch (data.get("State")) {
                            case "MT": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            case "TX": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                             case "CA":{
                                verifyBlockExists("excess flood");
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            case "LA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                setIncludeExcessFloodHS_RNW(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setIncludeExcessFloodHS_RNW(data);
                                chooseReferRate(data.get("Excess_Flood_Refer_Rate_RNW"));
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setIncludeExcessFloodHS_END(data);
                                saveChanges();
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                }
            }
        }
    }

    public void setIncludeExcessFloodHS_RNW(Map<String, String> data) throws Throwable {
        String ee = data.get("Excess_Flood_Include_Excess_Flood_RNW");
        choose(includeExcessFloodYes, includeExcessFloodNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(purchaseDwelling, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling_RNW")), "Purchase Dwelling");
            pause(500);
            typeTextEnter(purchaseContents, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents_RNW")), "Purchase Contents");
            pause(500);
            typeTextEnter(lossOfUse, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Excess_Flood_Loss_Of_Use_RNW")), "Loss Of Use limit");

        }
    }

    public void setIncludeExcessFloodHS_OOS_END(Map<String, String> data) throws Throwable {
        String ee = data.get("Excess_Flood_Include_Excess_Flood_OOS_END");
        choose(includeExcessFloodYes, includeExcessFloodNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(purchaseDwelling, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling_OOS_END")), "Purchase Dwelling");
            pause(500);
            typeTextEnter(purchaseContents, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents_OOS_END")), "Purchase Contents");
            pause(500);
            typeTextEnter(lossOfUse, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Excess_Flood_Loss_Of_Use_OOS_END")), "Loss Of Use limit");
        }
    }

    public void setIncludeExcessFloodHS_END(Map<String, String> data) throws Throwable {

        String ee = data.get("Excess_Flood_Include_Excess_Flood_END");
        choose(includeExcessFloodYes, includeExcessFloodNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(purchaseDwelling, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling_END")), "Purchase Dwelling");
            pause(500);
            typeTextEnter(purchaseContents, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents_END")), "Purchase Contents");
            pause(500);
            typeTextEnter(lossOfUse, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Excess_Flood_Loss_Of_Use_END")), "Loss Of Use limit");

        }
    }

    public void setIncludeExcessFloodHS(Map<String, String> data) throws Throwable {
        String ee = data.get("Excess_Flood_Include_Excess_Flood");
        try {
            choose(includeExcessFloodYes, includeExcessFloodNo, ee);
            if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
                pause(3000);

                typeTextEnter(purchaseDwelling, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling")), "Purchase Dwelling");
                pause(500);
                typeTextEnter(purchaseContents, (data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents")), "Purchase Contents");

                if (hasValue("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling_Amn")) {
                    typeTextEnter(dwelling, data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling_Amn"), "Dwelling");
                }
                if (hasValue("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents_Amn")) {
                    typeTextEnter(contents, data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents_Amn"), "Contents");
                }
                if (hasValue("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Excess_Flood_Loss_Of_Use")) {
                    typeTextEnter(lossOfUse, data.get("Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Excess_Flood_Loss_Of_Use"), "Excess flood loss of use");
                }
                if (hasValue("Excess_Flood_Basement_Property")) {
                    saveChanges();
                    typeTextEnter(basementProperty, data.get("Excess_Flood_Basement_Property"), "Excess flood basement property");
                }
                if (hasValue("Excess_Flood_Basement_Contents")) {
                    typeTextEnter(basementContents, data.get("Excess_Flood_Basement_Contents"), "Excess flood basement contents");
                }
                if (hasValue("Excess_Flood_Excess_Flood_Rebuilding_To_Code")) {
                    typeTextEnter(excessRebuildingToCode, data.get("Excess_Flood_Excess_Flood_Rebuilding_To_Code"), "Excess flood rebuilding to code");
                }
                if (hasValue("Excess_Flood_Underlying_Flood_Limits_Dwelling")) {
                    typeTextEnter(underlyingDwelling, data.get("Excess_Flood_Underlying_Flood_Limits_Dwelling"), "Excess flood Underlying to Dwelling");
                }
                if (hasValue("Excess_Flood_Underlying_Flood_Limits_Contents")) {
                    typeTextEnter(underlyingContents, data.get("Excess_Flood_Underlying_Flood_Limits_Contents"), "Excess flood Underlying to Contents");
                }
            }
        } catch (Exception e) {

        }

    }

    public void chooseIncludeExcessFlood(String value) throws Throwable {
        if (isVisibleOnly(By.xpath("//div[contains(text(),'Do you wish to include excess flood coverage?')]/../../../..//label[text()='Yes']/..//input")))
            choose(includeExcessFloodYes, includeExcessFloodNo, value);
    }

    public void chooseReferRate(String choose) throws Throwable {
        if (isElementDisplayed(referRateYes)){
        choose(referRateYes, referRateNo, choose);
        }
    }

}
