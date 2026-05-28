package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import java.util.List;
import java.util.Map;

public class RiskAddressesBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public RiskAddressesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Residence Type']/../../../..//input")
    List<WebElement> residenceType;
    @FindBy(xpath = "//label//div[text()='Replacement Cost']/../../../..//input")
    List<WebElement> replacementCost;
    @FindBy(xpath = "//label//div[text()='Other Structures']/../../../..//input")
    List<WebElement> otherStructures;
    @FindBy(xpath = "//label//div[text()='Contents']/../../../..//input")
    List<WebElement> contents;
    @FindBy(xpath = "//label//div[text()='Loss of Use']/../../../..//input")
    List<WebElement> lossOfUse;
    @FindBy(xpath = "//div[text()='Ded']/../../../..//input")
    List<WebElement> deD;
    @FindBy(xpath = "//div[contains(text(),'Windstorm or Hail Ded')]/../../../..//input")
    List<WebElement> windOrHailDed;
    @FindBy(xpath = "//div[text()='AOP Ded']/../../../..//input")
    List<WebElement> aopDedElement;
    @FindBy(xpath = "//div[text()='AOP Deductible']/../../../..//input")
    List<WebElement> aopDeductibleElement;
    @FindBy(xpath = "//div[text()='WF Deductible']/../../../..//input")
    List<WebElement> wfDeductible;
    @FindBy(xpath = "//div[text()='Hurr Ded']/../../../..//input | //div[text()='Hurricane Deductible']/../../../..//input")
    List<WebElement> hurrDedElement;
    @FindBy(xpath = "//div[text()='Tornado or Hailstorm Ded']/../../../..//input")
    List<WebElement> tornadoOrHailDed;
    @FindBy(xpath = "//label//div[text()='Windstorm Deductible']/../../../..//input")
    List<WebElement> windstormDeductible;
    @FindBy(xpath = "//div[text()='Hailstorm Ded']/../../../..//input")
    List<WebElement> hailstormDed;
    @FindBy(xpath = "//div[text()='Calendar Year Hurricane Ded']/../../../..//input")
    List<WebElement> calendarYearHurrDed;
    @FindBy(xpath = "//div[text()='Number of family units']/../../../..//input")
    List<WebElement> numberOfFamilyUnits;
    @FindBy(xpath = "//div[text()='Deductible']/../../../..//input")
    List<WebElement> deductible;
    @FindBy(xpath = "//div[text()='Special Wind Deductible']/../../../..//input")
    List<WebElement> specialWindDed;
    @FindBy(xpath = "//div[contains(text(),'Hurricane and Named Storm')]/../../../..//input")
    List<WebElement> hurricaneAndNamedStorm;
    @FindBy(xpath = "//div[contains(text(),'Hurricane or Named Storm')]/../../../..//input")
    List<WebElement> hurricaneOrNamedStorm;
    @FindBy(xpath = "//div[contains(text(),'Hurricane Ded')]/../../../..//input | //div[contains(text(),'Hurricane ded')]/../../../..//input")
    List<WebElement> hurricaneDed;
    @FindBy(xpath = "//div[contains(text(),'Hurricane Deductible')]/../../../..//input")
    List<WebElement> hurricaneDeductible;
    @FindBy(xpath = "//div[text()='Hail Deductible']/../../../..//input")
    List<WebElement> hailDed;
    @FindBy(xpath = "//div[text()='Named Storm Deductible']/../../../..//input")
    List<WebElement> namedStormDed;
    @FindBy(xpath = "//div[text()='Policy Type']/../../../..//input")
    List<WebElement> policyType;
    @FindBy(xpath = "//div[text()='risk addresses']/../../../../../../div[2]//span[text()='add']")
    WebElement addAddresses;
    @FindBy(xpath = "//div[text()='risk addresses']/../../../../../../div[2]//span[text()='delete']")
    WebElement deleteAddresses;
    @FindBy(xpath = "//*[contains(text(),'Address Line 1')]/../../../..//input")
    List<WebElement> addressLine;
    @FindBy(xpath = "//label//div[text()='Address Line 2']/../../../..//input")
    WebElement addressLine2;
    @FindBy(xpath = "//label//div[contains(text(),'City')]/../../../..//input")
    List<WebElement> city;
    @FindBy(xpath = "//label//div[text()='State']/../../../..//input")
    List<WebElement> state;
    @FindBy(xpath = "//label//div[text()='ZIP']/../../../..//input")
    List<WebElement> zip;
    @FindBy(xpath = "//div[text()='risk addresses'] | //div[text()='risk address']")
    WebElement riskAddressesBlock;
    @FindBy(xpath = "//span/div[text()=\"TIV\"]/../../../..//input")
    public WebElement TIV;
    @FindBy(xpath = "//div[contains(text(),'FAC Reinsurance Required?')]/../../../..//label[text()='Yes']/..//input")
    WebElement facReinsuranceRequiredYes;
    @FindBy(xpath = "//div[contains(text(),'FAC Reinsurance Required?')]/../../../..//label[text()='No']/..//input")
    WebElement facReinsuranceRequiredNo;
    @FindBy(xpath = "//div[text()='Carrier']/../../../..//input")
    WebElement riskCarrier;
    @FindBy(xpath = "//div[text()='Limit']/../../../..//input")
    WebElement riskLimit;
    @FindBy(xpath = "//div[text()='Expiration Date']/../../../..//input[@aria-readonly='false']")
    WebElement riskExpirationDate;
    @FindBy(xpath = "//div[text()='Certificate #']/../../../..//input")
    WebElement riskCertificate;
    @FindBy(xpath = "//div[text()='FAC Premium']/../../../..//input")
    WebElement facPremium;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value')]/../../../..//label[text()='Yes']/..//input")
    WebElement agreedValueYes;
    @FindBy(xpath = "//div[contains(text(),'Agreed Value')]/../../../..//label[text()='No']/..//input")
    WebElement agreedValueNo;
    @FindBy(xpath = "//div[text()='AV Replacement Cost']/../../../..//input")
    WebElement avReplacementCost;
    @FindBy(xpath = "//div[text()='AV Other Structures']/../../../..//input")
    WebElement avOtherStructures;
    @FindBy(xpath = "//div[text()='AV Contents']/../../../..//input")
    WebElement avContents;
    @FindBy(xpath = "//div[text()='AV Loss of Use']/../../../..//input")
    WebElement avLossOfUse;
    @FindBy(xpath = "//div[text()='Fire Peril Sublimit']/../../../..//input")
    List<WebElement> firePerilSublimit;
    @FindBy(xpath = "//div[text()='Wildfire Sublimit']/../../../..//input")
    List<WebElement> wildfireSublimit;
    @FindBy(xpath = "//div[text()='risk addresses']/../../../../../..//span[text()='delete']")
    List<WebElement> delete;
    @FindBy(xpath = "(//div[text()='Does the residence have a basement?']/../../../..//input)[2]")
    WebElement haveBasementYes;
    @FindBy(xpath = "(//div[text()='Does the residence have a basement?']/../../../..//input)[1]")
    WebElement haveBasementNo;
    @FindBy(xpath = "//div[text()='Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?']/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheBasementYesFS;
    @FindBy(xpath = "//div[text()='Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?']/../../../../div//label[text()='No']/..//input")
    WebElement isTheBasementNoFS;
    @FindBy(xpath = "(//div[text()='Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?']/../../../../div//label[text()='Yes']/..//input)[last()]")
    WebElement doYouHaveBasementOrAnyAreaOfTheUnitYes;
    @FindBy(xpath = "(//div[text()='Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?']/../../../../div//label[text()='No']/..//input)[last()]")
    WebElement doYouHaveBasementOrAnyAreaOfTheUnitNo;
    @FindBy(xpath = "//div[contains(text(),'Basement Finish is')]/../../../../div/..//input")
    WebElement basementFinishIs;
    @FindBy(xpath = "//div[contains(text(),'Basement Finish Quality')]/../../../../div/..//input")
    WebElement basementFinishQuality;
    @FindBy(xpath = "//div[contains(text(),'Total Basement square')]/../../../../div/..//input")
    WebElement totalBasementSquareFootage;

    public void fillRiskAddressDetails(Map<String, String> data) throws Throwable {
//        if (hasValue(data.get("Customer_ID"))) {
//            setAddressLine(data.get("Address_Line_1_Txt"), 0);
//            setCity(data.get("City_Name_Txt"), 0);
//            setZIP(data.get("Zip_Code"), 0);
//        }
        verifyBlockExists("risk addresses");
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA":
                            case "MI":
                            case "IL":
                            case "NM":
                            case "CO":
                            case "TN": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded"), 0);
                            }
                            break;
                            case "AZ":
                            case "NV": {
                                setPolicyType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                            }
                            break;
                            case "DC":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "ID": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                saveChanges();
                                setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                            }
                            break;
                            case "WA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setNumberOfFamilyUnits(data.get("Number_Of_Family_Units"), 0);
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setDeductible(data.get("Deductible"), 0);
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setSpecialWindDeductible(data.get("Special_Wind_Ded"), 0);
                            }
                            break;
                            case "MA":
                            case "DE": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                ;
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                            }
                            break;
                            case "HI":
                            case "VA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Content"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible"), 0);
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Named_Storm_Ded"), 0);
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                saveChanges();
                                setDed(data.get("Deductible"), 0);
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setDed(data.get("Deductible"), 0);
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"), 0);
                                saveChanges();
                            }
                            break;
                            case "CT":
                            case "NY":
                            case "NJ": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setHurrDed(data.get("Hurr_Ded"), 0);
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded"), 0);
                            }
                            break;
                            case "AZ":
                            case "NV": {
                                setPolicyType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                            }
                            break;
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "NY":
                            case "NJ":
                            case "TN":
                            case "ID": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setHurrDed(data.get("Hurr_Ded"), 0);
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded"), 0);
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded"), 0);
                            }
                            break;
                            case "WA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setNumberOfFamilyUnits(data.get("Number_Of_Family_Units"), 0);
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                saveChanges();
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setDeductible(data.get("Deductible"), 0);
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setSpecialWindDeductible(data.get("Special_Wind_Ded"), 0);
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                            }
                            break;
                            case "MA":
                            case "DE": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                            }
                            break;
                            case "HI":
                            case "VA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible"), 0);
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setNamedStormDed(data.get("Named_Storm_Ded"), 0);
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setDed(data.get("Deductible"), 0);
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                saveChanges();
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                setDed(data.get("Deductible"), 0);
                                saveChanges();
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"), 0);
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
//                                setWindstormDeductible(data.get("Windstorm_Deductible"),data.get("Ex_Wind"));
                                pause(3000);
                                setNamedStormDed(data.get("Named_Storm_Ded"), 0);
                                saveChanges();
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                saveChanges();
                                setNamedStormDed(data.get("Named_Storm_Ded"), 0);
                                saveChanges();
                            }
                            break;
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "ID":
                            case "CA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                saveChanges();
                                setWfDeductible(data.get("Windstorm_Deductible"), 0);
                            }
                            break;
                            case "AL":
                            case "LA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Named_Storm_Ded"), 0);
                                saveChanges();
