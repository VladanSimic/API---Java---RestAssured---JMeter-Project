package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class PrimaryFloodCoverageBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public PrimaryFloodCoverageBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Is the home in CBRA Zone?']/../../../../div//label[text()='Yes']/..//input | //div[text()='Is the home in CBRA Zone?']/../../../../../../../../../../../..//label[text()='Yes']/..//input")
    List<WebElement> isHomeInCBRAZoneYes;
    @FindBy(xpath = "//div[text()='Is the home in CBRA Zone?']/../../../../div//label[text()='No']/..//input | //div[text()='Is the home in CBRA Zone?']/../../../../../../../../../../../..//label[text()='No']/..//input")
    List<WebElement> isHomeInCBRAZoneNo;
    @FindBy(xpath = "//div[text()='Does the location have a PURE NFIP Flood Policy?']/../../../../div//label[text()='Yes']/..//input")
    List<WebElement> pureNFIPYes;
    @FindBy(xpath = "//div[text()='Does the location have a PURE NFIP Flood Policy?']/../../../../div//label[text()='No']/..//input")
    List<WebElement> pureNFIPNo;
    @FindBy(xpath = "//div[text()='Does this location have a PURE NFIP Flood policy with maximum limits?']/../../../../div//label[text()='Yes']/..//input")
    List<WebElement> pureNFIPMaxYes;
    @FindBy(xpath = "//div[text()='Does this location have a PURE NFIP Flood policy with maximum limits?']/../../../../div//label[text()='No']/..//input")
    List<WebElement> pureNFIPMaxNo;
    @FindBy(xpath = "//div[contains(text(),'Do you purchase an NFIP policy with maximum limits?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement doYouPurchaseNFIPPolicyYes;
    @FindBy(xpath = "//div[contains(text(),'Do you purchase an NFIP policy with maximum limits?')]/../../../../div//label[text()='No']/..//input")
    WebElement doYouPurchaseNFIPPolicyNo;
    @FindBy(xpath = "//div[text()='Do you want to add PURE Primary Flood Endorsement?']/../../../../div//label[text()='Yes']/..//input | //div[text()='Do you want to add the PURE Primary Flood Endorsement?']/.././../../../../div//label[text()='Yes']/..//input")
    WebElement pfEndYes;
    @FindBy(xpath = "//div[text()='Do you want to add PURE Primary Flood Endorsement?']/../../../../div//label[text()='No']/..//input | //div[text()='Do you want to add the PURE Primary Flood Endorsement?']/.././../../../../div//label[text()='No']/..//input")
    WebElement pfEndNo;
    @FindBy(xpath = "//div[text()='Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?']/../../../../div//label[text()='Yes']/..//input")
    WebElement impactedYes;
    @FindBy(xpath = "//div[text()='Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?']/../../../../div//label[text()='No']/..//input")
    WebElement impactedNo;
    @FindBy(xpath = "//div[text()='Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?']/../../../../div//label[text()='Yes']/..//input")
    WebElement failureYes;
    @FindBy(xpath = "//div[text()='Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?']/../../../../div//label[text()='No']/..//input")
    WebElement failureNo;
    @FindBy(xpath = "(//div[text()='Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?']/../../../../div//label[text()='Yes']/..//input)[last()]")
    WebElement basementYes;
    @FindBy(xpath = "(//div[text()='Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?']/../../../../div//label[text()='No']/..//input)[last()]")
    WebElement basementNo;
    @FindBy(xpath = "//div[text()='Dwelling & Other Structures (Up to $2M)']/../../../../..//input")
    WebElement dwelling;
    @FindBy(xpath = "//div[text()='Dwelling']/../../../..//input[@aria-hidden='false']")
    WebElement dwellingOnly;
    @FindBy(xpath = "//div[text()='Other Structures']/../../../../..//input[@aria-hidden='false']")
    WebElement otherStructuresOnly;
    @FindBy(xpath = "//div[text()='Contents']/../../../../..//input[@aria-hidden='false']")
    WebElement contentsOnly;
    @FindBy(xpath = "//div[text()='Contents (Up to $1M)']/../../../../..//input")
    WebElement pfContents;
    @FindBy(xpath = "//div[text()='Loss of Use']/../../../../../../../..//input[@aria-readonly='false']")
    WebElement lossOfUse;
    @FindBy(xpath = "//div[text()='Basement Improvements Sublimit ($30K - $250K)']/../../../../../../../..//input")
    WebElement basementImprovements;
    @FindBy(xpath = "//div[text()='Basement Contents Sublimit ($15K - $100K)']/../../../../../../../..//input")
    WebElement basementContents;
    @FindBy(xpath = "//div[text()='Deductible']/../../../../../../../..//input")
    WebElement pfDeductible;
    @FindBy(xpath = "//div[text()='High PML Load']/../../../..//input")
    WebElement highPmlLoad;
    @FindBy(xpath = "//div[text()='Elevated Risk Credit']/../../../..//input")
    WebElement elevatedRiskCredit;
    @FindBy(xpath = "//div[text()='Replacement Cost']/../../../..//input")
    WebElement locationCoverageReplacementCostLimit;
    @FindBy(xpath = "(//div[text()='Contents']/../../../..//input)[2]")
    WebElement locationCoverageContentsLimit;
    @FindBy(xpath = "(//div[text()='Contents']/../../../..//input)[1]")
    WebElement primaryFloodCoverageContentsLimit;
    @FindBy(xpath = "(//div[text()='Loss of Use']/../../../..//input)[2]")
    WebElement locationCoverageLossOfUseLimit;
    @FindBy(xpath = "(//div[text()='Loss of Use']/../../../..//input)[1]")
    WebElement primaryFloodCoverageLossOfUseLimit;
    @FindBy(xpath = "(//div[text()='Other Structures']/../../../..//input)[2]")
    WebElement locationCoverageOtherStructuresLimit;
    @FindBy(xpath = "(//div[text()='Other Structures']/../../../..//input)[1]")
    WebElement primaryFloodCoverageOtherStructuresLimit;
    @FindBy(xpath = "(//div[text()='AOP Deductible']/../../../..//input)[1]")
    WebElement locationCoverageAOPDeductibleLimit;
    @FindBy(xpath = "(//div[text()='Dwelling']/../../../..//input)[1]")
    WebElement primaryFloodCoverageDwellingLimit;
    @FindBy(xpath = "//div[text()='Basement Improvements']/../../../..//input")
    WebElement sublimitBasementImprovements;
    @FindBy(xpath = "//div[text()='Basement Contents']/../../../..//input")
    WebElement sublimitBasementContents;
    @FindBy(xpath = "//div[text()='Landscaping']/../../../..//input")
    WebElement sublimitLandscaping;
    @FindBy(xpath = "//div[text()='Hardscapes']/../../../..//input")
    WebElement sublimitHardscapes;
    @FindBy(xpath = "//div[text()='Pools, Hot Tubs, and Spas']/../../../..//input")
    WebElement sublimitPoolsHotTubsSpas;
    @FindBy(xpath = "//div[text()='Loss Avoidance']/../../../..//input")
    WebElement sublimitLossAvoidance;
    @FindBy(xpath = "//div[text()='Rebuilding to Code']/../../../..//input")
    WebElement sublimitRebuildingToCode;
    @FindBy(xpath = "//div[text()='Loss Assessment']/../../../..//input")
    WebElement sublimitLossAssessment;
    @FindBy(xpath = "//div[text()=\"Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?\" and @style=\"display:inline\"]/../../../../../../../../../../../..//label[text()='Yes']/..//input")
    WebElement wouldYouLikeToQuoteNonAdmittedPFYes;
    @FindBy(xpath = "//div[text()=\"Would you like to quote Non-Admitted Primary Flood (in order to bind Non-Admitted Primary Flood this question must be answered 'yes')?\" and @style=\"display:inline\"]/../../../../../../../../../../../..//label[text()='No']/..//input")
    WebElement wouldYouLikeToQuoteNonAdmittedPFNo;
    @FindBy(xpath = "//div[text()='Would you like a Non-Admitted Primary Flood quote?']/../../../../../../../../../../../..//label[text()='Yes']/..//input")
    List<WebElement> wouldYouLikeNonAdmittedPFQuoteYes;
    @FindBy(xpath = "//div[text()='Would you like a Non-Admitted Primary Flood quote?']/../../../../../../../../../../../..//label[text()='No']/..//input")
    List<WebElement> wouldYouLikeNonAdmittedPFQuoteNo;
    @FindBy(xpath = "(//div[text()='Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?']/../../../../div//label[text()='Yes']/..//input)[last()]")
    WebElement doYouHaveBasementOrAnyAreaOfTheUnitYes;
    @FindBy(xpath = "(//div[text()='Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?']/../../../../div//label[text()='No']/..//input)[last()]")
    WebElement doYouHaveBasementOrAnyAreaOfTheUnitNo;
    @FindBy(xpath = "//div[text()='How many floors does the location have above grade?']/../../../../div//..//input")
    WebElement floorsAboveGrade;
    @FindBy(xpath = "//div[text()='Manager Primary Flood Override']/../../../..//input[@type='checkbox']")
    WebElement managerPFOverride;
    @FindBy(xpath = "//div[text()='Eligibility Response']/..//div[2]")
    WebElement eligibilityResponse;


    public void fillOutPrimaryFloodCoveragesDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("primary flood coverage");
        setIsHomeInCBRAZone(data.get("Flood_Information_Is_The_Home_In_CBRA_Zone"));
        setPureNFIP(data.get("Flood_Pure_NFIP"));
        setPureNFIPMaxLimits(data.get("Flood_Pure_NFIP"));
        setPurchaseNFIP(data.get("Purchase_NFIP"));
        if (hasValue(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement")) && data.get("Do_You_Want_To_Add_Pure_PF_Endorsement").equalsIgnoreCase("Yes")) {
            checkManagerOverride();
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure"));
            switch (data.get("Residence_Type")) {
                case "Homeowner": {
                    if (hasValue(data.get("Residence_Have_Basement")) && data.get("Residence_Have_Basement").equalsIgnoreCase("Yes")) {
                        if (hasValue(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level"))) {
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level"));
                            setDwellingOtherStructuresLimit(data.get("Dwelling_Other_Structures_Limit"));
                            setCommonFloodCoverage(data);
                            if (data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level").equalsIgnoreCase("Yes")) {
                                setBasementImprovementsUpTo(data.get("Primary_Flood_Coverage_Basement_Improvements"));
                                setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents"));
                            }
                        }
                    }
                }
                break;
                case "Condo/Co-op": {
                    if (hasValue(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit"))) {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit"));
                        setCommonFloodCoverage(data);
                        if (data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit").equalsIgnoreCase("Yes")) {
                            setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents"));
                        }
                    }
                }
                break;
            }
        } else {
            setAddPurePFEndorsement(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement"));
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure"));
        }
        if (hasValue(data.get("Would_You_Like_To_Quote_Non_Admitted_PF"))) {
            setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF"));
            saveChanges();
            if (data.get("Would_You_Like_To_Quote_Non_Admitted_PF").equalsIgnoreCase("Yes")) {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        setFloorsAboveGrade(data.get("Floors_Above_Grade"));
                        if (hasValue(data.get("Residence_Have_Basement")) && data.get("Residence_Have_Basement").equalsIgnoreCase("Yes"))
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level"));
                        //TODO setQuotingCoverages
                    }
                    break;
                    case "Condo/Co-op": {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit"));
                        //TODO setQuotingCoverages
                    }
                    break;
                }
            }
        }
        saveChanges();
        pause(2000);
    }

    public void setCommonFloodCoverage(Map<String, String> data) {
        setContentsUpTo(data.get("Primary_Flood_Coverage_Contents"));
        setLossOfUse(data.get("Primary_Flood_Coverage_Loss_Of_Use"));
        setPFDeductible(data.get("Primary_Flood_Deductible"));
        setElevatedRiskCredit(data.get("Elevated_Risk_Credit"));
        setHighPMLLoad(data.get("High_PML_Load"));
    }

    public void fillOutPrimaryFloodCoveragesDetails_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("primary flood coverage");
        setIsHomeInCBRAZone(data.get("Flood_Information_Is_The_Home_In_CBRA_Zone_END"));
        setPureNFIP(data.get("Flood_Pure_NFIP_END"));
        setPureNFIPMaxLimits(data.get("Flood_Pure_NFIP_END"));
        setPurchaseNFIP(data.get("Purchase_NFIP_END"));
        if (hasValue(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_END")) && data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_END").equalsIgnoreCase("Yes")) {
            checkManagerOverride();
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event_END"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure_END"));
            switch (data.get("Residence_Type_END")) {
                case "Homeowner": {
                    if (hasValue(data.get("Residence_Have_Basement_END")) && data.get("Residence_Have_Basement_END").equalsIgnoreCase("Yes")) {
                        if (hasValue(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_END"))) {
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_END"));
                            setDwellingOtherStructuresLimit(data.get("Dwelling_Other_Structures_Limit_END"));
                            setCommonFloodCoverage(data);
                            if (data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_END").equalsIgnoreCase("Yes")) {
                                setBasementImprovementsUpTo(data.get("Primary_Flood_Coverage_Basement_Improvements_END"));
                                setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents_END"));
                            }
                        }
                    }
                }
                break;
                case "Condo/Co-op": {
                    if (hasValue(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_END"))) {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_END"));
                        setCommonFloodCoverage(data);
                        if (data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_END").equalsIgnoreCase("Yes")) {
                            setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents_END"));
                        }
                    }
                }
                break;
            }
        } else {
            setAddPurePFEndorsement(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_END"));
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event_END"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure_END"));
        }
        if (hasValue(data.get("Would_You_Like_To_Quote_Non_Admitted_PF_END"))) {
            setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF_END"));
            saveChanges();
            if (data.get("Would_You_Like_To_Quote_Non_Admitted_PF_END").equalsIgnoreCase("Yes")) {
                switch (data.get("Residence_Type_END")) {
                    case "Homeowner": {
                        setFloorsAboveGrade(data.get("Floors_Above_Grade_END"));
                        if (hasValue(data.get("Residence_Have_Basement_END")) && data.get("Residence_Have_Basement_END").equalsIgnoreCase("Yes"))
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_END"));
                        //TODO setQuotingCoverages
                    }
                    break;
                    case "Condo/Co-op": {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_END"));
                        //TODO setQuotingCoverages
                    }
                    break;
                }
            }
        }
        saveChanges();
        pause(2000);
    }

    public void fillOutPrimaryFloodCoveragesDetails_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("primary flood coverage");
        setIsHomeInCBRAZone(data.get("Flood_Information_Is_The_Home_In_CBRA_Zone_OOS_END"));
        setPureNFIP(data.get("Flood_Pure_NFIP_OOS_END"));
        setPureNFIPMaxLimits(data.get("Flood_Pure_NFIP_OOS_END"));
        setPurchaseNFIP(data.get("Purchase_NFIP_OOS_END"));
        if (hasValue(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_OOS_END")) && data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_OOS_END").equalsIgnoreCase("Yes")) {
            checkManagerOverride();
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event_OOS_END"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure_OOS_END"));
            switch (data.get("Residence_Type_OOS_END")) {
                case "Homeowner": {
                    if (hasValue(data.get("Residence_Have_Basement_OOS_END")) && data.get("Residence_Have_Basement_OOS_END").equalsIgnoreCase("Yes")) {
                        if (hasValue(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_OOS_END"))) {
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_OOS_END"));
                            setDwellingOtherStructuresLimit(data.get("Dwelling_Other_Structures_Limit_OOS_END"));
                            setCommonFloodCoverage(data);
                            if (data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_OOS_END").equalsIgnoreCase("Yes")) {
                                setBasementImprovementsUpTo(data.get("Primary_Flood_Coverage_Basement_Improvements_OOS_END"));
                                setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents_OOS_END"));
                            }
                        }
                    }
                }
                break;
                case "Condo/Co-op": {
                    if (hasValue(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_OOS_END"))) {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_OOS_END"));
                        setCommonFloodCoverage(data);
                        if (data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_OOS_END").equalsIgnoreCase("Yes")) {
                            setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents_OOS_END"));
                        }
                    }
                }
                break;
            }
        } else {
            setAddPurePFEndorsement(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_OOS_END"));
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event_OOS_END"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure_OOS_END"));
        }
        if (hasValue(data.get("Would_You_Like_To_Quote_Non_Admitted_PF_OOS_END"))) {
            setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF_OOS_END"));
            saveChanges();
            if (data.get("Would_You_Like_To_Quote_Non_Admitted_PF_OOS_END").equalsIgnoreCase("Yes")) {
                switch (data.get("Residence_Type_OOS_END")) {
                    case "Homeowner": {
                        setFloorsAboveGrade(data.get("Floors_Above_Grade_OOS_END"));
                        if (hasValue(data.get("Residence_Have_Basement_OOS_END")) && data.get("Residence_Have_Basement_OOS_END").equalsIgnoreCase("Yes"))
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_OOS_END"));
                        //TODO setQuotingCoverages
                    }
                    break;
                    case "Condo/Co-op": {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_OOS_END"));
                        //TODO setQuotingCoverages
                    }
                    break;
                }
            }
        }
        saveChanges();
        pause(2000);
    }

    public void fillOutPrimaryFloodCoveragesDetails_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("primary flood coverage");
        setIsHomeInCBRAZone(data.get("Flood_Information_Is_The_Home_In_CBRA_Zone_RNW"));
        setPureNFIP(data.get("Flood_Pure_NFIP_RNW"));
        setPureNFIPMaxLimits(data.get("Flood_Pure_NFIP_RNW"));
        setPurchaseNFIP(data.get("Purchase_NFIP_RNW"));
        if (hasValue(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_RNW")) && data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_RNW").equalsIgnoreCase("Yes")) {
            checkManagerOverride();
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event_RNW"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure_RNW"));
            switch (data.get("Residence_Type_RNW")) {
                case "Homeowner": {
                    if (hasValue(data.get("Residence_Have_Basement_RNW")) && data.get("Residence_Have_Basement_RNW").equalsIgnoreCase("Yes")) {
                        if (hasValue(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_RNW"))) {
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_RNW"));
                            setDwellingOtherStructuresLimit(data.get("Dwelling_Other_Structures_Limit_RNW"));
                            setCommonFloodCoverage(data);
                            if (data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_RNW").equalsIgnoreCase("Yes")) {
                                setBasementImprovementsUpTo(data.get("Primary_Flood_Coverage_Basement_Improvements_RNW"));
                                setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents_RNW"));
                            }
                        }
                    }
                }
                break;
                case "Condo/Co-op": {
                    if (hasValue(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_RNW"))) {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_RNW"));
                        setCommonFloodCoverage(data);
                        if (data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_RNW").equalsIgnoreCase("Yes")) {
                            setBasementContentsUpTo(data.get("Primary_Flood_Coverage_Basement_Contents_RNW"));
                        }
                    }
                }
                break;
            }
        } else {
            setAddPurePFEndorsement(data.get("Do_You_Want_To_Add_Pure_PF_Endorsement_RNW"));
            setHasPropertyBeenImpacted(data.get("Has_Property_Been_Impacted_By_Flood_Event_RNW"));
            setHasPropertyExperiencedFailure(data.get("Has_Property_Experienced_Sump_Pump_Failure_RNW"));
        }
        if (hasValue(data.get("Would_You_Like_To_Quote_Non_Admitted_PF_RNW"))) {
            setWouldYouLikeToQuote(data.get("Would_You_Like_To_Quote_Non_Admitted_PF_RNW"));
            saveChanges();
            if (data.get("Would_You_Like_To_Quote_Non_Admitted_PF_RNW").equalsIgnoreCase("Yes")) {
                switch (data.get("Residence_Type_RNW")) {
                    case "Homeowner": {
                        setFloorsAboveGrade(data.get("Floors_Above_Grade_RNW"));
                        if (hasValue(data.get("Residence_Have_Basement_RNW")) && data.get("Residence_Have_Basement_RNW").equalsIgnoreCase("Yes"))
                            setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level_RNW"));
                        //TODO setQuotingCoverages
                    }
                    break;
                    case "Condo/Co-op": {
                        setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit_RNW"));
                        //TODO setQuotingCoverages
                    }
                    break;
                }
            }
        }
        saveChanges();
        pause(2000);
    }

    public void setHighPMLLoad(String value) {
        typeText(highPmlLoad, value, "High PML Load");
    }

    public void setElevatedRiskCredit(String value) {
        typeText(elevatedRiskCredit, value, "Elevated Risk Credit");
    }

    public void setIsHomeInCBRAZone(String value) throws Throwable {
        if (!isHomeInCBRAZoneYes.isEmpty() && isHomeInCBRAZoneYes.get(0).isDisplayed()) {
            choose(isHomeInCBRAZoneYes.get(0), isHomeInCBRAZoneNo.get(0), value, "Is Home In CBRA Zone");
        }
    }

    public void setPureNFIP(String nfip) throws Throwable {
        if (!pureNFIPYes.isEmpty() && pureNFIPYes.get(0).isDisplayed()) {
            choose(pureNFIPYes.get(0), pureNFIPNo.get(0), nfip, "Pure NFIP");
        }
    }

    public void setPureNFIPMaxLimits(String nfip) throws Throwable {
        if (!pureNFIPMaxYes.isEmpty() && pureNFIPMaxYes.get(0).isDisplayed()) {
            choose(pureNFIPMaxYes.get(0), pureNFIPMaxNo.get(0), nfip, "Pure NFIP with maximum limits");
        }
    }

    public void setPurchaseNFIP(String nfip) throws Throwable {
        if (isElementDisplayed(doYouPurchaseNFIPPolicyYes)) {
            choose(doYouPurchaseNFIPPolicyYes, doYouPurchaseNFIPPolicyNo, nfip, "Purchase NFIP");
        }
    }

    public void setAddPurePFEndorsement(String addEnd) throws Throwable {
        try {
            choose(pfEndYes, pfEndNo, addEnd, "Do you want to add Pure PF endorsement");
        } catch (Exception e) {
        }
    }

    public void checkManagerOverride() throws Throwable {
        String question = "Do you want to add the PURE Primary Flood Endorsement?";
        if (isQuestionEnabled(question) && isElementDisplayed(managerPFOverride)) {
            clickElement(managerPFOverride, "Manager Primary Flood Override");
            saveChanges();
            clickElement(pfEndYes, "Manager Primary Flood Override");
            saveChanges();
        } else {
            clickElement(pfEndYes, "Do you want to add Pure PF endorsement");
            saveChanges();
        }
    }

    public void setHasPropertyBeenImpacted(String impacted) throws Throwable {
        try {
            choose(impactedYes, impactedNo, impacted, "Has property been impacted by any flood event");
        } catch (Exception e) {
        }
    }

    public void setHasPropertyExperiencedFailure(String failure) throws Throwable {
        try {
            choose(failureYes, failureNo, failure, "Has property experienced any sump pump failure");
        } catch (Exception e) {
        }
    }

    public void setIsBasementOrAreaDwellingBelowGroundLevel(String basement) throws Throwable {
        if (isElementDisplayed(basementNo)) {
            choose(basementYes, basementNo, basement, "Is basement or any area of dwelling below ground level");
        }
    }

    public void setDwellingOtherStructuresLimit(String value) {
        typeTextEnter(dwelling, value, "Dwelling & Other Structures Limit");
    }

    public void setContentsUpTo(String value) {
        typeTextEnter(pfContents, value, "Contents up to 1M");
    }

    public void setLossOfUse(String value) {
        typeTextEnter(lossOfUse, value, "Loss of Use");
    }

    public void setBasementImprovementsUpTo(String value) {
        typeTextEnter(basementImprovements, value, "Basement Improvements Sublimit");
    }

    public void setBasementContentsUpTo(String value) {
        typeTextEnter(basementContents, value, "Basement Contents Sublimit");
    }

    public void setPFDeductible(String value) {
        typeTextEnter(pfDeductible, value, "Primary Flood Deductible");
    }

    public void setFloorsAboveGrade(String value) {
        if (isElementDisplayed(floorsAboveGrade)) {
            typeTextEnter(floorsAboveGrade, value, "How many floors above grade");
        }
    }

    public void fillPrimaryFloodCoverageDetailsFS(Map<String, String> data) throws Throwable {
//        fillLocationCoverageLimits(data);
        fillPrimaryFloodCoverageLimitsFS(data);
        fillSublimitsFS(data);
        verifyBlockExists("primary flood coverage");
    }

    public void fillLocationCoverageLimits(Map<String, String> data) throws Throwable {
        setLocationCoverageReplacementCostLimit(data.get("Location_Coverage_Replacement_Cost_Limit"));
        setLocationCoverageContentsLimit(data.get("Location_Coverage_Contents_Limit"));
        setLocationCoverageLossOfUseLimit(data.get("Location_Coverage_Loss_Of_Use_Limit"));
        setLocationCoverageOtherStructuresLimit(data.get("Location_Coverage_Other_Structures_Limit"));
        setLocationCoverageAOPDeductibleLimit(data.get("Location_Coverage_AOP_Deductible_Limit"));
        saveChanges();
    }

    public void setLocationCoverageAOPDeductibleLimit(String value) {
        typeText(locationCoverageAOPDeductibleLimit, value, "Location Coverage AOP Deductible Limit");
    }

    public void setLocationCoverageOtherStructuresLimit(String value) {
        typeText(locationCoverageOtherStructuresLimit, value, "Location Coverage Other Structures Limit");
    }

    public void setLocationCoverageLossOfUseLimit(String value) {
        typeText(locationCoverageLossOfUseLimit, value, "Location Coverage Loss of Use Limit");
    }

    public void setLocationCoverageContentsLimit(String value) {
        typeText(locationCoverageContentsLimit, value, "Location Coverage Contents Limit");
    }

    public void setLocationCoverageReplacementCostLimit(String value) {
        typeText(locationCoverageReplacementCostLimit, value, "Location Coverage Replacement Cost Limit");
    }

    public void setWouldYouLikeToQuote(String quote) throws Throwable {
        if (isElementDisplayed(wouldYouLikeToQuoteNonAdmittedPFNo)) {
            choose(wouldYouLikeToQuoteNonAdmittedPFYes, wouldYouLikeToQuoteNonAdmittedPFNo, quote, "Would you like to quote Non Admitted Primary Flood");
        } else if (!wouldYouLikeNonAdmittedPFQuoteYes.isEmpty() && isElementDisplayed(wouldYouLikeNonAdmittedPFQuoteYes.get(0))){
            choose(wouldYouLikeNonAdmittedPFQuoteYes.get(0), wouldYouLikeNonAdmittedPFQuoteNo.get(0), quote, "Would you like to quote Non Admitted Primary Flood");

        }
    }

    public void setDoYouHaveBasementOrAnyAreaOfTheUnit(String quote) throws Throwable {
        if (isElementDisplayed(doYouHaveBasementOrAnyAreaOfTheUnitNo)) {
            choose(doYouHaveBasementOrAnyAreaOfTheUnitYes, doYouHaveBasementOrAnyAreaOfTheUnitNo, quote, "Do you have a basement or any area of the unit");
        }
    }

    public void fillPrimaryFloodCoverageLimitsFS(Map<String, String> data) throws Throwable {
        if ((hasValue(data.get("Residence_Type")) && data.get("Residence_Type").equalsIgnoreCase("Homeowner")) || hasValue(data.get("Risk_Addresses_Residence_Type")) && data.get("Risk_Addresses_Residence_Type").equalsIgnoreCase("Homeowner")) {
            setPrimaryFloodCoverageDwellingLimit(data.get("PF_Coverage_Dwelling_Limit"));
            setPrimaryFloodCoverageOtherStructuresLimit(data.get("PF_Coverage_Other_Structures_Limit"));
        }
        setPrimaryFloodCoverageContentsLimit(data.get("PF_Coverage_Contents_Limit"));
        setPrimaryFloodCoverageLossOfUseLimit(data.get("PF_Coverage_Loss_Of_Use_Limit"));
        setPrimaryFloodCoverageDeductibleLimit(data.get("PF_Coverage_Deductible_Limit"));
        saveChanges();
    }

    public void setPrimaryFloodCoverageDwellingLimit(String value) {
        typeText(primaryFloodCoverageDwellingLimit, value, "Primary Flood Coverage Dwelling Limit");
    }

    public void setPrimaryFloodCoverageContentsLimit(String value) {
        typeText(primaryFloodCoverageContentsLimit, value, "Primary Flood Coverage Contents Limit");
    }

    public void setPrimaryFloodCoverageLossOfUseLimit(String value) {
        typeText(primaryFloodCoverageLossOfUseLimit, value, "Primary Flood Coverage Loss of Use Limit");
    }

    public void setPrimaryFloodCoverageOtherStructuresLimit(String value) {
        typeText(primaryFloodCoverageOtherStructuresLimit, value, "Primary Flood Coverage Other Structures Limit");
    }

    public void setPrimaryFloodCoverageDeductibleLimit(String value) {
        typeText(pfDeductible, value, "Primary Flood Coverage Other Structures Limit");
    }

    public void fillSublimitsFS(Map<String, String> data) throws Throwable {
        if ((hasValue(data.get("Residence_Type")) && data.get("Residence_Type").equalsIgnoreCase("Homeowner")) || hasValue(data.get("Risk_Addresses_Residence_Type")) && data.get("Risk_Addresses_Residence_Type").equalsIgnoreCase("Homeowner")) {
            setSublimitBasementImprovements(data.get("Sublimit_Basement_Improvements"));
        }
        setSublimitBasementContents(data.get("Sublimit_Basement_Contents"));
        setSublimitLandscaping(data.get("Sublimit_Landscaping"));
        setSublimitHardscapes(data.get("Sublimit_Hardscapes"));
        setSublimitPoolsHotTubsSpas(data.get("Sublimit_Pools_Hot_Tubs_Spas"));
        setSublimitLossAvoidance(data.get("Sublimit_Loss_Avoidance"));
        setSublimitRebuildingToCode(data.get("Sublimit_Rebuilding_To_Code"));
        setSublimitLossAssessment(data.get("Sublimit_Loss_Assessment"));
        saveChanges();
    }

    public void setSublimitBasementImprovements(String value) {
        typeText(sublimitBasementImprovements, value, "Sublimit Basement Improvements");
    }

    public void setSublimitBasementContents(String value) {
        typeText(sublimitBasementContents, value, "Sublimit Basement Contents");
    }

    public void setSublimitLandscaping(String value) {
        typeText(sublimitLandscaping, value, "Sublimit Landscaping");
    }

    public void setSublimitHardscapes(String value) {
        typeText(sublimitHardscapes, value, "Sublimit Hardscapes");
    }

    public void setSublimitPoolsHotTubsSpas(String value) {
        typeText(sublimitPoolsHotTubsSpas, value, "Sublimit Pools Hot Tubs Spas");
    }

    public void setSublimitLossAvoidance(String value) {
        typeText(sublimitLossAvoidance, value, "Sublimit Loss Avoidance");
    }

    public void setSublimitRebuildingToCode(String value) {
        typeText(sublimitRebuildingToCode, value, "Sublimit Rebuilding To Code");
    }

    public void setSublimitLossAssessment(String value) {
        typeText(sublimitLossAssessment, value, "Sublimit Loss Assessment");
    }

    public void verifyEligibilityResponse(String value) {
        assertEquals(eligibilityResponse.getText(), value, "Eligibility Response");
    }

    public void verifyDwellingOtherStructures(String value) {
        assertCellValue(dwelling, value, "Dwelling and Other Structures");
    }

    public void verifyContents(String value) {
        assertCellValue(pfContents, value, "Contents");
    }

    public void verifyLossOfUse(String value) {
        assertCellValue(lossOfUse, value, "Loss Of Use");
    }

    public void verifyDeductible(String value) {
        assertCellValue(pfDeductible, value, "Deductible");
    }

    public void verifyElevatedRiskCredit(String value) {
        assertCellValue(elevatedRiskCredit, value, "Elevated Risk Credit");
    }

    public void verifyHighPmlLoad(String value) {
        assertCellValue(highPmlLoad, value, "High PML Load");
    }

    public void verifyBasementContents(String value) {
        assertCellValue(basementContents, value, "Basement Contents");
    }

    public void verifyBasementImprovements(String value) {
        assertCellValue(basementImprovements, value, "Basement Improvements");
    }

    public void verifyDwellingOnly(String value) {
        assertCellValue(dwellingOnly, value, "Dwelling");
    }

    public void verifyContentsOnly(String value) {
        assertCellValue(contentsOnly, value, "Contents");
    }

    public void verifyOtherStructuresOnly(String value) {
        assertCellValue(otherStructuresOnly, value, "Other Structures");
    }

}