//                                setHailstormDed("Hailstorm_Ded");
//                                saveChanges();
                            }
                            break;
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "CT":
                            case "NY":
                            case "NJ": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"), 0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                pause(1000);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible"), 0);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
//                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"),0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                setAOPDed(data.get("AOP_Ded"), 0);
//                                setHurricaneDed(data.get("Hurricane_Deductible"),0);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_Deductible"), 0);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setReplacementCostValue(data.get("Replacement_Cost"), 0);
//                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"),0);
                                setOtherStructuresLimit(data.get("Other_Structures"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                setAOPDed(data.get("AOP_Ded"), 0);
                                setHurricaneDed(data.get("Hurricane_Deductible"), 0);
                                saveChanges();
//                                setDed(data.get("Deductible"));
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                    //TODO CONDO AND TENANTS HO HS
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded"), 0);
                            }
                            break;
                            case "AZ":
                            case "NV": {
                                setPolicyType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                            }
                            break;
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CT":
                            case "NY":
                            case "NJ": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setHailstormDed(data.get("Hailstorm_Ded"), 0);
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded"), 0);
                            }
                            break;
                            case "TN": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded"), 0);
                            }
                            break;
                            case "WA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setNumberOfFamilyUnits(data.get("Number_Of_Family_Units"), 0);
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                saveChanges();
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setDeductible(data.get("Deductible"), 0);
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setSpecialWindDeductible(data.get("Special_Wind_Ded"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                            }
                            break;
                            case "MA":
                            case "DE": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                            }
                            break;
                            case "HI":
                            case "VA": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setLossOfUseLimit(data.get("Loss_Of_Use"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible"), 0);
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                //setNamedStormDed(data.get("Named_Storm_Ded")); TODO HO HS
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                saveChanges();
                                setDed(data.get("Deductible"), 0);
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Residence_Type"), 0);
                                setContentsLimit(data.get("Contents"), 0);
                                typeText(lossOfUse.get(0), data.get("Loss_Of_Use"));
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded"), 0);
                                saveChanges();
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind"), 0);
                            }
                            break;
                        }
                        saveChanges();
                        pause(5000);
                    }
                    break;
                }
            }
            break;
        }
    }

    public void fillAdditionalRiskAddressDetails(Map<String, String> data, int i) throws Throwable {
        switch (data.get("Admitted_Line")) {
            case "Homeowner": {
                setAddressLine(data.get("Address_Line_1_Txt_" + i), i);
                setCity(data.get("City_Name_Txt_" + i), i);
                setState(data.get("State_" + i), i);
                setZIP(data.get("Zip_Code_" + i), i);
                switch (data.get("Residence_Type_" + i)) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded_" + i), i);
                            }
                            break;
                            case "AZ":
                            case "NV": {
                                setPolicyType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded_" + i), i);
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                saveChanges();
                                setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "TN": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded_" + i), i);
                            }
                            break;
                            case "WA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_" + i), i);
                            }
                            break;
                            case "ID": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                ;
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setDeductible(data.get("Deductible_" + i), i);
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setSpecialWindDeductible(data.get("Special_Wind_Ded_" + i), i);
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                            }
                            break;
                            case "MA":
                            case "DE": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                            }
                            break;
                            case "HI":
                            case "VA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible_" + i), i);
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setNamedStormDed(data.get("Named_Storm_Ded_" + i), i);
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                saveChanges();
                                setDed(data.get("Deductible_" + i), i);
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                                setDed(data.get("Deductible_" + i), i);
                                //                              setWindstormDeductible(data.get("Windstorm_Deductible_" + i), data.get("Ex_Wind_" + i), i);
                                saveChanges();
                            }
                            break;
                            case "CT":
                            case "NY":
                            case "NJ": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurrDed(data.get("Hurr_Ded_" + i), i);
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded_" + i), i);
                            }
                            break;
                            case "AZ":
                            case "NV": {
                                setPolicyType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "NY":
                            case "NJ": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                setHurrDed(data.get("Hurr_Ded_" + i), i);
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded_" + i), i);
//                                setHailstormDed(data.get("Hailstorm_Ded_" + i), i);
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_" + i), i);
                            }
                            break;
                            case "TN":
                            case "KS":
                            case "NE":
                            case "VA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                            }
                            break;
                            case "WA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_" + i), i);
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                saveChanges();
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setDeductible(data.get("Deductible_" + i), i);
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                pause(5000);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                pause(5000);
                                setSpecialWindDeductible(data.get("Special_Wind_Ded_" + i), i);
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                            }
                            break;
                            case "MA":
                            case "DE": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                pause(3000);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);

                            }
                            break;
                            case "HI": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible_" + i), i);
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                //setNamedStormDed(data.get("Named_Storm_Ded")); TODO HO HS
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                                setDed(data.get("Deductible_" + i), i);
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                saveChanges();
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                                setDed(data.get("Deductible_" + i), i);
                                saveChanges();
                                setWindstormDeductible(data.get("Windstorm_Deductible"), data.get("Ex_Wind_" + i), i);
                            }
                            break;
                            case "ID": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                }
            }
            break;
            case "Home Surplus Lines": {
                switch (data.get("Residence_Type")) {
                    case "Homeowner": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
//                                setWindstormDeductible(data.get("Windstorm_Deductible"),data.get("Ex_Wind"));
                                pause(3000);
                                setNamedStormDed(data.get("Named_Storm_Ded_" + i), i);
                                saveChanges();
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setWindstormDeductible(data.get("Windstorm_Deductible_" + i), data.get("Ex_Wind_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                                setNamedStormDed(data.get("Named_Storm_Ded_" + i), i);
                                saveChanges();
                            }
                            break;
                            case "AZ":
                            case "NV":
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CO":
                            case "RI":
                            case "TN":
                            case "WA":
                            case "ID":
                            case "CA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setWindstormDeductible(data.get("Windstorm_Deductible_" + i), data.get("Ex_Wind_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                                setWfDeductible(data.get("Windstorm_Deductible_" + i), i);
                            }
                            break;
                            case "AL":
                            case "LA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setWindstormDeductible(data.get("Windstorm_Deductible_" + i), data.get("Ex_Wind_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Named_Storm_Ded_" + i), i);
                                saveChanges();
//                                setHailstormDed("Hailstorm_Ded");
//                                saveChanges();
                            }
                            break;
                            case "MA":
                            case "DE":
                            case "HI":
                            case "VA":
                            case "NC":
                            case "CT":
                            case "NY":
                            case "NJ": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setWindstormDeductible(data.get("Windstorm_Deductible_" + i), data.get("Ex_Wind_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                pause(1000);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible_" + i), i);
                                saveChanges();
                            }
                            break;
                            case "SC":
                            case "FL": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setReplacementCostValue(data.get("Replacement_Cost_" + i), i);
                                setWindstormDeductible(data.get("Windstorm_Deductible_" + i), data.get("Ex_Wind_" + i), i);
                                setOtherStructuresLimit(data.get("Other_Structures_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
//                                setDed(data.get("Deductible"));
                            }
                            break;
                        }
                        saveChanges();
                    }
                    break;
                    //TODO CONDO AND TENANTS HO HS
                    case "Condo/Co-op":
                    case "Tenants": {
                        switch (data.get("State")) {
                            case "AK":
                            case "AR":
                            case "IA":
                            case "IN":
                            case "KS":
                            case "KY":
                            case "MN":
                            case "MO":
                            case "MT":
                            case "ND":
                            case "NE":
                            case "NH":
                            case "OH":
                            case "OK":
                            case "SD":
                            case "WI":
                            case "WY":
                            case "MD":
                            case "ME":
                            case "MS":
                            case "TX":
                            case "GA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setWindOrHailDed(data.get("Wind_Or_Hail_Ded_" + i), i);
                            }
                            break;
                            case "AZ":
                            case "NV": {
                                setPolicyType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "DC":
                            case "IL":
                            case "NM":
                            case "OR":
                            case "PA":
                            case "UT":
                            case "VT":
                            case "WV":
                            case "MI":
                            case "CT":
                            case "NY":
                            case "NJ": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHailstormDed(data.get("Hailstorm_Ded_" + i), i);
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_" + i), i);
                            }
                            break;
                            case "TN": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded_" + i), i);
                            }
                            break;
                            case "WA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_" + i), i);
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                saveChanges();
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setDeductible(data.get("Deductible_" + i), i);
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setSpecialWindDeductible(data.get("Special_Wind_Ded_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                            }
                            break;
                            case "MA":
                            case "DE": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                            }
                            break;
                            case "HI":
                            case "VA": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                saveChanges();
                                setHurricaneDed(data.get("Hurricane_Deductible_" + i), i);
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                saveChanges();
                                setAOPDed(data.get("AOP_Ded_" + i), i);
                                //setNamedStormDed(data.get("Named_Storm_Ded")); TODO HO HS
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                                setDed(data.get("Deductible_" + i), i);
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Residence_Type_" + i), i);
                                setContentsLimit(data.get("Contents_" + i), i);
                                typeText(lossOfUse.get(i), data.get("Loss_Of_Use_" + i));
                                saveChanges();
                                setDed(data.get("Deductible_" + i), i);
                                saveChanges();
                                setWindstormDeductible(data.get("Windstorm_Deductible_" + i), data.get("Ex_Wind_" + i), i);
                            }
                            break;
                        }
                        saveChanges();
                        pause(5000);
                    }
                    break;
                }
            }
            break;
        }
    }

    private void fillAdditionalRiskAddressDetails_END(Map<String, String> data, int i) throws Throwable {
        setAddressLine(data.get("Address_Line_1_Txt_END_" + i), i);
        setCity(data.get("City_Name_Txt_END_" + i), i);
        setState(data.get("State_END_" + i), i);
        setZIP(data.get("Zip_Code_END_" + i), i);
        switch (data.get("Residence_Type_END_" + i)) {
            case "Homeowner": {
                switch (data.get("State_END")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_END_" + i), i);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_END_" + i), i);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                    }
                    break;
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded_END_" + i), i);
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_END_" + i), i);
                    }
                    break;
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        ;
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setDeductible(data.get("Deductible_END_" + i), i);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_END_" + i), i);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END_" + i), i);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END_" + i), i);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_END_" + i), i);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setNamedStormDed(data.get("Named_Storm_Ded_END_" + i), i);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_END_" + i));
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        saveChanges();
                        setDed(data.get("Deductible_END_" + i), i);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_END_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_END_" + i), i);
                        //                              setWindstormDeductible(data.get("Windstorm_Deductible_END_" + i), data.get("Ex_Wind_END_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "CT":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setHurrDed(data.get("Hurr_Ded_END_" + i), i);
                    }
                    break;
                }
                saveChanges();
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_END")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_END_" + i), i);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        setHurrDed(data.get("Hurr_Ded_END_" + i), i);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setHailstormDed(data.get("Hailstorm_Ded_END_" + i), i);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_END_" + i), i);
                    }
                    break;
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_END_" + i), i);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        saveChanges();
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setDeductible(data.get("Deductible_END_" + i), i);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        pause(5000);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        pause(5000);
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_END_" + i), i);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_" + i), i);
                        setContentsLimit(data.get("Contents_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_" + i), i);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        pause(3000);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END_" + i), i);

                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_END_" + i), i);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END_" + i), i);
                        //setNamedStormDed(data.get("Named_Storm_Ded_END")); TODO HO HS
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_END_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_END_" + i), i);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        saveChanges();
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_END_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_END_" + i), i);
                        saveChanges();
                        setWindstormDeductible(data.get("Windstorm_Deductible_END"), data.get("Ex_Wind_END_" + i), i);
                    }
                    break;
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_END_" + i), i);
                        setContentsLimit(data.get("Contents_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_END_" + i));
                        saveChanges();
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    private void fillAdditionalRiskAddressDetails_OOS_END(Map<String, String> data, int i) throws Throwable {
        setAddressLine(data.get("Address_Line_1_Txt_OOS_END_" + i), i);
        setCity(data.get("City_Name_Txt_OOS_END_" + i), i);
        setState(data.get("State_OOS_END_" + i), i);
        setZIP(data.get("Zip_Code_OOS_END_" + i), i);
        switch (data.get("Residence_Type_OOS_END_" + i)) {
            case "Homeowner": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_OOS_END_" + i), i);
                    }
                    break;
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        ;
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setDeductible(data.get("Deductible_OOS_END_" + i), i);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_OOS_END_" + i), i);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setNamedStormDed(data.get("Named_Storm_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_OOS_END_" + i));
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        saveChanges();
                        setDed(data.get("Deductible_OOS_END_" + i), i);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_OOS_END_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_OOS_END_" + i), i);
//                              setWindstormDeductible(data.get("Windstorm_Deductible_OOS_END_" + i), data.get("Ex_Wind_OOS_END_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "CT":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setHurrDed(data.get("Hurr_Ded_OOS_END_" + i), i);
                    }
                    break;
                }
                saveChanges();
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_OOS_END")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        setHurrDed(data.get("Hurr_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setHailstormDed(data.get("Hailstorm_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_OOS_END_" + i), i);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        saveChanges();
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setDeductible(data.get("Deductible_OOS_END_" + i), i);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        pause(5000);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        pause(5000);
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_OOS_END_" + i), i);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_" + i), i);
                        setContentsLimit(data.get("Contents_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_" + i), i);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        pause(3000);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END_" + i), i);

                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_OOS_END_" + i), i);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END_" + i), i);
//setNamedStormDed(data.get("Named_Storm_Ded_OOS_END")); TODO HO HS
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_OOS_END_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_OOS_END_" + i), i);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        saveChanges();
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_OOS_END_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_OOS_END_" + i), i);
                        saveChanges();
                        setWindstormDeductible(data.get("Windstorm_Deductible_OOS_END"), data.get("Ex_Wind_OOS_END_" + i), i);
                    }
                    break;
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_OOS_END_" + i), i);
                        setContentsLimit(data.get("Contents_OOS_END_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_OOS_END_" + i));
                        saveChanges();
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    private void fillAdditionalRiskAddressDetails_RNW(Map<String, String> data, int i) throws Throwable {
        setAddressLine(data.get("Address_Line_1_Txt_RNW_" + i), i);
        setCity(data.get("City_Name_Txt_RNW_" + i), i);
        setState(data.get("State_RNW_" + i), i);
        setZIP(data.get("Zip_Code_RNW_" + i), i);
        switch (data.get("Residence_Type_RNW_" + i)) {
            case "Homeowner": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_RNW_" + i), i);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_RNW_" + i), i);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                    }
                    break;
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded_RNW_" + i), i);
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_RNW_" + i), i);
                    }
                    break;
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        ;
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setDeductible(data.get("Deductible_RNW_" + i), i);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_RNW_" + i), i);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW_" + i), i);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW_" + i), i);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_RNW_" + i), i);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setNamedStormDed(data.get("Named_Storm_Ded_RNW_" + i), i);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_RNW_" + i));
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        saveChanges();
                        setDed(data.get("Deductible_RNW_" + i), i);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_RNW_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_RNW_" + i), i);
//                              setWindstormDeductible(data.get("Windstorm_Deductible_RNW_" + i), data.get("Ex_Wind_RNW_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "CT":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW_" + i), i);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setHurrDed(data.get("Hurr_Ded_RNW_" + i), i);
                    }
                    break;
                }
                saveChanges();
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State_RNW")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_RNW_" + i), i);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        setHurrDed(data.get("Hurr_Ded_RNW_" + i), i);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setHailstormDed(data.get("Hailstorm_Ded_RNW_" + i), i);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_RNW_" + i), i);
                    }
                    break;
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_RNW_" + i), i);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        saveChanges();
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setDeductible(data.get("Deductible_RNW_" + i), i);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        pause(5000);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        pause(5000);
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_RNW_" + i), i);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_" + i), i);
                        setContentsLimit(data.get("Contents_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_" + i), i);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_" + i), i);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        pause(3000);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW_" + i), i);

                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_RNW_" + i), i);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW_" + i), i);
//setNamedStormDed(data.get("Named_Storm_Ded_RNW")); TODO HO HS
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_RNW_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_RNW_" + i), i);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        saveChanges();
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_RNW_" + i));
                        saveChanges();
                        setDed(data.get("Deductible_RNW_" + i), i);
                        saveChanges();
                        setWindstormDeductible(data.get("Windstorm_Deductible_RNW"), data.get("Ex_Wind_RNW_" + i), i);
                    }
                    break;
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_RNW_" + i), i);
                        setContentsLimit(data.get("Contents_RNW_" + i), i);
                        typeText(lossOfUse.get(i), data.get("Loss_Of_Use_RNW_" + i));
                        saveChanges();
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    public void fillRiskAddressDetailsHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk addresses");
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "MI":
                    case "IL":
                    case "NM":
                    case "CO":
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_END"), 0);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                    }
                    break;
                    case "DC":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_END"), 0);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setDeductible(data.get("Deductible_END"), 0);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_END"), 0);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        ;
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END"), 0);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END"), 0);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Content_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_END"), 0);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setNamedStormDed(data.get("Named_Storm_Ded_END"), 0);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        saveChanges();
                        setDed(data.get("Deductible_END"), 0);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setDed(data.get("Deductible_END"), 0);
                        setWindstormDeductible(data.get("Windstorm_Deductible_END"), data.get("Ex_Wind_END"), 0);
                        saveChanges();
                    }
                    break;
                    case "CT":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setHurrDed(data.get("Hurr_Ded_END"), 0);
                    }
                    break;
                }
                saveChanges();
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_END"), 0);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "NY":
                    case "NJ":
                    case "TN":
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        setHurrDed(data.get("Hurr_Ded_END"), 0);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_END"), 0);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_END"), 0);
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_END"), 0);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        saveChanges();
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setDeductible(data.get("Deductible_END"), 0);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_END"), 0);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END"), 0);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END"), 0);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_END"), 0);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_END"), 0);
                        setNamedStormDed(data.get("Named_Storm_Ded_END"), 0);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        setContentsLimit(data.get("Contents_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setDed(data.get("Deductible_END"), 0);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_END"), 0);
                        saveChanges();
                        setContentsLimit(data.get("Contents_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_END"), 0);
                        setDed(data.get("Deductible_END"), 0);
                        saveChanges();
                        setWindstormDeductible(data.get("Windstorm_Deductible_END"), data.get("Ex_Wind_END"), 0);
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    public void fillRiskAddressDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk addresses");
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "MI":
                    case "IL":
                    case "NM":
                    case "CO":
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_OOS_END"), 0);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                    }
                    break;
                    case "DC":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_OOS_END"), 0);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setDeductible(data.get("Deductible_OOS_END"), 0);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_OOS_END"), 0);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        ;
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END"), 0);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END"), 0);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Content_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_OOS_END"), 0);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setNamedStormDed(data.get("Named_Storm_Ded_OOS_END"), 0);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        saveChanges();
                        setDed(data.get("Deductible_OOS_END"), 0);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setDed(data.get("Deductible_OOS_END"), 0);
                        setWindstormDeductible(data.get("Windstorm_Deductible_OOS_END"), data.get("Ex_Wind_OOS_END"), 0);
                        saveChanges();
                    }
                    break;
                    case "CT":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_OOS_END"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setHurrDed(data.get("Hurr_Ded_OOS_END"), 0);
                    }
                    break;
                }
                saveChanges();
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_OOS_END"), 0);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "NY":
                    case "NJ":
                    case "TN":
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        setHurrDed(data.get("Hurr_Ded_OOS_END"), 0);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_OOS_END"), 0);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_OOS_END"), 0);
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_OOS_END"), 0);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        saveChanges();
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setDeductible(data.get("Deductible_OOS_END"), 0);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_OOS_END"), 0);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END"), 0);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END"), 0);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_OOS_END"), 0);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_OOS_END"), 0);
                        setNamedStormDed(data.get("Named_Storm_Ded_OOS_END"), 0);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setDed(data.get("Deductible_OOS_END"), 0);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_OOS_END"), 0);
                        saveChanges();
                        setContentsLimit(data.get("Contents_OOS_END"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_OOS_END"), 0);
                        setDed(data.get("Deductible_OOS_END"), 0);
                        saveChanges();
                        setWindstormDeductible(data.get("Windstorm_Deductible_OOS_END"), data.get("Ex_Wind_OOS_END"), 0);
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    public void fillRiskAddressDetailsHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk addresses");
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "MI":
                    case "IL":
                    case "NM":
                    case "CO":
                    case "TN": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_RNW"), 0);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                    }
                    break;
                    case "DC":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_RNW"), 0);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setDeductible(data.get("Deductible_RNW"), 0);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_RNW"), 0);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        ;
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW"), 0);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW"), 0);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Content_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_RNW"), 0);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setNamedStormDed(data.get("Named_Storm_Ded_RNW"), 0);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        saveChanges();
                        setDed(data.get("Deductible_RNW"), 0);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setDed(data.get("Deductible_RNW"), 0);
                        setWindstormDeductible(data.get("Windstorm_Deductible_RNW"), data.get("Ex_Wind_RNW"), 0);
                        saveChanges();
                    }
                    break;
                    case "CT":
                    case "NY":
                    case "NJ": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setReplacementCostValue(data.get("Replacement_Cost_RNW"), 0);
                        setOtherStructuresLimit(data.get("Other_Structures_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setHurrDed(data.get("Hurr_Ded_RNW"), 0);
                    }
                    break;
                }
                saveChanges();
            }
            break;
            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State")) {
                    case "AK":
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_RNW"), 0);
                    }
                    break;
                    case "AZ":
                    case "NV": {
                        setPolicyType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                    }
                    break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "NY":
                    case "NJ":
                    case "TN":
                    case "ID": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        setHurrDed(data.get("Hurr_Ded_RNW"), 0);
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded_RNW"), 0);
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded_RNW"), 0);
                    }
                    break;
                    case "WA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units_RNW"), 0);
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        saveChanges();
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setDeductible(data.get("Deductible_RNW"), 0);
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        setSpecialWindDeductible(data.get("Special_Wind_Ded_RNW"), 0);
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW"), 0);
                    }
                    break;
                    case "MA":
                    case "DE": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW"), 0);
                    }
                    break;
                    case "HI":
                    case "VA": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Hurricane_Deductible_RNW"), 0);
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        saveChanges();
                        setAOPDed(data.get("AOP_Ded_RNW"), 0);
                        setNamedStormDed(data.get("Named_Storm_Ded_RNW"), 0);
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setDed(data.get("Deductible_RNW"), 0);
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Residence_Type_RNW"), 0);
                        saveChanges();
                        setContentsLimit(data.get("Contents_RNW"), 0);
                        setLossOfUseLimit(data.get("Loss_Of_Use_RNW"), 0);
                        setDed(data.get("Deductible_RNW"), 0);
                        saveChanges();
                        setWindstormDeductible(data.get("Windstorm_Deductible_RNW"), data.get("Ex_Wind_RNW"), 0);
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    public void fillRiskAddressDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk addresses");
        switch (data.get("Risk_Addresses_Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "MT": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        pause(3000);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible"), 0);
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(5000);
                        saveChanges();
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "WY": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        pause(3000);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(3000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "TX": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        pause(3000);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        pause(3000);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "GA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(5000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        pause(5000);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(5000);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "AZ": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        pause(3000);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "UT": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        pause(3000);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        pause(3000);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        setAOPDeductible(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(5000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setAgreedValue(data);
                        setFacReinsuranceRequired(data);
                        setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit"), 0);
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();

                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "MA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setFacReinsuranceRequired(data);
                        pause(1000);
                        saveChanges();
                    }
                    break;
                    case "HI": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        pause(1000);
                        saveChanges();
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "NY": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "NJ": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        pause(1000);
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setFacReinsuranceRequired(data);
                        pause(1000);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost"), 0);
                        setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setFacReinsuranceRequired(data);
                        pause(1000);
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
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(5000);
                        saveChanges();
                        setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible"), 0);
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "WY": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "MS": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "TX": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        pause(3000);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "GA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "AZ": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        pause(3000);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "UT": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "CO": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "CA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(3000);
                        setAOPDeductible(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(5000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setWfDeductible(data.get("Risk_Addresses_WF_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit"), 0);
                        saveChanges();
                    }
                    break;
                    case "AL": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        pause(3000);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "LA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(1000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded"), 0);
                        saveChanges();
                        setHailDeductible(data.get("Risk_Addresses_Hail_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        saveChanges();
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "MA": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "HI": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "NC": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setFacReinsuranceRequired(data);
                        pause(1000);
                        saveChanges();
                    }
                    break;
                    case "NY": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setHurricaneDeductible(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        pause(1000);
                        saveChanges();
                    }
                    break;
                    case "NJ": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(1000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        pause(1000);
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "SC": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        pause(1000);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible"), 0);
                        saveChanges();
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "FL": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "CT": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                    case "RI": {
                        setResidenceType(data.get("Risk_Addresses_Residence_Type"), 0);
                        setContentsLimit(data.get("Risk_Addresses_Contents"), 0);
                        setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                        saveChanges();
                        setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible"), 0);
                        typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use"));
                        setFacReinsuranceRequired(data);
                        saveChanges();
                    }
                    break;
                }
                saveChanges();
            }
            break;
        }
    }

    public void fillRiskAddressDetailsHS_END(Map<String, String> data) throws Throwable {
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
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                pause(5000);
                                saveChanges();
                                setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                pause(3000);
                                saveChanges();
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDeductible(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setAgreedValue(data);
                                setFacReinsuranceRequired(data);
                                setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit_END"), 0);
                                saveChanges();

                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();

                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                pause(1000);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_oss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
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
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                pause(5000);
                                saveChanges();
                                setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                pause(3000);
                                saveChanges();
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                pause(3000);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDeductible(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit_END"), 0);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(1000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(1000);
                                setWindstormDeductible(data.get("Risk_Addresses_Windstorm_Deductible_END"), data.get("Ex_Wind_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                pause(1000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_oss_Of_Use_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_END"));
                                setFacReinsuranceRequired(data);
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

    public void fillRiskAddressDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
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
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                pause(5000);
                                saveChanges();
                                setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible_OOS_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setWindstormDeductible(data.get("Risk_Addresses_Windstorm_Deductible_OOS_END"), data.get("Ex_Wind"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDeductible(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setAgreedValue(data);
                                setFacReinsuranceRequired(data);
                                setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit_END"), 0);
                                saveChanges();

                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();

                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                pause(1000);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_oss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_OOS_END"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
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
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                pause(5000);
                                saveChanges();
                                setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible_OOS_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                pause(3000);
                                saveChanges();
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setWindstormDeductible(data.get("Risk_Addresses_Windstorm_Deductible_OOS_END"), data.get("Ex_Wind_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                pause(3000);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDeductible(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit_OOS_END"), 0);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(1000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_OOS_END"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(1000);
                                setWindstormDeductible(data.get("Risk_Addresses_Windstorm_Deductible_OOS_END"), data.get("Ex_Wind_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                pause(1000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_oss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_OOS_END"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_OOS_END"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_OOS_END"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_OOS_END"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_OOS_END"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
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

    public void fillRiskAddressDetailsHS_RNW(Map<String, String> data) throws Throwable {
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
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                pause(5000);
                                saveChanges();
                                setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible_RNW"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                pause(3000);
                                saveChanges();
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                pause(3000);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDeductible(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setAgreedValue(data);
                                setFacReinsuranceRequired(data);
                                setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit_RNW"), 0);
                                saveChanges();

                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();

                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                pause(1000);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RWN"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_Cost_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_oss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setReplacementCostValue(data.get("Risk_Addresses_Replacement_RNW"), 0);
                                setOtherStructuresLimit(data.get("Risk_Addresses_Other_Structures_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
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
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                pause(5000);
                                saveChanges();
                                setWindOrHailDed(data.get("Risk_Addresses_Windstorm_Or_Hail_Deductible_RNW"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "WY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MS": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "TX": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                pause(3000);
                                saveChanges();
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "GA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "AZ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                pause(3000);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "UT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CO": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setWildfireSublimit(data.get("Risk_Addresses_Wildfire_Sublimit_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "CA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setWfDeductible(data.get("Risk_Addresses_WF_Deductible_RNW"), 0);
                                setAOPDeductible(data.get("Risk_Addresses_AOP_Ded"), 0);
                                setFacReinsuranceRequired(data);
                                setFirePerilSublimit(data.get("Risk_Addresses_Fire_Peril_Sublimit_RNW"), 0);
                                saveChanges();
                            }
                            break;
                            case "AL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(3000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                pause(1000);
                                saveChanges();
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setHailDeductible(data.get("Risk_Addresses_Hail_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "LA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(1000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setNamedStormDed(data.get("Risk_Addresses_Named_Storm_Ded_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "MA": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "HI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "NC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NY": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "NJ": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(1000);
                                setWindstormDeductible(data.get("Risk_Addresses_Windstorm_Deductible_RNW"), data.get("Ex_Wind_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "SC": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                pause(1000);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneAndNamedStormDed(data.get("Risk_Addresses_Hurricane_And_Named_Storm_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "FL": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_oss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                saveChanges();
                            }
                            break;
                            case "RI": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
                                saveChanges();
                            }
                            break;
                            case "CT": {
                                setResidenceType(data.get("Risk_Addresses_Residence_Type_RNW"), 0);
                                setContentsLimit(data.get("Risk_Addresses_Contents_RNW"), 0);
                                typeText(lossOfUse.get(0), data.get("Risk_Addresses_Loss_Of_Use_RNW"));
                                setAOPDed(data.get("Risk_Addresses_AOP_Ded_RNW"), 0);
                                saveChanges();
                                setHurricaneDed(data.get("Risk_Addresses_Hurricane_Deductible_RNW"), 0);
                                setFacReinsuranceRequired(data);
                                pause(1000);
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

    public void addAndFillInNthAddress(Map<String, String> data) throws Throwable {
        int addressIndexNumber = data.get("Additional_Locations").split(",").length;
        for (int i = 1; i <= addressIndexNumber; i++) {
            clickAddAddress();
            pause(3000);
            fillAdditionalRiskAddressDetails(data, i);
        }
    }

    public void addAndFillInNthAddress_END(Map<String, String> data) throws Throwable {
        int addressIndexNumber = data.get("Additional_Locations_END").split(",").length;
        for (int i = 1; i <= addressIndexNumber; i++) {
            clickAddAddress();
            pause(3000);
            fillAdditionalRiskAddressDetails_END(data, i);
        }
    }

    public void addAndFillInNthAddress_OOS_END(Map<String, String> data) throws Throwable {
        int addressIndexNumber = data.get("Additional_Locations_OOS_END").split(",").length;
        for (int i = 1; i <= addressIndexNumber; i++) {
            clickAddAddress();
            pause(3000);
            fillAdditionalRiskAddressDetails_OOS_END(data, i);
        }
    }

    public void addAndFillInNthAddress_RNW(Map<String, String> data) throws Throwable {
        int addressIndexNumber = data.get("Additional_Locations_RNW").split(",").length;
        for (int i = 1; i <= addressIndexNumber; i++) {
            clickAddAddress();
            pause(3000);
            fillAdditionalRiskAddressDetails_RNW(data, i);
        }
    }

    public void clickAddAddress() throws Throwable {
        clickElement(addAddresses);
        pause(2000);
    }

    public void setAddressLine(String residenceTypeValue, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(addressLine.get(i));
        pause(500);
        typeText(addressLine.get(i), residenceTypeValue);
    }

    public void setCity(String residenceTypeValue, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(city.get(i));
        pause(500);
        typeText(city.get(i), residenceTypeValue);
    }

    public void setState(String residenceTypeValue, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(state.get(i));
        pause(500);
        typeText(state.get(i), residenceTypeValue);
    }

    public void setZIP(String residenceTypeValue, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(zip.get(i));
        pause(500);
        typeText(zip.get(i), residenceTypeValue);
    }

    public void setResidenceType(String residenceTypeValue, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(residenceType.get(i));
        pause(5000);
        typeText(residenceType.get(i), residenceTypeValue);
    }

    public void setFirePerilSublimit(String firePerilSublimitValue, int i) throws Throwable {
        if (isElementDisplayed(driver.findElement(By.xpath("//div[text()='Fire Peril Sublimit']/../../../..//input")))) {
            clickElement(riskAddressesBlock);
            clickElement(firePerilSublimit.get(i));
            pause(500);
            typeText(firePerilSublimit.get(i), firePerilSublimitValue);
        }
    }

    public void setWildfireSublimit(String wildfireSublimitValue, int i) throws Throwable {
        if (isElementDisplayed(driver.findElement(By.xpath("//div[text()='Wildfire Sublimit']/../../../..//input")))) {
            clickElement(riskAddressesBlock);
            clickElement(wildfireSublimit.get(i));
            pause(500);
            typeText(wildfireSublimit.get(i), wildfireSublimitValue);
        }
    }

    public void setReplacementCostValue(String replacementCostValue, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(replacementCost.get(i));
        pause(500);
        typeText(replacementCost.get(i), replacementCostValue);
        clickFooter();
    }

    public void setOtherStructuresLimit(String limit, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(otherStructures.get(i));
        pause(500);
        typeText(otherStructures.get(i), limit);
    }

    public void setContentsLimit(String limit, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(contents.get(i));
        pause(500);
        typeText(contents.get(i), limit);
    }

    public void setLossOfUseLimit(String limit, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(lossOfUse.get(i));
        pause(500);
        typeText(lossOfUse.get(i), limit);
    }

    public void setWindstormDeductible(String deductible, String ExWind, int i) throws Throwable {
        if (ExWind.equalsIgnoreCase("No")) {
            clickElement(riskAddressesBlock);
            clickElement(windstormDeductible.get(i));
            pause(500);
            typeText(windstormDeductible.get(i), deductible);
        }
    }

    public void setDed(String value, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(deD.get(i));
        pause(500);
        typeText(deD.get(i), value);
    }

    public void deleteAddresses() throws Throwable {
        clickElement(deleteAddresses);
    }

    public void setAOPDed(String aopDed, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(aopDedElement.get(i), "Click Aop");
        pause(2000);
        setAttributeValue(aopDedElement.get(i), "value", aopDed);
        saveChanges();
    }

    public void setAOPDeductible(String aopDed, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(aopDeductibleElement.get(i), "Click AOP");
        pause(1000);
        setAttributeValue(aopDeductibleElement.get(i), "value", aopDed);
        pause(3000);
        saveChanges();
    }

    public void setHurrDed(String hurrDed, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(hurrDedElement.get(i));
        pause(500);
        setAttributeValue(hurrDedElement.get(i), "value", hurrDed);
        clickFooter();
    }

    public void setWindOrHailDed(String windOrHailDedValue, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        if (!windOrHailDed.isEmpty()) {
            clickElement(windOrHailDed.get(i));
            pause(500);
            typeTextEnter(windOrHailDed.get(i), windOrHailDedValue, "Wind or Hail Ded");
            saveChanges();
            clickFooter();

            String currentValue = windOrHailDed.get(i).getAttribute("value");

            if (currentValue == null || currentValue.isEmpty() || currentValue.equals("- Select -")) {
                // Retry
                typeTextEnter(windOrHailDed.get(i), windOrHailDedValue, "Wind or Hail Ded (retry)");
                pause(500);
            }
            clickFooter();
        }
    }

    public void setHailstormDed(String hailstorm, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(hailstormDed.get(i));
        pause(500);
        typeTextEnter(hailstormDed.get(i), formatNum(hailstorm), "Hailstorm Ded");
    }

    public void setCalendarYearHurricaneDed(String calendarYearDed, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(calendarYearHurrDed.get(i));
        pause(5000);
        typeText(calendarYearHurrDed.get(i), calendarYearDed);
        saveChanges();
        try{
            if(!calendarYearHurrDed.get(i).getAttribute("value").equalsIgnoreCase(calendarYearDed)){
                clickElement(riskAddressesBlock);
                clickElement(calendarYearHurrDed.get(i));
                pause(5000);
                typeText(calendarYearHurrDed.get(i), calendarYearDed);
                saveChanges();
            }
        } catch (Exception ignored){}
    }

    public void setTornadoOrHailDed(String tornadoDed, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(tornadoOrHailDed.get(i));
        pause(500);
        typeText(tornadoOrHailDed.get(i), tornadoDed);
    }

    public void setNumberOfFamilyUnits(String num, int i) throws Throwable {
        if (!numberOfFamilyUnits.isEmpty()) {
            clickElement(riskAddressesBlock);
            clickElement(numberOfFamilyUnits.get(i));
            pause(500);
            typeText(numberOfFamilyUnits.get(i), num);
        }
    }

    public void setDeductible(String ded, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(deductible.get(i));
        pause(500);
        typeText(deductible.get(i), ded);
    }

    public void setWfDeductible(String wfDed, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(wfDeductible.get(i));
        pause(500);
        saveChanges();
        setAttributeValue(wfDeductible.get(i), "value", wfDed);
        pause(500);
        typeTextEnter(wfDeductible.get(i), wfDed, "WF Deductible");
        saveChanges();
    }

    public void setSpecialWindDeductible(String ded, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(specialWindDed.get(i));
        pause(500);
        typeText(specialWindDed.get(i), ded);
    }

    public void setHurricaneAndNamedStormDed(String ded, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(hurricaneAndNamedStorm.get(i));
        pause(500);
        typeText(hurricaneAndNamedStorm.get(i), ded);
        saveChanges();
        clickFooter();

        String currentValue = hurricaneAndNamedStorm.get(i).getAttribute("value");

        if (currentValue == null || currentValue.isEmpty() || currentValue.equals("- Select -")) {
            // Retry
            typeTextEnter(hurricaneAndNamedStorm.get(i), ded, "Wind or Hail Ded (retry)");
            pause(500);
        }
        clickFooter();
    }

    public void setHurricaneOrNamedStormDed(String ded, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(hurricaneOrNamedStorm.get(i));
        pause(500);
        typeText(hurricaneOrNamedStorm.get(i), ded);
        pause(500);
        saveChanges.click();
    }

    public void setHailDeductible(String hailDeductible, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(hailDed.get(i));
        pause(500);
        typeText(hailDed.get(i), hailDeductible);
        clickFooter();
        pause(1000);
        //      saveChanges.click();
    }

    public void setHurricaneDed(String ded, int i) throws Throwable {
        try {
            clickElement(riskAddressesBlock);
            clickElement(hurricaneDed.get(i));
            pause(500);
            setAttributeValue(hurricaneDed.get(i), "value", ded);
            typeText(hurricaneDed.get(i), ded);
        } catch (Exception e){}
    }

    public void setHurricaneDeductible(String ded, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(hurricaneDeductible.get(i));
        pause(500);
        setAttributeValue(hurricaneDeductible.get(i), "value", ded);
        typeText(hurricaneDeductible.get(i), ded);
    }

    public void setNamedStormDed(String ded, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        typeTextEnter(namedStormDed.get(i), ded, "Named Storm Deductible");
        clickFooter();
    }

    public void setPolicyType(String type, int i) throws Throwable {
        clickElement(riskAddressesBlock);
        clickElement(policyType.get(i));
        pause(500);
        typeText(policyType.get(i), type);
    }

    public void setFacReinsuranceRequired(Map<String, String> data) throws Throwable {
        String ee = data.get("Risk_Addresses_FAC_Reinsurance_Required?");
        choose(facReinsuranceRequiredYes, facReinsuranceRequiredNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(500);
            typeTextEnter(riskCarrier, data.get("Risk_Addresses_Carrier"), "Risk Addresses Carrier");
            pause(500);
            typeTextEnter(riskLimit, data.get("Risk_Addresses_Limit"), "Risk Addresses Limit");
            pause(500);
            typeTextEnter(riskExpirationDate, data.get("Risk_Addresses_Expiration_Date"), "Risk Addresses Expiration Date");
            pause(500);
            typeTextEnter(riskCertificate, data.get("Risk_Addresses_Certificate_#"), "Risk Addresses Certificate");
            pause(500);
            typeTextEnter(facPremium, data.get("Risk_Addresses_FAC_Premium"), "Risk Addresses FAC Premium");
            saveChanges();
        }
    }

    public void setAgreedValue(Map<String, String> data) throws Throwable {
        String ee = data.get("Risk_Addresses_Agreed_Value");
        choose(agreedValueYes, agreedValueNo, ee);
        if (hasValue(ee) && ee.equalsIgnoreCase("Yes")) {
            pause(3000);
            typeTextEnter(avReplacementCost, data.get("Risk_Addresses_AV_Replacement_Cost"), "AV Replacement Cost");
            pause(500);
            typeTextEnter(avOtherStructures, data.get("Risk_Addresses_AV_Other_Structures"), "Risk Addresses Limit");
            pause(500);
            typeTextEnter(avContents, data.get("Risk_Addresses_AV_Contents"), "AV Other Structures");
            pause(500);
            typeTextEnter(avLossOfUse, data.get("Risk_Addresses_AV_Loss_Of_Use"), "AV Loss Of Use");
            saveChanges();
        }
    }

    public void clickAOPDed(int index) throws InterruptedException {
        clickElement(aopDedElement.get(index), "aop ded");
        pause(1000);
    }

    public void clickDelete(int index) throws Throwable {
        clickElement(delete.get(index), "delete");
        pause(1000);
    }

    public int returnIndexOfLastLocation() {
        return addressLine.size() - 1;
    }

    public void fillOutDeductibleHO(String state, String value, int index) throws Throwable {
        switch (state) {
            case "AK":
            case "AR":
            case "IA":
            case "IN":
            case "KS":
            case "KY":
            case "MN":
            case "MO":
            case "MT":
            case "ND":
            case "NE":
            case "NH":
            case "OH":
            case "OK":
            case "SD":
            case "WI":
            case "WY":
            case "MD":
            case "ME":
            case "MS":
            case "TX":
            case "GA":
            case "MI":
            case "IL":
            case "NM":
            case "CO":
            case "TN": {
                try {
                    setWindOrHailDed(value, index);
                } catch (Exception e) {
                    //
                }
            }
            break;
            case "RI": {
                setCalendarYearHurricaneDed(value, index);
            }
            break;
            case "WA": {
                setNumberOfFamilyUnits(value, index);
            }
            break;
            case "CA": {
                setDeductible(value, index);
            }
            break;
            case "AL": {
                setSpecialWindDeductible(value, index);
            }
            break;
            case "MA":
            case "DE":
            case "SC": {
                setHurricaneAndNamedStormDed(value, index);
            }
            break;
            case "LA": {
                setHurricaneOrNamedStormDed(value, index);
            }
            break;
            case "HI":
            case "VA": {
                setHurricaneDed(value, index);
            }
            break;
            case "NC": {
                setNamedStormDed(value, index);
            }
            break;
            case "FL": {
                setWindstormDeductible(value, "No", index);
            }
            break;
            case "CT":
            case "NY":
            case "NJ": {
                setHurrDed(value, index);
            }
            break;
            case "AZ":
            case "NV":
            case "DC":
            case "OR":
            case "PA":
            case "UT":
            case "VT":
            case "WV":
            case "ID": {
                //do nothing
            }
            break;
        }
    }

    public void fillOutDeductibleHS(String state, String value, int index) throws Throwable {
        switch (state) {
            case "AK":
            case "AR":
            case "IA":
            case "IN":
            case "KS":
            case "KY":
            case "MN":
            case "MO":
            case "MT":
            case "ND":
            case "NE":
            case "NH":
            case "OH":
            case "OK":
            case "SD":
            case "WI":
            case "WY":
            case "MD":
            case "ME":
            case "MS":
            case "TX":
            case "GA":
            case "MI":
            case "IL":
            case "NM":
            case "CO":
            case "TN": {
                try {
                    setWindOrHailDed(value, index);
                } catch (Exception e) {
                    //
                }
            }
            break;
            case "WA": {
                setNumberOfFamilyUnits(value, index);
            }
            break;
            case "CA": {
                setDeductible(value, index);
            }
            break;
            case "AL": {
                setSpecialWindDeductible(value, index);
            }
            break;
            case "MA":
            case "DE":
            case "SC": {
                setHurricaneAndNamedStormDed(value, index);
            }
            break;
            case "LA": {
                setHurricaneOrNamedStormDed(value, index);
            }
            break;
            case "HI":
            case "VA": {
                setHurricaneDed(value, index);
            }
            break;
            case "NC": {
                setNamedStormDed(value, index);
            }
            break;
            case "FL": {
                setWindstormDeductible(value, "No", index);
            }
            break;
            case "CT":
            case "NY":
            case "NJ":
            case "RI": {
                setHurrDed(value, index);
            }
            break;
            case "AZ":
            case "NV":
            case "DC":
            case "OR":
            case "PA":
            case "UT":
            case "VT":
            case "WV":
            case "ID": {
                //do nothing
            }
            break;
        }
    }

    public void fillOutAOPDeductibleHO(String state, String value, int index) throws Throwable {
        switch (state) {
            case "FL":
            case "SC": {
                setDed(value, index);
            }
            break;
            case "CA": {
                setDeductible(value, index);
            }
            break;
            case "RI": {
                setCalendarYearHurricaneDed(value, index);
            }
            break;
            default: {
                setAOPDed(value, index);
            }
        }
    }

    public void fillOutAOPDeductibleHS(String state, String value, int index) throws Throwable {
        switch (state) {
            case "FL":
            case "SC": {
                setDed(value, index);
            }
            break;
            case "CA": {
                setDeductible(value, index);
            }
            break;
            default: {
                setAOPDed(value, index);
            }
        }
    }

    public void fillRiskAddressDetailsFS(Map<String, String> data) throws Throwable {
        verifyBlockExists("risk addresses");

        String residenceType = data.get("Residence_Type");
        if (residenceType == null || residenceType.isEmpty()) {
            residenceType = data.get("Risk_Addresses_Residence_Type");
        }

        switch (residenceType) {
            case "Homeowner":
                setIsBasementOrAreaDwellingBelowGroundLevel(data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level"));
                break;
            case "Condo/Co-op":
                setDoYouHaveBasementOrAnyAreaOfTheUnit(data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit"));
                break;
            default:
                break;
        }
        if (data.get("Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level").equalsIgnoreCase("Yes") || data.get("Do_You_Have_Basement_Or_Any_Area_Of_The_Unit").equalsIgnoreCase("Yes") || data.get("Does_The_Residence_Have_Basement").equalsIgnoreCase("Yes")) {
            setBasementFinishIs(data.get("Basement_Finish_Is"));
            setBasementFinishQuality(data.get("Basement_Finish_Quality"));
            setTotalBasementSquareFootage(data.get("Basement_Total_SQF"));
        }
    }

    public void setIsBasementOrAreaDwellingBelowGroundLevel(String basement) throws Throwable {
        if (isElementDisplayed(isTheBasementNoFS)) {
            choose(isTheBasementYesFS, isTheBasementNoFS, basement, "Is basement or any area of dwelling below ground level");
        }
    }

    public void setDoYouHaveBasementOrAnyAreaOfTheUnit(String quote) throws Throwable {
        if (isElementDisplayed(doYouHaveBasementOrAnyAreaOfTheUnitNo)) {
            choose(doYouHaveBasementOrAnyAreaOfTheUnitYes, doYouHaveBasementOrAnyAreaOfTheUnitNo, quote, "Do you have a basement or any area of the unit");
        }
    }

    private void setDoesTheResidenceHaveBasement(String doesTheResidenceHaveBasement) throws Throwable {
        choose(haveBasementYes, haveBasementNo, doesTheResidenceHaveBasement, "Does the residence have basement");
    }

    public void setBasementFinishIs(String value) throws Throwable {
        typeTextEnter(basementFinishIs, value, "Basement Finish Is");
    }

    public void setBasementFinishQuality(String value) throws Throwable {
        typeTextEnter(basementFinishQuality, value, "Basement Finish Quality");
    }

    public void setTotalBasementSquareFootage(String value) {
        typeText(totalBasementSquareFootage, value, "Total Basement Square Footage");
    }

}